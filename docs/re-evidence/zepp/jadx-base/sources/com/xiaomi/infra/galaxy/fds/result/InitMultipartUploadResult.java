package com.xiaomi.infra.galaxy.fds.result;

import com.xiaomi.infra.galaxy.fds.model.SSEResultBase;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class InitMultipartUploadResult extends SSEResultBase {
    private String b;
    private String c;
    private String d;

    public String getBucketName() {
        return this.b;
    }

    public String getObjectName() {
        return this.c;
    }

    public String getUploadId() {
        return this.d;
    }

    public void setBucketName(String str) {
        this.b = str;
    }

    public void setObjectName(String str) {
        this.c = str;
    }

    public void setUploadId(String str) {
        this.d = str;
    }
}
