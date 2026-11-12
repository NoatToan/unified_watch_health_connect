package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes3.dex */
final class d3 implements Runnable {
    public final /* synthetic */ ComponentName a;
    public final /* synthetic */ zzjn b;

    public d3(zzjn zzjnVar, ComponentName componentName) {
        this.b = zzjnVar;
        this.a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjo.o(this.b.c, this.a);
    }
}
