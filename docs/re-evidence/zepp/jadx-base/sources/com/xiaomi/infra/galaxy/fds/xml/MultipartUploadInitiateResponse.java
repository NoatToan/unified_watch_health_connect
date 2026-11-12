package com.xiaomi.infra.galaxy.fds.xml;

import com.xiaomi.infra.galaxy.fds.result.InitMultipartUploadResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InitiateMultipartUploadResult", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class MultipartUploadInitiateResponse {

    @XmlElement(name = "Bucket")
    private String a;

    @XmlElement(name = "Key")
    private String b;

    @XmlElement(name = "UploadId")
    private String c;

    public MultipartUploadInitiateResponse() {
    }

    public String getBucket() {
        return this.a;
    }

    public String getKey() {
        return this.b;
    }

    public String getUploadID() {
        return this.c;
    }

    public void setBucket(String str) {
        this.a = str;
    }

    public void setKey(String str) {
        this.b = str;
    }

    public void setUploadID(String str) {
        this.c = str;
    }

    public MultipartUploadInitiateResponse(InitMultipartUploadResult initMultipartUploadResult) {
        this.a = initMultipartUploadResult.getBucketName();
        this.b = initMultipartUploadResult.getObjectName();
        this.c = initMultipartUploadResult.getUploadId();
    }
}
