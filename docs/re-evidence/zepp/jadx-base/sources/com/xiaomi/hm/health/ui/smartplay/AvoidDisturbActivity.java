package com.xiaomi.hm.health.ui.smartplay;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.eventbus.EventQuietModeChange;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.smartplay.AvoidDisturbActivity;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import de.greenrobot.event.EventBus;
import io.netty.util.internal.StringUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes22.dex */
public class AvoidDisturbActivity extends BaseSmartPlayActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private static final String N = "AvoidDisturbActivity";
    private ListTile F;
    private ListTile G;
    private ListTile H;
    private ListTile I;
    private HMPersonInfo J;
    private HMSilentConfig K;
    private boolean L = true;
    private final BLEStatueListenerAdapter M = new b();

    public class a extends HMCallback<Object> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.i(AvoidDisturbActivity.N, "setSilentConfig2Device, result=" + result, new Object[0]);
            if (result) {
                return;
            }
            AvoidDisturbActivity.this.K();
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
            AvoidDisturbActivity avoidDisturbActivity = AvoidDisturbActivity.this;
            return avoidDisturbActivity.getString(R.string.avoid_disturb_not_bound_milipro, new Object[]{avoidDisturbActivity.getString(R.string.mili_settting_mili_pro)});
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean enable) {
            AvoidDisturbActivity avoidDisturbActivity = AvoidDisturbActivity.this;
            avoidDisturbActivity.L = avoidDisturbActivity.isConnected();
            if (enable) {
                AvoidDisturbActivity.this.A();
            } else {
                AvoidDisturbActivity.this.z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        this.I.setEnabled(true);
        this.F.setEnabled(true);
        this.G.setEnabled(true);
        this.H.setEnabled(true);
        N();
    }

    private void B(boolean enable) {
        this.F.setEnabled(enable);
        this.G.setEnabled(enable);
        this.H.setEnabled(enable);
    }

    private void C(boolean enable) {
        this.F.setEnabled(enable);
        this.G.setEnabled(enable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        if (i == 0) {
            this.K.setEnable(false);
        } else if (i == 1) {
            this.K.setEnable(true);
            this.K.setSmart(true);
        } else if (i == 2) {
            this.K.setEnable(true);
            this.K.setSmart(false);
        }
        N();
        M();
        H();
        y(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(boolean z, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i, int i2) {
        HMLog.d(N, "hour:" + i + ",minutes:" + i2, new Object[0]);
        if (z) {
            atomicInteger.set((i * 60) + i2);
        } else {
            atomicInteger2.set((i * 60) + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    public /* synthetic */ void F(boolean z, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, DialogInterface dialogInterface, int i) {
        boolean z2 = true;
        if (z) {
            int i2 = atomicInteger.get();
            if (i2 == -1) {
                return;
            }
            if (i2 != this.K.getStartIndex()) {
                this.K.setStartIndex(i2);
            } else {
                z2 = false;
            }
        } else {
            int i3 = atomicInteger2.get();
            if (i3 == -1) {
                return;
            }
            if (i3 != this.K.getStopIndex()) {
                this.K.setStopIndex(i3);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            O();
            H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(DialogInterface dialogInterface, int i) {
    }

    private void H() {
        this.J.getMiliConfig().setQuietMode(HMDeviceUtils.toSilentJsonString(this.K));
        this.J.saveInfo(2);
        HMAccountWebExtAPI.updateProfile();
        I(this.K);
        EventBus.getDefault().post(new EventQuietModeChange(this.K.isEnable(), this.K.getStartIndex(), this.K.getStopIndex()));
    }

    private void I(HMSilentConfig config) {
        HMDeviceSource featureProDevice = HMDeviceConfig.getFeatureProDevice();
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(featureProDevice.getType());
        if (featureProDevice == HMDeviceSource.VDEVICE || device == null || !device.isConnected()) {
            K();
        } else {
            ((HMMiLiProDevice) device).setSilent(config, new a());
        }
    }

    private void J() {
        int i;
        if (this.K.isEnable()) {
            i = this.K.isSmart() ? 1 : 2;
        } else {
            i = 0;
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.avoid_set_enable).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(i).setItems(R.array.avoid_type).setItemsSummary(R.array.avoid_type_sub), new DialogInterface.OnClickListener() { // from class: vk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.D(dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IconToast.showError(this, R.string.long_sit_set_failed);
    }

    private void L(final boolean isStart) {
        byte stopHour;
        byte stopMinute;
        String string;
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(this);
        if (isStart) {
            stopHour = this.K.getStartHour();
            stopMinute = this.K.getStartMinute();
            string = getResources().getString(R.string.avoid_disturb_on_time);
        } else {
            stopHour = this.K.getStopHour();
            stopMinute = this.K.getStopMinute();
            string = getResources().getString(R.string.avoid_disturb_off_time);
        }
        hMTimeChooseView.setInitialTime(stopHour, stopMinute);
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicInteger atomicInteger2 = new AtomicInteger(-1);
        hMTimeChooseView.setOnTimeChooseListener(new HMTimeChooseView.ITimeChooseListener() { // from class: yk
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i, int i2) {
                AvoidDisturbActivity.E(isStart, atomicInteger, atomicInteger2, i, i2);
            }
        });
        new AlertDialogFragment.Builder(this).setTitle(string).setContentView(hMTimeChooseView).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: wk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.F(isStart, atomicInteger, atomicInteger2, dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: xk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AvoidDisturbActivity.G(dialogInterface, i);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    private void M() {
        String string = getString(R.string.state_close);
        if (this.K.isEnable()) {
            string = this.K.isSmart() ? getString(R.string.avoid_enable_smart) : getString(R.string.avoid_enable_time);
        }
        this.I.setTips(string);
    }

    private void N() {
        B(this.K.isEnable());
        C(this.K.isEnable() && !this.K.isSmart());
    }

    private void O() {
        int startIndex = this.K.getStartIndex();
        int stopIndex = this.K.getStopIndex();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (startIndex >= stopIndex) {
            sb2.append(getString(R.string.unit_tomorrow));
            sb2.append(StringUtil.SPACE);
        }
        sb.append(TimeUtils.formatTime(BraceletApp.getContext(), startIndex));
        sb2.append(TimeUtils.formatTime(BraceletApp.getContext(), stopIndex));
        this.F.setTips(sb.toString());
        this.G.setTips(sb2.toString());
    }

    private void initView() {
        setSmartImageView(R.drawable.avoid_bg, 0);
        setSmartImageTopMargin(30.0f);
        setStatusListener(this.M);
        HMMiliConfig miliConfig = this.J.getMiliConfig();
        ListTile listTile = (ListTile) findViewById(R.id.enable_item);
        this.I = listTile;
        listTile.setOnClickListener(this);
        ListTile listTile2 = (ListTile) findViewById(R.id.start_time);
        this.F = listTile2;
        listTile2.setOnClickListener(this);
        ListTile listTile3 = (ListTile) findViewById(R.id.stop_time);
        this.G = listTile3;
        listTile3.setOnClickListener(this);
        ListTile listTile4 = (ListTile) findViewById(R.id.light_item);
        this.H = listTile4;
        listTile4.setVisibility(miliConfig.isLiftWristBrightView() ? 0 : 8);
        this.H.setChecked(this.K.isEnableWristLift());
        this.H.setOnCheckedChangeListener(this);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventParams.AVOID_DISTURB_VIEW_NUM));
    }

    public static void launch(Context context) {
        context.startActivity(new Intent(context, (Class<?>) AvoidDisturbActivity.class));
    }

    private void y(int type) {
        if (type == 0) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventParams.AVOID_NODISTURB_OPERATION).setValue("Off"));
        } else if (type == 1) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventParams.AVOID_NODISTURB_OPERATION).setValue("SmartOpen"));
        } else {
            if (type != 2) {
                return;
            }
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventParams.AVOID_NODISTURB_OPERATION).setValue("TimeOpen"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        this.I.setEnabled(false);
        this.F.setEnabled(false);
        this.G.setEnabled(false);
        this.H.setEnabled(false);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.isPressed() && buttonView.getId() == R.id.light_item) {
            this.K.enableWristLift(isChecked);
            H();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventParams.AVOID_BRIGHTSCREEN_SWITCH).setValue(isChecked ? "On" : "Off"));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        int id = view.getId();
        if (id == R.id.start_time) {
            L(true);
        } else if (id == R.id.stop_time) {
            L(false);
        } else if (id == R.id.enable_item) {
            J();
        }
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSmartContent(R.layout.activity_avoid_disturb);
        setRainbowTitleText(R.string.avoid_disturb_tips);
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.J = hMPersonInfo;
        this.K = HMDeviceUtils.fromSilentConfig(hMPersonInfo.getMiliConfig().getQuietMode());
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        M();
        O();
        if (this.L) {
            A();
        } else {
            z();
        }
    }
}
