package by0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcy0/k;", "<anonymous>", "(Lo53/b0;)Lcy0/k;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getEpicDetails$2$1", f = "MultiDayActivityDataStore.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.p<o53.b0, t13.d<? super cy0.k>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<o53.b0, t13.d<? super cy0.k>, Object> f22143c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcy0/k;", "<anonymous>", "(Lo53/b0;)Lcy0/k;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getEpicDetails$2$1$result$1", f = "MultiDayActivityDataStore.kt", l = {77}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super cy0.k>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<o53.b0, t13.d<? super cy0.k>, Object> f22146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super o53.b0, ? super t13.d<? super cy0.k>, ? extends Object> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f22146c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f22146c, dVar);
            aVar.f22145b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super cy0.k> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f22145b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f22144a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f22145b = null;
            this.f22144a = 1;
            Object objInvoke = this.f22146c.invoke(b0Var, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(e23.p<? super o53.b0, ? super t13.d<? super cy0.k>, ? extends Object> pVar, t13.d<? super y0> dVar) {
        super(2, dVar);
        this.f22143c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y0 y0Var = new y0(this.f22143c, dVar);
        y0Var.f22142b = obj;
        return y0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super cy0.k> dVar) {
        return ((y0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f22142b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f22141a;
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
        o53.j0 j0VarJ = ge1.b.j(b0Var, x53.b.f189152a, null, new a(this.f22143c, null), 2);
        this.f22142b = null;
        this.f22141a = 1;
        Object objC = j0VarJ.C(this);
        return objC == aVar ? aVar : objC;
    }
}
