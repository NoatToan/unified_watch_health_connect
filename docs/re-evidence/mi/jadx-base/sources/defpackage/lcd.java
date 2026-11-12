package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lcd extends f1e<Integer> {
    public lcd(List<e1e<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
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
    public int q(e1e<Integer> e1eVar, float f) {
        Integer num;
        if (e1eVar.f16153b == null || e1eVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        yte<A> yteVar = this.e;
        return (yteVar == 0 || (num = (Integer) yteVar.b(e1eVar.g, e1eVar.h.floatValue(), e1eVar.f16153b, e1eVar.c, f, e(), f())) == null) ? d5g.j(e1eVar.h(), e1eVar.e(), f) : num.intValue();
    }

    @Override // defpackage.o82
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer i(e1e<Integer> e1eVar, float f) {
        return Integer.valueOf(q(e1eVar, f));
    }
}
