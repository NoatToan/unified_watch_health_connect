package com.amap.api.services.geocoder;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GeocodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GeocodeQuery f3575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<GeocodeAddress> f3576b;

    public GeocodeResult(GeocodeQuery geocodeQuery, List<GeocodeAddress> list) {
        new ArrayList();
        this.f3575a = geocodeQuery;
        this.f3576b = list;
    }

    public GeocodeQuery getGeocodeQuery() {
        return this.f3575a;
    }

    public void setGeocodeQuery(GeocodeQuery geocodeQuery) {
        this.f3575a = geocodeQuery;
    }

    public List<GeocodeAddress> getGeocodeAddressList() {
        return this.f3576b;
    }

    public void setGeocodeAddressList(List<GeocodeAddress> list) {
        this.f3576b = list;
    }
}
