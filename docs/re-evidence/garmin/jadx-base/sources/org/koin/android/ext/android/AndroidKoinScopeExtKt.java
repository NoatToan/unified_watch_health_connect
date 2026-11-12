package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import androidx.room.a0;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"getKoinScope", "Lorg/koin/core/scope/Scope;", "Landroid/content/ComponentCallbacks;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidKoinScopeExtKt {
    @KoinInternalApi
    public static final Scope getKoinScope(ComponentCallbacks componentCallbacks) {
        componentCallbacks.getClass();
        if (componentCallbacks instanceof AndroidScopeComponent) {
            return ((AndroidScopeComponent) componentCallbacks).getScope();
        }
        if (componentCallbacks instanceof KoinScopeComponent) {
            return ((KoinScopeComponent) componentCallbacks).getScope();
        }
        return componentCallbacks instanceof KoinComponent ? a0.n((KoinComponent) componentCallbacks) : GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
    }
}
