package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class DisconnectionInfo implements Parcelable {
    public static final Parcelable.Creator<DisconnectionInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceInfo f11209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11210b;
    public String c;
    public int d;

    public class a implements Parcelable.Creator<DisconnectionInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DisconnectionInfo createFromParcel(Parcel parcel) {
            return new DisconnectionInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DisconnectionInfo[] newArray(int i) {
            return new DisconnectionInfo[i];
        }
    }

    public DisconnectionInfo() {
    }

    public DisconnectionInfo(Parcel parcel) {
        this.f11209a = (DeviceInfo) parcel.readParcelable(DeviceInfo.class.getClassLoader());
        this.f11210b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("DisconnectionInfo{mDeviceInfo=");
        sbA.append(this.f11209a);
        sbA.append(", mMediumType=");
        sbA.append(this.f11210b);
        sbA.append(", mConnectionId=");
        sbA.append(this.c);
        sbA.append(", mErrCode=");
        sbA.append(this.d);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11209a, i);
        parcel.writeInt(this.f11210b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
    }

    public /* synthetic */ DisconnectionInfo(Parcel parcel, a aVar) {
        this(parcel);
    }
}
