package vu1;

import am.x0;
import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.performance.model.CurrentTrainingStatusDTO;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.k0;
import zf0.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvu1/c;", "Lzf0/j0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c extends j0 {
    public static final /* synthetic */ int K0 = 0;
    public vt1.o H0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Long f180261k0;
    public final kv1.b I = kv1.b.a.a(kv1.b.f106719e);
    public final s61.a P = s61.a.C2979a.a(s61.a.f157622b);
    public final o13.t T = o13.m.b(new vd1.c(18));
    public final o13.t X = o13.m.b(new vd1.c(19));
    public final o13.t Y = o13.m.b(new vd1.c(20));
    public final o13.t Z = o13.m.b(new vd1.c(21));
    public final o13.t I0 = o13.m.b(new vd1.c(22));
    public final w0 J0 = t1.a(d5(), new b(this, 0));

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object X4(c cVar, tw1.m mVar, v13.c cVar2) {
        d dVar;
        String string;
        cVar.getClass();
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i14 = dVar.f180264c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f180264c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar, cVar2);
            }
        } else {
            dVar = new d(cVar, cVar2);
        }
        d dVar2 = dVar;
        Object objA = dVar2.f180262a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f180264c;
        if (i15 == 0) {
            o13.r.b(objA);
            hg0.b bVarB4 = cVar.B4();
            String strValueOf = String.valueOf(mVar.getStartDate());
            DateTime dateTimeO = mVar.o();
            if (dateTimeO != null) {
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                string = ((DateTime) r13.b.e(dateTimeO, dateTimeNow)).toString();
                if (string == null) {
                    string = DateTime.now().toString();
                    string.getClass();
                }
            } else {
                string = DateTime.now().toString();
                string.getClass();
            }
            String str = string;
            dVar2.f180264c = 1;
            objA = hg0.b.a(bVarB4, null, null, strValueOf, str, 365, dVar2);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error retrieving list of activities: ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "FBTBaseDashboardAndScheduleViewModel", strD);
        return p13.j0.f134944a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable Y4(c cVar, tw1.m mVar, v13.c cVar2) {
        e eVar;
        String string;
        LocalDate localDate;
        DateTime dateTimeJ;
        LocalDate localDate2;
        cVar.getClass();
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i14 = eVar.f180268d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f180268d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar, cVar2);
            }
        } else {
            eVar = new e(cVar, cVar2);
        }
        Object obj = eVar.f180266b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f180268d;
        if (i15 == 0) {
            o13.r.b(obj);
            DateTime startDate = mVar.getStartDate();
            LocalDate localDate3 = startDate != null ? startDate.toLocalDate() : null;
            kv1.b bVar = cVar.I;
            String strValueOf = String.valueOf(mVar.getStartDate());
            DateTime dateTimeO = mVar.o();
            if (dateTimeO != null) {
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                string = ((DateTime) r13.b.e(dateTimeO, dateTimeNow)).toString();
                if (string == null) {
                    string = DateTime.now().toString();
                    string.getClass();
                }
            } else {
                string = DateTime.now().toString();
                string.getClass();
            }
            eVar.f180265a = localDate3;
            eVar.f180268d = 1;
            Object objB = kv1.b.b(bVar, strValueOf, string, eVar);
            if (objB == aVar) {
                return aVar;
            }
            LocalDate localDate4 = localDate3;
            obj = objB;
            localDate = localDate4;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localDate = eVar.f180265a;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error while fetching fitness stats for the plan, Exception=");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "FBTBaseDashboardAndScheduleViewModel", strD);
            return null;
        }
        Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            av1.d dVar = (av1.d) obj2;
            if (dVar.r() && (dateTimeJ = dVar.j()) != null && (localDate2 = dateTimeJ.toLocalDate()) != null && !localDate2.isBefore(localDate)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01dd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x010a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:0x0186  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0209  */
    /* JADX WARN: Code duplicated, block: B:72:0x020e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0247  */
    /* JADX WARN: Code duplicated, block: B:94:0x0280  */
    /* JADX WARN: Code duplicated, block: B:96:0x029a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0195 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0186 -> B:46:0x018c). Please report as a decompilation issue!!! */
    public static final Serializable Z4(c cVar, tw1.m mVar, v13.c cVar2) {
        g gVar;
        o13.u uVar;
        LocalDate localDateNow;
        tw1.m mVar2;
        int i14;
        int i15;
        v2 v2Var;
        Iterator it;
        g gVar2;
        HashMap map;
        int i16;
        int i17;
        Iterator it3;
        fg0.k kVar;
        Long l14;
        v2 v2Var2;
        HashMap map2;
        int i18;
        HashMap map3;
        int i19;
        int i24;
        int i25;
        LocalDate localDate;
        tw1.m mVar3;
        HashMap map4;
        int i26;
        ArrayList arrayList;
        List listN0;
        Iterator it4;
        Object next;
        fg0.k kVar2;
        gg0.f eventType;
        List list;
        gg0.f eventType2;
        fg0.j eventCustomization;
        Long trainingPlanId;
        fg0.j eventCustomization2;
        boolean zG;
        LocalDate date;
        cVar.getClass();
        if (cVar2 instanceof g) {
            gVar = (g) cVar2;
            int i27 = gVar.f180341p;
            if ((i27 & Integer.MIN_VALUE) != 0) {
                gVar.f180341p = i27 - Integer.MIN_VALUE;
            } else {
                gVar = new g(cVar, cVar2);
            }
        } else {
            gVar = new g(cVar, cVar2);
        }
        Object objJ = gVar.f180339n;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i28 = gVar.f180341p;
        if (i28 == 0) {
            o13.r.b(objJ);
            DateTime startDate = mVar.getStartDate();
            DateTime dateTimeO = mVar.o();
            if (startDate != null && dateTimeO != null) {
                localDateNow = LocalDate.now();
                String string = startDate.toLocalDate().toString("yyyy-MM-dd");
                String string2 = dateTimeO.toLocalDate().toString("yyyy-MM-dd");
                zf0.d dVar = cVar.f204384a;
                string.getClass();
                string2.getClass();
                mVar2 = mVar;
                gVar.f180326a = mVar2;
                gVar.f180327b = localDateNow;
                gVar.f180335j = 0;
                gVar.f180336k = 0;
                gVar.f180341p = 1;
                dVar.getClass();
                objJ = f0.J(dVar, new zf0.t(dVar, string, string2, null), gVar);
                if (objJ != aVar) {
                    i14 = 0;
                    i15 = 0;
                }
                return aVar;
            }
            uVar = null;
            if (uVar == null) {
                return uVar;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "FBTBaseDashboardAndScheduleViewModel", "Training plan startDate or endDate is null, unable to get trainable events for plan.");
            p13.j0 j0Var = p13.j0.f134944a;
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return new o13.u(null, j0Var, k0Var);
        }
        if (i28 == 1) {
            i14 = gVar.f180336k;
            i15 = gVar.f180335j;
            localDateNow = gVar.f180327b;
            mVar2 = gVar.f180326a;
            o13.r.b(objJ);
        } else {
            if (i28 == 2) {
                int i29 = gVar.f180338m;
                int i30 = gVar.f180337l;
                i19 = gVar.f180336k;
                int i34 = gVar.f180335j;
                HashMap map5 = gVar.f180334i;
                l14 = gVar.f180333h;
                kVar = gVar.f180332g;
                it3 = gVar.f180331f;
                HashMap map6 = gVar.f180329d;
                v2 v2Var3 = gVar.f180328c;
                LocalDate localDate2 = gVar.f180327b;
                tw1.m mVar4 = gVar.f180326a;
                o13.r.b(objJ);
                i24 = i29;
                i25 = i30;
                i18 = i34;
                localDateNow = localDate2;
                map2 = map6;
                mVar2 = mVar4;
                map3 = map5;
                v2Var2 = v2Var3;
                map3.put(l14, objJ);
                gVar.f180326a = mVar2;
                gVar.f180327b = localDateNow;
                gVar.f180328c = v2Var2;
                gVar.f180329d = map2;
                gVar.f180330e = null;
                gVar.f180331f = it3;
                gVar.f180332g = null;
                gVar.f180333h = null;
                gVar.f180334i = null;
                gVar.f180335j = i18;
                gVar.f180336k = i19;
                gVar.f180337l = i25;
                gVar.f180338m = i24;
                gVar.f180341p = 3;
                if (cVar.L4(kVar, gVar) != aVar) {
                    i16 = i19;
                    localDate = localDateNow;
                    mVar3 = mVar2;
                    map4 = map2;
                    v2Var = v2Var2;
                    i26 = i18;
                    i17 = i25;
                    mVar2 = mVar3;
                    it = it3;
                    gVar2 = gVar;
                    localDateNow = localDate;
                    i15 = i26;
                    map = map4;
                    while (true) {
                        if (it.hasNext()) {
                            kVar = (fg0.k) it.next();
                            date = kVar.getDate();
                            if (date == null) {
                            }
                        } else {
                            v2.b bVar = (v2.b) v2Var;
                            Iterable iterable = (Iterable) bVar.f47386a;
                            arrayList = new ArrayList();
                            for (Object obj : iterable) {
                                eventCustomization2 = ((fg0.k) obj).getEventCustomization();
                                if (eventCustomization2 != null) {
                                    zG = p005kotlin.jvm.internal.s.g(eventCustomization2.getIsPrimaryEvent(), Boolean.TRUE);
                                } else {
                                    zG = false;
                                }
                                if (!zG) {
                                    arrayList.add(obj);
                                }
                            }
                            listN0 = h0.N0(arrayList, new h());
                            it4 = ((Iterable) bVar.f47386a).iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it4.next();
                                eventCustomization = ((fg0.k) next).getEventCustomization();
                                if (eventCustomization != null) {
                                    trainingPlanId = eventCustomization.getTrainingPlanId();
                                    long trainingPlanId2 = mVar2.getTrainingPlanId();
                                    if (trainingPlanId != null) {
                                        break;
                                        break;
                                    }
                                    continue;
                                }
                            }
                            kVar2 = (fg0.k) next;
                            if (kVar2 != null) {
                                eventType = kVar2.getEventType();
                            } else {
                                eventType = null;
                            }
                            if (eventType != gg0.f.f77136l) {
                            }
                            String shareableEventUuid = kVar2.getShareableEventUuid();
                            Long l15 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            gVar2.f180326a = null;
                            gVar2.f180327b = null;
                            gVar2.f180328c = null;
                            gVar2.f180329d = map;
                            gVar2.f180330e = listN0;
                            gVar2.f180331f = null;
                            gVar2.f180332g = null;
                            gVar2.f180335j = i15;
                            gVar2.f180336k = i16;
                            gVar2.f180341p = 4;
                            objJ = cVar.G4(shareableEventUuid, l15, gVar2);
                            if (objJ != aVar) {
                                list = listN0;
                            }
                        }
                    }
                }
                return aVar;
            }
            if (i28 == 3) {
                i25 = gVar.f180337l;
                i16 = gVar.f180336k;
                i26 = gVar.f180335j;
                Iterator it5 = gVar.f180331f;
                map4 = gVar.f180329d;
                v2 v2Var4 = gVar.f180328c;
                localDate = gVar.f180327b;
                mVar3 = gVar.f180326a;
                o13.r.b(objJ);
                v2Var = v2Var4;
                it3 = it5;
                i17 = i25;
                mVar2 = mVar3;
                it = it3;
                gVar2 = gVar;
                localDateNow = localDate;
                i15 = i26;
                map = map4;
                while (true) {
                    if (it.hasNext()) {
                        v2.b bVar2 = (v2.b) v2Var;
                        Iterable iterable2 = (Iterable) bVar2.f47386a;
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            eventCustomization2 = ((fg0.k) obj).getEventCustomization();
                            if (eventCustomization2 != null) {
                                zG = p005kotlin.jvm.internal.s.g(eventCustomization2.getIsPrimaryEvent(), Boolean.TRUE);
                            } else {
                                zG = false;
                            }
                            if (!zG) {
                                arrayList.add(obj);
                            }
                        }
                        listN0 = h0.N0(arrayList, new h());
                        it4 = ((Iterable) bVar2.f47386a).iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                            eventCustomization = ((fg0.k) next).getEventCustomization();
                            if (eventCustomization != null) {
                                trainingPlanId = eventCustomization.getTrainingPlanId();
                                long trainingPlanId3 = mVar2.getTrainingPlanId();
                                if (trainingPlanId != null && trainingPlanId.longValue() == trainingPlanId3) {
                                    break;
                                }
                            }
                        }
                        kVar2 = (fg0.k) next;
                        if (kVar2 != null) {
                            eventType = kVar2.getEventType();
                        } else {
                            eventType = null;
                        }
                        if (eventType != gg0.f.f77136l || (kVar2 != null && (eventType2 = kVar2.getEventType()) != null && eventType2.e())) {
                            String shareableEventUuid2 = kVar2.getShareableEventUuid();
                            Long l16 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            gVar2.f180326a = null;
                            gVar2.f180327b = null;
                            gVar2.f180328c = null;
                            gVar2.f180329d = map;
                            gVar2.f180330e = listN0;
                            gVar2.f180331f = null;
                            gVar2.f180332g = null;
                            gVar2.f180335j = i15;
                            gVar2.f180336k = i16;
                            gVar2.f180341p = 4;
                            objJ = cVar.G4(shareableEventUuid2, l16, gVar2);
                            if (objJ != aVar) {
                                list = listN0;
                            }
                        }
                        return new o13.u(kVar2, listN0, map);
                    }
                    kVar = (fg0.k) it.next();
                    date = kVar.getDate();
                    if (date == null && (!date.isBefore(localDateNow)) && kVar.f() == null) {
                        l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                        l14.getClass();
                        gVar2.f180326a = mVar2;
                        gVar2.f180327b = localDateNow;
                        gVar2.f180328c = v2Var;
                        gVar2.f180329d = map;
                        gVar2.f180330e = null;
                        gVar2.f180331f = it;
                        gVar2.f180332g = kVar;
                        gVar2.f180333h = l14;
                        gVar2.f180334i = map;
                        gVar2.f180335j = i15;
                        gVar2.f180336k = i16;
                        gVar2.f180337l = i17;
                        gVar2.f180338m = 0;
                        gVar2.f180341p = 2;
                        Object objI4 = cVar.I4(kVar, gVar2);
                        if (objI4 != aVar) {
                            v2Var2 = v2Var;
                            objJ = objI4;
                            it3 = it;
                            map3 = map;
                            gVar = gVar2;
                            i25 = i17;
                            i18 = i15;
                            i19 = i16;
                            i24 = 0;
                            map2 = map3;
                            map3.put(l14, objJ);
                            gVar.f180326a = mVar2;
                            gVar.f180327b = localDateNow;
                            gVar.f180328c = v2Var2;
                            gVar.f180329d = map2;
                            gVar.f180330e = null;
                            gVar.f180331f = it3;
                            gVar.f180332g = null;
                            gVar.f180333h = null;
                            gVar.f180334i = null;
                            gVar.f180335j = i18;
                            gVar.f180336k = i19;
                            gVar.f180337l = i25;
                            gVar.f180338m = i24;
                            gVar.f180341p = 3;
                            if (cVar.L4(kVar, gVar) != aVar) {
                                i16 = i19;
                                localDate = localDateNow;
                                mVar3 = mVar2;
                                map4 = map2;
                                v2Var = v2Var2;
                                i26 = i18;
                                i17 = i25;
                                mVar2 = mVar3;
                                it = it3;
                                gVar2 = gVar;
                                localDateNow = localDate;
                                i15 = i26;
                                map = map4;
                                if (it.hasNext()) {
                                    v2.b bVar3 = (v2.b) v2Var;
                                    Iterable iterable3 = (Iterable) bVar3.f47386a;
                                    arrayList = new ArrayList();
                                    while (r7.hasNext()) {
                                        eventCustomization2 = ((fg0.k) obj).getEventCustomization();
                                        if (eventCustomization2 != null) {
                                            zG = p005kotlin.jvm.internal.s.g(eventCustomization2.getIsPrimaryEvent(), Boolean.TRUE);
                                        } else {
                                            zG = false;
                                        }
                                        if (!zG) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    listN0 = h0.N0(arrayList, new h());
                                    it4 = ((Iterable) bVar3.f47386a).iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it4.next();
                                        eventCustomization = ((fg0.k) next).getEventCustomization();
                                        if (eventCustomization != null) {
                                            trainingPlanId = eventCustomization.getTrainingPlanId();
                                            long trainingPlanId4 = mVar2.getTrainingPlanId();
                                            if (trainingPlanId != null) {
                                                break;
                                                break;
                                            }
                                            continue;
                                        }
                                    }
                                    kVar2 = (fg0.k) next;
                                    if (kVar2 != null) {
                                        eventType = kVar2.getEventType();
                                    } else {
                                        eventType = null;
                                    }
                                    if (eventType != gg0.f.f77136l) {
                                    }
                                    String shareableEventUuid3 = kVar2.getShareableEventUuid();
                                    Long l17 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                    gVar2.f180326a = null;
                                    gVar2.f180327b = null;
                                    gVar2.f180328c = null;
                                    gVar2.f180329d = map;
                                    gVar2.f180330e = listN0;
                                    gVar2.f180331f = null;
                                    gVar2.f180332g = null;
                                    gVar2.f180335j = i15;
                                    gVar2.f180336k = i16;
                                    gVar2.f180341p = 4;
                                    objJ = cVar.G4(shareableEventUuid3, l17, gVar2);
                                    if (objJ != aVar) {
                                        list = listN0;
                                    }
                                } else {
                                    kVar = (fg0.k) it.next();
                                    date = kVar.getDate();
                                    if (date == null) {
                                    }
                                }
                            }
                        }
                    }
                    return aVar;
                }
            }
            if (i28 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = gVar.f180330e;
            map = gVar.f180329d;
            o13.r.b(objJ);
        }
        kVar2 = (fg0.k) objJ;
        listN0 = list;
        return new o13.u(kVar2, listN0, map);
        v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error retrieving trainable events for plan. Exception=");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "FBTBaseDashboardAndScheduleViewModel", strD);
            p13.j0 j0Var2 = p13.j0.f134944a;
            k0 k0Var2 = k0.f134949a;
            k0Var2.getClass();
            uVar = new o13.u(null, j0Var2, k0Var2);
            if (uVar == null) {
                return uVar;
            }
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var3, "FBTBaseDashboardAndScheduleViewModel", "Training plan startDate or endDate is null, unable to get trainable events for plan.");
            p13.j0 j0Var3 = p13.j0.f134944a;
            k0 k0Var3 = k0.f134949a;
            k0Var3.getClass();
            return new o13.u(null, j0Var3, k0Var3);
        }
        HashMap map7 = new HashMap();
        it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
        int i35 = i14;
        gVar2 = gVar;
        map = map7;
        i16 = i35;
        i17 = 0;
        while (true) {
            if (it.hasNext()) {
                v2.b bVar4 = (v2.b) v2Var;
                Iterable iterable4 = (Iterable) bVar4.f47386a;
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    eventCustomization2 = ((fg0.k) obj).getEventCustomization();
                    if (eventCustomization2 != null) {
                        zG = p005kotlin.jvm.internal.s.g(eventCustomization2.getIsPrimaryEvent(), Boolean.TRUE);
                    } else {
                        zG = false;
                    }
                    if (!zG) {
                        arrayList.add(obj);
                    }
                }
                listN0 = h0.N0(arrayList, new h());
                it4 = ((Iterable) bVar4.f47386a).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    eventCustomization = ((fg0.k) next).getEventCustomization();
                    if (eventCustomization != null) {
                        trainingPlanId = eventCustomization.getTrainingPlanId();
                        long trainingPlanId5 = mVar2.getTrainingPlanId();
                        if (trainingPlanId != null) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                kVar2 = (fg0.k) next;
                if (kVar2 != null) {
                    eventType = kVar2.getEventType();
                } else {
                    eventType = null;
                }
                if (eventType != gg0.f.f77136l) {
                }
                String shareableEventUuid4 = kVar2.getShareableEventUuid();
                Long l18 = kVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                gVar2.f180326a = null;
                gVar2.f180327b = null;
                gVar2.f180328c = null;
                gVar2.f180329d = map;
                gVar2.f180330e = listN0;
                gVar2.f180331f = null;
                gVar2.f180332g = null;
                gVar2.f180335j = i15;
                gVar2.f180336k = i16;
                gVar2.f180341p = 4;
                objJ = cVar.G4(shareableEventUuid4, l18, gVar2);
                if (objJ != aVar) {
                    list = listN0;
                    kVar2 = (fg0.k) objJ;
                    listN0 = list;
                    return new o13.u(kVar2, listN0, map);
                }
            } else {
                kVar = (fg0.k) it.next();
                date = kVar.getDate();
                if (date == null) {
                }
            }
            return aVar;
        }
    }

    public static final boolean a5(c cVar, String str, tw1.m mVar) {
        vt1.o oVarB;
        List<String> listC;
        cVar.getClass();
        tw1.n trainingPlanType = mVar.getTrainingPlanType();
        return !(trainingPlanType == null || (oVarB = trainingPlanType.b()) == null || (listC = oVarB.c()) == null || !listC.contains(str)) || (mVar.i0() && p005kotlin.jvm.internal.s.g(str, x0.f4316p.f4358a));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    public static final i71.w b5(c cVar, CurrentTrainingStatusDTO currentTrainingStatusDTO, TrainingStatusReportDTO trainingStatusReportDTO, String str) {
        com.garmin.android.apps.connectmobile.performance.model.c cVarD;
        Iterable iterableD;
        List<com.garmin.android.apps.connectmobile.performance.model.c> list;
        boolean z14;
        com.garmin.android.apps.connectmobile.performance.model.b bVarA;
        Collection<com.garmin.android.apps.connectmobile.performance.model.c> collectionValues;
        cVar.getClass();
        f12.l.f68084a.getClass();
        f12.l lVarA = f12.l.a.a();
        if (currentTrainingStatusDTO != null && !currentTrainingStatusDTO.f39899d) {
            HashMap<String, com.garmin.android.apps.connectmobile.performance.model.c> map = currentTrainingStatusDTO.f39898c;
            if (map == null || (collectionValues = map.values()) == null) {
                cVarD = null;
            } else {
                cVarD = (com.garmin.android.apps.connectmobile.performance.model.c) h0.c0(collectionValues);
            }
        } else if (currentTrainingStatusDTO != null) {
            cVarD = currentTrainingStatusDTO.D(str);
        } else {
            cVarD = null;
        }
        String strV0 = lVarA.V0();
        boolean z15 = false;
        boolean z16 = strV0 != null && strV0.length() > 0;
        new zv1.c(new i71.d());
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateMinusDays = localDateNow.minusDays(e32.o.f62808k.f62819a - 1);
        if (trainingStatusReportDTO != null && !trainingStatusReportDTO.f39910a) {
            iterableD = trainingStatusReportDTO.D();
        } else if (str == null) {
            iterableD = p13.j0.f134944a;
        } else {
            if (trainingStatusReportDTO == null || (list = trainingStatusReportDTO.f39912c.get(str)) == null) {
                iterableD = null;
            } else {
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                for (com.garmin.android.apps.connectmobile.performance.model.c cVar2 : list) {
                    arrayList.add(cVar2 != null ? cVar2.M() : null);
                }
                iterableD = arrayList;
            }
            if (iterableD == null) {
                iterableD = p13.j0.f134944a;
            }
        }
        ArrayList arrayListZ = h0.Z(iterableD);
        ArrayList arrayList2 = new ArrayList(arrayListZ);
        localDateMinusDays.getClass();
        i53.f fVarB = i71.d.b(arrayList2, localDateMinusDays, localDateNow, jg.b.r(localDateMinusDays, localDateNow));
        if (arrayListZ.isEmpty()) {
            z14 = false;
        } else {
            Iterator it = arrayListZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    o61.n nVar = (o61.n) it.next();
                    if (nVar.getTrainingStatus() != null || nVar.getIsTrainingStatusPaused()) {
                        z14 = true;
                    }
                } else {
                    z14 = false;
                }
            }
        }
        int i14 = e32.o.f62808k.f62819a / 2;
        ArrayList<o61.n> arrayList3 = new ArrayList();
        for (Object obj : arrayListZ) {
            if (((o61.n) obj).d().isAfter(LocalDate.now().minusDays(i14))) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            for (o61.n nVar2 : arrayList3) {
                if (nVar2.getTrainingStatus() != null || nVar2.getIsTrainingStatusPaused()) {
                    z15 = true;
                    break;
                }
            }
        }
        o61.o oVar = new o61.o(fVarB, z14, z15);
        if (z16) {
            bVarA = com.garmin.android.apps.connectmobile.performance.model.b.PAUSE;
        } else {
            if (z16) {
                u0.r();
                return null;
            }
            if (cVarD != null) {
                double d14 = cVarD.f39950i;
                com.garmin.android.apps.connectmobile.performance.model.b.a aVar = com.garmin.android.apps.connectmobile.performance.model.b.f39921h;
                Boolean bool = Boolean.FALSE;
                aVar.getClass();
                bVarA = com.garmin.android.apps.connectmobile.performance.model.b.a.a(d14, bool);
                if (bVarA == null) {
                    bVarA = com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN;
                }
            } else {
                bVarA = com.garmin.android.apps.connectmobile.performance.model.b.NO_DATA;
            }
        }
        return new i71.w(new yz1.d(yz1.u.SUCCESS, null, false, 6, null), bVarA, cVarD != null ? cVarD.f39944c : null, oVar.f129627a, oVar.f129628b, oVar.f129629c);
    }

    public final void c5() {
        Long l14 = this.f180261k0;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            d5().m(g3.a.c(g3.f35298f));
            ge1.b.T(v1.a(this), null, null, new f(this, jLongValue, null), 3);
        }
    }

    public final y0<g3<av1.a>> d5() {
        return (y0) this.I0.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvu1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
