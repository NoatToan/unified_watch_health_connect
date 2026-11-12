package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class PayloadOptions implements Parcelable {
    public static final Parcelable.Creator<PayloadOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11218b;

    public class a implements Parcelable.Creator<PayloadOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PayloadOptions createFromParcel(Parcel parcel) {
            return new PayloadOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PayloadOptions[] newArray(int i) {
            return new PayloadOptions[i];
        }
    }

    public PayloadOptions() {
    }

    public PayloadOptions(Parcel parcel) {
        this.f11217a = parcel.readByte() != 0;
        this.f11218b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("PayloadOptions{mEnableOnRestrict=");
        sbA.append(this.f11217a);
        sbA.append("mRfcommClassType=");
        sbA.append(this.f11218b);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f11217a ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f11218b);
    }
}
