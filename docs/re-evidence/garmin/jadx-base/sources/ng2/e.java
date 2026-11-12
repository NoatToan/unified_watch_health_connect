package ng2;

import androidx.lifecycle.n0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import e23.q;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.o2;
import r53.s;
import u1.a2;
import yg2.g0;
import yg2.h0;
import yg2.j0;
import yg2.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126060a;

        static {
            int[] iArr = new int[ag2.a.EnumC0052a.values().length];
            try {
                iArr[ag2.a.EnumC0052a.MEDIA_CAROUSEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ag2.a.EnumC0052a.STATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ag2.a.EnumC0052a.ACTIVITY_DETAILS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ag2.a.EnumC0052a.DEVICE_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f126060a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02af  */
    /* JADX WARN: Code duplicated, block: B:264:0x066a  */
    /* JADX WARN: Code duplicated, block: B:380:0x0ad1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final r rVar, final rg2.h hVar, final ag2.d dVar, final o2 o2Var, final o2 o2Var2, final boolean z14, final o oVar, final h0 h0Var, final bg2.h hVar2, final boolean z15, final boolean z16, final e23.a aVar, final ag2.e eVar, final l lVar, final q qVar, final lg2.r rVar2, final e23.a aVar2, final zf2.d dVar2, final boolean z17, final boolean z18, final o2 o2Var3, final o2 o2Var4, final rf2.l lVar2, final l lVar3, final e23.a aVar3, final e23.a aVar4, final p pVar, boolean z19, e23.a aVar5, m mVar, final int i14, final int i15) {
        final boolean z24;
        final e23.a aVar6;
        int i16;
        boolean z25;
        boolean z26;
        o oVar2;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z34;
        rg2.h hVar3 = hVar;
        o2 o2Var5 = o2Var2;
        o oVar3 = oVar;
        h0 h0Var2 = h0Var;
        o2 o2Var6 = o2Var3;
        o2 o2Var7 = o2Var4;
        hVar3.getClass();
        o2Var.getClass();
        o2Var5.getClass();
        oVar3.getClass();
        lVar.getClass();
        qVar.getClass();
        rVar2.getClass();
        aVar2.getClass();
        dVar2.getClass();
        o2Var6.getClass();
        o2Var7.getClass();
        lVar3.getClass();
        aVar3.getClass();
        aVar4.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-76765123);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(hVar3) ? 32 : 16) | (o0VarE.r(dVar) ? 256 : 128) | (o0VarE.r(o2Var) ? 2048 : 1024) | (o0VarE.r(o2Var5) ? 16384 : 8192) | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.r(oVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(h0Var2) ? 8388608 : 4194304) | (o0VarE.r(hVar2) ? 67108864 : 33554432);
        int i18 = (o0VarE.h(z16) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(qVar) ? 16384 : 8192) | (o0VarE.B(rVar2) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.k(dVar2.ordinal()) ? 8388608 : 4194304) | (o0VarE.h(z17) ? 67108864 : 33554432) | (o0VarE.h(z18) ? 536870912 : 268435456);
        int i19 = (o0VarE.r(o2Var6) ? 4 : 2) | (o0VarE.r(o2Var7) ? 32 : 16) | (o0VarE.B(lVar2) ? 256 : 128) | (o0VarE.r(lVar3) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(aVar4) ? 131072 : 65536) | (o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i24 = i15 & 134217728;
        int i25 = i24 != 0 ? i19 | 12582912 : i19 | (o0VarE.h(z19) ? 8388608 : 4194304);
        int i26 = i15 & 268435456;
        int i27 = i26 != 0 ? i25 | 100663296 : i25 | (o0VarE.r(aVar5) ? 67108864 : 33554432);
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (i18 & 306783379) == 306783378 && (i27 & 38347923) == 38347922) ? false : true)) {
            boolean z35 = i24 != 0 ? false : z19;
            m.a aVar7 = m.f135153a;
            if (i26 != 0) {
                Object objQ = o0VarE.q();
                aVar7.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new n61.h(21);
                    o0VarE.K(objQ);
                }
                aVar6 = (e23.a) objQ;
            } else {
                aVar6 = aVar5;
            }
            x1 x1Var = n.f135158a;
            List<ag2.a> listB = dVar != null ? dVar.b() : null;
            p1 p1VarC = p0.c(hVar3.f152713f, o0VarE, 0);
            p1 p1VarC2 = p0.c(s.d(hVar3.f152718k), o0VarE, 0);
            p1 p1VarC3 = p0.c(hVar3.f152717j, o0VarE, 0);
            n0 n0Var = (n0) o0VarE.A(s9.j.f158018a);
            Unit unit = Unit.INSTANCE;
            List<ag2.a> list = listB;
            p3.c<?> cVar2 = cVar;
            boolean zR = o0VarE.r(n0Var) | ((i18 & 3670016) == 1048576);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new b(n0Var, aVar2, null);
                o0VarE.K(objQ2);
            } else {
                aVar7.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new b(n0Var, aVar2, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((p) objQ2, unit, o0VarE);
            if (list == null || list.isEmpty()) {
                final boolean z36 = z35;
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i28 = 0;
                    p2VarI0.f(new p(rVar, hVar, dVar, o2Var, o2Var2, z14, oVar, h0Var, hVar2, z15, z16, aVar, eVar, lVar, qVar, rVar2, aVar2, dVar2, z17, z18, o2Var3, o2Var4, lVar2, lVar3, aVar3, aVar4, pVar, z36, aVar6, i14, i15, i28) { // from class: ng2.a
                        public final /* synthetic */ l A;
                        public final /* synthetic */ e23.a B;
                        public final /* synthetic */ e23.a C;
                        public final /* synthetic */ p D;
                        public final /* synthetic */ boolean E;
                        public final /* synthetic */ e23.a F;
                        public final /* synthetic */ int I;

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f126031a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ r f126032b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ rg2.h f126033c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ ag2.d f126034d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ o2 f126035e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ o2 f126036f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ boolean f126037g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ o f126038h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ h0 f126039i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ bg2.h f126040j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ boolean f126041k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ boolean f126042l;

                        /* JADX INFO: renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ e23.a f126043m;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ ag2.e f126044n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ l f126045o;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ q f126046p;

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ lg2.r f126047q;

                        /* JADX INFO: renamed from: r, reason: collision with root package name */
                        public final /* synthetic */ e23.a f126048r;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        public final /* synthetic */ zf2.d f126049t;

                        /* JADX INFO: renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ boolean f126050v;

                        /* JADX INFO: renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ boolean f126051w;

                        /* JADX INFO: renamed from: x, reason: collision with root package name */
                        public final /* synthetic */ o2 f126052x;

                        /* JADX INFO: renamed from: y, reason: collision with root package name */
                        public final /* synthetic */ o2 f126053y;

                        /* JADX INFO: renamed from: z, reason: collision with root package name */
                        public final /* synthetic */ rf2.l f126054z;

                        {
                            this.f126031a = i28;
                            this.I = i15;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            m mVar2 = (m) obj;
                            switch (this.f126031a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    e.a(this.f126032b, this.f126033c, this.f126034d, this.f126035e, this.f126036f, this.f126037g, this.f126038h, this.f126039i, this.f126040j, this.f126041k, this.f126042l, this.f126043m, this.f126044n, this.f126045o, this.f126046p, this.f126047q, this.f126048r, this.f126049t, this.f126050v, this.f126051w, this.f126052x, this.f126053y, this.f126054z, this.A, this.B, this.C, this.D, this.E, this.F, mVar2, p0.t(805306369), this.I);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    e.a(this.f126032b, this.f126033c, this.f126034d, this.f126035e, this.f126036f, this.f126037g, this.f126038h, this.f126039i, this.f126040j, this.f126041k, this.f126042l, this.f126043m, this.f126044n, this.f126045o, this.f126046p, this.f126047q, this.f126048r, this.f126049t, this.f126050v, this.f126051w, this.f126052x, this.f126053y, this.f126054z, this.A, this.B, this.C, this.D, this.E, this.F, mVar2, p0.t(805306369), this.I);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            if (z16) {
                o oVar4 = oVar3;
                boolean z37 = true;
                int i29 = 0;
                o0VarE.C(-1980570231);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.getU());
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                e0.a aVar8 = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                o0VarE.C(510038884);
                for (ag2.a aVar9 : list) {
                    r.a aVar10 = r.S;
                    r rVarA = u2Var.a(aVar10, 0.5f, z37);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarC2 = c2.l.C(rVarA, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar11 = h4.d.a.f81536n;
                    z zVarA = y.a(kVar, aVar11, o0VarE, i29);
                    x1 x1Var2 = n.f135158a;
                    int iHashCode2 = Long.hashCode(o0VarE.getU());
                    i2 i2VarA1 = o0VarE.a0();
                    r rVarC3 = h4.k.c(rVarC2, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (cVar2 == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar12);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                    b0 b0Var = b0.f22601a;
                    ag2.a.EnumC0052a enumC0052aC = aVar9.c();
                    int i30 = enumC0052aC == null ? -1 : a.f126060a[enumC0052aC.ordinal()];
                    if (i30 == 1) {
                        u2Var = u2Var;
                        o oVar5 = oVar4;
                        h0 h0Var3 = h0Var2;
                        i27 = i27;
                        i16 = 0;
                        z25 = z35;
                        o0VarE.C(185648936);
                        List<ag2.c> listB2 = aVar9.b();
                        if (listB2 == null || listB2.isEmpty()) {
                            z26 = true;
                            o0VarE.C(187487484);
                            o0VarE.f();
                        } else {
                            o0VarE.C(185713478);
                            List<ag2.c> listB3 = aVar9.b();
                            if (!z15) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : listB3) {
                                    ag2.c.a aVarA = ((ag2.c) obj).a();
                                    if (aVarA != null) {
                                        int i34 = g0.a.f196990a[aVarA.ordinal()];
                                        if (i34 != 1 && i34 != 2) {
                                            if (i34 == 3 || i34 == 4) {
                                            }
                                        }
                                    }
                                    arrayList.add(obj);
                                }
                                listB3 = arrayList;
                            }
                            List<ag2.c> listA = og2.i.a(listB3, b(p1VarC));
                            r.a aVar13 = r.S;
                            d92.b.f58623a.getClass();
                            r rVarC4 = c2.l.C(aVar13, 0.0f, d92.b.b().b().getF97920e(), 0.0f, 0.0f, 13);
                            Map mapB = b(p1VarC);
                            Integer num = (Integer) p1VarC2.getF182175a();
                            boolean zBooleanValue = ((Boolean) p1VarC3.getF182175a()).booleanValue();
                            boolean zR2 = o0VarE.r(hVar);
                            Object objQ3 = o0VarE.q();
                            if (zR2) {
                                objQ3 = new d(hVar);
                                o0VarE.K(objQ3);
                            } else {
                                aVar7.getClass();
                                if (objQ3 == m.a.a()) {
                                    objQ3 = new d(hVar);
                                    o0VarE.K(objQ3);
                                }
                            }
                            int i35 = i18 >> 15;
                            int i36 = i27 << 9;
                            o0 o0Var = o0VarE;
                            z26 = true;
                            k.a(rVarC4, listA, mapB, num, o2Var, o2Var2, z14, oVar5, h0Var3, lVar2, zBooleanValue, hVar2, dVar2, z17, false, (q) ((k23.g) objQ3), lVar3, aVar3, aVar4, pVar, o0Var, ((i17 << 3) & 268427264) | ((i27 << 21) & 1879048192), ((i17 >> 21) & 112) | 24576 | (i35 & 896) | (i35 & 7168) | (i36 & 3670016) | (i36 & 29360128) | (i36 & 234881024) | (i36 & 1879048192), 0);
                            o0VarE = o0Var;
                            o0VarE.f();
                        }
                        o0VarE.f();
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        if (i30 != 2) {
                            o0VarE.C(-1379337065);
                            o0VarE.f();
                            throw new Exception();
                        }
                        o0VarE.C(187653613);
                        List<ag2.c> listB4 = aVar9.b();
                        if (listB4 == null || listB4.isEmpty()) {
                            i16 = 0;
                            z25 = z35;
                            o0VarE.C(190163900);
                            o0VarE.f();
                        } else {
                            o0VarE.C(187718155);
                            List<ag2.c> listA2 = og2.i.a(aVar9.b(), (Map) p1VarC.getF182175a());
                            new bh2.f();
                            Map map = (Map) p1VarC.getF182175a();
                            listA2.getClass();
                            map.getClass();
                            ArrayList arrayList2 = new ArrayList(listA2);
                            arrayList2.removeIf(new a73.n(new bh2.e(map, 0), 2));
                            List listB1 = p13.h0.b1(arrayList2);
                            r rVarB = a2.b(b0Var.a(aVar10, 1.0f, true), a2.a(o0VarE), true);
                            z zVarA2 = y.a(kVar, aVar11, o0VarE, 0);
                            int iHashCode3 = Long.hashCode(o0VarE.getU());
                            i2 i2VarA2 = o0VarE.a0();
                            r rVarC5 = h4.k.c(rVarB, o0VarE);
                            if (cVar2 == null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.getT()) {
                                o0VarE.M(aVar12);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(h5.g.a.c(), zVarA2, o0VarE);
                            b4.c(h5.g.a.e(), i2VarA2, o0VarE);
                            h5.g.a.b bVarB = h5.g.a.b();
                            if (o0VarE.getT() || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                                v.h.A(iHashCode3, o0VarE, iHashCode3, bVarB);
                            }
                            b4.c(h5.g.a.d(), rVarC5, o0VarE);
                            r rVarA2 = c2.l.A(aVar10, d92.b.b().b().getF97920e(), 0.0f, 2);
                            boolean zBooleanValue2 = ((Boolean) p1VarC3.getF182175a()).booleanValue();
                            h0 h0VarI = h0Var2 != null ? fg2.h0.i(h0Var2, oVar4) : null;
                            Map mapB2 = b(p1VarC);
                            zf2.d dVar3 = zf2.d.f204583b2;
                            boolean z38 = dVar2 == dVar3;
                            zf2.d dVar4 = zf2.d.f204585c2;
                            int i37 = i27 << 6;
                            o oVar6 = oVar4;
                            h0 h0Var4 = h0Var2;
                            i16 = 0;
                            rg2.g.a(rVarA2, listB1, h0Var4, zBooleanValue2, lVar2, dVar2, z14, h0VarI, mapB2, z38, dVar2 == dVar4, o0VarE, ((i17 >> 15) & 896) | (i37 & 57344) | ((i18 >> 6) & 458752) | ((i17 << 3) & 3670016), 0);
                            o0VarE.y();
                            r rVarC6 = c2.l.C(aVar10, d92.b.b().b().getF97920e(), 0.0f, 0.0f, 0.0f, 14);
                            j0 j0VarJ = h0Var4 != null ? fg2.h0.j(h0Var4, oVar6) : null;
                            boolean z39 = !z18;
                            boolean z44 = (dVar2 == dVar3 || dVar2 == dVar4) ? false : true;
                            int i38 = i18 << 6;
                            boolean z45 = z35;
                            o0 o0Var2 = o0VarE;
                            lg2.q.a(rVarC6, eVar, j0VarJ, aVar, lVar, rVar2, qVar, z39, z44, z45, aVar6, o0Var2, ((i18 >> 3) & 112) | (i38 & 7168) | ((i18 << 3) & 57344) | (i18 & 458752) | (i38 & 3670016) | (i37 & 1879048192), (i27 >> 24) & 14, 0);
                            o0VarE = o0Var2;
                            z25 = z45;
                            o0VarE.f();
                        }
                        o0VarE.f();
                        Unit unit3 = Unit.INSTANCE;
                        z26 = true;
                    }
                    o0VarE.y();
                    oVar4 = oVar;
                    h0Var2 = h0Var;
                    z35 = z25;
                    i29 = i16;
                    z37 = z26;
                    i27 = i27;
                    u2Var = u2Var;
                }
                z24 = z35;
                o0VarE.f();
                o0VarE.y();
                o0VarE.f();
            } else {
                o0VarE.C(-1985250518);
                r rVarB2 = a2.b(rVar, a2.a(o0VarE), true);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC7 = c2.l.C(rVarB2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA3 = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode4 = Long.hashCode(o0VarE.getU());
                i2 i2VarA3 = o0VarE.a0();
                r rVarC8 = h4.k.c(rVarC7, o0VarE);
                h5.g.V.getClass();
                e0.a aVar14 = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar14);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA3, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA3, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC8, o0VarE);
                b0 b0Var2 = b0.f22601a;
                o0VarE.C(1069346206);
                Iterator<ag2.a> it = list.iterator();
                while (it.hasNext()) {
                    ag2.a next = it.next();
                    ag2.a.EnumC0052a enumC0052aC2 = next.c();
                    int i39 = enumC0052aC2 == null ? -1 : a.f126060a[enumC0052aC2.ordinal()];
                    if (i39 != 1) {
                        if (i39 == 2) {
                            cVar2 = cVar2;
                            o0VarE.C(-1208197626);
                            List<ag2.c> listB5 = next.b();
                            if (listB5 == null || !(!listB5.isEmpty())) {
                                z29 = false;
                                o0VarE.C(-1207074899);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-1208131999);
                                List<ag2.c> listA3 = og2.i.a(next.b(), (Map) p1VarC.getF182175a());
                                new bh2.f();
                                Map map2 = (Map) p1VarC.getF182175a();
                                listA3.getClass();
                                map2.getClass();
                                ArrayList arrayList3 = new ArrayList(listA3);
                                arrayList3.removeIf(new a73.n(new bh2.e(map2, 0), 2));
                                List listB6 = p13.h0.b1(arrayList3);
                                r.a aVar15 = r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                o0 o0Var3 = o0VarE;
                                rg2.g.a(c2.l.A(aVar15, j92.b.f97899b.f97920e, 0.0f, 2), listB6, h0Var2, ((Boolean) p1VarC3.getF182175a()).booleanValue(), lVar2, dVar2, z14, h0Var2 != null ? fg2.h0.i(h0Var2, oVar3) : null, (Map) p1VarC.getF182175a(), dVar2 == zf2.d.f204583b2, dVar2 == zf2.d.f204585c2, o0Var3, ((i17 >> 15) & 896) | ((i27 << 6) & 57344) | ((i18 >> 6) & 458752) | ((i17 << 3) & 3670016), 0);
                                o0VarE = o0Var3;
                                z29 = false;
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z29);
                            Unit unit4 = Unit.INSTANCE;
                            h0Var2 = h0Var;
                        } else if (i39 == 3) {
                            o0VarE.C(-1206970336);
                            List<ag2.c> listB7 = next.b();
                            if (listB7 == null || !(!listB7.isEmpty())) {
                                z34 = false;
                                o0VarE.C(-1206456883);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-1206904709);
                                rg2.a.a(next.b(), (Map) p1VarC.getF182175a(), ((Boolean) p1VarC3.getF182175a()).booleanValue(), lVar2, dVar2, z14, o0VarE, ((i27 << 3) & 7168) | ((i18 >> 9) & 57344) | (i17 & 458752));
                                z34 = false;
                                o0VarE.g0(false);
                            }
                            o0VarE.g0(z34);
                            Unit unit5 = Unit.INSTANCE;
                        } else {
                            if (i39 != 4) {
                                o0VarE.C(1069480838);
                                o0VarE.g0(false);
                                throw new Exception();
                            }
                            o0VarE.C(-1206358551);
                            p1 p1VarC4 = p0.c(o2Var6, o0VarE, i27 & 14);
                            zf2.e eVar2 = (zf2.e) p1VarC4.getF182175a();
                            String str = eVar2 != null ? eVar2.f204641b : null;
                            zf2.e eVar3 = (zf2.e) p1VarC4.getF182175a();
                            o0 o0Var4 = o0VarE;
                            f.b(str, eVar3 != null ? eVar3.f204640a : null, !((Boolean) p0.c(o2Var5, o0VarE, (i17 >> 12) & 14).getF182175a()).booleanValue(), (Integer) p0.c(o2Var7, o0VarE, (i27 >> 3) & 14).getF182175a(), o0Var4, 0);
                            o0VarE = o0Var4;
                            o0VarE.g0(false);
                            Unit unit6 = Unit.INSTANCE;
                            it = it;
                            oVar2 = oVar3;
                            cVar2 = cVar2;
                        }
                        it = it;
                        oVar2 = oVar3;
                    } else {
                        cVar2 = cVar2;
                        o0VarE.C(1069347835);
                        r.a aVar16 = r.S;
                        c2.j.f22691a.getClass();
                        c2.j.C0343j c0343j2 = c2.j.f22692b;
                        h4.d.f81522a.getClass();
                        s2 s2VarA2 = q2.a(c0343j2, h4.d.a.f81533k, o0VarE, 0);
                        x1 x1Var3 = n.f135158a;
                        int iHashCode5 = Long.hashCode(o0VarE.getU());
                        i2 i2VarA4 = o0VarE.a0();
                        r rVarC9 = h4.k.c(aVar16, o0VarE);
                        h5.g.V.getClass();
                        e0.a aVar17 = h5.g.a.f81805b;
                        if (cVar2 == null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar17);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA2, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA4, o0VarE);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                            v.h.A(iHashCode5, o0VarE, iHashCode5, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC9, o0VarE);
                        u2 u2Var2 = u2.f22900a;
                        List<ag2.c> listB8 = next.b();
                        if (listB8 == null || listB8.isEmpty()) {
                            h0Var2 = h0Var;
                            oVar2 = oVar3;
                            z27 = true;
                            z28 = false;
                            o0VarE.C(322956971);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(321377087);
                            List<ag2.c> listB9 = next.b();
                            if (!z15) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj2 : listB9) {
                                    ag2.c.a aVarA2 = ((ag2.c) obj2).a();
                                    if (aVarA2 != null) {
                                        int i44 = g0.a.f196990a[aVarA2.ordinal()];
                                        if (i44 != 1 && i44 != 2 && i44 != 3) {
                                            if (i44 != 4) {
                                            }
                                        }
                                    }
                                    arrayList4.add(obj2);
                                }
                                listB9 = arrayList4;
                            }
                            List<ag2.c> listA4 = og2.i.a(listB9, (Map) p1VarC.getF182175a());
                            Map map3 = (Map) p1VarC.getF182175a();
                            Integer num2 = (Integer) p1VarC2.getF182175a();
                            boolean zBooleanValue3 = ((Boolean) p1VarC3.getF182175a()).booleanValue();
                            boolean zR3 = o0VarE.r(hVar3);
                            Object objQ4 = o0VarE.q();
                            if (zR3) {
                                objQ4 = new c(hVar3);
                                o0VarE.K(objQ4);
                            } else {
                                aVar7.getClass();
                                if (objQ4 == m.a.f135155b) {
                                    objQ4 = new c(hVar3);
                                    o0VarE.K(objQ4);
                                }
                            }
                            int i45 = i18 >> 15;
                            int i46 = i27 << 9;
                            int i47 = ((i17 >> 21) & 112) | 24576 | (i45 & 896) | (i45 & 7168) | (i46 & 3670016) | (i46 & 29360128) | (i46 & 234881024) | (i46 & 1879048192);
                            o oVar7 = oVar3;
                            z27 = true;
                            o0 o0Var5 = o0VarE;
                            z28 = false;
                            k.a(null, listA4, map3, num2, o2Var, o2Var5, z14, oVar7, h0Var, lVar2, zBooleanValue3, hVar2, dVar2, z17, true, (q) ((k23.g) objQ4), lVar3, aVar3, aVar4, pVar, o0Var5, ((i17 << 3) & 268427264) | ((i27 << 21) & 1879048192), i47, 1);
                            oVar2 = oVar7;
                            h0Var2 = h0Var;
                            o0VarE = o0Var5;
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(z27);
                        o0VarE.g0(z28);
                        Unit unit7 = Unit.INSTANCE;
                    }
                    hVar3 = hVar;
                    o2Var5 = o2Var2;
                    o2Var6 = o2Var3;
                    o2Var7 = o2Var4;
                    it = it;
                    oVar3 = oVar2;
                    cVar2 = cVar2;
                }
                o0VarE.g0(false);
                c2.l.f(b0Var2.a(r.S, 1.0f, true), o0VarE);
                o0VarE.g0(true);
                o0VarE.g0(false);
                z24 = z35;
            }
            x1 x1Var4 = n.f135158a;
        } else {
            o0VarE.e();
            z24 = z19;
            aVar6 = aVar5;
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            final int i48 = 1;
            p2VarI1.f(new p(rVar, hVar, dVar, o2Var, o2Var2, z14, oVar, h0Var, hVar2, z15, z16, aVar, eVar, lVar, qVar, rVar2, aVar2, dVar2, z17, z18, o2Var3, o2Var4, lVar2, lVar3, aVar3, aVar4, pVar, z24, aVar6, i14, i15, i48) { // from class: ng2.a
                public final /* synthetic */ l A;
                public final /* synthetic */ e23.a B;
                public final /* synthetic */ e23.a C;
                public final /* synthetic */ p D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ e23.a F;
                public final /* synthetic */ int I;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f126031a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f126032b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ rg2.h f126033c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ag2.d f126034d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ o2 f126035e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ o2 f126036f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f126037g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ o f126038h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ h0 f126039i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ bg2.h f126040j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ boolean f126041k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ boolean f126042l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ e23.a f126043m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ ag2.e f126044n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ l f126045o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ q f126046p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ lg2.r f126047q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ e23.a f126048r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ zf2.d f126049t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f126050v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f126051w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ o2 f126052x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ o2 f126053y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public final /* synthetic */ rf2.l f126054z;

                {
                    this.f126031a = i48;
                    this.I = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    m mVar2 = (m) obj3;
                    switch (this.f126031a) {
                        case 0:
                            ((Integer) obj4).getClass();
                            e.a(this.f126032b, this.f126033c, this.f126034d, this.f126035e, this.f126036f, this.f126037g, this.f126038h, this.f126039i, this.f126040j, this.f126041k, this.f126042l, this.f126043m, this.f126044n, this.f126045o, this.f126046p, this.f126047q, this.f126048r, this.f126049t, this.f126050v, this.f126051w, this.f126052x, this.f126053y, this.f126054z, this.A, this.B, this.C, this.D, this.E, this.F, mVar2, p0.t(805306369), this.I);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            e.a(this.f126032b, this.f126033c, this.f126034d, this.f126035e, this.f126036f, this.f126037g, this.f126038h, this.f126039i, this.f126040j, this.f126041k, this.f126042l, this.f126043m, this.f126044n, this.f126045o, this.f126046p, this.f126047q, this.f126048r, this.f126049t, this.f126050v, this.f126051w, this.f126052x, this.f126053y, this.f126054z, this.A, this.B, this.C, this.D, this.E, this.F, mVar2, p0.t(805306369), this.I);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final Map b(p1 p1Var) {
        return (Map) p1Var.getF182175a();
    }
}
