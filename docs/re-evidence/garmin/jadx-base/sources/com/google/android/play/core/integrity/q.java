package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f53383a;

    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.f53383a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        com.google.android.play.integrity.internal.ba.a(this.f53383a, Context.class);
        return new s(this.f53383a, null);
    }

    private q() {
        throw null;
    }
}
