package iv0;

import c2.b0;
import c2.x2;
import c2.z;
import com.google.android.exoplayer2.audio.WavUtil;
import h5.e0;
import i3.gf;
import i3.mh;
import java.util.List;
import l72.p2;
import l72.r1;
import l72.v2;
import o4.q1;
import p005kotlin.Unit;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.x1;
import s5.i0;
import s5.r0;
import s5.x0;
import w5.c0;
import w5.f0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<qu0.a> f95162a;

    static {
        pu0.d.b bVar = pu0.d.b.f141213a;
        f95162a = p13.x.k(new qu0.a(new pu0.b("contactId", "Jimmy", "McDog", null, false, bVar, null, null, null, null, null, null, null, null, null, null, 65496, null), "Garmin Messenger +40741949336", true, false, null, 24, null), new qu0.a(new pu0.b("contactId", "Jimmy", "McDog", null, false, bVar, null, null, null, null, null, null, null, null, null, null, 65496, null), "jimmy@garmin.com", false, false, null, 24, null), new qu0.a(new pu0.b("contactId", "Jimmy", "McDog", null, false, bVar, null, null, null, null, null, null, null, null, null, null, 65496, null), "Text Message +111555890", false, false, null, 24, null));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    public static final void a(pu0.b bVar, String str, boolean z14, boolean z15, e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1946394366);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15;
            p2 p2Var = p2.f111205a;
            z3.e eVarC = z3.f.c(504665254, new hq.q(z15, bVar, z14, str), o0VarE);
            boolean zR = ((458752 & i16) == 131072) | o0VarE.r(bVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new c(lVar, bVar, 1);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c(lVar, bVar, 1);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean z16 = (i16 & 57344) == 16384;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new ii0.h(aVar, 21);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ii0.h(aVar, 21);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            p2Var.f(null, eVarC, null, false, false, aVar3, (e23.a) objQ2, o0Var, 48, 29);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(bVar, str, z14, z15, aVar, lVar, i14, 2);
        }
    }

    public static final void b(final qu0.e eVar, p3.m mVar, final int i14) {
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar.E(-1517078891);
        int i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            List<qu0.a> list = eVar.f147888b;
            if (list == null || !list.isEmpty()) {
                String str = eVar.f147887a;
                if (str == null) {
                    str = "";
                }
                r1.b(str, null, o0VarE, 0, 2);
            } else {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new e23.p(eVar, i14, i16) { // from class: iv0.s

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f95160a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ qu0.e f95161b;

                        {
                            this.f95160a = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = this.f95160a;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i18) {
                                case 0:
                                    t.b(this.f95161b, mVar2, p0.t(1));
                                    break;
                                default:
                                    t.b(this.f95161b, mVar2, p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new e23.p(eVar, i14, i17) { // from class: iv0.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f95160a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ qu0.e f95161b;

                {
                    this.f95160a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f95160a;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            t.b(this.f95161b, mVar2, p0.t(1));
                            break;
                        default:
                            t.b(this.f95161b, mVar2, p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x0272  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(List list, boolean z14, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        List<qu0.e> list2;
        int i15;
        p3.c<?> cVar;
        boolean z15;
        boolean z16;
        list.getClass();
        o0 o0VarE = mVar.E(-289142784);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            list2 = list;
            i15 = (o0VarE.r(list2) ? 4 : 2) | i14;
        } else {
            list2 = list;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        boolean z17 = false;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(v2.a(h4.r.S, z14, new ih0.a(12), o0VarE, (i15 & 112) | 6), 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarD, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(654992183);
            for (qu0.e eVar2 : list2) {
                h4.r.a aVar2 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, z17 ? 1 : 0);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(aVar2, o0VarE);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA2, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                b0 b0Var2 = b0.f22601a;
                b(eVar2, o0VarE, z17 ? 1 : 0);
                o0VarE.C(272253897);
                Iterable<qu0.a> iterable = eVar2.f147888b;
                String str = eVar2.f147889c;
                String str2 = eVar2.f147890d;
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                for (qu0.a aVar4 : iterable) {
                    a(aVar4.f147866a, aVar4.f147867b, aVar4.f147868c, aVar4.f147869d, aVar4.f147870e, lVar, o0VarE, (i15 << 9) & 458752);
                    z17 = z17 ? 1 : 0;
                    eVar2 = eVar2;
                    str2 = str2;
                }
                qu0.e eVar3 = eVar2;
                boolean z18 = z17;
                String str3 = str2;
                o0VarE.g0(z18);
                p3.m.a aVar5 = p3.m.f135153a;
                if (str == null || str3 == null) {
                    cVar = cVar2;
                    z15 = z18 ? 1 : 0;
                    if (str != null) {
                        o0VarE.C(-147963502);
                        String str4 = eVar3.f147889c;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                        h4.r.a aVar6 = h4.r.S;
                        j92.b bVar4 = d92.b.f58625c;
                        bVar4.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        float f15 = eVar4.f97917b;
                        bVar4.getClass();
                        o0 o0Var = o0VarE;
                        mh.c(str4, c2.l.z(aVar6, eVar4.f97920e, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
                        o0VarE = o0Var;
                        o0VarE.g0(z15);
                    } else {
                        if (str3 != null) {
                            o0VarE.C(-147486350);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0VarE);
                            h4.r.a aVar7 = h4.r.S;
                            j92.b bVar5 = d92.b.f58625c;
                            bVar5.getClass();
                            j92.e eVar5 = j92.b.f97899b;
                            float f16 = eVar5.f97917b;
                            bVar5.getClass();
                            h4.r rVarZ = c2.l.z(aVar7, eVar5.f97920e, f16);
                            s5.c.b bVarH = l2.h(o0VarE, 272344796, z15 ? 1 : 0, 1, null);
                            int iJ = bVarH.j(new i0(hb.a.e(o0VarE), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                            try {
                                bVarH.b(str3);
                                Unit unit = Unit.INSTANCE;
                                bVarH.f(iJ);
                                s5.c cVarK = bVarH.k();
                                o0VarE.g0(z15);
                                boolean z19 = (o0VarE.r(eVar3) ? 1 : 0) | ((i15 & 7168) == 2048 ? (char) 1 : z15 ? 1 : 0);
                                Object objQ = o0VarE.q();
                                if (z19 == 0) {
                                    aVar5.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new hy.h(26, eVar3, lVar2);
                                        o0VarE.K(objQ);
                                    }
                                } else {
                                    objQ = new hy.h(26, eVar3, lVar2);
                                    o0VarE.K(objQ);
                                }
                                o0 o0Var2 = o0VarE;
                                p006l2.c0.a(cVarK, rVarZ, x0VarF2, false, 0, 0, null, (e23.l) objQ, o0Var2, 0, 120);
                                o0VarE = o0Var2;
                                o0VarE.g0(z15);
                            } catch (Throwable th3) {
                                bVarH.f(iJ);
                                throw th3;
                            }
                        } else {
                            o0VarE.C(-146852772);
                            o0VarE.g0(z15);
                        }
                        z16 = true;
                    }
                    o0VarE.g0(z16);
                    z17 = z15;
                    cVar2 = cVar;
                } else {
                    o0VarE.C(-149419727);
                    o0VarE.C(272275766);
                    s5.c.b bVar6 = new s5.c.b(z18 ? 1 : 0, 1, null);
                    int iL = d53.w.L(z18 ? 1 : 0, 6, str, str3);
                    String string = d53.w.P(iL, str.length(), str).toString();
                    String string2 = d53.w.P(z18 ? 1 : 0, str3.length() + iL, str).toString();
                    bVar6.b(string);
                    d92.b.f58623a.getClass();
                    j92.f fVar = d92.b.f58624b;
                    fVar.getClass();
                    x0 x0Var = j92.f.f97933j;
                    r0 r0Var = new r0(x0.a(x0Var, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214).f157322a, null, null, null, 14, null);
                    boolean zR = o0VarE.r(eVar3);
                    cVar = cVar2;
                    boolean z24 = zR | ((i15 & 7168) == 2048);
                    Object objQ2 = o0VarE.q();
                    if (z24) {
                        objQ2 = new hl1.k(3, eVar3, lVar2);
                        o0VarE.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new hl1.k(3, eVar3, lVar2);
                            o0VarE.K(objQ2);
                        }
                    }
                    int iG = bVar6.g(new s5.m.a(str3, r0Var, (s5.n) objQ2));
                    try {
                        bVar6.b(str3);
                        Unit unit2 = Unit.INSTANCE;
                        bVar6.f(iG);
                        bVar6.b(string2);
                        s5.c cVarK2 = bVar6.k();
                        o0VarE.g0(false);
                        fVar.getClass();
                        x0 x0VarF3 = d92.c.f(x0Var, o0VarE);
                        h4.r.a aVar8 = h4.r.S;
                        j92.b bVar7 = d92.b.f58625c;
                        bVar7.getClass();
                        j92.e eVar6 = j92.b.f97899b;
                        float f17 = eVar6.f97917b;
                        bVar7.getClass();
                        h4.r rVarZ2 = c2.l.z(aVar8, eVar6.f97920e, f17);
                        o0 o0Var3 = o0VarE;
                        z15 = false;
                        mh.d(cVarK2, rVarZ2, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarF3, o0Var3, 0, 0, 262140);
                        o0VarE = o0Var3;
                        o0VarE.g0(false);
                    } catch (Throwable th4) {
                        bVar6.f(iG);
                        throw th4;
                    }
                }
                z16 = true;
                o0VarE.g0(z16);
                z17 = z15;
                cVar2 = cVar;
            }
            o0VarE.g0(z17 ? 1 : 0);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(list, z14, lVar, lVar2, i14, 6);
        }
    }
}
