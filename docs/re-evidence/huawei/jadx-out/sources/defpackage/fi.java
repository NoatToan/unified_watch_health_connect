package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fi extends BaseKeyframeAnimation<gq, Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<ShapeModifierContent> f34083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f34084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Path f34085c;
    private Path d;
    private final gq e;

    public fi(List<jb<gq>> list) {
        super(list);
        this.e = new gq();
        this.f34084b = new Path();
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
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Path getValue(jb<gq> jbVar, float f) {
        gq gqVar = jbVar.j;
        gq gqVar2 = jbVar.f38328b;
        this.e.d(gqVar, gqVar2 == null ? gqVar : gqVar2, f);
        gq gqVarModifyShape = this.e;
        List<ShapeModifierContent> list = this.f34083a;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                gqVarModifyShape = this.f34083a.get(size).modifyShape(gqVarModifyShape);
            }
        }
        jc.c(gqVarModifyShape, this.f34084b);
        if (this.valueCallback != null) {
            if (this.f34085c == null) {
                this.f34085c = new Path();
                this.d = new Path();
            }
            jc.c(gqVar, this.f34085c);
            if (gqVar2 != null) {
                jc.c(gqVar2, this.d);
            }
            jf<A> jfVar = this.valueCallback;
            float f2 = jbVar.h;
            float fFloatValue = jbVar.f38327a.floatValue();
            Path path = this.f34085c;
            return (Path) jfVar.getValueInternal(f2, fFloatValue, path, gqVar2 == null ? path : this.d, f, getLinearCurrentKeyframeProgress(), getProgress());
        }
        return this.f34084b;
    }

    public void d(List<ShapeModifierContent> list) {
        this.f34083a = list;
    }
}
