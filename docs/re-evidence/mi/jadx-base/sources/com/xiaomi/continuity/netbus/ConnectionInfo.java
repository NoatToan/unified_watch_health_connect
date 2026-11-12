package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ConnectionInfo implements Parcelable {
    public static final Parcelable.Creator<ConnectionInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceInfo f11196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11197b;
    public String c;
    public b d;
    public int e;
    public String f;
    public byte[] g;

    public class a implements Parcelable.Creator<ConnectionInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectionInfo createFromParcel(Parcel parcel) {
            return new ConnectionInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ConnectionInfo[] newArray(int i) {
            return new ConnectionInfo[i];
        }
    }

    public interface b {
        void writeToParcel(Parcel parcel, int i);
    }

    public static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11199b;

        public c(Parcel parcel) {
            this(parcel.readString(), parcel.readString());
        }

        public String toString() {
            StringBuilder sbA = j3s.a("IpAddress{mLocalIP='");
            sbA.append(this.f11198a);
            sbA.append('\'');
            sbA.append(", mRemoteIP='");
            sbA.append(this.f11199b);
            sbA.append('\'');
            sbA.append(AbstractJsonLexerKt.END_OBJ);
            return sbA.toString();
        }

        @Override // com.xiaomi.continuity.netbus.ConnectionInfo.b
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11198a);
            parcel.writeString(this.f11199b);
        }

        public c(String str, String str2) {
            Objects.requireNonNull(str2);
            this.f11198a = str;
            this.f11199b = str2;
        }
    }

    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11200a;

        public d(Parcel parcel) {
            this.f11200a = parcel.readString();
        }

        public String toString() {
            StringBuilder sbA = j3s.a("MacAddress{mMac='");
            sbA.append(this.f11200a);
            sbA.append('\'');
            sbA.append(AbstractJsonLexerKt.END_OBJ);
            return sbA.toString();
        }

        @Override // com.xiaomi.continuity.netbus.ConnectionInfo.b
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11200a);
        }
    }

    public ConnectionInfo() {
    }

    public ConnectionInfo(Parcel parcel) {
        this.f11196a = (DeviceInfo) parcel.readParcelable(DeviceInfo.class.getClassLoader());
        this.f11197b = parcel.readInt();
        this.c = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.createByteArray();
        a(parcel);
    }

    public final void a(Parcel parcel) {
        b dVar;
        int i = this.f11197b;
        if (i == 1 || i == 2) {
            dVar = new d(parcel);
        } else if (i != 32 && i != 128) {
            return;
        } else {
            dVar = new c(parcel);
        }
        this.d = dVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("ConnectionInfo{mDeviceInfo=");
        sbA.append(this.f11196a);
        sbA.append(", mMediumType=");
        sbA.append(this.f11197b);
        sbA.append(", mConnectionId='");
        sbA.append(this.c);
        sbA.append('\'');
        sbA.append(", mTrustLevel=");
        sbA.append(this.e);
        sbA.append(", mComparisonNumber=");
        sbA.append(this.f);
        sbA.append(", mPrivateData=");
        sbA.append(Arrays.toString(this.g));
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11196a, i);
        parcel.writeInt(this.f11197b);
        parcel.writeString(this.c);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
        this.d.writeToParcel(parcel, i);
    }

    public /* synthetic */ ConnectionInfo(Parcel parcel, a aVar) {
        this(parcel);
    }
}
