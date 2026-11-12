package com.huawei.watchface.mvp.model.datatype;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class TransFileInfo {
    private List<Integer> attentionTypes;
    private String fileName;
    private String filePath;
    private int fileType;
    private String packageName;
    private TransferFileReqType requestType;
    private long sourceId;

    public List<Integer> getAttentionTypes() {
        return this.attentionTypes;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getFileType() {
        return this.fileType;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public TransferFileReqType getRequestType() {
        return this.requestType;
    }

    public long getSourceId() {
        return this.sourceId;
    }

    public void setAttentionTypes(List<Integer> list) {
        this.attentionTypes = list;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setFileType(int i) {
        this.fileType = i;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setRequestType(TransferFileReqType transferFileReqType) {
        this.requestType = transferFileReqType;
    }

    public void setSourceId(long j) {
        this.sourceId = j;
    }
}
