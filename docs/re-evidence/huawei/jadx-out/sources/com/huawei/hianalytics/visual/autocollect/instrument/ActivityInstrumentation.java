package com.huawei.hianalytics.visual.autocollect.instrument;

import android.content.Intent;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.f1;

/* JADX INFO: loaded from: classes33.dex */
public class ActivityInstrumentation {
    public static void instrumentStartActivity(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (!intent.hasExtra("$sessionid") && !intent.hasExtra("$sessiontime")) {
                f1 f1Var = f1.f11642b;
                intent.putExtra("$sessionid", f1Var.f11643a.f11635a);
                intent.putExtra("$sessiontime", f1Var.f11643a.f11636b);
            }
        } catch (Exception unused) {
            HiLog.e("ActivityInstrumentation", "instrumentStartActivity failed");
        }
    }
}
