package ne0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lje0/f;", "Lje0/i;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetActivityDetailsDogsUseCase$fetchOwnerDogs$2", f = "GetActivityDetailsDogsUseCase.kt", l = {38, 38}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super o13.p<? extends v2<? extends List<? extends je0.f>>, ? extends v2<? extends List<? extends je0.i>>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f125459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f125460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f125462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f125463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<Long> f125464f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lje0/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetActivityDetailsDogsUseCase$fetchOwnerDogs$2$dogs$1", f = "GetActivityDetailsDogsUseCase.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends je0.f>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f125466b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f125466b = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f125466b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends je0.f>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125465a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            me0.w wVar = this.f125466b.f125480a;
            this.f125465a = 1;
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.p(wVar, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lje0/i;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetActivityDetailsDogsUseCase$fetchOwnerDogs$2$stats$1", f = "GetActivityDetailsDogsUseCase.kt", l = {37}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends je0.i>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f125468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<Long> f125469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, List<Long> list, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f125468b = jVar;
            this.f125469c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f125468b, this.f125469c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends je0.i>>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125467a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            me0.w wVar = this.f125468b.f125480a;
            this.f125467a = 1;
            Object objD = me0.w.d(wVar, this.f125469c, this);
            return objD == aVar ? aVar : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, List<Long> list, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f125463e = jVar;
        this.f125464f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f125463e, this.f125464f, dVar);
        hVar.f125462d = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o13.p<? extends v2<? extends List<? extends je0.f>>, ? extends v2<? extends List<? extends je0.i>>>> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        Object obj2;
        o53.b0 b0Var = (o53.b0) this.f125462d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125461c;
        if (i14 != 0) {
            if (i14 == 1) {
                j0VarJ = this.f125459a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.f125460b;
                o13.r.b(obj);
            }
            return new o13.p(obj2, obj);
        }
        o13.r.b(obj);
        j jVar = this.f125463e;
        o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(jVar, null), 3);
        j0VarJ = ge1.b.j(b0Var, null, null, new b(jVar, this.f125464f, null), 3);
        this.f125462d = null;
        this.f125459a = j0VarJ;
        this.f125461c = 1;
        obj = j0VarJ2.C(this);
        if (obj != aVar) {
        }
        return aVar;
        this.f125462d = null;
        this.f125459a = null;
        this.f125460b = obj;
        this.f125461c = 2;
        Object objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            obj2 = obj;
            obj = objAwait;
            return new o13.p(obj2, obj);
        }
        return aVar;
    }
}
