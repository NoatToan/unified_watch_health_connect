package com.google.android.gms.wearable;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzp implements Runnable {
    private final /* synthetic */ WearableListenerService.zzd zzao;
    private final /* synthetic */ List zzar;

    zzp(WearableListenerService.zzd zzdVar, List list) {
        this.zzao = zzdVar;
        this.zzar = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService.this.onConnectedNodes(this.zzar);
    }
}
