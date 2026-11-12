package com.huawei.ui.commonui.dialog;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class HuaweiMobileServiceSetDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f23446c = "HuaweiMobileServiceSetDialog";

    public HuaweiMobileServiceSetDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f23447c;

        public Builder(Context context) {
            this.f23447c = context;
        }

        public HuaweiMobileServiceSetDialog e() {
            LogUtil.a(HuaweiMobileServiceSetDialog.f23446c, "enter HuaweiMobileServiceSetDialog create.");
            HuaweiMobileServiceSetDialog huaweiMobileServiceSetDialog = new HuaweiMobileServiceSetDialog(this.f23447c, R.style.CustomDialog);
            View viewInflate = ((LayoutInflater) this.f23447c.getSystemService("layout_inflater")).inflate(R.layout.huawei_mobile_service_alert_dialog, (ViewGroup) null);
            ((HealthTextView) viewInflate.findViewById(R.id.note_message)).setText(String.format(Locale.ENGLISH, this.f23447c.getResources().getString(R.string.IDS_hw_plugin_account_hwid), qrs.f(this.f23447c)));
            b((HealthButton) viewInflate.findViewById(R.id.note_positiveButton), huaweiMobileServiceSetDialog);
            huaweiMobileServiceSetDialog.setContentView(viewInflate);
            huaweiMobileServiceSetDialog.setCancelable(false);
            return huaweiMobileServiceSetDialog;
        }

        private void b(HealthButton healthButton, final HuaweiMobileServiceSetDialog huaweiMobileServiceSetDialog) {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.HuaweiMobileServiceSetDialog.Builder.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    huaweiMobileServiceSetDialog.dismiss();
                    Builder.this.c();
                }
            });
        }

        public void b(HuaweiMobileServiceSetDialog huaweiMobileServiceSetDialog) {
            LogUtil.a(HuaweiMobileServiceSetDialog.f23446c, "enter dismissDialog.");
            if (huaweiMobileServiceSetDialog == null || !huaweiMobileServiceSetDialog.isShowing()) {
                return;
            }
            huaweiMobileServiceSetDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.commonui.dialog.HuaweiMobileServiceSetDialog.Builder.1
                @Override // java.lang.Runnable
                public void run() {
                    final String str;
                    GRSManager gRSManagerC = GRSManager.c(Builder.this.f23447c);
                    String commonCountryCode = gRSManagerC.getCommonCountryCode();
                    String noCheckUrl = gRSManagerC.getNoCheckUrl("domainTipsResDbankcdn", commonCountryCode);
                    if (TextUtils.isEmpty(noCheckUrl)) {
                        LogUtil.j(HuaweiMobileServiceSetDialog.f23446c, "obtainHelpUrlDomain onCallBackSuccess urlDomain is empty");
                        return;
                    }
                    if ("CN".equalsIgnoreCase(commonCountryCode)) {
                        str = noCheckUrl + "/SmartWear/mobilephone_note/EMUI8.0/C001B001/zh-CN/index.html";
                    } else {
                        str = noCheckUrl + "/handbook/SmartWear/mobilephone_note/EMUI8.0/C001B001/zh-CN/index.html";
                    }
                    HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.commonui.dialog.HuaweiMobileServiceSetDialog.Builder.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            HuaweiMobileServiceSetDialog.a(Builder.this.f23447c, 0, str);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context, int i, String str) {
        LogUtil.d(f23446c, "startWebViewActivity() jumpModeKey = ", Integer.valueOf(i));
        if (!CommonUtil.w(context)) {
            str = str.replace("zh-CN", "en-US");
        }
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str);
        intent.putExtra(Constants.JUMP_MODE_KEY, i);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e(f23446c, "ActivityNotFoundException", e.getMessage());
        }
    }
}
