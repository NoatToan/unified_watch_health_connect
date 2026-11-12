package com.huawei.ui.device.activity.notification;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import defpackage.mir;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationSettingActivity extends NotificationBaseActivity {
    @Override // com.huawei.ui.device.activity.notification.NotificationBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("NotificationSettingActivity", "onCreate");
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("isFromDialog", false)) {
            if (mir.b(this, "NotificationSettingActivity") != null) {
                LogUtil.a("NotificationSettingActivity", "support OpenNotification by system");
                return;
            }
            this.h.setChecked(true);
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get("NTwe23AtQb8U");
            if (obj instanceof Uri) {
                LogUtil.a("NotificationSettingActivity", "sAppRouterUtils Uri");
                d(((Uri) obj).getPath());
            }
        }
    }

    public void d(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(BleConstants.KEY_PATH, str);
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_DEVICE_DEEPLINK.value(), linkedHashMap);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
