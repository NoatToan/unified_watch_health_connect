package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {68}, m = "invokeSuspend")
public final class f0 extends v13.i implements e23.p<r53.j<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f195938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q<Object, Object, t13.d<Object>, Object> f195939d;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Object> f195940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.q<T, T, t13.d<? super T>, Object> f195941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.j<T> f195942c;

        /* JADX INFO: renamed from: yc.f0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @v13.e(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", l = {73, 76}, m = "emit")
        public static final class C3652a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a f195943a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public p005kotlin.jvm.internal.r0 f195944b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f195945c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a<T> f195946d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f195947e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3652a(a<? super T> aVar, t13.d<? super C3652a> dVar) {
                super(dVar);
                this.f195946d = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f195945c = obj;
                this.f195947e |= Integer.MIN_VALUE;
                return this.f195946d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(p005kotlin.jvm.internal.r0<Object> r0Var, e23.q<? super T, ? super T, ? super t13.d<? super T>, ? extends Object> qVar, r53.j<? super T> jVar) {
            this.f195940a = r0Var;
            this.f195941b = qVar;
            this.f195942c = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        
            if (r8.emit(r9, r0) == r1) goto L26;
         */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t7, t13.d<? super Unit> dVar) {
            C3652a c3652a;
            p005kotlin.jvm.internal.r0<Object> r0Var;
            p005kotlin.jvm.internal.r0<Object> r0Var2;
            a<T> aVar;
            if (dVar instanceof C3652a) {
                c3652a = (C3652a) dVar;
                int i14 = c3652a.f195947e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3652a.f195947e = i14 - Integer.MIN_VALUE;
                } else {
                    c3652a = new C3652a(this, dVar);
                }
            } else {
                c3652a = new C3652a(this, dVar);
            }
            Object obj = c3652a.f195945c;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3652a.f195947e;
            if (i15 != 0) {
                if (i15 == 1) {
                    r0Var2 = c3652a.f195944b;
                    aVar = c3652a.f195943a;
                    o13.r.b(obj);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            r0Var = this.f195940a;
            Object obj2 = r0Var.f105810a;
            if (obj2 == i0.f196054a) {
                aVar = this;
                r0Var.f105810a = t7;
                r53.j<T> jVar = aVar.f195942c;
                T t14 = aVar.f195940a.f105810a;
                c3652a.f195943a = null;
                c3652a.f195944b = null;
                c3652a.f195947e = 2;
            } else {
                c3652a.f195943a = this;
                c3652a.f195944b = r0Var;
                c3652a.f195947e = 1;
                Object objInvoke = this.f195941b.invoke((T) obj2, t7, c3652a);
                if (objInvoke != aVar2) {
                    obj = objInvoke;
                    r0Var2 = r0Var;
                    aVar = this;
                }
            }
            return aVar2;
            Object obj3 = obj;
            r0Var = r0Var2;
            t7 = (T) obj3;
            r0Var.f105810a = t7;
            r53.j<T> jVar2 = aVar.f195942c;
            T t15 = aVar.f195940a.f105810a;
            c3652a.f195943a = null;
            c3652a.f195944b = null;
            c3652a.f195947e = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(r53.i<Object> iVar, e23.q<Object, Object, ? super t13.d<Object>, ? extends Object> qVar, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f195938c = iVar;
        this.f195939d = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f0 f0Var = new f0(this.f195938c, this.f195939d, dVar);
        f0Var.f195937b = obj;
        return f0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<Object> jVar, t13.d<? super Unit> dVar) {
        return ((f0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195936a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = (r53.j) this.f195937b;
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            r0Var.f105810a = i0.f196054a;
            a aVar2 = new a(r0Var, this.f195939d, jVar);
            this.f195936a = 1;
            if (this.f195938c.collect(aVar2, this) == aVar) {
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
