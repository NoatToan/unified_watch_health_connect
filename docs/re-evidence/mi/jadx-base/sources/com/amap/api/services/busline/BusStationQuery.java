package com.amap.api.services.busline;

import defpackage.xts;

/* JADX INFO: loaded from: classes4.dex */
public class BusStationQuery implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6514b;
    private int c = 20;
    private int d = 1;

    public BusStationQuery(String str, String str2) {
        this.f6513a = str;
        this.f6514b = str2;
        if (a()) {
            return;
        }
        new IllegalArgumentException("Empty query").printStackTrace();
    }

    private boolean a() {
        return !xts.j(this.f6513a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusStationQuery busStationQuery = (BusStationQuery) obj;
        String str = this.f6514b;
        if (str == null) {
            if (busStationQuery.f6514b != null) {
                return false;
            }
        } else if (!str.equals(busStationQuery.f6514b)) {
            return false;
        }
        if (this.d != busStationQuery.d || this.c != busStationQuery.c) {
            return false;
        }
        String str2 = this.f6513a;
        if (str2 == null) {
            if (busStationQuery.f6513a != null) {
                return false;
            }
        } else if (!str2.equals(busStationQuery.f6513a)) {
            return false;
        }
        return true;
    }

    public String getCity() {
        return this.f6514b;
    }

    public int getPageNumber() {
        return this.d;
    }

    public int getPageSize() {
        return this.c;
    }

    public String getQueryString() {
        return this.f6513a;
    }

    public int hashCode() {
        String str = this.f6514b;
        int iHashCode = ((((((str == null ? 0 : str.hashCode()) + 31) * 31) + this.d) * 31) + this.c) * 31;
        String str2 = this.f6513a;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void setCity(String str) {
        this.f6514b = str;
    }

    public void setPageNumber(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.d = i;
    }

    public void setPageSize(int i) {
        this.c = i;
    }

    public void setQueryString(String str) {
        this.f6513a = str;
    }

    public boolean weakEquals(BusStationQuery busStationQuery) {
        if (this == busStationQuery) {
            return true;
        }
        if (busStationQuery == null) {
            return false;
        }
        String str = this.f6514b;
        if (str == null) {
            if (busStationQuery.f6514b != null) {
                return false;
            }
        } else if (!str.equals(busStationQuery.f6514b)) {
            return false;
        }
        if (this.c != busStationQuery.c) {
            return false;
        }
        String str2 = this.f6513a;
        if (str2 == null) {
            if (busStationQuery.f6513a != null) {
                return false;
            }
        } else if (!str2.equals(busStationQuery.f6513a)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BusStationQuery m95clone() {
        BusStationQuery busStationQuery = new BusStationQuery(this.f6513a, this.f6514b);
        busStationQuery.setPageNumber(this.d);
        busStationQuery.setPageSize(this.c);
        return busStationQuery;
    }
}
