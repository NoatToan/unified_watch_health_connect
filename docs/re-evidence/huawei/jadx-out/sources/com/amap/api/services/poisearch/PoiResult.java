package com.amap.api.services.poisearch;

import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PoiResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<PoiItem> f3631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PoiSearch.Query f3632c;
    private PoiSearch.SearchBound d;
    private List<String> e;
    private List<SuggestionCity> f;
    private int g;

    public static PoiResult createPagedResult(PoiSearch.Query query, PoiSearch.SearchBound searchBound, List<String> list, List<SuggestionCity> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        return new PoiResult(query, searchBound, list, list2, i, i2, arrayList);
    }

    private PoiResult(PoiSearch.Query query, PoiSearch.SearchBound searchBound, List<String> list, List<SuggestionCity> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        this.f3631b = new ArrayList<>();
        this.f3632c = query;
        this.d = searchBound;
        this.e = list;
        this.f = list2;
        this.g = i;
        this.f3630a = a(i2);
        this.f3631b = arrayList;
    }

    public final int getPageCount() {
        return this.f3630a;
    }

    public final PoiSearch.Query getQuery() {
        return this.f3632c;
    }

    public final PoiSearch.SearchBound getBound() {
        return this.d;
    }

    public final ArrayList<PoiItem> getPois() {
        return this.f3631b;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.e;
    }

    public final List<SuggestionCity> getSearchSuggestionCitys() {
        return this.f;
    }

    private int a(int i) {
        int i2 = this.g;
        return ((i + i2) - 1) / i2;
    }
}
