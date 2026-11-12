package kq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f106110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f106111c;

    public /* synthetic */ n0(o0 o0Var, int i14, int i15) {
        this.f106109a = i15;
        this.f106110b = o0Var;
        this.f106111c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f106109a;
        int i15 = this.f106111c;
        o0 o0Var = this.f106110b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = o0.f106115f;
        switch (i14) {
            case 0:
                o0Var.g(mVar, p3.p0.t(i15 | 1));
                break;
            default:
                o0Var.h(mVar, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
