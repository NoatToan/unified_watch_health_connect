package qt1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f147805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f147806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0 f147807d;

    public /* synthetic */ v0(o53.b0 b0Var, k kVar, p005kotlin.jvm.internal.r0 r0Var, int i14) {
        this.f147804a = i14;
        this.f147805b = b0Var;
        this.f147806c = kVar;
        this.f147807d = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, pt1.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, pt1.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.a
    public final Object invoke() {
        ?? eVar;
        ?? eVar2;
        switch (this.f147804a) {
            case 0:
                o53.b0 b0Var = this.f147805b;
                k kVar = this.f147806c;
                p005kotlin.jvm.internal.r0 r0Var = this.f147807d;
                synchronized (b0Var) {
                    T t7 = r0Var.f105810a;
                    eVar = new pt1.e(((pt1.e) t7).f140839a + 1, ((pt1.e) t7).f140840b);
                    r0Var.f105810a = eVar;
                    Unit unit = Unit.INSTANCE;
                }
                kVar.R4(eVar);
                return Unit.INSTANCE;
            default:
                o53.b0 b0Var2 = this.f147805b;
                k kVar2 = this.f147806c;
                p005kotlin.jvm.internal.r0 r0Var2 = this.f147807d;
                synchronized (b0Var2) {
                    T t14 = r0Var2.f105810a;
                    eVar2 = new pt1.e(((pt1.e) t14).f140839a + 1, ((pt1.e) t14).f140840b);
                    r0Var2.f105810a = eVar2;
                    Unit unit2 = Unit.INSTANCE;
                }
                kVar2.R4(eVar2);
                return Unit.INSTANCE;
        }
    }
}
