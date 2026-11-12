package com.xiaomi.hm.health.ui.smartplay;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.ViewUtils;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMDisconnectRemindConfig;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.utils.CincoAnalytics;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import io.netty.util.internal.StringUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes22.dex */
public class DisconnectRemindActivity extends BaseSmartPlayActivity implements View.OnClickListener {
    private ListTile H;
    private ListTile I;
    private HMPersonInfo F = null;
    private HMMiliConfig G = null;
    private ListTile J = null;
    private ListTile K = null;
    private HMDisconnectRemindConfig L = null;
    private BLEStatueListenerAdapter M = new b();

    public class a extends HMCallback {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            if (!result) {
                DisconnectRemindActivity.this.D(result);
                return;
            }
            DisconnectRemindActivity.this.G.setDisconnectRemind(HMDeviceUtils.toDisconnectRemindConfigString(DisconnectRemindActivity.this.L));
            DisconnectRemindActivity.this.F.saveInfo(2);
            HMAccountWebExtAPI.updateProfile();
        }
    }

    public class b extends BLEStatueListenerAdapter {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public List<HMDeviceSource> getSupportDevices() {
            return BLEStatueListenerAdapter.getProDevices();
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return DisconnectRemindActivity.this.getString(R.string.reach_goal_tips);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean enable) {
            DisconnectRemindActivity.this.H.setEnabled(enable);
            boolean z = enable && DisconnectRemindActivity.this.H.isChecked();
            DisconnectRemindActivity.this.J.setEnabled(z);
            DisconnectRemindActivity.this.K.setEnabled(z);
            DisconnectRemindActivity.this.I.setEnabled(z);
        }
    }

    public class c implements HMTimeChooseView.ITimeChooseListener {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ AtomicInteger b;
        public final /* synthetic */ AtomicInteger c;

        public c(final boolean val$isStart, final AtomicInteger val$start, final AtomicInteger val$stop) {
            this.a = val$isStart;
            this.b = val$start;
            this.c = val$stop;
        }

        @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
        public void onTimeChoose(int hour, int minutes) {
            if (this.a) {
                this.b.set((hour * 60) + minutes);
            } else {
                this.c.set((hour * 60) + minutes);
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ AtomicInteger b;
        public final /* synthetic */ AtomicInteger c;

        public e(final boolean val$isStart, final AtomicInteger val$start, final AtomicInteger val$stop) {
            this.a = val$isStart;
            this.b = val$start;
            this.c = val$stop;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0045  */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            boolean z = true;
            if (this.a) {
                int i = this.b.get();
                if (i == -1) {
                    return;
                }
                if (i != DisconnectRemindActivity.this.L.getStartIndex()) {
                    DisconnectRemindActivity.this.L.setStartIndex(i);
                } else {
                    z = false;
                }
            } else {
                int i2 = this.c.get();
                if (i2 == -1) {
                    return;
                }
                if (i2 != DisconnectRemindActivity.this.L.getStopIndex()) {
                    DisconnectRemindActivity.this.L.setStopIndex(i2);
                } else {
                    z = false;
                }
            }
            if (z) {
                DisconnectRemindActivity.this.F();
                DisconnectRemindActivity disconnectRemindActivity = DisconnectRemindActivity.this;
                disconnectRemindActivity.C(disconnectRemindActivity.L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            this.L.setEnable(z);
            C(this.L);
            this.J.setEnabled(z);
            this.K.setEnabled(z);
            this.I.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(HMDisconnectRemindConfig config) {
        HMDeviceSource featureProDevice = HMDeviceConfig.getFeatureProDevice();
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(featureProDevice.getType());
        if (featureProDevice == HMDeviceSource.VDEVICE || device == null || !device.isConnected()) {
            return;
        }
        ((HMMiLiProDevice) device).setDisconnectRemind(config, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean result) {
        if (result) {
            IconToast.showSuccess(this, R.string.long_sit_set_success);
        } else {
            IconToast.showError(this, R.string.long_sit_set_failed);
        }
    }

    private void E(final boolean isStart) {
        byte stopHour;
        byte stopMinute;
        String string;
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(this);
        if (isStart) {
            stopHour = this.L.getStartHour();
            stopMinute = this.L.getStartMinute();
            string = getResources().getString(R.string.avoid_disturb_on_time);
        } else {
            stopHour = this.L.getStopHour();
            stopMinute = this.L.getStopMinute();
            string = getResources().getString(R.string.avoid_disturb_off_time);
        }
        hMTimeChooseView.setInitialTime(stopHour, stopMinute);
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        AtomicInteger atomicInteger2 = new AtomicInteger(-1);
        hMTimeChooseView.setOnTimeChooseListener(new c(isStart, atomicInteger, atomicInteger2));
        new AlertDialogFragment.Builder(this).setTitle(string).setContentView(hMTimeChooseView).setPositiveButton(getString(R.string.yes), new e(isStart, atomicInteger, atomicInteger2)).setNegativeButton(getString(R.string.cancel), new d()).setCancelable(true).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        int startIndex = this.L.getStartIndex();
        int stopIndex = this.L.getStopIndex();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (startIndex >= stopIndex) {
            sb2.append(getString(R.string.unit_tomorrow));
            sb2.append(StringUtil.SPACE);
        }
        sb.append(TimeUtils.formatTime(BraceletApp.getContext(), startIndex));
        sb2.append(TimeUtils.formatTime(BraceletApp.getContext(), stopIndex));
        this.J.setTips(sb.toString());
        this.K.setTips(sb2.toString());
    }

    private void initView() {
        setSmartImageTopMargin(74.0f);
        if (HMDeviceConfig.hasBoundWatch()) {
            setSmartImageView(R.drawable.img_remind_watch_and_phone, R.drawable.selector_smart_paly_anti_theft_icon);
            p(ViewUtils.isRTL() ? 4.0f : -4.0f);
        } else {
            setSmartImageView(R.drawable.selector_smart_paly_anti_theft_bg, R.drawable.selector_smart_paly_anti_theft_icon);
        }
        setStatusListener(this.M);
        ListTile listTile = (ListTile) findViewById(R.id.dis_notify_start_iv);
        this.J = listTile;
        listTile.setOnClickListener(this);
        ListTile listTile2 = (ListTile) findViewById(R.id.dis_notify_stop_iv);
        this.K = listTile2;
        listTile2.setOnClickListener(this);
        this.I = (ListTile) findViewById(R.id.vibrate_mode_iv);
        this.J.setEnabled(this.L.isEnable());
        this.K.setEnabled(this.L.isEnable());
        this.I.setEnabled(this.L.isEnable());
        this.H = (ListTile) findViewById(R.id.dis_notify_iv);
        if (HMDeviceConfig.hasBoundWatch()) {
            this.H.setSubtitle(R.string.dis_notify_tips_watch);
        }
        this.H.setChecked(this.L.isEnable());
        this.H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qa1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.B(compoundButton, z);
            }
        });
        F();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.dis_notify_start_iv) {
            E(true);
        } else if (id == R.id.dis_notify_stop_iv) {
            E(false);
        }
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSmartContent(R.layout.activity_anti_theft_remind);
        setRainbowTitleText(R.string.dis_notify);
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.F = hMPersonInfo;
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        this.G = miliConfig;
        this.L = HMDeviceUtils.fromDisconnectRemindConfigString(miliConfig.getDisconnectRemind());
        initView();
        CincoAnalytics.disconnectAnalytics();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HMAccountWebExtAPI.updateProfile();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.I.setVisibility(8);
    }
}
