package com.xiaomi.hm.health.ui.language.ruler;

import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.ui.language.DeviceLanguage;
import com.xiaomi.hm.health.ui.language.DeviceLanguageConfig;
import com.xiaomi.hm.health.ui.language.HmLanguageUtil;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/KongmingLanguageRuler;", "Lcom/xiaomi/hm/health/ui/language/ruler/UnilateralAbsLangRuler;", "", "a", "()Ljava/lang/Integer;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "hmDeviceInfo", "", "isBind", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", GoogleApiAvailabilityLight.a, "b", "c", "hmBaseDevice", "isFitCurrentDeviceRuler", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "getRulerLanguage", "hmLanguage", "", "setLanguage", "", "toString", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class KongmingLanguageRuler extends UnilateralAbsLangRuler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "KongmingLanguageRuler";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/KongmingLanguageRuler$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isKongMingDevice", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HMDeviceSource.values().length];
                iArr[HMDeviceSource.MILI_KONGMING.ordinal()] = 1;
                iArr[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isKongMingDevice(@Nullable HMDeviceSource source) {
            int i = source == null ? -1 : WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
            return i == 1 || i == 2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Locale a;
        public final /* synthetic */ Integer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locale locale, Integer num) {
            super(0);
            this.a = locale;
            this.b = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            if (Build.VERSION.SDK_INT >= 21) {
                String languageTag = this.a.toLanguageTag();
                Integer num = this.b;
                return "locale:" + languageTag + ",\nlanguageCode:" + (num != null ? num : "null");
            }
            Locale locale = this.a;
            Integer num2 = this.b;
            return "locale:" + locale + ",\nlanguageCode:" + (num2 != null ? num2 : "null");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "build is low";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "The current device language is the same as the one to be set";
        }
    }

    private final Integer a() {
        int localeToHmLanguageCode;
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 21) {
            localeToHmLanguageCode = HmLanguageUtil.INSTANCE.parseLocaleToHmLanguageCode(locale);
        } else {
            HMLog.info(f, b.a);
            localeToHmLanguageCode = 2;
        }
        HMLog.info(f, new a(locale, localeToHmLanguageCode));
        return localeToHmLanguageCode;
    }

    private final boolean b(DeviceInfo hmDeviceInfo) {
        String hardwareVersionStr;
        if (!INSTANCE.isKongMingDevice(getDeviceSource())) {
            return false;
        }
        DeviceInfo deviceInfo = getDeviceInfo();
        String str = "";
        if (deviceInfo != null && (hardwareVersionStr = deviceInfo.getHardwareVersionStr()) != null) {
            str = hardwareVersionStr;
        }
        return HardwareInfo.isMiliKongmingMainLand(str);
    }

    private final boolean c() {
        DeviceLanguage deviceLanguage = DeviceLanguageConfig.INSTANCE.getDeviceLanguage(getDeviceSource().getValue());
        return deviceLanguage != null && deviceLanguage.isFollowSystem();
    }

    private final boolean d(DeviceInfo hmDeviceInfo, boolean isBind, HMBaseDevice device) {
        if (isBind) {
            return b(hmDeviceInfo);
        }
        if (isBind) {
            throw new NoWhenBranchMatchedException();
        }
        return c();
    }

    public static /* synthetic */ boolean e(KongmingLanguageRuler kongmingLanguageRuler, DeviceInfo deviceInfo, boolean z, HMBaseDevice hMBaseDevice, int i, Object obj) {
        if ((i & 4) != 0) {
            hMBaseDevice = null;
        }
        return kongmingLanguageRuler.d(deviceInfo, z, hMBaseDevice);
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.UnilateralLanguageRuler
    @Nullable
    public HMLanguage getRulerLanguage() {
        HMLanguage hMLanguage = null;
        if (getDeviceInfo() == null) {
            return null;
        }
        if (d(getDeviceInfo(), getIsBind(), getDevice())) {
            Integer numA = a();
            hMLanguage = new HMLanguage(numA == null ? 2 : numA.intValue());
        }
        return hMLanguage;
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler
    public boolean isFitCurrentDeviceRuler(@Nullable final HMBaseDevice hmBaseDevice) {
        setFunctionDec(new Function0<HMBaseDevice>() { // from class: com.xiaomi.hm.health.ui.language.ruler.KongmingLanguageRuler.isFitCurrentDeviceRuler.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: from getter */
            public HMBaseDevice getA() {
                return hmBaseDevice;
            }
        });
        return INSTANCE.isKongMingDevice(getDeviceSource());
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.UnilateralAbsLangRuler, com.xiaomi.hm.health.ui.language.ruler.UnilateralLanguageRuler
    public void setLanguage(@NotNull HMLanguage hmLanguage) {
        HMLanguage currentLanguage = getCurrentLanguage();
        boolean z = false;
        if (currentLanguage != null && currentLanguage.getLanguage() == hmLanguage.getLanguage()) {
            z = true;
        }
        if (z) {
            HMLog.info(f, c.a);
        } else if (getDevice() instanceof HMMiLiProDevice) {
            HMBaseDevice device = getDevice();
            Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
            ((HMMiLiProDevice) device).setLanguage(hmLanguage, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.ui.language.ruler.KongmingLanguageRuler.setLanguage.2
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(@Nullable Boolean t) {
                    super.onFinish(t);
                    if (Intrinsics.areEqual(t, Boolean.TRUE)) {
                        DeviceLanguageConfig.INSTANCE.saveDeviceLanguageProperty(new HMLanguage(-1), KongmingLanguageRuler.this.getDeviceSource());
                        KongmingLanguageRuler.this.getDeviceUtilsApiLazy().getValue().updateAboutLanguageConfig(KongmingLanguageRuler.this.getDeviceSource());
                        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(KongmingLanguageRuler.this.getDeviceSource().getType())) {
                            KongmingLanguageRuler kongmingLanguageRuler = KongmingLanguageRuler.this;
                            HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
                            HMFwOnlineManager.getInstance().checkFw(kongmingLanguageRuler.getDeviceSource().getType(), false);
                        }
                    }
                }
            });
        }
    }

    @NotNull
    public String toString() {
        return "KongmingLanguageRuler(isMeetLanguageRuler:" + isFitCurrentDeviceRuler(getDevice()) + ",\nrulerLanguage:" + getRulerLanguage() + ",\nentranceVisible:" + entranceVisible() + ")";
    }
}
