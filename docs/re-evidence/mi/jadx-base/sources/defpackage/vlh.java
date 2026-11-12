package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vlh extends f1e<PointF> {
    public final PointF i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PathMeasure f37006k;
    public ulh l;

    public vlh(List<? extends e1e<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.f37006k = new PathMeasure();
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
    @Override // defpackage.o82
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(e1e<PointF> e1eVar, float f) {
        PointF pointF;
        ulh ulhVar = (ulh) e1eVar;
        Path pathK = ulhVar.k();
        if (pathK == null) {
            return e1eVar.f16153b;
        }
        yte<A> yteVar = this.e;
        if (yteVar != 0 && (pointF = (PointF) yteVar.b(ulhVar.g, ulhVar.h.floatValue(), (PointF) ulhVar.f16153b, (PointF) ulhVar.c, e(), f, f())) != null) {
            return pointF;
        }
        if (this.l != ulhVar) {
            this.f37006k.setPath(pathK, false);
            this.l = ulhVar;
        }
        PathMeasure pathMeasure = this.f37006k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.j, null);
        PointF pointF2 = this.i;
        float[] fArr = this.j;
        pointF2.set(fArr[0], fArr[1]);
        return this.i;
    }
}
