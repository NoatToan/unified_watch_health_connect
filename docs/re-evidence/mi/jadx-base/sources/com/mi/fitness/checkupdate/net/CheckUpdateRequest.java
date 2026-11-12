package com.mi.fitness.checkupdate.net;

import com.mi.fitness.checkupdate.UpdateHelper;
import com.mi.fitness.checkupdate.model.GetLatestVersion;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.model.OtaUpgradeRequest;
import com.mi.fitness.checkupdate.model.OtaUpgradeResult;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import defpackage.pb2;
import java.util.HashMap;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001c\u0010\u001dJc\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\b\u0012\u0004\u0012\u00020\n`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0014\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\tj\b\u0012\u0004\u0012\u00020\u0013`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\u000f¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\t2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u0018j\u0002`\u0019\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/mi/fitness/checkupdate/net/CheckUpdateRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/mi/fitness/checkupdate/net/CheckupdateService;", "", "did", "model", "", "appVersionCode", TSMAuthContants.PARAM_FIRMWARE_VERSION, "Lkotlin/Function1;", "Lcom/mi/fitness/checkupdate/model/LatestVersion;", "", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "success", "Lcom/xiaomi/fitness/net/response/ApiException;", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "error", "getLatestVersion", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;", "checkHMUpgrade", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "firmwareVersion", "Lpb2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reportDeviceInfo", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCheckUpdateRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckUpdateRequest.kt\ncom/mi/fitness/checkupdate/net/CheckUpdateRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,54:1\n89#2,5:55\n89#2,5:60\n89#2,5:65\n*S KotlinDebug\n*F\n+ 1 CheckUpdateRequest.kt\ncom/mi/fitness/checkupdate/net/CheckUpdateRequest\n*L\n21#1:55,5\n31#1:60,5\n50#1:65,5\n*E\n"})
public final class CheckUpdateRequest extends BaseRequest<CheckupdateService> {

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.net.CheckUpdateRequest$checkHMUpgrade$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;", "service", "Lcom/mi/fitness/checkupdate/net/CheckupdateService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.net.CheckUpdateRequest$checkHMUpgrade$1", f = "CheckUpdateRequest.kt", i = {0, 0}, l = {33, 37}, m = "invokeSuspend", n = {"service", "request"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CheckupdateService, Continuation<? super BaseResult<OtaUpgradeResult>>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.mi.fitness.checkupdate.net.CheckUpdateRequest$checkHMUpgrade$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.fitness.checkupdate.net.CheckUpdateRequest$checkHMUpgrade$1$1", f = "CheckUpdateRequest.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02901 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<OtaUpgradeRequest> $request;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02901(Ref.ObjectRef<OtaUpgradeRequest> objectRef, Continuation<? super C02901> continuation) {
                super(1, continuation);
                this.$request = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C02901(this.$request, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Ref.ObjectRef<OtaUpgradeRequest> objectRef;
                T t;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef<OtaUpgradeRequest> objectRef2 = this.$request;
                    UpdateHelper updateHelper = UpdateHelper.INSTANCE;
                    this.L$0 = objectRef2;
                    this.label = 1;
                    Object objBuildOtaRequest = updateHelper.buildOtaRequest(this);
                    if (objBuildOtaRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                    t = objBuildOtaRequest;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    t = obj;
                }
                objectRef.element = t;
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super Unit> continuation) {
                return ((C02901) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = CheckUpdateRequest.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CheckupdateService checkupdateService, Continuation<? super BaseResult<OtaUpgradeResult>> continuation) {
            return ((AnonymousClass1) create(checkupdateService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            CheckupdateService checkupdateService;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    objectRef = (Ref.ObjectRef) this.L$1;
                    checkupdateService = (CheckupdateService) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            ResultKt.throwOnFailure(obj);
            CheckupdateService checkupdateService2 = (CheckupdateService) this.L$0;
            objectRef = new Ref.ObjectRef();
            CheckUpdateRequest checkUpdateRequest = CheckUpdateRequest.this;
            C02901 c02901 = new C02901(objectRef, null);
            this.L$0 = checkupdateService2;
            this.L$1 = objectRef;
            this.label = 1;
            if (checkUpdateRequest.withIO(c02901, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            checkupdateService = checkupdateService2;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() % ((long) 100));
            String json = CheckUpdateRequest.this.getMGson().toJson(objectRef.element);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            String strValueOf = String.valueOf(iCurrentTimeMillis);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = checkupdateService.checkHMUpgrade(json, strValueOf, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.net.CheckUpdateRequest$getLatestVersion$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/fitness/checkupdate/model/LatestVersion;", "service", "Lcom/mi/fitness/checkupdate/net/CheckupdateService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.net.CheckUpdateRequest$getLatestVersion$1", f = "CheckUpdateRequest.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13691 extends SuspendLambda implements Function2<CheckupdateService, Continuation<? super BaseResult<LatestVersion>>, Object> {
        final /* synthetic */ long $appVersionCode;
        final /* synthetic */ String $did;
        final /* synthetic */ String $fwVersion;
        final /* synthetic */ String $model;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CheckUpdateRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13691(String str, String str2, long j, String str3, CheckUpdateRequest checkUpdateRequest, Continuation<? super C13691> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$model = str2;
            this.$appVersionCode = j;
            this.$fwVersion = str3;
            this.this$0 = checkUpdateRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13691 c13691 = new C13691(this.$did, this.$model, this.$appVersionCode, this.$fwVersion, this.this$0, continuation);
            c13691.L$0 = obj;
            return c13691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CheckupdateService checkupdateService, Continuation<? super BaseResult<LatestVersion>> continuation) {
            return ((C13691) create(checkupdateService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CheckupdateService checkupdateService = (CheckupdateService) this.L$0;
                String json = this.this$0.getMGson().toJson(GetLatestVersion.INSTANCE.create(this.$did, this.$model, this.$appVersionCode, this.$fwVersion, "prod"));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                String currentLocale = LocaleUtil.INSTANCE.getCurrentLocale(true, true);
                this.label = 1;
                obj = checkupdateService.getLatestVersion(json, currentLocale, this);
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

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.net.CheckUpdateRequest$reportDeviceInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "", "it", "Lcom/mi/fitness/checkupdate/net/CheckupdateService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.net.CheckUpdateRequest$reportDeviceInfo$1", f = "CheckUpdateRequest.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13701 extends SuspendLambda implements Function2<CheckupdateService, Continuation<? super BaseResult<String>>, Object> {
        final /* synthetic */ HashMap<String, String> $param;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13701(HashMap<String, String> map, Continuation<? super C13701> continuation) {
            super(2, continuation);
            this.$param = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13701 c13701 = CheckUpdateRequest.this.new C13701(this.$param, continuation);
            c13701.L$0 = obj;
            return c13701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CheckupdateService checkupdateService, Continuation<? super BaseResult<String>> continuation) {
            return ((C13701) create(checkupdateService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CheckupdateService checkupdateService = (CheckupdateService) this.L$0;
                String json = CheckUpdateRequest.this.getMGson().toJson(this.$param);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = checkupdateService.reportDeviceInfo(json, this);
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

    public final void checkHMUpgrade(@NotNull Function1<? super OtaUpgradeResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(null)).error(error).success(success);
    }

    public final void getLatestVersion(@NotNull String did, @NotNull String model, long appVersionCode, @NotNull String fwVersion, @NotNull Function1<? super LatestVersion, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fwVersion, "fwVersion");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C13691(did, model, appVersionCode, fwVersion, this, null)).error(error).success(success);
    }

    public final void reportDeviceInfo(@NotNull String did, @NotNull String firmwareVersion, @NotNull Function1<? super pb2, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        HashMap map = new HashMap();
        map.put("did", did);
        map.put("fw_ver", firmwareVersion);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C13701(map, null)).error(error).success(success);
    }
}
