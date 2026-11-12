package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.kgs;

/* JADX INFO: loaded from: classes5.dex */
public class ExtractionForegroundService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f8981a = new kgs(this);

    public final synchronized void a() {
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f8981a;
    }
}
