package yc;

import ch.qos.logback.core.joran.action.Action;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyc/i;", "", "T", "Lr53/i;", "Lyc/m1;", "src", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "<init>", "(Lr53/i;Lo53/b0;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0<T> f196024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.e2 f196025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r53.u2 f196026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.c2 f196027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r53.c2 f196028e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lr53/j;", "Lyc/m1;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {102}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<r53.j<? super m1<T>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f196029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f196030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<T> f196031c;

        /* JADX INFO: renamed from: yc.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lp13/m0;", "Lyc/m1;", "it", "", "<anonymous>", "(Lp13/m0;)Z"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
        public static final class C3658a extends v13.i implements e23.p<p13.m0<? extends m1<T>>, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f196032a;

            public C3658a(t13.d<? super C3658a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3658a c3658a = new C3658a(dVar);
                c3658a.f196032a = obj;
                return c3658a;
            }

            @Override // e23.p
            public final Object invoke(Object obj, t13.d<? super Boolean> dVar) {
                return ((C3658a) create((p13.m0) obj, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return Boolean.valueOf(((p13.m0) this.f196032a) != null);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lp13/m0;", "Lyc/m1;", "indexedValue", "", "emit", "(Lp13/m0;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class b<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p005kotlin.jvm.internal.p0 f196033a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.j<m1<T>> f196034b;

            /* JADX INFO: renamed from: yc.i$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @v13.e(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", l = {105}, m = "emit")
            public static final class C3659a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public b f196035a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public p13.m0 f196036b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f196037c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ b<T> f196038d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f196039e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3659a(b<? super T> bVar, t13.d<? super C3659a> dVar) {
                    super(dVar);
                    this.f196038d = bVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f196037c = obj;
                    this.f196039e |= Integer.MIN_VALUE;
                    return this.f196038d.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(p005kotlin.jvm.internal.p0 p0Var, r53.j<? super m1<T>> jVar) {
                this.f196033a = p0Var;
                this.f196034b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(p13.m0<? extends m1<T>> m0Var, t13.d<? super Unit> dVar) {
                C3659a c3659a;
                b<T> bVar;
                if (dVar instanceof C3659a) {
                    c3659a = (C3659a) dVar;
                    int i14 = c3659a.f196039e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3659a.f196039e = i14 - Integer.MIN_VALUE;
                    } else {
                        c3659a = new C3659a(this, dVar);
                    }
                } else {
                    c3659a = new C3659a(this, dVar);
                }
                Object obj = c3659a.f196037c;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3659a.f196039e;
                if (i15 == 0) {
                    o13.r.b(obj);
                    m0Var.getClass();
                    if (m0Var.f134951a > this.f196033a.f105807a) {
                        T t7 = m0Var.f134952b;
                        c3659a.f196035a = this;
                        c3659a.f196036b = m0Var;
                        c3659a.f196039e = 1;
                        if (this.f196034b.emit(t7, c3659a) == aVar) {
                            return aVar;
                        }
                        bVar = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m0Var = c3659a.f196036b;
                bVar = c3659a.f196035a;
                o13.r.b(obj);
                bVar.f196033a.f105807a = m0Var.f134951a;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i<T> iVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f196031c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f196031c, dVar);
            aVar.f196030b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((a) create((r53.j) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f196029a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j jVar = (r53.j) this.f196030b;
                p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
                p0Var.f105807a = Integer.MIN_VALUE;
                r53.h0 h0Var = new r53.h0(this.f196031c.f196026c, new C3658a(null));
                b bVar = new b(p0Var, jVar);
                this.f196029a = 1;
                if (h0Var.collect(bVar, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {76}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f196040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.i<m1<T>> f196041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<T> f196042c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lp13/m0;", "Lyc/m1;", "it", "", "emit", "(Lp13/m0;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<T> f196043a;

            /* JADX INFO: renamed from: yc.i$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @v13.e(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", l = {77, 78}, m = "emit")
            public static final class C3660a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public a f196044a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public p13.m0 f196045b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f196046c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a<T> f196047d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f196048e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3660a(a<? super T> aVar, t13.d<? super C3660a> dVar) {
                    super(dVar);
                    this.f196047d = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f196046c = obj;
                    this.f196048e |= Integer.MIN_VALUE;
                    return this.f196047d.emit(null, this);
                }
            }

            public a(i<T> iVar) {
                this.f196043a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
            
                if (r7.b(r6, r0) == r1) goto L22;
             */
            @Override // r53.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(p13.m0<? extends m1<T>> m0Var, t13.d<? super Unit> dVar) {
                C3660a c3660a;
                a<T> aVar;
                if (dVar instanceof C3660a) {
                    c3660a = (C3660a) dVar;
                    int i14 = c3660a.f196048e;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3660a.f196048e = i14 - Integer.MIN_VALUE;
                    } else {
                        c3660a = new C3660a(this, dVar);
                    }
                } else {
                    c3660a = new C3660a(this, dVar);
                }
                Object obj = c3660a.f196046c;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3660a.f196048e;
                if (i15 == 0) {
                    o13.r.b(obj);
                    r53.e2 e2Var = this.f196043a.f196025b;
                    c3660a.f196044a = this;
                    c3660a.f196045b = m0Var;
                    c3660a.f196048e = 1;
                    if (e2Var.emit(m0Var, c3660a) != aVar2) {
                        aVar = this;
                    }
                    return aVar2;
                }
                if (i15 == 1) {
                    m0Var = c3660a.f196045b;
                    aVar = c3660a.f196044a;
                    o13.r.b(obj);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
                d0<T> d0Var = aVar.f196043a.f196024a;
                c3660a.f196044a = null;
                c3660a.f196045b = null;
                c3660a.f196048e = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(r53.i<? extends m1<T>> iVar, i<T> iVar2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f196041b = iVar;
            this.f196042c = iVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f196041b, this.f196042c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f196040a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.p1 p1Var = new r53.p1(this.f196041b);
                a aVar2 = new a(this.f196042c);
                this.f196040a = 1;
                if (p1Var.collect(aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f196049a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i<T> iVar) {
            super(1);
            this.f196049a = iVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            this.f196049a.f196025b.d(null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lr53/j;", "Lp13/m0;", "Lyc/m1;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {62, 67}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<r53.j<? super p13.m0<? extends m1<T>>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f196050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f196051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f196052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i<T> f196053d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i<T> iVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f196053d = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f196053d, dVar);
            dVar2.f196052c = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((d) create((r53.j) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004f  */
        /* JADX WARN: Code duplicated, block: B:21:0x0061 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x0049->B:24:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        
            if (r6 == r0) goto L18;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r53.j jVar;
            r53.j jVar2;
            Iterator<T> it;
            p13.m0 m0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f196051b;
            i<T> iVar = this.f196053d;
            if (i14 != 0) {
                if (i14 == 1) {
                    jVar = (r53.j) this.f196052c;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = this.f196050a;
                    jVar2 = (r53.j) this.f196052c;
                    o13.r.b(obj);
                }
                while (it.hasNext()) {
                    m0Var = (p13.m0) it.next();
                    this.f196052c = jVar2;
                    this.f196050a = it;
                    this.f196051b = 2;
                    if (jVar2.emit(m0Var, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            jVar = (r53.j) this.f196052c;
            d0<T> d0Var = iVar.f196024a;
            this.f196052c = jVar;
            this.f196051b = 1;
            obj = d0Var.a(this);
            iVar.f196027d.start();
            jVar2 = jVar;
            it = ((List) obj).iterator();
            while (it.hasNext()) {
                m0Var = (p13.m0) it.next();
                this.f196052c = jVar2;
                this.f196050a = it;
                this.f196051b = 2;
                if (jVar2.emit(m0Var, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public i(r53.i<? extends m1<T>> iVar, o53.b0 b0Var) {
        iVar.getClass();
        b0Var.getClass();
        this.f196024a = new d0<>();
        r53.e2 e2VarA = r53.g2.a(1, Integer.MAX_VALUE, q53.a.SUSPEND);
        this.f196025b = e2VarA;
        this.f196026c = new r53.u2(e2VarA, new d(this, null));
        o53.c2 c2VarT = ge1.b.T(b0Var, null, o53.d0.LAZY, new b(iVar, this, null), 1);
        c2VarT.J(new c(this));
        this.f196027d = c2VarT;
        this.f196028e = new r53.c2(new a(this, null));
    }
}
