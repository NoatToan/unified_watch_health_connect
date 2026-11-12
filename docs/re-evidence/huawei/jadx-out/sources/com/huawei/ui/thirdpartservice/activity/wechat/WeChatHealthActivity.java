package com.huawei.ui.thirdpartservice.activity.wechat;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.main.api.WeChatApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.thirdpartservice.R;
import defpackage.lsy;
import health.compact.a.Services;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class WeChatHealthActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f29133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeChatApi f29134c;
    private HealthButton d;
    private HealthTextView e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wechat_health);
        this.f29132a = this;
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        lsy.a(new Runnable() { // from class: com.huawei.ui.thirdpartservice.activity.wechat.WeChatHealthActivity.3
            @Override // java.lang.Runnable
            public void run() {
                WeChatHealthActivity.this.f29134c = (WeChatApi) Services.b("Main", WeChatApi.class);
                if (WeChatHealthActivity.this.f29134c.isUserBind(WeChatHealthActivity.this.f29132a)) {
                    return;
                }
                WeChatHealthActivity.this.startActivity(new Intent(WeChatHealthActivity.this.f29132a, (Class<?>) WeChatConnectActivity.class));
                WeChatHealthActivity.this.finish();
            }
        });
    }

    private void d() {
        this.f29133b = (HealthTextView) findViewById(R.id.weChat_unbind_guide1);
        this.e = (HealthTextView) findViewById(R.id.weChat_unbind_guide2);
        this.d = (HealthButton) findViewById(R.id.weChat_rebind);
        this.f29133b.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_thirdparty_wechat_qrcode_unbind_guide1), 1));
        this.e.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_thirdparty_wechat_qrcode_unbind_guide2), 2));
        this.d.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("WeChatHealthActivity", "onClick view is null");
        } else if (view.getId() == R.id.weChat_rebind) {
            startActivity(new Intent(this.f29132a, (Class<?>) WeChatConnectActivity.class));
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
