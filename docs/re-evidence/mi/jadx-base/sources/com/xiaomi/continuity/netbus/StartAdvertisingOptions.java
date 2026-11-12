package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class StartAdvertisingOptions implements Parcelable {
    public static final Parcelable.Creator<StartAdvertisingOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11224b;
    public int c;

    public class a implements Parcelable.Creator<StartAdvertisingOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StartAdvertisingOptions createFromParcel(Parcel parcel) {
            return new StartAdvertisingOptions(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StartAdvertisingOptions[] newArray(int i) {
            return new StartAdvertisingOptions[i];
        }
    }

    public StartAdvertisingOptions() {
        this.f11224b = AdvertisingOptions$AdvertisingDataType.NORMAL.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("StartAdvertisingOptions{mMediumType=");
        sbA.append(this.f11223a);
        sbA.append(", mDataType=");
        sbA.append(this.f11224b);
        sbA.append(", mFrequency=");
        sbA.append(this.c);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11223a);
        parcel.writeInt(this.f11224b);
        parcel.writeInt(this.c);
    }

    public StartAdvertisingOptions(Parcel parcel) {
        this.f11224b = AdvertisingOptions$AdvertisingDataType.NORMAL.ordinal();
        this.f11223a = parcel.readInt();
        this.f11224b = parcel.readInt();
        this.c = parcel.readInt();
    }

    public /* synthetic */ StartAdvertisingOptions(Parcel parcel, a aVar) {
        this(parcel);
    }
}
