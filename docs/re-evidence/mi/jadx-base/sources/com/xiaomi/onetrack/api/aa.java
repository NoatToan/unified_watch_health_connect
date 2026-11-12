package com.xiaomi.onetrack.api;

import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f13715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f13716b;

    public aa(z zVar, Intent intent) {
        this.f13716b = zVar;
        this.f13715a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String action = this.f13715a.getAction();
            com.xiaomi.onetrack.util.p.a("OneTrackImp", "screenReceiver act: " + action);
            if (TextUtils.isEmpty(action)) {
                return;
            }
            if (!action.equals("android.intent.action.SCREEN_OFF") && !action.equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            com.xiaomi.onetrack.c.i.a(this.f13716b.f13799a.f13768b);
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.a("OneTrackImp", "screenReceiver exception: ", e);
        }
    }
}
