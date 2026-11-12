package x91;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.p1;
import h2.j0;
import h5.e0;
import i3.fe;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<q91.d, Unit> f189642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ aa1.g f189643b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super q91.d, Unit> lVar, aa1.g gVar) {
            this.f189642a = lVar;
            this.f189643b = gVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f189642a.invoke(this.f189643b.f2275a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<q91.d, Unit> f189644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ aa1.g f189645b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super q91.d, Unit> lVar, aa1.g gVar) {
            this.f189644a = lVar;
            this.f189645b = gVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f189644a.invoke(this.f189645b.f2275a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ aa1.g f189646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.q<q91.d, String, Boolean, Unit> f189647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<q91.d, Boolean, Unit> f189648c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(aa1.g gVar, e23.q<? super q91.d, ? super String, ? super Boolean, Unit> qVar, e23.p<? super q91.d, ? super Boolean, Unit> pVar) {
            this.f189646a = gVar;
            this.f189647b = qVar;
            this.f189648c = pVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            aa1.g gVar = this.f189646a;
            q91.d dVar = gVar.f2275a;
            boolean z14 = gVar.f2277c;
            q91.g gVar2 = dVar.f143580b;
            if (gVar2 == q91.g.STEPS || gVar2 == q91.g.PUSHES) {
                this.f189647b.invoke(dVar, gVar.f2281g, Boolean.valueOf(z14));
            } else {
                this.f189648c.invoke(dVar, Boolean.valueOf(z14 || gVar.f2276b));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f189649a = new d();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f189650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f189651b;

        public e(e23.l lVar, List list) {
            this.f189650a = lVar;
            this.f189651b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f189650a.invoke(this.f189651b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f189652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f189653b;

        public f(e23.l lVar, List list) {
            this.f189652a = lVar;
            this.f189653b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f189652a.invoke(this.f189653b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f189654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f189655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l f189656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.q f189657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.p f189658e;

        public g(List list, e23.l lVar, e23.l lVar2, e23.q qVar, e23.p pVar) {
            this.f189654a = list;
            this.f189655b = lVar;
            this.f189656c = lVar2;
            this.f189657d = qVar;
            this.f189658e = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006d  */
        /* JADX WARN: Code duplicated, block: B:32:0x0090  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                aa1.g gVar = (aa1.g) this.f189654a.get(iIntValue);
                mVar2.C(-56145722);
                e23.l lVar = this.f189655b;
                boolean zB = mVar2.B(lVar) | mVar2.r(gVar);
                Object objQ = mVar2.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zB) {
                    objQ = new a(lVar, gVar);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(lVar, gVar);
                        mVar2.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                e23.l lVar2 = this.f189656c;
                boolean zB2 = mVar2.B(lVar2) | mVar2.r(gVar);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new b(lVar2, gVar);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new b(lVar2, gVar);
                        mVar2.K(objQ2);
                    }
                }
                e23.a aVar3 = (e23.a) objQ2;
                boolean zR = mVar2.r(gVar);
                e23.q qVar = this.f189657d;
                boolean zB3 = zR | mVar2.B(qVar);
                e23.p pVar = this.f189658e;
                boolean zB4 = zB3 | mVar2.B(pVar);
                Object objQ3 = mVar2.q();
                if (zB4) {
                    objQ3 = new c(gVar, qVar, pVar);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new c(gVar, qVar, pVar);
                        mVar2.K(objQ3);
                    }
                }
                u91.l.a(gVar, aVar2, aVar3, (e23.a) objQ3, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189659a;

        static {
            int[] iArr = new int[q91.g.values().length];
            try {
                iArr[q91.g.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q91.g.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q91.g.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q91.g.CYCLING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q91.g.TRAINING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q91.g.PARASPORTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q91.g.PUSHES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f189659a = iArr;
        }
    }

    public static final void a(q91.g gVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(-673202973);
        int i16 = (o0VarE.k(gVar == null ? -1 : gVar.ordinal()) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarD, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            bVar.getClass();
            h4.r rVarB = a2.b(c2.l.A(rVarC, eVar.f97921f, 0.0f, 2), a2.a(o0VarE), true);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97918c;
            jVar.getClass();
            z zVarA = y.a(c2.j.i(f14), aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            String strQ = gl1.y.Q(o0VarE, R.string.msg_no_data_available);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            mh.c(strQ, null, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130046);
            switch (gVar != null ? h.f189659a[gVar.ordinal()] : -1) {
                case 2:
                    i15 = R.string.all_run_personal_record_types_hidden;
                    break;
                case 3:
                    i15 = R.string.all_swim_personal_record_types_hidden;
                    break;
                case 4:
                    i15 = R.string.all_cycling_personal_record_types_hidden;
                    break;
                case 5:
                    i15 = R.string.all_strength_personal_record_types_hidden;
                    break;
                case 6:
                    i15 = R.string.lbl_personal_records_hidden_parasports;
                    break;
                case 7:
                    i15 = R.string.lbl_personal_records_hidden_pushes;
                    break;
                default:
                    i15 = R.string.all_walk_personal_record_types_hidden;
                    break;
            }
            String strQ2 = gl1.y.Q(o0VarE, i15);
            fVar.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130046);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vy0.e(gVar, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    public static final void b(aa1.i iVar, e23.l<? super q91.d, Unit> lVar, e23.l<? super q91.d, Unit> lVar2, e23.p<? super q91.d, ? super Boolean, Unit> pVar, e23.q<? super q91.d, ? super String, ? super Boolean, Unit> qVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-763814259);
        int i15 = i14 | (o0VarE.B(iVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(qVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            l2 l2VarE = c2.l.e(f15, f15, f15, 0.0f, 8);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32) | ((i15 & 896) == 256) | ((57344 & i15) == 16384) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (z14) {
                ug2.q qVar2 = new ug2.q(iVar, lVar, lVar2, qVar, pVar, 11);
                o0VarE.K(qVar2);
                objQ = qVar2;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    ug2.q qVar3 = new ug2.q(iVar, lVar, lVar2, qVar, pVar, 11);
                    o0VarE.K(qVar3);
                    objQ = qVar3;
                }
            }
            e2.c.b(rVarF, null, l2VarE, iVarI, null, null, false, null, (e23.l) objQ, o0VarE, 6, 490);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wv0.e(iVar, lVar, lVar2, pVar, qVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    public static final void c(q91.g gVar, aa1.h hVar, fe feVar, e23.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.p pVar, e23.q qVar, e23.a aVar2, p3.m mVar, int i14) {
        q91.g gVar2;
        o0 o0Var;
        gVar.getClass();
        hVar.getClass();
        feVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        pVar.getClass();
        qVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-504138302);
        int i15 = i14 | (o0VarE.k(gVar.ordinal()) ? 4 : 2) | (o0VarE.B(hVar) ? 32 : 16) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar4) ? 8388608 : 4194304) | (o0VarE.r(pVar) ? 67108864 : 33554432) | (o0VarE.r(qVar) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && ((o0VarE.r(aVar2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            gVar2 = gVar;
            int iIndexOf = hVar.f2294f.indexOf(gVar2);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            o0VarE.N(854432874, Integer.valueOf(iIndexOf));
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new q(hVar, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q(hVar, 1);
                    o0VarE.K(objQ);
                }
            }
            h2.b bVarB = h2.o0.b(iIndexOf, (e23.a) objQ, o0VarE, 0, 2);
            o0VarE.g0(false);
            o0Var = o0VarE;
            z02.d.a(hVar.f2289a, z3.f.c(428443677, new vx1.b(hVar, 25, bVarB, lVar), o0VarE), z3.f.c(1160619132, new x91.f(feVar, 4), o0VarE), null, null, z3.f.c(-937821799, new c42.d(hVar, lVar4, aVar2, bVarB, aVar, lVar2, lVar3, pVar, qVar), o0VarE), o0Var, 197040, 24);
        } else {
            gVar2 = gVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.e0(gVar2, hVar, feVar, aVar, lVar, lVar2, lVar3, lVar4, pVar, qVar, aVar2, i14);
        }
    }

    public static final void d(j0 j0Var, aa1.h hVar, p3.m mVar, int i14) {
        z3.e eVar;
        int i15;
        z3.e eVar2;
        i53.c<aa1.g> cVar;
        o0 o0VarE = mVar.E(901364566);
        int i16 = (o0VarE.B(j0Var) ? 4 : 2) | i14 | (o0VarE.B(hVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            o0VarE.C(-1372033682);
            i53.c<q91.g> cVar2 = hVar.f2294f;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
            for (q91.g gVar : cVar2) {
                aa1.i iVar = hVar.f2295g.get(gVar);
                if (iVar == null || (cVar = iVar.f2299a) == null) {
                    eVar = null;
                    i15 = 0;
                } else {
                    if (cVar.isEmpty()) {
                        i15 = 0;
                    } else {
                        i15 = 0;
                        for (aa1.g gVar2 : cVar) {
                            if (gVar2.f2276b || gVar2.f2287m) {
                                i15++;
                                if (i15 < 0) {
                                    x.p();
                                    throw null;
                                }
                            }
                        }
                    }
                    eVar = null;
                }
                String string = context.getString(gVar.f143598b);
                string.getClass();
                if (i15 > 0) {
                    o0VarE.C(-1852318165);
                    z3.e eVarC = z3.f.c(1331817288, new ba2.e(i15, 17), o0VarE);
                    o0VarE.g0(false);
                    eVar2 = eVarC;
                } else {
                    o0VarE.C(-1852013900);
                    o0VarE.g0(false);
                    eVar2 = eVar;
                }
                arrayList.add(new p1(string, null, eVar2, 2, null));
            }
            o0VarE.g0(false);
            g02.t.a(j0Var, b0Var, i53.a.e(arrayList), g6.f.a(f14), o0VarE, i16 & 14, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(j0Var, hVar, i14, 1);
        }
    }
}
