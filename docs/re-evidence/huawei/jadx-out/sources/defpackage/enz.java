package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes7.dex */
public class enz {
    public static void e(Context context, String str) {
        if (context == null) {
            LogUtil.a("UiCommonUtil", "toastPrompt context is null");
            return;
        }
        Resources resources = context.getResources();
        if (resources != null) {
            HealthTextView healthTextView = new HealthTextView(context);
            healthTextView.setBackground(resources.getDrawable(R.drawable.common_ui_toast_frame_emui));
            healthTextView.setTextColor(resources.getColor(R.color.common_color_white));
            healthTextView.setTextSize(1, 12.0f);
            healthTextView.setText(str);
            healthTextView.setGravity(17);
            Toast toast = new Toast(context);
            toast.setView(healthTextView);
            toast.setDuration(0);
            toast.show();
            LogUtil.a("UiCommonUtil", "toastPrompt toast is showing");
        }
    }

    public static void b(Context context, int i) {
        if (context == null) {
            LogUtil.a("UiCommonUtil", "toastPrompt context is null");
            return;
        }
        Resources resources = context.getResources();
        if (resources == null) {
            LogUtil.a("UiCommonUtil", "toastPrompt context.getResources() is null");
        } else {
            e(context, resources.getString(i));
        }
    }
}
