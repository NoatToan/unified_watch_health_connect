package by0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/v2;", "Lj61/j;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$fetchCyclingAbilityInChunks$results$1", f = "MultiDayActivityDataSource.kt", l = {361}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends v2<? extends j61.j>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<o13.p<b63.o, b63.o>> f21857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ by0.a f21858d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lj61/j;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$fetchCyclingAbilityInChunks$results$1$1$1", f = "MultiDayActivityDataSource.kt", l = {359}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends j61.j>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ by0.a f21860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f21861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b63.o f21862d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(by0.a aVar, b63.o oVar, b63.o oVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21860b = aVar;
            this.f21861c = oVar;
            this.f21862d = oVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f21860b, this.f21861c, this.f21862d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends j61.j>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21859a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            int i15 = by0.a.f21686d;
            ey0.g0 g0VarP = this.f21860b.p();
            this.f21859a = 1;
            g0VarP.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(g0VarP, new ey0.i(g0VarP, this.f21861c, this.f21862d, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List<o13.p<b63.o, b63.o>> list, by0.a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f21857c = list;
        this.f21858d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f21857c, this.f21858d, dVar);
        hVar.f21856b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends v2<? extends j61.j>>> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f21856b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21855a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List<o13.p<b63.o, b63.o>> list = this.f21857c;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            o13.p pVar = (o13.p) it.next();
            arrayList.add(ge1.b.j(b0Var, null, null, new a(this.f21858d, (b63.o) pVar.f128594a, (b63.o) pVar.f128595b, null), 3));
        }
        this.f21856b = null;
        this.f21855a = 1;
        Object objO = g8.i.o(arrayList, this);
        return objO == aVar ? aVar : objO;
    }
}
