package com.xiaomi.fitness.net.scope;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.wearable.hm.BroadcastsKt;
import dagger.hilt.android.EntryPointAccessors;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ6\u0010 \u001a\u00020\u00002'\u0010!\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"\u0012\u0006\u0012\u0004\u0018\u00010#0\f¢\u0006\u0002\b\u000fH\u0016¢\u0006\u0002\u0010$J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\rH\u0014J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\rH\u0014J)\u0010\u000b\u001a\u00020\u00002\u001f\b\u0002\u0010!\u001a\u0019\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0016J+\u0010\u0014\u001a\u00020\u00002!\b\u0002\u0010!\u001a\u001b\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0016J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\rH\u0016J\u001f\u0010'\u001a\u00020\u000e2\u0010\b\u0002\u0010(\u001a\n\u0018\u00010*j\u0004\u0018\u0001`)H\u0016¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u000eH\u0016R3\u0010\u000b\u001a\u001b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\b\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R5\u0010\u0014\u001a\u001d\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\b\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/net/scope/AndroidScope;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifeEvent", "Landroidx/lifecycle/Lifecycle$Event;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;Lkotlinx/coroutines/CoroutineDispatcher;)V", "catch", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getCatch", "()Lkotlin/jvm/functions/Function2;", "setCatch", "(Lkotlin/jvm/functions/Function2;)V", "finally", "getFinally", "setFinally", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "scopeGroup", "getScopeGroup", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "launch", "block", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/AndroidScope;", PluginDeviceInfo.FICONOFFLINE, "handleError", BroadcastsKt.SILENT_PUSHING_CANCEL, "cause", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", Constants.EXTRA_CLOSE_TAI, "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScope.kt\ncom/xiaomi/fitness/net/scope/AndroidScope\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,96:1\n49#2,4:97\n31#3:101\n28#3,2:102\n*S KotlinDebug\n*F\n+ 1 AndroidScope.kt\ncom/xiaomi/fitness/net/scope/AndroidScope\n*L\n34#1:97,4\n53#1:101\n53#1:102,2\n*E\n"})
public class AndroidScope implements CoroutineScope, Closeable {

    @Nullable
    private Function2<? super AndroidScope, ? super Throwable, Unit> catch;

    @NotNull
    private final CoroutineContext coroutineContext;

    @NotNull
    private final CoroutineExceptionHandler exceptionHandler;

    @Nullable
    private Function2<? super AndroidScope, ? super Throwable, Unit> finally;

    @NotNull
    private final CoroutineExceptionHandler scopeGroup;

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.scope.AndroidScope$launch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.scope.AndroidScope$launch$1", f = "AndroidScope.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26541(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C26541> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26541 c26541 = new C26541(this.$block, continuation);
            c26541.L$0 = obj;
            return c26541;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                this.label = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AndroidScope() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ void cancel$default(AndroidScope androidScope, CancellationException cancellationException, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        androidScope.cancel(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidScope catch$default(AndroidScope androidScope, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: catch");
        }
        if ((i & 1) != 0) {
            function2 = new Function2() { // from class: wa1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AndroidScope.catch$lambda$2((AndroidScope) obj2, (Throwable) obj3);
                }
            };
        }
        return androidScope.m503catch((Function2<? super AndroidScope, ? super Throwable, Unit>) function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit catch$lambda$2(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "<this>");
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidScope finally$default(AndroidScope androidScope, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finally");
        }
        if ((i & 1) != 0) {
            function2 = new Function2() { // from class: ya1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AndroidScope.finally$lambda$3((AndroidScope) obj2, (Throwable) obj3);
                }
            };
        }
        return androidScope.m505finally((Function2<? super AndroidScope, ? super Throwable, Unit>) function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finally$lambda$3(AndroidScope androidScope, Throwable th) {
        Intrinsics.checkNotNullParameter(androidScope, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$1(AndroidScope this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m506finally(th);
        return Unit.INSTANCE;
    }

    public void cancel(@Nullable CancellationException cause) {
        Job job = (Job) getCoroutineContext().get(Job.INSTANCE);
        if (job != null) {
            job.cancel(cause);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + this).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public AndroidScope m503catch(@NotNull Function2<? super AndroidScope, ? super Throwable, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.catch = block;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cancel$default(this, null, 1, null);
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public void m506finally(@Nullable Throwable e) {
        Function2<? super AndroidScope, ? super Throwable, Unit> function2 = this.finally;
        if (function2 != null) {
            function2.invoke(this, e);
        }
    }

    @Nullable
    public final Function2<AndroidScope, Throwable, Unit> getCatch() {
        return this.catch;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public final Function2<AndroidScope, Throwable, Unit> getFinally() {
        return this.finally;
    }

    @NotNull
    public final CoroutineExceptionHandler getScopeGroup() {
        return this.scopeGroup;
    }

    public void handleError(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        e.printStackTrace();
    }

    @NotNull
    public AndroidScope launch(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        BuildersKt__Builders_commonKt.launch$default(this, EmptyCoroutineContext.INSTANCE, null, new C26541(block, null), 2, null).invokeOnCompletion(new Function1() { // from class: xa1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AndroidScope.launch$lambda$1(this.f38904a, (Throwable) obj);
            }
        });
        return this;
    }

    public final void setCatch(@Nullable Function2<? super AndroidScope, ? super Throwable, Unit> function2) {
        this.catch = function2;
    }

    public final void setFinally(@Nullable Function2<? super AndroidScope, ? super Throwable, Unit> function2) {
        this.finally = function2;
    }

    public AndroidScope(@Nullable LifecycleOwner lifecycleOwner, @NotNull final Lifecycle.Event lifeEvent, @NotNull CoroutineDispatcher dispatcher) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(lifeEvent, "lifeEvent");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.xiaomi.fitness.net.scope.AndroidScope.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (lifeEvent == event) {
                        AndroidScope.cancel$default(this, null, 1, null);
                    }
                }
            });
        }
        AndroidScope$special$$inlined$CoroutineExceptionHandler$1 androidScope$special$$inlined$CoroutineExceptionHandler$1 = new AndroidScope$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this);
        this.exceptionHandler = androidScope$special$$inlined$CoroutineExceptionHandler$1;
        this.scopeGroup = androidScope$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineContext = dispatcher.plus(androidScope$special$$inlined$CoroutineExceptionHandler$1).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public void m504catch(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        ApiException apiExceptionHandleError = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleError(e);
        Function2<? super AndroidScope, ? super Throwable, Unit> function2 = this.catch;
        if (function2 != null) {
            function2.invoke(this, apiExceptionHandleError);
        } else {
            handleError(apiExceptionHandleError);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public AndroidScope m505finally(@NotNull Function2<? super AndroidScope, ? super Throwable, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.finally = block;
        return this;
    }

    public /* synthetic */ AndroidScope(LifecycleOwner lifecycleOwner, Lifecycle.Event event, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lifecycleOwner, (i & 2) != 0 ? Lifecycle.Event.ON_DESTROY : event, (i & 4) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }
}
