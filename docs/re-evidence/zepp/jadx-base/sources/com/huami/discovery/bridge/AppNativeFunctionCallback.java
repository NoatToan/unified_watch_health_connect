package com.huami.discovery.bridge;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public interface AppNativeFunctionCallback {
    void debugMsg(String str, String str2);

    String getDeviceScreenInfo(Context context);

    String getDevicesInfo(Context context);

    int getStatusBarHeight(Context context);

    boolean isLiveEnvironment();

    String locationInfo();

    String navigateTo(Context context, String str);

    void openInNative(Context context, String str, boolean z);

    String openMiniProgram(Context context, String str, int i, String str2, String str3);

    void outputMsg(String str, String str2);

    String pushNotice(String str);

    void thirdMonitor(String str, boolean z, String str2);

    String userAgent(Context context);

    String userInfo();

    String usertoken();
}
