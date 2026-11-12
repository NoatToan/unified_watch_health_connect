package com.huami.health.afppg.koin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"Lorg/koin/core/scope/Scope;", "ppgScope", "afppg-core_release"}, k = 2, mv = {1, 5, 1})
public final class KoinModuleKt {
    @NotNull
    public static final synchronized Scope ppgScope() {
        return Koin.getOrCreateScope$default(GlobalContext.INSTANCE.get(), PpgModuleKt.AF_PPG, QualifierKt.named(PpgModuleKt.AF_PPG), null, 4, null);
    }
}
