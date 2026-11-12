package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes8.dex */
public class gsz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f36012b;

    public static void b(Context context) {
        if (!LogConfig.b() || Utils.o()) {
            return;
        }
        LogUtil.a("UploadLogByExceptionReceiver", "Enter register()");
        if (f36012b == null) {
            f36012b = new d();
        }
        BroadcastManagerUtil.b(context, f36012b, new IntentFilter("com.huawei.health.action.UPLOAD_EXCEPTION_LOG"));
    }

    public static void a(Context context) {
        if (f36012b != null) {
            LogUtil.a("UploadLogByExceptionReceiver", "Enter unregister");
            try {
                context.unregisterReceiver(f36012b);
            } catch (IllegalArgumentException e) {
                LogUtil.j("UploadLogByExceptionReceiver", "unregisterUploadLogBroadcast，IllegalArgumentException e = ", e.getMessage());
            } catch (RuntimeException e2) {
                LogUtil.j("UploadLogByExceptionReceiver", "unregisterUploadLogBroadcast，RuntimeException e = ", e2.getMessage());
            }
            f36012b = null;
        }
    }

    static class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("taskMsg");
            LogUtil.d("mUploadLogBroadcastReceiver", "mUploadLogBroadcastReceiver----onReceive: ", stringExtra);
            lfm.b().e(stringExtra);
        }
    }
}
