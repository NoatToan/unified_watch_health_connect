package com.xiaomi.fitness.health.ecg.web;

import com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository;
import com.xiaomi.fitness.health.ecg.net.GetAccessTokenResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/health/ecg/web/EcgAuthData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$fetchAuthDataJson$ecgAuthData$1", f = "EcgWebViewActivity.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
public final class EcgWebViewActivity$fetchAuthDataJson$ecgAuthData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EcgAuthData>, Object> {
    final /* synthetic */ boolean $needRefresh;
    int label;
    final /* synthetic */ EcgWebViewActivity this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$fetchAuthDataJson$ecgAuthData$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/health/ecg/web/EcgAuthData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$fetchAuthDataJson$ecgAuthData$1$1", f = "EcgWebViewActivity.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EcgAuthData>, Object> {
        final /* synthetic */ boolean $needRefresh;
        int label;
        final /* synthetic */ EcgWebViewActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EcgWebViewActivity ecgWebViewActivity, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ecgWebViewActivity;
            this.$needRefresh = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$needRefresh, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String openId;
            String accessToken;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcgAnalyzeRepository ecgAnalyzeRepository = this.this$0.getEcgAnalyzeRepository();
                boolean z = this.$needRefresh;
                this.label = 1;
                obj = ecgAnalyzeRepository.getAccessToken(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GetAccessTokenResult getAccessTokenResult = (GetAccessTokenResult) obj;
            String str = "";
            if (getAccessTokenResult == null || (openId = getAccessTokenResult.getOpenId()) == null) {
                openId = "";
            }
            if (getAccessTokenResult != null && (accessToken = getAccessTokenResult.getAccessToken()) != null) {
                str = accessToken;
            }
            return new EcgAuthData(openId, str, getAccessTokenResult != null ? getAccessTokenResult.getErrorCode() : 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EcgAuthData> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgWebViewActivity$fetchAuthDataJson$ecgAuthData$1(EcgWebViewActivity ecgWebViewActivity, boolean z, Continuation<? super EcgWebViewActivity$fetchAuthDataJson$ecgAuthData$1> continuation) {
        super(2, continuation);
        this.this$0 = ecgWebViewActivity;
        this.$needRefresh = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EcgWebViewActivity$fetchAuthDataJson$ecgAuthData$1(this.this$0, this.$needRefresh, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$needRefresh, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, anonymousClass1, this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EcgAuthData> continuation) {
        return ((EcgWebViewActivity$fetchAuthDataJson$ecgAuthData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
