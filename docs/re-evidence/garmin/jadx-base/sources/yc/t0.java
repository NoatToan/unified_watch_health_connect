package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.jvm.kt", l = {53}, m = "invokeSuspend")
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f196471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0<Object, Object> f196472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h3.a<Object> f196473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1 f196474e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.jvm.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h3.b<Object, Object> f196475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0<Object, Object> f196476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c1 f196477c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h3.b<Object, Object> bVar, s0<Object, Object> s0Var, c1 c1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f196475a = bVar;
            this.f196476b = s0Var;
            this.f196477c = c1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f196475a, this.f196476b, this.f196477c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            h3.b<Object, Object> bVar = this.f196475a;
            boolean z14 = bVar instanceof h3.b.c;
            c1 c1Var = this.f196477c;
            s0<Object, Object> s0Var = this.f196476b;
            if (z14) {
                s0Var.a(c1Var, (h3.b.c) bVar);
            } else if (bVar instanceof h3.b.a) {
                Throwable th3 = ((h3.b.a) bVar).f196013a;
                if (!s0Var.f196399h.get()) {
                    s0Var.f196400i.b(c1Var, new z0.a(th3));
                }
            } else if (bVar instanceof h3.b.C3657b) {
                s0Var.f196394c.d();
                s0Var.f196399h.set(true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(s0<Object, Object> s0Var, h3.a<Object> aVar, c1 c1Var, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f196472c = s0Var;
        this.f196473d = aVar;
        this.f196474e = c1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t0 t0Var = new t0(this.f196472c, this.f196473d, this.f196474e, dVar);
        t0Var.f196471b = obj;
        return t0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196470a;
        s0<Object, Object> s0Var = this.f196472c;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.b0 b0Var2 = (o53.b0) this.f196471b;
            h3<Object, Object> h3Var = s0Var.f196394c;
            this.f196471b = b0Var2;
            this.f196470a = 1;
            Object objE = h3Var.e(this.f196473d, this);
            if (objE == aVar) {
                return aVar;
            }
            b0Var = b0Var2;
            obj = objE;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b0Var = (o53.b0) this.f196471b;
            o13.r.b(obj);
        }
        h3.b bVar = (h3.b) obj;
        if (s0Var.f196394c.f196005a.f196327e) {
            s0Var.f196399h.set(true);
            return Unit.INSTANCE;
        }
        ge1.b.T(b0Var, s0Var.f196395d, null, new a(bVar, s0Var, this.f196474e, null), 2);
        return Unit.INSTANCE;
    }
}
