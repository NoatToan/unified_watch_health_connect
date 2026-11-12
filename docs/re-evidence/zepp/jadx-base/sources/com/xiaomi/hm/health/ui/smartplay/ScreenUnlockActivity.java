package com.xiaomi.hm.health.ui.smartplay;

import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.playmiband2.MiBand2InstructionActivity;
import com.xiaomi.hm.health.utils.ScreenUnlockEventRecorder;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import de.greenrobot.event.EventBus;
import miui.bluetooth.ble.MiBleProfile;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public class ScreenUnlockActivity extends BaseSmartPlayActivity implements View.OnClickListener {
    private static final String V = "ScreenUnlockActivity";
    private ImageView G;
    private HMMiLiDevice K;
    private LinearLayout M;
    private TextView N;
    private boolean O;
    private View P;
    private View Q;
    private TextView R;
    private HMDeviceSource S;
    private String F = null;
    private RelativeLayout H = null;
    private LinearLayout I = null;
    private RelativeLayout J = null;
    private boolean L = false;
    private final BroadcastReceiver T = new a();
    private final BLEStatueListenerAdapter U = new c();

    public class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Analytics.event(ScreenUnlockActivity.this, StatEvent.EVENT_PAIR_FOR_SMARTLOCK_SUCCESS);
            CustomToast.makeText(ScreenUnlockActivity.this, R.string.unlock_for_smartlock_pair_success_tip, 0).show();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            HMLog.i(ScreenUnlockActivity.V, "state:" + intExtra + ",device:" + bluetoothDevice + "; mStrDeviceAddress: " + ScreenUnlockActivity.this.F, new Object[0]);
            if (intExtra != 12 || TextUtils.isEmpty(ScreenUnlockActivity.this.F) || bluetoothDevice == null || !ScreenUnlockActivity.this.F.equalsIgnoreCase(bluetoothDevice.getAddress())) {
                return;
            }
            ScreenUnlockActivity.this.R.post(new Runnable() { // from class: com.xiaomi.hm.health.ui.smartplay.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.i(ScreenUnlockActivity.V, "trigger paired result: " + result, new Object[0]);
            ScreenUnlockActivity.this.findViewById(R.id.start_setting).setEnabled(true);
            if (!result) {
                CustomToast.makeText(ScreenUnlockActivity.this, R.string.unlock_for_smartlock_pair_fail_tip, 0).show();
                return;
            }
            try {
                ScreenUnlockActivity.this.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                Analytics.event(ScreenUnlockActivity.this, StatEvent.EVENT_PAIR_FOR_SMARTLOCK_SUCCESS_NO_ACTIVITY);
                ScreenUnlockActivity.this.startActivity(new Intent("android.settings.SETTINGS"));
            }
        }
    }

    public class c extends BLEStatueListenerAdapter {
        public c() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return ScreenUnlockActivity.this.getString(R.string.unlock_screen_not_bound);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean enable) {
            if (enable) {
                ScreenUnlockActivity.this.B();
            } else {
                ScreenUnlockActivity.this.A();
            }
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public BTStatusFragment.TopTips setTopTips() {
            if (MiuiAPI.isMiuiMemberSpace(ScreenUnlockActivity.this.getApplicationContext())) {
                return HMDeviceConfig.hasBoundWatch() ? new BTStatusFragment.TopTips(true, ScreenUnlockActivity.this.getString(R.string.smart_lock_in_member_space_watch)) : new BTStatusFragment.TopTips(true, ScreenUnlockActivity.this.getString(R.string.smart_lock_in_member_space));
            }
            return new BTStatusFragment.TopTips(false, ScreenUnlockActivity.this.getString(R.string.smart_lock_low_version));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (!this.O) {
            this.Q.setVisibility(0);
            return;
        }
        this.P.setVisibility(0);
        O(true);
        M(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (!this.O) {
            this.Q.setVisibility(8);
        } else {
            this.P.setVisibility(8);
            S();
        }
    }

    private void C(int distanceType) {
        String str;
        if (distanceType == 1) {
            str = "Close";
        } else if (distanceType != 2) {
            str = distanceType != 3 ? "" : StatEvent.EventParams.UNLOCK_SCREEN_TYPE_FAR;
        } else {
            str = "Medium";
        }
        if ("".equals(str)) {
            return;
        }
        Analytics.event(getApplicationContext(), StatEvent.UNLOCK_SCREEN_CLICK_NUM, str);
    }

    private int D(int distanceType) {
        if (distanceType != 1) {
            return (distanceType == 2 || distanceType != 3) ? -70 : -85;
        }
        return -55;
    }

    private boolean E() {
        return !MiuiAPI.isMiui(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(View view) {
        K();
        Analytics.event(this, StatEvent.EventId.SCREEN_UNLOCK_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            P(1);
        } else if (i == 1) {
            P(2);
        } else {
            if (i != 2) {
                return;
            }
            P(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        startActivity(new Intent(this, (Class<?>) AvoidSpiteBindingActivity.class));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(int i) {
        HMLog.i(V, "onState:" + i, new Object[0]);
        if (i == 4) {
            N(getUnlockType());
        }
    }

    private void K() {
        if (this.L) {
            findViewById(R.id.start_setting).setEnabled(false);
            HMLog.i(V, "onStartSettingClick", new Object[0]);
            Analytics.event(this, StatEvent.EVENT_PAIR_FOR_SMARTLOCK_START);
            CustomToast.makeText(this, HMDeviceConfig.hasBoundWatch() ? R.string.watch_unlock_for_smartlock_pair_start_tip : R.string.unlock_for_smartlock_pair_start_tip, 1).show();
            HMMiLiDevice hMMiLiDevice = this.K;
            if (hMMiLiDevice != null && hMMiLiDevice.isConnected()) {
                this.K.triggerPair(new b());
                return;
            }
            HMLog.i(V, "return onStartSettingClick: " + this.K, new Object[0]);
        }
    }

    private void L(int type) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        hMPersonInfo.getMiliConfig().setUnlockScreenType(type);
        hMPersonInfo.saveInfo(2);
    }

    private void M(boolean enable) {
        findViewById(R.id.set_unlock_screen_password_layout).setAlpha(enable ? 1.0f : 0.4f);
    }

    private boolean N(int distanceType) {
        int iD = D(distanceType);
        boolean unlockProfileRssi = MiuiUnlockAPI.getInstance(this).setUnlockProfileRssi(iD);
        HMLog.i(V, "setRssiThreshold:" + iD + ",ret:" + unlockProfileRssi, new Object[0]);
        return unlockProfileRssi;
    }

    private void O(boolean enable) {
        findViewById(R.id.set_miband_unlock_layout).setAlpha(enable ? 1.0f : 0.4f);
    }

    private void P(int distanceType) {
        C(distanceType);
        if (!N(distanceType)) {
            CustomToast.makeText(this, R.string.set_rssi_failed, 0).show();
        } else {
            L(distanceType);
            R();
        }
    }

    private void Q() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.screen_unlock_tips).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: bk6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.H(dialogInterface, i);
            }
        }).setPositiveButton(R.string.go_to_close, new DialogInterface.OnClickListener() { // from class: ak6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.I(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void R() {
        int unlockType = getUnlockType();
        String[] stringArray = getResources().getStringArray(R.array.lock_screen_type);
        if (unlockType == 1) {
            this.N.setText(stringArray[0]);
            return;
        }
        if (unlockType == 2) {
            this.N.setText(stringArray[1]);
        } else if (unlockType != 3) {
            this.N.setText(stringArray[1]);
        } else {
            this.N.setText(stringArray[2]);
        }
    }

    private void S() {
        if (!MiuiUnlockAPI.hasSetPassword(this)) {
            this.G.setVisibility(0);
            findViewById(R.id.set_unlock_screen_password_text_tip).setVisibility(8);
            M(true);
            O(false);
            Analytics.event(this, StatEvent.EventId.SCREEN_UNLOCK_OUT, StatEvent.EventParams.UNSET);
            return;
        }
        if (!MiuiUnlockAPI.hasSetUnlockByDevice(this, this.F)) {
            this.G.setVisibility(8);
            findViewById(R.id.set_unlock_screen_password_text_tip).setVisibility(0);
            M(false);
            O(true);
            Analytics.event(this, StatEvent.EventId.SCREEN_UNLOCK_OUT, StatEvent.EventParams.SCREEN_UNLOCK_OUT_STEP1);
            return;
        }
        this.H.setVisibility(0);
        this.I.setVisibility(8);
        z(true);
        HMAccountWebExtAPI.updateProfile();
        boolean zIsSupportUnlock = MiuiUnlockAPI.getInstance(this).isSupportUnlock();
        HMLog.i(V, "isSupportMiuiUnlock:" + zIsSupportUnlock, new Object[0]);
        if (zIsSupportUnlock) {
            this.M.setVisibility(0);
        }
    }

    private void T() {
        if (this.M.getVisibility() != 0) {
            return;
        }
        String boundDeviceAddress = HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.MILI);
        HMLog.i(V, "update unlock distance mDeviceAddress = " + boundDeviceAddress, new Object[0]);
        MiuiUnlockAPI.getInstance(this).connectUnlockProfile(boundDeviceAddress, new MiBleProfile.IProfileStateChangeCallback() { // from class: ek6
            @Override // miui.bluetooth.ble.MiBleProfile.IProfileStateChangeCallback
            public final void onState(int i) {
                this.a.J(i);
            }
        });
        this.M.setOnClickListener(this);
        R();
    }

    private int getUnlockType() {
        int unlockScreenType = HMPersonInfo.getInstance().getMiliConfig().getUnlockScreenType();
        if (unlockScreenType == -1) {
            return 2;
        }
        return unlockScreenType;
    }

    private void initView() {
        this.R = (TextView) findViewById(R.id.set_miband_unlock_text);
        TextView textView = (TextView) findViewById(R.id.no_miui_step_3);
        if (HMDeviceConfig.hasBoundWatch()) {
            if (HMDeviceConfig.isPYHSeries() || HMDeviceConfig.isFalconSeries() || HMDeviceConfig.isHawkSeries()) {
                setSmartImageView(R.drawable.img_remind_watch_pyh_and_phone, R.drawable.img_remind_screen_unlock_enable);
            } else {
                HMDeviceSource hMDeviceSource = this.S;
                if (hMDeviceSource == HMDeviceSource.MILI_VENICE || hMDeviceSource == HMDeviceSource.MILI_VENICE_W) {
                    setSmartImageView(R.drawable.img_remind_watch_venice_and_phone, R.drawable.img_remind_screen_unlock_enable);
                } else {
                    setSmartImageView(R.drawable.img_remind_watch_and_phone, R.drawable.img_remind_screen_unlock_enable);
                }
            }
            this.R.setText(R.string.lock_screen_second_step_watch);
            textView.setText(R.string.unlock_for_smartlock_tip_step_3_watch);
        } else {
            setSmartImageView(R.drawable.img_remind_band_phone_enable, R.drawable.img_remind_screen_unlock_enable);
            this.R.setText(R.string.lock_screen_second_step);
            textView.setText(R.string.unlock_for_smartlock_tip_step3);
        }
        p(ViewUtils.isRTL() ? 4.0f : -4.0f);
        setSmartTip(getString(HMDeviceConfig.hasBoundWatch() ? R.string.incoming_call_alert_logo_watch_tips : R.string.incoming_call_alert_logo_tips));
        setStatusListener(this.U);
        this.I = (LinearLayout) findViewById(R.id.unlock_screen_set_layout);
        this.H = (RelativeLayout) findViewById(R.id.has_unlock_with_bracelet_ll);
        this.J = (RelativeLayout) findViewById(R.id.non_miui_layout);
        ((ViewGroup) findViewById(R.id.set_unlock_screen_password_layout)).setOnClickListener(this);
        this.G = (ImageView) findViewById(R.id.set_unlock_screen_password_icon);
        ((ViewGroup) findViewById(R.id.set_miband_unlock_layout)).setOnClickListener(this);
        this.P = findViewById(R.id.miui_mask_view);
        this.Q = findViewById(R.id.normal_mask_view);
        TextView textView2 = (TextView) findViewById(R.id.unlock_screen_invalid_tv);
        textView2.setText(MiBand2InstructionActivity.fromHtml("<u>" + getString(R.string.unlock_screen_invalid) + "</u>"));
        textView2.setOnClickListener(this);
        ((TextView) findViewById(R.id.start_setting)).setOnClickListener(new View.OnClickListener() { // from class: dk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.F(view);
            }
        });
        findViewById(R.id.smartlock_fl).setVisibility(this.L ? 0 : 8);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.unlock_distance_layout);
        this.M = linearLayout;
        this.N = (TextView) linearLayout.findViewById(R.id.distance_tv);
        TextView textView3 = (TextView) this.M.findViewById(R.id.distance_sub_title_tv);
        if (HMDeviceConfig.hasBoundWatch()) {
            textView3.setText(R.string.unlock_distance_content_watch);
        }
    }

    private void showLockTypeDialog() {
        int unlockType = getUnlockType();
        HMLog.i(V, "lastSetIndex = " + unlockType, new Object[0]);
        new AlertDialogFragment.Builder(this).setTitle(R.string.set_lock_distance_title).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.lock_screen_type).setItemChoice(unlockType == -1 ? 1 : unlockType - 1), new DialogInterface.OnClickListener() { // from class: ck6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.G(dialogInterface, i);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    private void updateUI() {
        if (this.O) {
            S();
            return;
        }
        this.I.setVisibility(8);
        this.H.setVisibility(8);
        this.J.setVisibility(0);
    }

    private static void z(boolean z) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        if (miliConfig.getScreenLock() != z) {
            miliConfig.setScreenLock(z ? 1 : 0);
            hMPersonInfo.saveInfo(2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.set_unlock_screen_password_layout) {
            HMLog.i(V, "set_unlock_screen_password_layout clicked: " + this.F, new Object[0]);
            MiuiUnlockAPI.toMiuiUnlockSetting(this, 0, this.F);
            return;
        }
        if (id == R.id.set_miband_unlock_layout) {
            HMLog.i(V, "set_miband_unlock_layout clicked: " + this.F, new Object[0]);
            MiuiUnlockAPI.toMiuiUnlockSetting(this, 1, this.F);
            Analytics.event(this, StatEvent.EventId.SCREEN_UNLOCK_OUT, StatEvent.EventParams.SCREEN_UNLOCK_OUT_STEP2);
            ScreenUnlockEventRecorder.recordStep2ClickTime();
            return;
        }
        if (id == R.id.unlock_screen_invalid_tv) {
            HMLog.i(V, "unlock_screen_invalid_tv clicked", new Object[0]);
            Intent intent = new Intent(this, (Class<?>) HelpActivity.class);
            intent.putExtra(Utils.REF_DEVICE_TYPE, Utils.TYPE_UNLOCK_SCREEN);
            startActivity(intent);
            return;
        }
        if (id == R.id.unlock_distance_layout) {
            HMLog.i(V, "unlock_distance_layout clicked", new Object[0]);
            showLockTypeDialog();
        }
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws JSONException {
        super.onCreate(savedInstanceState);
        setSmartContent(R.layout.activity_unlock_screen);
        setRainbowTitleText(R.string.unlock_screen);
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        this.S = hMDeviceManager.getBoundDeviceSource(hMDeviceType);
        this.K = (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(hMDeviceType);
        this.F = HMDeviceManager.getInstance().getBoundDeviceAddress(hMDeviceType);
        this.L = E();
        this.O = MiuiAPI.isMiui(this);
        initView();
        HMLog.i(V, "mIsSupportSmartLock: " + this.L + "; isMIUI: " + this.O + "; hasLock: " + MiuiUnlockAPI.hasSetUnlockByDevice(this, this.F), new Object[0]);
        if (this.L) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            registerReceiver(this.T, intentFilter);
        }
        if (this.O && !MiuiUnlockAPI.isUnlockEnabled(this, this.F) && HMDeviceUtils.fromAvoidSpiteBindingStr() && HMDeviceConfig.hasFeatureAvoidSpiteBind()) {
            Q();
        }
        ScreenUnlockEventRecorder.printRecord();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        HMLog.i(V, "onDestroy...", new Object[0]);
        MiuiUnlockAPI.getInstance(this).disconnectUnlockProfile();
        if (this.L) {
            unregisterReceiver(this.T);
        }
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        T();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.event(this, StatEvent.EventId.SCREEN_UNLOCK_VIEW_NUM);
        updateUI();
    }
}
