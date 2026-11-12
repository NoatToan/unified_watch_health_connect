package com.xiaomi.fit.device.bind;

import com.xiaomi.fit.device.DeviceFactory;
import com.xiaomi.fit.device.bind.WearOSDeviceBinder;
import com.xiaomi.fit.device.extensions.DeviceExtKt;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.model.api.DeviceBinder;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.wearos.export.WearOSApi;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import defpackage.kj2;
import defpackage.qa6;
import defpackage.z2h;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010!J1\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010\rJ\u0010\u0010#\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/device/bind/WearOSDeviceBinder;", "Lcom/xiaomi/fit/device/bind/BaseDeviceBinder;", "Lqa6;", "deviceModel", "", "switchDevice", "(Lqa6;)V", "", "model", "did", "mac", "sn", "updateDevice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "currentName", "recreateDeviceName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "updateDeviceProduct", "(Ljava/lang/String;)V", "", "result", "", "unbindSuccess", "(I)Z", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "isUploaded", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "from", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "bind", "(ILcom/xiaomi/fitness/device/manager/a;)V", "checkLogin", "()Z", "onBindSuccess", "unbind", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fitness/wearos/export/WearOSApi;", "wearOSApi", "Lcom/xiaomi/fitness/wearos/export/WearOSApi;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "deviceInfo", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWearOSDeviceBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearOSDeviceBinder.kt\ncom/xiaomi/fit/device/bind/WearOSDeviceBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1863#2,2:197\n*S KotlinDebug\n*F\n+ 1 WearOSDeviceBinder.kt\ncom/xiaomi/fit/device/bind/WearOSDeviceBinder\n*L\n114#1:197,2\n*E\n"})
public final class WearOSDeviceBinder extends BaseDeviceBinder {

    @NotNull
    private final WearOSApi wearOSApi;

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.WearOSDeviceBinder$unbind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.WearOSDeviceBinder", f = "WearOSDeviceBinder.kt", i = {0, 0, 1, 1, 2, 2}, l = {164, 172, SportReportBaseParser.ReportType.entryTime}, m = "unbind", n = {"this", "result", "this", "deviceModel", "this", "result"}, s = {"L$0", "I$0", "L$0", "L$1", "L$0", "I$0"})
    public static final class C15131 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C15131(Continuation<? super C15131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WearOSDeviceBinder.this.unbind(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearOSDeviceBinder(@NotNull WearableDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.wearOSApi = WearOsExtKt.getInstance(WearOSUtil.INSTANCE).getWearOSApi(DeviceModelExtKt.convert(getMDeviceInfo()));
        Logger.i(getTAG(), "nodeId: " + getMDeviceInfo().getNodeID() + ", mac: " + getMDeviceInfo().getMac());
    }

    private final boolean isUploaded(WearableDeviceModel deviceModel) {
        WearableDeviceInfo deviceInfo;
        WearableDevice wearableDevice;
        return (deviceModel == null || (deviceInfo = deviceModel.getDeviceInfo()) == null || (wearableDevice = (WearableDevice) deviceInfo.device) == null || wearableDevice.getUploaded() != 1) ? false : true;
    }

    private final String recreateDeviceName(String currentName, String model, String did) {
        List<qa6> allDeviceModels = getMDeviceManager().getAllDeviceModels();
        HashMap map = new HashMap();
        for (qa6 qa6Var : allDeviceModels) {
            if (Intrinsics.areEqual(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(qa6Var), model)) {
                if (Intrinsics.areEqual(qa6Var.getDid(), did)) {
                    return com.xiaomi.fitness.device.manager.DeviceModelExtKt.getName(qa6Var);
                }
                map.put(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getName(qa6Var), Unit.INSTANCE);
            }
        }
        String str = currentName;
        for (int i = 2; i < 101 && map.containsKey(str); i++) {
            str = currentName + " " + i;
        }
        return str;
    }

    private final void switchDevice(qa6 deviceModel) {
        if (deviceModel != null) {
            if (deviceModel.getIsCurrent()) {
                deviceModel.setReAdded(false);
            }
            getMDeviceManager().switchDevice(deviceModel);
        }
    }

    private final boolean unbindSuccess(int result) {
        return result == 0 || result == -1 || result == -7;
    }

    private final void updateDevice(String model, String did, String mac, String sn) {
        WearableDevice wearableDevice = (WearableDevice) getMDeviceInfo().device;
        if (wearableDevice != null) {
            wearableDevice.setDid(did);
            wearableDevice.setIdentifier(did);
            wearableDevice.setModel(model);
            wearableDevice.setName(recreateDeviceName(getMDeviceInfo().getName(), model, did));
            Logger.d(getTAG(), "updateDevice() called " + wearableDevice.getName());
            wearableDevice.setStatus(1);
            wearableDevice.setUploaded(AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() ? 1 : 0);
            Device.Detail detail = new Device.Detail(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            detail.setSn(sn);
            detail.setMac(mac);
            detail.setNodeId(getMDeviceInfo().getNodeID());
            detail.setThirdNodeId(getMDeviceInfo().getNodeID());
            wearableDevice.setDetail(detail);
        }
    }

    private final void updateDeviceProduct(final String model) {
        String model2 = getMDeviceInfo().getModel();
        DeviceModelExtKt.logi(getTAG(), "updateProductIfNeed() called with: model = " + model + ", preModel = " + model2);
        if (Intrinsics.areEqual(model, model2)) {
            return;
        }
        WearableProduct wearableProduct = (WearableProduct) DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).findProduct(new Function1() { // from class: p7r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(WearOSDeviceBinder.updateDeviceProduct$lambda$6(model, (WearableProduct) obj));
            }
        });
        Logger.i(getTAG(), "updateProductIfNeed: product " + wearableProduct);
        if (wearableProduct == null) {
            DeviceModelExtKt.logi("product is null");
            return;
        }
        getMDeviceInfo().setProduct(wearableProduct);
        WearableDevice wearableDevice = (WearableDevice) getMDeviceInfo().device;
        if (wearableDevice != null) {
            String productName = wearableProduct.getProductName();
            if (productName == null) {
                productName = "";
            }
            wearableDevice.setName(productName);
            wearableDevice.setProductId(wearableProduct.getProductId());
            wearableDevice.setModel(wearableProduct.getModel());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateDeviceProduct$lambda$6(String model, WearableProduct it) {
        Intrinsics.checkNotNullParameter(model, "$model");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getModel(), model);
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    public void bind(int from, @Nullable final com.xiaomi.fitness.device.manager.a callback) {
        super.bind(from, callback);
        this.wearOSApi.bindDevice(new kj2() { // from class: com.xiaomi.fit.device.bind.WearOSDeviceBinder.bind.1
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
                WearOSDeviceBinder wearOSDeviceBinder = this;
                if (message == null) {
                    message = "";
                }
                wearOSDeviceBinder.onBindFailure(code, message);
            }

            @Override // defpackage.kj2
            public void onBindSuccess(String model, String did, String mac, String sn) {
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(did, "did");
                Intrinsics.checkNotNullParameter(mac, "mac");
                try {
                    com.xiaomi.fitness.device.manager.a aVar = callback;
                    if (aVar != null) {
                        aVar.onBindSuccess(did);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.setBindSuccess(true);
                WearOSDeviceBinder wearOSDeviceBinder = this;
                if (sn == null) {
                    sn = "";
                }
                wearOSDeviceBinder.onBindSuccess(model, did, mac, sn);
            }

            @Override // defpackage.o43
            public /* bridge */ /* synthetic */ void onBondFailure(int i) {
                super.onBondFailure(i);
            }

            @Override // defpackage.o43
            public /* bridge */ /* synthetic */ void onBondSuccess() {
                super.onBondSuccess();
            }

            @Override // defpackage.zd4
            public /* bridge */ /* synthetic */ void onConnectFailure(int i, String str) {
                super.onConnectFailure(i, str);
            }

            @Override // defpackage.zd4
            public /* bridge */ /* synthetic */ void onConnectSuccess() {
                super.onConnectSuccess();
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

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder
    public boolean checkLogin() {
        return false;
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.kj2
    public void onBindSuccess(@NotNull String model, @NotNull String did, @NotNull String mac, @Nullable String sn) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(getTAG(), "onBindSuccess() called with: nodeId = " + getMDeviceInfo());
        String mac2 = getMDeviceInfo().getMac();
        if (mac2 != null) {
            DeviceBinder deviceBinderRemoveDeviceBinder = DeviceFactory.INSTANCE.removeDeviceBinder(mac2);
            Logger.i(getTAG(), "onBindSuccess() called with: removed = " + deviceBinderRemoveDeviceBinder);
        }
        updateDeviceProduct(model);
        updateDevice(model, did, mac, sn);
        Logger.i(getTAG(), "onBindSuccess() called with: nodeId = " + getMDeviceInfo());
        getMDeviceManager().addDeviceLocal(getMDeviceInfo());
        this.wearOSApi.onUpdate(DeviceModelExtKt.convert(getMDeviceInfo()));
        qa6 deviceModelByMac = getDeviceModelByMac(mac);
        if (deviceModelByMac != null) {
            deviceModelByMac.onBindSuccess(false);
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                reportBindSuccess();
            }
        }
        switchDevice(deviceModelByMac);
        getMDeviceManager().notifyDeviceBind(getMDid(), false);
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

    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    @Nullable
    public Object unbind(@NotNull Continuation<? super Integer> continuation) throws ApiException {
        C15131 c15131;
        WearableDeviceModel wearableDeviceModel;
        int errorCode;
        WearOSDeviceBinder wearOSDeviceBinder;
        WearOSDeviceBinder wearOSDeviceBinder2;
        int i;
        if (continuation instanceof C15131) {
            c15131 = (C15131) continuation;
            int i2 = c15131.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c15131.label = i2 - Integer.MIN_VALUE;
            } else {
                c15131 = new C15131(continuation);
            }
        } else {
            c15131 = new C15131(continuation);
        }
        Object objUnbind = c15131.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c15131.label;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    wearableDeviceModel = (WearableDeviceModel) c15131.L$1;
                    wearOSDeviceBinder = (WearOSDeviceBinder) c15131.L$0;
                    try {
                        ResultKt.throwOnFailure(objUnbind);
                    } catch (ApiException e) {
                        e = e;
                        if (e.getErrorCode() == -7) {
                            throw e;
                        }
                        errorCode = e.getErrorCode();
                    }
                } else if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            i = c15131.I$0;
            wearOSDeviceBinder2 = (WearOSDeviceBinder) c15131.L$0;
            ResultKt.throwOnFailure(objUnbind);
            errorCode = i;
            DeviceModelExtKt.logi("unbind() called " + errorCode);
            if (wearOSDeviceBinder2.unbindSuccess(errorCode)) {
                errorCode = -3;
            }
            return Boxing.boxInt(errorCode);
        }
        ResultKt.throwOnFailure(objUnbind);
        wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(getMDeviceInfo().getDid());
        Boolean boolBoxBoolean = wearableDeviceModel != null ? Boxing.boxBoolean(DeviceExtKt.isPhoneSwitching(wearableDeviceModel)) : null;
        errorCode = 0;
        if (isUploaded(wearableDeviceModel)) {
            DeviceModelExtKt.logi("unbind() called uploaded = true, phoneSwitching = " + boolBoxBoolean);
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                try {
                    if (!Intrinsics.areEqual(boolBoxBoolean, Boxing.boxBoolean(true))) {
                        c15131.L$0 = this;
                        c15131.L$1 = wearableDeviceModel;
                        c15131.label = 2;
                        objUnbind = super.unbind(c15131);
                        if (objUnbind == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        wearOSDeviceBinder = this;
                    }
                } catch (ApiException e2) {
                    e = e2;
                    wearOSDeviceBinder = this;
                    if (e.getErrorCode() == -7) {
                        throw e;
                    }
                    errorCode = e.getErrorCode();
                }
            }
            wearOSDeviceBinder = this;
            if (wearOSDeviceBinder.unbindSuccess(errorCode) || wearableDeviceModel == null) {
                wearOSDeviceBinder2 = wearOSDeviceBinder;
            } else {
                c15131.L$0 = wearOSDeviceBinder;
                c15131.L$1 = null;
                c15131.I$0 = errorCode;
                c15131.label = 3;
                if (DeviceExtKt.unpairWatch(wearableDeviceModel, c15131) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wearOSDeviceBinder2 = wearOSDeviceBinder;
                i = errorCode;
                errorCode = i;
            }
        } else {
            DeviceModelExtKt.logi("unbind() called uploaded = false, phoneSwitching = " + boolBoxBoolean);
            if (wearableDeviceModel != null) {
                c15131.L$0 = this;
                c15131.I$0 = 0;
                c15131.label = 1;
                if (DeviceExtKt.unpairWatch(wearableDeviceModel, c15131) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wearOSDeviceBinder2 = this;
                i = errorCode;
                errorCode = i;
            } else {
                wearOSDeviceBinder2 = this;
            }
        }
        DeviceModelExtKt.logi("unbind() called " + errorCode);
        if (wearOSDeviceBinder2.unbindSuccess(errorCode)) {
            errorCode = -3;
        }
        return Boxing.boxInt(errorCode);
        errorCode = ((Number) objUnbind).intValue();
        if (wearOSDeviceBinder.unbindSuccess(errorCode)) {
        }
        wearOSDeviceBinder2 = wearOSDeviceBinder;
        DeviceModelExtKt.logi("unbind() called " + errorCode);
        if (wearOSDeviceBinder2.unbindSuccess(errorCode)) {
            errorCode = -3;
        }
        return Boxing.boxInt(errorCode);
    }
}
