package com.xiaomi.smarthome.plugin.update;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadRnSdkResult implements Parcelable {
    public static final Parcelable.Creator<DownloadRnSdkResult> CREATOR = new Parcelable.Creator<DownloadRnSdkResult>() { // from class: com.xiaomi.smarthome.plugin.update.DownloadRnSdkResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRnSdkResult createFromParcel(Parcel parcel) {
            return new DownloadRnSdkResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRnSdkResult[] newArray(int i) {
            return new DownloadRnSdkResult[i];
        }
    };
    public static final int FLAG_ON_DOWNINFO_FAILURE = 5;
    public static final int FLAG_ON_DOWNINFO_SUCCESS = 1;
    public static final int FLAG_ON_DOWNLOAD_FAILURE = 6;
    public static final int FLAG_ON_DOWNLOAD_PROGRESS = 2;
    public static final int FLAG_ON_DOWNLOAD_SUCCESS = 3;
    public static final int FLAG_ON_INSTALL_FAILURE = 7;
    public static final int FLAG_ON_INSTALL_SUCCESS = 4;
    public int flag;
    public String msg;
    public float percent;

    public DownloadRnSdkResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.flag);
        parcel.writeString(this.msg);
        parcel.writeFloat(this.percent);
    }

    public DownloadRnSdkResult(int i, String str) {
        this.flag = i;
        this.msg = str;
    }

    public DownloadRnSdkResult(Parcel parcel) {
        this.flag = parcel.readInt();
        this.msg = parcel.readString();
        this.percent = parcel.readFloat();
    }
}
