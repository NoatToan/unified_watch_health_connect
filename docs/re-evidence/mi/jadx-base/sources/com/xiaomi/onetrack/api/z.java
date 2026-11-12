package com.xiaomi.onetrack.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
class z extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f13799a;

    public z(h hVar) {
        this.f13799a = hVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            com.xiaomi.onetrack.c.a.a(new aa(this, intent));
        } catch (Throwable unused) {
        }
    }
}
