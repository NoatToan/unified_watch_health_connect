package wi2;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.l0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y1;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.g2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwi2/p;", "Landroidx/lifecycle/u1;", "", Action.KEY_ATTRIBUTE, "Landroidx/lifecycle/b0;", "initialLifecycle", "<init>", "(Ljava/lang/Object;Landroidx/lifecycle/b0;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f185680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f185681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f185682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f185683d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.auth.cmc.presentation.ViewModelStoreOwnerViewModel$1", f = "ViewModelStore.kt", l = {50}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185684a;

        /* JADX INFO: renamed from: wi2.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/b0$a;", "it", "", "<anonymous>", "(Landroidx/lifecycle/b0$a;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.auth.cmc.presentation.ViewModelStoreOwnerViewModel$1$2", f = "ViewModelStore.kt", l = {}, m = "invokeSuspend")
        public static final class C3449a extends v13.i implements e23.p<androidx.lifecycle.b0.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f185686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f185687b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3449a(p pVar, t13.d<? super C3449a> dVar) {
                super(2, dVar);
                this.f185687b = pVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3449a c3449a = new C3449a(this.f185687b, dVar);
                c3449a.f185686a = obj;
                return c3449a;
            }

            @Override // e23.p
            public final Object invoke(androidx.lifecycle.b0.a aVar, t13.d<? super Unit> dVar) {
                return ((C3449a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                if (((androidx.lifecycle.b0.a) this.f185686a) == androidx.lifecycle.b0.a.ON_DESTROY) {
                    p2 p2Var = this.f185687b.f185681b;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, null));
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.auth.cmc.presentation.ViewModelStoreOwnerViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ViewModelStore.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend")
        public static final class b extends v13.i implements e23.q<r53.j<? super androidx.lifecycle.b0.a>, androidx.lifecycle.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f185688a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f185689b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f185690c;

            public b(t13.d dVar) {
                super(3, dVar);
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super androidx.lifecycle.b0.a> jVar, androidx.lifecycle.b0 b0Var, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar);
                bVar.f185689b = jVar;
                bVar.f185690c = b0Var;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                r53.i iVarA;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f185688a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.j jVar = this.f185689b;
                    androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) this.f185690c;
                    if (b0Var == null || (iVarA = l0.a(b0Var)) == null) {
                        iVarA = r53.h.f150634a;
                    }
                    this.f185688a = 1;
                    if (s.v(jVar, iVarA, this) == aVar) {
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

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185684a;
            if (i14 == 0) {
                o13.r.b(obj);
                p pVar = p.this;
                s53.k kVarN = s.N(pVar.f185681b, new b(null));
                C3449a c3449a = new C3449a(pVar, null);
                this.f185684a = 1;
                if (s.k(kVarN, c3449a, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.auth.cmc.presentation.ViewModelStoreOwnerViewModel$2", f = "ViewModelStore.kt", l = {58}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185691a;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isAttached", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "com.garmin.auth.cmc.presentation.ViewModelStoreOwnerViewModel$2$1", f = "ViewModelStore.kt", l = {70}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<Boolean, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f185693a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f185694b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f185695c;

            /* JADX INFO: renamed from: wi2.p$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/b0$a;", "it", "", "<anonymous>", "(Landroidx/lifecycle/b0$a;)Z"}, k = 3, mv = {2, 1, 0})
            @v13.e(c = "com.garmin.auth.cmc.presentation.ViewModelStoreOwnerViewModel$2$1$2", f = "ViewModelStore.kt", l = {}, m = "invokeSuspend")
            public static final class C3450a extends v13.i implements e23.p<androidx.lifecycle.b0.a, t13.d<? super Boolean>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f185696a;

                public C3450a(t13.d<? super C3450a> dVar) {
                    super(2, dVar);
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    C3450a c3450a = new C3450a(dVar);
                    c3450a.f185696a = obj;
                    return c3450a;
                }

                @Override // e23.p
                public final Object invoke(androidx.lifecycle.b0.a aVar, t13.d<? super Boolean> dVar) {
                    return ((C3450a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    o13.r.b(obj);
                    return Boolean.valueOf(((androidx.lifecycle.b0.a) this.f185696a) == androidx.lifecycle.b0.a.ON_RESUME);
                }
            }

            /* JADX INFO: renamed from: wi2.p$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            @v13.e(c = "com.garmin.auth.cmc.presentation.ViewModelStoreOwnerViewModel$2$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ViewModelStore.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend")
            public static final class C3451b extends v13.i implements e23.q<r53.j<? super androidx.lifecycle.b0.a>, androidx.lifecycle.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f185697a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ r53.j f185698b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f185699c;

                public C3451b(t13.d dVar) {
                    super(3, dVar);
                }

                @Override // e23.q
                public final Object invoke(r53.j<? super androidx.lifecycle.b0.a> jVar, androidx.lifecycle.b0 b0Var, t13.d<? super Unit> dVar) {
                    C3451b c3451b = new C3451b(dVar);
                    c3451b.f185698b = jVar;
                    c3451b.f185699c = b0Var;
                    return c3451b.invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    r53.i iVarA;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f185697a;
                    if (i14 == 0) {
                        o13.r.b(obj);
                        r53.j jVar = this.f185698b;
                        androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) this.f185699c;
                        if (b0Var == null || (iVarA = l0.a(b0Var)) == null) {
                            iVarA = r53.h.f150634a;
                        }
                        this.f185697a = 1;
                        if (s.v(jVar, iVarA, this) == aVar) {
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
            public a(p pVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f185695c = pVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f185695c, dVar);
                aVar.f185694b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f185693a;
                p pVar = this.f185695c;
                if (i14 == 0) {
                    o13.r.b(obj);
                    if (!this.f185694b) {
                        p2 p2Var = pVar.f185681b;
                        p2 p2Var2 = pVar.f185681b;
                        if (p2Var.getValue() != null) {
                            androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) p2Var2.getValue();
                            if ((b0Var != null ? b0Var.getF7973d() : null) == androidx.lifecycle.b0.b.RESUMED) {
                                pVar.f185683d.f185700a.a();
                            } else {
                                s53.k kVarN = s.N(p2Var2, new C3451b(null));
                                C3450a c3450a = new C3450a(null);
                                this.f185693a = 1;
                                obj = s.z(kVarN, c3450a, this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                if (((androidx.lifecycle.b0.a) obj) == null) {
                    return Unit.INSTANCE;
                }
                pVar.f185683d.f185700a.a();
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185691a;
            if (i14 == 0) {
                o13.r.b(obj);
                p pVar = p.this;
                e2 e2Var = pVar.f185682c;
                a aVar2 = new a(pVar, null);
                this.f185691a = 1;
                if (s.k(e2Var, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wi2/p$c", "Landroidx/lifecycle/ViewModelStoreOwner;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements ViewModelStoreOwner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y1 f185700a = new y1();

        @Override // androidx.lifecycle.ViewModelStoreOwner
        /* JADX INFO: renamed from: getViewModelStore, reason: from getter */
        public final y1 getF185700a() {
            return this.f185700a;
        }
    }

    public p(Object obj, androidx.lifecycle.b0 b0Var) {
        b0Var.getClass();
        this.f185680a = obj;
        this.f185681b = q2.a(b0Var);
        this.f185682c = g2.b(0, 0, null, 7);
        this.f185683d = new c();
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        this.f185683d.f185700a.a();
    }
}
