package com.amap.api.services.routepoisearch;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoutePOISearchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RoutePOIItem> f6788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RoutePOISearchQuery f6789b;

    public RoutePOISearchResult(ArrayList<RoutePOIItem> arrayList, RoutePOISearchQuery routePOISearchQuery) {
        new ArrayList();
        this.f6788a = arrayList;
        this.f6789b = routePOISearchQuery;
    }

    public RoutePOISearchQuery getQuery() {
        return this.f6789b;
    }

    public List<RoutePOIItem> getRoutePois() {
        return this.f6788a;
    }
}
