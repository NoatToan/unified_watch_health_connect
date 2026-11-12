package com.huawei.hianalytics.visual;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public abstract class l {
    public static void a() {
        JSONObject jSONObject = new JSONObject();
        k kVar = TextUtils.isEmpty("app_install") ? null : new k(s0.f11693a);
        if (kVar == null) {
            HiLog.d("AppInstallUtils", "fail to collect app install event");
        } else {
            if (((Boolean) kVar.a()).booleanValue()) {
                return;
            }
            w.a().a("$AppInstall", jSONObject);
            kVar.a(Boolean.TRUE);
        }
    }

    public static void b() {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.l$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                l.a();
            }
        });
    }
}
