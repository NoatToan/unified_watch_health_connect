package p006l2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.s0;
import d6.g;
import e23.a;
import e23.p;
import h4.r;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import z2.b0;
import z2.c;
import z2.i1;
import z2.k0;
import z2.m0;
import z2.o1;
import z2.y;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f108567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f108568c;

    public /* synthetic */ i0(e eVar, o1 o1Var) {
        this.f108566a = 2;
        this.f108568c = eVar;
        this.f108567b = o1Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        z2.i0 i0Var;
        b0.a aVar;
        y yVarC;
        b0.a aVar2;
        y yVarC2;
        int i14 = this.f108566a;
        o1 o1Var = this.f108567b;
        e eVar = this.f108568c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                r0.b(o1Var, eVar, (m) obj, p0.t(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gl1.y.c(o1Var, eVar, (m) obj, p0.t(49));
                break;
            default:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = 1;
                int i16 = 0;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    eVar.invoke(mVar, 0);
                    if (o1Var.i() && ((Boolean) o1Var.f201719j.getF182175a()).booleanValue()) {
                        b0 b0VarG = o1Var.g();
                        if (b0VarG == null ? true : s.g(b0VarG.f201523a, b0VarG.f201524b)) {
                            mVar.C(2005806539);
                        } else {
                            mVar.C(-1736224054);
                            b0 b0VarG2 = o1Var.g();
                            if (b0VarG2 == null) {
                                mVar.C(2011629175);
                            } else {
                                mVar.C(2011629176);
                                mVar.C(-1736222526);
                                List listK = x.k(Boolean.TRUE, Boolean.FALSE);
                                int size = listK.size();
                                int i17 = 0;
                                while (i17 < size) {
                                    boolean zBooleanValue = ((Boolean) listK.get(i17)).booleanValue();
                                    boolean zH = mVar.h(zBooleanValue);
                                    Object objQ = mVar.q();
                                    m.a aVar3 = m.f135153a;
                                    if (zH) {
                                        objQ = new i1(zBooleanValue, o1Var);
                                        mVar.K(objQ);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ == m.a.f135155b) {
                                            objQ = new i1(zBooleanValue, o1Var);
                                            mVar.K(objQ);
                                        }
                                    }
                                    p2 p2Var = (p2) objQ;
                                    boolean zH2 = mVar.h(zBooleanValue);
                                    Object objQ2 = mVar.q();
                                    if (zH2) {
                                        if (zBooleanValue) {
                                            i0Var = new z2.i0(o1Var, i16);
                                        } else {
                                            i0Var = new z2.i0(o1Var, i15);
                                        }
                                        objQ2 = i0Var;
                                        mVar.K(objQ2);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ2 == m.a.f135155b) {
                                            if (zBooleanValue) {
                                                i0Var = new z2.i0(o1Var, i16);
                                            } else {
                                                i0Var = new z2.i0(o1Var, i15);
                                            }
                                            objQ2 = i0Var;
                                            mVar.K(objQ2);
                                        }
                                    }
                                    a aVar4 = (a) objQ2;
                                    g gVar = zBooleanValue ? b0VarG2.f201523a.f201526a : b0VarG2.f201524b.f201526a;
                                    float fB = 0.0f;
                                    if (zBooleanValue) {
                                        b0 b0VarG3 = o1Var.g();
                                        if (b0VarG3 != null && (yVarC2 = o1Var.c((aVar2 = b0VarG3.f201523a))) != null) {
                                            fB = yVarC2.b(aVar2.f201527b);
                                        }
                                    } else {
                                        b0 b0VarG4 = o1Var.g();
                                        if (b0VarG4 != null && (yVarC = o1Var.c((aVar = b0VarG4.f201524b))) != null) {
                                            fB = yVarC.b(aVar.f201527b);
                                        }
                                    }
                                    int i18 = i17;
                                    m0.a aVar5 = new m0.a(aVar4);
                                    boolean z14 = b0VarG2.f201525c;
                                    r.a aVar6 = r.S;
                                    boolean zR = mVar.r(p2Var);
                                    Object objQ3 = mVar.q();
                                    if (zR) {
                                        objQ3 = new k0(p2Var);
                                        mVar.K(objQ3);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ3 == m.a.f135155b) {
                                            objQ3 = new k0(p2Var);
                                            mVar.K(objQ3);
                                        }
                                    }
                                    c.b(aVar5, zBooleanValue, gVar, z14, 0L, fB, s0.b(aVar6, p2Var, (PointerInputEventHandler) objQ3), mVar, 0, 16);
                                    i17 = i18 + 1;
                                    i15 = 1;
                                    i16 = 0;
                                }
                                mVar.f();
                            }
                            mVar.f();
                        }
                    } else {
                        mVar.C(2005806539);
                    }
                    mVar.f();
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i0(o1 o1Var, e eVar, int i14, int i15) {
        this.f108566a = i15;
        this.f108567b = o1Var;
        this.f108568c = eVar;
    }
}
