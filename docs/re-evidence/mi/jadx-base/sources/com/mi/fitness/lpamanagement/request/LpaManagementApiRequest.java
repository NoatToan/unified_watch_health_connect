package com.mi.fitness.lpamanagement.request;

import com.mi.fitness.lpamanagement.request.LpaManagementApiRequest;
import com.mi.fitness.lpamanagement.request.data.DecryptRequestData;
import com.mi.fitness.lpamanagement.request.data.DecryptResult;
import com.mi.fitness.lpamanagement.request.data.GetSignRequestData;
import com.mi.fitness.lpamanagement.request.data.GetSignResult;
import com.mi.fitness.lpamanagement.request.data.VerifySignResult;
import com.mi.fitness.lpamanagement.request.data.verifySignRequest;
import com.mi.fitness.lpamanagement.ui.LpaManagementFragmentKt;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jd\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010\u0014J\\\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u0019`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010\u001aJT\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00172\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u001d`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012H\u0086@¢\u0006\u0002\u0010\u001e¨\u0006 "}, d2 = {"Lcom/mi/fitness/lpamanagement/request/LpaManagementApiRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/mi/fitness/lpamanagement/request/LpaManagementApiService;", "<init>", "()V", "getSign", "", AuthorizeActivityBase.KEY_OPERATOR, "", "chinaMobileSignRequestData", "Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaMobileSignRequestData;", "chinaUnicomSignRequestData", "Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaUnicomSignRequestData;", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/mi/fitness/lpamanagement/request/data/GetSignResult;", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(ILcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaMobileSignRequestData;Lcom/mi/fitness/lpamanagement/request/data/GetSignRequestData$ChinaUnicomSignRequestData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifySign", MiuiCursorConstants.CONTENT, "", "sign", "Lcom/mi/fitness/lpamanagement/request/data/VerifySignResult;", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrypt", "cipherText", "Lcom/mi/fitness/lpamanagement/request/data/DecryptResult;", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLpaManagementApiRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpaManagementApiRequest.kt\ncom/mi/fitness/lpamanagement/request/LpaManagementApiRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,61:1\n89#2,5:62\n89#2,5:67\n89#2,5:72\n*S KotlinDebug\n*F\n+ 1 LpaManagementApiRequest.kt\ncom/mi/fitness/lpamanagement/request/LpaManagementApiRequest\n*L\n26#1:62,5\n36#1:67,5\n50#1:72,5\n*E\n"})
public final class LpaManagementApiRequest extends BaseRequest<LpaManagementApiService> {
    public static final int OPERATOR_CHINA_MOBILE = 1;

    /* JADX INFO: renamed from: com.mi.fitness.lpamanagement.request.LpaManagementApiRequest$decrypt$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/fitness/lpamanagement/request/data/DecryptResult;", "it", "Lcom/mi/fitness/lpamanagement/request/LpaManagementApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.lpamanagement.request.LpaManagementApiRequest$decrypt$2", f = "LpaManagementApiRequest.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<LpaManagementApiService, Continuation<? super BaseResult<DecryptResult>>, Object> {
        final /* synthetic */ String $cipherText;
        final /* synthetic */ int $operator;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$operator = i;
            this.$cipherText = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = LpaManagementApiRequest.this.new AnonymousClass2(this.$operator, this.$cipherText, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LpaManagementApiService lpaManagementApiService, Continuation<? super BaseResult<DecryptResult>> continuation) {
            return ((AnonymousClass2) create(lpaManagementApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LpaManagementApiService lpaManagementApiService = (LpaManagementApiService) this.L$0;
                String json = LpaManagementApiRequest.this.getMGson().toJson(new DecryptRequestData(this.$operator, this.$cipherText));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = lpaManagementApiService.decrypt(json, this);
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

    /* JADX INFO: renamed from: com.mi.fitness.lpamanagement.request.LpaManagementApiRequest$getSign$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/fitness/lpamanagement/request/data/GetSignResult;", "it", "Lcom/mi/fitness/lpamanagement/request/LpaManagementApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.lpamanagement.request.LpaManagementApiRequest$getSign$2", f = "LpaManagementApiRequest.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13842 extends SuspendLambda implements Function2<LpaManagementApiService, Continuation<? super BaseResult<GetSignResult>>, Object> {
        final /* synthetic */ GetSignRequestData $requestData;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LpaManagementApiRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13842(GetSignRequestData getSignRequestData, LpaManagementApiRequest lpaManagementApiRequest, Continuation<? super C13842> continuation) {
            super(2, continuation);
            this.$requestData = getSignRequestData;
            this.this$0 = lpaManagementApiRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13842 c13842 = new C13842(this.$requestData, this.this$0, continuation);
            c13842.L$0 = obj;
            return c13842;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LpaManagementApiService lpaManagementApiService, Continuation<? super BaseResult<GetSignResult>> continuation) {
            return ((C13842) create(lpaManagementApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LpaManagementApiService lpaManagementApiService = (LpaManagementApiService) this.L$0;
                Logger.i(LpaManagementFragmentKt.LPA_TAG, "request:" + this.$requestData);
                String json = this.this$0.getMGson().toJson(this.$requestData);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = lpaManagementApiService.getSign(json, this);
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

    /* JADX INFO: renamed from: com.mi.fitness.lpamanagement.request.LpaManagementApiRequest$verifySign$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/fitness/lpamanagement/request/data/VerifySignResult;", "it", "Lcom/mi/fitness/lpamanagement/request/LpaManagementApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.lpamanagement.request.LpaManagementApiRequest$verifySign$2", f = "LpaManagementApiRequest.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13852 extends SuspendLambda implements Function2<LpaManagementApiService, Continuation<? super BaseResult<VerifySignResult>>, Object> {
        final /* synthetic */ String $content;
        final /* synthetic */ int $operator;
        final /* synthetic */ String $sign;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13852(int i, String str, String str2, Continuation<? super C13852> continuation) {
            super(2, continuation);
            this.$operator = i;
            this.$content = str;
            this.$sign = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13852 c13852 = LpaManagementApiRequest.this.new C13852(this.$operator, this.$content, this.$sign, continuation);
            c13852.L$0 = obj;
            return c13852;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LpaManagementApiService lpaManagementApiService, Continuation<? super BaseResult<VerifySignResult>> continuation) {
            return ((C13852) create(lpaManagementApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LpaManagementApiService lpaManagementApiService = (LpaManagementApiService) this.L$0;
                String json = LpaManagementApiRequest.this.getMGson().toJson(new verifySignRequest(this.$operator, this.$content, this.$sign));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = lpaManagementApiService.verifySign(json, this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit decrypt$lambda$2(Function1 success, DecryptResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSign$lambda$0(Function1 success, GetSignResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifySign$lambda$1(Function1 success, VerifySignResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object decrypt(int i, @NotNull String str, @NotNull final Function1<? super DecryptResult, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(i, str, null)).error(function2).success(new Function1() { // from class: oue
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LpaManagementApiRequest.decrypt$lambda$2(function1, (DecryptResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getSign(int i, @Nullable GetSignRequestData.ChinaMobileSignRequestData chinaMobileSignRequestData, @Nullable GetSignRequestData.ChinaUnicomSignRequestData chinaUnicomSignRequestData, @NotNull final Function1<? super GetSignResult, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C13842(new GetSignRequestData(i, chinaMobileSignRequestData, chinaUnicomSignRequestData), this, null)).error(function2).success(new Function1() { // from class: nue
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LpaManagementApiRequest.getSign$lambda$0(function1, (GetSignResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object verifySign(int i, @NotNull String str, @NotNull String str2, @NotNull final Function1<? super VerifySignResult, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C13852(i, str, str2, null)).error(function2).success(new Function1() { // from class: mue
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LpaManagementApiRequest.verifySign$lambda$1(function1, (VerifySignResult) obj);
            }
        });
        return Unit.INSTANCE;
    }
}
