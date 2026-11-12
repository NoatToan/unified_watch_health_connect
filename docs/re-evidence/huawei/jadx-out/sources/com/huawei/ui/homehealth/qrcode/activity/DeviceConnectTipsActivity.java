package com.huawei.ui.homehealth.qrcode.activity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.huawei.devicepair.model.StartPairOption;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideUtil;
import com.huawei.ui.homehealth.R;
import defpackage.cjk;
import defpackage.coi;
import defpackage.cqp;
import defpackage.ecu;
import defpackage.lvi;
import defpackage.njy;
import defpackage.rcv;
import defpackage.rcw;
import defpackage.rdp;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceConnectTipsActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f25690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ImageView f25691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25692c;
    private ImageView d;
    private AnimationDrawable e;
    private HealthTextView f;
    private String g;
    private String h;
    private String i;
    private int j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_connect_tips);
        d();
        c();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AnimationDrawable animationDrawable = this.e;
        if (animationDrawable != null) {
            animationDrawable.stop();
            this.e = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 608) {
            ReleaseLogUtil.d("R_DeviceConnectTipsActivity", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            cqp.a(100112, this.i, String.valueOf(i2), String.valueOf(100003));
            if (i2 == -1) {
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                d(intent);
                e();
                return;
            }
            a();
        }
    }

    private void d(Intent intent) {
        String str = this.h;
        if (str == null || !BluetoothAdapter.checkBluetoothAddress(str)) {
            return;
        }
        rdp.d("DeviceConnectTipsActivity", this.h, intent);
        SharedPreferenceManager.a("HEARTBEAT_INFO", "companion_device_manager_flag", true);
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.qrcode.activity.DeviceConnectTipsActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements IBaseResponseCallback {
        AnonymousClass1() {
        }

        public /* synthetic */ void a(View view) {
            DeviceConnectTipsActivity.this.e();
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == -1) {
                String str = DeviceConnectTipsActivity.this.h;
                DeviceConnectTipsActivity deviceConnectTipsActivity = DeviceConnectTipsActivity.this;
                rdp.d(str, deviceConnectTipsActivity, deviceConnectTipsActivity.f25692c, new View.OnClickListener() { // from class: ssh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f48586b.a(view);
                    }
                });
            } else {
                cqp.a(100112, DeviceConnectTipsActivity.this.i, String.valueOf(608), String.valueOf(100003));
                DeviceConnectTipsActivity.this.e();
            }
        }
    }

    private void a() {
        rdp.e(new AnonymousClass1(), this);
    }

    private void d() {
        this.d = (ImageView) findViewById(R.id.pair_result_img);
        ImageView imageView = (ImageView) findViewById(R.id.pair_progress_anim);
        this.f25691b = imageView;
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.f25691b.getDrawable();
            this.e = animationDrawable;
            animationDrawable.start();
        }
        this.f25690a = (HealthButton) findViewById(R.id.continue_button);
        this.f = (HealthTextView) findViewById(R.id.pair_device_name);
        this.f25690a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.qrcode.activity.DeviceConnectTipsActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DeviceConnectTipsActivity.this.b();
            }
        });
    }

    private void h() {
        DevicePairGuideUtil.b(this.j, this.d);
    }

    private void c() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("DeviceConnectTipsActivity", "intent is null");
            return;
        }
        this.i = intent.getStringExtra("deviceName");
        this.h = intent.getStringExtra(MatterDataContans.KEY_MAC_ADDRESS);
        this.j = intent.getIntExtra("deviceType", -1);
        if (!TextUtils.isEmpty(this.i)) {
            this.f.setText(String.format(Locale.ROOT, getString(R.string.IDS_device_connect_tip), this.i));
        }
        this.g = intent.getStringExtra("pinCode");
        this.f25692c = intent.getIntExtra("bluetoothType", -1);
        h();
    }

    public void b() {
        if (rdp.a(this, this.f25692c)) {
            new HwGetDevicesParameter().setDeviceIdentify(this.h);
            if (!njy.e(ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, null, "DeviceConnectTipsActivity"))) {
                SharedPreferenceManager.a(Integer.toString(1000), "wearable_unpair_reconnection", true);
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(this.h);
                rcv.a(BaseApplication.getContext()).b((List<String>) arrayList, true);
            } else {
                coi.b().e(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.h));
            }
            rdp.d(this.h, this, this.f25692c, new View.OnClickListener() { // from class: sse
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48583a.e(view);
                }
            });
            return;
        }
        e();
    }

    public /* synthetic */ void e(View view) {
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("DeviceConnectTipsActivity", "Enter pairBleDevice.");
        rcw.b(com.huawei.haf.application.BaseApplication.b()).g(this.h);
        String strI = lvi.a(this.j).i();
        if (cjk.d().isSupportH5Pair(this.i)) {
            String strJ = lvi.j(this.j);
            ArrayList arrayList = new ArrayList();
            arrayList.add(strJ);
            cjk.d().startPair(this, StartPairOption.builder().c(this.h).d(arrayList).d(this.i).a("wear_watch").e(false).a());
        } else {
            Intent intent = new Intent(this, (Class<?>) DevicePairGuideActivity.class);
            intent.putExtra("pairGuideProductType", this.j);
            intent.putExtra("pairGuideProductName", strI);
            intent.putExtra("pairGuideFromScanList", true);
            intent.putExtra("pairGuideSelectName", this.i);
            intent.putExtra("pairGuideSelectAddress", this.h);
            intent.putExtra("pairGuideDeviceMode", 100003);
            String str = this.g;
            if (str != null) {
                intent.putExtra("pairGuideProductPin", str);
            }
            startActivity(intent);
        }
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
