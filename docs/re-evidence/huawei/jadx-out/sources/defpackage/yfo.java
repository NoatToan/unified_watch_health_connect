package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes46.dex */
class yfo {
    yfo() {
    }

    public static int c(Context context) {
        return d(context).widthPixels;
    }

    private static DisplayMetrics d(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int b(Context context) {
        return d(context).heightPixels;
    }

    public static int a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (((float) displayMetrics.heightPixels) / ((float) displayMetrics.widthPixels) <= 1.1428572f && context.getResources().getConfiguration().screenHeightDp >= 400) ? 1 : 2;
    }
}
