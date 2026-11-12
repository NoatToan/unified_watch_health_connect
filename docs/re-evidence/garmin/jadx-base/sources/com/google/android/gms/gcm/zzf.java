package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes14.dex */
final class zzf extends com.google.android.gms.internal.gcm.zzj {
    private final /* synthetic */ GoogleCloudMessaging zzak;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(GoogleCloudMessaging googleCloudMessaging, Looper looper) {
        super(looper);
        this.zzak = googleCloudMessaging;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message != null) {
            boolean z14 = message.obj instanceof Intent;
        }
        Intent intent = (Intent) message.obj;
        boolean zEquals = "com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction());
        GoogleCloudMessaging googleCloudMessaging = this.zzak;
        if (zEquals) {
            googleCloudMessaging.zzai.add(intent);
        } else {
            if (googleCloudMessaging.zzd(intent)) {
                return;
            }
            intent.setPackage(this.zzak.zzl.getPackageName());
            this.zzak.zzl.sendBroadcast(intent);
        }
    }
}
