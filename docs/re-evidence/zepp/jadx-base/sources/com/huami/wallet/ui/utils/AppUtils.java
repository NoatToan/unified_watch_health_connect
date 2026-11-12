package com.huami.wallet.ui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Lcom/huami/wallet/ui/utils/AppUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "pkgName", "", "isAppInstalled", "Landroid/app/Activity;", "phone", "", NotificationCompat.CATEGORY_CALL, "activity", "url", "goWeb", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AppUtils {

    @NotNull
    public static final AppUtils INSTANCE = new AppUtils();

    private AppUtils() {
    }

    public final void call(@NotNull Activity context, @NotNull String phone) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(Intrinsics.stringPlus("tel:", phone)));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final void goWeb(@NotNull Activity activity, @NotNull String url) {
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
    }

    public final boolean isAppInstalled(@NotNull Context context, @NotNull String pkgName) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(pkgName, 0);
        } catch (Exception e) {
            e.printStackTrace();
            packageInfo = null;
        }
        return packageInfo != null;
    }
}
