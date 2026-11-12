package com.amap.api.services.poisearch;

import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PoiResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<PoiItem> f6609b;
    private PoiSearch.Query c;
    private PoiSearch.SearchBound d;
    private List<String> e;
    private List<SuggestionCity> f;
    private int g;

    private PoiResult(PoiSearch.Query query, PoiSearch.SearchBound searchBound, List<String> list, List<SuggestionCity> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        this.f6609b = new ArrayList<>();
        this.c = query;
        this.d = searchBound;
        this.e = list;
        this.f = list2;
        this.g = i;
        this.f6608a = a(i2);
        this.f6609b = arrayList;
    }

    private int a(int i) {
        int i2 = this.g;
        return ((i + i2) - 1) / i2;
    }

    public static PoiResult createPagedResult(PoiSearch.Query query, PoiSearch.SearchBound searchBound, List<String> list, List<SuggestionCity> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        return new PoiResult(query, searchBound, list, list2, i, i2, arrayList);
    }

    public final PoiSearch.SearchBound getBound() {
        return this.d;
    }

    public final int getPageCount() {
        return this.f6608a;
    }

    public final ArrayList<PoiItem> getPois() {
        return this.f6609b;
    }

    public final PoiSearch.Query getQuery() {
        return this.c;
    }

    public final List<SuggestionCity> getSearchSuggestionCitys() {
        return this.f;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.e;
    }
}
