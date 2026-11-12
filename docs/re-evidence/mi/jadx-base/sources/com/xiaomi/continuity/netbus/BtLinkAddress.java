package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class BtLinkAddress extends LinkAddress {
    public static final Parcelable.Creator<BtLinkAddress> CREATOR = new a();
    private Bt mBt;

    public static class Bt implements Parcelable {
        public static final Parcelable.Creator<Bt> CREATOR = new a();
        private final String mMac;

        public class a implements Parcelable.Creator<Bt> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bt createFromParcel(Parcel parcel) {
                return new Bt(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Bt[] newArray(int i) {
                return new Bt[i];
            }
        }

        public Bt(Parcel parcel) {
            this.mMac = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getMac() {
            return this.mMac;
        }

        public String toString() {
            StringBuilder sbA = j3s.a("Bt{mMac='");
            sbA.append(this.mMac);
            sbA.append('\'');
            sbA.append(AbstractJsonLexerKt.END_OBJ);
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mMac);
        }

        public Bt(String str) {
            this.mMac = str;
        }
    }

    public class a implements Parcelable.Creator<BtLinkAddress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BtLinkAddress createFromParcel(Parcel parcel) {
            return new BtLinkAddress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BtLinkAddress[] newArray(int i) {
            return new BtLinkAddress[i];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BtLinkAddress f11193a = new BtLinkAddress((a) null);

        public BtLinkAddress a() {
            return this.f11193a;
        }

        public b b(Bt bt) {
            Objects.requireNonNull(bt);
            this.f11193a.mBt = bt;
            return this;
        }

        public b c(int i) {
            this.f11193a.mMediumType = i;
            return this;
        }
    }

    private BtLinkAddress() {
    }

    @Override // com.xiaomi.continuity.netbus.LinkAddress, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bt getBt() {
        return this.mBt;
    }

    @Override // com.xiaomi.continuity.netbus.LinkAddress
    public String toString() {
        StringBuilder sbA = j3s.a("BtLinkAddress{mMediumType=");
        sbA.append(this.mMediumType);
        sbA.append(", mBt=");
        sbA.append(this.mBt);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // com.xiaomi.continuity.netbus.LinkAddress, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mMediumType);
        if (this.mMediumType != 1) {
            return;
        }
        this.mBt.writeToParcel(parcel, i);
    }

    public BtLinkAddress(Parcel parcel) {
        int i = parcel.readInt();
        this.mMediumType = i;
        if (i != 1) {
            return;
        }
        this.mBt = new Bt(parcel);
    }

    public /* synthetic */ BtLinkAddress(a aVar) {
        this();
    }
}
