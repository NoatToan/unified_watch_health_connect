package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.activity.adddevice.AllDeviceListActivity;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity;
import health.compact.a.GRSManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class ssy {
    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = GRSManager.c(BaseApplication.getContext()).getUrl("domainMessagecenterHicloud") + "/messageH5/html/HwHealthQRCode.html";
        if (!TextUtils.isEmpty(str2)) {
            if (str2.equalsIgnoreCase(str)) {
                LogUtil.a("R_QrCode_OldDeviceQrAdapter", "is ble watch qr.");
                return true;
            }
        } else {
            LogUtil.j("R_QrCode_OldDeviceQrAdapter", "oldWatchUrl is empty.");
        }
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainHealthVmall");
        if (TextUtils.isEmpty(url)) {
            LogUtil.j("R_QrCode_OldDeviceQrAdapter", "urlGrsDomain is empty");
            return false;
        }
        if (!str.toUpperCase(Locale.ENGLISH).startsWith(url.concat("/download/download.jsp?device=").toUpperCase(Locale.ENGLISH))) {
            return false;
        }
        LogUtil.a("R_QrCode_OldDeviceQrAdapter", "is aw watch qr.");
        return true;
    }

    public static void c(final QrCodeScanningActivity qrCodeScanningActivity) {
        if (qrCodeScanningActivity == null) {
            return;
        }
        qrCodeScanningActivity.runOnUiThread(new Runnable() { // from class: ssy.5
            @Override // java.lang.Runnable
            public void run() {
                NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(qrCodeScanningActivity);
                builder.a(qrCodeScanningActivity.getResources().getString(R.string.IDS_qrcode_old_device_tip));
                builder.a(qrCodeScanningActivity.getResources().getString(R.string.IDS_qrcode_old_device_go_pair), new View.OnClickListener() { // from class: ssy.5.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ssy.a(qrCodeScanningActivity);
                    }
                });
                builder.a(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: ssy.5.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        qrCodeScanningActivity.b();
                    }
                });
                if (qrCodeScanningActivity.isFinishing()) {
                    return;
                }
                builder.c().show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setClass(activity, AllDeviceListActivity.class);
            activity.startActivity(intent);
            activity.finish();
        } catch (ActivityNotFoundException e) {
            LogUtil.e("OldDeviceQrAdapter", "ActivityNotFoundException e:", e.getMessage());
        }
    }
}
