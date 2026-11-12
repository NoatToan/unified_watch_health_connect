package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.huawei.wear.R;
import com.huawei.wear.wallet.ui.dialog.WidgetBuilder;

/* JADX INFO: loaded from: classes46.dex */
public class yfj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53333c = "com.huawei.wear.wallet.ui.dialog.HwDialogUtil";

    public static void c(Dialog dialog, int i, double d, boolean z) {
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            int dimensionPixelOffset = dialog.getContext().getResources().getDimensionPixelOffset(R.dimen.commen_margin_16dp_wallet);
            String str = f53333c;
            xnd.e(str, "setDialogWidthAndHeight [dialog] phone not pad or open");
            attributes.y = i;
            attributes.gravity = 81;
            int iC = yfo.c(dialog.getContext());
            int iB = yfo.b(dialog.getContext());
            xnd.e(str, "setDialogWidthAndHeight [dialog] phone width | height : " + iC + " | " + iB);
            if (iC > iB) {
                attributes.width = iB - (dimensionPixelOffset * 2);
            } else {
                attributes.width = iC - (dimensionPixelOffset * 2);
            }
            xnd.e(str, "setDialogWidthAndHeight [dialog] lp w | h: " + attributes.width + " | " + attributes.height);
            window.setAttributes(attributes);
        }
    }

    public static void e(boolean z, Dialog dialog) {
        if (z) {
            return;
        }
        dialog.dismiss();
    }

    public static void b(View view, View view2, View view3) {
        if (view2.getVisibility() == 0 && view3.getVisibility() == 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public static void e(TextView textView, String str) {
        if (textView == null || TextUtils.isEmpty(str)) {
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    public static void d(Context context, LinearLayout linearLayout) {
        int i;
        context.getResources().getConfiguration();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.commen_margin_16dp);
        if (context instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.heightPixels / 5;
        } else {
            i = 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (WidgetBuilder.d(context) || yfo.a(context) == 1) {
            xnd.e(f53333c, "setDialogWidth [dialog] phone pad or open");
            yfo.b(context);
            int iC = yfo.c(context);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.commen_margin_448dp);
            layoutParams.height = -2;
            int i2 = iC - (dimensionPixelOffset * 2);
            if (dimensionPixelOffset2 > i2) {
                layoutParams.width = i2;
                layoutParams.setMargins(0, i, 0, 0);
                return;
            } else {
                layoutParams.width = dimensionPixelOffset2;
                layoutParams.setMargins(0, 0, 0, 0);
                return;
            }
        }
        layoutParams.width = yfo.c(context) - (dimensionPixelOffset * 2);
        layoutParams.setMargins(0, 0, 0, 0);
        String str = f53333c;
        xnd.e(str, "setDialogWidth [dialog] phone not pad or open w | h: " + layoutParams.width + " | " + layoutParams.height);
        xnd.e(str, "setDialogWidth [dialog] lp top | w | h: " + i + "|" + layoutParams.width + " | " + layoutParams.height);
        linearLayout.setLayoutParams(layoutParams);
    }

    public static void a(final TextView textView, TextView textView2, Context context, int i) {
        if (textView2.getVisibility() == 0 || textView.getVisibility() != 0) {
            return;
        }
        textView.setPadding(0, context.getResources().getDimensionPixelOffset(i), 0, 0);
        textView.post(new Runnable() { // from class: yfj.2
            @Override // java.lang.Runnable
            public void run() {
                if (textView.getLineCount() == 1) {
                    textView.setGravity(1);
                } else {
                    textView.setGravity(GravityCompat.START);
                }
            }
        });
    }

    public static void e(Dialog dialog, int i, double d) {
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (WidgetBuilder.d(dialog.getContext())) {
                int dimensionPixelOffset = dialog.getContext().getResources().getDimensionPixelOffset(R.dimen.commen_margin_16dp);
                int dimensionPixelOffset2 = dialog.getContext().getResources().getDimensionPixelOffset(R.dimen.commen_margin_448dp);
                int iC = yfo.c(dialog.getContext());
                attributes.height = -2;
                int i2 = iC - dimensionPixelOffset;
                if (dimensionPixelOffset2 > i2) {
                    attributes.width = i2;
                } else {
                    attributes.width = dimensionPixelOffset2;
                }
            } else {
                int dimensionPixelOffset3 = dialog.getContext().getResources().getDimensionPixelOffset(R.dimen.commen_margin_16dp);
                xnd.e(f53333c, "current dialog device is not pad");
                attributes.y = i;
                attributes.gravity = 80;
                int iC2 = yfo.c(dialog.getContext());
                int iB = yfo.b(dialog.getContext());
                if (iC2 > iB) {
                    attributes.width = iB - (dimensionPixelOffset3 * 2);
                } else {
                    attributes.width = iC2 - (dimensionPixelOffset3 * 2);
                }
            }
            window.setAttributes(attributes);
        }
    }
}
