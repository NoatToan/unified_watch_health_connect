package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes.dex */
public class gta {
    public static void b() {
        BroadcastManager.c(new e());
        BaseApplication.b().registerReceiver(new b(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
    }

    static class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ReleaseLogUtil.c("SystemInfoChangedReceiverHelper", "action = ", intent.getAction());
            if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                iqu.a();
                gms.a().c();
            }
        }
    }

    static class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ReleaseLogUtil.c("SystemInfoChangedReceiverHelper", "action = ", intent.getAction());
            if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
                iqu.b();
            }
        }
    }
}
