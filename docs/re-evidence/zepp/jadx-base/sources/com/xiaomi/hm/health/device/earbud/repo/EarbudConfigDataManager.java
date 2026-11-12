package com.xiaomi.hm.health.device.earbud.repo;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.google.gson.Gson;
import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.ShareAnalytics;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.webapi.account.model.HMBeanConfig;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005R\u001d\u0010\f\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/repo/EarbudConfigDataManager;", "", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "a", "miliConfig", "", "b", "reLoadConfig", ShareAnalytics.ParamValue.SAVE, "Lkotlin/Lazy;", "getConfig", "()Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "config", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudConfigDataManager {

    @NotNull
    public static final String EARBUD_CONFIG_KEY = "huami.mifit.user.settings.earbud.config";

    @NotNull
    private static final String b = "EarbudConfigDataManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy config;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<EarbudConfigDataManager> c = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/repo/EarbudConfigDataManager$Companion;", "", "Lcom/xiaomi/hm/health/device/earbud/repo/EarbudConfigDataManager;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/xiaomi/hm/health/device/earbud/repo/EarbudConfigDataManager;", DefaultSettingsSpiCall.n, "", "EARBUD_CONFIG_KEY", "Ljava/lang/String;", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/xiaomi/hm/health/device/earbud/repo/EarbudConfigDataManager;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EarbudConfigDataManager getInstance() {
            return (EarbudConfigDataManager) EarbudConfigDataManager.c.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/repo/EarbudConfigDataManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EarbudConfigDataManager> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudConfigDataManager invoke() {
            return new EarbudConfigDataManager(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMMiliConfig> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMMiliConfig invoke() {
            return EarbudConfigDataManager.this.a();
        }
    }

    private EarbudConfigDataManager() {
        this.config = LazyKt__LazyJVMKt.lazy(new b());
    }

    public /* synthetic */ EarbudConfigDataManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMMiliConfig a() {
        HMMiliConfig hMMiliConfig = new HMMiliConfig();
        b(hMMiliConfig);
        return hMMiliConfig;
    }

    private final void b(HMMiliConfig miliConfig) {
        String property;
        if (HMLoginManager.isUserValid() && (property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(EARBUD_CONFIG_KEY, "")) != null) {
            try {
                HMBeanConfig hMBeanConfig = (HMBeanConfig) new Gson().fromJson(HMHttpUtils.decodeJson(property), HMBeanConfig.class);
                if (hMBeanConfig == null) {
                    return;
                }
                miliConfig.setGoalStepsCount(hMBeanConfig.getGoalStepsCount());
                miliConfig.setAlarmNotifyEnabled(hMBeanConfig.isAlarmNotifyEnabled());
                miliConfig.setDayReportNoti(hMBeanConfig.getDayReportNoti());
                miliConfig.setEnableConnectedBtAdv(hMBeanConfig.isEnableConnectedBtAdv());
                miliConfig.setHasHeartRate(hMBeanConfig.isHasHeartRate());
                miliConfig.setIncallContactNotifyEnabled(hMBeanConfig.isIncallContactNotifyEnabled());
                miliConfig.setIncallNotifyEnabled(hMBeanConfig.isIncallNotifyEnabled());
                miliConfig.setInComingCallNotifyTime(hMBeanConfig.getInComingCallNotifyTime());
                miliConfig.setLightColor(hMBeanConfig.getLightColor());
                miliConfig.setmOpenSleepNotify(hMBeanConfig.ismOpenSleepNotify());
                miliConfig.setSleepAssist(hMBeanConfig.isSleepAssist());
                miliConfig.setSmsContactNotifyEnabled(hMBeanConfig.isSmsContactNotifyEnabled());
                miliConfig.setHasHeartRate(hMBeanConfig.isHasHeartRate());
                miliConfig.setSmsNotifyEnabled(hMBeanConfig.isSmsNotifyEnabled());
                miliConfig.setUnit(hMBeanConfig.getUnit());
                miliConfig.setVibrate(hMBeanConfig.isVibrate());
                miliConfig.setWearHand(hMBeanConfig.getWearHand());
                miliConfig.setWeightMergeResult(hMBeanConfig.isWeightMergeResult());
                miliConfig.setWeightUnit(hMBeanConfig.getWeightUnit());
                miliConfig.setScreenLock(hMBeanConfig.getScreenLock());
                miliConfig.setProDisplay(hMBeanConfig.getProDisplay());
                miliConfig.setSedentaryRemind(hMBeanConfig.getSedentaryRemind());
                miliConfig.setEmailNotifyEnabled(hMBeanConfig.isEmailNotifyEnabled());
                miliConfig.setLiftWristBrightView(hMBeanConfig.isLiftWristBrightView());
                miliConfig.setGoalRemind(hMBeanConfig.isGoalRemind());
                miliConfig.setAvoidDisturdMode(hMBeanConfig.isAvoidDisturdMode());
                miliConfig.setIosappNotifySettings(hMBeanConfig.getIosappNotifySettings());
                miliConfig.setAndroidappNotifySettings(hMBeanConfig.getAndroidappNotifySettings());
                miliConfig.setQuietMode(hMBeanConfig.getQuietMode());
                miliConfig.setUnlockScreenType(hMBeanConfig.getUnlockScreenType());
                miliConfig.setTimePanelType(hMBeanConfig.getTimePanelType());
                miliConfig.setTimePanelLang(hMBeanConfig.getTimePanelLang());
                miliConfig.setAntiLost(hMBeanConfig.isAntiLost());
                miliConfig.setNotificationOn(hMBeanConfig.isNotificationOn());
                miliConfig.setCheckNotification(hMBeanConfig.isCheckNotification());
                miliConfig.setFlipWrist(hMBeanConfig.isFlipWrist());
                miliConfig.setIncallNameDisplayEnabled(hMBeanConfig.isIncallNameDisplayEnabled());
                miliConfig.setSmsNameDisplayEnabled(hMBeanConfig.isSmsNameDisplayEnabled());
                miliConfig.setShoePlaceMode(hMBeanConfig.getShoePlaceMode());
                miliConfig.setWeightBfsUnit(hMBeanConfig.getWeightBfsUnit());
                miliConfig.setWholeHeartRate(hMBeanConfig.isWholeHeartRate());
                miliConfig.setDialSetting(hMBeanConfig.getDialSetting());
                miliConfig.setLongPressSettings(hMBeanConfig.getLongPressSettings());
                miliConfig.setHrDetectType(Integer.valueOf(hMBeanConfig.getHrDetectType()));
                miliConfig.setWeatherSetting(hMBeanConfig.getWeatherSetting());
                miliConfig.setWatchApps(hMBeanConfig.getWatchApps());
                miliConfig.setLiftWristTime(hMBeanConfig.getLiftWristTime());
                miliConfig.setHrDetectFreq(Integer.valueOf(hMBeanConfig.getHrDetectFreq()));
                miliConfig.setDisconnectRemind(hMBeanConfig.getDisconnectRemind());
                miliConfig.setPhoneNotifyDelayEnable(hMBeanConfig.isPhoneNotifyDelayEnable());
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                HMLog.e(b, e.getMessage(), e);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    @NotNull
    public final HMMiliConfig getConfig() {
        return (HMMiliConfig) this.config.getValue();
    }

    public final void reLoadConfig() {
        b(getConfig());
    }

    public final void save() {
        HMBeanConfig hMBeanConfig = new HMBeanConfig();
        hMBeanConfig.setGoalStepsCount(getConfig().getGoalStepsCount());
        hMBeanConfig.setAlarmNotifyEnabled(getConfig().isAlarmNotifyEnabled());
        hMBeanConfig.setDayReportNoti(getConfig().getDayReportNoti());
        hMBeanConfig.setEnableConnectedBtAdv(getConfig().isEnableConnectedBtAdv());
        hMBeanConfig.setHasHeartRate(getConfig().isHasHeartRate());
        hMBeanConfig.setIncallContactNotifyEnabled(getConfig().isIncallContactNotifyEnabled());
        hMBeanConfig.setIncallNotifyEnabled(getConfig().isIncallNotifyEnabled());
        hMBeanConfig.setInComingCallNotifyTime(getConfig().getInComingCallNotifyTime());
        hMBeanConfig.setLightColor(getConfig().getLightColor());
        hMBeanConfig.setmOpenSleepNotify(getConfig().ismOpenSleepNotify());
        hMBeanConfig.setSleepAssist(getConfig().isSleepAssist());
        hMBeanConfig.setSmsContactNotifyEnabled(getConfig().isSmsContactNotifyEnabled());
        hMBeanConfig.setHasHeartRate(getConfig().isHasHeartRate());
        hMBeanConfig.setSmsNotifyEnabled(getConfig().isSmsNotifyEnabled());
        hMBeanConfig.setUnit(getConfig().getUnit());
        hMBeanConfig.setVibrate(getConfig().isVibrate());
        hMBeanConfig.setWearHand(getConfig().getWearHand());
        hMBeanConfig.setWeightMergeResult(getConfig().isWeightMergeResult());
        hMBeanConfig.setWeightUnit(getConfig().getWeightUnit());
        hMBeanConfig.setScreenLock(getConfig().getScreenLock());
        hMBeanConfig.setProDisplay(getConfig().getProDisplay());
        hMBeanConfig.setSedentaryRemind(getConfig().getSedentaryRemind());
        hMBeanConfig.setEmailNotifyEnabled(getConfig().isEmailNotifyEnabled());
        hMBeanConfig.setLiftWristBrightView(getConfig().isLiftWristBrightView());
        hMBeanConfig.setGoalRemind(getConfig().isGoalRemind());
        hMBeanConfig.setAvoidDisturdMode(getConfig().isAvoidDisturdMode());
        hMBeanConfig.setIosappNotifySettings(getConfig().getIosappNotifySettings());
        hMBeanConfig.setAndroidappNotifySettings(getConfig().getAndroidappNotifySettings());
        hMBeanConfig.setQuietMode(getConfig().getQuietMode());
        hMBeanConfig.setUnlockScreenType(getConfig().getUnlockScreenType());
        hMBeanConfig.setTimePanelType(getConfig().getTimePanelType());
        hMBeanConfig.setTimePanelLang(getConfig().getTimePanelLang());
        hMBeanConfig.setAntiLost(getConfig().isAntiLost());
        hMBeanConfig.setNotificationOn(getConfig().isNotificationOn());
        hMBeanConfig.setCheckNotification(getConfig().isCheckNotification());
        hMBeanConfig.setFlipWrist(getConfig().isFlipWrist());
        hMBeanConfig.setIncallNameDisplayEnabled(getConfig().isIncallNameDisplayEnabled());
        hMBeanConfig.setSmsNameDisplayEnabled(getConfig().isSmsNameDisplayEnabled());
        hMBeanConfig.setShoePlaceMode(getConfig().getShoePlaceMode());
        hMBeanConfig.setWeightBfsUnit(getConfig().getWeightBfsUnit());
        hMBeanConfig.setWholeHeartRate(getConfig().isWholeHeartRate());
        hMBeanConfig.setDialSetting(getConfig().getDialSetting());
        hMBeanConfig.setLongPressSettings(getConfig().getLongPressSettings());
        Integer hrDetectType = getConfig().getHrDetectType();
        hMBeanConfig.setHrDetectType(hrDetectType == null ? 0 : hrDetectType.intValue());
        hMBeanConfig.setWeatherSetting(getConfig().getWeatherSetting());
        hMBeanConfig.setWatchApps(getConfig().getWatchApps());
        hMBeanConfig.setLiftWristTime(getConfig().getLiftWristTime());
        Integer hrDetectFreq = getConfig().getHrDetectFreq();
        hMBeanConfig.setHrDetectFreq(hrDetectFreq != null ? hrDetectFreq.intValue() : 0);
        hMBeanConfig.setDisconnectRemind(getConfig().getDisconnectRemind());
        hMBeanConfig.setPhoneNotifyDelayEnable(getConfig().isPhoneNotifyDelayEnable());
        DeviceXFunctionsKt.getPropertyStoreApi().setProperty(EARBUD_CONFIG_KEY, new Gson().toJson(hMBeanConfig));
    }
}
