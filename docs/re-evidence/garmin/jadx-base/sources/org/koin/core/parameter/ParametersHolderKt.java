package org.koin.core.parameter;

import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u00012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a#\u0010\u0007\u001a\u00020\u00012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a\u0006\u0010\b\u001a\u00020\u0001*\u0016\u0010\t\"\b\u0012\u0004\u0012\u00020\u00010\n2\b\u0012\u0004\u0012\u00020\u00010\n¨\u0006\u000b"}, d2 = {"parametersOf", "Lorg/koin/core/parameter/ParametersHolder;", "parameters", "", "", "([Ljava/lang/Object;)Lorg/koin/core/parameter/ParametersHolder;", "parameterArrayOf", "parameterSetOf", "emptyParametersHolder", "ParametersDefinition", "Lkotlin/Function0;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ParametersHolderKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ParametersHolder emptyParametersHolder() {
        return new ParametersHolder(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final ParametersHolder parameterArrayOf(Object... objArr) {
        objArr.getClass();
        return new ParametersHolder(u.l0(objArr), Boolean.TRUE);
    }

    public static final ParametersHolder parameterSetOf(Object... objArr) {
        objArr.getClass();
        return new ParametersHolder(u.l0(objArr), Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ParametersHolder parametersOf(Object... objArr) {
        objArr.getClass();
        return new ParametersHolder(u.l0(objArr), null, 2, 0 == true ? 1 : 0);
    }
}
