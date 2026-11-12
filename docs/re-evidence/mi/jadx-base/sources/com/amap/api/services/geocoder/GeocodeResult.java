package com.amap.api.services.geocoder;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GeocodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GeocodeQuery f6564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<GeocodeAddress> f6565b;

    public GeocodeResult(GeocodeQuery geocodeQuery, List<GeocodeAddress> list) {
        new ArrayList();
        this.f6564a = geocodeQuery;
        this.f6565b = list;
    }

    public List<GeocodeAddress> getGeocodeAddressList() {
        return this.f6565b;
    }

    public GeocodeQuery getGeocodeQuery() {
        return this.f6564a;
    }

    public void setGeocodeAddressList(List<GeocodeAddress> list) {
        this.f6565b = list;
    }

    public void setGeocodeQuery(GeocodeQuery geocodeQuery) {
        this.f6564a = geocodeQuery;
    }
}
