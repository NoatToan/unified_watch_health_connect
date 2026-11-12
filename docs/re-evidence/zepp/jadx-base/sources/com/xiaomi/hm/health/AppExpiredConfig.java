package com.xiaomi.hm.health;

import com.xmlywind.sdk.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/AppExpiredConfig;", "", "", Constants.IS_EXPIRED, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppExpiredConfig {

    @NotNull
    public static final AppExpiredConfig INSTANCE = new AppExpiredConfig();

    private AppExpiredConfig() {
    }

    @JvmStatic
    public static final boolean isExpired() {
        return System.currentTimeMillis() > AppExpiredConfigKt.toCalendar$default(BuildConfig.appExpiredDate, null, 1, null).getTimeInMillis();
    }
}
