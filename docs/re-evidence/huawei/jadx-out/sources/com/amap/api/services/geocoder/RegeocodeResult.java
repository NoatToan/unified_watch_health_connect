package com.amap.api.services.geocoder;

/* JADX INFO: loaded from: classes4.dex */
public class RegeocodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RegeocodeQuery f3584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RegeocodeAddress f3585b;

    public RegeocodeResult(RegeocodeQuery regeocodeQuery, RegeocodeAddress regeocodeAddress) {
        this.f3584a = regeocodeQuery;
        this.f3585b = regeocodeAddress;
    }

    public RegeocodeQuery getRegeocodeQuery() {
        return this.f3584a;
    }

    public void setRegeocodeQuery(RegeocodeQuery regeocodeQuery) {
        this.f3584a = regeocodeQuery;
    }

    public RegeocodeAddress getRegeocodeAddress() {
        return this.f3585b;
    }

    public void setRegeocodeAddress(RegeocodeAddress regeocodeAddress) {
        this.f3585b = regeocodeAddress;
    }
}
