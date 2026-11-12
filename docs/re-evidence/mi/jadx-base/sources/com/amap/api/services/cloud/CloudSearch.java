package com.amap.api.services.cloud;

import android.content.Context;
import com.amap.api.col.p0003sl.k0;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.ICloudSearch;
import defpackage.cws;
import defpackage.xts;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CloudSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ICloudSearch f6524a;

    public interface OnCloudSearchListener {
        void onCloudItemDetailSearched(CloudItemDetail cloudItemDetail, int i);

        void onCloudSearched(CloudResult cloudResult, int i);
    }

    public static class Query implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6525a;
        private String d;
        private SearchBound e;
        private Sortingrules f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6526b = 1;
        private int c = 20;
        private ArrayList<cws> g = new ArrayList<>();
        private List<String> h = new ArrayList();

        public Query(String str, String str2, SearchBound searchBound) throws AMapException {
            if (xts.j(str) || searchBound == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            this.d = str;
            this.f6525a = str2;
            this.e = searchBound;
        }

        private ArrayList<cws> a() {
            if (this.g == null) {
                return null;
            }
            ArrayList<cws> arrayList = new ArrayList<>();
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

        public void addFilterNum(String str, String str2, String str3) {
            this.g.add(new cws(str, str2, str3));
        }

        public void addFilterString(String str, String str2) {
            if (str == null || str2 == null) {
                return;
            }
            this.h.add(str + str2);
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof Query)) {
                if (obj == this) {
                    return true;
                }
                Query query = (Query) obj;
                if (queryEquals(query) && query.f6526b == this.f6526b) {
                    return true;
                }
            }
            return false;
        }

        public SearchBound getBound() {
            return this.e;
        }

        public String getFilterNumString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                int size = this.g.size();
                for (int i = 0; i < size; i++) {
                    cws cwsVar = this.g.get(i);
                    stringBuffer.append(cwsVar.a());
                    stringBuffer.append(">=");
                    stringBuffer.append(cwsVar.b());
                    stringBuffer.append("&&");
                    stringBuffer.append(cwsVar.a());
                    stringBuffer.append("<=");
                    stringBuffer.append(cwsVar.c());
                    if (i != size - 1) {
                        stringBuffer.append("&&");
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return stringBuffer.toString();
        }

        public String getFilterString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                int size = this.h.size();
                for (int i = 0; i < size; i++) {
                    stringBuffer.append(this.h.get(i));
                    if (i != size - 1) {
                        stringBuffer.append("&&");
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return stringBuffer.toString();
        }

        public int getPageNum() {
            return this.f6526b;
        }

        public int getPageSize() {
            return this.c;
        }

        public String getQueryString() {
            return this.f6525a;
        }

        public Sortingrules getSortingrules() {
            return this.f;
        }

        public String getTableID() {
            return this.d;
        }

        public int hashCode() {
            ArrayList<cws> arrayList = this.g;
            int iHashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
            List<String> list = this.h;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            SearchBound searchBound = this.e;
            int iHashCode3 = (((((iHashCode2 + (searchBound == null ? 0 : searchBound.hashCode())) * 31) + this.f6526b) * 31) + this.c) * 31;
            String str = this.f6525a;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Sortingrules sortingrules = this.f;
            int iHashCode5 = (iHashCode4 + (sortingrules == null ? 0 : sortingrules.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            return CloudSearch.b(query.f6525a, this.f6525a) && CloudSearch.b(query.getTableID(), getTableID()) && CloudSearch.b(query.getFilterString(), getFilterString()) && CloudSearch.b(query.getFilterNumString(), getFilterNumString()) && query.c == this.c && a(query.getBound(), getBound()) && a(query.getSortingrules(), getSortingrules());
        }

        public void setBound(SearchBound searchBound) {
            this.e = searchBound;
        }

        public void setPageNum(int i) {
            this.f6526b = i;
        }

        public void setPageSize(int i) {
            if (i <= 0) {
                this.c = 20;
            } else if (i > 100) {
                this.c = 100;
            } else {
                this.c = i;
            }
        }

        public void setSortingrules(Sortingrules sortingrules) {
            this.f = sortingrules;
        }

        public void setTableID(String str) {
            this.d = str;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Query m96clone() {
            Query query;
            AMapException e;
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                e2.printStackTrace();
            }
            try {
                query = new Query(this.d, this.f6525a, this.e);
                try {
                    query.setPageNum(this.f6526b);
                    query.setPageSize(this.c);
                    query.setSortingrules(getSortingrules());
                    query.g = a();
                    query.h = b();
                } catch (AMapException e3) {
                    e = e3;
                    e.printStackTrace();
                }
            } catch (AMapException e4) {
                query = null;
                e = e4;
            }
            return query == null ? new Query() : query;
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

        private Query() {
        }
    }

    public static class SearchBound implements Cloneable {
        public static final String BOUND_SHAPE = "Bound";
        public static final String LOCAL_SHAPE = "Local";
        public static final String POLYGON_SHAPE = "Polygon";
        public static final String RECTANGLE_SHAPE = "Rectangle";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLonPoint f6527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLonPoint f6528b;
        private int c;
        private LatLonPoint d;
        private String e;
        private List<LatLonPoint> f;
        private String g;

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.e = "Bound";
            this.c = i;
            this.d = latLonPoint;
        }

        private boolean a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f6527a = latLonPoint;
            this.f6528b = latLonPoint2;
            return latLonPoint != null && latLonPoint2 != null && latLonPoint.getLatitude() < this.f6528b.getLatitude() && this.f6527a.getLongitude() < this.f6528b.getLongitude();
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof SearchBound)) {
                SearchBound searchBound = (SearchBound) obj;
                if (!getShape().equalsIgnoreCase(searchBound.getShape())) {
                    return false;
                }
                if (getShape().equals("Bound")) {
                    return searchBound.d.equals(this.d) && searchBound.c == this.c;
                }
                if (getShape().equals("Polygon")) {
                    return a(searchBound.f, this.f);
                }
                if (getShape().equals(LOCAL_SHAPE)) {
                    return searchBound.g.equals(this.g);
                }
                if (searchBound.f6527a.equals(this.f6527a) && searchBound.f6528b.equals(this.f6528b)) {
                    return true;
                }
            }
            return false;
        }

        public LatLonPoint getCenter() {
            return this.d;
        }

        public String getCity() {
            return this.g;
        }

        public LatLonPoint getLowerLeft() {
            return this.f6527a;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.f;
        }

        public int getRange() {
            return this.c;
        }

        public String getShape() {
            return this.e;
        }

        public LatLonPoint getUpperRight() {
            return this.f6528b;
        }

        public int hashCode() {
            LatLonPoint latLonPoint = this.d;
            int iHashCode = ((latLonPoint == null ? 0 : latLonPoint.hashCode()) + 31) * 31;
            LatLonPoint latLonPoint2 = this.f6527a;
            int iHashCode2 = (iHashCode + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
            LatLonPoint latLonPoint3 = this.f6528b;
            int iHashCode3 = (iHashCode2 + (latLonPoint3 == null ? 0 : latLonPoint3.hashCode())) * 31;
            List<LatLonPoint> list = this.f;
            int iHashCode4 = (((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.c) * 31;
            String str = this.e;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public SearchBound m97clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            if (getShape().equals("Bound")) {
                return new SearchBound(this.d, this.c);
            }
            if (getShape().equals("Polygon")) {
                return new SearchBound(a());
            }
            return getShape().equals(LOCAL_SHAPE) ? new SearchBound(this.g) : new SearchBound(this.f6527a, this.f6528b);
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.e = "Rectangle";
            if (a(latLonPoint, latLonPoint2)) {
                return;
            }
            new IllegalArgumentException("invalid rect ").printStackTrace();
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

        public SearchBound(List<LatLonPoint> list) {
            this.e = "Polygon";
            this.f = list;
        }

        public SearchBound(String str) {
            this.e = LOCAL_SHAPE;
            this.g = str;
        }
    }

    public CloudSearch(Context context) throws AMapException {
        if (this.f6524a == null) {
            try {
                this.f6524a = new k0(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
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

    public void searchCloudAsyn(Query query) {
        ICloudSearch iCloudSearch = this.f6524a;
        if (iCloudSearch != null) {
            iCloudSearch.searchCloudAsyn(query);
        }
    }

    public void searchCloudDetailAsyn(String str, String str2) {
        ICloudSearch iCloudSearch = this.f6524a;
        if (iCloudSearch != null) {
            iCloudSearch.searchCloudDetailAsyn(str, str2);
        }
    }

    public void setOnCloudSearchListener(OnCloudSearchListener onCloudSearchListener) {
        ICloudSearch iCloudSearch = this.f6524a;
        if (iCloudSearch != null) {
            iCloudSearch.setOnCloudSearchListener(onCloudSearchListener);
        }
    }

    public static class Sortingrules {
        public static final int DISTANCE = 1;
        public static final int WEIGHT = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6530b;
        private boolean c;

        public Sortingrules(String str, boolean z) {
            this.f6529a = 0;
            this.f6530b = str;
            this.c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Sortingrules sortingrules = (Sortingrules) obj;
            if (this.c != sortingrules.c) {
                return false;
            }
            String str = this.f6530b;
            if (str == null) {
                if (sortingrules.f6530b != null) {
                    return false;
                }
            } else if (!str.equals(sortingrules.f6530b)) {
                return false;
            }
            return this.f6529a == sortingrules.f6529a;
        }

        public int hashCode() {
            int i = ((this.c ? 1231 : 1237) + 31) * 31;
            String str = this.f6530b;
            return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.f6529a;
        }

        public String toString() {
            if (xts.j(this.f6530b)) {
                int i = this.f6529a;
                if (i == 0) {
                    return "_weight:desc";
                }
                return i == 1 ? "_distance:asc" : "";
            }
            if (this.c) {
                return this.f6530b + ":asc";
            }
            return this.f6530b + ":desc";
        }

        public Sortingrules(int i) {
            this.c = true;
            this.f6529a = i;
        }
    }
}
