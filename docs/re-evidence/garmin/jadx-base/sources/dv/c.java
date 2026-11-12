package dv;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bic.CollectDobActivity;
import com.garmin.android.apps.connectmobile.bic.CollectDobActivity.b;
import e23.p;
import gl1.y;
import l72.c1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollectDobActivity f61321b;

    public /* synthetic */ c(CollectDobActivity collectDobActivity, int i14) {
        this.f61320a = i14;
        this.f61321b = collectDobActivity;
    }

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
        Object obj3;
        Object obj4;
        boolean z14 = false;
        final int i14 = 1;
        switch (this.f61320a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                CollectDobActivity.a aVar = CollectDobActivity.f30702e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-1849790455, new c(this.f61321b, i14), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                CollectDobActivity.a aVar2 = CollectDobActivity.f30702e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    Object obj5 = p3.m.a.f135155b;
                    if (objQ == obj5) {
                        obj3 = objQ;
                        Object objN = p0.n(Boolean.TRUE);
                        mVar2.K(objN);
                        obj3 = objN;
                    }
                    obj3 = objQ;
                    p1 p1Var = (p1) obj3;
                    Object objQ2 = mVar2.q();
                    Object obj6 = objQ2;
                    if (objQ2 == obj5) {
                        Object objN2 = p0.n(Boolean.FALSE);
                        mVar2.K(objN2);
                        obj6 = objN2;
                    }
                    p1 p1Var2 = (p1) obj6;
                    Object objQ3 = mVar2.q();
                    Object obj7 = objQ3;
                    if (objQ3 == obj5) {
                        Object objN3 = p0.n(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h());
                        mVar2.K(objN3);
                        obj7 = objN3;
                    }
                    p1 p1Var3 = (p1) obj7;
                    Boolean bool = (Boolean) p1Var.getF182175a();
                    bool.booleanValue();
                    final CollectDobActivity collectDobActivity = this.f61321b;
                    boolean zR = mVar2.r(collectDobActivity);
                    Object objQ4 = mVar2.q();
                    Object obj8 = objQ4;
                    if (zR || objQ4 == obj5) {
                        Object bVar = collectDobActivity.new b(p1Var, null);
                        mVar2.K(bVar);
                        obj8 = bVar;
                    }
                    l0.e((p) obj8, bool, mVar2);
                    ve2.e eVar = (ve2.e) p1Var3.getF182175a();
                    Object objQ5 = mVar2.q();
                    Object obj9 = objQ5;
                    if (objQ5 == obj5) {
                        Object kVar = new cw1.k(p1Var, 28);
                        mVar2.K(kVar);
                        obj9 = kVar;
                    }
                    e23.a aVar3 = (e23.a) obj9;
                    Object objQ6 = mVar2.q();
                    Object obj10 = objQ6;
                    if (objQ6 == obj5) {
                        Object kVar2 = new cw1.k(p1Var2, 29);
                        mVar2.K(kVar2);
                        obj10 = kVar2;
                    }
                    collectDobActivity.da(null, eVar, aVar3, (e23.a) obj10, mVar2, 3456);
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar2.C(1618784712);
                        c1 c1Var = c1.f110940a;
                        String strQ = y.Q(mVar2, R.string.txt_something_went_wrong_try_again);
                        String strQ2 = y.Q(mVar2, R.string.lbl_ok);
                        boolean zR2 = mVar2.r(collectDobActivity);
                        Object objQ7 = mVar2.q();
                        if (zR2 || objQ7 == obj5) {
                            obj4 = objQ7;
                            final boolean z15 = z14 ? 1 : 0;
                            Object obj11 = new e23.a() { // from class: dv.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i15 = z15;
                                    CollectDobActivity collectDobActivity2 = collectDobActivity;
                                    switch (i15) {
                                        case 0:
                                            CollectDobActivity.a aVar4 = CollectDobActivity.f30702e;
                                            ((g) collectDobActivity2.f30703d.getValue()).x4();
                                            break;
                                        default:
                                            CollectDobActivity.a aVar5 = CollectDobActivity.f30702e;
                                            ((g) collectDobActivity2.f30703d.getValue()).x4();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(obj11);
                            obj4 = obj11;
                        }
                        e23.a<Unit> aVar4 = (e23.a) obj4;
                        boolean zR3 = mVar2.r(collectDobActivity);
                        Object objQ8 = mVar2.q();
                        Object obj12 = objQ8;
                        if (zR3 || objQ8 == obj5) {
                            Object obj13 = new e23.a() { // from class: dv.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i15 = i14;
                                    CollectDobActivity collectDobActivity2 = collectDobActivity;
                                    switch (i15) {
                                        case 0:
                                            CollectDobActivity.a aVar5 = CollectDobActivity.f30702e;
                                            ((g) collectDobActivity2.f30703d.getValue()).x4();
                                            break;
                                        default:
                                            CollectDobActivity.a aVar6 = CollectDobActivity.f30702e;
                                            ((g) collectDobActivity2.f30703d.getValue()).x4();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(obj13);
                            obj12 = obj13;
                        }
                        c1Var.a(false, null, strQ, null, null, strQ2, false, false, aVar4, null, (e23.a) obj12, mVar2, 6, 0, 730);
                        mVar2.f();
                    } else {
                        mVar2.C(1619231577);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
