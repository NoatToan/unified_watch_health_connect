package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
final class aa extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f53404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f53405b;

    public aa(ad adVar, IBinder iBinder) {
        this.f53404a = iBinder;
        this.f53405b = adVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        this.f53405b.f53407a.f53422o = (IInterface) this.f53405b.f53407a.f53417j.a(this.f53404a);
        ae.r(this.f53405b.f53407a);
        this.f53405b.f53407a.f53415h = false;
        Iterator it = this.f53405b.f53407a.f53412e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f53405b.f53407a.f53412e.clear();
    }
}
