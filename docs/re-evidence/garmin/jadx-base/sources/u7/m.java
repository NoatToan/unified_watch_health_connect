package u7;

import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.joran.action.Action;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import r53.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0012\u0013Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lu7/m;", "T", "Lu7/k;", "Lu7/s1;", "storage", "", "Lkotlin/Function2;", "Lu7/s0;", "Lt13/d;", "", "", "initTasksList", "Lu7/d;", "corruptionHandler", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "<init>", "(Lu7/s1;Ljava/util/List;Lu7/d;Lo53/b0;)V", "a", "b", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m<T> implements k<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f169187m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1<T> f169188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u7.d<T> f169189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.b0 f169190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f169191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z53.b f169192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f169193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o53.c2 f169194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0<T> f169195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m<T>.b f169196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o13.t f169197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f169198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m1<u0.a<T>> f169199l;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu7/m$b;", "Lu7/j1;", "", "Lkotlin/Function2;", "Lu7/s0;", "Lt13/d;", "", "", "initTasksList", "<init>", "(Lu7/m;Ljava/util/List;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends j1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<? extends e23.p<? super s0<T>, ? super t13.d<? super Unit>, ? extends Object>> f169200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m<T> f169201d;

        public b(m mVar, List<? extends e23.p<? super s0<T>, ? super t13.d<? super Unit>, ? extends Object>> list) {
            list.getClass();
            this.f169201d = mVar;
            this.f169200c = p13.h0.b1(list);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // u7.j1
        public final Object a(v13.c cVar) throws CorruptionException {
            n nVar;
            b bVar;
            u7.e eVar;
            if (cVar instanceof n) {
                nVar = (n) cVar;
                int i14 = nVar.f169241d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    nVar.f169241d = i14 - Integer.MIN_VALUE;
                } else {
                    nVar = new n(this, cVar);
                }
            } else {
                nVar = new n(this, cVar);
            }
            Object objF = nVar.f169239b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = nVar.f169241d;
            if (i15 == 0) {
                o13.r.b(objF);
                List<? extends e23.p<? super s0<T>, ? super t13.d<? super Unit>, ? extends Object>> list = this.f169200c;
                m<T> mVar = this.f169201d;
                if (list == null || list.isEmpty()) {
                    nVar.f169238a = this;
                    nVar.f169241d = 1;
                    objF = m.f(mVar, false, nVar);
                    if (objF != aVar) {
                        bVar = this;
                        eVar = (u7.e) objF;
                    }
                } else {
                    int i16 = m.f169187m;
                    t0 t0VarG = mVar.g();
                    p pVar = new p(mVar, this, null);
                    nVar.f169238a = this;
                    nVar.f169241d = 2;
                    objF = t0VarG.d(pVar, nVar);
                    if (objF != aVar) {
                        bVar = this;
                        eVar = (u7.e) objF;
                    }
                }
                return aVar;
            }
            if (i15 == 1) {
                bVar = nVar.f169238a;
                o13.r.b(objF);
                eVar = (u7.e) objF;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = nVar.f169238a;
                o13.r.b(objF);
                eVar = (u7.e) objF;
            }
            bVar.f169201d.f169195h.b(eVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu7/t0;", "invoke", "()Lu7/t0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<t0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m<T> f169202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m<T> mVar) {
            super(0);
            this.f169202a = mVar;
        }

        @Override // e23.a
        public final t0 invoke() {
            return ((t1) this.f169202a.f169197j.getValue()).getF169262c();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<r53.j<? super T>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u7.e f169203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f169204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f169205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m<T> f169206d;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lr53/j;", "Lu7/r1;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<r53.j<? super r1<T>>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f169207a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m<T> f169208b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m<T> mVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f169208b = mVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f169208b, dVar);
            }

            @Override // e23.p
            public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
                return ((a) create((r53.j) obj, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f169207a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f169207a = 1;
                    if (m.d(this.f169208b, this) == aVar) {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu7/r1;", "it", "", "<anonymous>", "(Lu7/r1;)Z"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        public static final class b extends v13.i implements e23.p<r1<T>, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f169209a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f169209a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(Object obj, t13.d<? super Boolean> dVar) {
                return ((b) create((r1) obj, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return Boolean.valueOf(!(((r1) this.f169209a) instanceof r0));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu7/r1;", "it", "", "<anonymous>", "(Lu7/r1;)Z"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        public static final class c extends v13.i implements e23.p<r1<T>, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f169210a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r1<T> f169211b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(r1<T> r1Var, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f169211b = r1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                c cVar = new c(this.f169211b, dVar);
                cVar.f169210a = obj;
                return cVar;
            }

            @Override // e23.p
            public final Object invoke(Object obj, t13.d<? super Boolean> dVar) {
                return ((c) create((r1) obj, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                r1 r1Var = (r1) this.f169210a;
                return Boolean.valueOf((r1Var instanceof u7.e) && r1Var.f169305a <= this.f169211b.f169305a);
            }
        }

        /* JADX INFO: renamed from: u7.m$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        public static final class C3166d extends v13.i implements e23.q<r53.j<? super T>, Throwable, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f169212a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m<T> f169213b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3166d(m<T> mVar, t13.d<? super C3166d> dVar) {
                super(3, dVar);
                this.f169213b = mVar;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Throwable th3, t13.d<? super Unit> dVar) {
                return new C3166d(this.f169213b, dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f169212a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f169212a = 1;
                    if (m.b(this.f169213b, this) == aVar) {
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

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements r53.i<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f169214a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f169215a;

                /* JADX INFO: renamed from: u7.m$d$e$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @v13.e(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                public static final class C3167a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f169216a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f169217b;

                    public C3167a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f169216a = obj;
                        this.f169217b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar) {
                    this.f169215a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) throws Throwable {
                    C3167a c3167a;
                    if (dVar instanceof C3167a) {
                        c3167a = (C3167a) dVar;
                        int i14 = c3167a.f169217b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3167a.f169217b = i14 - Integer.MIN_VALUE;
                        } else {
                            c3167a = new C3167a(dVar);
                        }
                    } else {
                        c3167a = new C3167a(dVar);
                    }
                    Object obj2 = c3167a.f169216a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3167a.f169217b;
                    if (i15 == 0) {
                        o13.r.b(obj2);
                        r1 r1Var = (r1) obj;
                        if (r1Var instanceof g1) {
                            throw ((g1) r1Var).f169143b;
                        }
                        if (!(r1Var instanceof u7.e)) {
                            if (r1Var instanceof r0 ? true : r1Var instanceof v1) {
                                vb.h.z("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                return null;
                            }
                            lc.u0.r();
                            return null;
                        }
                        T t7 = ((u7.e) r1Var).f169112b;
                        c3167a.f169217b = 1;
                        if (this.f169215a.emit(t7, c3167a) == aVar) {
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

            public e(r53.i iVar) {
                this.f169214a = iVar;
            }

            @Override // r53.i
            public final Object collect(r53.j jVar, t13.d dVar) {
                Object objCollect = this.f169214a.collect(new a(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m<T> mVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f169206d = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f169206d, dVar);
            dVar2.f169205c = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((d) create((r53.j) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
        
            if (r53.s.v(r1, r4, r9) == r0) goto L34;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            r53.j jVar;
            r1 r1Var;
            r53.j jVar2;
            r1 r1Var2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f169204b;
            m<T> mVar = this.f169206d;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar3 = (r53.j) this.f169205c;
                this.f169205c = jVar3;
                this.f169204b = 1;
                Object objE0 = ge1.b.e0(mVar.f169190c.getF195311f(), new c0(mVar, false, null), this);
                if (objE0 != aVar) {
                    jVar = jVar3;
                    obj = objE0;
                }
                return aVar;
            }
            if (i14 == 1) {
                jVar = (r53.j) this.f169205c;
                o13.r.b(obj);
            } else if (i14 == 2) {
                r1Var2 = this.f169203a;
                jVar2 = (r53.j) this.f169205c;
                o13.r.b(obj);
                r1Var = r1Var2;
                jVar = jVar2;
                r53.u uVar = new r53.u(new e(new r53.c0(new r53.h0(new r53.v(new a(mVar, null), mVar.f169195h.f169149a), new b(null)), new c(r1Var, null))), new C3166d(mVar, null));
                this.f169205c = null;
                this.f169203a = null;
                this.f169204b = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            r1Var = (r1) obj;
            if (r1Var instanceof u7.e) {
                u7.e eVar = (u7.e) r1Var;
                T t7 = eVar.f169112b;
                this.f169205c = jVar;
                this.f169203a = eVar;
                this.f169204b = 2;
                if (jVar.emit(t7, this) != aVar) {
                    jVar2 = jVar;
                    r1Var2 = r1Var;
                    r1Var = r1Var2;
                    jVar = jVar2;
                    r53.u uVar2 = new r53.u(new e(new r53.c0(new r53.h0(new r53.v(new a(mVar, null), mVar.f169195h.f169149a), new b(null)), new c(r1Var, null))), new C3166d(mVar, null));
                    this.f169205c = null;
                    this.f169203a = null;
                    this.f169204b = 3;
                }
            } else {
                if (r1Var instanceof v1) {
                    vb.h.z("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                }
                if (r1Var instanceof g1) {
                    throw ((g1) r1Var).f169143b;
                }
                if (r1Var instanceof r0) {
                    return Unit.INSTANCE;
                }
                r53.u uVar3 = new r53.u(new e(new r53.c0(new r53.h0(new r53.v(new a(mVar, null), mVar.f169195h.f169149a), new b(null)), new c(r1Var, null))), new C3166d(mVar, null));
                this.f169205c = null;
                this.f169203a = null;
                this.f169204b = 3;
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu7/t1;", "invoke", "()Lu7/t1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<t1<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m<T> f169219a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m<T> mVar) {
            super(0);
            this.f169219a = mVar;
        }

        @Override // e23.a
        public final Object invoke() {
            return this.f169219a.f169188a.createConnection();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class f extends p005kotlin.jvm.internal.w implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m<T> f169220a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m<T> mVar) {
            super(1);
            this.f169220a = mVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            Throwable th4 = th3;
            m<T> mVar = this.f169220a;
            if (th4 != null) {
                mVar.f169195h.b(new r0(th4));
            }
            if (mVar.f169197j.isInitialized()) {
                ((t1) mVar.f169197j.getValue()).close();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lu7/u0$a;", "msg", "", "ex", "", "invoke", "(Lu7/u0$a;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.p<u0.a<T>, Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f169221a = new g();

        public g() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(Object obj, Throwable th3) {
            u0.a aVar = (u0.a) obj;
            Throwable cancellationException = th3;
            aVar.getClass();
            o53.r<T> rVar = aVar.f169321b;
            if (cancellationException == null) {
                cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            rVar.O(cancellationException);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu7/u0$a;", "msg", "", "<anonymous>", "(Lu7/u0$a;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend")
    public static final class h extends v13.i implements e23.p<u0.a<T>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f169222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f169223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<T> f169224c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(m<T> mVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f169224c = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            h hVar = new h(this.f169224c, dVar);
            hVar.f169223b = obj;
            return hVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((h) create((u0.a) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f169222a;
            if (i14 == 0) {
                o13.r.b(obj);
                u0.a aVar2 = (u0.a) this.f169223b;
                this.f169222a = 1;
                if (m.c(this.f169224c, aVar2, this) == aVar) {
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

    static {
        new a(null);
    }

    public m(s1<T> s1Var, List<? extends e23.p<? super s0<T>, ? super t13.d<? super Unit>, ? extends Object>> list, u7.d<T> dVar, o53.b0 b0Var) {
        s1Var.getClass();
        list.getClass();
        dVar.getClass();
        b0Var.getClass();
        this.f169188a = s1Var;
        this.f169189b = dVar;
        this.f169190c = b0Var;
        this.f169191d = new c2(new d(this, null));
        this.f169192e = z53.c.a();
        this.f169195h = new h0<>();
        this.f169196i = new b(this, list);
        this.f169197j = o13.m.b(new e(this));
        this.f169198k = o13.m.b(new c(this));
        this.f169199l = new m1<>(b0Var, new f(this), g.f169221a, new h(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(m mVar, v13.c cVar) {
        q qVar;
        z53.b bVar;
        mVar.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f169298e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f169298e = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(mVar, cVar);
            }
        } else {
            qVar = new q(mVar, cVar);
        }
        Object obj = qVar.f169296c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f169298e;
        if (i15 == 0) {
            o13.r.b(obj);
            bVar = mVar.f169192e;
            qVar.f169294a = mVar;
            qVar.f169295b = bVar;
            qVar.f169298e = 1;
            if (bVar.c(qVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = qVar.f169295b;
            m mVar2 = qVar.f169294a;
            o13.r.b(obj);
            bVar = bVar2;
            mVar = mVar2;
        }
        try {
            int i16 = mVar.f169193f - 1;
            mVar.f169193f = i16;
            if (i16 == 0) {
                o53.c2 c2Var = mVar.f169194g;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                mVar.f169194g = null;
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, u7.m] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [u7.m] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3, types: [o53.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(m mVar, u0.a aVar, v13.c cVar) {
        s sVar;
        ?? r14;
        o53.r<T> rVar;
        Object objD;
        ?? r15;
        e23.p<T, t13.d<? super T>, Object> pVar;
        t13.g gVar;
        mVar.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f169311f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f169311f = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(mVar, cVar);
            }
        } else {
            sVar = new s(mVar, cVar);
        }
        Object bVar = sVar.f169309d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f169311f;
        boolean z14 = true;
        try {
            try {
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            o53.r<T> rVar2 = sVar.f169308c;
                            m mVar2 = sVar.f169307b;
                            u0.a aVar3 = (u0.a) sVar.f169306a;
                            o13.r.b(bVar);
                            rVar = rVar2;
                            r15 = mVar2;
                            aVar = aVar3;
                        } else if (i15 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    o53.r rVar3 = (o53.r) sVar.f169306a;
                    o13.r.b(bVar);
                    mVar = rVar3;
                    int i16 = o13.q.f128596b;
                    r14 = mVar;
                    Throwable thB = o13.q.b(bVar);
                    if (thB == null) {
                        r14.p(bVar);
                    } else {
                        r14.O(thB);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(bVar);
                rVar = aVar.f169321b;
                try {
                    int i17 = o13.q.f128596b;
                    r1<T> r1VarA = mVar.f169195h.a();
                    if (r1VarA instanceof u7.e) {
                        e23.p<T, t13.d<? super T>, Object> pVar2 = aVar.f169320a;
                        t13.g gVar2 = aVar.f169323d;
                        sVar.f169306a = rVar;
                        sVar.f169311f = 1;
                        try {
                            objD = mVar.g().d(new d0(mVar, gVar2, pVar2, null), sVar);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            mVar = rVar;
                            int i18 = o13.q.f128596b;
                            bVar = new o13.q.b(th);
                            r14 = mVar;
                        }
                    } else {
                        if (!(r1VarA instanceof g1)) {
                            z14 = r1VarA instanceof v1;
                        }
                        if (!z14) {
                            if (r1VarA instanceof r0) {
                                throw ((r0) r1VarA).f169304b;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        if (r1VarA != aVar.f169322c) {
                            r1VarA.getClass();
                            throw ((g1) r1VarA).f169143b;
                        }
                        sVar.f169306a = aVar;
                        sVar.f169307b = mVar;
                        sVar.f169308c = rVar;
                        sVar.f169311f = 2;
                        if (mVar.h(sVar) == aVar2) {
                            r15 = mVar;
                        }
                    }
                    return aVar2;
                } catch (Throwable th4) {
                    th = th4;
                    mVar = rVar;
                    int i19 = o13.q.f128596b;
                    bVar = new o13.q.b(th);
                    r14 = mVar;
                }
                objD = r15.g().d(new d0(r15, gVar, pVar, null), sVar);
            } catch (Throwable th5) {
                th = th5;
                th = th;
                mVar = rVar;
                int i110 = o13.q.f128596b;
                bVar = new o13.q.b(th);
                r14 = mVar;
            }
            r15 = mVar;
            pVar = aVar.f169320a;
            gVar = aVar.f169323d;
            sVar.f169306a = rVar;
            sVar.f169307b = null;
            sVar.f169308c = null;
            sVar.f169311f = 3;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(m mVar, v13.c cVar) {
        t tVar;
        z53.b bVar;
        mVar.getClass();
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f169316e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f169316e = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(mVar, cVar);
            }
        } else {
            tVar = new t(mVar, cVar);
        }
        Object obj = tVar.f169314c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f169316e;
        if (i15 == 0) {
            o13.r.b(obj);
            bVar = mVar.f169192e;
            tVar.f169312a = mVar;
            tVar.f169313b = bVar;
            tVar.f169316e = 1;
            if (bVar.c(tVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = tVar.f169313b;
            m mVar2 = tVar.f169312a;
            o13.r.b(obj);
            bVar = bVar2;
            mVar = mVar2;
        }
        try {
            int i16 = mVar.f169193f + 1;
            mVar.f169193f = i16;
            if (i16 == 1) {
                mVar.f169194g = ge1.b.T(mVar.f169190c, null, null, new u(mVar, null), 3);
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object e(m mVar, boolean z14, t13.d dVar) {
        w wVar;
        m mVar2;
        r1<T> r1Var;
        m mVar3;
        o13.p pVar;
        r1 r1Var2;
        mVar.getClass();
        if (dVar instanceof w) {
            wVar = (w) dVar;
            int i14 = wVar.f169342f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f169342f = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(mVar, dVar);
            }
        } else {
            wVar = new w(mVar, dVar);
        }
        Object objA = wVar.f169340d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f169342f;
        if (i15 == 0) {
            o13.r.b(objA);
            r1<T> r1VarA = mVar.f169195h.a();
            if (r1VarA instanceof v1) {
                vb.h.z("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            t0 t0VarG = mVar.g();
            wVar.f169337a = mVar;
            wVar.f169338b = r1VarA;
            wVar.f169339c = z14;
            wVar.f169342f = 1;
            Object objE = t0VarG.e(wVar);
            if (objE != aVar) {
                mVar2 = mVar;
                r1Var = r1VarA;
                objA = objE;
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                mVar3 = wVar.f169337a;
                o13.r.b(objA);
                pVar = (o13.p) objA;
                r1Var2 = (r1) pVar.f128594a;
                if (((Boolean) pVar.f128595b).booleanValue()) {
                    mVar3.f169195h.b(r1Var2);
                }
                return r1Var2;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mVar3 = wVar.f169337a;
            o13.r.b(objA);
            pVar = (o13.p) objA;
            r1Var2 = (r1) pVar.f128594a;
            if (((Boolean) pVar.f128595b).booleanValue()) {
                mVar3.f169195h.b(r1Var2);
            }
            return r1Var2;
        }
        z14 = wVar.f169339c;
        r1Var = wVar.f169338b;
        mVar2 = wVar.f169337a;
        o13.r.b(objA);
        int iIntValue = ((Number) objA).intValue();
        boolean z15 = r1Var instanceof u7.e;
        int i16 = z15 ? r1Var.f169305a : -1;
        if (z15 && iIntValue == i16) {
            return r1Var;
        }
        if (z14) {
            t0 t0VarG2 = mVar2.g();
            x xVar = new x(mVar2, null);
            wVar.f169337a = mVar2;
            wVar.f169338b = null;
            wVar.f169342f = 2;
            objA = t0VarG2.d(xVar, wVar);
            if (objA != aVar) {
                mVar3 = mVar2;
                pVar = (o13.p) objA;
                r1Var2 = (r1) pVar.f128594a;
                if (((Boolean) pVar.f128595b).booleanValue()) {
                    mVar3.f169195h.b(r1Var2);
                }
                return r1Var2;
            }
        } else {
            t0 t0VarG3 = mVar2.g();
            y yVar = new y(mVar2, i16, null);
            wVar.f169337a = mVar2;
            wVar.f169338b = null;
            wVar.f169342f = 3;
            objA = t0VarG3.a(yVar, wVar);
            if (objA != aVar) {
                mVar3 = mVar2;
                pVar = (o13.p) objA;
                r1Var2 = (r1) pVar.f128594a;
                if (((Boolean) pVar.f128595b).booleanValue()) {
                    mVar3.f169195h.b(r1Var2);
                }
                return r1Var2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a1 A[Catch: CorruptionException -> 0x0061, TryCatch #2 {CorruptionException -> 0x0061, blocks: (B:19:0x005c, B:54:0x0100, B:24:0x006a, B:51:0x00e2, B:32:0x0087, B:40:0x00a1, B:42:0x00a7, B:36:0x0090, B:48:0x00cf), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012b, B:63:0x013d, B:64:0x0145), top: B:80:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012b, B:63:0x013d, B:64:0x0145), top: B:80:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(m mVar, boolean z14, v13.c cVar) throws CorruptionException {
        z zVar;
        p005kotlin.jvm.internal.r0 r0Var;
        CorruptionException corruptionException;
        m mVar2;
        boolean z15;
        p005kotlin.jvm.internal.r0 r0Var2;
        p005kotlin.jvm.internal.p0 p0Var;
        CorruptionException corruptionException2;
        b0 b0Var;
        Object objD;
        p005kotlin.jvm.internal.p0 p0Var2;
        p005kotlin.jvm.internal.r0 r0Var3;
        int iHashCode;
        Object objE;
        m mVar3;
        int i14;
        Object obj;
        mVar.getClass();
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i15 = zVar.f169381i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                zVar.f169381i = i15 - Integer.MIN_VALUE;
            } else {
                zVar = new z(mVar, cVar);
            }
        } else {
            zVar = new z(mVar, cVar);
        }
        Object obj2 = (T) zVar.f169379g;
        Object eVar = u13.a.COROUTINE_SUSPENDED;
        try {
            switch (zVar.f169381i) {
                case 0:
                    o13.r.b(obj2);
                    if (z14) {
                        zVar.f169373a = mVar;
                        zVar.f169377e = z14;
                        zVar.f169381i = 1;
                        obj2 = (T) mVar.i(zVar);
                        if (obj2 != eVar) {
                            if (obj2 != null) {
                                iHashCode = obj2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            t0 t0VarG = mVar.g();
                            zVar.f169373a = mVar;
                            zVar.f169374b = obj2;
                            zVar.f169377e = z14;
                            zVar.f169378f = iHashCode;
                            zVar.f169381i = 2;
                            objE = t0VarG.e(zVar);
                            if (objE != eVar) {
                                mVar3 = mVar;
                                i14 = iHashCode;
                                obj = obj2;
                                obj2 = (T) objE;
                                return new u7.e(obj, i14, ((Number) obj2).intValue());
                            }
                        }
                    } else {
                        t0 t0VarG2 = mVar.g();
                        zVar.f169373a = mVar;
                        zVar.f169377e = z14;
                        zVar.f169381i = 3;
                        obj2 = (T) t0VarG2.e(zVar);
                        if (obj2 != eVar) {
                            int iIntValue = ((Number) obj2).intValue();
                            t0 t0VarG3 = mVar.g();
                            a0 a0Var = new a0(mVar, iIntValue, null);
                            zVar.f169373a = mVar;
                            zVar.f169377e = z14;
                            zVar.f169381i = 4;
                            obj2 = (T) t0VarG3.a(a0Var, zVar);
                            if (obj2 == eVar) {
                            }
                            return (u7.e) obj2;
                        }
                    }
                    return eVar;
                case 1:
                    z14 = zVar.f169377e;
                    mVar = (m) zVar.f169373a;
                    o13.r.b(obj2);
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    t0 t0VarG4 = mVar.g();
                    zVar.f169373a = mVar;
                    zVar.f169374b = obj2;
                    zVar.f169377e = z14;
                    zVar.f169378f = iHashCode;
                    zVar.f169381i = 2;
                    objE = t0VarG4.e(zVar);
                    if (objE != eVar) {
                        mVar3 = mVar;
                        i14 = iHashCode;
                        obj = obj2;
                        obj2 = (T) objE;
                        return new u7.e(obj, i14, ((Number) obj2).intValue());
                    }
                    return eVar;
                case 2:
                    i14 = zVar.f169378f;
                    z14 = zVar.f169377e;
                    obj = zVar.f169374b;
                    mVar3 = (m) zVar.f169373a;
                    try {
                        o13.r.b(obj2);
                        return new u7.e(obj, i14, ((Number) obj2).intValue());
                    } catch (CorruptionException e4) {
                        e = e4;
                        mVar = mVar3;
                        r0Var = new p005kotlin.jvm.internal.r0();
                        u7.d<T> dVar = mVar.f169189b;
                        zVar.f169373a = mVar;
                        zVar.f169374b = e;
                        zVar.f169375c = r0Var;
                        zVar.f169376d = r0Var;
                        zVar.f169377e = z14;
                        zVar.f169381i = 5;
                        Object objA = dVar.a(e);
                        if (objA != eVar) {
                            corruptionException = e;
                            obj2 = (T) objA;
                            mVar2 = mVar;
                            z15 = z14;
                            r0Var2 = r0Var;
                            r0Var2.f105810a = (T) obj2;
                            p0Var = new p005kotlin.jvm.internal.p0();
                            try {
                                b0Var = new b0(r0Var, mVar2, p0Var, null);
                                zVar.f169373a = corruptionException;
                                zVar.f169374b = r0Var;
                                zVar.f169375c = p0Var;
                                zVar.f169376d = null;
                                zVar.f169381i = 6;
                                if (z15) {
                                    mVar2.getClass();
                                    objD = b0Var.invoke(zVar);
                                } else {
                                    objD = mVar2.g().d(new r(b0Var, null), zVar);
                                }
                                if (objD != eVar) {
                                    p0Var2 = p0Var;
                                    r0Var3 = r0Var;
                                    T t7 = r0Var3.f105810a;
                                    eVar = new u7.e(t7, t7 != null ? t7.hashCode() : 0, p0Var2.f105807a);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                corruptionException2 = corruptionException;
                                o13.g.a(corruptionException2, th);
                                throw corruptionException2;
                            }
                        }
                        return eVar;
                    }
                case 3:
                    z14 = zVar.f169377e;
                    mVar = (m) zVar.f169373a;
                    o13.r.b(obj2);
                    int iIntValue2 = ((Number) obj2).intValue();
                    t0 t0VarG5 = mVar.g();
                    a0 a0Var2 = new a0(mVar, iIntValue2, null);
                    zVar.f169373a = mVar;
                    zVar.f169377e = z14;
                    zVar.f169381i = 4;
                    obj2 = (T) t0VarG5.a(a0Var2, zVar);
                    if (obj2 == eVar) {
                        return eVar;
                    }
                    return (u7.e) obj2;
                case 4:
                    boolean z16 = zVar.f169377e;
                    o13.r.b(obj2);
                    return (u7.e) obj2;
                case 5:
                    z15 = zVar.f169377e;
                    r0Var2 = zVar.f169376d;
                    r0Var = (p005kotlin.jvm.internal.r0) zVar.f169375c;
                    corruptionException = (CorruptionException) zVar.f169374b;
                    mVar2 = (m) zVar.f169373a;
                    o13.r.b(obj2);
                    r0Var2.f105810a = (T) obj2;
                    p0Var = new p005kotlin.jvm.internal.p0();
                    b0Var = new b0(r0Var, mVar2, p0Var, null);
                    zVar.f169373a = corruptionException;
                    zVar.f169374b = r0Var;
                    zVar.f169375c = p0Var;
                    zVar.f169376d = null;
                    zVar.f169381i = 6;
                    if (z15) {
                        mVar2.getClass();
                        objD = b0Var.invoke(zVar);
                    } else {
                        objD = mVar2.g().d(new r(b0Var, null), zVar);
                    }
                    if (objD != eVar) {
                        p0Var2 = p0Var;
                        r0Var3 = r0Var;
                        T t14 = r0Var3.f105810a;
                        eVar = new u7.e(t14, t14 != null ? t14.hashCode() : 0, p0Var2.f105807a);
                    }
                    return eVar;
                case 6:
                    p0Var2 = (p005kotlin.jvm.internal.p0) zVar.f169375c;
                    r0Var3 = (p005kotlin.jvm.internal.r0) zVar.f169374b;
                    corruptionException2 = (CorruptionException) zVar.f169373a;
                    try {
                        o13.r.b(obj2);
                        T t15 = r0Var3.f105810a;
                        eVar = new u7.e(t15, t15 != null ? t15.hashCode() : 0, p0Var2.f105807a);
                        return eVar;
                    } catch (Throwable th4) {
                        th = th4;
                        o13.g.a(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CorruptionException e14) {
            e = e14;
        }
    }

    @Override // u7.k
    public final Object a(e23.p pVar, v13.c cVar) {
        x1 x1Var = (x1) cVar.getF157466b().get(x1.a.C3168a.f169366a);
        if (x1Var != null) {
            x1Var.b(this);
        }
        return ge1.b.e0(new x1(x1Var, this), new e0(this, pVar, null), cVar);
    }

    public final t0 g() {
        return (t0) this.f169198k.getValue();
    }

    @Override // u7.k
    public final r53.i<T> getData() {
        return this.f169191d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r4.b(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(v13.c cVar) throws Throwable {
        v vVar;
        m<T> mVar;
        int iIntValue;
        int i14;
        Throwable th3;
        m<T> mVar2;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i15 = vVar.f169330e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                vVar.f169330e = i15 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objE = vVar.f169328c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = vVar.f169330e;
        try {
            if (i16 == 0) {
                o13.r.b(objE);
                t0 t0VarG = g();
                vVar.f169326a = this;
                vVar.f169330e = 1;
                objE = t0VarG.e(vVar);
                if (objE != aVar) {
                    mVar = this;
                }
                return aVar;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = vVar.f169327b;
                mVar2 = vVar.f169326a;
                try {
                    o13.r.b(objE);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th3 = th4;
                    mVar2.f169195h.b(new g1(th3, i14));
                    throw th3;
                }
            }
            mVar = vVar.f169326a;
            o13.r.b(objE);
            m<T>.b bVar = mVar.f169196i;
            vVar.f169326a = mVar;
            vVar.f169327b = iIntValue;
            vVar.f169330e = 2;
        } catch (Throwable th5) {
            i14 = iIntValue;
            th3 = th5;
            mVar2 = mVar;
            mVar2.f169195h.b(new g1(th3, i14));
            throw th3;
        }
        iIntValue = ((Number) objE).intValue();
    }

    public final Object i(v13.c cVar) {
        return ((t1) this.f169197j.getValue()).c(new u1(null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Object obj, boolean z14, v13.c cVar) {
        f0 f0Var;
        p005kotlin.jvm.internal.p0 p0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f169128d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f169128d = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj2 = f0Var.f169126b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f169128d;
        if (i15 == 0) {
            o13.r.b(obj2);
            p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
            t1 t1Var = (t1) this.f169197j.getValue();
            g0 g0Var = new g0(p0Var2, this, obj, z14, null);
            f0Var.f169125a = p0Var2;
            f0Var.f169128d = 1;
            if (t1Var.d(g0Var, f0Var) == aVar) {
                return aVar;
            }
            p0Var = p0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p0Var = f0Var.f169125a;
            o13.r.b(obj2);
        }
        return new Integer(p0Var.f105807a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu7/m$a;", "", "<init>", "()V", "", "BUG_MESSAGE", "Ljava/lang/String;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(s1 s1Var, List list, u7.d dVar, o53.b0 b0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        list = (i14 & 2) != 0 ? p13.j0.f134944a : list;
        dVar = (i14 & 4) != 0 ? new v7.a() : dVar;
        if ((i14 & 8) != 0) {
            x53.c cVar = o53.s0.f129406a;
            b0Var = o53.c0.a(x53.b.f189152a.plus(ge1.b.h()));
        }
        this(s1Var, list, dVar, b0Var);
    }
}
