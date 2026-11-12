package vh;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvh/d;", "T", "Lvh/a;", "Lvh/p0;", "wrappedAdapter", "<init>", "(Lvh/a;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d<T> implements a<p0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f178280a;

    public d(a<T> aVar) {
        aVar.getClass();
        this.f178280a = aVar;
    }

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
    @Override // vh.a
    public final void a(zh.g gVar, z zVar, Object obj) {
        p0 p0Var = (p0) obj;
        gVar.getClass();
        zVar.getClass();
        p0Var.getClass();
        if (!(p0Var instanceof p0.c)) {
            gVar.l4();
        } else {
            this.f178280a.a(gVar, zVar, ((p0.c) p0Var).f178369b);
        }
    }

    @Override // vh.a
    public final Object b(zh.f fVar, z zVar) {
        fVar.getClass();
        zVar.getClass();
        if (fVar.peek() != zh.f.a.NULL) {
            return new p0.c(this.f178280a.b(fVar, zVar));
        }
        fVar.skipValue();
        return p0.a.f178368b;
    }
}
