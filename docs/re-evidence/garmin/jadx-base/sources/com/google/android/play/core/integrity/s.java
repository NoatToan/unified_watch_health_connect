package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53388e;

    public /* synthetic */ s(Context context, r rVar) {
        com.google.android.play.integrity.internal.ay ayVarB = com.google.android.play.integrity.internal.az.b(context);
        this.f53384a = ayVarB;
        com.google.android.play.integrity.internal.bb bbVarB = com.google.android.play.integrity.internal.ax.b(ac.f53275a);
        this.f53385b = bbVarB;
        au auVar = new au(ayVarB, l.f53377a);
        this.f53386c = auVar;
        com.google.android.play.integrity.internal.bb bbVarB2 = com.google.android.play.integrity.internal.ax.b(new al(ayVarB, bbVarB, auVar, l.f53377a));
        this.f53387d = bbVarB2;
        this.f53388e = com.google.android.play.integrity.internal.ax.b(new ab(bbVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f53388e.a();
    }
}
