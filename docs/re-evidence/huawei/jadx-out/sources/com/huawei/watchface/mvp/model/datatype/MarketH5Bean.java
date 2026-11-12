package com.huawei.watchface.mvp.model.datatype;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes45.dex */
public class MarketH5Bean {
    private String designerName;
    private String extendInfo;
    private String from;

    @SerializedName("from_sub")
    private String fromSub;
    private String hitopId;
    private String productId;
    private String watchfaceName;

    public String getDesignerName() {
        return this.designerName;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public String getFrom() {
        return this.from;
    }

    public String getFromSub() {
        return this.fromSub;
    }

    public String getHitopId() {
        return this.hitopId;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getWatchfaceName() {
        return this.watchfaceName;
    }

    public void setDesignerName(String str) {
        this.designerName = str;
    }

    public void setExtendInfo(String str) {
        this.extendInfo = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setFromSub(String str) {
        this.fromSub = str;
    }

    public void setHitopId(String str) {
        this.hitopId = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setWatchfaceName(String str) {
        this.watchfaceName = str;
    }
}
