package com.huami.watch.companion.notification;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationTestActivity extends Activity {
    public View.OnClickListener a = new View.OnClickListener() { // from class: kh5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.b(view);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_notification_pushing_test);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar_noti_test);
        actionbarLayout.setTitleText(getString(R.string.notification_tester));
        actionbarLayout.setBackArrowClickListener(this.a);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
    }
}
