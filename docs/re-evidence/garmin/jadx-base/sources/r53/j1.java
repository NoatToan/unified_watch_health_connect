package r53;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class j1<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<ArrayList<T>> f150671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f150672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j<List<? extends T>> f150673c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1", f = "Transform.kt", l = {159}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j1 f150674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j1<T> f150676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f150677d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j1<? super T> j1Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f150676c = j1Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150675b = obj;
            this.f150677d |= Integer.MIN_VALUE;
            return this.f150676c.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j1(p005kotlin.jvm.internal.r0<ArrayList<T>> r0Var, int i14, j<? super List<? extends T>> jVar) {
        this.f150671a = r0Var;
        this.f150672b = i14;
        this.f150673c = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [r53.j, r53.j<java.util.List<? extends T>>] */
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
        a aVar;
        ?? r14;
        j1<T> j1Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150677d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150677d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f150675b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150677d;
        if (i15 == 0) {
            o13.r.b(obj);
            p005kotlin.jvm.internal.r0<ArrayList<T>> r0Var = this.f150671a;
            boolean z14 = (T) ((ArrayList) ((ArrayList<T>) r0Var.f105810a));
            int i16 = this.f150672b;
            if (!z14) {
                r14 = z14;
                T t14 = (T) new ArrayList(i16);
                r0Var.f105810a = t14;
                r14 = t14;
            }
            r14 = z14;
            r14.add(t7);
            if (r14.size() == i16) {
                aVar.f150674a = this;
                aVar.f150677d = 1;
                if (this.f150673c.emit(r14, aVar) == aVar2) {
                    return aVar2;
                }
                j1Var = this;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j1Var = aVar.f150674a;
        o13.r.b(obj);
        j1Var.f150671a.f105810a = null;
        return Unit.INSTANCE;
    }
}
