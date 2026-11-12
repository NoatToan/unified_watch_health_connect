package com.xiaomi.hm.health.opensdk.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class NfcBlock implements Parcelable {
    public static final Parcelable.Creator<NfcBlock> CREATOR = new a();
    public byte[] data;
    public int flag;
    public int header;
    public int index;

    public class a implements Parcelable.Creator<NfcBlock> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NfcBlock createFromParcel(Parcel source) {
            return new NfcBlock(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NfcBlock[] newArray(int size) {
            return new NfcBlock[size];
        }
    }

    public NfcBlock() {
        this.header = 141;
        this.flag = 255;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.header);
        dest.writeInt(this.flag);
        dest.writeInt(this.index);
        dest.writeByteArray(this.data);
    }

    public NfcBlock(int header, int flag, int index, byte[] data) {
        this.header = 141;
        this.flag = 255;
        this.header = header;
        this.flag = flag;
        this.index = index;
        this.data = data;
    }

    public NfcBlock(Parcel in) {
        this.header = 141;
        this.flag = 255;
        this.header = in.readInt();
        this.flag = in.readInt();
        this.index = in.readInt();
        this.data = in.createByteArray();
    }
}
