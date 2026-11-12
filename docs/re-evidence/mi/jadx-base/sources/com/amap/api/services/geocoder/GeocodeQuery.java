package com.amap.api.services.geocoder;

/* JADX INFO: loaded from: classes4.dex */
public class GeocodeQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6563b;
    private String c;

    public GeocodeQuery(String str, String str2) {
        this.f6562a = str;
        this.f6563b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeocodeQuery geocodeQuery = (GeocodeQuery) obj;
        String str = this.f6563b;
        if (str == null) {
            if (geocodeQuery.f6563b != null) {
                return false;
            }
        } else if (!str.equals(geocodeQuery.f6563b)) {
            return false;
        }
        String str2 = this.f6562a;
        if (str2 == null) {
            if (geocodeQuery.f6562a != null) {
                return false;
            }
        } else if (!str2.equals(geocodeQuery.f6562a)) {
            return false;
        }
        return true;
    }

    public String getCity() {
        return this.f6563b;
    }

    public String getCountry() {
        return this.c;
    }

    public String getLocationName() {
        return this.f6562a;
    }

    public int hashCode() {
        String str = this.f6563b;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f6562a;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void setCity(String str) {
        this.f6563b = str;
    }

    public void setCountry(String str) {
        this.c = str;
    }

    public void setLocationName(String str) {
        this.f6562a = str;
    }
}
