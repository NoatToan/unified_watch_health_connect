package ky0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f107436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f107437c;

    public /* synthetic */ n0(o53.b0 b0Var, w0 w0Var, int i14) {
        this.f107435a = i14;
        this.f107436b = b0Var;
        this.f107437c = w0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f107435a) {
            case 0:
                ge1.b.T(this.f107436b, null, null, new s0.h(this.f107437c, null), 3);
                break;
            case 1:
                ge1.b.T(this.f107436b, null, null, new s0.c(this.f107437c, null), 3);
                break;
            default:
                ge1.b.T(this.f107436b, null, null, new s0.e(this.f107437c, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
