package com.mibi.sdk.deduct.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.mibi.sdk.DeductConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.MarketUtils;
import com.mibi.sdk.widget.AlertDialog;
import com.miui.tsmclient.analytics.AnalyticManager;
import com.unionpay.UPPayAssistEx;
import com.xiaomi.wearable.hm.BroadcastsKt;

/* JADX INFO: loaded from: classes5.dex */
public class UnionpayActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10179b = "UnionpayActivity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlertDialog f10180a;

    public class a implements MarketUtils.InstallPromptListener {
        public a() {
        }

        @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
        public void onCancel() {
            MibiLog.d(UnionpayActivity.f10179b, "cancel clicked");
            UnionpayActivity.this.b(2, "cancel install union-pay");
        }

        @Override // com.mibi.sdk.component.MarketUtils.InstallPromptListener
        public void onConfirm() {
            MibiLog.d(UnionpayActivity.f10179b, "confirm button clicked");
            UnionpayActivity.this.b(3, "go to install union-pay");
        }
    }

    public final void b(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("errDesc", str);
        setResult(i, intent);
        finish();
    }

    public final void d() {
        this.f10180a = MarketUtils.showInstallPrompt(this, getResources().getString(com.mibi.sdk.deduct.a.i, getResources().getString(com.mibi.sdk.deduct.a.l)), "com.unionpay", new a());
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        String str2 = f10179b;
        MibiLog.d(str2, "on activity result req : " + i + " ; res : " + i2);
        int i3 = 3;
        if (intent == null) {
            str = "data is null";
        } else {
            String stringExtra = intent.getStringExtra(AnalyticManager.KEY_PAY_RESULT);
            MibiLog.d(str2, "status : " + stringExtra);
            if ("success".equalsIgnoreCase(stringExtra)) {
                str = "union-pay deduct success";
                i3 = 1;
            } else if ("fail".equalsIgnoreCase(stringExtra)) {
                str = "union-pay deduct failed";
            } else if (BroadcastsKt.SILENT_PUSHING_CANCEL.equalsIgnoreCase(stringExtra)) {
                str = "union-pay deduct cancel";
                i3 = 2;
            } else {
                str = "unknown union-pay deduct status : " + stringExtra;
            }
        }
        MibiLog.d(str2, str);
        b(i3, str);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AlertDialog alertDialog = this.f10180a;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f10180a.dismiss();
        d();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = f10179b;
        MibiLog.d(str, "handle create");
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(DeductConstants.KEY_PAY_INFO);
        String stringExtra2 = intent.getStringExtra("mode");
        boolean zIsAppInstalled = MarketUtils.isAppInstalled(this, "com.unionpay");
        StringBuilder sb = new StringBuilder();
        sb.append("union-pay app installed : ");
        sb.append(zIsAppInstalled);
        sb.append(" ; saveInstanceState is null ? ");
        sb.append(bundle == null);
        MibiLog.d(str, sb.toString());
        if (!zIsAppInstalled) {
            d();
        } else if (bundle == null) {
            UPPayAssistEx.startPay(this, null, null, stringExtra, stringExtra2);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.f10180a;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                this.f10180a.dismiss();
            }
            this.f10180a = null;
        }
    }
}
