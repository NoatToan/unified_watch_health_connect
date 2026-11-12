package com.huawei.hms.support.api.safetydetect;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.support.api.safetydetect.p001default.u;
import com.huawei.hms.utils.Checker;

/* JADX INFO: loaded from: classes34.dex */
public class SafetyDetect {
    public static SafetyDetectClient getClient(Context context) {
        Checker.assertNonNull(context);
        return new a(context, new u());
    }

    public static SafetyDetectClient getClient(Activity activity) {
        Checker.assertNonNull(activity);
        return new a(activity, new u());
    }
}
