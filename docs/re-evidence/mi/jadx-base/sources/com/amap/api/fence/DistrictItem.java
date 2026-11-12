package com.amap.api.fence;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.location.DPoint;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DistrictItem implements Parcelable {
    public static final Parcelable.Creator<DistrictItem> CREATOR = new Parcelable.Creator<DistrictItem>() { // from class: com.amap.api.fence.DistrictItem.1
        private static DistrictItem a(Parcel parcel) {
            return new DistrictItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictItem[] newArray(int i) {
            return a(i);
        }

        private static DistrictItem[] a(int i) {
            return new DistrictItem[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6357b;
    private String c;
    private List<DPoint> d;

    public DistrictItem() {
        this.f6356a = "";
        this.f6357b = null;
        this.c = null;
        this.d = null;
    }

    public static Parcelable.Creator<DistrictItem> getCreator() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.c;
    }

    public String getCitycode() {
        return this.f6357b;
    }

    public String getDistrictName() {
        return this.f6356a;
    }

    public List<DPoint> getPolyline() {
        return this.d;
    }

    public void setAdcode(String str) {
        this.c = str;
    }

    public void setCitycode(String str) {
        this.f6357b = str;
    }

    public void setDistrictName(String str) {
        this.f6356a = str;
    }

    public void setPolyline(List<DPoint> list) {
        this.d = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6356a);
        parcel.writeString(this.f6357b);
        parcel.writeString(this.c);
        parcel.writeTypedList(this.d);
    }

    public DistrictItem(Parcel parcel) {
        this.f6356a = "";
        this.f6357b = null;
        this.c = null;
        this.d = null;
        this.f6356a = parcel.readString();
        this.f6357b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createTypedArrayList(DPoint.CREATOR);
    }
}
