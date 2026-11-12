package com.xiaomi.fitness.detail.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class SportDivingInfoModel implements Parcelable {
    public static final Parcelable.Creator<SportDivingInfoModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11866b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    public class a implements Parcelable.Creator<SportDivingInfoModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportDivingInfoModel createFromParcel(Parcel parcel) {
            return new SportDivingInfoModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportDivingInfoModel[] newArray(int i) {
            return new SportDivingInfoModel[i];
        }
    }

    public SportDivingInfoModel(int i, int i2, float f, float f2, float f3) {
        this.f11865a = i;
        this.f11866b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11865a);
        parcel.writeInt(this.f11866b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeFloat(this.h);
    }

    public SportDivingInfoModel(Parcel parcel) {
        this.f11865a = parcel.readInt();
        this.f11866b = parcel.readInt();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
        this.h = parcel.readFloat();
    }
}
