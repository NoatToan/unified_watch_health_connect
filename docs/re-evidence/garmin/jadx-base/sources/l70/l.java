package l70;

import am.x0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements r53.i<j70.k.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f110712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f110713b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f110714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f110715b;

        /* JADX INFO: renamed from: l70.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchActivitiesAndWorkouts$lambda$1$$inlined$map$1$2", f = "DashboardRepositoryImpl.kt", l = {53, 79, 50}, m = "emit", v = 2)
        public static final class C2118a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f110716a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f110717b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public r53.j f110719d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public gm0.e f110720e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public List f110721f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public String f110722g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Map f110723h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public ArrayList f110724i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Integer f110725j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public yz1.d f110726k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public String f110727l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public String f110728m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public String f110729n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f110730o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f110731p;

            public C2118a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f110716a = obj;
                this.f110717b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, e eVar) {
            this.f110714a = jVar;
            this.f110715b = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:108:0x01db  */
        /* JADX WARN: Code duplicated, block: B:110:0x01e1  */
        /* JADX WARN: Code duplicated, block: B:111:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:113:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:114:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:122:0x0201  */
        /* JADX WARN: Code duplicated, block: B:127:0x023c  */
        /* JADX WARN: Code duplicated, block: B:130:0x025c A[LOOP:2: B:120:0x01fb->B:130:0x025c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:147:0x025f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x0216 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x02b6, code lost:
        
            if (r15.emit(r18, r2) == r3) goto L134;
         */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C2118a c2118a;
            String strA;
            List list;
            String str;
            int i14;
            r53.j jVar;
            gm0.e eVar;
            int i15;
            Object objC;
            pb2.a.d dVar2;
            ArrayList arrayList;
            yz1.d dVar3;
            List list2;
            String strA2;
            String strA3;
            Map map;
            String str2;
            Integer num;
            String str3;
            ArrayList arrayList2;
            String str4;
            String str5;
            Iterator<T> it;
            Iterator<T> it3;
            x0 x0Var;
            Object objA;
            Map map2;
            String str6;
            r53.j jVar2;
            gm0.e eVar2;
            ArrayList arrayList3;
            Integer num2;
            String str7;
            String str8;
            Object obj2;
            List list3;
            Object obj3;
            pb2.a.c cVar;
            List<pb2.a.d> list4;
            pb2.a.c cVar2;
            List<pb2.a.d> list5;
            pb2.a.c cVar3;
            List<pb2.a.d> list6;
            Object next;
            if (dVar instanceof C2118a) {
                c2118a = (C2118a) dVar;
                int i16 = c2118a.f110717b;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    c2118a.f110717b = i16 - Integer.MIN_VALUE;
                } else {
                    c2118a = new C2118a(dVar);
                }
            } else {
                c2118a = new C2118a(dVar);
            }
            Object objA2 = c2118a.f110716a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = c2118a.f110717b;
            int i18 = 7;
            e eVar3 = this.f110715b;
            if (i17 == 0) {
                o13.r.b(objA2);
                gm0.e eVar4 = (gm0.e) obj;
                pb2.a.b bVar = (pb2.a.b) eVar4.f78009b;
                if (bVar != null) {
                    Object obj4 = bVar.f136887a;
                    Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
                    strA = (map3 == null || (objC = p13.u0.c("activityList", map3)) == null) ? null : GsonUtil.a(objC);
                } else {
                    strA = null;
                }
                int i19 = e.f110614w;
                eVar3.getClass();
                if (strA != null) {
                    try {
                        List list7 = (List) new Gson().fromJson(strA, new g0().getType());
                        if (list7 == null) {
                            a2 a2Var = a2.DASHBOARD;
                            i2.f36769a.getClass();
                            i2.a.e(a2Var, "parseActivitiesData -> null server data");
                            list = null;
                        } else {
                            list = list7;
                        }
                    } catch (Exception e4) {
                        a2 a2Var2 = a2.DASHBOARD;
                        String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "parseActivitiesData -> Exception ");
                        i2.f36769a.getClass();
                        i2.a.e(a2Var2, strD);
                    }
                } else {
                    a2 a2Var3 = a2.DASHBOARD;
                    i2.f36769a.getClass();
                    i2.a.e(a2Var3, "parseActivitiesData -> null server data");
                    list = null;
                }
                com.garmin.android.apps.connectmobile.dashboard.data.datasource.j jVar3 = (com.garmin.android.apps.connectmobile.dashboard.data.datasource.j) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.dashboard.data.datasource.j.class, null, new a90.c(strA, i18), 2, null);
                r53.j jVar4 = this.f110714a;
                c2118a.f110719d = jVar4;
                c2118a.f110720e = eVar4;
                c2118a.f110721f = list;
                c2118a.f110722g = strA;
                c2118a.f110730o = 0;
                c2118a.f110731p = 0;
                c2118a.f110717b = 1;
                objA2 = jVar3.a(c2118a);
                if (objA2 != aVar) {
                    str = strA;
                    i14 = 0;
                    jVar = jVar4;
                    eVar = eVar4;
                    i15 = 0;
                }
                return aVar;
            }
            if (i17 == 1) {
                int i24 = c2118a.f110731p;
                int i25 = c2118a.f110730o;
                String str9 = c2118a.f110722g;
                list = c2118a.f110721f;
                gm0.e eVar5 = c2118a.f110720e;
                jVar = c2118a.f110719d;
                o13.r.b(objA2);
                i14 = i24;
                i15 = i25;
                str = str9;
                eVar = eVar5;
            } else if (i17 == 2) {
                i15 = c2118a.f110730o;
                str7 = c2118a.f110729n;
                str6 = c2118a.f110728m;
                str8 = c2118a.f110727l;
                dVar3 = c2118a.f110726k;
                num2 = c2118a.f110725j;
                arrayList3 = c2118a.f110724i;
                map2 = c2118a.f110723h;
                str = c2118a.f110722g;
                eVar2 = c2118a.f110720e;
                jVar2 = c2118a.f110719d;
                o13.r.b(objA2);
                str5 = (String) objA2;
                str3 = str7;
                str4 = str6;
                str2 = str8;
                num = num2;
                arrayList2 = arrayList3;
                map = map2;
                eVar = eVar2;
                jVar = jVar2;
                j70.k.c cVar4 = new j70.k.c(dVar3, str, map, str4, str2, str3, str5, arrayList2, num);
                a2 a2Var4 = a2.DASHBOARD;
                String str10 = "fetchActivitiesAndWorkouts() status[" + eVar.f78008a + "]";
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "DashboardRepository", str10);
                c2118a.f110719d = null;
                c2118a.f110720e = null;
                c2118a.f110721f = null;
                c2118a.f110722g = null;
                c2118a.f110723h = null;
                c2118a.f110724i = null;
                c2118a.f110725j = null;
                c2118a.f110726k = null;
                c2118a.f110727l = null;
                c2118a.f110728m = null;
                c2118a.f110729n = null;
                c2118a.f110730o = i15;
                c2118a.f110717b = 3;
            } else {
                if (i17 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA2);
            }
            return Unit.INSTANCE;
            Map map4 = (Map) objA2;
            T t7 = eVar.f78009b;
            pb2.a.b bVar2 = (pb2.a.b) t7;
            if (bVar2 == null || (cVar3 = bVar2.f136891e) == null || (list6 = cVar3.f136892a) == null) {
                dVar2 = null;
            } else {
                Iterator it4 = p13.h0.Z(list6).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    LocalDateTime localDateTime = ((pb2.a.d) next).f136897e;
                    if (localDateTime != null && g22.k.x(localDateTime).toLocalDate().compareTo((ReadablePartial) LocalDate.now()) < 0) {
                        break;
                    }
                }
                dVar2 = (pb2.a.d) next;
            }
            boolean z14 = dVar2 != null;
            pb2.a.b bVar3 = (pb2.a.b) t7;
            if (bVar3 == null || (cVar2 = bVar3.f136891e) == null || (list5 = cVar2.f136892a) == null) {
                arrayList = null;
            } else {
                ArrayList arrayListZ = p13.h0.Z(list5);
                arrayList = new ArrayList();
                for (Object obj5 : arrayListZ) {
                    LocalDateTime localDateTime2 = ((pb2.a.d) obj5).f136897e;
                    if (localDateTime2 != null && Days.daysBetween(localDateTime2, LocalDateTime.now(DateTimeZone.UTC)).getDays() <= 7) {
                        arrayList.add(obj5);
                    }
                }
            }
            Integer num3 = (!z14 || bVar3 == null || (cVar = bVar3.f136891e) == null || (list4 = cVar.f136892a) == null) ? null : new Integer(list4.size());
            dVar3 = eVar.f78008a;
            String strA4 = (bVar3 == null || (obj3 = bVar3.f136890d) == null) ? null : GsonUtil.a(obj3);
            if (bVar3 != null) {
                Object obj6 = bVar3.f136888b;
                list2 = list;
                List list8 = obj6 instanceof List ? (List) obj6 : null;
                strA2 = list8 != null ? GsonUtil.a(list8) : null;
                if (bVar3 != null) {
                    obj2 = bVar3.f136889c;
                    if (obj2 instanceof List) {
                        list3 = (List) obj2;
                    } else {
                        list3 = null;
                    }
                    if (list3 != null) {
                        strA3 = GsonUtil.a(list3);
                    } else {
                        strA3 = null;
                    }
                } else {
                    strA3 = null;
                }
                if (list2 != null && !list2.isEmpty()) {
                    it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            it3 = it;
                            x0Var = ((ActivityListItemDTO) it.next()).f29265g;
                            x0Var.getClass();
                            if (q91.e.c(x0Var)) {
                                c2118a.f110719d = jVar;
                                c2118a.f110720e = eVar;
                                c2118a.f110721f = null;
                                c2118a.f110722g = str;
                                c2118a.f110723h = map4;
                                c2118a.f110724i = arrayList;
                                c2118a.f110725j = num3;
                                c2118a.f110726k = dVar3;
                                c2118a.f110727l = strA4;
                                c2118a.f110728m = strA2;
                                c2118a.f110729n = strA3;
                                c2118a.f110730o = i15;
                                c2118a.f110731p = i14;
                                c2118a.f110717b = 2;
                                objA = e.a(eVar3, c2118a);
                                if (objA != aVar) {
                                    map2 = map4;
                                    objA2 = objA;
                                    str6 = strA2;
                                    jVar2 = jVar;
                                    eVar2 = eVar;
                                    arrayList3 = arrayList;
                                    num2 = num3;
                                    str7 = strA3;
                                    str8 = strA4;
                                    str5 = (String) objA2;
                                    str3 = str7;
                                    str4 = str6;
                                    str2 = str8;
                                    num = num2;
                                    arrayList2 = arrayList3;
                                    map = map2;
                                    eVar = eVar2;
                                    jVar = jVar2;
                                    j70.k.c cVar5 = new j70.k.c(dVar3, str, map, str4, str2, str3, str5, arrayList2, num);
                                    a2 a2Var5 = a2.DASHBOARD;
                                    String str11 = "fetchActivitiesAndWorkouts() status[" + eVar.f78008a + "]";
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var5, "DashboardRepository", str11);
                                    c2118a.f110719d = null;
                                    c2118a.f110720e = null;
                                    c2118a.f110721f = null;
                                    c2118a.f110722g = null;
                                    c2118a.f110723h = null;
                                    c2118a.f110724i = null;
                                    c2118a.f110725j = null;
                                    c2118a.f110726k = null;
                                    c2118a.f110727l = null;
                                    c2118a.f110728m = null;
                                    c2118a.f110729n = null;
                                    c2118a.f110730o = i15;
                                    c2118a.f110717b = 3;
                                }
                            } else {
                                it = it3;
                            }
                        }
                        return aVar;
                    }
                }
                map = map4;
                str2 = strA4;
                num = num3;
                str3 = strA3;
                arrayList2 = arrayList;
                str4 = strA2;
                str5 = null;
                j70.k.c cVar6 = new j70.k.c(dVar3, str, map, str4, str2, str3, str5, arrayList2, num);
                a2 a2Var6 = a2.DASHBOARD;
                String str12 = "fetchActivitiesAndWorkouts() status[" + eVar.f78008a + "]";
                i2.f36769a.getClass();
                i2.a.b(a2Var6, "DashboardRepository", str12);
                c2118a.f110719d = null;
                c2118a.f110720e = null;
                c2118a.f110721f = null;
                c2118a.f110722g = null;
                c2118a.f110723h = null;
                c2118a.f110724i = null;
                c2118a.f110725j = null;
                c2118a.f110726k = null;
                c2118a.f110727l = null;
                c2118a.f110728m = null;
                c2118a.f110729n = null;
                c2118a.f110730o = i15;
                c2118a.f110717b = 3;
            } else {
                list2 = list;
            }
            if (bVar3 != null) {
                obj2 = bVar3.f136889c;
                if (obj2 instanceof List) {
                    list3 = (List) obj2;
                } else {
                    list3 = null;
                }
                if (list3 != null) {
                    strA3 = GsonUtil.a(list3);
                } else {
                    strA3 = null;
                }
            } else {
                strA3 = null;
            }
            if (list2 != null) {
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        it3 = it;
                        x0Var = ((ActivityListItemDTO) it.next()).f29265g;
                        x0Var.getClass();
                        if (q91.e.c(x0Var)) {
                            c2118a.f110719d = jVar;
                            c2118a.f110720e = eVar;
                            c2118a.f110721f = null;
                            c2118a.f110722g = str;
                            c2118a.f110723h = map4;
                            c2118a.f110724i = arrayList;
                            c2118a.f110725j = num3;
                            c2118a.f110726k = dVar3;
                            c2118a.f110727l = strA4;
                            c2118a.f110728m = strA2;
                            c2118a.f110729n = strA3;
                            c2118a.f110730o = i15;
                            c2118a.f110731p = i14;
                            c2118a.f110717b = 2;
                            objA = e.a(eVar3, c2118a);
                            if (objA != aVar) {
                                map2 = map4;
                                objA2 = objA;
                                str6 = strA2;
                                jVar2 = jVar;
                                eVar2 = eVar;
                                arrayList3 = arrayList;
                                num2 = num3;
                                str7 = strA3;
                                str8 = strA4;
                                str5 = (String) objA2;
                                str3 = str7;
                                str4 = str6;
                                str2 = str8;
                                num = num2;
                                arrayList2 = arrayList3;
                                map = map2;
                                eVar = eVar2;
                                jVar = jVar2;
                                j70.k.c cVar7 = new j70.k.c(dVar3, str, map, str4, str2, str3, str5, arrayList2, num);
                                a2 a2Var7 = a2.DASHBOARD;
                                String str13 = "fetchActivitiesAndWorkouts() status[" + eVar.f78008a + "]";
                                i2.f36769a.getClass();
                                i2.a.b(a2Var7, "DashboardRepository", str13);
                                c2118a.f110719d = null;
                                c2118a.f110720e = null;
                                c2118a.f110721f = null;
                                c2118a.f110722g = null;
                                c2118a.f110723h = null;
                                c2118a.f110724i = null;
                                c2118a.f110725j = null;
                                c2118a.f110726k = null;
                                c2118a.f110727l = null;
                                c2118a.f110728m = null;
                                c2118a.f110729n = null;
                                c2118a.f110730o = i15;
                                c2118a.f110717b = 3;
                            }
                        } else {
                            it = it3;
                        }
                    }
                    return aVar;
                }
            }
            map = map4;
            str2 = strA4;
            num = num3;
            str3 = strA3;
            arrayList2 = arrayList;
            str4 = strA2;
            str5 = null;
            j70.k.c cVar8 = new j70.k.c(dVar3, str, map, str4, str2, str3, str5, arrayList2, num);
            a2 a2Var8 = a2.DASHBOARD;
            String str14 = "fetchActivitiesAndWorkouts() status[" + eVar.f78008a + "]";
            i2.f36769a.getClass();
            i2.a.b(a2Var8, "DashboardRepository", str14);
            c2118a.f110719d = null;
            c2118a.f110720e = null;
            c2118a.f110721f = null;
            c2118a.f110722g = null;
            c2118a.f110723h = null;
            c2118a.f110724i = null;
            c2118a.f110725j = null;
            c2118a.f110726k = null;
            c2118a.f110727l = null;
            c2118a.f110728m = null;
            c2118a.f110729n = null;
            c2118a.f110730o = i15;
            c2118a.f110717b = 3;
        }
    }

    public l(r53.i iVar, e eVar) {
        this.f110712a = iVar;
        this.f110713b = eVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.k.c> jVar, t13.d dVar) {
        Object objCollect = this.f110712a.collect(new a(jVar, this.f110713b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
