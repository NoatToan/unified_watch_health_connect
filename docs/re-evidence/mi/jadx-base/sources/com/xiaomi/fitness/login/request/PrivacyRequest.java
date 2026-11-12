package com.xiaomi.fitness.login.request;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.fitness.login.bean.PrivacyModel;
import com.xiaomi.fitness.login.request.PrivacyRequest;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResponse;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JD\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000fR\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u000eJ8\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/login/request/PrivacyRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/login/request/PrivacyService;", "<init>", "()V", "sGson", "Lcom/google/gson/Gson;", "checkPrivacyUpdate", "", "privacyId", "", DeviceTagInterface.TAG_VERSION_CODE, "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/login/bean/PrivacyModel$ChangeResult;", "Lcom/xiaomi/fitness/login/bean/PrivacyModel;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "reportPrivacy", "model", "Lcom/xiaomi/fitness/login/bean/PrivacyAgreeModel;", "Lcom/xiaomi/fitness/net/response/BaseResponse;", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrivacyRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyRequest.kt\ncom/xiaomi/fitness/login/request/PrivacyRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,39:1\n104#2,8:40\n104#2,8:48\n*S KotlinDebug\n*F\n+ 1 PrivacyRequest.kt\ncom/xiaomi/fitness/login/request/PrivacyRequest\n*L\n24#1:40,8\n35#1:48,8\n*E\n"})
public final class PrivacyRequest extends BaseRequest<PrivacyService> {

    @NotNull
    private final Gson sGson = new Gson();

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.request.PrivacyRequest$checkPrivacyUpdate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/login/bean/PrivacyModel$ChangeResult;", "Lcom/xiaomi/fitness/login/bean/PrivacyModel;", "it", "Lcom/xiaomi/fitness/login/request/PrivacyService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.request.PrivacyRequest$checkPrivacyUpdate$2", f = "PrivacyRequest.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<PrivacyService, Continuation<? super BaseResult<PrivacyModel.ChangeResult>>, Object> {
        final /* synthetic */ PrivacyModel.ChangeRequest $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PrivacyModel.ChangeRequest changeRequest, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = changeRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = PrivacyRequest.this.new AnonymousClass2(this.$request, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PrivacyService privacyService, Continuation<? super BaseResult<PrivacyModel.ChangeResult>> continuation) {
            return ((AnonymousClass2) create(privacyService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PrivacyService privacyService = (PrivacyService) this.L$0;
                String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
                String json = PrivacyRequest.this.sGson.toJson(this.$request);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = privacyService.checkPrivacyUpdate(json, currentLocale$default, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.request.PrivacyRequest$reportPrivacy$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResponse;", "it", "Lcom/xiaomi/fitness/login/request/PrivacyService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.request.PrivacyRequest$reportPrivacy$2", f = "PrivacyRequest.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25872 extends SuspendLambda implements Function2<PrivacyService, Continuation<? super BaseResponse>, Object> {
        final /* synthetic */ PrivacyAgreeModel $model;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25872(PrivacyAgreeModel privacyAgreeModel, Continuation<? super C25872> continuation) {
            super(2, continuation);
            this.$model = privacyAgreeModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25872 c25872 = PrivacyRequest.this.new C25872(this.$model, continuation);
            c25872.L$0 = obj;
            return c25872;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PrivacyService privacyService, Continuation<? super BaseResponse> continuation) {
            return ((C25872) create(privacyService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PrivacyService privacyService = (PrivacyService) this.L$0;
                String json = PrivacyRequest.this.sGson.toJson(this.$model);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = privacyService.reportAgreePrivacy(json, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkPrivacyUpdate$default(PrivacyRequest privacyRequest, int i, String str, Function1 function1, Function1 function2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function2 = new Function1() { // from class: x9i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return PrivacyRequest.checkPrivacyUpdate$lambda$0((ApiException) obj2);
                }
            };
        }
        privacyRequest.checkPrivacyUpdate(i, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPrivacyUpdate$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportPrivacy$default(PrivacyRequest privacyRequest, PrivacyAgreeModel privacyAgreeModel, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: w9i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return PrivacyRequest.reportPrivacy$lambda$1((ApiException) obj2);
                }
            };
        }
        privacyRequest.reportPrivacy(privacyAgreeModel, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportPrivacy$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void checkPrivacyUpdate(int privacyId, @NotNull String ver, @NotNull Function1<? super PrivacyModel.ChangeResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(ver, "ver");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(new PrivacyModel.ChangeRequest(privacyId, ver), null)).error(error).success(success);
    }

    public final void reportPrivacy(@NotNull PrivacyAgreeModel model, @NotNull Function1<? super BaseResponse, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C25872(model, null)).error(error).success(success);
    }
}
