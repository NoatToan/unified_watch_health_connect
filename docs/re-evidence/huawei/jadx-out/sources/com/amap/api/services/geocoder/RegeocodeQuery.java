package com.amap.api.services.geocoder;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes21.dex */
public class RegeocodeQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f3581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3583c = GeocodeSearch.AMAP;
    private String d = "";
    private String e = "distance";
    private String f = "base";

    public RegeocodeQuery(LatLonPoint latLonPoint, float f, String str) {
        this.f3581a = latLonPoint;
        this.f3582b = f;
        setLatLonType(str);
    }

    public LatLonPoint getPoint() {
        return this.f3581a;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f3581a = latLonPoint;
    }

    public float getRadius() {
        return this.f3582b;
    }

    public void setRadius(float f) {
        this.f3582b = f;
    }

    public String getLatLonType() {
        return this.f3583c;
    }

    public void setLatLonType(String str) {
        if (str != null) {
            if (str.equals(GeocodeSearch.AMAP) || str.equals(GeocodeSearch.GPS)) {
                this.f3583c = str;
            }
        }
    }

    public String getPoiType() {
        return this.d;
    }

    public void setPoiType(String str) {
        this.d = str;
    }

    public String getMode() {
        return this.e;
    }

    public void setMode(String str) {
        this.e = str;
    }

    public String getExtensions() {
        return this.f;
    }

    public void setExtensions(String str) {
        this.f = str;
    }

    public int hashCode() {
        String str = this.f3583c;
        int iHashCode = str == null ? 0 : str.hashCode();
        LatLonPoint latLonPoint = this.f3581a;
        return ((((iHashCode + 31) * 31) + (latLonPoint != null ? latLonPoint.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f3582b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegeocodeQuery regeocodeQuery = (RegeocodeQuery) obj;
        String str = this.f3583c;
        if (str == null) {
            if (regeocodeQuery.f3583c != null) {
                return false;
            }
        } else if (!str.equals(regeocodeQuery.f3583c)) {
            return false;
        }
        LatLonPoint latLonPoint = this.f3581a;
        if (latLonPoint == null) {
            if (regeocodeQuery.f3581a != null) {
                return false;
            }
        } else if (!latLonPoint.equals(regeocodeQuery.f3581a)) {
            return false;
        }
        if (Float.floatToIntBits(this.f3582b) != Float.floatToIntBits(regeocodeQuery.f3582b) || !this.e.equals(regeocodeQuery.e)) {
            return false;
        }
        String str2 = this.f;
        if (str2 == null) {
            if (regeocodeQuery.f != null) {
                return false;
            }
        } else if (!str2.equals(regeocodeQuery.f)) {
            return false;
        }
        return true;
    }
}
