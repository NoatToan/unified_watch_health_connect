package com.ingenic.iwds.remotedevice;

import android.content.pm.PackageStats;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface RemoteDeviceAppListener {
    void onDoneDeleteApp(String str, int i);

    void onDoneInstallApp(String str, int i);

    void onRemoteAppInfoListAvailable(List<RemoteApplicationInfo> list);

    void onRemoteStorageInfoAvailable(RemoteStorageInfo remoteStorageInfo);

    void onResponseClearAllAppDataAndCache(int i, int i2, String str, int i3, int i4);

    void onResponseClearAppDataOrCache(String str, int i, int i2);

    void onResponsePkgSizeInfo(PackageStats packageStats, int i);

    void onSendFileProgressForInstall(String str, int i);
}
