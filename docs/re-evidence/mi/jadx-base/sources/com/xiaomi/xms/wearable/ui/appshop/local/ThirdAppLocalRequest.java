package com.xiaomi.xms.wearable.ui.appshop.local;

import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import com.xiaomi.xms.wearable.request.ThirdAppService;
import com.xiaomi.xms.wearable.ui.appshop.base.AbsAppRequest;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import defpackage.lg1;
import java.util.Iterator;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052 \u0010\r\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u0010j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0010j\u0002`\u0012H\u0016¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/local/ThirdAppLocalRequest;", "Lcom/xiaomi/xms/wearable/ui/appshop/base/AbsAppRequest;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "loadAppList", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "nextKey", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppListBean;", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdAppLocalRequest extends AbsAppRequest {

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.ui.appshop.local.ThirdAppLocalRequest$loadAppList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.ui.appshop.local.ThirdAppLocalRequest$loadAppList$1", f = "ThirdAppLocalRequest.kt", i = {0, 0}, l = {32}, m = "invokeSuspend", n = {"$this$scopeNet", "builder"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nThirdAppLocalRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdAppLocalRequest.kt\ncom/xiaomi/xms/wearable/ui/appshop/local/ThirdAppLocalRequest$loadAppList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,51:1\n1863#2,2:52\n93#3:54\n*S KotlinDebug\n*F\n+ 1 ThirdAppLocalRequest.kt\ncom/xiaomi/xms/wearable/ui/appshop/local/ThirdAppLocalRequest$loadAppList$1\n*L\n32#1:52,2\n39#1:54\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ Function1<ApiException, Unit> $fail;
        final /* synthetic */ Function1<WatchAppListData.WatchAppListBean, Unit> $success;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ThirdAppLocalRequest this$0;

        /* JADX INFO: renamed from: com.xiaomi.xms.wearable.ui.appshop.local.ThirdAppLocalRequest$loadAppList$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/WatchAppListData$WatchAppListBean;", "it", "Lcom/xiaomi/xms/wearable/request/ThirdAppService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.xms.wearable.ui.appshop.local.ThirdAppLocalRequest$loadAppList$1$2", f = "ThirdAppLocalRequest.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<ThirdAppService, Continuation<? super BaseResult<WatchAppListData.WatchAppListBean>>, Object> {
            final /* synthetic */ StringBuilder $builder;
            final /* synthetic */ WearableDeviceModel $deviceModel;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ThirdAppLocalRequest this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(WearableDeviceModel wearableDeviceModel, StringBuilder sb, ThirdAppLocalRequest thirdAppLocalRequest, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$deviceModel = wearableDeviceModel;
                this.$builder = sb;
                this.this$0 = thirdAppLocalRequest;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$deviceModel, this.$builder, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ThirdAppService thirdAppService, Continuation<? super BaseResult<WatchAppListData.WatchAppListBean>> continuation) {
                return ((AnonymousClass2) create(thirdAppService, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ThirdAppService thirdAppService = (ThirdAppService) this.L$0;
                    String model = DeviceModelExtKt.getModel(this.$deviceModel);
                    StringBuilder sb = this.$builder;
                    WatchAppListData.MultiWatchAppParam multiWatchAppParam = new WatchAppListData.MultiWatchAppParam(model, sb.substring(0, sb.length() - 1));
                    lg1.d("load local app list getMultiWatchAppList param:" + this.this$0.getMGson().toJson(multiWatchAppParam));
                    String json = this.this$0.getMGson().toJson(multiWatchAppParam);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    this.label = 1;
                    obj = thirdAppService.getMultiWatchAppList(json, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, Function1<? super WatchAppListData.WatchAppListBean, Unit> function1, ThirdAppLocalRequest thirdAppLocalRequest, Function1<? super ApiException, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
            this.$success = function1;
            this.this$0 = thirdAppLocalRequest;
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$deviceModel, this.$success, this.this$0, this.$fail, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            StringBuilder sb;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                StringBuilder sb2 = new StringBuilder();
                WatchAppRepository companion = WatchAppRepository.INSTANCE.getInstance();
                String did = this.$deviceModel.getDid();
                this.L$0 = coroutineScope;
                this.L$1 = sb2;
                this.label = 1;
                Object watchAppList = companion.getWatchAppList(did, this);
                if (watchAppList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sb = sb2;
                obj = watchAppList;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sb = (StringBuilder) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                sb.append(((WatchAppItemEntity) it.next()).getPackageName());
                sb.append(",");
            }
            if (sb.length() == 0) {
                lg1.d("load local applist empty");
                this.$success.invoke2(new WatchAppListData.WatchAppListBean());
            } else {
                ThirdAppLocalRequest thirdAppLocalRequest = this.this$0;
                new HttpFlow(coroutineScope, thirdAppLocalRequest.getMService(), new AnonymousClass2(this.$deviceModel, sb, thirdAppLocalRequest, null)).error(this.$fail).success(this.$success);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.xms.wearable.ui.appshop.base.AbsAppRequest
    @NotNull
    public String getTAG() {
        return "ThirdAppLocalRequest";
    }

    @Override // com.xiaomi.xms.wearable.ui.appshop.base.AbsAppRequest
    public void loadAppList(@NotNull WearableDeviceModel deviceModel, @Nullable String nextKey, @NotNull Function1<? super WatchAppListData.WatchAppListBean, Unit> success, @NotNull Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1(deviceModel, success, this, fail, null), 1, null);
    }
}
