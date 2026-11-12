package com.xiaomi.smarthome.server.entity;

import com.xiaomi.smarthome.server.PluginDownloadTask;

/* JADX INFO: loaded from: classes2.dex */
public class PluginUpdateInfoResult {
    public String mChangeLog;
    public int mDevMode;
    public String mDownloadUrl;
    public long mLength;
    public String mModel;
    public long mPackageId;
    public String mPackgeType;
    public long mPluginId;
    public String mSafeUrl;
    public int mNewVersion = 0;
    public int mForce = 0;
    public int mVersion = 0;
    public long rnSdkApiLevel = 0;

    public boolean hasNewVersion() {
        return this.mNewVersion == 1;
    }

    public boolean isForce() {
        return this.mForce == 1;
    }

    public void setTask(PluginDownloadTask pluginDownloadTask) {
        if (pluginDownloadTask == null) {
            return;
        }
        pluginDownloadTask.setRnSdkLevel(this.rnSdkApiLevel);
        pluginDownloadTask.setPluginId(this.mPluginId);
        pluginDownloadTask.setPackageId(this.mPackageId);
        pluginDownloadTask.setPackageType(this.mPackgeType);
        pluginDownloadTask.setPackageUrl(this.mDownloadUrl);
        pluginDownloadTask.setPackageSafeUrl(this.mSafeUrl);
        pluginDownloadTask.setPackageLength(this.mLength);
        pluginDownloadTask.setVersion(this.mVersion);
        pluginDownloadTask.setChangeLog(this.mChangeLog);
        pluginDownloadTask.setIsForce(isForce());
        pluginDownloadTask.setDevMode(this.mDevMode);
    }
}
