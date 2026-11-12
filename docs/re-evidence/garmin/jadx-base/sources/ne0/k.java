package ne0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.t0;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Li53/f;", "Lpe0/b;", "<anonymous>", "(Lo53/b0;)Li53/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetActivityEditDogsUseCase$invoke$2", f = "GetActivityEditDogsUseCase.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super i53.f<? extends pe0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f125485b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lje0/f;", "Lje0/c;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetActivityEditDogsUseCase$invoke$2$1", f = "GetActivityEditDogsUseCase.kt", l = {23, 23}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends v2<? extends List<? extends je0.f>>, ? extends v2<? extends List<? extends je0.c>>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.j0 f125486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f125487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f125488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f125489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f125490e;

        /* JADX INFO: renamed from: ne0.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lje0/c;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetActivityEditDogsUseCase$invoke$2$1$animals$1", f = "GetActivityEditDogsUseCase.kt", l = {22}, m = "invokeSuspend", v = 2)
        public static final class C2417a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends je0.c>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f125491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f125492b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2417a(l lVar, t13.d<? super C2417a> dVar) {
                super(2, dVar);
                this.f125492b = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2417a(this.f125492b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends je0.c>>> dVar) {
                return ((C2417a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f125491a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                me0.w wVar = this.f125492b.f125501a;
                this.f125491a = 1;
                Object objJ = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.g(wVar, "dog", null), this);
                return objJ == aVar ? aVar : objJ;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lje0/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetActivityEditDogsUseCase$invoke$2$1$dogs$1", f = "GetActivityEditDogsUseCase.kt", l = {21}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends je0.f>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f125493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f125494b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l lVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f125494b = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f125494b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends je0.f>>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f125493a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                me0.w wVar = this.f125494b.f125501a;
                this.f125493a = 1;
                Object objJ = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.p(wVar, null), this);
                return objJ == aVar ? aVar : objJ;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f125490e = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f125490e, dVar);
            aVar.f125489d = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends v2<? extends List<? extends je0.f>>, ? extends v2<? extends List<? extends je0.c>>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.j0 j0VarJ;
            Object obj2;
            o53.b0 b0Var = (o53.b0) this.f125489d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125488c;
            if (i14 != 0) {
                if (i14 == 1) {
                    j0VarJ = this.f125486a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.f125487b;
                    o13.r.b(obj);
                }
                return new o13.p(obj2, obj);
            }
            o13.r.b(obj);
            l lVar = this.f125490e;
            o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(lVar, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new C2417a(lVar, null), 3);
            this.f125489d = null;
            this.f125486a = j0VarJ;
            this.f125488c = 1;
            obj = j0VarJ2.C(this);
            if (obj != aVar) {
            }
            return aVar;
            this.f125489d = null;
            this.f125486a = null;
            this.f125487b = obj;
            this.f125488c = 2;
            Object objAwait = j0VarJ.await(this);
            if (objAwait != aVar) {
                obj2 = obj;
                obj = objAwait;
                return new o13.p(obj2, obj);
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f125485b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f125485b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super i53.f<? extends pe0.b>> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Map linkedHashMap;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125484a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f125485b, null);
            this.f125484a = 1;
            obj = o53.c0.e(aVar2, this);
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
        o13.p pVar = (o13.p) obj;
        v2 v2Var = (v2) pVar.f128594a;
        v2 v2Var2 = (v2) pVar.f128595b;
        if (!(v2Var instanceof v2.b)) {
            q2.u("Failed to fetch dogs");
            return null;
        }
        if (v2Var2 instanceof v2.b) {
            Iterable<je0.c> iterable = (Iterable) ((v2.b) v2Var2).f47386a;
            int iA = t0.a(p13.y.r(iterable, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (je0.c cVar : iterable) {
                o13.p pVar2 = new o13.p(new Long(cVar.f98482b), Boolean.valueOf(cVar.f98481a));
                linkedHashMap.put(pVar2.f128594a, pVar2.f128595b);
            }
        } else {
            linkedHashMap = p13.k0.f134949a;
            linkedHashMap.getClass();
        }
        Iterable<je0.f> iterable2 = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable2, 10));
        for (je0.f fVar : iterable2) {
            long j8 = fVar.f98501a;
            String str = fVar.f98504d;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            je0.j jVar = fVar.f98515o;
            if (jVar == null) {
                jVar = je0.j.ACTIVE;
            }
            je0.j jVar2 = jVar;
            Boolean bool = (Boolean) linkedHashMap.get(new Long(j8));
            arrayList.add(new pe0.b(j8, str2, jVar2, bool != null ? bool.booleanValue() : false));
        }
        return i53.a.j(arrayList);
    }
}
