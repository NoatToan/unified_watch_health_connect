package com.amap.api.services.poisearch;

import com.amap.api.services.core.PoiItemV2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class PoiResultV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<PoiItemV2> f3634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PoiSearchV2.Query f3635c;
    private PoiSearchV2.SearchBound d;

    public static PoiResultV2 createPagedResult(PoiSearchV2.Query query, PoiSearchV2.SearchBound searchBound, int i, ArrayList<PoiItemV2> arrayList) {
        return new PoiResultV2(query, searchBound, i, arrayList);
    }

    private PoiResultV2(PoiSearchV2.Query query, PoiSearchV2.SearchBound searchBound, int i, ArrayList<PoiItemV2> arrayList) {
        new ArrayList();
        this.f3635c = query;
        this.d = searchBound;
        this.f3633a = i;
        this.f3634b = arrayList;
    }

    public int getCount() {
        return this.f3633a;
    }

    public PoiSearchV2.Query getQuery() {
        return this.f3635c;
    }

    public PoiSearchV2.SearchBound getBound() {
        return this.d;
    }

    public ArrayList<PoiItemV2> getPois() {
        return this.f3634b;
    }
}
