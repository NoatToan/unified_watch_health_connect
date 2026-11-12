package xt1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.m1;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxt1/k;", "Lo53/b0;", "Liu1/a;", "", "athletePlanId", "Liu1/j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLiu1/j;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements b0, iu1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f192175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iu1.j f192176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gu1.b f192177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public iu1.b f192178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1 f192179e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.biz.tasks.RemoveAtpTask$execute$1", f = "RemoveAtpTask.kt", l = {30, 32, 37}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f192180a;

        /* JADX INFO: renamed from: xt1.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.biz.tasks.RemoveAtpTask$execute$1$1", f = "RemoveAtpTask.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C3584a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f192182a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3584a(k kVar, t13.d<? super C3584a> dVar) {
                super(2, dVar);
                this.f192182a = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3584a(this.f192182a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3584a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                k kVar = this.f192182a;
                kVar.f192176b.c("");
                iu1.b bVar = kVar.f192178d;
                if (bVar != null) {
                    bVar.d(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.biz.tasks.RemoveAtpTask$execute$1$2", f = "RemoveAtpTask.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f192183a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k kVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f192183a = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f192183a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                k kVar = this.f192183a;
                iu1.j jVar = kVar.f192176b;
                com.garmin.android.library.backgroundtaskmanagement.b.c cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
                iu1.j.a(cVar);
                iu1.b bVar = kVar.f192178d;
                if (bVar != null) {
                    bVar.c(cVar);
                }
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (ge1.b.e0(r10, r1, r9) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        
            if (ge1.b.e0(r10, r1, r9) == r0) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f192180a;
            k kVar = k.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2 && i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            gu1.b bVar = kVar.f192177c;
            long j8 = kVar.f192175a;
            this.f192180a = 1;
            bVar.getClass();
            obj = f0.J(bVar, new gu1.k(bVar, j8, null), this);
            if (obj != aVar) {
            }
            return aVar;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                x53.c cVar = s0.f129406a;
                t1 t1Var = o.f168762a;
                C3584a c3584a = new C3584a(kVar, null);
                this.f192180a = 2;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                x53.c cVar2 = s0.f129406a;
                t1 t1Var2 = o.f168762a;
                b bVar2 = new b(kVar, null);
                this.f192180a = 3;
            }
        }
    }

    public k(long j8, iu1.j jVar) {
        jVar.getClass();
        this.f192175a = j8;
        this.f192176b = jVar;
        this.f192177c = gu1.b.a.a(gu1.b.f79047b);
        this.f192179e = g8.i.c();
    }

    @Override // iu1.a
    public final void a(iu1.b bVar) {
        this.f192178d = bVar;
    }

    @Override // iu1.a
    public final void cancel() {
        this.f192179e.c(null);
    }

    @Override // iu1.a
    public final void execute() {
        ge1.b.T(this, null, null, new a(null), 3);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f192179e);
    }
}
