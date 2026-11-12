package p006l2;

import b5.a0;
import b5.r;
import e23.l;
import n4.c;
import p005kotlin.Unit;
import z2.d0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f108477b;

    public /* synthetic */ f2(p2 p2Var, int i14) {
        this.f108476a = i14;
        this.f108477b = p2Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f108476a) {
            case 0:
                long j8 = ((c) obj).f123544a;
                d0.f201550a.getClass();
                this.f108477b.b(j8, d0.a.f201552b);
                break;
            case 1:
                a0 a0Var = (a0) obj;
                this.f108477b.d(r.f(a0Var, false));
                a0Var.a();
                break;
            default:
                a0 a0Var2 = (a0) obj;
                this.f108477b.d(r.f(a0Var2, false));
                a0Var2.a();
                break;
        }
        return Unit.INSTANCE;
    }
}
