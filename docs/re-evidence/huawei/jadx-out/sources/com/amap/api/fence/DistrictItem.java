package com.amap.api.fence;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.location.DPoint;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class DistrictItem implements Parcelable {
    public static final Parcelable.Creator<DistrictItem> CREATOR = new Parcelable.Creator<DistrictItem>() { // from class: com.amap.api.fence.DistrictItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictItem[] newArray(int i) {
            return a(i);
        }

        private static DistrictItem a(Parcel parcel) {
            return new DistrictItem(parcel);
        }

        private static DistrictItem[] a(int i) {
            return new DistrictItem[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3326c;
    private List<DPoint> d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCitycode() {
        return this.f3325b;
    }

    public void setCitycode(String str) {
        this.f3325b = str;
    }

    public String getAdcode() {
        return this.f3326c;
    }

    public void setAdcode(String str) {
        this.f3326c = str;
    }

    public List<DPoint> getPolyline() {
        return this.d;
    }

    public void setPolyline(List<DPoint> list) {
        this.d = list;
    }

    public String getDistrictName() {
        return this.f3324a;
    }

    public void setDistrictName(String str) {
        this.f3324a = str;
    }

    public static Parcelable.Creator<DistrictItem> getCreator() {
        return CREATOR;
    }

    public DistrictItem() {
        this.f3324a = "";
        this.f3325b = null;
        this.f3326c = null;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3324a);
        parcel.writeString(this.f3325b);
        parcel.writeString(this.f3326c);
        parcel.writeTypedList(this.d);
    }

    protected DistrictItem(Parcel parcel) {
        this.f3324a = "";
        this.f3325b = null;
        this.f3326c = null;
        this.d = null;
        this.f3324a = parcel.readString();
        this.f3325b = parcel.readString();
        this.f3326c = parcel.readString();
        this.d = parcel.createTypedArrayList(DPoint.CREATOR);
    }
}
