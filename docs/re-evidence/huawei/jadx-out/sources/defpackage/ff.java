package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.KeyframeAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ff extends KeyframeAnimation<PointF> {
    private final PointF e;

    public ff(List<jb<PointF>> list) {
        super(list);
        this.e = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PointF getValue(jb<PointF> jbVar, float f) {
        return getValue(jbVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public PointF getValue(jb<PointF> jbVar, float f, float f2, float f3) {
        PointF pointF;
        if (jbVar.j == null || jbVar.f38328b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = jbVar.j;
        PointF pointF3 = jbVar.f38328b;
        if (this.valueCallback != null && (pointF = (PointF) this.valueCallback.getValueInternal(jbVar.h, jbVar.f38327a.floatValue(), pointF2, pointF3, f, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return pointF;
        }
        this.e.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return this.e;
    }
}
