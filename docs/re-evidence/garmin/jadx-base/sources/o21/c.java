package o21;

import b63.v;
import ds.e0;
import j23.k;
import j23.l;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.w;
import p13.y;
import p3.c2;
import p3.d0;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lo21/c;", "", "Lb63/v;", "initialTime", "minTime", "maxTime", "", "is24HourFormat", "", "", "amPmStrings", "showMinutes", "<init>", "(Lb63/v;Lb63/v;Lb63/v;Z[Ljava/lang/String;Z)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f128644n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f128645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f128646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f128647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f128648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f128649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f128650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f128651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f128652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f128653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f128654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d0 f128655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f128656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f128657m;

    public c(v vVar, v vVar2, v vVar3, boolean z14, String[] strArr, boolean z15) {
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        strArr.getClass();
        this.f128645a = vVar2;
        this.f128646b = vVar3;
        this.f128647c = z14;
        this.f128648d = strArr;
        this.f128649e = z15;
        this.f128650f = p0.n(t.k(vVar, vVar2, vVar3));
        final int i14 = 0;
        this.f128651g = p0.f(new e23.a(this) { // from class: o21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f128643b;

            {
                this.f128643b = this;
            }

            /* JADX WARN: Code duplicated, block: B:84:0x0186 A[PHI: r2
              0x0186: PHI (r2v8 int) = (r2v6 int), (r2v10 int) binds: [B:86:0x018e, B:82:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                int hour;
                int hour2;
                p pVar;
                int hour3;
                Object obj;
                int i15 = i14;
                int i16 = 12;
                int i17 = 0;
                c cVar = this.f128643b;
                switch (i15) {
                    case 0:
                        boolean z16 = cVar.f128647c;
                        v vVar4 = cVar.f128646b;
                        v vVar5 = cVar.f128645a;
                        if (z16) {
                            return j0.f134944a;
                        }
                        q13.b bVarB = w.b();
                        if (vVar5.f16219a.getHour() < 12 || vVar4.f16219a.getHour() < 12) {
                            bVarB.add(g.AM);
                        }
                        if (vVar5.f16219a.getHour() >= 12 || vVar4.f16219a.getHour() >= 12) {
                            bVarB.add(g.PM);
                        }
                        return w.a(bVarB);
                    case 1:
                        c.a aVar = c.f128644n;
                        List<g> list = (List) cVar.f128651g.getF182175a();
                        ArrayList arrayList = new ArrayList(y.r(list, 10));
                        for (g gVar : list) {
                            g gVar2 = g.AM;
                            String[] strArr2 = cVar.f128648d;
                            arrayList.add(gVar == gVar2 ? strArr2[0] : strArr2[1]);
                        }
                        return i53.a.e(arrayList);
                    case 2:
                        boolean z17 = cVar.f128647c;
                        v vVar6 = cVar.f128646b;
                        v vVar7 = cVar.f128645a;
                        if (z17) {
                            pVar = new p(Integer.valueOf(vVar7.f16219a.getHour()), Integer.valueOf(vVar6.f16219a.getHour()));
                        } else {
                            boolean z18 = cVar.b() == g.AM;
                            int i18 = 11;
                            if (z18) {
                                hour = vVar7.f16219a.getHour();
                                if (hour > 11) {
                                    hour = 11;
                                }
                            } else {
                                hour = vVar7.f16219a.getHour();
                                if (hour < 12) {
                                    hour = 12;
                                }
                            }
                            if (z18) {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 <= 11) {
                                    i18 = hour2;
                                }
                            } else {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 < 12) {
                                    i18 = 12;
                                } else {
                                    i18 = hour2;
                                }
                            }
                            pVar = new p(Integer.valueOf(hour), Integer.valueOf(i18));
                        }
                        l lVar = new l(((Number) pVar.f128594a).intValue(), ((Number) pVar.f128595b).intValue());
                        ArrayList arrayList2 = new ArrayList(y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((k) it).f96801c) {
                            int iNextInt = ((p13.p0) it).nextInt();
                            if (!z17) {
                                if (iNextInt == 0 || iNextInt == 12) {
                                    iNextInt = 12;
                                } else if (iNextInt > 12) {
                                    iNextInt -= 12;
                                }
                            }
                            arrayList2.add(Integer.valueOf(iNextInt));
                        }
                        return i53.a.e(h0.b1(h0.f1(arrayList2)));
                    case 3:
                        boolean z19 = cVar.f128649e;
                        v vVar8 = cVar.f128646b;
                        v vVar9 = cVar.f128645a;
                        if (z19) {
                            return e0.h(cVar.a().f16219a.getHour() == vVar9.f16219a.getHour() ? vVar9.f16219a.getMinute() : 0, cVar.a().f16219a.getHour() == vVar8.f16219a.getHour() ? vVar8.f16219a.getMinute() : 59);
                        }
                        return i53.a.e(j0.f134944a);
                    case 4:
                        c.a aVar2 = c.f128644n;
                        int iIndexOf = ((List) cVar.f128651g.getF182175a()).indexOf(cVar.b());
                        return Integer.valueOf(iIndexOf >= 0 ? iIndexOf : 0);
                    case 5:
                        if (cVar.f128647c) {
                            hour3 = cVar.a().f16219a.getHour();
                        } else {
                            int hour4 = cVar.a().f16219a.getHour();
                            if (hour4 != 0 && hour4 != 12) {
                                i16 = hour4 > 12 ? hour4 - 12 : hour4;
                            }
                            hour3 = i16;
                        }
                        int iIndexOf2 = ((i53.c) cVar.f128653i.getF182175a()).indexOf(Integer.valueOf(hour3));
                        return Integer.valueOf(iIndexOf2 >= 0 ? iIndexOf2 : 0);
                    default:
                        d0 d0Var = cVar.f128654j;
                        if (cVar.f128649e) {
                            Iterator<E> it3 = ((i53.c) d0Var.getF182175a()).iterator();
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (it3.hasNext()) {
                                    int iAbs = Math.abs(((Number) next).intValue() - cVar.a().f16219a.getMinute());
                                    do {
                                        Object next2 = it3.next();
                                        int iAbs2 = Math.abs(((Number) next2).intValue() - cVar.a().f16219a.getMinute());
                                        if (iAbs > iAbs2) {
                                            next = next2;
                                            iAbs = iAbs2;
                                        }
                                    } while (it3.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Integer num = (Integer) obj;
                            int iIndexOf3 = ((i53.c) d0Var.getF182175a()).indexOf(Integer.valueOf(num != null ? num.intValue() : cVar.a().f16219a.getMinute()));
                            if (iIndexOf3 >= 0) {
                                i17 = iIndexOf3;
                            }
                        }
                        return Integer.valueOf(i17);
                }
            }
        });
        final int i15 = 1;
        this.f128652h = p0.f(new e23.a(this) { // from class: o21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f128643b;

            {
                this.f128643b = this;
            }

            /* JADX WARN: Code duplicated, block: B:84:0x0186 A[PHI: r2
              0x0186: PHI (r2v8 int) = (r2v6 int), (r2v10 int) binds: [B:86:0x018e, B:82:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                int hour;
                int hour2;
                p pVar;
                int hour3;
                Object obj;
                int i16 = i15;
                int i17 = 12;
                int i18 = 0;
                c cVar = this.f128643b;
                switch (i16) {
                    case 0:
                        boolean z16 = cVar.f128647c;
                        v vVar4 = cVar.f128646b;
                        v vVar5 = cVar.f128645a;
                        if (z16) {
                            return j0.f134944a;
                        }
                        q13.b bVarB = w.b();
                        if (vVar5.f16219a.getHour() < 12 || vVar4.f16219a.getHour() < 12) {
                            bVarB.add(g.AM);
                        }
                        if (vVar5.f16219a.getHour() >= 12 || vVar4.f16219a.getHour() >= 12) {
                            bVarB.add(g.PM);
                        }
                        return w.a(bVarB);
                    case 1:
                        c.a aVar = c.f128644n;
                        List<g> list = (List) cVar.f128651g.getF182175a();
                        ArrayList arrayList = new ArrayList(y.r(list, 10));
                        for (g gVar : list) {
                            g gVar2 = g.AM;
                            String[] strArr2 = cVar.f128648d;
                            arrayList.add(gVar == gVar2 ? strArr2[0] : strArr2[1]);
                        }
                        return i53.a.e(arrayList);
                    case 2:
                        boolean z17 = cVar.f128647c;
                        v vVar6 = cVar.f128646b;
                        v vVar7 = cVar.f128645a;
                        if (z17) {
                            pVar = new p(Integer.valueOf(vVar7.f16219a.getHour()), Integer.valueOf(vVar6.f16219a.getHour()));
                        } else {
                            boolean z18 = cVar.b() == g.AM;
                            int i19 = 11;
                            if (z18) {
                                hour = vVar7.f16219a.getHour();
                                if (hour > 11) {
                                    hour = 11;
                                }
                            } else {
                                hour = vVar7.f16219a.getHour();
                                if (hour < 12) {
                                    hour = 12;
                                }
                            }
                            if (z18) {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 <= 11) {
                                    i19 = hour2;
                                }
                            } else {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 < 12) {
                                    i19 = 12;
                                } else {
                                    i19 = hour2;
                                }
                            }
                            pVar = new p(Integer.valueOf(hour), Integer.valueOf(i19));
                        }
                        l lVar = new l(((Number) pVar.f128594a).intValue(), ((Number) pVar.f128595b).intValue());
                        ArrayList arrayList2 = new ArrayList(y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((k) it).f96801c) {
                            int iNextInt = ((p13.p0) it).nextInt();
                            if (!z17) {
                                if (iNextInt == 0 || iNextInt == 12) {
                                    iNextInt = 12;
                                } else if (iNextInt > 12) {
                                    iNextInt -= 12;
                                }
                            }
                            arrayList2.add(Integer.valueOf(iNextInt));
                        }
                        return i53.a.e(h0.b1(h0.f1(arrayList2)));
                    case 3:
                        boolean z19 = cVar.f128649e;
                        v vVar8 = cVar.f128646b;
                        v vVar9 = cVar.f128645a;
                        if (z19) {
                            return e0.h(cVar.a().f16219a.getHour() == vVar9.f16219a.getHour() ? vVar9.f16219a.getMinute() : 0, cVar.a().f16219a.getHour() == vVar8.f16219a.getHour() ? vVar8.f16219a.getMinute() : 59);
                        }
                        return i53.a.e(j0.f134944a);
                    case 4:
                        c.a aVar2 = c.f128644n;
                        int iIndexOf = ((List) cVar.f128651g.getF182175a()).indexOf(cVar.b());
                        return Integer.valueOf(iIndexOf >= 0 ? iIndexOf : 0);
                    case 5:
                        if (cVar.f128647c) {
                            hour3 = cVar.a().f16219a.getHour();
                        } else {
                            int hour4 = cVar.a().f16219a.getHour();
                            if (hour4 != 0 && hour4 != 12) {
                                i17 = hour4 > 12 ? hour4 - 12 : hour4;
                            }
                            hour3 = i17;
                        }
                        int iIndexOf2 = ((i53.c) cVar.f128653i.getF182175a()).indexOf(Integer.valueOf(hour3));
                        return Integer.valueOf(iIndexOf2 >= 0 ? iIndexOf2 : 0);
                    default:
                        d0 d0Var = cVar.f128654j;
                        if (cVar.f128649e) {
                            Iterator<E> it3 = ((i53.c) d0Var.getF182175a()).iterator();
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (it3.hasNext()) {
                                    int iAbs = Math.abs(((Number) next).intValue() - cVar.a().f16219a.getMinute());
                                    do {
                                        Object next2 = it3.next();
                                        int iAbs2 = Math.abs(((Number) next2).intValue() - cVar.a().f16219a.getMinute());
                                        if (iAbs > iAbs2) {
                                            next = next2;
                                            iAbs = iAbs2;
                                        }
                                    } while (it3.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Integer num = (Integer) obj;
                            int iIndexOf3 = ((i53.c) d0Var.getF182175a()).indexOf(Integer.valueOf(num != null ? num.intValue() : cVar.a().f16219a.getMinute()));
                            if (iIndexOf3 >= 0) {
                                i18 = iIndexOf3;
                            }
                        }
                        return Integer.valueOf(i18);
                }
            }
        });
        final int i16 = 2;
        this.f128653i = p0.f(new e23.a(this) { // from class: o21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f128643b;

            {
                this.f128643b = this;
            }

            /* JADX WARN: Code duplicated, block: B:84:0x0186 A[PHI: r2
              0x0186: PHI (r2v8 int) = (r2v6 int), (r2v10 int) binds: [B:86:0x018e, B:82:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                int hour;
                int hour2;
                p pVar;
                int hour3;
                Object obj;
                int i17 = i16;
                int i18 = 12;
                int i19 = 0;
                c cVar = this.f128643b;
                switch (i17) {
                    case 0:
                        boolean z16 = cVar.f128647c;
                        v vVar4 = cVar.f128646b;
                        v vVar5 = cVar.f128645a;
                        if (z16) {
                            return j0.f134944a;
                        }
                        q13.b bVarB = w.b();
                        if (vVar5.f16219a.getHour() < 12 || vVar4.f16219a.getHour() < 12) {
                            bVarB.add(g.AM);
                        }
                        if (vVar5.f16219a.getHour() >= 12 || vVar4.f16219a.getHour() >= 12) {
                            bVarB.add(g.PM);
                        }
                        return w.a(bVarB);
                    case 1:
                        c.a aVar = c.f128644n;
                        List<g> list = (List) cVar.f128651g.getF182175a();
                        ArrayList arrayList = new ArrayList(y.r(list, 10));
                        for (g gVar : list) {
                            g gVar2 = g.AM;
                            String[] strArr2 = cVar.f128648d;
                            arrayList.add(gVar == gVar2 ? strArr2[0] : strArr2[1]);
                        }
                        return i53.a.e(arrayList);
                    case 2:
                        boolean z17 = cVar.f128647c;
                        v vVar6 = cVar.f128646b;
                        v vVar7 = cVar.f128645a;
                        if (z17) {
                            pVar = new p(Integer.valueOf(vVar7.f16219a.getHour()), Integer.valueOf(vVar6.f16219a.getHour()));
                        } else {
                            boolean z18 = cVar.b() == g.AM;
                            int i110 = 11;
                            if (z18) {
                                hour = vVar7.f16219a.getHour();
                                if (hour > 11) {
                                    hour = 11;
                                }
                            } else {
                                hour = vVar7.f16219a.getHour();
                                if (hour < 12) {
                                    hour = 12;
                                }
                            }
                            if (z18) {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 <= 11) {
                                    i110 = hour2;
                                }
                            } else {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 < 12) {
                                    i110 = 12;
                                } else {
                                    i110 = hour2;
                                }
                            }
                            pVar = new p(Integer.valueOf(hour), Integer.valueOf(i110));
                        }
                        l lVar = new l(((Number) pVar.f128594a).intValue(), ((Number) pVar.f128595b).intValue());
                        ArrayList arrayList2 = new ArrayList(y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((k) it).f96801c) {
                            int iNextInt = ((p13.p0) it).nextInt();
                            if (!z17) {
                                if (iNextInt == 0 || iNextInt == 12) {
                                    iNextInt = 12;
                                } else if (iNextInt > 12) {
                                    iNextInt -= 12;
                                }
                            }
                            arrayList2.add(Integer.valueOf(iNextInt));
                        }
                        return i53.a.e(h0.b1(h0.f1(arrayList2)));
                    case 3:
                        boolean z19 = cVar.f128649e;
                        v vVar8 = cVar.f128646b;
                        v vVar9 = cVar.f128645a;
                        if (z19) {
                            return e0.h(cVar.a().f16219a.getHour() == vVar9.f16219a.getHour() ? vVar9.f16219a.getMinute() : 0, cVar.a().f16219a.getHour() == vVar8.f16219a.getHour() ? vVar8.f16219a.getMinute() : 59);
                        }
                        return i53.a.e(j0.f134944a);
                    case 4:
                        c.a aVar2 = c.f128644n;
                        int iIndexOf = ((List) cVar.f128651g.getF182175a()).indexOf(cVar.b());
                        return Integer.valueOf(iIndexOf >= 0 ? iIndexOf : 0);
                    case 5:
                        if (cVar.f128647c) {
                            hour3 = cVar.a().f16219a.getHour();
                        } else {
                            int hour4 = cVar.a().f16219a.getHour();
                            if (hour4 != 0 && hour4 != 12) {
                                i18 = hour4 > 12 ? hour4 - 12 : hour4;
                            }
                            hour3 = i18;
                        }
                        int iIndexOf2 = ((i53.c) cVar.f128653i.getF182175a()).indexOf(Integer.valueOf(hour3));
                        return Integer.valueOf(iIndexOf2 >= 0 ? iIndexOf2 : 0);
                    default:
                        d0 d0Var = cVar.f128654j;
                        if (cVar.f128649e) {
                            Iterator<E> it3 = ((i53.c) d0Var.getF182175a()).iterator();
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (it3.hasNext()) {
                                    int iAbs = Math.abs(((Number) next).intValue() - cVar.a().f16219a.getMinute());
                                    do {
                                        Object next2 = it3.next();
                                        int iAbs2 = Math.abs(((Number) next2).intValue() - cVar.a().f16219a.getMinute());
                                        if (iAbs > iAbs2) {
                                            next = next2;
                                            iAbs = iAbs2;
                                        }
                                    } while (it3.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Integer num = (Integer) obj;
                            int iIndexOf3 = ((i53.c) d0Var.getF182175a()).indexOf(Integer.valueOf(num != null ? num.intValue() : cVar.a().f16219a.getMinute()));
                            if (iIndexOf3 >= 0) {
                                i19 = iIndexOf3;
                            }
                        }
                        return Integer.valueOf(i19);
                }
            }
        });
        final int i17 = 3;
        this.f128654j = p0.f(new e23.a(this) { // from class: o21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f128643b;

            {
                this.f128643b = this;
            }

            /* JADX WARN: Code duplicated, block: B:84:0x0186 A[PHI: r2
              0x0186: PHI (r2v8 int) = (r2v6 int), (r2v10 int) binds: [B:86:0x018e, B:82:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                int hour;
                int hour2;
                p pVar;
                int hour3;
                Object obj;
                int i18 = i17;
                int i19 = 12;
                int i110 = 0;
                c cVar = this.f128643b;
                switch (i18) {
                    case 0:
                        boolean z16 = cVar.f128647c;
                        v vVar4 = cVar.f128646b;
                        v vVar5 = cVar.f128645a;
                        if (z16) {
                            return j0.f134944a;
                        }
                        q13.b bVarB = w.b();
                        if (vVar5.f16219a.getHour() < 12 || vVar4.f16219a.getHour() < 12) {
                            bVarB.add(g.AM);
                        }
                        if (vVar5.f16219a.getHour() >= 12 || vVar4.f16219a.getHour() >= 12) {
                            bVarB.add(g.PM);
                        }
                        return w.a(bVarB);
                    case 1:
                        c.a aVar = c.f128644n;
                        List<g> list = (List) cVar.f128651g.getF182175a();
                        ArrayList arrayList = new ArrayList(y.r(list, 10));
                        for (g gVar : list) {
                            g gVar2 = g.AM;
                            String[] strArr2 = cVar.f128648d;
                            arrayList.add(gVar == gVar2 ? strArr2[0] : strArr2[1]);
                        }
                        return i53.a.e(arrayList);
                    case 2:
                        boolean z17 = cVar.f128647c;
                        v vVar6 = cVar.f128646b;
                        v vVar7 = cVar.f128645a;
                        if (z17) {
                            pVar = new p(Integer.valueOf(vVar7.f16219a.getHour()), Integer.valueOf(vVar6.f16219a.getHour()));
                        } else {
                            boolean z18 = cVar.b() == g.AM;
                            int i111 = 11;
                            if (z18) {
                                hour = vVar7.f16219a.getHour();
                                if (hour > 11) {
                                    hour = 11;
                                }
                            } else {
                                hour = vVar7.f16219a.getHour();
                                if (hour < 12) {
                                    hour = 12;
                                }
                            }
                            if (z18) {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 <= 11) {
                                    i111 = hour2;
                                }
                            } else {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 < 12) {
                                    i111 = 12;
                                } else {
                                    i111 = hour2;
                                }
                            }
                            pVar = new p(Integer.valueOf(hour), Integer.valueOf(i111));
                        }
                        l lVar = new l(((Number) pVar.f128594a).intValue(), ((Number) pVar.f128595b).intValue());
                        ArrayList arrayList2 = new ArrayList(y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((k) it).f96801c) {
                            int iNextInt = ((p13.p0) it).nextInt();
                            if (!z17) {
                                if (iNextInt == 0 || iNextInt == 12) {
                                    iNextInt = 12;
                                } else if (iNextInt > 12) {
                                    iNextInt -= 12;
                                }
                            }
                            arrayList2.add(Integer.valueOf(iNextInt));
                        }
                        return i53.a.e(h0.b1(h0.f1(arrayList2)));
                    case 3:
                        boolean z19 = cVar.f128649e;
                        v vVar8 = cVar.f128646b;
                        v vVar9 = cVar.f128645a;
                        if (z19) {
                            return e0.h(cVar.a().f16219a.getHour() == vVar9.f16219a.getHour() ? vVar9.f16219a.getMinute() : 0, cVar.a().f16219a.getHour() == vVar8.f16219a.getHour() ? vVar8.f16219a.getMinute() : 59);
                        }
                        return i53.a.e(j0.f134944a);
                    case 4:
                        c.a aVar2 = c.f128644n;
                        int iIndexOf = ((List) cVar.f128651g.getF182175a()).indexOf(cVar.b());
                        return Integer.valueOf(iIndexOf >= 0 ? iIndexOf : 0);
                    case 5:
                        if (cVar.f128647c) {
                            hour3 = cVar.a().f16219a.getHour();
                        } else {
                            int hour4 = cVar.a().f16219a.getHour();
                            if (hour4 != 0 && hour4 != 12) {
                                i19 = hour4 > 12 ? hour4 - 12 : hour4;
                            }
                            hour3 = i19;
                        }
                        int iIndexOf2 = ((i53.c) cVar.f128653i.getF182175a()).indexOf(Integer.valueOf(hour3));
                        return Integer.valueOf(iIndexOf2 >= 0 ? iIndexOf2 : 0);
                    default:
                        d0 d0Var = cVar.f128654j;
                        if (cVar.f128649e) {
                            Iterator<E> it3 = ((i53.c) d0Var.getF182175a()).iterator();
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (it3.hasNext()) {
                                    int iAbs = Math.abs(((Number) next).intValue() - cVar.a().f16219a.getMinute());
                                    do {
                                        Object next2 = it3.next();
                                        int iAbs2 = Math.abs(((Number) next2).intValue() - cVar.a().f16219a.getMinute());
                                        if (iAbs > iAbs2) {
                                            next = next2;
                                            iAbs = iAbs2;
                                        }
                                    } while (it3.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Integer num = (Integer) obj;
                            int iIndexOf3 = ((i53.c) d0Var.getF182175a()).indexOf(Integer.valueOf(num != null ? num.intValue() : cVar.a().f16219a.getMinute()));
                            if (iIndexOf3 >= 0) {
                                i110 = iIndexOf3;
                            }
                        }
                        return Integer.valueOf(i110);
                }
            }
        });
        final int i18 = 4;
        this.f128655k = p0.f(new e23.a(this) { // from class: o21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f128643b;

            {
                this.f128643b = this;
            }

            /* JADX WARN: Code duplicated, block: B:84:0x0186 A[PHI: r2
              0x0186: PHI (r2v8 int) = (r2v6 int), (r2v10 int) binds: [B:86:0x018e, B:82:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                int hour;
                int hour2;
                p pVar;
                int hour3;
                Object obj;
                int i19 = i18;
                int i110 = 12;
                int i111 = 0;
                c cVar = this.f128643b;
                switch (i19) {
                    case 0:
                        boolean z16 = cVar.f128647c;
                        v vVar4 = cVar.f128646b;
                        v vVar5 = cVar.f128645a;
                        if (z16) {
                            return j0.f134944a;
                        }
                        q13.b bVarB = w.b();
                        if (vVar5.f16219a.getHour() < 12 || vVar4.f16219a.getHour() < 12) {
                            bVarB.add(g.AM);
                        }
                        if (vVar5.f16219a.getHour() >= 12 || vVar4.f16219a.getHour() >= 12) {
                            bVarB.add(g.PM);
                        }
                        return w.a(bVarB);
                    case 1:
                        c.a aVar = c.f128644n;
                        List<g> list = (List) cVar.f128651g.getF182175a();
                        ArrayList arrayList = new ArrayList(y.r(list, 10));
                        for (g gVar : list) {
                            g gVar2 = g.AM;
                            String[] strArr2 = cVar.f128648d;
                            arrayList.add(gVar == gVar2 ? strArr2[0] : strArr2[1]);
                        }
                        return i53.a.e(arrayList);
                    case 2:
                        boolean z17 = cVar.f128647c;
                        v vVar6 = cVar.f128646b;
                        v vVar7 = cVar.f128645a;
                        if (z17) {
                            pVar = new p(Integer.valueOf(vVar7.f16219a.getHour()), Integer.valueOf(vVar6.f16219a.getHour()));
                        } else {
                            boolean z18 = cVar.b() == g.AM;
                            int i112 = 11;
                            if (z18) {
                                hour = vVar7.f16219a.getHour();
                                if (hour > 11) {
                                    hour = 11;
                                }
                            } else {
                                hour = vVar7.f16219a.getHour();
                                if (hour < 12) {
                                    hour = 12;
                                }
                            }
                            if (z18) {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 <= 11) {
                                    i112 = hour2;
                                }
                            } else {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 < 12) {
                                    i112 = 12;
                                } else {
                                    i112 = hour2;
                                }
                            }
                            pVar = new p(Integer.valueOf(hour), Integer.valueOf(i112));
                        }
                        l lVar = new l(((Number) pVar.f128594a).intValue(), ((Number) pVar.f128595b).intValue());
                        ArrayList arrayList2 = new ArrayList(y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((k) it).f96801c) {
                            int iNextInt = ((p13.p0) it).nextInt();
                            if (!z17) {
                                if (iNextInt == 0 || iNextInt == 12) {
                                    iNextInt = 12;
                                } else if (iNextInt > 12) {
                                    iNextInt -= 12;
                                }
                            }
                            arrayList2.add(Integer.valueOf(iNextInt));
                        }
                        return i53.a.e(h0.b1(h0.f1(arrayList2)));
                    case 3:
                        boolean z19 = cVar.f128649e;
                        v vVar8 = cVar.f128646b;
                        v vVar9 = cVar.f128645a;
                        if (z19) {
                            return e0.h(cVar.a().f16219a.getHour() == vVar9.f16219a.getHour() ? vVar9.f16219a.getMinute() : 0, cVar.a().f16219a.getHour() == vVar8.f16219a.getHour() ? vVar8.f16219a.getMinute() : 59);
                        }
                        return i53.a.e(j0.f134944a);
                    case 4:
                        c.a aVar2 = c.f128644n;
                        int iIndexOf = ((List) cVar.f128651g.getF182175a()).indexOf(cVar.b());
                        return Integer.valueOf(iIndexOf >= 0 ? iIndexOf : 0);
                    case 5:
                        if (cVar.f128647c) {
                            hour3 = cVar.a().f16219a.getHour();
                        } else {
                            int hour4 = cVar.a().f16219a.getHour();
                            if (hour4 != 0 && hour4 != 12) {
                                i110 = hour4 > 12 ? hour4 - 12 : hour4;
                            }
                            hour3 = i110;
                        }
                        int iIndexOf2 = ((i53.c) cVar.f128653i.getF182175a()).indexOf(Integer.valueOf(hour3));
                        return Integer.valueOf(iIndexOf2 >= 0 ? iIndexOf2 : 0);
                    default:
                        d0 d0Var = cVar.f128654j;
                        if (cVar.f128649e) {
                            Iterator<E> it3 = ((i53.c) d0Var.getF182175a()).iterator();
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (it3.hasNext()) {
                                    int iAbs = Math.abs(((Number) next).intValue() - cVar.a().f16219a.getMinute());
                                    do {
                                        Object next2 = it3.next();
                                        int iAbs2 = Math.abs(((Number) next2).intValue() - cVar.a().f16219a.getMinute());
                                        if (iAbs > iAbs2) {
                                            next = next2;
                                            iAbs = iAbs2;
                                        }
                                    } while (it3.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Integer num = (Integer) obj;
                            int iIndexOf3 = ((i53.c) d0Var.getF182175a()).indexOf(Integer.valueOf(num != null ? num.intValue() : cVar.a().f16219a.getMinute()));
                            if (iIndexOf3 >= 0) {
                                i111 = iIndexOf3;
                            }
                        }
                        return Integer.valueOf(i111);
                }
            }
        });
        final int i19 = 5;
        this.f128656l = p0.f(new e23.a(this) { // from class: o21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f128643b;

            {
                this.f128643b = this;
            }

            /* JADX WARN: Code duplicated, block: B:84:0x0186 A[PHI: r2
              0x0186: PHI (r2v8 int) = (r2v6 int), (r2v10 int) binds: [B:86:0x018e, B:82:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                int hour;
                int hour2;
                p pVar;
                int hour3;
                Object obj;
                int i110 = i19;
                int i111 = 12;
                int i112 = 0;
                c cVar = this.f128643b;
                switch (i110) {
                    case 0:
                        boolean z16 = cVar.f128647c;
                        v vVar4 = cVar.f128646b;
                        v vVar5 = cVar.f128645a;
                        if (z16) {
                            return j0.f134944a;
                        }
                        q13.b bVarB = w.b();
                        if (vVar5.f16219a.getHour() < 12 || vVar4.f16219a.getHour() < 12) {
                            bVarB.add(g.AM);
                        }
                        if (vVar5.f16219a.getHour() >= 12 || vVar4.f16219a.getHour() >= 12) {
                            bVarB.add(g.PM);
                        }
                        return w.a(bVarB);
                    case 1:
                        c.a aVar = c.f128644n;
                        List<g> list = (List) cVar.f128651g.getF182175a();
                        ArrayList arrayList = new ArrayList(y.r(list, 10));
                        for (g gVar : list) {
                            g gVar2 = g.AM;
                            String[] strArr2 = cVar.f128648d;
                            arrayList.add(gVar == gVar2 ? strArr2[0] : strArr2[1]);
                        }
                        return i53.a.e(arrayList);
                    case 2:
                        boolean z17 = cVar.f128647c;
                        v vVar6 = cVar.f128646b;
                        v vVar7 = cVar.f128645a;
                        if (z17) {
                            pVar = new p(Integer.valueOf(vVar7.f16219a.getHour()), Integer.valueOf(vVar6.f16219a.getHour()));
                        } else {
                            boolean z18 = cVar.b() == g.AM;
                            int i113 = 11;
                            if (z18) {
                                hour = vVar7.f16219a.getHour();
                                if (hour > 11) {
                                    hour = 11;
                                }
                            } else {
                                hour = vVar7.f16219a.getHour();
                                if (hour < 12) {
                                    hour = 12;
                                }
                            }
                            if (z18) {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 <= 11) {
                                    i113 = hour2;
                                }
                            } else {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 < 12) {
                                    i113 = 12;
                                } else {
                                    i113 = hour2;
                                }
                            }
                            pVar = new p(Integer.valueOf(hour), Integer.valueOf(i113));
                        }
                        l lVar = new l(((Number) pVar.f128594a).intValue(), ((Number) pVar.f128595b).intValue());
                        ArrayList arrayList2 = new ArrayList(y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((k) it).f96801c) {
                            int iNextInt = ((p13.p0) it).nextInt();
                            if (!z17) {
                                if (iNextInt == 0 || iNextInt == 12) {
                                    iNextInt = 12;
                                } else if (iNextInt > 12) {
                                    iNextInt -= 12;
                                }
                            }
                            arrayList2.add(Integer.valueOf(iNextInt));
                        }
                        return i53.a.e(h0.b1(h0.f1(arrayList2)));
                    case 3:
                        boolean z19 = cVar.f128649e;
                        v vVar8 = cVar.f128646b;
                        v vVar9 = cVar.f128645a;
                        if (z19) {
                            return e0.h(cVar.a().f16219a.getHour() == vVar9.f16219a.getHour() ? vVar9.f16219a.getMinute() : 0, cVar.a().f16219a.getHour() == vVar8.f16219a.getHour() ? vVar8.f16219a.getMinute() : 59);
                        }
                        return i53.a.e(j0.f134944a);
                    case 4:
                        c.a aVar2 = c.f128644n;
                        int iIndexOf = ((List) cVar.f128651g.getF182175a()).indexOf(cVar.b());
                        return Integer.valueOf(iIndexOf >= 0 ? iIndexOf : 0);
                    case 5:
                        if (cVar.f128647c) {
                            hour3 = cVar.a().f16219a.getHour();
                        } else {
                            int hour4 = cVar.a().f16219a.getHour();
                            if (hour4 != 0 && hour4 != 12) {
                                i111 = hour4 > 12 ? hour4 - 12 : hour4;
                            }
                            hour3 = i111;
                        }
                        int iIndexOf2 = ((i53.c) cVar.f128653i.getF182175a()).indexOf(Integer.valueOf(hour3));
                        return Integer.valueOf(iIndexOf2 >= 0 ? iIndexOf2 : 0);
                    default:
                        d0 d0Var = cVar.f128654j;
                        if (cVar.f128649e) {
                            Iterator<E> it3 = ((i53.c) d0Var.getF182175a()).iterator();
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (it3.hasNext()) {
                                    int iAbs = Math.abs(((Number) next).intValue() - cVar.a().f16219a.getMinute());
                                    do {
                                        Object next2 = it3.next();
                                        int iAbs2 = Math.abs(((Number) next2).intValue() - cVar.a().f16219a.getMinute());
                                        if (iAbs > iAbs2) {
                                            next = next2;
                                            iAbs = iAbs2;
                                        }
                                    } while (it3.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Integer num = (Integer) obj;
                            int iIndexOf3 = ((i53.c) d0Var.getF182175a()).indexOf(Integer.valueOf(num != null ? num.intValue() : cVar.a().f16219a.getMinute()));
                            if (iIndexOf3 >= 0) {
                                i112 = iIndexOf3;
                            }
                        }
                        return Integer.valueOf(i112);
                }
            }
        });
        final int i24 = 6;
        this.f128657m = p0.f(new e23.a(this) { // from class: o21.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f128643b;

            {
                this.f128643b = this;
            }

            /* JADX WARN: Code duplicated, block: B:84:0x0186 A[PHI: r2
              0x0186: PHI (r2v8 int) = (r2v6 int), (r2v10 int) binds: [B:86:0x018e, B:82:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                int hour;
                int hour2;
                p pVar;
                int hour3;
                Object obj;
                int i110 = i24;
                int i111 = 12;
                int i112 = 0;
                c cVar = this.f128643b;
                switch (i110) {
                    case 0:
                        boolean z16 = cVar.f128647c;
                        v vVar4 = cVar.f128646b;
                        v vVar5 = cVar.f128645a;
                        if (z16) {
                            return j0.f134944a;
                        }
                        q13.b bVarB = w.b();
                        if (vVar5.f16219a.getHour() < 12 || vVar4.f16219a.getHour() < 12) {
                            bVarB.add(g.AM);
                        }
                        if (vVar5.f16219a.getHour() >= 12 || vVar4.f16219a.getHour() >= 12) {
                            bVarB.add(g.PM);
                        }
                        return w.a(bVarB);
                    case 1:
                        c.a aVar = c.f128644n;
                        List<g> list = (List) cVar.f128651g.getF182175a();
                        ArrayList arrayList = new ArrayList(y.r(list, 10));
                        for (g gVar : list) {
                            g gVar2 = g.AM;
                            String[] strArr2 = cVar.f128648d;
                            arrayList.add(gVar == gVar2 ? strArr2[0] : strArr2[1]);
                        }
                        return i53.a.e(arrayList);
                    case 2:
                        boolean z17 = cVar.f128647c;
                        v vVar6 = cVar.f128646b;
                        v vVar7 = cVar.f128645a;
                        if (z17) {
                            pVar = new p(Integer.valueOf(vVar7.f16219a.getHour()), Integer.valueOf(vVar6.f16219a.getHour()));
                        } else {
                            boolean z18 = cVar.b() == g.AM;
                            int i113 = 11;
                            if (z18) {
                                hour = vVar7.f16219a.getHour();
                                if (hour > 11) {
                                    hour = 11;
                                }
                            } else {
                                hour = vVar7.f16219a.getHour();
                                if (hour < 12) {
                                    hour = 12;
                                }
                            }
                            if (z18) {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 <= 11) {
                                    i113 = hour2;
                                }
                            } else {
                                hour2 = vVar6.f16219a.getHour();
                                if (hour2 < 12) {
                                    i113 = 12;
                                } else {
                                    i113 = hour2;
                                }
                            }
                            pVar = new p(Integer.valueOf(hour), Integer.valueOf(i113));
                        }
                        l lVar = new l(((Number) pVar.f128594a).intValue(), ((Number) pVar.f128595b).intValue());
                        ArrayList arrayList2 = new ArrayList(y.r(lVar, 10));
                        Iterator<Integer> it = lVar.iterator();
                        while (((k) it).f96801c) {
                            int iNextInt = ((p13.p0) it).nextInt();
                            if (!z17) {
                                if (iNextInt == 0 || iNextInt == 12) {
                                    iNextInt = 12;
                                } else if (iNextInt > 12) {
                                    iNextInt -= 12;
                                }
                            }
                            arrayList2.add(Integer.valueOf(iNextInt));
                        }
                        return i53.a.e(h0.b1(h0.f1(arrayList2)));
                    case 3:
                        boolean z19 = cVar.f128649e;
                        v vVar8 = cVar.f128646b;
                        v vVar9 = cVar.f128645a;
                        if (z19) {
                            return e0.h(cVar.a().f16219a.getHour() == vVar9.f16219a.getHour() ? vVar9.f16219a.getMinute() : 0, cVar.a().f16219a.getHour() == vVar8.f16219a.getHour() ? vVar8.f16219a.getMinute() : 59);
                        }
                        return i53.a.e(j0.f134944a);
                    case 4:
                        c.a aVar2 = c.f128644n;
                        int iIndexOf = ((List) cVar.f128651g.getF182175a()).indexOf(cVar.b());
                        return Integer.valueOf(iIndexOf >= 0 ? iIndexOf : 0);
                    case 5:
                        if (cVar.f128647c) {
                            hour3 = cVar.a().f16219a.getHour();
                        } else {
                            int hour4 = cVar.a().f16219a.getHour();
                            if (hour4 != 0 && hour4 != 12) {
                                i111 = hour4 > 12 ? hour4 - 12 : hour4;
                            }
                            hour3 = i111;
                        }
                        int iIndexOf2 = ((i53.c) cVar.f128653i.getF182175a()).indexOf(Integer.valueOf(hour3));
                        return Integer.valueOf(iIndexOf2 >= 0 ? iIndexOf2 : 0);
                    default:
                        d0 d0Var = cVar.f128654j;
                        if (cVar.f128649e) {
                            Iterator<E> it3 = ((i53.c) d0Var.getF182175a()).iterator();
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (it3.hasNext()) {
                                    int iAbs = Math.abs(((Number) next).intValue() - cVar.a().f16219a.getMinute());
                                    do {
                                        Object next2 = it3.next();
                                        int iAbs2 = Math.abs(((Number) next2).intValue() - cVar.a().f16219a.getMinute());
                                        if (iAbs > iAbs2) {
                                            next = next2;
                                            iAbs = iAbs2;
                                        }
                                    } while (it3.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Integer num = (Integer) obj;
                            int iIndexOf3 = ((i53.c) d0Var.getF182175a()).indexOf(Integer.valueOf(num != null ? num.intValue() : cVar.a().f16219a.getMinute()));
                            if (iIndexOf3 >= 0) {
                                i112 = iIndexOf3;
                            }
                        }
                        return Integer.valueOf(i112);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v a() {
        return (v) this.f128650f.getF182175a();
    }

    public final g b() {
        return a().f16219a.getHour() < 12 ? g.AM : g.PM;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo21/c$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public c(v vVar, v vVar2, v vVar3, boolean z14, String[] strArr, boolean z15, int i14, j jVar) {
        this(vVar, (i14 & 2) != 0 ? v21.d.f175318v : vVar2, (i14 & 4) != 0 ? v21.d.f175319w : vVar3, z14, strArr, (i14 & 32) != 0 ? false : z15);
    }
}
