package com.xiaomi.fitness.net;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.wearable.hm.BroadcastsKt;
import dagger.hilt.android.EntryPointAccessors;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B=\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010\u001a\u001a\u00020\u000f\"\u0004\b\u0002\u0010\u001b2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u000f0\u0012J\u0014\u0010\u001d\u001a\u0002H\u001b\"\u0004\b\u0002\u0010\u001bH\u0082@¢\u0006\u0002\u0010\u001eJ&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012JA\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001b0\u0000\"\u0004\b\u0002\u0010\u001b2\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\u0010 J\u001d\u0010!\u001a\u00020\u000f2\u0010\b\u0002\u0010\"\u001a\n\u0018\u00010$j\u0004\u0018\u0001`#¢\u0006\u0002\u0010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR,\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR3\u0010\u000e\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b¢\u0006\u0002\b\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/net/HttpFlow;", "T", c.f13755a, "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "service", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function2;", StatConstants.PARAM_START, "", "Lkotlin/ExtensionFunctionType;", "error", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/net/response/ApiException;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "catch", "throwable", "", "handleException", "success", "R", "block", "handleResponse", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "map", "(Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/HttpFlow;", BroadcastsKt.SILENT_PUSHING_CANCEL, "cause", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHttpFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpFlow.kt\ncom/xiaomi/fitness/net/HttpFlow\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,75:1\n49#2,4:76\n31#3:80\n28#3,2:81\n31#3:83\n28#3,2:84\n*S KotlinDebug\n*F\n+ 1 HttpFlow.kt\ncom/xiaomi/fitness/net/HttpFlow\n*L\n23#1:76,4\n33#1:80\n33#1:81,2\n53#1:83\n53#1:84,2\n*E\n"})
public final class HttpFlow<T, B> {

    @Nullable
    private Function1<? super ApiException, Unit> error;

    @NotNull
    private final CoroutineExceptionHandler exceptionHandler;

    @NotNull
    private final Function2<T, Continuation<? super B>, Object> request;

    @NotNull
    private final CoroutineScope scope;
    private final T service;

    @Nullable
    private Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> start;

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.HttpFlow$handleResponse$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.HttpFlow", f = "HttpFlow.kt", i = {}, l = {52}, m = "handleResponse", n = {}, s = {})
    public static final class AnonymousClass1<R> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ HttpFlow<T, B> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpFlow<T, B> httpFlow, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = httpFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleResponse(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.HttpFlow$success$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.HttpFlow$success$2", f = "HttpFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ HttpFlow<T, B> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpFlow<T, B> httpFlow, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = httpFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function2 unused = ((HttpFlow) this.this$0).start;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.HttpFlow$success$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.HttpFlow$success$4", f = "HttpFlow.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<R, Unit> $block;
        Object L$0;
        int label;
        final /* synthetic */ HttpFlow<T, B> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function1<? super R, Unit> function1, HttpFlow<T, B> httpFlow, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.this$0 = httpFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$block, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ApiException {
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function2 = this.$block;
                HttpFlow<T, B> httpFlow = this.this$0;
                this.L$0 = function2;
                this.label = 1;
                Object objHandleResponse = httpFlow.handleResponse(this);
                if (objHandleResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objHandleResponse;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke2(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.HttpFlow$success$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.HttpFlow$success$5", f = "HttpFlow.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<R, Unit> $block;
        Object L$0;
        int label;
        final /* synthetic */ HttpFlow<T, B> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function1<? super R, Unit> function1, HttpFlow<T, B> httpFlow, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.this$0 = httpFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$block, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ApiException {
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function2 = this.$block;
                HttpFlow<T, B> httpFlow = this.this$0;
                this.L$0 = function2;
                this.label = 1;
                Object objHandleResponse = httpFlow.handleResponse(this);
                if (objHandleResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objHandleResponse;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke2(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpFlow(@NotNull CoroutineScope scope, T t, @NotNull Function2<? super T, ? super Continuation<? super B>, ? extends Object> request) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        this.scope = scope;
        this.service = t;
        this.request = request;
        this.exceptionHandler = new HttpFlow$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this);
    }

    public static /* synthetic */ void cancel$default(HttpFlow httpFlow, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        httpFlow.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m502catch(Throwable throwable) {
        Function1<? super ApiException, Unit> function1 = this.error;
        if (function1 != null) {
            function1.invoke2(handleException(throwable));
        }
    }

    private final ApiException handleException(Throwable throwable) {
        Logger.e("HttpFlow:Cannot get Response because throw " + throwable, new Object[0]);
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleError(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Object handleResponse(Continuation<? super R> continuation) throws ApiException {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function2<T, Continuation<? super B>, Object> function2 = this.request;
            T t = this.service;
            anonymousClass1.label = 1;
            objInvoke = function2.invoke(t, anonymousClass1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        if (objInvoke != null) {
            return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objInvoke);
        }
        throw ApiException.INSTANCE.getEMPTY();
    }

    public static /* synthetic */ void success$default(HttpFlow httpFlow, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: wfc
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return HttpFlow.success$lambda$1(obj2);
                }
            };
        }
        httpFlow.success(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit success$lambda$1(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit success$lambda$2(HttpFlow this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m502catch(it);
        return Unit.INSTANCE;
    }

    public final void cancel(@Nullable CancellationException cause) {
        Job job = (Job) this.scope.getCoroutineContext().get(Job.INSTANCE);
        if (job != null) {
            job.cancel(cause);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + this).toString());
    }

    @NotNull
    public final HttpFlow<T, B> error(@NotNull Function1<? super ApiException, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.error = block;
        return this;
    }

    @NotNull
    public final <R> HttpFlow<T, R> map(@NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        HttpFlow<T, R> httpFlow = new HttpFlow<>(this.scope, this.service, block);
        httpFlow.start = this.start;
        httpFlow.error = this.error;
        return httpFlow;
    }

    public final <R> void success(@NotNull Function1<? super R, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CoroutineScope coroutineScope = this.scope;
        if (coroutineScope instanceof NetCoroutineScope) {
            NetCoroutineScope.preview$default((NetCoroutineScope) coroutineScope, false, false, new AnonymousClass2(this, null), 3, null).m503catch(new Function2() { // from class: xfc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HttpFlow.success$lambda$2(this.f39065a, (AndroidScope) obj, (Throwable) obj2);
                }
            }).launch(new AnonymousClass4(block, this, null));
        } else {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineScope.getCoroutineContext().plus(this.exceptionHandler), null, new AnonymousClass5(block, this, null), 2, null);
        }
    }

    public /* synthetic */ HttpFlow(CoroutineScope coroutineScope, Object obj, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        this(coroutineScope, obj, function2);
    }
}
