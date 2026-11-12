package com.xiaomi.infra.galaxy.fds.xml;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListAllMyBucketsResult", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class ListBucketResponse {

    @XmlElement(name = "Owner")
    private OwnerBean a;

    @XmlElement(name = "Bucket")
    @XmlElementWrapper(name = "Buckets")
    private List<BucketMetadata> b;

    public ListBucketResponse() {
        this.b = new ArrayList();
    }

    public void addBucket(BucketMetadata bucketMetadata) {
        this.b.add(bucketMetadata);
    }

    public List<BucketMetadata> getBuckets() {
        return this.b;
    }

    @VisibleForTesting
    public int getBucketsNum() {
        return this.b.size();
    }

    public OwnerBean getOwner() {
        return this.a;
    }

    public void setBuckets(List<BucketMetadata> list) {
        this.b = list;
    }

    public void setOwner(OwnerBean ownerBean) {
        this.a = ownerBean;
    }

    public ListBucketResponse(OwnerBean ownerBean, List<BucketMetadata> list) {
        this.b = new ArrayList();
        this.a = ownerBean;
        this.b = list;
    }
}
