package dv0;

import am.j1;
import am.l1;
import android.content.Context;
import b63.v;
import c2.a0;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.mlkit.common.MlKitException;
import d53.w;
import ew1.v1;
import h5.e0;
import ho.d0;
import i3.bi;
import i3.fe;
import i3.mh;
import i3.o1;
import i3.si;
import java.time.LocalTime;
import java.util.List;
import java.util.Locale;
import l72.c1;
import l72.p2;
import o53.b0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import pt1.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61361a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f61362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f61363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f61364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f61365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f61366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f61367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f61368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f61369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f61370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o13.h f61371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f61372l;

    public /* synthetic */ e(List list, e23.l lVar, String str, v vVar, v vVar2, e23.l lVar2, e23.l lVar3, boolean z14, e23.a aVar, Context context, p1 p1Var) {
        this.f61364d = list;
        this.f61365e = lVar;
        this.f61367g = str;
        this.f61366f = vVar;
        this.f61369i = vVar2;
        this.f61371k = lVar2;
        this.f61372l = lVar3;
        this.f61363c = z14;
        this.f61370j = aVar;
        this.f61368h = context;
        this.f61362b = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x0354  */
    /* JADX WARN: Code duplicated, block: B:84:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x045f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z14;
        final p1 p1Var;
        final x xVar;
        p3.m mVar;
        Object d0Var;
        int i14;
        int i15;
        p1 p1Var2;
        int i16 = this.f61361a;
        boolean z15 = this.f61363c;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = this.f61368h;
        Object obj5 = this.f61370j;
        Object obj6 = this.f61372l;
        o13.h hVar = this.f61371k;
        Object obj7 = this.f61369i;
        Object obj8 = this.f61366f;
        Object obj9 = this.f61367g;
        Object obj10 = this.f61365e;
        Object obj11 = this.f61364d;
        final int i17 = 1;
        switch (i16) {
            case 0:
                b0 b0Var = (b0) obj10;
                yu0.f fVar = (yu0.f) obj8;
                String str = (String) obj9;
                Context context = (Context) obj4;
                ev0.e eVar = (ev0.e) obj7;
                e23.a<Unit> aVar2 = (e23.a) obj5;
                e23.a<Unit> aVar3 = (e23.a) hVar;
                c.q qVar = (c.q) obj6;
                p1 p1Var3 = (p1) obj11;
                fe feVar = (fe) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                feVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(feVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar4, mVar2);
                    h5.g.V.getClass();
                    int i18 = iIntValue;
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97920e;
                    float f15 = eVar2.f97917b;
                    c2.l.f(x2.h(aVar4, f14), mVar2);
                    p1 p1Var4 = this.f61362b;
                    ev0.c cVar = (ev0.c) ((g3) p1Var4.getF182175a()).f35301b;
                    String str2 = cVar != null ? cVar.f66154c : null;
                    if (str == null) {
                        str = "";
                    }
                    String str3 = str;
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        z14 = false;
                        objQ = new f(p1Var3, 0);
                        mVar2.K(objQ);
                    } else {
                        z14 = false;
                    }
                    e23.a aVar6 = (e23.a) objQ;
                    boolean z16 = this.f61363c;
                    s.a(z16, true, str2, str3, aVar6, mVar2, 24624, 0);
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_share_livetrack_profile);
                    a.f61352a.getClass();
                    z3.e eVar3 = a.f61353b;
                    boolean zR = mVar2.r(fVar) | mVar2.r(context);
                    Object objQ2 = mVar2.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new dl0.g(5, fVar, context);
                        mVar2.K(objQ2);
                    }
                    p2Var.g(strQ, null, null, null, eVar3, z16, false, (e23.a) objQ2, mVar2, 24576, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
                    String upperCase = gl1.y.Q(mVar2, R.string.account_privacy).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(upperCase, c2.l.B(aVar4, f14, f14, f14, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, mVar2), mVar2, 0, 0, 131068);
                    p2Var.h(gl1.y.Q(mVar2, R.string.lbl_saved_session_privacy), eVar.f66160a, null, null, null, z16, false, null, null, null, aVar2, mVar2, 0, 0, 988);
                    p2Var.h(gl1.y.Q(mVar2, R.string.livetrack_active_session_privacy), eVar.f66161b, null, null, null, z16, false, null, null, null, aVar3, mVar2, 0, 0, 988);
                    c2.l.f(c2.l.C(aVar4, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), mVar2);
                    String strQ2 = gl1.y.Q(mVar2, R.string.livetrack_delete_profile);
                    z3.e eVar4 = a.f61354c;
                    boolean zR2 = mVar2.r(qVar) | mVar2.r(fVar);
                    Object objQ3 = mVar2.q();
                    if (zR2 || objQ3 == c2565a) {
                        objQ3 = new dl0.g(6, qVar, fVar);
                        mVar2.K(objQ3);
                    }
                    p2Var.g(strQ2, null, null, null, eVar4, z16, false, (e23.a) objQ3, mVar2, 24576, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR);
                    mh.c(gl1.y.Q(mVar2, R.string.msg_delete_livetrack_profile), c2.l.z(aVar4, f14, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                    mVar2.y();
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_profile_url_saved);
                    ev0.c cVar2 = (ev0.c) ((g3) p1Var4.getF182175a()).f35301b;
                    Boolean bool = cVar2 != null ? cVar2.f66157f : null;
                    boolean zB = mVar2.B(p1Var4) | mVar2.r(b0Var) | ((i18 & 14) == 4 ? true : z14) | mVar2.B(strQ3) | mVar2.r(fVar);
                    Object objQ4 = mVar2.q();
                    if (zB || objQ4 == c2565a) {
                        g.c cVar3 = new g.c(b0Var, fVar, p1Var4, feVar, strQ3, null);
                        mVar2.K(cVar3);
                        objQ4 = cVar3;
                    }
                    l0.e((e23.p) objQ4, bool, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                x xVar2 = (x) obj10;
                e23.l lVar = (e23.l) obj8;
                e23.l lVar2 = (e23.l) obj9;
                final e23.l lVar3 = (e23.l) obj4;
                e23.l lVar4 = (e23.l) obj7;
                p1 p1Var5 = (p1) obj11;
                p1 p1Var6 = (p1) obj5;
                e23.l lVar5 = (e23.l) hVar;
                final e23.l lVar6 = (e23.l) obj6;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean z17 = xVar2.f141023t;
                    p1 p1Var7 = this.f61362b;
                    if (z17) {
                        p1Var6 = p1Var6;
                        lVar5 = lVar5;
                        lVar6 = lVar6;
                        lVar4 = lVar4;
                        p1Var = p1Var7;
                        xVar = xVar2;
                        mVar = mVar3;
                        mVar.C(-770387827);
                        mVar.f();
                    } else {
                        mVar3.C(-770925987);
                        jt1.c.f100809a.getClass();
                        z3.e eVar5 = jt1.c.f100811c;
                        boolean zB2 = mVar3.B(lVar) | mVar3.r(xVar2) | mVar3.B(lVar2) | mVar3.B(p1Var7);
                        Object objQ5 = mVar3.q();
                        if (zB2) {
                            mVar = mVar3;
                            d0Var = new d0(lVar, xVar2, lVar2, p1Var7, 13);
                            xVar = xVar2;
                            p1Var = p1Var7;
                            mVar.K(d0Var);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                mVar = mVar3;
                                d0Var = new d0(lVar, xVar2, lVar2, p1Var7, 13);
                                xVar = xVar2;
                                p1Var = p1Var7;
                                mVar.K(d0Var);
                            } else {
                                d0Var = objQ5;
                                p1Var = p1Var7;
                                xVar = xVar2;
                                mVar = mVar3;
                            }
                        }
                        i3.u.b(eVar5, (e23.a) d0Var, null, null, null, false, null, null, mVar, 6, 508);
                        mVar.f();
                    }
                    if (xVar.f141019p) {
                        mVar.C(-770309366);
                        if (xVar.f141025v) {
                            mVar.C(-770295974);
                            jt1.c.f100809a.getClass();
                            z3.e eVar6 = jt1.c.f100812d;
                            boolean zB3 = mVar.B(lVar3) | mVar.r(xVar) | mVar.B(p1Var);
                            Object objQ6 = mVar.q();
                            if (zB3) {
                                final int i19 = 0;
                                objQ6 = new e23.a() { // from class: jt1.j
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i19) {
                                            case 0:
                                                lVar3.invoke(Long.valueOf(xVar.f141004a));
                                                p1Var.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                us1.c cVar4 = us1.c.REVIEW;
                                                x xVar3 = xVar;
                                                lVar3.invoke(new pt1.n.c(cVar4, xVar3.f141004a, g22.n.d(xVar3.f141017n)));
                                                p1Var.setValue(Boolean.FALSE);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ6);
                            } else {
                                aVar.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    final int i110 = 0;
                                    objQ6 = new e23.a() { // from class: jt1.j
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i110) {
                                                case 0:
                                                    lVar3.invoke(Long.valueOf(xVar.f141004a));
                                                    p1Var.setValue(Boolean.FALSE);
                                                    break;
                                                default:
                                                    us1.c cVar4 = us1.c.REVIEW;
                                                    x xVar3 = xVar;
                                                    lVar3.invoke(new pt1.n.c(cVar4, xVar3.f141004a, g22.n.d(xVar3.f141017n)));
                                                    p1Var.setValue(Boolean.FALSE);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar.K(objQ6);
                                }
                            }
                            i3.u.b(eVar6, (e23.a) objQ6, null, null, null, false, null, null, mVar, 6, 508);
                            mVar.f();
                        } else {
                            mVar.C(-769908691);
                            mVar.f();
                        }
                        if (z15) {
                            mVar.C(-769861137);
                            jt1.c.f100809a.getClass();
                            z3.e eVar7 = jt1.c.f100813e;
                            boolean zB4 = mVar.B(lVar4) | mVar.B(p1Var);
                            Object objQ7 = mVar.q();
                            if (zB4) {
                                objQ7 = new v1(lVar4, p1Var, 4);
                                mVar.K(objQ7);
                            } else {
                                aVar.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new v1(lVar4, p1Var, 4);
                                    mVar.K(objQ7);
                                }
                            }
                            i3.u.b(eVar7, (e23.a) objQ7, null, null, null, false, null, null, mVar, 6, 508);
                            mVar.f();
                        } else {
                            mVar.C(-769371027);
                            mVar.f();
                        }
                        jt1.c.f100809a.getClass();
                        z3.e eVar8 = jt1.c.f100814f;
                        boolean zB5 = mVar.B(p1Var5) | mVar.B(p1Var);
                        Object objQ8 = mVar.q();
                        if (zB5) {
                            objQ8 = new j1(p1Var5, p1Var, 11);
                            mVar.K(objQ8);
                        } else {
                            aVar.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new j1(p1Var5, p1Var, 11);
                                mVar.K(objQ8);
                            }
                        }
                        i3.u.b(eVar8, (e23.a) objQ8, null, null, null, false, null, null, mVar, 6, 508);
                        mVar.f();
                    } else {
                        mVar.C(-768947102);
                        if (w.J(xVar.f141010g)) {
                            mVar.C(-767739187);
                            mVar.f();
                        } else {
                            mVar.C(-768915451);
                            z3.e eVarC = z3.f.c(1905343983, new l1(p1Var6, 18, (byte) 0), mVar);
                            boolean zB6 = mVar.B(p1Var6) | mVar.r(xVar) | mVar.B(lVar5) | mVar.B(p1Var);
                            Object objQ9 = mVar.q();
                            if (zB6) {
                                d0 d0Var2 = new d0(p1Var6, xVar, lVar5, p1Var, 14);
                                mVar.K(d0Var2);
                                objQ9 = d0Var2;
                            } else {
                                aVar.getClass();
                                if (objQ9 == p3.m.a.f135155b) {
                                    d0 d0Var3 = new d0(p1Var6, xVar, lVar5, p1Var, 14);
                                    mVar.K(d0Var3);
                                    objQ9 = d0Var3;
                                }
                            }
                            i3.u.b(eVarC, (e23.a) objQ9, null, null, null, false, null, null, mVar, 6, 508);
                            mVar.f();
                        }
                        jt1.c.f100809a.getClass();
                        z3.e eVar9 = jt1.c.f100815g;
                        boolean zB7 = mVar.B(lVar6) | mVar.r(xVar) | mVar.B(p1Var);
                        Object objQ10 = mVar.q();
                        if (zB7) {
                            objQ10 = new e23.a() { // from class: jt1.j
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            lVar6.invoke(Long.valueOf(xVar.f141004a));
                                            p1Var.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            us1.c cVar4 = us1.c.REVIEW;
                                            x xVar3 = xVar;
                                            lVar6.invoke(new pt1.n.c(cVar4, xVar3.f141004a, g22.n.d(xVar3.f141017n)));
                                            p1Var.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ10);
                        } else {
                            aVar.getClass();
                            if (objQ10 == p3.m.a.f135155b) {
                                objQ10 = new e23.a() { // from class: jt1.j
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i17) {
                                            case 0:
                                                lVar6.invoke(Long.valueOf(xVar.f141004a));
                                                p1Var.setValue(Boolean.FALSE);
                                                break;
                                            default:
                                                us1.c cVar4 = us1.c.REVIEW;
                                                x xVar3 = xVar;
                                                lVar6.invoke(new pt1.n.c(cVar4, xVar3.f141004a, g22.n.d(xVar3.f141017n)));
                                                p1Var.setValue(Boolean.FALSE);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ10);
                            }
                        }
                        i3.u.b(eVar9, (e23.a) objQ10, null, null, null, false, null, null, mVar, 6, 508);
                        mVar.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                List list = (List) obj11;
                e23.l lVar7 = (e23.l) obj10;
                String str4 = (String) obj9;
                v vVar = (v) obj8;
                v vVar2 = (v) obj7;
                e23.l lVar8 = (e23.l) hVar;
                e23.l lVar9 = (e23.l) obj6;
                e23.a<Unit> aVar7 = (e23.a) obj5;
                Context context2 = (Context) obj4;
                a0 a0Var = (a0) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                a0Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(a0Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar10 = j92.b.f97899b;
                    c2.l.f(x2.h(aVar8, eVar10.f97920e), mVar4);
                    k2.h hVarA = k2.i.a(eVar10.f97918c);
                    p1 p1Var8 = this.f61362b;
                    o1.a(null, hVarA, null, null, z3.f.c(501504161, new kb0.a(context2, vVar, vVar2, p1Var8, 0), mVar4), mVar4, 196608, 29);
                    p3.m mVar5 = mVar4;
                    String strQ4 = gl1.y.Q(mVar5, R.string.custom_sleep_windows_day_selector_label);
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, c2.l.C(x2.f(aVar8, 1.0f), 0.0f, eVar10.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar5), mVar5, 0, 0, 131068);
                    lb0.c.a(0, lVar7, c2.l.A(x2.f(aVar8, 1.0f), 0.0f, eVar10.f97920e, 1), list, mVar5);
                    c2.l.f(a0Var.a(aVar8, 1.0f, true), mVar5);
                    lb0.g.a(0, c2.l.C(x2.f(aVar8, 1.0f), 0.0f, eVar10.f97920e, 0.0f, 0.0f, 13), str4, mVar5);
                    mb0.g gVar = (mb0.g) p1Var8.getF182175a();
                    mb0.g gVar2 = mb0.g.NONE;
                    if (gVar != gVar2) {
                        mVar5.C(-894280288);
                        boolean z18 = ((mb0.g) p1Var8.getF182175a()) == mb0.g.BED_TIME;
                        LocalTime localTime = (z18 ? vVar : vVar2).f16219a;
                        if (z18) {
                            i14 = 1356630144;
                            i15 = R.string.sleep_lbl_start_time;
                        } else {
                            i14 = 1356631775;
                            i15 = R.string.sleep_lbl_wake_time;
                        }
                        String strH = sn.a.h(mVar5, i14, i15, mVar5);
                        int hour = localTime.getHour();
                        int minute = localTime.getMinute();
                        j0.f23099a.getClass();
                        si siVarZ = bi.z(hour, minute, j0.D(), mVar5, 0, 0);
                        String strQ5 = gl1.y.Q(mVar5, R.string.lbl_ok);
                        i17 = ((mb0.g) p1Var8.getF182175a()) == gVar2 ? 0 : 1;
                        String strQ6 = gl1.y.Q(mVar5, R.string.lbl_cancel);
                        Object objQ11 = mVar5.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                        if (objQ11 == c2565a2) {
                            p1Var2 = p1Var8;
                            objQ11 = new jt1.h(p1Var2, 29);
                            mVar5.K(objQ11);
                        } else {
                            p1Var2 = p1Var8;
                        }
                        e23.a aVar9 = (e23.a) objQ11;
                        boolean zH = mVar5.h(z18) | mVar5.B(lVar8) | mVar5.B(lVar9);
                        Object objQ12 = mVar5.q();
                        if (zH || objQ12 == c2565a2) {
                            objQ12 = new kb0.b(z18, lVar8, lVar9, p1Var2, 0);
                            mVar5.K(objQ12);
                        }
                        g82.e.a(strH, siVarZ, i17, strQ6, aVar9, strQ5, (e23.p) objQ12, mVar5, 24576);
                        mVar5 = mVar5;
                        mVar5.f();
                    } else {
                        mVar5.C(-893035793);
                        mVar5.f();
                    }
                    if (z15) {
                        mVar5.C(-892978815);
                        c1.f110940a.a(false, gl1.y.Q(mVar5, R.string.overlapping_schedules_title), gl1.y.Q(mVar5, R.string.overlapping_schedules_message), null, null, gl1.y.Q(mVar5, R.string.lbl_ok), false, false, aVar7, null, aVar7, mVar5, 6, 0, 728);
                        mVar5.f();
                    } else {
                        mVar5.C(-892534833);
                        mVar5.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(p1 p1Var, b0 b0Var, yu0.f fVar, boolean z14, String str, Context context, ev0.e eVar, e23.a aVar, e23.a aVar2, c.q qVar, p1 p1Var2) {
        this.f61362b = p1Var;
        this.f61365e = b0Var;
        this.f61366f = fVar;
        this.f61363c = z14;
        this.f61367g = str;
        this.f61368h = context;
        this.f61369i = eVar;
        this.f61370j = aVar;
        this.f61371k = aVar2;
        this.f61372l = qVar;
        this.f61364d = p1Var2;
    }

    public /* synthetic */ e(x xVar, e23.l lVar, e23.l lVar2, p1 p1Var, e23.l lVar3, boolean z14, e23.l lVar4, p1 p1Var2, p1 p1Var3, e23.l lVar5, e23.l lVar6) {
        this.f61365e = xVar;
        this.f61366f = lVar;
        this.f61367g = lVar2;
        this.f61362b = p1Var;
        this.f61368h = lVar3;
        this.f61363c = z14;
        this.f61369i = lVar4;
        this.f61364d = p1Var2;
        this.f61370j = p1Var3;
        this.f61371k = lVar5;
        this.f61372l = lVar6;
    }
}
