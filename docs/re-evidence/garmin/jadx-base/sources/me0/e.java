package me0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "", "Lps/m;", "<anonymous>", "(Lo53/b0;)Ljava/util/Map;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getActivitiesPolylines$2", f = "DogsRepository.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Map<Long, ? extends ps.m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f117998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Long> f117999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f118000d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/n;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getActivitiesPolylines$2$1$1", f = "DogsRepository.kt", l = {174}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super o13.p<? extends Long, ? extends v2<? extends ps.n>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f118001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f118002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f118003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w f118004d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, w wVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f118003c = j8;
            this.f118004d = wVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f118003c, this.f118004d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends Long, ? extends v2<? extends ps.n>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Long l14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118002b;
            if (i14 == 0) {
                o13.r.b(obj);
                long j8 = this.f118003c;
                Long l15 = new Long(j8);
                this.f118001a = l15;
                this.f118002b = 1;
                int i15 = w.f118065e;
                w wVar = this.f118004d;
                wVar.getClass();
                Object objJ = f0.J(wVar, new f(wVar, j8, null), this);
                if (objJ == aVar) {
                    return aVar;
                }
                l14 = l15;
                obj = objJ;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l14 = this.f118001a;
                o13.r.b(obj);
            }
            return new o13.p(l14, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<Long> list, w wVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f117999c = list;
        this.f118000d = wVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f117999c, this.f118000d, dVar);
        eVar.f117998b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Map<Long, ? extends ps.m>> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ps.n nVar;
        ps.m activityPolylineDMO;
        b0 b0Var = (b0) this.f117998b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f117997a;
        if (i14 == 0) {
            o13.r.b(obj);
            List<Long> list = this.f117999c;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ge1.b.j(b0Var, null, null, new a(((Number) it.next()).longValue(), this.f118000d, null), 3));
            }
            this.f117998b = null;
            this.f117997a = 1;
            obj = g8.i.o(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (o13.p pVar : (Iterable) obj) {
            long jLongValue = ((Number) pVar.f128594a).longValue();
            v2 v2Var = (v2) pVar.f128595b;
            v2.b bVar = v2Var instanceof v2.b ? (v2.b) v2Var : null;
            o13.p pVar2 = (bVar == null || (nVar = (ps.n) bVar.f47386a) == null || (activityPolylineDMO = nVar.getActivityPolylineDMO()) == null) ? null : new o13.p(new Long(jLongValue), activityPolylineDMO);
            if (pVar2 != null) {
                arrayList2.add(pVar2);
            }
        }
        return u0.l(arrayList2);
    }
}
