package com.huami.watch.companion.notification;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.huami.watch.companion.R;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.util.DeviceCompatibility;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationPermissionTipActivity extends Activity {

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InitialState.toEnableSystemNLSPermission(NotificationPermissionTipActivity.this);
            NotificationPermissionTipActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_notification_permission_tip);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        findViewById(R.id.to_setting).setOnClickListener(new a());
    }
}
