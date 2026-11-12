package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend", v = 1)
public final class t extends v13.i implements e23.p<q53.t<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f8030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.b f8031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f8032e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.i<Object> f8034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q53.t<Object> f8035c;

        /* JADX INFO: renamed from: androidx.lifecycle.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C0111a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q53.t<T> f8036a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0111a(q53.t<? super T> tVar) {
                this.f8036a = tVar;
            }

            @Override // r53.j
            public final Object emit(T t7, t13.d<? super Unit> dVar) {
                Object objH = this.f8036a.h(t7, dVar);
                return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r53.i<Object> iVar, q53.t<Object> tVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f8034b = iVar;
            this.f8035c = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f8034b, this.f8035c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f8033a;
            if (i14 == 0) {
                o13.r.b(obj);
                C0111a c0111a = new C0111a(this.f8035c);
                this.f8033a = 1;
                if (this.f8034b.collect(c0111a, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b0 b0Var, b0.b bVar, r53.i<Object> iVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f8030c = b0Var;
        this.f8031d = bVar;
        this.f8032e = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f8030c, this.f8031d, this.f8032e, dVar);
        tVar.f8029b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<Object> tVar, t13.d<? super Unit> dVar) {
        return ((t) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f8028a;
        if (i14 == 0) {
            o13.r.b(obj);
            q53.t tVar2 = (q53.t) this.f8029b;
            a aVar2 = new a(this.f8032e, tVar2, null);
            this.f8029b = tVar2;
            this.f8028a = 1;
            if (h1.a(this.f8030c, this.f8031d, aVar2, this) == aVar) {
                return aVar;
            }
            tVar = tVar2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tVar = (q53.t) this.f8029b;
            o13.r.b(obj);
        }
        tVar.q(null);
        return Unit.INSTANCE;
    }
}
