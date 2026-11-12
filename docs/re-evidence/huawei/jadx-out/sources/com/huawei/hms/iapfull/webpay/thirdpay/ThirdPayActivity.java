package com.huawei.hms.iapfull.webpay.thirdpay;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.iapfull.R;
import com.huawei.hms.iapfull.a1;
import com.huawei.hms.iapfull.n0;
import com.huawei.hms.iapfull.pay.m;
import com.huawei.hms.iapfull.y0;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.ui.commonui.base.BaseDialog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes34.dex */
public class ThirdPayActivity extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlertDialog f13795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13796c;

    @Override // com.huawei.hms.iapfull.n0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y0.b("ThirdPayActivity", "onCreate");
        SafeIntent safeIntent = new SafeIntent(getIntent());
        String stringExtra = safeIntent.getStringExtra("alipay_sign_url");
        if (!TextUtils.isEmpty(stringExtra) && m.a(this, stringExtra)) {
            y0.b("ThirdPayActivity", "call alipay sign success");
            this.f13796c = 5;
            b();
            return;
        }
        String stringExtra2 = safeIntent.getStringExtra("wechat_sign_appId");
        String stringExtra3 = safeIntent.getStringExtra("wechat_sign_preEntrustwebId");
        if (TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(stringExtra3) || !m.a(this, stringExtra2, stringExtra3)) {
            y0.a("ThirdPayActivity", "onCreate illegal params");
            finish();
        } else {
            y0.b("ThirdPayActivity", "call wechat sign success");
            this.f13796c = 17;
            b();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        y0.b("ThirdPayActivity", "onNewIntent");
        SafeIntent safeIntent = new SafeIntent(intent);
        if (safeIntent.getBooleanExtra("wechat_sign_result", false)) {
            a(-1);
            return;
        }
        if (!"iapfull".equals(safeIntent.getScheme())) {
            y0.a("ThirdPayActivity", "scheme illegal.");
            a(0);
            return;
        }
        Uri data = safeIntent.getData();
        if (data == null) {
            y0.a("ThirdPayActivity", "scheme getData isEmpty.");
            a(0);
            return;
        }
        if ("/alipaysignresult".equals(data.getPath())) {
            y0.b("ThirdPayActivity", "get alipay sign result");
            String encodedQuery = data.getEncodedQuery();
            if (!TextUtils.isEmpty(encodedQuery)) {
                String strA = a1.a(encodedQuery);
                if (TextUtils.isEmpty(strA)) {
                    y0.a("ThirdPayHelper", "parseAlipayResult result is null");
                } else {
                    String str = (String) ((HashMap) a1.a(strA, "&", false)).get("is_success");
                    y0.b("ThirdPayHelper", "parseAlipayResult flag " + str);
                    if (ExifInterface.GPS_DIRECTION_TRUE.equals(str)) {
                        y0.b("ThirdPayActivity", "alipay sign success");
                        a(-1);
                        return;
                    }
                }
            }
        }
        y0.a("ThirdPayActivity", "onNewIntentDispatch illegal.");
        a(0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        y0.b("ThirdPayActivity", "onStart");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        y0.b("ThirdPayActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    private void b() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.hwpay_ask_have_pay_tip);
        builder.setPositiveButton(R.string.hwpay_have_done, new a());
        builder.setNegativeButton(R.string.hwpay_havenot_done, new b());
        builder.setOnKeyListener(new c());
        AlertDialog alertDialogCreate = builder.create();
        this.f13795b = alertDialogCreate;
        alertDialogCreate.show();
    }

    class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            y0.b("ThirdPayActivity", "user click finish");
            ThirdPayActivity.this.a(-1);
        }

        a() {
        }
    }

    class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            y0.b("ThirdPayActivity", "user click cancel");
            ThirdPayActivity.this.a(0);
        }

        b() {
        }
    }

    class c implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            y0.b("ThirdPayActivity", "user click back");
            ThirdPayActivity.this.a(0);
            return true;
        }

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        y0.b("ThirdPayActivity", "finishCallback result " + i + " pay type " + this.f13796c);
        AlertDialog alertDialog = this.f13795b;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f13795b.dismiss();
        }
        setResult(i);
        finish();
    }
}
