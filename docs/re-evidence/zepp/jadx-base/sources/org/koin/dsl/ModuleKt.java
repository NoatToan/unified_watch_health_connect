package org.koin.dsl;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.koin.core.module.Module;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u001b\u0010\b\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u0007H\u0007\u001a-\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001b\u0010\b\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u0007*,\u0010\n\"\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00072\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0007¨\u0006\u000b"}, d2 = {"", "createdAtStart", "override", "Lkotlin/Function1;", "Lorg/koin/core/module/Module;", "", "Lorg/koin/dsl/ModuleDeclaration;", "Lkotlin/ExtensionFunctionType;", "moduleDeclaration", "module", "ModuleDeclaration", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class ModuleKt {
    @Deprecated(message = "'override' parameter is not used anymore. See 'allowOverride' in KoinApplication")
    @NotNull
    public static final Module module(boolean z, boolean z2, @NotNull Function1<? super Module, Unit> function1) {
        Module module = new Module(z);
        function1.invoke(module);
        return module;
    }

    public static /* synthetic */ Module module$default(boolean z, boolean z2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return module(z, z2, function1);
    }

    public static /* synthetic */ Module module$default(boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return module(z, function1);
    }

    @NotNull
    public static final Module module(boolean z, @NotNull Function1<? super Module, Unit> function1) {
        Module module = new Module(z);
        function1.invoke(module);
        return module;
    }
}
