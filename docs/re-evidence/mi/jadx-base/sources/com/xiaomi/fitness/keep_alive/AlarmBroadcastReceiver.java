package com.xiaomi.fitness.keep_alive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.izd;

/* JADX INFO: loaded from: classes9.dex */
public class AlarmBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f12354a = false;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        f12354a = true;
        try {
            izd.b("AlarmBroadcastReceiver.onReceive");
            KeepAliveHelper.Companion companion = KeepAliveHelper.INSTANCE;
            companion.getInstance().startConnect();
            companion.getInstance().startService();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
