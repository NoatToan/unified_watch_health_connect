package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.sport_eco.bean.DeviceVersionInfo;
import com.xiaomi.fitness.sport_eco.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.sport_eco.model.UpgradeInfo;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\f0\u0010J$\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\f0\u0015R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "updateFirmware", "", "did", "", "result", "Lkotlin/Function2;", "", "Lcom/xiaomi/fitness/net/response/ApiException;", "getDeviceVersionInfo", "callback", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sport_eco/bean/DeviceVersionInfo;", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalSportSettingRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSportSettingRequest.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,76:1\n89#2,5:77\n89#2,5:82\n*S KotlinDebug\n*F\n+ 1 LocalSportSettingRequest.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingRequest\n*L\n32#1:77,5\n45#1:82,5\n*E\n"})
public final class LocalSportSettingRequest extends BaseRequest<LocalSportService> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public Gson gson;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingRequest$Companion;", "", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest$getDeviceVersionInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/sport_eco/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "it", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest$getDeviceVersionInfo$1", f = "LocalSportSettingRequest.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LocalSportService, Continuation<? super BaseResult<LocalDeviceUpgradeModel.CheckUpgradeRequest>>, Object> {
        final /* synthetic */ String $did;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = LocalSportSettingRequest.this.new AnonymousClass1(this.$did, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LocalSportService localSportService, Continuation<? super BaseResult<LocalDeviceUpgradeModel.CheckUpgradeRequest>> continuation) {
            return ((AnonymousClass1) create(localSportService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LocalSportService localSportService = (LocalSportService) this.L$0;
                UpgradeInfo upgradeInfo = new UpgradeInfo();
                upgradeInfo.did = this.$did;
                String json = LocalSportSettingRequest.this.getGson().toJson(upgradeInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = localSportService.checkLocalDeviceVersion(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest$updateFirmware$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "", "it", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest$updateFirmware$1", f = "LocalSportSettingRequest.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31641 extends SuspendLambda implements Function2<LocalSportService, Continuation<? super BaseResult<Object>>, Object> {
        final /* synthetic */ String $did;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31641(String str, Continuation<? super C31641> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C31641 c31641 = LocalSportSettingRequest.this.new C31641(this.$did, continuation);
            c31641.L$0 = obj;
            return c31641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LocalSportService localSportService, Continuation<? super BaseResult<Object>> continuation) {
            return ((C31641) create(localSportService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LocalSportService localSportService = (LocalSportService) this.L$0;
                UpgradeInfo upgradeInfo = new UpgradeInfo();
                upgradeInfo.did = this.$did;
                String json = LocalSportSettingRequest.this.getGson().toJson(upgradeInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = localSportService.upgradeLocalDevice(json, this);
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
    public static final Unit getDeviceVersionInfo$lambda$2(Function1 callback, ApiException it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e("getDeviceVersionInfo error", it);
        callback.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeviceVersionInfo$lambda$4(Function1 callback, LocalDeviceUpgradeModel.CheckUpgradeRequest request) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(request, "request");
        Logger.d("getDeviceVersionInfo success " + request, new Object[0]);
        DeviceVersionInfo deviceVersionInfo = new DeviceVersionInfo();
        deviceVersionInfo.setCode(0);
        deviceVersionInfo.setVersionInfo(request);
        deviceVersionInfo.setNeedUpdate(!request.isLatest);
        callback.invoke(deviceVersionInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateFirmware$lambda$0(Function2 result, ApiException it) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        result.invoke(Boolean.FALSE, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateFirmware$lambda$1(Function2 result, Object it) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        result.invoke(Boolean.TRUE, null);
        return Unit.INSTANCE;
    }

    public final void getDeviceVersionInfo(@NotNull String did, @NotNull final Function1<? super DeviceVersionInfo, Unit> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(did, null)).error(new Function1() { // from class: eme
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalSportSettingRequest.getDeviceVersionInfo$lambda$2(callback, (ApiException) obj);
            }
        }).success(new Function1() { // from class: gme
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalSportSettingRequest.getDeviceVersionInfo$lambda$4(callback, (LocalDeviceUpgradeModel.CheckUpgradeRequest) obj);
            }
        });
    }

    @NotNull
    public final Gson getGson() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }

    public final void updateFirmware(@NotNull String did, @NotNull final Function2<? super Boolean, ? super ApiException, Unit> result) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(result, "result");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C31641(did, null)).error(new Function1() { // from class: ame
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalSportSettingRequest.updateFirmware$lambda$0(result, (ApiException) obj);
            }
        }).success(new Function1() { // from class: cme
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalSportSettingRequest.updateFirmware$lambda$1(result, obj);
            }
        });
    }
}
