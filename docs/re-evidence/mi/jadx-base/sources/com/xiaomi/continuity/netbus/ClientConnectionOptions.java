package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ClientConnectionOptions implements Parcelable {
    public static final Parcelable.Creator<ClientConnectionOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11195b;
    public boolean c;
    public int d;
    public LinkAddress e;
    public byte[] f;

    public class a implements Parcelable.Creator<ClientConnectionOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClientConnectionOptions createFromParcel(Parcel parcel) {
            return new ClientConnectionOptions(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClientConnectionOptions[] newArray(int i) {
            return new ClientConnectionOptions[i];
        }
    }

    public ClientConnectionOptions() {
        this.f11195b = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("ClientConnectionOptions{mMediumType=");
        sbA.append(this.f11194a);
        sbA.append(", mConnectionTimeout=");
        sbA.append(this.f11195b);
        sbA.append(", mConfirm=");
        sbA.append(this.c);
        sbA.append(", mTrustLevel=");
        sbA.append(this.d);
        sbA.append(", mLinkAddress=");
        sbA.append(this.e);
        sbA.append(", mPrivateData=");
        sbA.append(Arrays.toString(this.f));
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11194a);
        parcel.writeLong(this.f11195b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, 0);
        parcel.writeByteArray(this.f);
    }

    public ClientConnectionOptions(Parcel parcel) {
        this.f11195b = 0L;
        this.f11194a = parcel.readInt();
        this.f11195b = parcel.readLong();
        this.c = parcel.readByte() != 0;
        this.d = parcel.readInt();
        this.e = (LinkAddress) parcel.readParcelable(LinkAddress.class.getClassLoader());
        this.f = parcel.createByteArray();
    }

    public /* synthetic */ ClientConnectionOptions(Parcel parcel, a aVar) {
        this(parcel);
    }
}
