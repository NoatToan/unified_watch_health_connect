package com.xiaomi.infra.galaxy.fds.bean;

import com.xiaomi.infra.galaxy.fds.model.StorageClass;

/* JADX INFO: loaded from: classes22.dex */
public class BucketBean {
    private String a;
    private String b;
    private long c;
    private long d;
    private long e;
    private Boolean f;
    private Boolean g;
    private StorageClass h;

    public BucketBean() {
    }

    public Boolean getAllowOutsideAccess() {
        return this.f;
    }

    public long getCreationTime() {
        return this.c;
    }

    public Boolean getEnableSSE() {
        return this.g;
    }

    public String getName() {
        return this.a;
    }

    public long getNumObjects() {
        return this.e;
    }

    public String getOrgId() {
        return this.b;
    }

    public StorageClass getStorageClass() {
        return this.h;
    }

    public long getUsedSpace() {
        return this.d;
    }

    public void setAllowOutsideAccess(Boolean bool) {
        this.f = bool;
    }

    public void setCreationTime(long j) {
        this.c = j;
    }

    public void setEnableSSE(Boolean bool) {
        this.g = bool;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setNumObjects(long j) {
        this.e = j;
    }

    public void setOrgId(String str) {
        this.b = str;
    }

    public void setStorageClass(StorageClass storageClass) {
        this.h = storageClass;
    }

    public void setUsedSpace(long j) {
        this.d = j;
    }

    public BucketBean(String str) {
        this.a = str;
    }
}
