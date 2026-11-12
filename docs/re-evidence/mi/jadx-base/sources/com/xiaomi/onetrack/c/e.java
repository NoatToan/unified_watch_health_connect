package com.xiaomi.onetrack.c;

import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f13837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f13838b;

    public e(d dVar, Intent intent) {
        this.f13838b = dVar;
        this.f13837a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        String action = this.f13837a.getAction();
        if (action.equals("android.intent.action.SCREEN_OFF") || action.equals("android.intent.action.SCREEN_ON")) {
            com.xiaomi.onetrack.util.p.a("EventManager", "screen on/off");
            q.a().a(action.equals("android.intent.action.SCREEN_ON") ? 0 : 2, false);
            com.xiaomi.onetrack.a.c.b.a().b();
        }
    }
}
