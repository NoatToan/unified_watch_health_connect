package kd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lcom/garmin/android/apps/connectmobile/v2;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.CachedDataSourceImpl$fetchData$2", f = "CachedDataSourceImpl.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super com.garmin.android.apps.connectmobile.v2<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f104450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super c83.a0<Object>>, Object> f104451c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lc83/a0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.CachedDataSourceImpl$fetchData$2$1", f = "CachedDataSourceImpl.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<? super c83.a0<Object>>, Object> f104453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super t13.d<? super c83.a0<Object>>, ? extends Object> lVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f104453b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f104453b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<Object>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104452a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f104452a = 1;
                Object objInvoke = this.f104453b.invoke(this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(x xVar, e23.l<? super t13.d<? super c83.a0<Object>>, ? extends Object> lVar, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f104450b = xVar;
        this.f104451c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f104450b, this.f104451c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super com.garmin.android.apps.connectmobile.v2<Object>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104449a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f104451c, null);
        this.f104449a = 1;
        x xVar = this.f104450b;
        xVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(xVar, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
