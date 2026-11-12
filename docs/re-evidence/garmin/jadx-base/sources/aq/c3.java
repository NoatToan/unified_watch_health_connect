package aq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f11877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11878c;

    public /* synthetic */ c3(e3 e3Var, int i14, int i15) {
        this.f11876a = i15;
        this.f11877b = e3Var;
        this.f11878c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f11876a;
        int i15 = this.f11878c;
        e3 e3Var = this.f11877b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = e3.f11927f;
        switch (i14) {
            case 0:
                e3Var.j(mVar, p3.p0.t(i15 | 1));
                break;
            case 1:
                e3Var.h(mVar, p3.p0.t(i15 | 1));
                break;
            case 2:
                e3Var.k(mVar, p3.p0.t(i15 | 1));
                break;
            default:
                e3Var.i(mVar, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
