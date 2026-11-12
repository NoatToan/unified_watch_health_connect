package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.health.servicesui.R;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.wup;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class wup {
    public static void b(final Context context, int i, int i2) {
        if (context instanceof Activity) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
            builder.a(context.getString(i2)).a(context.getString(i), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.utils.NoBindDeviceDialogUtil$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wup.b(context);
                }
            }).d(context.getString(R.string.IDS_settings_button_cancal_ios_btn), new View.OnClickListener() { // from class: wuv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("NoBindDeviceDialogUtil", "onClick negative button");
                }
            });
            builder.c().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.health.MainActivity");
        intent.setFlags(67108864);
        intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
        intent.putExtra("SHORTCUT", "SC_DEVICE");
        iov.d(context, intent);
    }
}
