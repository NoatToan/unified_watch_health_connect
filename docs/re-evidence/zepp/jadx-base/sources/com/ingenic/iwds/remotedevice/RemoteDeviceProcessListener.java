package com.ingenic.iwds.remotedevice;

import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface RemoteDeviceProcessListener {
    void onDoneKillProcess(String str);

    void onResponseRunningAppProcessInfo(List<RemoteProcessInfo> list);

    void onResponseSystemMemoryInfo(long j, long j2);
}
