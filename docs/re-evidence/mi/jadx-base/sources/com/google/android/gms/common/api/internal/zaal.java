package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zaal implements Runnable {
    private final /* synthetic */ zaak zagi;

    public zaal(zaak zaakVar) {
        this.zagi = zaakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zagi.zaex.cancelAvailabilityErrorNotifications(this.zagi.mContext);
    }
}
