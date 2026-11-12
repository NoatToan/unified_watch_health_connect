package com.amap.api.services.poisearch;

import android.content.Context;
import com.amap.api.col.p0003sl.fu;
import com.amap.api.col.p0003sl.hv;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IPoiSearch;
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
    private IPoiSearch f3636a;

    public interface OnPoiSearchListener {
        void onPoiItemSearched(PoiItem poiItem, int i);

        void onPoiSearched(PoiResult poiResult, int i);
    }

    public PoiSearch(Context context, Query query) throws AMapException {
        this.f3636a = null;
        try {
            this.f3636a = new hv(context, query);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof AMapException) {
                throw ((AMapException) e);
            }
        }
    }

    public void setOnPoiSearchListener(OnPoiSearchListener onPoiSearchListener) {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            iPoiSearch.setOnPoiSearchListener(onPoiSearchListener);
        }
    }

    public void setLanguage(String str) {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            iPoiSearch.setLanguage(str);
        }
    }

    public String getLanguage() {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            return iPoiSearch.getLanguage();
        }
        return null;
    }

    public PoiResult searchPOI() throws AMapException {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            return iPoiSearch.searchPOI();
        }
        return null;
    }

    public void searchPOIAsyn() {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            iPoiSearch.searchPOIAsyn();
        }
    }

    public PoiItem searchPOIId(String str) throws AMapException {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            return iPoiSearch.searchPOIId(str);
        }
        return null;
    }

    public void searchPOIIdAsyn(String str) {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            iPoiSearch.searchPOIIdAsyn(str);
        }
    }

    public void setQuery(Query query) {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            iPoiSearch.setQuery(query);
        }
    }

    public void setBound(SearchBound searchBound) {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            iPoiSearch.setBound(searchBound);
        }
    }

    public Query getQuery() {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            return iPoiSearch.getQuery();
        }
        return null;
    }

    public SearchBound getBound() {
        IPoiSearch iPoiSearch = this.f3636a;
        if (iPoiSearch != null) {
            return iPoiSearch.getBound();
        }
        return null;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Query implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3639c;
        private int d;
        private int e;
        private String f;
        private boolean g;
        private boolean h;
        private String i;
        private boolean j;
        private LatLonPoint k;
        private boolean l;
        private Map<String, String> m;
        private String n;

        public Query(String str, String str2) {
            this(str, str2, null);
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
            this.f3637a = str;
            this.f3638b = str2;
            this.f3639c = str3;
        }

        public String getBuilding() {
            return this.i;
        }

        public void setBuilding(String str) {
            this.i = str;
        }

        public String getQueryString() {
            return this.f3637a;
        }

        public void setQueryLanguage(String str) {
            if ("en".equals(str)) {
                this.f = "en";
            } else {
                this.f = "zh-CN";
            }
        }

        protected String getQueryLanguage() {
            return this.f;
        }

        public String getCategory() {
            String str = this.f3638b;
            if (str == null || str.equals("00") || this.f3638b.equals("00|")) {
                return a();
            }
            return this.f3638b;
        }

        private static String a() {
            return "";
        }

        public String getCity() {
            return this.f3639c;
        }

        public int getPageNum() {
            return this.d;
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

        public int getPageSize() {
            return this.e;
        }

        public void setCityLimit(boolean z) {
            this.g = z;
        }

        public boolean getCityLimit() {
            return this.g;
        }

        public void requireSubPois(boolean z) {
            this.h = z;
        }

        public boolean isRequireSubPois() {
            return this.h;
        }

        public boolean isDistanceSort() {
            return this.j;
        }

        public void setDistanceSort(boolean z) {
            this.j = z;
        }

        public LatLonPoint getLocation() {
            return this.k;
        }

        public void setLocation(LatLonPoint latLonPoint) {
            this.k = latLonPoint;
        }

        public boolean isSpecial() {
            return this.l;
        }

        public void setSpecial(boolean z) {
            this.l = z;
        }

        public String getExtensions() {
            return this.n;
        }

        public void setExtensions(String str) {
            this.n = str;
        }

        public void setCustomParams(Map<String, String> map) {
            if (map != null) {
                this.m.putAll(map);
            }
        }

        public Map<String, String> getCustomParams() {
            return this.m;
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            return PoiSearch.b(query.f3637a, this.f3637a) && PoiSearch.b(query.f3638b, this.f3638b) && PoiSearch.b(query.f, this.f) && PoiSearch.b(query.f3639c, this.f3639c) && PoiSearch.b(query.n, this.n) && PoiSearch.b(query.i, this.i) && query.g == this.g && query.e == this.e && query.j == this.j && query.m.equals(this.m) && query.l == this.l;
        }

        public int hashCode() {
            String str = this.f3637a;
            int iHashCode = str != null ? str.hashCode() : 0;
            String str2 = this.f3638b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.f3639c;
            int iHashCode3 = str3 != null ? str3.hashCode() : 0;
            int i = this.d;
            int i2 = this.e;
            String str4 = this.f;
            int iHashCode4 = str4 != null ? str4.hashCode() : 0;
            boolean z = this.g;
            boolean z2 = this.h;
            String str5 = this.i;
            int iHashCode5 = str5 != null ? str5.hashCode() : 0;
            boolean z3 = this.j;
            LatLonPoint latLonPoint = this.k;
            int iHashCode6 = latLonPoint != null ? latLonPoint.hashCode() : 0;
            boolean z4 = this.l;
            Map<String, String> map = this.m;
            int iHashCode7 = map != null ? map.hashCode() : 0;
            String str6 = this.n;
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + i2) * 31) + iHashCode4) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + iHashCode5) * 31) + (z3 ? 1 : 0)) * 31) + iHashCode6) * 31) + (z4 ? 1 : 0)) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Query query = (Query) obj;
            if (this.d == query.d && this.e == query.e && this.g == query.g && this.h == query.h && this.j == query.j && this.l == query.l && Objects.equals(this.f3637a, query.f3637a) && Objects.equals(this.f3638b, query.f3638b) && Objects.equals(this.f3639c, query.f3639c) && Objects.equals(this.f, query.f) && Objects.equals(this.i, query.i) && Objects.equals(this.k, query.k) && Objects.equals(this.m, query.m)) {
                return Objects.equals(this.n, query.n);
            }
            return false;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Query m770clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "PoiSearch", "queryclone");
            }
            Query query = new Query(this.f3637a, this.f3638b, this.f3639c);
            query.setPageNum(this.d);
            query.setPageSize(this.e);
            query.setQueryLanguage(this.f);
            query.setCityLimit(this.g);
            query.requireSubPois(this.h);
            query.setBuilding(this.i);
            query.setLocation(this.k);
            query.setDistanceSort(this.j);
            query.setSpecial(this.l);
            query.setExtensions(this.n);
            query.setCustomParams(this.m);
            return query;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class SearchBound implements Cloneable {
        public static final String BOUND_SHAPE = "Bound";
        public static final String ELLIPSE_SHAPE = "Ellipse";
        public static final String POLYGON_SHAPE = "Polygon";
        public static final String RECTANGLE_SHAPE = "Rectangle";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLonPoint f3640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLonPoint f3641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3642c;
        private LatLonPoint d;
        private String e;
        private boolean f;
        private List<LatLonPoint> g;

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.f = true;
            this.e = "Bound";
            this.f3642c = i;
            this.d = latLonPoint;
        }

        public SearchBound(LatLonPoint latLonPoint, int i, boolean z) {
            this.e = "Bound";
            this.f3642c = i;
            this.d = latLonPoint;
            this.f = z;
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f3642c = 1500;
            this.f = true;
            this.e = "Rectangle";
            a(latLonPoint, latLonPoint2);
        }

        public SearchBound(List<LatLonPoint> list) {
            this.f3642c = 1500;
            this.f = true;
            this.e = "Polygon";
            this.g = list;
        }

        private SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, LatLonPoint latLonPoint3, String str, List<LatLonPoint> list, boolean z) {
            this.f3640a = latLonPoint;
            this.f3641b = latLonPoint2;
            this.f3642c = i;
            this.d = latLonPoint3;
            this.e = str;
            this.g = list;
            this.f = z;
        }

        private void a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f3640a = latLonPoint;
            this.f3641b = latLonPoint2;
            if (latLonPoint.getLatitude() >= this.f3641b.getLatitude() || this.f3640a.getLongitude() >= this.f3641b.getLongitude()) {
                new IllegalArgumentException("invalid rect ").printStackTrace();
            }
            this.d = new LatLonPoint((this.f3640a.getLatitude() + this.f3641b.getLatitude()) / 2.0d, (this.f3640a.getLongitude() + this.f3641b.getLongitude()) / 2.0d);
        }

        public LatLonPoint getLowerLeft() {
            return this.f3640a;
        }

        public LatLonPoint getUpperRight() {
            return this.f3641b;
        }

        public LatLonPoint getCenter() {
            return this.d;
        }

        public int getRange() {
            return this.f3642c;
        }

        public String getShape() {
            return this.e;
        }

        public boolean isDistanceSort() {
            return this.f;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.g;
        }

        public int hashCode() {
            LatLonPoint latLonPoint = this.d;
            int iHashCode = latLonPoint == null ? 0 : latLonPoint.hashCode();
            int i = this.f ? 1231 : 1237;
            LatLonPoint latLonPoint2 = this.f3640a;
            int iHashCode2 = latLonPoint2 == null ? 0 : latLonPoint2.hashCode();
            LatLonPoint latLonPoint3 = this.f3641b;
            int iHashCode3 = latLonPoint3 == null ? 0 : latLonPoint3.hashCode();
            List<LatLonPoint> list = this.g;
            int iHashCode4 = list == null ? 0 : list.hashCode();
            int i2 = this.f3642c;
            String str = this.e;
            return ((((((((((((iHashCode + 31) * 31) + i) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i2) * 31) + (str != null ? str.hashCode() : 0);
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
            LatLonPoint latLonPoint2 = this.f3640a;
            if (latLonPoint2 == null) {
                if (searchBound.f3640a != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(searchBound.f3640a)) {
                return false;
            }
            LatLonPoint latLonPoint3 = this.f3641b;
            if (latLonPoint3 == null) {
                if (searchBound.f3641b != null) {
                    return false;
                }
            } else if (!latLonPoint3.equals(searchBound.f3641b)) {
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
            if (this.f3642c != searchBound.f3642c) {
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

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public SearchBound m771clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "PoiSearch", "SearchBoundClone");
            }
            return new SearchBound(this.f3640a, this.f3641b, this.f3642c, this.d, this.e, this.g, this.f);
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
}
