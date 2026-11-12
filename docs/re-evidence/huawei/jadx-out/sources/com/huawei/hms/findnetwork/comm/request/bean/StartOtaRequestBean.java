package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class StartOtaRequestBean extends BaseRequestBean {
    private int code;
    private String message;
    private int progress;
    private String sn;

    public void setSn(String str) {
        this.sn = str;
    }

    public void setProgress(int i) {
        this.progress = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public String getSn() {
        return this.sn;
    }

    public int getProgress() {
        return this.progress;
    }

    public String getMessage() {
        return this.message;
    }

    public int getCode() {
        return this.code;
    }
}
