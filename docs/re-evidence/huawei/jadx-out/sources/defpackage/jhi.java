package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Window;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.watchface.videoedit.utils.ScreenUtils;

/* JADX INFO: loaded from: classes10.dex */
public class jhi {
    public static boolean d(Context context) {
        if (context instanceof Activity) {
            return !((Activity) context).isFinishing();
        }
        return false;
    }

    public static int c(Context context, float f) {
        return (int) ((f * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int e(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    public static int c(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels - a(context);
    }

    public static int a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", OsType.ANDROID);
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? c(context, 25.0f) : dimensionPixelSize;
    }

    public static void b(Window window, boolean z) {
        if (window == null) {
            LogUtil.e(ScreenUtils.TAG, "openKeepScreenOn window is null");
        } else if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }
}
