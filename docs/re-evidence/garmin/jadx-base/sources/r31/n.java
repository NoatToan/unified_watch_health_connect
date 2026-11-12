package r31;

import c2.a0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h2.u;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150050a;

        static {
            int[] iArr = new int[d31.d.values().length];
            try {
                iArr[d31.d.RECORD_ACTIVITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d31.d.VO2MAX_TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f150050a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01df  */
    /* JADX WARN: Code duplicated, block: B:58:0x0237  */
    public static final void a(final a0 a0Var, final k31.a aVar, final e23.l<? super Long, Unit> lVar, final e23.l<? super d31.d, Unit> lVar2, final e23.p<? super Long, ? super d31.d, Unit> pVar, p3.m mVar, final int i14) {
        a0 a0Var2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        o0 o0VarE = mVar.E(-1532604699);
        int i15 = i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int size = aVar.f102607e.size();
            if (aVar.f102607e.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar2 = new e23.p(a0Var, aVar, lVar, lVar2, pVar, i14, i16) { // from class: r31.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f150041a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a0 f150042b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ k31.a f150043c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ e23.l f150044d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.l f150045e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.p f150046f;

                    {
                        this.f150041a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f150041a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(7);
                                n.a(this.f150042b, this.f150043c, this.f150044d, this.f150045e, this.f150046f, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(7);
                                n.a(this.f150042b, this.f150043c, this.f150044d, this.f150045e, this.f150046f, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                h4.r.a aVar2 = h4.r.S;
                h4.r rVarF = x2.f(aVar2, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97920e;
                h4.r rVarC = c2.l.C(rVarF, 0.0f, f14, 0.0f, 0.0f, 13);
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22698h, bVar2, o0VarE, 54);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                String str = aVar.f102604b;
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0Var = j92.f.f97932i;
                x0 x0VarB = d92.c.b(x0Var, o0VarE);
                h4.r rVarA = u2Var.a(aVar2, 1.0f, true);
                bVar.getClass();
                mh.c(str, c2.l.C(rVarA, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                String strQ = y.Q(o0VarE, R.string.see_all_camel_case);
                fVar.getClass();
                x0 x0VarA = x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                d6.h.f57752b.getClass();
                int i17 = d6.h.f57758h;
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(aVar2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                boolean zR = o0VarE.r(aVar) | ((i15 & 896) == 256);
                Object objQ = o0VarE.q();
                p3.m.a aVar4 = p3.m.f135153a;
                if (zR) {
                    objQ = new qn0.f(20, lVar, aVar);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qn0.f(20, lVar, aVar);
                        o0VarE.K(objQ);
                    }
                }
                mh.c(strQ, w.d(rVarC3, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 130044);
                o0VarE.g0(true);
                boolean zK = o0VarE.k(size);
                Object objQ2 = o0VarE.q();
                if (zK) {
                    objQ2 = new a51.c(size, 12);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a51.c(size, 12);
                        o0VarE.K(objQ2);
                    }
                }
                h2.b bVarB = h2.o0.b(0, (e23.a) objQ2, o0VarE, 0, 3);
                bVar.getClass();
                float f16 = eVar.f97918c;
                bVar.getClass();
                u.a(bVarB, x2.x(x2.f(aVar2, 1.0f), null, 3), c2.l.a(f15), null, bVarB.o(), f16, null, null, false, null, null, null, null, z3.f.c(-774779324, new i91.e(aVar, 26, pVar, lVar2), o0VarE), o0VarE, 48, 24576, 16328);
                o0VarE = o0VarE;
                if (size > 1) {
                    o0VarE.C(1976230495);
                    a0Var2 = a0Var;
                    h4.r rVarB = a0Var2.b(aVar2, h4.d.a.f81537o);
                    bVar.getClass();
                    h4.r rVarA2 = c2.l.A(rVarB, f15, 0.0f, 2);
                    bVar.getClass();
                    l02.f.a(bVarB, rVarA2, size, 0, 0L, 0L, j92.b.f97901d.f97902a, 0.0f, null, o0VarE, 0, 952);
                    o0VarE.g0(false);
                } else {
                    a0Var2 = a0Var;
                    o0VarE.C(1976542045);
                    o0VarE.g0(false);
                }
            }
            p2VarI0.f135219d = pVar2;
        }
        a0Var2 = a0Var;
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            final a0 a0Var3 = a0Var2;
            pVar2 = new e23.p(a0Var3, aVar, lVar, lVar2, pVar, i14, i18) { // from class: r31.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f150041a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a0 f150042b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ k31.a f150043c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.l f150044d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.l f150045e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.p f150046f;

                {
                    this.f150041a = i18;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f150041a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(7);
                            n.a(this.f150042b, this.f150043c, this.f150044d, this.f150045e, this.f150046f, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(7);
                            n.a(this.f150042b, this.f150043c, this.f150044d, this.f150045e, this.f150046f, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar2;
        }
    }
}
