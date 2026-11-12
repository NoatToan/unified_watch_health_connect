package yc;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lyc/i4;", "", "", "cancelPreviousInEqualPriority", "<init>", "(Z)V", "a", "b", "c", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f196065b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f196066a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/i4$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lyc/i4;", "runner", "<init>", "(Lyc/i4;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends CancellationException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i4 f196067a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i4 i4Var) {
            super("Cancelled isolated runner");
            i4Var.getClass();
            this.f196067a = i4Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyc/i4$c;", "", "Lyc/i4;", "singleRunner", "", "cancelPreviousInEqualPriority", "<init>", "(Lyc/i4;Z)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i4 f196068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f196069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final z53.b f196070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o53.l1 f196071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f196072e;

        public c(i4 i4Var, boolean z14) {
            i4Var.getClass();
            this.f196068a = i4Var;
            this.f196069b = z14;
            this.f196070c = z53.c.a();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(o53.l1 l1Var, v13.c cVar) {
            j4 j4Var;
            z53.b bVar;
            c cVar2;
            if (cVar instanceof j4) {
                j4Var = (j4) cVar;
                int i14 = j4Var.f196100f;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    j4Var.f196100f = i14 - Integer.MIN_VALUE;
                } else {
                    j4Var = new j4(this, cVar);
                }
            } else {
                j4Var = new j4(this, cVar);
            }
            Object obj = j4Var.f196098d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = j4Var.f196100f;
            if (i15 == 0) {
                o13.r.b(obj);
                j4Var.f196095a = this;
                j4Var.f196096b = l1Var;
                bVar = this.f196070c;
                j4Var.f196097c = bVar;
                j4Var.f196100f = 1;
                if (bVar.c(j4Var) == aVar) {
                    return aVar;
                }
                cVar2 = this;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z53.b bVar2 = j4Var.f196097c;
                o53.l1 l1Var2 = j4Var.f196096b;
                cVar2 = j4Var.f196095a;
                o13.r.b(obj);
                bVar = bVar2;
                l1Var = l1Var2;
            }
            try {
                if (l1Var == cVar2.f196071d) {
                    cVar2.f196071d = null;
                }
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                bVar.e(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [o53.l1] */
        /* JADX WARN: Type inference failed for: r11v1, types: [z53.a] */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v4, types: [z53.a] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [o53.l1] */
        /* JADX WARN: Type inference failed for: r2v4, types: [o53.l1] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        public final Object b(int i14, o53.l1 l1Var, v13.c cVar) {
            k4 k4Var;
            c cVar2;
            ?? r14;
            z53.a aVar;
            ?? r15;
            c cVar3;
            int i15;
            if (cVar instanceof k4) {
                k4Var = (k4) cVar;
                int i16 = k4Var.f196130g;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    k4Var.f196130g = i16 - Integer.MIN_VALUE;
                } else {
                    k4Var = new k4(this, cVar);
                }
            } else {
                k4Var = new k4(this, cVar);
            }
            Object obj = k4Var.f196128e;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i17 = k4Var.f196130g;
            boolean z14 = true;
            try {
                if (i17 == 0) {
                    o13.r.b(obj);
                    k4Var.f196124a = this;
                    k4Var.f196125b = l1Var;
                    z53.b bVar = this.f196070c;
                    k4Var.f196126c = bVar;
                    k4Var.f196127d = i14;
                    k4Var.f196130g = 1;
                    if (bVar.c(k4Var) != aVar2) {
                        cVar2 = this;
                        r14 = l1Var;
                        aVar = bVar;
                    }
                    return aVar2;
                }
                if (i17 == 1) {
                    i14 = k4Var.f196127d;
                    z53.a aVar3 = k4Var.f196126c;
                    o53.l1 l1Var2 = k4Var.f196125b;
                    cVar2 = k4Var.f196124a;
                    o13.r.b(obj);
                    r14 = l1Var2;
                    aVar = aVar3;
                } else {
                    if (i17 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i14 = k4Var.f196127d;
                    z53.a aVar4 = k4Var.f196126c;
                    o53.l1 l1Var3 = k4Var.f196125b;
                    cVar3 = k4Var.f196124a;
                    o13.r.b(obj);
                    r15 = l1Var3;
                    aVar = aVar4;
                }
                cVar2 = cVar3;
                r14 = r15;
                cVar2.f196071d = r14;
                cVar2.f196072e = i14;
                l1Var = aVar;
                Boolean boolValueOf = Boolean.valueOf(z14);
                l1Var.e(null);
                return boolValueOf;
                o53.l1 l1Var4 = cVar2.f196071d;
                if (l1Var4 == null || !l1Var4.isActive() || (i15 = cVar2.f196072e) < i14 || (i15 == i14 && cVar2.f196069b)) {
                    if (l1Var4 != null) {
                        l1Var4.c(new a(cVar2.f196068a));
                    }
                    if (l1Var4 != null) {
                        k4Var.f196124a = cVar2;
                        k4Var.f196125b = r14;
                        k4Var.f196126c = aVar;
                        k4Var.f196127d = i14;
                        k4Var.f196130g = 2;
                        if (l1Var4.P(k4Var) != aVar2) {
                            r15 = r14;
                            cVar3 = cVar2;
                            aVar = aVar;
                            cVar2 = cVar3;
                            r14 = r15;
                        }
                        return aVar2;
                    }
                    cVar2.f196071d = r14;
                    cVar2.f196072e = i14;
                    l1Var = aVar;
                } else {
                    z14 = false;
                    l1Var = aVar;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z14);
                l1Var.e(null);
                return boolValueOf2;
            } catch (Throwable th3) {
                l1Var.e(null);
                throw th3;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @v13.e(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i4 f196073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f196074b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f196076d;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f196074b = obj;
            this.f196076d |= Integer.MIN_VALUE;
            return i4.this.a(0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, 61, 61}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f196077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f196078b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f196080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f196081e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(int i14, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f196080d = i14;
            this.f196081e = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = i4.this.new e(this.f196080d, this.f196081e, dVar);
            eVar.f196078b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            if (r9.a(r1, r8) == r0) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o53.l1] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v8, types: [o53.l1] */
        /* JADX WARN: Type inference failed for: r3v1, types: [yc.i4$c] */
        /* JADX WARN: Type inference failed for: r9v15, types: [yc.i4$c] */
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
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            o53.l1 l1Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            ?? r14 = this.f196077a;
            int i14 = 4;
            i4 i4Var = i4.this;
            try {
                if (r14 == 0) {
                    o13.r.b(obj);
                    t13.g.a aVar2 = ((o53.b0) this.f196078b).getF183565a().get(o53.l1.f129368i0);
                    if (aVar2 == null) {
                        vb.h.z("Internal error. coroutineScope should've created a job.");
                        return null;
                    }
                    o53.l1 l1Var2 = (o53.l1) aVar2;
                    c cVar = i4Var.f196066a;
                    this.f196078b = l1Var2;
                    this.f196077a = 1;
                    Object objB = cVar.b(this.f196080d, l1Var2, this);
                    if (objB != aVar) {
                        l1Var = l1Var2;
                        obj = objB;
                    }
                    r14 = l1Var;
                    return aVar;
                }
                if (r14 == 1) {
                    o53.l1 l1Var3 = (o53.l1) this.f196078b;
                    o13.r.b(obj);
                    l1Var = l1Var3;
                } else if (r14 == 2) {
                    o53.l1 l1Var4 = (o53.l1) this.f196078b;
                    o13.r.b(obj);
                    r14 = l1Var4;
                    r14 = l1Var;
                    ?? r15 = i4Var.f196066a;
                    i14 = 0;
                    this.f196078b = null;
                    this.f196077a = 3;
                } else {
                    if (r14 != 3) {
                        if (r14 != 4) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th3 = (Throwable) this.f196078b;
                        o13.r.b(obj);
                        throw th3;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
                if (((Boolean) obj).booleanValue()) {
                    e23.l<t13.d<? super Unit>, Object> lVar = this.f196081e;
                    this.f196078b = l1Var;
                    this.f196077a = 2;
                    if (lVar.invoke(this) != aVar) {
                        r14 = l1Var;
                        ?? r16 = i4Var.f196066a;
                        i14 = 0;
                        this.f196078b = null;
                        this.f196077a = 3;
                    }
                    r14 = l1Var;
                    return aVar;
                }
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                ?? r17 = i4Var.f196066a;
                this.f196078b = th4;
                this.f196077a = i14;
                if (r17.a(r14, this) != aVar) {
                    throw th4;
                }
            }
        }
    }

    static {
        new b(null);
    }

    public i4(boolean z14) {
        this.f196066a = new c(this, z14);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i14, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, t13.d<? super Unit> dVar) {
        d dVar2;
        i4 i4Var;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i15 = dVar2.f196076d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar2.f196076d = i15 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f196074b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar2.f196076d;
        if (i16 == 0) {
            o13.r.b(obj);
            try {
                e eVar = new e(i14, lVar, null);
                dVar2.f196073a = this;
                dVar2.f196076d = 1;
                if (o53.c0.e(eVar, dVar2) == aVar) {
                    return aVar;
                }
            } catch (a e4) {
                e = e4;
                i4Var = this;
                if (e.f196067a != i4Var) {
                    throw e;
                }
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4Var = dVar2.f196073a;
            try {
                o13.r.b(obj);
            } catch (a e14) {
                e = e14;
                if (e.f196067a != i4Var) {
                    throw e;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/i4$b;", "", "<init>", "()V", "", "DEFAULT_PRIORITY", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public i4() {
        this(false, 1, null);
    }

    public /* synthetic */ i4(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14);
    }
}
