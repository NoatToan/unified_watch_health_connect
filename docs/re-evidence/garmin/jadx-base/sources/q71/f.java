package q71;

import android.content.Context;
import b63.o;
import c22.j0;
import g22.k;
import g22.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m92.h0;
import n23.j;
import o61.p;
import o61.q;
import o82.g;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;
import p005kotlin.Metadata;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143246a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130851d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130853f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f130854g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f143246a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DateTime f143247a;

        public b(DateTime dateTime) {
            this.f143247a = dateTime;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            DateTime dateTimeAtStartOfDay;
            LocalDate localDateB;
            DateTime dateTimeAtStartOfDay2;
            LocalDate localDateB2;
            q qVar = (q) t7;
            DateTime dateTime = this.f143247a;
            if (qVar == null || (localDateB2 = qVar.b()) == null || (dateTimeAtStartOfDay = localDateB2.toDateTimeAtStartOfDay()) == null) {
                dateTimeAtStartOfDay = dateTime;
            }
            q qVar2 = (q) t14;
            if (qVar2 != null && (localDateB = qVar2.b()) != null && (dateTimeAtStartOfDay2 = localDateB.toDateTimeAtStartOfDay()) != null) {
                dateTime = dateTimeAtStartOfDay2;
            }
            return r13.a.b(dateTimeAtStartOfDay, dateTime);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Float.valueOf(((h0.e.a) t7).f117346a), Float.valueOf(((h0.e.a) t14).f117346a));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Float.valueOf(((q71.b) t7).f143230a), Float.valueOf(((q71.b) t14).f143230a));
        }
    }

    public static final q71.d a(List<p> list, Context context, o82.a aVar) {
        g gVar;
        ArrayList arrayListC;
        o13.p pVar;
        DateTime dateTimeAtStartOfDay;
        o oVar;
        LocalDate localDateB;
        LocalDate localDateB2;
        list.getClass();
        context.getClass();
        aVar.getClass();
        o oVar2 = aVar.f130843a;
        DateTime dateTimeAtStartOfDay2 = l.h(oVar2).toDateTimeAtStartOfDay();
        o oVar3 = aVar.f130844b;
        DateTime dateTimeAtStartOfDay3 = l.h(oVar3).toDateTimeAtStartOfDay();
        boolean z14 = true;
        int weeks = Weeks.weeksBetween(dateTimeAtStartOfDay2, dateTimeAtStartOfDay3).getWeeks() + 1;
        if (weeks == 1) {
            gVar = g.f130851d;
        } else if (weeks != 4) {
            gVar = weeks != 12 ? g.f130855h : g.f130854g;
        } else {
            gVar = g.f130853f;
        }
        g gVar2 = gVar;
        pi0.e eVar = new pi0.e(context);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i14 = a.f143246a[gVar2.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                int days = Days.daysBetween(dateTimeAtStartOfDay2.toLocalDate(), dateTimeAtStartOfDay3.toLocalDate()).getDays() + 1;
                ArrayList arrayList = new ArrayList(days);
                for (int i15 = 0; i15 < days; i15++) {
                    j0 j0Var = j0.f23099a;
                    DateTime dateTimePlusDays = dateTimeAtStartOfDay2.plusDays(i15);
                    j0Var.getClass();
                    arrayList.add(j0.k(dateTimePlusDays, 'S'));
                }
                arrayListC = arrayList;
            } else if (i14 != 3) {
                fz.a aVar2 = fz.a.f73959a;
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay3.getClass();
                aVar2.getClass();
                arrayListC = fz.a.c(dateTimeAtStartOfDay2, dateTimeAtStartOfDay3, 6, false, null);
            } else {
                fz.a aVar3 = fz.a.f73959a;
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay3.getClass();
                aVar3.getClass();
                arrayListC = fz.a.c(dateTimeAtStartOfDay2, dateTimeAtStartOfDay3, 12, true, null);
            }
        } else {
            fz.a aVar4 = fz.a.f73959a;
            dateTimeAtStartOfDay2.getClass();
            dateTimeAtStartOfDay3.getClass();
            aVar4.getClass();
            arrayListC = fz.a.c(dateTimeAtStartOfDay2, dateTimeAtStartOfDay3, 7, true, null);
        }
        i53.c cVarE = i53.a.e(arrayListC);
        w13.c cVar = e.f143243g;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            e eVar2 = (e) bVarN.next();
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((p) it.next()).c(eVar2));
                z14 = z14;
            }
            boolean z15 = z14;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                q qVar = (q) obj;
                if (qVar == null || (localDateB = qVar.b()) == null) {
                    oVar = oVar3;
                } else {
                    oVar = oVar3;
                    if (!localDateB.isBefore(l.h(oVar2)) && (localDateB2 = qVar.b()) != null && !localDateB2.isAfter(l.h(oVar))) {
                        arrayList3.add(obj);
                    }
                }
                oVar3 = oVar;
            }
            o oVar4 = oVar3;
            Iterator it3 = p13.h0.N0(arrayList3, new b(dateTimeAtStartOfDay2)).iterator();
            while (it3.hasNext()) {
                q qVar2 = (q) it3.next();
                if (qVar2 != null) {
                    LocalDate localDateB3 = qVar2.b();
                    if (localDateB3 == null || (dateTimeAtStartOfDay = localDateB3.toDateTimeAtStartOfDay()) == null) {
                        dateTimeAtStartOfDay = dateTimeAtStartOfDay2;
                    }
                    List arrayList4 = (List) linkedHashMap.get(eVar2);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(eVar2, arrayList4);
                    }
                    List arrayList5 = (List) linkedHashMap2.get(eVar2);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap2.put(eVar2, arrayList5);
                    }
                    dateTimeAtStartOfDay2.getClass();
                    dateTimeAtStartOfDay.getClass();
                    float fA = k.a(dateTimeAtStartOfDay2, dateTimeAtStartOfDay);
                    arrayList4.add(new h0.e.a(fA, (float) qVar2.getVo2MaxPreciseValue()));
                    arrayList5.add(new q71.b(fA, String.valueOf((int) qVar2.getVo2MaxValue()), eVar.a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_DAY)));
                }
                it3 = it3;
                oVar2 = oVar2;
                bVarN = bVarN;
            }
            z14 = z15;
            oVar3 = oVar4;
        }
        w13.c cVar2 = e.f143243g;
        ArrayList arrayListK = j.k(cVar2);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            e eVar3 = (e) bVar.next();
            List list2 = (List) linkedHashMap.get(eVar3);
            if (list2 != null) {
                i53.c cVarE2 = i53.a.e(p13.h0.N0(list2, new c()));
                Iterable iterable = (List) linkedHashMap2.get(eVar3);
                if (iterable == null) {
                    iterable = p13.j0.f134944a;
                }
                i53.c cVarE3 = i53.a.e(p13.h0.N0(iterable, new d()));
                dateTimeAtStartOfDay2.getClass();
                dateTimeAtStartOfDay3.getClass();
                pVar = new o13.p(eVar3, new q71.c(cVarE2, cVarE3, cVarE, gVar2, Float.valueOf(k.a(dateTimeAtStartOfDay2, dateTimeAtStartOfDay3) + 1)));
            } else {
                pVar = null;
            }
            if (pVar != null) {
                arrayListK.add(pVar);
            }
        }
        return new q71.d(i53.a.g(u0.l(arrayListK)));
    }
}
