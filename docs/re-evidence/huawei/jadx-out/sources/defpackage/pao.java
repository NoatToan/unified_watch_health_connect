package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes13.dex */
public class pao {
    public static int e(Context context, float f) {
        if (context == null) {
            LogUtil.j("DensityUtil", "dip2px: context is null");
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static float d(Context context) {
        Resources resources;
        DisplayMetrics displayMetrics;
        if (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 1.0f;
        }
        return displayMetrics.density;
    }
}
