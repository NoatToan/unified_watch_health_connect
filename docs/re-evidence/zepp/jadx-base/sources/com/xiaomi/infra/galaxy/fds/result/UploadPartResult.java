package com.xiaomi.infra.galaxy.fds.result;

import com.xiaomi.infra.galaxy.fds.model.SSEResultBase;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class UploadPartResult extends SSEResultBase implements Comparable {
    private int b;
    private String c;
    private long d;
    private long e;
    private long f;

    public UploadPartResult() {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return new Integer(this.b).compareTo(Integer.valueOf(((UploadPartResult) obj).getPartNumber()));
    }

    public long getCrc64Ecma() {
        return this.e;
    }

    public String getEtag() {
        return this.c;
    }

    public long getLastModified() {
        return this.f;
    }

    public int getPartNumber() {
        return this.b;
    }

    public long getPartSize() {
        return this.d;
    }

    public void setCrc64Ecma(long j) {
        this.e = j;
    }

    public void setEtag(String str) {
        this.c = str;
    }

    public void setLastModified(long j) {
        this.f = j;
    }

    public void setPartNumber(int i) {
        this.b = i;
    }

    public void setPartSize(long j) {
        this.d = j;
    }

    public UploadPartResult(int i, long j, String str, long j2) {
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = j2;
    }
}
