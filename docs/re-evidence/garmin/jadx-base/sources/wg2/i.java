package wg2;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import e23.q;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.e2;
import r53.l1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$registerLiveActivityListener$2", f = "SessionStateViewModel.kt", l = {108}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f185201b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f185202a;

        /* JADX INFO: renamed from: wg2.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$registerLiveActivityListener$2$2", f = "SessionStateViewModel.kt", l = {123}, m = "emit", v = 2)
        public static final class C3432a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f185203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a<T> f185204b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f185205c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3432a(a<? super T> aVar, t13.d<? super C3432a> dVar) {
                super(dVar);
                this.f185204b = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f185203a = obj;
                this.f185205c |= Integer.MIN_VALUE;
                return this.f185204b.emit(null, this);
            }
        }

        public a(g gVar) {
            this.f185202a = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // r53.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(sf2.d dVar, t13.d<? super Unit> dVar2) {
            C3432a c3432a;
            if (dVar2 instanceof C3432a) {
                c3432a = (C3432a) dVar2;
                int i14 = c3432a.f185205c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3432a.f185205c = i14 - Integer.MIN_VALUE;
                } else {
                    c3432a = new C3432a(this, dVar2);
                }
            } else {
                c3432a = new C3432a(this, dVar2);
            }
            Object obj = c3432a.f185203a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3432a.f185205c;
            g gVar = this.f185202a;
            if (i15 == 0) {
                r.b(obj);
                zg2.c cVar = zg2.c.f204692a;
                String strValueOf = String.valueOf(dVar);
                cVar.getClass();
                zg2.c.a("SessionStateViewModel", strValueOf);
                if (dVar instanceof sf2.d.a) {
                    gVar.f185150e.k(null, Boolean.TRUE);
                } else if (dVar instanceof sf2.d.b) {
                    int i16 = g.f185145o;
                    mf2.h hVarE = gVar.x4().e();
                    if (hVarE != null) {
                        zg2.c.d("Analytics", "Hide disconnected overlay");
                        hVarE.f118314i.add(mf2.h.c.a.f118323a);
                    }
                    gVar.f185150e.k(null, Boolean.FALSE);
                } else if (dVar instanceof sf2.d.C3004d) {
                    if (s.g(((sf2.d.C3004d) dVar).f158942b, rf2.e.d.f152473b)) {
                        c3432a.f185205c = 1;
                        if (m0.b(4000L, c3432a) == aVar) {
                            return aVar;
                        }
                    }
                } else if (dVar instanceof sf2.d.g) {
                    int i17 = g.f185145o;
                    mf2.h hVarE2 = gVar.x4().e();
                    if (hVarE2 != null) {
                        zg2.c.d("Analytics", "Hide paused overlay");
                        hVarE2.f118313h.add(mf2.h.c.a.f118323a);
                    }
                } else if (dVar instanceof sf2.d.c) {
                    gVar.x4().q(false);
                    gVar.f185154i.k(null, Boolean.TRUE);
                } else if (dVar instanceof sf2.d.h) {
                    gVar.x4().s(true);
                    gVar.x4().q(false);
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            gVar.f185155j.setValue(f.a.f185144a);
            gVar.x4().s(false);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.states.SessionStateViewModel$registerLiveActivityListener$2$invokeSuspend$$inlined$flatMapLatest$1", f = "SessionStateViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements q<r53.j<? super sf2.d>, of2.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f185206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f185207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f185208c;

        public b(t13.d dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super sf2.d> jVar, of2.b0 b0Var, t13.d<? super Unit> dVar) {
            b bVar = new b(dVar);
            bVar.f185207b = jVar;
            bVar.f185208c = b0Var;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185206a;
            if (i14 == 0) {
                r.b(obj);
                r53.j jVar = this.f185207b;
                e2 e2Var = ((of2.b0) this.f185208c).f131754k.f164469a.f164468a;
                this.f185207b = null;
                this.f185208c = null;
                this.f185206a = 1;
                if (r53.s.v(jVar, e2Var, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f185201b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f185201b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185200a;
        if (i14 == 0) {
            r.b(obj);
            int i15 = g.f185145o;
            g gVar = this.f185201b;
            s53.k kVarN = r53.s.N(new l1(gVar.x4().f71482f), new b(null));
            a aVar2 = new a(gVar);
            this.f185200a = 1;
            if (kVarN.collect(aVar2, this) == aVar) {
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
