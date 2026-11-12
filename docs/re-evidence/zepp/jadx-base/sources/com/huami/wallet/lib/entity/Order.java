package com.huami.wallet.lib.entity;

/* JADX INFO: loaded from: classes13.dex */
public class Order {
    public int amount;
    public boolean canRefund;
    public boolean canRefundTwice = true;
    public boolean canRetry;
    public String codeValidDate;
    public String invoiceAuthCode;
    public boolean needContactService;
    public String orderId;
    public int state;
    public long timestamp;
    public int type;
}
