package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class q1 extends ContentObserver {
    public final /* synthetic */ zzha a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(zzha zzhaVar, Handler handler) {
        super(null);
        this.a = zzhaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.zzf();
    }
}
