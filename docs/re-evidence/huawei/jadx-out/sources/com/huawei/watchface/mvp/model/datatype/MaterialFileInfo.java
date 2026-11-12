package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes20.dex */
public class MaterialFileInfo {
    private String appContentId;
    private int contentType;
    private String fileName;
    private String fileSha256;
    private int fileSize;
    private String index;

    public String getAppContentId() {
        return this.appContentId;
    }

    public int getContentType() {
        return this.contentType;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFileSha256() {
        return this.fileSha256;
    }

    public int getFileSize() {
        return this.fileSize;
    }

    public String getIndex() {
        return this.index;
    }

    public void setAppContentId(String str) {
        this.appContentId = str;
    }

    public void setContentType(int i) {
        this.contentType = i;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileSha256(String str) {
        this.fileSha256 = str;
    }

    public void setFileSize(int i) {
        this.fileSize = i;
    }

    public void setIndex(String str) {
        this.index = str;
    }
}
