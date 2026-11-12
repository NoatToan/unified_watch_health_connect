package com.xiaomi.smarthome.plugin.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadPluginResult implements Parcelable {
    public static final Parcelable.Creator<DownloadPluginResult> CREATOR = new Parcelable.Creator<DownloadPluginResult>() { // from class: com.xiaomi.smarthome.plugin.update.DownloadPluginResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadPluginResult createFromParcel(Parcel parcel) {
            return new DownloadPluginResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadPluginResult[] newArray(int i) {
            return new DownloadPluginResult[i];
        }
    };
    public static final int SUCCESS_ON_CANCEL = 6;
    public static final int SUCCESS_ON_DOWNINFO = 7;
    public static final int SUCCESS_ON_PROGRESS = 3;
    public static final int SUCCESS_ON_START = 1;
    public static final int SUCCESS_ON_SUCCESS = 4;
    public int flag;
    public String model;
    public int msg;
    public float percent;
    public ArrayList<PluginDownloadTask> task;

    public DownloadPluginResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.flag);
        parcel.writeInt(this.msg);
        parcel.writeString(this.model);
        parcel.writeTypedList(this.task);
        parcel.writeFloat(this.percent);
    }

    public DownloadPluginResult(Parcel parcel) {
        this.flag = parcel.readInt();
        this.msg = parcel.readInt();
        this.model = parcel.readString();
        this.task = parcel.createTypedArrayList(PluginDownloadTask.CREATOR);
        this.percent = parcel.readFloat();
    }
}
