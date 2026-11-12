package com.amap.api.services.routepoisearch;

import com.amap.api.col.p0003sl.fu;
import com.amap.api.services.core.LatLonPoint;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class RoutePOISearchQuery implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f3862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f3863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3864c;
    private RoutePOISearch.RoutePOISearchType d;
    private int e;
    private List<LatLonPoint> f;
    private String g;

    public RoutePOISearchQuery(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, RoutePOISearch.RoutePOISearchType routePOISearchType, int i2) {
        this.f3862a = latLonPoint;
        this.f3863b = latLonPoint2;
        this.f3864c = i;
        this.d = routePOISearchType;
        this.e = i2;
    }

    public RoutePOISearchQuery(List<LatLonPoint> list, RoutePOISearch.RoutePOISearchType routePOISearchType, int i) {
        this.f = list;
        this.d = routePOISearchType;
        this.e = i;
    }

    public LatLonPoint getFrom() {
        return this.f3862a;
    }

    public LatLonPoint getTo() {
        return this.f3863b;
    }

    public int getMode() {
        return this.f3864c;
    }

    public RoutePOISearch.RoutePOISearchType getSearchType() {
        return this.d;
    }

    public int getRange() {
        return this.e;
    }

    public List<LatLonPoint> getPolylines() {
        return this.f;
    }

    public void setChannel(String str) {
        this.g = str;
    }

    public String getChannel() {
        return this.g;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RoutePOISearchQuery m787clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            fu.a(e, "RoutePOISearchQuery", "RoutePOISearchQueryclone");
        }
        List<LatLonPoint> list = this.f;
        if (list != null && list.size() > 0) {
            RoutePOISearchQuery routePOISearchQuery = new RoutePOISearchQuery(this.f, this.d, this.e);
            routePOISearchQuery.setChannel(this.g);
            return routePOISearchQuery;
        }
        RoutePOISearchQuery routePOISearchQuery2 = new RoutePOISearchQuery(this.f3862a, this.f3863b, this.f3864c, this.d, this.e);
        routePOISearchQuery2.setChannel(this.g);
        return routePOISearchQuery2;
    }
}
