package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DistanceResult implements Parcelable {
    public static final Parcelable.Creator<DistanceResult> CREATOR = new Parcelable.Creator<DistanceResult>() { // from class: com.amap.api.services.route.DistanceResult.1
        private static DistanceResult a(Parcel parcel) {
            return new DistanceResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceResult[] newArray(int i) {
            return a(i);
        }

        private static DistanceResult[] a(int i) {
            return new DistanceResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DistanceSearch.DistanceQuery f6653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DistanceItem> f6654b;

    public DistanceResult() {
        this.f6654b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DistanceSearch.DistanceQuery getDistanceQuery() {
        return this.f6653a;
    }

    public List<DistanceItem> getDistanceResults() {
        return this.f6654b;
    }

    public void setDistanceQuery(DistanceSearch.DistanceQuery distanceQuery) {
        this.f6653a = distanceQuery;
    }

    public void setDistanceResults(List<DistanceItem> list) {
        this.f6654b = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f6654b);
    }

    public DistanceResult(Parcel parcel) {
        this.f6654b = null;
        this.f6654b = parcel.createTypedArrayList(DistanceItem.CREATOR);
    }
}
