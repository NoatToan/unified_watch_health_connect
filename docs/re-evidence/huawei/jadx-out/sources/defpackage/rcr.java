package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.button.HealthButton;

/* JADX INFO: loaded from: classes16.dex */
public class rcr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f47142c = 9;
    private static int e = 15;

    public static void a(final HealthButton healthButton, final Activity activity) {
        final int[] iArr = {e};
        for (int i = 0; i < e - f47142c; i++) {
            healthButton.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: rcr.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (healthButton.getLineCount() > 1) {
                        WindowManager windowManager = activity.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager ? (WindowManager) activity.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) : null;
                        if (windowManager != null) {
                            int width = windowManager.getDefaultDisplay().getWidth();
                            ViewGroup.LayoutParams layoutParams = healthButton.getLayoutParams();
                            if (layoutParams.width == width) {
                                int[] iArr2 = iArr;
                                int i2 = iArr2[0] - 1;
                                iArr2[0] = i2;
                                healthButton.setTextSize(1, i2);
                                return;
                            }
                            layoutParams.width = width - qqp.a(activity, 64.0f);
                            healthButton.setLayoutParams(layoutParams);
                            return;
                        }
                        return;
                    }
                    healthButton.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }
}
