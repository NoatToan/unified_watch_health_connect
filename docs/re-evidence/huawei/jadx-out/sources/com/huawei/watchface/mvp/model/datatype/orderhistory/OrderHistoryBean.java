package com.huawei.watchface.mvp.model.datatype.orderhistory;

/* JADX INFO: loaded from: classes20.dex */
public class OrderHistoryBean {
    private String amount;
    private int contentprivtype;
    private int currency;
    private String id;
    private int isCharge;
    private String isOrdered;
    private String type;

    public String getAmount() {
        return this.amount;
    }

    public int getContentPrivType() {
        return this.contentprivtype;
    }

    public int getCurrency() {
        return this.currency;
    }

    public String getId() {
        return this.id;
    }

    public int getIsCharge() {
        return this.isCharge;
    }

    public String getIsOrdered() {
        return this.isOrdered;
    }

    public String getType() {
        return this.type;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setContentPrivType(int i) {
        this.contentprivtype = i;
    }

    public void setCurrency(int i) {
        this.currency = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsCharge(int i) {
        this.isCharge = i;
    }

    public void setIsOrdered(String str) {
        this.isOrdered = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
