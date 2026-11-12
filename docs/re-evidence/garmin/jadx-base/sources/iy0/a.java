package iy0;

import am.x0;
import android.content.Context;
import android.graphics.Shader;
import c22.c3;
import c22.g2;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import o53.f0;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.p0;
import p13.w;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0010B;\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Liy0/a;", "Lqz/c;", "", "Liy0/i;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lam/x0;", "activityTypeOrder", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Liy0/h;", "colorMapping", "<init>", "(Landroid/content/Context;Ljava/util/List;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;)V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<List<? extends i>, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<x0> f95775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f95776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDate f95777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<h> f95778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f95779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yz.j f95780g;

    static {
        new C1833a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, List<? extends x0> list, LocalDate localDate, LocalDate localDate2, List<h> list2) {
        context.getClass();
        list.getClass();
        localDate.getClass();
        localDate2.getClass();
        list2.getClass();
        this.f95774a = context;
        this.f95775b = list;
        this.f95776c = localDate;
        this.f95777d = localDate2;
        this.f95778e = list2;
        this.f95779f = f0.I(localDate, jg.b.J(localDate2)).c() > 28;
        this.f95780g = new yz.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final List<BarDataSet> a(List<? extends i> list) {
        Iterable iterableC;
        LocalDate localDate;
        boolean z14;
        Float f14;
        String strA;
        List<? extends i> list2 = list;
        if (list2 == null || list2.isEmpty() || this.f95775b.isEmpty()) {
            iterableC = j0.f134944a;
        } else {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = list2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                localDate = this.f95776c;
                z14 = this.f95779f;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                i iVar = (i) next;
                Integer numValueOf = Integer.valueOf(z14 ? Weeks.weeksBetween(localDate, g22.l.h(iVar.f95804b)).getWeeks() : Days.daysBetween(localDate, g22.l.h(iVar.f95804b)).getDays());
                Object arrayList2 = linkedHashMap.get(numValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList2);
                }
                ((List) arrayList2).add(next);
            }
            LocalDate localDate2 = this.f95777d;
            j23.l lVarO = t.o(0, z14 ? Weeks.weeksBetween(localDate, localDate2).getWeeks() + 1 : u0.e(localDate, localDate2, 1));
            ArrayList arrayList3 = new ArrayList(y.r(lVarO, 10));
            Iterator<Integer> it3 = lVarO.iterator();
            while (((j23.k) it3).f96801c) {
                int iNextInt = ((p0) it3).nextInt();
                Iterable iterable = (List) linkedHashMap.get(Integer.valueOf(iNextInt));
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                b bVar = new b(iterable);
                float f15 = 0.0f;
                Float fValueOf = Float.valueOf(0.0f);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Iterator it4 = bVar.f95781a.iterator(); it4.hasNext(); it4 = it4) {
                    i iVar2 = (i) it4.next();
                    x0 x0Var = iVar2.f95803a;
                    Object obj = linkedHashMap2.get(x0Var);
                    if (obj == null && !linkedHashMap2.containsKey(x0Var)) {
                        obj = fValueOf;
                    }
                    linkedHashMap2.put(x0Var, Float.valueOf(((Number) obj).floatValue() + iVar2.f95805c));
                    f15 = f15;
                }
                float f16 = f15;
                List<h> list3 = this.f95778e;
                ArrayList arrayList4 = new ArrayList(y.r(list3, 10));
                for (h hVar : list3) {
                    int i14 = hVar.f95800a;
                    Float f17 = (Float) linkedHashMap2.get(hVar.f95801b);
                    arrayList4.add(new o13.p(Float.valueOf(f17 != null ? f17.floatValue() : f16), Integer.valueOf(i14)));
                }
                List listN0 = h0.N0(arrayList4, new c());
                ArrayList arrayList5 = new ArrayList(y.r(listN0, 10));
                Iterator it5 = listN0.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(Integer.valueOf(((Number) ((o13.p) it5.next()).f128595b).intValue()));
                }
                arrayList.addAll(arrayList5);
                ArrayList arrayList6 = new ArrayList(y.r(listN0, 10));
                Iterator it6 = listN0.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(Float.valueOf(((Number) ((o13.p) it6.next()).f128594a).floatValue()));
                }
                BarEntry barEntry = new BarEntry(iNextInt, h0.Y0(arrayList6));
                LocalDate localDatePlusWeeks = z14 ? localDate.plusWeeks(iNextInt) : localDate.plusDays(iNextInt);
                c22.j0 j0Var = c22.j0.f23099a;
                localDatePlusWeeks.getClass();
                j0Var.getClass();
                String strL = c22.j0.l(localDatePlusWeeks);
                ArrayList arrayList7 = new ArrayList();
                for (h hVar2 : list3) {
                    x0 x0Var2 = hVar2.f95801b;
                    zz.l lVar = null;
                    if (x0Var2 != null && (f14 = (Float) linkedHashMap2.get(x0Var2)) != null) {
                        if (f14.floatValue() <= f16) {
                            f14 = null;
                        }
                        if (f14 != null) {
                            String formattedValue = this.f95780g.getFormattedValue(f14.floatValue());
                            if (x0Var2 == x0.F) {
                                c22.x0.f23314a.getClass();
                                String str = c22.x0.O9;
                                str.getClass();
                                strA = g2.f(str);
                            } else {
                                strA = dh.b.A(this.f95774a, x0Var2.f4360c);
                            }
                            lVar = new zz.l(strL, formattedValue, strA, null, null, Integer.valueOf(hVar2.f95802c), null, null, 216, null);
                        }
                    }
                    if (lVar != null) {
                        arrayList7.add(lVar);
                    }
                }
                barEntry.setData(arrayList7);
                arrayList3.add(barEntry);
            }
            BarDataSet barDataSet = new BarDataSet(arrayList3, "");
            barDataSet.setColors(arrayList);
            barDataSet.setDrawValues(false);
            iterableC = w.c(barDataSet);
        }
        return h0.Z(iterableC);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(List<? extends i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends i> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends i> list) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends i> list) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float i(List<? extends i> list) {
        o13.p pVar;
        o13.p pVar2;
        double d14;
        double dCeil;
        LinkedHashMap linkedHashMap;
        List<? extends i> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            pVar = null;
        } else {
            Iterator<T> it = list2.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return 0.0f;
            }
            double epochDay = ((i) it.next()).f95804b.f16206a.toEpochDay();
            while (it.hasNext()) {
                epochDay = Math.min(epochDay, ((i) it.next()).f95804b.f16206a.toEpochDay());
            }
            Iterator<T> it3 = list2.iterator();
            if (!it3.hasNext()) {
                c22.t.g();
                return 0.0f;
            }
            double epochDay2 = ((i) it3.next()).f95804b.f16206a.toEpochDay();
            while (it3.hasNext()) {
                epochDay2 = Math.max(epochDay2, ((i) it3.next()).f95804b.f16206a.toEpochDay());
            }
            if (this.f95779f) {
                linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    Float fValueOf = Float.valueOf(Weeks.weeksBetween(this.f95776c, g22.l.h(((i) obj).f95804b)).getWeeks());
                    Object arrayList = linkedHashMap.get(fValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(fValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
            } else {
                linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list2) {
                    b63.o oVar = ((i) obj2).f95804b;
                    Object arrayList2 = linkedHashMap.get(oVar);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(oVar, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
            }
            Iterator it4 = linkedHashMap.values().iterator();
            if (!it4.hasNext()) {
                c22.t.g();
                return 0.0f;
            }
            Iterator it5 = ((List) it4.next()).iterator();
            long j8 = 0;
            while (it5.hasNext()) {
                j8 += ((i) it5.next()).f95805c;
            }
            double dMax = j8;
            while (it4.hasNext()) {
                Iterator it6 = ((List) it4.next()).iterator();
                long j14 = 0;
                while (it6.hasNext()) {
                    j14 += ((i) it6.next()).f95805c;
                }
                dMax = Math.max(dMax, j14);
            }
            pVar = new o13.p(new o13.p(Double.valueOf(epochDay), Double.valueOf(epochDay2)), new o13.p(Double.valueOf(0.0d), Double.valueOf(dMax)));
        }
        if (pVar == null || (pVar2 = (o13.p) pVar.f128595b) == null) {
            return -1.0f;
        }
        double dDoubleValue = ((Number) pVar2.f128595b).doubleValue();
        if (dDoubleValue > 3600.0d) {
            d14 = 1800.0d;
            dCeil = Math.ceil(dDoubleValue / 1800.0d);
        } else {
            d14 = 600.0d;
            dCeil = Math.ceil(dDoubleValue / 600.0d);
        }
        return (float) (dCeil * d14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends i> list) {
        return 4;
    }

    @Override // qz.c
    public final boolean l() {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends i> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(List<? extends i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends i> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends i> list) {
        LocalDate localDate = this.f95777d;
        boolean z14 = this.f95779f;
        LocalDate localDate2 = this.f95776c;
        return (z14 ? Weeks.weeksBetween(localDate2, localDate).getWeeks() : Days.daysBetween(localDate2, localDate).getDays()) + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(List<? extends i> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(List<? extends i> list) {
        String strA;
        c3 c3Var;
        ArrayList<h> arrayList = new ArrayList();
        for (Object obj : this.f95778e) {
            if (((h) obj).f95801b != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        for (h hVar : arrayList) {
            x0 x0Var = hVar.f95801b;
            if (x0Var == x0.F) {
                c22.x0.f23314a.getClass();
                String str = c22.x0.O9;
                str.getClass();
                strA = g2.f(str);
            } else {
                strA = (x0Var == null || (c3Var = x0Var.f4360c) == null) ? "" : dh.b.A(this.f95774a, c3Var);
            }
            arrayList2.add(new xz.f(strA, null, Integer.valueOf(hVar.f95800a), null, xz.g.a.f192745a, null, null, 106, null));
        }
        return arrayList2;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends i> list) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: iy0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Liy0/a$a;", "", "<init>", "()V", "", "SECONDS_PER_HOUR", "D", "SECONDS_PER_HALF_HOUR", "SECONDS_PER_TEN_MINUTES", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1833a {
        public /* synthetic */ C1833a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1833a() {
        }
    }
}
