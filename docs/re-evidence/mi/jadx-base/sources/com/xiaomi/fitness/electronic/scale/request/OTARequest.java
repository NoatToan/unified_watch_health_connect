package com.xiaomi.fitness.electronic.scale.request;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.gson.Gson;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.electronic.scale.OTAActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.model.DeviceVersionInfo;
import com.xiaomi.fitness.electronic.scale.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.electronic.scale.model.UpgradeInfo;
import com.xiaomi.fitness.electronic.scale.request.OTARequest;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import defpackage.av6;
import defpackage.f4b;
import defpackage.zzi;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J*\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\f0\u0011J$\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\f0\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/request/OTARequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/electronic/scale/request/OTAService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "checkGson", "", "updateFirmware", "did", "", "result", "Lkotlin/Function2;", "", "Lcom/xiaomi/fitness/net/response/ApiException;", "getDeviceVersionInfo", "callback", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/model/DeviceVersionInfo;", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOTARequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTARequest.kt\ncom/xiaomi/fitness/electronic/scale/request/OTARequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,154:1\n89#2,5:155\n89#2,5:160\n*S KotlinDebug\n*F\n+ 1 OTARequest.kt\ncom/xiaomi/fitness/electronic/scale/request/OTARequest\n*L\n48#1:155,5\n62#1:160,5\n*E\n"})
public final class OTARequest extends BaseRequest<OTAService> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public Gson gson;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ(\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J,\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/request/OTARequest$Companion;", "", "<init>", "()V", "checkOTAInfo", "", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "did", "", Column.BATTERY, "", "deviceVersion", "showOTADialog", "description", "addPolicyDialogCallback", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void addPolicyDialogCallback(final BaseActivity context, final String did, final int battery, CommonDialog<?> dialog) {
            dialog.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.request.OTARequest$Companion$addPolicyDialogCallback$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog2, int which) {
                    if (dialog2 != null) {
                        dialog2.dismiss();
                    }
                    if (which != -1) {
                        return;
                    }
                    Intent intent = new Intent(context, (Class<?>) OTAActivity.class);
                    intent.putExtra("did", did);
                    intent.putExtra(ElectronicScaleManagerExtKt.PARAM_BATTERY, battery);
                    context.startActivity(intent);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit checkOTAInfo$lambda$0(BaseActivity context, String did, int i, DeviceVersionInfo deviceVersionInfo) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(did, "$did");
            LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest = (LocalDeviceUpgradeModel.CheckUpgradeRequest) (deviceVersionInfo != null ? deviceVersionInfo.getVersionInfo() : null);
            if (checkUpgradeRequest == null || !checkUpgradeRequest.needUpgrade()) {
                return Unit.INSTANCE;
            }
            Companion companion = OTARequest.INSTANCE;
            String description = checkUpgradeRequest.description;
            Intrinsics.checkNotNullExpressionValue(description, "description");
            companion.showOTADialog(context, did, description, i);
            return Unit.INSTANCE;
        }

        private final void showOTADialog(BaseActivity context, String did, String description, int battery) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("showOTADialog").setDialogTitle(zzi.o).setPositiveText(zzi.n).setNegativeText(zzi.f41831b).setDialogDescriptionString(new DialogParams.DialogDescriptionString(description)).create();
            Intrinsics.checkNotNull(commonDialogCreate);
            addPolicyDialogCallback(context, did, battery, commonDialogCreate);
            commonDialogCreate.showIfNeed(context.getSupportFragmentManager());
        }

        public final void checkOTAInfo(@NotNull final BaseActivity context, @NotNull final String did, final int battery, @NotNull String deviceVersion) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(deviceVersion, "deviceVersion");
            new OTARequest().getDeviceVersionInfo(did, new Function1() { // from class: o3h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return OTARequest.Companion.checkOTAInfo$lambda$0(context, did, battery, (DeviceVersionInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.request.OTARequest$getDeviceVersionInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/electronic/scale/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "it", "Lcom/xiaomi/fitness/electronic/scale/request/OTAService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.request.OTARequest$getDeviceVersionInfo$1", f = "OTARequest.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<OTAService, Continuation<? super BaseResult<LocalDeviceUpgradeModel.CheckUpgradeRequest>>, Object> {
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
            AnonymousClass1 anonymousClass1 = OTARequest.this.new AnonymousClass1(this.$did, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OTAService oTAService, Continuation<? super BaseResult<LocalDeviceUpgradeModel.CheckUpgradeRequest>> continuation) {
            return ((AnonymousClass1) create(oTAService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OTAService oTAService = (OTAService) this.L$0;
                UpgradeInfo upgradeInfo = new UpgradeInfo();
                upgradeInfo.did = this.$did;
                String json = OTARequest.this.getGson().toJson(upgradeInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                String currentLocale = LocaleUtil.getCurrentLocale();
                this.label = 1;
                obj = oTAService.checkLocalDeviceVersion(json, currentLocale, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.request.OTARequest$updateFirmware$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "", "it", "Lcom/xiaomi/fitness/electronic/scale/request/OTAService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.request.OTARequest$updateFirmware$1", f = "OTARequest.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23831 extends SuspendLambda implements Function2<OTAService, Continuation<? super BaseResult<Object>>, Object> {
        final /* synthetic */ String $did;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23831(String str, Continuation<? super C23831> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C23831 c23831 = OTARequest.this.new C23831(this.$did, continuation);
            c23831.L$0 = obj;
            return c23831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OTAService oTAService, Continuation<? super BaseResult<Object>> continuation) {
            return ((C23831) create(oTAService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OTAService oTAService = (OTAService) this.L$0;
                UpgradeInfo upgradeInfo = new UpgradeInfo();
                upgradeInfo.did = this.$did;
                String json = OTARequest.this.getGson().toJson(upgradeInfo);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = oTAService.upgradeLocalDevice(json, this);
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

    private final void checkGson() {
        if (this.gson == null) {
            setGson(new Gson());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeviceVersionInfo$lambda$2(Function1 callback, ApiException it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e("getDeviceVersionInfo error", it);
        callback.invoke2(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeviceVersionInfo$lambda$4(Function1 callback, LocalDeviceUpgradeModel.CheckUpgradeRequest request) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(request, "request");
        Logger.i("getDeviceVersionInfo success " + f4b.c(request), new Object[0]);
        DeviceVersionInfo deviceVersionInfo = new DeviceVersionInfo();
        deviceVersionInfo.setCode(0);
        deviceVersionInfo.setVersionInfo(request);
        deviceVersionInfo.setNeedUpdate(!request.isLatest);
        callback.invoke2(deviceVersionInfo);
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
        checkGson();
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(did, null)).error(new Function1() { // from class: k3h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OTARequest.getDeviceVersionInfo$lambda$2(callback, (ApiException) obj);
            }
        }).success(new Function1() { // from class: l3h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OTARequest.getDeviceVersionInfo$lambda$4(callback, (LocalDeviceUpgradeModel.CheckUpgradeRequest) obj);
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
        checkGson();
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C23831(did, null)).error(new Function1() { // from class: m3h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OTARequest.updateFirmware$lambda$0(result, (ApiException) obj);
            }
        }).success(new Function1() { // from class: n3h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OTARequest.updateFirmware$lambda$1(result, obj);
            }
        });
    }
}
