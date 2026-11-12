package com.brentvatne.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.zh2;

/* JADX INFO: loaded from: classes4.dex */
public class AudioBecomingNoisyReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zh2 f6933b = zh2.r3;

    public AudioBecomingNoisyReceiver(Context context) {
        this.f6932a = context.getApplicationContext();
    }

    public void a() {
        this.f6933b = zh2.r3;
        try {
            this.f6932a.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    public void b(zh2 zh2Var) {
        this.f6933b = zh2Var;
        this.f6932a.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f6933b.a();
        }
    }
}
