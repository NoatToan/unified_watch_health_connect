package com.xiaomi.fitness.net.extensions;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u000b\u001aL\u0010\f\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u0010\u001aL\u0010\f\u001a\u00020\u0001*\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u0012\u001a>\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u0015\u001aL\u0010\u0016\u001a\u00020\u0014*\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u0017\u001aL\u0010\u0016\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"scope", "Lcom/xiaomi/fitness/net/scope/AndroidScope;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/AndroidScope;", "scopeLife", "Landroidx/lifecycle/LifecycleOwner;", "lifeEvent", "Landroidx/lifecycle/Lifecycle$Event;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/AndroidScope;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$Event;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/AndroidScope;", "scopeNet", "Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", "scopeNetLife", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", "(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$Event;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", "net_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ScopeExtKt {
    @NotNull
    public static final AndroidScope scope(@NotNull CoroutineDispatcher dispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(block, "block");
        return new AndroidScope(null, null, dispatcher, 3, null).launch(block);
    }

    public static /* synthetic */ AndroidScope scope$default(CoroutineDispatcher coroutineDispatcher, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scope(coroutineDispatcher, function2);
    }

    @NotNull
    public static final AndroidScope scopeLife(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event lifeEvent, @NotNull CoroutineDispatcher dispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(lifeEvent, "lifeEvent");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(block, "block");
        return new AndroidScope(lifecycleOwner, lifeEvent, dispatcher).launch(block);
    }

    public static /* synthetic */ AndroidScope scopeLife$default(LifecycleOwner lifecycleOwner, Lifecycle.Event event, CoroutineDispatcher coroutineDispatcher, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            event = Lifecycle.Event.ON_DESTROY;
        }
        if ((i & 2) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeLife(lifecycleOwner, event, coroutineDispatcher, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @NotNull
    public static final NetCoroutineScope scopeNet(@NotNull CoroutineDispatcher dispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(block, "block");
        return new NetCoroutineScope(null, null, dispatcher, 3, null).launch(block);
    }

    public static /* synthetic */ NetCoroutineScope scopeNet$default(CoroutineDispatcher coroutineDispatcher, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeNet(coroutineDispatcher, function2);
    }

    @NotNull
    public static final NetCoroutineScope scopeNetLife(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event lifeEvent, @NotNull CoroutineDispatcher dispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(lifeEvent, "lifeEvent");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(block, "block");
        return new NetCoroutineScope(lifecycleOwner, lifeEvent, dispatcher).launch(block);
    }

    public static /* synthetic */ NetCoroutineScope scopeNetLife$default(LifecycleOwner lifecycleOwner, Lifecycle.Event event, CoroutineDispatcher coroutineDispatcher, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            event = Lifecycle.Event.ON_DESTROY;
        }
        if ((i & 2) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeNetLife(lifecycleOwner, event, coroutineDispatcher, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @NotNull
    public static final AndroidScope scopeLife(@NotNull Fragment fragment, @NotNull Lifecycle.Event lifeEvent, @NotNull CoroutineDispatcher dispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(lifeEvent, "lifeEvent");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(block, "block");
        return new AndroidScope(fragment, lifeEvent, dispatcher).launch(block);
    }

    @NotNull
    public static final NetCoroutineScope scopeNetLife(@NotNull Fragment fragment, @NotNull Lifecycle.Event lifeEvent, @NotNull CoroutineDispatcher dispatcher, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(lifeEvent, "lifeEvent");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(block, "block");
        return new NetCoroutineScope(fragment, lifeEvent, dispatcher).launch(block);
    }

    public static /* synthetic */ AndroidScope scopeLife$default(Fragment fragment, Lifecycle.Event event, CoroutineDispatcher coroutineDispatcher, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            event = Lifecycle.Event.ON_STOP;
        }
        if ((i & 2) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeLife(fragment, event, coroutineDispatcher, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    public static /* synthetic */ NetCoroutineScope scopeNetLife$default(Fragment fragment, Lifecycle.Event event, CoroutineDispatcher coroutineDispatcher, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            event = Lifecycle.Event.ON_STOP;
        }
        if ((i & 2) != 0) {
            coroutineDispatcher = Dispatchers.getMain();
        }
        return scopeNetLife(fragment, event, coroutineDispatcher, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }
}
