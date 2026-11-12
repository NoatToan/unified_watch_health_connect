package fg2;

import com.google.android.gms.wallet.WalletConstants;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository$registerSessionListener$1$1$1", f = "LiveActivityRepository.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ of2.b f71531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f71532c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f71533a;

        /* JADX INFO: renamed from: fg2.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository$registerSessionListener$1$1$1$1$1$1", f = "LiveActivityRepository.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend", v = 2)
        public static final class C1457a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f71534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f71535b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ tf2.c f71536c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1457a(f fVar, tf2.c cVar, t13.d<? super C1457a> dVar) {
                super(2, dVar);
                this.f71535b = fVar;
                this.f71536c = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1457a(this.f71535b, this.f71536c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1457a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f71534a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    tf2.f fVar = this.f71536c.f164470b;
                    this.f71534a = 1;
                    if (f.c(this.f71535b, fVar, this) == aVar) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository$registerSessionListener$1$1$1$1$1$2", f = "LiveActivityRepository.kt", l = {416}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f71537a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f71538b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ tf2.c f71539c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar, tf2.c cVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f71538b = fVar;
                this.f71539c = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f71538b, this.f71539c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f71537a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    tf2.e eVar = this.f71539c.f164469a;
                    this.f71537a = 1;
                    if (f.b(this.f71538b, eVar, this) == aVar) {
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

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository$registerSessionListener$1$1$1$1", f = "LiveActivityRepository.kt", l = {408}, m = "emit", v = 2)
        public static final class c extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public of2.b0 f71540a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f71541b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a<T> f71542c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f71543d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(a<? super T> aVar, t13.d<? super c> dVar) {
                super(dVar);
                this.f71542c = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f71541b = obj;
                this.f71543d |= Integer.MIN_VALUE;
                return this.f71542c.emit(null, this);
            }
        }

        public a(f fVar) {
            this.f71533a = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(of2.b0 b0Var, t13.d<? super Unit> dVar) {
            c cVar;
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i14 = cVar.f71543d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    cVar.f71543d = i14 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(this, dVar);
                }
            } else {
                cVar = new c(this, dVar);
            }
            Object obj = cVar.f71541b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = cVar.f71543d;
            f fVar = this.f71533a;
            if (i15 == 0) {
                o13.r.b(obj);
                zg2.c.f204692a.getClass();
                zg2.c.d("LiveActivityRepository", "collect new sessionData " + b0Var);
                fVar.q(false);
                fVar.f71482f.setValue(b0Var);
                cVar.f71540a = b0Var;
                cVar.f71543d = 1;
                if (f.a(fVar, cVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var = cVar.f71540a;
                o13.r.b(obj);
            }
            zf2.f fVar2 = b0Var.f131755l.f204649a;
            if (fVar2 == null) {
                lf2.c.f112140a.getClass();
                fVar2 = lf2.c.f112141b;
            }
            fVar.D = fVar2;
            fVar.E = b0Var.f131755l.f204650b;
            tf2.c cVar2 = b0Var.f131754k;
            x53.c cVar3 = s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            ge1.b.T(o53.c0.a(t1Var), null, null, new C1457a(fVar, cVar2, null), 3);
            ge1.b.T(o53.c0.a(t1Var), null, null, new b(fVar, cVar2, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(of2.b bVar, f fVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f71531b = bVar;
        this.f71532c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f71531b, this.f71532c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71530a;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = this.f71531b.f131736o;
            a aVar2 = new a(this.f71532c);
            this.f71530a = 1;
            if (p2Var.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
