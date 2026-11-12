package com.huawei.openalliance.ad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes12.dex */
public class hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18873a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static hi f18874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18875c;
    private BroadcastReceiver d;

    public void b() {
        if (this.d != null) {
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.hi.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        hw.b("LinkedAdStatusHandler", "unregisterPpsReceiver");
                        hi.this.f18875c.unregisterReceiver(hi.this.d);
                    } catch (Throwable th) {
                        try {
                            hw.b("LinkedAdStatusHandler", "unregister error," + th.getClass().getSimpleName());
                        } finally {
                            hi.this.d = null;
                        }
                    }
                }
            });
        }
    }

    public void a(final BroadcastReceiver broadcastReceiver) {
        hw.a("LinkedAdStatusHandler", "registerPpsReceiver ");
        if (this.d != null) {
            b();
        }
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.hi.1
            @Override // java.lang.Runnable
            public void run() {
                IntentFilter intentFilter = new IntentFilter("com.huawei.hms.pps.action.LINKED_AD_STATUS_CHANGED");
                intentFilter.addAction("com.huawei.hms.pps.action.AD_DETAIL_CLOSED");
                hi.this.d = broadcastReceiver;
                com.huawei.openalliance.ad.utils.as.a(hi.this.f18875c, hi.this.d, intentFilter, Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
                hw.b("LinkedAdStatusHandler", "registerPpsReceiver");
            }
        });
    }

    public void a() {
        a(new a());
    }

    private static hi b(Context context) {
        hi hiVar;
        synchronized (hi.class) {
            synchronized (f18873a) {
                if (f18874b == null) {
                    f18874b = new hi(context);
                }
                hiVar = f18874b;
            }
        }
        return hiVar;
    }

    public static hi a(Context context) {
        return b(context);
    }

    static class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if ("com.huawei.hms.pps.action.LINKED_AD_STATUS_CHANGED".equals(intent.getAction())) {
                    boolean booleanExtra = intent.getBooleanExtra("linked_ad_played_in_linked", false);
                    int intExtra = intent.getIntExtra("linked_ad_play_progress", 0);
                    hw.b("LinkedAdStatusHandler", "LinkedAdBroadcastReceiver playProgress " + intExtra);
                    hg hgVar = new hg();
                    hgVar.b(booleanExtra);
                    hgVar.a(intExtra);
                    hh.a(hgVar);
                }
            } catch (Throwable th) {
                hw.c("LinkedAdStatusHandler", "LinkedAdBroadcastReceiver error: %s", th.getClass().getSimpleName());
            }
        }

        private a() {
        }
    }

    private hi(Context context) {
        if (context != null) {
            this.f18875c = context.getApplicationContext();
        }
    }
}
