package com.amap.api.services.geocoder;

/* JADX INFO: loaded from: classes4.dex */
public class RegeocodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RegeocodeQuery f6573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RegeocodeAddress f6574b;

    public RegeocodeResult(RegeocodeQuery regeocodeQuery, RegeocodeAddress regeocodeAddress) {
        this.f6573a = regeocodeQuery;
        this.f6574b = regeocodeAddress;
    }

    public RegeocodeAddress getRegeocodeAddress() {
        return this.f6574b;
    }

    public RegeocodeQuery getRegeocodeQuery() {
        return this.f6573a;
    }

    public void setRegeocodeAddress(RegeocodeAddress regeocodeAddress) {
        this.f6574b = regeocodeAddress;
    }

    public void setRegeocodeQuery(RegeocodeQuery regeocodeQuery) {
        this.f6573a = regeocodeQuery;
    }
}
