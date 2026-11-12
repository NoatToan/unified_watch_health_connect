package com.xiaomi.hm.health.device;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMNormandyDevice;
import com.xiaomi.hm.health.bt.device.HMShoesDevice;
import com.xiaomi.hm.health.bt.profile.normandy.HMCalibrateConfig;
import com.xiaomi.hm.health.bt.profile.normandy.HMCalibrateResult;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMShoesCalibrateActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String G = "HMShoesCalibrateActivity";
    private static final int H = 0;
    private static final int I = 1;
    private static final int J = 2;
    private static final int K = 3;
    private TextView x;
    private TextView z;
    private LoadingDialog y = null;
    private boolean A = false;
    private int B = 1;
    private HMDeviceSource C = HMDeviceSource.SHOES;
    private final Lazy<DeviceManagerApi> D = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceUtilsApi> E = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceXNavigator> F = KoinJavaComponent.inject(DeviceXNavigator.class);

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HMShoesCalibrateActivity.this.z.setText(R.string.shoes_setting_calibrate_sub_tips);
            dialogInterface.dismiss();
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            if (HMShoesCalibrateActivity.this.isDestroyed()) {
                return;
            }
            if (z) {
                HMShoesCalibrateActivity.this.t();
            } else {
                HMShoesCalibrateActivity.this.s();
            }
            Analytics.event(HMShoesCalibrateActivity.this, StatEvent.DeviceSetting.SHOE_CALIB_RESULT, z ? "success" : "Fail");
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            super.onStart();
            HMShoesCalibrateActivity.this.u();
        }
    }

    public class c extends HMCallback<HMCalibrateResult> {
        public c() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(HMCalibrateResult hMCalibrateResult) {
            super.onData(hMCalibrateResult);
            boolean z = false;
            HMLog.d(HMShoesCalibrateActivity.G, "HMCalibrateResult:" + hMCalibrateResult, new Object[0]);
            if (HMShoesCalibrateActivity.this.isDestroyed()) {
                return;
            }
            if (hMCalibrateResult != null && hMCalibrateResult.isSuccess()) {
                z = true;
            }
            if (z) {
                HMShoesCalibrateActivity.this.t();
            } else {
                HMShoesCalibrateActivity.this.s();
            }
            Analytics.event(HMShoesCalibrateActivity.this, StatEvent.DeviceSetting.SHOE_CALIB_RESULT, z ? "success" : "Fail");
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            super.onStart();
            HMShoesCalibrateActivity.this.u();
        }
    }

    private void initViews() {
        TextView textView = (TextView) findViewById(R.id.right_btn);
        this.x = textView;
        textView.setText(R.string.shoes_start);
        this.x.setOnClickListener(this);
        this.z = (TextView) findViewById(R.id.shoes_calibrate_sub_tips);
        TextView textView2 = (TextView) findViewById(R.id.left_btn);
        textView2.setText(R.string.cancel);
        textView2.setOnClickListener(this);
    }

    private void p() {
        ((HMNormandyDevice) this.D.getValue().getDevice(HMDeviceType.SHOES)).calibrate(new HMCalibrateConfig(HMPersonInfo.getInstance().getMiliConfig().getShoePlaceMode().equals(HMMiliConfig.RIGHT_SHOE) ? HMCalibrateConfig.Foot.RIGHT : HMCalibrateConfig.Foot.LEFT), new c());
    }

    private void q() {
        ((HMShoesDevice) this.D.getValue().getDevice(HMDeviceType.SHOES)).calibrate(new b());
    }

    private void r(int i) {
        this.x.setEnabled(i != 2);
        int i2 = R.string.shoes_calibrate_connecting;
        if (i == 0) {
            i2 = R.string.shoes_calibrate_bt_off;
        } else if (i == 1) {
            i2 = R.string.shoes_setting_calibrate_sub_tips;
        } else if (i != 2 && i == 3) {
            i2 = R.string.shoes_calibrate_connect_timeout;
        }
        this.z.setText(i2);
        this.B = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.A = true;
        LoadingDialog loadingDialog = this.y;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.y = null;
        }
        if (this.x.isEnabled() && this.B == 1) {
            this.x.setText(R.string.shoes_start);
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.shoes_calibrate_failed).setMessage(R.string.shoes_calibrate_failed_tips).setCancelable(true).setNeutralButton(R.string.gotit, new a()).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.A = false;
        LoadingDialog loadingDialog = this.y;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.y = null;
        }
        IconToast.showSuccess(this, R.string.shoes_calibrate_success);
        finish();
        if (this.C == HMDeviceSource.SHOES_MARS) {
            this.F.getValue().startHMNormandySettingActivity(this);
        } else {
            this.F.getValue().startHMShoesSettingActivity(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.shoes_calibrating));
        this.y = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    private void v() {
        if (this.C == HMDeviceSource.SHOES_MARS) {
            p();
        } else {
            q();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.right_btn) {
            if (id == R.id.left_btn) {
                finish();
                return;
            }
            return;
        }
        int i = this.B;
        if (i == 0) {
            this.E.getValue().enableBluetooth(this);
        } else if (i == 1) {
            v();
        } else {
            if (i != 3) {
                return;
            }
            r(2);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_shoes_calibrate);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        initViews();
        Intent intent = getIntent();
        if (intent.hasExtra("device_source")) {
            this.C = (HMDeviceSource) intent.getSerializableExtra("device_source");
        }
        HMLog.d(G, "device source:" + this.C, new Object[0]);
        Analytics.event(this, this.C == HMDeviceSource.SHOES_MARS ? StatEvent.CHIP2_CALIBRATION_VIEW_NUM : "StaticCalibratio", intent.getIntExtra("cali_from", 0) != 0 ? StatEvent.DeviceSetting.SHOE_CALIB_VIEW_NUM_BIND : "StaticCalibratio");
        EventBus.getDefault().registerSticky(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        int i;
        if (hMDeviceConnectionEvent.getDeviceType() == HMDeviceType.SHOES) {
            if (!this.D.getValue().isBluetoothEnable()) {
                i = 0;
            } else if (hMDeviceConnectionEvent.isConnected()) {
                i = 1;
            } else {
                i = hMDeviceConnectionEvent.isConnectingTimeout() ? 3 : 2;
            }
            r(i);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i;
        super.onResume();
        if (this.D.getValue().isBluetoothEnable()) {
            i = this.D.getValue().isConnected(HMDeviceType.SHOES) ? 1 : 2;
        } else {
            i = 0;
        }
        r(i);
    }

    public void onEventMainThread(EventBluetooth eventBluetooth) {
        r(eventBluetooth.isOn ? 2 : 0);
    }
}
