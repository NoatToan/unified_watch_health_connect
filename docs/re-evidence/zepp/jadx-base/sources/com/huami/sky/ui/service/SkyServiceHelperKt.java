package com.huami.sky.ui.service;

import com.huami.sky.service.SkyNotificationService;
import com.huami.sky.service.SkyService;
import com.huami.sky.ui.navigation.HMAdNavigation;
import com.huami.sky.ui.navigation.HMUpdateManager;
import com.huami.web.service.WebViewService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0013\u0010\u0003\u001a\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0013\u0010\u000b\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0013\u0010\u000f\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0013\u0010\u0013\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/huami/sky/service/SkyService;", "getSkyService", "()Lcom/huami/sky/service/SkyService;", "skyService", "Lcom/huami/web/service/WebViewService;", "getWebViewService", "()Lcom/huami/web/service/WebViewService;", "webViewService", "Lcom/huami/sky/service/SkyNotificationService;", "getSkyNotificationService", "()Lcom/huami/sky/service/SkyNotificationService;", "skyNotificationService", "Lcom/huami/sky/ui/navigation/HMAdNavigation;", "getSkyAdNavigation", "()Lcom/huami/sky/ui/navigation/HMAdNavigation;", "skyAdNavigation", "Lcom/huami/sky/ui/navigation/HMUpdateManager;", "getSkyUpdateManager", "()Lcom/huami/sky/ui/navigation/HMUpdateManager;", "skyUpdateManager", "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkyServiceHelperKt {
    @NotNull
    public static final HMAdNavigation getSkyAdNavigation() {
        return SkyServiceHelper.INSTANCE.getHM_AD_NAVIGATION();
    }

    @NotNull
    public static final SkyNotificationService getSkyNotificationService() {
        return SkyServiceHelper.INSTANCE.getSKY_NOTIFICATION_SERVICE();
    }

    @NotNull
    public static final SkyService getSkyService() {
        return SkyServiceHelper.INSTANCE.getSKY_SERVICE();
    }

    @NotNull
    public static final HMUpdateManager getSkyUpdateManager() {
        return SkyServiceHelper.INSTANCE.getHM_UPDATE_MANAGER();
    }

    @NotNull
    public static final WebViewService getWebViewService() {
        return SkyServiceHelper.INSTANCE.getWEB_VIEW_SERVICE();
    }
}
