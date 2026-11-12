package ii0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.p2;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.u0;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93626a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f93627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f93629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f93630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f93631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f93632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f93633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f93634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f93635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f93636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f93637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f93638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f93639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f93640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f93641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f93642q;

    public /* synthetic */ i0(List list, n1 n1Var, zc.d dVar, zc.d dVar2, mi0.j jVar, u2.h hVar, p003ji0.a aVar, e2.i0 i0Var, e2.i0 i0Var2, zc.d dVar3, zc.d dVar4, u2.h hVar2, p003ji0.a aVar2, e2.i0 i0Var3, e2.i0 i0Var4, x3 x3Var) {
        this.f93628c = list;
        this.f93629d = n1Var;
        this.f93630e = dVar;
        this.f93631f = dVar2;
        this.f93634i = jVar;
        this.f93635j = hVar;
        this.f93637l = aVar;
        this.f93639n = i0Var;
        this.f93640o = i0Var2;
        this.f93632g = dVar3;
        this.f93633h = dVar4;
        this.f93636k = hVar2;
        this.f93638m = aVar2;
        this.f93641p = i0Var3;
        this.f93642q = i0Var4;
        this.f93627b = x3Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0173  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0253  */
    /* JADX WARN: Code duplicated, block: B:65:0x0293  */
    /* JADX WARN: Code duplicated, block: B:72:0x031b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i14 = this.f93626a;
        Object obj3 = this.f93642q;
        Object obj4 = this.f93641p;
        Object obj5 = this.f93640o;
        Object obj6 = this.f93639n;
        Object obj7 = this.f93638m;
        Object obj8 = this.f93637l;
        Object obj9 = this.f93636k;
        Object obj10 = this.f93635j;
        Object obj11 = this.f93634i;
        Object obj12 = this.f93633h;
        Object obj13 = this.f93632g;
        Object obj14 = this.f93631f;
        Object obj15 = this.f93630e;
        Object obj16 = this.f93629d;
        Object obj17 = this.f93628c;
        switch (i14) {
            case 0:
                List list = (List) obj17;
                n1 n1Var = (n1) obj16;
                final zc.d dVar = (zc.d) obj15;
                final zc.d dVar2 = (zc.d) obj14;
                final mi0.j jVar = (mi0.j) obj11;
                final u2.h hVar = (u2.h) obj10;
                final p003ji0.a aVar = (p003ji0.a) obj8;
                final e2.i0 i0Var = (e2.i0) obj6;
                final e2.i0 i0Var2 = (e2.i0) obj5;
                final zc.d dVar3 = (zc.d) obj13;
                final zc.d dVar4 = (zc.d) obj12;
                final u2.h hVar2 = (u2.h) obj9;
                final p003ji0.a aVar2 = (p003ji0.a) obj7;
                final e2.i0 i0Var3 = (e2.i0) obj4;
                final e2.i0 i0Var4 = (e2.i0) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    mVar.C(1333859761);
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(gl1.y.Q(mVar, ((p003ji0.k) it.next()).f98797a));
                        list = list;
                    }
                    final List list2 = list;
                    mVar.f();
                    int intValue = n1Var.getIntValue();
                    final x3 x3Var = this.f93627b;
                    p003ji0.r.a(arrayList, intValue, null, z3.f.c(351925551, new e23.q() { // from class: ii0.j0
                        /* JADX WARN: Code duplicated, block: B:23:0x007a  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00be  */
                        @Override // e23.q
                        public final Object invoke(Object obj18, Object obj19, Object obj20) {
                            int iIntValue2 = ((Integer) obj18).intValue();
                            p3.m mVar2 = (p3.m) obj19;
                            int iIntValue3 = ((Integer) obj20).intValue();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= mVar2.k(iIntValue2) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                int i15 = o0.a.f93719a[((p003ji0.k) list2.get(iIntValue2)).ordinal()];
                                mi0.j jVar2 = jVar;
                                x3 x3Var2 = x3Var;
                                p3.m.a aVar3 = p3.m.f135153a;
                                if (i15 == 1) {
                                    mVar2.C(-1101958232);
                                    String str2 = (String) x3Var2.getF182175a();
                                    mi0.j.k kVar = jVar2.f118903g;
                                    boolean zR = mVar2.r(jVar2);
                                    Object objQ = mVar2.q();
                                    if (zR) {
                                        objQ = new k0(jVar2, 0);
                                        mVar2.K(objQ);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = new k0(jVar2, 0);
                                            mVar2.K(objQ);
                                        }
                                    }
                                    gl.b.c(str2, dVar, dVar2, kVar, hVar, aVar, i0Var, i0Var2, (e23.a) objQ, mVar2, 576 | (li0.f.f112658h << 9));
                                    mVar2.f();
                                } else if (i15 != 2) {
                                    mVar2.C(200299249);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1101937232);
                                    String str3 = (String) x3Var2.getF182175a();
                                    mi0.j.k kVar2 = jVar2.f118903g;
                                    boolean zR2 = mVar2.r(jVar2);
                                    Object objQ2 = mVar2.q();
                                    if (zR2) {
                                        objQ2 = new k0(jVar2, 1);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new k0(jVar2, 1);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    gl1.d.d(str3, dVar3, dVar4, kVar2, hVar2, aVar2, i0Var3, i0Var4, (e23.a) objQ2, mVar2, 576 | (li0.f.f112658h << 9));
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 3072, 4);
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                l11.a.b bVar = (l11.a.b) obj17;
                mc mcVar = (mc) obj16;
                v21.e eVar = (v21.e) obj15;
                l11.a aVar3 = (l11.a) obj14;
                e01.a aVar4 = (e01.a) obj13;
                l11.a.d dVar5 = (l11.a.d) obj12;
                b11.l lVar = (b11.l) obj11;
                i53.c cVar = (i53.c) obj10;
                o53.b0 b0Var = (o53.b0) obj9;
                b11.f fVar = (b11.f) obj8;
                g21.f0 f0Var = (g21.f0) obj7;
                g21.u uVar = (g21.u) obj6;
                e23.a aVar5 = (e23.a) obj5;
                p1 p1Var = (p1) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (bVar != null) {
                        boolean z14 = bVar.f108079e;
                        mVar2.C(-323027161);
                        b11.i.a aVar6 = bVar.f108075a;
                        h4.r.a aVar7 = h4.r.S;
                        long jA = tn.k.a(d92.b.f58623a, mVar2);
                        m1.a aVar8 = m1.f128891a;
                        h4.r rVarB = a2.b(c2.l.D(u1.n.e(aVar7, jA, aVar8)), a2.a(mVar2), true);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar9 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        c2.z zVarA = c2.y.a(c2.j.f22694d, aVar9, mVar2, 48);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarB, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar10 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar10);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        b11.d dVar6 = aVar6.f14301g;
                        double d14 = aVar6.f14298d;
                        b11.s sVar = aVar6.f14302h;
                        String str2 = dVar6.f14256d;
                        String str3 = dVar6.f14254b;
                        b11.t tVar = aVar6.f14304j;
                        String str4 = tVar.f14379b;
                        if (str4 == null && (str4 = tVar.f14378a) == null) {
                            str4 = tVar.f14380c;
                        }
                        i11.e.a(24576, z3.f.c(-1935048429, new ix.h(aVar3, aVar6, aVar5, p1Var, p1Var2, 2), mVar2), null, str2, str3, str4, mVar2);
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f14 = eVar2.f97920e;
                        c2.l.f(x2.h(aVar7, f14), mVar2);
                        boolean zR = mVar2.r(aVar3);
                        Object objQ = mVar2.q();
                        p3.m.a aVar11 = p3.m.f135153a;
                        if (zR) {
                            objQ = new k11.m.b(aVar3);
                            mVar2.K(objQ);
                        } else {
                            aVar11.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new k11.m.b(aVar3);
                                mVar2.K(objQ);
                            }
                        }
                        k11.m.g(aVar6, eVar, bVar, (e23.l) ((k23.g) objQ), mVar2, 0);
                        double d15 = aVar6.f14298d;
                        a11.r rVarN = aVar4.n();
                        boolean zR2 = mVar2.r(aVar4);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new k11.m.c(aVar4);
                            mVar2.K(objQ2);
                        } else {
                            aVar11.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new k11.m.c(aVar4);
                                mVar2.K(objQ2);
                            }
                        }
                        k23.g gVar = (k23.g) objQ2;
                        boolean z15 = dVar5 instanceof l11.a.d.f;
                        boolean z16 = dVar5 instanceof l11.a.d.k;
                        boolean zR3 = mVar2.r(aVar3);
                        Object objQ3 = mVar2.q();
                        if (zR3) {
                            objQ3 = new k11.m.d(aVar3);
                            mVar2.K(objQ3);
                        } else {
                            aVar11.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new k11.m.d(aVar3);
                                mVar2.K(objQ3);
                            }
                        }
                        i11.k.a(d15, rVarN, (e23.l) gVar, eVar, z15, z16, (e23.l) ((k23.g) objQ3), mVar2, 0);
                        c2.l.f(x2.h(aVar7, f14), mVar2);
                        if (lVar == null) {
                            mVar2.C(-1996325111);
                            mVar2.f();
                            str = null;
                        } else {
                            mVar2.C(212697080);
                            String strA = lVar.a(w2.a0.s(mVar2));
                            mVar2.f();
                            str = strA;
                        }
                        if (aVar3.f108054c == j11.c.DAILY_LOG) {
                            mVar2.C(-1996184339);
                            if (z14) {
                                mVar2.C(-1995777774);
                                mVar2.f();
                            } else {
                                mVar2.C(-1996121533);
                                i53.c<b11.l> cVar2 = bVar.f108078d;
                                Long lValueOf = lVar != null ? Long.valueOf(lVar.f14331a) : null;
                                boolean z17 = bVar.f108080f;
                                boolean zR4 = mVar2.r(aVar3);
                                Object objQ4 = mVar2.q();
                                if (zR4) {
                                    objQ4 = new k11.g(aVar3, 1);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar11.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new k11.g(aVar3, 1);
                                        mVar2.K(objQ4);
                                    }
                                }
                                y01.p.a(null, cVar2, lValueOf, (e23.l) objQ4, z17, mVar2, 0, 1);
                                mVar2.f();
                            }
                            b63.v vVar = aVar6.f14297c;
                            Boolean boolValueOf = Boolean.valueOf(z14);
                            boolean zR5 = mVar2.r(aVar3);
                            Object objQ5 = mVar2.q();
                            if (zR5) {
                                objQ5 = new k11.g(aVar3, 2);
                                mVar2.K(objQ5);
                            } else {
                                aVar11.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new k11.g(aVar3, 2);
                                    mVar2.K(objQ5);
                                }
                            }
                            y01.n.a(eVar, vVar, str, boolValueOf, (e23.l) objQ5, mVar2, 0);
                            c2.l.f(x2.h(aVar7, f14), mVar2);
                            mVar2.f();
                        } else {
                            mVar2.C(-1995318478);
                            mVar2.f();
                        }
                        y01.r.a(c2.l.y(u1.n.e(aVar7, d92.b.a(mVar2).c().c(), aVar8), f14), eVar, sVar.f14375d.g().a().c(d14), eVar2.f97921f, false, cVar, mVar2, 0, 16);
                        p2 p2Var = p2.f111205a;
                        String strQ = gl1.y.Q(mVar2, R.string.view_full_nutrition);
                        boolean zR6 = mVar2.r(b0Var) | mVar2.B(mcVar);
                        Object objQ6 = mVar2.q();
                        if (zR6) {
                            objQ6 = new cn1.t(b0Var, mcVar, 24);
                            mVar2.K(objQ6);
                        } else {
                            aVar11.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new cn1.t(b0Var, mcVar, 24);
                                mVar2.K(objQ6);
                            }
                        }
                        p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ6, mVar2, 0, 254);
                        c2.l.f(x2.h(aVar7, f14), mVar2);
                        g21.h hVar3 = bVar.f108077c;
                        z01.f.a(eVar, hVar3.f75428e, (fVar == null ? hVar3.f75429f : fVar).g(), str, f0Var, uVar, sVar.f14375d.g().c(d14), (i53.c) this.f93627b.getF182175a(), mVar2, 0);
                        mVar2.y();
                        r1.c0.e(mcVar.e(), null, u0.l(), null, null, z3.f.c(-291350482, new fb0.b(mcVar, b0Var, aVar6, eVar, 17), mVar2), mVar2, 196992, 26);
                        mVar2.f();
                    } else {
                        mVar2.C(-317774335);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i0(l11.a.b bVar, mc mcVar, v21.e eVar, l11.a aVar, e01.a aVar2, l11.a.d dVar, b11.l lVar, i53.c cVar, o53.b0 b0Var, b11.f fVar, g21.f0 f0Var, g21.u uVar, e23.a aVar3, p1 p1Var, p1 p1Var2, p1 p1Var3) {
        this.f93628c = bVar;
        this.f93629d = mcVar;
        this.f93630e = eVar;
        this.f93631f = aVar;
        this.f93632g = aVar2;
        this.f93633h = dVar;
        this.f93634i = lVar;
        this.f93635j = cVar;
        this.f93636k = b0Var;
        this.f93637l = fVar;
        this.f93638m = f0Var;
        this.f93639n = uVar;
        this.f93640o = aVar3;
        this.f93641p = p1Var;
        this.f93642q = p1Var2;
        this.f93627b = p1Var3;
    }
}
