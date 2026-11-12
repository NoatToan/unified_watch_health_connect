package com.xiaomi.infra.galaxy.fds.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CompleteMultipartUploadResult", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class CompleteMultipartUploadResponse {

    @XmlElement(name = "Location")
    private String a;

    @XmlElement(name = "Bucket")
    private String b;

    @XmlElement(name = "Key")
    private String c;

    @XmlElement(name = "ETag")
    private String d;

    public String getBucket() {
        return this.b;
    }

    public String getETag() {
        return this.d;
    }

    public String getKey() {
        return this.c;
    }

    public String getLocation() {
        return this.a;
    }

    public void setBucket(String str) {
        this.b = str;
    }

    public void setETag(String str) {
        this.d = str;
    }

    public void setKey(String str) {
        this.c = str;
    }

    public void setLocation(String str) {
        this.a = str;
    }
}
