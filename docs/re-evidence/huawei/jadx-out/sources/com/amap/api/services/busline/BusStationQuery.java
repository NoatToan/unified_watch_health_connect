package com.amap.api.services.busline;

import com.amap.api.col.p0003sl.fu;

/* JADX INFO: loaded from: classes21.dex */
public class BusStationQuery implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3511c = 20;
    private int d = 1;

    public BusStationQuery(String str, String str2) {
        this.f3509a = str;
        this.f3510b = str2;
        if (a()) {
            return;
        }
        new IllegalArgumentException("Empty query").printStackTrace();
    }

    private boolean a() {
        return !fu.a(this.f3509a);
    }

    public String getQueryString() {
        return this.f3509a;
    }

    public String getCity() {
        return this.f3510b;
    }

    public int getPageSize() {
        return this.f3511c;
    }

    public int getPageNumber() {
        return this.d;
    }

    public void setQueryString(String str) {
        this.f3509a = str;
    }

    public void setCity(String str) {
        this.f3510b = str;
    }

    public void setPageSize(int i) {
        this.f3511c = i;
    }

    public void setPageNumber(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.d = i;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BusStationQuery m766clone() {
        BusStationQuery busStationQuery = new BusStationQuery(this.f3509a, this.f3510b);
        busStationQuery.setPageNumber(this.d);
        busStationQuery.setPageSize(this.f3511c);
        return busStationQuery;
    }

    public int hashCode() {
        String str = this.f3510b;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.d;
        int i2 = this.f3511c;
        String str2 = this.f3509a;
        return ((((((iHashCode + 31) * 31) + i) * 31) + i2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusStationQuery busStationQuery = (BusStationQuery) obj;
        String str = this.f3510b;
        if (str == null) {
            if (busStationQuery.f3510b != null) {
                return false;
            }
        } else if (!str.equals(busStationQuery.f3510b)) {
            return false;
        }
        if (this.d != busStationQuery.d || this.f3511c != busStationQuery.f3511c) {
            return false;
        }
        String str2 = this.f3509a;
        if (str2 == null) {
            if (busStationQuery.f3509a != null) {
                return false;
            }
        } else if (!str2.equals(busStationQuery.f3509a)) {
            return false;
        }
        return true;
    }

    public boolean weakEquals(BusStationQuery busStationQuery) {
        if (this == busStationQuery) {
            return true;
        }
        if (busStationQuery == null) {
            return false;
        }
        String str = this.f3510b;
        if (str == null) {
            if (busStationQuery.f3510b != null) {
                return false;
            }
        } else if (!str.equals(busStationQuery.f3510b)) {
            return false;
        }
        if (this.f3511c != busStationQuery.f3511c) {
            return false;
        }
        String str2 = this.f3509a;
        if (str2 == null) {
            if (busStationQuery.f3509a != null) {
                return false;
            }
        } else if (!str2.equals(busStationQuery.f3509a)) {
            return false;
        }
        return true;
    }
}
