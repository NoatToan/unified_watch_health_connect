package com.amap.api.services.nearby;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NearbySearchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<NearbyInfo> f6592a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6593b = 0;

    public List<NearbyInfo> getNearbyInfoList() {
        return this.f6592a;
    }

    public int getTotalNum() {
        return this.f6593b;
    }

    public void setNearbyInfoList(List<NearbyInfo> list) {
        this.f6592a = list;
        this.f6593b = list.size();
    }
}
