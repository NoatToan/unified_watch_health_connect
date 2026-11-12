package jd;

import o53.b0;
import o53.d0;
import o53.e1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends v13.i implements e23.p<b0, t13.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f98321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<b0, t13.d<? super T>, Object> f98322b;

        /* JADX INFO: renamed from: jd.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        public static final class C1883a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f98323a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f98324b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o53.r<T> f98325c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e23.p<b0, t13.d<? super T>, Object> f98326d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1883a(o53.r<T> rVar, e23.p<? super b0, ? super t13.d<? super T>, ? extends Object> pVar, t13.d<? super C1883a> dVar) {
                super(2, dVar);
                this.f98325c = rVar;
                this.f98326d = pVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1883a c1883a = new C1883a(this.f98325c, this.f98326d, dVar);
                c1883a.f98324b = obj;
                return c1883a;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1883a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                o53.r<T> rVar;
                o53.r rVar2;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f98323a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b0 b0Var = (b0) this.f98324b;
                    o53.r<T> rVar3 = this.f98325c;
                    e23.p<b0, t13.d<? super T>, Object> pVar = this.f98326d;
                    try {
                        int i15 = o13.q.f128596b;
                        this.f98324b = rVar3;
                        this.f98323a = 1;
                        obj = pVar.invoke(b0Var, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        rVar = rVar3;
                    } catch (Throwable th3) {
                        th = th3;
                        rVar = rVar3;
                        int i16 = o13.q.f128596b;
                        obj = new o13.q.b(th);
                        rVar2 = rVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rVar = (o53.r) this.f98324b;
                    try {
                        o13.r.b(obj);
                        rVar = rVar;
                    } catch (Throwable th4) {
                        th = th4;
                        int i17 = o13.q.f128596b;
                        obj = new o13.q.b(th);
                        rVar2 = rVar;
                    }
                }
                int i18 = o13.q.f128596b;
                rVar2 = rVar;
                Throwable thB = o13.q.b(obj);
                if (thB == null) {
                    rVar2.p(obj);
                } else {
                    rVar2.O(thB);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super T>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f98327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o53.r<T> f98328b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o53.r<T> rVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f98328b = rVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f98328b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, Object obj) {
                return ((b) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f98327a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f98327a = 1;
                    Object objAwait = this.f98328b.await(this);
                    return objAwait == aVar ? aVar : objAwait;
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
        public a(e23.p<? super b0, ? super t13.d<? super T>, ? extends Object> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f98322b = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f98322b, dVar);
            aVar.f98321a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, Object obj) {
            return ((a) create(b0Var, (t13.d) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t13.g.a aVar2 = ((b0) this.f98321a).getF195311f().get(t13.e.f161746w0);
            aVar2.getClass();
            t13.e eVar = (t13.e) aVar2;
            o53.s sVarB = gl.b.b();
            ge1.b.S(e1.f129333a, eVar, d0.UNDISPATCHED, new C1883a(sVarB, this.f98322b, null));
            while (!sVarB.e()) {
                try {
                    return ge1.b.W(eVar, new b(sVarB, null));
                } catch (InterruptedException unused) {
                }
            }
            return sVarB.W();
        }
    }

    public static final <T> T a(e23.p<? super b0, ? super t13.d<? super T>, ? extends Object> pVar) {
        Thread.interrupted();
        return (T) ge1.b.W(t13.h.f161748a, new a(pVar, null));
    }
}
