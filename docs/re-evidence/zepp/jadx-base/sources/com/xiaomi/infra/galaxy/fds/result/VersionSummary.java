package com.xiaomi.infra.galaxy.fds.result;

import com.xiaomi.infra.galaxy.fds.bean.OwnerBean;
import java.util.Date;

/* JADX INFO: loaded from: classes22.dex */
public class VersionSummary {
    private String a;
    private boolean b;
    public String bucketName;
    private Date c;
    private OwnerBean d;
    private long e;
    private boolean f;
    public String objectName;

    public String getBucketName() {
        return this.bucketName;
    }

    public Date getLastModified() {
        return this.c;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public OwnerBean getOwner() {
        return this.d;
    }

    public long getSize() {
        return this.e;
    }

    public String getVersionId() {
        return this.a;
    }

    public boolean isDeleteMarker() {
        return this.f;
    }

    public boolean isLatest() {
        return this.b;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setDeleteMarker(boolean z) {
        this.f = z;
    }

    public void setLastModified(Date date) {
        this.c = date;
    }

    public void setLatest(boolean z) {
        this.b = z;
    }

    public void setObjectName(String str) {
        this.objectName = str;
    }

    public void setOwner(OwnerBean ownerBean) {
        this.d = ownerBean;
    }

    public void setSize(long j) {
        this.e = j;
    }

    public void setVersionId(String str) {
        this.a = str;
    }
}
