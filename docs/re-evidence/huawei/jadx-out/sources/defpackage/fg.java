package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.KeyframeAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fg extends KeyframeAnimation<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f34011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f34012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PathMeasure f34013c;
    private final float[] d;
    private fc e;

    public fg(List<? extends jb<PointF>> list) {
        super(list);
        this.f34012b = new PointF();
        this.d = new float[2];
        this.f34011a = new float[2];
        this.f34013c = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public PointF getValue(jb<PointF> jbVar, float f) {
        PointF pointF;
        fc fcVar = (fc) jbVar;
        Path pathE = fcVar.e();
        if (pathE == null) {
            return jbVar.j;
        }
        if (this.valueCallback != null && (pointF = (PointF) this.valueCallback.getValueInternal(fcVar.h, fcVar.f38327a.floatValue(), (PointF) fcVar.j, (PointF) fcVar.f38328b, getLinearCurrentKeyframeProgress(), f, getProgress())) != null) {
            return pointF;
        }
        if (this.e != fcVar) {
            this.f34013c.setPath(pathE, false);
            this.e = fcVar;
        }
        float length = this.f34013c.getLength();
        float f2 = f * length;
        this.f34013c.getPosTan(f2, this.d, this.f34011a);
        PointF pointF2 = this.f34012b;
        float[] fArr = this.d;
        pointF2.set(fArr[0], fArr[1]);
        if (f2 < 0.0f) {
            PointF pointF3 = this.f34012b;
            float[] fArr2 = this.f34011a;
            pointF3.offset(fArr2[0] * f2, fArr2[1] * f2);
        } else if (f2 > length) {
            PointF pointF4 = this.f34012b;
            float[] fArr3 = this.f34011a;
            float f3 = f2 - length;
            pointF4.offset(fArr3[0] * f3, fArr3[1] * f3);
        }
        return this.f34012b;
    }
}
