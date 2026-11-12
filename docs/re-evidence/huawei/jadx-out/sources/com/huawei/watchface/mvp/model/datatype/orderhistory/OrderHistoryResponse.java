package com.huawei.watchface.mvp.model.datatype.orderhistory;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class OrderHistoryResponse {

    @SerializedName(TtmlNode.TAG_BODY)
    private List<OrderHistoryBean> orderHistoryBeanList;
    private String recordCount;

    @SerializedName("resultcode")
    private String resultCode;

    @SerializedName("resultinfo")
    private String resultInfo;

    public List<OrderHistoryBean> getOrderHistoryBeanList() {
        return this.orderHistoryBeanList;
    }

    public String getRecordCount() {
        return this.recordCount;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public void setOrderHistoryBeanList(List<OrderHistoryBean> list) {
        this.orderHistoryBeanList = list;
    }

    public void setRecordCount(String str) {
        this.recordCount = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setResultInfo(String str) {
        this.resultInfo = str;
    }
}
