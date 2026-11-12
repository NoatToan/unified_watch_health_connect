package com.mi.fitness.checkupdate;

import android.content.Context;
import androidx.core.os.BundleKt;
import com.mi.fitness.checkupdate.UpdateHelper;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.model.OtaUpgradeRequest;
import com.mi.fitness.checkupdate.model.OtaUpgradeResult;
import com.mi.fitness.checkupdate.net.CheckUpdateRequest;
import com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeFragment;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.mi.fitness.checkupdate.util.CheckUpdateUtil;
import com.mi.fitness.checkupdate.util.Constants;
import com.mi.fitness.checkupdate.util.DeviceSender;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.devicesettings.export.LanguageUtil;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.LanguageSetting;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.dih;
import defpackage.eu6;
import defpackage.pb2;
import defpackage.yyi;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0012J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J@\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0012H\u0002J\u0018\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0013J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010&\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0001\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/mi/fitness/checkupdate/UpdateHelper;", "", "<init>", "()V", "TAG", "", "checkUpdateRequest", "Lcom/mi/fitness/checkupdate/net/CheckUpdateRequest;", "getCheckUpdateRequest", "()Lcom/mi/fitness/checkupdate/net/CheckUpdateRequest;", "checkUpdateRequest$delegate", "Lkotlin/Lazy;", "buildOtaRequest", "Lcom/mi/fitness/checkupdate/model/OtaUpgradeRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doUpdateRequest", "", "success", "Lkotlin/Function1;", "Ljava/io/Serializable;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "reportDeviceFirmwareVersion", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "firmwareVersion", "requestLatestVersion", "goUpgradeFragment", "context", "Landroid/content/Context;", "result", "checkUpdate", "", "getCheckUpdate", "()Z", "setCheckUpdate", "(Z)V", "doCheckUpdate", "showToast", "strId", "", "UpdateRequestPoint", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUpdateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateHelper.kt\ncom/mi/fitness/checkupdate/UpdateHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
public final class UpdateHelper {

    @NotNull
    public static final String TAG = "CheckUpdate";
    private static boolean checkUpdate;

    @NotNull
    public static final UpdateHelper INSTANCE = new UpdateHelper();

    /* JADX INFO: renamed from: checkUpdateRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy checkUpdateRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ybq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UpdateHelper.checkUpdateRequest_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/mi/fitness/checkupdate/UpdateHelper$UpdateRequestPoint;", "", "getCheckUpdateRequest", "Lcom/mi/fitness/checkupdate/net/CheckUpdateRequest;", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface UpdateRequestPoint {
        @NotNull
        CheckUpdateRequest getCheckUpdateRequest();
    }

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.UpdateHelper$buildOtaRequest$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.UpdateHelper", f = "UpdateHelper.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {82, 86}, m = "buildOtaRequest", n = {"deviceModel", "deviceInfo", "otaUpgradeRequest", "settingsIsNull", "deviceModel", "deviceInfo", "otaUpgradeRequest", "settingsIsNull"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
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
            return UpdateHelper.this.buildOtaRequest(this);
        }
    }

    private UpdateHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckUpdateRequest checkUpdateRequest_delegate$lambda$0() {
        return ((UpdateRequestPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), UpdateRequestPoint.class)).getCheckUpdateRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doCheckUpdate$lambda$8(Context context, Serializable result) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(result, "result");
        if ((result instanceof OtaUpgradeResult) || (result instanceof LatestVersion)) {
            INSTANCE.goUpgradeFragment(context, result);
        }
        checkUpdate = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doCheckUpdate$lambda$9(Context context, ApiException it) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.showToast(context, yyi.f40690k);
        checkUpdate = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doUpdateRequest$lambda$1(Function1 success, OtaUpgradeResult result) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(result, "result");
        Logger.i("CheckUpdate", "checkUpdate checkHMUpgrade success " + result);
        success.invoke2(result);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doUpdateRequest$lambda$2(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("CheckUpdate", "checkUpdate checkHMUpgrade failed " + it);
        error.invoke2(it);
        return Unit.INSTANCE;
    }

    private final CheckUpdateRequest getCheckUpdateRequest() {
        return (CheckUpdateRequest) checkUpdateRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportDeviceFirmwareVersion$lambda$3(pb2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("CheckUpdate", "reportDeviceFirmwareVersion: " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportDeviceFirmwareVersion$lambda$4(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("CheckUpdate", "reportDeviceFirmwareVersion: " + it.getMessage());
        it.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLatestVersion(final WearableDeviceModel deviceModel, final String firmwareVersion, final Function1<? super Serializable, Unit> success, final Function1<? super ApiException, Unit> error) {
        getCheckUpdateRequest().getLatestVersion(deviceModel.getDid(), DeviceModelExtKt.getModel(deviceModel), AppVersionUtil.INSTANCE.getAppVersionCode(), firmwareVersion, new Function1() { // from class: dcq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UpdateHelper.requestLatestVersion$lambda$6(deviceModel, firmwareVersion, success, (LatestVersion) obj);
            }
        }, new Function1() { // from class: ecq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UpdateHelper.requestLatestVersion$lambda$7(error, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLatestVersion$lambda$6(WearableDeviceModel deviceModel, String firmwareVersion, Function1 success, LatestVersion result) {
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        Intrinsics.checkNotNullParameter(firmwareVersion, "$firmwareVersion");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(result, "result");
        Logger.i("CheckUpdate", "checkUpdate getLatestVersion success " + result + ", currentVersion = " + DeviceModelExtKt.getFirmwareVersion(deviceModel));
        if (result.isValid()) {
            String version = result.getVersion();
            boolean z = CheckUpdateUtil.INSTANCE.compareFirmwareVersion2(version, firmwareVersion) > 0;
            boolean force = result.getForce();
            Logger.i("CheckUpdate", "requestLatestVersion: needUpgrade: " + z);
            CheckUpdatePreferenceSupport.INSTANCE.saveLatestFirmwareVersionFromNet(deviceModel.getDid(), version);
            if (z) {
                if (force && version != null) {
                    DeviceSender.INSTANCE.notifyForceUpgrade(version);
                }
                deviceModel.getDeviceInfo().updateFirmwareUpgradeTipTimestamp();
            }
            result.setNeedUpdate(z);
        }
        success.invoke2(result);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLatestVersion$lambda$7(Function1 error, ApiException exception) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Logger.i("CheckUpdate", "checkUpdate failed:" + exception);
        error.invoke2(exception);
        return Unit.INSTANCE;
    }

    private final void showToast(Context context, int strId) {
        if (context != null) {
            ToastExtKt.toastShort(context, strId);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object buildOtaRequest(@NotNull Continuation<? super OtaUpgradeRequest> continuation) {
        AnonymousClass1 anonymousClass1;
        WearableDeviceModel wearableDeviceModel;
        HuamiApiCaller huaMiApiCaller;
        DeviceInfoExt deviceInfo;
        OtaUpgradeRequest otaUpgradeRequest;
        String strReplace$default;
        WearableDeviceModel wearableDeviceModel2;
        int i;
        OtaUpgradeRequest otaUpgradeRequest2;
        String huaMiLanguageStrByTag;
        String strReplace$default2;
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
        Object defaultLang = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        String strReplace$default3 = null;
        if (i3 == 0) {
            ResultKt.throwOnFailure(defaultLang);
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel))) == null || (deviceInfo = huaMiApiCaller.getDeviceInfo()) == null) {
                return null;
            }
            otaUpgradeRequest = new OtaUpgradeRequest();
            otaUpgradeRequest.setAppName(Constants.HUAMI_OTA_APP_NAME);
            otaUpgradeRequest.setAppVersion(HuamiDevice.VERSION_NAME);
            int resourceFlag = deviceInfo.getResourceFlag();
            StringBuilder sb = new StringBuilder();
            sb.append(resourceFlag);
            otaUpgradeRequest.setResourceFlag(sb.toString());
            int resourceVersion = deviceInfo.getResourceVersion();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(resourceVersion);
            otaUpgradeRequest.setResourceVersion(sb2.toString());
            int pnpVersion = deviceInfo.getPnpVersion();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(pnpVersion);
            otaUpgradeRequest.setProductionSource(sb3.toString());
            if (deviceInfo.getHardwareVersion() == null) {
                strReplace$default = null;
            } else {
                String hardwareVersion = deviceInfo.getHardwareVersion();
                Intrinsics.checkNotNullExpressionValue(hardwareVersion, "getHardwareVersion(...)");
                strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(hardwareVersion, "V", "", false, 4, (Object) null), "v", "", false, 4, (Object) null);
            }
            otaUpgradeRequest.setHardwareVersion(strReplace$default);
            int fontVersion = deviceInfo.getFontVersion();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(fontVersion);
            otaUpgradeRequest.setFontVersion(sb4.toString());
            SettingItemEntity settingItemValue = DeviceSettingManager.INSTANCE.getInstance().readSettingItemValue(wearableDeviceModel.getDid(), "language");
            if (settingItemValue != null) {
                LanguageSetting languageSetting = (LanguageSetting) settingItemValue.valueToObject(LanguageSetting.class);
                if (languageSetting != null) {
                    huaMiLanguageStrByTag = LanguageUtil.INSTANCE.getHuaMiLanguageStrByTag(languageSetting.getDeviceLanguage());
                    i = 0;
                } else {
                    LanguageUtil languageUtil = LanguageUtil.INSTANCE;
                    anonymousClass1.L$0 = wearableDeviceModel;
                    anonymousClass1.L$1 = deviceInfo;
                    anonymousClass1.L$2 = otaUpgradeRequest;
                    anonymousClass1.I$0 = 1;
                    anonymousClass1.label = 1;
                    defaultLang = languageUtil.getDefaultLang(huaMiApiCaller, anonymousClass1);
                    if (defaultLang == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wearableDeviceModel2 = wearableDeviceModel;
                    i = 1;
                    otaUpgradeRequest2 = otaUpgradeRequest;
                    huaMiLanguageStrByTag = (String) defaultLang;
                    otaUpgradeRequest = otaUpgradeRequest2;
                    wearableDeviceModel = wearableDeviceModel2;
                }
            } else {
                LanguageUtil languageUtil2 = LanguageUtil.INSTANCE;
                anonymousClass1.L$0 = wearableDeviceModel;
                anonymousClass1.L$1 = deviceInfo;
                anonymousClass1.L$2 = otaUpgradeRequest;
                anonymousClass1.I$0 = 1;
                anonymousClass1.label = 2;
                defaultLang = languageUtil2.getDefaultLang(huaMiApiCaller, anonymousClass1);
                if (defaultLang == coroutine_suspended) {
                    return coroutine_suspended;
                }
                wearableDeviceModel2 = wearableDeviceModel;
                i = 1;
                otaUpgradeRequest2 = otaUpgradeRequest;
                huaMiLanguageStrByTag = (String) defaultLang;
                otaUpgradeRequest = otaUpgradeRequest2;
                wearableDeviceModel = wearableDeviceModel2;
            }
        } else if (i3 == 1) {
            i = anonymousClass1.I$0;
            otaUpgradeRequest2 = (OtaUpgradeRequest) anonymousClass1.L$2;
            deviceInfo = (DeviceInfoExt) anonymousClass1.L$1;
            wearableDeviceModel2 = (WearableDeviceModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(defaultLang);
            huaMiLanguageStrByTag = (String) defaultLang;
            otaUpgradeRequest = otaUpgradeRequest2;
            wearableDeviceModel = wearableDeviceModel2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = anonymousClass1.I$0;
            otaUpgradeRequest2 = (OtaUpgradeRequest) anonymousClass1.L$2;
            deviceInfo = (DeviceInfoExt) anonymousClass1.L$1;
            wearableDeviceModel2 = (WearableDeviceModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(defaultLang);
            huaMiLanguageStrByTag = (String) defaultLang;
            otaUpgradeRequest = otaUpgradeRequest2;
            wearableDeviceModel = wearableDeviceModel2;
        }
        otaUpgradeRequest.setLang(huaMiLanguageStrByTag);
        otaUpgradeRequest.setAppPlatform("android_phone");
        int deviceSource = deviceInfo.getDeviceSource();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(deviceSource);
        otaUpgradeRequest.setDeviceSource(sb5.toString());
        int firmwareFlag = deviceInfo.getFirmwareFlag();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(firmwareFlag);
        otaUpgradeRequest.setFirmwareFlag(sb6.toString());
        if (deviceInfo.getFirmwareVersion() == null) {
            strReplace$default2 = null;
        } else {
            String firmwareVersion = deviceInfo.getFirmwareVersion();
            Intrinsics.checkNotNullExpressionValue(firmwareVersion, "getFirmwareVersion(...)");
            strReplace$default2 = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(firmwareVersion, "V", "", false, 4, (Object) null), "v", "", false, 4, (Object) null);
        }
        otaUpgradeRequest.setFirmwareVersion(strReplace$default2);
        int fontFlag = deviceInfo.getFontFlag();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(fontFlag);
        otaUpgradeRequest.setFontFlag(sb7.toString());
        if (deviceInfo.getGpsVersion() != null) {
            String gpsVersion = deviceInfo.getGpsVersion();
            Intrinsics.checkNotNullExpressionValue(gpsVersion, "getGpsVersion(...)");
            strReplace$default3 = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(gpsVersion, "V", "", false, 4, (Object) null), "v", "", false, 4, (Object) null);
        }
        otaUpgradeRequest.setGpsVersion(strReplace$default3);
        if (deviceInfo.getFirmwareVersion() != null) {
            CheckUpdatePreferenceSupport.INSTANCE.saveLatestVersion(wearableDeviceModel.getDid(), deviceInfo.getFirmwareVersion());
        }
        Object[] objArr = new Object[3];
        objArr[0] = "CheckUpdate";
        objArr[1] = otaUpgradeRequest.toString();
        objArr[2] = i != 0 ? "setting null" : "setting not null";
        String str = String.format("%s checkHuaMiUpgrade:%s%s", objArr);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.i(str, new Object[0]);
        return otaUpgradeRequest;
    }

    public final void doCheckUpdate(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (checkUpdate) {
            Logger.i("CheckUpdate", "doCheckUpdate: doing");
        } else {
            checkUpdate = true;
            doUpdateRequest(new Function1() { // from class: zbq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UpdateHelper.doCheckUpdate$lambda$8(context, (Serializable) obj);
                }
            }, new Function1() { // from class: acq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UpdateHelper.doCheckUpdate$lambda$9(context, (ApiException) obj);
                }
            });
        }
    }

    public final void doUpdateRequest(@NotNull final Function1<? super Serializable, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            error.invoke2(new ApiException(-1));
            return;
        }
        if (!wearableDeviceModel.getIsDeviceConnected()) {
            error.invoke2(new ApiException(-1));
        } else if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            getCheckUpdateRequest().checkHMUpgrade(new Function1() { // from class: bcq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UpdateHelper.doUpdateRequest$lambda$1(success, (OtaUpgradeResult) obj);
                }
            }, new Function1() { // from class: ccq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UpdateHelper.doUpdateRequest$lambda$2(error, (ApiException) obj);
                }
            });
        } else if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            wearableDeviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.mi.fitness.checkupdate.UpdateHelper.doUpdateRequest.3
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i("CheckUpdate", "checkUpdate readWatchInfo failed :" + errorCode);
                    error.invoke2(new ApiException(errorCode));
                }

                @Override // defpackage.eu6
                public void onResult(WatchInfo result) {
                    Logger.i("CheckUpdate", "checkUpdate readWatchInfo success firmwareVersion = " + (result != null ? result.getFirmwareVersion() : null));
                    if ((result != null ? result.getFirmwareVersion() : null) == null) {
                        error.invoke2(new ApiException("read firmwareVersion failed", 0, 2, null));
                        return;
                    }
                    CheckUpdatePreferenceSupport.INSTANCE.saveLatestVersion(wearableDeviceModel.getDid(), result.getFirmwareVersion());
                    UpdateHelper updateHelper = UpdateHelper.INSTANCE;
                    WearableDeviceModel wearableDeviceModel2 = wearableDeviceModel;
                    String firmwareVersion = result.getFirmwareVersion();
                    Intrinsics.checkNotNull(firmwareVersion);
                    updateHelper.requestLatestVersion(wearableDeviceModel2, firmwareVersion, success, error);
                    WearableDeviceModel wearableDeviceModel3 = wearableDeviceModel;
                    String firmwareVersion2 = result.getFirmwareVersion();
                    Intrinsics.checkNotNull(firmwareVersion2);
                    updateHelper.reportDeviceFirmwareVersion(wearableDeviceModel3, firmwareVersion2);
                }
            });
        }
    }

    public final boolean getCheckUpdate() {
        return checkUpdate;
    }

    public final void goUpgradeFragment(@Nullable Context context, @NotNull Serializable result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof LatestVersion) {
            dih.a().e(context, new FragmentParams.b().c(BundleKt.bundleOf(new Pair("key_latest_version", result))).e(BluetoothUpgradeFragment.class).b());
        } else if (result instanceof OtaUpgradeResult) {
            dih.a().e(context, new FragmentParams.b().c(BundleKt.bundleOf(new Pair(HuamiUpgradeFragment.KEY_OTA_UPGRADE_RESULT, result))).e(HuamiUpgradeFragment.class).b());
        }
    }

    public final void reportDeviceFirmwareVersion(@NotNull WearableDeviceModel deviceModel, @NotNull String firmwareVersion) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        getCheckUpdateRequest().reportDeviceInfo(deviceModel.getDid(), firmwareVersion, new Function1() { // from class: wbq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UpdateHelper.reportDeviceFirmwareVersion$lambda$3((pb2) obj);
            }
        }, new Function1() { // from class: xbq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UpdateHelper.reportDeviceFirmwareVersion$lambda$4((Exception) obj);
            }
        });
    }

    public final void setCheckUpdate(boolean z) {
        checkUpdate = z;
    }
}
