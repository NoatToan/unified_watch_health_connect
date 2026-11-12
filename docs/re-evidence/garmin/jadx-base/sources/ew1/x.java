package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f66828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f66829c;

    public /* synthetic */ x(y yVar, a aVar, int i14) {
        this.f66827a = 4;
        this.f66828b = yVar;
        this.f66829c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
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
        Object obj3;
        Object obj4;
        int i14 = this.f66827a;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        a aVar2 = this.f66829c;
        y yVar = this.f66828b;
        int i15 = 1;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                y.b bVar = y.f66842g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1279245865, new x(yVar, aVar2, i15, z14 ? (byte) 1 : (byte) 0), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                y.b bVar2 = y.f66842g;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    yVar.w6(aVar2, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                y.b bVar3 = y.f66842g;
                if (mVar.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                    String str = aVar2.f66298e;
                    boolean zR = mVar.r(yVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        obj3 = objQ;
                        Object wVar = new w(yVar, 1);
                        mVar.K(wVar);
                        obj3 = wVar;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj3 = objQ;
                            Object wVar2 = new w(yVar, 1);
                            mVar.K(wVar2);
                            obj3 = wVar2;
                        }
                    }
                    obj3 = objQ;
                    f0Var.f(rVarF, null, str, false, (e23.a) obj3, mVar, 6, 10);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                int iIntValue4 = num.intValue();
                y.b bVar4 = y.f66842g;
                if (mVar.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    h4.r rVarF2 = c2.x2.f(h4.r.S, 1.0f);
                    String str2 = aVar2.f66299f;
                    if (str2 == null) {
                        str2 = "";
                    }
                    boolean zR2 = mVar.r(yVar);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        obj4 = objQ2;
                        Object wVar3 = new w(yVar, 2);
                        mVar.K(wVar3);
                        obj4 = wVar3;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            obj4 = objQ2;
                            Object wVar4 = new w(yVar, 2);
                            mVar.K(wVar4);
                            obj4 = wVar4;
                        }
                    }
                    obj4 = objQ2;
                    f0Var2.i(str2, rVarF2, false, (e23.a) obj4, mVar, 48, 4);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                y.b bVar5 = y.f66842g;
                yVar.w6(aVar2, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x(a aVar, y yVar, int i14) {
        this.f66827a = i14;
        this.f66829c = aVar;
        this.f66828b = yVar;
    }

    public /* synthetic */ x(y yVar, a aVar, int i14, byte b14) {
        this.f66827a = i14;
        this.f66828b = yVar;
        this.f66829c = aVar;
    }
}
