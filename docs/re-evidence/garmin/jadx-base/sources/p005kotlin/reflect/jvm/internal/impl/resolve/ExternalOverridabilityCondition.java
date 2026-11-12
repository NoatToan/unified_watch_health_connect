package p005kotlin.reflect.jvm.internal.impl.resolve;

import t23.e;

/* JADX INFO: loaded from: classes3.dex */
public interface ExternalOverridabilityCondition {

    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    a getContract();

    b isOverridable(t23.a aVar, t23.a aVar2, e eVar);
}
