package defpackage;

import com.airbnb.lottie.animation.keyframe.KeyframeAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fb extends KeyframeAnimation<Integer> {
    public fb(List<jb<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer getValue(jb<Integer> jbVar, float f) {
        return Integer.valueOf(e(jbVar, f));
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
    int e(jb<Integer> jbVar, float f) {
        if (jbVar.j == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = jbVar.f38328b == null ? jbVar.h() : jbVar.b();
        if (this.valueCallback != null) {
            Integer num = (Integer) this.valueCallback.getValueInternal(jbVar.h, jbVar.f38327a.floatValue(), jbVar.j, Integer.valueOf(iH), f, getLinearCurrentKeyframeProgress(), getProgress());
            if (num != null) {
                return num.intValue();
            }
        }
        return jc.b(jbVar.h(), iH, f);
    }

    public int e() {
        return e(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
