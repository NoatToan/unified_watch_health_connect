package com.huawei.ui.device.activity.notification;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;

/* JADX INFO: loaded from: classes43.dex */
public class NotificationSmartReminderDescriptionActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.notification_smart_reminder_description_layout);
        if (getIntent() == null) {
            LogUtil.j("NotificationSmartReminderDescriptionActivity", "onCreate intent is null");
        } else {
            a();
        }
    }

    private void a() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.notify_open_smart_reminder_tips);
        String string = getString(R.string.IDS_notify_smart_reminder_tips1);
        String string2 = getString(R.string.IDS_notify_smart_reminder_tips2);
        SpannableString spannableString = new SpannableString(string);
        SpannableString spannableString2 = new SpannableString(string2);
        spannableString.setSpan(new BulletSpan(20), 0, string.length(), 0);
        spannableString2.setSpan(new BulletSpan(20), 0, string2.length(), 0);
        healthTextView.setText(TextUtils.concat(spannableString, System.lineSeparator(), spannableString2));
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.notify_close_smart_reminder_tips);
        String string3 = getString(R.string.IDS_notify_smart_reminder_tips3);
        SpannableString spannableString3 = new SpannableString(string3);
        spannableString3.setSpan(new BulletSpan(20), 0, string3.length(), 0);
        healthTextView2.setText(spannableString3);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
