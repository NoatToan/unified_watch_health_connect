package com.amap.api.services.routepoisearch;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoutePOISearchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<RoutePOIItem> f3865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RoutePOISearchQuery f3866b;

    public RoutePOISearchResult(ArrayList<RoutePOIItem> arrayList, RoutePOISearchQuery routePOISearchQuery) {
        new ArrayList();
        this.f3865a = arrayList;
        this.f3866b = routePOISearchQuery;
    }

    public List<RoutePOIItem> getRoutePois() {
        return this.f3865a;
    }

    public RoutePOISearchQuery getQuery() {
        return this.f3866b;
    }
}
