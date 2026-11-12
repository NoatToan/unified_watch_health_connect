package org.koin.core.context;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.koin.core.KoinApplication;
import org.koin.core.module.Module;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a#\u0010\u0002\u001a\u00020\u00002\u001b\u0010\u0007\u001a\u0017\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\u0002\b\u0006\u001a\u0006\u0010\b\u001a\u00020\u0004\u001a\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t\u001a\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f\u001a\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t\u001a\u0014\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f¨\u0006\u000f"}, d2 = {"Lorg/koin/core/KoinApplication;", "koinApplication", "startKoin", "Lkotlin/Function1;", "", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "appDeclaration", "stopKoin", "Lorg/koin/core/module/Module;", "module", "loadKoinModules", "", "modules", "unloadKoinModules", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class DefaultContextExtKt {
    public static final void loadKoinModules(@NotNull Module module) {
        KoinPlatformTools.INSTANCE.defaultContext().loadKoinModules(module);
    }

    @NotNull
    public static final KoinApplication startKoin(@NotNull KoinApplication koinApplication) {
        return KoinPlatformTools.INSTANCE.defaultContext().startKoin(koinApplication);
    }

    public static final void stopKoin() {
        KoinPlatformTools.INSTANCE.defaultContext().stopKoin();
    }

    public static final void unloadKoinModules(@NotNull Module module) {
        KoinPlatformTools.INSTANCE.defaultContext().unloadKoinModules(module);
    }

    public static final void loadKoinModules(@NotNull List<Module> list) {
        KoinPlatformTools.INSTANCE.defaultContext().loadKoinModules(list);
    }

    @NotNull
    public static final KoinApplication startKoin(@NotNull Function1<? super KoinApplication, Unit> function1) {
        return KoinPlatformTools.INSTANCE.defaultContext().startKoin(function1);
    }

    public static final void unloadKoinModules(@NotNull List<Module> list) {
        KoinPlatformTools.INSTANCE.defaultContext().unloadKoinModules(list);
    }
}
