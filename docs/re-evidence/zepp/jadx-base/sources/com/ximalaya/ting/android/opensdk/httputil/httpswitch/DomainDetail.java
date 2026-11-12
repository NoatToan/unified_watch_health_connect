package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class DomainDetail {
    public Map<String, Integer> DNS_PROVIDER_LIST = new HashMap();
    public List<IdcGroup> IDC_GROUP;
    public int IPV6;
    public String LOG_COMPRESS_COUNT;
    public String M;
    public String N;
    public String PROTOCOL;
    public String RTT;

    public DomainDetail(List<IdcGroup> list) {
        this.IDC_GROUP = new CopyOnWriteArrayList();
        this.IDC_GROUP = list;
    }

    public String toString() {
        return "DomainDetail{RTT='" + this.RTT + "', M='" + this.M + "', N='" + this.N + "', PROTOCOL='" + this.PROTOCOL + "', IDC_GROUP=" + this.IDC_GROUP + ", IPV6=" + this.IPV6 + ", DNS_PROVIDER_LIST=" + this.DNS_PROVIDER_LIST + '}';
    }
}
