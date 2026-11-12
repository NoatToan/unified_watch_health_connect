package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class ApplyActivityStyle implements Parcelable {
    public static final Parcelable.Creator<ApplyActivityStyle> CREATOR = new a();
    private int a;
    private int b;
    private int c;

    public static class a implements Parcelable.Creator<ApplyActivityStyle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApplyActivityStyle createFromParcel(Parcel parcel) {
            return new ApplyActivityStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApplyActivityStyle[] newArray(int i) {
            return new ApplyActivityStyle[i];
        }
    }

    public ApplyActivityStyle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getActivityBackgroundColor() {
        return this.c;
    }

    public int getButtonColor() {
        return this.b;
    }

    public int getTitleColor() {
        return this.a;
    }

    public void setActivityBackgroundColor(int i) {
        this.c = i;
    }

    public void setButtonColor(int i) {
        this.b = i;
    }

    public void setTitleColor(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public ApplyActivityStyle(Parcel parcel) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
