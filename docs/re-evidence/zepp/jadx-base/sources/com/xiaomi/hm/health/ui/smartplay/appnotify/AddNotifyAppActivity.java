package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.os.Bundle;
import com.huami.mifit.analytics.Analytics;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.utils.UIStandardUtilKt;

/* JADX INFO: loaded from: classes22.dex */
public class AddNotifyAppActivity extends BaseTitleActivity {
    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notify_app);
        UIStandardUtilKt.setUnifyTitleStyle(this, getString(R.string.add_alert_app));
        AddNotifyAppFragment addNotifyAppFragment = new AddNotifyAppFragment();
        addFragment(addNotifyAppFragment, R.id.container);
        new AddNotifyAppPresenter(this, addNotifyAppFragment);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.event(this, StatEvent.EventId.APP_PUSH_MANAGEMENT_VIEW_NUM);
    }
}
