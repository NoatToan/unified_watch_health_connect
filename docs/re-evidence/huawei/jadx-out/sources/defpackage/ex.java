package defpackage;

import com.airbnb.lottie.animation.keyframe.KeyframeAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ex extends KeyframeAnimation<Integer> {
    public ex(List<jb<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Integer getValue(jb<Integer> jbVar, float f) {
        return Integer.valueOf(a(jbVar, f));
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
    public int a(jb<Integer> jbVar, float f) {
        Integer num;
        if (jbVar.j == null || jbVar.f38328b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.valueCallback != null && jbVar.f38327a != null && (num = (Integer) this.valueCallback.getValueInternal(jbVar.h, jbVar.f38327a.floatValue(), jbVar.j, jbVar.f38328b, f, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return num.intValue();
        }
        return ix.b(jc.b(f, 0.0f, 1.0f), jbVar.j.intValue(), jbVar.f38328b.intValue());
    }

    public int b() {
        return a(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
