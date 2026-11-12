package by0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcy0/c;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getActivityResources$2$newResources$2$1", f = "MultiDayActivityDataStore.kt", l = {359}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends cy0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q<o53.b0, List<Long>, t13.d<? super List<cy0.c>>, Object> f21945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<Long> f21946d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcy0/c;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getActivityResources$2$newResources$2$1$result$1", f = "MultiDayActivityDataStore.kt", l = {357}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends cy0.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.q<o53.b0, List<Long>, t13.d<? super List<cy0.c>>, Object> f21949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<Long> f21950d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.q<? super o53.b0, ? super List<Long>, ? super t13.d<? super List<cy0.c>>, ? extends Object> qVar, List<Long> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21949c = qVar;
            this.f21950d = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f21949c, this.f21950d, dVar);
            aVar.f21948b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends cy0.c>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f21948b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21947a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f21948b = null;
            this.f21947a = 1;
            Object objInvoke = this.f21949c.invoke(b0Var, this.f21950d, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(e23.q<? super o53.b0, ? super List<Long>, ? super t13.d<? super List<cy0.c>>, ? extends Object> qVar, List<Long> list, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f21945c = qVar;
        this.f21946d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m0 m0Var = new m0(this.f21945c, this.f21946d, dVar);
        m0Var.f21944b = obj;
        return m0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends cy0.c>> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f21944b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21943a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        x53.c cVar = o53.s0.f129406a;
        o53.j0 j0VarJ = ge1.b.j(b0Var, x53.b.f189152a, null, new a(this.f21945c, this.f21946d, null), 2);
        this.f21944b = null;
        this.f21943a = 1;
        Object objC = j0VarJ.C(this);
        return objC == aVar ? aVar : objC;
    }
}
