package n70;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b1 implements r53.i<j70.d<j70.s>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i[] f124034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f124035b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<Object[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f124036a;

        public a(r53.i[] iVarArr) {
            this.f124036a = iVarArr;
        }

        @Override // e23.a
        public final Object[] invoke() {
            return new Object[this.f124036a.length];
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$lambda$0$0$$inlined$combine$2$3", f = "GetDashboardItemsUseCase.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super j70.d<j70.s>>, Object[], t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f124037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f124038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object[] f124039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c0 f124040d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t13.d dVar, c0 c0Var) {
            super(3, dVar);
            this.f124040d = c0Var;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super j70.d<j70.s>> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
            b bVar = new b(dVar, this.f124040d);
            bVar.f124038b = jVar;
            bVar.f124039c = objArr;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f124037a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar = this.f124038b;
                Object[] objArr = this.f124039c;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                Object obj6 = objArr[4];
                boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
                int iIntValue = ((Number) obj6).intValue();
                List list = (List) obj5;
                j70.k.g gVar = (j70.k.g) obj4;
                j70.k.c cVar = (j70.k.c) obj3;
                j70.k.f fVar = (j70.k.f) obj2;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                String str = "GetDashboardItemsUseCase lst7dStats " + (fVar != null ? fVar.f97565a : null) + "  " + list;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var, str);
                j70.d dVar = new j70.d(yz1.e.a(yz1.e.c(p13.x.k(fVar != null ? fVar.f97565a : null, cVar != null ? cVar.f97550a : null, gVar != null ? gVar.f97591a : null), fVar != null ? fVar.f97565a : null), new t0(fVar, cVar)), new j70.s(zBooleanValue, iIntValue, list, fVar != null ? fVar.f97566b : null, fVar != null ? fVar.G : null, fVar != null ? fVar.A : null, fVar != null ? fVar.H : null, cVar != null ? cVar.f97554e : null, cVar != null ? cVar.f97555f : null, cVar != null ? cVar.f97551b : null, gVar != null ? gVar.f97592b : null, fVar != null ? fVar.N : null, fVar != null ? fVar.Q : null, cVar != null ? cVar.f97557h : null));
                this.f124038b = null;
                this.f124039c = null;
                this.f124037a = 1;
                if (jVar.emit(dVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public b1(r53.i[] iVarArr, c0 c0Var) {
        this.f124034a = iVarArr;
        this.f124035b = c0Var;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super j70.d<j70.s>> jVar, t13.d dVar) {
        r53.i[] iVarArr = this.f124034a;
        Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null, this.f124035b), jVar, dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }
}
