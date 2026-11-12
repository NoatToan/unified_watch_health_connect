package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004Ja\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0011j\b\u0012\u0004\u0012\u00020\u0010`\u000f2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0011j\u0002`\u0013¢\u0006\u0002\u0010\u0015JI\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0011j\b\u0012\u0004\u0012\u00020\u0017`\u000f2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0011j\u0002`\u0013¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionApiService;", "<init>", "()V", "reportFallDetectionPosition", "", "reportId", "", "longitude", "", "latitude", "satelliteCount", "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionReportPositionResult;", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;DDILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getFallDetectionHelpSms", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionGetMapUrlResult;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFallDetectionRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallDetectionRequest.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,67:1\n89#2,5:68\n89#2,5:73\n*S KotlinDebug\n*F\n+ 1 FallDetectionRequest.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionRequest\n*L\n52#1:68,5\n62#1:73,5\n*E\n"})
public final class FallDetectionRequest extends BaseRequest<FallDetectionApiService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionRequest$getFallDetectionHelpSms$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionGetMapUrlResult;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionRequest$getFallDetectionHelpSms$1", f = "FallDetectionRequest.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FallDetectionApiService, Continuation<? super BaseResult<FallDetectionGetMapUrlResult>>, Object> {
        final /* synthetic */ String $reportId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$reportId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$reportId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FallDetectionApiService fallDetectionApiService, Continuation<? super BaseResult<FallDetectionGetMapUrlResult>> continuation) {
            return ((AnonymousClass1) create(fallDetectionApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FallDetectionApiService fallDetectionApiService = (FallDetectionApiService) this.L$0;
                String json = new Gson().toJson(new FallDetectionGetMapUrlRequest(this.$reportId));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = fallDetectionApiService.getMapUrl(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionRequest$reportFallDetectionPosition$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionReportPositionResult;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionRequest$reportFallDetectionPosition$1", f = "FallDetectionRequest.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20731 extends SuspendLambda implements Function2<FallDetectionApiService, Continuation<? super BaseResult<FallDetectionReportPositionResult>>, Object> {
        final /* synthetic */ FallDetectionReportPositionRequest $param;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20731(FallDetectionReportPositionRequest fallDetectionReportPositionRequest, Continuation<? super C20731> continuation) {
            super(2, continuation);
            this.$param = fallDetectionReportPositionRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20731 c20731 = new C20731(this.$param, continuation);
            c20731.L$0 = obj;
            return c20731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FallDetectionApiService fallDetectionApiService, Continuation<? super BaseResult<FallDetectionReportPositionResult>> continuation) {
            return ((C20731) create(fallDetectionApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FallDetectionApiService fallDetectionApiService = (FallDetectionApiService) this.L$0;
                String json = new Gson().toJson(this.$param);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = fallDetectionApiService.reportPosition(json, this);
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

    public final void getFallDetectionHelpSms(@NotNull String reportId, @NotNull Function1<? super FallDetectionGetMapUrlResult, Unit> success, @NotNull Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(reportId, "reportId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(reportId, null)).error(fail).success(success);
    }

    public final void reportFallDetectionPosition(@NotNull String reportId, double longitude, double latitude, int satelliteCount, @NotNull Function1<? super FallDetectionReportPositionResult, Unit> success, @NotNull Function1<? super ApiException, Unit> fail) {
        Float fValueOf;
        Intrinsics.checkNotNullParameter(reportId, "reportId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        Intent intentRegisterReceiver = ApplicationExtKt.getApplication().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            fValueOf = Float.valueOf((intentRegisterReceiver.getIntExtra("level", -1) * 100) / intentRegisterReceiver.getIntExtra("scale", -1));
        } else {
            fValueOf = null;
        }
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C20731(new FallDetectionReportPositionRequest(reportId, String.valueOf(longitude), String.valueOf(latitude), fValueOf + "%", String.valueOf(satelliteCount)), null)).error(fail).success(success);
    }
}
