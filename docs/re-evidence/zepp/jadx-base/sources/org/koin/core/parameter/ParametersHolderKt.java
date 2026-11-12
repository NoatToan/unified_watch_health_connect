package org.koin.core.parameter;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0000\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0003*\u0016\u0010\b\"\b\u0012\u0004\u0012\u00020\u00030\u00072\b\u0012\u0004\u0012\u00020\u00030\u0007¨\u0006\t"}, d2 = {"", "", "parameters", "Lorg/koin/core/parameter/ParametersHolder;", "parametersOf", "([Ljava/lang/Object;)Lorg/koin/core/parameter/ParametersHolder;", "emptyParametersHolder", "Lkotlin/Function0;", "ParametersDefinition", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class ParametersHolderKt {
    @NotNull
    public static final ParametersHolder emptyParametersHolder() {
        return new ParametersHolder(null, 1, null);
    }

    @NotNull
    public static final ParametersHolder parametersOf(@NotNull Object... objArr) {
        return new ParametersHolder(ArraysKt___ArraysKt.toMutableList(objArr));
    }
}
