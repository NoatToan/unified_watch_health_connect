package com.xiaomi.fitness.keep_alive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.izd;

/* JADX INFO: loaded from: classes9.dex */
public class BootCompletedReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12355a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        izd.b("BootCompletedReceiver onReceiver action:" + action);
        try {
            KeepAliveHelper.Companion companion = KeepAliveHelper.INSTANCE;
            companion.getInstance().updateKeepAlive();
            if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                companion.getInstance().startConnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
