package health.compact.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.utils.PermissionUtil;

/* JADX INFO: loaded from: classes.dex */
public class BroadcastManagerUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36518c = SecurityConstant.f5920a;

    private BroadcastManagerUtil() {
    }

    public static final void a(Context context, Intent intent, String str, boolean z) {
        if (context == null || str == null || intent == null) {
            return;
        }
        if (z) {
            intent.setPackage(context.getPackageName());
        }
        intent.setPackage(context.getPackageName());
        com.huawei.hwlogsmodel.LogUtil.d("BroadcastManagerUtil", "broadcast", intent.getAction());
        context.sendBroadcast(intent, str);
    }

    public static final void e(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        intent.setPackage(context.getPackageName());
        com.huawei.hwlogsmodel.LogUtil.a("BroadcastManagerUtil", "broadcast: ", intent.getAction());
        context.sendBroadcast(intent, f36518c);
    }

    public static final void d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return;
        }
        d(context, broadcastReceiver, intentFilter, f36518c, null);
    }

    public static final void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null || broadcastReceiver == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
    }

    public static final void b(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.a("BroadcastManagerUtil", "broadcast", intent.getAction());
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        intent.setPackage(context.getPackageName());
        if (localBroadcastManager != null) {
            localBroadcastManager.sendBroadcast(intent);
        }
    }

    public static final void e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            localBroadcastManager.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static void d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        if (context == null) {
            context = BaseApplication.b();
        }
        Context context2 = context;
        if (PermissionUtil.f()) {
            context2.registerReceiver(broadcastReceiver, intentFilter, str, handler, 4);
        } else {
            context2.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        }
    }

    public static void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        if (context == null && (context = BaseApplication.b()) == null) {
            return;
        }
        Context context2 = context;
        if (PermissionUtil.f()) {
            context2.registerReceiver(broadcastReceiver, intentFilter, str, handler, 2);
        } else {
            context2.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        }
    }

    public static void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context == null) {
            context = BaseApplication.b();
        }
        if (PermissionUtil.f()) {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context == null) {
            context = BaseApplication.b();
        }
        if (PermissionUtil.f()) {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static final void b(Context context, BroadcastReceiver broadcastReceiver) {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            localBroadcastManager.unregisterReceiver(broadcastReceiver);
        }
    }

    public static void a(Context context, Intent intent) {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            localBroadcastManager.sendBroadcast(intent);
        }
    }
}
