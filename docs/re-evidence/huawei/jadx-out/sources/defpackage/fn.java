package defpackage;

import com.airbnb.lottie.animation.keyframe.KeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fn extends KeyframeAnimation<DocumentData> {
    public fn(List<jb<DocumentData>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DocumentData getValue(jb<DocumentData> jbVar, float f) {
        if (this.valueCallback != null) {
            return (DocumentData) this.valueCallback.getValueInternal(jbVar.h, jbVar.f38327a == null ? Float.MAX_VALUE : jbVar.f38327a.floatValue(), jbVar.j, jbVar.f38328b == null ? jbVar.j : jbVar.f38328b, f, getInterpolatedCurrentKeyframeProgress(), getProgress());
        }
        if (f != 1.0f || jbVar.f38328b == null) {
            return jbVar.j;
        }
        return jbVar.f38328b;
    }

    public void a(final jf<String> jfVar) {
        final ji jiVar = new ji();
        final DocumentData documentData = new DocumentData();
        super.setValueCallback(new jf<DocumentData>() { // from class: fn.4
            @Override // defpackage.jf
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public DocumentData getValue(ji<DocumentData> jiVar2) {
                jiVar.a(jiVar2.g(), jiVar2.b(), jiVar2.f().k, jiVar2.c().k, jiVar2.d(), jiVar2.a(), jiVar2.e());
                String str = (String) jfVar.getValue(jiVar);
                DocumentData documentDataC = jiVar2.a() == 1.0f ? jiVar2.c() : jiVar2.f();
                documentData.a(str, documentDataC.f1929a, documentDataC.g, documentDataC.j, documentDataC.o, documentDataC.i, documentDataC.e, documentDataC.d, documentDataC.f, documentDataC.m, documentDataC.h, documentDataC.f1930b, documentDataC.f1931c);
                return documentData;
            }
        });
    }
}
