package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.push.service.XMPushService;
import defpackage.ccs;
import defpackage.cts;
import defpackage.x9s;
import defpackage.zxl;

/* JADX INFO: loaded from: classes11.dex */
public class PingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        x9s.B(intent.getPackage() + " is the package name");
        if (XMPushService.m822e()) {
            return;
        }
        if (!ccs.o.equals(intent.getAction())) {
            x9s.o("cancel the old ping timer");
            cts.a();
        } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            x9s.B("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                zxl.h(context).i(intent2);
            } catch (Exception e) {
                x9s.s(e);
            }
        }
    }
}
