package com.xiaomi.fitness.net.scope;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.setting.ServerSetting;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ6\u0010,\u001a\u00020\u00002'\u0010-\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010¢\u0006\u0002\b\u0015H\u0016¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0013H\u0014J\u0010\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u000bH\u0014J\u0010\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u000204H\u0016JH\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2'\u0010-\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010¢\u0006\u0002\b\u0015¢\u0006\u0002\u00106J&\u00107\u001a\u00020\u0013\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u001092\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H90!R\u001a\u0010\n\u001a\u00020\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR?\u0010\u000f\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0010¢\u0006\u0002\b\u0015X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u00020\u000b8DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001d\u001a\u00020\u000b8DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR7\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u0013\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000e¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", "Lcom/xiaomi/fitness/net/scope/AndroidScope;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifeEvent", "Landroidx/lifecycle/Lifecycle$Event;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;Lkotlinx/coroutines/CoroutineDispatcher;)V", "isReadCache", "", "()Z", "setReadCache", "(Z)V", ServerSetting.SERVER_ENV_PREVIEW, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "getPreview", "()Lkotlin/jvm/functions/Function2;", "setPreview", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "isCacheSucceed", "setCacheSucceed", "error", "getError", "setError", "success", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "getSuccess", "()Lkotlin/jvm/functions/Function1;", "setSuccess", "(Lkotlin/jvm/functions/Function1;)V", "animate", "getAnimate", "setAnimate", "launch", "block", "(Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/NetCoroutineScope;", StatConstants.PARAM_START, "readCache", "succeed", "handleError", PluginDeviceInfo.FICONOFFLINE, "", "ignore", "(ZZLkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/scope/AndroidScope;", "transform", "T", "R", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NetCoroutineScope extends AndroidScope {
    private boolean animate;
    private boolean error;
    private boolean isCacheSucceed;
    private boolean isReadCache;

    @Nullable
    private Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> preview;

    @Nullable
    private Function1<Object, Unit> success;

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.scope.NetCoroutineScope$launch$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.scope.NetCoroutineScope$launch$1", f = "NetCoroutineScope.kt", i = {0}, l = {37, 47}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.net.scope.NetCoroutineScope$launch$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.net.scope.NetCoroutineScope$launch$1$1", f = "NetCoroutineScope.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ NetCoroutineScope this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06481(NetCoroutineScope netCoroutineScope, Continuation<? super C06481> continuation) {
                super(2, continuation);
                this.this$0 = netCoroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06481 c06481 = new C06481(this.this$0, continuation);
                c06481.L$0 = obj;
                return c06481;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v4 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                NetCoroutineScope netCoroutineScope;
                NetCoroutineScope netCoroutineScope2;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ?? r1 = this.label;
                boolean z = true;
                try {
                    if (r1 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        NetCoroutineScope netCoroutineScope3 = this.this$0;
                        Function2<CoroutineScope, Continuation<? super Unit>, Object> preview = netCoroutineScope3.getPreview();
                        netCoroutineScope = netCoroutineScope3;
                        if (preview != null) {
                            this.L$0 = netCoroutineScope3;
                            this.L$1 = netCoroutineScope3;
                            this.label = 1;
                            if (preview.invoke(coroutineScope, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            netCoroutineScope2 = netCoroutineScope3;
                        }
                        netCoroutineScope.setCacheSucceed(z);
                        NetCoroutineScope netCoroutineScope4 = this.this$0;
                        netCoroutineScope4.readCache(netCoroutineScope4.isCacheSucceed());
                        return Unit.INSTANCE;
                    }
                    if (r1 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    NetCoroutineScope netCoroutineScope5 = (NetCoroutineScope) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    netCoroutineScope2 = netCoroutineScope5;
                    r1 = netCoroutineScope2;
                    netCoroutineScope = r1;
                } catch (Exception unused) {
                    z = false;
                    netCoroutineScope = r1;
                }
                netCoroutineScope.setCacheSucceed(z);
                NetCoroutineScope netCoroutineScope6 = this.this$0;
                netCoroutineScope6.readCache(netCoroutineScope6.isCacheSucceed());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = NetCoroutineScope.this.new AnonymousClass1(this.$block, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            NetCoroutineScope.this.start();
            if (NetCoroutineScope.this.getPreview() != null && NetCoroutineScope.this.getIsReadCache()) {
                C06481 c06481 = new C06481(NetCoroutineScope.this, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (SupervisorKt.supervisorScope(c06481, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
            this.L$0 = null;
            this.label = 2;
            if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public NetCoroutineScope() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launch$lambda$0(NetCoroutineScope this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m506finally(th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ AndroidScope preview$default(NetCoroutineScope netCoroutineScope, boolean z, boolean z2, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preview");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return netCoroutineScope.preview(z, z2, function2);
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final boolean getError() {
        if (isCacheSucceed()) {
            return this.error;
        }
        return true;
    }

    @Nullable
    public final Function2<CoroutineScope, Continuation<? super Unit>, Object> getPreview() {
        return this.preview;
    }

    @Nullable
    public final Function1<Object, Unit> getSuccess() {
        return this.success;
    }

    @Override // com.xiaomi.fitness.net.scope.AndroidScope
    public void handleError(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        StringBuilder sb = new StringBuilder();
        sb.append("handleError: ");
        sb.append(e);
    }

    public final boolean isCacheSucceed() {
        if (this.preview != null) {
            return this.isCacheSucceed;
        }
        return false;
    }

    /* JADX INFO: renamed from: isReadCache, reason: from getter */
    public final boolean getIsReadCache() {
        return this.isReadCache;
    }

    @Override // com.xiaomi.fitness.net.scope.AndroidScope
    public /* bridge */ /* synthetic */ AndroidScope launch(Function2 function2) {
        return launch((Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) function2);
    }

    @NotNull
    public final AndroidScope preview(boolean ignore, boolean animate, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.animate = animate;
        this.error = ignore;
        this.preview = block;
        return this;
    }

    public void readCache(boolean succeed) {
    }

    public final void setAnimate(boolean z) {
        this.animate = z;
    }

    public final void setCacheSucceed(boolean z) {
        this.isCacheSucceed = z;
    }

    public final void setError(boolean z) {
        this.error = z;
    }

    public final void setPreview(@Nullable Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.preview = function2;
    }

    public final void setReadCache(boolean z) {
        this.isReadCache = z;
    }

    public final void setSuccess(@Nullable Function1<Object, Unit> function1) {
        this.success = function1;
    }

    public void start() {
    }

    public final <T, R> void transform(@NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
    }

    public /* synthetic */ NetCoroutineScope(LifecycleOwner lifecycleOwner, Lifecycle.Event event, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lifecycleOwner, (i & 2) != 0 ? Lifecycle.Event.ON_DESTROY : event, (i & 4) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }

    @Override // com.xiaomi.fitness.net.scope.AndroidScope
    @NotNull
    public NetCoroutineScope launch(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        BuildersKt__Builders_commonKt.launch$default(this, EmptyCoroutineContext.INSTANCE, null, new AnonymousClass1(block, null), 2, null).invokeOnCompletion(new Function1() { // from class: kjg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NetCoroutineScope.launch$lambda$0(this.f23919a, (Throwable) obj);
            }
        });
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetCoroutineScope(@Nullable LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event lifeEvent, @NotNull CoroutineDispatcher dispatcher) {
        super(lifecycleOwner, lifeEvent, dispatcher);
        Intrinsics.checkNotNullParameter(lifeEvent, "lifeEvent");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.isReadCache = true;
        this.error = true;
    }
}
