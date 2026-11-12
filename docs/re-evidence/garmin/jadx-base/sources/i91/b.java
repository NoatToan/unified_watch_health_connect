package i91;

import c2.x2;
import e23.l;
import e23.r;
import h2.c0;
import java.util.List;
import l72.p2;
import o13.p;
import p005kotlin.Unit;
import p13.h0;
import p3.m;
import p3.n;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f92326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f92327c;

    public /* synthetic */ b(List list, l lVar, int i14) {
        this.f92325a = i14;
        this.f92326b = list;
        this.f92327c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0119  */
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
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        p pVar;
        Object obj5;
        int i14 = this.f92325a;
        m.a aVar = m.f135153a;
        boolean z14 = false;
        int i15 = 16;
        l lVar = this.f92327c;
        List list = this.f92326b;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                m mVar = (m) obj3;
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var = n.f135158a;
                d91.h hVar = (d91.h) h0.e0(iIntValue, list);
                if (hVar != null) {
                    String str = hVar.f58542c;
                    String str2 = hVar.f58541b;
                    if (str2 != null && str != null) {
                        pVar = new p(str2, str);
                    } else if (str2 != null) {
                        pVar = new p(str2, null);
                    } else {
                        pVar = str != null ? new p(str, null) : new p(null, null);
                    }
                    z3.e eVarC = z3.f.c(-267555026, new gw1.c(hVar, i15, (String) pVar.f128594a, (String) pVar.f128595b), mVar);
                    h4.r.a aVar2 = h4.r.S;
                    boolean zB = mVar.B(lVar) | mVar.r(hVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        obj5 = objQ;
                        c cVar = new c(z14 ? 1 : 0, lVar, hVar);
                        mVar.K(cVar);
                        obj5 = cVar;
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            obj5 = objQ;
                            c cVar2 = new c(z14 ? 1 : 0, lVar, hVar);
                            mVar.K(cVar2);
                            obj5 = cVar2;
                        }
                    }
                    obj5 = objQ;
                    l72.l.f(eVarC, x2.x(x2.f(w.d(aVar2, false, null, null, (e23.a) obj5, 15), 1.0f), null, 3), false, null, mVar, 6, 28);
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                m mVar2 = (m) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= mVar2.k(iIntValue2) ? 32 : 16;
                }
                int i16 = 1;
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    x1 x1Var2 = n.f135158a;
                    uf0.a aVar3 = (uf0.a) list.get(iIntValue2);
                    p2 p2Var = p2.f111205a;
                    String deviceName = aVar3.getDeviceName();
                    if (deviceName == null) {
                        deviceName = aVar3.getDeviceId();
                    }
                    String str3 = deviceName;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    boolean zB2 = mVar2.B(lVar) | mVar2.r(aVar3);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new tb0.d(i16, lVar, aVar3);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new tb0.d(i16, lVar, aVar3);
                            mVar2.K(objQ2);
                        }
                    }
                    p2Var.g(str3, rVarF, null, null, null, false, false, (e23.a) objQ2, mVar2, 48, 252);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
