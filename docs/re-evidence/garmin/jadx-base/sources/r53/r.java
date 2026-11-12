package r53;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lo53/b0;", "Lr53/j;", "downstream", "", "<anonymous>", "(Lo53/b0;Lr53/j;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
public final class r extends v13.i implements e23.q<o53.b0, j<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f150811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p005kotlin.jvm.internal.q0 f150812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f150814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f150815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<Object, Long> f150816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i<Object> f150817g;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j<Object> f150819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Object> f150820c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j<Object> jVar, p005kotlin.jvm.internal.r0<Object> r0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f150819b = jVar;
            this.f150820c = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f150819b, this.f150820c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150818a;
            p005kotlin.jvm.internal.r0<Object> r0Var = this.f150820c;
            if (i14 == 0) {
                o13.r.b(obj);
                u53.x xVar = s53.w.f157598a;
                Object obj2 = r0Var.f105810a;
                if (obj2 == xVar) {
                    obj2 = null;
                }
                this.f150818a = 1;
                if (this.f150819b.emit(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            r0Var.f105810a = null;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq53/m;", "", "value", "", "<anonymous>", "(Lq53/m;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<q53.m<? extends Object>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p005kotlin.jvm.internal.r0 f150821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f150822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f150823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Object> f150824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j<Object> f150825e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p005kotlin.jvm.internal.r0<Object> r0Var, j<Object> jVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f150824d = r0Var;
            this.f150825e = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f150824d, this.f150825e, dVar);
            bVar.f150823c = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(q53.m<? extends Object> mVar, t13.d<? super Unit> dVar) {
            return ((b) create(q53.m.a(mVar.f143000a), dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v7, types: [T, u53.x] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            p005kotlin.jvm.internal.r0<Object> r0Var;
            p005kotlin.jvm.internal.r0<Object> r0Var2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150822b;
            if (i14 == 0) {
                o13.r.b(obj);
                ?? r14 = ((q53.m) this.f150823c).f143000a;
                boolean z14 = r14 instanceof q53.m.c;
                r0Var = this.f150824d;
                if (!z14) {
                    r0Var.f105810a = r14;
                }
                if (z14) {
                    q53.m.c cVar = (q53.m.c) r14;
                    q53.m.a aVar2 = cVar instanceof q53.m.a ? (q53.m.a) cVar : null;
                    Throwable th3 = aVar2 != null ? aVar2.f143001a : null;
                    if (th3 != null) {
                        throw th3;
                    }
                    Object obj2 = r0Var.f105810a;
                    if (obj2 != null) {
                        Object obj3 = obj2 != s53.w.f157598a ? obj2 : null;
                        this.f150823c = r14;
                        this.f150821a = r0Var;
                        this.f150822b = 1;
                        if (this.f150825e.emit(obj3, this) == aVar) {
                            return aVar;
                        }
                        r0Var2 = r0Var;
                    }
                    r0Var.f105810a = s53.w.f157600c;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var2 = this.f150821a;
            o13.r.b(obj);
            r0Var = r0Var2;
            r0Var.f105810a = s53.w.f157600c;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<q53.t<? super Object>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<Object> f150828c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q53.t<Object> f150829a;

            /* JADX INFO: renamed from: r53.r$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @v13.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "emit")
            public static final class C2838a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f150830a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f150831b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f150832c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2838a(a<? super T> aVar, t13.d<? super C2838a> dVar) {
                    super(dVar);
                    this.f150831b = aVar;
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f150830a = obj;
                    this.f150832c |= Integer.MIN_VALUE;
                    return this.f150831b.emit(null, this);
                }
            }

            public a(q53.t<Object> tVar) {
                this.f150829a = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // r53.j
            public final Object emit(T t7, t13.d<? super Unit> dVar) {
                C2838a c2838a;
                if (dVar instanceof C2838a) {
                    c2838a = (C2838a) dVar;
                    int i14 = c2838a.f150832c;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2838a.f150832c = i14 - Integer.MIN_VALUE;
                    } else {
                        c2838a = new C2838a(this, dVar);
                    }
                } else {
                    c2838a = new C2838a(this, dVar);
                }
                Object obj = c2838a.f150830a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2838a.f150832c;
                if (i15 == 0) {
                    o13.r.b(obj);
                    if (t7 == null) {
                        t7 = (T) s53.w.f157598a;
                    }
                    c2838a.f150832c = 1;
                    if (this.f150829a.h(t7, c2838a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i<Object> iVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f150828c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(this.f150828c, dVar);
            cVar.f150827b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(q53.t<? super Object> tVar, t13.d<? super Unit> dVar) {
            return ((c) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150826a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a((q53.t) this.f150827b);
                this.f150826a = 1;
                if (this.f150828c.collect(aVar2, this) == aVar) {
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
    public r(e23.l<Object, Long> lVar, i<Object> iVar, t13.d<? super r> dVar) {
        super(3, dVar);
        this.f150816f = lVar;
        this.f150817g = iVar;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, j<Object> jVar, t13.d<? super Unit> dVar) {
        r rVar = new r(this.f150816f, this.f150817g, dVar);
        rVar.f150814d = b0Var;
        rVar.f150815e = jVar;
        return rVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac A[PHI: r2 r7 r8 r9
      0x00ac: PHI (r2v5 kotlin.jvm.internal.q0) = (r2v7 kotlin.jvm.internal.q0), (r2v10 kotlin.jvm.internal.q0), (r2v10 kotlin.jvm.internal.q0) binds: [B:28:0x00aa, B:15:0x0076, B:21:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r7v2 kotlin.jvm.internal.r0) = (r7v11 kotlin.jvm.internal.r0), (r7v12 kotlin.jvm.internal.r0), (r7v12 kotlin.jvm.internal.r0) binds: [B:28:0x00aa, B:15:0x0076, B:21:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r8v2 ??) = (r8v12 ??), (r8v13 ??), (r8v14 ??) binds: [B:28:0x00aa, B:15:0x0076, B:21:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r9v4 r53.j) = (r9v5 r53.j), (r9v6 r53.j), (r9v6 r53.j) binds: [B:28:0x00aa, B:15:0x0076, B:21:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x0136  */
    /* JADX WARN: Code duplicated, block: B:37:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, q53.v] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
