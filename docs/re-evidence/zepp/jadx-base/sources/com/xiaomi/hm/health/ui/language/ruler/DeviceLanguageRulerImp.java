package com.xiaomi.hm.health.ui.language.ruler;

import android.os.Build;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.LanguageComBination;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.ui.language.HmLanguageUtil;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.xiaomi.hm.health.ui.language.ruler.UnilateralDeviceLanguageRulerImp, reason: from toString */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/UnilateralDeviceLanguageRulerImp;", "Lcom/xiaomi/hm/health/ui/language/ruler/UnilateralAbsLangRuler;", "", "a", "()Ljava/lang/Integer;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "", "isFitCurrentDeviceRuler", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "getRulerLanguage", "", "toString", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceLanguageRulerImp extends UnilateralAbsLangRuler {

    @NotNull
    private static final String f = "UnilateralDeviceLanguageRulerImp";

    /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.language.ruler.UnilateralDeviceLanguageRulerImp$a */
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

    /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.language.ruler.UnilateralDeviceLanguageRulerImp$b */
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

    @Override // com.xiaomi.hm.health.ui.language.ruler.UnilateralLanguageRuler
    @Nullable
    public HMLanguage getRulerLanguage() {
        Integer numA = a();
        if (numA == null) {
            return null;
        }
        return new HMLanguage(numA.intValue());
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler
    public boolean isFitCurrentDeviceRuler(@Nullable final HMBaseDevice hmBaseDevice) {
        LanguageComBination languageComBination;
        setFunctionDec(new Function0<HMBaseDevice>() { // from class: com.xiaomi.hm.health.ui.language.ruler.UnilateralDeviceLanguageRulerImp.isFitCurrentDeviceRuler.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: from getter */
            public HMBaseDevice getA() {
                return hmBaseDevice;
            }
        });
        boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.SUPPORT_FOLLOW_PHONE_LANGUAGE, getDeviceSource());
        DeviceInfo deviceInfo = getDeviceInfo();
        return zHasFeature && ((deviceInfo != null && (languageComBination = deviceInfo.getLanguageComBination()) != null) ? languageComBination.isSupportDeviceSettings() : false);
    }

    @NotNull
    public String toString() {
        return "DeviceLanguageRulerImp(isMeetLanguageRuler:" + isFitCurrentDeviceRuler(getDevice()) + ",\nrulerLanguage:" + getRulerLanguage() + ",\nentranceVisible:" + entranceVisible() + ")";
    }
}
