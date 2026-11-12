package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f66623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f66624c;

    public /* synthetic */ n1(q1 q1Var, int i14, int i15) {
        this.f66622a = i15;
        this.f66623b = q1Var;
        this.f66624c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66622a;
        int i15 = this.f66624c;
        q1 q1Var = this.f66623b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        q1.a aVar = q1.f66677f;
        switch (i14) {
            case 0:
                q1Var.G6(mVar, p3.p0.t(i15 | 1));
                break;
            default:
                q1Var.H6(mVar, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
