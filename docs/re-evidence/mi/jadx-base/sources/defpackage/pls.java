package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class pls implements nws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30529a;

    public pls(Context context) {
        this.f30529a = context;
    }

    @Override // defpackage.nws
    public void a(gws gwsVar) {
    }

    @Override // defpackage.nws
    public void b(gws gwsVar) {
        zks.c(this.f30529a);
    }

    @Override // defpackage.nws
    public void a(gws gwsVar, Exception exc) {
    }

    @Override // defpackage.nws
    public void a(gws gwsVar, int i, Exception exc) {
        zks.f(this.f30529a, gwsVar.d(), i);
    }
}
