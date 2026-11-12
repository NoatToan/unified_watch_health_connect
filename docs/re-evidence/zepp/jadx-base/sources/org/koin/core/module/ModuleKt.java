package org.koin.core.module;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.instance.InstanceFactory;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0001\u001a!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¨\u0006\u000b"}, d2 = {"Lorg/koin/core/instance/InstanceFactory;", "factory", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "", "overrideError", "", "Lorg/koin/core/module/Module;", "module", "plus", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class ModuleKt {
    @PublishedApi
    public static final void overrideError(@NotNull InstanceFactory<?> instanceFactory, @NotNull String str) {
        throw new DefinitionOverrideException("Already existing definition for " + instanceFactory.getBeanDefinition() + " at " + str);
    }

    @NotNull
    public static final List<Module> plus(@NotNull List<Module> list, @NotNull Module module) {
        return CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) e.listOf(module));
    }
}
