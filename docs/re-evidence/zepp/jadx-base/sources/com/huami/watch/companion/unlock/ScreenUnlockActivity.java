package com.huami.watch.companion.unlock;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.watch.companion.R;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.util.HelpUtil;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Box;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;
import miui.bluetooth.ble.MiBleProfile;
import miui.bluetooth.ble.MiBleUnlockProfile;

/* JADX INFO: loaded from: classes16.dex */
public class ScreenUnlockActivity extends FragmentActivity implements View.OnClickListener {
    private static final String t = "ScreenUnlockActivity";
    private ImageView b;
    private LinearLayout f;
    private TextView g;
    private View h;
    private Switch i;
    private View j;
    private View k;
    private ImageView l;
    private View m;
    private View n;
    private ActionbarLayout o;
    private ViewGroup a = null;
    private ViewGroup c = null;
    private LinearLayout d = null;
    private LinearLayout e = null;
    private String p = null;
    private BLEStatueListenerAdapter q = new c();
    private MiBleProfile.IProfileStateChangeCallback r = new d();
    private MiBleUnlockProfile.OnUnlockStateChangeListener s = new e();

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ScreenUnlockActivity.this.n(z);
        }
    }

    public class b implements Transporter.DataSendResultCallback {
        public b() {
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            if (dataTransportResult.getResultCode() == 0) {
                Box.putUnlockOpenDialogDisplayed(true);
                UnlockUtil.saveIsUnlockUserOn(ScreenUnlockActivity.this, false);
                Log.d(ScreenUnlockActivity.t, "Send Watch Close Unlock State success", new Object[0]);
            } else {
                ScreenUnlockActivity.this.i.setChecked(true ^ ScreenUnlockActivity.this.i.isChecked());
                ScreenUnlockActivity screenUnlockActivity = ScreenUnlockActivity.this;
                Toast.makeText(screenUnlockActivity, screenUnlockActivity.getString(R.string.close_watch_unlock_failed), 0).show();
                Log.d(ScreenUnlockActivity.t, "Send Watch Close Unlock State failed", new Object[0]);
            }
        }
    }

    public class c extends BLEStatueListenerAdapter {
        public c() {
        }

        @Override // com.huami.watch.companion.unlock.BLEStatueListenerAdapter, com.huami.watch.companion.unlock.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return ScreenUnlockActivity.this.getString(R.string.unlock_screen_not_bound);
        }

        @Override // com.huami.watch.companion.unlock.BLEStatueListenerAdapter, com.huami.watch.companion.unlock.BTStatusFragment.BLEStatueListener
        public void onVisibleChange(boolean z) {
            if (z) {
                ScreenUnlockActivity.this.k();
            } else {
                ScreenUnlockActivity.this.l();
            }
        }
    }

    public class d implements MiBleProfile.IProfileStateChangeCallback {
        public d() {
        }

        @Override // miui.bluetooth.ble.MiBleProfile.IProfileStateChangeCallback
        public void onState(int i) {
            Log.v(ScreenUnlockActivity.t, "onState state = " + i, new Object[0]);
            if (i == 4) {
                ScreenUnlockActivity.this.s();
                MiuiUnlockAPI.getInstance(ScreenUnlockActivity.this).registerUnlockProfileListener(ScreenUnlockActivity.this.s);
                ScreenUnlockActivity.this.k.setVisibility(8);
            } else if (i == 0 && ScreenUnlockActivity.this.k.getVisibility() == 8) {
                ScreenUnlockActivity.this.k.setVisibility(0);
            }
        }
    }

    public class e implements MiBleUnlockProfile.OnUnlockStateChangeListener {
        public e() {
        }

        @Override // miui.bluetooth.ble.MiBleUnlockProfile.OnUnlockStateChangeListener
        public void onUnlocked(byte b) {
            Log.v(ScreenUnlockActivity.t, "onUnlocked state = " + ((int) b), new Object[0]);
        }
    }

    public class f implements UnlockDistanceSettingFragment.onDistanceItemClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public f(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // com.huami.watch.companion.unlock.UnlockDistanceSettingFragment.onDistanceItemClickListener
        public void onDistanceItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                ScreenUnlockActivity.this.t(1, true);
            } else if (i == 1) {
                ScreenUnlockActivity.this.t(2, true);
            } else if (i == 2) {
                ScreenUnlockActivity.this.t(3, true);
            }
            this.a.dismiss();
        }
    }

    public class g implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public g(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
            ScreenUnlockActivity.this.i.setChecked(!ScreenUnlockActivity.this.i.isChecked());
        }
    }

    public class h implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public class a implements Transporter.DataSendResultCallback {
            public a() {
            }

            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public void onResultBack(DataTransportResult dataTransportResult) {
                if (dataTransportResult.getResultCode() == 0) {
                    Log.d(ScreenUnlockActivity.t, "Send Watch Open Unlock State success", new Object[0]);
                    UnlockUtil.saveIsUnlockUserOn(ScreenUnlockActivity.this, true);
                } else {
                    ScreenUnlockActivity.this.i.setChecked(true ^ ScreenUnlockActivity.this.i.isChecked());
                    ScreenUnlockActivity screenUnlockActivity = ScreenUnlockActivity.this;
                    Toast.makeText(screenUnlockActivity, screenUnlockActivity.getString(R.string.open_watch_unlock_failed), 0).show();
                    Log.d(ScreenUnlockActivity.t, "Send Watch Open Unlock State failed", new Object[0]);
                }
            }
        }

        public h(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
            SyncUtil.syncExtraInfoToWatch(Transporter.get(ScreenUnlockActivity.this, "com.huami.watch.companion"), 1, new a());
        }
    }

    private void initView() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar_screen_unlock);
        this.o = actionbarLayout;
        actionbarLayout.setTitleText(getString(R.string.unlock_screen));
        this.o.setBackArrowClickListener(this);
        this.e = (LinearLayout) findViewById(R.id.unlock_screen_set_layout);
        this.d = (LinearLayout) findViewById(R.id.has_unlock_with_bracelet_ll);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.set_unlock_screen_password_layout);
        this.a = viewGroup;
        viewGroup.setOnClickListener(this);
        this.b = (ImageView) findViewById(R.id.set_unlock_screen_password_icon);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.set_watch_unlock_layout);
        this.c = viewGroup2;
        viewGroup2.setOnClickListener(this);
        this.m = findViewById(R.id.miui_mask_view);
        int i = R.id.unlock_screen_invalid_tv;
        ((TextView) findViewById(i)).getPaint().setFlags(((TextView) findViewById(i)).getPaint().getFlags() | 8);
        findViewById(i).setOnClickListener(this);
        findViewById(i).setVisibility(I18nUtil.isZh(this) ? 0 : 8);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.unlock_open_layout);
        this.f = linearLayout;
        this.g = (TextView) linearLayout.findViewById(R.id.distance_tv);
        this.j = findViewById(R.id.unlock_distance_layout);
        View viewFindViewById = findViewById(R.id.unlock_enable_setting);
        this.h = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        Switch r0 = (Switch) findViewById(R.id.enable_watch_unlock);
        this.i = r0;
        r0.setOnClickListener(this);
        this.i.setChecked(UnlockUtil.readIsUnlockUserOn(this));
        this.i.setOnCheckedChangeListener(new a());
        this.n = findViewById(R.id.distance_mask_view);
        this.k = findViewById(R.id.unlock_bind_reset_tips_view);
        ImageView imageView = (ImageView) findViewById(R.id.unlock_bind_reset_tips_clear);
        this.l = imageView;
        imageView.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.m.setVisibility(0);
        if (this.k.getVisibility() == 0) {
            this.k.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.m.setVisibility(8);
        x();
        if (this.k.getVisibility() == 4) {
            this.k.setVisibility(0);
        }
    }

    private void m(int i) {
        String str;
        if (i == 1) {
            str = AnalyticsEvents.EVENT_CLICK_UNLOCK_DISTANCE_NEAR;
        } else if (i != 2) {
            str = i != 3 ? "" : AnalyticsEvents.EVENT_CLICK_UNLOCK_DISTANCE_FAR;
        } else {
            str = AnalyticsEvents.EVENT_CLICK_UNLOCK_DISTANCE_MIDDLE;
        }
        if ("".equals(str)) {
            return;
        }
        Analytics.event(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(boolean z) {
        this.n.setVisibility(!z ? 0 : 8);
    }

    private int o(int i) {
        if (i != 1) {
            return (i == 2 || i != 3) ? -59 : -68;
        }
        return -46;
    }

    private void p() {
        BTStatusFragment.create(R.id.container, getSupportFragmentManager().beginTransaction()).setBLEStatusListener(this.q);
    }

    private void q(boolean z) {
        Analytics.event(this, z ? AnalyticsEvents.EVENT_COUNT_SCREEN_UNLOCK_SWITCH_ON : AnalyticsEvents.EVENT_COUNT_SCREEN_UNLOCK_SWITCH_OFF, 1);
        if (z) {
            u();
        } else {
            SyncUtil.syncExtraInfoToWatch(Transporter.get(this, "com.huami.watch.companion"), 0, new b());
        }
    }

    private void r(int i) {
        if (i == getUnlockType()) {
            return;
        }
        Log.d(t, "Save UnlockType : " + i, new Object[0]);
        UserSettings.putInt(getContentResolver(), UserSettingsKeys.KEY_UNLOCK_SCREEN_TYPE, i);
        UserSettingsManager.getManager(this).syncAllToCloudAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.f.getVisibility() != 0) {
            return;
        }
        Log.d(t, "Set Rssi Needed :" + Box.getSetRssiNeeded(), new Object[0]);
        if (Box.getSetRssiNeeded() && t(getUnlockType(), false)) {
            Box.putSetRssiNeeded(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(int i, boolean z) {
        if (z) {
            m(i);
        }
        int iO = o(i);
        Log.d(t, "setRssi rssi = " + iO + ", fromUser = " + z, new Object[0]);
        boolean unlockProfileRssi = MiuiUnlockAPI.getInstance(this).setUnlockProfileRssi(iO);
        StringBuilder sb = new StringBuilder();
        sb.append("setRssi resturn = ");
        sb.append(unlockProfileRssi);
        Log.d(t, sb.toString(), new Object[0]);
        if (unlockProfileRssi) {
            r(i);
            w();
        } else if (z) {
            Toast.makeText(this, R.string.set_rssi_failed, 0).show();
        }
        return unlockProfileRssi;
    }

    private void u() {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(0);
        alertDialogFragmentNewInstance.setMessage(getString(R.string.unlock_lower_watch_life_time));
        alertDialogFragmentNewInstance.setCancel(getString(R.string.dialog_cancel), new g(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.dialog_confirm), new h(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setCancelable(false);
        try {
            alertDialogFragmentNewInstance.show(getFragmentManager(), "");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    private void v() {
        HelpUtil.toHelpPage(this, 3);
    }

    private void w() {
        int unlockType = getUnlockType();
        String[] stringArray = getResources().getStringArray(R.array.lock_screen_type);
        if (unlockType == 1) {
            this.g.setText(stringArray[0]);
            return;
        }
        if (unlockType == 2) {
            this.g.setText(stringArray[1]);
        } else if (unlockType != 3) {
            this.g.setText(stringArray[1]);
        } else {
            this.g.setText(stringArray[2]);
        }
    }

    private void x() {
        if (!MiuiUnlockAPI.hasSetPassword(this)) {
            this.b.setVisibility(0);
            findViewById(R.id.set_unlock_screen_password_text_tip).setVisibility(8);
            setPasswordUIEnable(true);
            setWatchUnlockUIEnable(false);
            return;
        }
        if (!MiuiUnlockAPI.hasSetUnlockByDevice(this, this.p)) {
            this.b.setVisibility(8);
            findViewById(R.id.set_unlock_screen_password_text_tip).setVisibility(0);
            setPasswordUIEnable(false);
            setWatchUnlockUIEnable(true);
            return;
        }
        this.d.setVisibility(0);
        this.e.setVisibility(8);
        if (UnlockUtil.readScreenUnlockEnable(this) != 1) {
            UnlockUtil.saveScreenUnlockEnable(this, 1);
        }
        boolean zIsSupportUnlock = MiuiUnlockAPI.getInstance(this).isSupportUnlock();
        Log.d(t, "isSupport = " + zIsSupportUnlock, new Object[0]);
        if (zIsSupportUnlock) {
            this.f.setVisibility(0);
        }
    }

    private void y() {
        if (this.f.getVisibility() != 0) {
            return;
        }
        this.j.setOnClickListener(this);
        MiuiUnlockAPI.getInstance(this).connectUnlockProfile(this.p, this.r);
        w();
    }

    public int getUnlockType() {
        int i = UserSettings.getInt(getContentResolver(), UserSettingsKeys.KEY_UNLOCK_SCREEN_TYPE, 2);
        Log.d(t, "Get UnlockType : " + i, new Object[0]);
        return i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_back) {
            onBackPressed();
            return;
        }
        if (id == R.id.set_unlock_screen_password_layout) {
            MiuiUnlockAPI.toMiuiUnlockSetting(this, 0, this.p);
            return;
        }
        if (id == R.id.set_watch_unlock_layout) {
            MiuiUnlockAPI.toMiuiUnlockSetting(this, 1, this.p);
            return;
        }
        if (id == R.id.unlock_screen_invalid_tv) {
            Analytics.event(this, AnalyticsEvents.EVENT_CLICK_UNLOCK_INVALID_HELP);
            v();
            return;
        }
        if (id == R.id.unlock_distance_layout) {
            Analytics.event(this, AnalyticsEvents.EVENT_CLICK_UNLOCK_DISTANCE);
            showLockTypeDialog();
            return;
        }
        if (id == R.id.unlock_enable_setting) {
            this.i.setChecked(!this.i.isChecked());
            q(this.i.isChecked());
        } else if (id == R.id.enable_watch_unlock) {
            q(this.i.isChecked());
        } else if (id == R.id.unlock_bind_reset_tips_clear) {
            this.k.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_screen_unlock);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        this.p = Box.getWatchRandomAddress();
        initView();
        p();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MiuiUnlockAPI.getInstance(this).disconnectUnlockProfile();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        y();
        Analytics.startSession(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        x();
    }

    public void setPasswordUIEnable(boolean z) {
        this.a.setEnabled(z);
        findViewById(R.id.set_unlock_screen_password_text).setEnabled(z);
        findViewById(R.id.set_unlock_screen_password_icon).setEnabled(z);
    }

    public void setWatchUnlockUIEnable(boolean z) {
        this.c.setEnabled(z);
        findViewById(R.id.set_watch_unlock_text).setEnabled(z);
        findViewById(R.id.set_watch_unlock_icon).setEnabled(z);
    }

    public void showLockTypeDialog() {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(8);
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        UnlockDistanceSettingFragment unlockDistanceSettingFragment = new UnlockDistanceSettingFragment();
        unlockDistanceSettingFragment.setOnItemClickListener(new f(alertDialogFragmentNewInstance));
        unlockDistanceSettingFragment.setSelectedPos(getUnlockType() - 1);
        alertDialogFragmentNewInstance.setContent(unlockDistanceSettingFragment);
        alertDialogFragmentNewInstance.setTitle(getString(R.string.set_lock_distance_title));
        alertDialogFragmentNewInstance.show(fragmentTransactionBeginTransaction, "unlcok distance setting");
    }
}
