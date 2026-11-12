package n70;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements r53.i<List<? extends o70.i>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f124160a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f124161a;

        /* JADX INFO: renamed from: n70.e0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$getDashboardEssentialsStats$$inlined$map$1$2", f = "GetDashboardItemsUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2344a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f124162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f124163b;

            public C2344a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f124162a = obj;
                this.f124163b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar) {
            this.f124161a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2344a c2344a;
            ArrayList arrayList;
            List<j70.b> listC;
            if (dVar instanceof C2344a) {
                c2344a = (C2344a) dVar;
                int i14 = c2344a.f124163b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2344a.f124163b = i14 - Integer.MIN_VALUE;
                } else {
                    c2344a = new C2344a(dVar);
                }
            } else {
                c2344a = new C2344a(dVar);
            }
            Object obj2 = c2344a.f124162a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2344a.f124163b;
            if (i15 == 0) {
                o13.r.b(obj2);
                j70.c dailyStatsConfig = ((j70.f) obj).getDailyStatsConfig();
                if (dailyStatsConfig == null || (listC = dailyStatsConfig.c()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (j70.b bVar : listC) {
                        o70.i.a aVar2 = o70.i.f129998f;
                        String cardType = bVar.getCardType();
                        aVar2.getClass();
                        o70.i iVarA = o70.i.a.a(cardType);
                        if (iVarA != null) {
                            arrayList.add(iVarA);
                        }
                    }
                }
                c2344a.f124163b = 1;
                if (this.f124161a.emit(arrayList, c2344a) == aVar) {
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

    public e0(r53.i iVar) {
        this.f124160a = iVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super List<? extends o70.i>> jVar, t13.d dVar) {
        Object objCollect = this.f124160a.collect(new a(jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
