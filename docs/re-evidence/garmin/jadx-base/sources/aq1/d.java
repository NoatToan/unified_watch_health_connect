package aq1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.b f12361b;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.startup.b bVar, int i14) {
        this.f12360a = 2;
        this.f12361b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
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
        int i14 = this.f12360a;
        Object[] objArr = 0;
        com.garmin.android.apps.connectmobile.startup.b bVar = this.f12361b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.startup.b.a aVar = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(643407528, new d(bVar, i15, objArr == true ? 1 : 0), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.startup.b.a aVar2 = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    bVar.v6(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.startup.b.a aVar3 = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                bVar.v6((p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    String strQ = gl1.y.Q(mVar3, R.string.lbl_ok);
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    boolean zR = mVar3.r(bVar);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new c(bVar, 2);
                        mVar3.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new c(bVar, 2);
                            mVar3.K(objQ);
                        }
                    }
                    f0Var.d(384, 9, (e23.a) objQ, rVarF, strQ, mVar3, null, false);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.startup.b bVar, int i14, byte b14) {
        this.f12360a = i14;
        this.f12361b = bVar;
    }
}
