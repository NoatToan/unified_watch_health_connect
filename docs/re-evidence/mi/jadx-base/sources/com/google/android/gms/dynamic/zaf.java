package com.google.android.gms.dynamic;

/* JADX INFO: loaded from: classes4.dex */
final class zaf implements DeferredLifecycleHelper.zaa {
    private final /* synthetic */ DeferredLifecycleHelper zari;

    public zaf(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zari = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final int getState() {
        return 4;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa
    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        this.zari.zare.onStart();
    }
}
