package com.xiaomi.infra.galaxy.fds.xml;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
public class KeyMetadata {

    @XmlElement(name = "Key")
    private String a;

    @XmlElement(name = "LastModified")
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    private Date b;

    @XmlElement(name = "ETag")
    private String c;

    @XmlElement(name = "Size")
    private long d;

    @XmlElement(name = "StorageClass")
    private String e;

    public String getETag() {
        return this.c;
    }

    public String getKey() {
        return this.a;
    }

    public Date getLastModified() {
        return this.b;
    }

    public long getSize() {
        return this.d;
    }

    public String getStorageClass() {
        return this.e;
    }

    public void setETag(String str) {
        this.c = str;
    }

    public void setKey(String str) {
        this.a = str;
    }

    public void setLastModified(Date date) {
        this.b = date;
    }

    public void setSize(long j) {
        this.d = j;
    }

    public void setStorageClass(String str) {
        this.e = str;
    }
}
