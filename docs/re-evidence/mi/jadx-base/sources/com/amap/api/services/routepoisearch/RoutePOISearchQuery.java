package com.amap.api.services.routepoisearch;

import com.amap.api.services.core.LatLonPoint;
import defpackage.xts;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoutePOISearchQuery implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f6786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLonPoint f6787b;
    private int c;
    private RoutePOISearch.RoutePOISearchType d;
    private int e;
    private List<LatLonPoint> f;
    private String g;

    public RoutePOISearchQuery(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, RoutePOISearch.RoutePOISearchType routePOISearchType, int i2) {
        this.f6786a = latLonPoint;
        this.f6787b = latLonPoint2;
        this.c = i;
        this.d = routePOISearchType;
        this.e = i2;
    }

    public String getChannel() {
        return this.g;
    }

    public LatLonPoint getFrom() {
        return this.f6786a;
    }

    public int getMode() {
        return this.c;
    }

    public List<LatLonPoint> getPolylines() {
        return this.f;
    }

    public int getRange() {
        return this.e;
    }

    public RoutePOISearch.RoutePOISearchType getSearchType() {
        return this.d;
    }

    public LatLonPoint getTo() {
        return this.f6787b;
    }

    public void setChannel(String str) {
        this.g = str;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RoutePOISearchQuery m116clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            xts.i(e, "RoutePOISearchQuery", "RoutePOISearchQueryclone");
        }
        List<LatLonPoint> list = this.f;
        if (list == null || list.size() <= 0) {
            RoutePOISearchQuery routePOISearchQuery = new RoutePOISearchQuery(this.f6786a, this.f6787b, this.c, this.d, this.e);
            routePOISearchQuery.setChannel(this.g);
            return routePOISearchQuery;
        }
        RoutePOISearchQuery routePOISearchQuery2 = new RoutePOISearchQuery(this.f, this.d, this.e);
        routePOISearchQuery2.setChannel(this.g);
        return routePOISearchQuery2;
    }

    public RoutePOISearchQuery(List<LatLonPoint> list, RoutePOISearch.RoutePOISearchType routePOISearchType, int i) {
        this.f = list;
        this.d = routePOISearchType;
        this.e = i;
    }
}
