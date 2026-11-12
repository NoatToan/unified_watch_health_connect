package com.xiaomi.hm.health.bt.profile.mili.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes11.dex */
public final class UserInfo implements Parcelable {
    public static final UserInfo A = new UserInfo(170420175, (byte) 0, (byte) 23, (byte) -88, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, "anri.okita\u0000".getBytes(Charset.defaultCharset()));
    public static final Parcelable.Creator<UserInfo> CREATOR = new a();
    public final int t;
    public final byte u;
    public final byte v;
    public final byte w;
    public final byte x;
    public final byte[] y;
    public byte z;

    public class a implements Parcelable.Creator<UserInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel.readInt(), parcel.readByte(), parcel.readByte(), parcel.readByte(), parcel.readByte(), parcel.readByte(), parcel.readString().getBytes(Charset.defaultCharset()));
        }
    }

    public UserInfo(int i, byte b2, byte b3, byte b4, byte b5, byte b6, byte[] bArr) {
        this.t = i;
        this.u = b2;
        this.v = b3;
        this.w = b4;
        this.x = b5;
        this.y = bArr;
        this.z = b6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[[[ ");
        sb.append(UserInfo.class.getSimpleName());
        sb.append(" ]]]");
        sb.append("\n     uid: ");
        sb.append(this.t);
        sb.append("\n  gender: ");
        sb.append(this.u == 0 ? "female" : "male");
        sb.append("\n     age: ");
        sb.append((int) this.v);
        sb.append("yrs\n  height: ");
        sb.append(this.w & 255);
        sb.append("cm\n  weight: ");
        sb.append(this.x & 255);
        sb.append("kg\n   alias: ");
        sb.append(new String(this.y, Charset.defaultCharset()));
        sb.append("\n   type: ");
        sb.append((int) this.z);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.t);
        parcel.writeByte(this.u);
        parcel.writeByte(this.v);
        parcel.writeByte(this.w);
        parcel.writeByte(this.x);
        parcel.writeString(new String(this.y, Charset.defaultCharset()));
        parcel.writeByte(this.z);
    }

    public UserInfo(int i, byte b2, byte b3, byte b4, byte b5, byte[] bArr) {
        this.t = i;
        this.u = b2;
        this.v = b3;
        this.w = b4;
        this.x = b5;
        this.y = bArr;
        this.z = (byte) 0;
    }
}
