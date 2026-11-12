package n70;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lo13/p;", "Lo70/c;", "Lr70/s;", "promptTrends", "Lj70/k$c;", "activitiesAndWorkouts", "Lo70/p;", "<anonymous>", "(Ljava/util/List;Lj70/k$c;)Lo70/p;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$invoke$1$1", f = "GetKeyStatsItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u2 extends v13.i implements e23.q<List<? extends o13.p<? extends o70.c, ? extends r70.s>>, j70.k.c, t13.d<? super o70.p>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f124614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j70.k.c f124615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f124616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o13.p<List<o70.r>, Boolean> f124617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<r53.i<j70.k.f>> f124618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<r53.i<j70.k.c>> f124619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<r53.i<j70.k.g>> f124620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a<r53.i<j70.i>> f124621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.a<r53.i<j70.k.b>> f124622i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r53.i<j70.d<List<? extends String>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f124623a;

        /* JADX INFO: renamed from: n70.u2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2384a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f124624a;

            /* JADX INFO: renamed from: n70.u2$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$invoke$1$1$invokeSuspend$lambda$0$$inlined$map$1$2", f = "GetKeyStatsItemsUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C2385a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f124625a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f124626b;

                public C2385a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f124625a = obj;
                    this.f124626b |= Integer.MIN_VALUE;
                    return C2384a.this.emit(null, this);
                }
            }

            public C2384a(r53.j jVar) {
                this.f124624a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2385a c2385a;
                if (dVar instanceof C2385a) {
                    c2385a = (C2385a) dVar;
                    int i14 = c2385a.f124626b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2385a.f124626b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2385a = new C2385a(dVar);
                    }
                } else {
                    c2385a = new C2385a(dVar);
                }
                Object obj2 = c2385a.f124625a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2385a.f124626b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    j70.k.f fVar = (j70.k.f) obj;
                    List listK = p13.x.k(fVar != null ? fVar.f97585u : null, fVar != null ? fVar.H : null);
                    j70.d dVar2 = new j70.d(yz1.e.a(fVar != null ? fVar.f97565a : null, new f(listK)), listK);
                    c2385a.f124626b = 1;
                    if (this.f124624a.emit(dVar2, c2385a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(r53.i iVar) {
            this.f124623a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super j70.d<List<? extends String>>> jVar, t13.d dVar) {
            Object objCollect = this.f124623a.collect(new C2384a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<j70.d<List<? extends String>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f124628a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f124629a;

            /* JADX INFO: renamed from: n70.u2$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$invoke$1$1$invokeSuspend$lambda$0$$inlined$map$2$2", f = "GetKeyStatsItemsUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C2386a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f124630a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f124631b;

                public C2386a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f124630a = obj;
                    this.f124631b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f124629a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2386a c2386a;
                if (dVar instanceof C2386a) {
                    c2386a = (C2386a) dVar;
                    int i14 = c2386a.f124631b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2386a.f124631b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2386a = new C2386a(dVar);
                    }
                } else {
                    c2386a = new C2386a(dVar);
                }
                Object obj2 = c2386a.f124630a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2386a.f124631b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    j70.k.f fVar = (j70.k.f) obj;
                    List listK = p13.x.k(fVar != null ? fVar.f97587w : null, fVar != null ? fVar.f97586v : null, fVar != null ? fVar.f97589y : null, fVar != null ? fVar.f97569e : null, fVar != null ? fVar.f97575k : null, fVar != null ? fVar.f97590z : null, fVar != null ? fVar.M : null);
                    j70.d dVar2 = new j70.d(yz1.e.a(fVar != null ? fVar.f97565a : null, new i(listK)), listK);
                    c2386a.f124631b = 1;
                    if (this.f124629a.emit(dVar2, c2386a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(r53.i iVar) {
            this.f124628a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super j70.d<List<? extends String>>> jVar, t13.d dVar) {
            Object objCollect = this.f124628a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<j70.d<pb2.e.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f124633a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f124634a;

            /* JADX INFO: renamed from: n70.u2$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$invoke$1$1$invokeSuspend$lambda$0$$inlined$map$3$2", f = "GetKeyStatsItemsUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C2387a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f124635a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f124636b;

                public C2387a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f124635a = obj;
                    this.f124636b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f124634a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2387a c2387a;
                if (dVar instanceof C2387a) {
                    c2387a = (C2387a) dVar;
                    int i14 = c2387a.f124636b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2387a.f124636b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2387a = new C2387a(dVar);
                    }
                } else {
                    c2387a = new C2387a(dVar);
                }
                Object obj2 = c2387a.f124635a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2387a.f124636b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    j70.k.f fVar = (j70.k.f) obj;
                    pb2.e.c cVar = fVar != null ? fVar.Q : null;
                    j70.d dVar2 = new j70.d(yz1.e.a(fVar != null ? fVar.f97565a : null, new j(cVar)), cVar);
                    c2387a.f124636b = 1;
                    if (this.f124634a.emit(dVar2, c2387a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public c(r53.i iVar) {
            this.f124633a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super j70.d<pb2.e.c>> jVar, t13.d dVar) {
            Object objCollect = this.f124633a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements r53.i<k70.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f124638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o70.r f124639b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f124640a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o70.r f124641b;

            /* JADX INFO: renamed from: n70.u2$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$invoke$1$1$invokeSuspend$lambda$0$$inlined$map$4$2", f = "GetKeyStatsItemsUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C2388a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f124642a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f124643b;

                public C2388a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f124642a = obj;
                    this.f124643b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, o70.r rVar) {
                this.f124640a = jVar;
                this.f124641b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2388a c2388a;
                if (dVar instanceof C2388a) {
                    c2388a = (C2388a) dVar;
                    int i14 = c2388a.f124643b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2388a.f124643b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2388a = new C2388a(dVar);
                    }
                } else {
                    c2388a = new C2388a(dVar);
                }
                Object obj2 = c2388a.f124642a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2388a.f124643b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    j70.k.b bVar = (j70.k.b) obj;
                    yz1.d dVarA = yz1.e.a(bVar != null ? bVar.f97547a : null, new k(bVar));
                    o70.r rVar = this.f124641b;
                    rVar.getClass();
                    k70.a aVar2 = new k70.a(dVarA, (o70.c) rVar, bVar != null ? bVar.f97548b : null, bVar != null ? bVar.f97549c : null, false);
                    c2388a.f124643b = 1;
                    if (this.f124640a.emit(aVar2, c2388a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public d(r53.i iVar, o70.r rVar) {
            this.f124638a = iVar;
            this.f124639b = rVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super k70.a> jVar, t13.d dVar) {
            Object objCollect = this.f124638a.collect(new a(jVar, this.f124639b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\f\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\b\u0001\u0012\u00020\u000b0\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lj70/k$f;", "keyStats", "Lj70/k$c;", "activitiesAndWorkouts", "Lj70/k$g;", "ecg", "Lj70/i;", "realTIme", "Lj70/j;", "", "", "", "<anonymous>", "(Lj70/k$f;Lj70/k$c;Lj70/k$g;Lj70/i;)Lj70/j;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$invoke$1$1$primaryStatsWidgets$1$cardData$1", f = "GetKeyStatsItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.s<j70.k.f, j70.k.c, j70.k.g, j70.i, t13.d<? super j70.j<List<? extends String>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ j70.k.f f124645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j70.k.c f124646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ j70.k.g f124647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ j70.i f124648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f124649e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List<String> f124650a;

            public a(List<String> list) {
                this.f124650a = list;
            }

            @Override // e23.a
            public final Boolean invoke() {
                boolean z14 = true;
                List<String> list = this.f124650a;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()) == null) {
                            z14 = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z14);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z14, t13.d<? super e> dVar) {
            super(5, dVar);
            this.f124649e = z14;
        }

        @Override // e23.s
        public final Object invoke(j70.k.f fVar, j70.k.c cVar, j70.k.g gVar, j70.i iVar, t13.d<? super j70.j<List<? extends String>, ? extends Object>> dVar) {
            e eVar = new e(this.f124649e, dVar);
            eVar.f124645a = fVar;
            eVar.f124646b = cVar;
            eVar.f124647c = gVar;
            eVar.f124648d = iVar;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j70.k.f fVar = this.f124645a;
            j70.k.c cVar = this.f124646b;
            j70.k.g gVar = this.f124647c;
            j70.i iVar = this.f124648d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Object obj2 = null;
            List listK = p13.x.k(fVar != null ? fVar.f97566b : null, fVar != null ? fVar.C : null, fVar != null ? fVar.J : null, fVar != null ? fVar.f97585u : null, fVar != null ? fVar.I : null, cVar != null ? cVar.a() : null, cVar != null ? cVar.f97555f : null, gVar != null ? gVar.f97592b : null);
            yz1.d dVarA = yz1.e.a(yz1.e.c(p13.x.k(fVar != null ? fVar.f97565a : null, cVar != null ? cVar.f97550a : null, gVar != null ? gVar.f97591a : null), fVar != null ? fVar.f97565a : null), new a(listK));
            if (this.f124649e) {
                if (iVar != null) {
                    obj2 = iVar.f97539g;
                }
            } else if (iVar != null) {
                obj2 = iVar.f97538f;
            }
            return new j70.j(dVarA, listK, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<String> f124651a;

        public f(List<String> list) {
            this.f124651a = list;
        }

        @Override // e23.a
        public final Boolean invoke() {
            boolean z14 = true;
            List<String> list = this.f124651a;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()) == null) {
                        z14 = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z14);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0004\u0012\u00020\u000b0\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lj70/k$f;", "keyStats", "Lj70/k$c;", "activitiesAndWorkouts", "Lj70/k$g;", "ecg", "Lj70/i;", "realTIme", "Lj70/j;", "", "", "Lhd1/m;", "<anonymous>", "(Lj70/k$f;Lj70/k$c;Lj70/k$g;Lj70/i;)Lj70/j;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$invoke$1$1$primaryStatsWidgets$1$cardData$3", f = "GetKeyStatsItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.s<j70.k.f, j70.k.c, j70.k.g, j70.i, t13.d<? super j70.j<List<? extends String>, hd1.m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ j70.k.f f124652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j70.k.c f124653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ j70.k.g f124654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ j70.i f124655d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List<String> f124656a;

            public a(List<String> list) {
                this.f124656a = list;
            }

            @Override // e23.a
            public final Boolean invoke() {
                boolean z14 = true;
                List<String> list = this.f124656a;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()) == null) {
                            z14 = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z14);
            }
        }

        public g(t13.d<? super g> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(j70.k.f fVar, j70.k.c cVar, j70.k.g gVar, j70.i iVar, t13.d<? super j70.j<List<? extends String>, hd1.m>> dVar) {
            g gVar2 = new g(dVar);
            gVar2.f124652a = fVar;
            gVar2.f124653b = cVar;
            gVar2.f124654c = gVar;
            gVar2.f124655d = iVar;
            return gVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j70.k.f fVar = this.f124652a;
            j70.k.c cVar = this.f124653b;
            j70.k.g gVar = this.f124654c;
            j70.i iVar = this.f124655d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            List listK = p13.x.k(fVar != null ? fVar.f97566b : null, fVar != null ? fVar.f97585u : null, fVar != null ? fVar.C : null, fVar != null ? fVar.I : null, cVar != null ? cVar.a() : null, cVar != null ? cVar.f97555f : null, gVar != null ? gVar.f97592b : null);
            return new j70.j(yz1.e.a(yz1.e.c(p13.x.k(fVar != null ? fVar.f97565a : null, cVar != null ? cVar.f97550a : null, gVar != null ? gVar.f97591a : null), fVar != null ? fVar.f97565a : null), new a(listK)), listK, iVar != null ? iVar.f97533a : null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n0\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lj70/k$f;", "keyStats", "Lj70/i;", "realTime", "Lj70/k$c;", "activitiesAndWorkouts", "Lj70/j;", "Lo13/p;", "", "", "Lhd1/k0;", "<anonymous>", "(Lj70/k$f;Lj70/i;Lj70/k$c;)Lj70/j;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$invoke$1$1$primaryStatsWidgets$1$cardData$4", f = "GetKeyStatsItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.r<j70.k.f, j70.i, j70.k.c, t13.d<? super j70.j<o13.p<? extends String, ? extends Boolean>, hd1.k0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ j70.k.f f124657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ j70.i f124658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ j70.k.c f124659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p2 f124660d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j70.k.f f124661a;

            public a(j70.k.f fVar) {
                this.f124661a = fVar;
            }

            @Override // e23.a
            public final Boolean invoke() {
                j70.k.f fVar = this.f124661a;
                return Boolean.valueOf((fVar != null ? fVar.f97588x : null) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p2 p2Var, t13.d<? super h> dVar) {
            super(4, dVar);
            this.f124660d = p2Var;
        }

        @Override // e23.r
        public final Object invoke(j70.k.f fVar, j70.i iVar, j70.k.c cVar, t13.d<? super j70.j<o13.p<? extends String, ? extends Boolean>, hd1.k0>> dVar) {
            h hVar = new h(this.f124660d, dVar);
            hVar.f124657a = fVar;
            hVar.f124658b = iVar;
            hVar.f124659c = cVar;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j70.k.f fVar = this.f124657a;
            j70.i iVar = this.f124658b;
            j70.k.c cVar = this.f124659c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zB = com.garmin.android.apps.connectmobile.k1.f37122a.B();
            kn.b bVar = this.f124660d.f124484b;
            return new j70.j(yz1.e.a(fVar != null ? fVar.f97565a : null, new a(fVar)), new o13.p(fVar != null ? fVar.f97588x : null, Boolean.valueOf(kn.b.a(cVar != null ? cVar.f97551b : null) && zB)), iVar != null ? iVar.f97540h : null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<String> f124662a;

        public i(List<String> list) {
            this.f124662a = list;
        }

        @Override // e23.a
        public final Boolean invoke() {
            boolean z14 = true;
            List<String> list = this.f124662a;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()) == null) {
                        z14 = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z14);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pb2.e.c f124663a;

        public j(pb2.e.c cVar) {
            this.f124663a = cVar;
        }

        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f124663a != null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j70.k.b f124664a;

        public k(j70.k.b bVar) {
            this.f124664a = bVar;
        }

        @Override // e23.a
        public final Boolean invoke() {
            j70.k.b bVar = this.f124664a;
            return Boolean.valueOf(((bVar != null ? bVar.f97548b : null) == null || bVar.f97549c == null) ? false : true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u2(p2 p2Var, o13.p<? extends List<? extends o70.r>, Boolean> pVar, e23.a<? extends r53.i<j70.k.f>> aVar, e23.a<? extends r53.i<j70.k.c>> aVar2, e23.a<? extends r53.i<j70.k.g>> aVar3, e23.a<? extends r53.i<j70.i>> aVar4, e23.a<? extends r53.i<j70.k.b>> aVar5, t13.d<? super u2> dVar) {
        super(3, dVar);
        this.f124616c = p2Var;
        this.f124617d = pVar;
        this.f124618e = aVar;
        this.f124619f = aVar2;
        this.f124620g = aVar3;
        this.f124621h = aVar4;
        this.f124622i = aVar5;
    }

    @Override // e23.q
    public final Object invoke(List<? extends o13.p<? extends o70.c, ? extends r70.s>> list, j70.k.c cVar, t13.d<? super o70.p> dVar) {
        e23.a<r53.i<j70.i>> aVar = this.f124621h;
        e23.a<r53.i<j70.k.b>> aVar2 = this.f124622i;
        u2 u2Var = new u2(this.f124616c, this.f124617d, this.f124618e, this.f124619f, this.f124620g, aVar, aVar2, dVar);
        u2Var.f124614a = list;
        u2Var.f124615b = cVar;
        return u2Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0322  */
    /* JADX WARN: Code duplicated, block: B:161:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:198:0x047e  */
    /* JADX WARN: Code duplicated, block: B:207:0x048e  */
    /* JADX WARN: Code duplicated, block: B:214:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:216:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:220:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:226:0x04c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<? extends o70.c>] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        ?? arrayList2;
        j70.r rVarA;
        ActivityListItemDTO activityListItemDTO;
        Integer numValueOf;
        o70.o oVar;
        int i14;
        am.x0 x0Var;
        Object next;
        int i15;
        List list;
        List listN0;
        o13.p pVar;
        List list2 = this.f124614a;
        j70.k.c cVar = this.f124615b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        StringBuilder sb3 = new StringBuilder("GetKeyStatsItemsUseCase primaryStats ");
        o13.p<List<o70.r>, Boolean> pVar2 = this.f124617d;
        sb3.append(pVar2);
        String string = sb3.toString();
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, string);
        List<o70.r> list3 = pVar2.f128594a;
        if (list3 != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list3) {
                if (obj2 instanceof o70.c) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        p2 p2Var = this.f124616c;
        p2Var.f124487e = arrayList;
        List<o70.r> list4 = pVar2.f128594a;
        if (list4 != null) {
            arrayList2 = new ArrayList();
            for (o70.r rVar : list4) {
                o70.o oVar2 = o70.o.STEPS;
                e23.a<r53.i<j70.k.f>> aVar2 = this.f124618e;
                e23.a<r53.i<j70.k.c>> aVar3 = this.f124619f;
                e23.a<r53.i<j70.k.g>> aVar4 = this.f124620g;
                e23.a<r53.i<j70.i>> aVar5 = this.f124621h;
                if (rVar == oVar2) {
                    r70.s sVarB = m70.f.b(r53.s.m(aVar2.invoke(), aVar3.invoke(), aVar4.invoke(), aVar5.invoke(), new e(p2Var.f124486d.B3(), null)), rVar.a());
                    if (sVarB != null) {
                        pVar = new o13.p(rVar, sVarB);
                    } else {
                        pVar = null;
                    }
                } else if (rVar == o70.o.SLEEP) {
                    r70.s sVarB2 = m70.f.b(new a(aVar2.invoke()), rVar.a());
                    if (sVarB2 != null) {
                        pVar = new o13.p(rVar, sVarB2);
                    } else {
                        pVar = null;
                    }
                } else if (rVar == o70.o.BODY_BATTERY) {
                    r70.s sVarB3 = m70.f.b(r53.s.m(aVar2.invoke(), aVar3.invoke(), aVar4.invoke(), aVar5.invoke(), new g(null)), rVar.a());
                    if (sVarB3 != null) {
                        pVar = new o13.p(rVar, sVarB3);
                    } else {
                        pVar = null;
                    }
                } else if (rVar == o70.o.TRAINING_READINESS) {
                    r70.s sVarB4 = m70.f.b(r53.s.l(aVar2.invoke(), aVar5.invoke(), aVar3.invoke(), new h(p2Var, null)), rVar.a());
                    if (sVarB4 != null) {
                        pVar = new o13.p(rVar, sVarB4);
                    } else {
                        pVar = null;
                    }
                } else if (rVar == o70.o.TRAINING_STATUS) {
                    r70.s sVarB5 = m70.f.b(new b(aVar2.invoke()), rVar.a());
                    if (sVarB5 != null) {
                        pVar = new o13.p(rVar, sVarB5);
                    } else {
                        pVar = null;
                    }
                } else if (rVar == o70.o.NUTRITION) {
                    r70.s sVarB6 = m70.f.b(new c(aVar2.invoke()), rVar.a());
                    if (sVarB6 != null) {
                        pVar = new o13.p(rVar, sVarB6);
                    } else {
                        pVar = null;
                    }
                } else {
                    if (rVar == o70.c.RUNNING || rVar == o70.c.CYCLING || rVar == o70.c.SWIMMING || rVar == o70.c.WALKING || rVar == o70.c.MULTI_SPORT || rVar == o70.c.FITNESS_EQUIPMENT || rVar == o70.c.PARA_SPORTS || rVar == o70.c.ALL_ACTIVITIES) {
                        r70.s sVarB7 = m70.f.b(new d(this.f124622i.invoke(), rVar), o70.o.ACTIVITY_SUMMARY.a());
                        if (sVarB7 != null) {
                            pVar = new o13.p(rVar, sVarB7);
                        }
                    } else {
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "GetKeyStatsItemsUseCase Key Stat Type " + rVar + " data not handled!");
                    }
                    pVar = null;
                }
                if (pVar != null) {
                    arrayList2.add(pVar);
                }
            }
        } else {
            arrayList2 = p13.j0.f134944a;
        }
        int size = arrayList2.size();
        ?? S0 = arrayList2;
        if (size != 6) {
            S0 = p13.h0.S0(p13.h0.C0((Collection) arrayList2, list2), 6);
        }
        t5 t5Var = p2Var.f124483a;
        String str = cVar != null ? cVar.f97551b : null;
        Boolean bool = pVar2.f128595b;
        S0.getClass();
        ArrayList arrayList3 = new ArrayList(p13.y.r(S0, 10));
        Iterator it = S0.iterator();
        while (it.hasNext()) {
            arrayList3.add((r70.s) ((o13.p) it.next()).f128595b);
        }
        int iIndexOf = 0;
        if (p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "SortKeyStatsItemsUseCase defaultPrimaryStats FALSE -> first item selected");
        } else {
            String strH4 = t5Var.f124598b.h4();
            if (strH4 != null) {
                j70.r.f97623f.getClass();
                rVarA = j70.r.a.a(strH4);
            } else {
                rVarA = null;
            }
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "SortKeyStatsItemsUseCase primaryFocus " + rVarA);
            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((r70.s) it3.next()).a());
            }
            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String strK = androidx.room.a0.k("SortKeyStatsItemsUseCase cards ", arrayList4);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var3, strK);
            ArrayList arrayList5 = new ArrayList(p13.y.r(S0, 10));
            Iterator it4 = S0.iterator();
            while (it4.hasNext()) {
                arrayList5.add((o70.r) ((o13.p) it4.next()).f128594a);
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (obj3 instanceof o70.c) {
                    arrayList6.add(obj3);
                }
            }
            if (arrayList6.isEmpty()) {
                activityListItemDTO = null;
            } else {
                if (str != null) {
                    try {
                        list = (List) new Gson().fromJson(str, new kn.d().getType());
                        if (list == null) {
                            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.e(a2Var4, "parseActivitiesData -> null server data");
                            list = null;
                        }
                    } catch (Exception e4) {
                        com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                        String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "parseActivitiesData -> Exception ");
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.e(a2Var5, strD);
                    }
                } else {
                    com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.e(a2Var6, "parseActivitiesData -> null server data");
                    list = null;
                }
                if (list == null || (listN0 = p13.h0.N0(list, new kn.c())) == null) {
                    activityListItemDTO = null;
                } else {
                    activityListItemDTO = (ActivityListItemDTO) p13.h0.n0(listN0);
                }
            }
            com.garmin.android.apps.connectmobile.a2 a2Var7 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String str2 = "SortKeyStatsItemsUseCase last activity type " + (activityListItemDTO != null ? activityListItemDTO.f29265g : null);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var7, str2);
            if (activityListItemDTO == null || (x0Var = activityListItemDTO.f29265g) == null) {
                numValueOf = null;
            } else {
                Iterator it5 = o70.c.f129940l.iterator();
                do {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                } while (!((o70.c) next).d().equals(x0Var.f4358a));
                Object obj4 = (o70.c) next;
                int i16 = -1;
                if (obj4 == null) {
                    i15 = -1;
                    break;
                }
                Iterator it6 = S0.iterator();
                i15 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i15 = -1;
                        break;
                    }
                    if (((o13.p) it6.next()).f128594a == obj4) {
                        break;
                    }
                    i15++;
                }
                if (i15 >= 0) {
                    numValueOf = Integer.valueOf(i15);
                } else {
                    ArrayList arrayList7 = new ArrayList(p13.y.r(S0, 10));
                    Iterator it7 = S0.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add((o70.r) ((o13.p) it7.next()).f128594a);
                    }
                    if (arrayList7.contains(o70.c.ALL_ACTIVITIES)) {
                        Iterator it8 = S0.iterator();
                        int i17 = 0;
                        while (it8.hasNext()) {
                            if (((o13.p) it8.next()).f128594a == o70.c.ALL_ACTIVITIES) {
                                i16 = i17;
                                break;
                            }
                            i17++;
                        }
                        numValueOf = Integer.valueOf(i16);
                    } else {
                        numValueOf = null;
                    }
                }
            }
            DateTime dateTimeI = activityListItemDTO != null ? gl1.d.i(activityListItemDTO) : null;
            o70.z.a aVar6 = o70.z.f130123a;
            bv.d dVar = t5Var.f124597a;
            aVar6.getClass();
            long jH = dVar.h();
            long jD = dVar.d();
            int i18 = DateTime.now().secondOfDay().get();
            long j8 = 7200;
            long j14 = jH + j8;
            long j15 = jH - j8;
            long j16 = ((long) 10800) + jD;
            o70.z zVar = o70.z.ACTIVE;
            long j17 = i18;
            o70.z zVar2 = (j14 > j17 || j17 > jD) ? zVar : o70.z.DURING_SLEEP;
            if (jD + 1 <= j17 && j17 <= j16) {
                zVar2 = o70.z.AFTER_SLEEP;
            }
            if (j16 + 1 > j17 || j17 > j15) {
                zVar = zVar2;
            }
            if (j14 + 1 <= j17 && j17 < j14) {
                zVar = o70.z.BEFORE_SLEEP;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var8 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var8, "timeOfDay = " + zVar);
            j70.r rVar2 = j70.r.f97625h;
            if (rVarA == rVar2 || rVarA == j70.r.f97626i || rVarA == j70.r.f97628k) {
                j23.l lVar = new j23.l(0, 14);
                Integer numA = t5.a(dateTimeI);
                if (numA != null && lVar.d(numA.intValue())) {
                    oVar = o70.o.ACTIVITY_SUMMARY;
                } else if (rVarA != j70.r.f97624g || rVarA == rVar2) {
                    i14 = t5.b.f124599a[zVar.ordinal()];
                    if (i14 == 1) {
                        oVar = null;
                    } else if (i14 == 2) {
                        oVar = o70.o.SLEEP;
                    } else {
                        if (i14 == 3 && i14 != 4) {
                            lc.u0.r();
                            return null;
                        }
                        oVar = o70.o.BODY_BATTERY;
                    }
                } else if (rVarA == j70.r.f97626i || rVarA == j70.r.f97628k) {
                    Integer numA2 = t5.a(dateTimeI);
                    oVar = (numA2 == null || numA2.intValue() < 15) ? o70.o.TRAINING_READINESS : o70.o.TRAINING_STATUS;
                } else {
                    oVar = null;
                }
            } else if (rVarA != j70.r.f97624g) {
                i14 = t5.b.f124599a[zVar.ordinal()];
                if (i14 == 1) {
                    oVar = null;
                } else if (i14 == 2) {
                    if (i14 == 3) {
                    }
                    oVar = o70.o.BODY_BATTERY;
                } else {
                    oVar = o70.o.SLEEP;
                }
            } else {
                i14 = t5.b.f124599a[zVar.ordinal()];
                if (i14 == 1) {
                    oVar = null;
                } else if (i14 == 2) {
                    if (i14 == 3) {
                    }
                    oVar = o70.o.BODY_BATTERY;
                } else {
                    oVar = o70.o.SLEEP;
                }
            }
            if (oVar != o70.o.ACTIVITY_SUMMARY || numValueOf == null) {
                if (oVar != null && arrayList4.contains(oVar.a())) {
                    iIndexOf = arrayList4.indexOf(oVar.a());
                }
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var8, "SortKeyStatsItemsUseCase defaultPrimaryStats TRUE -> selectedKeyStatType " + oVar + " selectedKeyStatIndex " + iIndexOf);
            } else {
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var8, "SortKeyStatsItemsUseCase defaultPrimaryStats TRUE -> selectedKeyStatType " + oVar + " activityTrendsIndex " + numValueOf);
                iIndexOf = numValueOf.intValue();
            }
        }
        ArrayList arrayList8 = new ArrayList(p13.y.r(S0, 10));
        Iterator it9 = S0.iterator();
        while (it9.hasNext()) {
            arrayList8.add((r70.s) ((o13.p) it9.next()).f128595b);
        }
        ArrayList arrayList9 = new ArrayList(p13.y.r(S0, 10));
        Iterator it10 = S0.iterator();
        while (it10.hasNext()) {
            arrayList9.add(((o70.r) ((o13.p) it10.next()).f128594a).a());
        }
        return new o70.p(iIndexOf, arrayList8, arrayList9);
    }
}
