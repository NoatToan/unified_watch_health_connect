package com.google.zxing.pdf417;

/* JADX INFO: loaded from: classes4.dex */
public final class PDF417ResultMetadata {
    private int a;
    private String b;
    private boolean c;
    private String e;
    private String f;
    private String g;
    private int[] k;
    private int d = -1;
    private long h = -1;
    private long i = -1;
    private int j = -1;

    public String getAddressee() {
        return this.f;
    }

    public int getChecksum() {
        return this.j;
    }

    public String getFileId() {
        return this.b;
    }

    public String getFileName() {
        return this.g;
    }

    public long getFileSize() {
        return this.h;
    }

    @Deprecated
    public int[] getOptionalData() {
        return this.k;
    }

    public int getSegmentCount() {
        return this.d;
    }

    public int getSegmentIndex() {
        return this.a;
    }

    public String getSender() {
        return this.e;
    }

    public long getTimestamp() {
        return this.i;
    }

    public boolean isLastSegment() {
        return this.c;
    }

    public void setAddressee(String str) {
        this.f = str;
    }

    public void setChecksum(int i) {
        this.j = i;
    }

    public void setFileId(String str) {
        this.b = str;
    }

    public void setFileName(String str) {
        this.g = str;
    }

    public void setFileSize(long j) {
        this.h = j;
    }

    public void setLastSegment(boolean z) {
        this.c = z;
    }

    @Deprecated
    public void setOptionalData(int[] iArr) {
        this.k = iArr;
    }

    public void setSegmentCount(int i) {
        this.d = i;
    }

    public void setSegmentIndex(int i) {
        this.a = i;
    }

    public void setSender(String str) {
        this.e = str;
    }

    public void setTimestamp(long j) {
        this.i = j;
    }
}
