package android.hardware.fingerprint.heartrate;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class HeartRateCmdResult implements Parcelable {
    public static final Parcelable.Creator<HeartRateCmdResult> CREATOR = new Parcelable.Creator<HeartRateCmdResult>() { // from class: android.hardware.fingerprint.heartrate.HeartRateCmdResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HeartRateCmdResult createFromParcel(Parcel parcel) {
            return new HeartRateCmdResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HeartRateCmdResult[] newArray(int i) {
            return new HeartRateCmdResult[i];
        }
    };
    public int mResultCode;
    public byte[] mResultData;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mResultCode);
        byte[] bArr = this.mResultData;
        if (bArr == null || bArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeByteArray(bArr);
        }
    }

    public HeartRateCmdResult() {
        this.mResultCode = 0;
        this.mResultData = null;
    }

    private HeartRateCmdResult(Parcel parcel) {
        this.mResultCode = 0;
        this.mResultData = null;
        this.mResultCode = parcel.readInt();
        this.mResultData = parcel.createByteArray();
    }

    public HeartRateCmdResult(int i, byte[] bArr) {
        this.mResultData = null;
        this.mResultCode = i;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.mResultData = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
