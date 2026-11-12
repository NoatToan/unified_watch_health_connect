package ix;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.n;
import p3.o0;
import p3.p0;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsScreenKt$BodyBatteryReportsScreen$1$2$1$3$1$1$1", f = "BodyBatteryReportsScreen.kt", l = {154}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f95607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f95608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f95609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u82.f<bx.a> f95610e;

        /* JADX INFO: renamed from: ix.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsScreenKt$BodyBatteryReportsScreen$1$2$1$3$1$1$1$3", f = "BodyBatteryReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1827a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f95611a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u82.f<bx.a> f95612b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1827a(j jVar, u82.f<bx.a> fVar, t13.d<? super C1827a> dVar) {
                super(2, dVar);
                this.f95611a = jVar;
                this.f95612b = fVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1827a(this.f95611a, this.f95612b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((C1827a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                bx.a aVarA = this.f95612b.a();
                j jVar = this.f95611a;
                jVar.f95630j.setValue(aVarA);
                p2 p2Var = jVar.f95627g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, l.a((l) value, false, null, null, false, false, false, false, false, null, 503)));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f95613a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f95614b;

            /* JADX INFO: renamed from: ix.i$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1828a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f95615a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f95616b;

                /* JADX INFO: renamed from: ix.i$a$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.BodyBatteryReportsScreenKt$BodyBatteryReportsScreen$1$2$1$3$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "BodyBatteryReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C1829a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f95617a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f95618b;

                    public C1829a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f95617a = obj;
                        this.f95618b |= Integer.MIN_VALUE;
                        return C1828a.this.emit(null, this);
                    }
                }

                public C1828a(r53.j jVar, o82.a aVar) {
                    this.f95615a = jVar;
                    this.f95616b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C1829a c1829a;
                    if (dVar instanceof C1829a) {
                        c1829a = (C1829a) dVar;
                        int i14 = c1829a.f95618b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c1829a.f95618b = i14 - Integer.MIN_VALUE;
                        } else {
                            c1829a = new C1829a(dVar);
                        }
                    } else {
                        c1829a = new C1829a(dVar);
                    }
                    Object obj2 = c1829a.f95617a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c1829a.f95618b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f95616b)) {
                            c1829a.f95618b = 1;
                            if (this.f95615a.emit(obj, c1829a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(r53.i iVar, o82.a aVar) {
                this.f95613a = iVar;
                this.f95614b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f95613a.collect(new C1828a(jVar, this.f95614b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n82.f fVar, o82.a aVar, j jVar, u82.f<bx.a> fVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f95607b = fVar;
            this.f95608c = aVar;
            this.f95609d = jVar;
            this.f95610e = fVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f95607b, this.f95608c, this.f95609d, this.f95610e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f95606a;
            if (i14 == 0) {
                r.b(obj);
                b bVar = new b(p0.s(new d52.p(this.f95607b, 6)), this.f95608c);
                C1827a c1827a = new C1827a(this.f95609d, this.f95610e, null);
                this.f95606a = 1;
                if (r53.s.k(bVar, c1827a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95620a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f95620a = iArr;
        }
    }

    public static final void a(j jVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        jVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1993770523);
        int i15 = (o0VarE.r(jVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(-1628092635, new g(jVar, aVar), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(jVar, aVar, i14);
        }
    }
}
