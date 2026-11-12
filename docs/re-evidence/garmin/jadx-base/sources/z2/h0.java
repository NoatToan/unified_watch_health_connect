package z2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f201602b;

    public /* synthetic */ h0(o1 o1Var, int i14) {
        this.f201601a = i14;
        this.f201602b = o1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        b0.a aVar;
        b0.a aVar2;
        n4.c cVarA;
        switch (this.f201601a) {
            case 0:
                return new l0(this.f201602b);
            case 1:
                long jLongValue = ((Long) obj).longValue();
                o1 o1Var = this.f201602b;
                if (o1Var.f201710a.h().a(jLongValue)) {
                    o1Var.k();
                    o1Var.o(null);
                }
                return Unit.INSTANCE;
            case 2:
                long jLongValue2 = ((Long) obj).longValue();
                o1 o1Var2 = this.f201602b;
                b0 b0VarG = o1Var2.g();
                if (b0VarG != null && (aVar2 = b0VarG.f201523a) != null && jLongValue2 == aVar2.f201528c) {
                    o1Var2.f201726q.setValue(null);
                }
                b0 b0VarG2 = o1Var2.g();
                if (b0VarG2 != null && (aVar = b0VarG2.f201524b) != null && jLongValue2 == aVar.f201528c) {
                    o1Var2.f201727r.setValue(null);
                }
                if (o1Var2.f201710a.h().a(jLongValue2)) {
                    o1Var2.r();
                }
                return Unit.INSTANCE;
            case 3:
                f5.c0 c0Var = (f5.c0) obj;
                o1 o1Var3 = this.f201602b;
                n4.d dVar = (n4.d) o1Var3.f201720k.getF182175a();
                if (dVar != null) {
                    f5.c0 c0Var2 = o1Var3.f201722m;
                    if (c0Var2 != null) {
                        return r2.l.b(dVar, c0Var2, c0Var);
                    }
                    b2.e.d("Required value was null.");
                    o2.c.f();
                }
                return null;
            case 4:
                f5.c0 c0Var3 = (f5.c0) obj;
                o1 o1Var4 = this.f201602b;
                o1Var4.f201722m = c0Var3;
                if (((Boolean) o1Var4.f201719j.getF182175a()).booleanValue() && o1Var4.g() != null) {
                    if (c0Var3 != null) {
                        n4.c.f123541b.getClass();
                        cVarA = n4.c.a(c0Var3.W(0L));
                    } else {
                        cVarA = null;
                    }
                    if (!p005kotlin.jvm.internal.s.g(o1Var4.f201721l, cVarA)) {
                        o1Var4.f201721l = cVarA;
                        o1Var4.p();
                        o1Var4.r();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                o1 o1Var5 = this.f201602b;
                p3.c2 c2Var = o1Var5.f201719j;
                m4.g0 g0Var = (m4.g0) obj;
                if (!g0Var.b() && ((Boolean) c2Var.getF182175a()).booleanValue()) {
                    o1Var5.k();
                }
                c2Var.setValue(Boolean.valueOf(g0Var.b()));
                return Unit.INSTANCE;
            case 6:
                this.f201602b.n(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 7:
                this.f201602b.o((b0) obj);
                return Unit.INSTANCE;
            default:
                long jLongValue3 = ((Long) obj).longValue();
                o1 o1Var6 = this.f201602b;
                if (o1Var6.f201710a.h().a(jLongValue3)) {
                    o1Var6.f201723n.setValue(Unit.INSTANCE);
                    o1Var6.p();
                    o1Var6.r();
                }
                return Unit.INSTANCE;
        }
    }
}
