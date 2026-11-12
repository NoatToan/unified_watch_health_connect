package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¨\u0006\u0003"}, d2 = {"Landroid/content/ComponentCallbacks;", "Lorg/koin/core/scope/Scope;", "getKoinScope", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidKoinScopeExtKt {
    @PublishedApi
    @KoinInternalApi
    @NotNull
    public static final Scope getKoinScope(@NotNull ComponentCallbacks componentCallbacks) {
        if (componentCallbacks instanceof AndroidScopeComponent) {
            return ((AndroidScopeComponent) componentCallbacks).getScope();
        }
        if (componentCallbacks instanceof KoinScopeComponent) {
            return ((KoinScopeComponent) componentCallbacks).getScope();
        }
        return componentCallbacks instanceof KoinComponent ? ((KoinComponent) componentCallbacks).getKoin().getScopeRegistry().getRootScope() : GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
    }
}
