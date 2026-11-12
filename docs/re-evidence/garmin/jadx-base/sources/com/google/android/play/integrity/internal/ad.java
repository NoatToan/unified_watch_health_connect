package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes14.dex */
final class ad implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f53407a;

    public /* synthetic */ ad(ae aeVar, ac acVar) {
        this.f53407a = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f53407a.f53410c.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f53407a.c().post(new aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f53407a.f53410c.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f53407a.c().post(new ab(this));
    }
}
