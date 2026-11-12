package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
final class c implements Runnable {
    private final /* synthetic */ zaaf a;

    public c(zaaf zaafVar) {
        this.a = zaafVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.cancelAvailabilityErrorNotifications(this.a.c);
    }
}
