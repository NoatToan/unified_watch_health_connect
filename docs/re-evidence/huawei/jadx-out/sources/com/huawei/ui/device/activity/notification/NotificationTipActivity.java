package com.huawei.ui.device.activity.notification;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.device.R;
import defpackage.qsp;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationTipActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.notification_tip_layout);
        ((RelativeLayout) qsp.a(this, R.id.notification_tip)).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.notification.NotificationTipActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("NotificationTipActivity", "onclick");
                NotificationTipActivity.this.finish();
                NotificationTipActivity.this.overridePendingTransition(0, R.anim.notification_tip_close);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
