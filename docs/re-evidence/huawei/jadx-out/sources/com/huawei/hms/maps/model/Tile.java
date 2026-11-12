package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

/* JADX INFO: loaded from: classes34.dex */
public class Tile implements Parcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new maa();
    public final byte[] data;
    public final int height;
    public final int width;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Tile createFromParcel(Parcel parcel) {
            return new Tile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Tile[] newArray(int i) {
            return new Tile[i];
        }

        maa() {
        }
    }

    public Tile(int i, int i2, byte[] bArr) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected Tile(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.data = parcelReader.createByteArray(2, null);
        this.height = parcelReader.readInt(3, 0);
        this.width = parcelReader.readInt(4, 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeByteArray(2, this.data, false);
        parcelWrite.writeInt(3, this.height);
        parcelWrite.writeInt(4, this.width);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }
}
