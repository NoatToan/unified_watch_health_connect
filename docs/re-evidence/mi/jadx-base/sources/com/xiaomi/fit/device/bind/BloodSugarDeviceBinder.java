package com.xiaomi.fit.device.bind;

import android.os.RemoteException;
import com.xiaomi.fit.device.DeviceFactory;
import com.xiaomi.fit.device.bind.BloodSugarDeviceBinder;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.blood_sugar.IBloodSugarDevice;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.api.ThirdPartyDeviceRequest;
import com.xiaomi.fitness.device.manager.api.model.BindThirdParty;
import com.xiaomi.fitness.device.manager.api.model.DeviceRecordInfo;
import com.xiaomi.fitness.device.manager.b;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.model.api.DeviceBinder;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.wearable.wear.api.UnbindCallback;
import defpackage.kj2;
import defpackage.qa6;
import defpackage.z2h;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b.\u0010/J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u0019\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u000fR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010+¨\u00060"}, d2 = {"Lcom/xiaomi/fit/device/bind/BloodSugarDeviceBinder;", "Lcom/xiaomi/fit/device/bind/BaseDeviceBinder;", "", "convertedUserId", "bindToken", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "", "login", "(Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/a;)V", "bindDevice", "(Lcom/xiaomi/fitness/device/manager/a;)V", "mac", "onBindSuccessInternal", "(Ljava/lang/String;)V", "()V", "", "from", "bind", "(ILcom/xiaomi/fitness/device/manager/a;)V", "model", "did", "sn", "onBindSuccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "unbind", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "syncData", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", BroadcastsKt.SILENT_PUSHING_CANCEL, "Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice;", "thirdPartyApi", "Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice;", "Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceRequest;", "request$delegate", "Lkotlin/Lazy;", "getRequest", "()Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceRequest;", "request", "Lcom/xiaomi/fitness/device/manager/api/model/BindThirdParty;", "thirdPartyInfo", "Lcom/xiaomi/fitness/device/manager/api/model/BindThirdParty;", "Lcom/xiaomi/fitness/device/manager/a;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "deviceInfo", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;Lcom/xiaomi/fitness/blood_sugar/IBloodSugarDevice;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodSugarDeviceBinder extends BaseDeviceBinder {

    @Nullable
    private com.xiaomi.fitness.device.manager.a callback;

    /* JADX INFO: renamed from: request$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy request;

    @NotNull
    private final IBloodSugarDevice thirdPartyApi;
    private BindThirdParty thirdPartyInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodSugarDeviceBinder(@NotNull WearableDeviceInfo deviceInfo, @NotNull IBloodSugarDevice thirdPartyApi) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(thirdPartyApi, "thirdPartyApi");
        this.thirdPartyApi = thirdPartyApi;
        this.request = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: k13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BloodSugarDeviceBinder.request_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(BloodSugarDeviceBinder this$0, com.xiaomi.fitness.device.manager.a aVar, BindThirdParty it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.thirdPartyInfo = it;
        if (this$0.thirdPartyApi.isLogin()) {
            this$0.bindDevice(aVar);
        } else {
            this$0.login(it.getConvertedUserId(), it.getBindToken(), aVar);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(com.xiaomi.fitness.device.manager.a aVar, ApiException it) throws RemoteException {
        Intrinsics.checkNotNullParameter(it, "it");
        DeviceModelExtKt.logi("ThirdPartyDeviceBinder bind error " + it);
        it.printStackTrace();
        if (aVar != null) {
            aVar.onBindFailure(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindDevice(final com.xiaomi.fitness.device.manager.a callback) {
        Logger.i(getTAG(), "bindDevice: " + getMDeviceInfo().getMac() + ", bind server " + getMDeviceInfo().getBindServer());
        if (getMDeviceInfo().getBindServer()) {
            String model = getMDeviceInfo().getModel();
            String mac = getMDeviceInfo().getMac();
            Intrinsics.checkNotNull(mac);
            onBindSuccess(model, "", mac, "");
            return;
        }
        IBloodSugarDevice iBloodSugarDevice = this.thirdPartyApi;
        String mac2 = getMDeviceInfo().getMac();
        Intrinsics.checkNotNull(mac2);
        iBloodSugarDevice.bindDevice(mac2, new kj2() { // from class: com.xiaomi.fit.device.bind.BloodSugarDeviceBinder.bindDevice.1
            @Override // defpackage.oyc
            public /* bridge */ /* synthetic */ void dismissButtonConfirmDialog() {
                super.dismissButtonConfirmDialog();
            }

            @Override // defpackage.t9h
            public /* bridge */ /* synthetic */ void dismissOOB() {
                super.dismissOOB();
            }

            @Override // defpackage.kj2
            public void onBindFailure(int code, String message) {
                try {
                    com.xiaomi.fitness.device.manager.a aVar = callback;
                    if (aVar != null) {
                        aVar.onBindFailure(code);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.kj2
            public void onBindSuccess(String model2, String did, String mac3, String sn) {
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(did, "did");
                Intrinsics.checkNotNullParameter(mac3, "mac");
                DeviceModelExtKt.logi("device binder bind success, model:" + model2 + ">>did:" + did + ">>mac:" + mac3 + ">>" + sn);
                try {
                    com.xiaomi.fitness.device.manager.a aVar = callback;
                    if (aVar != null) {
                        aVar.onBindSuccess(this.getMDid());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                BloodSugarDeviceBinder bloodSugarDeviceBinder = this;
                if (sn == null) {
                    sn = "";
                }
                bloodSugarDeviceBinder.onBindSuccess(model2, did, mac3, sn);
            }

            @Override // defpackage.o43
            public void onBondFailure(int status) {
                try {
                    com.xiaomi.fitness.device.manager.a aVar = callback;
                    if (aVar != null) {
                        aVar.onBindFailure(status);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.o43
            public void onBondSuccess() {
                DeviceModelExtKt.logi("device binder bond success");
                try {
                    com.xiaomi.fitness.device.manager.a aVar = callback;
                    if (aVar != null) {
                        aVar.onPairingSuccess(null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.zd4
            public void onConnectFailure(int status, String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                DeviceModelExtKt.logi("device binder connect failure");
                try {
                    com.xiaomi.fitness.device.manager.a aVar = callback;
                    if (aVar != null) {
                        aVar.onConnectFailure(status);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.zd4
            public void onConnectSuccess() {
                DeviceModelExtKt.logi("device binder connect success");
                try {
                    com.xiaomi.fitness.device.manager.a aVar = callback;
                    if (aVar != null) {
                        aVar.onConnectSuccess();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // defpackage.zd4
            public /* bridge */ /* synthetic */ void onDisconnect() {
                super.onDisconnect();
            }

            @Override // defpackage.vie
            public /* bridge */ /* synthetic */ void onLocalBindSuccess(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
                super.onLocalBindSuccess(str, str2, str3, str4, str5, bArr);
            }

            @Override // defpackage.o43
            public /* bridge */ /* synthetic */ void onRemoveFailure(int i) {
                super.onRemoveFailure(i);
            }

            @Override // defpackage.o43
            public /* bridge */ /* synthetic */ void onRemoveSuccess() {
                super.onRemoveSuccess();
            }

            @Override // defpackage.oyc
            public /* bridge */ /* synthetic */ void showButtonConfirmDialog() {
                super.showButtonConfirmDialog();
            }

            @Override // defpackage.t9h
            public /* bridge */ /* synthetic */ void showOOB(String str, z2h z2hVar) {
                super.showOOB(str, z2hVar);
            }
        });
    }

    private final void login(String convertedUserId, String bindToken, final com.xiaomi.fitness.device.manager.a callback) {
        Logger.i(getTAG(), "login() called with: convertedUserId = " + convertedUserId + ", bindToken = " + bindToken);
        this.thirdPartyApi.login(convertedUserId, bindToken, new IBloodSugarDevice.LoginCallback() { // from class: com.xiaomi.fit.device.bind.BloodSugarDeviceBinder.login.1
            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice.LoginCallback
            public void onLoginFail() {
                Logger.i(BloodSugarDeviceBinder.this.getTAG(), "onLoginFail() called");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice.LoginCallback
            public void onLoginSuccess() {
                Logger.i(BloodSugarDeviceBinder.this.getTAG(), "onLoginSuccess() called");
                BloodSugarDeviceBinder.this.bindDevice(callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit login$lambda$6(final BloodSugarDeviceBinder this$0, BindThirdParty it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.thirdPartyInfo = it;
        this$0.thirdPartyApi.login(it.getConvertedUserId(), it.getBindToken(), new IBloodSugarDevice.LoginCallback() { // from class: com.xiaomi.fit.device.bind.BloodSugarDeviceBinder$login$2$1
            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice.LoginCallback
            public void onLoginFail() {
                Logger.i(this.this$0.getTAG(), "onLoginFail() called");
            }

            @Override // com.xiaomi.fitness.blood_sugar.IBloodSugarDevice.LoginCallback
            public void onLoginSuccess() {
                Logger.i(this.this$0.getTAG(), "onLoginSuccess() called");
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit login$lambda$7(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindSuccess$lambda$3(BloodSugarDeviceBinder this$0, String mac, DeviceRecordInfo it) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "onBindSuccess: " + it);
        this$0.onBindSuccessInternal(mac);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindSuccess$lambda$4(BloodSugarDeviceBinder this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "onBindSuccess remote error: " + it);
        return Unit.INSTANCE;
    }

    private final void onBindSuccessInternal(final String mac) throws RemoteException {
        DeviceBinder deviceBinderRemoveDeviceBinder = DeviceFactory.INSTANCE.removeDeviceBinder(mac);
        Logger.i(getTAG(), "onBindSuccessInternal() remove result = " + deviceBinderRemoveDeviceBinder);
        qa6 deviceModelByMac = getDeviceModelByMac(mac);
        if (deviceModelByMac != null) {
            deviceModelByMac.onBindSuccess(false);
        }
        getMDeviceManager().requestDeviceList(new b.a() { // from class: com.xiaomi.fit.device.bind.BloodSugarDeviceBinder.onBindSuccessInternal.1
            @Override // com.xiaomi.fitness.device.manager.b
            public void onFail(String cause, int code) {
                DeviceModelExtKt.logi("requestDeviceList with exception " + cause);
            }

            @Override // com.xiaomi.fitness.device.manager.b
            public void onSuccess() {
                if (BloodSugarDeviceBinder.this.getDeviceModelByMac(mac) != null) {
                    BloodSugarDeviceBinder.this.reportBindSuccess();
                }
                BloodSugarDeviceBinder.this.getMDeviceManager().notifyDeviceBind(BloodSugarDeviceBinder.this.getMDid(), false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThirdPartyDeviceRequest request_delegate$lambda$0() {
        return new ThirdPartyDeviceRequest();
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    public void bind(int from, @Nullable final com.xiaomi.fitness.device.manager.a callback) {
        this.callback = callback;
        getRequest().getBindKey(this.thirdPartyApi.getAppId(), new Function1() { // from class: l13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodSugarDeviceBinder.bind$lambda$1(this.f24498a, callback, (BindThirdParty) obj);
            }
        }, new Function1() { // from class: m13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodSugarDeviceBinder.bind$lambda$2(callback, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    public void cancel() {
        super.cancel();
    }

    @NotNull
    public final ThirdPartyDeviceRequest getRequest() {
        return (ThirdPartyDeviceRequest) this.request.getValue();
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.kj2
    public void onBindSuccess(@NotNull String model, @NotNull String did, @NotNull final String mac, @Nullable String sn) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        String sn2 = this.thirdPartyApi.getBindDeviceInfo().getSn();
        ThirdPartyDeviceRequest request = getRequest();
        String appId = this.thirdPartyApi.getAppId();
        String model2 = getMDeviceInfo().getModel();
        String name = getMDeviceInfo().getName();
        BindThirdParty bindThirdParty = this.thirdPartyInfo;
        if (bindThirdParty == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdPartyInfo");
            bindThirdParty = null;
        }
        request.thirdPartyBind(sn2, appId, model2, name, mac, sn2, bindThirdParty.getConvertedUserId(), this.thirdPartyApi.getThirdPartyToken(), this.thirdPartyApi.getVerifyName(), new Function1() { // from class: n13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodSugarDeviceBinder.onBindSuccess$lambda$3(this.f27430a, mac, (DeviceRecordInfo) obj);
            }
        }, new Function1() { // from class: o13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodSugarDeviceBinder.onBindSuccess$lambda$4(this.f28635a, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.zd4
    public /* bridge */ /* synthetic */ void onDisconnect() {
        super.onDisconnect();
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.o43
    public /* bridge */ /* synthetic */ void onRemoveFailure(int i) {
        super.onRemoveFailure(i);
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.o43
    public /* bridge */ /* synthetic */ void onRemoveSuccess() {
        super.onRemoveSuccess();
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    @Nullable
    public Object unbind(@NotNull Continuation<? super Integer> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        IBloodSugarDevice iBloodSugarDevice = this.thirdPartyApi;
        String mac = getMDeviceInfo().getMac();
        Intrinsics.checkNotNull(mac);
        iBloodSugarDevice.unbindDevice(mac, new UnbindCallback() { // from class: com.xiaomi.fit.device.bind.BloodSugarDeviceBinder$unbind$2$1
            @Override // com.xiaomi.wearable.wear.api.UnbindCallback
            public void onFail(int errorCode) {
                Logger.i(this.this$0.getTAG(), "onFail() called with: errorCode = " + errorCode);
                if (errorCode == -4) {
                    Logger.i(this.this$0.getTAG(), "token invalid ,start login");
                    this.this$0.login();
                } else {
                    safeContinuation.resumeWith(Result.m886constructorimpl(Integer.valueOf(errorCode)));
                }
            }

            @Override // com.xiaomi.wearable.wear.api.UnbindCallback
            public void onSuccess() {
                Logger.i(this.this$0.getTAG(), "onSuccess() called");
                NetCoroutineScope netCoroutineScopeScopeNet$default = ScopeExtKt.scopeNet$default(null, new BloodSugarDeviceBinder$unbind$2$1$onSuccess$1(this.this$0, safeContinuation, null), 1, null);
                final BloodSugarDeviceBinder bloodSugarDeviceBinder = this.this$0;
                netCoroutineScopeScopeNet$default.m503catch(new Function2<AndroidScope, Throwable, Unit>() { // from class: com.xiaomi.fit.device.bind.BloodSugarDeviceBinder$unbind$2$1$onSuccess$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(AndroidScope androidScope, Throwable th) {
                        invoke2(androidScope, th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AndroidScope androidScope, Throwable it) {
                        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
                        Intrinsics.checkNotNullParameter(it, "it");
                        Logger.i(bloodSugarDeviceBinder.getTAG(), "unbindDevice() called with: " + it);
                    }
                });
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Nullable
    public final Object unbind(boolean z, @NotNull Continuation<? super Integer> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        IBloodSugarDevice iBloodSugarDevice = this.thirdPartyApi;
        String mac = getMDeviceInfo().getMac();
        Intrinsics.checkNotNull(mac);
        iBloodSugarDevice.unbindDevice(mac, new UnbindCallback() { // from class: com.xiaomi.fit.device.bind.BloodSugarDeviceBinder$unbind$4$1
            @Override // com.xiaomi.wearable.wear.api.UnbindCallback
            public void onFail(int errorCode) {
                Logger.i(this.this$0.getTAG(), "onFail() called with: errorCode = " + errorCode);
                if (errorCode == -4) {
                    Logger.i(this.this$0.getTAG(), "token invalid ,start login");
                    this.this$0.login();
                } else {
                    safeContinuation.resumeWith(Result.m886constructorimpl(Integer.valueOf(errorCode)));
                }
            }

            @Override // com.xiaomi.wearable.wear.api.UnbindCallback
            public void onSuccess() {
                Logger.i(this.this$0.getTAG(), "onSuccess() called");
                NetCoroutineScope netCoroutineScopeScopeNet$default = ScopeExtKt.scopeNet$default(null, new BloodSugarDeviceBinder$unbind$4$1$onSuccess$1(this.this$0, safeContinuation, null), 1, null);
                final BloodSugarDeviceBinder bloodSugarDeviceBinder = this.this$0;
                netCoroutineScopeScopeNet$default.m503catch(new Function2<AndroidScope, Throwable, Unit>() { // from class: com.xiaomi.fit.device.bind.BloodSugarDeviceBinder$unbind$4$1$onSuccess$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(AndroidScope androidScope, Throwable th) {
                        invoke2(androidScope, th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AndroidScope androidScope, Throwable it) {
                        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
                        Intrinsics.checkNotNullParameter(it, "it");
                        Logger.i(bloodSugarDeviceBinder.getTAG(), "unbindDevice() called with: " + it);
                    }
                });
            }
        }, z);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void login() {
        getRequest().getBindKey(this.thirdPartyApi.getAppId(), new Function1() { // from class: i13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodSugarDeviceBinder.login$lambda$6(this.f20657a, (BindThirdParty) obj);
            }
        }, new Function1() { // from class: j13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodSugarDeviceBinder.login$lambda$7((ApiException) obj);
            }
        });
    }
}
