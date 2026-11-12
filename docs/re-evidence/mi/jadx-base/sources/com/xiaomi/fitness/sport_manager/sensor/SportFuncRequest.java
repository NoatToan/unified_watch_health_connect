package com.xiaomi.fitness.sport_manager.sensor;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class SportFuncRequest implements Parcelable {
    public static final Parcelable.Creator<SportFuncRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13198b;
    public boolean c;

    public class a implements Parcelable.Creator<SportFuncRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportFuncRequest createFromParcel(Parcel parcel) {
            return new SportFuncRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportFuncRequest[] newArray(int i) {
            return new SportFuncRequest[i];
        }
    }

    public SportFuncRequest() {
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void c(boolean z) {
        this.f13197a = z;
    }

    public void d(boolean z) {
        this.f13198b = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f13197a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13198b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public SportFuncRequest(Parcel parcel) {
        this.f13197a = parcel.readByte() != 0;
        this.f13198b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
    }
}
