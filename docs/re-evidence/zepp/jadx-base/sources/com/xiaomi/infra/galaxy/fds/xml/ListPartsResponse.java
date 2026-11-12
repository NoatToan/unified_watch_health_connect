package com.xiaomi.infra.galaxy.fds.xml;

import com.xiaomi.infra.galaxy.fds.result.UploadPartResult;
import com.xiaomi.infra.galaxy.fds.result.UploadPartResultList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListPartsResult", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class ListPartsResponse {

    @XmlElement(name = "Bucket")
    private String a;

    @XmlElement(name = "Key")
    private String b;

    @XmlElement(name = "UploadId")
    private String c;

    @XmlElement(name = "StorageClass")
    private String d;

    @XmlElement(name = "PartNumberMarker")
    private int e;

    @XmlElement(name = "NextPartNumberMarker")
    private int f;

    @XmlElement(name = "MaxParts")
    private int g;

    @XmlElement(name = "IsTruncated")
    private boolean h;

    @XmlElement(name = "Part")
    private List<Part> i = new ArrayList();

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Part")
    public static class Part {

        @XmlElement(name = "PartNumber")
        private int a;

        @XmlElement(name = "LastModified")
        @XmlJavaTypeAdapter(IsoDateAdapter.class)
        private Date b;

        @XmlElement(name = "ETag")
        private String c;

        @XmlElement(name = "Size")
        private long d;

        public String getETag() {
            return this.c;
        }

        public Date getLastModified() {
            return this.b;
        }

        public int getPartNumber() {
            return this.a;
        }

        public long getSize() {
            return this.d;
        }

        public void setETag(String str) {
            this.c = str;
        }

        public void setLastModified(Date date) {
            this.b = date;
        }

        public void setPartNumber(int i) {
            this.a = i;
        }

        public void setSize(long j) {
            this.d = j;
        }
    }

    public ListPartsResponse() {
    }

    public void addPart(Part part) {
        this.i.add(part);
    }

    public String getBucket() {
        return this.a;
    }

    public String getKey() {
        return this.b;
    }

    public int getMaxParts() {
        return this.g;
    }

    public int getNextPartNumberMarker() {
        return this.f;
    }

    public List<Part> getPartList() {
        return this.i;
    }

    public int getPartNumberMarker() {
        return this.e;
    }

    public String getStorageClass() {
        return this.d;
    }

    public boolean getTruncated() {
        return this.h;
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

    public void setMaxParts(int i) {
        this.g = i;
    }

    public void setNextPartNumberMarker(int i) {
        this.f = i;
    }

    public void setPartList(List<Part> list) {
        this.i = list;
    }

    public void setPartNumberMarker(int i) {
        this.e = i;
    }

    public void setStorageClass(String str) {
        this.d = str;
    }

    public void setTruncated(boolean z) {
        this.h = z;
    }

    public void setUploadID(String str) {
        this.c = str;
    }

    public ListPartsResponse(String str, String str2, String str3, int i, int i2, UploadPartResultList uploadPartResultList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = i;
        this.g = i2;
        int i3 = 0;
        this.h = false;
        this.f = i;
        for (UploadPartResult uploadPartResult : uploadPartResultList.getUploadPartResultList()) {
            if (uploadPartResult.getPartNumber() > i) {
                if (i3 >= i2) {
                    this.h = true;
                    return;
                }
                Part part = new Part();
                part.setPartNumber(uploadPartResult.getPartNumber());
                part.setETag(uploadPartResult.getEtag());
                part.setSize(uploadPartResult.getPartSize());
                part.setLastModified(new Date(uploadPartResult.getLastModified()));
                this.i.add(part);
                this.f = uploadPartResult.getPartNumber();
                i3++;
            }
        }
    }
}
