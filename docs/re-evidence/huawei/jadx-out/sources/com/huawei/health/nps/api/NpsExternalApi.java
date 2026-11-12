package com.huawei.health.nps.api;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public interface NpsExternalApi {
    boolean isShowDeviceNps();

    boolean isShowNps();

    boolean isWeightDeviceNps();

    void showDeviceNpsPage(Context context);

    void showNpsPage(Context context);
}
