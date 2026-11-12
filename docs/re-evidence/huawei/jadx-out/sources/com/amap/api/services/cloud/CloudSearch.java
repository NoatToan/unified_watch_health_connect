package com.amap.api.services.cloud;

import android.content.Context;
import com.amap.api.col.p0003sl.fu;
import com.amap.api.col.p0003sl.go;
import com.amap.api.col.p0003sl.hp;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.ICloudSearch;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CloudSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ICloudSearch f3525a;

    public interface OnCloudSearchListener {
        void onCloudItemDetailSearched(CloudItemDetail cloudItemDetail, int i);

        void onCloudSearched(CloudResult cloudResult, int i);
    }

    public CloudSearch(Context context) throws AMapException {
        if (this.f3525a == null) {
            try {
                this.f3525a = new hp(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public void setOnCloudSearchListener(OnCloudSearchListener onCloudSearchListener) {
        ICloudSearch iCloudSearch = this.f3525a;
        if (iCloudSearch != null) {
            iCloudSearch.setOnCloudSearchListener(onCloudSearchListener);
        }
    }

    public void searchCloudAsyn(Query query) {
        ICloudSearch iCloudSearch = this.f3525a;
        if (iCloudSearch != null) {
            iCloudSearch.searchCloudAsyn(query);
        }
    }

    public void searchCloudDetailAsyn(String str, String str2) {
        ICloudSearch iCloudSearch = this.f3525a;
        if (iCloudSearch != null) {
            iCloudSearch.searchCloudDetailAsyn(str, str2);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Query implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3526a;
        private String d;
        private SearchBound e;
        private Sortingrules f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3527b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3528c = 20;
        private ArrayList<go> g = new ArrayList<>();
        private List<String> h = new ArrayList();

        public Query(String str, String str2, SearchBound searchBound) throws AMapException {
            if (fu.a(str) || searchBound == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            this.d = str;
            this.f3526a = str2;
            this.e = searchBound;
        }

        private Query() {
        }

        public String getQueryString() {
            return this.f3526a;
        }

        public void setTableID(String str) {
            this.d = str;
        }

        public String getTableID() {
            return this.d;
        }

        public int getPageNum() {
            return this.f3527b;
        }

        public void setPageNum(int i) {
            this.f3527b = i;
        }

        public void setPageSize(int i) {
            if (i <= 0) {
                this.f3528c = 20;
            } else if (i > 100) {
                this.f3528c = 100;
            } else {
                this.f3528c = i;
            }
        }

        public int getPageSize() {
            return this.f3528c;
        }

        public void setBound(SearchBound searchBound) {
            this.e = searchBound;
        }

        public SearchBound getBound() {
            return this.e;
        }

        public void addFilterString(String str, String str2) {
            if (str == null || str2 == null) {
                return;
            }
            this.h.add(str + str2);
        }

        public String getFilterString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                int size = this.h.size();
                for (int i = 0; i < size; i++) {
                    stringBuffer.append(this.h.get(i));
                    if (i != size - 1) {
                        stringBuffer.append(Constants.PARAM_SERVER_SPLIT);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return stringBuffer.toString();
        }

        public void addFilterNum(String str, String str2, String str3) {
            this.g.add(new go(str, str2, str3));
        }

        private ArrayList<go> a() {
            if (this.g == null) {
                return null;
            }
            ArrayList<go> arrayList = new ArrayList<>();
            arrayList.addAll(this.g);
            return arrayList;
        }

        private ArrayList<String> b() {
            if (this.h == null) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.addAll(this.h);
            return arrayList;
        }

        public String getFilterNumString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                int size = this.g.size();
                for (int i = 0; i < size; i++) {
                    go goVar = this.g.get(i);
                    stringBuffer.append(goVar.a()).append(HiDataFilter.DataFilterExpression.BIGGER_EQUAL).append(goVar.b()).append(Constants.PARAM_SERVER_SPLIT).append(goVar.a()).append(HiDataFilter.DataFilterExpression.LESS_EQUAL).append(goVar.c());
                    if (i != size - 1) {
                        stringBuffer.append(Constants.PARAM_SERVER_SPLIT);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return stringBuffer.toString();
        }

        public void setSortingrules(Sortingrules sortingrules) {
            this.f = sortingrules;
        }

        public Sortingrules getSortingrules() {
            return this.f;
        }

        private static boolean a(SearchBound searchBound, SearchBound searchBound2) {
            if (searchBound == null && searchBound2 == null) {
                return true;
            }
            if (searchBound == null || searchBound2 == null) {
                return false;
            }
            return searchBound.equals(searchBound2);
        }

        private static boolean a(Sortingrules sortingrules, Sortingrules sortingrules2) {
            if (sortingrules == null && sortingrules2 == null) {
                return true;
            }
            if (sortingrules == null || sortingrules2 == null) {
                return false;
            }
            return sortingrules.equals(sortingrules2);
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            return CloudSearch.b(query.f3526a, this.f3526a) && CloudSearch.b(query.getTableID(), getTableID()) && CloudSearch.b(query.getFilterString(), getFilterString()) && CloudSearch.b(query.getFilterNumString(), getFilterNumString()) && query.f3528c == this.f3528c && a(query.getBound(), getBound()) && a(query.getSortingrules(), getSortingrules());
        }

        public int hashCode() {
            ArrayList<go> arrayList = this.g;
            int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
            List<String> list = this.h;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            SearchBound searchBound = this.e;
            int iHashCode3 = searchBound == null ? 0 : searchBound.hashCode();
            int i = this.f3527b;
            int i2 = this.f3528c;
            String str = this.f3526a;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            Sortingrules sortingrules = this.f;
            int iHashCode5 = sortingrules == null ? 0 : sortingrules.hashCode();
            String str2 = this.d;
            return ((((((((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + i2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Query)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            Query query = (Query) obj;
            return queryEquals(query) && query.f3527b == this.f3527b;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Query m767clone() {
            AMapException e;
            Query query;
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                e2.printStackTrace();
            }
            try {
                query = new Query(this.d, this.f3526a, this.e);
                try {
                    query.setPageNum(this.f3527b);
                    query.setPageSize(this.f3528c);
                    query.setSortingrules(getSortingrules());
                    query.g = a();
                    query.h = b();
                } catch (AMapException e3) {
                    e = e3;
                    e.printStackTrace();
                }
            } catch (AMapException e4) {
                e = e4;
                query = null;
            }
            return query == null ? new Query() : query;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Sortingrules {
        public static final int DISTANCE = 1;
        public static final int WEIGHT = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3534c;

        public Sortingrules(String str, boolean z) {
            this.f3532a = 0;
            this.f3533b = str;
            this.f3534c = z;
        }

        public Sortingrules(int i) {
            this.f3534c = true;
            this.f3532a = i;
        }

        public String toString() {
            if (fu.a(this.f3533b)) {
                int i = this.f3532a;
                if (i == 0) {
                    return "_weight:desc";
                }
                if (i == 1) {
                    return "_distance:asc";
                }
                return "";
            }
            if (this.f3534c) {
                return this.f3533b + ":asc";
            }
            return this.f3533b + ":desc";
        }

        public int hashCode() {
            int i = this.f3534c ? 1231 : 1237;
            String str = this.f3533b;
            return ((((i + 31) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f3532a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Sortingrules sortingrules = (Sortingrules) obj;
            if (this.f3534c != sortingrules.f3534c) {
                return false;
            }
            String str = this.f3533b;
            if (str == null) {
                if (sortingrules.f3533b != null) {
                    return false;
                }
            } else if (!str.equals(sortingrules.f3533b)) {
                return false;
            }
            return this.f3532a == sortingrules.f3532a;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class SearchBound implements Cloneable {
        public static final String BOUND_SHAPE = "Bound";
        public static final String LOCAL_SHAPE = "Local";
        public static final String POLYGON_SHAPE = "Polygon";
        public static final String RECTANGLE_SHAPE = "Rectangle";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLonPoint f3529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLonPoint f3530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3531c;
        private LatLonPoint d;
        private String e;
        private List<LatLonPoint> f;
        private String g;

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.e = "Bound";
            this.f3531c = i;
            this.d = latLonPoint;
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.e = "Rectangle";
            if (a(latLonPoint, latLonPoint2)) {
                return;
            }
            new IllegalArgumentException("invalid rect ").printStackTrace();
        }

        public SearchBound(List<LatLonPoint> list) {
            this.e = "Polygon";
            this.f = list;
        }

        public SearchBound(String str) {
            this.e = LOCAL_SHAPE;
            this.g = str;
        }

        private boolean a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f3529a = latLonPoint;
            this.f3530b = latLonPoint2;
            return latLonPoint != null && latLonPoint2 != null && latLonPoint.getLatitude() < this.f3530b.getLatitude() && this.f3529a.getLongitude() < this.f3530b.getLongitude();
        }

        public LatLonPoint getLowerLeft() {
            return this.f3529a;
        }

        public LatLonPoint getUpperRight() {
            return this.f3530b;
        }

        public LatLonPoint getCenter() {
            return this.d;
        }

        public int getRange() {
            return this.f3531c;
        }

        public String getShape() {
            return this.e;
        }

        public String getCity() {
            return this.g;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.f;
        }

        private static boolean a(List<LatLonPoint> list, List<LatLonPoint> list2) {
            if (list == null && list2 == null) {
                return true;
            }
            if (list == null || list2 == null || list.size() != list2.size()) {
                return false;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!list.get(i).equals(list2.get(i))) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            LatLonPoint latLonPoint = this.d;
            int iHashCode = latLonPoint == null ? 0 : latLonPoint.hashCode();
            LatLonPoint latLonPoint2 = this.f3529a;
            int iHashCode2 = latLonPoint2 == null ? 0 : latLonPoint2.hashCode();
            LatLonPoint latLonPoint3 = this.f3530b;
            int iHashCode3 = latLonPoint3 == null ? 0 : latLonPoint3.hashCode();
            List<LatLonPoint> list = this.f;
            int iHashCode4 = list == null ? 0 : list.hashCode();
            int i = this.f3531c;
            String str = this.e;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            String str2 = this.g;
            return ((((((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof SearchBound)) {
                SearchBound searchBound = (SearchBound) obj;
                if (!getShape().equalsIgnoreCase(searchBound.getShape())) {
                    return false;
                }
                if (getShape().equals("Bound")) {
                    return searchBound.d.equals(this.d) && searchBound.f3531c == this.f3531c;
                }
                if (getShape().equals("Polygon")) {
                    return a(searchBound.f, this.f);
                }
                if (getShape().equals(LOCAL_SHAPE)) {
                    return searchBound.g.equals(this.g);
                }
                if (searchBound.f3529a.equals(this.f3529a) && searchBound.f3530b.equals(this.f3530b)) {
                    return true;
                }
            }
            return false;
        }

        private List<LatLonPoint> a() {
            if (this.f == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (LatLonPoint latLonPoint : this.f) {
                arrayList.add(new LatLonPoint(latLonPoint.getLatitude(), latLonPoint.getLongitude()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public SearchBound m768clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            if (getShape().equals("Bound")) {
                return new SearchBound(this.d, this.f3531c);
            }
            if (getShape().equals("Polygon")) {
                return new SearchBound(a());
            }
            if (getShape().equals(LOCAL_SHAPE)) {
                return new SearchBound(this.g);
            }
            return new SearchBound(this.f3529a, this.f3530b);
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
