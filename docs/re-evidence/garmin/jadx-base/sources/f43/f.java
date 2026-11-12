package f43;

import e23.l;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends z43.b.a<t23.b, t23.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0<t23.b> f68883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<t23.b, Boolean> f68884b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(r0<t23.b> r0Var, l<? super t23.b, Boolean> lVar) {
        this.f68883a = r0Var;
        this.f68884b = lVar;
    }

    @Override // z43.b.c
    public final Object a() {
        return this.f68883a.f105810a;
    }

    @Override // z43.b.a, z43.b.c
    public final boolean b(Object obj) {
        ((t23.b) obj).getClass();
        return this.f68883a.f105810a == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, t23.b] */
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
    @Override // z43.b.a, z43.b.c
    public final void c(Object obj) {
        ?? r14 = (t23.b) obj;
        r14.getClass();
        r0<t23.b> r0Var = this.f68883a;
        if (r0Var.f105810a == null && ((Boolean) this.f68884b.invoke(r14)).booleanValue()) {
            r0Var.f105810a = r14;
        }
    }
}
