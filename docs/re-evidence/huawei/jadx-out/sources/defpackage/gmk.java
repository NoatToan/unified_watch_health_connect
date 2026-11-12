package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes29.dex */
public class gmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IntentFilter f35731a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LocalBroadcastManager f35732c;
    private BroadcastReceiver d;
    private String e;

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static gmk f35733b = new gmk();
    }

    public static gmk e() {
        return a.f35733b;
    }

    private gmk() {
        this.f35731a = new IntentFilter();
        this.e = "com.huawei.plugin.account.login";
        this.d = new BroadcastReceiver() { // from class: gmk.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LogUtil.a("LogoutCleanManager", "receive account broadcast ");
                if (context == null || intent == null) {
                    ReleaseLogUtil.e("LogoutCleanManager", "BroadcastReceiver context == null || intent == null");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                if ("".equals(gmk.this.e) || !action.equals(gmk.this.e)) {
                    gmk.this.e = action;
                    if ("com.huawei.plugin.account.logout".equals(action)) {
                        ReleaseLogUtil.d("LogoutCleanManager", "receive account remove broadcast");
                        gmk.this.c(true);
                    } else {
                        ReleaseLogUtil.d("LogoutCleanManager", "receive account login broadcast");
                        gmk.this.c(false);
                    }
                }
            }
        };
    }

    private void c() {
        this.f35731a.addAction("com.huawei.plugin.account.logout");
        this.f35731a.addAction("com.huawei.plugin.account.login");
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        this.f35732c = localBroadcastManager;
        localBroadcastManager.registerReceiver(this.d, this.f35731a);
    }

    public static void d() {
        e().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        LogUtil.d("LogoutCleanManager", "clearLocalData");
        gmi.b().b(z);
    }
}
