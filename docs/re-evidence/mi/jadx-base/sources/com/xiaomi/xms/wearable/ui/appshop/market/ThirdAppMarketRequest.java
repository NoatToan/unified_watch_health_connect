package com.xiaomi.xms.wearable.ui.appshop.market;

import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.xms.wearable.request.ThirdAppService;
import com.xiaomi.xms.wearable.ui.appshop.base.AbsAppRequest;
import com.xiaomi.xms.wearable.ui.appshop.market.ThirdAppMarketRequest;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import defpackage.lg1;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052 \u0010\r\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u0010j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0010j\u0002`\u0012H\u0016¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/market/ThirdAppMarketRequest;", "Lcom/xiaomi/xms/wearable/ui/appshop/base/AbsAppRequest;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "loadAppList", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "nextKey", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppListBean;", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThirdAppMarketRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdAppMarketRequest.kt\ncom/xiaomi/xms/wearable/ui/appshop/market/ThirdAppMarketRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,46:1\n89#2,5:47\n*S KotlinDebug\n*F\n+ 1 ThirdAppMarketRequest.kt\ncom/xiaomi/xms/wearable/ui/appshop/market/ThirdAppMarketRequest\n*L\n27#1:47,5\n*E\n"})
public final class ThirdAppMarketRequest extends AbsAppRequest {
    public static final int DEFAULT_PAGE_COUNT = 10;

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.ui.appshop.market.ThirdAppMarketRequest$loadAppList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppListBean;", "it", "Lcom/xiaomi/xms/wearable/request/ThirdAppService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.ui.appshop.market.ThirdAppMarketRequest$loadAppList$1", f = "ThirdAppMarketRequest.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ThirdAppService, Continuation<? super BaseResult<WatchAppListData.WatchAppListBean>>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ String $nextKey;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ThirdAppMarketRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, String str, ThirdAppMarketRequest thirdAppMarketRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
            this.$nextKey = str;
            this.this$0 = thirdAppMarketRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$deviceModel, this.$nextKey, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThirdAppService thirdAppService, Continuation<? super BaseResult<WatchAppListData.WatchAppListBean>> continuation) {
            return ((AnonymousClass1) create(thirdAppService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ThirdAppService thirdAppService = (ThirdAppService) this.L$0;
                WatchAppListData.WatchAppListParam watchAppListParam = new WatchAppListData.WatchAppListParam(DeviceModelExtKt.getModel(this.$deviceModel), this.$nextKey, 10);
                lg1.d("getWatchAppList from server param:" + this.this$0.getMGson().toJson(watchAppListParam));
                String json = this.this$0.getMGson().toJson(watchAppListParam);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = thirdAppService.getWatchAppList(json, this);
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
    public static final Unit loadAppList$lambda$0(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        lg1.c("ThirdAppMarketRequest", it);
        fail.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAppList$lambda$1(ThirdAppMarketRequest this$0, Function1 success, WatchAppListData.WatchAppListBean watchAppListBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        lg1.d("ThirdAppMarketRequest getWatchAppList success" + this$0.getMGson().toJson(watchAppListBean));
        success.invoke2(watchAppListBean);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.xms.wearable.ui.appshop.base.AbsAppRequest
    @NotNull
    public String getTAG() {
        return "ThirdAppMarketRequest";
    }

    @Override // com.xiaomi.xms.wearable.ui.appshop.base.AbsAppRequest
    public void loadAppList(@NotNull WearableDeviceModel deviceModel, @Nullable String nextKey, @NotNull final Function1<? super WatchAppListData.WatchAppListBean, Unit> success, @NotNull final Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(deviceModel, nextKey, this, null)).error(new Function1() { // from class: dbp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdAppMarketRequest.loadAppList$lambda$0(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: ebp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdAppMarketRequest.loadAppList$lambda$1(this.f16469a, success, (WatchAppListData.WatchAppListBean) obj);
            }
        });
    }
}
