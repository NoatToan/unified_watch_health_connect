package com.xiaomi.hm.health.ui.language.ruler;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.LanguageComBination;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.ui.language.DeviceLanguageConfig;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016R\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R,\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00168D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\n8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/UnilateralAbsLangRuler;", "Lcom/xiaomi/hm/health/ui/language/ruler/UnilateralLanguageRuler;", "", "priority", "", "setPriority", "getPriority", "", "flag", "setBindFlag", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "hmLanguage", "setLanguage", "entranceVisible", "Lkotlin/Lazy;", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "a", "Lkotlin/Lazy;", "getDeviceUtilsApiLazy", "()Lkotlin/Lazy;", "deviceUtilsApiLazy", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "b", "Lkotlin/jvm/functions/Function0;", "getFunctionDec", "()Lkotlin/jvm/functions/Function0;", "setFunctionDec", "(Lkotlin/jvm/functions/Function0;)V", "functionDec", "c", LogUtil.I, "priorityCache", "<set-?>", GoogleApiAvailabilityLight.a, "Z", "isBind", "()Z", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "getCurrentLanguage", "()Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "currentLanguage", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class UnilateralAbsLangRuler implements UnilateralLanguageRuler {

    @NotNull
    private static final String e = "UnilateralAbsLangRuler";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy<DeviceUtilsApi> deviceUtilsApiLazy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<? extends HMBaseDevice> functionDec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int priorityCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isBind;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "The current device language is the same as the one to be set";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnilateralAbsLangRuler() {
        Koin koin = GlobalContext.INSTANCE.get();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApiLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.ui.language.ruler.UnilateralAbsLangRuler$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                return rootScope.get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        this.isBind = true;
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler
    public boolean entranceVisible() {
        DeviceInfo deviceInfo = getDeviceInfo();
        LanguageComBination languageComBination = deviceInfo == null ? null : deviceInfo.getLanguageComBination();
        if (languageComBination == null) {
            return false;
        }
        return languageComBination.isContainLanguageFeature() || (languageComBination.isContainLanguageGroup() && (languageComBination.getLanguageList().isEmpty() ^ true));
    }

    @Nullable
    public final HMLanguage getCurrentLanguage() {
        HMOtherVersion otherVersion;
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null || (otherVersion = deviceInfo.getOtherVersion()) == null) {
            return null;
        }
        return otherVersion.getLanguage();
    }

    @Nullable
    public final HMBaseDevice getDevice() {
        Function0<? extends HMBaseDevice> function0 = this.functionDec;
        if (function0 == null) {
            return null;
        }
        return function0.getA();
    }

    @Nullable
    public final DeviceInfo getDeviceInfo() {
        HMBaseDevice device = getDevice();
        if (device == null) {
            return null;
        }
        return device.getDeviceInfo();
    }

    @NotNull
    public final HMDeviceSource getDeviceSource() {
        DeviceInfo deviceInfo = getDeviceInfo();
        HMDeviceSource deviceSource = deviceInfo == null ? null : deviceInfo.getDeviceSource();
        return deviceSource == null ? HMDeviceSource.VDEVICE : deviceSource;
    }

    @NotNull
    public final Lazy<DeviceUtilsApi> getDeviceUtilsApiLazy() {
        return this.deviceUtilsApiLazy;
    }

    @Nullable
    public final Function0<HMBaseDevice> getFunctionDec() {
        return this.functionDec;
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getPriorityCache() {
        return this.priorityCache;
    }

    /* JADX INFO: renamed from: isBind, reason: from getter */
    public final boolean getIsBind() {
        return this.isBind;
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.UnilateralLanguageRuler
    public void setBindFlag(boolean flag) {
        this.isBind = flag;
    }

    public final void setFunctionDec(@Nullable Function0<? extends HMBaseDevice> function0) {
        this.functionDec = function0;
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.UnilateralLanguageRuler
    public void setLanguage(@NotNull HMLanguage hmLanguage) {
        HMLanguage currentLanguage = getCurrentLanguage();
        boolean z = false;
        if (currentLanguage != null && currentLanguage.getLanguage() == hmLanguage.getLanguage()) {
            z = true;
        }
        if (z) {
            HMLog.info(e, a.a);
        } else if (getDevice() instanceof HMMiLiProDevice) {
            HMBaseDevice device = getDevice();
            Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
            ((HMMiLiProDevice) device).setLanguage(hmLanguage, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.ui.language.ruler.UnilateralAbsLangRuler.setLanguage.2
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(@Nullable Boolean t) {
                    HMOtherVersion otherVersion;
                    super.onFinish(t);
                    if (Intrinsics.areEqual(t, Boolean.TRUE)) {
                        DeviceLanguageConfig deviceLanguageConfig = DeviceLanguageConfig.INSTANCE;
                        DeviceInfo deviceInfo = UnilateralAbsLangRuler.this.getDeviceInfo();
                        HMLanguage hMLanguage = null;
                        if (deviceInfo != null && (otherVersion = deviceInfo.getOtherVersion()) != null) {
                            hMLanguage = otherVersion.getLanguage();
                        }
                        if (hMLanguage == null) {
                            hMLanguage = new HMLanguage(2);
                        }
                        deviceLanguageConfig.saveDeviceLanguageProperty(hMLanguage, UnilateralAbsLangRuler.this.getDeviceSource());
                        UnilateralAbsLangRuler.this.getDeviceUtilsApiLazy().getValue().updateAboutLanguageConfig(UnilateralAbsLangRuler.this.getDeviceSource());
                        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(UnilateralAbsLangRuler.this.getDeviceSource().getType())) {
                            UnilateralAbsLangRuler unilateralAbsLangRuler = UnilateralAbsLangRuler.this;
                            HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
                            HMFwOnlineManager.getInstance().checkFw(unilateralAbsLangRuler.getDeviceSource().getType(), false);
                        }
                    }
                }
            });
        }
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler
    public void setPriority(int priority) {
        this.priorityCache = priority;
    }
}
