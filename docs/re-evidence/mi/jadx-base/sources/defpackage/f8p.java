package defpackage;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f8p extends f1e<DocumentData> {

    public class a extends yte<DocumentData> {
        public final /* synthetic */ lte d;
        public final /* synthetic */ yte e;
        public final /* synthetic */ DocumentData f;

        public a(lte lteVar, yte yteVar, DocumentData documentData) {
            this.d = lteVar;
            this.e = yteVar;
            this.f = documentData;
        }

        @Override // defpackage.yte
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DocumentData a(lte<DocumentData> lteVar) {
            this.d.h(lteVar.f(), lteVar.a(), lteVar.g().f5673a, lteVar.b().f5673a, lteVar.d(), lteVar.c(), lteVar.e());
            String str = (String) this.e.a(this.d);
            DocumentData documentDataB = lteVar.c() == 1.0f ? lteVar.b() : lteVar.g();
            this.f.a(str, documentDataB.f5674b, documentDataB.c, documentDataB.d, documentDataB.e, documentDataB.f, documentDataB.g, documentDataB.h, documentDataB.i, documentDataB.j, documentDataB.f5675k, documentDataB.l, documentDataB.m);
            return this.f;
        }
    }

    public f8p(List<e1e<DocumentData>> list) {
        super(list);
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
    @Override // defpackage.o82
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public DocumentData i(e1e<DocumentData> e1eVar, float f) {
        DocumentData documentData;
        yte<A> yteVar = this.e;
        if (yteVar == 0) {
            return (f != 1.0f || (documentData = e1eVar.c) == null) ? e1eVar.f16153b : documentData;
        }
        float f2 = e1eVar.g;
        Float f3 = e1eVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        DocumentData documentData2 = e1eVar.f16153b;
        DocumentData documentData3 = documentData2;
        DocumentData documentData4 = e1eVar.c;
        return (DocumentData) yteVar.b(f2, fFloatValue, documentData3, documentData4 == null ? documentData2 : documentData4, f, d(), f());
    }

    public void q(yte<String> yteVar) {
        super.n(new a(new lte(), yteVar, new DocumentData()));
    }
}
