package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class P2pLinkAddress extends LinkAddress {
    public static final Parcelable.Creator<P2pLinkAddress> CREATOR = new a();
    private P2p mP2p;

    public static class P2p implements Parcelable {
        public static final Parcelable.Creator<P2p> CREATOR = new a();
        private final int mChannel;
        private final String mIp;
        private final String mMac;
        private final int mPort;
        private final String mPwd;
        private final String mSsid;

        public class a implements Parcelable.Creator<P2p> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public P2p createFromParcel(Parcel parcel) {
                return new P2p(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public P2p[] newArray(int i) {
                return new P2p[i];
            }
        }

        public P2p(Parcel parcel) {
            this.mMac = parcel.readString();
            this.mSsid = parcel.readString();
            this.mPwd = parcel.readString();
            this.mChannel = parcel.readInt();
            this.mIp = parcel.readString();
            this.mPort = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getChannel() {
            return this.mChannel;
        }

        public String getIp() {
            return this.mIp;
        }

        public String getMac() {
            return this.mMac;
        }

        public int getPort() {
            return this.mPort;
        }

        public String getPwd() {
            return this.mPwd;
        }

        public String getSsid() {
            return this.mSsid;
        }

        public String toString() {
            StringBuilder sbA = j3s.a("P2p{mMac='");
            sbA.append(this.mMac);
            sbA.append('\'');
            sbA.append(", mSsid='");
            sbA.append(this.mSsid);
            sbA.append('\'');
            sbA.append(", mPsw='");
            sbA.append(this.mPwd);
            sbA.append('\'');
            sbA.append(", mChannel=");
            sbA.append(this.mChannel);
            sbA.append(", mIp='");
            sbA.append(this.mIp);
            sbA.append('\'');
            sbA.append(", mPort=");
            sbA.append(this.mPort);
            sbA.append(AbstractJsonLexerKt.END_OBJ);
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mMac);
            parcel.writeString(this.mSsid);
            parcel.writeString(this.mPwd);
            parcel.writeInt(this.mChannel);
            parcel.writeString(this.mIp);
            parcel.writeInt(this.mPort);
        }

        public P2p(String str, String str2, String str3, int i, String str4, int i2) {
            this.mMac = str;
            this.mSsid = str2;
            this.mPwd = str3;
            this.mChannel = i;
            this.mIp = str4;
            this.mPort = i2;
        }
    }

    public class a implements Parcelable.Creator<P2pLinkAddress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public P2pLinkAddress createFromParcel(Parcel parcel) {
            return new P2pLinkAddress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public P2pLinkAddress[] newArray(int i) {
            return new P2pLinkAddress[i];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P2pLinkAddress f11216a = new P2pLinkAddress((a) null);

        public P2pLinkAddress a() {
            return this.f11216a;
        }

        public b b(int i) {
            this.f11216a.mMediumType = i;
            return this;
        }

        public b c(P2p p2p) {
            Objects.requireNonNull(p2p);
            this.f11216a.mP2p = p2p;
            return this;
        }
    }

    private P2pLinkAddress() {
    }

    @Override // com.xiaomi.continuity.netbus.LinkAddress, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public P2p getP2p() {
        return this.mP2p;
    }

    @Override // com.xiaomi.continuity.netbus.LinkAddress
    public String toString() {
        StringBuilder sbA = j3s.a("P2pLinkAddress{mMediumType=");
        sbA.append(this.mMediumType);
        sbA.append(", mP2p=");
        sbA.append(this.mP2p);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // com.xiaomi.continuity.netbus.LinkAddress, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mMediumType);
        if (this.mMediumType != 32) {
            return;
        }
        this.mP2p.writeToParcel(parcel, i);
    }

    public P2pLinkAddress(Parcel parcel) {
        int i = parcel.readInt();
        this.mMediumType = i;
        if (i != 32) {
            return;
        }
        this.mP2p = new P2p(parcel);
    }

    public /* synthetic */ P2pLinkAddress(a aVar) {
        this();
    }
}
