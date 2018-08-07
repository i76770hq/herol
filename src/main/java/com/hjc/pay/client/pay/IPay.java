package com.hjc.pay.client.pay;


public interface IPay {
	public long generateOrder(Pay pay);

	public Pay queryOrder(long billno);

	public boolean sendGoods(long billno,boolean success);

	public int queryPaySum(long userid);
}
