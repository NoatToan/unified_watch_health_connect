package com.xiaomi.smarthome.plugin.update;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadPluginDebugPackageResult implements Parcelable {
    public static final Parcelable.Creator<DownloadPluginDebugPackageResult> CREATOR = new Parcelable.Creator<DownloadPluginDebugPackageResult>() { // from class: com.xiaomi.smarthome.plugin.update.DownloadPluginDebugPackageResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadPluginDebugPackageResult createFromParcel(Parcel parcel) {
            return new DownloadPluginDebugPackageResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadPluginDebugPackageResult[] newArray(int i) {
            return new DownloadPluginDebugPackageResult[i];
        }
    };
    public static final int SUCCESS_ON_DOWNLOAD_FAILURE = 2;
    public static final int SUCCESS_ON_DOWNLOAD_SUCCESS = 1;
    public static final int SUCCESS_ON_INSTALL_FAILURE = 4;
    public static final int SUCCESS_ON_INSTALL_SUCCESS = 3;
    public String detail;
    public int flag;

    public DownloadPluginDebugPackageResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.flag);
        parcel.writeString(this.detail);
    }

    public DownloadPluginDebugPackageResult(Parcel parcel) {
        this.flag = parcel.readInt();
        this.detail = parcel.readString();
    }
}
