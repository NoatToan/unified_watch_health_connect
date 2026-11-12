package health.compact.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.application.BroadcastManager;
import health.compact.a.LogConfig;

/* JADX INFO: loaded from: classes.dex */
public final class LogConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f36602a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f36603b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f36604c = 2;
    private static boolean d = false;
    private static boolean e = false;
    private static BroadcastReceiver f;

    private LogConfig() {
    }

    static void d(boolean z, int i, boolean z2, boolean z3) {
        f36602a = z;
        f36603b = z3;
        if (i < 0 || i > 4) {
            i = 2;
        }
        f36604c = i;
        d = false;
        e = false;
        if (!z2) {
            BroadcastReceiver broadcastReceiver = f;
            if (broadcastReceiver != null) {
                BroadcastManager.o(broadcastReceiver);
                f = null;
                return;
            }
            return;
        }
        if (f != null) {
            return;
        }
        BroadcastReceiver broadcastReceiver2 = new BroadcastReceiver() { // from class: com.huawei.haf.common.log.LogConfig$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("com.huawei.haf.intent.action.DEBUG_SWITCH_LOG".equals(intent.getAction())) {
                    int unused = LogConfig.f36604c = intent.getIntExtra("level", 2);
                    boolean unused2 = LogConfig.d = intent.getBooleanExtra("force", false);
                    boolean unused3 = LogConfig.e = intent.getBooleanExtra("origina", false);
                }
            }
        };
        f = broadcastReceiver2;
        BroadcastManager.e(broadcastReceiver2);
    }

    static boolean e(int i, String str) {
        if (f36603b || d || !b(i) || TextUtils.isEmpty(str)) {
            return f36603b;
        }
        return str.startsWith("HAF_", 0) || str.startsWith("Bundle_", 0);
    }

    public static boolean b(int i) {
        return f36602a && i >= f36604c;
    }

    public static int e() {
        return f36604c;
    }

    public static boolean d() {
        return d;
    }

    public static boolean c() {
        return e;
    }
}
