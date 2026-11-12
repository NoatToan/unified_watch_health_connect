package fo;

import android.content.Context;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e2.i0;
import f5.z0;
import h2.j0;
import h5.e0;
import i3.d6;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import o53.f0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import v62.ja;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements e23.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72346a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f72347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f72348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f72349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zc.d f72350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f72351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f72352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f72353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f72354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f72355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f72356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f72357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f72358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f72359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f72360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f72361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f72362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f72363r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f72364t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f72365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f72366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f72367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f72368y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f72369z;

    public /* synthetic */ g(az0.c.a aVar, q qVar, Context context, e23.a aVar2, e23.a aVar3, zc.d dVar, e23.a aVar4, e23.a aVar5, e23.a aVar6, m3.r rVar, i53.c cVar, mc mcVar, o53.b0 b0Var, e23.l lVar, p1 p1Var, e23.p pVar, e23.l lVar2, e23.a aVar7, e23.a aVar8, e23.l lVar3, e23.l lVar4, e23.l lVar5, e23.a aVar9, e23.l lVar6, p1 p1Var2) {
        this.f72352g = aVar;
        this.f72353h = qVar;
        this.f72349d = context;
        this.f72348c = aVar2;
        this.f72354i = aVar3;
        this.f72350e = dVar;
        this.f72355j = aVar4;
        this.f72356k = aVar5;
        this.f72357l = aVar6;
        this.f72361p = rVar;
        this.f72362q = cVar;
        this.f72363r = mcVar;
        this.f72351f = b0Var;
        this.f72364t = lVar;
        this.f72347b = p1Var;
        this.B = pVar;
        this.f72365v = lVar2;
        this.f72358m = aVar7;
        this.f72359n = aVar8;
        this.f72366w = lVar3;
        this.f72367x = lVar4;
        this.f72368y = lVar5;
        this.f72360o = aVar9;
        this.f72369z = lVar6;
        this.A = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x018b  */
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
        p1 p1Var;
        mc mcVar;
        int i14 = this.f72346a;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.f72369z;
        Object obj6 = this.f72368y;
        Object obj7 = this.f72367x;
        Object obj8 = this.f72366w;
        Object obj9 = this.f72365v;
        Object obj10 = this.f72364t;
        Object obj11 = this.f72363r;
        Object obj12 = this.f72362q;
        Object obj13 = this.f72361p;
        Object obj14 = this.f72360o;
        Object obj15 = this.f72359n;
        Object obj16 = this.f72358m;
        Object obj17 = this.f72357l;
        Object obj18 = this.f72356k;
        Object obj19 = this.f72355j;
        Object obj20 = this.f72354i;
        Object obj21 = this.f72353h;
        Object obj22 = this.f72352g;
        p1 p1Var2 = this.f72347b;
        switch (i14) {
            case 0:
                az0.c.a aVar = (az0.c.a) obj22;
                q qVar = (q) obj21;
                e23.a aVar2 = (e23.a) obj20;
                e23.a aVar3 = (e23.a) obj19;
                e23.a aVar4 = (e23.a) obj18;
                e23.a aVar5 = (e23.a) obj17;
                m3.r rVar = (m3.r) obj13;
                i53.c cVar = (i53.c) obj12;
                mc mcVar2 = (mc) obj11;
                e23.l lVar = (e23.l) obj10;
                e23.p pVar = (e23.p) obj3;
                e23.l lVar2 = (e23.l) obj9;
                e23.a aVar6 = (e23.a) obj16;
                e23.a aVar7 = (e23.a) obj15;
                e23.l lVar3 = (e23.l) obj8;
                e23.l lVar4 = (e23.l) obj7;
                e23.l lVar5 = (e23.l) obj6;
                e23.a aVar8 = (e23.a) obj14;
                e23.l lVar6 = (e23.l) obj5;
                p1 p1Var3 = (p1) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zK = mVar.k(aVar == null ? -1 : aVar.ordinal());
                    Object objQ = mVar.q();
                    p3.m.a aVar9 = p3.m.f135153a;
                    if (zK) {
                        objQ = new k(aVar, p1Var2, null);
                        mVar.K(objQ);
                    } else {
                        aVar9.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new k(aVar, p1Var2, null);
                            mVar.K(objQ);
                        }
                    }
                    l0.e((e23.p) objQ, aVar, mVar);
                    Boolean bool = (Boolean) p1Var2.getF182175a();
                    bool.getClass();
                    Object objQ2 = mVar.q();
                    aVar9.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new l(p1Var2, null);
                        mVar.K(objQ2);
                    }
                    l0.e((e23.p) objQ2, bool, mVar);
                    d0 d0Var = qVar.f72410i;
                    a0 a0Var = qVar.f72411j;
                    boolean zB = mVar.B(qVar);
                    Context context = this.f72349d;
                    boolean zR = zB | mVar.r(context);
                    e23.a aVar10 = this.f72348c;
                    boolean zB2 = zR | mVar.B(aVar10);
                    Object objQ3 = mVar.q();
                    if (zB2 || objQ3 == c2565a) {
                        objQ3 = new m(qVar, context, aVar10, null);
                        mVar.K(objQ3);
                    }
                    l0.e((e23.p) objQ3, d0Var, mVar);
                    boolean zB3 = mVar.B(qVar) | mVar.B(aVar2);
                    zc.d dVar = this.f72350e;
                    boolean zR2 = zB3 | mVar.r(dVar);
                    Object objQ4 = mVar.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new n(qVar, aVar2, dVar, null);
                        mVar.K(objQ4);
                    }
                    l0.e((e23.p) objQ4, a0Var, mVar);
                    if (a0Var != null) {
                        mVar.C(-753256312);
                        if (a0Var.f72260d) {
                            mVar.C(-753194405);
                            f0.b(a0Var.f72257a, aVar3, aVar4, mVar, 0);
                            mVar.f();
                        } else {
                            mVar.C(-753049294);
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        mVar.C(-753017550);
                        mVar.f();
                    }
                    boolean z14 = qVar.f72404c;
                    h4.r.a aVar11 = h4.r.S;
                    h4.r rVarD = c2.l.D(x2.d(u1.n.e(aVar11, tn.k.a(d92.b.f58623a, mVar), m1.f128891a), 1.0f));
                    boolean zB4 = mVar.B(aVar5) | mVar.r(dVar);
                    Object objQ5 = mVar.q();
                    if (zB4 || objQ5 == c2565a) {
                        objQ5 = new h(aVar5, dVar, 0);
                        mVar.K(objQ5);
                    }
                    m3.l.b(z14, (e23.a) objQ5, rVarD, rVar, null, z3.f.c(782727639, new e11.c0(14, qVar, rVar), mVar), z3.f.c(759036790, new i(dVar, qVar, pVar, lVar2, aVar6, aVar7, lVar3, lVar4, lVar5, aVar8, lVar6), mVar), mVar, 1769472, 16);
                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                        mVar.C(-751537858);
                        String str = qVar.f72403b;
                        boolean z15 = qVar.f72413l;
                        i53.c<jo.c> cVar2 = qVar.f72412k;
                        o53.b0 b0Var = this.f72351f;
                        boolean zR3 = mVar.r(b0Var) | mVar.B(mcVar2);
                        Object objQ6 = mVar.q();
                        if (zR3 || objQ6 == c2565a) {
                            p1Var = p1Var3;
                            objQ6 = new j(b0Var, mcVar2, p1Var, 0);
                            mVar.K(objQ6);
                        } else {
                            p1Var = p1Var3;
                        }
                        e23.a aVar12 = (e23.a) objQ6;
                        boolean zR4 = mVar.r(b0Var) | mVar.B(mcVar2) | mVar.B(lVar);
                        Object objQ7 = mVar.q();
                        if (zR4 || objQ7 == c2565a) {
                            mcVar = mcVar2;
                            objQ7 = new ev2.f(lVar, b0Var, mcVar, p1Var, 4);
                            mVar.K(objQ7);
                        } else {
                            mcVar = mcVar2;
                        }
                        ho.w.c(str, z15, cVar2, cVar, mcVar, aVar12, (e23.l) objQ7, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-750995854);
                        mVar.f();
                    }
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar.C(-750936551);
                        h4.r rVarD2 = x2.d(aVar11, 1.0f);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81531i, false);
                        int iHashCode = Long.hashCode(mVar.getU());
                        i2 i2VarX = mVar.x();
                        h4.r rVarC = h4.k.c(rVarD2, mVar);
                        h5.g.V.getClass();
                        e0.a aVar13 = h5.g.a.f81805b;
                        if (mVar.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar13);
                        } else {
                            mVar.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar);
                        c2.u uVar = c2.u.f22885a;
                        l72.s sVar = l72.s.f111232a;
                        h4.r rVarF = x2.f(aVar11, 1.0f);
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                        l72.s.b bVar2 = l72.s.b.ALERT;
                        s62.a.f157643a.getClass();
                        sVar.d(rVarY, bVar2, ja.a(t62.b.f162798a), gl1.y.Q(mVar, R.string.txt_no_internet_connection), null, null, null, null, mVar, 48, 496);
                        mVar.y();
                        mVar.f();
                    } else {
                        mVar.C(-750328238);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                String str2 = (String) obj22;
                List list = (List) obj21;
                gi0.a aVar14 = (gi0.a) obj20;
                final List list2 = (List) obj19;
                final j0 j0Var = (j0) obj18;
                final zc.d dVar2 = (zc.d) obj17;
                final mi0.f fVar = (mi0.f) obj16;
                final u2.h hVar = (u2.h) obj15;
                final p003ji0.a aVar15 = (p003ji0.a) obj14;
                final i0 i0Var = (i0) obj13;
                final i0 i0Var2 = (i0) obj12;
                final zc.d dVar3 = (zc.d) obj11;
                final zc.d dVar4 = (zc.d) obj10;
                final u2.h hVar2 = (u2.h) obj9;
                final p003ji0.a aVar16 = (p003ji0.a) obj8;
                final i0 i0Var3 = (i0) obj7;
                final i0 i0Var4 = (i0) obj6;
                final zc.d dVar5 = (zc.d) obj5;
                final i0 i0Var5 = (i0) obj4;
                final x3 x3Var = (x3) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    z3.e eVarC = z3.f.c(1774625776, new et.p(str2, this.f72348c, list, aVar14, this.f72349d, 26), mVar2);
                    final o53.b0 b0Var2 = this.f72351f;
                    final zc.d dVar6 = this.f72350e;
                    z02.d.a(zBooleanValue, eVarC, null, null, null, z3.f.c(-926194444, new e23.p() { // from class: ii0.n
                        @Override // e23.p
                        public final Object invoke(Object obj23, Object obj24) {
                            p3.m mVar3 = (p3.m) obj23;
                            int iIntValue3 = ((Integer) obj24).intValue();
                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                mVar3.C(-1014628044);
                                final List list3 = list2;
                                ArrayList arrayList = new ArrayList(p13.y.r(list3, 10));
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(gl1.y.Q(mVar3, ((p003ji0.k) it.next()).f98797a));
                                }
                                mVar3.f();
                                final e2.i0 i0Var6 = i0Var;
                                final e2.i0 i0Var7 = i0Var2;
                                final e2.i0 i0Var8 = i0Var3;
                                final e2.i0 i0Var9 = i0Var4;
                                final e2.i0 i0Var10 = i0Var5;
                                final h2.j0 j0Var2 = j0Var;
                                final p003ji0.a aVar17 = aVar15;
                                final p003ji0.a aVar18 = aVar16;
                                final mi0.f fVar2 = fVar;
                                final o53.b0 b0Var3 = b0Var2;
                                final x3 x3Var2 = x3Var;
                                final u2.h hVar3 = hVar;
                                final u2.h hVar4 = hVar2;
                                final zc.d dVar7 = dVar6;
                                final zc.d dVar8 = dVar2;
                                final zc.d dVar9 = dVar3;
                                final zc.d dVar10 = dVar4;
                                final zc.d dVar11 = dVar5;
                                p003ji0.r.a(arrayList, 0, j0Var2, z3.f.c(228042994, new e23.q() { // from class: ii0.o
                                    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
                                    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
                                    @Override // e23.q
                                    public final Object invoke(Object obj25, Object obj26, Object obj27) {
                                        int iIntValue4 = ((Integer) obj25).intValue();
                                        p3.m mVar4 = (p3.m) obj26;
                                        int iIntValue5 = ((Integer) obj27).intValue();
                                        if ((iIntValue5 & 6) == 0) {
                                            iIntValue5 |= mVar4.k(iIntValue4) ? 4 : 2;
                                        }
                                        if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            List list4 = list3;
                                            int i15 = u.a.f93743a[((p003ji0.k) list4.get(iIntValue4)).ordinal()];
                                            mi0.f fVar3 = fVar2;
                                            p3.m.a aVar19 = p3.m.f135153a;
                                            if (i15 == 1) {
                                                mVar4.C(105989252);
                                                mi0.f.j jVar = fVar3.f118772g;
                                                mi0.f.c cVar3 = (mi0.f.c) x3Var2.getF182175a();
                                                mi0.f.l lVar7 = fVar3.f118774i;
                                                boolean zR5 = mVar4.r(fVar3);
                                                Object objQ8 = mVar4.q();
                                                if (zR5) {
                                                    objQ8 = new p(fVar3, 0);
                                                    mVar4.K(objQ8);
                                                } else {
                                                    aVar19.getClass();
                                                    if (objQ8 == p3.m.a.f135155b) {
                                                        objQ8 = new p(fVar3, 0);
                                                        mVar4.K(objQ8);
                                                    }
                                                }
                                                int i16 = li0.f.f112658h;
                                                x.b(dVar7, dVar8, jVar, hVar3, aVar17, i0Var6, i0Var7, cVar3, lVar7, (e23.a) objQ8, mVar4, (i16 << 6) | 72 | (i16 << 24));
                                                mVar4.f();
                                            } else if (i15 == 2) {
                                                mVar4.C(106013147);
                                                mi0.f.j jVar2 = fVar3.f118772g;
                                                o53.b0 b0Var4 = b0Var3;
                                                boolean zR6 = mVar4.r(b0Var4);
                                                h2.j0 j0Var3 = j0Var2;
                                                boolean zB5 = zR6 | mVar4.B(j0Var3);
                                                Object objQ9 = mVar4.q();
                                                if (zB5) {
                                                    objQ9 = new d6(b0Var4, 12, j0Var3, list4);
                                                    mVar4.K(objQ9);
                                                } else {
                                                    aVar19.getClass();
                                                    if (objQ9 == p3.m.a.f135155b) {
                                                        objQ9 = new d6(b0Var4, 12, j0Var3, list4);
                                                        mVar4.K(objQ9);
                                                    }
                                                }
                                                a0.a(dVar9, dVar10, jVar2, hVar4, aVar18, i0Var8, i0Var9, (e23.a) objQ9, mVar4, 72 | (li0.f.f112658h << 6));
                                                mVar4.f();
                                            } else {
                                                if (i15 != 3) {
                                                    throw n23.j.m(mVar4, 105987865);
                                                }
                                                mVar4.C(106038222);
                                                c0.a(dVar11, fVar3.f118773h, i0Var10, mVar4, (li0.f.f112658h << 3) | 8);
                                                mVar4.f();
                                            }
                                        } else {
                                            mVar4.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, mVar3), mVar3, 3072, 2);
                                x1 x1Var4 = p3.n.f135158a;
                            } else {
                                mVar3.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, 196656, 28);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(p1 p1Var, String str, e23.a aVar, List list, gi0.a aVar2, Context context, List list2, h2.b bVar, zc.d dVar, zc.d dVar2, mi0.f fVar, u2.h hVar, p003ji0.a aVar3, i0 i0Var, i0 i0Var2, zc.d dVar3, zc.d dVar4, u2.h hVar2, p003ji0.a aVar4, i0 i0Var3, i0 i0Var4, o53.b0 b0Var, zc.d dVar5, i0 i0Var5, p1 p1Var2) {
        this.f72347b = p1Var;
        this.f72352g = str;
        this.f72348c = aVar;
        this.f72353h = list;
        this.f72354i = aVar2;
        this.f72349d = context;
        this.f72355j = list2;
        this.f72356k = bVar;
        this.f72350e = dVar;
        this.f72357l = dVar2;
        this.f72358m = fVar;
        this.f72359n = hVar;
        this.f72360o = aVar3;
        this.f72361p = i0Var;
        this.f72362q = i0Var2;
        this.f72363r = dVar3;
        this.f72364t = dVar4;
        this.f72365v = hVar2;
        this.f72366w = aVar4;
        this.f72367x = i0Var3;
        this.f72368y = i0Var4;
        this.f72351f = b0Var;
        this.f72369z = dVar5;
        this.A = i0Var5;
        this.B = p1Var2;
    }
}
