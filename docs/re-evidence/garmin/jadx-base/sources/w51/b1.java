package w51;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Unit;
import p3.a2;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class b1 {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(String str, b63.u uVar, b63.u uVar2, final b63.u uVar3, e23.a<Unit> aVar, e23.l<? super b63.u, Unit> lVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        str.getClass();
        uVar.getClass();
        uVar2.getClass();
        uVar3.getClass();
        aVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(2087737600);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(uVar) ? 32 : 16) | (o0VarE.r(uVar2) ? 256 : 128) | (o0VarE.r(uVar3) ? 2048 : 1024) | (o0VarE.r(lVar) ? 131072 : 65536);
        final int i16 = 1;
        final int i17 = 0;
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                c22.j0.f23099a.getClass();
                objQ = p3.p0.n(Boolean.valueOf(c22.j0.D()));
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(i53.a.e(p13.h0.T(p13.x.k(uVar.f16216a.getHour() == 0 ? b63.q.d(uVar.b(), new b63.d(0, 0, 1, 3, null)) : uVar.b(), uVar2.f16216a.getHour() == 23 ? b63.p.c(uVar2.b(), new b63.d(0, 0, 1, 3, null)) : uVar2.b()))));
                o0VarE.K(objQ2);
            }
            final p1 p1Var2 = (p1) objQ2;
            i53.c cVar = (i53.c) p1Var2.getF182175a();
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.add(zf.b.p((b63.o) it.next()));
            }
            i53.c cVarE = i53.a.e(arrayList);
            Object objQ3 = o0VarE.q();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ3 == c2565a2) {
                objQ3 = p3.p0.n(i53.a.a("AM", "PM"));
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            Object[] objArr = new Object[0];
            boolean zR = o0VarE.r(uVar3);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a2) {
                objQ4 = new e23.a() { // from class: w51.y0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.a
                    public final Object invoke() {
                        int hour;
                        switch (i17) {
                            case 0:
                                int iIndexOf = ((i53.c) p1Var2.getF182175a()).indexOf(uVar3.b());
                                if (iIndexOf < 0) {
                                    iIndexOf = 0;
                                }
                                return new a2(iIndexOf);
                            default:
                                boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                                b63.u uVar4 = uVar3;
                                if (zBooleanValue) {
                                    hour = uVar4.f16216a.getHour();
                                } else {
                                    hour = uVar4.f16216a.getHour();
                                    if (hour == 0 || hour == 12) {
                                        hour = 12;
                                    } else if (hour > 12) {
                                        hour -= 12;
                                    }
                                }
                                return new a2(hour);
                        }
                    }
                };
                o0VarE.K(objQ4);
            }
            n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ4, o0VarE, 0);
            Object[] objArr2 = new Object[0];
            boolean zR2 = o0VarE.r(uVar3);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a2) {
                objQ5 = new e23.a() { // from class: w51.y0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.a
                    public final Object invoke() {
                        int hour;
                        switch (i16) {
                            case 0:
                                int iIndexOf = ((i53.c) p1Var.getF182175a()).indexOf(uVar3.b());
                                if (iIndexOf < 0) {
                                    iIndexOf = 0;
                                }
                                return new a2(iIndexOf);
                            default:
                                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                                b63.u uVar4 = uVar3;
                                if (zBooleanValue) {
                                    hour = uVar4.f16216a.getHour();
                                } else {
                                    hour = uVar4.f16216a.getHour();
                                    if (hour == 0 || hour == 12) {
                                        hour = 12;
                                    } else if (hour > 12) {
                                        hour -= 12;
                                    }
                                }
                                return new a2(hour);
                        }
                    }
                };
                o0VarE.K(objQ5);
            }
            final int i18 = 0;
            n1 n1Var2 = (n1) d4.a.e(objArr2, (e23.a) objQ5, o0VarE, 0);
            Object[] objArr3 = new Object[0];
            boolean zR3 = o0VarE.r(uVar3);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a2) {
                objQ6 = new e23.a() { // from class: w51.z0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return new a2(uVar3.f16216a.getMinute());
                            default:
                                return p3.p0.n(uVar3.f16216a.getHour() >= 12 ? d1.PM : d1.AM);
                        }
                    }
                };
                o0VarE.K(objQ6);
            }
            n1 n1Var3 = (n1) d4.a.e(objArr3, (e23.a) objQ6, o0VarE, 0);
            Object[] objArr4 = new Object[0];
            boolean zR4 = o0VarE.r(uVar3);
            Object objQ7 = o0VarE.q();
            if (zR4 || objQ7 == c2565a2) {
                final int i19 = 1;
                objQ7 = new e23.a() { // from class: w51.z0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return new a2(uVar3.f16216a.getMinute());
                            default:
                                return p3.p0.n(uVar3.f16216a.getHour() >= 12 ? d1.PM : d1.AM);
                        }
                    }
                };
                o0VarE.K(objQ7);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr4, (e23.a) objQ7, o0VarE, 0);
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.common_button_done);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            z3.e eVarC = z3.f.c(-1852398756, new r11.k(p1Var, cVarE, n1Var, n1Var2, n1Var3, p1Var4, p1Var3), o0VarE);
            boolean zB = o0VarE.B(n1Var) | o0VarE.B(n1Var2) | o0VarE.B(p1Var4) | ((i15 & 458752) == 131072) | o0VarE.B(n1Var3);
            Object objQ8 = o0VarE.q();
            if (zB || objQ8 == c2565a2) {
                a11.p pVar = new a11.p(lVar, p1Var2, n1Var, p1Var, n1Var2, p1Var4, n1Var3);
                o0VarE.K(pVar);
                objQ8 = pVar;
            }
            o0Var = o0VarE;
            c1Var.a(false, str, null, eVarC, null, strQ, false, false, (e23.a) objQ8, strQ2, aVar, o0Var, ((i15 << 3) & 112) | 3072, 6, 213);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ta0.g0(str, uVar, uVar2, uVar3, (e23.a) aVar, (e23.l) lVar, i14);
        }
    }
}
