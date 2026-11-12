package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class IpLinkAddress extends LinkAddress {
    public static final Parcelable.Creator<IpLinkAddress> CREATOR = new a();
    private Ip mIp;

    public static class Builder {
        private final IpLinkAddress mLinkAddress = new IpLinkAddress((a) null);

        public IpLinkAddress build() {
            return this.mLinkAddress;
        }

        public Builder setIp(Ip ip) {
            Objects.requireNonNull(ip);
            this.mLinkAddress.mIp = ip;
            return this;
        }

        public Builder setMediumType(int i) {
            this.mLinkAddress.mMediumType = i;
            return this;
        }
    }

    public static class Ip implements Parcelable {
        public static final Parcelable.Creator<Ip> CREATOR = new a();
        private final String mIp;
        private final int mPort;

        public class a implements Parcelable.Creator<Ip> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Ip createFromParcel(Parcel parcel) {
                return new Ip(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Ip[] newArray(int i) {
                return new Ip[i];
            }
        }

        public Ip(Parcel parcel) {
            this.mIp = parcel.readString();
            this.mPort = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getIp() {
            return this.mIp;
        }

        public int getPort() {
            return this.mPort;
        }

        public String toString() {
            StringBuilder sbA = j3s.a("Ip{mIp='");
            sbA.append(this.mIp);
            sbA.append('\'');
            sbA.append(", mPort=");
            sbA.append(this.mPort);
            sbA.append(AbstractJsonLexerKt.END_OBJ);
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mIp);
            parcel.writeInt(this.mPort);
        }

        public Ip(String str, int i) {
            this.mIp = str;
            this.mPort = i;
        }
    }

    public class a implements Parcelable.Creator<IpLinkAddress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IpLinkAddress createFromParcel(Parcel parcel) {
            return new IpLinkAddress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IpLinkAddress[] newArray(int i) {
            return new IpLinkAddress[i];
        }
    }

    private IpLinkAddress() {
    }

    @Override // com.xiaomi.continuity.netbus.LinkAddress, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Ip getIp() {
        return this.mIp;
    }

    @Override // com.xiaomi.continuity.netbus.LinkAddress
    public String toString() {
        StringBuilder sbA = j3s.a("IpLinkAddress{mMediumType=");
        sbA.append(this.mMediumType);
        sbA.append(", mIp=");
        sbA.append(this.mIp);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // com.xiaomi.continuity.netbus.LinkAddress, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mMediumType);
        int i2 = this.mMediumType;
        if (i2 == 64 || i2 == 128 || i2 == 256 || i2 == 512 || i2 == 8192 || i2 == 16384) {
            this.mIp.writeToParcel(parcel, i);
        }
    }

    public IpLinkAddress(Parcel parcel) {
        int i = parcel.readInt();
        this.mMediumType = i;
        if (i == 64 || i == 128 || i == 256 || i == 512 || i == 8192 || i == 16384) {
            this.mIp = new Ip(parcel);
        }
    }

    public /* synthetic */ IpLinkAddress(a aVar) {
        this();
    }
}
