package gb1;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fe2.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgb1/t;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ww0.k f76710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public db1.l f76711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public db1.s f76712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<DateTime, List<db1.a>> f76713e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f76709a = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ReentrantLock f76714f = new ReentrantLock();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f76715g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<db1.d, ArrayList<o13.p<DateTime, Double>>> f76716h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap<LocalDate, o13.p<Double, Integer>> f76717i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<Integer> f76718j = new y0<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f76719k = o13.m.b(new g12.m(20));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o13.t f76720l = o13.m.b(new z(this, 16));

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00126\u0010\r\u001a2\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u00010\bj\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lgb1/t$a;", "", "Lww0/k;", "menstrualCycleReportDTO", "Ldb1/l;", "pregnancyNoteListDTO", "Ldb1/s;", "userGlucoseDetailedDTO", "Ljava/util/HashMap;", "Lorg/joda/time/DateTime;", "", "Ldb1/a;", "Lkotlin/collections/HashMap;", "babyMovementsListDTO", "<init>", "(Lww0/k;Ldb1/l;Ldb1/s;Ljava/util/HashMap;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ww0.k f76721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final db1.l f76722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final db1.s f76723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap<DateTime, List<db1.a>> f76724d;

        public a(ww0.k kVar, db1.l lVar, db1.s sVar, HashMap<DateTime, List<db1.a>> map) {
            this.f76721a = kVar;
            this.f76722b = lVar;
            this.f76723c = sVar;
            this.f76724d = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f76721a, aVar.f76721a) && p005kotlin.jvm.internal.s.g(this.f76722b, aVar.f76722b) && p005kotlin.jvm.internal.s.g(this.f76723c, aVar.f76723c) && p005kotlin.jvm.internal.s.g(this.f76724d, aVar.f76724d);
        }

        public final int hashCode() {
            ww0.k kVar = this.f76721a;
            int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
            db1.l lVar = this.f76722b;
            int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
            db1.s sVar = this.f76723c;
            int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
            HashMap<DateTime, List<db1.a>> map = this.f76724d;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            return "PregnancyReportDTO(menstrualCycleReportDTO=" + this.f76721a + ", pregnancyNoteListDTO=" + this.f76722b + ", userGlucoseDetailedDTO=" + this.f76723c + ", babyMovementsListDTO=" + this.f76724d + ")";
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    public static HashMap A4(ww0.k kVar) {
        Integer num;
        Object objB0;
        List<ww0.b> listG;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        if (kVar != null && (listG = kVar.g()) != null) {
            for (ww0.b bVar : listG) {
                List<db1.a> listD = bVar.d();
                if (listD != null) {
                    for (db1.a aVar : listD) {
                        LocalDate date = bVar.getDate();
                        DateTime dateTimeAtStartOfDay = date != null ? date.toDateTimeAtStartOfDay() : null;
                        if (dateTimeAtStartOfDay != null) {
                            if ((aVar != null ? aVar.getMovementType() : null) != null) {
                                Object arrayList2 = map3.get(aVar.getMovementType());
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                Integer count = aVar.getCount();
                                if (count != null) {
                                    ((ArrayList) arrayList2).add(new b(dateTimeAtStartOfDay, Integer.valueOf(count.intValue()), aVar.getDuration()));
                                }
                                db1.g movementType = aVar.getMovementType();
                                if (movementType != null) {
                                    map3.put(movementType, arrayList2);
                                }
                            }
                        }
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.f(a2Var, "PregnancyReportsViewModel", "CalendarDate, Value or LogType in BabyMovementDTO is null. Ignoring data.");
                    }
                }
            }
        }
        for (Map.Entry entry : map3.entrySet()) {
            db1.g gVar = (db1.g) entry.getKey();
            Iterator it = ((ArrayList) entry.getValue()).iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                b bVar2 = (b) next;
                DateTime dateTime = bVar2.f76648a;
                if (arrayList.size() > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (p005kotlin.jvm.internal.s.g(((b) obj).f76648a, dateTime)) {
                            arrayList3.add(obj);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        objB0 = null;
                    } else {
                        objB0 = h0.b0(arrayList3);
                    }
                } else {
                    objB0 = null;
                }
                if (objB0 != null) {
                    b bVar3 = (b) objB0;
                    Integer num2 = bVar3.f76650c;
                    Integer num3 = bVar3.f76649b;
                    if (num2 != null && num3 != null) {
                        Integer num4 = bVar2.f76650c;
                        bVar3.f76650c = num4 != null ? wr.g.m(num4.intValue(), num2) : null;
                        Integer num5 = bVar2.f76649b;
                        bVar3.f76649b = num5 != null ? wr.g.m(num5.intValue(), num3) : null;
                        DateTime dateTime2 = bVar3.f76648a;
                        if (dateTime2 != null) {
                            Integer num6 = (Integer) map.get(dateTime2);
                            map.put(dateTime2, Integer.valueOf(num6 != null ? 1 + num6.intValue() : 1));
                        }
                    }
                } else {
                    arrayList.add(new b(dateTime, bVar2.f76649b, bVar2.f76650c));
                    if (dateTime != null) {
                        map.put(dateTime, 1);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            it3.getClass();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                next2.getClass();
                b bVar4 = (b) next2;
                DateTime dateTime3 = bVar4.f76648a;
                Integer num7 = bVar4.f76649b;
                Integer num8 = bVar4.f76650c;
                if (num8 != null && num7 != null && (num = (Integer) map.get(dateTime3)) != null) {
                    int iIntValue = num.intValue();
                    arrayList4.add(new b(dateTime3, Integer.valueOf(num7.intValue() / iIntValue), Integer.valueOf(num8.intValue() / iIntValue)));
                }
            }
            map2.put(gVar, arrayList4);
            arrayList.clear();
            map.clear();
        }
        return map2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable x4(t tVar, LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        u uVar;
        tVar.getClass();
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f76727c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f76727c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(tVar, cVar);
            }
        } else {
            uVar = new u(tVar, cVar);
        }
        Object objD = uVar.f76725a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f76727c;
        a0 a0Var = null;
        try {
            if (i15 == 0) {
                o13.r.b(objD);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                uVar.f76727c = 1;
                bVar.getClass();
                objD = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.d(localDate, localDate2, uVar);
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objD);
            }
            a0Var = (a0) objD;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            a2 a2Var = a2.PREGNANCY;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PregnancySetupViewModel", th);
        }
        return new o13.p(a0Var, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable y4(t tVar, LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        v vVar;
        tVar.getClass();
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f76730c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f76730c = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(tVar, cVar);
            }
        } else {
            vVar = new v(tVar, cVar);
        }
        Object objG = vVar.f76728a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f76730c;
        a0 a0Var = null;
        try {
            if (i15 == 0) {
                o13.r.b(objG);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                vVar.f76730c = 1;
                bVar.getClass();
                objG = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.g(localDate, localDate2, vVar);
                if (objG == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objG);
            }
            a0Var = (a0) objG;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            a2 a2Var = a2.PREGNANCY;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PregnancySetupViewModel", th);
        }
        return new o13.p(a0Var, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable z4(t tVar, LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        w wVar;
        tVar.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f76733c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f76733c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(tVar, cVar);
            }
        } else {
            wVar = new w(tVar, cVar);
        }
        Object objH = wVar.f76731a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f76733c;
        a0 a0Var = null;
        try {
            if (i15 == 0) {
                o13.r.b(objH);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                wVar.f76733c = 1;
                bVar.getClass();
                objH = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.h(localDate, localDate2, wVar);
                if (objH == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objH);
            }
            a0Var = (a0) objH;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            a2 a2Var = a2.PREGNANCY;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PregnancySetupViewModel", th);
        }
        return new o13.p(a0Var, th);
    }

    public final y0<cx0.a<a>> B4() {
        return (y0) this.f76719k.getValue();
    }
}
