package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
final class v implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ GoogleApiManager a;

    public v(GoogleApiManager googleApiManager) {
        this.a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        this.a.p.sendMessage(this.a.p.obtainMessage(1, Boolean.valueOf(z)));
    }
}
