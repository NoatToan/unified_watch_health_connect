package wv0;

import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e2.i0;
import e2.k0;
import h5.e0;
import i3.e5;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import kotlin.t1;
import l72.j0;
import lc.u0;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.w0;
import s5.x0;
import w2.a0;
import x5.l0;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    public static final void a(mc mcVar, e23.a aVar, e23.q qVar, p3.m mVar, int i14) {
        o0 o0Var;
        char c14;
        String string;
        String string2;
        aVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(-1137232835);
        int i15 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(qVar) ? 256 : 128);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_add_custom_behavior);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_enter_behavior_name);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_measurement_type);
            o0VarE.C(-1959042671);
            w13.c cVar = pv0.k.f141386e;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                pv0.k kVar = (pv0.k) bVar.next();
                zv0.a aVar2 = zv0.a.f207158a;
                l22.a aVarS = a0.s(o0VarE);
                aVar2.getClass();
                kVar.getClass();
                int i17 = zv0.a.C3863a.f207161c[kVar.ordinal()];
                if (i17 == 1) {
                    string2 = aVarS.getString(R.string.lbl_none);
                } else {
                    if (i17 != 2) {
                        u0.r();
                        return;
                    }
                    string2 = aVarS.getString(R.string.lbl_quantity);
                }
                arrayList.add(string2);
            }
            o0VarE.g0(false);
            String strQ4 = gl1.y.Q(o0VarE, R.string.activity_details_timing);
            o0VarE.C(-1959035124);
            w13.c cVar2 = pv0.p.f141402d;
            ArrayList arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
            p13.c.b bVar2 = new p13.c.b();
            while (bVar2.hasNext()) {
                pv0.p pVar = (pv0.p) bVar2.next();
                zv0.a aVar3 = zv0.a.f207158a;
                l22.a aVarS2 = a0.s(o0VarE);
                aVar3.getClass();
                pVar.getClass();
                int i18 = zv0.a.C3863a.f207162d[pVar.ordinal()];
                if (i18 != i16) {
                    c14 = 2;
                    if (i18 != 2) {
                        u0.r();
                        return;
                    }
                    string = aVarS2.getString(R.string.lbl_sleep_related);
                } else {
                    c14 = 2;
                    string = aVarS2.getString(R.string.lbl_daytime);
                }
                arrayList2.add(string);
                i16 = 1;
            }
            o0VarE.g0(false);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new l72.u(qVar, 4);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l72.u(qVar, 4);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            b(strQ, null, null, strQ2, 50, strQ3, arrayList, strQ4, arrayList2, null, null, mcVar, aVar, (e23.q) objQ, o0Var, 24576, (i15 << 9) & 64512);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(mcVar, aVar, qVar, i14, 19);
        }
    }

    public static final void b(final String str, String str2, String str3, final String str4, final Integer num, final String str5, final List list, final String str6, final List list2, String str7, String str8, final mc mcVar, final e23.a aVar, final e23.q qVar, p3.m mVar, final int i14, final int i15) {
        Object obj;
        Object obj2;
        final String str9;
        final String str10;
        final String str11;
        final String str12;
        String strQ;
        String strQ2;
        String str13;
        int i16;
        String str14;
        int i17;
        o0 o0VarE = mVar.E(-70156264);
        int i18 = i14 | (o0VarE.B(str) ? 4 : 2) | 400 | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.B(str5) ? 131072 : 65536) | (o0VarE.r(list) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912 | (o0VarE.B(str6) ? 67108864 : 33554432) | (o0VarE.r(list2) ? 536870912 : 268435456);
        int i19 = i15 | 6;
        if ((i15 & 48) == 0) {
            i19 = i15 | 22;
        }
        if ((i15 & 384) == 0) {
            i19 |= 128;
        }
        if ((i15 & 3072) == 0) {
            i19 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            obj = aVar;
            i19 |= o0VarE.r(obj) ? 16384 : 8192;
        } else {
            obj = aVar;
        }
        if ((196608 & i15) == 0) {
            obj2 = qVar;
            i19 |= o0VarE.r(obj2) ? 131072 : 65536;
        } else {
            obj2 = qVar;
        }
        if (o0VarE.n(i18 & 1, ((306783379 & i18) == 306783378 && (74899 & i19) == 74898) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                strQ = gl1.y.Q(o0VarE, R.string.lbl_name);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                strQ2 = gl1.y.Q(o0VarE, R.string.lbl_save);
                str13 = strQ3;
                i16 = i19 & (-1009);
                str14 = "";
            } else {
                o0VarE.e();
                str14 = str3;
                str13 = str7;
                strQ2 = str8;
                i16 = i19 & (-1009);
                strQ = str2;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(str14);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                i17 = 0;
                objQ2 = e5.o(0, o0VarE);
            } else {
                i17 = 0;
            }
            n1 n1Var = (n1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(i17, o0VarE);
            }
            n1 n1Var2 = (n1) objQ3;
            String str15 = strQ;
            String str16 = strQ2;
            l72.w.f111301a.e(z3.f.c(-1870095758, new ak0.g(str13, obj, str, str16, obj2, p1Var, n1Var, n1Var2, 11), o0VarE), null, aVar, mcVar, false, null, z3.f.c(214717283, new a11.l(str15, str5, str4, num, list, str6, list2, p1Var, n1Var, n1Var2, 10), o0VarE), o0VarE, ((i16 >> 6) & 896) | 12582918 | (i16 & 7168), 114);
            str9 = str15;
            str10 = str14;
            str11 = str16;
            str12 = str13;
        } else {
            o0VarE.e();
            str9 = str2;
            str10 = str3;
            str11 = str8;
            str12 = str7;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(str, str9, str10, str4, num, str5, list, str6, list2, str12, str11, mcVar, aVar, qVar, i14, i15) { // from class: wv0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f187370a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f187371b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f187372c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f187373d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Integer f187374e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f187375f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ List f187376g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f187377h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ List f187378i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ String f187379j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ String f187380k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ mc f187381l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ e23.a f187382m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ e23.q f187383n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ int f187384o;

                {
                    this.f187384o = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iT = p0.t(24577);
                    int iT2 = p0.t(this.f187384o);
                    d.b(this.f187370a, this.f187371b, this.f187372c, this.f187373d, this.f187374e, this.f187375f, this.f187376g, this.f187377h, this.f187378i, this.f187379j, this.f187380k, this.f187381l, this.f187382m, this.f187383n, (p3.m) obj3, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Code duplicated, block: B:108:0x0333  */
    /* JADX WARN: Code duplicated, block: B:109:0x0342  */
    /* JADX WARN: Code duplicated, block: B:112:0x0393  */
    /* JADX WARN: Code duplicated, block: B:114:0x039a  */
    /* JADX WARN: Code duplicated, block: B:115:0x039e  */
    /* JADX WARN: Code duplicated, block: B:120:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:125:0x043a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0447  */
    /* JADX WARN: Code duplicated, block: B:128:0x0460  */
    /* JADX WARN: Code duplicated, block: B:130:0x0464  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:95:0x0267  */
    /* JADX WARN: Code duplicated, block: B:97:0x026e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0272  */
    public static final void c(String str, String str2, String str3, String str4, Integer num, List list, e23.l lVar, e23.l lVar2, String str5, List list2, e23.l lVar3, p3.m mVar, int i14) {
        e23.l lVar4;
        h5.g.a.e eVar;
        h5.g.a.f fVar;
        boolean z14;
        Object objQ;
        int i15;
        h5.g.a.e eVar2;
        j92.b bVar;
        j92.e eVar3;
        float f14;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        j92.f fVar2;
        x0 x0Var;
        Object objQ2;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        int i16;
        Object objQ3;
        o0 o0VarE = mVar.E(-129498536);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.B(num) ? 16384 : 8192) | (o0VarE.r(list) ? 131072 : 65536) | (o0VarE.B(str5) ? 67108864 : 33554432) | (o0VarE.r(list2) ? 536870912 : 268435456);
        if (o0VarE.n(i17 & 1, (306783379 & i17) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            int i18 = 0;
            for (Object obj : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList.add(new j0((String) obj, null, null, false, i18 == 0, 14, null));
                i18 = i19;
            }
            Object objQ4 = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ4 == p3.m.a.f135155b) {
                objQ4 = p0.n(arrayList);
                o0VarE.K(objQ4);
            }
            p1 p1Var = (p1) objQ4;
            ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
            int i24 = 0;
            for (Object obj2 : list2) {
                int i25 = i24 + 1;
                if (i24 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList2.add(new j0((String) obj2, null, null, false, i24 == 0, 14, null));
                i24 = i25;
            }
            Object objQ5 = o0VarE.q();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ5 == c2565a) {
                objQ5 = p0.n(arrayList2);
                o0VarE.K(objQ5);
            }
            p1 p1Var2 = (p1) objQ5;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA3 = c2.y.a(kVar, aVar2, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar4 = h5.g.a.f81810g;
            b4.c(eVar4, zVarA3, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                eVar = eVar4;
            } else {
                eVar = eVar4;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                x5.v.f188954b.getClass();
                int i26 = x5.v.f188955c;
                if ((i17 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ = o0VarE.q();
                if (z14 || objQ == c2565a) {
                    objQ = new au0.g(str3, lVar, 10);
                    o0VarE.K(objQ);
                }
                int i27 = i17 << 3;
                i15 = i17 >> 3;
                eVar2 = eVar;
                d(aVar, str, str4, str3, num, (e23.l) objQ, i26, 0, o0VarE, (i27 & 7168) | (i27 & 112) | 1572870 | (i15 & 896) | (i17 & 57344));
                h4.r rVarF = x2.f(aVar, 1.0f);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar3 = j92.b.f97899b;
                float f15 = eVar3.f97920e;
                f14 = eVar3.f97920e;
                h4.r rVarC4 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, f15, 7);
                zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97931h;
                x0 x0VarB = d92.c.b(x0Var, o0VarE);
                bVar.getClass();
                h4.r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
                bVar.getClass();
                mh.c(str2, c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar3.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i15 & 14, 0, 131068);
                o0VarE = o0VarE;
                i53.c cVarE = i53.a.e((Iterable) p1Var.getF182175a());
                f82.d dVar = new f82.d();
                i0 i0VarA = k0.a(0, 0, 3, o0VarE);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new bt1.k(p1Var, lVar2, 13);
                    o0VarE.K(objQ2);
                }
                e82.a.b(cVarE, dVar, i0VarA, null, null, (e23.p) objQ2, o0VarE, 0, 24);
                o0VarE.g0(true);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                bVar.getClass();
                h4.r rVarC5 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
                zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC5, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(x0Var, o0VarE);
                bVar.getClass();
                h4.r rVarA2 = c2.l.A(aVar, f14, 0.0f, 2);
                bVar.getClass();
                h4.r rVarC6 = c2.l.C(rVarA2, 0.0f, 0.0f, 0.0f, eVar3.f97918c, 7);
                i16 = 14;
                mh.c(str5, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, (i17 >> 24) & 14, 0, 131068);
                i53.c cVarE2 = i53.a.e((Iterable) p1Var2.getF182175a());
                f82.d dVar2 = new f82.d();
                i0 i0VarA2 = k0.a(0, 0, 3, o0VarE);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    lVar4 = lVar3;
                    objQ3 = new bt1.k(p1Var2, lVar4, i16);
                    o0VarE.K(objQ3);
                } else {
                    lVar4 = lVar3;
                }
                e82.a.b(cVarE2, dVar2, i0VarA2, null, null, (e23.p) objQ3, o0VarE, 0, 24);
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            x5.v.f188954b.getClass();
            int i28 = x5.v.f188955c;
            if ((i17 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ = o0VarE.q();
            if (z14) {
                objQ = new au0.g(str3, lVar, 10);
                o0VarE.K(objQ);
            } else {
                objQ = new au0.g(str3, lVar, 10);
                o0VarE.K(objQ);
            }
            int i29 = i17 << 3;
            i15 = i17 >> 3;
            eVar2 = eVar;
            d(aVar, str, str4, str3, num, (e23.l) objQ, i28, 0, o0VarE, (i29 & 7168) | (i29 & 112) | 1572870 | (i15 & 896) | (i17 & 57344));
            h4.r rVarF3 = x2.f(aVar, 1.0f);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar3 = j92.b.f97899b;
            float f16 = eVar3.f97920e;
            f14 = eVar3.f97920e;
            h4.r rVarC7 = c2.l.C(rVarF3, 0.0f, 0.0f, 0.0f, f16, 7);
            zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC7, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97931h;
            x0 x0VarB3 = d92.c.b(x0Var, o0VarE);
            bVar.getClass();
            h4.r rVarA3 = c2.l.A(aVar, f14, 0.0f, 2);
            bVar.getClass();
            mh.c(str2, c2.l.C(rVarA3, 0.0f, 0.0f, 0.0f, eVar3.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, o0VarE, i15 & 14, 0, 131068);
            o0VarE = o0VarE;
            i53.c cVarE3 = i53.a.e((Iterable) p1Var.getF182175a());
            f82.d dVar3 = new f82.d();
            i0 i0VarA3 = k0.a(0, 0, 3, o0VarE);
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new bt1.k(p1Var, lVar2, 13);
                o0VarE.K(objQ2);
            }
            e82.a.b(cVarE3, dVar3, i0VarA3, null, null, (e23.p) objQ2, o0VarE, 0, 24);
            o0VarE.g0(true);
            h4.r rVarF4 = x2.f(aVar, 1.0f);
            bVar.getClass();
            h4.r rVarC8 = c2.l.C(rVarF4, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
            zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC8, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            fVar2.getClass();
            x0 x0VarB4 = d92.c.b(x0Var, o0VarE);
            bVar.getClass();
            h4.r rVarA4 = c2.l.A(aVar, f14, 0.0f, 2);
            bVar.getClass();
            h4.r rVarC9 = c2.l.C(rVarA4, 0.0f, 0.0f, 0.0f, eVar3.f97918c, 7);
            i16 = 14;
            mh.c(str5, rVarC9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB4, o0VarE, (i17 >> 24) & 14, 0, 131068);
            i53.c cVarE4 = i53.a.e((Iterable) p1Var2.getF182175a());
            f82.d dVar4 = new f82.d();
            i0 i0VarA4 = k0.a(0, 0, 3, o0VarE);
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                lVar4 = lVar3;
                objQ3 = new bt1.k(p1Var2, lVar4, i16);
                o0VarE.K(objQ3);
            } else {
                lVar4 = lVar3;
            }
            e82.a.b(cVarE4, dVar4, i0VarA4, null, null, (e23.p) objQ3, o0VarE, 0, 24);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            lVar4 = lVar3;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.e0(str, str2, str3, str4, num, list, lVar, lVar2, str5, list2, lVar4, i14);
        }
    }

    public static final void d(h4.r rVar, String str, String str2, String str3, Integer num, e23.l lVar, int i14, int i15, p3.m mVar, int i16) {
        int i17;
        int i18;
        p3.m.a.C2565a c2565a;
        o0 o0VarE = mVar.E(1425970372);
        if ((i16 & 48) == 0) {
            i17 = (o0VarE.B(str) ? 32 : 16) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 384) == 0) {
            i17 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= o0VarE.B(num) ? 16384 : 8192;
        }
        int i19 = i17 | (o0VarE.r(lVar) ? 131072 : 65536) | 12582912;
        if (o0VarE.n(i19 & 1, (4793491 & i19) != 4793490)) {
            x5.p.f188918b.getClass();
            int i24 = x5.p.f188926j;
            x1 x1Var = p3.n.f135158a;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                int length = str2.length();
                c2565a = c2565a2;
                objQ3 = p0.n(new l0(str2, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ3);
            } else {
                c2565a = c2565a2;
            }
            p1 p1Var2 = (p1) objQ3;
            t2 t2Var = new t2(ds.e0.d(d92.b.f58623a, o0VarE), d0.c(0.4f, d92.b.a(o0VarE).k().b(), 14), null);
            boolean z14 = (i19 & 896) == 256;
            Object objQ4 = o0VarE.q();
            if (z14 || objQ4 == c2565a) {
                objQ4 = new c(str2, p1Var2, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, str2, o0VarE);
            p3.v.a(u2.f201804a.c(t2Var), z3.f.c(628328452, new a(rVar, b0Var, p1Var, str, p1Var2, i14, i24, qVar, num, lVar, str3), o0VarE), o0VarE, 56);
            i18 = i24;
        } else {
            o0VarE.e();
            i18 = i15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fx0.l(rVar, str, str2, str3, num, lVar, i14, i18, i16);
        }
    }
}
