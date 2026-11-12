package com.huawei.operation.h5pro.jsmodules.risktoken;

import com.google.gson.GsonBuilder;

/* JADX INFO: loaded from: classes41.dex */
public class CampaignPluginResult<T> {
    T data;
    int retCode;
    int retMsg;

    public static <T> CampaignPluginResult<T> successResultWithData(T t) {
        CampaignPluginResult<T> campaignPluginResult = new CampaignPluginResult<>();
        campaignPluginResult.retCode = 0;
        campaignPluginResult.retMsg = 0;
        campaignPluginResult.data = t;
        return campaignPluginResult;
    }

    public static <T> CampaignPluginResult<T> errorResult(int i, int i2) {
        CampaignPluginResult<T> campaignPluginResult = new CampaignPluginResult<>();
        campaignPluginResult.retCode = i;
        campaignPluginResult.retMsg = i2;
        campaignPluginResult.data = null;
        return campaignPluginResult;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T t) {
        this.data = t;
    }

    public int getRetCode() {
        return this.retCode;
    }

    public void setRetCode(int i) {
        this.retCode = i;
    }

    public int getRetMsg() {
        return this.retMsg;
    }

    public void setRetMsg(int i) {
        this.retMsg = i;
    }

    public String toJsonString() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
    }
}
