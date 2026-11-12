package com.xiaomi.hm.health.opensdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class HMApduResponse implements Parcelable {
    public static final Parcelable.Creator<HMApduResponse> CREATOR = new a();
    public byte[] a;
    public int b;
    public int c;

    public class a implements Parcelable.Creator<HMApduResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HMApduResponse createFromParcel(Parcel source) {
            return new HMApduResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HMApduResponse[] newArray(int size) {
            return new HMApduResponse[size];
        }
    }

    public HMApduResponse(byte[] data, int len, int state) {
        this.a = data;
        this.b = len;
        this.c = state;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.a;
    }

    public int getLen() {
        return this.b;
    }

    public int getState() {
        return this.c;
    }

    public boolean isSuccess() {
        return this.c == 0;
    }

    public void setData(byte[] data) {
        this.a = data;
    }

    public void setLen(int len) {
        this.b = len;
    }

    public void setState(int state) {
        this.c = state;
    }

    public String toString() {
        return "HMApduResponse{data=" + Arrays.toString(this.a) + ", len=" + this.b + ", state=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByteArray(this.a);
        dest.writeInt(this.b);
    }

    public HMApduResponse(int state) {
        this.c = state;
    }

    public HMApduResponse() {
    }

    public HMApduResponse(Parcel in) {
        this.a = in.createByteArray();
        this.b = in.readInt();
    }
}
