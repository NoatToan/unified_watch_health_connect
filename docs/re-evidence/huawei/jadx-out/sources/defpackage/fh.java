package defpackage;

import com.airbnb.lottie.animation.keyframe.KeyframeAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fh extends KeyframeAnimation<jj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jj f34043b;

    public fh(List<jb<jj>> list) {
        super(list);
        this.f34043b = new jj();
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
    public jj getValue(jb<jj> jbVar, float f) {
        jj jjVar;
        if (jbVar.j == null || jbVar.f38328b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        jj jjVar2 = jbVar.j;
        jj jjVar3 = jbVar.f38328b;
        if (this.valueCallback != null && (jjVar = (jj) this.valueCallback.getValueInternal(jbVar.h, jbVar.f38327a.floatValue(), jjVar2, jjVar3, f, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return jjVar;
        }
        this.f34043b.a(jc.a(jjVar2.d(), jjVar3.d(), f), jc.a(jjVar2.b(), jjVar3.b(), f));
        return this.f34043b;
    }
}
