package com.huawei.health.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.utils.LanguageUtils;
import defpackage.lli;
import defpackage.pvb;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class LanguageUtils {

    public static class SystemLocaleChangeReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                HandlerCenter.a().d(new Runnable() { // from class: ipz
                    @Override // java.lang.Runnable
                    public final void run() {
                        LanguageUtils.SystemLocaleChangeReceiver.b();
                    }
                }, 300L);
                ReleaseLogUtil.c("Login_LanguageUtils", "finish allActivity for cause: LanguageChanged reStart");
                BaseApplication.a();
            }
        }

        public static /* synthetic */ void b() {
            lli.e().e(BaseApplication.b());
            pvb.e(BaseApplication.b());
        }
    }
}
