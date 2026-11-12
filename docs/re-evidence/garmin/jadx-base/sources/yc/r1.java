package yc;

import com.google.mlkit.common.MlKitException;
import java.util.concurrent.atomic.AtomicInteger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/e4;", "Lyc/m1;", "", "<anonymous>", "(Lyc/e4;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend")
public final class r1 extends v13.i implements e23.p<e4<m1<Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f196338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t3<Object, Object> f196339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1<Object, Object> f196340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k1 f196341e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/m1;", "it", "", "emit", "(Lyc/m1;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e4<m1<Object>> f196342a;

        public a(e4<m1<Object>> e4Var) {
            this.f196342a = e4Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object objH = this.f196342a.h((m1) obj, dVar);
            return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Lyc/e4;", "", "<anonymous>", "(Lyc/e4;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {161}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<e4<m1<Object>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f196343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f196344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i f196345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r53.i f196346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k1 f196347e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"T1", "T2", "R", "t1", "t2", "Lyc/r;", "updateFrom", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {141}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.r<b1, m1<Object>, r, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f196348a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f196349b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f196350c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ r f196351d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e4<m1<Object>> f196352e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ k1 f196353f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e4 e4Var, t13.d dVar, k1 k1Var) {
                super(4, dVar);
                this.f196353f = k1Var;
                this.f196352e = e4Var;
            }

            @Override // e23.r
            public final Object invoke(b1 b1Var, m1<Object> m1Var, r rVar, t13.d<? super Unit> dVar) {
                a aVar = new a(this.f196352e, dVar, this.f196353f);
                aVar.f196349b = b1Var;
                aVar.f196350c = m1Var;
                aVar.f196351d = rVar;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f196348a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    Object obj2 = this.f196349b;
                    Object obj3 = this.f196350c;
                    r rVar = this.f196351d;
                    Object cVar = (m1) obj3;
                    b1 b1Var = (b1) obj2;
                    r rVar2 = r.RECEIVER;
                    k1 k1Var = this.f196353f;
                    if (rVar == rVar2) {
                        cVar = new m1.c(k1Var.d(), b1Var);
                    } else if (cVar instanceof m1.b) {
                        m1.b bVar = (m1.b) cVar;
                        b1 b1Var2 = bVar.f196166e;
                        k1Var.b(b1Var2);
                        cVar = m1.b.c(bVar, b1Var2, b1Var);
                    } else if (cVar instanceof m1.a) {
                        c1 c1Var = ((m1.a) cVar).f196155a;
                        z0.c.f196665b.getClass();
                        k1Var.c(c1Var, z0.c.f196667d);
                    } else {
                        if (!(cVar instanceof m1.c)) {
                            if (cVar instanceof m1.d) {
                                vb.h.z("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                                return null;
                            }
                            lc.u0.r();
                            return null;
                        }
                        b1 b1Var3 = ((m1.c) cVar).f196198a;
                        k1Var.b(b1Var3);
                        cVar = new m1.c(b1Var3, b1Var);
                    }
                    this.f196348a = 1;
                    if (this.f196352e.h(cVar, this) == aVar) {
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

        /* JADX INFO: renamed from: yc.r1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {147}, m = "invokeSuspend")
        public static final class C3668b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f196354a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e4<m1<Object>> f196355b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r53.i f196356c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f196357d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ s4 f196358e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f196359f;

            /* JADX INFO: renamed from: yc.r1$b$b$a */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ s4 f196360a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f196361b;

                /* JADX INFO: renamed from: yc.r1$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class C3669a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f196362a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f196363b;

                    public C3669a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f196362a = obj;
                        this.f196363b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(s4 s4Var, int i14) {
                    this.f196360a = s4Var;
                    this.f196361b = i14;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
                
                    if (gg.b.U(r0) == r1) goto L21;
                 */
                @Override // r53.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, t13.d<? super Unit> dVar) {
                    C3669a c3669a;
                    if (dVar instanceof C3669a) {
                        c3669a = (C3669a) dVar;
                        int i14 = c3669a.f196363b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3669a.f196363b = i14 - Integer.MIN_VALUE;
                        } else {
                            c3669a = new C3669a(dVar);
                        }
                    } else {
                        c3669a = new C3669a(dVar);
                    }
                    Object obj2 = c3669a.f196362a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3669a.f196363b;
                    if (i15 == 0) {
                        o13.r.b(obj2);
                        c3669a.f196363b = 1;
                        if (this.f196360a.a(this.f196361b, obj, c3669a) != aVar) {
                        }
                        return aVar;
                    }
                    if (i15 == 1) {
                        o13.r.b(obj2);
                    } else {
                        if (i15 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj2);
                    }
                    return Unit.INSTANCE;
                    c3669a.f196363b = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3668b(r53.i iVar, AtomicInteger atomicInteger, e4 e4Var, s4 s4Var, int i14, t13.d dVar) {
                super(2, dVar);
                this.f196356c = iVar;
                this.f196357d = atomicInteger;
                this.f196358e = s4Var;
                this.f196359f = i14;
                this.f196355b = e4Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3668b(this.f196356c, this.f196357d, this.f196355b, this.f196358e, this.f196359f, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3668b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f196354a;
                e4<m1<Object>> e4Var = this.f196355b;
                AtomicInteger atomicInteger = this.f196357d;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        r53.i iVar = this.f196356c;
                        a aVar2 = new a(this.f196358e, this.f196359f);
                        this.f196354a = 1;
                        if (iVar.collect(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        e4Var.q(null);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        e4Var.q(null);
                    }
                    throw th3;
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T1", "T2", "R", "", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class c extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o53.t f196365a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(o53.t tVar) {
                super(0);
                this.f196365a = tVar;
            }

            @Override // e23.a
            public final Unit invoke() {
                this.f196365a.c(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r53.i iVar, r53.i iVar2, t13.d dVar, k1 k1Var) {
            super(2, dVar);
            this.f196345c = iVar;
            this.f196346d = iVar2;
            this.f196347e = k1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f196345c, this.f196346d, dVar, this.f196347e);
            bVar.f196344b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(e4<m1<Object>> e4Var, t13.d<? super Unit> dVar) {
            return ((b) create(e4Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f196343a;
            if (i14 == 0) {
                o13.r.b(obj);
                e4 e4Var = (e4) this.f196344b;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                s4 s4Var = new s4(new a(e4Var, null, this.f196347e));
                o53.m1 m1VarC = g8.i.c();
                r53.i[] iVarArr = {this.f196345c, this.f196346d};
                int i15 = 0;
                int i16 = 0;
                while (i16 < 2) {
                    ge1.b.T(e4Var, m1VarC, null, new C3668b(iVarArr[i16], atomicInteger, e4Var, s4Var, i15, null), 2);
                    i16++;
                    i15++;
                }
                c cVar = new c(m1VarC);
                this.f196343a = 1;
                if (e4Var.b9(cVar, this) == aVar) {
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
    public r1(t3<Object, Object> t3Var, s1<Object, Object> s1Var, k1 k1Var, t13.d<? super r1> dVar) {
        super(2, dVar);
        this.f196339c = t3Var;
        this.f196340d = s1Var;
        this.f196341e = k1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r1 r1Var = new r1(this.f196339c, this.f196340d, this.f196341e, dVar);
        r1Var.f196338b = obj;
        return r1Var;
    }

    @Override // e23.p
    public final Object invoke(e4<m1<Object>> e4Var, t13.d<? super Unit> dVar) {
        return ((r1) create(e4Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196337a;
        if (i14 == 0) {
            o13.r.b(obj);
            e4 e4Var = (e4) this.f196338b;
            r53.i iVarA = d4.a(new b(this.f196339c.getState(), this.f196340d.f196415m, null, this.f196341e));
            a aVar2 = new a(e4Var);
            this.f196337a = 1;
            if (iVarA.collect(aVar2, this) == aVar) {
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
