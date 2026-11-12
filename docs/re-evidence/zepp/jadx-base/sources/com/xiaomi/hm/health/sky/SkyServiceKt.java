package com.xiaomi.hm.health.sky;

import com.huami.sky.service.SkyNavigation;
import com.huami.sky.service.SkyNotificationService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/huami/sky/service/SkyNavigation;", "a", "Lcom/huami/sky/service/SkyNavigation;", "getSkyNavigation", "()Lcom/huami/sky/service/SkyNavigation;", "skyNavigation", "Lcom/huami/sky/service/SkyNotificationService;", "b", "Lcom/huami/sky/service/SkyNotificationService;", "getSkyNotification", "()Lcom/huami/sky/service/SkyNotificationService;", "skyNotification", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class SkyServiceKt {

    @NotNull
    private static final SkyNavigation a;

    @NotNull
    private static final SkyNotificationService b;

    static {
        SkyService skyService = SkyService.INSTANCE;
        a = skyService.getSKY_NAVIGATION();
        b = skyService.getSKY_NOTIFICATION();
    }

    @NotNull
    public static final SkyNavigation getSkyNavigation() {
        return a;
    }

    @NotNull
    public static final SkyNotificationService getSkyNotification() {
        return b;
    }
}
