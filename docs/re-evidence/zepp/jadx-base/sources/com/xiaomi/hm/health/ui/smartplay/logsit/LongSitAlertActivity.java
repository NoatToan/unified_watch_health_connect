package com.xiaomi.hm.health.ui.smartplay.logsit;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitAlertActivity;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class LongSitAlertActivity extends BaseSmartPlayActivity {
    private static final String T = "LongSitAlertActivity";
    private ListTile F;
    private ListTile I;
    private ListTile J;
    private ListTile G = null;
    private ListTile H = null;
    private ListTile K = null;
    private ListTile L = null;
    private HMPersonInfo M = null;
    private HMSedentaryConfig N = null;
    private LongSitMode O = LongSitMode.LONG_SIT;
    private final Lazy<DeviceManagerApi> P = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceUtilsApi> Q = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<AccountWebExtApi> R = KoinJavaComponent.inject(AccountWebExtApi.class);
    private BLEStatueListenerAdapter S = new c();

    public class a extends HMCallback {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            if (z) {
                return;
            }
            LongSitAlertActivity.this.Q();
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            if (z) {
                return;
            }
            LongSitAlertActivity.this.Q();
        }
    }

    public class c extends BLEStatueListenerAdapter {
        public c() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public List<HMDeviceSource> getSupportDevices() {
            return BLEStatueListenerAdapter.getProDevices();
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            LongSitAlertActivity longSitAlertActivity = LongSitAlertActivity.this;
            return longSitAlertActivity.getString(R.string.long_sit_unbind, new Object[]{longSitAlertActivity.getString(R.string.mili_settting_mili_pro)});
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            LongSitAlertActivity.this.N(z);
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LongSitMode.values().length];
            a = iArr;
            try {
                iArr[LongSitMode.STAND_ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LongSitMode.FAKE_STAND_ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private HMTimeChooseView A(int i, HMTimeChooseView.ITimeChooseListener iTimeChooseListener) {
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(this);
        hMTimeChooseView.setInitialTime(i / 60, i % 60);
        hMTimeChooseView.setOnTimeChooseListener(iTimeChooseListener);
        return hMTimeChooseView;
    }

    private void B() {
        boolean z = this.F.isEnabled() && this.N.isEnable();
        this.G.setEnabled(z);
        this.H.setEnabled(z);
        this.I.setEnabled(z);
        this.J.setEnabled(z);
        if (this.O.isStandAlert()) {
            T();
        }
    }

    private String C(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(11, i / 60);
        calendar.set(12, i % 60);
        return TimeUtils.formatTime(DeviceXFunctionsKt.getContext(), calendar.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(CompoundButton compoundButton, boolean z) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventParams.LONG_SIT_VIEW_NUM).setValue(z ? "On" : "Off"));
        this.N.setEnable(z);
        O(this.N);
        B();
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(CompoundButton compoundButton, boolean z) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventParams.LONG_SIT_NOT_REMIND).setValue(z ? "On" : "Off"));
        this.N.setPeriodEnable(z);
        T();
        O(this.N);
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(AtomicInteger atomicInteger, int i, int i2) {
        atomicInteger.set((i * 60) + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(AtomicInteger atomicInteger, boolean z, int i, int i2, DialogInterface dialogInterface, int i3) {
        int i4 = atomicInteger.get();
        if ((z && i4 == i) || (!z && i4 == i2)) {
            return;
        }
        if (z && i4 >= i2) {
            Toast.makeText(this, R.string.long_sit_start_gt_stop, 0).show();
        } else if (z || i4 > i) {
            S(z, i4);
        } else {
            Toast.makeText(this, R.string.long_sit_stop_lt_start, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(boolean z, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i, int i2) {
        HMLog.d(T, "hour:" + i + ",minutes:" + i2, new Object[0]);
        if (z) {
            atomicInteger.set((i * 60) + i2);
        } else {
            atomicInteger2.set((i * 60) + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(boolean z, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, DialogInterface dialogInterface, int i) {
        boolean z2 = true;
        if (z) {
            int i2 = atomicInteger.get();
            if (i2 == -1) {
                return;
            }
            if (i2 >= this.N.getStopIndex()) {
                Toast.makeText(this, R.string.long_sit_start_gt_stop, 0).show();
            } else if (this.N.getStopIndex() - i2 < 60) {
                Toast.makeText(this, R.string.long_sit_lt_hour, 0).show();
            } else {
                this.N.setStartIndex(i2);
                this.G.setTips(C(this.N.getStartIndex()));
            }
            z2 = false;
        } else {
            int i3 = atomicInteger2.get();
            if (i3 == -1) {
                return;
            }
            if (i3 <= this.N.getStartIndex()) {
                Toast.makeText(this, R.string.long_sit_stop_lt_start, 0).show();
            } else if (i3 - this.N.getStartIndex() < 60) {
                Toast.makeText(this, R.string.long_sit_lt_hour, 0).show();
            } else {
                this.N.setStopIndex(i3);
                this.H.setTips(C(this.N.getStopIndex()));
            }
            z2 = false;
        }
        if (z2) {
            O(this.N);
            L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(DialogInterface dialogInterface, int i) {
    }

    private void L() {
        this.M.getMiliConfig().setSedentaryRemind(this.Q.getValue().toSedentaryString(this.N));
        this.M.saveInfo(2);
        this.R.getValue().updateProfile(false);
    }

    private void M(final boolean z) {
        final int dndStart = this.N.getDndStart();
        final int dndStop = this.N.getDndStop();
        int i = z ? dndStart : dndStop;
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        new AlertDialogFragment.Builder(this).setTitle(z ? R.string.long_sit_alert_start : R.string.long_sit_alert_stop).setCancelable(true).setContentView(A(i, new HMTimeChooseView.ITimeChooseListener() { // from class: gt4
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i2, int i3) {
                LongSitAlertActivity.F(atomicInteger, i2, i3);
            }
        })).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: at4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.G(atomicInteger, z, dndStart, dndStop, dialogInterface, i2);
            }
        }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: ct4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LongSitAlertActivity.H(dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z) {
        this.F.setEnabled(z);
        B();
    }

    private void O(HMSedentaryConfig hMSedentaryConfig) {
        HMDeviceSource featureProDevice = HMDeviceConfig.getFeatureProDevice();
        HMBaseDevice device = this.P.getValue().getDevice(featureProDevice.getType());
        if (featureProDevice == HMDeviceSource.VDEVICE || device == null || !device.isConnected()) {
            Q();
        } else if (this.O.isStandAlert()) {
            ((HMMiLiProDevice) device).setStandAlertConfig(StandAlertConfig.toStandAlertConfig(hMSedentaryConfig), new b());
        } else {
            ((HMMiLiProDevice) device).setSedentary(new HMSedentaryConfig(hMSedentaryConfig.isEnable(), hMSedentaryConfig.isPeriodEnable(), hMSedentaryConfig.getInterval(), hMSedentaryConfig.getStartIndex(), hMSedentaryConfig.getStopIndex()), new a());
        }
    }

    private void P() {
        String string;
        HMDeviceSource boundDeviceSource = this.P.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        int i = d.a[this.O.ordinal()];
        if (i == 1) {
            string = getString(R.string.stand_alert_tips);
        } else if (i == 2) {
            string = getString(R.string.enable_long_sit_alert_tips_gt2_and_later);
        } else if (boundDeviceSource == HMDeviceSource.MILI_TOKYO) {
            string = getString(R.string.enable_long_sit_alert_tips_watch_beep);
        } else {
            string = HMDeviceConfig.hasBoundWatch() ? getString(R.string.enable_long_sit_alert_tips_watch) : getString(R.string.enable_long_sit_alert_tips);
        }
        setSmartTip(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IconToast.showError(this, R.string.long_sit_set_failed);
    }

    private void R(final boolean z, int i, int i2) {
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(this);
        String string = z ? getResources().getString(R.string.long_sit_alert_start) : getResources().getString(R.string.long_sit_alert_stop);
        hMTimeChooseView.setInitialTime(i, i2);
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicInteger atomicInteger2 = new AtomicInteger(-1);
        hMTimeChooseView.setOnTimeChooseListener(new HMTimeChooseView.ITimeChooseListener() { // from class: ht4
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i3, int i4) {
                LongSitAlertActivity.I(z, atomicInteger, atomicInteger2, i3, i4);
            }
        });
        new AlertDialogFragment.Builder(this).setTitle(string).setCancelable(true).setContentView(hMTimeChooseView).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: bt4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.a.J(z, atomicInteger, atomicInteger2, dialogInterface, i3);
            }
        }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: dt4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                LongSitAlertActivity.K(dialogInterface, i3);
            }
        }).show(getSupportFragmentManager());
    }

    private void S(boolean z, int i) {
        if (z) {
            this.N.setDndStart(i);
            this.K.setTips(C(i));
        } else {
            this.N.setDndStop(i);
            this.L.setTips(C(i));
        }
        O(this.N);
        L();
    }

    private void T() {
        boolean z = this.I.isEnabled() && this.N.isPeriodEnable();
        this.K.setEnabled(z);
        this.L.setEnabled(z);
    }

    @SuppressLint({"StringFormatInvalid", "StringFormatMatches"})
    private void initViews() {
        P();
        setSmartImageTopMargin(30.0f);
        setSmartImageView(this.O.isLongSit() ? R.drawable.img_remind_sit_long : R.drawable.img_stand_alert, 0);
        setStatusListener(this.S);
        ListTile listTile = (ListTile) findViewById(R.id.long_sit_alert_start_layout);
        this.G = listTile;
        listTile.setTips(C(this.N.getStartIndex()));
        ListTile listTile2 = (ListTile) findViewById(R.id.long_sit_alert_stop_layout);
        this.H = listTile2;
        listTile2.setTips(C(this.N.getStopIndex()));
        ListTile listTile3 = (ListTile) findViewById(R.id.enable_switch);
        this.F = listTile3;
        listTile3.setTitle(this.O.isLongSit() ? R.string.enable_long_sit_alert : R.string.stand_alert_switcher);
        this.F.setChecked(this.N.isEnable());
        this.F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: et4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.D(compoundButton, z);
            }
        });
        ListTile listTile4 = (ListTile) findViewById(R.id.long_sit_no_alert_layout);
        this.I = listTile4;
        listTile4.setChecked(this.N.isPeriodEnable());
        this.I.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ft4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.E(compoundButton, z);
            }
        });
        this.K = (ListTile) findViewById(R.id.dnd_start);
        this.L = (ListTile) findViewById(R.id.dnd_end);
        if (this.O.isStandAlert()) {
            this.I.setSubtitle((CharSequence) null);
            this.K.setVisibility(0);
            this.L.setVisibility(0);
            this.K.setTips(C(this.N.getDndStart()));
            this.L.setTips(C(this.N.getDndStop()));
        } else {
            this.I.setSubtitle(getString(R.string.long_sit_no_alert_tips, new Object[]{C(720), C(HMSedentaryConfig.INGORE_STOP_INDEX)}));
        }
        this.J = (ListTile) findViewById(R.id.vibrate_mode_iv);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventParams.LONG_SIT_VIEW_NUM));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.long_sit_alert_start_layout) {
            R(true, this.N.getStartIndex() / 60, this.N.getStartIndex() % 60);
            return;
        }
        if (id == R.id.long_sit_alert_stop_layout) {
            R(false, this.N.getStopIndex() / 60, this.N.getStopIndex() % 60);
        } else if (id == R.id.dnd_start) {
            M(true);
        } else if (id == R.id.dnd_end) {
            M(false);
        }
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setSmartContent(R.layout.activity_long_sit_alert);
        this.O = LongSitLogicKt.getLongSitMode(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI));
        HMLog.i(T, "longSitMode: " + this.O, new Object[0]);
        setRainbowTitleText(this.O.isLongSit() ? R.string.long_sit_alert : R.string.stand_alert);
        this.M = HMPersonInfo.getInstance();
        this.N = this.Q.getValue().fromSedentaryConfig(this.M.getMiliConfig().getSedentaryRemind());
        initViews();
        B();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventParams.LONG_SIT_VIEW_NUM));
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.J.setVisibility(8);
    }
}
