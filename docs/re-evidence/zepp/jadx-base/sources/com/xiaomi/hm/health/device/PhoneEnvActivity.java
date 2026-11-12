package com.xiaomi.hm.health.device;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.amazfit_watch.BindWatchActivity;
import com.xiaomi.hm.health.device.capturedevice.HMCaptureWatchQRActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class PhoneEnvActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String O = "PhoneEnvActivity";
    private static final String P = "type";
    private static final String Q = "bind_type";
    private static final String R = "watch_type";
    private static final String S = "device_source";
    private static final int T = 1;
    private static final int U = 0;
    private static final int V = 1;
    private static final int W = 2;
    private static final int X = 3;
    private static final int Y = 4;
    private TextView A;
    private TextView B;
    private ImageView C;
    private ImageView D;
    private ImageView E;
    private ImageView F;
    private int G;
    private Context I;
    private TextView x;
    private TextView y;
    private TextView z;
    private int J = 0;
    private int K = 0;
    private HMDeviceSource L = HMDeviceSource.VDEVICE;
    private final Lazy<DeviceUtilsApi> M = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceXNavigator> N = KoinJavaComponent.inject(DeviceXNavigator.class);
    private BluetoothAdapter H = BluetoothAdapter.getDefaultAdapter();

    private void init() {
        this.I = getApplicationContext();
        m();
        Intent intent = getIntent();
        if (intent != null) {
            this.G = intent.getIntExtra("type", 0);
            this.J = intent.getIntExtra("bind_type", 0);
            this.K = intent.getIntExtra(R, 0);
            this.L = (HMDeviceSource) intent.getSerializableExtra("device_source");
        }
    }

    private void l() {
        switch (this.J) {
            case 0:
                if (!this.M.getValue().checkConnectedMiLiDevice(this)) {
                    this.N.getValue().startBind(this, HMDeviceType.MILI);
                }
                break;
            case 1:
                this.N.getValue().startBind(this, HMDeviceType.WEIGHT);
                break;
            case 2:
                this.N.getValue().startBindShoes(this);
                break;
            case 3:
                int value = HMBrandType.BRAND_DEFAULT.getValue();
                if (getIntent() != null) {
                    value = getIntent().getIntExtra("bind_brand_type", value);
                }
                this.N.getValue().startBindNormandy(this, HMBrandType.fromValue(value));
                break;
            case 5:
                BindWatchActivity.start(this, this.K);
                break;
            case 6:
                this.N.getValue().startBind(this, HMDeviceType.OTHER);
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 19:
            case 21:
            case 22:
            case 23:
            case 26:
            case 27:
                if (!this.M.getValue().checkConnectedWatchDevice(this, this.J)) {
                    int i = this.J;
                    if ((i == 11 || i == 12 || i == 19) || i == 21 || i == 23) {
                        HMCaptureWatchQRActivity.startCapture(this, i);
                    } else {
                        this.N.getValue().startBindWatch(this, null, this.J);
                    }
                }
                break;
            case 20:
                this.N.getValue().startBind(this, HMDeviceType.HEADSET);
                break;
            case 25:
                this.N.getValue().startBindEarbud(this);
                break;
            case 28:
                this.N.getValue().startBindHeadSetNew(this, this.L);
                break;
        }
    }

    private void m() {
        this.x = (TextView) findViewById(R.id.title);
        this.y = (TextView) findViewById(R.id.sub_title);
        this.z = (TextView) findViewById(R.id.left_btn);
        this.A = (TextView) findViewById(R.id.right_btn);
        this.B = (TextView) findViewById(R.id.center_btn);
        this.C = (ImageView) findViewById(R.id.center_img);
        this.D = (ImageView) findViewById(R.id.tips_img_1);
        this.E = (ImageView) findViewById(R.id.tips_img_2);
        this.F = (ImageView) findViewById(R.id.tips_img_3);
        this.B.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.z.setOnClickListener(this);
    }

    private void n() {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
    }

    private void o() {
        this.C.setVisibility(0);
        this.D.setVisibility(0);
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        this.B.setVisibility(0);
        this.z.setVisibility(8);
        this.A.setVisibility(8);
        this.x.setText(getString(R.string.ble_equal_system_4_3_title));
        this.y.setText(getString(R.string.ble_equal_system_4_3_sub_title));
        this.D.setImageResource(R.drawable.img_upgrade);
        this.B.setText(R.string.got_it);
    }

    private void p() {
        this.C.setVisibility(0);
        this.D.setVisibility(0);
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        this.B.setVisibility(0);
        this.z.setVisibility(8);
        this.A.setVisibility(8);
        this.D.setImageResource(R.drawable.img_upgrade);
        this.B.setText(R.string.got_it);
        this.x.setText(getString(R.string.ble_phone_not_support));
        this.y.setText(getString(R.string.ble_low_system_4_3_sub_title));
    }

    private void q() {
        this.C.setVisibility(0);
        this.D.setVisibility(0);
        this.E.setVisibility(8);
        this.F.setVisibility(0);
        this.z.setVisibility(0);
        this.A.setVisibility(0);
        this.B.setVisibility(8);
        this.x.setText(R.string.ble_no_network_tip);
        this.y.setText(R.string.network_tips);
        this.D.setImageResource(R.drawable.img_net);
        this.z.setText(R.string.cancel);
        this.A.setText(R.string.retry);
    }

    private void r() {
        this.C.setVisibility(0);
        this.D.setVisibility(0);
        this.E.setVisibility(0);
        this.F.setVisibility(8);
        this.z.setVisibility(0);
        this.A.setVisibility(0);
        this.B.setVisibility(8);
        this.x.setText(R.string.ble_not_open);
        this.y.setText(R.string.ble_open_bluetooth_tip);
        this.D.setImageResource(R.drawable.img_bluetooth);
        this.E.setImageResource(R.drawable.img_accept);
        this.z.setText(R.string.cancel);
        this.A.setText(R.string.open);
    }

    private void s() {
        this.C.setVisibility(0);
        this.D.setVisibility(0);
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        this.B.setVisibility(0);
        this.z.setVisibility(8);
        this.A.setVisibility(8);
        this.x.setText(getString(R.string.ble_phone_not_support));
        this.y.setText(getString(R.string.ble_not_support_ble4));
        this.D.setImageResource(R.drawable.img_bluetooth);
        this.B.setText(R.string.got_it);
    }

    private void t(int i, int i2, int i3) {
        Intent intent = new Intent(this.I, (Class<?>) PhoneEnvActivity.class);
        intent.putExtra("type", i);
        intent.putExtra("bind_type", i2);
        intent.putExtra(R, i3);
        intent.putExtra("device_source", HMDeviceSource.VDEVICE);
        intent.setFlags(268435456);
        this.I.startActivity(intent);
    }

    public static boolean testPhoneEnv(Context context, boolean z, int i, HMBrandType hMBrandType, HMDeviceSource hMDeviceSource) {
        if (z && !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            HMLog.d(O, "NOT_SUPPORT_BLE4", new Object[0]);
            Analytics.event(context, StatEvent.BIND_PHONE_ENV, StatEvent.BIND_PHONE_ENV_BT_BELOW_4);
            v(context, 0, i, hMBrandType, hMDeviceSource);
            return false;
        }
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            HMLog.d(O, "NOT_OPEN_BLE", new Object[0]);
            Analytics.event(context, StatEvent.BIND_PHONE_ENV, "OffBLE");
            v(context, 3, i, hMBrandType, hMDeviceSource);
            return false;
        }
        if (NetUtil.isNetworkConnected(context)) {
            HMLog.d(O, "BleEnv is enable", new Object[0]);
            Analytics.event(context, StatEvent.BIND_PHONE_ENV, "Success");
            return true;
        }
        HMLog.d(O, "NOT_OPEN_NETWORK", hMDeviceSource);
        Analytics.event(context, StatEvent.BIND_PHONE_ENV, "OffLine");
        v(context, 4, i, hMBrandType, hMDeviceSource);
        return false;
    }

    private static void u(Context context, int i, int i2, HMBrandType hMBrandType) {
        Intent intent = new Intent(context, (Class<?>) PhoneEnvActivity.class);
        intent.putExtra("type", i);
        intent.putExtra("bind_type", i2);
        intent.putExtra("bind_brand_type", hMBrandType.getValue());
        intent.putExtra("device_source", HMDeviceSource.VDEVICE);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static void v(Context context, int i, int i2, HMBrandType hMBrandType, HMDeviceSource hMDeviceSource) {
        Intent intent = new Intent(context, (Class<?>) PhoneEnvActivity.class);
        intent.putExtra("type", i);
        intent.putExtra("bind_type", i2);
        intent.putExtra("bind_brand_type", hMBrandType.getValue());
        intent.putExtra("device_source", hMDeviceSource);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private void w(int i) {
        if (i == 0) {
            s();
            return;
        }
        if (i == 1) {
            p();
            return;
        }
        if (i == 2) {
            o();
        } else if (i == 3) {
            r();
        } else {
            if (i != 4) {
                return;
            }
            q();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 != -1) {
            this.G = 3;
        } else if (NetUtil.isNetworkConnected(this.I)) {
            l();
            finish();
        } else {
            q();
            this.G = 4;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.center_btn) {
            if (this.G != 2) {
                finish();
                return;
            }
            BluetoothAdapter bluetoothAdapter = this.H;
            if (bluetoothAdapter != null && !bluetoothAdapter.isEnabled()) {
                r();
                this.G = 3;
                return;
            } else if (NetUtil.isNetworkConnected(this)) {
                l();
                finish();
                return;
            } else {
                q();
                this.G = 4;
                return;
            }
        }
        if (id != R.id.right_btn) {
            if (id == R.id.left_btn) {
                finish();
                return;
            }
            return;
        }
        int i = this.G;
        if (i == 3) {
            n();
            this.G = 4;
            return;
        }
        if (i == 4) {
            if (!NetUtil.isNetworkConnected(this)) {
                IconToast.showError(this, getString(R.string.not_connect_network));
                return;
            }
            BluetoothAdapter bluetoothAdapter2 = this.H;
            if (bluetoothAdapter2 == null || bluetoothAdapter2.isEnabled()) {
                l();
                finish();
            } else {
                r();
                this.G = 3;
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_phone_env);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.trans), !RainbowUtils.isDarkMode(this));
        init();
        w(this.G);
    }

    public static boolean testPhoneEnv(Context context, boolean z, int i, HMDeviceSource hMDeviceSource) {
        return testPhoneEnv(context, z, i, HMBrandType.BRAND_DEFAULT, hMDeviceSource);
    }

    public static boolean testPhoneEnv(Context context, boolean z, int i) {
        return testPhoneEnv(context, z, i, HMBrandType.BRAND_DEFAULT, HMDeviceSource.VDEVICE);
    }

    public boolean testPhoneEnv(Context context, int i, int i2) {
        this.I = context;
        if (!NetUtil.isNetworkConnected(context)) {
            HMLog.d(O, "NOT_OPEN_NETWORK", new Object[0]);
            Analytics.event(context, StatEvent.BIND_PHONE_ENV, "OffLine");
            t(4, i, i2);
            return false;
        }
        Analytics.event(context, StatEvent.BIND_PHONE_ENV, "Success");
        return true;
    }
}
