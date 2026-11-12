package com.huawei.watchface.mvp.model.datatype.orderhistory;

/* JADX INFO: loaded from: classes20.dex */
public class OrderHistoryRequestModel {
    private String id;
    private String type;

    public OrderHistoryRequestModel(String str, String str2) {
        this.id = str;
        this.type = str2;
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
