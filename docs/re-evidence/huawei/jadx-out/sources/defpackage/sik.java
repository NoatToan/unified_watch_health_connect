package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.homehealth.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class sik {
    public static void d(final Context context, String str) {
        if (context == null) {
            return;
        }
        new CustomTextAlertDialog.Builder(context).a(R.string.IDS_hwh_home_other_permissions_title).a(str).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: sik.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sik.b("from", 1, "click_type", 1, AnalyticsValue.HEALTH_HOME_DIALOG_20401108);
            }
        }).a(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: sik.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sik.b("from", 1, "click_type", 2, AnalyticsValue.HEALTH_HOME_DIALOG_20401108);
                qrs.al(context);
            }
        }).b().show();
    }

    public static void b(String str, int i, String str2, int i2, AnalyticsValue analyticsValue) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
        lmf.d().c(BaseApplication.b(), analyticsValue.value(), map, 0);
    }
}
