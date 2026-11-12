package n70;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00070\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lpb2/b$b;", "last7dActivities", "Lj70/k$d;", "activityTrendsCheckedPromptTypes", "Lo70/c;", "dismissedTrends", "Lo13/p;", "Lr70/s;", "<anonymous>", "(Ljava/util/List;Lj70/k$d;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$getActivityTrendPromptWidgets$2", f = "GetKeyStatsItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s2 extends v13.i implements e23.r<List<? extends pb2.b.C2596b>, j70.k.d, List<? extends o70.c>, t13.d<? super List<? extends o13.p<? extends o70.c, ? extends r70.s>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f124547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j70.k.d f124548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f124549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2 f124550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r53.i<List<pb2.b.C2596b>> f124551e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r53.i<k70.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f124552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o70.c f124553b;

        /* JADX INFO: renamed from: n70.s2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2378a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f124554a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o70.c f124555b;

            /* JADX INFO: renamed from: n70.s2$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$getActivityTrendPromptWidgets$2$invokeSuspend$lambda$3$$inlined$map$1$2", f = "GetKeyStatsItemsUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C2379a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f124556a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f124557b;

                public C2379a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f124556a = obj;
                    this.f124557b |= Integer.MIN_VALUE;
                    return C2378a.this.emit(null, this);
                }
            }

            public C2378a(r53.j jVar, o70.c cVar) {
                this.f124554a = jVar;
                this.f124555b = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2379a c2379a;
                if (dVar instanceof C2379a) {
                    c2379a = (C2379a) dVar;
                    int i14 = c2379a.f124557b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2379a.f124557b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2379a = new C2379a(dVar);
                    }
                } else {
                    c2379a = new C2379a(dVar);
                }
                Object obj2 = c2379a.f124556a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2379a.f124557b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    k70.a aVar2 = new k70.a(new yz1.d(yz1.u.SUCCESS, null, false, 6, null), this.f124555b, null, null, true);
                    c2379a.f124557b = 1;
                    if (this.f124554a.emit(aVar2, c2379a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(r53.i iVar, o70.c cVar) {
            this.f124552a = iVar;
            this.f124553b = cVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super k70.a> jVar, t13.d dVar) {
            Object objCollect = this.f124552a.collect(new C2378a(jVar, this.f124553b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2(p2 p2Var, r53.i<? extends List<pb2.b.C2596b>> iVar, t13.d<? super s2> dVar) {
        super(4, dVar);
        this.f124550d = p2Var;
        this.f124551e = iVar;
    }

    @Override // e23.r
    public final Object invoke(List<? extends pb2.b.C2596b> list, j70.k.d dVar, List<? extends o70.c> list2, t13.d<? super List<? extends o13.p<? extends o70.c, ? extends r70.s>>> dVar2) {
        s2 s2Var = new s2(this.f124550d, this.f124551e, dVar2);
        s2Var.f124547a = list;
        s2Var.f124548b = dVar;
        s2Var.f124549c = list2;
        return s2Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b0 A[PHI: r6
      0x00b0: PHI (r6v15 am.x0) = (r6v8 am.x0), (r6v9 am.x0), (r6v10 am.x0), (r6v11 am.x0), (r6v12 am.x0), (r6v13 am.x0), (r6v14 am.x0) binds: [B:33:0x00ae, B:36:0x00b8, B:39:0x00c1, B:42:0x00ca, B:45:0x00d3, B:48:0x00dc, B:51:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p2 p2Var;
        ?? arrayList;
        Set<o70.c> set;
        List list = this.f124547a;
        j70.k.d dVar = this.f124548b;
        List list2 = this.f124549c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        StringBuilder sb3 = new StringBuilder("getActivityTrendPromptWidgets dismissedTrends[");
        sb3.append(list2);
        sb3.append("] activityTrendsCheckedPromptTypes[");
        sb3.append(dVar);
        sb3.append("] activities[");
        String strC = u62.z.c(sb3, list, "] ");
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strC);
        Set<o70.c> set2 = (dVar == null || (set = dVar.f97559a) == null) ? p13.j0.f134944a : set;
        w13.c cVar = o70.c.f129940l;
        ArrayList arrayListK = n23.j.k(cVar);
        p13.c.b bVar = new p13.c.b();
        while (true) {
            boolean zHasNext = bVar.hasNext();
            p2Var = this.f124550d;
            if (!zHasNext) {
                break;
            }
            Object next = bVar.next();
            o70.c cVar2 = (o70.c) next;
            if (!p2Var.f124487e.contains(cVar2) && !list2.contains(cVar2) && set2.contains(cVar2)) {
                arrayListK.add(next);
            }
        }
        if (p2Var.f124487e.size() < 4) {
            List<pb2.b.C2596b> listB1 = list != null ? p13.h0.b1(list) : null;
            if (listB1 == null) {
                listB1 = p13.j0.f134944a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (pb2.b.C2596b c2596b : listB1) {
                pb2.b.e eVar = c2596b.f136915b;
                String str = eVar != null ? eVar.f136921a : null;
                am.x0 x0Var = am.x0.f4346x;
                am.x0 x0VarL = am.z0.l(x0Var, str);
                am.x0 x0Var2 = am.x0.f4308n;
                if (x0VarL.y(x0Var2)) {
                    x0Var = x0Var2;
                } else {
                    x0Var2 = am.x0.f4312o;
                    if (x0VarL.y(x0Var2)) {
                        x0Var = x0Var2;
                    } else {
                        x0Var2 = am.x0.f4324r;
                        if (x0VarL.y(x0Var2)) {
                            x0Var = x0Var2;
                        } else {
                            x0Var2 = am.x0.f4331t;
                            if (x0VarL.y(x0Var2)) {
                                x0Var = x0Var2;
                            } else {
                                x0Var2 = am.x0.f4268a3;
                                if (x0VarL.y(x0Var2)) {
                                    x0Var = x0Var2;
                                } else {
                                    x0Var2 = am.x0.C;
                                    if (x0VarL.y(x0Var2)) {
                                        x0Var = x0Var2;
                                    } else {
                                        x0Var2 = am.x0.f4316p;
                                        if (x0VarL.y(x0Var2)) {
                                            x0Var = x0Var2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                String str2 = x0Var.f4358a;
                Collection collection = (List) linkedHashMap.get(str2);
                if (collection == null) {
                    collection = p13.j0.f134944a;
                }
                ArrayList arrayListD1 = p13.h0.d1(collection);
                arrayListD1.add(c2596b);
                linkedHashMap.put(str2, arrayListD1);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(p13.t0.a(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                List list3 = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    LocalDateTime localDateTime = ((pb2.b.C2596b) it.next()).f136914a;
                    LocalDate localDate = localDateTime != null ? localDateTime.toLocalDate() : null;
                    if (localDate != null) {
                        arrayList2.add(localDate);
                    }
                }
                linkedHashMap2.put(key, new Integer(p13.h0.b1(p13.h0.f1(arrayList2)).size()));
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayListK) {
                if (((Number) linkedHashMap2.getOrDefault(((o70.c) obj2).d(), new Integer(0))).intValue() >= 2) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        ArrayList arrayList3 = new ArrayList();
        for (o70.c cVar3 : (Iterable) arrayList) {
            r70.s sVarB = m70.f.b(new a(this.f124551e, cVar3), o70.o.ACTIVITY_SUMMARY.a());
            o13.p pVar = sVarB != null ? new o13.p(cVar3, sVarB) : null;
            if (pVar != null) {
                arrayList3.add(pVar);
            }
        }
        return arrayList3;
    }
}
