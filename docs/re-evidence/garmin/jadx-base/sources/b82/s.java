package b82;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import i3.e5;
import i3.mh;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lb82/s;", "", "<init>", "()V", "b", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f16758a = new s();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f16760b;

        public a(String str, e23.a<Unit> aVar) {
            this.f16759a = str;
            this.f16760b = aVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 48) == 0) {
                iIntValue |= mVar2.l(j8) ? 32 : 16;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                p3.x1 x1Var = p3.n.f135158a;
                c.b(null, null, z3.f.c(1034914711, new ao1.g(this.f16759a, this.f16760b, 2), mVar2), null, j8, mVar2, ((iIntValue << 9) & 57344) | 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    private s() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public final void a(String str, String str2, String str3, i53.c<b> cVar, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        String strQ;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        String str4;
        p2 p2VarI0;
        cVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-911251757);
        int i24 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if ((i15 & 4) == 0) {
            strQ = str3;
            int i25 = o0VarE.B(strQ) ? 256 : 128;
            int i26 = i24 | i25;
            if (o0VarE.B(cVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            int i27 = i26 | i16;
            if (o0VarE.r(aVar)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i18 = i27 | i17;
            i19 = 0;
            if ((i18 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) == 0 && !o0VarE.o0()) {
                    o0VarE.e();
                    if ((i15 & 4) != 0) {
                        i18 &= -897;
                    }
                } else if ((i15 & 4) != 0) {
                    strQ = gl1.y.Q(o0VarE, R.string.gak_lbl_continue);
                    i18 &= -897;
                }
                String str5 = strQ;
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                f16758a.d(z3.f.c(777018454, new o(str, str2, 0), o0VarE), z3.f.c(-1036774249, new p(cVar, i19), o0VarE), str5, aVar, o0VarE, (i18 & 896) | 24630 | ((i18 >> 3) & 7168), 0);
                str4 = str5;
            } else {
                o0VarE.e();
                str4 = strQ;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a11.g0(this, str, str2, str4, (i53.c) cVar, (e23.a) aVar, i14, i15);
            }
        }
        strQ = str3;
        int i28 = i24 | i25;
        if (o0VarE.B(cVar)) {
            i16 = 2048;
        } else {
            i16 = 1024;
        }
        int i29 = i28 | i16;
        if (o0VarE.r(aVar)) {
            i17 = 16384;
        } else {
            i17 = 8192;
        }
        i18 = i29 | i17;
        i19 = 0;
        if ((i18 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i18 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) == 0) {
                if ((i15 & 4) != 0) {
                    strQ = gl1.y.Q(o0VarE, R.string.gak_lbl_continue);
                    i18 &= -897;
                }
            } else if ((i15 & 4) != 0) {
                strQ = gl1.y.Q(o0VarE, R.string.gak_lbl_continue);
                i18 &= -897;
            }
            String str6 = strQ;
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            f16758a.d(z3.f.c(777018454, new o(str, str2, 0), o0VarE), z3.f.c(-1036774249, new p(cVar, i19), o0VarE), str6, aVar, o0VarE, (i18 & 896) | 24630 | ((i18 >> 3) & 7168), 0);
            str4 = str6;
        } else {
            o0VarE.e();
            str4 = strQ;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0(this, str, str2, str4, (i53.c) cVar, (e23.a) aVar, i14, i15);
        }
    }

    public final void b(final String str, final String str2, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        h4.r.a aVar;
        boolean z14;
        h4.r.a aVar2;
        p3.o0 o0VarE = mVar.E(1069613146);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (str == null && str2 == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(this, str, str2, i14, i16) { // from class: b82.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f16741a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s f16742b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f16743c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f16744d;

                    {
                        this.f16741a = i16;
                        this.f16742b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = this.f16741a;
                        String str3 = this.f16744d;
                        String str4 = this.f16743c;
                        s sVar = this.f16742b;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        s sVar2 = s.f16758a;
                        switch (i17) {
                            case 0:
                                sVar.b(str4, str3, mVar2, p3.p0.t(385));
                                break;
                            default:
                                sVar.b(str4, str3, mVar2, p3.p0.t(385));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                h4.r.a aVar3 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(aVar3, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar4 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                if (str != null) {
                    o0VarE.C(-1306279229);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                    aVar = aVar3;
                    z14 = false;
                    mh.c(upperCase, x2.f(aVar3, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 48, 0, 131068);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarE;
                    aVar = aVar3;
                    z14 = false;
                    o0Var.C(-1306097166);
                    o0Var.g0(false);
                }
                if (str2 != null) {
                    o0Var.C(-1306045179);
                    if (str != null) {
                        o0Var.C(-1306011327);
                        g6.f.a aVar5 = g6.f.f75994b;
                        aVar2 = aVar;
                        e5.t(aVar2, 12, o0Var, z14);
                    } else {
                        aVar2 = aVar;
                        o0Var.C(-1305933486);
                        o0Var.g0(z14);
                    }
                    String upperCase2 = str2.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    p3.o0 o0Var2 = o0Var;
                    mh.c(upperCase2, x2.f(aVar2, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97927d), o0Var), o0Var2, 48, 0, 131068);
                    o0Var = o0Var2;
                    o0Var.g0(z14);
                } else {
                    o0Var.C(-1305694414);
                    o0Var.g0(z14);
                }
                o0Var.g0(true);
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new e23.p(this, str, str2, i14, i17) { // from class: b82.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f16741a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s f16742b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f16743c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f16744d;

                {
                    this.f16741a = i17;
                    this.f16742b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f16741a;
                    String str3 = this.f16744d;
                    String str4 = this.f16743c;
                    s sVar = this.f16742b;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    s sVar2 = s.f16758a;
                    switch (i18) {
                        case 0:
                            sVar.b(str4, str3, mVar2, p3.p0.t(385));
                            break;
                        default:
                            sVar.b(str4, str3, mVar2, p3.p0.t(385));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public final void c(b bVar, boolean z14, p3.m mVar, int i14) {
        p3.o0 o0Var;
        z3.e eVarC;
        bVar.getClass();
        p3.o0 o0VarE = mVar.E(-101333254);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            float f14 = z14 ? 0 : 24;
            g6.f.a aVar = g6.f.f75994b;
            float f15 = f14;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarC = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, f15, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            u4.d dVar = bVar.f16764c;
            o4.d0 d0Var = bVar.f16765d;
            f16758a.getClass();
            o0VarE.C(-1259642845);
            if (dVar == null) {
                o0VarE.g0(false);
                eVarC = null;
            } else {
                eVarC = z3.f.c(1526347136, new r(d0Var, dVar), o0VarE);
                o0VarE.g0(false);
            }
            if (eVarC == null) {
                o0VarE.C(387088675);
            } else {
                o0VarE.C(-1511533922);
                eVarC.invoke(o0VarE, 0);
            }
            o0VarE.g0(false);
            h4.r rVarC3 = c2.l.C(aVar2, 12, 0.0f, 0.0f, 0.0f, 14);
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarC3, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC4, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = bVar.f16762a;
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            if (bVar.f16763b != null) {
                o0Var.C(2028576218);
                c2.l.f(c2.l.C(aVar2, 0.0f, 6, 0.0f, 0.0f, 13), o0Var);
                String str2 = bVar.f16763b;
                fVar2.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 131070);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(2028737666);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(this, bVar, z14, i14, 1);
        }
    }

    public final void d(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, String str, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        pVar2.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1804766346);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= ((i15 & 4) == 0 && o0VarE.B(str)) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            } else if ((i15 & 4) != 0) {
                str = gl1.y.Q(o0VarE, R.string.gak_lbl_continue);
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            c.c(z3.f.c(-1940830388, new a(str, aVar), o0VarE), z3.f.c(-2118547770, new aa2.f(9, pVar, pVar2), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        String str2 = str;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(this, pVar, pVar2, str2, aVar, i14, i15, 4);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lb82/s$b;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "meta", "Lu4/d;", "icon", "Lo4/d0;", "shielColor", "Lb92/a;", "descriptor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu4/d;Lo4/d0;Lb92/a;Lkotlin/jvm/internal/j;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f16761e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u4.d f16764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o4.d0 f16765d;

        static {
            int i14 = b92.a.f16960b;
        }

        public /* synthetic */ b(String str, String str2, u4.d dVar, o4.d0 d0Var, b92.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, dVar, (i14 & 8) != 0 ? null : d0Var, (i14 & 16) != 0 ? null : aVar, null);
        }

        private b(String str, String str2, u4.d dVar, o4.d0 d0Var, b92.a aVar) {
            str.getClass();
            dVar.getClass();
            this.f16762a = str;
            this.f16763b = str2;
            this.f16764c = dVar;
            this.f16765d = d0Var;
        }

        public /* synthetic */ b(String str, String str2, u4.d dVar, o4.d0 d0Var, b92.a aVar, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, dVar, d0Var, aVar);
        }
    }
}
