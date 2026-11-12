package g22;

import java.util.Arrays;
import o13.r;
import o53.b0;
import o53.c0;
import o53.m1;
import o53.s0;
import o53.t1;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg22/c;", "Params", "Result", "", "Lo53/z;", "dispatcher", "<init>", "(Lo53/z;)V", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c<Params, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f75549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f75550b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.util.extensions.CoroutinesAsyncTask$execute$1", f = "JavaCoroutines.kt", l = {87}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c<Params, Result> f75553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Params[] f75554d;

        /* JADX INFO: renamed from: g22.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.util.extensions.CoroutinesAsyncTask$execute$1$1", f = "JavaCoroutines.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1519a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c<Params, Result> f75555a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Result f75556b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1519a(c<Params, Result> cVar, Result result, t13.d<? super C1519a> dVar) {
                super(2, dVar);
                this.f75555a = cVar;
                this.f75556b = result;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1519a(this.f75555a, this.f75556b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1519a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f75555a.d(this.f75556b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<Params, Result> cVar, Params[] paramsArr, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f75553c = cVar;
            this.f75554d = paramsArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f75553c, this.f75554d, dVar);
            aVar.f75552b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f75552b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75551a;
            if (i14 == 0) {
                r.b(obj);
                Params[] paramsArr = this.f75554d;
                Object[] objArrCopyOf = Arrays.copyOf(paramsArr, paramsArr.length);
                c<Params, Result> cVar = this.f75553c;
                Object objB = cVar.b(objArrCopyOf);
                if (c0.g(b0Var)) {
                    x53.c cVar2 = s0.f129406a;
                    t1 t1Var = u53.o.f168762a;
                    C1519a c1519a = new C1519a(cVar, objB, null);
                    this.f75552b = null;
                    this.f75551a = 1;
                    if (ge1.b.e0(t1Var, c1519a, this) == aVar) {
                        return aVar;
                    }
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

    public c(z zVar) {
        zVar.getClass();
        m1 m1VarC = g8.i.c();
        this.f75549a = m1VarC;
        this.f75550b = c0.a(zVar.plus(m1VarC));
    }

    public final void a() {
        m1 m1Var = this.f75549a;
        if (m1Var.isActive()) {
            m1Var.c(null);
        }
    }

    public abstract Result b(Params... paramsArr);

    public final void c(Params... paramsArr) {
        ge1.b.T(this.f75550b, null, null, new a(this, paramsArr, null), 3);
    }

    public void d(Result result) {
    }

    public c() {
        this(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(zVar);
    }
}
