package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class wvn {
    public static void b(Context context, int i, int i2) {
        if (context instanceof Activity) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
            builder.a(context.getString(i2)).a(context.getString(i).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: wvn.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.d("DialogUtils", "onclick");
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            noTitleCustomAlertDialogC.setCancelable(false);
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            noTitleCustomAlertDialogC.show();
        }
    }

    public static boolean d(Context context, String str) {
        if (lsj.c(context, str)) {
            return true;
        }
        LogUtil.j("DialogUtils", "isInstallApp the APP is not installed");
        return false;
    }
}
