package com.xiaomi.hm.health.device.earbud.util;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.web.service.WebViewService;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.GeneralDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\n\u0010\u000f\u001a\u00020\u0007*\u00020\u000eJ\n\u0010\u0010\u001a\u00020\u0007*\u00020\u000eJ\u001c\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\u0013\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001d\u0010#\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001c\u0010\"R\u001d\u0010&\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b!\u0010%¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/util/EarbudUtil;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "a", "Lcom/xiaomi/hm/health/bt/device/HmBaseEarbudDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "Ljava/io/File;", "callback", "", "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "showEarbudHelp", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "getEarbudCacheLogFile", "getEarbudLogTempFile", "Lcom/xiaomi/hm/health/bt/device/HmEarbudDevice;", "syncEarBudDeviceLogNow", "terminateEarBudDevice", "copyEarBudLog", "deleteEarBudLog", "", LogUtil.I, "DEFAULT_PRODUCT_ID", "b", "DEFAULT_PRODUCT_VERSION", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", GoogleApiAvailabilityLight.a, "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/web/service/WebViewService;", "()Lcom/huami/web/service/WebViewService;", "service", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudUtil implements KoinComponent {

    @NotNull
    public static final EarbudUtil INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int DEFAULT_PRODUCT_ID = 51;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int DEFAULT_PRODUCT_VERSION = 256;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy service;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final EarbudUtil earbudUtil = new EarbudUtil();
        INSTANCE = earbudUtil;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.util.EarbudUtil$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = earbudUtil;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.earbud.util.EarbudUtil$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = earbudUtil;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        service = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<WebViewService>() { // from class: com.xiaomi.hm.health.device.earbud.util.EarbudUtil$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.web.service.WebViewService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WebViewService getA() {
                KoinComponent koinComponent = earbudUtil;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WebViewService.class), objArr4, objArr5);
            }
        });
    }

    private EarbudUtil() {
    }

    private final DeviceInfo a() {
        GeneralDeviceInfo generalDeviceInfo = new GeneralDeviceInfo();
        PnP pnP = new PnP();
        pnP.productId = 51;
        pnP.productVersion = 256;
        generalDeviceInfo.pnp = pnP;
        return new DeviceInfo(generalDeviceInfo);
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi c() {
        return (DeviceUtilsApi) deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebViewService d() {
        return (WebViewService) service.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(HmBaseEarbudDevice device, final IHMDataCallback<File> callback) {
        final File earbudLogTempFile = getEarbudLogTempFile(device);
        final File earbudCacheLogFile = getEarbudCacheLogFile(device);
        device.getDeviceLog(earbudLogTempFile, new IHMDataCallback<File>() { // from class: com.xiaomi.hm.health.device.earbud.util.EarbudUtil$syncRightLog$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private Progress rightProgress;

            {
                Progress progress = new Progress();
                progress.total = 100;
                Unit unit = Unit.INSTANCE;
                this.rightProgress = progress;
            }

            @NotNull
            public final Progress getRightProgress() {
                return this.rightProgress;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onProgress(@Nullable Progress progress) {
                if (progress == null) {
                    return;
                }
                IHMDataCallback<File> iHMDataCallback = callback;
                getRightProgress().progress = (progress.getPercent() / 2) + 50;
                iHMDataCallback.onProgress(getRightProgress());
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStart() {
            }

            public final void setRightProgress(@NotNull Progress progress) {
                this.rightProgress = progress;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStop(@Nullable File data, @Nullable HMDeviceError error) {
                try {
                    if (earbudCacheLogFile.exists() && earbudCacheLogFile.length() > 10485760) {
                        earbudCacheLogFile.delete();
                    }
                    if (!earbudCacheLogFile.exists()) {
                        earbudCacheLogFile.createNewFile();
                    }
                    c.appendBytes(earbudCacheLogFile, c.readBytes(earbudLogTempFile));
                    earbudLogTempFile.delete();
                } catch (Exception unused) {
                }
                callback.onStop(data, error);
            }
        });
    }

    public final void copyEarBudLog(@NotNull Context context) {
        HMBaseDevice device = b().getDevice(HMDeviceType.EARBUD);
        if (device == null || !(device instanceof HmEarbudDevice)) {
            return;
        }
        try {
            File earbudCacheLogFile = getEarbudCacheLogFile((HMBaseBleDevice) device);
            FileUtils.copyFile(earbudCacheLogFile, new File(FileUtils.getLogRootDir(context), earbudCacheLogFile.getName()));
            File earbudCacheLogFile2 = getEarbudCacheLogFile(((HmEarbudDevice) device).getRightDevice());
            FileUtils.copyFile(earbudCacheLogFile2, new File(FileUtils.getLogRootDir(context), earbudCacheLogFile2.getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void deleteEarBudLog(@NotNull Context context) {
        HMBaseDevice device = b().getDevice(HMDeviceType.EARBUD);
        if (device == null || !(device instanceof HmEarbudDevice)) {
            return;
        }
        try {
            File earbudCacheLogFile = getEarbudCacheLogFile((HMBaseBleDevice) device);
            File earbudCacheLogFile2 = getEarbudCacheLogFile(((HmEarbudDevice) device).getRightDevice());
            File file = new File(FileUtils.getLogRootDir(context), earbudCacheLogFile.getName());
            File file2 = new File(FileUtils.getLogRootDir(context), earbudCacheLogFile2.getName());
            if (file.exists()) {
                file.delete();
            }
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @NotNull
    public final File getEarbudCacheLogFile(@NotNull HMBaseBleDevice hMBaseBleDevice) {
        return new File(FileUtils.getAppFileDir(DeviceXFunctionsKt.getContext(), "earbugLog"), c().getEarbudLogName(hMBaseBleDevice.getMDeviceSource(), hMBaseBleDevice.getDeviceInfo().getDeviceID()));
    }

    @NotNull
    public final File getEarbudLogTempFile(@NotNull HMBaseBleDevice hMBaseBleDevice) {
        return FileUtils.getAppCacheDir(DeviceXFunctionsKt.getContext(), "earbugLog", c().getDeviceLogName(hMBaseBleDevice.getMDeviceSource()));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void showEarbudHelp(@NotNull Context context) {
        HMBaseDevice device = b().getDevice(HMDeviceType.EARBUD);
        DeviceInfo deviceInfo = device == null ? null : device.getDeviceInfo();
        if (deviceInfo == null) {
            deviceInfo = a();
        }
        c().isDeviceManualFaqShow(deviceInfo, new DeviceManualFaqCallback() { // from class: com.xiaomi.hm.health.device.earbud.util.EarbudUtil.showEarbudHelp.1
            @Override // com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback
            public void hide() {
            }

            @Override // com.xiaomi.hm.health.device.callback.DeviceManualFaqCallback
            public void show(@NotNull String url) {
                EarbudUtil.INSTANCE.d().launch(url);
            }
        });
    }

    public final void syncEarBudDeviceLogNow(@NotNull final HmEarbudDevice device, @NotNull final IHMDataCallback<File> callback) {
        final File earbudLogTempFile = getEarbudLogTempFile(device);
        final File earbudCacheLogFile = getEarbudCacheLogFile(device);
        device.getDeviceLog(earbudLogTempFile, new IHMDataCallback<File>() { // from class: com.xiaomi.hm.health.device.earbud.util.EarbudUtil.syncEarBudDeviceLogNow.1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private Progress leftProgress;

            {
                Progress progress = new Progress();
                progress.total = 100;
                Unit unit = Unit.INSTANCE;
                this.leftProgress = progress;
            }

            @NotNull
            public final Progress getLeftProgress() {
                return this.leftProgress;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onProgress(@Nullable Progress progress) {
                if (progress == null) {
                    return;
                }
                IHMDataCallback<File> iHMDataCallback = callback;
                getLeftProgress().progress = progress.getPercent() / 2;
                iHMDataCallback.onProgress(getLeftProgress());
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStart() {
                callback.onStart();
            }

            public final void setLeftProgress(@NotNull Progress progress) {
                this.leftProgress = progress;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStop(@Nullable File data, @Nullable HMDeviceError error) {
                try {
                    if (earbudCacheLogFile.exists() && earbudCacheLogFile.length() > 10485760) {
                        earbudCacheLogFile.delete();
                    }
                    if (!earbudCacheLogFile.exists()) {
                        earbudCacheLogFile.createNewFile();
                    }
                    c.appendBytes(earbudCacheLogFile, c.readBytes(earbudLogTempFile));
                    earbudLogTempFile.delete();
                } catch (Exception unused) {
                }
                EarbudUtil.INSTANCE.e(device.getRightDevice(), callback);
            }
        });
    }

    public final void terminateEarBudDevice(@Nullable HmEarbudDevice device) {
        HmBaseEarbudDevice rightDevice;
        if (device != null) {
            device.terminateDeviceLog();
        }
        if (device == null || (rightDevice = device.getRightDevice()) == null) {
            return;
        }
        rightDevice.terminateDeviceLog();
    }
}
