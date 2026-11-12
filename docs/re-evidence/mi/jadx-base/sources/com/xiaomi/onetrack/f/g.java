package com.xiaomi.onetrack.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes11.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13889a = "OneTrackApp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f13890b;
    private static BroadcastReceiver c = new i();

    private g(Context context) {
        com.xiaomi.onetrack.util.i.a(new h(this, context.getApplicationContext()));
    }

    public static void a(Context context) {
        if (f13890b == null) {
            f13890b = new g(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(c, intentFilter);
    }
}
