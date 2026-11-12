package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class SeAppListItem implements Parcelable {
    public static final Parcelable.Creator<SeAppListItem> CREATOR = new a();
    private AppDetail a;
    private VirtualCardInfo b;

    public static class a implements Parcelable.Creator<SeAppListItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SeAppListItem createFromParcel(Parcel parcel) {
            return new SeAppListItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SeAppListItem[] newArray(int i) {
            return new SeAppListItem[i];
        }
    }

    public SeAppListItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppDetail getAppDetail() {
        return this.a;
    }

    public VirtualCardInfo getVirtualCardInfo() {
        return this.b;
    }

    public void setAppDetail(AppDetail appDetail) {
        this.a = appDetail;
    }

    public void setVirtualCardInfo(VirtualCardInfo virtualCardInfo) {
        this.b = virtualCardInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public SeAppListItem(Parcel parcel) {
        this.a = (AppDetail) parcel.readParcelable(AppDetail.class.getClassLoader());
        this.b = (VirtualCardInfo) parcel.readParcelable(VirtualCardInfo.class.getClassLoader());
    }
}
