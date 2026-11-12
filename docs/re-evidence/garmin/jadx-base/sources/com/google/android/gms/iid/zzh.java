package com.google.android.gms.iid;

import android.content.Intent;

/* JADX INFO: loaded from: classes14.dex */
final class zzh implements Runnable {
    private final /* synthetic */ Intent zzbf;
    private final /* synthetic */ zzg zzbl;

    public zzh(zzg zzgVar, Intent intent) {
        this.zzbl = zzgVar;
        this.zzbf = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new StringBuilder(String.valueOf(this.zzbf.getAction()).length() + 61);
        this.zzbl.finish();
    }
}
