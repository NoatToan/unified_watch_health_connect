package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes14.dex */
public final class ba implements com.google.android.play.integrity.internal.ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f53326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f53327b;

    public ba(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2) {
        this.f53326a = bdVar;
        this.f53327b = bdVar2;
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final /* bridge */ /* synthetic */ Object a() {
        com.google.android.play.integrity.internal.bd bdVar = this.f53327b;
        return new az((bn) this.f53326a.a(), (bt) bdVar.a());
    }
}
