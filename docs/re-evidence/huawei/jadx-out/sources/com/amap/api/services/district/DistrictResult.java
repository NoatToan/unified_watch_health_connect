package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.AMapException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class DistrictResult implements Parcelable {
    public Parcelable.Creator<DistrictResult> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DistrictSearchQuery f3556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<DistrictItem> f3557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3558c;
    private AMapException d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DistrictResult(DistrictSearchQuery districtSearchQuery, ArrayList<DistrictItem> arrayList) {
        this.f3557b = new ArrayList<>();
        this.CREATOR = new Parcelable.Creator<DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult[] newArray(int i) {
                return a(i);
            }

            private static DistrictResult a(Parcel parcel) {
                return new DistrictResult(parcel);
            }

            private static DistrictResult[] a(int i) {
                return new DistrictResult[i];
            }
        };
        this.f3556a = districtSearchQuery;
        this.f3557b = arrayList;
    }

    public DistrictResult() {
        this.f3557b = new ArrayList<>();
        this.CREATOR = new Parcelable.Creator<DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult[] newArray(int i) {
                return a(i);
            }

            private static DistrictResult a(Parcel parcel) {
                return new DistrictResult(parcel);
            }

            private static DistrictResult[] a(int i) {
                return new DistrictResult[i];
            }
        };
    }

    public final ArrayList<DistrictItem> getDistrict() {
        return this.f3557b;
    }

    public final void setDistrict(ArrayList<DistrictItem> arrayList) {
        this.f3557b = arrayList;
    }

    public final DistrictSearchQuery getQuery() {
        return this.f3556a;
    }

    public final void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.f3556a = districtSearchQuery;
    }

    public final int getPageCount() {
        return this.f3558c;
    }

    public final void setPageCount(int i) {
        this.f3558c = i;
    }

    public final AMapException getAMapException() {
        return this.d;
    }

    public final void setAMapException(AMapException aMapException) {
        this.d = aMapException;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3556a, i);
        parcel.writeTypedList(this.f3557b);
    }

    protected DistrictResult(Parcel parcel) {
        this.f3557b = new ArrayList<>();
        this.CREATOR = new Parcelable.Creator<DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult createFromParcel(Parcel parcel2) {
                return a(parcel2);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DistrictResult[] newArray(int i) {
                return a(i);
            }

            private static DistrictResult a(Parcel parcel2) {
                return new DistrictResult(parcel2);
            }

            private static DistrictResult[] a(int i) {
                return new DistrictResult[i];
            }
        };
        this.f3556a = (DistrictSearchQuery) parcel.readParcelable(DistrictSearchQuery.class.getClassLoader());
        this.f3557b = parcel.createTypedArrayList(DistrictItem.CREATOR);
    }

    public final int hashCode() {
        DistrictSearchQuery districtSearchQuery = this.f3556a;
        int iHashCode = districtSearchQuery == null ? 0 : districtSearchQuery.hashCode();
        ArrayList<DistrictItem> arrayList = this.f3557b;
        return ((iHashCode + 31) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictResult districtResult = (DistrictResult) obj;
        DistrictSearchQuery districtSearchQuery = this.f3556a;
        if (districtSearchQuery == null) {
            if (districtResult.f3556a != null) {
                return false;
            }
        } else if (!districtSearchQuery.equals(districtResult.f3556a)) {
            return false;
        }
        ArrayList<DistrictItem> arrayList = this.f3557b;
        if (arrayList == null) {
            if (districtResult.f3557b != null) {
                return false;
            }
        } else if (!arrayList.equals(districtResult.f3557b)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "DistrictResult [mDisQuery=" + this.f3556a + ", mDistricts=" + this.f3557b + "]";
    }
}
