package com.xiaomi.fitness.main.config;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.main.config.AppConfigs;
import com.xiaomi.fitness.main.config.GlobalConfig;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.net.response.ApiException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/main/config/GlobalConfig;", "", "<init>", "()V", "DEFAULT_APP_SETTING_DELAY_TIME", "", "mRequest", "Lcom/xiaomi/fitness/main/config/GlobalConfigRequest;", "getMRequest", "()Lcom/xiaomi/fitness/main/config/GlobalConfigRequest;", "mRequest$delegate", "Lkotlin/Lazy;", "TAG", "", "lastRequestTime", "", "requestAppConfigIfNecessary", "", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalConfig {
    private static final int DEFAULT_APP_SETTING_DELAY_TIME = 10800000;

    @NotNull
    private static final String TAG = "GlobalConfig";
    private static long lastRequestTime;

    @NotNull
    public static final GlobalConfig INSTANCE = new GlobalConfig();

    /* JADX INFO: renamed from: mRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: f0b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GlobalConfig.mRequest_delegate$lambda$0();
        }
    });

    private GlobalConfig() {
    }

    private final GlobalConfigRequest getMRequest() {
        return (GlobalConfigRequest) mRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GlobalConfigRequest mRequest_delegate$lambda$0() {
        return new GlobalConfigRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAppConfigIfNecessary$lambda$1(AppConfigs it) {
        String notificationAppInWhiteList;
        String notificationAppInForegroundWhiteList;
        String notificationSpotlightAppInWhiteList;
        String showUpdaterDialogAppInBlackList;
        String carrierEntries;
        String carrierHostBlackList;
        String mediaSessionBlacklist;
        Intrinsics.checkNotNullParameter(it, "it");
        ConfigPreference configPreference = ConfigPreference.INSTANCE;
        JsonContent config = it.getConfig();
        boolean z = true;
        configPreference.setOPEN_MIUI_CONNECTION_V7(config != null && config.getMiuiSystemConnectionV7());
        JsonContent config2 = it.getConfig();
        configPreference.setOPEN_MIUI_SPP_CONNECTION(config2 != null && config2.getMiuiSystemSPPConnection());
        JsonContent config3 = it.getConfig();
        configPreference.setIS_APP_CHOSEN_OPEN(config3 != null && config3.getIsAppChooseOpen());
        configPreference.putValue(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId() + "_whitelist", Boolean.valueOf(it.getIsGray()));
        JsonContent config4 = it.getConfig();
        configPreference.setIS_SUPPORT_DEVICE_STATISTICS(config4 != null ? config4.getIsSupportDeviceStatistics() : true);
        JsonContent config5 = it.getConfig();
        configPreference.setIS_SPORT_TARGET_SHARE_SHOW(config5 != null ? config5.getIsSportTargetShareShow() : false);
        JsonContent config6 = it.getConfig();
        String str = "";
        if (config6 == null || (notificationAppInWhiteList = config6.getNotificationAppInWhiteList()) == null) {
            notificationAppInWhiteList = "";
        }
        configPreference.setNOTIFICATION_APP_IN_WHITE_LIST(notificationAppInWhiteList);
        JsonContent config7 = it.getConfig();
        configPreference.setIS_SUPPORT_SLEEP_RHYTHM(config7 != null ? config7.getIsSupportSleepRhythm() : false);
        ParserPreference parserPreference = ParserPreference.INSTANCE;
        JsonContent config8 = it.getConfig();
        parserPreference.setIS_SUPPORT_SCHEMA(config8 != null ? config8.getIsSupportSchema() : false);
        JsonContent config9 = it.getConfig();
        if (config9 == null || (notificationAppInForegroundWhiteList = config9.getNotificationAppInForegroundWhiteList()) == null) {
            notificationAppInForegroundWhiteList = "";
        }
        configPreference.setNOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST(notificationAppInForegroundWhiteList);
        JsonContent config10 = it.getConfig();
        if (config10 == null || (notificationSpotlightAppInWhiteList = config10.getNotificationSpotlightAppInWhiteList()) == null) {
            notificationSpotlightAppInWhiteList = "";
        }
        configPreference.setNOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST(notificationSpotlightAppInWhiteList);
        JsonContent config11 = it.getConfig();
        if (config11 == null || (showUpdaterDialogAppInBlackList = config11.getShowUpdaterDialogAppInBlackList()) == null) {
            showUpdaterDialogAppInBlackList = "";
        }
        configPreference.setUPDATER_DIALOG_APP_IN_BLACK_LIST(showUpdaterDialogAppInBlackList);
        JsonContent config12 = it.getConfig();
        if (config12 == null || (carrierEntries = config12.getCarrierEntries()) == null) {
            carrierEntries = "";
        }
        configPreference.setCARRIER_ENTRIES(carrierEntries);
        JsonContent config13 = it.getConfig();
        if (config13 == null || (carrierHostBlackList = config13.getCarrierHostBlackList()) == null) {
            carrierHostBlackList = "";
        }
        configPreference.setCARRIER_HOST_BLACK_LIST(carrierHostBlackList);
        JsonContent config14 = it.getConfig();
        configPreference.setSHOW_SUUNTO_PARTNER_BTN(config14 != null ? config14.getShowSuuntoPartnerBtn() : true);
        JsonContent config15 = it.getConfig();
        configPreference.setSHOW_WATCH_FACE_PRICE(config15 != null ? config15.getShowWatchFacePrice() : false);
        JsonContent config16 = it.getConfig();
        configPreference.setWEATHER_LOCATION_BY_ANDROID(config16 != null ? config16.getWeatherLocationByAndroid() : true);
        JsonContent config17 = it.getConfig();
        if (config17 != null && (mediaSessionBlacklist = config17.getMediaSessionBlacklist()) != null) {
            str = mediaSessionBlacklist;
        }
        configPreference.setMEDIASESSION_BLACKLIST(str);
        JsonContent config18 = it.getConfig();
        configPreference.setFOCUS_SPORT_NOTIFICATION(config18 != null ? config18.getShowSportFocusNotification() : true);
        JsonContent config19 = it.getConfig();
        configPreference.setSHOW_VIP_BANNER(config19 != null ? config19.getShowVipBanner() : false);
        JsonContent config20 = it.getConfig();
        configPreference.setIS_HFP_CONNECT(config20 != null ? config20.getIsHFPConnect() : true);
        JsonContent config21 = it.getConfig();
        configPreference.setROUTE_NEW_FACE_POOL_FROM_ENTRANCE(config21 != null ? config21.getRouteNewFacePoolFromEntrance() : false);
        JsonContent config22 = it.getConfig();
        configPreference.setAUTO_SHOW_KEEPALIVE(config22 != null ? config22.getAutoShowKeepAlive() : 86400L);
        JsonContent config23 = it.getConfig();
        Boolean boolValueOf = config23 != null ? Boolean.valueOf(config23.getMiuiSystemConnectionV7()) : null;
        JsonContent config24 = it.getConfig();
        Boolean boolValueOf2 = config24 != null ? Boolean.valueOf(config24.getMiuiSystemSPPConnection()) : null;
        JsonContent config25 = it.getConfig();
        String notificationAppInWhiteList2 = config25 != null ? config25.getNotificationAppInWhiteList() : null;
        boolean z2 = notificationAppInWhiteList2 == null || notificationAppInWhiteList2.length() == 0;
        JsonContent config26 = it.getConfig();
        String notificationAppInForegroundWhiteList2 = config26 != null ? config26.getNotificationAppInForegroundWhiteList() : null;
        boolean z3 = notificationAppInForegroundWhiteList2 == null || notificationAppInForegroundWhiteList2.length() == 0;
        JsonContent config27 = it.getConfig();
        String carrierEntries2 = config27 != null ? config27.getCarrierEntries() : null;
        boolean z4 = carrierEntries2 == null || carrierEntries2.length() == 0;
        JsonContent config28 = it.getConfig();
        String carrierHostBlackList2 = config28 != null ? config28.getCarrierHostBlackList() : null;
        if (carrierHostBlackList2 != null && carrierHostBlackList2.length() != 0) {
            z = false;
        }
        JsonContent config29 = it.getConfig();
        Boolean boolValueOf3 = config29 != null ? Boolean.valueOf(config29.getShowSuuntoPartnerBtn()) : null;
        JsonContent config30 = it.getConfig();
        Boolean boolValueOf4 = config30 != null ? Boolean.valueOf(config30.getIsSupportSleepRhythm()) : null;
        JsonContent config31 = it.getConfig();
        Boolean boolValueOf5 = config31 != null ? Boolean.valueOf(config31.getShowWatchFacePrice()) : null;
        JsonContent config32 = it.getConfig();
        Boolean boolValueOf6 = config32 != null ? Boolean.valueOf(config32.getWeatherLocationByAndroid()) : null;
        JsonContent config33 = it.getConfig();
        String mediaSessionBlacklist2 = config33 != null ? config33.getMediaSessionBlacklist() : null;
        JsonContent config34 = it.getConfig();
        Boolean boolValueOf7 = config34 != null ? Boolean.valueOf(config34.getShowSportFocusNotification()) : null;
        JsonContent config35 = it.getConfig();
        Boolean boolValueOf8 = config35 != null ? Boolean.valueOf(config35.getShowVipBanner()) : null;
        JsonContent config36 = it.getConfig();
        String notificationSpotlightAppInWhiteList2 = config36 != null ? config36.getNotificationSpotlightAppInWhiteList() : null;
        JsonContent config37 = it.getConfig();
        Boolean boolValueOf9 = config37 != null ? Boolean.valueOf(config37.getIsHFPConnect()) : null;
        JsonContent config38 = it.getConfig();
        Long lValueOf = config38 != null ? Long.valueOf(config38.getAutoShowKeepAlive()) : null;
        JsonContent config39 = it.getConfig();
        Boolean boolValueOf10 = config39 != null ? Boolean.valueOf(config39.getIsSupportSchema()) : null;
        JsonContent config40 = it.getConfig();
        Logger.i(TAG, "requestAppConfigIfNecessary: ble:" + boolValueOf + ", spp: " + boolValueOf2 + "notificationAppInWhiteList.isNullOrEmpty = " + z2 + "notificationAppInForegroundWhiteList.isNullOrEmpty = " + z3 + " carrierEntries = " + z4 + " carrierHostBlackList = " + z + " showSuuntoPartnerBtn= " + boolValueOf3 + "it.config?.isSupportSleepRhythm=" + boolValueOf4 + " showWatchFacePrice= " + boolValueOf5 + " weatherLocationByAndroid=" + boolValueOf6 + " mediasessionBlacklist=" + mediaSessionBlacklist2 + " showFocusNotificationSport=" + boolValueOf7 + " showVipBanner=" + boolValueOf8 + " notificationSpotlightAppInWhiteList=" + notificationSpotlightAppInWhiteList2 + " IS_HFP_CONNECT=" + boolValueOf9 + " autoShowKeepAlive=" + lValueOf + " isSupportSchema=" + boolValueOf10 + " routeNewFacePoolFromEntrance=" + (config40 != null ? Boolean.valueOf(config40.getRouteNewFacePoolFromEntrance()) : null));
        lastRequestTime = System.currentTimeMillis();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAppConfigIfNecessary$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "requestAppConfigIfNecessary: fail " + it);
        it.printStackTrace();
        return Unit.INSTANCE;
    }

    public final void requestAppConfigIfNecessary() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = lastRequestTime;
            if (j == 0 || jCurrentTimeMillis - j >= Constants.TIME_OFFSET) {
                Logger.d(TAG, "requestAppConfigIfNecessary() called");
                getMRequest().getConfig(new Function1() { // from class: g0b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GlobalConfig.requestAppConfigIfNecessary$lambda$1((AppConfigs) obj);
                    }
                }, new Function1() { // from class: h0b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GlobalConfig.requestAppConfigIfNecessary$lambda$2((ApiException) obj);
                    }
                });
            }
        }
    }
}
