package zz2;

import o4.t0;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a03.p f207695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f207696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f207697d;

    public /* synthetic */ n(a03.p pVar, boolean z14, p1 p1Var, int i14) {
        this.f207694a = i14;
        this.f207695b = pVar;
        this.f207696c = z14;
        this.f207697d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f207694a) {
            case 0:
                t0 t0Var = (t0) obj;
                p1 p1Var = this.f207697d;
                p1Var.getClass();
                t0Var.getClass();
                t0Var.c((((a03.y) this.f207695b.f158i.f178i.getF182175a()) != a03.y.Hidden || ((Boolean) p1Var.getF182175a()).booleanValue() || this.f207696c) ? 1.0f : 0.0f);
                return Unit.INSTANCE;
            default:
                p1 p1Var2 = this.f207697d;
                p1Var2.getClass();
                ((g6.c) obj).getClass();
                a03.p pVar = this.f207695b;
                int iF = (int) pVar.f158i.f();
                if (!pVar.f156g && !((Boolean) p1Var2.getF182175a()).booleanValue() && !this.f207696c) {
                    iF = 0;
                }
                return g6.k.a((((long) iF) & 4294967295L) | (((long) 0) << 32));
        }
    }
}
