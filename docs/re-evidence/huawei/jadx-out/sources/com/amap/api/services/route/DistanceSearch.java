package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.fu;
import com.amap.api.col.p0003sl.hq;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IDistanceSearch;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DistanceSearch {
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";
    public static final int TYPE_DISTANCE = 0;
    public static final int TYPE_DRIVING_DISTANCE = 1;
    public static final int TYPE_WALK_DISTANCE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IDistanceSearch f3693a;

    public interface OnDistanceSearchListener {
        void onDistanceSearched(DistanceResult distanceResult, int i);
    }

    public DistanceSearch(Context context) throws AMapException {
        if (this.f3693a == null) {
            try {
                this.f3693a = new hq(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public void setDistanceSearchListener(OnDistanceSearchListener onDistanceSearchListener) {
        IDistanceSearch iDistanceSearch = this.f3693a;
        if (iDistanceSearch != null) {
            iDistanceSearch.setDistanceSearchListener(onDistanceSearchListener);
        }
    }

    public DistanceResult calculateRouteDistance(DistanceQuery distanceQuery) throws AMapException {
        IDistanceSearch iDistanceSearch = this.f3693a;
        if (iDistanceSearch != null) {
            return iDistanceSearch.calculateRouteDistance(distanceQuery);
        }
        return null;
    }

    public void calculateRouteDistanceAsyn(DistanceQuery distanceQuery) {
        IDistanceSearch iDistanceSearch = this.f3693a;
        if (iDistanceSearch != null) {
            iDistanceSearch.calculateRouteDistanceAsyn(distanceQuery);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class DistanceQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DistanceQuery> CREATOR = new Parcelable.Creator<DistanceQuery>() { // from class: com.amap.api.services.route.DistanceSearch.DistanceQuery.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistanceQuery createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistanceQuery[] newArray(int i) {
                return a(i);
            }

            private static DistanceQuery a(Parcel parcel) {
                return new DistanceQuery(parcel);
            }

            private static DistanceQuery[] a(int i) {
                return new DistanceQuery[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<LatLonPoint> f3695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LatLonPoint f3696c;
        private String d;
        private int e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public DistanceQuery() {
            this.f3694a = 1;
            this.f3695b = new ArrayList();
            this.d = "base";
            this.e = 4;
        }

        protected DistanceQuery(Parcel parcel) {
            this.f3694a = 1;
            this.f3695b = new ArrayList();
            this.d = "base";
            this.e = 4;
            this.f3694a = parcel.readInt();
            this.f3695b = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            this.f3696c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readInt();
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public DistanceQuery m774clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                fu.a(e, "DistanceSearch", "DistanceQueryclone");
            }
            DistanceQuery distanceQuery = new DistanceQuery();
            distanceQuery.setType(this.f3694a);
            distanceQuery.setOrigins(this.f3695b);
            distanceQuery.setDestination(this.f3696c);
            distanceQuery.setExtensions(this.d);
            distanceQuery.setMode(this.e);
            return distanceQuery;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3694a);
            parcel.writeTypedList(this.f3695b);
            parcel.writeParcelable(this.f3696c, i);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }

        public int getType() {
            return this.f3694a;
        }

        public List<LatLonPoint> getOrigins() {
            return this.f3695b;
        }

        public LatLonPoint getDestination() {
            return this.f3696c;
        }

        public void setType(int i) {
            this.f3694a = i;
        }

        public void setOrigins(List<LatLonPoint> list) {
            if (list != null) {
                this.f3695b = list;
            }
        }

        public void addOrigins(LatLonPoint... latLonPointArr) {
            for (LatLonPoint latLonPoint : latLonPointArr) {
                if (latLonPoint != null) {
                    this.f3695b.add(latLonPoint);
                }
            }
        }

        public void setDestination(LatLonPoint latLonPoint) {
            this.f3696c = latLonPoint;
        }

        public String getExtensions() {
            return this.d;
        }

        public void setExtensions(String str) {
            this.d = str;
        }

        public int getMode() {
            return this.e;
        }

        public void setMode(int i) {
            this.e = i;
        }
    }
}
