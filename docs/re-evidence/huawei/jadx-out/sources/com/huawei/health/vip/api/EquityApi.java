package com.huawei.health.vip.api;

import android.content.Context;
import com.huawei.basefitnessadvice.callback.DataCallback;

/* JADX INFO: loaded from: classes9.dex */
public interface EquityApi {
    void getDoctorBasicInfo(DataCallback dataCallback);

    void showDeviceEquityDialog(Object obj, Context context, int i, long j, int i2);
}
