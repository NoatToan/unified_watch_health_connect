package com.google.android.exoplayer2.upstream;

import android.content.Context;
import defpackage.fxp;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements a.InterfaceC0205a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fxp f8428b;
    public final a.InterfaceC0205a c;

    public d(Context context) {
        this(context, (String) null, (fxp) null);
    }

    @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0205a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a() {
        c cVar = new c(this.f8427a, this.c.a());
        fxp fxpVar = this.f8428b;
        if (fxpVar != null) {
            cVar.f(fxpVar);
        }
        return cVar;
    }

    public d(Context context, String str) {
        this(context, str, (fxp) null);
    }

    public d(Context context, String str, fxp fxpVar) {
        this(context, fxpVar, new e.b().c(str));
    }

    public d(Context context, fxp fxpVar, a.InterfaceC0205a interfaceC0205a) {
        this.f8427a = context.getApplicationContext();
        this.f8428b = fxpVar;
        this.c = interfaceC0205a;
    }
}
