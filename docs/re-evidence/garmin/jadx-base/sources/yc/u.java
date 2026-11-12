package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyc/u;", "", "T", "initialValue", "<init>", "(Ljava/lang/Object;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.p2 f196494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f196495b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements r53.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f196496a;

        /* JADX INFO: renamed from: yc.u$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C3676a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f196497a;

            /* JADX INFO: renamed from: yc.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @v13.e(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", l = {225}, m = "emit")
            public static final class C3677a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f196498a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f196499b;

                public C3677a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f196498a = obj;
                    this.f196499b |= Integer.MIN_VALUE;
                    return C3676a.this.emit(null, this);
                }
            }

            public C3676a(r53.j jVar) {
                this.f196497a = jVar;
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
            public final Object emit(Object obj, t13.d dVar) {
                C3677a c3677a;
                if (dVar instanceof C3677a) {
                    c3677a = (C3677a) dVar;
                    int i14 = c3677a.f196499b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3677a.f196499b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3677a = new C3677a(dVar);
                    }
                } else {
                    c3677a = new C3677a(dVar);
                }
                Object obj2 = c3677a.f196498a;
                Object obj3 = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3677a.f196499b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    B b14 = ((o13.p) obj).f128595b;
                    if (b14 != 0) {
                        c3677a.f196499b = 1;
                        if (this.f196497a.emit(b14, c3677a) == obj3) {
                            return obj3;
                        }
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
            this.f196496a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j jVar, t13.d dVar) {
            Object objCollect = this.f196496a.collect(new C3676a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public u(T t7) {
        r53.p2 p2VarA = r53.q2.a(new o13.p(Integer.MIN_VALUE, t7));
        this.f196494a = p2VarA;
        this.f196495b = new a(p2VarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(T t7) {
        t7.getClass();
        r53.p2 p2Var = this.f196494a;
        p2Var.k(null, new o13.p(Integer.valueOf(((Number) ((o13.p) p2Var.getValue()).f128594a).intValue() + 1), t7));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u() {
        p005kotlin.jvm.internal.j jVar = null;
        this(jVar, 1, jVar);
    }

    public /* synthetic */ u(Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : obj);
    }
}
