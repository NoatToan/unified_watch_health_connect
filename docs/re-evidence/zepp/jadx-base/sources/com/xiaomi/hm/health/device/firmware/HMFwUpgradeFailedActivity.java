package com.xiaomi.hm.health.device.firmware;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.AppNotificationApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.view.progress.ProgressView;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.device.headset.MozartUpgradePrepareActivity;
import com.xiaomi.hm.health.device.headset.MozartUpgradePrepareViewModel;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import de.greenrobot.event.EventBus;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwUpgradeFailedActivity extends BaseTitleActivity {
    private static final int Q = 0;
    private static final int R = 1;
    private static final int S = 2;
    private static final int T = 3;
    private static final int U = 1024;
    private static final int V = 1;
    private TextView A;
    private TextView B;
    private TextView C;
    private ImageView D;
    private ImageView E;
    private ImageView F;
    private ProgressView G;
    private IHMFwUpgradeInfo H;
    private TextView y;
    private TextView z;
    private int x = 0;
    private HMDeviceSource I = HMDeviceSource.VDEVICE;
    private String J = null;
    private MozartUpgradePrepareViewModel K = null;
    private final Lazy<DeviceManagerApi> L = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceXNavigator> M = KoinJavaComponent.inject(DeviceXNavigator.class);
    private final Lazy<DeviceUtilsApi> N = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<AppNotificationApi> O = KoinJavaComponent.inject(AppNotificationApi.class);
    private final Lazy<KeeperProxyApi> P = KoinJavaComponent.inject(KeeperProxyApi.class);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            a = iArr;
            try {
                iArr[HMDeviceType.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceType.TREADMILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceType.SHOES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceType.WATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceType.WEIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceType.EARBUD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceType.HEADSET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        r();
        HMFwOnlineAnalyticsKt.firmwareUpgradeRetryCancelC();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        if (this.N.getValue().isFastDoubleClick(view)) {
            return;
        }
        if (this.L.getValue().isBluetoothEnable()) {
            t();
        } else {
            s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        r();
        HMFwOnlineAnalyticsKt.firmwareUpgradeFailCancelC();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(View view) {
        this.M.getValue().startHMFwChangeLogActivity(this, this.J);
    }

    private boolean F() {
        return this.I == HMDeviceSource.OTHER_HAYDN;
    }

    private void G(boolean z) {
        this.D.setVisibility(z ? 0 : 8);
        this.E.setVisibility(z ? 0 : 8);
        this.F.setVisibility(z ? 0 : 8);
    }

    private void H(int i) {
        this.x = i;
    }

    private void I() {
        HMFwOnlineUpgradeManager.getInstance().showUpgradeActivityForRetry(this);
        finish();
    }

    private void J() {
        int imageForDevice;
        if (!ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, this.I) && (imageForDevice = this.N.getValue().getImageForDevice(this.I)) > 0) {
            if (ConfigHelperKt.hasFeature(this.I, Feature.BOLT_SERIES)) {
                this.G.setImageResource(imageForDevice, 0.48f);
            } else {
                this.G.setImageResource(imageForDevice, 0.67f);
            }
        }
    }

    private boolean K() {
        return DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(this.I.getType());
    }

    private void initViews() {
        ProgressView progressView = (ProgressView) findViewById(R.id.bind_chart);
        this.G = progressView;
        progressView.setAlpha(0.4f);
        int i = R.id.fw_failed_title;
        this.y = (TextView) findViewById(i);
        int i2 = R.id.fw_failed_tips;
        this.z = (TextView) findViewById(i2);
        this.B = (TextView) findViewById(R.id.left_btn);
        this.C = (TextView) findViewById(R.id.center_btn);
        this.A = (TextView) findViewById(R.id.right_btn);
        this.D = (ImageView) findViewById(R.id.phone_img);
        this.E = (ImageView) findViewById(R.id.bluetooth_img);
        this.F = (ImageView) findViewById(R.id.accept_img);
        String[] stringArray = getResources().getStringArray(R.array.unbind_device_description);
        int i3 = R.string.fw_failed_title;
        String string = getString(i3, new Object[]{stringArray[0]});
        String string2 = getString(R.string.fw_failed_tips, new Object[]{stringArray[0]});
        int intExtra = getIntent().getIntExtra("bind_type", 0);
        if (intExtra == 3) {
            string = getString(i3, new Object[]{stringArray[2]});
            string2 = getString(R.string.fw_failed_tips_1, new Object[]{stringArray[2]});
        } else if (intExtra == 4) {
            int i4 = R.string.normandy_fw_failed;
            int i5 = R.string.chip_device_name;
            String string3 = getString(i4, new Object[]{getString(i5)});
            string2 = getString(R.string.normandy_fw_failed_tips, new Object[]{getString(i5)});
            string = string3;
        } else if (intExtra == 2) {
            String string4 = getString(HMDeviceConfig.hasBoundBfs() ? R.string.bind_weight_bfs : R.string.bind_weight_normal);
            string = getString(i3, new Object[]{string4});
            string2 = getString(R.string.fw_failed_tips_1, new Object[]{string4});
        } else if (intExtra == 1) {
            string = getString(i3, new Object[]{getString(R.string.fw_upgrade_hr)});
        } else if (intExtra == 5) {
            string = getString(R.string.fw_upgrade_font_failed_title);
        } else if (intExtra == 7) {
            string = getString(R.string.fw_upgrade_agps_failed_title);
            string2 = getString(R.string.fw_upgrade_agps_failed_tips);
        } else if (intExtra == 8) {
            string = getString(R.string.fw_upgrade_chaohu_failed_title);
            string2 = getString(R.string.fw_upgrade_chaohu_failed_tips);
        } else if (intExtra == 9) {
            string = getString(R.string.fw_upgrade_chaohu_gps_failed_title);
            string2 = getString(R.string.fw_upgrade_chaohu_failed_tips);
        } else if (intExtra == 6) {
            string = getString(R.string.fw_upgrade_res_failed_title);
            int i6 = R.string.fw_failed_tips_1;
            Object[] objArr = new Object[1];
            objArr[0] = HMDeviceConfig.hasBoundWatch() ? stringArray[3] : stringArray[0];
            string2 = getString(i6, objArr);
        } else if (intExtra == 11) {
            string = getString(R.string.treadmill_upgrade_fail);
            string2 = getString(R.string.treadmill_upgrade_fail_tip);
        } else if (10 == intExtra) {
            string = getString(R.string.fw_upgrade_bm_fail);
            string2 = getString(R.string.fw_upgrade_bm_fail_tips);
        } else if (13 == intExtra) {
            string = getString(R.string.fw_upgrade_earbud_fail);
            string2 = getString(R.string.fw_upgrade_earbud_fail_tips);
        } else if (12 == intExtra) {
            if (this.I == HMDeviceSource.OTHER_HAYDN) {
                string = getString(R.string.headset_upgrade_failed_title);
                string2 = getString(R.string.headset_upgrade_failed_hint);
            } else {
                string = getString(R.string.headset_fw_upgrade_failed_title);
                string2 = getString(R.string.headset_fw_upgrade_failed_tip);
            }
        }
        ((TextView) findViewById(i)).setText(string);
        ((TextView) findViewById(i2)).setText(string2);
        y();
    }

    private void r() {
        H(3);
        if (!K()) {
            HMFwUtils.deleteFwFile((HMFwUpgradeInfo) this.H);
        }
        finish();
    }

    private void s() {
        this.G.setVisibility(8);
        this.y.setText(R.string.bluetooth_is_off);
        this.z.setText(R.string.ble_open_bluetooth_tip);
        this.A.setText(R.string.open);
        G(true);
        this.A.setOnClickListener(new View.OnClickListener() { // from class: yv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.z(view);
            }
        });
    }

    private void t() {
        if (!u(this.I.getType())) {
            H(2);
            I();
        } else if (F()) {
            startActivityForResult(MozartUpgradePrepareActivity.newIntent(this, this.L.getValue().getBoundDeviceAddress(this.I.getType())), 1);
            H(1);
        } else {
            this.G.setVisibility(0);
            this.y.setText(R.string.fw_upgrade_retry);
            this.B.setVisibility(8);
            this.A.setVisibility(8);
            this.C.setVisibility(0);
            G(false);
            this.z.setText(getString(R.string.fw_upgrade_connecting, new Object[]{v(this.I)}));
            H(1);
        }
        if (K()) {
            HMFwOnlineAnalyticsKt.firmwareUpgradeFailRetryC();
        }
        this.C.setOnClickListener(new View.OnClickListener() { // from class: uv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.A(view);
            }
        });
    }

    private boolean u(HMDeviceType hMDeviceType) {
        return (hMDeviceType == HMDeviceType.HEADSET && F()) ? !w().isReady() : !this.L.getValue().isConnected(this.I.getType());
    }

    private String v(HMDeviceSource hMDeviceSource) {
        switch (a.a[hMDeviceSource.getType().ordinal()]) {
            case 1:
                return HMDeviceConfig.hasBoundWatch() ? getString(R.string.device_watch) : getString(R.string.device_band);
            case 2:
                return getString(R.string.device_treadmill);
            case 3:
                return getString(R.string.device_shoe);
            case 4:
                return getString(R.string.device_watch);
            case 5:
                return hMDeviceSource == HMDeviceSource.WEIGHT ? getString(R.string.device_weight) : getString(R.string.weight_bfs);
            case 6:
                return getString(R.string.device_earbud);
            case 7:
                return getString(R.string.device_headset);
            default:
                return null;
        }
    }

    private MozartUpgradePrepareViewModel w() {
        if (this.K == null) {
            this.K = (MozartUpgradePrepareViewModel) new ViewModelProvider(this).get(MozartUpgradePrepareViewModel.class);
            this.K.setDevice(this.L.getValue().getBindDevice(this.I.getType(), this.L.getValue().getBoundDeviceAddress(this.I.getType())));
        }
        return this.K;
    }

    private void x() {
        List<HMFwOnlineUpgradeInfo> retryFirmwareInfos;
        if (K()) {
            HMFwOnlineUpgradeManager.getInstance();
            if (HMFwOnlineUpgradeManager.isSupportContinueUpgrade(this.I)) {
                retryFirmwareInfos = HMFwOnlineUpgradeManager.getInstance().getRetryFirmwareInfos();
            } else {
                this.H = HMFwOnlineUpgradeManager.getInstance().getUpgradeInfo();
            }
            if ((retryFirmwareInfos == null && retryFirmwareInfos.size() > 0) || this.H != null) {
                this.A.setOnClickListener(new View.OnClickListener() { // from class: vv2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.B(view);
                    }
                });
                this.B.setOnClickListener(new View.OnClickListener() { // from class: tv2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.C(view);
                    }
                });
            }
            this.B.setVisibility(8);
            this.A.setVisibility(8);
            this.C.setVisibility(0);
            this.C.setText(R.string.got_it);
            this.C.setOnClickListener(new View.OnClickListener() { // from class: wv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.D(view);
                }
            });
            return;
        }
        this.H = HMFwUpgradeManager.getInstance().getUpgradeInfo();
        retryFirmwareInfos = null;
        if (retryFirmwareInfos == null) {
            this.B.setVisibility(8);
            this.A.setVisibility(8);
            this.C.setVisibility(0);
            this.C.setText(R.string.got_it);
            this.C.setOnClickListener(new View.OnClickListener() { // from class: wv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.D(view);
                }
            });
            return;
        }
        this.B.setVisibility(8);
        this.A.setVisibility(8);
        this.C.setVisibility(0);
        this.C.setText(R.string.got_it);
        this.C.setOnClickListener(new View.OnClickListener() { // from class: wv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.D(view);
            }
        });
        return;
        this.A.setOnClickListener(new View.OnClickListener() { // from class: vv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.B(view);
            }
        });
        this.B.setOnClickListener(new View.OnClickListener() { // from class: tv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.C(view);
            }
        });
    }

    private void y() {
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            TextView textView = (TextView) findViewById(R.id.fw_upgrade_log);
            if (!TextUtils.isEmpty(this.J)) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: xv2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.E(view);
                    }
                });
            }
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view) {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1024);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024 && i2 == -1) {
            t();
            return;
        }
        if (i == 1) {
            if (i2 == -1) {
                H(2);
                I();
            } else if (i2 == 0) {
                finish();
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_fw_upgrade_failed);
        UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
        EventBus.getDefault().register(this);
        int intExtra = getIntent().getIntExtra("device_source", HMDeviceSource.MILI.getValue());
        this.J = getIntent().getStringExtra(HMFwUpgradeActivity.FW_UPGRADE_CHANGE_LOG);
        this.I = HMDeviceSource.fromValue(intExtra);
        initViews();
        x();
        if (K()) {
            HMFwOnlineAnalyticsKt.firmwareUpgradeRetryV();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        boolean z = hMDeviceConnectionEvent.getDeviceType() == this.I.getType();
        if (this.x == 1 && z && this.L.getValue().isConnected(this.I.getType()) && !F()) {
            H(2);
            I();
        }
    }
}
