package com.xiaomi.infra.galaxy.fds.xml;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CopyObjectResult", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class CopyObjectResponse {

    @XmlElement(name = "LastModified")
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    private Date a;

    @XmlElement(name = "ETag")
    private String b;

    public String getETag() {
        return this.b;
    }

    public Date getLastModified() {
        return this.a;
    }

    public void setETag(String str) {
        this.b = str;
    }

    public void setLastModified(Date date) {
        this.a = date;
    }
}
