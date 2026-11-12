package w52;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class f1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f182521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f182522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f182523c;

        static {
            int[] iArr = new int[m52.a.values().length];
            try {
                iArr[m52.a.f116650f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.a.f116649e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f182521a = iArr;
            int[] iArr2 = new int[m52.d.values().length];
            try {
                iArr2[m52.d.WARM_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[m52.d.COOL_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[m52.d.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[m52.d.REST.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f182522b = iArr2;
            int[] iArr3 = new int[m52.g.values().length];
            try {
                iArr3[m52.g.HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[m52.g.PACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[m52.g.SWIM_CSS_OFFSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[m52.g.POWER.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[m52.g.POWER_CURVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[m52.g.CADENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[m52.g.SPEED.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            f182523c = iArr3;
        }
    }

    public static final void a(final h4.r rVar, final ArrayList arrayList, final float f14, p3.m mVar, final int i14) {
        int i15;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        p3.o0 o0VarE = mVar.E(1871432799);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.r(arrayList) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (arrayList.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new e23.p() { // from class: w52.e1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = i17;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i18) {
                            case 0:
                                f1.a(rVar, arrayList, f14, mVar2, p3.p0.t(i14 | 1));
                                break;
                            default:
                                f1.a(rVar, arrayList, f14, mVar2, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    c22.t.g();
                    return;
                }
                float fMax = ((c0) it.next()).f182485b;
                while (it.hasNext()) {
                    fMax = Math.max(fMax, ((c0) it.next()).f182485b);
                }
                o0VarE.C(-1144365238);
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                float f15 = 0.0f;
                while (it3.hasNext()) {
                    c0 c0Var = (c0) it3.next();
                    float f16 = f15 + c0Var.f182484a;
                    float fH = m92.i0.h(c0Var.f182485b, 50.0f, fMax, 5.0f, fMax);
                    long j8 = c0Var.f182486c;
                    float f17 = 4;
                    g6.f.a aVar = g6.f.f75994b;
                    arrayList2.add(new m92.k0(f15, f16, fH, 0.0f, j8, 0.0f, 0.0f, w02.b0.g(f17, o0VarE), w02.b0.g(f17, o0VarE), 104, null));
                    f15 = f16 + 1.0f;
                }
                o0VarE.g0(false);
                i53.c cVarE = i53.a.e(arrayList2);
                Float fValueOf = Float.valueOf(125.0f);
                if (fMax >= 125.0d) {
                    fValueOf = null;
                }
                m92.j0.a(rVar, cVarE, fValueOf, f14, gl1.y.Q(o0VarE, R.string.no_data_label), o0VarE, (i16 & 14) | ((i16 << 12) & 3670016));
                p3.x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            pVar = new e23.p() { // from class: w52.e1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = i18;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i19) {
                        case 0:
                            f1.a(rVar, arrayList, f14, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            f1.a(rVar, arrayList, f14, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    public static final void b(final h4.r rVar, final m52.k kVar, final l52.i iVar, final z52.a aVar, p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        Object obj;
        float f14;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d24;
        double power;
        double d25;
        double d26;
        final m52.k kVar2 = kVar;
        kVar2.getClass();
        iVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1920906903);
        int i15 = 2;
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(kVar2.ordinal()) ? 32 : 16) | (o0VarE.B(iVar) ? 256 : 128) | (o0VarE.B(aVar) ? 2048 : 1024);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (kVar2 == m52.k.f116754n || kVar2 == m52.k.f116755o) {
                ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.j0> arrayList = new ArrayList();
                l52.h hVar = l52.h.PRE_ORDER;
                boolean zR = o0VarE.r(arrayList);
                Object objQ = o0VarE.q();
                if (zR) {
                    obj = objQ;
                    bp0.b bVar = new bp0.b(7, arrayList);
                    o0VarE.K(bVar);
                    obj = bVar;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        obj = objQ;
                        bp0.b bVar2 = new bp0.b(7, arrayList);
                        o0VarE.K(bVar2);
                        obj = bVar2;
                    }
                }
                obj = objQ;
                l52.o.b(iVar, hVar, (e23.p) obj);
                o0VarE.C(-844356250);
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                for (com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var : arrayList) {
                    m52.a aVar2 = j0Var.f48227l;
                    int i18 = aVar2 == null ? -1 : a.f182521a[aVar2.ordinal()];
                    if (i18 != i17) {
                        d14 = i18 != i15 ? 5.0d : j0Var.f48229n / ((double) 60);
                        i16 = i16;
                    } else {
                        d14 = (j0Var.f48229n / (kVar2 == m52.k.f116755o ? aVar.c().f202535b : ((double) i17) / aVar.a().f202543b)) / ((double) 60);
                    }
                    float f15 = (float) d14;
                    m52.g gVar = j0Var.f48232q;
                    Double dValueOf = null;
                    Object obj2 = null;
                    com.garmin.android.apps.connectmobile.workouts.data.model.v vVar = null;
                    double d27 = 85.0d;
                    switch (gVar == null ? -1 : a.f182523c[gVar.ordinal()]) {
                        case 1:
                            int i19 = kVar2 == m52.k.f116755o ? aVar.c().f202534a : aVar.a().f202542a;
                            int i24 = j0Var.C;
                            if (i24 > 0) {
                                if (i24 <= 5) {
                                    d27 = (aVar.d(i24 - 1, kVar2) / ((double) i19)) * ((double) 100);
                                }
                            } else if (d(j0Var)) {
                                d27 = (((j0Var.f48233r + j0Var.f48234t) / ((double) 2)) / ((double) i19)) * ((double) 100);
                            }
                            break;
                        case 2:
                            if (kVar2 == m52.k.f116758r) {
                                double d28 = j0Var.f48233r;
                                d15 = (d28 == 0.0d || Double.isNaN(d28)) ? 50.0d : j0Var.f48233r;
                                d16 = aVar.a().f202543b;
                                d27 = d15 / d16;
                            } else if (d(j0Var)) {
                                d27 = (aVar.a().f202543b / (1.0d / ((j0Var.f48233r + j0Var.f48234t) / ((double) 2)))) * ((double) 100);
                            }
                            break;
                        case 3:
                            double d29 = j0Var.f48233r;
                            d15 = (d29 == 0.0d || Double.isNaN(d29)) ? 50.0d : j0Var.f48233r;
                            d16 = aVar.a().f202543b;
                            d27 = d15 / d16;
                            break;
                        case 4:
                            double d34 = kVar2 == m52.k.f116755o ? aVar.c().f202536c : aVar.a().f202544c;
                            PowerZonesDTO f202551f = aVar.getF202551f();
                            int i25 = j0Var.C;
                            if (i25 > 0 && f202551f != null) {
                                switch (i25) {
                                    case 1:
                                        dValueOf = Double.valueOf(((double) (f202551f.f43988c + f202551f.f43989d)) / 2.0d);
                                        break;
                                    case 2:
                                        dValueOf = Double.valueOf(((double) (f202551f.f43989d + f202551f.f43990e)) / 2.0d);
                                        break;
                                    case 3:
                                        dValueOf = Double.valueOf(((double) (f202551f.f43990e + f202551f.f43991f)) / 2.0d);
                                        break;
                                    case 4:
                                        dValueOf = Double.valueOf(((double) (f202551f.f43991f + f202551f.f43992g)) / 2.0d);
                                        break;
                                    case 5:
                                        dValueOf = Double.valueOf(((double) (f202551f.f43992g + f202551f.f43993h)) / 2.0d);
                                        break;
                                    case 6:
                                        dValueOf = Double.valueOf(((double) (f202551f.f43993h + f202551f.f43994i)) / 2.0d);
                                        break;
                                    case 7:
                                        dValueOf = Double.valueOf(f202551f.f43994i);
                                        break;
                                }
                                if (dValueOf != null) {
                                    d27 = (dValueOf.doubleValue() / d34) * 100.0d;
                                }
                            } else if (d(j0Var)) {
                                d17 = j0Var.f48233r;
                                d18 = d34;
                                d19 = j0Var.f48234t;
                                d26 = ((d17 + d19) / ((double) 2)) / d18;
                                d27 = d26 * ((double) 100);
                            }
                            break;
                        case 5:
                            List<com.garmin.android.apps.connectmobile.workouts.data.model.v> listB = aVar.b();
                            if (listB != null) {
                                Iterator<T> it = listB.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        d24 = 100.0d;
                                        if (((com.garmin.android.apps.connectmobile.workouts.data.model.v) next).getDuration() >= j0Var.f48236w) {
                                            obj2 = next;
                                        }
                                    } else {
                                        d24 = 100.0d;
                                    }
                                }
                                vVar = (com.garmin.android.apps.connectmobile.workouts.data.model.v) obj2;
                            } else {
                                d24 = 100.0d;
                            }
                            if (vVar != null && vVar.getPower() > 0) {
                                power = (((double) j0Var.f48237x) / d24) * ((double) vVar.getPower());
                                d25 = aVar.c().f202536c;
                                d26 = power / d25;
                                d27 = d26 * ((double) 100);
                            }
                            break;
                        case 6:
                            if (d(j0Var)) {
                                double d35 = kVar2 == m52.k.f116755o ? aVar.c().f202538e : aVar.a().f202545d;
                                d17 = j0Var.f48233r;
                                d18 = d35;
                                d19 = j0Var.f48234t;
                                d26 = ((d17 + d19) / ((double) 2)) / d18;
                                d27 = d26 * ((double) 100);
                            }
                            break;
                        case 7:
                            if (d(j0Var)) {
                                power = (j0Var.f48233r + j0Var.f48234t) / ((double) 2);
                                d25 = aVar.c().f202535b;
                                d26 = power / d25;
                                d27 = d26 * ((double) 100);
                            }
                            break;
                        default:
                            m52.d dVar = j0Var.f48217c;
                            int i26 = dVar == null ? -1 : a.f182522b[dVar.ordinal()];
                            if (i26 == 1 || i26 == 2 || i26 == 3) {
                                d27 = 70.0d;
                            } else if (i26 == 4) {
                                d27 = 50.0d;
                            }
                            break;
                    }
                    float f16 = (float) (d27 < 50.0d ? 50.0d : d27);
                    x52.e.a aVar3 = x52.e.f189070c;
                    m52.d dVar2 = j0Var.f48217c;
                    aVar3.getClass();
                    arrayList2.add(new c0(f15, f16, n5.a.a(o0VarE, x52.e.a.a(dVar2).f189076b), null));
                    kVar2 = kVar;
                    i16 = i16;
                    i15 = 2;
                    i17 = 1;
                }
                int i27 = i16;
                o0VarE.g0(false);
                int size = arrayList2.size();
                if (size >= 0 && size < 11) {
                    f14 = 4;
                    g6.f.a aVar4 = g6.f.f75994b;
                } else if (11 > size || size >= 51) {
                    f14 = 1;
                    g6.f.a aVar5 = g6.f.f75994b;
                } else {
                    f14 = 2;
                    g6.f.a aVar6 = g6.f.f75994b;
                }
                a(rVar, arrayList2, f14, o0VarE, i27 & 14);
                p3.x1 x1Var2 = p3.n.f135158a;
            } else {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i28 = 0;
                pVar = new e23.p(rVar, kVar2, iVar, aVar, i14, i28) { // from class: w52.d1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f182496a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h4.r f182497b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ m52.k f182498c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ l52.i f182499d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ z52.a f182500e;

                    {
                        this.f182496a = i28;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (this.f182496a) {
                            case 0:
                                ((Integer) obj4).getClass();
                                int iT = p3.p0.t(1);
                                f1.b(this.f182497b, this.f182498c, this.f182499d, this.f182500e, (p3.m) obj3, iT);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                int iT2 = p3.p0.t(1);
                                f1.b(this.f182497b, this.f182498c, this.f182499d, this.f182500e, (p3.m) obj3, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i29 = 1;
            pVar = new e23.p(rVar, kVar, iVar, aVar, i14, i29) { // from class: w52.d1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f182496a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f182497b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m52.k f182498c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ l52.i f182499d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ z52.a f182500e;

                {
                    this.f182496a = i29;
                }

                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    switch (this.f182496a) {
                        case 0:
                            ((Integer) obj4).getClass();
                            int iT = p3.p0.t(1);
                            f1.b(this.f182497b, this.f182498c, this.f182499d, this.f182500e, (p3.m) obj3, iT);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            int iT2 = p3.p0.t(1);
                            f1.b(this.f182497b, this.f182498c, this.f182499d, this.f182500e, (p3.m) obj3, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void c(ArrayList arrayList, l52.i.a aVar) {
        if (((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48217c != m52.d.REPEAT) {
            arrayList.add(aVar.getData());
            return;
        }
        p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
        int i14 = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48219e;
        for (int i15 = 0; i15 < i14; i15++) {
            l52.o.f(aVar, new w02.b(13, m0Var, arrayList));
        }
        if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48221g, Boolean.TRUE) && m0Var.f105804a) {
            p13.d0.G(arrayList);
        }
    }

    public static final boolean d(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        double d14 = j0Var.f48233r;
        if (d14 == 0.0d || Double.isNaN(d14)) {
            return false;
        }
        double d15 = j0Var.f48234t;
        return (d15 == 0.0d || Double.isNaN(d15)) ? false : true;
    }
}
