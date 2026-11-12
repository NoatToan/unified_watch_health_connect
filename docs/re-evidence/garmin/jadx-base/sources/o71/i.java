package o71;

import a61.r;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.performance.dto.StrengthStatsDto;
import com.garmin.android.apps.connectmobile.v2;
import j23.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import mt0.s1;
import o13.m;
import o13.t;
import okhttp3.HttpUrl;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import r53.c2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lo71/i;", "Landroidx/lifecycle/u1;", "La61/r;", "repo", "<init>", "(La61/r;)V", "b", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f130237f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f130238g = m.b(new nw1.e(24));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f130239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<b> f130240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<Integer> f130241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<Boolean> f130242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f130243e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo71/i$b;", "", "Lp71/c;", "filterCategory", "Lp71/f;", "filter", "<init>", "(Lp71/c;Lp71/f;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p71.c f130244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p71.f f130245b;

        public b(p71.c cVar, p71.f fVar) {
            cVar.getClass();
            fVar.getClass();
            this.f130244a = cVar;
            this.f130245b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f130244a == bVar.f130244a && this.f130245b.equals(bVar.f130245b);
        }

        public final int hashCode() {
            return this.f130245b.hashCode() + (this.f130244a.hashCode() * 31);
        }

        public final String toString() {
            return "FilterData(filterCategory=" + this.f130244a + ", filter=" + this.f130245b + ")";
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130246a;

        static {
            int[] iArr = new int[p71.c.values().length];
            try {
                iArr[p71.c.f136304a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p71.c.f136305b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f130246a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.viewmodel.StrengthStatsViewModel", f = "StrengthStatsViewModel.kt", l = {43, 47}, m = "getDailyStats", v = 2)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o71.g f130247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LocalDate f130248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LocalDate f130249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public HttpUrl f130250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o71.e.a f130251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f130252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f130253g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f130255i;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f130253g = obj;
            this.f130255i |= Integer.MIN_VALUE;
            a aVar = i.f130237f;
            return i.this.A4(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.viewmodel.StrengthStatsViewModel", f = "StrengthStatsViewModel.kt", l = {132, SyslogConstants.LOG_LOCAL1}, m = "getOneMonthStats", v = 2)
    public static final class e extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LocalDate f130256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LocalDate f130257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o71.g f130258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public HttpUrl f130259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o71.e.a f130260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f130261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f130262g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f130264i;

        public e(t13.d<? super e> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f130262g = obj;
            this.f130264i |= Integer.MIN_VALUE;
            return i.this.B4(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.viewmodel.StrengthStatsViewModel", f = "StrengthStatsViewModel.kt", l = {120}, m = "getOneYearStats", v = 2)
    public static final class f extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LocalDate f130265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LocalDate f130266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o71.g f130267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f130268d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f130270f;

        public f(t13.d<? super f> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f130268d = obj;
            this.f130270f |= Integer.MIN_VALUE;
            return i.this.C4(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.viewmodel.StrengthStatsViewModel", f = "StrengthStatsViewModel.kt", l = {57, 69}, m = "getTwelveWeeksStats", v = 2)
    public static final class g extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LocalDate f130271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LocalDate f130272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LocalDate f130273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LocalDate f130274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public HttpUrl f130275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o71.e.a f130276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f130277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f130278h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f130280j;

        public g(t13.d<? super g> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f130278h = obj;
            this.f130280j |= Integer.MIN_VALUE;
            return i.this.D4(null, null, this);
        }
    }

    public i(r rVar) {
        rVar.getClass();
        this.f130239a = rVar;
        p71.c.a aVar = p71.c.f136304a;
        a61.l.f1621a.getClass();
        this.f130240b = new y0<>(new b(aVar, (p71.a) a61.l.f1622b.getValue()));
        this.f130241c = new y0<>(0);
        this.f130242d = new y0<>(Boolean.TRUE);
        this.f130243e = new LinkedHashMap();
    }

    public static List x4(ArrayList arrayList, LocalDate localDate) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            LocalDate calendarDate = ((StrengthStatsDto) obj).getCalendarDate();
            LocalDate localDateMinusDays = calendarDate.minusDays(Days.daysBetween(localDate, calendarDate).getDays() % 7);
            Object arrayList2 = linkedHashMap.get(localDateMinusDays);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(localDateMinusDays, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LocalDate localDate2 = (LocalDate) entry.getKey();
            List list = (List) entry.getValue();
            localDate2.getClass();
            ArrayList arrayList4 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d0.v(arrayList4, ((StrengthStatsDto) it.next()).b());
            }
            arrayList3.add(new StrengthStatsDto(localDate2, arrayList4));
        }
        return h0.N0(arrayList3, new j());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object A4(o71.g gVar, LocalDate localDate, LocalDate localDate2, t13.d<? super v2<o71.e>> dVar) {
        d dVar2;
        HttpUrl httpUrl;
        int i14;
        o71.e.a aVar;
        o71.g gVar2 = gVar;
        LocalDate localDate3 = localDate;
        LocalDate localDate4 = localDate2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i15 = dVar2.f130255i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar2.f130255i = i15 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objG = dVar2.f130253g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar2.f130255i;
        try {
            if (i16 == 0) {
                o13.r.b(objG);
                f130237f.getClass();
                ((Logger) f130238g.getValue()).trace("getDailyStats(" + gVar2 + ", " + localDate3 + ", " + localDate4 + ")");
                LocalDate localDateA = gVar.a(localDate);
                dVar2.f130247a = gVar2;
                dVar2.f130248b = localDate3;
                dVar2.f130249c = localDate4;
                dVar2.f130255i = 1;
                objG = this.f130239a.g(localDateA, localDate4, dVar2);
                if (objG != aVar2) {
                }
                return aVar2;
            }
            if (i16 == 1) {
                LocalDate localDate5 = dVar2.f130249c;
                localDate3 = dVar2.f130248b;
                o71.g gVar3 = dVar2.f130247a;
                o13.r.b(objG);
                localDate4 = localDate5;
                gVar2 = gVar3;
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i17 = dVar2.f130252f;
                aVar = dVar2.f130251e;
                HttpUrl httpUrl2 = dVar2.f130250d;
                o13.r.b(objG);
                i14 = i17;
                httpUrl = httpUrl2;
            }
            List list = (List) objG;
            aVar.getClass();
            list.getClass();
            aVar.f130185d = new aq1.d0(aVar, list);
            return new v2.b(aVar.a(), i14, httpUrl, null, 8, null);
            v2 v2Var = (v2) objG;
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            v2.b bVar = (v2.b) v2Var;
            int i18 = bVar.f47387b;
            HttpUrl httpUrl3 = bVar.f47388c;
            List list2 = (List) ((v2.b) v2Var).f47386a;
            o71.e.a aVar3 = new o71.e.a(gVar2, s.a(localDate3, localDate4));
            list2.getClass();
            aVar3.f130184c = new s1(23, aVar3, list2);
            dVar2.f130247a = null;
            dVar2.f130248b = null;
            dVar2.f130249c = null;
            dVar2.f130250d = httpUrl3;
            dVar2.f130251e = aVar3;
            dVar2.f130252f = i18;
            dVar2.f130255i = 2;
            objG = r53.s.M(new c2(new k(this, localDate3, localDate4, null)), new ArrayList(), dVar2);
            if (objG != aVar2) {
                httpUrl = httpUrl3;
                i14 = i18;
                aVar = aVar3;
                List list3 = (List) objG;
                aVar.getClass();
                list3.getClass();
                aVar.f130185d = new aq1.d0(aVar, list3);
                return new v2.b(aVar.a(), i14, httpUrl, null, 8, null);
            }
            return aVar2;
        } catch (Exception e4) {
            return new v2.a(e4, null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object B4(LocalDate localDate, LocalDate localDate2, t13.d<? super v2<o71.e>> dVar) {
        e eVar;
        o71.g gVar;
        Object objG;
        HttpUrl httpUrl;
        int i14;
        o71.e.a aVar;
        LocalDate localDate3 = localDate;
        LocalDate localDate4 = localDate2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i15 = eVar.f130264i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f130264i = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objM = eVar.f130262g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = eVar.f130264i;
        try {
            if (i16 == 0) {
                o13.r.b(objM);
                gVar = o71.g.f130205k;
                LocalDate localDateA = gVar.a(localDate3);
                eVar.f130256a = localDate3;
                eVar.f130257b = localDate4;
                eVar.f130258c = gVar;
                eVar.f130264i = 1;
                objG = this.f130239a.g(localDateA, localDate4, eVar);
                if (objG != aVar2) {
                }
                return aVar2;
            }
            if (i16 == 1) {
                o71.g gVar2 = eVar.f130258c;
                localDate4 = eVar.f130257b;
                LocalDate localDate5 = eVar.f130256a;
                o13.r.b(objM);
                gVar = gVar2;
                localDate3 = localDate5;
                objG = objM;
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i17 = eVar.f130261f;
                aVar = eVar.f130260e;
                HttpUrl httpUrl2 = eVar.f130259d;
                o13.r.b(objM);
                i14 = i17;
                httpUrl = httpUrl2;
            }
            List list = (List) objM;
            aVar.getClass();
            list.getClass();
            aVar.f130185d = new aq1.d0(aVar, list);
            return new v2.b(aVar.a(), i14, httpUrl, null, 8, null);
            v2 v2Var = (v2) objG;
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            v2.b bVar = (v2.b) v2Var;
            int i18 = bVar.f47387b;
            HttpUrl httpUrl3 = bVar.f47388c;
            List list2 = (List) ((v2.b) v2Var).f47386a;
            o71.e.a aVar3 = new o71.e.a(gVar, s.a(localDate3, localDate4));
            list2.getClass();
            aVar3.f130184c = new s1(23, aVar3, list2);
            eVar.f130256a = null;
            eVar.f130257b = null;
            eVar.f130258c = null;
            eVar.f130259d = httpUrl3;
            eVar.f130260e = aVar3;
            eVar.f130261f = i18;
            eVar.f130264i = 2;
            objM = r53.s.M(new c2(new k(this, localDate3, localDate4, null)), new ArrayList(), eVar);
            if (objM != aVar2) {
                httpUrl = httpUrl3;
                i14 = i18;
                aVar = aVar3;
                List list3 = (List) objM;
                aVar.getClass();
                list3.getClass();
                aVar.f130185d = new aq1.d0(aVar, list3);
                return new v2.b(aVar.a(), i14, httpUrl, null, 8, null);
            }
            return aVar2;
        } catch (Exception e4) {
            return new v2.a(e4, null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C4(LocalDate localDate, LocalDate localDate2, t13.d<? super v2<o71.e>> dVar) {
        f fVar;
        LocalDate localDate3;
        o71.g gVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i14 = fVar.f130270f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f130270f = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f130268d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f130270f;
        if (i15 == 0) {
            o13.r.b(obj);
            f130237f.getClass();
            ((Logger) f130238g.getValue()).trace("getOneYearStats(" + localDate + ", " + localDate2 + ")");
            o71.g gVar2 = o71.g.f130204j;
            LocalDate localDateA = gVar2.a(localDate);
            fVar.f130265a = localDate;
            fVar.f130266b = localDate2;
            fVar.f130267c = gVar2;
            fVar.f130270f = 1;
            Object objH = this.f130239a.h(localDateA, localDate2, fVar);
            if (objH == aVar) {
                return aVar;
            }
            localDate3 = localDate;
            gVar = gVar2;
            obj = objH;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = fVar.f130267c;
            localDate2 = fVar.f130266b;
            localDate3 = fVar.f130265a;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        int i16 = bVar.f47387b;
        HttpUrl httpUrl = bVar.f47388c;
        try {
            List list = (List) ((v2.b) v2Var).f47386a;
            o71.e.a aVar2 = new o71.e.a(gVar, s.a(localDate3, localDate2));
            list.getClass();
            aVar2.f130184c = new s1(23, aVar2, list);
            aVar2.f130185d = new nw0.f(aVar2, 9);
            return new v2.b(aVar2.a(), i16, httpUrl, null, 8, null);
        } catch (Exception e4) {
            return new v2.a(e4, null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object D4(LocalDate localDate, LocalDate localDate2, t13.d<? super v2<o71.e>> dVar) {
        g gVar;
        LocalDate localDateA;
        LocalDate localDateA2;
        Object objG;
        o71.e.a aVar;
        HttpUrl httpUrl;
        int i14;
        LocalDate localDate3 = localDate;
        LocalDate localDate4 = localDate2;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i15 = gVar.f130280j;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                gVar.f130280j = i15 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objM = gVar.f130278h;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = gVar.f130280j;
        try {
            if (i16 == 0) {
                o13.r.b(objM);
                f130237f.getClass();
                ((Logger) f130238g.getValue()).trace("getTwelveWeeksStats(" + localDate3 + ", " + localDate4 + ")");
                o71.g gVar2 = o71.g.f130203i;
                localDateA = gVar2.a(localDate3);
                localDateA2 = gVar2.a(localDate4);
                gVar.f130271a = localDate3;
                gVar.f130272b = localDate4;
                gVar.f130273c = localDateA;
                gVar.f130274d = localDateA2;
                gVar.f130280j = 1;
                objG = this.f130239a.g(localDateA, localDate4, gVar);
                if (objG != aVar2) {
                }
                return aVar2;
            }
            if (i16 == 1) {
                LocalDate localDate5 = gVar.f130274d;
                LocalDate localDate6 = gVar.f130273c;
                LocalDate localDate7 = gVar.f130272b;
                LocalDate localDate8 = gVar.f130271a;
                o13.r.b(objM);
                localDateA2 = localDate5;
                localDate3 = localDate8;
                objG = objM;
                localDateA = localDate6;
                localDate4 = localDate7;
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i17 = gVar.f130277g;
                aVar = gVar.f130276f;
                HttpUrl httpUrl2 = gVar.f130275e;
                o13.r.b(objM);
                i14 = i17;
                httpUrl = httpUrl2;
            }
            List list = (List) objM;
            aVar.getClass();
            list.getClass();
            aVar.f130185d = new aq1.d0(aVar, list);
            return new v2.b(aVar.a(), i14, httpUrl, null, 8, null);
            v2 v2Var = (v2) objG;
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            v2.b bVar = (v2.b) v2Var;
            int i18 = bVar.f47387b;
            HttpUrl httpUrl3 = bVar.f47388c;
            List list2 = (List) ((v2.b) v2Var).f47386a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                LocalDate calendarDate = ((StrengthStatsDto) obj).getCalendarDate();
                if (calendarDate.compareTo(localDateA) >= 0 && calendarDate.compareTo(localDateA2) <= 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                LocalDate calendarDate2 = ((StrengthStatsDto) obj2).getCalendarDate();
                if (calendarDate2.compareTo(localDate3) >= 0 && calendarDate2.compareTo(localDate4) <= 0) {
                    arrayList2.add(obj2);
                }
            }
            List listX4 = x4(arrayList, localDateA);
            List listX5 = x4(arrayList2, localDate3);
            o71.e.a aVar3 = new o71.e.a(o71.g.f130203i, s.a(localDate3, localDate4));
            aVar3.f130184c = new s1(23, aVar3, h0.C0(listX4, listX5));
            gVar.f130271a = null;
            gVar.f130272b = null;
            gVar.f130273c = null;
            gVar.f130274d = null;
            gVar.f130275e = httpUrl3;
            gVar.f130276f = aVar3;
            gVar.f130277g = i18;
            gVar.f130280j = 2;
            objM = r53.s.M(new c2(new k(this, localDate3, localDate4, null)), new ArrayList(), gVar);
            if (objM != aVar2) {
                aVar = aVar3;
                httpUrl = httpUrl3;
                i14 = i18;
                List list3 = (List) objM;
                aVar.getClass();
                list3.getClass();
                aVar.f130185d = new aq1.d0(aVar, list3);
                return new v2.b(aVar.a(), i14, httpUrl, null, 8, null);
            }
            return aVar2;
        } catch (Exception e4) {
            return new v2.a(e4, null, null, 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r3.f(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E4(v13.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f130290c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f130290c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.f130288a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f130290c;
        r rVar = this.f130239a;
        if (i15 == 0) {
            o13.r.b(obj);
            lVar.f130290c = 1;
            if (rVar.d(lVar) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        lVar.f130290c = 2;
    }

    public final p71.f y4() {
        b bVarD = this.f130240b.d();
        p71.f fVar = bVarD != null ? bVarD.f130245b : null;
        if (fVar != null) {
            return fVar;
        }
        vb.h.s("Required value was null.");
        return null;
    }

    public final p71.c z4() {
        b bVarD = this.f130240b.d();
        p71.c cVar = bVarD != null ? bVarD.f130244a : null;
        if (cVar != null) {
            return cVar;
        }
        vb.h.s("Required value was null.");
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lo71/i$a;", "", "<init>", "()V", "", "DEFAULT_START", "I", "LIMIT_AT_ONCE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i(r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            rVar = new r(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(rVar);
    }
}
