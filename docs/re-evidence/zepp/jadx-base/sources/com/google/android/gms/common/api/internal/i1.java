package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
final class i1 implements Runnable {
    public final /* synthetic */ LifecycleCallback a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzb c;

    public i1(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = zzbVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.c;
        if (zzbVar.b > 0) {
            this.a.onCreate(zzbVar.c != null ? zzbVar.c.getBundle(this.b) : null);
        }
        if (this.c.b >= 2) {
            this.a.onStart();
        }
        if (this.c.b >= 3) {
            this.a.onResume();
        }
        if (this.c.b >= 4) {
            this.a.onStop();
        }
        if (this.c.b >= 5) {
            this.a.onDestroy();
        }
    }
}
