package com.xiaomi.infra.galaxy.fds.bean;

import java.util.Date;

/* JADX INFO: loaded from: classes22.dex */
public class ObjectBean {
    private String a;
    private String b;
    private OwnerBean c;
    private Date d;
    private long e;
    private long f;
    private String g;
    private Boolean h;
    private MetadataBean i;

    public ObjectBean() {
    }

    public Boolean getAllowOutsideAccess() {
        return this.h;
    }

    public String getEtag() {
        return this.b;
    }

    public Date getLastModified() {
        return this.d;
    }

    public MetadataBean getMetadataBean() {
        return this.i;
    }

    public String getName() {
        return this.a;
    }

    public OwnerBean getOwner() {
        return this.c;
    }

    public long getSize() {
        return this.f;
    }

    public long getUploadTime() {
        return this.e;
    }

    public String getVersionId() {
        return this.g;
    }

    public void setAllowOutsideAccess(Boolean bool) {
        this.h = bool;
    }

    public void setEtag(String str) {
        this.b = str;
    }

    public void setLastModified(Date date) {
        this.d = date;
    }

    public void setMetadataBean(MetadataBean metadataBean) {
        this.i = metadataBean;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setOwner(OwnerBean ownerBean) {
        this.c = ownerBean;
    }

    public void setSize(long j) {
        this.f = j;
    }

    public void setUploadTime(long j) {
        this.e = j;
    }

    public ObjectBean(String str) {
        this.a = str;
    }
}
