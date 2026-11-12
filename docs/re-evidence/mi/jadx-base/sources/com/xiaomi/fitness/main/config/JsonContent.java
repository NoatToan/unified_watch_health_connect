package com.xiaomi.fitness.main.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u001a\u00104\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001a\u00107\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\u001a\u0010:\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001a\u0010@\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\u001a\u0010C\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\bR\u001a\u0010F\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R\u001a\u0010I\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR\u001a\u0010L\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR\u001a\u0010O\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010.\"\u0004\bQ\u00100R\u001a\u0010R\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R\u001a\u0010U\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0006\"\u0004\b[\u0010\bR\u001a\u0010\\\u001a\u00020]X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006b"}, d2 = {"Lcom/xiaomi/fitness/main/config/JsonContent;", "", "<init>", "()V", "isMiSportMigrateShow", "", "()Z", "setMiSportMigrateShow", "(Z)V", "miuiSystemConnection", "getMiuiSystemConnection", "setMiuiSystemConnection", "miuiSystemConnectionV2", "getMiuiSystemConnectionV2", "setMiuiSystemConnectionV2", "miuiSystemConnectionV3", "getMiuiSystemConnectionV3", "setMiuiSystemConnectionV3", "miuiSystemConnectionV4", "getMiuiSystemConnectionV4", "setMiuiSystemConnectionV4", "miuiSystemConnectionV5", "getMiuiSystemConnectionV5", "setMiuiSystemConnectionV5", "miuiSystemConnectionV6", "getMiuiSystemConnectionV6", "setMiuiSystemConnectionV6", "miuiSystemConnectionV7", "getMiuiSystemConnectionV7", "setMiuiSystemConnectionV7", "miuiSystemSPPConnection", "getMiuiSystemSPPConnection", "setMiuiSystemSPPConnection", "isAppChooseOpen", "setAppChooseOpen", "isSupportSleepRhythm", "setSupportSleepRhythm", "isSupportSchema", "setSupportSchema", "isSupportDeviceStatistics", "setSupportDeviceStatistics", "isSportTargetShareShow", "setSportTargetShareShow", "notificationAppInWhiteList", "", "getNotificationAppInWhiteList", "()Ljava/lang/String;", "setNotificationAppInWhiteList", "(Ljava/lang/String;)V", "notificationAppInForegroundWhiteList", "getNotificationAppInForegroundWhiteList", "setNotificationAppInForegroundWhiteList", "carrierEntries", "getCarrierEntries", "setCarrierEntries", "carrierHostBlackList", "getCarrierHostBlackList", "setCarrierHostBlackList", "show_motion_sensing_game_v2", "getShow_motion_sensing_game_v2", "setShow_motion_sensing_game_v2", "showSuuntoPartnerBtn", "getShowSuuntoPartnerBtn", "setShowSuuntoPartnerBtn", "showWatchFacePrice", "getShowWatchFacePrice", "setShowWatchFacePrice", "weatherLocationByAndroid", "getWeatherLocationByAndroid", "setWeatherLocationByAndroid", "mediaSessionBlacklist", "getMediaSessionBlacklist", "setMediaSessionBlacklist", "showSportFocusNotification", "getShowSportFocusNotification", "setShowSportFocusNotification", "showVipBanner", "getShowVipBanner", "setShowVipBanner", "notificationSpotlightAppInWhiteList", "getNotificationSpotlightAppInWhiteList", "setNotificationSpotlightAppInWhiteList", "showUpdaterDialogAppInBlackList", "getShowUpdaterDialogAppInBlackList", "setShowUpdaterDialogAppInBlackList", "isHFPConnect", "setHFPConnect", "routeNewFacePoolFromEntrance", "getRouteNewFacePoolFromEntrance", "setRouteNewFacePoolFromEntrance", "isSupportMenstrualPredict", "setSupportMenstrualPredict", "autoShowKeepAlive", "", "getAutoShowKeepAlive", "()J", "setAutoShowKeepAlive", "(J)V", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonContent {
    private boolean isMiSportMigrateShow;
    private boolean isSportTargetShareShow;
    private boolean isSupportMenstrualPredict;
    private boolean isSupportSleepRhythm;
    private boolean miuiSystemConnection;
    private boolean miuiSystemConnectionV2;
    private boolean miuiSystemConnectionV3;
    private boolean miuiSystemConnectionV4;
    private boolean miuiSystemConnectionV5;
    private boolean miuiSystemConnectionV6;
    private boolean miuiSystemConnectionV7;
    private boolean miuiSystemSPPConnection;
    private boolean routeNewFacePoolFromEntrance;
    private boolean showVipBanner;
    private boolean showWatchFacePrice;
    private boolean show_motion_sensing_game_v2;
    private boolean isAppChooseOpen = true;
    private boolean isSupportSchema = true;
    private boolean isSupportDeviceStatistics = true;

    @NotNull
    private String notificationAppInWhiteList = "";

    @NotNull
    private String notificationAppInForegroundWhiteList = "";

    @NotNull
    private String carrierEntries = "";

    @NotNull
    private String carrierHostBlackList = "";
    private boolean showSuuntoPartnerBtn = true;
    private boolean weatherLocationByAndroid = true;

    @NotNull
    private String mediaSessionBlacklist = "";
    private boolean showSportFocusNotification = true;

    @NotNull
    private String notificationSpotlightAppInWhiteList = "";

    @NotNull
    private String showUpdaterDialogAppInBlackList = "";
    private boolean isHFPConnect = true;
    private long autoShowKeepAlive = 86400;

    public final long getAutoShowKeepAlive() {
        return this.autoShowKeepAlive;
    }

    @NotNull
    public final String getCarrierEntries() {
        return this.carrierEntries;
    }

    @NotNull
    public final String getCarrierHostBlackList() {
        return this.carrierHostBlackList;
    }

    @NotNull
    public final String getMediaSessionBlacklist() {
        return this.mediaSessionBlacklist;
    }

    public final boolean getMiuiSystemConnection() {
        return this.miuiSystemConnection;
    }

    public final boolean getMiuiSystemConnectionV2() {
        return this.miuiSystemConnectionV2;
    }

    public final boolean getMiuiSystemConnectionV3() {
        return this.miuiSystemConnectionV3;
    }

    public final boolean getMiuiSystemConnectionV4() {
        return this.miuiSystemConnectionV4;
    }

    public final boolean getMiuiSystemConnectionV5() {
        return this.miuiSystemConnectionV5;
    }

    public final boolean getMiuiSystemConnectionV6() {
        return this.miuiSystemConnectionV6;
    }

    public final boolean getMiuiSystemConnectionV7() {
        return this.miuiSystemConnectionV7;
    }

    public final boolean getMiuiSystemSPPConnection() {
        return this.miuiSystemSPPConnection;
    }

    @NotNull
    public final String getNotificationAppInForegroundWhiteList() {
        return this.notificationAppInForegroundWhiteList;
    }

    @NotNull
    public final String getNotificationAppInWhiteList() {
        return this.notificationAppInWhiteList;
    }

    @NotNull
    public final String getNotificationSpotlightAppInWhiteList() {
        return this.notificationSpotlightAppInWhiteList;
    }

    public final boolean getRouteNewFacePoolFromEntrance() {
        return this.routeNewFacePoolFromEntrance;
    }

    public final boolean getShowSportFocusNotification() {
        return this.showSportFocusNotification;
    }

    public final boolean getShowSuuntoPartnerBtn() {
        return this.showSuuntoPartnerBtn;
    }

    @NotNull
    public final String getShowUpdaterDialogAppInBlackList() {
        return this.showUpdaterDialogAppInBlackList;
    }

    public final boolean getShowVipBanner() {
        return this.showVipBanner;
    }

    public final boolean getShowWatchFacePrice() {
        return this.showWatchFacePrice;
    }

    public final boolean getShow_motion_sensing_game_v2() {
        return this.show_motion_sensing_game_v2;
    }

    public final boolean getWeatherLocationByAndroid() {
        return this.weatherLocationByAndroid;
    }

    /* JADX INFO: renamed from: isAppChooseOpen, reason: from getter */
    public final boolean getIsAppChooseOpen() {
        return this.isAppChooseOpen;
    }

    /* JADX INFO: renamed from: isHFPConnect, reason: from getter */
    public final boolean getIsHFPConnect() {
        return this.isHFPConnect;
    }

    /* JADX INFO: renamed from: isMiSportMigrateShow, reason: from getter */
    public final boolean getIsMiSportMigrateShow() {
        return this.isMiSportMigrateShow;
    }

    /* JADX INFO: renamed from: isSportTargetShareShow, reason: from getter */
    public final boolean getIsSportTargetShareShow() {
        return this.isSportTargetShareShow;
    }

    /* JADX INFO: renamed from: isSupportDeviceStatistics, reason: from getter */
    public final boolean getIsSupportDeviceStatistics() {
        return this.isSupportDeviceStatistics;
    }

    /* JADX INFO: renamed from: isSupportMenstrualPredict, reason: from getter */
    public final boolean getIsSupportMenstrualPredict() {
        return this.isSupportMenstrualPredict;
    }

    /* JADX INFO: renamed from: isSupportSchema, reason: from getter */
    public final boolean getIsSupportSchema() {
        return this.isSupportSchema;
    }

    /* JADX INFO: renamed from: isSupportSleepRhythm, reason: from getter */
    public final boolean getIsSupportSleepRhythm() {
        return this.isSupportSleepRhythm;
    }

    public final void setAppChooseOpen(boolean z) {
        this.isAppChooseOpen = z;
    }

    public final void setAutoShowKeepAlive(long j) {
        this.autoShowKeepAlive = j;
    }

    public final void setCarrierEntries(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.carrierEntries = str;
    }

    public final void setCarrierHostBlackList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.carrierHostBlackList = str;
    }

    public final void setHFPConnect(boolean z) {
        this.isHFPConnect = z;
    }

    public final void setMediaSessionBlacklist(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mediaSessionBlacklist = str;
    }

    public final void setMiSportMigrateShow(boolean z) {
        this.isMiSportMigrateShow = z;
    }

    public final void setMiuiSystemConnection(boolean z) {
        this.miuiSystemConnection = z;
    }

    public final void setMiuiSystemConnectionV2(boolean z) {
        this.miuiSystemConnectionV2 = z;
    }

    public final void setMiuiSystemConnectionV3(boolean z) {
        this.miuiSystemConnectionV3 = z;
    }

    public final void setMiuiSystemConnectionV4(boolean z) {
        this.miuiSystemConnectionV4 = z;
    }

    public final void setMiuiSystemConnectionV5(boolean z) {
        this.miuiSystemConnectionV5 = z;
    }

    public final void setMiuiSystemConnectionV6(boolean z) {
        this.miuiSystemConnectionV6 = z;
    }

    public final void setMiuiSystemConnectionV7(boolean z) {
        this.miuiSystemConnectionV7 = z;
    }

    public final void setMiuiSystemSPPConnection(boolean z) {
        this.miuiSystemSPPConnection = z;
    }

    public final void setNotificationAppInForegroundWhiteList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notificationAppInForegroundWhiteList = str;
    }

    public final void setNotificationAppInWhiteList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notificationAppInWhiteList = str;
    }

    public final void setNotificationSpotlightAppInWhiteList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notificationSpotlightAppInWhiteList = str;
    }

    public final void setRouteNewFacePoolFromEntrance(boolean z) {
        this.routeNewFacePoolFromEntrance = z;
    }

    public final void setShowSportFocusNotification(boolean z) {
        this.showSportFocusNotification = z;
    }

    public final void setShowSuuntoPartnerBtn(boolean z) {
        this.showSuuntoPartnerBtn = z;
    }

    public final void setShowUpdaterDialogAppInBlackList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.showUpdaterDialogAppInBlackList = str;
    }

    public final void setShowVipBanner(boolean z) {
        this.showVipBanner = z;
    }

    public final void setShowWatchFacePrice(boolean z) {
        this.showWatchFacePrice = z;
    }

    public final void setShow_motion_sensing_game_v2(boolean z) {
        this.show_motion_sensing_game_v2 = z;
    }

    public final void setSportTargetShareShow(boolean z) {
        this.isSportTargetShareShow = z;
    }

    public final void setSupportDeviceStatistics(boolean z) {
        this.isSupportDeviceStatistics = z;
    }

    public final void setSupportMenstrualPredict(boolean z) {
        this.isSupportMenstrualPredict = z;
    }

    public final void setSupportSchema(boolean z) {
        this.isSupportSchema = z;
    }

    public final void setSupportSleepRhythm(boolean z) {
        this.isSupportSleepRhythm = z;
    }

    public final void setWeatherLocationByAndroid(boolean z) {
        this.weatherLocationByAndroid = z;
    }
}
