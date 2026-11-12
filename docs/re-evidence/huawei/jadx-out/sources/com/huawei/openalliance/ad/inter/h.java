package com.huawei.openalliance.ad.inter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bl;
import com.huawei.openalliance.ad.utils.o;

/* JADX INFO: loaded from: classes12.dex */
public class h extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile h f19240a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (Constants.KIT_PRELOAD_ACTION.equalsIgnoreCase(new SafeIntent(intent).getAction())) {
                hw.a("KitPreloadReceiver", "onReceive kit preload");
                bl.a(context.getApplicationContext());
            }
        } catch (Throwable th) {
            hw.c("KitPreloadReceiver", "onReceive Exception: %s", th.getClass().getSimpleName());
        }
    }

    public static void a(final Context context) {
        o.g(new Runnable() { // from class: com.huawei.openalliance.ad.inter.h.1
            @Override // java.lang.Runnable
            public void run() {
                if (context != null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(Constants.KIT_PRELOAD_ACTION);
                    if (h.f19240a == null) {
                        h unused = h.f19240a = new h();
                    }
                    as.a(context, h.f19240a, intentFilter, Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
                }
            }
        });
    }
}
