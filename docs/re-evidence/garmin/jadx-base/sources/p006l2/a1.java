package p006l2;

import e23.l;
import f5.c0;
import n4.d;
import p005kotlin.Unit;
import z2.h2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f108339b;

    public /* synthetic */ a1(h2 h2Var, int i14) {
        this.f108338a = i14;
        this.f108339b = h2Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        c0 c0VarC;
        switch (this.f108338a) {
            case 0:
                return new e1(this.f108339b);
            case 1:
                this.f108339b.B();
                return Unit.INSTANCE;
            default:
                c0 c0Var = (c0) obj;
                h2 h2Var = this.f108339b;
                d dVarO = h2Var.o();
                b2 b2Var = h2Var.f201607d;
                if (b2Var == null || (c0VarC = b2Var.c()) == null) {
                    return null;
                }
                return r2.l.b(dVarO, c0VarC, c0Var);
        }
    }
}
