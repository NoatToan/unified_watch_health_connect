package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class pal extends f1e<pbl> {
    public final pbl i;

    public pal(List<e1e<pbl>> list) {
        super(list);
        this.i = new pbl();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.o82
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public pbl i(e1e<pbl> e1eVar, float f) {
        pbl pblVar;
        pbl pblVar2;
        pbl pblVar3 = e1eVar.f16153b;
        if (pblVar3 == null || (pblVar = e1eVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        pbl pblVar4 = pblVar3;
        pbl pblVar5 = pblVar;
        yte<A> yteVar = this.e;
        if (yteVar != 0 && (pblVar2 = (pbl) yteVar.b(e1eVar.g, e1eVar.h.floatValue(), pblVar4, pblVar5, f, e(), f())) != null) {
            return pblVar2;
        }
        this.i.d(d5g.i(pblVar4.b(), pblVar5.b(), f), d5g.i(pblVar4.c(), pblVar5.c(), f));
        return this.i;
    }
}
