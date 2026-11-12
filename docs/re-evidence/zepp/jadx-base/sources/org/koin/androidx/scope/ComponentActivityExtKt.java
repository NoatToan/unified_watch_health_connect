package org.koin.androidx.scope;

import android.app.Activity;
import androidx.view.ComponentActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\u0016\u0010\t\u001a\u00020\b*\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u001a\f\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u0000¨\u0006\u000b"}, d2 = {"Landroidx/activity/ComponentActivity;", "Lorg/koin/androidx/scope/LifecycleScopeDelegate;", "Landroid/app/Activity;", "activityScope", "Lorg/koin/androidx/scope/LifecycleViewModelScopeDelegate;", "activityRetainedScope", "", "source", "Lorg/koin/core/scope/Scope;", "createScope", "getScopeOrNull", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class ComponentActivityExtKt {
    @NotNull
    public static final LifecycleViewModelScopeDelegate activityRetainedScope(@NotNull ComponentActivity componentActivity) {
        return new LifecycleViewModelScopeDelegate(componentActivity, ComponentCallbackExtKt.getKoin(componentActivity), null, 4, null);
    }

    @NotNull
    public static final LifecycleScopeDelegate<Activity> activityScope(@NotNull ComponentActivity componentActivity) {
        return new LifecycleScopeDelegate<>(componentActivity, ComponentCallbackExtKt.getKoin(componentActivity), null, 4, null);
    }

    @NotNull
    public static final Scope createScope(@NotNull ComponentActivity componentActivity, @Nullable Object obj) {
        return ComponentCallbackExtKt.getKoin(componentActivity).createScope(KoinScopeComponentKt.getScopeId(componentActivity), KoinScopeComponentKt.getScopeName(componentActivity), obj);
    }

    public static /* synthetic */ Scope createScope$default(ComponentActivity componentActivity, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return createScope(componentActivity, obj);
    }

    @Nullable
    public static final Scope getScopeOrNull(@NotNull ComponentActivity componentActivity) {
        return ComponentCallbackExtKt.getKoin(componentActivity).getScopeOrNull(KoinScopeComponentKt.getScopeId(componentActivity));
    }
}
