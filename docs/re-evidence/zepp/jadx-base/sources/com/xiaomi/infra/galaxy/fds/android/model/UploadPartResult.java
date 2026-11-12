package com.xiaomi.infra.galaxy.fds.android.model;

/* JADX INFO: loaded from: classes22.dex */
public class UploadPartResult {
    private int a;
    private String b;
    private long c;

    public UploadPartResult() {
    }

    public String getEtag() {
        return this.b;
    }

    public int getPartNumber() {
        return this.a;
    }

    public long getPartSize() {
        return this.c;
    }

    public void setEtag(String str) {
        this.b = str;
    }

    public void setPartNumber(int i) {
        this.a = i;
    }

    public void setPartSize(long j) {
        this.c = j;
    }

    public UploadPartResult(int i, long j, String str) {
        this.a = i;
        this.b = str;
        this.c = j;
    }
}
