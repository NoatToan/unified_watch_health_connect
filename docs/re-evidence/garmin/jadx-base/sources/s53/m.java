package s53;

import java.util.concurrent.atomic.AtomicInteger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q53.i f157526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f157527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f157528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f157529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f157530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f157531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ r53.i<Object>[] f157532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e23.a<Object[]> f157533h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e23.q<r53.j<Object>, Object[], t13.d<? super Unit>, Object> f157534i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ r53.j<Object> f157535j;

        /* JADX INFO: renamed from: s53.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        public static final class C2972a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f157536a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.i<Object>[] f157537b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f157538c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f157539d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q53.i<m0<Object>> f157540e;

            /* JADX INFO: renamed from: s53.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C2973a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ q53.i<m0<Object>> f157541a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f157542b;

                /* JADX INFO: renamed from: s53.m$a$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @v13.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                public static final class C2974a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f157543a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C2973a<T> f157544b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public int f157545c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C2974a(C2973a<? super T> c2973a, t13.d<? super C2974a> dVar) {
                        super(dVar);
                        this.f157544b = c2973a;
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f157543a = obj;
                        this.f157545c |= Integer.MIN_VALUE;
                        return this.f157544b.emit(null, this);
                    }
                }

                public C2973a(q53.i<m0<Object>> iVar, int i14) {
                    this.f157541a = iVar;
                    this.f157542b = i14;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
                
                    if (gg.b.U(r0) == r1) goto L21;
                 */
                @Override // r53.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t7, t13.d<? super Unit> dVar) {
                    C2974a c2974a;
                    if (dVar instanceof C2974a) {
                        c2974a = (C2974a) dVar;
                        int i14 = c2974a.f157545c;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2974a.f157545c = i14 - Integer.MIN_VALUE;
                        } else {
                            c2974a = new C2974a(this, dVar);
                        }
                    } else {
                        c2974a = new C2974a(this, dVar);
                    }
                    Object obj = c2974a.f157543a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2974a.f157545c;
                    if (i15 == 0) {
                        o13.r.b(obj);
                        m0<Object> m0Var = new m0<>(this.f157542b, t7);
                        c2974a.f157545c = 1;
                        if (this.f157541a.h(m0Var, c2974a) != aVar) {
                        }
                        return aVar;
                    }
                    if (i15 == 1) {
                        o13.r.b(obj);
                    } else {
                        if (i15 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                    c2974a.f157545c = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2972a(r53.i<Object>[] iVarArr, int i14, AtomicInteger atomicInteger, q53.i<m0<Object>> iVar, t13.d<? super C2972a> dVar) {
                super(2, dVar);
                this.f157537b = iVarArr;
                this.f157538c = i14;
                this.f157539d = atomicInteger;
                this.f157540e = iVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2972a(this.f157537b, this.f157538c, this.f157539d, this.f157540e, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2972a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f157536a;
                AtomicInteger atomicInteger = this.f157539d;
                q53.i<m0<Object>> iVar = this.f157540e;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        r53.i<Object>[] iVarArr = this.f157537b;
                        int i15 = this.f157538c;
                        r53.i<Object> iVar2 = iVarArr[i15];
                        C2973a c2973a = new C2973a(iVar, i15);
                        this.f157536a = 1;
                        if (iVar2.collect(c2973a, this) == aVar) {
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
                        iVar.q(null);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        iVar.q(null);
                    }
                    throw th3;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(r53.i<Object>[] iVarArr, e23.a<Object[]> aVar, e23.q<? super r53.j<Object>, ? super Object[], ? super t13.d<? super Unit>, ? extends Object> qVar, r53.j<Object> jVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157532g = iVarArr;
            this.f157533h = aVar;
            this.f157534i = qVar;
            this.f157535j = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f157532g, this.f157533h, this.f157534i, this.f157535j, dVar);
            aVar.f157531f = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bf A[DONT_INVERT, EDGE_INSN: B:34:0x00bf->B:20:0x007e BREAK  A[LOOP:0: B:27:0x009e->B:45:?]] */
        /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:44:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:27:0x009e->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00df -> B:20:0x007e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f7 -> B:20:0x007e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x00bf
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s53.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(r53.i[] iVarArr, e23.a aVar, e23.q qVar, r53.j jVar, t13.d dVar) {
        a aVar2 = new a(iVarArr, aVar, qVar, jVar, null);
        q qVar2 = new q(dVar.getF157466b(), dVar);
        Object objV = oi0.c.V(qVar2, true, qVar2, aVar2);
        return objV == u13.a.COROUTINE_SUSPENDED ? objV : Unit.INSTANCE;
    }
}
