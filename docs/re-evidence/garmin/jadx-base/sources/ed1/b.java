package ed1;

import android.content.Context;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import fd1.d;
import fd1.e;
import g22.k;
import g22.l;
import i53.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m92.h0;
import o13.p;
import o82.g;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.d0;
import p13.u0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Led1/b;", "", "<init>", "()V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f63874a = new b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63875a;

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
            f63875a = iArr;
        }
    }

    private b() {
    }

    public static d a(r61.a aVar) {
        aVar.getClass();
        String calendarDate = aVar.getCalendarDate();
        return new d(calendarDate != null ? j0.M(calendarDate) : null, aVar.getAvg5KTime(), aVar.getAvg10KTime(), aVar.getAvgHalfMarathonTime(), aVar.getAvgMarathonTime());
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0322  */
    public static e b(c cVar, Context context, o82.a aVar, boolean z14) {
        g gVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        String strK;
        p pVar;
        Iterator it;
        Object next;
        Float fValueOf;
        fd1.a aVar2;
        h0.e.a next2;
        boolean z15 = z14;
        cVar.getClass();
        context.getClass();
        aVar.getClass();
        DateTime dateTimeAtStartOfDay = l.h(aVar.f130843a).toDateTimeAtStartOfDay();
        DateTime dateTimeAtStartOfDay2 = l.h(aVar.f130844b).toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        dateTimeAtStartOfDay2.getClass();
        int i14 = 27;
        if (k.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay2) == 6) {
            gVar = g.f130851d;
        } else if (k.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay2) == 27) {
            gVar = g.f130853f;
        } else {
            gVar = Months.monthsBetween(dateTimeAtStartOfDay, dateTimeAtStartOfDay2).getMonths() == 5 ? g.f130858k : g.f130859l;
        }
        g gVar2 = gVar;
        ArrayList arrayList3 = new ArrayList();
        Iterator<E> it3 = cVar.iterator();
        while (it3.hasNext()) {
            d dVar = (d) it3.next();
            Double dC = dVar.c(ad1.b.f2758f, z15);
            Float fValueOf2 = dC != null ? Float.valueOf((float) dC.doubleValue()) : null;
            Double dC2 = dVar.c(ad1.b.f2759g, z15);
            Float fValueOf3 = dC2 != null ? Float.valueOf((float) dC2.doubleValue()) : null;
            Double dC3 = dVar.c(ad1.b.f2760h, z15);
            Float fValueOf4 = dC3 != null ? Float.valueOf((float) dC3.doubleValue()) : null;
            Double dC4 = dVar.c(ad1.b.f2761i, z15);
            d0.v(arrayList3, x.k(fValueOf2, fValueOf3, fValueOf4, dC4 != null ? Float.valueOf((float) dC4.doubleValue()) : null));
        }
        ArrayList arrayListZ = p13.h0.Z(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayListZ) {
            float fFloatValue = ((Number) obj).floatValue();
            if (!Float.isNaN(fFloatValue) && fFloatValue > 0.0f) {
                arrayList4.add(obj);
            }
        }
        ad1.a.f2756a.getClass();
        List<ad1.b> list = ad1.a.f2757b;
        ArrayList arrayList5 = new ArrayList(y.r(list, 10));
        Iterator<T> it4 = list.iterator();
        while (true) {
            int i15 = 2;
            int i16 = 1;
            if (!it4.hasNext()) {
                break;
            }
            ad1.b bVar = (ad1.b) it4.next();
            ArrayList arrayList6 = new ArrayList();
            Iterator<E> it5 = cVar.iterator();
            while (it5.hasNext()) {
                int i17 = i14;
                d dVar2 = (d) it5.next();
                DateTime dateTime = dVar2.f70483a;
                if (dateTime == null) {
                    dateTime = dateTimeAtStartOfDay;
                }
                int i18 = a.f63875a[gVar2.ordinal()];
                int iA = (i18 == i16 || i18 == i15) ? k.a(dateTimeAtStartOfDay, dateTime) : Months.monthsBetween(dateTimeAtStartOfDay, dateTime).getMonths();
                Double dC5 = dVar2.c(bVar, z15);
                if (!zf.b.D(dC5) || dC5.doubleValue() <= 0.0d) {
                    dC5 = null;
                }
                h0.e.a aVar3 = dC5 != null ? new h0.e.a(iA, (float) dC5.doubleValue()) : null;
                if (aVar3 != null) {
                    arrayList6.add(aVar3);
                }
                i14 = i17;
                i15 = 2;
                i16 = 1;
            }
            arrayList5.add(new fd1.c(bVar, i53.a.e(arrayList6)));
            i14 = i14;
        }
        int i19 = i14;
        c cVarE = i53.a.e(arrayList5);
        int i24 = a.f63875a[gVar2.ordinal()];
        int i25 = 0;
        if (i24 == 1 || i24 == 2) {
            k.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
            int iA2 = k.a(dateTimeAtStartOfDay, dateTimeAtStartOfDay2) + 1;
            arrayList = new ArrayList(iA2);
            for (int i26 = 0; i26 < iA2; i26++) {
                arrayList.add(dateTimeAtStartOfDay.plusDays(i26));
            }
        } else {
            int months = Months.monthsBetween(dateTimeAtStartOfDay, dateTimeAtStartOfDay2).getMonths() + 1;
            arrayList = new ArrayList(months);
            for (int i27 = 0; i27 < months; i27++) {
                j0 j0Var = j0.f23099a;
                DateTime dateTimePlusMonths = dateTimeAtStartOfDay.plusMonths(i27);
                dateTimePlusMonths.getClass();
                j0Var.getClass();
                DateTime dateTimeQ = j0.Q(dateTimePlusMonths);
                if (!dateTimeQ.isBeforeNow()) {
                    dateTimeQ = DateTime.now();
                }
                arrayList.add(dateTimeQ);
            }
        }
        c<DateTime> cVarE2 = i53.a.e(arrayList);
        int i28 = a.f63875a[gVar2.ordinal()];
        if (i28 == 1 || i28 == 2) {
            arrayList2 = new ArrayList(y.r(cVarE2, 10));
            int i29 = 0;
            for (Object obj2 : cVarE2) {
                int i30 = i29 + 1;
                if (i29 < 0) {
                    x.q();
                    throw null;
                }
                DateTime dateTime2 = (DateTime) obj2;
                if (x.k(0, Integer.valueOf(i19)).contains(Integer.valueOf(i29))) {
                    j0.f23099a.getClass();
                    strK = j0.k(dateTime2, 'M');
                } else {
                    strK = "";
                }
                arrayList2.add(strK);
                i29 = i30;
            }
        } else {
            arrayList2 = new ArrayList(y.r(cVarE2, 10));
            for (DateTime dateTime3 : cVarE2) {
                j0.f23099a.getClass();
                arrayList2.add(j0.k(dateTime3, 'M'));
            }
        }
        c cVarE3 = i53.a.e(arrayList2);
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = cVarE2.iterator();
        while (it6.hasNext()) {
            Object next3 = it6.next();
            int i34 = i25 + 1;
            if (i25 < 0) {
                x.q();
                throw null;
            }
            String string = ((DateTime) next3).toString(DateTimeFormat.longDate());
            ad1.a.f2756a.getClass();
            List<ad1.b> list2 = ad1.a.f2757b;
            ArrayList arrayList8 = new ArrayList();
            for (ad1.b bVar2 : list2) {
                double d14 = ((double) bVar2.f2765b) / (z15 ? 1000.0d : 1609.344d);
                Iterator<E> it7 = cVarE.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        it = it6;
                        next = null;
                        break;
                    }
                    next = it7.next();
                    it = it6;
                    if (((fd1.c) next).f70481a == bVar2) {
                        break;
                    }
                    it6 = it;
                }
                fd1.c cVar2 = (fd1.c) next;
                if (cVar2 != null) {
                    Iterator<h0.e.a> it8 = cVar2.f70482b.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it8.next();
                        Iterator<h0.e.a> it9 = it8;
                        if (((int) next2.f117346a) == i25) {
                            break;
                        }
                        it8 = it9;
                    }
                    h0.e.a aVar4 = next2;
                    if (aVar4 != null) {
                        fValueOf = Float.valueOf(aVar4.f117347b);
                    } else {
                        fValueOf = null;
                    }
                } else {
                    fValueOf = null;
                }
                Float f14 = fValueOf;
                String string2 = context.getString(z15 ? R.string.lbl_km : R.string.lbl_mile);
                string2.getClass();
                if (f14 != null) {
                    long jD = MathKt.d(((double) f14.floatValue()) * d14);
                    l3.f23124b.getClass();
                    String strE1 = l3.a.e1(jD);
                    String string3 = context.getString(R.string.string_slash_string_no_space_pattern, l3.a.e1(MathKt.d(f14.floatValue())), string2);
                    string3.getClass();
                    String string4 = context.getString(R.string.string_new_line_string_pattern, strE1, string3);
                    string4.getClass();
                    aVar2 = new fd1.a(bVar2, string4);
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    arrayList8.add(aVar2);
                }
                it6 = it;
                z15 = z14;
                arrayList4 = arrayList4;
                i25 = i25;
            }
            Iterator it10 = it6;
            ArrayList arrayList9 = arrayList4;
            int i35 = i25;
            if (arrayList8.isEmpty()) {
                pVar = null;
            } else {
                Integer numValueOf = Integer.valueOf(i35);
                c cVarE4 = i53.a.e(arrayList8);
                string.getClass();
                pVar = new p(numValueOf, new fd1.b(cVarE4, string));
            }
            if (pVar != null) {
                arrayList7.add(pVar);
            }
            it6 = it10;
            z15 = z14;
            i25 = i34;
            arrayList4 = arrayList9;
        }
        ArrayList arrayList10 = arrayList4;
        i53.d dVarG = i53.a.g(u0.l(arrayList7));
        Float fQ0 = p13.h0.q0(arrayList10);
        float fFloatValue2 = fQ0 != null ? fQ0.floatValue() : 1.0f;
        Float fV0 = p13.h0.v0(arrayList10);
        return new e(gVar2, cVarE, dVarG, cVarE3, fFloatValue2, fV0 != null ? fV0.floatValue() : 0.0f);
    }
}
