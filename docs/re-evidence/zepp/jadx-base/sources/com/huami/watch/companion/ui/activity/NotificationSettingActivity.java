package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import com.huami.watch.companion.R;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.notification.AppSettingActivity;
import com.huami.watch.companion.notification.NotificationManager;
import com.huami.watch.companion.notification.NotificationUtil;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationSettingActivity extends Activity implements View.OnClickListener {
    private static final String g = "NotificationSettingActivity";
    private Switch a;
    private View b;
    private View c;
    private Switch d;
    private Switch e;
    private Switch f;

    private void b() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: jh5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d(view);
            }
        });
        actionbarLayout.setTitleText(getString(R.string.notification_setting));
    }

    private void c() {
        this.a = (Switch) findViewById(R.id.enable_notification);
        this.b = findViewById(R.id.noti_wechat_friend_msg_mask_view);
        this.c = findViewById(R.id.noti_app_blacklist_mask_view);
        this.a.setOnClickListener(this);
        findViewById(R.id.noti_app_blacklist_view).setOnClickListener(this);
        findViewById(R.id.noti_wechat_friend_msg_view).setOnClickListener(this);
        findViewById(R.id.notification_enable_setting).setOnClickListener(this);
        Switch r0 = (Switch) findViewById(R.id.enable_screen_on_ignore);
        this.d = r0;
        r0.setOnClickListener(this);
        findViewById(R.id.layout_screen_on_ignore).setOnClickListener(this);
        this.d.setChecked(NotificationManager.getManager(this).isScreenONIgnore());
        Switch r1 = (Switch) findViewById(R.id.enable_music_controller);
        this.e = r1;
        r1.setOnClickListener(this);
        View viewFindViewById = findViewById(R.id.layout_music_controller);
        viewFindViewById.setOnClickListener(this);
        if (DeviceUtil.isCurrentXihuSeries(this)) {
            viewFindViewById.setVisibility(8);
        }
        this.e.setChecked(UserSettings.getBoolean(getContentResolver(), UserSettingsKeys.KEY_WATCH_MUSIC_CONTROLLER, false));
        if (!Config.isLocaleChina(this)) {
            findViewById(R.id.noti_wechat_setting_container).setVisibility(8);
        }
        findViewById(R.id.notification_setting_sport_sync).setOnClickListener(this);
        Switch r2 = (Switch) findViewById(R.id.switch_setting_sport_sync);
        this.f = r2;
        r2.setOnClickListener(this);
        this.f.setChecked(NotificationManager.getManager(this).IsSportSyncSuccessON());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        onBackPressed();
    }

    private void e(Context context, boolean z) {
        Log.d(g, "Enable MusicController : " + z, new Object[0]);
        this.e.setChecked(z);
        UserSettings.putBoolean(context.getContentResolver(), UserSettingsKeys.KEY_WATCH_MUSIC_CONTROLLER, z);
        SyncUtil.sendEnableMusicControl(context, z);
    }

    private void f(boolean z) {
        this.f.setChecked(z);
        NotificationManager.getManager(this).setSportSyncSuccessON(z);
    }

    private void g(boolean z) {
        this.a.setChecked(z);
        onClickEnableNls(this, z);
        i(z);
    }

    private void h(boolean z) {
        this.d.setChecked(z);
        NotificationManager.getManager(this).setScreenOnIgnore(z);
    }

    private void i(boolean z) {
        this.b.setVisibility(z ? 8 : 0);
        this.c.setVisibility(z ? 8 : 0);
    }

    private void j() {
        boolean zIsNLSAvailable = NotificationManager.getManager(this).isNLSAvailable(this);
        this.a.setChecked(zIsNLSAvailable);
        i(zIsNLSAvailable);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.noti_app_blacklist_view) {
            Intent intent = new Intent(this, (Class<?>) AppSettingActivity.class);
            intent.addFlags(536870912);
            startActivity(intent);
            return;
        }
        if (id == R.id.noti_wechat_friend_msg_view) {
            Intent intent2 = new Intent(this, (Class<?>) WechatFriendMsgSettingActivity.class);
            intent2.addFlags(536870912);
            startActivity(intent2);
            return;
        }
        if (id == R.id.notification_enable_setting) {
            g(!this.a.isChecked());
            return;
        }
        if (id == R.id.enable_notification) {
            g(this.a.isChecked());
            return;
        }
        if (id == R.id.layout_screen_on_ignore) {
            h(!this.d.isChecked());
            return;
        }
        if (id == R.id.enable_screen_on_ignore) {
            h(this.d.isChecked());
            return;
        }
        if (id == R.id.layout_music_controller) {
            e(this, !this.e.isChecked());
            return;
        }
        if (id == R.id.enable_music_controller) {
            e(this, this.e.isChecked());
        } else if (id == R.id.notification_setting_sport_sync) {
            f(!this.f.isChecked());
        } else if (id == R.id.switch_setting_sport_sync) {
            f(this.f.isChecked());
        }
    }

    public void onClickEnableNls(Context context, boolean z) {
        NotificationManager manager = NotificationManager.getManager(context);
        manager.setUserON(z);
        if (z) {
            NotificationUtil.NLS.refreshNLS(context);
            if (!manager.isSystemNLSPermissionEnabled(context)) {
                InitialState.toEnableSystemNLSPermissionTip(context);
            }
        }
        Analytics.event(context, AnalyticsEvents.EVENT_NOTI_SWITCH_STATE_CHANGED, Boolean.toString(z), null, 1);
        Analytics.event(context, AnalyticsEvents.EVENT_NOTI_SWITCH_STATE_CHANGED, Boolean.toString(!z), null, -1);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_notification_setting);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        b();
        c();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        j();
    }
}
