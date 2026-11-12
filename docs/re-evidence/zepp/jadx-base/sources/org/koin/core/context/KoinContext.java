package org.koin.core.context;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.module.Module;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J%\u0010\t\u001a\u00020\u00072\u001b\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\nj\u0002`\u000b¢\u0006\u0002\b\fH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H&J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H&¨\u0006\u0014"}, d2 = {"Lorg/koin/core/context/KoinContext;", "", "Lorg/koin/core/Koin;", "get", "getOrNull", "", "stopKoin", "Lorg/koin/core/KoinApplication;", "koinApplication", "startKoin", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "appDeclaration", "Lorg/koin/core/module/Module;", "module", "loadKoinModules", "", "modules", "unloadKoinModules", "koin-core"}, k = 1, mv = {1, 5, 1})
public interface KoinContext {
    @NotNull
    Koin get();

    @Nullable
    Koin getOrNull();

    void loadKoinModules(@NotNull List<Module> modules);

    void loadKoinModules(@NotNull Module module);

    @NotNull
    KoinApplication startKoin(@NotNull Function1<? super KoinApplication, Unit> appDeclaration);

    @NotNull
    KoinApplication startKoin(@NotNull KoinApplication koinApplication);

    void stopKoin();

    void unloadKoinModules(@NotNull List<Module> modules);

    void unloadKoinModules(@NotNull Module module);
}
