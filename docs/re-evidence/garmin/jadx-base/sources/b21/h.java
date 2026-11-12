package b21;

import java.util.ArrayList;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.t f14706b;

    public /* synthetic */ h(u21.t tVar, int i14) {
        this.f14705a = i14;
        this.f14706b = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
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
        Object value;
        Object value2;
        switch (this.f14705a) {
            case 0:
                return ParametersHolderKt.parametersOf(this.f14706b.f168142l);
            case 1:
                this.f14706b.P4();
                return Unit.INSTANCE;
            case 2:
                u21.t tVar = this.f14706b;
                ge1.b.T(androidx.lifecycle.v1.a(tVar), null, null, new u21.z(tVar, null), 3);
                return Unit.INSTANCE;
            case 3:
                u21.t tVar2 = this.f14706b;
                ge1.b.T(androidx.lifecycle.v1.a(tVar2), null, null, new u21.w(tVar2, null), 3);
                return Unit.INSTANCE;
            case 4:
                u21.t tVar3 = this.f14706b;
                ?? r14 = tVar3.f168142l;
                r53.p2 p2Var = tVar3.f168140j;
                ArrayList arrayListS4 = tVar3.S4(r14, ((u21.s) p2Var.getValue()).f168114c, true);
                if (u21.t.K4(tVar3, null, arrayListS4, null, null, 13)) {
                    do {
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, u21.s.a((u21.s) value2, false, null, false, null, null, null, tVar3.I4(), false, false, false, false, false, null, 65023)));
                } else {
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, u21.s.a((u21.s) value, false, null, false, arrayListS4, null, null, null, false, false, false, false, false, null, 64447)));
                }
                return Unit.INSTANCE;
            case 5:
                this.f14706b.P4();
                return Unit.INSTANCE;
            default:
                u21.t tVar4 = this.f14706b;
                ge1.b.T(androidx.lifecycle.v1.a(tVar4), null, null, new u21.w(tVar4, null), 3);
                return Unit.INSTANCE;
        }
    }
}
