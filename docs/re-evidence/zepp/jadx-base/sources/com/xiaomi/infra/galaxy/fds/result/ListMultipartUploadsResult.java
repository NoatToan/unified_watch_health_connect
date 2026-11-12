package com.xiaomi.infra.galaxy.fds.result;

import com.xiaomi.infra.galaxy.fds.bean.MultipartUploadBean;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class ListMultipartUploadsResult {
    private String a;
    private String b;
    private int c;
    private String d;
    private boolean e;
    private String f;
    private List<MultipartUploadBean> g;
    private List<String> h;
    private String i;

    public String getBucketName() {
        return this.a;
    }

    public List<String> getCommonPrefixes() {
        return this.h;
    }

    public String getDelimiter() {
        return this.i;
    }

    public String getMarker() {
        return this.d;
    }

    public int getMaxKeys() {
        return this.c;
    }

    public String getNextMarker() {
        return this.f;
    }

    public String getPrefix() {
        return this.b;
    }

    public List<MultipartUploadBean> getUploads() {
        return this.g;
    }

    public boolean isTruncated() {
        return this.e;
    }

    public void setBucketName(String str) {
        this.a = str;
    }

    public void setCommonPrefixes(List<String> list) {
        this.h = list;
    }

    public void setDelimiter(String str) {
        this.i = str;
    }

    public void setMarker(String str) {
        this.d = str;
    }

    public void setMaxKeys(int i) {
        this.c = i;
    }

    public void setNextMarker(String str) {
        this.f = str;
    }

    public void setPrefix(String str) {
        this.b = str;
    }

    public void setTruncated(boolean z) {
        this.e = z;
    }

    public void setUploads(List<MultipartUploadBean> list) {
        this.g = list;
    }
}
