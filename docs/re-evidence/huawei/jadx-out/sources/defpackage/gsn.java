package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.huawei.health.MainActivity;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class gsn {
    private static b e;

    public static void e(Context context, Handler handler) {
        LogUtil.a("DataMigrateReceiverHelper", "register BroadReceiver");
        e = new b(handler);
        BroadcastManagerUtil.d(context, e, new IntentFilter("com.huawei.hihealth.action_change_to_cloud_version"), "com.huawei.hihealth.DEFAULT_PERMISSION", null);
    }

    public static void d(Context context) {
        if (e != null) {
            try {
                LogUtil.a("DataMigrateReceiverHelper", "Enter unRegisterPrivicyChange");
                context.unregisterReceiver(e);
                e = null;
            } catch (IllegalArgumentException e2) {
                LogUtil.a("DataMigrateReceiverHelper", "unRegisterPrivicyChange IllegalArgumentException e = ", e2.getMessage());
            } catch (RuntimeException e3) {
                LogUtil.a("DataMigrateReceiverHelper", "unRegisterPrivicyChange RuntimeException e = ", e3.getMessage());
            }
        }
    }

    static class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<Handler> f35990c;

        public b(Handler handler) {
            this.f35990c = new WeakReference<>(handler);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("DataMigrateBeginBroadcastReceiver", "DataMigrateBeginBroadcastReceiver onReceive intent is null");
                return;
            }
            if (intent.getAction() == null) {
                LogUtil.j("DataMigrateBeginBroadcastReceiver", "DataMigrateBeginBroadcastReceiver onReceive getAction is null");
                return;
            }
            LogUtil.a("DataMigrateBeginBroadcastReceiver", "DataMigrateBeginBroadcastReceiver onReceive getAction : ", intent.getAction());
            if ("com.huawei.hihealth.action_change_to_cloud_version".equals(intent.getAction()) && (this.f35990c.get() instanceof MainActivity.j) && this.f35990c.get() != null) {
                LogUtil.a("DataMigrateBeginBroadcastReceiver", "DataMigrateBeginBroadcastReceiver enter");
                if (fns.e()) {
                    this.f35990c.get().sendEmptyMessage(10086);
                }
            }
        }
    }
}
