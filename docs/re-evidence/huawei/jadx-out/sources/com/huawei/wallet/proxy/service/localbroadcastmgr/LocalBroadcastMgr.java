package com.huawei.wallet.proxy.service.localbroadcastmgr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes45.dex */
public class LocalBroadcastMgr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile LocalBroadcastMgr f30040a;
    private final ILocalBroadcastMgr d;

    private LocalBroadcastMgr(Context context) {
        if (TextUtils.equals(context.getPackageName(), "com.huawei.health")) {
            this.d = new LocalBroadcastAtHealthMgr();
        } else {
            this.d = new LocalBroadcastAtWearGuardMgr(context);
        }
    }

    public static LocalBroadcastMgr c(Context context) {
        if (f30040a == null) {
            synchronized (LocalBroadcastMgr.class) {
                if (f30040a == null) {
                    f30040a = new LocalBroadcastMgr(context);
                }
            }
        }
        return f30040a;
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.d.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void d(BroadcastReceiver broadcastReceiver) {
        this.d.unregisterReceiver(broadcastReceiver);
    }

    public boolean b(Intent intent) {
        return this.d.sendBroadcast(intent);
    }

    public void a(Intent intent) {
        this.d.sendBroadcastSync(intent);
    }
}
