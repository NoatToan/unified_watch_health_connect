package defpackage;

import android.app.Activity;
import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;

/* JADX INFO: loaded from: classes16.dex */
public class qpb {
    private static int[] d = {0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float[] f46597a = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public static void d() {
        LogUtil.a("ScrollUtils", "resetData");
        int i = 0;
        while (true) {
            int[] iArr = d;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            f46597a[i] = 0.0f;
            i++;
        }
    }

    public static void d(Context context) {
        if (context instanceof Activity) {
            int identifier = context.getResources().getIdentifier("androidhwext:style/Theme.Emui.NoActionBar", null, null);
            Activity activity = (Activity) context;
            if (identifier == 0 && BaseActivity.isMiui()) {
                BaseActivity.setMiuiStatusBarMode(false, activity);
                return;
            }
            if (identifier == 0 && BaseActivity.isFlyme()) {
                BaseActivity.setMeizuStatusBarDarkIcon(activity.getWindow(), false);
            } else if (identifier == 0) {
                activity.getWindow().getDecorView().setSystemUiVisibility(1024);
            } else {
                activity.getWindow().setStatusBarColor(0);
            }
        }
    }
}
