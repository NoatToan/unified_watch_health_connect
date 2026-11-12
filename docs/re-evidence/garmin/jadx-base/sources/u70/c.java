package u70;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h4.r;
import l72.f0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f169404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f169405c;

    public /* synthetic */ c(b bVar, e23.a aVar, int i14) {
        this.f169403a = i14;
        this.f169404b = bVar;
        this.f169405c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
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
        String strQ;
        int i14 = this.f169403a;
        b bVar = this.f169404b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    if (bVar.f169397g != null) {
                        mVar.C(756010800);
                        strQ = gl1.d.W(bVar.f169397g);
                        mVar.f();
                    } else {
                        mVar.C(756096856);
                        strQ = y.Q(mVar, bVar.f169396f);
                        mVar.f();
                    }
                    z02.f.c(0, 54, null, this.f169405c, null, strQ, mVar, null);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (bVar.f169395e) {
                        mVar2.C(1248426903);
                        f0 f0Var = f0.f110999a;
                        String strQ2 = y.Q(mVar2, R.string.lbl_cancel);
                        r rVarF = x2.f(r.S, 1.0f);
                        e23.a aVar = this.f169405c;
                        boolean zB = mVar2.B(aVar);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new u11.b(aVar, 4);
                            mVar2.K(objQ);
                        } else {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new u11.b(aVar, 4);
                                mVar2.K(objQ);
                            }
                        }
                        f0Var.i(strQ2, rVarF, false, (e23.a) objQ, mVar2, 48, 4);
                        mVar2.f();
                    } else {
                        mVar2.C(1248741150);
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
