package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class iyb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38195b = SecurityConstant.f5920a;

    public static final void e(Context context, Intent intent) {
        if (intent == null || context == null) {
            LogUtil.e("Track_BroadcastManagerUtil", "intent is null");
            return;
        }
        LogUtil.a("Track_BroadcastManagerUtil", "broadcast", intent.getAction());
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        intent.setPackage(context.getPackageName());
        if (localBroadcastManager != null) {
            localBroadcastManager.sendBroadcast(intent);
        }
    }

    public static final void d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context == null) {
            LogUtil.e("Track_BroadcastManagerUtil", "context is null");
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            localBroadcastManager.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static final void a(Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null) {
            LogUtil.e("Track_BroadcastManagerUtil", "context is null");
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            localBroadcastManager.unregisterReceiver(broadcastReceiver);
        }
    }

    public static void a(Context context, Intent intent) {
        if (intent == null || context == null) {
            LogUtil.e("Track_BroadcastManagerUtil", "intent or context is null");
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            localBroadcastManager.sendBroadcast(intent);
        }
    }
}
