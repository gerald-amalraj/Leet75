package com.leet75.arrays;

public class Stock_Buy_121 {

	public int maxProfit(int[] prices) {
		int profit = 0;
		int min_price = prices[0];
		int j = prices.length - 1;
		int i = 0;

		while (i < j) {
           if(min_price> prices[i+1]) {
        	   min_price=prices[i+1];
        	   i++;
           }else {
        	   if(profit < (prices[i+1] - min_price))
        		   profit = prices[i+1] - min_price;
        	   i++;
           }
		}
		return profit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int result = new Stock_Buy_121().maxProfit(prices);
		System.out.println("Result: " + result);

	}

}
