package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
final class j1 implements Runnable {
    public final /* synthetic */ LifecycleCallback a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzd c;

    public j1(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = zzdVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.c;
        if (zzdVar.b > 0) {
            this.a.onCreate(zzdVar.c != null ? zzdVar.c.getBundle(this.b) : null);
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
