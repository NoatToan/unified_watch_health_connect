package com.google.firebase.crashlytics.internal.concurrency;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class CrashlyticsWorkers$Companion$checkBackgroundThread$1 extends q implements e23.a<Boolean> {
    public CrashlyticsWorkers$Companion$checkBackgroundThread$1(Object obj) {
        super(0, obj, CrashlyticsWorkers.Companion.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Boolean invoke() {
        return Boolean.valueOf(((CrashlyticsWorkers.Companion) this.receiver).isBackgroundThread());
    }
}
