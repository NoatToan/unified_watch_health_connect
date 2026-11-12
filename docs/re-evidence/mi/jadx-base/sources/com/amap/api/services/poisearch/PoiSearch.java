package com.amap.api.services.poisearch;

import android.content.Context;
import com.amap.api.col.p0003sl.q0;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IPoiSearch;
import com.google.android.gms.common.ConnectionResult;
import defpackage.xts;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class PoiSearch {
    public static final String CHINESE = "zh-CN";
    public static final String ENGLISH = "en";
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IPoiSearch f6612a;

    public interface OnPoiSearchListener {
        void onPoiItemSearched(PoiItem poiItem, int i);

        void onPoiSearched(PoiResult poiResult, int i);
    }

    public static class Query implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6614b;
        private String c;
        private int d;
        private int e;
        private String f;
        private boolean g;
        private boolean h;
        private String i;
        private boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private LatLonPoint f6615k;
        private boolean l;
        private Map<String, String> m;
        private String n;

        public Query(String str, String str2) {
            this(str, str2, null);
        }

        private static String a() {
            return "";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Query query = (Query) obj;
            if (this.d == query.d && this.e == query.e && this.g == query.g && this.h == query.h && this.j == query.j && this.l == query.l && Objects.equals(this.f6613a, query.f6613a) && Objects.equals(this.f6614b, query.f6614b) && Objects.equals(this.c, query.c) && Objects.equals(this.f, query.f) && Objects.equals(this.i, query.i) && Objects.equals(this.f6615k, query.f6615k) && Objects.equals(this.m, query.m)) {
                return Objects.equals(this.n, query.n);
            }
            return false;
        }

        public String getBuilding() {
            return this.i;
        }

        public String getCategory() {
            String str = this.f6614b;
            return (str == null || str.equals("00") || this.f6614b.equals("00|")) ? a() : this.f6614b;
        }

        public String getCity() {
            return this.c;
        }

        public boolean getCityLimit() {
            return this.g;
        }

        public Map<String, String> getCustomParams() {
            return this.m;
        }

        public String getExtensions() {
            return this.n;
        }

        public LatLonPoint getLocation() {
            return this.f6615k;
        }

        public int getPageNum() {
            return this.d;
        }

        public int getPageSize() {
            return this.e;
        }

        public String getQueryLanguage() {
            return this.f;
        }

        public String getQueryString() {
            return this.f6613a;
        }

        public int hashCode() {
            String str = this.f6613a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f6614b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31;
            String str4 = this.f;
            int iHashCode4 = (((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31;
            String str5 = this.i;
            int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.j ? 1 : 0)) * 31;
            LatLonPoint latLonPoint = this.f6615k;
            int iHashCode6 = (((iHashCode5 + (latLonPoint != null ? latLonPoint.hashCode() : 0)) * 31) + (this.l ? 1 : 0)) * 31;
            Map<String, String> map = this.m;
            int iHashCode7 = (iHashCode6 + (map != null ? map.hashCode() : 0)) * 31;
            String str6 = this.n;
            return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public boolean isDistanceSort() {
            return this.j;
        }

        public boolean isRequireSubPois() {
            return this.h;
        }

        public boolean isSpecial() {
            return this.l;
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            return PoiSearch.b(query.f6613a, this.f6613a) && PoiSearch.b(query.f6614b, this.f6614b) && PoiSearch.b(query.f, this.f) && PoiSearch.b(query.c, this.c) && PoiSearch.b(query.n, this.n) && PoiSearch.b(query.i, this.i) && query.g == this.g && query.e == this.e && query.j == this.j && query.m.equals(this.m) && query.l == this.l;
        }

        public void requireSubPois(boolean z) {
            this.h = z;
        }

        public void setBuilding(String str) {
            this.i = str;
        }

        public void setCityLimit(boolean z) {
            this.g = z;
        }

        public void setCustomParams(Map<String, String> map) {
            if (map != null) {
                this.m.putAll(map);
            }
        }

        public void setDistanceSort(boolean z) {
            this.j = z;
        }

        public void setExtensions(String str) {
            this.n = str;
        }

        public void setLocation(LatLonPoint latLonPoint) {
            this.f6615k = latLonPoint;
        }

        public void setPageNum(int i) {
            if (i <= 0) {
                i = 1;
            }
            this.d = i;
        }

        public void setPageSize(int i) {
            if (i <= 0) {
                this.e = 20;
            } else if (i > 30) {
                this.e = 30;
            } else {
                this.e = i;
            }
        }

        public void setQueryLanguage(String str) {
            if ("en".equals(str)) {
                this.f = "en";
            } else {
                this.f = "zh-CN";
            }
        }

        public void setSpecial(boolean z) {
            this.l = z;
        }

        public Query(String str, String str2, String str3) {
            this.d = 1;
            this.e = 20;
            this.f = "zh-CN";
            this.g = false;
            this.h = false;
            this.j = true;
            this.l = true;
            this.m = new HashMap();
            this.n = "base";
            this.f6613a = str;
            this.f6614b = str2;
            this.c = str3;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Query m99clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                xts.i(e, "PoiSearch", "queryclone");
            }
            Query query = new Query(this.f6613a, this.f6614b, this.c);
            query.setPageNum(this.d);
            query.setPageSize(this.e);
            query.setQueryLanguage(this.f);
            query.setCityLimit(this.g);
            query.requireSubPois(this.h);
            query.setBuilding(this.i);
            query.setLocation(this.f6615k);
            query.setDistanceSort(this.j);
            query.setSpecial(this.l);
            query.setExtensions(this.n);
            query.setCustomParams(this.m);
            return query;
        }
    }

    public static class SearchBound implements Cloneable {
        public static final String BOUND_SHAPE = "Bound";
        public static final String ELLIPSE_SHAPE = "Ellipse";
        public static final String POLYGON_SHAPE = "Polygon";
        public static final String RECTANGLE_SHAPE = "Rectangle";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLonPoint f6616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLonPoint f6617b;
        private int c;
        private LatLonPoint d;
        private String e;
        private boolean f;
        private List<LatLonPoint> g;

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.f = true;
            this.e = "Bound";
            this.c = i;
            this.d = latLonPoint;
        }

        private void a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f6616a = latLonPoint;
            this.f6617b = latLonPoint2;
            if (latLonPoint.getLatitude() >= this.f6617b.getLatitude() || this.f6616a.getLongitude() >= this.f6617b.getLongitude()) {
                new IllegalArgumentException("invalid rect ").printStackTrace();
            }
            this.d = new LatLonPoint((this.f6616a.getLatitude() + this.f6617b.getLatitude()) / 2.0d, (this.f6616a.getLongitude() + this.f6617b.getLongitude()) / 2.0d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SearchBound searchBound = (SearchBound) obj;
            LatLonPoint latLonPoint = this.d;
            if (latLonPoint == null) {
                if (searchBound.d != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(searchBound.d)) {
                return false;
            }
            if (this.f != searchBound.f) {
                return false;
            }
            LatLonPoint latLonPoint2 = this.f6616a;
            if (latLonPoint2 == null) {
                if (searchBound.f6616a != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(searchBound.f6616a)) {
                return false;
            }
            LatLonPoint latLonPoint3 = this.f6617b;
            if (latLonPoint3 == null) {
                if (searchBound.f6617b != null) {
                    return false;
                }
            } else if (!latLonPoint3.equals(searchBound.f6617b)) {
                return false;
            }
            List<LatLonPoint> list = this.g;
            if (list == null) {
                if (searchBound.g != null) {
                    return false;
                }
            } else if (!list.equals(searchBound.g)) {
                return false;
            }
            if (this.c != searchBound.c) {
                return false;
            }
            String str = this.e;
            if (str == null) {
                if (searchBound.e != null) {
                    return false;
                }
            } else if (!str.equals(searchBound.e)) {
                return false;
            }
            return true;
        }

        public LatLonPoint getCenter() {
            return this.d;
        }

        public LatLonPoint getLowerLeft() {
            return this.f6616a;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.g;
        }

        public int getRange() {
            return this.c;
        }

        public String getShape() {
            return this.e;
        }

        public LatLonPoint getUpperRight() {
            return this.f6617b;
        }

        public int hashCode() {
            LatLonPoint latLonPoint = this.d;
            int iHashCode = ((((latLonPoint == null ? 0 : latLonPoint.hashCode()) + 31) * 31) + (this.f ? 1231 : 1237)) * 31;
            LatLonPoint latLonPoint2 = this.f6616a;
            int iHashCode2 = (iHashCode + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
            LatLonPoint latLonPoint3 = this.f6617b;
            int iHashCode3 = (iHashCode2 + (latLonPoint3 == null ? 0 : latLonPoint3.hashCode())) * 31;
            List<LatLonPoint> list = this.g;
            int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.c) * 31;
            String str = this.e;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public boolean isDistanceSort() {
            return this.f;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public SearchBound m100clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                xts.i(e, "PoiSearch", "SearchBoundClone");
            }
            return new SearchBound(this.f6616a, this.f6617b, this.c, this.d, this.e, this.g, this.f);
        }

        public SearchBound(LatLonPoint latLonPoint, int i, boolean z) {
            this.e = "Bound";
            this.c = i;
            this.d = latLonPoint;
            this.f = z;
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.c = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            this.f = true;
            this.e = "Rectangle";
            a(latLonPoint, latLonPoint2);
        }

        public SearchBound(List<LatLonPoint> list) {
            this.c = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            this.f = true;
            this.e = "Polygon";
            this.g = list;
        }

        private SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, LatLonPoint latLonPoint3, String str, List<LatLonPoint> list, boolean z) {
            this.f6616a = latLonPoint;
            this.f6617b = latLonPoint2;
            this.c = i;
            this.d = latLonPoint3;
            this.e = str;
            this.g = list;
            this.f = z;
        }
    }

    public PoiSearch(Context context, Query query) throws AMapException {
        this.f6612a = null;
        try {
            this.f6612a = new q0(context, query);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof AMapException) {
                throw ((AMapException) e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public SearchBound getBound() {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            return iPoiSearch.getBound();
        }
        return null;
    }

    public String getLanguage() {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            return iPoiSearch.getLanguage();
        }
        return null;
    }

    public Query getQuery() {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            return iPoiSearch.getQuery();
        }
        return null;
    }

    public PoiResult searchPOI() throws AMapException {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            return iPoiSearch.searchPOI();
        }
        return null;
    }

    public void searchPOIAsyn() {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            iPoiSearch.searchPOIAsyn();
        }
    }

    public PoiItem searchPOIId(String str) throws AMapException {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            return iPoiSearch.searchPOIId(str);
        }
        return null;
    }

    public void searchPOIIdAsyn(String str) {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            iPoiSearch.searchPOIIdAsyn(str);
        }
    }

    public void setBound(SearchBound searchBound) {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            iPoiSearch.setBound(searchBound);
        }
    }

    public void setLanguage(String str) {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            iPoiSearch.setLanguage(str);
        }
    }

    public void setOnPoiSearchListener(OnPoiSearchListener onPoiSearchListener) {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            iPoiSearch.setOnPoiSearchListener(onPoiSearchListener);
        }
    }

    public void setQuery(Query query) {
        IPoiSearch iPoiSearch = this.f6612a;
        if (iPoiSearch != null) {
            iPoiSearch.setQuery(query);
        }
    }
}
