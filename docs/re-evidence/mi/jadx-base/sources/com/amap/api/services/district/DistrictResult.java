package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.AMapException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class DistrictResult implements Parcelable {
    public Parcelable.Creator<DistrictResult> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DistrictSearchQuery f6549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<DistrictItem> f6550b;
    private int c;
    private AMapException d;

    public DistrictResult(DistrictSearchQuery districtSearchQuery, ArrayList<DistrictItem> arrayList) {
        this.f6550b = new ArrayList<>();
        this.CREATOR = new Parcelable.Creator<DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            private static DistrictResult a(Parcel parcel) {
                return new DistrictResult(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult[] newArray(int i) {
                return a(i);
            }

            private static DistrictResult[] a(int i) {
                return new DistrictResult[i];
            }
        };
        this.f6549a = districtSearchQuery;
        this.f6550b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DistrictResult.class != obj.getClass()) {
            return false;
        }
        DistrictResult districtResult = (DistrictResult) obj;
        DistrictSearchQuery districtSearchQuery = this.f6549a;
        if (districtSearchQuery == null) {
            if (districtResult.f6549a != null) {
                return false;
            }
        } else if (!districtSearchQuery.equals(districtResult.f6549a)) {
            return false;
        }
        ArrayList<DistrictItem> arrayList = this.f6550b;
        if (arrayList == null) {
            if (districtResult.f6550b != null) {
                return false;
            }
        } else if (!arrayList.equals(districtResult.f6550b)) {
            return false;
        }
        return true;
    }

    public final AMapException getAMapException() {
        return this.d;
    }

    public final ArrayList<DistrictItem> getDistrict() {
        return this.f6550b;
    }

    public final int getPageCount() {
        return this.c;
    }

    public final DistrictSearchQuery getQuery() {
        return this.f6549a;
    }

    public final int hashCode() {
        DistrictSearchQuery districtSearchQuery = this.f6549a;
        int iHashCode = ((districtSearchQuery == null ? 0 : districtSearchQuery.hashCode()) + 31) * 31;
        ArrayList<DistrictItem> arrayList = this.f6550b;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setAMapException(AMapException aMapException) {
        this.d = aMapException;
    }

    public final void setDistrict(ArrayList<DistrictItem> arrayList) {
        this.f6550b = arrayList;
    }

    public final void setPageCount(int i) {
        this.c = i;
    }

    public final void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.f6549a = districtSearchQuery;
    }

    public final String toString() {
        return "DistrictResult [mDisQuery=" + this.f6549a + ", mDistricts=" + this.f6550b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6549a, i);
        parcel.writeTypedList(this.f6550b);
    }

    public DistrictResult() {
        this.f6550b = new ArrayList<>();
        this.CREATOR = new Parcelable.Creator<DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            private static DistrictResult a(Parcel parcel) {
                return new DistrictResult(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult[] newArray(int i) {
                return a(i);
            }

            private static DistrictResult[] a(int i) {
                return new DistrictResult[i];
            }
        };
    }

    public DistrictResult(Parcel parcel) {
        this.f6550b = new ArrayList<>();
        this.CREATOR = new Parcelable.Creator<DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            private static DistrictResult a(Parcel parcel2) {
                return new DistrictResult(parcel2);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult createFromParcel(Parcel parcel2) {
                return a(parcel2);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult[] newArray(int i) {
                return a(i);
            }

            private static DistrictResult[] a(int i) {
                return new DistrictResult[i];
            }
        };
        this.f6549a = (DistrictSearchQuery) parcel.readParcelable(DistrictSearchQuery.class.getClassLoader());
        this.f6550b = parcel.createTypedArrayList(DistrictItem.CREATOR);
    }
}
