package p006l2;

import e23.p;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import z2.h2;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f108500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f108501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f108502d;

    public /* synthetic */ g0(h2 h2Var, e eVar, int i14, int i15) {
        this.f108499a = i15;
        this.f108500b = h2Var;
        this.f108501c = eVar;
        this.f108502d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f108499a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                r0.c(this.f108500b, this.f108501c, mVar, p0.t(this.f108502d | 1));
                break;
            default:
                y.d(this.f108500b, this.f108501c, mVar, p0.t(this.f108502d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
