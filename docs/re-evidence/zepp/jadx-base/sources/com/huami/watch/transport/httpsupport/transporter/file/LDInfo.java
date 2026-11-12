package com.huami.watch.transport.httpsupport.transporter.file;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class LDInfo implements Parcelable {
    public static final Parcelable.Creator<LDInfo> CREATOR = new a();
    public String CMD;
    public String fileName;
    public int index;
    public String md5;

    public static final class a implements Parcelable.Creator<LDInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDInfo createFromParcel(Parcel parcel) {
            return new LDInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LDInfo[] newArray(int i) {
            return new LDInfo[i];
        }
    }

    public LDInfo() {
    }

    public LDInfo(Parcel parcel) {
        this.fileName = parcel.readString();
        this.index = parcel.readInt();
        this.CMD = parcel.readString();
        this.md5 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fileName);
        parcel.writeInt(this.index);
        parcel.writeString(this.CMD);
        parcel.writeString(this.md5);
    }
}
