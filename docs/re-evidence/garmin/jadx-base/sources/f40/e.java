package f40;

import as.q;
import b82.g1;
import b82.t0;
import bt1.o;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import da0.k0;
import e23.l;
import e23.p;
import et1.b2;
import f21.g0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.ff;
import i3.hf;
import i3.mh;
import java.util.Locale;
import l72.c1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import s5.x0;
import v.h;
import x5.l0;
import x5.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68855a;

        static {
            int[] iArr = new int[t0.a.values().length];
            try {
                iArr[t0.a.ON_FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.a.ON_FOCUS_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f68855a = iArr;
        }
    }

    public static final void a(String str, l lVar, m mVar, int i14, int i15) {
        int i16;
        o0 o0VarE = mVar.E(-943376706);
        int i17 = i15 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | 3456;
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            v.f188954b.getClass();
            i16 = v.f188955c;
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            t0 t0Var = t0.f16792a;
            String strQ = y.Q(o0VarE, R.string.lbl_course_name);
            boolean z14 = str.length() == 0;
            o0VarE.C(2131031774);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new g0(5);
                o0VarE.K(objQ2);
            }
            l<? super l0, l0> lVar2 = (l) objQ2;
            o0VarE.g0(false);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new b2(p1Var, 12);
                o0VarE.K(objQ3);
            }
            t0Var.j(null, strQ, str, 128, z14, lVar2, lVar, (l) objQ3, i16, 0, z3.f.c(1414322860, new k0(1, str, p1Var), o0VarE), o0VarE, ((i17 << 6) & 896) | 12585984 | ((i17 << 15) & 3670016) | 100663296, 6, 513);
        } else {
            o0VarE.e();
            i16 = i14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(str, lVar, i16, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:145:0x04df  */
    /* JADX WARN: Code duplicated, block: B:83:0x0208  */
    /* JADX WARN: Code duplicated, block: B:92:0x023f  */
    public static final void b(r rVar, final n50.b bVar, l<? super String, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, final l<? super Boolean, Unit> lVar2, final l<? super Boolean, Unit> lVar3, l<? super Boolean, Unit> lVar4, m mVar, int i14) {
        int i15;
        o0 o0Var;
        int i16;
        i53.f fVar;
        boolean z14;
        String strP;
        boolean z15;
        int i17;
        int i18;
        rVar.getClass();
        boolean z16 = bVar.f123739n;
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(394043292);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i19 = i15 | (o0VarE.B(bVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i19 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i19 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i19 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i19 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i19 |= o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i24 = i19 | (o0VarE.r(lVar4) ? 8388608 : 4194304);
        if (o0VarE.n(i24 & 1, (4793491 & i24) != 4793490)) {
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            boolean z17 = bVar.f123738m;
            i53.f fVarA = i53.a.a(new g1(y.Q(o0VarE, R.string.lbl_mile), null, null, null, 14, null), new g1(y.Q(o0VarE, R.string.lbl_km), null, null, null, 14, null));
            m.a aVar4 = m.f135153a;
            if (z16) {
                o0VarE.C(1143288555);
                String upperCase = y.Q(o0VarE, R.string.title_course).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                r.a aVar5 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar3.getClass();
                r rVarZ = c2.l.z(aVar5, f14, eVar.f97917b);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                fVar = fVarA;
                i16 = i24;
                mh.c(upperCase, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                String str = bVar.f123726a;
                if (str == null) {
                    str = "";
                }
                boolean z18 = (i16 & 896) == 256;
                Object objQ = o0VarE.q();
                if (z18) {
                    objQ = new ci0.f(lVar, 25);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ci0.f(lVar, 25);
                        o0VarE.K(objQ);
                    }
                }
                a(str, (l) objQ, o0VarE, 0, 0);
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ = y.Q(o0VarE, R.string.lbl_course_type);
                String strQ2 = y.Q(o0VarE, bVar.f123727b.f32979a);
                boolean z19 = (i16 & 7168) == 2048;
                Object objQ2 = o0VarE.q();
                if (z19) {
                    objQ2 = new eu.a(aVar, 8);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new eu.a(aVar, 8);
                        o0VarE.K(objQ2);
                    }
                }
                p2Var.h(strQ, strQ2, null, null, null, false, false, null, null, null, (e23.a) objQ2, o0VarE, 0, 0, 1020);
                String strQ3 = y.Q(o0VarE, R.string.account_privacy);
                if (bVar.f123728c) {
                    i17 = -932923371;
                    i18 = R.string.lbl_public;
                } else {
                    i17 = -932922058;
                    i18 = R.string.lbl_private;
                }
                String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, false);
                boolean z24 = bVar.f123729d;
                boolean z25 = (i16 & 57344) == 16384;
                Object objQ3 = o0VarE.q();
                if (z25) {
                    objQ3 = new eu.a(aVar2, 9);
                    o0VarE.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new eu.a(aVar2, 9);
                        o0VarE.K(objQ3);
                    }
                }
                p2Var.h(strQ3, strJ, null, null, null, z24, false, null, null, null, (e23.a) objQ3, o0VarE, 0, 0, 988);
                o0Var = o0VarE;
                if (bVar.f123730e) {
                    o0Var.C(1144458309);
                    String strQ4 = y.Q(o0Var, R.string.trail_course_privacy_change_footer);
                    fVar2.getClass();
                    x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0Var);
                    r rVarF = x2.f(aVar5, 1.0f);
                    bVar3.getClass();
                    float f15 = eVar.f97920e;
                    bVar3.getClass();
                    mh.c(strQ4, c2.l.z(rVarF, f15, eVar.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0Var, 0, 0, 131068);
                    o0Var = o0Var;
                    z14 = false;
                    o0Var.g0(false);
                } else {
                    z14 = false;
                    o0Var.C(1144821040);
                    o0Var.g0(false);
                }
                o0Var.g0(z14);
            } else {
                o0Var = o0VarE;
                i16 = i24;
                fVar = fVarA;
                z14 = false;
                o0Var.C(1144830960);
                o0Var.g0(false);
            }
            if (z17 == 0) {
                o0Var.C(1144892402);
                strP = y.P(R.string.string_space_string_pattern, new Object[]{"150", y.Q(o0Var, R.string.miles)}, o0Var);
                o0Var.g0(z14);
            } else {
                o0Var.C(1145118888);
                strP = y.P(R.string.string_space_string_pattern, new Object[]{"241", y.Q(o0Var, R.string.kilometers)}, o0Var);
                o0Var.g0(z14);
            }
            if (bVar.f123731f) {
                o0Var.C(1145415837);
                final int i25 = 0;
                o0 o0Var2 = o0Var;
                l72.p2.f111205a.h(y.Q(o0Var, R.string.lbl_turn_notification_toggle), y.Q(o0Var, R.string.lbl_turn_notification_caption), null, null, null, z16 && bVar.f123732g, false, null, z3.f.c(-688323887, new p() { // from class: f40.d
                    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
                    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i26 = i25;
                        m.a aVar6 = m.f135153a;
                        boolean z26 = false;
                        l lVar5 = lVar2;
                        n50.b bVar4 = bVar;
                        switch (i26) {
                            case 0:
                                m mVar2 = (m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var2 = n.f135158a;
                                    boolean z27 = bVar4.f123733h;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ4 = mVar2.q();
                                    if (zB) {
                                        objQ4 = new ci0.f(lVar5, 27);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar6.getClass();
                                        if (objQ4 == m.a.f135155b) {
                                            objQ4 = new ci0.f(lVar5, 27);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    l lVar6 = (l) objQ4;
                                    if (bVar4.f123739n && bVar4.f123732g) {
                                        z26 = true;
                                    }
                                    hf.a(z27, lVar6, null, z26, d92.c.a(ff.f88115a, mVar2), mVar2, 0, 76);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                m mVar3 = (m) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var3 = n.f135158a;
                                    boolean z28 = bVar4.f123735j;
                                    boolean zB2 = mVar3.B(lVar5);
                                    Object objQ5 = mVar3.q();
                                    if (zB2) {
                                        objQ5 = new ci0.f(lVar5, 26);
                                        mVar3.K(objQ5);
                                    } else {
                                        aVar6.getClass();
                                        if (objQ5 == m.a.f135155b) {
                                            objQ5 = new ci0.f(lVar5, 26);
                                            mVar3.K(objQ5);
                                        }
                                    }
                                    hf.a(z28, (l) objQ5, null, bVar4.f123739n && bVar4.f123736k, d92.c.a(ff.f88115a, mVar3), mVar3, 0, 76);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var), null, null, o0Var2, 100663296, 0, 1756);
                o0Var = o0Var2;
                o0Var.g0(false);
            } else {
                o0Var.C(1146202896);
                o0Var.g0(false);
            }
            if (bVar.f123734i) {
                o0Var.C(1146318464);
                final int i26 = 1;
                o0 o0Var3 = o0Var;
                l72.p2.f111205a.g(y.Q(o0Var, R.string.auto_lap_timing_gates), null, null, null, z3.f.c(835284528, new p() { // from class: f40.d
                    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
                    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i27 = i26;
                        m.a aVar6 = m.f135153a;
                        boolean z26 = false;
                        l lVar5 = lVar3;
                        n50.b bVar4 = bVar;
                        switch (i27) {
                            case 0:
                                m mVar2 = (m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var2 = n.f135158a;
                                    boolean z27 = bVar4.f123733h;
                                    boolean zB = mVar2.B(lVar5);
                                    Object objQ4 = mVar2.q();
                                    if (zB) {
                                        objQ4 = new ci0.f(lVar5, 27);
                                        mVar2.K(objQ4);
                                    } else {
                                        aVar6.getClass();
                                        if (objQ4 == m.a.f135155b) {
                                            objQ4 = new ci0.f(lVar5, 27);
                                            mVar2.K(objQ4);
                                        }
                                    }
                                    l lVar6 = (l) objQ4;
                                    if (bVar4.f123739n && bVar4.f123732g) {
                                        z26 = true;
                                    }
                                    hf.a(z27, lVar6, null, z26, d92.c.a(ff.f88115a, mVar2), mVar2, 0, 76);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                m mVar3 = (m) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var3 = n.f135158a;
                                    boolean z28 = bVar4.f123735j;
                                    boolean zB2 = mVar3.B(lVar5);
                                    Object objQ5 = mVar3.q();
                                    if (zB2) {
                                        objQ5 = new ci0.f(lVar5, 26);
                                        mVar3.K(objQ5);
                                    } else {
                                        aVar6.getClass();
                                        if (objQ5 == m.a.f135155b) {
                                            objQ5 = new ci0.f(lVar5, 26);
                                            mVar3.K(objQ5);
                                        }
                                    }
                                    hf.a(z28, (l) objQ5, null, bVar4.f123739n && bVar4.f123736k, d92.c.a(ff.f88115a, mVar3), mVar3, 0, 76);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var), z16 && bVar.f123736k, false, null, o0Var3, 24576, 462);
                String strQ5 = y.Q(o0Var3, R.string.lbcp_description);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF3 = d92.c.f(j92.f.f97933j, o0Var3);
                r rVarF2 = x2.f(r.S, 1.0f);
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f16 = eVar2.f97920e;
                bVar4.getClass();
                float f17 = eVar2.f97920e;
                bVar4.getClass();
                mh.c(strQ5, c2.l.C(rVarF2, f16, eVar2.f97918c, f17, 0.0f, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF3, o0Var3, 0, 0, 131068);
                c0.c(b0Var, bVar.f123735j, null, null, null, null, z3.f.c(-678447619, new q(fVar, z17 ? 1 : 0, lVar4, 1), o0Var3), o0Var3, 1572870, 30);
                o0Var = o0Var3;
                if (bVar.f123737l) {
                    o0Var.C(1147975879);
                    c1 c1Var = c1.f110940a;
                    String strQ6 = y.Q(o0Var, R.string.lbcp_disabled_alert_title);
                    String strP2 = y.P(R.string.lbcp_disabled_alert_msg, new Object[]{strP}, o0Var);
                    String strQ7 = y.Q(o0Var, R.string.lbl_ok);
                    boolean z26 = (3670016 & i16) == 1048576;
                    Object objQ4 = o0Var.q();
                    if (z26) {
                        objQ4 = new e40.g(lVar3, 23);
                        o0Var.K(objQ4);
                    } else {
                        aVar4.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new e40.g(lVar3, 23);
                            o0Var.K(objQ4);
                        }
                    }
                    c1Var.a(false, strQ6, strP2, null, null, strQ7, false, false, (e23.a) objQ4, null, null, o0Var, 6, 0, 1752);
                    o0Var = o0Var;
                    z15 = false;
                    o0Var.g0(false);
                } else {
                    z15 = false;
                    o0Var.C(1148445808);
                    o0Var.g0(false);
                }
                o0Var.g0(z15);
            } else {
                o0Var.C(1148455728);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar, bVar, lVar, aVar, aVar2, lVar2, lVar3, lVar4, i14);
        }
    }
}
