package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ConnectionUserInfo implements Parcelable {
    public static final Parcelable.Creator<ConnectionUserInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f11202b;

    public class a implements Parcelable.Creator<ConnectionUserInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectionUserInfo createFromParcel(Parcel parcel) {
            return new ConnectionUserInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ConnectionUserInfo[] newArray(int i) {
            return new ConnectionUserInfo[i];
        }
    }

    public ConnectionUserInfo() {
    }

    public ConnectionUserInfo(Parcel parcel) {
        this.f11201a = parcel.readInt();
        this.f11202b = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("ConnectionUserInfo{mAcceptCode=");
        sbA.append(this.f11201a);
        sbA.append(", mPrivateData=");
        sbA.append(Arrays.toString(this.f11202b));
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11201a);
        parcel.writeByteArray(this.f11202b);
    }

    public /* synthetic */ ConnectionUserInfo(Parcel parcel, a aVar) {
        this(parcel);
    }
}
