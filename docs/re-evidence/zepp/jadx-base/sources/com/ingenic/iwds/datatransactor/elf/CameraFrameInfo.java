package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class CameraFrameInfo implements Parcelable {
    public static final Parcelable.Creator<CameraFrameInfo> CREATOR = new Parcelable.Creator<CameraFrameInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.CameraFrameInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraFrameInfo createFromParcel(Parcel parcel) {
            CameraFrameInfo cameraFrameInfo = new CameraFrameInfo();
            byte[] bArr = new byte[parcel.readInt()];
            cameraFrameInfo.frameData = bArr;
            parcel.readByteArray(bArr);
            return cameraFrameInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CameraFrameInfo[] newArray(int i) {
            return new CameraFrameInfo[i];
        }
    };
    public byte[] frameData;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "CameraFrameInfo [frameData=" + Arrays.toString(this.frameData) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.frameData.length);
        parcel.writeByteArray(this.frameData);
    }
}
