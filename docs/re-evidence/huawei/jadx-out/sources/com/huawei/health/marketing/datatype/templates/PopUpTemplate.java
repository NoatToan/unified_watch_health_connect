package com.huawei.health.marketing.datatype.templates;

/* JADX INFO: loaded from: classes29.dex */
public class PopUpTemplate extends BaseTemplate {
    private boolean intelligentFlag;
    private String linkValue;
    private String picture;
    private String rcmResourceId;

    public void setPicture(String str) {
        this.picture = str;
    }

    public void setLinkValue(String str) {
        this.linkValue = str;
    }

    public String getPicture() {
        return this.picture;
    }

    public String getLinkValue() {
        return this.linkValue;
    }

    public boolean isIntelligentFlag() {
        return this.intelligentFlag;
    }

    public void setIntelligentFlag(boolean z) {
        this.intelligentFlag = z;
    }

    public String getRcmResourceId() {
        return this.rcmResourceId;
    }

    public void setRcmResourceId(String str) {
        this.rcmResourceId = str;
    }

    public String toString() {
        return "PopUpTemplate{picture='" + this.picture + "', linkValue='" + this.linkValue + "', rcmResourceId='" + this.rcmResourceId + "', intelligentFlag='" + this.intelligentFlag + "'}";
    }
}
