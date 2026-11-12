package com.amap.api.services.geocoder;

import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes4.dex */
public class RegeocodeQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLonPoint f6571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f6572b;
    private String c = GeocodeSearch.AMAP;
    private String d = "";
    private String e = "distance";
    private String f = "base";

    public RegeocodeQuery(LatLonPoint latLonPoint, float f, String str) {
        this.f6571a = latLonPoint;
        this.f6572b = f;
        setLatLonType(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegeocodeQuery regeocodeQuery = (RegeocodeQuery) obj;
        String str = this.c;
        if (str == null) {
            if (regeocodeQuery.c != null) {
                return false;
            }
        } else if (!str.equals(regeocodeQuery.c)) {
            return false;
        }
        LatLonPoint latLonPoint = this.f6571a;
        if (latLonPoint == null) {
            if (regeocodeQuery.f6571a != null) {
                return false;
            }
        } else if (!latLonPoint.equals(regeocodeQuery.f6571a)) {
            return false;
        }
        if (Float.floatToIntBits(this.f6572b) != Float.floatToIntBits(regeocodeQuery.f6572b) || !this.e.equals(regeocodeQuery.e)) {
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

    public String getExtensions() {
        return this.f;
    }

    public String getLatLonType() {
        return this.c;
    }

    public String getMode() {
        return this.e;
    }

    public String getPoiType() {
        return this.d;
    }

    public LatLonPoint getPoint() {
        return this.f6571a;
    }

    public float getRadius() {
        return this.f6572b;
    }

    public int hashCode() {
        String str = this.c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        LatLonPoint latLonPoint = this.f6571a;
        return ((iHashCode + (latLonPoint != null ? latLonPoint.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f6572b);
    }

    public void setExtensions(String str) {
        this.f = str;
    }

    public void setLatLonType(String str) {
        if (str != null) {
            if (str.equals(GeocodeSearch.AMAP) || str.equals("gps")) {
                this.c = str;
            }
        }
    }

    public void setMode(String str) {
        this.e = str;
    }

    public void setPoiType(String str) {
        this.d = str;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f6571a = latLonPoint;
    }

    public void setRadius(float f) {
        this.f6572b = f;
    }
}
