package p006l2;

import e23.l;
import p005kotlin.Unit;
import w2.j0;
import w2.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f108579b;

    public /* synthetic */ j(n nVar, int i14) {
        this.f108578a = i14;
        this.f108579b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f108578a) {
            case 0:
                return new p(this.f108579b);
            case 1:
                n nVar = this.f108579b;
                j0 j0Var = (j0) nVar.f181386v.getF182175a();
                j0 j0Var2 = j0.Cursor;
                if (j0Var == j0Var2) {
                    j0Var2 = j0.None;
                }
                nVar.D(j0Var2);
                return Unit.INSTANCE;
            default:
                this.f108579b.i();
                return Unit.INSTANCE;
        }
    }
}
