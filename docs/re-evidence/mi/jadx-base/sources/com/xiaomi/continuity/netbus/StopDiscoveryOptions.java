package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class StopDiscoveryOptions implements Parcelable {
    public static final Parcelable.Creator<StopDiscoveryOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11230b;

    public class a implements Parcelable.Creator<StopDiscoveryOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StopDiscoveryOptions createFromParcel(Parcel parcel) {
            return new StopDiscoveryOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StopDiscoveryOptions[] newArray(int i) {
            return new StopDiscoveryOptions[i];
        }
    }

    public StopDiscoveryOptions() {
        this.f11230b = DiscoveryOptions$DiscoveryDataType.NORMAL.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("StopDiscoveryOptions{mMediumType=");
        sbA.append(this.f11229a);
        sbA.append(", mDataType=");
        sbA.append(this.f11230b);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11229a);
        parcel.writeInt(this.f11230b);
    }

    public StopDiscoveryOptions(Parcel parcel) {
        this.f11230b = DiscoveryOptions$DiscoveryDataType.NORMAL.ordinal();
        this.f11229a = parcel.readInt();
        this.f11230b = parcel.readInt();
    }
}
