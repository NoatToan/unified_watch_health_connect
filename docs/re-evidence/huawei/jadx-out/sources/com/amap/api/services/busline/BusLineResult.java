package com.amap.api.services.busline;

import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class BusLineResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<BusLineItem> f3503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BusLineQuery f3504c;
    private List<String> d;
    private List<SuggestionCity> e;

    public static BusLineResult createPagedResult(BusLineQuery busLineQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusLineItem> arrayList) {
        return new BusLineResult(busLineQuery, i, list, list2, arrayList);
    }

    private BusLineResult(BusLineQuery busLineQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusLineItem> arrayList) {
        this.f3503b = new ArrayList<>();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f3504c = busLineQuery;
        this.f3502a = a(i);
        this.e = list;
        this.d = list2;
        this.f3503b = arrayList;
    }

    private int a(int i) {
        int pageSize = this.f3504c.getPageSize();
        int i2 = ((i + pageSize) - 1) / pageSize;
        if (i2 > 30) {
            return 30;
        }
        return i2;
    }

    public final int getPageCount() {
        return this.f3502a;
    }

    public final BusLineQuery getQuery() {
        return this.f3504c;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.d;
    }

    public final List<SuggestionCity> getSearchSuggestionCities() {
        return this.e;
    }

    public final List<BusLineItem> getBusLines() {
        return this.f3503b;
    }
}
