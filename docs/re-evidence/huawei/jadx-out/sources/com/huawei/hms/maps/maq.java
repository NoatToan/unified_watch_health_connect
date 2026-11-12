package com.huawei.hms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

/* JADX INFO: loaded from: classes10.dex */
public class maq implements Parcelable {
    public static final Parcelable.Creator<maq> CREATOR = new maa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f14207c;
    private String d;
    private String e;
    private long f;
    private String g;
    private String h;

    class maa implements Parcelable.Creator {
        maa() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public maq createFromParcel(Parcel parcel) {
            return new maq(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public maq[] newArray(int i) {
            return new maq[i];
        }
    }

    public maq() {
    }

    public maq a(String str) {
        this.e = str;
        return this;
    }

    public maq b(String str) {
        this.f14205a = str;
        return this;
    }

    public maq c(String str) {
        this.f14207c = str;
        return this;
    }

    public maq d(String str) {
        this.h = str;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public maq e(String str) {
        this.d = str;
        return this;
    }

    public maq f(String str) {
        this.f14206b = str;
        return this;
    }

    public maq g(String str) {
        this.g = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeString(2, this.f14205a, false);
        parcelWrite.writeString(3, this.f14206b, false);
        parcelWrite.writeString(4, this.f14207c, false);
        parcelWrite.writeString(5, this.d, false);
        parcelWrite.writeString(6, this.e, false);
        parcelWrite.writeLong(7, this.f);
        parcelWrite.writeString(8, this.g, false);
        parcelWrite.writeString(9, this.h, false);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    protected maq(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f14205a = parcelReader.createString(2, "");
        this.f14206b = parcelReader.createString(3, "");
        this.f14207c = parcelReader.createString(4, "");
        this.d = parcelReader.createString(5, "");
        this.e = parcelReader.createString(6, "");
        this.f = parcelReader.readLong(7, 0L);
        this.g = parcelReader.createString(8, "");
        this.h = parcelReader.createString(9, "");
    }

    public maq a(long j) {
        this.f = j;
        return this;
    }
}
