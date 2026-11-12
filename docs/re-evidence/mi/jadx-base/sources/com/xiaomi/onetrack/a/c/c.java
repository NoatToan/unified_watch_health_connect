package com.xiaomi.onetrack.a.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f13710a;

    public c(b bVar) {
        this.f13710a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f13710a.d != null) {
            this.f13710a.d.sendEmptyMessage(10);
        }
    }
}
