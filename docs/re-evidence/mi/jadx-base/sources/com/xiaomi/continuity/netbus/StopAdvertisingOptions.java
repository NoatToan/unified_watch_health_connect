package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class StopAdvertisingOptions implements Parcelable {
    public static final Parcelable.Creator<StopAdvertisingOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11228b;

    public class a implements Parcelable.Creator<StopAdvertisingOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StopAdvertisingOptions createFromParcel(Parcel parcel) {
            return new StopAdvertisingOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StopAdvertisingOptions[] newArray(int i) {
            return new StopAdvertisingOptions[i];
        }
    }

    public StopAdvertisingOptions() {
        this.f11228b = AdvertisingOptions$AdvertisingDataType.NORMAL.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("StopAdvertisingOptions{mMediumType=");
        sbA.append(this.f11227a);
        sbA.append(", mDataType=");
        sbA.append(this.f11228b);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11227a);
        parcel.writeInt(this.f11228b);
    }

    public StopAdvertisingOptions(Parcel parcel) {
        this.f11228b = AdvertisingOptions$AdvertisingDataType.NORMAL.ordinal();
        this.f11227a = parcel.readInt();
        this.f11228b = parcel.readInt();
    }
}
