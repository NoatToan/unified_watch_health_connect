package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f53395f;

    public /* synthetic */ w(Context context, v vVar) {
        com.google.android.play.integrity.internal.ay ayVarB = com.google.android.play.integrity.internal.az.b(context);
        this.f53390a = ayVarB;
        com.google.android.play.integrity.internal.bb bbVarB = com.google.android.play.integrity.internal.ax.b(bb.f53328a);
        this.f53391b = bbVarB;
        au auVar = new au(ayVarB, n.f53382a);
        this.f53392c = auVar;
        com.google.android.play.integrity.internal.bb bbVarB2 = com.google.android.play.integrity.internal.ax.b(new bp(ayVarB, bbVarB, auVar, n.f53382a));
        this.f53393d = bbVarB2;
        com.google.android.play.integrity.internal.bb bbVarB3 = com.google.android.play.integrity.internal.ax.b(new bu(bbVarB2));
        this.f53394e = bbVarB3;
        this.f53395f = com.google.android.play.integrity.internal.ax.b(new ba(bbVarB2, bbVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f53395f.a();
    }
}
