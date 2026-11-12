package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lr53/g;", "T", "Lr53/i;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "<init>", "(Lr53/i;Le23/l;Le23/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f150615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<T, Object> f150616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.p<Object, Object, Boolean> f150617c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g<T> f150618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<Object> f150619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<T> f150620c;

        /* JADX INFO: renamed from: r53.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        public static final class C2829a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f150621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a<T> f150622b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f150623c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2829a(a<? super T> aVar, t13.d<? super C2829a> dVar) {
                super(dVar);
                this.f150622b = aVar;
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f150621a = obj;
                this.f150623c |= Integer.MIN_VALUE;
                return this.f150622b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(g<T> gVar, p005kotlin.jvm.internal.r0<Object> r0Var, j<? super T> jVar) {
            this.f150618a = gVar;
            this.f150619b = r0Var;
            this.f150620c = jVar;
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
            C2829a c2829a;
            if (dVar instanceof C2829a) {
                c2829a = (C2829a) dVar;
                int i14 = c2829a.f150623c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2829a.f150623c = i14 - Integer.MIN_VALUE;
                } else {
                    c2829a = new C2829a(this, dVar);
                }
            } else {
                c2829a = new C2829a(this, dVar);
            }
            Object obj = c2829a.f150621a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2829a.f150623c;
            if (i15 == 0) {
                o13.r.b(obj);
                g<T> gVar = this.f150618a;
                T t14 = (T) gVar.f150616b.invoke(t7);
                p005kotlin.jvm.internal.r0<Object> r0Var = this.f150619b;
                Object obj2 = r0Var.f105810a;
                if (obj2 != s53.w.f157598a && gVar.f150617c.invoke(obj2, t14).booleanValue()) {
                    return Unit.INSTANCE;
                }
                r0Var.f105810a = t14;
                c2829a.f150623c = 1;
                if (this.f150620c.emit(t7, c2829a) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public g(i<? extends T> iVar, e23.l<? super T, ? extends Object> lVar, e23.p<Object, Object, Boolean> pVar) {
        this.f150615a = iVar;
        this.f150616b = lVar;
        this.f150617c = pVar;
    }

    @Override // r53.i
    public final Object collect(j<? super T> jVar, t13.d<? super Unit> dVar) {
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        r0Var.f105810a = (T) s53.w.f157598a;
        Object objCollect = this.f150615a.collect(new a(this, r0Var, jVar), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
