package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public final class al implements com.google.android.play.integrity.internal.ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f53298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f53299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f53300c;

    public al(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2, com.google.android.play.integrity.internal.bd bdVar3, com.google.android.play.integrity.internal.bd bdVar4) {
        this.f53298a = bdVar;
        this.f53299b = bdVar2;
        this.f53300c = bdVar3;
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.f53298a.a(), (com.google.android.play.integrity.internal.s) this.f53299b.a(), ((au) this.f53300c).a(), new i());
    }
}
