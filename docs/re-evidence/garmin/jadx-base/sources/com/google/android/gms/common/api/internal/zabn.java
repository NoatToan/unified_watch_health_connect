package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes14.dex */
final class zabn implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabq zab;

    public zabn(zabq zabqVar, int i14) {
        this.zab = zabqVar;
        this.zaa = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }
}
