package b82;

import c2.x2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f16670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f16672e;

    public /* synthetic */ m(String str, String str2, e23.a aVar, e23.a aVar2, int i14) {
        this.f16668a = 2;
        this.f16669b = str;
        this.f16671d = str2;
        this.f16670c = aVar;
        this.f16672e = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x0105  */
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
        switch (this.f16668a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    String str = this.f16669b;
                    p3.m.a aVar = p3.m.f135153a;
                    if (str == null || str.length() == 0) {
                        mVar.C(126371959);
                        mVar.f();
                    } else {
                        mVar.C(126267210);
                        l72.f0.a aVar2 = l72.f0.a.f111000a;
                        e23.a aVar3 = this.f16670c;
                        boolean zB = mVar.B(aVar3);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new as.n(aVar3, 14);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new as.n(aVar3, 14);
                                mVar.K(objQ);
                            }
                        }
                        aVar2.j(str, null, false, (e23.a) objQ, mVar, 0, 6);
                        mVar.f();
                    }
                    String str2 = this.f16671d;
                    if (str2 == null || str2.length() == 0) {
                        mVar.C(126530679);
                        mVar.f();
                    } else {
                        mVar.C(126427852);
                        l72.f0.a aVar4 = l72.f0.a.f111000a;
                        e23.a aVar5 = this.f16672e;
                        boolean zB2 = mVar.B(aVar5);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new as.n(aVar5, 15);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new as.n(aVar5, 15);
                                mVar.K(objQ2);
                            }
                        }
                        aVar4.f(str2, null, false, (e23.a) objQ2, mVar, 0, 6);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r.a aVar6 = h4.r.S;
                    f0Var.d(384, 9, this.f16670c, x2.f(aVar6, 1.0f), this.f16669b, mVar2, null, false);
                    h4.r rVarF = x2.f(aVar6, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f0Var.i(this.f16671d, c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), false, this.f16672e, mVar2, 0, 4);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ug2.q0.g(this.f16669b, this.f16671d, this.f16670c, this.f16672e, (p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(String str, e23.a aVar, String str2, e23.a aVar2, int i14) {
        this.f16668a = i14;
        this.f16669b = str;
        this.f16670c = aVar;
        this.f16671d = str2;
        this.f16672e = aVar2;
    }
}
