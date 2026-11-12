package k01;

import b11.t;
import b63.o;
import b63.v;
import g01.c0;
import g01.x;
import g01.y;
import g21.f0;
import g21.p;
import g21.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk0.w;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dBq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001a¨\u0006\u001e"}, d2 = {"Lk01/b;", "", "Lb63/o;", "date", "Lb63/v;", "timelineStart", "timelineEnd", "Ll01/e;", "dailyViewType", "Lk01/d;", "nutritionGoals", "Lk01/k;", "nutritionContent", "", "Lg01/y;", "mealDetails", "Lg01/i;", "loggedFoods", "Ll01/h;", "micronutrientsSettings", "<init>", "(Lb63/o;Lb63/v;Lb63/v;Ll01/e;Lk01/d;Lk01/k;Ljava/util/List;Ljava/util/List;Ll01/h;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/o;Lb63/v;Lb63/v;Ll01/e;Lk01/d;Lk01/k;Ljava/util/List;Ljava/util/List;Ll01/h;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f102004j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f102005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f102006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f102007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l01.e f102008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f102009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f102010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<y> f102011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<g01.i> f102012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l01.h f102013i;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/reports/DailyNutritionSummaryDTO.$serializer", "Lm63/e0;", "Lk01/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102014a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f102014a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.reports.DailyNutritionSummaryDTO", aVar, 9);
            m1Var.j("mealDate", false);
            m1Var.j("dayStartTime", false);
            m1Var.j("dayEndTime", false);
            m1Var.j("dailyViewType", true);
            m1Var.j("dailyNutritionGoals", false);
            m1Var.j("dailyNutritionContent", false);
            m1Var.j("mealDetails", false);
            m1Var.j("loggedFoodsWithServingSizes", false);
            m1Var.j("micronutrientsSettings", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = b.f102004j;
            return new i63.c[]{j63.a.d(h63.k.f82304a), j63.a.d(lVarArr[1].getValue()), j63.a.d(lVarArr[2].getValue()), j63.a.d(lVarArr[3].getValue()), j63.a.d(d.a.f102046a), j63.a.d(k.a.f102093a), j63.a.d(lVarArr[6].getValue()), j63.a.d(lVarArr[7].getValue()), j63.a.d(l01.h.a.f107866a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = b.f102004j;
            int i14 = l63.c.f110557a;
            l01.h hVar = null;
            boolean z14 = true;
            List list = null;
            int i15 = 0;
            o oVar = null;
            v vVar = null;
            v vVar2 = null;
            l01.e eVar3 = null;
            d dVar = null;
            k kVar = null;
            List list2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        oVar = (o) cVarC.v(eVar2, 0, h63.k.f82304a, oVar);
                        i15 |= 1;
                        break;
                    case 1:
                        vVar = (v) cVarC.v(eVar2, 1, lVarArr[1].getValue(), vVar);
                        i15 |= 2;
                        break;
                    case 2:
                        vVar2 = (v) cVarC.v(eVar2, 2, lVarArr[2].getValue(), vVar2);
                        i15 |= 4;
                        break;
                    case 3:
                        eVar3 = (l01.e) cVarC.v(eVar2, 3, lVarArr[3].getValue(), eVar3);
                        i15 |= 8;
                        break;
                    case 4:
                        dVar = (d) cVarC.v(eVar2, 4, d.a.f102046a, dVar);
                        i15 |= 16;
                        break;
                    case 5:
                        kVar = (k) cVarC.v(eVar2, 5, k.a.f102093a, kVar);
                        i15 |= 32;
                        break;
                    case 6:
                        list2 = (List) cVarC.v(eVar2, 6, lVarArr[6].getValue(), list2);
                        i15 |= 64;
                        break;
                    case 7:
                        list = (List) cVarC.v(eVar2, 7, lVarArr[7].getValue(), list);
                        i15 |= 128;
                        break;
                    case 8:
                        hVar = (l01.h) cVarC.v(eVar2, 8, l01.h.a.f107866a, hVar);
                        i15 |= 256;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, oVar, vVar, vVar2, eVar3, dVar, kVar, list2, list, hVar, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = b.f102004j;
            h63.k kVar = h63.k.f82304a;
            o oVar = bVar.f102005a;
            l01.h hVar = bVar.f102013i;
            l01.e eVar2 = bVar.f102008d;
            dVarC.d(eVar, 0, kVar, oVar);
            dVarC.d(eVar, 1, lVarArr[1].getValue(), bVar.f102006b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), bVar.f102007c);
            if (dVarC.C(eVar) || eVar2 != null) {
                dVarC.d(eVar, 3, lVarArr[3].getValue(), eVar2);
            }
            dVarC.d(eVar, 4, d.a.f102046a, bVar.f102009e);
            dVarC.d(eVar, 5, k.a.f102093a, bVar.f102010f);
            dVarC.d(eVar, 6, lVarArr[6].getValue(), bVar.f102011g);
            dVarC.d(eVar, 7, lVarArr[7].getValue(), bVar.f102012h);
            if (dVarC.C(eVar) || hVar != null) {
                dVarC.d(eVar, 8, l01.h.a.f107866a, hVar);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f102004j = new o13.l[]{null, m.a(nVar, new w(26)), m.a(nVar, new w(27)), m.a(nVar, new w(28)), null, null, m.a(nVar, new w(29)), m.a(nVar, new k01.a(0)), null};
    }

    public /* synthetic */ b(int i14, o oVar, v vVar, v vVar2, l01.e eVar, d dVar, k kVar, List list, List list2, l01.h hVar, u1 u1Var) {
        if (247 != (i14 & 247)) {
            k1.h(i14, 247, a.f102014a.getF158591b());
            throw null;
        }
        this.f102005a = oVar;
        this.f102006b = vVar;
        this.f102007c = vVar2;
        if ((i14 & 8) == 0) {
            this.f102008d = null;
        } else {
            this.f102008d = eVar;
        }
        this.f102009e = dVar;
        this.f102010f = kVar;
        this.f102011g = list;
        this.f102012h = list2;
        if ((i14 & 256) == 0) {
            this.f102013i = null;
        } else {
            this.f102013i = hVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:148:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:161:0x0317  */
    /* JADX WARN: Code duplicated, block: B:162:0x031d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:99:0x0202  */
    public final g21.h a() {
        i53.c cVarB;
        s21.c cVar;
        v vVar;
        v vVar2;
        i53.c cVarB2;
        l01.h hVar;
        s21.o oVarA0;
        Iterator it;
        v vVar3;
        v vVar4;
        p pVar;
        b11.l lVarB;
        i53.c cVarB3;
        d dVar;
        u uVarB;
        Iterator it3;
        v vVar5;
        b11.e eVar;
        b11.h aVar;
        Object cVar2;
        Object next;
        if (this.f102005a == null) {
            return null;
        }
        List<g01.i> list = this.f102012h;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                b11.e eVarA = ((g01.i) it4.next()).a();
                if (eVarA != null) {
                    arrayList.add(eVarA);
                }
            }
            cVarB = i53.a.j(arrayList);
            if (cVarB == null) {
                cVarB = j53.l.b();
            }
        } else {
            cVarB = j53.l.b();
        }
        i53.c cVar3 = cVarB;
        v vVar6 = this.f102006b;
        if (vVar6 == null) {
            vVar6 = v21.d.f175307k;
        }
        v vVar7 = vVar6;
        v vVar8 = this.f102007c;
        if (vVar8 == null) {
            vVar8 = v21.d.f175308l;
        }
        v vVar9 = vVar8;
        l01.e eVar2 = this.f102008d;
        if (eVar2 == null) {
            cVar = s21.c.TIMELINE;
        } else {
            int i14 = l01.e.b.f107852a[eVar2.ordinal()];
            if (i14 == 1) {
                cVar = s21.c.TIMELINE;
            } else {
                if (i14 != 2) {
                    u0.r();
                    return null;
                }
                cVar = s21.c.CLASSIC;
            }
            if (cVar == null) {
                cVar = s21.c.TIMELINE;
            }
        }
        s21.c cVar4 = cVar;
        d dVar2 = this.f102009e;
        u uVarB2 = dVar2 != null ? dVar2.b() : null;
        k kVar = this.f102010f;
        b11.f fVar = kVar != null ? new b11.f(kVar.f102072a, kVar.f102075d, kVar.f102074c, kVar.f102073b, kVar.f102078g, kVar.f102079h, kVar.f102080i, kVar.f102081j, kVar.f102082k, kVar.f102083l, kVar.f102084m, kVar.f102085n, kVar.f102086o, kVar.f102087p, kVar.f102090s, kVar.f102091t, kVar.f102092u, kVar.f102089r, kVar.f102088q) : new b11.f(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        List<y> list2 = this.f102011g;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                y yVar = (y) it5.next();
                x xVar = yVar.f74288a;
                if (xVar == null || (lVarB = xVar.b()) == null) {
                    it = it5;
                    vVar3 = vVar7;
                    vVar4 = vVar9;
                    pVar = null;
                } else {
                    c0 c0Var = yVar.f74289b;
                    f0 f0Var = c0Var != null ? new f0(c0Var.f74127d, c0Var.f74128e, c0Var.f74130g, c0Var.f74129f) : new f0(null, null, null, null, 15, null);
                    List<i01.k> list3 = yVar.f74291d;
                    if (list3 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (i01.k kVar2 : list3) {
                            if (cVar3 != null) {
                                Iterator<E> it6 = cVar3.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        it3 = it5;
                                        vVar5 = vVar7;
                                        next = null;
                                        break;
                                    }
                                    next = it6.next();
                                    it3 = it5;
                                    String str = ((b11.e) next).f14261a.f14253a;
                                    vVar5 = vVar7;
                                    g01.o oVar = kVar2.f86784f;
                                    if (s.g(str, oVar != null ? oVar.f74228a : null)) {
                                        break;
                                    }
                                    it5 = it3;
                                    vVar7 = vVar5;
                                }
                                eVar = (b11.e) next;
                            } else {
                                it3 = it5;
                                vVar5 = vVar7;
                                eVar = null;
                            }
                            t tVar = eVar != null ? eVar.f14263c : null;
                            g01.o oVar2 = kVar2.f86784f;
                            String str2 = kVar2.f86782d;
                            t tVar2 = tVar;
                            Long l14 = kVar2.f86788j;
                            v vVar10 = kVar2.f86790l;
                            String str3 = kVar2.f86780b;
                            c0 c0Var2 = kVar2.f86785g;
                            i01.i.Companion companion = i01.i.INSTANCE;
                            companion.getClass();
                            v vVar11 = vVar9;
                            if (i01.k.c.f86794a[i01.i.Companion.a(str2).ordinal()] == 1) {
                                b11.f fVarA = c0Var2 != null ? c0Var2.a() : null;
                                if (str3 == null || vVar10 == null || l14 == null || fVarA == null) {
                                    cVar2 = null;
                                } else {
                                    cVar2 = new b11.i.c(str3, oVar2 != null ? oVar2.f74229b : null, vVar10, l14.longValue(), fVarA);
                                }
                            } else {
                                Boolean bool = kVar2.f86787i;
                                Double d14 = kVar2.f86783e;
                                b11.d dVarA = oVar2 != null ? oVar2.a() : null;
                                b11.s sVarB = c0Var2 != null ? c0Var2.b() : null;
                                if (str3 == null || vVar10 == null || d14 == null || l14 == null || dVarA == null || sVarB == null) {
                                    cVar2 = null;
                                } else {
                                    t tVar3 = tVar2 == null ? new t(null, null, null, 7, null) : tVar2;
                                    i01.l lVar = kVar2.f86792n;
                                    int i15 = lVar == null ? -1 : i01.k.c.f86795b[lVar.ordinal()];
                                    if (i15 == -1 || i15 == 1) {
                                        String str4 = kVar2.f86780b;
                                        companion.getClass();
                                        aVar = new b11.i.a(str4, i01.i.Companion.a(str2), kVar2.f86790l, d14.doubleValue(), bool != null ? bool.booleanValue() : false, l14.longValue(), dVarA, sVarB, kVar2.f86791m, tVar3);
                                    } else {
                                        if (i15 != 2) {
                                            u0.r();
                                            return null;
                                        }
                                        String str5 = kVar2.f86780b;
                                        companion.getClass();
                                        aVar = new b11.i.b(str5, i01.i.Companion.a(str2), kVar2.f86790l, d14.doubleValue(), bool != null ? bool.booleanValue() : false, l14.longValue(), dVarA, sVarB, kVar2.f86791m, tVar3);
                                    }
                                    cVar2 = aVar;
                                }
                            }
                            if (cVar2 != null) {
                                arrayList3.add(cVar2);
                            }
                            it5 = it3;
                            vVar7 = vVar5;
                            vVar9 = vVar11;
                        }
                        it = it5;
                        vVar3 = vVar7;
                        vVar4 = vVar9;
                        cVarB3 = i53.a.j(arrayList3);
                        if (cVarB3 == null) {
                        }
                        dVar = yVar.f74290c;
                        if (dVar != null) {
                            uVarB = dVar.b();
                        } else {
                            uVarB = null;
                        }
                        pVar = new p(lVarB, f0Var, uVarB, cVarB3);
                    } else {
                        it = it5;
                        vVar3 = vVar7;
                        vVar4 = vVar9;
                    }
                    cVarB3 = j53.l.b();
                    dVar = yVar.f74290c;
                    if (dVar != null) {
                        uVarB = dVar.b();
                    } else {
                        uVarB = null;
                    }
                    pVar = new p(lVarB, f0Var, uVarB, cVarB3);
                }
                if (pVar != null) {
                    arrayList2.add(pVar);
                }
                it5 = it;
                vVar7 = vVar3;
                vVar9 = vVar4;
            }
            vVar = vVar7;
            vVar2 = vVar9;
            cVarB2 = i53.a.j(arrayList2);
            if (cVarB2 == null) {
            }
            i53.c cVar5 = cVarB2;
            hVar = this.f102013i;
            if (hVar != null) {
                oVarA0 = o72.t.a0(hVar);
            } else {
                oVarA0 = null;
            }
            return new g21.h(this.f102005a, vVar, vVar2, cVar4, uVarB2, fVar, cVar5, cVar3, oVarA0);
        }
        vVar = vVar7;
        vVar2 = vVar9;
        cVarB2 = j53.l.b();
        i53.c cVar6 = cVarB2;
        hVar = this.f102013i;
        if (hVar != null) {
            oVarA0 = o72.t.a0(hVar);
        } else {
            oVarA0 = null;
        }
        return new g21.h(this.f102005a, vVar, vVar2, cVar4, uVarB2, fVar, cVar6, cVar3, oVarA0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f102005a, bVar.f102005a) && s.g(this.f102006b, bVar.f102006b) && s.g(this.f102007c, bVar.f102007c) && this.f102008d == bVar.f102008d && s.g(this.f102009e, bVar.f102009e) && s.g(this.f102010f, bVar.f102010f) && s.g(this.f102011g, bVar.f102011g) && s.g(this.f102012h, bVar.f102012h) && s.g(this.f102013i, bVar.f102013i);
    }

    public final int hashCode() {
        o oVar = this.f102005a;
        int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
        v vVar = this.f102006b;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        v vVar2 = this.f102007c;
        int iHashCode3 = (iHashCode2 + (vVar2 == null ? 0 : vVar2.f16219a.hashCode())) * 31;
        l01.e eVar = this.f102008d;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.f102009e;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        k kVar = this.f102010f;
        int iHashCode6 = (iHashCode5 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<y> list = this.f102011g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<g01.i> list2 = this.f102012h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        l01.h hVar = this.f102013i;
        return iHashCode8 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DailyNutritionSummaryDTO(date=");
        sb3.append(this.f102005a);
        sb3.append(", timelineStart=");
        sb3.append(this.f102006b);
        sb3.append(", timelineEnd=");
        sb3.append(this.f102007c);
        sb3.append(", dailyViewType=");
        sb3.append(this.f102008d);
        sb3.append(", nutritionGoals=");
        sb3.append(this.f102009e);
        sb3.append(", nutritionContent=");
        sb3.append(this.f102010f);
        sb3.append(", mealDetails=");
        n23.j.z(sb3, this.f102011g, ", loggedFoods=", this.f102012h, ", micronutrientsSettings=");
        sb3.append(this.f102013i);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: k01.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk01/b$b;", "", "<init>", "()V", "Li63/c;", "Lk01/b;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f102014a;
        }

        private Companion() {
        }
    }

    public b(o oVar, v vVar, v vVar2, l01.e eVar, d dVar, k kVar, List<y> list, List<g01.i> list2, l01.h hVar) {
        this.f102005a = oVar;
        this.f102006b = vVar;
        this.f102007c = vVar2;
        this.f102008d = eVar;
        this.f102009e = dVar;
        this.f102010f = kVar;
        this.f102011g = list;
        this.f102012h = list2;
        this.f102013i = hVar;
    }

    public /* synthetic */ b(o oVar, v vVar, v vVar2, l01.e eVar, d dVar, k kVar, List list, List list2, l01.h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(oVar, vVar, vVar2, (i14 & 8) != 0 ? null : eVar, dVar, kVar, list, list2, (i14 & 256) != 0 ? null : hVar);
    }
}
