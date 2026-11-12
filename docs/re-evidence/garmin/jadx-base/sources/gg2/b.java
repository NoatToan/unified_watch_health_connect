package gg2;

import com.garmin.android.livesessionview.service.LiveActivitySessionService;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import e23.q;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import of2.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import r53.h;
import r53.j;
import r53.p2;
import r53.s;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.service.LiveActivitySessionService$sessionEventStateFlowBuilder$1", f = "LiveActivitySessionService.kt", l = {142}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveActivitySessionService f77387b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.service.LiveActivitySessionService$sessionEventStateFlowBuilder$1$invokeSuspend$$inlined$flatMapLatest$1", f = "LiveActivitySessionService.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements q<j<? super sf2.a>, of2.b, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f77388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j f77389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f77390c;

        public a(t13.d dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(j<? super sf2.a> jVar, of2.b bVar, t13.d<? super Unit> dVar) {
            a aVar = new a(dVar);
            aVar.f77389b = jVar;
            aVar.f77390c = bVar;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r53.i iVar;
            p2 p2Var;
            of2.b0 b0Var;
            tf2.c cVar;
            tf2.b bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f77388a;
            if (i14 == 0) {
                r.b(obj);
                j jVar = this.f77389b;
                of2.b bVar2 = (of2.b) this.f77390c;
                if (bVar2 == null || (p2Var = bVar2.f131736o) == null || (b0Var = (of2.b0) p2Var.getValue()) == null || (cVar = b0Var.f131754k) == null || (bVar = cVar.f164471c) == null || (iVar = bVar.f164468a) == null) {
                    iVar = h.f150634a;
                }
                this.f77389b = null;
                this.f77390c = null;
                this.f77388a = 1;
                if (s.v(jVar, iVar, this) == aVar) {
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

    /* JADX INFO: renamed from: gg2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1562b implements r53.i<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f77391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LiveActivitySessionService f77392b;

        /* JADX INFO: renamed from: gg2.b$b$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f77393a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LiveActivitySessionService f77394b;

            /* JADX INFO: renamed from: gg2.b$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.service.LiveActivitySessionService$sessionEventStateFlowBuilder$1$invokeSuspend$$inlined$map$1$2", f = "LiveActivitySessionService.kt", l = {50}, m = "emit", v = 2)
            public static final class C1563a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f77395a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f77396b;

                public C1563a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f77395a = obj;
                    this.f77396b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, LiveActivitySessionService liveActivitySessionService) {
                this.f77393a = jVar;
                this.f77394b = liveActivitySessionService;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1563a c1563a;
                Object value;
                Unit unit;
                eg2.c cVar;
                r0 r0Var;
                Long l14;
                long jLongValue;
                Integer num;
                T next;
                T next2;
                Float f14;
                Float f15;
                p2 p2Var;
                if (dVar instanceof C1563a) {
                    c1563a = (C1563a) dVar;
                    int i14 = c1563a.f77396b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1563a.f77396b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1563a = new C1563a(dVar);
                    }
                } else {
                    c1563a = new C1563a(dVar);
                }
                Object obj2 = c1563a.f77395a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1563a.f77396b;
                if (i15 == 0) {
                    r.b(obj2);
                    sf2.a aVar2 = (sf2.a) obj;
                    LiveActivitySessionService liveActivitySessionService = this.f77394b;
                    c0 c0Var = liveActivitySessionService.f50578a;
                    p2 p2Var2 = liveActivitySessionService.f50581d;
                    of2.b bVar = (of2.b) c0Var.f131778g.getValue();
                    of2.b0 b0Var = (bVar == null || (p2Var = bVar.f131736o) == null) ? null : (of2.b0) p2Var.getValue();
                    if (b0Var == null || aVar2 == null) {
                        do {
                            value = p2Var2.getValue();
                        } while (!p2Var2.b(value, null));
                        unit = Unit.INSTANCE;
                    } else {
                        if (aVar2 instanceof sf2.a.d) {
                            cVar = eg2.c.ACTIVITY_STARTED;
                        } else if (aVar2 instanceof sf2.a.e) {
                            cVar = p2Var2.getValue() == null ? eg2.c.ACTIVITY_STARTED : eg2.c.ACTIVITY_UPDATED;
                        } else if (aVar2 instanceof sf2.a.b) {
                            cVar = eg2.c.ACTIVITY_PAUSED;
                        } else if (aVar2 instanceof sf2.a.c) {
                            cVar = eg2.c.ACTIVITY_RESUMED;
                        } else if (aVar2 instanceof sf2.a.C3001a) {
                            cVar = eg2.c.ACTIVITY_ENDED;
                        } else {
                            if (!(aVar2 instanceof sf2.a.f)) {
                                u0.r();
                                return null;
                            }
                            cVar = eg2.c.ACTIVITY_DISCONNECTED;
                        }
                        eg2.c cVar2 = cVar;
                        r0 r0Var2 = new r0();
                        r0 r0Var3 = new r0();
                        if (aVar2 instanceof sf2.a.e) {
                            List<rf2.b> list = ((sf2.a.e) aVar2).f158887e;
                            Iterator<T> it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                            } while (((rf2.b) next).f152455a != rf2.a.TIME);
                            rf2.b bVar2 = next;
                            r0Var2.f105810a = (bVar2 == null || (f15 = bVar2.f152460f) == null) ? null : (T) new Long((long) (f15.floatValue() * 1000));
                            Iterator<T> it3 = list.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next2 = (T) null;
                                    break;
                                }
                                next2 = it3.next();
                            } while (((rf2.b) next2).f152455a != rf2.a.HEART_RATE);
                            rf2.b bVar3 = next2;
                            r0Var3.f105810a = (bVar3 == null || (f14 = bVar3.f152460f) == null) ? null : (T) new Integer((int) f14.floatValue());
                        }
                        while (true) {
                            Object value2 = p2Var2.getValue();
                            eg2.b bVar4 = (eg2.b) value2;
                            long f172494b = b0Var.f131745b.getF92746j();
                            zf2.d dVar2 = b0Var.f131747d;
                            Long l15 = (Long) r0Var2.f105810a;
                            if (l15 != null) {
                                r0Var = r0Var2;
                                jLongValue = l15.longValue();
                            } else {
                                if (bVar4 != null) {
                                    r0Var = r0Var2;
                                    l14 = new Long(bVar4.f64010d);
                                } else {
                                    r0Var = r0Var2;
                                    l14 = null;
                                }
                                jLongValue = l14 != null ? l14.longValue() : 0L;
                            }
                            Integer num2 = (Integer) r0Var3.f105810a;
                            if (num2 != null) {
                                num = num2;
                            } else if (bVar4 != null) {
                                num2 = bVar4.f64011e;
                                num = num2;
                            } else {
                                num = null;
                            }
                            new eg2.b(cVar2, f172494b, dVar2, jLongValue, num);
                            if (p2Var2.b(value2, r12)) {
                                break;
                            }
                            r0Var3 = r0Var3;
                            r0Var2 = r0Var;
                        }
                        unit = Unit.INSTANCE;
                    }
                    c1563a.f77396b = 1;
                    if (this.f77393a.emit(unit, c1563a) == aVar) {
                        return aVar;
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

        public C1562b(r53.i iVar, LiveActivitySessionService liveActivitySessionService) {
            this.f77391a = iVar;
            this.f77392b = liveActivitySessionService;
        }

        @Override // r53.i
        public final Object collect(j<? super Unit> jVar, t13.d dVar) {
            Object objCollect = this.f77391a.collect(new a(jVar, this.f77392b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LiveActivitySessionService liveActivitySessionService, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f77387b = liveActivitySessionService;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f77387b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f77386a;
        if (i14 == 0) {
            r.b(obj);
            LiveActivitySessionService liveActivitySessionService = this.f77387b;
            C1562b c1562b = new C1562b(s.N(liveActivitySessionService.f50578a.f131778g, new a(null)), liveActivitySessionService);
            this.f77386a = 1;
            if (s.j(c1562b, this) == aVar) {
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
