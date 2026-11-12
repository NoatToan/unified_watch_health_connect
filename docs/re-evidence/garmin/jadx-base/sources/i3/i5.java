package i3;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i5 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3 f88398b;

    public /* synthetic */ i5(p3.x3 x3Var, int i14) {
        this.f88397a = i14;
        this.f88398b = x3Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f88397a;
        p3.x3 x3Var = this.f88398b;
        switch (i14) {
            case 0:
                q4.f fVar = (q4.f) obj;
                k5 k5Var = k5.f88664a;
                long j8 = ((o4.d0) x3Var.getF182175a()).f128833a;
                o4.d0.f128823b.getClass();
                if (!o4.d0.d(j8, o4.d0.f128832k)) {
                    q4.f.A0(fVar, j8, 0L, 0L, 0.0f, null, null, 126);
                }
                return Unit.INSTANCE;
            case 1:
                ((o4.t0) obj).c(((Number) x3Var.getF182175a()).floatValue());
                return Unit.INSTANCE;
            case 2:
                return g6.k.a((((long) ((g6.c) obj).f0(((g6.f) x3Var.getF182175a()).f75997a)) << 32) | (((long) 0) & 4294967295L));
            case 3:
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                if (!((Boolean) x3Var.getF182175a()).booleanValue()) {
                    ii0.g.f93601a.getClass();
                    e2.f0.b(f0Var, null, ii0.g.f93602b, 3);
                }
                return Unit.INSTANCE;
            case 4:
                ((e23.l) x3Var.getF182175a()).invoke((n4.c) obj);
                return Unit.INSTANCE;
            case 5:
                ((o4.t0) obj).c(((Number) x3Var.getF182175a()).floatValue());
                return Unit.INSTANCE;
            case 6:
                ((o4.t0) obj).c(((Number) x3Var.getF182175a()).floatValue());
                return Unit.INSTANCE;
            case 7:
                ((o4.t0) obj).c(((Number) x3Var.getF182175a()).floatValue());
                return Unit.INSTANCE;
            case 8:
                e2.f0 f0Var2 = (e2.f0) obj;
                f0Var2.getClass();
                List list = (List) x3Var.getF182175a();
                f0Var2.a(list.size(), null, new p72.d.c(p72.d.b.f136322a, list), new z3.e(802480018, true, new p72.d.C2581d(list)));
                p72.a.f136312a.getClass();
                e2.f0.b(f0Var2, null, p72.a.f136314c, 3);
                return Unit.INSTANCE;
            case 9:
                o4.t0 t0Var = (o4.t0) obj;
                t0Var.getClass();
                t0Var.k(((Number) x3Var.getF182175a()).floatValue());
                return Unit.INSTANCE;
            case 10:
                o4.t0 t0Var2 = (o4.t0) obj;
                t0Var2.getClass();
                t0Var2.k(((Number) x3Var.getF182175a()).floatValue());
                return Unit.INSTANCE;
            default:
                o4.t0 t0Var3 = (o4.t0) obj;
                t0Var3.getClass();
                t0Var3.k(((Number) x3Var.getF182175a()).floatValue());
                return Unit.INSTANCE;
        }
    }
}
