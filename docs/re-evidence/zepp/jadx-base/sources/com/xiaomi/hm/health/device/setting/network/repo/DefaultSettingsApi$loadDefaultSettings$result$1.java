package com.xiaomi.hm.health.device.setting.network.repo;

import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.network.repo.DefaultSettingsApi$loadDefaultSettings$result$1", f = "DefaultSettingsApi.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultSettingsApi$loadDefaultSettings$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public Object a;
    public int b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSettingsApi$loadDefaultSettings$result$1(String str, Continuation<? super DefaultSettingsApi$loadDefaultSettings$result$1> continuation) {
        super(2, continuation);
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DefaultSettingsApi$loadDefaultSettings$result$1(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
        return ((DefaultSettingsApi$loadDefaultSettings$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.c;
            this.a = str;
            this.b = 1;
            final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
            HMWebUtil.doRequest(str, null, Support.RequestSupport.GET, new IHMBasicHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.setting.network.repo.DefaultSettingsApi$loadDefaultSettings$result$1$1$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public static final a a = new a();

                    public a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onCompleted";
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public static final b a = new b();

                    public b() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onCompleted";
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function0<String> {
                    public final /* synthetic */ Throwable a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(Throwable th) {
                        super(0);
                        this.a = th;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onError, throwable: " + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class d extends Lambda implements Function0<String> {
                    public final /* synthetic */ HMHttpResponseData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public d(HMHttpResponseData hMHttpResponseData) {
                        super(0);
                        this.a = hMHttpResponseData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onFailure, item: " + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class e extends Lambda implements Function0<String> {
                    public final /* synthetic */ HMHttpResponseData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(HMHttpResponseData hMHttpResponseData) {
                        super(0);
                        this.a = hMHttpResponseData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onSuccess, item: " + this.a;
                    }
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCancel(int type) {
                    HMLog.info("DefaultSettingsApi", a.a);
                    Continuation<String> continuation = safeContinuation;
                    Result.Companion companion = Result.Companion;
                    continuation.resumeWith(Result.m3845constructorimpl(null));
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCompleted() {
                    HMLog.info("DefaultSettingsApi", b.a);
                    Continuation<String> continuation = safeContinuation;
                    Result.Companion companion = Result.Companion;
                    continuation.resumeWith(Result.m3845constructorimpl(null));
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onError(@Nullable Throwable throwable) {
                    HMLog.info("DefaultSettingsApi", new c(throwable));
                    Continuation<String> continuation = safeContinuation;
                    Result.Companion companion = Result.Companion;
                    continuation.resumeWith(Result.m3845constructorimpl(null));
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onFailure(@Nullable HMHttpResponseData item) {
                    HMLog.info("DefaultSettingsApi", new d(item));
                    Continuation<String> continuation = safeContinuation;
                    Result.Companion companion = Result.Companion;
                    continuation.resumeWith(Result.m3845constructorimpl(null));
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onSuccess(@Nullable HMHttpResponseData item) {
                    HMLog.info("DefaultSettingsApi", new e(item));
                    Continuation<String> continuation = safeContinuation;
                    String responseString = item == null ? null : item.getResponseString();
                    Result.Companion companion = Result.Companion;
                    continuation.resumeWith(Result.m3845constructorimpl(responseString));
                }
            });
            obj = safeContinuation.getOrThrow();
            if (obj == a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
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
}
