package com.huami.message.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.huami.account.utils.b;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bR\u001c\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/huami/message/utils/AppUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getPackageName", "", "getScreenWith", "", "dpValue", "dip2px", "pxValue", "px2dip", "a", "Ljava/lang/String;", "getMIDONG_PACKAGE_NAME", "()Ljava/lang/String;", "MIDONG_PACKAGE_NAME", "b", "getMIDONG_PACKAGE_NAME1", "MIDONG_PACKAGE_NAME1", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class AppUtils {

    @NotNull
    public static final AppUtils INSTANCE = new AppUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String MIDONG_PACKAGE_NAME = "com.huami.watch.hmwatchmanager";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String MIDONG_PACKAGE_NAME1 = b.Amazfit;

    private AppUtils() {
    }

    public final int dip2px(@NotNull Context context, float dpValue) {
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @NotNull
    public final String getMIDONG_PACKAGE_NAME() {
        return MIDONG_PACKAGE_NAME;
    }

    @NotNull
    public final String getMIDONG_PACKAGE_NAME1() {
        return MIDONG_PACKAGE_NAME1;
    }

    @Nullable
    public final synchronized String getPackageName(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final int getScreenWith(@NotNull Context context) {
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final int px2dip(@NotNull Context context, float pxValue) {
        return (int) ((pxValue / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
