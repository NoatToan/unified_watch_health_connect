package defpackage;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes10.dex */
public class jer {
    public static int e() {
        Object systemService = BaseApplication.getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.j("Track_ScreenDescription", "getScreenHeight WindowManager is null or class cast exception");
            return 1920;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int a() {
        Object systemService = BaseApplication.getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.j("Track_ScreenDescription", "getScreenWidth WindowManager is null or class cast exception");
            return 1080;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int d(float f) {
        return qrs.d(BaseApplication.getContext(), f);
    }
}
