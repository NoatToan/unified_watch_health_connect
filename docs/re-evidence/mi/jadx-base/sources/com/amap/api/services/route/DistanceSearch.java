package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.l0;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IDistanceSearch;
import defpackage.xts;
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
    private IDistanceSearch f6655a;

    public static class DistanceQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DistanceQuery> CREATOR = new Parcelable.Creator<DistanceQuery>() { // from class: com.amap.api.services.route.DistanceSearch.DistanceQuery.1
            private static DistanceQuery a(Parcel parcel) {
                return new DistanceQuery(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistanceQuery createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistanceQuery[] newArray(int i) {
                return a(i);
            }

            private static DistanceQuery[] a(int i) {
                return new DistanceQuery[i];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<LatLonPoint> f6657b;
        private LatLonPoint c;
        private String d;
        private int e;

        public DistanceQuery() {
            this.f6656a = 1;
            this.f6657b = new ArrayList();
            this.d = "base";
            this.e = 4;
        }

        public void addOrigins(LatLonPoint... latLonPointArr) {
            for (LatLonPoint latLonPoint : latLonPointArr) {
                if (latLonPoint != null) {
                    this.f6657b.add(latLonPoint);
                }
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public LatLonPoint getDestination() {
            return this.c;
        }

        public String getExtensions() {
            return this.d;
        }

        public int getMode() {
            return this.e;
        }

        public List<LatLonPoint> getOrigins() {
            return this.f6657b;
        }

        public int getType() {
            return this.f6656a;
        }

        public void setDestination(LatLonPoint latLonPoint) {
            this.c = latLonPoint;
        }

        public void setExtensions(String str) {
            this.d = str;
        }

        public void setMode(int i) {
            this.e = i;
        }

        public void setOrigins(List<LatLonPoint> list) {
            if (list != null) {
                this.f6657b = list;
            }
        }

        public void setType(int i) {
            this.f6656a = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6656a);
            parcel.writeTypedList(this.f6657b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public DistanceQuery m103clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                xts.i(e, "DistanceSearch", "DistanceQueryclone");
            }
            DistanceQuery distanceQuery = new DistanceQuery();
            distanceQuery.setType(this.f6656a);
            distanceQuery.setOrigins(this.f6657b);
            distanceQuery.setDestination(this.c);
            distanceQuery.setExtensions(this.d);
            distanceQuery.setMode(this.e);
            return distanceQuery;
        }

        public DistanceQuery(Parcel parcel) {
            this.f6656a = 1;
            this.f6657b = new ArrayList();
            this.d = "base";
            this.e = 4;
            this.f6656a = parcel.readInt();
            this.f6657b = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            this.c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readInt();
        }
    }

    public interface OnDistanceSearchListener {
        void onDistanceSearched(DistanceResult distanceResult, int i);
    }

    public DistanceSearch(Context context) throws AMapException {
        if (this.f6655a == null) {
            try {
                this.f6655a = new l0(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public DistanceResult calculateRouteDistance(DistanceQuery distanceQuery) throws AMapException {
        IDistanceSearch iDistanceSearch = this.f6655a;
        if (iDistanceSearch != null) {
            return iDistanceSearch.calculateRouteDistance(distanceQuery);
        }
        return null;
    }

    public void calculateRouteDistanceAsyn(DistanceQuery distanceQuery) {
        IDistanceSearch iDistanceSearch = this.f6655a;
        if (iDistanceSearch != null) {
            iDistanceSearch.calculateRouteDistanceAsyn(distanceQuery);
        }
    }

    public void setDistanceSearchListener(OnDistanceSearchListener onDistanceSearchListener) {
        IDistanceSearch iDistanceSearch = this.f6655a;
        if (iDistanceSearch != null) {
            iDistanceSearch.setDistanceSearchListener(onDistanceSearchListener);
        }
    }
}
