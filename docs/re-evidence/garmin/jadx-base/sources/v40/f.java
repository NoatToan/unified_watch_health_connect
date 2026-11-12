package v40;

import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import h4.r;
import i3.mh;
import l72.p2;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175555a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f175556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f175557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f175558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f175559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f175560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f175561g;

    public /* synthetic */ f(l lVar, boolean z14, l lVar2, boolean z15, l lVar3, boolean z16) {
        this.f175559e = lVar;
        this.f175556b = z14;
        this.f175560f = lVar2;
        this.f175557c = z15;
        this.f175561g = lVar3;
        this.f175558d = z16;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007d  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:26:0x010a  */
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
        switch (this.f175555a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    p2 p2Var = p2.f111205a;
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.f23462ic);
                    boolean z14 = this.f175556b;
                    z3.e eVarC = z3.f.c(-1910400071, new rw0.g(z14, 10), mVar);
                    l lVar = this.f175559e;
                    boolean zB = mVar.B(lVar) | mVar.h(z14);
                    Object objQ = mVar.q();
                    m.a aVar = m.f135153a;
                    if (zB) {
                        objQ = new ad0.e(lVar, z14, 19);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ad0.e(lVar, z14, 19);
                            mVar.K(objQ);
                        }
                    }
                    p2Var.g(strW, null, null, null, eVarC, false, false, (e23.a) objQ, mVar, 24576, 238);
                    String strQ = y.Q(mVar, R.string.lbl_unpaved_roads);
                    boolean z15 = this.f175557c;
                    z3.e eVarC2 = z3.f.c(-78690206, new rw0.g(z15, 11), mVar);
                    l lVar2 = this.f175560f;
                    boolean zB2 = mVar.B(lVar2) | mVar.h(z15);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new ad0.e(lVar2, z15, 20);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new ad0.e(lVar2, z15, 20);
                            mVar.K(objQ2);
                        }
                    }
                    p2Var.g(strQ, null, null, null, eVarC2, false, false, (e23.a) objQ2, mVar, 24576, 238);
                    String strW2 = gl1.d.W(x0.Kc);
                    boolean z16 = this.f175558d;
                    z3.e eVarC3 = z3.f.c(-1458475519, new rw0.g(z16, 12), mVar);
                    l lVar3 = this.f175561g;
                    boolean zB3 = mVar.B(lVar3) | mVar.h(z16);
                    Object objQ3 = mVar.q();
                    if (zB3) {
                        objQ3 = new ad0.e(lVar3, z16, 21);
                        mVar.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new ad0.e(lVar3, z16, 21);
                            mVar.K(objQ3);
                        }
                    }
                    p2Var.g(strW2, null, null, null, eVarC3, false, false, (e23.a) objQ3, mVar, 24576, 238);
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarZ = c2.l.z(aVar2, eVar.f97920e, eVar.f97917b);
                    d92.b.f58624b.getClass();
                    mh.c(gl1.d.W(x0.f23413fd), rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                g.a(this.f175556b, this.f175557c, this.f175558d, this.f175559e, this.f175560f, this.f175561g, (m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(boolean z14, boolean z15, boolean z16, l lVar, l lVar2, l lVar3, int i14) {
        this.f175556b = z14;
        this.f175557c = z15;
        this.f175558d = z16;
        this.f175559e = lVar;
        this.f175560f = lVar2;
        this.f175561g = lVar3;
    }
}
