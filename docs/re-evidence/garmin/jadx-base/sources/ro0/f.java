package ro0;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import gl1.y;
import i3.ve;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p3.l0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h82.c f153760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f153761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f153762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f153763e;

    public /* synthetic */ f(h82.c cVar, Bundle bundle, p1 p1Var, p1 p1Var2, int i14) {
        this.f153759a = i14;
        this.f153760b = cVar;
        this.f153761c = bundle;
        this.f153762d = p1Var;
        this.f153763e = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
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
        switch (this.f153759a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                HelpActivity.a aVar = HelpActivity.f36653a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    ve.a(null, null, tn.k.a(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(1775323120, new f(this.f153760b, this.f153761c, this.f153762d, this.f153763e, 1), mVar), mVar, 12582912, 123);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                HelpActivity.a aVar2 = HelpActivity.f36653a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar2);
                    int i14 = h82.c.f82429e;
                    h82.c cVar = this.f153760b;
                    cVar.a(this.f153761c, mVar2, i14 << 3);
                    cVar.b(m0VarI, null, mVar2, i14 << 6, 2);
                    boolean zR = mVar2.r(m0VarI) | mVar2.r(cVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        Object jVar = new j(m0VarI, cVar, this.f153762d, this.f153763e, null);
                        mVar2.K(jVar);
                        objQ = jVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            Object jVar2 = new j(m0VarI, cVar, this.f153762d, this.f153763e, null);
                            mVar2.K(jVar2);
                            objQ = jVar2;
                        }
                    }
                    l0.e((e23.p) objQ, m0VarI, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
