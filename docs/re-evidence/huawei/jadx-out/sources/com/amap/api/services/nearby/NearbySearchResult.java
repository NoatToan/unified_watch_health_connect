package com.amap.api.services.nearby;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NearbySearchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<NearbyInfo> f3609a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3610b = 0;

    public List<NearbyInfo> getNearbyInfoList() {
        return this.f3609a;
    }

    public int getTotalNum() {
        return this.f3610b;
    }

    public void setNearbyInfoList(List<NearbyInfo> list) {
        this.f3609a = list;
        this.f3610b = list.size();
    }
}
