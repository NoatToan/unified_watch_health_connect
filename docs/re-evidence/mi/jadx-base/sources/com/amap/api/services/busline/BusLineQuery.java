package com.amap.api.services.busline;

/* JADX INFO: loaded from: classes4.dex */
public class BusLineQuery implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6506b;
    private SearchType e;
    private int c = 20;
    private int d = 1;
    private String f = "base";

    public enum SearchType {
        BY_LINE_ID,
        BY_LINE_NAME
    }

    public BusLineQuery(String str, SearchType searchType, String str2) {
        this.f6505a = str;
        this.e = searchType;
        this.f6506b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusLineQuery busLineQuery = (BusLineQuery) obj;
        if (this.e != busLineQuery.e) {
            return false;
        }
        String str = this.f6506b;
        if (str == null) {
            if (busLineQuery.f6506b != null) {
                return false;
            }
        } else if (!str.equals(busLineQuery.f6506b)) {
            return false;
        }
        if (this.d != busLineQuery.d || this.c != busLineQuery.c) {
            return false;
        }
        String str2 = this.f6505a;
        if (str2 == null) {
            if (busLineQuery.f6505a != null) {
                return false;
            }
        } else if (!str2.equals(busLineQuery.f6505a)) {
            return false;
        }
        String str3 = this.f;
        if (str3 == null) {
            if (busLineQuery.f != null) {
                return false;
            }
        } else if (!str3.equals(busLineQuery.f)) {
            return false;
        }
        return true;
    }

    public SearchType getCategory() {
        return this.e;
    }

    public String getCity() {
        return this.f6506b;
    }

    public String getExtensions() {
        return this.f;
    }

    public int getPageNumber() {
        return this.d;
    }

    public int getPageSize() {
        return this.c;
    }

    public String getQueryString() {
        return this.f6505a;
    }

    public int hashCode() {
        SearchType searchType = this.e;
        int iHashCode = ((searchType == null ? 0 : searchType.hashCode()) + 31) * 31;
        String str = this.f6506b;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d) * 31) + this.c) * 31;
        String str2 = this.f6505a;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public void setCategory(SearchType searchType) {
        this.e = searchType;
    }

    public void setCity(String str) {
        this.f6506b = str;
    }

    public void setExtensions(String str) {
        this.f = str;
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
        this.f6505a = str;
    }

    public boolean weakEquals(BusLineQuery busLineQuery) {
        if (this == busLineQuery) {
            return true;
        }
        if (busLineQuery == null) {
            return false;
        }
        if (this.f6505a == null) {
            if (busLineQuery.getQueryString() != null) {
                return false;
            }
        } else if (!busLineQuery.getQueryString().equals(this.f6505a)) {
            return false;
        }
        if (this.f6506b == null) {
            if (busLineQuery.getCity() != null) {
                return false;
            }
        } else if (!busLineQuery.getCity().equals(this.f6506b)) {
            return false;
        }
        return this.c == busLineQuery.getPageSize() && busLineQuery.getCategory().compareTo(this.e) == 0;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BusLineQuery m94clone() {
        BusLineQuery busLineQuery = new BusLineQuery(this.f6505a, this.e, this.f6506b);
        busLineQuery.setPageNumber(this.d);
        busLineQuery.setPageSize(this.c);
        busLineQuery.setExtensions(this.f);
        return busLineQuery;
    }
}
