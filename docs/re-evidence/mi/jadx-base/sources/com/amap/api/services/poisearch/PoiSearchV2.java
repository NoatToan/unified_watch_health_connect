package com.amap.api.services.poisearch;

import android.content.Context;
import com.amap.api.col.p0003sl.r0;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItemV2;
import com.amap.api.services.interfaces.IPoiSearchV2;
import com.google.android.gms.common.ConnectionResult;
import defpackage.xts;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class PoiSearchV2 {
    public static final String CHINESE = "zh-CN";
    public static final String ENGLISH = "en";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IPoiSearchV2 f6618a;

    public interface OnPoiSearchListener {
        void onPoiItemSearched(PoiItemV2 poiItemV2, int i);

        void onPoiSearched(PoiResultV2 poiResultV2, int i);
    }

    public enum PremiumType {
        DEFAULT(""),
        ENTIRETY("entirety_poi");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6620a;

        PremiumType(String str) {
            this.f6620a = str;
        }

        public final String a() {
            return this.f6620a;
        }

        public static PremiumType a(String str) {
            PremiumType premiumType = DEFAULT;
            if (str.equals(premiumType.a())) {
                return premiumType;
            }
            PremiumType premiumType2 = ENTIRETY;
            return str.equals(premiumType2.a()) ? premiumType2 : premiumType;
        }
    }

    public static class Query implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6622b;
        private String c;
        private int d;
        private int e;
        private String f;
        private boolean g;
        private String h;
        private boolean i;
        private LatLonPoint j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f6623k;
        private String l;
        private String m;
        private Map<String, String> n;
        private ShowFields o;

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
            if (this.d == query.d && this.e == query.e && this.g == query.g && this.i == query.i && this.f6623k == query.f6623k && Objects.equals(this.f6621a, query.f6621a) && Objects.equals(this.f6622b, query.f6622b) && Objects.equals(this.c, query.c) && Objects.equals(this.f, query.f) && Objects.equals(this.h, query.h) && Objects.equals(this.j, query.j) && Objects.equals(this.l, query.l) && Objects.equals(this.m, query.m) && Objects.equals(this.n, query.n)) {
                return Objects.equals(this.o, query.o);
            }
            return false;
        }

        public String getBuilding() {
            return this.h;
        }

        public String getCategory() {
            String str = this.f6622b;
            return (str == null || str.equals("00") || this.f6622b.equals("00|")) ? a() : this.f6622b;
        }

        public String getChannel() {
            return this.l;
        }

        public String getCity() {
            return this.c;
        }

        public boolean getCityLimit() {
            return this.g;
        }

        public Map<String, String> getCustomParams() {
            return this.n;
        }

        public LatLonPoint getLocation() {
            return this.j;
        }

        public int getPageNum() {
            return this.d;
        }

        public int getPageSize() {
            return this.e;
        }

        public String getPremium() {
            return this.m;
        }

        public String getQueryLanguage() {
            return this.f;
        }

        public String getQueryString() {
            return this.f6621a;
        }

        public ShowFields getShowFields() {
            return this.o;
        }

        public int hashCode() {
            String str = this.f6621a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f6622b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31;
            String str4 = this.f;
            int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.g ? 1 : 0)) * 31;
            String str5 = this.h;
            int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.i ? 1 : 0)) * 31;
            LatLonPoint latLonPoint = this.j;
            int iHashCode6 = (((iHashCode5 + (latLonPoint != null ? latLonPoint.hashCode() : 0)) * 31) + (this.f6623k ? 1 : 0)) * 31;
            String str6 = this.l;
            int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.m;
            int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
            Map<String, String> map = this.n;
            int iHashCode9 = (iHashCode8 + (map != null ? map.hashCode() : 0)) * 31;
            ShowFields showFields = this.o;
            return iHashCode9 + (showFields != null ? showFields.hashCode() : 0);
        }

        public boolean isDistanceSort() {
            return this.i;
        }

        public boolean isSpecial() {
            return this.f6623k;
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            return PoiSearchV2.b(query.f6621a, this.f6621a) && PoiSearchV2.b(query.f6622b, this.f6622b) && PoiSearchV2.b(query.f, this.f) && PoiSearchV2.b(query.c, this.c) && PoiSearchV2.b(query.h, this.h) && PoiSearchV2.b(query.l, this.l) && PoiSearchV2.b(query.m, this.m) && query.g == this.g && query.e == this.e && query.i == this.i && query.f6623k == this.f6623k && query.n.equals(this.n) && query.o.value == this.o.value;
        }

        public void setBuilding(String str) {
            this.h = str;
        }

        public void setChannel(String str) {
            this.l = str;
        }

        public void setCityLimit(boolean z) {
            this.g = z;
        }

        public void setCustomParams(Map<String, String> map) {
            this.n = map;
        }

        public void setDistanceSort(boolean z) {
            this.i = z;
        }

        public void setLocation(LatLonPoint latLonPoint) {
            this.j = latLonPoint;
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

        public void setPremium(PremiumType premiumType) {
            if (premiumType == null) {
                return;
            }
            this.m = premiumType.a();
        }

        public void setQueryLanguage(String str) {
            if ("en".equals(str)) {
                this.f = "en";
            } else {
                this.f = "zh-CN";
            }
        }

        public void setShowFields(ShowFields showFields) {
            if (showFields == null) {
                this.o = new ShowFields();
            } else {
                this.o = showFields;
            }
        }

        public void setSpecial(boolean z) {
            this.f6623k = z;
        }

        public Query(String str, String str2, String str3) {
            this.d = 1;
            this.e = 20;
            this.f = "zh-CN";
            this.g = false;
            this.i = true;
            this.f6623k = true;
            this.m = PremiumType.DEFAULT.a();
            this.n = new HashMap();
            this.o = new ShowFields();
            this.f6621a = str;
            this.f6622b = str2;
            this.c = str3;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Query m101clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                xts.i(e, "PoiSearch", "queryclone");
            }
            Query query = new Query(this.f6621a, this.f6622b, this.c);
            query.setPageNum(this.d);
            query.setPageSize(this.e);
            query.setQueryLanguage(this.f);
            query.setCityLimit(this.g);
            query.setBuilding(this.h);
            query.setLocation(this.j);
            query.setDistanceSort(this.i);
            query.setSpecial(this.f6623k);
            query.setChannel(this.l);
            query.setPremium(PremiumType.a(this.m));
            query.setCustomParams(this.n);
            query.setShowFields(new ShowFields(this.o.value));
            return query;
        }
    }

    public static class SearchBound implements Cloneable {
        public static final String BOUND_SHAPE = "Bound";
        public static final String ELLIPSE_SHAPE = "Ellipse";
        public static final String POLYGON_SHAPE = "Polygon";
        public static final String RECTANGLE_SHAPE = "Rectangle";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLonPoint f6624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLonPoint f6625b;
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
            this.f6624a = latLonPoint;
            this.f6625b = latLonPoint2;
            if (latLonPoint.getLatitude() >= this.f6625b.getLatitude() || this.f6624a.getLongitude() >= this.f6625b.getLongitude()) {
                new IllegalArgumentException("invalid rect ").printStackTrace();
            }
            this.d = new LatLonPoint((this.f6624a.getLatitude() + this.f6625b.getLatitude()) / 2.0d, (this.f6624a.getLongitude() + this.f6625b.getLongitude()) / 2.0d);
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
            LatLonPoint latLonPoint2 = this.f6624a;
            if (latLonPoint2 == null) {
                if (searchBound.f6624a != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(searchBound.f6624a)) {
                return false;
            }
            LatLonPoint latLonPoint3 = this.f6625b;
            if (latLonPoint3 == null) {
                if (searchBound.f6625b != null) {
                    return false;
                }
            } else if (!latLonPoint3.equals(searchBound.f6625b)) {
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
            return this.f6624a;
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
            return this.f6625b;
        }

        public int hashCode() {
            LatLonPoint latLonPoint = this.d;
            int iHashCode = ((((latLonPoint == null ? 0 : latLonPoint.hashCode()) + 31) * 31) + (this.f ? 1231 : 1237)) * 31;
            LatLonPoint latLonPoint2 = this.f6624a;
            int iHashCode2 = (iHashCode + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
            LatLonPoint latLonPoint3 = this.f6625b;
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
        public SearchBound m102clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                xts.i(e, "PoiSearch", "SearchBoundClone");
            }
            return new SearchBound(this.f6624a, this.f6625b, this.c, this.d, this.e, this.g, this.f);
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
            this.f6624a = latLonPoint;
            this.f6625b = latLonPoint2;
            this.c = i;
            this.d = latLonPoint3;
            this.e = str;
            this.g = list;
            this.f = z;
        }
    }

    public static class ShowFields {
        public static final int ALL = -1;
        public static final int BUSINESS = 2;
        public static final int CHILDREN = 1;
        public static final int DEFAULT = 0;
        public static final int INDOOR = 4;
        public static final int NAVI = 8;
        public static final int PHOTOS = 16;
        public int value;

        public ShowFields() {
            this.value = 0;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int i) {
            this.value = i;
        }

        public ShowFields(int i) {
            this.value = i;
        }
    }

    public PoiSearchV2(Context context, Query query) throws AMapException {
        this.f6618a = null;
        try {
            this.f6618a = new r0(context, query);
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
        IPoiSearchV2 iPoiSearchV2 = this.f6618a;
        if (iPoiSearchV2 != null) {
            return iPoiSearchV2.getBound();
        }
        return null;
    }

    public Query getQuery() {
        IPoiSearchV2 iPoiSearchV2 = this.f6618a;
        if (iPoiSearchV2 != null) {
            return iPoiSearchV2.getQuery();
        }
        return null;
    }

    public PoiResultV2 searchPOI() throws AMapException {
        IPoiSearchV2 iPoiSearchV2 = this.f6618a;
        if (iPoiSearchV2 != null) {
            return iPoiSearchV2.searchPOI();
        }
        return null;
    }

    public void searchPOIAsyn() {
        IPoiSearchV2 iPoiSearchV2 = this.f6618a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.searchPOIAsyn();
        }
    }

    public PoiItemV2 searchPOIId(String str) throws AMapException {
        IPoiSearchV2 iPoiSearchV2 = this.f6618a;
        if (iPoiSearchV2 != null) {
            return iPoiSearchV2.searchPOIId(str);
        }
        return null;
    }

    public void searchPOIIdAsyn(String str) {
        IPoiSearchV2 iPoiSearchV2 = this.f6618a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.searchPOIIdAsyn(str);
        }
    }

    public void setBound(SearchBound searchBound) {
        IPoiSearchV2 iPoiSearchV2 = this.f6618a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.setBound(searchBound);
        }
    }

    public void setOnPoiSearchListener(OnPoiSearchListener onPoiSearchListener) {
        IPoiSearchV2 iPoiSearchV2 = this.f6618a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.setOnPoiSearchListener(onPoiSearchListener);
        }
    }

    public void setQuery(Query query) {
        IPoiSearchV2 iPoiSearchV2 = this.f6618a;
        if (iPoiSearchV2 != null) {
            iPoiSearchV2.setQuery(query);
        }
    }
}
