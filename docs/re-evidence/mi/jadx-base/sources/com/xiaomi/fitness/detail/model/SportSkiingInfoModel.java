package com.xiaomi.fitness.detail.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class SportSkiingInfoModel implements Parcelable {
    public static final Parcelable.Creator<SportSkiingInfoModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11868b;
    public int c;
    public float d;
    public float e;
    public int f;
    public int g;

    public class a implements Parcelable.Creator<SportSkiingInfoModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportSkiingInfoModel createFromParcel(Parcel parcel) {
            return new SportSkiingInfoModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportSkiingInfoModel[] newArray(int i) {
            return new SportSkiingInfoModel[i];
        }
    }

    public SportSkiingInfoModel(int i, int i2, int i3, float f, float f2, int i4, int i5) {
        this.f11867a = i;
        this.f11868b = i2;
        this.c = i3;
        this.d = f;
        this.e = f2;
        this.g = i5;
        this.f = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11867a);
        parcel.writeInt(this.f11868b);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.g);
        parcel.writeInt(this.f);
    }

    public SportSkiingInfoModel(Parcel parcel) {
        this.f11867a = parcel.readInt();
        this.f11868b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.g = parcel.readInt();
        this.f = parcel.readInt();
    }
}
