package com.ximalaya.ting.android.opensdk.model.ranks;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes22.dex */
public class RankItem {

    @SerializedName("content_type")
    private String contentType;

    @SerializedName("id")
    private long dataId;
    private String title;

    public String getContentType() {
        return this.contentType;
    }

    public long getDataId() {
        return this.dataId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setDataId(long j) {
        this.dataId = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "RankItem [dataId=" + this.dataId + ", title=" + this.title + ", contentType=" + this.contentType + "]";
    }
}
