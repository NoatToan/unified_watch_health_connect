package defpackage;

import android.content.Context;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class qqp {
    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int d(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
    }
}
