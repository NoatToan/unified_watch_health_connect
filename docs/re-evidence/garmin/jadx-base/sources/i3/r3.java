package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89481a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f89482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f89483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f89484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f89485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f89486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f89487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f89488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f89489i;

    public /* synthetic */ r3(b11.i.b bVar, boolean z14, boolean z15, boolean z16, e23.l lVar, e23.a aVar, e23.l lVar2, e23.a aVar2, int i14) {
        this.f89486f = bVar;
        this.f89482b = z14;
        this.f89483c = z15;
        this.f89484d = z16;
        this.f89487g = lVar;
        this.f89485e = aVar;
        this.f89488h = lVar2;
        this.f89489i = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
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
        int i14 = this.f89481a;
        Object obj3 = this.f89489i;
        Object obj4 = this.f89488h;
        Object obj5 = this.f89487g;
        Object obj6 = this.f89486f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                x3.m((String) obj6, (h4.r) obj4, this.f89482b, this.f89483c, this.f89485e, this.f89484d, (String) obj5, (b3) obj3, (p3.m) obj, p3.p0.t(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                k11.a0.d((b11.i.b) obj6, this.f89482b, this.f89483c, this.f89484d, (e23.l) obj5, this.f89485e, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1572865));
                break;
            default:
                sy0.m mVar = (sy0.m) obj6;
                p3.p1 p1Var = (p3.p1) obj5;
                e23.l lVar = (e23.l) obj4;
                p3.p1 p1Var2 = (p3.p1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    l72.p2 p2Var = l72.p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.account_privacy);
                    String strQ2 = gl1.y.Q(mVar2, mVar.f161257b);
                    qy0.b.f148467a.getClass();
                    z3.e eVar = qy0.b.f148472f;
                    e23.a aVar = this.f89485e;
                    boolean zB = mVar2.B(aVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new p40.j0(aVar, p1Var, 3);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new p40.j0(aVar, p1Var, 3);
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.h(strQ, strQ2, null, null, null, false, false, null, eVar, null, (e23.a) objQ, mVar2, 100663296, 0, 764);
                    if (this.f89482b) {
                        mVar2.C(-417281165);
                        String strQ3 = gl1.y.Q(mVar2, R.string.title_live_track);
                        c22.x0.f23314a.getClass();
                        String strW = gl1.d.W(c22.x0.f23725ya);
                        boolean z14 = this.f89484d;
                        boolean z15 = this.f89483c;
                        p2Var.h(strQ3, strW, null, null, null, false, false, null, z3.f.c(-659010324, new jy0.a0(1, lVar, p1Var2, z14, z15), mVar2), null, null, mVar2, 100663296, 0, 1788);
                        if (z15) {
                            mVar2.C(-416150626);
                            mVar2.f();
                        } else {
                            mVar2.C(-416511683);
                            h4.r.a aVar2 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarA = c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97918c, 1);
                            String strW2 = gl1.d.W(c22.x0.f23708xa);
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97933j, mVar2);
                            d6.h.f57752b.getClass();
                            mh.c(strW2, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                            mVar2.f();
                        }
                        mVar2.f();
                    } else {
                        mVar2.C(-416132770);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r3(String str, h4.r rVar, boolean z14, boolean z15, e23.a aVar, boolean z16, String str2, b3 b3Var, int i14) {
        this.f89486f = str;
        this.f89488h = rVar;
        this.f89482b = z14;
        this.f89483c = z15;
        this.f89485e = aVar;
        this.f89484d = z16;
        this.f89487g = str2;
        this.f89489i = b3Var;
    }

    public /* synthetic */ r3(sy0.m mVar, e23.a aVar, boolean z14, boolean z15, p3.p1 p1Var, boolean z16, e23.l lVar, p3.p1 p1Var2) {
        this.f89486f = mVar;
        this.f89485e = aVar;
        this.f89482b = z14;
        this.f89483c = z15;
        this.f89487g = p1Var;
        this.f89484d = z16;
        this.f89488h = lVar;
        this.f89489i = p1Var2;
    }
}
