package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ox9 extends f1e<Float> {
    public ox9(List<e1e<Float>> list) {
        super(list);
    }

    public float p() {
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
    public float q(e1e<Float> e1eVar, float f) {
        Float f2;
        if (e1eVar.f16153b == null || e1eVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        yte<A> yteVar = this.e;
        return (yteVar == 0 || (f2 = (Float) yteVar.b(e1eVar.g, e1eVar.h.floatValue(), e1eVar.f16153b, e1eVar.c, f, e(), f())) == null) ? d5g.i(e1eVar.g(), e1eVar.d(), f) : f2.floatValue();
    }

    @Override // defpackage.o82
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float i(e1e<Float> e1eVar, float f) {
        return Float.valueOf(q(e1eVar, f));
    }
}
