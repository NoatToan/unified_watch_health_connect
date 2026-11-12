package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes20.dex */
public class CustomWatchfaceInfo {
    private String cnTitle;
    private String fileSize;
    private String title;
    private String useType;

    public CustomWatchfaceInfo() {
    }

    public String getCnTitle() {
        return this.cnTitle;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUseType() {
        return this.useType;
    }

    public CustomWatchfaceInfo(String str, String str2, String str3, String str4) {
        this.title = str;
        this.cnTitle = str2;
        this.fileSize = str3;
        this.useType = str4;
    }
}
