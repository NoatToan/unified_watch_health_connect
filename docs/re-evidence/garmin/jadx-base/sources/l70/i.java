package l70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements r53.i<j70.k.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f110691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f110692b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f110693a;

        /* JADX INFO: renamed from: l70.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchActivitiesAndStreaks$lambda$1$$inlined$map$1$2", f = "DashboardRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class C2116a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f110694a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f110695b;

            public C2116a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f110694a = obj;
                this.f110695b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, e eVar) {
            this.f110693a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2116a c2116a;
            ArrayList arrayList;
            pb2.b.a aVar;
            List<pb2.b.d> list;
            pb2.b.a aVar2;
            pb2.b.c cVar;
            List<pb2.b.C2596b> list2;
            if (dVar instanceof C2116a) {
                c2116a = (C2116a) dVar;
                int i14 = c2116a.f110695b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2116a.f110695b = i14 - Integer.MIN_VALUE;
                } else {
                    c2116a = new C2116a(dVar);
                }
            } else {
                c2116a = new C2116a(dVar);
            }
            Object obj2 = c2116a.f110694a;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2116a.f110695b;
            if (i15 == 0) {
                o13.r.b(obj2);
                gm0.e eVar = (gm0.e) obj;
                yz1.d dVar2 = eVar.f78008a;
                pb2.b.g gVar = (pb2.b.g) eVar.f78009b;
                ArrayList arrayList2 = null;
                if (gVar == null || (aVar2 = gVar.f136923a) == null || (cVar = aVar2.f136912a) == null || (list2 = cVar.f136918a) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (pb2.b.C2596b c2596b : list2) {
                        if (c2596b != null) {
                            arrayList.add(c2596b);
                        }
                    }
                }
                if (gVar != null && (aVar = gVar.f136923a) != null && (list = aVar.f136913b) != null) {
                    arrayList2 = new ArrayList();
                    for (pb2.b.d dVar3 : list) {
                        if (dVar3 != null) {
                            arrayList2.add(dVar3);
                        }
                    }
                }
                j70.k.b bVar = new j70.k.b(dVar2, arrayList, arrayList2);
                a2 a2Var = a2.DASHBOARD;
                String str = "fetchActivitiesAndStreaks() status[" + bVar.f97547a + "]";
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DashboardRepository", str);
                c2116a.f110695b = 1;
                if (this.f110693a.emit(bVar, c2116a) == aVar3) {
                    return aVar3;
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

    public i(r53.i iVar, e eVar) {
        this.f110691a = iVar;
        this.f110692b = eVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.k.b> jVar, t13.d dVar) {
        Object objCollect = this.f110691a.collect(new a(jVar, this.f110692b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
