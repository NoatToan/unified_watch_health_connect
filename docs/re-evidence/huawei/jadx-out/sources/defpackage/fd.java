package defpackage;

import com.airbnb.lottie.animation.keyframe.KeyframeAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fd extends KeyframeAnimation<Float> {
    public fd(List<jb<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getValue(jb<Float> jbVar, float f) {
        return Float.valueOf(a(jbVar, f));
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
    float a(jb<Float> jbVar, float f) {
        Float f2;
        if (jbVar.j == null || jbVar.f38328b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.valueCallback != null && (f2 = (Float) this.valueCallback.getValueInternal(jbVar.h, jbVar.f38327a.floatValue(), jbVar.j, jbVar.f38328b, f, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return f2.floatValue();
        }
        return jc.a(jbVar.j(), jbVar.d(), f);
    }

    public float a() {
        return a(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
