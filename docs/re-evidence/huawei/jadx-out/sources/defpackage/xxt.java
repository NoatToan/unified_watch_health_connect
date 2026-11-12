package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.huawei.wallet.proxy.service.localbroadcastmgr.LocalBroadcastMgr;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.wear.wallet.proxy.broadcaster.ForegroundStatusChangeReceiver;

/* JADX INFO: loaded from: classes46.dex */
public class xxt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile xxt f53307b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f53308a = false;
    private final ForegroundStatusChangeReceiver e = new ForegroundStatusChangeReceiver();

    public static xxt a() {
        if (f53307b == null) {
            synchronized (d) {
                if (f53307b == null) {
                    f53307b = new xxt();
                }
            }
        }
        return f53307b;
    }

    public void b(Context context) {
        if (this.f53308a) {
            xnd.d("BroadcastReceiverRegManager", "hasRegisterForegroundStatusChanged");
        } else {
            if (context == null) {
                xnd.a("BroadcastReceiverRegManager", "invalid context");
                return;
            }
            LocalBroadcastMgr.c(context).a(this.e, new IntentFilter(HwWatchFaceApi.ACTION_FOREGROUND_STATUS));
            this.f53308a = true;
            xnd.d("BroadcastReceiverRegManager", "registerForegroundStatusChange complete");
        }
    }
}
