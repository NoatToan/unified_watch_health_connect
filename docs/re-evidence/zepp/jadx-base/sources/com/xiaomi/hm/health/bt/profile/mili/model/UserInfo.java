package com.xiaomi.hm.health.bt.profile.mili.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.hm.health.HMIntentHandler;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public final class UserInfo implements Parcelable {
    public static final byte CLEAR_DATA = 1;
    public static final byte FORCE_PAIR = 1;
    public static final byte NORMAL = 0;
    public static final byte NORMAL_PAIR = 0;
    public static final byte RETAIN_DATA = 2;
    public final byte age;
    public final byte[] alias;
    public final byte gender;
    public final byte height;
    public byte type;
    public final int uid;
    public final byte weight;
    public static final UserInfo SAMPLE = new UserInfo(170420175, (byte) 0, (byte) 23, (byte) -88, (byte) 50, "anri.okita\u0000".getBytes(Charset.defaultCharset()));
    public static final Parcelable.Creator<UserInfo> CREATOR = new a();

    public class a implements Parcelable.Creator<UserInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo createFromParcel(Parcel source) {
            return new UserInfo(source.readInt(), source.readByte(), source.readByte(), source.readByte(), source.readByte(), source.readByte(), source.readString().getBytes(Charset.defaultCharset()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserInfo[] newArray(int size) {
            return null;
        }
    }

    public UserInfo(int uid, byte gender, byte age, byte height, byte weight, byte type, byte[] alias) {
        this.uid = uid;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.alias = alias;
        this.type = type;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[[[ ");
        sb.append(UserInfo.class.getSimpleName());
        sb.append(" ]]]");
        sb.append("\n     uid: ");
        sb.append(this.uid);
        sb.append("\n  gender: ");
        sb.append(this.gender == 0 ? HMIntentHandler.NAME_FEMALE : "male");
        sb.append("\n     age: ");
        sb.append((int) this.age);
        sb.append("yrs\n  height: ");
        sb.append(this.height & 255);
        sb.append("cm\n  weight: ");
        sb.append(this.weight & 255);
        sb.append("kg\n   alias: ");
        sb.append(new String(this.alias, Charset.defaultCharset()));
        sb.append("\n   type: ");
        sb.append((int) this.type);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.uid);
        dest.writeByte(this.gender);
        dest.writeByte(this.age);
        dest.writeByte(this.height);
        dest.writeByte(this.weight);
        dest.writeString(new String(this.alias, Charset.defaultCharset()));
        dest.writeByte(this.type);
    }

    public UserInfo(int uid, byte gender, byte age, byte height, byte weight, byte[] alias) {
        this.uid = uid;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.alias = alias;
        this.type = (byte) 0;
    }
}
