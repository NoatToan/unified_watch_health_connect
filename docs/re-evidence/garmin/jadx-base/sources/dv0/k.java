package dv0;

import m4.g0;
import o53.b0;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f61408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f61409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2.a f61410d;

    public /* synthetic */ k(p1 p1Var, b0 b0Var, i2.a aVar) {
        this.f61407a = 1;
        this.f61408b = p1Var;
        this.f61409c = b0Var;
        this.f61410d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f61407a) {
            case 0:
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                p1 p1Var = this.f61408b;
                if (!((Boolean) p1Var.getF182175a()).booleanValue() && g0Var.a()) {
                    ge1.b.T(this.f61409c, null, null, new p(this.f61410d, null), 3);
                }
                p1Var.setValue(Boolean.valueOf(g0Var.a()));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                this.f61408b.setValue(str);
                ge1.b.T(this.f61409c, null, null, new in1.h(this.f61410d, null), 3);
                break;
            case 2:
                g0 g0Var2 = (g0) obj;
                g0Var2.getClass();
                this.f61408b.setValue(Boolean.valueOf(g0Var2.b()));
                if (g0Var2.b()) {
                    ge1.b.T(this.f61409c, null, null, new uk0.o.d(this.f61410d, null), 3);
                }
                break;
            default:
                g0 g0Var3 = (g0) obj;
                g0Var3.getClass();
                p1 p1Var2 = this.f61408b;
                boolean z14 = !((Boolean) p1Var2.getF182175a()).booleanValue() && g0Var3.a();
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    g0Var3.a();
                }
                if (z14) {
                    ge1.b.T(this.f61409c, null, null, new y01.u(this.f61410d, null), 3);
                }
                p1Var2.setValue(Boolean.valueOf(g0Var3.a()));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(b0 b0Var, p1 p1Var, i2.a aVar, int i14) {
        this.f61407a = i14;
        this.f61409c = b0Var;
        this.f61408b = p1Var;
        this.f61410d = aVar;
    }
}
