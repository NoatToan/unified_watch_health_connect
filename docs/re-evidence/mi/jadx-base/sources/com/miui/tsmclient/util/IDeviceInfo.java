package com.miui.tsmclient.util;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface IDeviceInfo {
    String getDeviceFirmwareVersion();

    String getDeviceId(Context context);

    String getDeviceModel();

    int getDeviceType();

    List<String> getSIMNumber();

    boolean isEseEnabled(Context context);
}
