package com.huawei.hianalytics.util;

import android.content.Context;
import com.huawei.hianalytics.c;
import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes.dex */
public class HiAnalyticTools {
    public static void enableLog(Context context) {
        enableLog(context, 3);
    }

    public static void enableLog(Context context, int i) {
        HiLog.setLogAdapter(new c());
        HiLog.init(i, "FormalHASDK");
    }
}
