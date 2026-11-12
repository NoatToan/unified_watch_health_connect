package com.amap.api.services.busline;

import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class BusStationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<BusStationItem> f3513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BusStationQuery f3514c;
    private List<String> d;
    private List<SuggestionCity> e;

    public static BusStationResult createPagedResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        return new BusStationResult(busStationQuery, i, list, list2, arrayList);
    }

    private BusStationResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        this.f3513b = new ArrayList<>();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f3514c = busStationQuery;
        this.f3512a = a(i);
        this.e = list;
        this.d = list2;
        this.f3513b = arrayList;
    }

    private int a(int i) {
        int pageSize = this.f3514c.getPageSize();
        int i2 = ((i + pageSize) - 1) / pageSize;
        if (i2 > 30) {
            return 30;
        }
        return i2;
    }

    public final int getPageCount() {
        return this.f3512a;
    }

    public final BusStationQuery getQuery() {
        return this.f3514c;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.d;
    }

    public final List<SuggestionCity> getSearchSuggestionCities() {
        return this.e;
    }

    public final List<BusStationItem> getBusStations() {
        return this.f3513b;
    }
}
