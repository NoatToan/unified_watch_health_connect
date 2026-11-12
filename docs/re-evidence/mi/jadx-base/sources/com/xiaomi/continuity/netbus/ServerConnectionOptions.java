package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ServerConnectionOptions implements Parcelable {
    public static final Parcelable.Creator<ServerConnectionOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11222b;
    public int c;

    public class a implements Parcelable.Creator<ServerConnectionOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServerConnectionOptions createFromParcel(Parcel parcel) {
            return new ServerConnectionOptions(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ServerConnectionOptions[] newArray(int i) {
            return new ServerConnectionOptions[i];
        }
    }

    public ServerConnectionOptions() {
    }

    public ServerConnectionOptions(Parcel parcel) {
        this.f11221a = parcel.readInt();
        this.f11222b = parcel.readByte() != 0;
        this.c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("ServerConnectionOptions{mMediumType=");
        sbA.append(this.f11221a);
        sbA.append(", mConfirm=");
        sbA.append(this.f11222b);
        sbA.append(", mTrustLevel=");
        sbA.append(this.c);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11221a);
        parcel.writeByte(this.f11222b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.c);
    }

    public /* synthetic */ ServerConnectionOptions(Parcel parcel, a aVar) {
        this(parcel);
    }
}
