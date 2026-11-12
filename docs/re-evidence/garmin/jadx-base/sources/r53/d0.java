package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class d0<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.m0 f150551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j<T> f150552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<T, t13.d<? super Boolean>, Object> f150553c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d0 f150554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f150555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f150556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d0<T> f150557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f150558e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d0<? super T> d0Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f150557d = d0Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150556c = obj;
            this.f150558e |= Integer.MIN_VALUE;
            return this.f150557d.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(p005kotlin.jvm.internal.m0 m0Var, j<? super T> jVar, e23.p<? super T, ? super t13.d<? super Boolean>, ? extends Object> pVar) {
        this.f150551a = m0Var;
        this.f150552b = jVar;
        this.f150553c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r6.f150552b.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
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
        a aVar;
        d0<T> d0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150558e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150558e = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object objInvoke = aVar.f150556c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150558e;
        if (i15 == 0) {
            o13.r.b(objInvoke);
            if (this.f150551a.f105804a) {
                aVar.f150558e = 1;
            } else {
                aVar.f150554a = this;
                aVar.f150555b = t7;
                aVar.f150558e = 2;
                objInvoke = this.f150553c.invoke(t7, aVar);
                if (objInvoke != aVar2) {
                    d0Var = this;
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    d0Var.f150551a.f105804a = true;
                    j<T> jVar = d0Var.f150552b;
                    aVar.f150554a = null;
                    aVar.f150555b = null;
                    aVar.f150558e = 3;
                }
            }
            return aVar2;
        }
        if (i15 == 1) {
            o13.r.b(objInvoke);
            return Unit.INSTANCE;
        }
        if (i15 == 2) {
            t7 = (T) aVar.f150555b;
            d0Var = aVar.f150554a;
            o13.r.b(objInvoke);
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            d0Var.f150551a.f105804a = true;
            j<T> jVar2 = d0Var.f150552b;
            aVar.f150554a = null;
            aVar.f150555b = null;
            aVar.f150558e = 3;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objInvoke);
        }
        return Unit.INSTANCE;
    }
}
