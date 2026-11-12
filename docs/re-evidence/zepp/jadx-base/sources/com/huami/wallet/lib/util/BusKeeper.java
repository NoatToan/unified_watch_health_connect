package com.huami.wallet.lib.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/huami/wallet/lib/util/BusKeeper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/SharedPreferences;", "a", "", "userId", "bulletinId", "", "keepBulletin", "", "isBulletinExist", "Ljava/lang/String;", "PREF_NAME", "b", "PREF_KEY_PREFIX", "<init>", "()V", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final class BusKeeper {

    @NotNull
    public static final BusKeeper INSTANCE = new BusKeeper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PREF_NAME = "BusKeeper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PREF_KEY_PREFIX = "BusKeeper";

    private BusKeeper() {
    }

    private final SharedPreferences a(Context context) {
        return context.getSharedPreferences("BusKeeper", 0);
    }

    @JvmStatic
    public static final boolean isBulletinExist(@NotNull Context context, @NotNull String userId, @NotNull String bulletinId) {
        return INSTANCE.a(context).getBoolean("BusKeeper _ " + userId + " _ " + bulletinId, false);
    }

    @JvmStatic
    public static final void keepBulletin(@NotNull Context context, @NotNull String userId, @NotNull String bulletinId) {
        INSTANCE.a(context).edit().putBoolean("BusKeeper _ " + userId + " _ " + bulletinId, true).apply();
    }
}
