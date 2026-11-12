package com.xiaomi.infra.galaxy.fds.result;

import com.xiaomi.infra.galaxy.fds.bean.BucketBean;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class ListAllAuthorizedBucketsResult {
    private List<BucketBean> a;

    public ListAllAuthorizedBucketsResult() {
    }

    public List<BucketBean> getBuckets() {
        return this.a;
    }

    public void setBuckets(List<BucketBean> list) {
        this.a = list;
    }

    public ListAllAuthorizedBucketsResult(List<BucketBean> list) {
        this.a = list;
    }
}
