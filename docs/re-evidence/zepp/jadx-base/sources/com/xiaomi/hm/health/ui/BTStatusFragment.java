package com.xiaomi.hm.health.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huami.devicex.R;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.view.widget.TipComponent;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.classic.HMSportController;
import com.xiaomi.hm.health.bt.device.HMBaseClassicDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.bolt.FtmsErrorHelper;
import com.xiaomi.hm.health.device.bolt.TreadmillErrorEvent;
import com.xiaomi.hm.health.device.bolt.TreadmillErrorEventKt;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.earbud.util.EarbudUtil;
import com.xiaomi.hm.health.device.event.HMActiveDeviceEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.event.TreadmillSportEvent;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTreeFactory;
import com.xiaomi.hm.health.device.setting.ui.dialog.ConnectFailureDialogFactory;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import de.greenrobot.event.EventBus;
import defpackage.ul;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class BTStatusFragment extends Fragment {
    public static final int REASON_BIND_FAIL = 2;
    public static final int REASON_BIND_WIFI_FAIL = 3;
    public static final int REASON_CONN_FAIL = 1;
    public static final int REASON_INVALID = -1;
    public static final int REASON_SYNC_FAIL = 0;
    private static final String m = "BTStatusFragment";
    private static final int n = 500;
    private static final int o = 0;
    private static final int p = 8193;
    private static final Lazy<DeviceManagerApi> q = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<DeviceUtilsApi> r = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private TipComponent a;
    private BLEStatueListener b;
    private Handler c;
    private FeatureTree k;
    private boolean d = true;
    private boolean e = true;
    private final Lazy<FirmwareManagerApi> f = KoinJavaComponent.inject(FirmwareManagerApi.class);
    private final Lazy<FirmwareOnlineManagerApi> g = KoinJavaComponent.inject(FirmwareOnlineManagerApi.class);
    private final Lazy<DeviceXNavigator> h = KoinJavaComponent.inject(DeviceXNavigator.class);
    private final Lazy<BuildConfigApi> i = KoinJavaComponent.inject(BuildConfigApi.class);
    private boolean j = true;
    private final BLEStatueListener l = new b();

    public interface BLEStatueListener {
        HMDeviceType getHMDeviceType();

        List<HMDeviceSource> getSupportDevices();

        CharSequence getUnbindStr();

        boolean isActivatedDevice();

        void notifyStatusWhenSetting(boolean z);

        void onEnableChange(boolean z);

        TopTips setTopTips();
    }

    public static class TopTips {
        private boolean a;
        private String b;

        public TopTips(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            if (((Boolean) message.obj).booleanValue()) {
                BTStatusFragment.this.d0(false);
                BTStatusFragment.this.a0(true);
            } else {
                BTStatusFragment.this.d0(true);
                BTStatusFragment.this.a0(false);
            }
        }
    }

    public class b implements BLEStatueListener {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(boolean z) {
            return "you not set listener! enable: " + z;
        }

        @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public HMDeviceType getHMDeviceType() {
            return HMDeviceType.MILI;
        }

        @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public List<HMDeviceSource> getSupportDevices() {
            return BLEStatueListenerAdapter.getProDevices();
        }

        @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return "";
        }

        @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public /* synthetic */ boolean isActivatedDevice() {
            return ul.a(this);
        }

        @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public /* synthetic */ void notifyStatusWhenSetting(boolean z) {
            ul.b(this, z);
        }

        @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(final boolean z) {
            HMLog.error(BTStatusFragment.m, new Function0() { // from class: com.xiaomi.hm.health.ui.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BTStatusFragment.b.b(z);
                }
            });
        }

        @Override // com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public TopTips setTopTips() {
            return new TopTips(true, "");
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            c = iArr;
            try {
                iArr[HMDeviceType.SHOES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[HMDeviceType.EARBUD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[HMDeviceType.HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[HMDeviceType.MILI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[HMDeviceType.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[HMDeviceType.TREADMILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[SportCommand.values().length];
            b = iArr2;
            try {
                iArr2[SportCommand.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[SportCommand.RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[SportCommand.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[SportCommand.STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[HMSportController.TreadmillSportState.values().length];
            a = iArr3;
            try {
                iArr3[HMSportController.TreadmillSportState.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMSportController.TreadmillSportState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private String A(int i) {
        return getString(R.string.bolt_device_error, i < 10 ? String.format("E0%s", String.valueOf(i)) : String.format("E%s", String.valueOf(i)));
    }

    private HMSportController.TreadmillSportState B() {
        HMBoltClassicDevice hMBoltClassicDevice = (HMBoltClassicDevice) q.getValue().getDevice(HMDeviceType.TREADMILL);
        if (hMBoltClassicDevice == null) {
            return null;
        }
        return hMBoltClassicDevice.getSportState();
    }

    private void C(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
        if (hMDeviceFwUpgradeEvent.isStart()) {
            this.c.removeMessages(0);
            n0(getString(R.string.sync_data_label, 0));
            a0(false);
            d0(true);
        }
        if (hMDeviceFwUpgradeEvent.isProgress()) {
            n0(getString(R.string.sync_agps_data_label, Integer.valueOf(hMDeviceFwUpgradeEvent.getProgress().getPercent())));
        }
        if (hMDeviceFwUpgradeEvent.isStop()) {
            stopLoading();
            a0(true);
            if (hMDeviceFwUpgradeEvent.getResult()) {
                d0(false);
                return;
            }
            e0(getString(R.string.apgs_sync_fail), getString(R.string.help_statusfrag_retry));
            this.a.setActionClose(new View.OnClickListener() { // from class: nl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.N(view);
                }
            });
            this.a.setOnClickListener(new View.OnClickListener() { // from class: ql
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.O(view);
                }
            });
        }
    }

    private boolean D() {
        if (G()) {
            showMIUITips();
            return true;
        }
        if (!q.getValue().isBluetoothEnable()) {
            showOpenBLE();
            return true;
        }
        if (!y().isActivatedDevice()) {
            g0();
            return true;
        }
        if (!H()) {
            return false;
        }
        i0();
        return true;
    }

    private void E() {
        try {
            this.k = FeatureTreeFactory.INSTANCE.realCreate();
        } catch (Exception e) {
            HMLog.error(m, "1", e, new Function0() { // from class: jl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BTStatusFragment.P();
                }
            });
        }
    }

    private boolean F(HMDeviceType hMDeviceType) {
        return q.getValue().isConnected(hMDeviceType);
    }

    private boolean G() {
        return y().setTopTips().a;
    }

    private boolean H() {
        HMLog.d(m, "bind type : " + y().getHMDeviceType(), new Object[0]);
        Lazy<DeviceManagerApi> lazy = q;
        if (!lazy.getValue().hasBound(y().getHMDeviceType())) {
            return true;
        }
        List<HMDeviceSource> supportDevices = y().getSupportDevices();
        if (supportDevices == null) {
            return false;
        }
        return !supportDevices.contains(lazy.getValue().getBoundDeviceSource(y().getHMDeviceType()));
    }

    private boolean I() {
        FeatureTree featureTree = this.k;
        return featureTree != null && featureTree.isSupport(SoftFeature.DISABLE_AGPS_OR_GDSP_STATUS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(HMDeviceType hMDeviceType, View view) {
        h0(hMDeviceType, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view) {
        EarbudUtil.INSTANCE.showEarbudHelp(requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(HMDeviceType hMDeviceType, View view) {
        this.e = true;
        f0(hMDeviceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String M() {
        return "you not set listener!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(View view) {
        d0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(View view) {
        if (this.i.getValue().isSupportCloudFwUpgrade()) {
            FirmwareOnlineManagerApi value = this.g.getValue();
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (value.useOnline(hMDeviceType)) {
                this.g.getValue().checkFwUpgrade(hMDeviceType, false);
                return;
            }
        }
        this.f.getValue().checkFwUpgrade(HMDeviceType.MILI, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String P() {
        return "error of init feature tree ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q() {
        return "BLEStatueListener is null, you must call setBLEStatusListener()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        d0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(HMDeviceType hMDeviceType, View view) {
        h0(hMDeviceType, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(HMDeviceType hMDeviceType, View view) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.STATUSBAR_CONNECTIONFAILRETRY));
        if (hMDeviceType == HMDeviceType.EARBUD) {
            EarbudUtil.INSTANCE.showEarbudHelp(requireActivity());
        } else {
            h0(hMDeviceType, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(View view) {
        enableBluetooth(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(View view) {
        EarbudUtil.INSTANCE.showEarbudHelp(requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(HMDeviceType hMDeviceType, View view) {
        h0(hMDeviceType, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X(HMDeviceType hMDeviceType, View view) {
        q.getValue().startSyncData(hMDeviceType);
    }

    private boolean Y(HMDeviceSource hMDeviceSource) {
        return ConfigHelperKt.hasFeature(hMDeviceSource, Feature.SUPPORT_NEW_DEVICE_SETTING) && this.i.getValue().isSupportNoBlockDpui();
    }

    private void Z(HMSportController.TreadmillSportState treadmillSportState, int i) {
        if (!TreadmillErrorEventKt.ignore(i)) {
            l0(i);
            return;
        }
        a0(true);
        if (treadmillSportState == null) {
            return;
        }
        int i2 = c.a[treadmillSportState.ordinal()];
        if (i2 == 1) {
            m0(getString(R.string.bolt_state_running));
        } else if (i2 == 2) {
            m0(getString(R.string.bolt_state_paused));
        } else {
            stopLoading();
            d0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(boolean z) {
        if (z != this.d) {
            y().onEnableChange(z);
        }
        HMLog.d(m, "setEnableListener: " + z, new Object[0]);
        this.d = z;
    }

    private void b0() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = Boolean.TRUE;
        this.c.sendMessageDelayed(messageObtain, 500L);
    }

    private void c0(CharSequence charSequence) {
        if (this.a != null) {
            d0(true);
            this.a.clear();
            this.a.setIcon(R.drawable.icon_ok);
            this.a.setTitle(charSequence);
            this.a.postDelayed(new Runnable() { // from class: hl
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.R();
                }
            }, 1500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(boolean z) {
        TipComponent tipComponent = this.a;
        if (tipComponent != null) {
            if (!z) {
                if (tipComponent.getVisibility() != 8) {
                    this.a.setVisibility(8);
                }
            } else if (tipComponent.getVisibility() != 0) {
                this.a.setVisibility(0);
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.STATUSBAR_VIEWNUM));
            }
        }
    }

    private void e0(CharSequence charSequence, CharSequence charSequence2) {
        if (this.a != null) {
            d0(true);
            this.a.clear();
            this.a.setWarningStyle(charSequence, charSequence2);
        }
    }

    private static boolean enableBluetooth(Activity activity) {
        if (!q.getValue().isBluetoothSupportAndDisable()) {
            return true;
        }
        activity.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), p);
        return false;
    }

    private void f0(final HMDeviceType hMDeviceType) {
        if (hMDeviceType == HMDeviceType.EARBUD || this.e) {
            a0(false);
            int i = c.c[hMDeviceType.ordinal()];
            if (i == 1) {
                m0(getString(R.string.device_tip_connecting));
                this.a.setSubTitle(getString(R.string.device_tip_shoes, getString(R.string.chip_device_name)));
                return;
            }
            if (i == 2) {
                m0(getString(R.string.device_tip_connecting));
                this.a.setSubTitle(v());
            } else {
                if (i != 3) {
                    m0(getString(R.string.device_tip_connecting));
                    return;
                }
                m0(getString(R.string.device_tip_connecting));
                if (q.getValue().getBoundDeviceSource(hMDeviceType) == HMDeviceSource.OTHER_HAYDN) {
                    this.a.setSubTitle(s(hMDeviceType));
                    this.a.setActionHelp(new View.OnClickListener() { // from class: gl
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.S(hMDeviceType, view);
                        }
                    });
                }
            }
        }
    }

    private void g0() {
        this.e = false;
        a0(false);
        final HMDeviceType hMDeviceType = y().getHMDeviceType();
        if (this.a != null) {
            e0(getString(t(hMDeviceType)), s(hMDeviceType));
            this.a.setActionHelp(new View.OnClickListener() { // from class: el
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.T(hMDeviceType, view);
                }
            });
            this.a.setOnClickListener(u(hMDeviceType));
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.STATUSBAR_GROUP).setValue("ConnectionFail"));
    }

    private void h0(HMDeviceType hMDeviceType, int i) {
        this.h.getValue().showDeviceHelperActivity(getContext(), r.getValue().getHelpType(hMDeviceType), i);
    }

    private void i0() {
        StringBuilder sb = new StringBuilder();
        sb.append("unbind string : ");
        sb.append((Object) (y() != null ? y().getUnbindStr() : "null"));
        HMLog.d(m, sb.toString(), new Object[0]);
        if (y() != null && !TextUtils.isEmpty(y().getUnbindStr())) {
            e0(y().getUnbindStr(), null);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.STATUSBAR_GROUP).setValue(StatEvent.EventParams.NOTBIND));
    }

    private void j0(CharSequence charSequence, View.OnClickListener onClickListener) {
        HMLog.d(m, "showOpenBle", new Object[0]);
        if (this.a != null) {
            d0(true);
            this.a.clear();
            this.a.setWarningStyle(charSequence, null);
            this.a.setActionGoto(onClickListener);
        }
    }

    private void k0(final HMDeviceType hMDeviceType, int i) {
        if (I() || this.a == null) {
            return;
        }
        e0(z(hMDeviceType, i), getString(R.string.help_statusfrag_retry));
        if (HMDeviceType.EARBUD == hMDeviceType) {
            this.a.setActionHelp(new View.OnClickListener() { // from class: ol
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.V(view);
                }
            });
        } else {
            this.a.setActionHelp(new View.OnClickListener() { // from class: sl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.W(hMDeviceType, view);
                }
            });
        }
        this.a.setOnClickListener(new View.OnClickListener() { // from class: ml
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BTStatusFragment.X(hMDeviceType, view);
            }
        });
    }

    private void l0(int i) {
        this.e = false;
        a0(false);
        if (this.a != null) {
            e0(A(i), null);
        }
    }

    private void m0(CharSequence charSequence) {
        TipComponent tipComponent = this.a;
        if (tipComponent != null) {
            tipComponent.clear();
            d0(true);
            this.a.setTitle(charSequence);
            this.a.startLoading();
        }
    }

    private void n0(CharSequence charSequence) {
        TipComponent tipComponent = this.a;
        if (tipComponent != null) {
            if (!tipComponent.isLoading()) {
                this.a.clear();
                d0(true);
                this.a.startLoading();
            }
            this.a.setTitle(charSequence);
        }
    }

    public static BTStatusFragment newInstance(int i, FragmentManager fragmentManager) {
        BTStatusFragment bTStatusFragment = new BTStatusFragment();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.replace(i, bTStatusFragment);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        return bTStatusFragment;
    }

    private int r(@NonNull Progress progress) {
        if (progress.getPercent() <= 100) {
            return progress.getPercent();
        }
        HMLog.e(m, "progress over 100 " + progress, new Object[0]);
        return 100;
    }

    private String s(HMDeviceType hMDeviceType) {
        if (hMDeviceType == HMDeviceType.HEADSET) {
            return getString(R.string.headset_device_connected_failed_info);
        }
        if (hMDeviceType != HMDeviceType.EARBUD) {
            return getString(R.string.help_statusfrag_retry);
        }
        HmEarbudDevice hmEarbudDeviceW = w();
        if (hmEarbudDeviceW.isConnected() || hmEarbudDeviceW.getRightDevice().isConnected()) {
            return !hmEarbudDeviceW.isConnected() ? getString(R.string.earbud_left_connect_fail_tip) : getString(R.string.earbud_right_connect_fail_tip);
        }
        return getString(R.string.earbud_connect_fail_tip);
    }

    private void showMIUITips() {
        e0(y().setTopTips().b, null);
    }

    private void showOpenBLE() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.STATUSBAR_GROUP).setValue("BleOff"));
        j0(getString(R.string.device_tip_ble_not_open), new View.OnClickListener() { // from class: pl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.U(view);
            }
        });
    }

    private void showSuccess() {
        c0(getString(R.string.device_tip_connect_succeed));
    }

    private void stopLoading() {
        TipComponent tipComponent = this.a;
        if (tipComponent != null) {
            tipComponent.stopLoading();
        }
    }

    private int t(HMDeviceType hMDeviceType) {
        switch (c.c[hMDeviceType.ordinal()]) {
            case 1:
                return R.string.shoe_connect_fail;
            case 2:
                HmEarbudDevice hmEarbudDeviceW = w();
                if (hmEarbudDeviceW.isConnected() || hmEarbudDeviceW.getRightDevice().isConnected()) {
                    return !hmEarbudDeviceW.isConnected() ? R.string.bind_earbud_no_left : R.string.bind_earbud_no_right;
                }
                return R.string.earbud_connect_fail;
            case 3:
            case 6:
                return R.string.connect_failed;
            case 4:
                return HMDeviceConfig.hasBoundWatch() ? R.string.watch_connect_fail : R.string.band_connect_fail;
            case 5:
                return R.string.bluemonkey_connect_fail;
            default:
                return R.string.band_connect_fail;
        }
    }

    private View.OnClickListener u(final HMDeviceType hMDeviceType) {
        if (hMDeviceType != HMDeviceType.HEADSET || ConfigHelperKt.hasFeature(Feature.BTSTATUS_RETRY_UI)) {
            return hMDeviceType == HMDeviceType.EARBUD ? new View.OnClickListener() { // from class: rl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.K(view);
                }
            } : new View.OnClickListener() { // from class: tl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.L(hMDeviceType, view);
                }
            };
        }
        return new View.OnClickListener() { // from class: fl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.J(hMDeviceType, view);
            }
        };
    }

    private String v() {
        HmEarbudDevice hmEarbudDeviceW = w();
        if (hmEarbudDeviceW.isConnected() || hmEarbudDeviceW.isRightConnect()) {
            return !hmEarbudDeviceW.isConnected() ? getString(R.string.earbud_search_left) : getString(R.string.earbud_search_right);
        }
        return getString(R.string.earbud_searching);
    }

    private HmEarbudDevice w() {
        return (HmEarbudDevice) q.getValue().getDevice(HMDeviceType.EARBUD);
    }

    private int x(HMDeviceType hMDeviceType) {
        return ConnectFailureDialogFactory.getHelpType(hMDeviceType);
    }

    private BLEStatueListener y() {
        BLEStatueListener bLEStatueListener = this.b;
        if (bLEStatueListener != null) {
            return bLEStatueListener;
        }
        HMLog.error(m, new Function0() { // from class: kl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BTStatusFragment.M();
            }
        });
        return this.l;
    }

    private String z(HMDeviceType hMDeviceType, int i) {
        int i2;
        int i3 = R.string.band_sync_fail;
        HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
        if (hMDeviceType == hMDeviceType2) {
            HMDeviceSource boundDeviceSource = q.getValue().getBoundDeviceSource(hMDeviceType2);
            if (HMDeviceConfig.hasBoundWatch()) {
                i3 = R.string.watch_sync_fail;
            }
            if (i != 5) {
                if (i == 6 && HMDeviceConfig.supportMusicControl(boundDeviceSource)) {
                    i2 = HMDeviceConfig.isWatch(boundDeviceSource) ? R.string.unable_sync_in_music_watch : R.string.unable_sync_in_music;
                    i3 = i2;
                }
            } else if (HMDeviceConfig.hasFeatureSportOrTimer(boundDeviceSource)) {
                i2 = R.string.unable_sync_in_sport;
                i3 = i2;
            }
        } else if (hMDeviceType == HMDeviceType.SHOES) {
            i3 = R.string.shoe_sync_fail;
        } else if (hMDeviceType == HMDeviceType.EARBUD) {
            i3 = R.string.earbud_sync_fail;
        } else if (hMDeviceType == HMDeviceType.HEADSET) {
            i3 = R.string.headset_sync_failed;
        }
        return getString(i3);
    }

    public boolean getLastEnableState() {
        return this.d;
    }

    public boolean isConnected() {
        return F(y().getHMDeviceType());
    }

    public boolean isShowing() {
        TipComponent tipComponent = this.a;
        return tipComponent != null && tipComponent.getVisibility() == 0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.c = new a(Looper.getMainLooper());
        E();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = new TipComponent(getActivity());
        d0(false);
        this.a.setDividerVisibility(8);
        this.a.setBottomAreaVisible(this.j);
        return this.a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.stopLoading();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(HMActiveDeviceEvent hMActiveDeviceEvent) {
        HMLog.d(m, "HMActiveDeviceEvent:" + hMActiveDeviceEvent, new Object[0]);
        if (y().getHMDeviceType() == hMActiveDeviceEvent.getDeviceType() && D()) {
            a0(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"StringFormatInvalid"})
    public void onStart() {
        Progress agpsProgress;
        String string;
        String string2;
        super.onStart();
        if (this.b == null) {
            HMLog.error(m, new Function0() { // from class: il
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BTStatusFragment.Q();
                }
            });
        }
        HMLog.d(m, "mBLEListener.getHMDeviceType : " + y().getHMDeviceType(), new Object[0]);
        if (D()) {
            a0(false);
            return;
        }
        if (!F(y().getHMDeviceType())) {
            f0(y().getHMDeviceType());
            return;
        }
        HMDeviceType hMDeviceType = y().getHMDeviceType();
        Lazy<DeviceManagerApi> lazy = q;
        HMDeviceSource boundDeviceSource = lazy.getValue().getBoundDeviceSource(hMDeviceType);
        if (y().getHMDeviceType() == HMDeviceType.EARBUD || ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, boundDeviceSource)) {
            return;
        }
        HMBaseDevice device = lazy.getValue().getDevice(y().getHMDeviceType());
        if (hMDeviceType == HMDeviceType.TREADMILL) {
            Z(B(), FtmsErrorHelper.INSTANCE.getErrorCode());
            return;
        }
        if (device == null || (device instanceof HMBaseClassicDevice) || I()) {
            return;
        }
        Progress progress = device.getSyncStatus().getProgress();
        if (progress != null) {
            a0(false);
            int iR = r(progress);
            try {
                string2 = getString(R.string.sync_data_label, Integer.valueOf(iR));
            } catch (Exception unused) {
                string2 = "Syncing data " + iR + "%";
            }
            n0(string2);
        } else {
            int error = device.getSyncStatus().getError().getError();
            if (error != 0) {
                k0(y().getHMDeviceType(), error);
            }
        }
        if (!(device instanceof HMMiLiProDevice) || (agpsProgress = HMAgpsUpgradeManager.getAgpsProgress()) == null) {
            return;
        }
        a0(false);
        int percent = agpsProgress.getPercent();
        try {
            string = getString(R.string.sync_agps_data_label, Integer.valueOf(percent));
        } catch (Exception unused2) {
            string = "Updating A-GPS " + percent + "%";
        }
        n0(string);
    }

    public void setBLEStatusListener(BLEStatueListener bLEStatueListener) {
        if (bLEStatueListener != null) {
            this.b = bLEStatueListener;
            bLEStatueListener.notifyStatusWhenSetting(getLastEnableState());
        }
    }

    public void setBottomAreaVisible(boolean z) {
        this.j = z;
        this.a.setBottomAreaVisible(z);
    }

    public void setShowBottomArea(boolean z) {
        this.j = z;
    }

    public void onEventMainThread(EventBluetooth eventBluetooth) {
        HMLog.d(m, "EventBluetooth : " + eventBluetooth.isOn, new Object[0]);
        if (D()) {
            a0(false);
        } else if (eventBluetooth.isOn) {
            E();
            f0(y().getHMDeviceType());
        }
    }

    public void onEventMainThread(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        HMLog.d(m, "HMDeviceSyncDataEvent:" + hMDeviceSyncDataEvent, new Object[0]);
        HMDeviceSource boundDeviceSource = q.getValue().getBoundDeviceSource(hMDeviceSyncDataEvent.getDeviceType());
        if ((boundDeviceSource == null || !Y(boundDeviceSource)) && !I() && y().getHMDeviceType() != HMDeviceType.EARBUD && y().getHMDeviceType() == hMDeviceSyncDataEvent.getDeviceType()) {
            if (hMDeviceSyncDataEvent.isStart()) {
                this.c.removeMessages(0);
                n0(hMDeviceSyncDataEvent.isShowProgress() ? getString(R.string.sync_data_label, 0) : getString(R.string.pull_to_refresh_refreshing_label));
                a0(false);
                d0(true);
            }
            if (hMDeviceSyncDataEvent.isProgress()) {
                n0(hMDeviceSyncDataEvent.isShowProgress() ? getString(R.string.sync_data_label, Integer.valueOf(r(hMDeviceSyncDataEvent.getProgress()))) : getString(R.string.pull_to_refresh_refreshing_label));
            }
            if (hMDeviceSyncDataEvent.isStop()) {
                a0(true);
                stopLoading();
                if (hMDeviceSyncDataEvent.getResult()) {
                    d0(false);
                } else {
                    k0(hMDeviceSyncDataEvent.getDeviceType(), hMDeviceSyncDataEvent.getError());
                }
            }
        }
    }

    public void onEventMainThread(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
        HMLog.d(m, "HMDeviceFwUpgradeEvent:" + hMDeviceFwUpgradeEvent, new Object[0]);
        if (!I() && y().getHMDeviceType() == hMDeviceFwUpgradeEvent.getDeviceSource().getType()) {
            if (hMDeviceFwUpgradeEvent.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_CEP || hMDeviceFwUpgradeEvent.getFirmwareType() == HMFirmwareType.FIRMWARE_GPS_NMEA) {
                C(hMDeviceFwUpgradeEvent);
            }
        }
    }

    public void onEventMainThread(TreadmillSportEvent treadmillSportEvent) {
        HMLog.i(m, "treadmillSportEvent: " + treadmillSportEvent.toString(), new Object[0]);
        if (y().getHMDeviceType() != HMDeviceType.TREADMILL) {
            return;
        }
        int i = c.b[treadmillSportEvent.getCommand().ordinal()];
        if (i == 1 || i == 2) {
            m0(getString(R.string.bolt_state_running));
            return;
        }
        if (i == 3) {
            m0(getString(R.string.bolt_state_paused));
        } else {
            if (i != 4) {
                return;
            }
            d0(false);
            stopLoading();
        }
    }

    public void onEventMainThread(TreadmillErrorEvent treadmillErrorEvent) {
        if (HMDeviceType.TREADMILL == y().getHMDeviceType()) {
            Z(B(), treadmillErrorEvent.getErrorCode());
        }
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        if (hMDeviceConnectionEvent.getDeviceType() != y().getHMDeviceType()) {
            return;
        }
        if (D()) {
            a0(false);
            return;
        }
        if (hMDeviceConnectionEvent.isConnected()) {
            E();
            this.e = true;
            b0();
            if (y().getHMDeviceType() == HMDeviceType.TREADMILL) {
                Z(B(), FtmsErrorHelper.INSTANCE.getErrorCode());
                return;
            }
            return;
        }
        if (q.getValue().isBluetoothEnable()) {
            if (hMDeviceConnectionEvent.isConnectingTimeout()) {
                g0();
                return;
            } else {
                f0(hMDeviceConnectionEvent.getDeviceType());
                return;
            }
        }
        showOpenBLE();
    }
}
