package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.m9s;
import defpackage.wis;

/* JADX INFO: loaded from: classes5.dex */
public class AssetPackExtractionService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m9s f8980a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f8980a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        wis.a(getApplicationContext()).a(this);
    }
}
