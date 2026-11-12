package com.amap.api.services.busline;

import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class BusStationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<BusStationItem> f6516b;
    private BusStationQuery c;
    private List<String> d;
    private List<SuggestionCity> e;

    private BusStationResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        this.f6516b = new ArrayList<>();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.c = busStationQuery;
        this.f6515a = a(i);
        this.e = list;
        this.d = list2;
        this.f6516b = arrayList;
    }

    private int a(int i) {
        int pageSize = this.c.getPageSize();
        int i2 = ((i + pageSize) - 1) / pageSize;
        if (i2 > 30) {
            return 30;
        }
        return i2;
    }

    public static BusStationResult createPagedResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        return new BusStationResult(busStationQuery, i, list, list2, arrayList);
    }

    public final List<BusStationItem> getBusStations() {
        return this.f6516b;
    }

    public final int getPageCount() {
        return this.f6515a;
    }

    public final BusStationQuery getQuery() {
        return this.c;
    }

    public final List<SuggestionCity> getSearchSuggestionCities() {
        return this.e;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.d;
    }
}
