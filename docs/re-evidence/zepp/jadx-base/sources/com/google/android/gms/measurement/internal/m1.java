package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class m1 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzia d;

    public m1(zzia zziaVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.d = zziaVar;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.zzs.zzt().zzw(this.a, null, this.b, this.c);
    }
}
