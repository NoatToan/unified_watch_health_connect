package com.xiaomi.infra.galaxy.fds.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Error")
public class S3Error {

    @XmlElement(name = "Code")
    private String a;

    @XmlElement(name = "Message")
    private String b;

    @XmlElement(name = "Resource")
    private String c;

    @XmlElement(name = "RequestId")
    private String d;

    public S3Error() {
    }

    public String getCode() {
        return this.a;
    }

    public String getMessage() {
        return this.b;
    }

    public String getRequestId() {
        return this.d;
    }

    public String getResource() {
        return this.c;
    }

    public void setCode(String str) {
        this.a = str;
    }

    public void setMessage(String str) {
        this.b = str;
    }

    public void setRequestId(String str) {
        this.d = str;
    }

    public void setResource(String str) {
        this.c = str;
    }

    public String toString() {
        return "S3Error{code='" + this.a + "', message='" + this.b + "', resource='" + this.c + "', requestId='" + this.d + "'}";
    }

    public S3Error(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public S3Error(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.d = str3;
    }
}
