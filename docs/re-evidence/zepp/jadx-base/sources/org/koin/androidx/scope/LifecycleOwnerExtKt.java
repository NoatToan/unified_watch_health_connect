package org.koin.androidx.scope;

import androidx.p008lifecycle.LifecycleOwner;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\" \u0010\u0006\u001a\u00020\u0001*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\" \u0010\t\u001a\u00020\u0001*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\u0007\u0010\u0003\" \u0010\f\u001a\u00020\u0001*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\n\u0010\u0003¨\u0006\r"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Lorg/koin/core/scope/Scope;", "getLifecycleScope", "(Landroidx/lifecycle/LifecycleOwner;)Lorg/koin/core/scope/Scope;", "getLifecycleScope$annotations", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleScope", "getScope", "getScope$annotations", "scope", "getCurrentScope", "getCurrentScope$annotations", "currentScope", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class LifecycleOwnerExtKt {
    @NotNull
    public static final Scope getCurrentScope(@NotNull LifecycleOwner lifecycleOwner) {
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use ScopeActivity or ScopeFragment instead", replaceWith = @ReplaceWith(expression = "lifecycleScope", imports = {}))
    public static /* synthetic */ void getCurrentScope$annotations(LifecycleOwner lifecycleOwner) {
    }

    @NotNull
    public static final Scope getLifecycleScope(@NotNull LifecycleOwner lifecycleOwner) {
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use ScopeActivity or ScopeFragment instead", replaceWith = @ReplaceWith(expression = "lifecycleScope", imports = {}))
    public static /* synthetic */ void getLifecycleScope$annotations(LifecycleOwner lifecycleOwner) {
    }

    @NotNull
    public static final Scope getScope(@NotNull LifecycleOwner lifecycleOwner) {
        throw new IllegalStateException("Don't use scope on a lifecycle component. Use ScopeActivity or ScopeFragment instead".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use ScopeActivity or ScopeFragment instead", replaceWith = @ReplaceWith(expression = "lifecycleScope", imports = {}))
    public static /* synthetic */ void getScope$annotations(LifecycleOwner lifecycleOwner) {
    }
}
