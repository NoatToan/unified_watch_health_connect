package com.xiaomi.hm.health.apprate;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/apprate/AppRateManager;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "time", "", "setLastShowTime", "", "canShowRateDialog", "", "a", "Ljava/lang/String;", "PREF_NAME_APP_RATE", "b", "PREF_KEY_LAST_SHOW_TIME", "c", "J", "THRESHOLD_TIME", "Lcom/xiaomi/hm/health/apprate/AppRateButtonListener;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/apprate/AppRateButtonListener;", "getButtonListener", "()Lcom/xiaomi/hm/health/apprate/AppRateButtonListener;", "setButtonListener", "(Lcom/xiaomi/hm/health/apprate/AppRateButtonListener;)V", "buttonListener", "<init>", "()V", "apprate_release"}, k = 1, mv = {1, 5, 1})
public final class AppRateManager {

    @NotNull
    public static final AppRateManager INSTANCE = new AppRateManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PREF_NAME_APP_RATE = "AppRate";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PREF_KEY_LAST_SHOW_TIME = "LastShowTime";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long THRESHOLD_TIME = 2592000000L;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static AppRateButtonListener buttonListener;

    private AppRateManager() {
    }

    public final boolean canShowRateDialog(@NotNull Context context) {
        long j = context.getSharedPreferences(PREF_NAME_APP_RATE, 0).getLong(PREF_KEY_LAST_SHOW_TIME, 0L);
        return j <= 0 || System.currentTimeMillis() - j > 2592000000L;
    }

    @Nullable
    public final AppRateButtonListener getButtonListener() {
        return buttonListener;
    }

    public final void setButtonListener(@Nullable AppRateButtonListener appRateButtonListener) {
        buttonListener = appRateButtonListener;
    }

    public final void setLastShowTime(@NotNull Context context, long time) {
        context.getSharedPreferences(PREF_NAME_APP_RATE, 0).edit().putLong(PREF_KEY_LAST_SHOW_TIME, time).apply();
    }
}
