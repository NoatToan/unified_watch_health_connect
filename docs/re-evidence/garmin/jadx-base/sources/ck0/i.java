package ck0;

import am.x0;
import android.content.Context;
import b82.k0;
import b82.n0;
import b82.t0;
import c2.b0;
import c2.k3;
import c2.q2;
import c2.q3;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import f5.z0;
import f72.n1;
import f72.n2;
import gg1.o0;
import h5.e0;
import i3.fe;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import jk0.x;
import kotlin.m3;
import kotlin.o1;
import l72.f0;
import l72.i3;
import l72.u0;
import o4.d0;
import o4.m1;
import o4.q1;
import o4.t1;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p006l2.z1;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.g0;
import r1.v1;
import r1.w1;
import r53.p2;
import s5.i0;
import s5.r0;
import u1.a2;
import ug2.q0;
import v62.b3;
import v62.e1;
import v62.f2;
import v62.fa;
import v62.j5;
import v62.o2;
import w2.a0;
import w5.c0;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27838a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f27845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f27846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f27847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f27848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f27849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f27850m;

    public /* synthetic */ i(x0 x0Var, boolean z14, String str, String str2, String str3, String str4, String str5, String str6, String str7, e23.l lVar, z51.h hVar, e23.l lVar2) {
        this.f27843f = x0Var;
        this.f27839b = z14;
        this.f27840c = str;
        this.f27844g = str2;
        this.f27845h = str3;
        this.f27846i = str4;
        this.f27847j = str5;
        this.f27841d = str6;
        this.f27848k = str7;
        this.f27842e = lVar;
        this.f27849l = hVar;
        this.f27850m = lVar2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0141  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2) {
        String str;
        final int i14;
        final int i15;
        String strH;
        s5.x0 x0VarF;
        v21.e eVar;
        int i16;
        int i17;
        p1 p1Var;
        x3 x3Var = (x3) this.f27843f;
        x3 x3Var2 = (x3) this.f27844g;
        String str2 = (String) this.f27840c;
        final f11.j jVar = (f11.j) this.f27845h;
        v21.e eVar2 = (v21.e) this.f27846i;
        p1 p1Var2 = (p1) this.f27847j;
        p1 p1Var3 = (p1) this.f27841d;
        x3 x3Var3 = (x3) this.f27848k;
        x3 x3Var4 = (x3) this.f27849l;
        x3 x3Var5 = (x3) this.f27850m;
        p1 p1Var4 = (p1) this.f27842e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            f11.j.b bVar = (f11.j.b) x3Var.getF182175a();
            if (bVar != null) {
                boolean z14 = bVar.f67985d;
                mVar.C(987162965);
                b11.i.c cVar = bVar.f67982a;
                b11.l lVar = (b11.l) x3Var2.getF182175a();
                if (lVar == null) {
                    mVar.C(986976964);
                    mVar.f();
                    str = null;
                } else {
                    mVar.C(-1630730019);
                    String strA = lVar.a(a0.s(mVar));
                    mVar.f();
                    str = strA;
                }
                h4.r.a aVar = h4.r.S;
                h4.r rVarB = a2.b(c2.l.D(u1.n.e(aVar, tn.k.a(d92.b.f58623a, mVar), m1.f128891a)), a2.a(mVar), true);
                h4.d.f81522a.getClass();
                h4.g.a aVar2 = h4.d.a.f81536n;
                c2.j.f22691a.getClass();
                z zVarA = y.a(c2.j.f22694d, aVar2, mVar, 48);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                h4.r rVarC = h4.k.c(rVarB, mVar);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar3);
                } else {
                    mVar.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar);
                b4.c(h5.g.a.f81809f, i2VarX, mVar);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar);
                b0 b0Var = b0.f22601a;
                String strQ = gl1.y.Q(mVar, R.string.lbl_name);
                String str3 = cVar.f14316b;
                b11.f fVar = cVar.f14319e;
                if (str3 == null) {
                    str3 = "";
                }
                boolean zR = mVar.r(jVar);
                Object objQ = mVar.q();
                p3.m.a aVar4 = p3.m.f135153a;
                if (zR) {
                    final int i18 = 6;
                    objQ = new e23.l() { // from class: e11.g0
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            switch (i18) {
                                case 0:
                                    b11.l lVar2 = (b11.l) obj3;
                                    lVar2.getClass();
                                    f11.j jVar2 = jVar;
                                    jVar2.getClass();
                                    p2 p2Var = jVar2.f67972i;
                                    f11.j.b bVar3 = (f11.j.b) p2Var.getValue();
                                    if (bVar3 != null) {
                                        jVar2.f67976m.k(null, lVar2);
                                        p2Var.k(null, f11.j.b.a(bVar3, null, false, 47));
                                    }
                                    break;
                                case 1:
                                    b63.v vVar = (b63.v) obj3;
                                    vVar.getClass();
                                    f11.j jVar3 = jVar;
                                    jVar3.getClass();
                                    p2 p2Var2 = jVar3.f67972i;
                                    f11.j.b bVar4 = (f11.j.b) p2Var2.getValue();
                                    if (bVar4 != null) {
                                        b11.i.c cVarI = b11.i.c.i(bVar4.f67982a, null, vVar, 0L, null, 27);
                                        if (jVar3.f67965b.f14338a) {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                            jVar3.f67976m.setValue(zf.b.L(bVar4.f67984c, true, vVar, null, jVar3.f67970g.a()));
                                        } else {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                        }
                                    }
                                    break;
                                case 2:
                                    Double d14 = (Double) obj3;
                                    Integer numValueOf = d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null;
                                    f11.j jVar4 = jVar;
                                    p2 p2Var3 = jVar4.f67972i;
                                    f11.j.b bVar5 = (f11.j.b) p2Var3.getValue();
                                    if (bVar5 != null) {
                                        p2Var3.k(null, f11.j.b.a(bVar5, b11.i.c.i(bVar5.f67982a, null, null, 0L, b11.f.b(bVar5.f67982a.f14319e, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286), 15), false, 62));
                                        jVar4.f67974k.setValue(f11.j.c.LOADED);
                                    }
                                    break;
                                case 3:
                                    Double d15 = (Double) obj3;
                                    p2 p2Var4 = jVar.f67972i;
                                    f11.j.b bVar6 = (f11.j.b) p2Var4.getValue();
                                    if (bVar6 != null) {
                                        p2Var4.k(null, f11.j.b.a(bVar6, b11.i.c.i(bVar6.f67982a, null, null, 0L, b11.f.b(bVar6.f67982a.f14319e, null, null, d15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283), 15), false, 62));
                                    }
                                    break;
                                case 4:
                                    Double d16 = (Double) obj3;
                                    p2 p2Var5 = jVar.f67972i;
                                    f11.j.b bVar7 = (f11.j.b) p2Var5.getValue();
                                    if (bVar7 != null) {
                                        p2Var5.k(null, f11.j.b.a(bVar7, b11.i.c.i(bVar7.f67982a, null, null, 0L, b11.f.b(bVar7.f67982a.f14319e, null, null, null, d16, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279), 15), false, 62));
                                    }
                                    break;
                                case 5:
                                    Double d17 = (Double) obj3;
                                    p2 p2Var6 = jVar.f67972i;
                                    f11.j.b bVar8 = (f11.j.b) p2Var6.getValue();
                                    if (bVar8 != null) {
                                        p2Var6.k(null, f11.j.b.a(bVar8, b11.i.c.i(bVar8.f67982a, null, null, 0L, b11.f.b(bVar8.f67982a.f14319e, null, d17, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285), 15), false, 62));
                                    }
                                    break;
                                default:
                                    String str4 = (String) obj3;
                                    str4.getClass();
                                    f11.j jVar5 = jVar;
                                    jVar5.getClass();
                                    p2 p2Var7 = jVar5.f67972i;
                                    f11.j.b bVar9 = (f11.j.b) p2Var7.getValue();
                                    if (bVar9 != null) {
                                        p2Var7.k(null, f11.j.b.a(bVar9, b11.i.c.i(bVar9.f67982a, str4, null, 0L, null, 29), false, 62));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final int i19 = 6;
                        objQ = new e23.l() { // from class: e11.g0
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                switch (i19) {
                                    case 0:
                                        b11.l lVar2 = (b11.l) obj3;
                                        lVar2.getClass();
                                        f11.j jVar2 = jVar;
                                        jVar2.getClass();
                                        p2 p2Var = jVar2.f67972i;
                                        f11.j.b bVar3 = (f11.j.b) p2Var.getValue();
                                        if (bVar3 != null) {
                                            jVar2.f67976m.k(null, lVar2);
                                            p2Var.k(null, f11.j.b.a(bVar3, null, false, 47));
                                        }
                                        break;
                                    case 1:
                                        b63.v vVar = (b63.v) obj3;
                                        vVar.getClass();
                                        f11.j jVar3 = jVar;
                                        jVar3.getClass();
                                        p2 p2Var2 = jVar3.f67972i;
                                        f11.j.b bVar4 = (f11.j.b) p2Var2.getValue();
                                        if (bVar4 != null) {
                                            b11.i.c cVarI = b11.i.c.i(bVar4.f67982a, null, vVar, 0L, null, 27);
                                            if (jVar3.f67965b.f14338a) {
                                                p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                                jVar3.f67976m.setValue(zf.b.L(bVar4.f67984c, true, vVar, null, jVar3.f67970g.a()));
                                            } else {
                                                p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                            }
                                        }
                                        break;
                                    case 2:
                                        Double d14 = (Double) obj3;
                                        Integer numValueOf = d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null;
                                        f11.j jVar4 = jVar;
                                        p2 p2Var3 = jVar4.f67972i;
                                        f11.j.b bVar5 = (f11.j.b) p2Var3.getValue();
                                        if (bVar5 != null) {
                                            p2Var3.k(null, f11.j.b.a(bVar5, b11.i.c.i(bVar5.f67982a, null, null, 0L, b11.f.b(bVar5.f67982a.f14319e, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286), 15), false, 62));
                                            jVar4.f67974k.setValue(f11.j.c.LOADED);
                                        }
                                        break;
                                    case 3:
                                        Double d15 = (Double) obj3;
                                        p2 p2Var4 = jVar.f67972i;
                                        f11.j.b bVar6 = (f11.j.b) p2Var4.getValue();
                                        if (bVar6 != null) {
                                            p2Var4.k(null, f11.j.b.a(bVar6, b11.i.c.i(bVar6.f67982a, null, null, 0L, b11.f.b(bVar6.f67982a.f14319e, null, null, d15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283), 15), false, 62));
                                        }
                                        break;
                                    case 4:
                                        Double d16 = (Double) obj3;
                                        p2 p2Var5 = jVar.f67972i;
                                        f11.j.b bVar7 = (f11.j.b) p2Var5.getValue();
                                        if (bVar7 != null) {
                                            p2Var5.k(null, f11.j.b.a(bVar7, b11.i.c.i(bVar7.f67982a, null, null, 0L, b11.f.b(bVar7.f67982a.f14319e, null, null, null, d16, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279), 15), false, 62));
                                        }
                                        break;
                                    case 5:
                                        Double d17 = (Double) obj3;
                                        p2 p2Var6 = jVar.f67972i;
                                        f11.j.b bVar8 = (f11.j.b) p2Var6.getValue();
                                        if (bVar8 != null) {
                                            p2Var6.k(null, f11.j.b.a(bVar8, b11.i.c.i(bVar8.f67982a, null, null, 0L, b11.f.b(bVar8.f67982a.f14319e, null, d17, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285), 15), false, 62));
                                        }
                                        break;
                                    default:
                                        String str4 = (String) obj3;
                                        str4.getClass();
                                        f11.j jVar5 = jVar;
                                        jVar5.getClass();
                                        p2 p2Var7 = jVar5.f67972i;
                                        f11.j.b bVar9 = (f11.j.b) p2Var7.getValue();
                                        if (bVar9 != null) {
                                            p2Var7.k(null, f11.j.b.a(bVar9, b11.i.c.i(bVar9.f67982a, str4, null, 0L, null, 29), false, 62));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    }
                }
                e23.l lVar2 = (e23.l) objQ;
                Object objQ2 = mVar.q();
                aVar4.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = new dv0.n(17);
                    mVar.K(objQ2);
                }
                x5.v.f188954b.getClass();
                y01.w.a(null, strQ, str3, str2, 75, false, lVar2, (e23.l) objQ2, x5.v.f188955c, 0, null, mVar, 818110464, 0, 3329);
                d92.b.f58625c.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f14 = eVar3.f97920e;
                c2.l.f(x2.h(aVar, f14), mVar);
                if (z14) {
                    i14 = 0;
                    mVar.C(590735388);
                    mVar.f();
                } else {
                    mVar.C(590378299);
                    i53.c<b11.l> cVar2 = bVar.f67984c;
                    b11.l lVar3 = (b11.l) x3Var2.getF182175a();
                    Long lValueOf = lVar3 != null ? Long.valueOf(lVar3.f14331a) : null;
                    boolean z15 = bVar.f67986e;
                    boolean zR2 = mVar.r(jVar);
                    Object objQ3 = mVar.q();
                    if (zR2 || objQ3 == c2565a) {
                        i14 = 0;
                        objQ3 = new e23.l() { // from class: e11.g0
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                switch (i14) {
                                    case 0:
                                        b11.l lVar4 = (b11.l) obj3;
                                        lVar4.getClass();
                                        f11.j jVar2 = jVar;
                                        jVar2.getClass();
                                        p2 p2Var = jVar2.f67972i;
                                        f11.j.b bVar3 = (f11.j.b) p2Var.getValue();
                                        if (bVar3 != null) {
                                            jVar2.f67976m.k(null, lVar4);
                                            p2Var.k(null, f11.j.b.a(bVar3, null, false, 47));
                                        }
                                        break;
                                    case 1:
                                        b63.v vVar = (b63.v) obj3;
                                        vVar.getClass();
                                        f11.j jVar3 = jVar;
                                        jVar3.getClass();
                                        p2 p2Var2 = jVar3.f67972i;
                                        f11.j.b bVar4 = (f11.j.b) p2Var2.getValue();
                                        if (bVar4 != null) {
                                            b11.i.c cVarI = b11.i.c.i(bVar4.f67982a, null, vVar, 0L, null, 27);
                                            if (jVar3.f67965b.f14338a) {
                                                p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                                jVar3.f67976m.setValue(zf.b.L(bVar4.f67984c, true, vVar, null, jVar3.f67970g.a()));
                                            } else {
                                                p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                            }
                                        }
                                        break;
                                    case 2:
                                        Double d14 = (Double) obj3;
                                        Integer numValueOf = d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null;
                                        f11.j jVar4 = jVar;
                                        p2 p2Var3 = jVar4.f67972i;
                                        f11.j.b bVar5 = (f11.j.b) p2Var3.getValue();
                                        if (bVar5 != null) {
                                            p2Var3.k(null, f11.j.b.a(bVar5, b11.i.c.i(bVar5.f67982a, null, null, 0L, b11.f.b(bVar5.f67982a.f14319e, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286), 15), false, 62));
                                            jVar4.f67974k.setValue(f11.j.c.LOADED);
                                        }
                                        break;
                                    case 3:
                                        Double d15 = (Double) obj3;
                                        p2 p2Var4 = jVar.f67972i;
                                        f11.j.b bVar6 = (f11.j.b) p2Var4.getValue();
                                        if (bVar6 != null) {
                                            p2Var4.k(null, f11.j.b.a(bVar6, b11.i.c.i(bVar6.f67982a, null, null, 0L, b11.f.b(bVar6.f67982a.f14319e, null, null, d15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283), 15), false, 62));
                                        }
                                        break;
                                    case 4:
                                        Double d16 = (Double) obj3;
                                        p2 p2Var5 = jVar.f67972i;
                                        f11.j.b bVar7 = (f11.j.b) p2Var5.getValue();
                                        if (bVar7 != null) {
                                            p2Var5.k(null, f11.j.b.a(bVar7, b11.i.c.i(bVar7.f67982a, null, null, 0L, b11.f.b(bVar7.f67982a.f14319e, null, null, null, d16, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279), 15), false, 62));
                                        }
                                        break;
                                    case 5:
                                        Double d17 = (Double) obj3;
                                        p2 p2Var6 = jVar.f67972i;
                                        f11.j.b bVar8 = (f11.j.b) p2Var6.getValue();
                                        if (bVar8 != null) {
                                            p2Var6.k(null, f11.j.b.a(bVar8, b11.i.c.i(bVar8.f67982a, null, null, 0L, b11.f.b(bVar8.f67982a.f14319e, null, d17, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285), 15), false, 62));
                                        }
                                        break;
                                    default:
                                        String str4 = (String) obj3;
                                        str4.getClass();
                                        f11.j jVar5 = jVar;
                                        jVar5.getClass();
                                        p2 p2Var7 = jVar5.f67972i;
                                        f11.j.b bVar9 = (f11.j.b) p2Var7.getValue();
                                        if (bVar9 != null) {
                                            p2Var7.k(null, f11.j.b.a(bVar9, b11.i.c.i(bVar9.f67982a, str4, null, 0L, null, 29), false, 62));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ3);
                    } else {
                        i14 = 0;
                    }
                    y01.p.a(null, cVar2, lValueOf, (e23.l) objQ3, z15, mVar, 0, 1);
                    mVar.f();
                }
                b63.v vVar = cVar.f14317c;
                Boolean boolValueOf = Boolean.valueOf(z14);
                boolean zR3 = mVar.r(jVar);
                Object objQ4 = mVar.q();
                if (zR3 || objQ4 == c2565a) {
                    i15 = 1;
                    objQ4 = new e23.l() { // from class: e11.g0
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            switch (i15) {
                                case 0:
                                    b11.l lVar4 = (b11.l) obj3;
                                    lVar4.getClass();
                                    f11.j jVar2 = jVar;
                                    jVar2.getClass();
                                    p2 p2Var = jVar2.f67972i;
                                    f11.j.b bVar3 = (f11.j.b) p2Var.getValue();
                                    if (bVar3 != null) {
                                        jVar2.f67976m.k(null, lVar4);
                                        p2Var.k(null, f11.j.b.a(bVar3, null, false, 47));
                                    }
                                    break;
                                case 1:
                                    b63.v vVar2 = (b63.v) obj3;
                                    vVar2.getClass();
                                    f11.j jVar3 = jVar;
                                    jVar3.getClass();
                                    p2 p2Var2 = jVar3.f67972i;
                                    f11.j.b bVar4 = (f11.j.b) p2Var2.getValue();
                                    if (bVar4 != null) {
                                        b11.i.c cVarI = b11.i.c.i(bVar4.f67982a, null, vVar2, 0L, null, 27);
                                        if (jVar3.f67965b.f14338a) {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                            jVar3.f67976m.setValue(zf.b.L(bVar4.f67984c, true, vVar2, null, jVar3.f67970g.a()));
                                        } else {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                        }
                                    }
                                    break;
                                case 2:
                                    Double d14 = (Double) obj3;
                                    Integer numValueOf = d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null;
                                    f11.j jVar4 = jVar;
                                    p2 p2Var3 = jVar4.f67972i;
                                    f11.j.b bVar5 = (f11.j.b) p2Var3.getValue();
                                    if (bVar5 != null) {
                                        p2Var3.k(null, f11.j.b.a(bVar5, b11.i.c.i(bVar5.f67982a, null, null, 0L, b11.f.b(bVar5.f67982a.f14319e, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286), 15), false, 62));
                                        jVar4.f67974k.setValue(f11.j.c.LOADED);
                                    }
                                    break;
                                case 3:
                                    Double d15 = (Double) obj3;
                                    p2 p2Var4 = jVar.f67972i;
                                    f11.j.b bVar6 = (f11.j.b) p2Var4.getValue();
                                    if (bVar6 != null) {
                                        p2Var4.k(null, f11.j.b.a(bVar6, b11.i.c.i(bVar6.f67982a, null, null, 0L, b11.f.b(bVar6.f67982a.f14319e, null, null, d15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283), 15), false, 62));
                                    }
                                    break;
                                case 4:
                                    Double d16 = (Double) obj3;
                                    p2 p2Var5 = jVar.f67972i;
                                    f11.j.b bVar7 = (f11.j.b) p2Var5.getValue();
                                    if (bVar7 != null) {
                                        p2Var5.k(null, f11.j.b.a(bVar7, b11.i.c.i(bVar7.f67982a, null, null, 0L, b11.f.b(bVar7.f67982a.f14319e, null, null, null, d16, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279), 15), false, 62));
                                    }
                                    break;
                                case 5:
                                    Double d17 = (Double) obj3;
                                    p2 p2Var6 = jVar.f67972i;
                                    f11.j.b bVar8 = (f11.j.b) p2Var6.getValue();
                                    if (bVar8 != null) {
                                        p2Var6.k(null, f11.j.b.a(bVar8, b11.i.c.i(bVar8.f67982a, null, null, 0L, b11.f.b(bVar8.f67982a.f14319e, null, d17, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285), 15), false, 62));
                                    }
                                    break;
                                default:
                                    String str4 = (String) obj3;
                                    str4.getClass();
                                    f11.j jVar5 = jVar;
                                    jVar5.getClass();
                                    p2 p2Var7 = jVar5.f67972i;
                                    f11.j.b bVar9 = (f11.j.b) p2Var7.getValue();
                                    if (bVar9 != null) {
                                        p2Var7.k(null, f11.j.b.a(bVar9, b11.i.c.i(bVar9.f67982a, str4, null, 0L, null, 29), false, 62));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ4);
                } else {
                    i15 = 1;
                }
                e23.l lVar4 = (e23.l) objQ4;
                String str4 = str;
                y01.n.a(eVar2, vVar, str4, boolValueOf, lVar4, mVar, 0);
                c2.l.f(x2.h(aVar, f14), mVar);
                if (((f11.j.c) p1Var2.getF182175a()) != f11.j.c.INVALID_CALORIES) {
                    i15 = i14;
                }
                String strQ2 = gl1.y.Q(mVar, R.string.lbl_calories);
                Integer num = fVar.f14266a;
                Double dValueOf = num != null ? Double.valueOf(num.intValue()) : null;
                boolean zR4 = mVar.r(jVar);
                Object objQ5 = mVar.q();
                if (zR4 || objQ5 == c2565a) {
                    final int i24 = 2;
                    objQ5 = new e23.l() { // from class: e11.g0
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            switch (i24) {
                                case 0:
                                    b11.l lVar5 = (b11.l) obj3;
                                    lVar5.getClass();
                                    f11.j jVar2 = jVar;
                                    jVar2.getClass();
                                    p2 p2Var = jVar2.f67972i;
                                    f11.j.b bVar3 = (f11.j.b) p2Var.getValue();
                                    if (bVar3 != null) {
                                        jVar2.f67976m.k(null, lVar5);
                                        p2Var.k(null, f11.j.b.a(bVar3, null, false, 47));
                                    }
                                    break;
                                case 1:
                                    b63.v vVar2 = (b63.v) obj3;
                                    vVar2.getClass();
                                    f11.j jVar3 = jVar;
                                    jVar3.getClass();
                                    p2 p2Var2 = jVar3.f67972i;
                                    f11.j.b bVar4 = (f11.j.b) p2Var2.getValue();
                                    if (bVar4 != null) {
                                        b11.i.c cVarI = b11.i.c.i(bVar4.f67982a, null, vVar2, 0L, null, 27);
                                        if (jVar3.f67965b.f14338a) {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                            jVar3.f67976m.setValue(zf.b.L(bVar4.f67984c, true, vVar2, null, jVar3.f67970g.a()));
                                        } else {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                        }
                                    }
                                    break;
                                case 2:
                                    Double d14 = (Double) obj3;
                                    Integer numValueOf = d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null;
                                    f11.j jVar4 = jVar;
                                    p2 p2Var3 = jVar4.f67972i;
                                    f11.j.b bVar5 = (f11.j.b) p2Var3.getValue();
                                    if (bVar5 != null) {
                                        p2Var3.k(null, f11.j.b.a(bVar5, b11.i.c.i(bVar5.f67982a, null, null, 0L, b11.f.b(bVar5.f67982a.f14319e, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286), 15), false, 62));
                                        jVar4.f67974k.setValue(f11.j.c.LOADED);
                                    }
                                    break;
                                case 3:
                                    Double d15 = (Double) obj3;
                                    p2 p2Var4 = jVar.f67972i;
                                    f11.j.b bVar6 = (f11.j.b) p2Var4.getValue();
                                    if (bVar6 != null) {
                                        p2Var4.k(null, f11.j.b.a(bVar6, b11.i.c.i(bVar6.f67982a, null, null, 0L, b11.f.b(bVar6.f67982a.f14319e, null, null, d15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283), 15), false, 62));
                                    }
                                    break;
                                case 4:
                                    Double d16 = (Double) obj3;
                                    p2 p2Var5 = jVar.f67972i;
                                    f11.j.b bVar7 = (f11.j.b) p2Var5.getValue();
                                    if (bVar7 != null) {
                                        p2Var5.k(null, f11.j.b.a(bVar7, b11.i.c.i(bVar7.f67982a, null, null, 0L, b11.f.b(bVar7.f67982a.f14319e, null, null, null, d16, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279), 15), false, 62));
                                    }
                                    break;
                                case 5:
                                    Double d17 = (Double) obj3;
                                    p2 p2Var6 = jVar.f67972i;
                                    f11.j.b bVar8 = (f11.j.b) p2Var6.getValue();
                                    if (bVar8 != null) {
                                        p2Var6.k(null, f11.j.b.a(bVar8, b11.i.c.i(bVar8.f67982a, null, null, 0L, b11.f.b(bVar8.f67982a.f14319e, null, d17, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285), 15), false, 62));
                                    }
                                    break;
                                default:
                                    String str5 = (String) obj3;
                                    str5.getClass();
                                    f11.j jVar5 = jVar;
                                    jVar5.getClass();
                                    p2 p2Var7 = jVar5.f67972i;
                                    f11.j.b bVar9 = (f11.j.b) p2Var7.getValue();
                                    if (bVar9 != null) {
                                        p2Var7.k(null, f11.j.b.a(bVar9, b11.i.c.i(bVar9.f67982a, str5, null, 0L, null, 29), false, 62));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ5);
                }
                boolean z16 = i15;
                c11.e.a(strQ2, null, dValueOf, true, false, z16, null, eVar2, false, (e23.l) objQ5, mVar, 27648, 322);
                h4.r rVarZ = c2.l.z(x2.f(aVar, 1.0f), f14, eVar3.f97917b);
                if (z16 != 0) {
                    strH = sn.a.h(mVar, 591989090, R.string.calories_required, mVar);
                } else {
                    mVar.C(592084446);
                    strH = Marker.ANY_MARKER + gl1.y.Q(mVar, R.string.wallet_required);
                    mVar.f();
                }
                String str5 = strH;
                d6.h.f57752b.getClass();
                int i25 = d6.h.f57757g;
                if (z16 != 0) {
                    mVar.C(592278413);
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.b(j92.f.f97933j, mVar);
                    mVar.f();
                } else {
                    mVar.C(592362795);
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.f(j92.f.f97933j, mVar);
                    mVar.f();
                }
                mh.c(str5, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(i25), 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 130044);
                String strQ3 = gl1.y.Q(mVar, R.string.protein);
                String strQ4 = gl1.y.Q(mVar, R.string.lbl_grams_abr);
                Double d14 = fVar.f14268c;
                boolean zR5 = mVar.r(jVar);
                Object objQ6 = mVar.q();
                if (zR5 || objQ6 == c2565a) {
                    final int i26 = 3;
                    objQ6 = new e23.l() { // from class: e11.g0
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            switch (i26) {
                                case 0:
                                    b11.l lVar5 = (b11.l) obj3;
                                    lVar5.getClass();
                                    f11.j jVar2 = jVar;
                                    jVar2.getClass();
                                    p2 p2Var = jVar2.f67972i;
                                    f11.j.b bVar3 = (f11.j.b) p2Var.getValue();
                                    if (bVar3 != null) {
                                        jVar2.f67976m.k(null, lVar5);
                                        p2Var.k(null, f11.j.b.a(bVar3, null, false, 47));
                                    }
                                    break;
                                case 1:
                                    b63.v vVar2 = (b63.v) obj3;
                                    vVar2.getClass();
                                    f11.j jVar3 = jVar;
                                    jVar3.getClass();
                                    p2 p2Var2 = jVar3.f67972i;
                                    f11.j.b bVar4 = (f11.j.b) p2Var2.getValue();
                                    if (bVar4 != null) {
                                        b11.i.c cVarI = b11.i.c.i(bVar4.f67982a, null, vVar2, 0L, null, 27);
                                        if (jVar3.f67965b.f14338a) {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                            jVar3.f67976m.setValue(zf.b.L(bVar4.f67984c, true, vVar2, null, jVar3.f67970g.a()));
                                        } else {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                        }
                                    }
                                    break;
                                case 2:
                                    Double d15 = (Double) obj3;
                                    Integer numValueOf = d15 != null ? Integer.valueOf((int) d15.doubleValue()) : null;
                                    f11.j jVar4 = jVar;
                                    p2 p2Var3 = jVar4.f67972i;
                                    f11.j.b bVar5 = (f11.j.b) p2Var3.getValue();
                                    if (bVar5 != null) {
                                        p2Var3.k(null, f11.j.b.a(bVar5, b11.i.c.i(bVar5.f67982a, null, null, 0L, b11.f.b(bVar5.f67982a.f14319e, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286), 15), false, 62));
                                        jVar4.f67974k.setValue(f11.j.c.LOADED);
                                    }
                                    break;
                                case 3:
                                    Double d16 = (Double) obj3;
                                    p2 p2Var4 = jVar.f67972i;
                                    f11.j.b bVar6 = (f11.j.b) p2Var4.getValue();
                                    if (bVar6 != null) {
                                        p2Var4.k(null, f11.j.b.a(bVar6, b11.i.c.i(bVar6.f67982a, null, null, 0L, b11.f.b(bVar6.f67982a.f14319e, null, null, d16, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283), 15), false, 62));
                                    }
                                    break;
                                case 4:
                                    Double d17 = (Double) obj3;
                                    p2 p2Var5 = jVar.f67972i;
                                    f11.j.b bVar7 = (f11.j.b) p2Var5.getValue();
                                    if (bVar7 != null) {
                                        p2Var5.k(null, f11.j.b.a(bVar7, b11.i.c.i(bVar7.f67982a, null, null, 0L, b11.f.b(bVar7.f67982a.f14319e, null, null, null, d17, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279), 15), false, 62));
                                    }
                                    break;
                                case 5:
                                    Double d18 = (Double) obj3;
                                    p2 p2Var6 = jVar.f67972i;
                                    f11.j.b bVar8 = (f11.j.b) p2Var6.getValue();
                                    if (bVar8 != null) {
                                        p2Var6.k(null, f11.j.b.a(bVar8, b11.i.c.i(bVar8.f67982a, null, null, 0L, b11.f.b(bVar8.f67982a.f14319e, null, d18, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285), 15), false, 62));
                                    }
                                    break;
                                default:
                                    String str6 = (String) obj3;
                                    str6.getClass();
                                    f11.j jVar5 = jVar;
                                    jVar5.getClass();
                                    p2 p2Var7 = jVar5.f67972i;
                                    f11.j.b bVar9 = (f11.j.b) p2Var7.getValue();
                                    if (bVar9 != null) {
                                        p2Var7.k(null, f11.j.b.a(bVar9, b11.i.c.i(bVar9.f67982a, str6, null, 0L, null, 29), false, 62));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ6);
                }
                c11.e.a(strQ3, strQ4, d14, false, true, false, null, eVar2, false, (e23.l) objQ6, mVar, 224256, 320);
                String strQ5 = gl1.y.Q(mVar, R.string.fat);
                String strQ6 = gl1.y.Q(mVar, R.string.lbl_grams_abr);
                Double d15 = fVar.f14269d;
                boolean zR6 = mVar.r(jVar);
                Object objQ7 = mVar.q();
                if (zR6 || objQ7 == c2565a) {
                    final int i27 = 4;
                    objQ7 = new e23.l() { // from class: e11.g0
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            switch (i27) {
                                case 0:
                                    b11.l lVar5 = (b11.l) obj3;
                                    lVar5.getClass();
                                    f11.j jVar2 = jVar;
                                    jVar2.getClass();
                                    p2 p2Var = jVar2.f67972i;
                                    f11.j.b bVar3 = (f11.j.b) p2Var.getValue();
                                    if (bVar3 != null) {
                                        jVar2.f67976m.k(null, lVar5);
                                        p2Var.k(null, f11.j.b.a(bVar3, null, false, 47));
                                    }
                                    break;
                                case 1:
                                    b63.v vVar2 = (b63.v) obj3;
                                    vVar2.getClass();
                                    f11.j jVar3 = jVar;
                                    jVar3.getClass();
                                    p2 p2Var2 = jVar3.f67972i;
                                    f11.j.b bVar4 = (f11.j.b) p2Var2.getValue();
                                    if (bVar4 != null) {
                                        b11.i.c cVarI = b11.i.c.i(bVar4.f67982a, null, vVar2, 0L, null, 27);
                                        if (jVar3.f67965b.f14338a) {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                            jVar3.f67976m.setValue(zf.b.L(bVar4.f67984c, true, vVar2, null, jVar3.f67970g.a()));
                                        } else {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                        }
                                    }
                                    break;
                                case 2:
                                    Double d16 = (Double) obj3;
                                    Integer numValueOf = d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null;
                                    f11.j jVar4 = jVar;
                                    p2 p2Var3 = jVar4.f67972i;
                                    f11.j.b bVar5 = (f11.j.b) p2Var3.getValue();
                                    if (bVar5 != null) {
                                        p2Var3.k(null, f11.j.b.a(bVar5, b11.i.c.i(bVar5.f67982a, null, null, 0L, b11.f.b(bVar5.f67982a.f14319e, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286), 15), false, 62));
                                        jVar4.f67974k.setValue(f11.j.c.LOADED);
                                    }
                                    break;
                                case 3:
                                    Double d17 = (Double) obj3;
                                    p2 p2Var4 = jVar.f67972i;
                                    f11.j.b bVar6 = (f11.j.b) p2Var4.getValue();
                                    if (bVar6 != null) {
                                        p2Var4.k(null, f11.j.b.a(bVar6, b11.i.c.i(bVar6.f67982a, null, null, 0L, b11.f.b(bVar6.f67982a.f14319e, null, null, d17, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283), 15), false, 62));
                                    }
                                    break;
                                case 4:
                                    Double d18 = (Double) obj3;
                                    p2 p2Var5 = jVar.f67972i;
                                    f11.j.b bVar7 = (f11.j.b) p2Var5.getValue();
                                    if (bVar7 != null) {
                                        p2Var5.k(null, f11.j.b.a(bVar7, b11.i.c.i(bVar7.f67982a, null, null, 0L, b11.f.b(bVar7.f67982a.f14319e, null, null, null, d18, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279), 15), false, 62));
                                    }
                                    break;
                                case 5:
                                    Double d19 = (Double) obj3;
                                    p2 p2Var6 = jVar.f67972i;
                                    f11.j.b bVar8 = (f11.j.b) p2Var6.getValue();
                                    if (bVar8 != null) {
                                        p2Var6.k(null, f11.j.b.a(bVar8, b11.i.c.i(bVar8.f67982a, null, null, 0L, b11.f.b(bVar8.f67982a.f14319e, null, d19, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285), 15), false, 62));
                                    }
                                    break;
                                default:
                                    String str6 = (String) obj3;
                                    str6.getClass();
                                    f11.j jVar5 = jVar;
                                    jVar5.getClass();
                                    p2 p2Var7 = jVar5.f67972i;
                                    f11.j.b bVar9 = (f11.j.b) p2Var7.getValue();
                                    if (bVar9 != null) {
                                        p2Var7.k(null, f11.j.b.a(bVar9, b11.i.c.i(bVar9.f67982a, str6, null, 0L, null, 29), false, 62));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ7);
                }
                c11.e.a(strQ5, strQ6, d15, false, true, false, null, eVar2, false, (e23.l) objQ7, mVar, 224256, 320);
                String strQ7 = gl1.y.Q(mVar, R.string.carbs);
                String strQ8 = gl1.y.Q(mVar, R.string.lbl_grams_abr);
                Double d16 = fVar.f14267b;
                boolean zR7 = mVar.r(jVar);
                Object objQ8 = mVar.q();
                if (zR7 || objQ8 == c2565a) {
                    final int i28 = 5;
                    objQ8 = new e23.l() { // from class: e11.g0
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            switch (i28) {
                                case 0:
                                    b11.l lVar5 = (b11.l) obj3;
                                    lVar5.getClass();
                                    f11.j jVar2 = jVar;
                                    jVar2.getClass();
                                    p2 p2Var = jVar2.f67972i;
                                    f11.j.b bVar3 = (f11.j.b) p2Var.getValue();
                                    if (bVar3 != null) {
                                        jVar2.f67976m.k(null, lVar5);
                                        p2Var.k(null, f11.j.b.a(bVar3, null, false, 47));
                                    }
                                    break;
                                case 1:
                                    b63.v vVar2 = (b63.v) obj3;
                                    vVar2.getClass();
                                    f11.j jVar3 = jVar;
                                    jVar3.getClass();
                                    p2 p2Var2 = jVar3.f67972i;
                                    f11.j.b bVar4 = (f11.j.b) p2Var2.getValue();
                                    if (bVar4 != null) {
                                        b11.i.c cVarI = b11.i.c.i(bVar4.f67982a, null, vVar2, 0L, null, 27);
                                        if (jVar3.f67965b.f14338a) {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                            jVar3.f67976m.setValue(zf.b.L(bVar4.f67984c, true, vVar2, null, jVar3.f67970g.a()));
                                        } else {
                                            p2Var2.k(null, f11.j.b.a(bVar4, cVarI, false, 62));
                                        }
                                    }
                                    break;
                                case 2:
                                    Double d17 = (Double) obj3;
                                    Integer numValueOf = d17 != null ? Integer.valueOf((int) d17.doubleValue()) : null;
                                    f11.j jVar4 = jVar;
                                    p2 p2Var3 = jVar4.f67972i;
                                    f11.j.b bVar5 = (f11.j.b) p2Var3.getValue();
                                    if (bVar5 != null) {
                                        p2Var3.k(null, f11.j.b.a(bVar5, b11.i.c.i(bVar5.f67982a, null, null, 0L, b11.f.b(bVar5.f67982a.f14319e, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286), 15), false, 62));
                                        jVar4.f67974k.setValue(f11.j.c.LOADED);
                                    }
                                    break;
                                case 3:
                                    Double d18 = (Double) obj3;
                                    p2 p2Var4 = jVar.f67972i;
                                    f11.j.b bVar6 = (f11.j.b) p2Var4.getValue();
                                    if (bVar6 != null) {
                                        p2Var4.k(null, f11.j.b.a(bVar6, b11.i.c.i(bVar6.f67982a, null, null, 0L, b11.f.b(bVar6.f67982a.f14319e, null, null, d18, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283), 15), false, 62));
                                    }
                                    break;
                                case 4:
                                    Double d19 = (Double) obj3;
                                    p2 p2Var5 = jVar.f67972i;
                                    f11.j.b bVar7 = (f11.j.b) p2Var5.getValue();
                                    if (bVar7 != null) {
                                        p2Var5.k(null, f11.j.b.a(bVar7, b11.i.c.i(bVar7.f67982a, null, null, 0L, b11.f.b(bVar7.f67982a.f14319e, null, null, null, d19, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524279), 15), false, 62));
                                    }
                                    break;
                                case 5:
                                    Double d110 = (Double) obj3;
                                    p2 p2Var6 = jVar.f67972i;
                                    f11.j.b bVar8 = (f11.j.b) p2Var6.getValue();
                                    if (bVar8 != null) {
                                        p2Var6.k(null, f11.j.b.a(bVar8, b11.i.c.i(bVar8.f67982a, null, null, 0L, b11.f.b(bVar8.f67982a.f14319e, null, d110, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524285), 15), false, 62));
                                    }
                                    break;
                                default:
                                    String str6 = (String) obj3;
                                    str6.getClass();
                                    f11.j jVar5 = jVar;
                                    jVar5.getClass();
                                    p2 p2Var7 = jVar5.f67972i;
                                    f11.j.b bVar9 = (f11.j.b) p2Var7.getValue();
                                    if (bVar9 != null) {
                                        p2Var7.k(null, f11.j.b.a(bVar9, b11.i.c.i(bVar9.f67982a, str6, null, 0L, null, 29), false, 62));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ8);
                }
                c11.e.a(strQ7, strQ8, d16, false, true, false, null, eVar2, false, (e23.l) objQ8, mVar, 224256, 320);
                if (this.f27839b) {
                    mVar.C(594206334);
                    f0 f0Var = f0.f110999a;
                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                        i16 = 594314927;
                        i17 = R.string.show_less_data_sentence_case;
                    } else {
                        i16 = 594200847;
                        i17 = R.string.show_more_data_sentence_case;
                    }
                    String strH2 = sn.a.h(mVar, i16, i17, mVar);
                    Object objQ9 = mVar.q();
                    if (objQ9 == c2565a) {
                        p1Var = p1Var3;
                        objQ9 = new dv0.f(p1Var, 18);
                        mVar.K(objQ9);
                    } else {
                        p1Var = p1Var3;
                    }
                    eVar = eVar2;
                    f0Var.k(strH2, null, false, (e23.a) objQ9, mVar, 3072, 6);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar.C(594656485);
                        c11.a aVar5 = new c11.a(fVar.f14273h, fVar.f14276k, fVar.f14275j, fVar.f14274i, fVar.f14277l, fVar.f14270e, fVar.f14271f, fVar.f14272g, fVar.f14278m, fVar.f14280o, fVar.f14281p, fVar.f14282q, fVar.f14283r, fVar.f14284t, fVar.f14279n);
                        boolean zR8 = mVar.r(jVar) | mVar.r(cVar);
                        Object objQ10 = mVar.q();
                        if (zR8 || objQ10 == c2565a) {
                            objQ10 = new cn1.d(27, jVar, cVar);
                            mVar.K(objQ10);
                        }
                        jg.b.g(aVar5, eVar, (e23.l) objQ10, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(597323260);
                        mVar.f();
                    }
                    mVar.f();
                } else {
                    eVar = eVar2;
                    mVar.C(597341116);
                    mVar.f();
                }
                c2.l.f(x2.h(aVar, f14), mVar);
                g21.u uVar = bVar.f67983b.f75428e;
                b11.f fVar2 = (b11.f) x3Var3.getF182175a();
                if (fVar2 == null) {
                    fVar2 = new b11.f(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
                }
                g21.f0 f0VarG = fVar2.g();
                g21.p pVar = (g21.p) x3Var4.getF182175a();
                z01.f.a(eVar, uVar, f0VarG, str4, (g21.f0) x3Var5.getF182175a(), pVar != null ? pVar.f75475c : null, fVar.g(), (i53.c) p1Var4.getF182175a(), mVar, 0);
                mVar.y();
                mVar.f();
            } else {
                mVar.C(995735085);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0269  */
    private final Object b(Object obj, Object obj2) {
        String strL;
        e23.a aVar;
        i53.c cVarE;
        rk0.f0 f0Var = (rk0.f0) this.f27843f;
        e23.a aVar2 = (e23.a) this.f27845h;
        p1 p1Var = (p1) this.f27844g;
        x xVar = (x) this.f27847j;
        e23.l lVar = (e23.l) this.f27842e;
        e23.l lVar2 = (e23.l) this.f27841d;
        p1 p1Var2 = (p1) this.f27848k;
        e23.l lVar3 = (e23.l) this.f27840c;
        e23.a aVar3 = (e23.a) this.f27846i;
        p1 p1Var3 = (p1) this.f27849l;
        e23.p pVar = (e23.p) this.f27850m;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c80.u uVar = f0Var.f153103c;
            Boolean bool = f0Var.f153104d;
            if (uVar == null) {
                mVar.C(1627327644);
                mVar.f();
                strL = null;
            } else {
                mVar.C(1022325765);
                strL = xy2.b.l(uVar, mVar);
                mVar.f();
            }
            if (strL == null) {
                strL = sn.a.h(mVar, 1022326333, R.string.concept_gear, mVar);
            } else {
                mVar.C(1022325186);
                mVar.f();
            }
            String str = strL;
            if (this.f27839b) {
                mVar.C(1627573072);
                q13.b bVarB = p13.w.b();
                String strQ = gl1.y.Q(mVar, R.string.lbl_edit);
                s62.a.f157643a.getClass();
                t62.b bVar = t62.b.f162798a;
                bVarB.add(new i3("MENU_ITEM_EDIT", strQ, false, b3.a(bVar), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                if (bool == null) {
                    mVar.C(280617639);
                    mVar.f();
                } else {
                    mVar.C(280617640);
                    bVarB.add(new i3("MENU_ITEM_RETIRE", gl1.y.Q(mVar, bool.booleanValue() ? R.string.lbl_gear_unretire : R.string.lbl_gear_retire), false, n1.a(t62.c.f162799a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                    mVar.f();
                }
                bVarB.add(new i3("MENU_ITEM_TOGGLE_DUPLICATE", gl1.y.Q(mVar, R.string.workout_lbl_duplicate), false, f2.a(bVar), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                if (aVar3 == null) {
                    mVar.C(281671670);
                    mVar.f();
                } else {
                    mVar.C(281671671);
                    bVarB.add(new i3("MENU_ITEM_REMOVE_FROM_ACTIVITY", gl1.y.Q(mVar, R.string.remove_from_activity), false, j5.a(bVar), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                    mVar.f();
                }
                i53.c<rk0.l> cVar = f0Var.f153121w;
                if (cVar == null) {
                    mVar.C(282195787);
                    mVar.f();
                    aVar = aVar2;
                } else {
                    mVar.C(282195788);
                    Iterator<rk0.l> it = cVar.iterator();
                    while (it.hasNext()) {
                        rk0.l next = it.next();
                        String strN = fb1.c.n("MENU_ITEM_REMOVE_FROM_COLLECTION:", next.f153210b);
                        String strP = gl1.y.P(R.string.remove_from_group, new Object[]{next.f153209a}, mVar);
                        s62.a.f157643a.getClass();
                        bVarB.add(new i3(strN, strP, false, j5.a(t62.b.f162798a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                        it = it;
                        aVar2 = aVar2;
                    }
                    aVar = aVar2;
                    mVar.f();
                }
                String strQ2 = gl1.y.Q(mVar, R.string.lbl_delete);
                d92.b.f58623a.getClass();
                long jE = d92.b.a(mVar).k().e();
                long jF = d92.b.a(mVar).f().f();
                s62.a.f157643a.getClass();
                bVarB.add(new i3("MENU_ITEM_DELETE", strQ2, false, d0.a(jE), d0.a(jF), true, o2.a(t62.b.f162798a), null, 132, null));
                Unit unit = Unit.INSTANCE;
                cVarE = i53.a.e(p13.w.a(bVarB));
                mVar.f();
            } else {
                aVar = aVar2;
                mVar.C(1630588318);
                mVar.f();
                cVarE = null;
            }
            boolean zR = mVar.r(f0Var) | mVar.B(p1Var) | mVar.r(xVar) | mVar.B(lVar) | mVar.B(lVar2) | mVar.B(p1Var2) | mVar.B(lVar3) | mVar.B(aVar3) | mVar.B(p1Var3) | mVar.B(pVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new av0.c(f0Var, p1Var, xVar, lVar2, p1Var2, aVar3, p1Var3, lVar, lVar3, pVar);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new av0.c(f0Var, p1Var, xVar, lVar2, p1Var2, aVar3, p1Var3, lVar, lVar3, pVar);
                    mVar.K(objQ);
                }
            }
            z02.f.d(str, null, null, aVar, null, cVarE, (e23.l) objQ, mVar, 2097152, 54);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2) {
        long jF;
        float f14;
        p1 p1Var = (p1) this.f27843f;
        final e23.a aVar = (e23.a) this.f27845h;
        final ag2.e eVar = (ag2.e) this.f27844g;
        final h21.m mVar = (h21.m) this.f27846i;
        final e23.l lVar = (e23.l) this.f27842e;
        final lg2.a aVar2 = (lg2.a) this.f27847j;
        final x3 x3Var = (x3) this.f27841d;
        final x3 x3Var2 = (x3) this.f27848k;
        final x3 x3Var3 = (x3) this.f27840c;
        final p1 p1Var2 = (p1) this.f27849l;
        final x3 x3Var4 = (x3) this.f27850m;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (this.f27839b) {
                mVar2.C(-977087022);
                mVar2.f();
            } else {
                mVar2.C(-978894663);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    mVar2.C(245518936);
                    d92.b.f58623a.getClass();
                    jF = d92.b.a(mVar2).c().f();
                    mVar2.f();
                } else {
                    mVar2.C(245519579);
                    mVar2.f();
                    d0.f128823b.getClass();
                    jF = d0.f128831j;
                }
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97922g;
                } else {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97920e;
                }
                final float f15 = f14;
                q0.b(u1.n.e(h4.r.S, jF, m1.f128891a), z3.f.c(-1545019234, new e23.q() { // from class: ug2.a0
                    /* JADX WARN: Code duplicated, block: B:18:0x009e  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.q
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        p3.m mVar3 = (p3.m) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        ((c2.a0) obj3).getClass();
                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            h4.r.a aVar3 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC = c2.l.C(c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, 2), 0.0f, f15, 0.0f, 0.0f, 13);
                            lg2.r rVar = (lg2.r) x3Var.getF182175a();
                            yg2.j0 j0Var = (yg2.j0) x3Var2.getF182175a();
                            boolean z14 = !q0.d(x3Var3);
                            p1 p1Var3 = p1Var2;
                            boolean z15 = (((zf2.d) p1Var3.getF182175a()) == zf2.d.f204585c2 || ((zf2.d) p1Var3.getF182175a()) == zf2.d.f204583b2) ? false : true;
                            boolean zBooleanValue = ((Boolean) x3Var4.getF182175a()).booleanValue();
                            lg2.a aVar4 = aVar2;
                            boolean zR = mVar3.r(aVar4);
                            Object objQ = mVar3.q();
                            if (zR) {
                                objQ = new s(aVar4, 4);
                                mVar3.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new s(aVar4, 4);
                                    mVar3.K(objQ);
                                }
                            }
                            lg2.u.a(rVarC, aVar, eVar, mVar, rVar, lVar, j0Var, z14, z15, zBooleanValue, (e23.a) objQ, mVar3, 0, 0);
                        } else {
                            mVar3.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar2), mVar2, 48);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x051c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0525  */
    /* JADX WARN: Code duplicated, block: B:130:0x0529  */
    /* JADX WARN: Code duplicated, block: B:135:0x0546  */
    /* JADX WARN: Code duplicated, block: B:138:0x0577  */
    /* JADX WARN: Code duplicated, block: B:140:0x0580  */
    /* JADX WARN: Code duplicated, block: B:141:0x0584  */
    /* JADX WARN: Code duplicated, block: B:146:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:149:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x0621  */
    /* JADX WARN: Code duplicated, block: B:154:0x062a  */
    /* JADX WARN: Code duplicated, block: B:155:0x062e  */
    /* JADX WARN: Code duplicated, block: B:160:0x064b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0666  */
    /* JADX WARN: Code duplicated, block: B:168:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:171:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:173:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:179:0x0725  */
    /* JADX WARN: Code duplicated, block: B:182:0x0770  */
    /* JADX WARN: Code duplicated, block: B:184:0x0788  */
    /* JADX WARN: Code duplicated, block: B:190:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:192:0x0821  */
    /* JADX WARN: Code duplicated, block: B:194:0x0828  */
    /* JADX WARN: Code duplicated, block: B:196:0x082f  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:225:0x094b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0954  */
    /* JADX WARN: Code duplicated, block: B:228:0x0958  */
    /* JADX WARN: Code duplicated, block: B:233:0x0975  */
    /* JADX WARN: Code duplicated, block: B:236:0x099e  */
    /* JADX WARN: Code duplicated, block: B:238:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:239:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:244:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:247:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:249:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:252:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:253:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:256:0x0a6d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:260:0x0ad8  */
    /* JADX WARN: Code duplicated, block: B:262:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:264:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:26:0x0103  */
    /* JADX WARN: Code duplicated, block: B:270:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:275:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:276:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:281:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:284:0x0bb9  */
    /* JADX WARN: Code duplicated, block: B:287:0x0bc6  */
    /* JADX WARN: Code duplicated, block: B:289:0x0bc9  */
    /* JADX WARN: Code duplicated, block: B:290:0x0bd0  */
    /* JADX WARN: Code duplicated, block: B:293:0x0c22  */
    /* JADX WARN: Code duplicated, block: B:294:0x0c2c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0c81  */
    /* JADX WARN: Code duplicated, block: B:299:0x0c8e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0cff  */
    /* JADX WARN: Code duplicated, block: B:303:0x0d06  */
    /* JADX WARN: Code duplicated, block: B:309:0x0d73  */
    /* JADX WARN: Code duplicated, block: B:310:0x0d7d  */
    /* JADX WARN: Code duplicated, block: B:315:0x0dc7  */
    /* JADX WARN: Code duplicated, block: B:317:0x0dcc  */
    /* JADX WARN: Code duplicated, block: B:319:0x0dd1  */
    /* JADX WARN: Code duplicated, block: B:31:0x0125  */
    /* JADX WARN: Code duplicated, block: B:321:0x0dd6  */
    /* JADX WARN: Code duplicated, block: B:54:0x01db  */
    /* JADX WARN: Code duplicated, block: B:62:0x0233  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        e23.l lVar;
        h5.g.a.f fVar;
        c2.u uVar;
        m1.a aVar;
        h4.g.a aVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        j92.e eVar;
        float f14;
        float f15;
        boolean zB;
        Object objQ;
        c cVar;
        b63.o oVar;
        e23.l lVar2;
        d dVar;
        int i14;
        s2 s2VarA;
        int iHashCode3;
        i2 i2VarX3;
        h4.r rVarC3;
        z zVarA2;
        int iHashCode4;
        i2 i2VarX4;
        h4.r rVarC4;
        String strP;
        int i15;
        int i16;
        b63.o oVar2;
        String str2;
        float f16;
        s5.c.b bVar;
        boolean zB2;
        Object objQ2;
        int iG;
        e23.l lVar3;
        h5.g.a.f fVar2;
        u2 u2Var;
        z0 z0VarD2;
        int iHashCode5;
        i2 i2VarX5;
        h4.r rVarC5;
        z zVarA3;
        int iHashCode6;
        i2 i2VarX6;
        h4.r rVarC6;
        h4.r.a aVar3;
        Object objQ3;
        p3.m.a.C2565a c2565a;
        s5.x0 x0Var;
        z0 z0VarD3;
        int iHashCode7;
        i2 i2VarX7;
        h4.r rVarC7;
        boolean zR;
        Object objQ4;
        boolean zR2;
        Object objQ5;
        s5.x0 x0VarF;
        e23.l lVar4;
        boolean zB3;
        Object objQ6;
        p1 p1Var;
        long jB;
        boolean zBooleanValue;
        boolean z14;
        p3.m mVar;
        u4.d dVarS;
        int i17 = this.f27838a;
        boolean z15 = this.f27839b;
        p3.m.a aVar4 = p3.m.f135153a;
        Object obj3 = this.f27850m;
        Object obj4 = this.f27849l;
        Object obj5 = this.f27842e;
        Object obj6 = this.f27848k;
        Object obj7 = this.f27841d;
        Object obj8 = this.f27847j;
        Object obj9 = this.f27846i;
        Object obj10 = this.f27845h;
        Object obj11 = this.f27844g;
        Object obj12 = this.f27840c;
        Object obj13 = this.f27843f;
        final int i18 = 1;
        switch (i17) {
            case 0:
                t tVar = (t) obj13;
                v vVar = (v) obj11;
                e23.a aVar5 = (e23.a) obj10;
                o53.b0 b0Var = (o53.b0) obj7;
                o1 o1Var = (o1) obj6;
                String str3 = (String) obj12;
                w wVar = (w) obj4;
                e23.a aVar6 = (e23.a) obj9;
                fe feVar = (fe) obj3;
                e23.l lVar5 = (e23.l) obj5;
                e23.a aVar7 = (e23.a) obj8;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.g gVar = h4.d.a.f81524b;
                    z0 z0VarD4 = c2.q.d(gVar, false);
                    int iHashCode8 = Long.hashCode(mVar2.getU());
                    i2 i2VarX8 = mVar2.x();
                    h4.r rVarC8 = h4.k.c(aVar8, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar9);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, z0VarD4, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX8, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT()) {
                        str = str3;
                        lVar = lVar5;
                    } else {
                        lVar = lVar5;
                        str = str3;
                        if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode8))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC8, mVar2);
                        uVar = c2.u.f22885a;
                        long jE = vb.h.e(d92.b.f58623a, mVar2);
                        aVar = m1.f128891a;
                        h4.r rVarE = wz1.i.e(a2.b(x2.d(u1.n.e(aVar8, jE, aVar), 1.0f), a2.a(mVar2), true), !z15, new bk0.i(9), mVar2, 0);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        aVar2 = h4.d.a.f81536n;
                        zVarA = y.a(kVar, aVar2, mVar2, 0);
                        iHashCode = Long.hashCode(mVar2.getU());
                        i2VarX = mVar2.x();
                        rVarC = h4.k.c(rVarE, mVar2);
                        if (mVar2.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA, mVar2);
                        b4.c(c1623g, i2VarX, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar2);
                        b0 b0Var2 = b0.f22601a;
                        h4.r rVarF = x2.f(aVar8, 1.0f);
                        z0VarD = c2.q.d(gVar, false);
                        iHashCode2 = Long.hashCode(mVar2.getU());
                        i2VarX2 = mVar2.x();
                        rVarC2 = h4.k.c(rVarF, mVar2);
                        if (mVar2.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, z0VarD, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        }
                        b4.c(fVar, rVarC2, mVar2);
                        k.d(tVar.f27892j, false, mVar2, 0);
                        u0.a(c2.l.D(uVar.c(aVar8, h4.d.a.f81526d)), null, gl1.y.Q(mVar2, R.string.lbl_close), null, aVar6, mVar2, 0, 10);
                        mVar2.y();
                        k.b(tVar, mVar2, 0);
                        d92.b.f58625c.getClass();
                        eVar = j92.b.f97899b;
                        f14 = eVar.f97920e;
                        f15 = eVar.f97918c;
                        c2.l.f(x2.h(aVar8, f14), mVar2);
                        zB = mVar2.B(vVar) | mVar2.B(aVar5) | mVar2.r(b0Var) | mVar2.r(o1Var) | mVar2.B(str);
                        objQ = mVar2.q();
                        if (zB) {
                            objQ = new j(vVar, aVar5, b0Var, o1Var, feVar, str, 0);
                            mVar2.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new j(vVar, aVar5, b0Var, o1Var, feVar, str, 0);
                                mVar2.K(objQ);
                            }
                        }
                        k.a(vVar, (e23.a) objQ, mVar2, 0);
                        cVar = tVar.f27889g;
                        if (cVar != null) {
                            oVar = cVar.f27822c;
                        } else {
                            oVar = null;
                        }
                        if (oVar == null) {
                            mVar2.C(1247945926);
                            mVar2.f();
                            lVar2 = lVar;
                        } else {
                            mVar2.C(1247945927);
                            c2.l.f(x2.h(aVar8, f15), mVar2);
                            h4.r rVarA = c2.l.A(aVar8, f14, 0.0f, 2);
                            lVar2 = lVar;
                            String strP2 = gl1.y.P(R.string.code_can_be_used_unitl, new Object[]{lVar2.invoke(oVar)}, mVar2);
                            d92.b.f58624b.getClass();
                            mh.c(strP2, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                            Unit unit = Unit.INSTANCE;
                            mVar2.f();
                        }
                        dVar = tVar.f27890h;
                        if (dVar == null) {
                            mVar2.C(1248562051);
                            mVar2.f();
                        } else {
                            i14 = dVar.f27823a;
                            mVar2.C(1248562052);
                            c2.l.f(x2.h(aVar8, f14), mVar2);
                            h4.r rVarA2 = c2.l.A(aVar8, f14, 0.0f, 2);
                            s2VarA = q2.a(c2.j.i(f15), h4.d.a.f81534l, mVar2, 48);
                            iHashCode3 = Long.hashCode(mVar2.getU());
                            i2VarX3 = mVar2.x();
                            rVarC3 = h4.k.c(rVarA2, mVar2);
                            if (mVar2.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, s2VarA, mVar2);
                            b4.c(c1623g, i2VarX3, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                            }
                            b4.c(fVar, rVarC3, mVar2);
                            u2 u2Var2 = u2.f22900a;
                            s62.a.f157643a.getClass();
                            i7.b(n2.a(t62.c.f162799a), null, null, lc.u0.f(mVar2), mVar2, 48, 4);
                            zVarA2 = y.a(c2.j.i(eVar.f97917b), aVar2, mVar2, 48);
                            iHashCode4 = Long.hashCode(mVar2.getU());
                            i2VarX4 = mVar2.x();
                            rVarC4 = h4.k.c(aVar8, mVar2);
                            if (mVar2.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, zVarA2, mVar2);
                            b4.c(c1623g, i2VarX4, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                                v.h.z(iHashCode4, mVar2, iHashCode4, bVar2);
                            }
                            b4.c(fVar, rVarC4, mVar2);
                            if (i14 <= 0) {
                                i15 = 938366471;
                                i16 = R.string.no_codes_remaining;
                            } else {
                                if (i14 == 1) {
                                    i15 = 938370439;
                                    i16 = R.string.one_code_remaining;
                                } else {
                                    mVar2.C(938373298);
                                    strP = gl1.y.P(R.string.num_codes_remaining, new Object[]{String.valueOf(i14)}, mVar2);
                                    mVar2.f();
                                }
                                String str4 = strP;
                                d92.b.f58624b.getClass();
                                mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, mVar2)), mVar2, 0, 0, 131070);
                                oVar2 = dVar.f27824b;
                                if (oVar2 == null) {
                                    mVar2.C(-974890817);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-974890816);
                                    mh.c(gl1.y.P(R.string.more_codes_available_date, new Object[]{lVar2.invoke(oVar2)}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131070);
                                    Unit unit2 = Unit.INSTANCE;
                                    mVar2.f();
                                }
                                mVar2.y();
                                mVar2.y();
                                Unit unit3 = Unit.INSTANCE;
                                mVar2.f();
                            }
                            strP = sn.a.h(mVar2, i15, i16, mVar2);
                            String str5 = strP;
                            d92.b.f58624b.getClass();
                            mh.c(str5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, mVar2)), mVar2, 0, 0, 131070);
                            oVar2 = dVar.f27824b;
                            if (oVar2 == null) {
                                mVar2.C(-974890817);
                                mVar2.f();
                            } else {
                                mVar2.C(-974890816);
                                mh.c(gl1.y.P(R.string.more_codes_available_date, new Object[]{lVar2.invoke(oVar2)}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131070);
                                Unit unit4 = Unit.INSTANCE;
                                mVar2.f();
                            }
                            mVar2.y();
                            mVar2.y();
                            Unit unit5 = Unit.INSTANCE;
                            mVar2.f();
                        }
                        str2 = tVar.f27891i;
                        if (str2 == null) {
                            mVar2.C(1250629131);
                            mVar2.f();
                            f16 = f14;
                        } else {
                            mVar2.C(1250629132);
                            f16 = f14;
                            c2.l.f(x2.h(aVar8, f16), mVar2);
                            h4.r rVarA3 = c2.l.A(aVar8, f16, 0.0f, 2);
                            mVar2.C(-1206575098);
                            bVar = new s5.c.b(0, 1, null);
                            bVar.b(str2);
                            mVar2.C(-1206571745);
                            r0 r0Var = new r0(new i0(ds.e0.e(mVar2), 0L, (w5.f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null);
                            zB2 = mVar2.B(aVar7);
                            objQ2 = mVar2.q();
                            if (zB2) {
                                objQ2 = new a92.a(aVar7, 2);
                                mVar2.K(objQ2);
                            } else {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new a92.a(aVar7, 2);
                                    mVar2.K(objQ2);
                                }
                            }
                            iG = bVar.g(new s5.m.a("", r0Var, (s5.n) objQ2));
                            try {
                                bVar.b(StringUtils.SPACE);
                                bVar.b(gl1.y.Q(mVar2, R.string.common_learn_more));
                                Unit unit6 = Unit.INSTANCE;
                                bVar.f(iG);
                                mVar2.f();
                                s5.c cVarK = bVar.k();
                                mVar2.f();
                                d92.b.f58624b.getClass();
                                mh.d(cVarK, rVarA3, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.f(j92.f.f97935l, mVar2), mVar2, 0, 0, 262140);
                                mVar2.f();
                            } catch (Throwable th3) {
                                bVar.f(iG);
                                throw th3;
                            }
                        }
                        c2.l.f(x2.h(aVar8, f16), mVar2);
                        if (wVar == null) {
                            mVar2.C(1251757376);
                            mVar2.f();
                        } else {
                            mVar2.C(1251757377);
                            k.e(wVar, lVar2, mVar2, 0);
                            Unit unit7 = Unit.INSTANCE;
                            mVar2.f();
                        }
                        mVar2.y();
                        h4.r rVarC9 = uVar.c(aVar8, h4.d.a.f81525c);
                        int i19 = k3.f22728a;
                        c2.l.f(u1.n.e(x2.f(c2.l.I(rVarC9, q3.c(mVar2)), 1.0f), d92.b.a(mVar2).c().d(), aVar), mVar2);
                        mVar2.y();
                    }
                    v.h.z(iHashCode8, mVar2, iHashCode8, bVar2);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC8, mVar2);
                    uVar = c2.u.f22885a;
                    long jE2 = vb.h.e(d92.b.f58623a, mVar2);
                    aVar = m1.f128891a;
                    h4.r rVarE2 = wz1.i.e(a2.b(x2.d(u1.n.e(aVar8, jE2, aVar), 1.0f), a2.a(mVar2), true), !z15, new bk0.i(9), mVar2, 0);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    aVar2 = h4.d.a.f81536n;
                    zVarA = y.a(kVar2, aVar2, mVar2, 0);
                    iHashCode = Long.hashCode(mVar2.getU());
                    i2VarX = mVar2.x();
                    rVarC = h4.k.c(rVarE2, mVar2);
                    if (mVar2.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar9);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, zVarA, mVar2);
                    b4.c(c1623g, i2VarX, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    } else {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, mVar2);
                    b0 b0Var3 = b0.f22601a;
                    h4.r rVarF2 = x2.f(aVar8, 1.0f);
                    z0VarD = c2.q.d(gVar, false);
                    iHashCode2 = Long.hashCode(mVar2.getU());
                    i2VarX2 = mVar2.x();
                    rVarC2 = h4.k.c(rVarF2, mVar2);
                    if (mVar2.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar9);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, z0VarD, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT()) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    } else {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    k.d(tVar.f27892j, false, mVar2, 0);
                    u0.a(c2.l.D(uVar.c(aVar8, h4.d.a.f81526d)), null, gl1.y.Q(mVar2, R.string.lbl_close), null, aVar6, mVar2, 0, 10);
                    mVar2.y();
                    k.b(tVar, mVar2, 0);
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    f14 = eVar.f97920e;
                    f15 = eVar.f97918c;
                    c2.l.f(x2.h(aVar8, f14), mVar2);
                    zB = mVar2.B(vVar) | mVar2.B(aVar5) | mVar2.r(b0Var) | mVar2.r(o1Var) | mVar2.B(str);
                    objQ = mVar2.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new j(vVar, aVar5, b0Var, o1Var, feVar, str, 0);
                            mVar2.K(objQ);
                        }
                    } else {
                        objQ = new j(vVar, aVar5, b0Var, o1Var, feVar, str, 0);
                        mVar2.K(objQ);
                    }
                    k.a(vVar, (e23.a) objQ, mVar2, 0);
                    cVar = tVar.f27889g;
                    if (cVar != null) {
                        oVar = cVar.f27822c;
                    } else {
                        oVar = null;
                    }
                    if (oVar == null) {
                        mVar2.C(1247945926);
                        mVar2.f();
                        lVar2 = lVar;
                    } else {
                        mVar2.C(1247945927);
                        c2.l.f(x2.h(aVar8, f15), mVar2);
                        h4.r rVarA4 = c2.l.A(aVar8, f14, 0.0f, 2);
                        lVar2 = lVar;
                        String strP3 = gl1.y.P(R.string.code_can_be_used_unitl, new Object[]{lVar2.invoke(oVar)}, mVar2);
                        d92.b.f58624b.getClass();
                        mh.c(strP3, rVarA4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                        Unit unit8 = Unit.INSTANCE;
                        mVar2.f();
                    }
                    dVar = tVar.f27890h;
                    if (dVar == null) {
                        mVar2.C(1248562051);
                        mVar2.f();
                    } else {
                        i14 = dVar.f27823a;
                        mVar2.C(1248562052);
                        c2.l.f(x2.h(aVar8, f14), mVar2);
                        h4.r rVarA5 = c2.l.A(aVar8, f14, 0.0f, 2);
                        s2VarA = q2.a(c2.j.i(f15), h4.d.a.f81534l, mVar2, 48);
                        iHashCode3 = Long.hashCode(mVar2.getU());
                        i2VarX3 = mVar2.x();
                        rVarC3 = h4.k.c(rVarA5, mVar2);
                        if (mVar2.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX3, mVar2);
                        if (mVar2.getT()) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                        } else {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                        }
                        b4.c(fVar, rVarC3, mVar2);
                        u2 u2Var3 = u2.f22900a;
                        s62.a.f157643a.getClass();
                        i7.b(n2.a(t62.c.f162799a), null, null, lc.u0.f(mVar2), mVar2, 48, 4);
                        zVarA2 = y.a(c2.j.i(eVar.f97917b), aVar2, mVar2, 48);
                        iHashCode4 = Long.hashCode(mVar2.getU());
                        i2VarX4 = mVar2.x();
                        rVarC4 = h4.k.c(aVar8, mVar2);
                        if (mVar2.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA2, mVar2);
                        b4.c(c1623g, i2VarX4, mVar2);
                        if (mVar2.getT()) {
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar2);
                        } else {
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar2);
                        }
                        b4.c(fVar, rVarC4, mVar2);
                        if (i14 <= 0) {
                            i15 = 938366471;
                            i16 = R.string.no_codes_remaining;
                        } else {
                            if (i14 == 1) {
                                i15 = 938370439;
                                i16 = R.string.one_code_remaining;
                            } else {
                                mVar2.C(938373298);
                                strP = gl1.y.P(R.string.num_codes_remaining, new Object[]{String.valueOf(i14)}, mVar2);
                                mVar2.f();
                            }
                            String str6 = strP;
                            d92.b.f58624b.getClass();
                            mh.c(str6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, mVar2)), mVar2, 0, 0, 131070);
                            oVar2 = dVar.f27824b;
                            if (oVar2 == null) {
                                mVar2.C(-974890817);
                                mVar2.f();
                            } else {
                                mVar2.C(-974890816);
                                mh.c(gl1.y.P(R.string.more_codes_available_date, new Object[]{lVar2.invoke(oVar2)}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131070);
                                Unit unit9 = Unit.INSTANCE;
                                mVar2.f();
                            }
                            mVar2.y();
                            mVar2.y();
                            Unit unit10 = Unit.INSTANCE;
                            mVar2.f();
                        }
                        strP = sn.a.h(mVar2, i15, i16, mVar2);
                        String str7 = strP;
                        d92.b.f58624b.getClass();
                        mh.c(str7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, mVar2)), mVar2, 0, 0, 131070);
                        oVar2 = dVar.f27824b;
                        if (oVar2 == null) {
                            mVar2.C(-974890817);
                            mVar2.f();
                        } else {
                            mVar2.C(-974890816);
                            mh.c(gl1.y.P(R.string.more_codes_available_date, new Object[]{lVar2.invoke(oVar2)}, mVar2), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131070);
                            Unit unit11 = Unit.INSTANCE;
                            mVar2.f();
                        }
                        mVar2.y();
                        mVar2.y();
                        Unit unit12 = Unit.INSTANCE;
                        mVar2.f();
                    }
                    str2 = tVar.f27891i;
                    if (str2 == null) {
                        mVar2.C(1250629131);
                        mVar2.f();
                        f16 = f14;
                    } else {
                        mVar2.C(1250629132);
                        f16 = f14;
                        c2.l.f(x2.h(aVar8, f16), mVar2);
                        h4.r rVarA6 = c2.l.A(aVar8, f16, 0.0f, 2);
                        mVar2.C(-1206575098);
                        bVar = new s5.c.b(0, 1, null);
                        bVar.b(str2);
                        mVar2.C(-1206571745);
                        r0 r0Var2 = new r0(new i0(ds.e0.e(mVar2), 0L, (w5.f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null);
                        zB2 = mVar2.B(aVar7);
                        objQ2 = mVar2.q();
                        if (zB2) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new a92.a(aVar7, 2);
                                mVar2.K(objQ2);
                            }
                        } else {
                            objQ2 = new a92.a(aVar7, 2);
                            mVar2.K(objQ2);
                        }
                        iG = bVar.g(new s5.m.a("", r0Var2, (s5.n) objQ2));
                        bVar.b(StringUtils.SPACE);
                        bVar.b(gl1.y.Q(mVar2, R.string.common_learn_more));
                        Unit unit13 = Unit.INSTANCE;
                        bVar.f(iG);
                        mVar2.f();
                        s5.c cVarK2 = bVar.k();
                        mVar2.f();
                        d92.b.f58624b.getClass();
                        mh.d(cVarK2, rVarA6, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.f(j92.f.f97935l, mVar2), mVar2, 0, 0, 262140);
                        mVar2.f();
                    }
                    c2.l.f(x2.h(aVar8, f16), mVar2);
                    if (wVar == null) {
                        mVar2.C(1251757376);
                        mVar2.f();
                    } else {
                        mVar2.C(1251757377);
                        k.e(wVar, lVar2, mVar2, 0);
                        Unit unit14 = Unit.INSTANCE;
                        mVar2.f();
                    }
                    mVar2.y();
                    h4.r rVarC10 = uVar.c(aVar8, h4.d.a.f81525c);
                    int i110 = k3.f22728a;
                    c2.l.f(u1.n.e(x2.f(c2.l.I(rVarC10, q3.c(mVar2)), 1.0f), d92.b.a(mVar2).c().d(), aVar), mVar2);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                h4.r rVar = (h4.r) obj13;
                x3 x3Var = (x3) obj11;
                String str8 = (String) obj12;
                m4.b0 b0Var4 = (m4.b0) obj10;
                o53.b0 b0Var5 = (o53.b0) obj7;
                i2.a aVar10 = (i2.a) obj9;
                p1 p1Var2 = (p1) obj8;
                m4.q qVar = (m4.q) obj6;
                e23.l lVar6 = (e23.l) obj5;
                e23.l lVar7 = (e23.l) obj4;
                p1 p1Var3 = (p1) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    g6.f.a aVar11 = g6.f.f75994b;
                    h4.r rVarF3 = x2.f(c2.l.y(rVar, 16), 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA2 = q2.a(c2.j.f22698h, bVar3, mVar3, 54);
                    int iHashCode9 = Long.hashCode(mVar3.getU());
                    i2 i2VarX9 = mVar3.x();
                    h4.r rVarC11 = h4.k.c(rVarF3, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar12);
                    } else {
                        mVar3.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, s2VarA2, mVar3);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX9, mVar3);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar3.getT()) {
                        lVar3 = lVar6;
                    } else {
                        lVar3 = lVar6;
                        if (!p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode9))) {
                        }
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC11, mVar3);
                        u2Var = u2.f22900a;
                        h4.r rVarA7 = u2Var.a(g0.a(rVar, null, 3), 1.0f, true);
                        z0VarD2 = c2.q.d(new h4.g(-1.0f, ((Number) x3Var.getF182175a()).floatValue()), false);
                        iHashCode5 = Long.hashCode(mVar3.getU());
                        i2VarX5 = mVar3.x();
                        rVarC5 = h4.k.c(rVarA7, mVar3);
                        if (mVar3.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar12);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar3, z0VarD2, mVar3);
                        b4.c(c1623g2, i2VarX5, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode5))) {
                            v.h.z(iHashCode5, mVar3, iHashCode5, bVar4);
                        }
                        b4.c(fVar2, rVarC5, mVar3);
                        c2.u uVar2 = c2.u.f22885a;
                        h4.r rVarB = h4.p.b(rVar, 0.0f);
                        zVarA3 = y.a(c2.j.i(2), h4.d.a.f81536n, mVar3, 54);
                        iHashCode6 = Long.hashCode(mVar3.getU());
                        i2VarX6 = mVar3.x();
                        rVarC6 = h4.k.c(rVarB, mVar3);
                        if (mVar3.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar12);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar3, zVarA3, mVar3);
                        b4.c(c1623g2, i2VarX6, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode6))) {
                            v.h.z(iHashCode6, mVar3, iHashCode6, bVar4);
                        }
                        b4.c(fVar2, rVarC6, mVar3);
                        b0 b0Var6 = b0.f22601a;
                        aVar3 = h4.r.S;
                        h4.r rVarA8 = l4.k.a(aVar3, 0.0f);
                        objQ3 = mVar3.q();
                        aVar4.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ3 == c2565a) {
                            objQ3 = new d81.t(28);
                            mVar3.K(objQ3);
                        }
                        h4.r rVarC12 = p5.v.c((e23.l) objQ3, rVarA8, false);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0Var = j92.f.f97931h;
                        mh.c(str8, rVarC12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar3), mVar3, 0, 0, 131068);
                        z0VarD3 = c2.q.d(h4.d.a.f81524b, false);
                        iHashCode7 = Long.hashCode(mVar3.getU());
                        i2VarX7 = mVar3.x();
                        rVarC7 = h4.k.c(aVar3, mVar3);
                        if (mVar3.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar12);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar3, z0VarD3, mVar3);
                        b4.c(c1623g2, i2VarX7, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode7))) {
                            v.h.z(iHashCode7, mVar3, iHashCode7, bVar4);
                        }
                        b4.c(fVar2, rVarC7, mVar3);
                        h4.r rVarA9 = m4.e.a(aVar3, b0Var4);
                        zR = mVar3.r(b0Var5) | mVar3.r(aVar10);
                        objQ4 = mVar3.q();
                        if (zR || objQ4 == c2565a) {
                            objQ4 = new dv0.k(b0Var5, p1Var3, aVar10, 0);
                            mVar3.K(objQ4);
                        }
                        h4.r rVarC13 = m4.e.c(rVarA9, (e23.l) objQ4);
                        l0 l0Var = (l0) p1Var2.getF182175a();
                        x5.v.f188954b.getClass();
                        int i24 = x5.v.f188955c;
                        x5.p.f188918b.getClass();
                        p006l2.a2 a2Var = new p006l2.a2(0, (Boolean) null, i24, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                        zR2 = mVar3.r(qVar);
                        objQ5 = mVar3.q();
                        if (zR2 || objQ5 == c2565a) {
                            objQ5 = new k0(qVar, 2);
                            mVar3.K(objQ5);
                        }
                        z1 z1Var = new z1((e23.l) objQ5, null, null, null, null, null, 62, null);
                        t1 t1Var = new t1(zl.a.a(mVar3), null);
                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            mVar3.C(-1460761736);
                            x0VarF = d92.c.b(j92.f.f97933j, mVar3);
                        } else {
                            mVar3.C(-1460760550);
                            x0VarF = d92.c.f(j92.f.f97933j, mVar3);
                        }
                        mVar3.f();
                        s5.x0 x0Var2 = x0VarF;
                        lVar4 = lVar3;
                        zB3 = mVar3.B(64) | mVar3.B(lVar4) | mVar3.B(lVar7);
                        objQ6 = mVar3.q();
                        if (!zB3 || objQ6 == c2565a) {
                            p1Var = p1Var2;
                            objQ6 = new cw1.z0(lVar4, lVar7, p1Var, 1);
                            mVar3.K(objQ6);
                        } else {
                            p1Var = p1Var2;
                        }
                        p006l2.r.c(l0Var, (e23.l) objQ6, rVarC13, false, false, x0Var2, a2Var, z1Var, false, 0, 0, null, null, null, t1Var, null, mVar3, 102236160, 0, 48664);
                        mVar3.y();
                        mVar3.y();
                        h4.r rVarB2 = h4.p.b(aVar3, 1.0f);
                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            mVar3.C(822944815);
                            jB = d92.b.a(mVar3).k().d();
                        } else {
                            mVar3.C(822945805);
                            jB = d92.b.a(mVar3).k().b();
                        }
                        mVar3.f();
                        mh.c(str8, rVarB2, jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar3, 48, 0, 131064);
                        mVar3.y();
                        zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                        boolean z16 = this.f27839b;
                        if (!zBooleanValue || z16) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v1 v1VarD = r1.u0.d(s1.l.d(300, 0, null, 6), 2);
                        w1.f149304a.getClass();
                        r1.c0.d(u2Var, z14, null, v1VarD, w1.f149305b, null, z3.f.c(-1178052236, new n0(p1Var3, z16, lVar4, lVar7, p1Var), mVar3), mVar3, 1575942, 18);
                        mVar3.y();
                    }
                    v.h.z(iHashCode9, mVar3, iHashCode9, bVar4);
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC11, mVar3);
                    u2Var = u2.f22900a;
                    h4.r rVarA10 = u2Var.a(g0.a(rVar, null, 3), 1.0f, true);
                    z0VarD2 = c2.q.d(new h4.g(-1.0f, ((Number) x3Var.getF182175a()).floatValue()), false);
                    iHashCode5 = Long.hashCode(mVar3.getU());
                    i2VarX5 = mVar3.x();
                    rVarC5 = h4.k.c(rVarA10, mVar3);
                    if (mVar3.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar12);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar3, z0VarD2, mVar3);
                    b4.c(c1623g2, i2VarX5, mVar3);
                    if (mVar3.getT()) {
                        v.h.z(iHashCode5, mVar3, iHashCode5, bVar4);
                    } else {
                        v.h.z(iHashCode5, mVar3, iHashCode5, bVar4);
                    }
                    b4.c(fVar2, rVarC5, mVar3);
                    c2.u uVar3 = c2.u.f22885a;
                    h4.r rVarB3 = h4.p.b(rVar, 0.0f);
                    zVarA3 = y.a(c2.j.i(2), h4.d.a.f81536n, mVar3, 54);
                    iHashCode6 = Long.hashCode(mVar3.getU());
                    i2VarX6 = mVar3.x();
                    rVarC6 = h4.k.c(rVarB3, mVar3);
                    if (mVar3.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar12);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar3, zVarA3, mVar3);
                    b4.c(c1623g2, i2VarX6, mVar3);
                    if (mVar3.getT()) {
                        v.h.z(iHashCode6, mVar3, iHashCode6, bVar4);
                    } else {
                        v.h.z(iHashCode6, mVar3, iHashCode6, bVar4);
                    }
                    b4.c(fVar2, rVarC6, mVar3);
                    b0 b0Var7 = b0.f22601a;
                    aVar3 = h4.r.S;
                    h4.r rVarA11 = l4.k.a(aVar3, 0.0f);
                    objQ3 = mVar3.q();
                    aVar4.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = new d81.t(28);
                        mVar3.K(objQ3);
                    }
                    h4.r rVarC14 = p5.v.c((e23.l) objQ3, rVarA11, false);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0Var = j92.f.f97931h;
                    mh.c(str8, rVarC14, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar3), mVar3, 0, 0, 131068);
                    z0VarD3 = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode7 = Long.hashCode(mVar3.getU());
                    i2VarX7 = mVar3.x();
                    rVarC7 = h4.k.c(aVar3, mVar3);
                    if (mVar3.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar12);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar3, z0VarD3, mVar3);
                    b4.c(c1623g2, i2VarX7, mVar3);
                    if (mVar3.getT()) {
                        v.h.z(iHashCode7, mVar3, iHashCode7, bVar4);
                    } else {
                        v.h.z(iHashCode7, mVar3, iHashCode7, bVar4);
                    }
                    b4.c(fVar2, rVarC7, mVar3);
                    h4.r rVarA12 = m4.e.a(aVar3, b0Var4);
                    zR = mVar3.r(b0Var5) | mVar3.r(aVar10);
                    objQ4 = mVar3.q();
                    if (zR) {
                        objQ4 = new dv0.k(b0Var5, p1Var3, aVar10, 0);
                        mVar3.K(objQ4);
                    } else {
                        objQ4 = new dv0.k(b0Var5, p1Var3, aVar10, 0);
                        mVar3.K(objQ4);
                    }
                    h4.r rVarC15 = m4.e.c(rVarA12, (e23.l) objQ4);
                    l0 l0Var2 = (l0) p1Var2.getF182175a();
                    x5.v.f188954b.getClass();
                    int i25 = x5.v.f188955c;
                    x5.p.f188918b.getClass();
                    p006l2.a2 a2Var2 = new p006l2.a2(0, (Boolean) null, i25, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    zR2 = mVar3.r(qVar);
                    objQ5 = mVar3.q();
                    if (zR2) {
                        objQ5 = new k0(qVar, 2);
                        mVar3.K(objQ5);
                    } else {
                        objQ5 = new k0(qVar, 2);
                        mVar3.K(objQ5);
                    }
                    z1 z1Var2 = new z1((e23.l) objQ5, null, null, null, null, null, 62, null);
                    t1 t1Var2 = new t1(zl.a.a(mVar3), null);
                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                        mVar3.C(-1460761736);
                        x0VarF = d92.c.b(j92.f.f97933j, mVar3);
                    } else {
                        mVar3.C(-1460760550);
                        x0VarF = d92.c.f(j92.f.f97933j, mVar3);
                    }
                    mVar3.f();
                    s5.x0 x0Var3 = x0VarF;
                    lVar4 = lVar3;
                    zB3 = mVar3.B(64) | mVar3.B(lVar4) | mVar3.B(lVar7);
                    objQ6 = mVar3.q();
                    if (zB3) {
                        p1Var = p1Var2;
                        objQ6 = new cw1.z0(lVar4, lVar7, p1Var, 1);
                        mVar3.K(objQ6);
                    } else {
                        p1Var = p1Var2;
                        objQ6 = new cw1.z0(lVar4, lVar7, p1Var, 1);
                        mVar3.K(objQ6);
                    }
                    p006l2.r.c(l0Var2, (e23.l) objQ6, rVarC15, false, false, x0Var3, a2Var2, z1Var2, false, 0, 0, null, null, null, t1Var2, null, mVar3, 102236160, 0, 48664);
                    mVar3.y();
                    mVar3.y();
                    h4.r rVarB4 = h4.p.b(aVar3, 1.0f);
                    if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                        mVar3.C(822944815);
                        jB = d92.b.a(mVar3).k().d();
                    } else {
                        mVar3.C(822945805);
                        jB = d92.b.a(mVar3).k().b();
                    }
                    mVar3.f();
                    mh.c(str8, rVarB4, jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar3, 48, 0, 131064);
                    mVar3.y();
                    zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                    boolean z17 = this.f27839b;
                    if (zBooleanValue) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    v1 v1VarD2 = r1.u0.d(s1.l.d(300, 0, null, 6), 2);
                    w1.f149304a.getClass();
                    r1.c0.d(u2Var, z14, null, v1VarD2, w1.f149305b, null, z3.f.c(-1178052236, new n0(p1Var3, z17, lVar4, lVar7, p1Var), mVar3), mVar3, 1575942, 18);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                return a(obj, obj2);
            case 3:
                ((Integer) obj2).getClass();
                kb0.n.a((mb0.f) obj13, this.f27839b, (e23.l) obj5, (e23.l) obj11, (e23.l) obj7, (e23.l) obj6, (e23.a) obj10, (e23.a) obj9, (e23.a) obj8, (e23.l) obj12, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                km0.b bVar5 = (km0.b) obj13;
                e23.l lVar8 = (e23.l) obj5;
                e23.l lVar9 = (e23.l) obj11;
                p1 p1Var4 = (p1) obj9;
                p1 p1Var5 = (p1) obj8;
                p1 p1Var6 = (p1) obj7;
                Context context = (Context) obj6;
                e23.a aVar13 = (e23.a) obj10;
                m4.q qVar2 = (m4.q) obj12;
                m3 m3Var = (m3) obj4;
                c.q qVar3 = (c.q) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    t0 t0Var = t0.f16792a;
                    String strQ = gl1.y.Q(mVar4, R.string.lbl_description);
                    String str9 = bVar5.f105299c;
                    String str10 = str9 == null ? "" : str9;
                    String strQ2 = gl1.y.Q(mVar4, R.string.lbl_enter_group_description);
                    boolean zBooleanValue2 = ((Boolean) p1Var4.getF182175a()).booleanValue();
                    x5.v.f188954b.getClass();
                    int i26 = x5.v.f188955c;
                    Object objQ7 = mVar4.q();
                    aVar4.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ7 == c2565a2) {
                        objQ7 = new li0.x(15);
                        mVar4.K(objQ7);
                    }
                    e23.l<? super l0, l0> lVar10 = (e23.l) objQ7;
                    boolean zB4 = mVar4.B(lVar8);
                    Object objQ8 = mVar4.q();
                    if (zB4 || objQ8 == c2565a2) {
                        objQ8 = new k11.n(lVar8, 12);
                        mVar4.K(objQ8);
                    }
                    t0Var.k(null, strQ, str10, strQ2, false, null, zBooleanValue2, lVar10, (e23.l) objQ8, null, i26, 0, z3.f.c(-858893882, new kh0.d(bVar5, 25), mVar4), null, mVar4, 12779520, 390, 10769);
                    String strQ3 = gl1.y.Q(mVar4, R.string.lbl_location);
                    String str11 = bVar5.f105300d;
                    String str12 = str11 == null ? "" : str11;
                    String strQ4 = gl1.y.Q(mVar4, R.string.lbl_enter_group_location);
                    boolean zBooleanValue3 = ((Boolean) p1Var5.getF182175a()).booleanValue();
                    Object objQ9 = mVar4.q();
                    if (objQ9 == c2565a2) {
                        objQ9 = new li0.x(16);
                        mVar4.K(objQ9);
                    }
                    e23.l<? super l0, l0> lVar11 = (e23.l) objQ9;
                    boolean zB5 = mVar4.B(lVar9);
                    Object objQ10 = mVar4.q();
                    if (zB5 || objQ10 == c2565a2) {
                        objQ10 = new k11.n(lVar9, 13);
                        mVar4.K(objQ10);
                    }
                    e23.l<? super String, Unit> lVar12 = (e23.l) objQ10;
                    Object objQ11 = mVar4.q();
                    if (objQ11 == c2565a2) {
                        objQ11 = new ky0.k(p1Var6, 23);
                        mVar4.K(objQ11);
                    }
                    t0Var.k(null, strQ3, str12, strQ4, false, null, zBooleanValue3, lVar11, lVar12, (e23.l) objQ11, i26, 0, null, z3.f.c(729458048, new defpackage.d(context, aVar13, qVar2, m3Var, qVar3, this.f27839b, p1Var6), mVar4), mVar4, 818085888, 3078, 6161);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                rk0.j jVar = (rk0.j) obj13;
                rk0.q0 q0Var = (rk0.q0) obj11;
                e23.l lVar13 = (e23.l) obj5;
                p1 p1Var7 = (p1) obj10;
                e23.l lVar14 = (e23.l) obj9;
                x3 x3Var2 = (x3) obj8;
                o0 o0Var = (o0) obj7;
                e23.l lVar15 = (e23.l) obj6;
                x3 x3Var3 = (x3) obj12;
                p1 p1Var8 = (p1) obj4;
                e23.p pVar = (e23.p) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    if (jVar.f153165a == null) {
                        mVar5.C(398346548);
                        if (jVar.f153166b != rk0.u0.InProgress) {
                            mVar5.C(398426528);
                            h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                            s62.a.f157643a.getClass();
                            u4.d dVarA = fa.a(t62.b.f162798a);
                            String strQ5 = gl1.y.Q(mVar5, R.string.lbl_error_occurred);
                            String strQ6 = gl1.y.Q(mVar5, R.string.loading_error_message);
                            String strQ7 = gl1.y.Q(mVar5, R.string.lbl_try_again);
                            boolean zR3 = mVar5.r(q0Var);
                            Object objQ12 = mVar5.q();
                            if (zR3) {
                                objQ12 = new rk0.e(q0Var, 5);
                                mVar5.K(objQ12);
                            } else {
                                aVar4.getClass();
                                if (objQ12 == p3.m.a.f135155b) {
                                    objQ12 = new rk0.e(q0Var, 5);
                                    mVar5.K(objQ12);
                                }
                            }
                            b82.n.d(dVarA, strQ5, strQ6, rVarF4, strQ7, (e23.a) objQ12, null, null, mVar5, 3072, 192);
                            mVar = mVar5;
                            mVar.f();
                        } else {
                            mVar = mVar5;
                            mVar.C(398846919);
                            mVar.f();
                        }
                        mVar.f();
                        return Unit.INSTANCE;
                    }
                    mVar5.C(398887591);
                    mVar5.f();
                    m3.s sVarE = m3.l.e(mVar5);
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    boolean zR4 = mVar5.r(q0Var);
                    Object objQ13 = mVar5.q();
                    if (zR4) {
                        objQ13 = new rk0.e(q0Var, 6);
                        mVar5.K(objQ13);
                    } else {
                        aVar4.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new rk0.e(q0Var, 6);
                            mVar5.K(objQ13);
                        }
                    }
                    boolean z18 = this.f27839b;
                    m3.l.b(z18, (e23.a) objQ13, rVarD, sVarE, null, z3.f.c(-324716172, new p003ji0.e(z18, sVarE, 7), mVar5), z3.f.c(461634485, new a11.l(jVar, lVar13, p1Var7, lVar14, x3Var2, o0Var, lVar15, x3Var3, p1Var8, pVar), mVar5), mVar5, 1769856, 16);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                return b(obj, obj2);
            case 7:
                return c(obj, obj2);
            default:
                x0 x0Var4 = (x0) obj13;
                String str13 = (String) obj12;
                String str14 = (String) obj11;
                String str15 = (String) obj10;
                String str16 = (String) obj9;
                String str17 = (String) obj8;
                String str18 = (String) obj7;
                String str19 = (String) obj6;
                final e23.l lVar16 = (e23.l) obj5;
                final z51.h hVar = (z51.h) obj4;
                final e23.l lVar17 = (e23.l) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    if (x0Var4 == null || (dVarS = x0Var4.s(z15)) == null) {
                        dVarS = c10.a.f22442c1.f22489b;
                    }
                    u4.d dVar2 = dVarS;
                    f02.h.f67736a.getClass();
                    long jA = f02.h.a(mVar6);
                    gl.c.f77766a.getClass();
                    long jG = gl.c.a(mVar6).g();
                    str13.getClass();
                    String strP4 = gl1.y.P(R.string.lbl_started_at, new Object[]{str14}, mVar6);
                    s62.a.f157643a.getClass();
                    t62.b bVar6 = t62.b.f162798a;
                    an.e eVar4 = new an.e(dVar2, jA, jG, str15, str13, str16, str17, str14, null, str18, str19, null, strP4, b3.a(bVar6), e1.a(bVar6), gl1.y.Q(mVar6, R.string.msg_edit_pending_activity_description), gl1.y.Q(mVar6, R.string.msg_accept_pending_activity_description), false, 133376, null);
                    boolean zB6 = mVar6.B(lVar16) | mVar6.r(hVar);
                    Object objQ14 = mVar6.q();
                    if (zB6) {
                        final int i27 = 0;
                        objQ14 = new e23.a() { // from class: w51.m
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i27) {
                                    case 0:
                                        lVar16.invoke(hVar);
                                        break;
                                    case 1:
                                        lVar16.invoke(hVar);
                                        break;
                                    default:
                                        lVar16.invoke(hVar.f202505a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ14);
                    } else {
                        aVar4.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            final int i28 = 0;
                            objQ14 = new e23.a() { // from class: w51.m
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i28) {
                                        case 0:
                                            lVar16.invoke(hVar);
                                            break;
                                        case 1:
                                            lVar16.invoke(hVar);
                                            break;
                                        default:
                                            lVar16.invoke(hVar.f202505a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ14);
                        }
                    }
                    e23.a aVar14 = (e23.a) objQ14;
                    boolean zB7 = mVar6.B(lVar16) | mVar6.r(hVar);
                    Object objQ15 = mVar6.q();
                    if (zB7) {
                        objQ15 = new e23.a() { // from class: w51.m
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        lVar16.invoke(hVar);
                                        break;
                                    case 1:
                                        lVar16.invoke(hVar);
                                        break;
                                    default:
                                        lVar16.invoke(hVar.f202505a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ15);
                    } else {
                        aVar4.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new e23.a() { // from class: w51.m
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            lVar16.invoke(hVar);
                                            break;
                                        case 1:
                                            lVar16.invoke(hVar);
                                            break;
                                        default:
                                            lVar16.invoke(hVar.f202505a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ15);
                        }
                    }
                    e23.a aVar15 = (e23.a) objQ15;
                    boolean zB8 = mVar6.B(lVar17) | mVar6.r(hVar);
                    Object objQ16 = mVar6.q();
                    if (zB8) {
                        final int i29 = 2;
                        objQ16 = new e23.a() { // from class: w51.m
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i29) {
                                    case 0:
                                        lVar17.invoke(hVar);
                                        break;
                                    case 1:
                                        lVar17.invoke(hVar);
                                        break;
                                    default:
                                        lVar17.invoke(hVar.f202505a);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ16);
                    } else {
                        aVar4.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            final int i210 = 2;
                            objQ16 = new e23.a() { // from class: w51.m
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i210) {
                                        case 0:
                                            lVar17.invoke(hVar);
                                            break;
                                        case 1:
                                            lVar17.invoke(hVar);
                                            break;
                                        default:
                                            lVar17.invoke(hVar.f202505a);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ16);
                        }
                    }
                    an.d.a(null, eVar4, false, aVar14, aVar15, (e23.a) objQ16, mVar6, 0, 5);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(h4.r rVar, boolean z14, x3 x3Var, String str, m4.b0 b0Var, o53.b0 b0Var2, i2.a aVar, p1 p1Var, m4.q qVar, e23.l lVar, e23.l lVar2, p1 p1Var2) {
        this.f27843f = rVar;
        this.f27839b = z14;
        this.f27844g = x3Var;
        this.f27840c = str;
        this.f27845h = b0Var;
        this.f27841d = b0Var2;
        this.f27846i = aVar;
        this.f27847j = p1Var;
        this.f27848k = qVar;
        this.f27842e = lVar;
        this.f27849l = lVar2;
        this.f27850m = p1Var2;
    }

    public /* synthetic */ i(km0.b bVar, e23.l lVar, e23.l lVar2, p1 p1Var, p1 p1Var2, p1 p1Var3, Context context, e23.a aVar, m4.q qVar, m3 m3Var, c.q qVar2, boolean z14) {
        this.f27843f = bVar;
        this.f27842e = lVar;
        this.f27844g = lVar2;
        this.f27846i = p1Var;
        this.f27847j = p1Var2;
        this.f27841d = p1Var3;
        this.f27848k = context;
        this.f27845h = aVar;
        this.f27840c = qVar;
        this.f27849l = m3Var;
        this.f27850m = qVar2;
        this.f27839b = z14;
    }

    public /* synthetic */ i(mb0.f fVar, boolean z14, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.l lVar5, e23.a aVar4, e23.a aVar5, int i14) {
        this.f27843f = fVar;
        this.f27839b = z14;
        this.f27842e = lVar;
        this.f27844g = lVar2;
        this.f27841d = lVar3;
        this.f27848k = lVar4;
        this.f27845h = aVar;
        this.f27846i = aVar2;
        this.f27847j = aVar3;
        this.f27840c = lVar5;
        this.f27849l = aVar4;
        this.f27850m = aVar5;
    }

    public /* synthetic */ i(p1 p1Var, p1 p1Var2, String str, f11.j jVar, v21.e eVar, boolean z14, p1 p1Var3, p1 p1Var4, p1 p1Var5, p1 p1Var6, p1 p1Var7, p1 p1Var8) {
        this.f27843f = p1Var;
        this.f27844g = p1Var2;
        this.f27840c = str;
        this.f27845h = jVar;
        this.f27846i = eVar;
        this.f27839b = z14;
        this.f27847j = p1Var3;
        this.f27841d = p1Var4;
        this.f27848k = p1Var5;
        this.f27849l = p1Var6;
        this.f27850m = p1Var7;
        this.f27842e = p1Var8;
    }

    public /* synthetic */ i(rk0.j jVar, rk0.q0 q0Var, boolean z14, e23.l lVar, p1 p1Var, e23.l lVar2, x3 x3Var, o0 o0Var, e23.l lVar3, x3 x3Var2, p1 p1Var2, e23.p pVar) {
        this.f27843f = jVar;
        this.f27844g = q0Var;
        this.f27839b = z14;
        this.f27842e = lVar;
        this.f27845h = p1Var;
        this.f27846i = lVar2;
        this.f27847j = x3Var;
        this.f27841d = o0Var;
        this.f27848k = lVar3;
        this.f27840c = x3Var2;
        this.f27849l = p1Var2;
        this.f27850m = pVar;
    }

    public /* synthetic */ i(rk0.f0 f0Var, e23.a aVar, boolean z14, p1 p1Var, x xVar, e23.l lVar, e23.l lVar2, p1 p1Var2, e23.l lVar3, e23.a aVar2, p1 p1Var3, e23.p pVar) {
        this.f27843f = f0Var;
        this.f27845h = aVar;
        this.f27839b = z14;
        this.f27844g = p1Var;
        this.f27847j = xVar;
        this.f27842e = lVar;
        this.f27841d = lVar2;
        this.f27848k = p1Var2;
        this.f27840c = lVar3;
        this.f27846i = aVar2;
        this.f27849l = p1Var3;
        this.f27850m = pVar;
    }

    public /* synthetic */ i(boolean z14, t tVar, v vVar, e23.a aVar, o53.b0 b0Var, o1 o1Var, String str, w wVar, e23.a aVar2, fe feVar, e23.l lVar, e23.a aVar3) {
        this.f27839b = z14;
        this.f27843f = tVar;
        this.f27844g = vVar;
        this.f27845h = aVar;
        this.f27841d = b0Var;
        this.f27848k = o1Var;
        this.f27840c = str;
        this.f27849l = wVar;
        this.f27846i = aVar2;
        this.f27850m = feVar;
        this.f27842e = lVar;
        this.f27847j = aVar3;
    }

    public /* synthetic */ i(boolean z14, p1 p1Var, e23.a aVar, ag2.e eVar, h21.m mVar, e23.l lVar, lg2.a aVar2, x3 x3Var, x3 x3Var2, x3 x3Var3, p1 p1Var2, x3 x3Var4) {
        this.f27839b = z14;
        this.f27843f = p1Var;
        this.f27845h = aVar;
        this.f27844g = eVar;
        this.f27846i = mVar;
        this.f27842e = lVar;
        this.f27847j = aVar2;
        this.f27841d = x3Var;
        this.f27848k = x3Var2;
        this.f27840c = x3Var3;
        this.f27849l = p1Var2;
        this.f27850m = x3Var4;
    }
}
