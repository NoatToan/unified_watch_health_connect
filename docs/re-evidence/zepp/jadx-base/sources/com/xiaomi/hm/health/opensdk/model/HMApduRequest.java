package com.xiaomi.hm.health.opensdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class HMApduRequest implements Parcelable {
    public static final Parcelable.Creator<HMApduRequest> CREATOR = new a();
    public byte[] a;
    public int b;
    public boolean c;

    public class a implements Parcelable.Creator<HMApduRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HMApduRequest createFromParcel(Parcel source) {
            return new HMApduRequest(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HMApduRequest[] newArray(int size) {
            return new HMApduRequest[size];
        }
    }

    public HMApduRequest(byte[] cmd) {
        if (cmd != null && cmd.length > 0) {
            this.a = cmd;
            this.b = cmd.length;
        }
        this.c = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.a;
    }

    public int getDataLen() {
        return this.b;
    }

    public boolean isEncrypt() {
        return this.c;
    }

    public void setData(byte[] data) {
        this.a = data;
    }

    public void setDataLen(int dataLen) {
        this.b = dataLen;
    }

    public void setEncrypt(boolean encrypt) {
        this.c = encrypt;
    }

    public String toString() {
        return "HMApduRequest{data=" + Arrays.toString(this.a) + ", dataLen=" + this.b + ", encrypt=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public HMApduRequest() {
    }

    public HMApduRequest(Parcel in) {
        this.a = in.createByteArray();
        this.b = in.readInt();
        this.c = in.readByte() != 0;
    }
}
