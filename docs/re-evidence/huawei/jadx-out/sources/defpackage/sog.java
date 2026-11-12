package defpackage;

import android.app.Activity;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.healthheadlinecard.utils.MediaCenterCallback;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes17.dex */
public class sog {
    public static boolean e() {
        boolean zB = SharedPreferenceManager.b("healthHeadLines", "isNonWifiTipsShow", true);
        boolean zK = NetworkUtil.k();
        boolean zH = NetworkUtil.h();
        LogUtil.a("MediaCenter", "isNetworkConnected = ", Boolean.valueOf(zH), "; isWifiConnected = ", Boolean.valueOf(zK), "; isNeedShowWifiTips = ", Boolean.valueOf(zB));
        return zH && !zK && zB;
    }

    public static void d(MediaCenterCallback mediaCenterCallback) {
        if (e()) {
            b(mediaCenterCallback);
        } else {
            mediaCenterCallback.onResponse(0, "noNeedToShowDialog");
        }
    }

    private static void b(final MediaCenterCallback mediaCenterCallback) {
        LogUtil.a("MediaCenter", "showWifiTipsDialog");
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.j("MediaCenter", "context is null when show mobile data dialog.");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activityJ);
        builder.b(R.string.IDS_use_rate_of_flow).c(R.string.IDS_continue, new View.OnClickListener() { // from class: sog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.a("healthHeadLines", "isNonWifiTipsShow", false);
                MediaCenterCallback mediaCenterCallback2 = mediaCenterCallback;
                if (mediaCenterCallback2 != null) {
                    mediaCenterCallback2.onResponse(0, "success");
                }
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: sog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaCenterCallback mediaCenterCallback2 = mediaCenterCallback;
                if (mediaCenterCallback2 != null) {
                    mediaCenterCallback2.onResponse(-1, ParamConstants.CallbackMethod.ON_FAIL);
                }
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }
}
