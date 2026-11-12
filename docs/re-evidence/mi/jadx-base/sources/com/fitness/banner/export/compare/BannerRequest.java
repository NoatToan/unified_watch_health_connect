package com.fitness.banner.export.compare;

import com.fitness.banner.export.BannerRequestParam;
import com.fitness.banner.export.BannerRequestParamV2;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseData;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.smarthome.homeroom.model.Home;
import dagger.hilt.android.EntryPointAccessors;
import java.util.LinkedHashMap;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\tJI\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u000ej\b\u0012\u0004\u0012\u00020\u0006`\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u000ej\u0002`\u0010¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018JI\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00172\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u000ej\b\u0012\u0004\u0012\u00020\u0016`\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u000ej\u0002`\u0010¢\u0006\u0002\u0010\u001aJ*\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00142\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0086@¢\u0006\u0002\u0010\"¨\u0006#"}, d2 = {"Lcom/fitness/banner/export/compare/BannerRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/fitness/banner/export/compare/BannerService;", "<init>", "()V", "getBannerResponseV2", "Lcom/fitness/banner/export/compare/BannerResponseResultV2;", "requestParam", "Lcom/fitness/banner/export/BannerRequestParamV2;", "(Lcom/fitness/banner/export/BannerRequestParamV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBannerAsyncV2", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lcom/fitness/banner/export/BannerRequestParamV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBannerV2RequestParamStr", "", "getBannerResponseV1", "Lcom/fitness/banner/export/compare/BannerResponseResultV1;", "Lcom/fitness/banner/export/BannerRequestParam;", "(Lcom/fitness/banner/export/BannerRequestParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBannerAsyncV1", "(Lcom/fitness/banner/export/BannerRequestParam;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getABTestResult", "Lcom/fitness/banner/export/compare/ABTestResponseResult;", "abTestType", "", "appVersion", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "(ILjava/lang/String;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBannerRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerRequest.kt\ncom/fitness/banner/export/compare/BannerRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,81:1\n141#2:82\n89#2,5:86\n141#2:91\n89#2,5:95\n141#2:100\n31#3:83\n28#3,2:84\n31#3:92\n28#3,2:93\n31#3:101\n28#3,2:102\n*S KotlinDebug\n*F\n+ 1 BannerRequest.kt\ncom/fitness/banner/export/compare/BannerRequest\n*L\n21#1:82\n28#1:86,5\n54#1:91\n61#1:95,5\n79#1:100\n21#1:83\n21#1:84,2\n54#1:92\n54#1:93,2\n79#1:101\n79#1:102,2\n*E\n"})
public final class BannerRequest extends BaseRequest<BannerService> {

    /* JADX INFO: renamed from: com.fitness.banner.export.compare.BannerRequest$getABTestResult$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.export.compare.BannerRequest", f = "BannerRequest.kt", i = {}, l = {79}, m = "getABTestResult", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BannerRequest.this.getABTestResult(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.fitness.banner.export.compare.BannerRequest$getBannerAsyncV1$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseData;", "Lcom/fitness/banner/export/compare/BannerResponseResultV1;", "it", "Lcom/fitness/banner/export/compare/BannerService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.export.compare.BannerRequest$getBannerAsyncV1$1", f = "BannerRequest.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13471 extends SuspendLambda implements Function2<BannerService, Continuation<? super BaseData<BannerResponseResultV1>>, Object> {
        final /* synthetic */ BannerRequestParam $requestParam;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13471(BannerRequestParam bannerRequestParam, Continuation<? super C13471> continuation) {
            super(2, continuation);
            this.$requestParam = bannerRequestParam;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13471 c13471 = new C13471(this.$requestParam, continuation);
            c13471.L$0 = obj;
            return c13471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BannerService bannerService, Continuation<? super BaseData<BannerResponseResultV1>> continuation) {
            return ((C13471) create(bannerService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BannerService bannerService = (BannerService) this.L$0;
                String business = this.$requestParam.getBusiness();
                int group = this.$requestParam.getGroup();
                int limit = this.$requestParam.getLimit();
                String appVersionName = AppVersionUtil.INSTANCE.getAppVersionName();
                this.label = 1;
                obj = bannerService.fetchBannerV1(business, group, limit, appVersionName, this);
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

    /* JADX INFO: renamed from: com.fitness.banner.export.compare.BannerRequest$getBannerAsyncV2$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/fitness/banner/export/compare/BannerResponseResultV2;", "it", "Lcom/fitness/banner/export/compare/BannerService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.export.compare.BannerRequest$getBannerAsyncV2$1", f = "BannerRequest.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13481 extends SuspendLambda implements Function2<BannerService, Continuation<? super BaseResult<BannerResponseResultV2>>, Object> {
        final /* synthetic */ BannerRequestParamV2 $requestParam;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13481(BannerRequestParamV2 bannerRequestParamV2, Continuation<? super C13481> continuation) {
            super(2, continuation);
            this.$requestParam = bannerRequestParamV2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13481 c13481 = BannerRequest.this.new C13481(this.$requestParam, continuation);
            c13481.L$0 = obj;
            return c13481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BannerService bannerService, Continuation<? super BaseResult<BannerResponseResultV2>> continuation) {
            return ((C13481) create(bannerService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BannerService bannerService = (BannerService) this.L$0;
                String bannerV2RequestParamStr = BannerRequest.this.getBannerV2RequestParamStr(this.$requestParam);
                this.label = 1;
                obj = bannerService.fetchBannerV2(bannerV2RequestParamStr, this);
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

    /* JADX INFO: renamed from: com.fitness.banner.export.compare.BannerRequest$getBannerResponseV1$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.export.compare.BannerRequest", f = "BannerRequest.kt", i = {}, l = {49}, m = "getBannerResponseV1", n = {}, s = {})
    public static final class C13491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C13491(Continuation<? super C13491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BannerRequest.this.getBannerResponseV1(null, this);
        }
    }

    /* JADX INFO: renamed from: com.fitness.banner.export.compare.BannerRequest$getBannerResponseV2$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.export.compare.BannerRequest", f = "BannerRequest.kt", i = {}, l = {21}, m = "getBannerResponseV2", n = {}, s = {})
    public static final class C13501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C13501(Continuation<? super C13501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BannerRequest.this.getBannerResponseV2(null, this);
        }
    }

    public static /* synthetic */ Object getABTestResult$default(BannerRequest bannerRequest, int i, String str, WearableDeviceModel wearableDeviceModel, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            wearableDeviceModel = null;
        }
        return bannerRequest.getABTestResult(i, str, wearableDeviceModel, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getBannerV2RequestParamStr(BannerRequestParamV2 requestParam) {
        String model;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("resource_id", requestParam.getResourceIdList());
        linkedHashMap.put("country", requestParam.getCountry());
        Long cityId = requestParam.getCityId();
        if (cityId != null) {
            linkedHashMap.put(Home.JSON_KEY_LOCATIONID, Long.valueOf(cityId.longValue()));
        }
        Integer limit = requestParam.getLimit();
        if (limit != null) {
            linkedHashMap.put("limit", Integer.valueOf(limit.intValue()));
        }
        linkedHashMap.put("version", AppVersionUtil.INSTANCE.getAppVersionName());
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        linkedHashMap.put("device_model", model);
        String json = getMGson().toJson(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getABTestResult(int i, @NotNull String str, @Nullable WearableDeviceModel wearableDeviceModel, @NotNull Continuation<? super ABTestResponseResult> continuation) {
        AnonymousClass1 anonymousClass1;
        String model;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object aBTestResult = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(aBTestResult);
            if (wearableDeviceModel == null) {
                wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            }
            if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
                model = "";
            }
            ABTestRequestParam aBTestRequestParam = new ABTestRequestParam(i, str, model);
            Logger.d("BannerRequest", "requestParam=" + aBTestRequestParam);
            BannerService mService = getMService();
            String json = getMGson().toJson(aBTestRequestParam);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            anonymousClass1.label = 1;
            aBTestResult = mService.getABTestResult(json, anonymousClass1);
            if (aBTestResult == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(aBTestResult);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(aBTestResult);
    }

    public final void getBannerAsyncV1(@NotNull BannerRequestParam requestParam, @NotNull Function1<? super BannerResponseResultV1, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C13471(requestParam, null)).error(onFail).success(onSuccess);
    }

    public final void getBannerAsyncV2(@NotNull BannerRequestParamV2 requestParam, @NotNull Function1<? super BannerResponseResultV2, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C13481(requestParam, null)).error(onFail).success(onSuccess);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object getBannerResponseV1(@NotNull BannerRequestParam bannerRequestParam, @NotNull Continuation<? super BannerResponseResultV1> continuation) {
        C13491 c13491;
        if (continuation instanceof C13491) {
            c13491 = (C13491) continuation;
            int i = c13491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13491.label = i - Integer.MIN_VALUE;
            } else {
                c13491 = new C13491(continuation);
            }
        } else {
            c13491 = new C13491(continuation);
        }
        C13491 c13492 = c13491;
        Object objFetchBannerV1 = c13492.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13492.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchBannerV1);
            BannerService mService = getMService();
            String business = bannerRequestParam.getBusiness();
            int group = bannerRequestParam.getGroup();
            int limit = bannerRequestParam.getLimit();
            String appVersionName = AppVersionUtil.INSTANCE.getAppVersionName();
            c13492.label = 1;
            objFetchBannerV1 = mService.fetchBannerV1(business, group, limit, appVersionName, c13492);
            if (objFetchBannerV1 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchBannerV1);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objFetchBannerV1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getBannerResponseV2(@NotNull BannerRequestParamV2 bannerRequestParamV2, @NotNull Continuation<? super BannerResponseResultV2> continuation) {
        C13501 c13501;
        if (continuation instanceof C13501) {
            c13501 = (C13501) continuation;
            int i = c13501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13501.label = i - Integer.MIN_VALUE;
            } else {
                c13501 = new C13501(continuation);
            }
        } else {
            c13501 = new C13501(continuation);
        }
        Object objFetchBannerV2 = c13501.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetchBannerV2);
            BannerService mService = getMService();
            String bannerV2RequestParamStr = getBannerV2RequestParamStr(bannerRequestParamV2);
            c13501.label = 1;
            objFetchBannerV2 = mService.fetchBannerV2(bannerV2RequestParamStr, c13501);
            if (objFetchBannerV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFetchBannerV2);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objFetchBannerV2);
    }
}
