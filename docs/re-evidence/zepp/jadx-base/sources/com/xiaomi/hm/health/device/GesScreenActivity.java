package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v1.DisplayAndBrightnessV1;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.baseui.FramesSequenceAnimation;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.device.GesScreenActivity;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.wrist.WristEnum;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import io.netty.util.internal.StringUtil;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes20.dex */
public class GesScreenActivity extends AppCompatActivity {
    private static final int[] A;
    private static final String t = "GesScreenActivity";
    private static final String u = "extra_source";
    private static final int[] v = {R.drawable.img_lift_wrist_pyh_1, R.drawable.img_lift_wrist_pyh_2, R.drawable.img_lift_wrist_pyh_3, R.drawable.img_lift_wrist_pyh_4, R.drawable.img_lift_wrist_pyh_5, R.drawable.img_lift_wrist_pyh_6, R.drawable.img_lift_wrist_pyh_7, R.drawable.img_lift_wrist_pyh_8, R.drawable.img_lift_wrist_pyh_9, R.drawable.img_lift_wrist_pyh_10, R.drawable.img_lift_wrist_pyh_11, R.drawable.img_lift_wrist_pyh_12, R.drawable.img_lift_wrist_pyh_13};
    private static final int[] w;
    private static final int[] x;
    private static final int[] y;
    private static final int[] z;
    private ListTile a;
    private ListTile b;
    private ListTile c;
    private ListTile d;
    private ImageView e;
    private ImageView f;
    private final HMPersonInfo g;
    private final HMMiliConfig h;
    private HMLiftWristConfig i;
    private Subscription j;
    private final Lazy<AccountWebExtApi> k;
    private final Lazy<DeviceManagerApi> l;
    private final Lazy<DeviceUtilsApi> m;
    private FramesSequenceAnimation n;
    private FramesSequenceAnimation o;
    private HMDeviceSource p;
    private DisplayBrightnessViewModel q;
    private boolean r;
    private HMDeviceSource s;

    public class a extends BLEStatueListenerAdapter {
        public a() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            GesScreenActivity.this.Q(z);
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.i(GesScreenActivity.t, "setLiftWristConfig2Device, result=" + z, new Object[0]);
            if (z) {
                return;
            }
            GesScreenActivity.this.V();
        }
    }

    public class c extends HMCallback {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HMLog.i(GesScreenActivity.t, "setSensitivity: " + this.a + ", ret: " + z, new Object[0]);
        }
    }

    static {
        int i = R.drawable.img_lift_wrist_tempo_1;
        int i2 = R.drawable.img_lift_wrist_tempo_13;
        w = new int[]{i, R.drawable.img_lift_wrist_2, R.drawable.img_lift_wrist_3, R.drawable.img_lift_wrist_4, R.drawable.img_lift_wrist_5, R.drawable.img_lift_wrist_6, R.drawable.img_lift_wrist_7, R.drawable.img_lift_wrist_8, R.drawable.img_lift_wrist_9, R.drawable.img_lift_wrist_10, R.drawable.img_lift_wrist_11, R.drawable.img_lift_wrist_12, i2};
        x = new int[]{R.drawable.img_lift_wrist_watch_1, R.drawable.img_lift_wrist_watch_2, R.drawable.img_lift_wrist_watch_3, R.drawable.img_lift_wrist_watch_4, R.drawable.img_lift_wrist_watch_5, R.drawable.img_lift_wrist_watch_6, R.drawable.img_lift_wrist_watch_7, R.drawable.img_lift_wrist_watch_8, R.drawable.img_lift_wrist_watch_9, R.drawable.img_lift_wrist_watch_10, R.drawable.img_lift_wrist_watch_11, R.drawable.img_lift_wrist_watch_12, R.drawable.img_lift_wrist_watch_13};
        y = new int[]{R.drawable.img_lift_wrist_watch_square_1, R.drawable.img_lift_wrist_watch_square_2, R.drawable.img_lift_wrist_watch_square_3, R.drawable.img_lift_wrist_watch_square_4, R.drawable.img_lift_wrist_watch_square_5, R.drawable.img_lift_wrist_watch_square_6, R.drawable.img_lift_wrist_watch_square_7, R.drawable.img_lift_wrist_watch_square_8, R.drawable.img_lift_wrist_watch_square_9, R.drawable.img_lift_wrist_watch_square_10, R.drawable.img_lift_wrist_watch_square_11, R.drawable.img_lift_wrist_watch_square_12, R.drawable.img_lift_wrist_watch_square_13};
        z = new int[]{i, R.drawable.img_lift_wrist_tempo_2, R.drawable.img_lift_wrist_tempo_3, R.drawable.img_lift_wrist_tempo_4, R.drawable.img_lift_wrist_tempo_5, R.drawable.img_lift_wrist_tempo_6, R.drawable.img_lift_wrist_tempo_7, R.drawable.img_lift_wrist_tempo_8, R.drawable.img_lift_wrist_tempo_9, R.drawable.img_lift_wrist_tempo_10, R.drawable.img_lift_wrist_tempo_11, R.drawable.img_lift_wrist_tempo_12, i2};
        A = new int[]{R.drawable.img_bright_screen_1, R.drawable.img_bright_screen_2, R.drawable.img_bright_screen_3, R.drawable.img_bright_screen_4, R.drawable.img_bright_screen_5, R.drawable.img_bright_screen_6};
    }

    public GesScreenActivity() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.g = hMPersonInfo;
        this.h = hMPersonInfo.getMiliConfig();
        this.k = KoinJavaComponent.inject(AccountWebExtApi.class);
        this.l = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.m = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.q = null;
        this.r = false;
        this.s = HMDeviceSource.VDEVICE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        W(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        W(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Long l) {
        X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Throwable th) {
        HMLog.error(t, "", th, new Function0() { // from class: qe2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return GesScreenActivity.E();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(DialogInterface dialogInterface, int i) {
        if (i == this.i.getSensitivity()) {
            return;
        }
        this.i.setSensitivity(i);
        this.g.getMiliConfig().setLiftWristTime(this.m.getValue().toLiftWristConfig(this.i));
        this.g.getMiliConfig().setLiftWristBrightView(this.i.isEnable());
        this.g.saveInfo(2);
        this.k.getValue().updateProfile(false);
        Y();
        S(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(boolean z2, boolean z3, DialogInterface dialogInterface, int i) {
        boolean z4 = false;
        if (i == 0) {
            this.i.setAllDay(true);
            this.i.setEnable(true);
        } else if (i == 1) {
            this.i.setAllDay(false);
            this.i.setEnable(true);
        } else if (i == 2) {
            this.i.setEnable(false);
            this.i.setAllDay(false);
        }
        if (this.i.isAllDay() == z2 && this.i.isEnable() == z3) {
            return;
        }
        if (this.p == HMDeviceSource.MILI_YORK) {
            DeviceXFunctionsKt.getPropertyStoreApi().setYorkLiftWristSwitch(this.i.isEnable());
        }
        P();
        Y();
        if (this.i.isEnable() && !this.i.isAllDay()) {
            z4 = true;
        }
        v(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    public /* synthetic */ void I(boolean z2, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, DialogInterface dialogInterface, int i) {
        boolean z3 = true;
        if (z2) {
            int i2 = atomicInteger.get();
            if (i2 == -1) {
                return;
            }
            if (i2 != (this.i.getStartHour() * 60) + this.i.getStartMinutes()) {
                this.i.setStartHour(i2 / 60);
                this.i.setStartMinutes(i2 % 60);
            } else {
                z3 = false;
            }
        } else {
            int i3 = atomicInteger2.get();
            if (i3 == -1) {
                return;
            }
            if (i3 != (this.i.getStopHour() * 60) + this.i.getStopMinutes()) {
                this.i.setStopHour(i3 / 60);
                this.i.setStopMinutes(i3 % 60);
            } else {
                z3 = false;
            }
        }
        if (z3) {
            Z();
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(boolean z2, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i, int i2) {
        if (z2) {
            atomicInteger.set((i * 60) + i2);
        } else {
            atomicInteger2.set((i * 60) + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f.setImageResource(R.drawable.img_bright_screen_1);
        this.f.setVisibility(0);
        this.o.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        this.e.postDelayed(new Runnable() { // from class: pe2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        this.f.setVisibility(8);
    }

    private void O(DisplayAndBrightnessV1 displayAndBrightnessV1) {
        boolean z2;
        if (displayAndBrightnessV1 != null) {
            EnumData screenOnByTurningWristMode = displayAndBrightnessV1.getScreenOnByTurningWristMode();
            boolean z3 = false;
            if (screenOnByTurningWristMode != null) {
                Integer numValueOf = Integer.valueOf(screenOnByTurningWristMode.getValue());
                WristEnum.Companion companion = WristEnum.INSTANCE;
                WristEnum wristEnum = companion.parseWristEnum(numValueOf.intValue());
                boolean zIsWristAllDay = companion.isWristAllDay(wristEnum);
                boolean zIsWristEnable = companion.isWristEnable(wristEnum);
                this.i.setAllDay(zIsWristAllDay);
                this.i.setEnable(zIsWristEnable);
                z2 = true;
            } else {
                z2 = false;
            }
            Time screenOnByTurningWristBeginTime = displayAndBrightnessV1.getScreenOnByTurningWristBeginTime();
            Time screenOnByTurningWristEndTime = displayAndBrightnessV1.getScreenOnByTurningWristEndTime();
            if (screenOnByTurningWristBeginTime != null) {
                int hour = screenOnByTurningWristBeginTime.getHour();
                int minute = screenOnByTurningWristBeginTime.getMinute();
                this.i.setStartHour(hour);
                this.i.setStartMinutes(minute);
                this.i.setStartTimeIndex((hour * 60) + minute);
                z2 = true;
            }
            if (screenOnByTurningWristEndTime != null) {
                int hour2 = screenOnByTurningWristEndTime.getHour();
                int minute2 = screenOnByTurningWristEndTime.getMinute();
                this.i.setStopHour(hour2);
                this.i.setStopMinutes(minute2);
                this.i.setStopTimeIndex((hour2 * 60) + minute2);
                z2 = true;
            }
            EnumData screenOnByTurningWristActiveSpeed = displayAndBrightnessV1.getScreenOnByTurningWristActiveSpeed();
            Integer numValueOf2 = screenOnByTurningWristActiveSpeed == null ? null : Integer.valueOf(screenOnByTurningWristActiveSpeed.getValue());
            if (numValueOf2 != null) {
                this.i.setSensitivity(numValueOf2.intValue());
                z2 = true;
            }
            if (z2) {
                this.g.getMiliConfig().setLiftWristTime(this.m.getValue().toLiftWristConfig(this.i));
                this.g.getMiliConfig().setLiftWristBrightView(this.i.isEnable());
                this.g.saveInfo(2);
                this.k.getValue().updateProfile(false);
            }
            Y();
            Z();
            if (this.i.isEnable() && !this.i.isAllDay()) {
                z3 = true;
            }
            v(z3);
        }
    }

    private void P() {
        this.g.getMiliConfig().setLiftWristTime(this.m.getValue().toLiftWristConfig(this.i));
        this.g.getMiliConfig().setLiftWristBrightView(this.i.isEnable());
        this.g.saveInfo(2);
        this.k.getValue().updateProfile(false);
        R(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(boolean z2) {
        this.a.setEnabled(z2);
        this.b.setEnabled(z2 && this.i.isEnable());
        this.c.setEnabled(z2 && this.i.isEnable() && !this.i.isAllDay());
        this.d.setEnabled(z2 && this.i.isEnable() && !this.i.isAllDay());
    }

    private void R(HMLiftWristConfig hMLiftWristConfig) {
        HMBaseDevice device = this.l.getValue().getDevice(this.s.getType());
        if (this.s == HMDeviceSource.VDEVICE || device == null || !device.isConnected()) {
            V();
            return;
        }
        ((HMMiLiProDevice) device).enableWristBright(hMLiftWristConfig, new b());
        if (hMLiftWristConfig.isEnable() && HMDeviceConfig.hasFeatureLiftWristSensitivity(this.p)) {
            S(this.i.getSensitivity());
        }
        if (this.r) {
            Pair<EnumData, EnumData> pairHMLiftWristConfigToGesModeSensitivity = this.q.hMLiftWristConfigToGesModeSensitivity(hMLiftWristConfig);
            Pair<Time, Time> pairHMLiftWristConfigToBeginEndTime = this.q.hMLiftWristConfigToBeginEndTime(hMLiftWristConfig);
            this.q.updateDisplayBrightnessSetting(true, null, null, null, null, null, null, null, pairHMLiftWristConfigToGesModeSensitivity.getFirst(), pairHMLiftWristConfigToBeginEndTime.getFirst(), pairHMLiftWristConfigToBeginEndTime.getSecond(), pairHMLiftWristConfigToGesModeSensitivity.getSecond(), null, null, null, null);
        }
    }

    private void S(int i) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.l.getValue().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            return;
        }
        hMMiLiProDevice.setLiftWristSensitivity(i, new c(i));
        if (this.r) {
            Pair<EnumData, EnumData> pairHMLiftWristConfigToGesModeSensitivity = this.q.hMLiftWristConfigToGesModeSensitivity(this.i);
            Pair<Time, Time> pairHMLiftWristConfigToBeginEndTime = this.q.hMLiftWristConfigToBeginEndTime(this.i);
            this.q.updateDisplayBrightnessSetting(true, null, null, null, null, null, null, null, pairHMLiftWristConfigToGesModeSensitivity.getFirst(), pairHMLiftWristConfigToBeginEndTime.getFirst(), pairHMLiftWristConfigToBeginEndTime.getSecond(), pairHMLiftWristConfigToGesModeSensitivity.getSecond(), null, null, null, null);
        }
    }

    private void T() {
        new AlertDialogFragment.Builder(this).setTitle(GlobalConfig.get().isBuildMidong() ? R.string.mili_setting_ges_screen : R.string.ges_screen_sensitivity).setCancelable(true).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(this.i.getSensitivity() == 0 ? 0 : 1).setItems(new String[]{getString(R.string.ges_screen_sensitivity_standard), getString(R.string.ges_screen_sensitivity_sensitive)}), new DialogInterface.OnClickListener() { // from class: le2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.G(dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "pickSensitivityDialog");
    }

    private void U() {
        int i;
        final boolean zIsLiftWristBrightView = this.h.isLiftWristBrightView();
        final boolean zIsAllDay = this.i.isAllDay();
        if (zIsLiftWristBrightView && zIsAllDay) {
            i = 0;
        } else {
            i = zIsLiftWristBrightView ? 1 : 2;
        }
        new AlertDialogFragment.Builder(this).setTitle(GlobalConfig.get().isBuildMidong() ? R.string.mili_setting_ges_screen : R.string.mili_setting_ges_screen_v2).setCancelable(true).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(i).setItems(R.array.ges_screen_type), new DialogInterface.OnClickListener() { // from class: ue2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.H(zIsAllDay, zIsLiftWristBrightView, dialogInterface, i2);
            }
        }).show(getSupportFragmentManager(), "pickGesScreenModeDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        IconToast.showError(this, R.string.long_sit_set_failed);
    }

    private void W(final boolean z2) {
        int stopHour;
        int stopMinutes;
        String string;
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(this);
        if (z2) {
            stopHour = this.i.getStartHour();
            stopMinutes = this.i.getStartMinutes();
            string = getResources().getString(R.string.avoid_disturb_on_time);
        } else {
            stopHour = this.i.getStopHour();
            stopMinutes = this.i.getStopMinutes();
            string = getResources().getString(R.string.avoid_disturb_off_time);
        }
        hMTimeChooseView.setInitialTime(stopHour, stopMinutes);
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicInteger atomicInteger2 = new AtomicInteger(-1);
        hMTimeChooseView.setOnTimeChooseListener(new HMTimeChooseView.ITimeChooseListener() { // from class: me2
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i, int i2) {
                GesScreenActivity.K(z2, atomicInteger, atomicInteger2, i, i2);
            }
        });
        new AlertDialogFragment.Builder(this).setTitle(string).setContentView(hMTimeChooseView).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: te2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.I(z2, atomicInteger, atomicInteger2, dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: ve2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GesScreenActivity.J(dialogInterface, i);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    private void X() {
        int[] iArr;
        HMDeviceSource hMDeviceSource;
        if (this.n == null) {
            if (this.p == HMDeviceSource.MILI_TOKYO) {
                iArr = y;
            } else if (HMDeviceConfig.isChaohuSeries() || ConfigHelperKt.hasMiliFeature(Feature.SQUARE_WATCH_S)) {
                iArr = x;
            } else if (ConfigHelperKt.hasMiliFeature(Feature.ROUND_WATCH_S) || HMDeviceConfig.isPYHSeries() || HMDeviceConfig.isFalconSeries() || HMDeviceConfig.isKestrelSeries() || HMDeviceConfig.isHawkSeries()) {
                iArr = v;
            } else {
                iArr = (HMDeviceConfig.isTempoSeries() || (hMDeviceSource = this.p) == HMDeviceSource.MILI_VENICE || hMDeviceSource == HMDeviceSource.MILI_VENICE_W) ? z : w;
            }
            this.n = new FramesSequenceAnimation(this.e, iArr, new int[]{80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 300, 80}, false);
        }
        if (this.o == null) {
            this.o = new FramesSequenceAnimation(this.f, A, new int[]{100, 100, 100, 100, 100, 100}, false);
        }
        this.n.setOnAnimationStoppedListener(new FramesSequenceAnimation.OnAnimationStoppedListener() { // from class: ne2
            @Override // com.xiaomi.hm.health.baseui.FramesSequenceAnimation.OnAnimationStoppedListener
            public final void AnimationStopped() {
                this.a.M();
            }
        });
        this.o.setOnAnimationStoppedListener(new FramesSequenceAnimation.OnAnimationStoppedListener() { // from class: oe2
            @Override // com.xiaomi.hm.health.baseui.FramesSequenceAnimation.OnAnimationStoppedListener
            public final void AnimationStopped() {
                this.a.N();
            }
        });
        this.n.start();
    }

    private void Y() {
        String string = getString(R.string.state_close);
        if (this.h.isLiftWristBrightView()) {
            string = this.i.isAllDay() ? getString(R.string.ges_screen_type_all_day) : getString(R.string.ges_screen_type_time);
        }
        this.a.setTips(string);
        this.b.setTips(getString(this.i.getSensitivity() == 0 ? R.string.ges_screen_sensitivity_standard : R.string.ges_screen_sensitivity_sensitive));
    }

    private void Z() {
        int startHour = (this.i.getStartHour() * 60) + this.i.getStartMinutes();
        int stopHour = (this.i.getStopHour() * 60) + this.i.getStopMinutes();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (startHour >= stopHour) {
            sb2.append(getString(R.string.unit_tomorrow));
            sb2.append(StringUtil.SPACE);
        }
        sb.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), startHour));
        sb2.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), stopHour));
        this.c.setTips(sb.toString());
        this.d.setTips(sb2.toString());
    }

    private void initViews() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new a());
        this.p = this.l.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        this.a = (ListTile) findViewById(R.id.ges_screen_item);
        this.b = (ListTile) findViewById(R.id.sensitivity_item);
        this.c = (ListTile) findViewById(R.id.start_time_item);
        this.d = (ListTile) findViewById(R.id.end_time_item);
        this.e = (ImageView) findViewById(R.id.lift_wrist_img);
        this.f = (ImageView) findViewById(R.id.bright_screen_img);
        this.a.setOnClickListener(new View.OnClickListener() { // from class: we2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.y(view);
            }
        });
        if (HMDeviceConfig.hasFeatureLiftWristSensitivity(this.p)) {
            this.b.setVisibility(0);
            this.b.setOnClickListener(new View.OnClickListener() { // from class: ye2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.z(view);
                }
            });
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: ze2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.A(view);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: af2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.B(view);
            }
        });
        Y();
        ((RainbowTitleBar) findViewById(R.id.titleBar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: xe2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.C(view);
            }
        });
        if (ConfigHelperKt.hasMiliFeature(Feature.GES_SCREEN_ANIM)) {
            this.j = Observable.interval(0L, 2900L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: re2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.D((Long) obj);
                }
            }, new Action1() { // from class: se2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    GesScreenActivity.F((Throwable) obj);
                }
            });
        } else {
            findViewById(R.id.anim_container).setVisibility(8);
        }
    }

    public static void launch(Context context, HMDeviceSource hMDeviceSource) {
        Intent intent = new Intent(context, (Class<?>) GesScreenActivity.class);
        intent.putExtra(u, hMDeviceSource.getValue());
        context.startActivity(intent);
    }

    private void v(boolean z2) {
        this.b.setEnabled(this.i.isEnable());
        this.c.setEnabled(z2);
        this.d.setEnabled(z2);
    }

    private void w() {
        DeviceManagerApi value = this.l.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMBaseDevice device = value.getDevice(hMDeviceType);
        if (!(device instanceof HMBaseBleDevice)) {
            this.r = false;
            return;
        }
        boolean zSupportWatchSettings = ((HMBaseBleDevice) device).supportWatchSettings();
        this.r = zSupportWatchSettings;
        if (zSupportWatchSettings) {
            DisplayBrightnessViewModel displayBrightnessViewModel = (DisplayBrightnessViewModel) new ViewModelProvider(this).get(DisplayBrightnessViewModel.class);
            this.q = displayBrightnessViewModel;
            displayBrightnessViewModel.initJob(hMDeviceType);
            this.q.getDisplayBrightnessSetting().observe(this, new Observer() { // from class: bf2
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.a.x((DisplayAndBrightness) obj);
                }
            });
            this.q.querySettings(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(DisplayAndBrightness displayAndBrightness) {
        if (displayAndBrightness instanceof DisplayAndBrightnessV1) {
            O((DisplayAndBrightnessV1) displayAndBrightness);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view) {
        T();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        this.s = HMDeviceSource.fromValue(getIntent().getIntExtra(u, HMDeviceSource.VDEVICE.getValue()));
        setContentView(R.layout.activity_ges_screen);
        this.i = this.m.getValue().fromLiftWristConfig(this.h.isLiftWristBrightView(), this.g.getMiliConfig().getLiftWristTime());
        initViews();
        w();
        v(this.i.isEnable() && !this.i.isAllDay());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Subscription subscription = this.j;
        if (subscription == null || subscription.isUnsubscribed()) {
            return;
        }
        this.j.unsubscribe();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Z();
    }
}
