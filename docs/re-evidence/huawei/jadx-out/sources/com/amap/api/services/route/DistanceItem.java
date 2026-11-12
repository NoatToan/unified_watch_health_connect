package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class DistanceItem implements Parcelable {
    public static final Parcelable.Creator<DistanceItem> CREATOR = new Parcelable.Creator<DistanceItem>() { // from class: com.amap.api.services.route.DistanceItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceItem createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistanceItem[] newArray(int i) {
            return a(i);
        }

        private static DistanceItem a(Parcel parcel) {
            return new DistanceItem(parcel);
        }

        private static DistanceItem[] a(int i) {
            return new DistanceItem[i];
        }
    };
    public final int ERROR_CODE_NOT_IN_CHINA;
    public final int ERROR_CODE_NO_DRIVE;
    public final int ERROR_CODE_TOO_FAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3690c;
    private float d;
    private String e;
    private int f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getOriginId() {
        return this.f3688a;
    }

    public int getDestId() {
        return this.f3689b;
    }

    public float getDistance() {
        return this.f3690c;
    }

    public float getDuration() {
        return this.d;
    }

    public String getErrorInfo() {
        return this.e;
    }

    public int getErrorCode() {
        return this.f;
    }

    public void setOriginId(int i) {
        this.f3688a = i;
    }

    public void setDestId(int i) {
        this.f3689b = i;
    }

    public void setDistance(float f) {
        this.f3690c = f;
    }

    public void setDuration(float f) {
        this.d = f;
    }

    public void setErrorInfo(String str) {
        this.e = str;
    }

    public void setErrorCode(int i) {
        this.f = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3688a);
        parcel.writeInt(this.f3689b);
        parcel.writeFloat(this.f3690c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    public DistanceItem() {
        this.ERROR_CODE_NO_DRIVE = 1;
        this.ERROR_CODE_TOO_FAR = 2;
        this.ERROR_CODE_NOT_IN_CHINA = 3;
        this.f3688a = 1;
        this.f3689b = 1;
        this.f3690c = 0.0f;
        this.d = 0.0f;
    }

    protected DistanceItem(Parcel parcel) {
        this.ERROR_CODE_NO_DRIVE = 1;
        this.ERROR_CODE_TOO_FAR = 2;
        this.ERROR_CODE_NOT_IN_CHINA = 3;
        this.f3688a = 1;
        this.f3689b = 1;
        this.f3690c = 0.0f;
        this.d = 0.0f;
        this.f3688a = parcel.readInt();
        this.f3689b = parcel.readInt();
        this.f3690c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = parcel.readInt();
    }
}
