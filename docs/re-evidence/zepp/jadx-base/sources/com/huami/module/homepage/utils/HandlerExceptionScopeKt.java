package com.huami.module.homepage.utils;

import androidx.p008lifecycle.LifecycleKt;
import androidx.p008lifecycle.LifecycleOwner;
import com.huami.tools.log.StackTraceHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F@\u0006¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Lkotlinx/coroutines/CoroutineScope;", "getLifecycleExceptionScope", "(Landroidx/lifecycle/LifecycleOwner;)Lkotlinx/coroutines/CoroutineScope;", "getLifecycleExceptionScope$annotations", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleExceptionScope", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class HandlerExceptionScopeKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "exception message: " + StackTraceHelperKt.getStackTraceString(this.a);
        }
    }

    @NotNull
    public static final CoroutineScope getLifecycleExceptionScope(@NotNull LifecycleOwner lifecycleOwner) {
        return CoroutineScopeKt.plus(LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle()), new HandlerExceptionScopeKt$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE));
    }

    public static /* synthetic */ void getLifecycleExceptionScope$annotations(LifecycleOwner lifecycleOwner) {
    }
}
