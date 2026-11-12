package kd0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Minutes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/r3;", "Lae0/f;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r3 implements ae0.f {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kd0/r3$a", "Lcom/google/gson/reflect/TypeToken;", "Lkm1/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends TypeToken<km1.c> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [am.x0] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r3v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // ae0.f
    public final i53.f a(yz1.d dVar, String str, String str2, String str3, String str4, o13.p pVar, String str5) {
        j70.d dVar2;
        Object obj;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        km1.v dailySleep;
        DateTime dateTime;
        DateTime dateTime2;
        DateTime dateTimeK;
        ?? r14;
        ?? r15;
        Integer numValueOf;
        Double duration;
        String endTimestampLocal;
        DateTime dateTimeQ;
        Integer numValueOf2;
        String startTimestampLocal;
        DateTime dateTimeQ2;
        Integer numValueOf3;
        new cp0.c();
        j70.d dVar3 = new j70.d(dVar, p13.w.c(str));
        DateTimeZone dateTimeZone = null;
        j70.d dVar4 = new j70.d(dVar, new o70.a(p13.w.c(str2), null, 2, null));
        j70.d dVar5 = new j70.d(dVar, new o70.a(p13.w.c(str3), null, 2, null));
        j70.d dVar6 = new j70.d(dVar, new o70.a(p13.w.c(str4), null, 2, null));
        j70.d dVar7 = new j70.d(dVar, str5);
        ArrayList arrayListInvoke = new gn.q(dVar3).invoke();
        if (arrayListInvoke != null) {
            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayListInvoke, 10));
            Iterator it = arrayListInvoke.iterator();
            while (it.hasNext()) {
                gs1.f fVar = (gs1.f) ((j70.d) it.next()).f97521b;
                ?? B = fVar != null ? fs1.b.b(fVar) : dateTimeZone;
                if (fVar == null || (startTimestampLocal = fVar.getStartTimestampLocal()) == null || (dateTimeQ2 = g22.k.q(startTimestampLocal, "yyyy-MM-dd'T'HH:mm:ss.S", dateTimeZone)) == null) {
                    r14 = dateTimeZone;
                } else {
                    numValueOf3 = Integer.valueOf(dateTimeQ2.getMinuteOfDay());
                }
                if (fVar == null || (endTimestampLocal = fVar.getEndTimestampLocal()) == null || (dateTimeQ = g22.k.q(endTimestampLocal, "yyyy-MM-dd'T'HH:mm:ss.S", dateTimeZone)) == null) {
                    r14 = numValueOf3;
                    r14 = numValueOf3;
                    r14 = numValueOf3;
                    r15 = dateTimeZone;
                } else {
                    numValueOf2 = Integer.valueOf(dateTimeQ.getMinuteOfDay());
                }
                if (fVar == null || (duration = fVar.getDuration()) == null) {
                    r14 = numValueOf3;
                    r15 = numValueOf2;
                    r14 = numValueOf3;
                    r15 = numValueOf2;
                    numValueOf = null;
                } else {
                    r14 = numValueOf3;
                    r15 = numValueOf2;
                    double dDoubleValue = duration.doubleValue();
                    c22.l3.f23124b.getClass();
                    numValueOf = Integer.valueOf(((int) dDoubleValue) / DateTimeConstants.MILLIS_PER_MINUTE);
                }
                arrayList4.add(new gs1.v(new gs1.v.a.c(B), r14 != 0 ? r14.intValue() : -1, r15, numValueOf != null ? numValueOf.intValue() : 0));
                dVar7 = dVar7;
                dateTimeZone = null;
            }
            dVar2 = dVar7;
            obj = arrayList4;
        } else {
            dVar2 = dVar7;
            obj = p13.j0.f134944a;
        }
        ArrayList arrayListC = new gn.e(dVar4, false).c();
        ArrayList arrayList5 = new ArrayList(p13.y.r(arrayListC, 10));
        Iterator it3 = arrayListC.iterator();
        while (it3.hasNext()) {
            in.a aVar = (in.a) ((j70.d) it3.next()).f97521b;
            ActivityListItemDTO activityListItemDTO = aVar != null ? aVar.f94388a : null;
            double d14 = activityListItemDTO != null ? activityListItemDTO.f29275k : 0.0d;
            c22.l3.f23124b.getClass();
            long j8 = (long) (((double) 1000) * d14);
            DateTime dateTimeQ3 = g22.k.q(activityListItemDTO != null ? activityListItemDTO.f29259e : null, "yyyy-MM-dd HH:mm:ss", null);
            DateTime dateTimeQ4 = g22.k.q(activityListItemDTO != null ? activityListItemDTO.f29259e : null, "yyyy-MM-dd HH:mm:ss", null);
            DateTime dateTimePlus = dateTimeQ4 != null ? dateTimeQ4.plus(j8) : null;
            arrayList5.add(new gs1.v(new gs1.v.a.C1589a(activityListItemDTO != null ? activityListItemDTO.f29265g : null), dateTimeQ3 != null ? dateTimeQ3.getMinuteOfDay() : -1, Integer.valueOf(dateTimePlus != null ? dateTimePlus.getMinuteOfDay() : -1), (int) (d14 / 60.0d)));
        }
        ArrayList arrayListC2 = new gn.t(dVar5).c();
        if (arrayListC2 != null) {
            arrayList = new ArrayList(p13.y.r(arrayListC2, 10));
            Iterator it4 = arrayListC2.iterator();
            while (it4.hasNext()) {
                sn.h hVar = (sn.h) ((j70.d) it4.next()).f97521b;
                DateTime dateTimeT = hVar != null ? hVar.t() : null;
                DateTime dateTimeJ = hVar != null ? hVar.j() : null;
                Integer numValueOf4 = (dateTimeT == null || dateTimeJ == null) ? null : Integer.valueOf(Minutes.minutesBetween(dateTimeT, dateTimeJ).getMinutes());
                arrayList.add(new gs1.v(new gs1.v.a.f(), dateTimeT != null ? dateTimeT.getMinuteOfDay() : -1, Integer.valueOf(dateTimeJ != null ? dateTimeJ.getMinuteOfDay() : -1), numValueOf4 != null ? numValueOf4.intValue() : -1));
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        ArrayList arrayListC3 = new kf0.b(dVar6).c();
        if (arrayListC3 != null) {
            arrayList2 = new ArrayList(p13.y.r(arrayListC3, 10));
            Iterator it5 = arrayListC3.iterator();
            while (it5.hasNext()) {
                gf0.a aVar2 = (gf0.a) ((j70.d) it5.next()).f97521b;
                Integer numValueOf5 = (aVar2 == null || (dateTimeK = aVar2.k()) == null) ? null : Integer.valueOf(dateTimeK.getMinuteOfDay());
                arrayList2.add(new gs1.v(new gs1.v.a.b(), numValueOf5 != null ? numValueOf5.intValue() : -1, null, 0, 12, null));
            }
        } else {
            arrayList2 = p13.j0.f134944a;
        }
        ArrayList arrayListC0 = p13.h0.C0((Collection) arrayList, (Iterable) arrayList2);
        Integer numValueOf6 = (pVar == null || (dateTime2 = (DateTime) pVar.f128594a) == null || !g22.k.k(dateTime2)) ? null : Integer.valueOf(dateTime2.getMinuteOfDay());
        List listK = p13.x.k(new gs1.v(gs1.v.a.e.d.f78891b, numValueOf6 != null ? numValueOf6.intValue() : -1, null, 0, 12, null), new gs1.v(gs1.v.a.e.C1590a.f78888b, (pVar == null || (dateTime = (DateTime) pVar.f128595b) == null) ? -1 : dateTime.getMinuteOfDay(), null, 0, 12, null));
        qm1.b bVar = new qm1.b(dVar2);
        km1.c cVar = (km1.c) bVar.a(bVar.f145608a.f97521b, new qm1.a());
        List<km1.b> listT = (cVar == null || (dailySleep = cVar.getDailySleep()) == null) ? null : dailySleep.t();
        if (listT != null) {
            arrayList3 = new ArrayList(p13.y.r(listT, 10));
            Iterator it6 = listT.iterator();
            while (it6.hasNext()) {
                DateTime dateTimeF = km1.b.f((km1.b) it6.next());
                arrayList3.add(new gs1.v(new gs1.v.a.d(), dateTimeF != null ? dateTimeF.getMinuteOfDay() : -1, null, 0, 12, null));
            }
        } else {
            arrayList3 = p13.j0.f134944a;
        }
        ArrayList arrayListC1 = p13.h0.C0(p13.h0.C0(p13.h0.C0(p13.h0.C0(listK, (Iterable) arrayList3), (Iterable) obj), arrayList5), arrayListC0);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayListC1) {
            gs1.v vVar = (gs1.v) obj2;
            if (vVar.f78884b >= 0 && vVar.f78886d >= 0) {
                arrayList6.add(obj2);
            }
        }
        return i53.a.j(zx0.m.e(arrayList6));
    }

    @Override // ae0.f
    public final o13.p<DateTime, DateTime> b(String str, bv.d dVar) {
        km1.c cVar;
        km1.v dailySleep;
        km1.v dailySleep2;
        rm1.b bVarA;
        if (str != null) {
            try {
                cVar = (km1.c) new Gson().fromJson(str, new a().getType());
            } catch (Exception unused) {
                cVar = null;
            }
        } else {
            cVar = null;
        }
        if (cVar == null || (dailySleep = cVar.getDailySleep()) == null || !dailySleep.z0() || (dailySleep2 = cVar.getDailySleep()) == null || (bVarA = ql1.c.a(dailySleep2, dVar.h(), dVar.d())) == null) {
            return null;
        }
        return new o13.p<>(bVarA.f153532a, bVarA.f153533b);
    }
}
