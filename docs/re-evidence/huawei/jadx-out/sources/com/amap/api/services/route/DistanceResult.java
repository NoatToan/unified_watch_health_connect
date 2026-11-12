package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DistanceResult implements Parcelable {
    public static final Parcelable.Creator<DistanceResult> CREATOR = new Parcelable.Creator<DistanceResult>() { // from class: com.amap.api.services.route.DistanceResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceResult createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceResult[] newArray(int i) {
            return a(i);
        }

        private static DistanceResult a(Parcel parcel) {
            return new DistanceResult(parcel);
        }

        private static DistanceResult[] a(int i) {
            return new DistanceResult[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DistanceSearch.DistanceQuery f3691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DistanceItem> f3692b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DistanceResult() {
        this.f3692b = null;
    }

    protected DistanceResult(Parcel parcel) {
        this.f3692b = null;
        this.f3692b = parcel.createTypedArrayList(DistanceItem.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3692b);
    }

    public void setDistanceQuery(DistanceSearch.DistanceQuery distanceQuery) {
        this.f3691a = distanceQuery;
    }

    public DistanceSearch.DistanceQuery getDistanceQuery() {
        return this.f3691a;
    }

    public List<DistanceItem> getDistanceResults() {
        return this.f3692b;
    }

    public void setDistanceResults(List<DistanceItem> list) {
        this.f3692b = list;
    }
}
