package kd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lcom/garmin/android/apps/connectmobile/v2;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.CachedDataSourceImpl$fetchNullableData$2", f = "CachedDataSourceImpl.kt", l = {51}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.l<t13.d<? super com.garmin.android.apps.connectmobile.v2<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f103962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super c83.a0<Object>>, Object> f103963c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lc83/a0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.CachedDataSourceImpl$fetchNullableData$2$1", f = "CachedDataSourceImpl.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<? super c83.a0<Object>>, Object> f103965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super t13.d<? super c83.a0<Object>>, ? extends Object> lVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f103965b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f103965b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<Object>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f103964a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f103964a = 1;
                Object objInvoke = this.f103965b.invoke(this);
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
    public a0(x xVar, e23.l<? super t13.d<? super c83.a0<Object>>, ? extends Object> lVar, t13.d<? super a0> dVar) {
        super(1, dVar);
        this.f103962b = xVar;
        this.f103963c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a0(this.f103962b, this.f103963c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super com.garmin.android.apps.connectmobile.v2<Object>> dVar) {
        return ((a0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f103961a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f103963c, null);
        this.f103961a = 1;
        Object objC = this.f103962b.C(aVar2, this);
        return objC == aVar ? aVar : objC;
    }
}
