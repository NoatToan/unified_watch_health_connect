package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class LinkAddress implements Parcelable {
    public static final Parcelable.Creator<LinkAddress> CREATOR = new a();
    public int mMediumType;

    public class a implements Parcelable.Creator<LinkAddress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkAddress createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            if (i == 1) {
                return new BtLinkAddress.b().c(i).b(new BtLinkAddress.Bt(parcel)).a();
            }
            if (i == 32) {
                return new P2pLinkAddress.b().b(i).c(new P2pLinkAddress.P2p(parcel)).a();
            }
            if (i == 64 || i == 128 || i == 256 || i == 512 || i == 8192 || i == 16384) {
                return new IpLinkAddress.Builder().setMediumType(i).setIp(new IpLinkAddress.Ip(parcel)).build();
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LinkAddress[] newArray(int i) {
            return new LinkAddress[i];
        }
    }

    public LinkAddress() {
    }

    public LinkAddress(Parcel parcel) {
        this.mMediumType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getMediumType() {
        return this.mMediumType;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("LinkAddress{mMediumType=");
        sbA.append(this.mMediumType);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mMediumType);
    }
}
