package com.huawei.watchface;

import com.huawei.secure.android.common.util.LogsUtil;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes20.dex */
public abstract class d5 {
    public static void a(String str, String str2, int i, String str3) {
        String str4 = str + Marker.ANY_NON_NULL_MARKER + str2;
        if (i == 0 || i == 1) {
            LogsUtil.d(str4, str3);
            return;
        }
        if (i == 2) {
            LogsUtil.i(str4, str3);
            return;
        }
        if (i == 3) {
            LogsUtil.w(str4, str3);
        } else if (i != 4) {
            LogsUtil.i("WatchFaceLog", "printLog logType is wrong");
        } else {
            LogsUtil.e(str4, str3);
        }
    }
}
