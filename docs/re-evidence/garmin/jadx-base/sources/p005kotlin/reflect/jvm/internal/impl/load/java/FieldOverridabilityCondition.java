package p005kotlin.reflect.jvm.internal.impl.load.java;

import gl1.y;
import p005kotlin.jvm.internal.s;
import p005kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import t23.a;
import t23.e;
import t23.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // p005kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.a getContract() {
        return ExternalOverridabilityCondition.a.BOTH;
    }

    @Override // p005kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.b isOverridable(a aVar, a aVar2, e eVar) {
        aVar.getClass();
        aVar2.getClass();
        if (!(aVar2 instanceof r0) || !(aVar instanceof r0)) {
            return ExternalOverridabilityCondition.b.UNKNOWN;
        }
        r0 r0Var = (r0) aVar2;
        r0 r0Var2 = (r0) aVar;
        if (!s.g(r0Var.getName(), r0Var2.getName())) {
            return ExternalOverridabilityCondition.b.UNKNOWN;
        }
        if (y.A(r0Var) && y.A(r0Var2)) {
            return ExternalOverridabilityCondition.b.OVERRIDABLE;
        }
        return (y.A(r0Var) || y.A(r0Var2)) ? ExternalOverridabilityCondition.b.INCOMPATIBLE : ExternalOverridabilityCondition.b.UNKNOWN;
    }
}
