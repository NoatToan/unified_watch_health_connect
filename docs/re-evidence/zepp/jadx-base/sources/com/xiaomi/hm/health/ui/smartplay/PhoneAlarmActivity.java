package com.xiaomi.hm.health.ui.smartplay;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.utils.Utils;

/* JADX INFO: loaded from: classes22.dex */
public class PhoneAlarmActivity extends BaseSmartPlayActivity {
    private static final String N = "PhoneAlarmActivity";
    private HMPersonInfo H;
    private HMMiliConfig I;
    private ListTile J;
    private ListTile K;
    private MiuiAPI F = null;
    private String G = "";
    private final CompoundButton.OnCheckedChangeListener L = new CompoundButton.OnCheckedChangeListener() { // from class: lv5
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.w(compoundButton, z);
        }
    };
    private final BLEStatueListenerAdapter M = new a();

    public class a extends BLEStatueListenerAdapter {
        public a() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return PhoneAlarmActivity.this.getString(R.string.phone_alarm_not_bound);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean enable) {
            HMLog.d(PhoneAlarmActivity.N, "enable:" + enable, new Object[0]);
            PhoneAlarmActivity.this.J.setEnabled(enable);
        }
    }

    private void A() {
        if (!v()) {
            t(false);
        }
        this.J.setChecked(this.I.isAlarmNotifyEnabled());
        this.K.setEnabled(this.I.isAlarmNotifyEnabled());
    }

    private void initView() {
        setSmartTip(getString(R.string.phone_alarm_alert_tips));
        setStatusListener(this.M);
        ListTile listTile = (ListTile) findViewById(R.id.phone_alarm_enable);
        this.J = listTile;
        listTile.setOnCheckedChangeListener(this.L);
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (HMDeviceConfig.hasBoundWatch()) {
            if (boundDeviceSource == HMDeviceSource.MILI_TOKYO) {
                setSmartImageView(R.drawable.tokyo_img_remind_phone_and_watch_tokyo, R.drawable.img_remind_alarm_enable);
            } else if (boundDeviceSource == HMDeviceSource.MILI_VENICE || boundDeviceSource == HMDeviceSource.MILI_VENICE_W) {
                setSmartImageView(R.drawable.img_remind_phone_and_watch_venice, R.drawable.img_remind_alarm_enable);
            } else if (ConfigHelperKt.hasFeature(boundDeviceSource, Feature.ROUND_WATCH_S)) {
                setSmartImageView(R.drawable.img_remind_phone_and_watch_pyh, R.drawable.img_remind_alarm_enable);
            } else {
                setSmartImageView(R.drawable.img_remind_phone_and_watch, R.drawable.img_remind_alarm_enable);
            }
            this.J.setSubtitle(R.string.enable_phone_alarm_tips_watch);
        } else {
            setSmartImageView(R.drawable.img_remind_phone_band_enable, R.drawable.img_remind_alarm_enable);
        }
        this.K = (ListTile) findViewById(R.id.vibrate_mode_iv);
    }

    private void t(boolean isEnabled) {
        HMLog.i(N, "changeAlarmNotify setEnable = " + isEnabled, new Object[0]);
        if (this.I.isAlarmNotifyEnabled() != isEnabled) {
            this.I.setAlarmNotifyEnabled(isEnabled);
            this.H.saveInfo(2);
        }
    }

    private void u(boolean checked) {
        if (!v()) {
            if (this.I.isAlarmNotifyEnabled()) {
                this.J.setChecked(true);
            } else {
                this.J.setChecked(false);
            }
            z();
        } else if (this.F.setAlertAlarm(this.G, checked)) {
            t(checked);
        } else {
            Utils.showSetFailedToast(this, checked);
            ListTile listTile = this.J;
            listTile.setChecked(!listTile.isChecked());
        }
        this.K.setEnabled(this.J.isChecked());
    }

    private boolean v() {
        return MiuiUnlockAPI.isUnlockEnabled(this, this.G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed() && compoundButton.getId() == R.id.phone_alarm_enable && HMDeviceManager.getInstance().hasBound(HMDeviceType.MILI)) {
            u(z);
            y(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(this, (Class<?>) ScreenUnlockActivity.class));
    }

    private void y(boolean isChecked) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.PHONE_CLOCK_SWITCH).setValue(isChecked ? "On" : "Off"));
    }

    private void z() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.phone_alarm_remind_message).setNegativeButton(R.string.phone_alarm_remind_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.phone_alarm_remind_confirm, new DialogInterface.OnClickListener() { // from class: kv5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.x(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSmartContent(R.layout.activity_phone_alarm);
        setRainbowTitleText(R.string.phone_alarm);
        this.F = MiuiAPI.getInstance();
        this.G = HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.MILI);
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.H = hMPersonInfo;
        this.I = hMPersonInfo.getMiliConfig();
        initView();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.K.setVisibility(8);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.PHONE_CLOCK_VIEW_NUM));
        A();
    }
}
