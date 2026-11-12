package com.xiaomi.fitness.net;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.repository.Repository;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import dagger.hilt.android.EntryPointAccessors;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JU\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001c0\u001b\"\u0006\b\u0001\u0010\u001c\u0018\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001e2$\b\b\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0 \u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001fH\u0084\bø\u0001\u0000¢\u0006\u0002\u0010!J{\u0010\u001a\u001a\u00020\"\"\u0006\b\u0001\u0010\u001c\u0018\u0001\"\u0004\b\u0002\u0010#2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2$\b\b\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0 \u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f2\u0014\b\b\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u00020\"0%2\u0014\b\n\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\"0%H\u0084\bø\u0001\u0000¢\u0006\u0002\u0010(J\r\u0010)\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0018J2\u0010*\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u001c\u0010+\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u00020%H\u0084@¢\u0006\u0002\u0010,J\u001a\u0010-\u001a\u0002H\u001c\"\u0006\b\u0001\u0010\u001c\u0018\u0001*\u00020\u0002H\u0084\b¢\u0006\u0002\u0010.R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR!\u0010\u0010\u001a\u00020\u00118DX\u0085\u0084\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u0012\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00028\u00008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/net/BaseRequest;", "T", "", "<init>", "()V", "mRequestPoint", "Lcom/xiaomi/fitness/net/BaseRequest$RequestPoint;", "getMRequestPoint", "()Lcom/xiaomi/fitness/net/BaseRequest$RequestPoint;", "mRequestPoint$delegate", "Lkotlin/Lazy;", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "repository", "Lcom/xiaomi/fitness/common/repository/Repository;", "getRepository$annotations", "getRepository", "()Lcom/xiaomi/fitness/common/repository/Repository;", "repository$delegate", "mService", "getMService", "()Ljava/lang/Object;", "mService$delegate", "request", "Lcom/xiaomi/fitness/net/HttpFlow;", "R", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lcom/xiaomi/fitness/net/HttpFlow;", "", "Z", "success", "Lkotlin/Function1;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getService", "withIO", "block", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "(Ljava/lang/Object;)Ljava/lang/Object;", "RequestPoint", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 2 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,157:1\n31#2:158\n28#2,2:159\n*S KotlinDebug\n*F\n+ 1 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n141#1:158\n141#1:159,2\n*E\n"})
public abstract class BaseRequest<T> {

    /* JADX INFO: renamed from: mRequestPoint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRequestPoint = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ib2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseRequest.mRequestPoint_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jb2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseRequest.mGson_delegate$lambda$1(this.f22604a);
        }
    });

    /* JADX INFO: renamed from: repository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repository = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kb2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseRequest.repository_delegate$lambda$2(this.f23671a);
        }
    });

    /* JADX INFO: renamed from: mService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mService = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lb2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseRequest.mService_delegate$lambda$3(this.f24845a);
        }
    });

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/net/BaseRequest$RequestPoint;", "", "getRepository", "Lcom/xiaomi/fitness/common/repository/Repository;", "getGson", "Lcom/google/gson/Gson;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RequestPoint {
        @NotNull
        Gson getGson();

        @NotNull
        Repository getRepository();
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.BaseRequest$withIO$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.BaseRequest$withIO$2", f = "BaseRequest.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super T>, Object> function1 = this.$block;
                this.label = 1;
                obj = function1.invoke2(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final RequestPoint getMRequestPoint() {
        return (RequestPoint) this.mRequestPoint.getValue();
    }

    public static /* synthetic */ void getRepository$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$1(BaseRequest this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMRequestPoint().getGson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestPoint mRequestPoint_delegate$lambda$0() {
        return (RequestPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), RequestPoint.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object mService_delegate$lambda$3(BaseRequest this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Repository repository_delegate$lambda$2(BaseRequest this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getMRequestPoint().getRepository();
    }

    public static /* synthetic */ HttpFlow request$default(BaseRequest baseRequest, CoroutineScope scope, Function2 request, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        if ((i & 1) != 0) {
            scope = new NetCoroutineScope(null, null, null, 7, null);
        }
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        return new HttpFlow(scope, baseRequest.getMService(), request);
    }

    public final /* synthetic */ <R> R execute(Object obj) throws ApiException {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return (R) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(obj);
    }

    @NotNull
    public final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    public final T getMService() {
        return (T) this.mService.getValue();
    }

    @NotNull
    public final Repository getRepository() {
        return (Repository) this.repository.getValue();
    }

    public T getService() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Intrinsics.checkNotNull(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<T of com.xiaomi.fitness.net.BaseRequest>");
        return (T) getRepository().getService((Class) type);
    }

    public final /* synthetic */ <R> HttpFlow<T, R> request(CoroutineScope scope, Function2<? super T, ? super Continuation<? super R>, ? extends Object> request) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        return new HttpFlow<>(scope, getMService(), request);
    }

    @Nullable
    public final <T> Object withIO(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(function1, null), continuation);
    }

    public final /* synthetic */ <R, Z> void request(CoroutineScope scope, Function2<? super T, ? super Continuation<? super R>, ? extends Object> request, Function1<? super Z, Unit> success, Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(scope, getMService(), request).error(error).success(success);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void request$default(BaseRequest baseRequest, CoroutineScope scope, Function2 request, Function1 success, Function1 error, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                scope = new NetCoroutineScope(null, null, null, 7, null);
            }
            if ((i & 8) != 0) {
                error = new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.net.BaseRequest.request.1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ApiException it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                        invoke2(apiException);
                        return Unit.INSTANCE;
                    }
                };
            }
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(error, "error");
            new HttpFlow(scope, baseRequest.getMService(), request).error(error).success(success);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
    }
}
