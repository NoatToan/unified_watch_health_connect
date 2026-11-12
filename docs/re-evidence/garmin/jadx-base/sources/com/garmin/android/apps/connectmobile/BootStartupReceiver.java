package com.garmin.android.apps.connectmobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/BootStartupReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BootStartupReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (intent.getAction() == null || !p005kotlin.jvm.internal.s.g(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            return;
        }
        Intent intent2 = new Intent(context, (Class<?>) BootStartupActivity.class);
        intent2.setFlags(1350631424);
        context.startActivity(intent2);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new q0(null), 3);
        ((kd1.j) KoinJavaComponent.get$default(kd1.j.class, null, null, 6, null)).a();
    }
}
