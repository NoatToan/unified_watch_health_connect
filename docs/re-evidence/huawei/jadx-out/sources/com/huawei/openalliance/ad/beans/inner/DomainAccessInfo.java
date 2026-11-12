package com.huawei.openalliance.ad.beans.inner;

import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class DomainAccessInfo {
    private int accessCount;
    private List<Long> accessTimes;
    private String domain;

    public String toString() {
        return "Domain: " + this.domain + ", Count: " + this.accessCount + ", Times: " + this.accessTimes;
    }
}
