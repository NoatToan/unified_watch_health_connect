package com.xiaomi.smarthome.core.entity.plugin;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class PluginDownloadTask implements Parcelable {
    public static final Parcelable.Creator<PluginDownloadTask> CREATOR = new Parcelable.Creator<PluginDownloadTask>() { // from class: com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginDownloadTask createFromParcel(Parcel parcel) {
            return new PluginDownloadTask(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginDownloadTask[] newArray(int i) {
            return new PluginDownloadTask[i];
        }
    };
    public String mChangeLog;
    public int mDevMode;
    public String mModel;
    public long mPackageId;
    public String mPackageType;
    public long mPluginId;
    public int mTaskId;
    public int mVersion;

    public PluginDownloadTask() {
    }

    public void copyTo(PluginDownloadTask pluginDownloadTask) {
        pluginDownloadTask.mPackageId = this.mPackageId;
        pluginDownloadTask.mTaskId = this.mTaskId;
        pluginDownloadTask.mPackageType = this.mPackageType;
        pluginDownloadTask.mModel = this.mModel;
        pluginDownloadTask.mVersion = this.mVersion;
        pluginDownloadTask.mChangeLog = this.mChangeLog;
        pluginDownloadTask.mPluginId = this.mPluginId;
        pluginDownloadTask.mDevMode = this.mDevMode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getPackageId() {
        return this.mPackageId;
    }

    public String getPackageType() {
        return this.mPackageType;
    }

    public long getPluginId() {
        return this.mPluginId;
    }

    public int getTaskId() {
        return this.mTaskId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mPackageId);
        parcel.writeInt(this.mTaskId);
        parcel.writeString(this.mPackageType);
        parcel.writeString(this.mModel);
        parcel.writeInt(this.mVersion);
        parcel.writeString(this.mChangeLog);
        parcel.writeLong(this.mPluginId);
        parcel.writeInt(this.mDevMode);
    }

    public PluginDownloadTask(Parcel parcel) {
        this.mPackageId = parcel.readLong();
        this.mTaskId = parcel.readInt();
        this.mPackageType = parcel.readString();
        this.mModel = parcel.readString();
        this.mVersion = parcel.readInt();
        this.mChangeLog = parcel.readString();
        this.mPluginId = parcel.readLong();
        this.mDevMode = parcel.readInt();
    }
}
