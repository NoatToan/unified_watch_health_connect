package com.amap.api.services.geocoder;

/* JADX INFO: loaded from: classes4.dex */
public class GeocodeQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3574c;

    public GeocodeQuery(String str, String str2) {
        this.f3572a = str;
        this.f3573b = str2;
    }

    public String getLocationName() {
        return this.f3572a;
    }

    public void setLocationName(String str) {
        this.f3572a = str;
    }

    public String getCity() {
        return this.f3573b;
    }

    public void setCity(String str) {
        this.f3573b = str;
    }

    public String getCountry() {
        return this.f3574c;
    }

    public void setCountry(String str) {
        this.f3574c = str;
    }

    public int hashCode() {
        String str = this.f3573b;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f3572a;
        return ((iHashCode + 31) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeocodeQuery geocodeQuery = (GeocodeQuery) obj;
        String str = this.f3573b;
        if (str == null) {
            if (geocodeQuery.f3573b != null) {
                return false;
            }
        } else if (!str.equals(geocodeQuery.f3573b)) {
            return false;
        }
        String str2 = this.f3572a;
        if (str2 == null) {
            if (geocodeQuery.f3572a != null) {
                return false;
            }
        } else if (!str2.equals(geocodeQuery.f3572a)) {
            return false;
        }
        return true;
    }
}
