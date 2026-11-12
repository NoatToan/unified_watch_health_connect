package lg2;

import kotlin.t1;
import l72.f0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llg2/m;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f112346a = new m();

    private m() {
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
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
    public final void a(h4.r rVar, z3.e eVar, String str, boolean z14, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1985621355);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            w4.a aVar2 = (w4.a) o0VarE.A(t1.f91494l);
            boolean zR = o0VarE.r(aVar2) | ((57344 & i15) == 16384);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new k(aVar2, aVar, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k(aVar2, aVar, 0);
                    o0VarE.K(objQ);
                }
            }
            f0.f110999a.a(eVar, str, rVar, z14, (e23.a) objQ, o0VarE, i15 & 8190, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, rVar, eVar, str, z14, aVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
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
    public final void b(int i14, e23.a aVar, h4.r rVar, String str, p3.m mVar, u4.d dVar, boolean z14) {
        boolean z15;
        o0 o0VarL = vb.h.l(-1635479502, aVar, str, mVar);
        int i15 = i14 | (o0VarL.B(dVar) ? 4 : 2) | (o0VarL.B(str) ? 32 : 16) | 3072 | (o0VarL.r(aVar) ? 16384 : 8192);
        if (o0VarL.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            w4.a aVar2 = (w4.a) o0VarL.A(t1.f91494l);
            boolean zR = o0VarL.r(aVar2) | ((57344 & i15) == 16384);
            Object objQ = o0VarL.q();
            if (zR) {
                objQ = new k(aVar2, aVar, 2);
                o0VarL.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k(aVar2, aVar, 2);
                    o0VarL.K(objQ);
                }
            }
            f0.f110999a.d(i15 & 8190, 0, (e23.a) objQ, rVar, str, o0VarL, dVar, true);
            z15 = true;
        } else {
            o0VarL.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(this, dVar, str, rVar, z15, aVar, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
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
    public final void c(h4.r rVar, z3.e eVar, String str, boolean z14, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(-119102443);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            w4.a aVar2 = (w4.a) o0VarE.A(t1.f91494l);
            boolean zR = o0VarE.r(aVar2) | ((57344 & i15) == 16384);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new k(aVar2, aVar, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k(aVar2, aVar, 1);
                    o0VarE.K(objQ);
                }
            }
            f0.f110999a.f(rVar, eVar, str, z14, (e23.a) objQ, o0VarE, i15 & 8190, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, rVar, eVar, str, z14, aVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
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
    public final void d(e23.p pVar, String str, h4.r rVar, boolean z14, e23.a aVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        p2 p2VarI0;
        w4.a aVar2;
        boolean zR;
        Object objQ;
        int i17;
        pVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(298524807);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str) ? 256 : 128;
        }
        int i18 = i15 & 8;
        if (i18 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(aVar)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i16 |= i17;
            }
            z16 = true;
            if ((i16 & 9363) != 9362) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i16 & 1, z17)) {
                if (i18 != 0) {
                    z16 = z15;
                }
                x1 x1Var = p3.n.f135158a;
                aVar2 = (w4.a) o0VarE.A(t1.f91494l);
                zR = o0VarE.r(aVar2) | ((57344 & i16) == 16384);
                objQ = o0VarE.q();
                if (zR) {
                    objQ = new k(aVar2, aVar, 3);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new k(aVar2, aVar, 3);
                        o0VarE.K(objQ);
                    }
                }
                f0.f110999a.h(pVar, str, rVar, z16, (e23.a) objQ, o0VarE, i16 & 8190, 0);
                z18 = z16;
            } else {
                o0VarE.e();
                z18 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(this, rVar, pVar, str, z18, aVar, i14, i15);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(aVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i16 |= i17;
        }
        z16 = true;
        if ((i16 & 9363) != 9362) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i16 & 1, z17)) {
            if (i18 != 0) {
                z16 = z15;
            }
            x1 x1Var2 = p3.n.f135158a;
            aVar2 = (w4.a) o0VarE.A(t1.f91494l);
            zR = o0VarE.r(aVar2) | ((57344 & i16) == 16384);
            objQ = o0VarE.q();
            if (zR) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k(aVar2, aVar, 3);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new k(aVar2, aVar, 3);
                o0VarE.K(objQ);
            }
            f0.f110999a.h(pVar, str, rVar, z16, (e23.a) objQ, o0VarE, i16 & 8190, 0);
            z18 = z16;
        } else {
            o0VarE.e();
            z18 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(this, rVar, pVar, str, z18, aVar, i14, i15);
        }
    }
}
