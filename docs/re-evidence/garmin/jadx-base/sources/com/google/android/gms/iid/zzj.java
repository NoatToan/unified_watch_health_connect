package com.google.android.gms.iid;

/* JADX INFO: loaded from: classes14.dex */
final class zzj implements Runnable {
    private final /* synthetic */ zzg zzbn;
    private final /* synthetic */ zzi zzbo;

    public zzj(zzi zziVar, zzg zzgVar) {
        this.zzbo = zziVar;
        this.zzbn = zzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbo.zzbm.handleIntent(this.zzbn.intent);
        this.zzbn.finish();
    }
}
