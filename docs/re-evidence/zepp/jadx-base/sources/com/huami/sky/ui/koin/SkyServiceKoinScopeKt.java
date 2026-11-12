package com.huami.sky.ui.koin;

import com.huami.koinstartup.KoinAdapterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0000\u001a%\u0010\u0002\u001a\u00020\u0006*\u00020\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0000¨\u0006\t"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "skyServiceScope", "Lorg/koin/core/module/Module;", "Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "", "Lkotlin/ExtensionFunctionType;", "scopeSet", "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkyServiceKoinScopeKt {
    @NotNull
    public static final Scope skyServiceScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, SkyServiceScopeName.SKY_SERVICE, QualifierKt.named(SkyServiceScopeName.SKY_SERVICE), null, 4, null);
    }

    @NotNull
    public static final Scope skyServiceScope() {
        return skyServiceScope(KoinAdapterKt.getKoinProxy());
    }

    public static final void skyServiceScope(@NotNull Module module, @NotNull Function1<? super ScopeDSL, Unit> function1) {
        module.scope(QualifierKt.named(SkyServiceScopeName.SKY_SERVICE), function1);
    }
}
