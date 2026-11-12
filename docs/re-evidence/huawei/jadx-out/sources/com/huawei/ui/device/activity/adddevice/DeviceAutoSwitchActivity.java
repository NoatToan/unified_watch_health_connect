package com.huawei.ui.device.activity.adddevice;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import defpackage.ecu;
import defpackage.eey;
import defpackage.mhs;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rek;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceAutoSwitchActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSwitchButton f24131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f24132b = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.adddevice.DeviceAutoSwitchActivity.4
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            LogUtil.a("DeviceAutoSwitchActivity", "device auto switch button is ", Boolean.valueOf(z));
            DeviceAutoSwitchActivity.this.f24131a.setChecked(z);
            DeviceAutoSwitchActivity.this.a(z);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f24133c;
    private AnimationDrawable d;
    private ImageView e;
    private HealthTextView j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("DeviceAutoSwitchActivity", "onCreate");
        this.f24133c = this;
        setContentView(R.layout.activity_device_auto_switch);
        c();
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        j();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AnimationDrawable animationDrawable = this.d;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    private void c() {
        LogUtil.a("DeviceAutoSwitchActivity", "initView. ");
        ((CustomTitleBar) qsp.a(this, R.id.device_auto_switch_bar)).setTitleText(BaseApplication.getContext().getString(R.string.IDS_device_auto_switch));
        ((HealthTextView) qsp.a(this, R.id.device_auto_switch_tip)).setText(BaseApplication.getContext().getString(R.string.IDS_device_auto_switch_tip_title));
        ((HealthTextView) qsp.a(this, R.id.device_auto_switch_button_name)).setText(BaseApplication.getContext().getString(R.string.IDS_device_auto_switch));
        this.f24131a = (HealthSwitchButton) findViewById(R.id.device_auto_switch_button);
        this.j = (HealthTextView) qsp.a(this, R.id.device_auto_switch_support_list);
        this.e = (ImageView) qsp.a(this, R.id.device_auto_switch_img);
        d();
    }

    private void b() {
        LogUtil.a("DeviceAutoSwitchActivity", "initData. ");
        String string = BaseApplication.getContext().getString(R.string.IDS_device_auto_switch_tip_support_list);
        this.j.setText(string + "\n" + a());
    }

    private void d() {
        if (rek.b("autoSwitch")) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.DeviceAutoSwitchActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    DeviceAutoSwitchActivity.this.e();
                }
            });
            return;
        }
        LogUtil.a("DeviceAutoSwitchActivity", "initAutoSwitchView isExistResource is false.");
        c(this.e, false);
        this.e.setScaleType(ImageView.ScaleType.MATRIX);
        this.e.setBackgroundResource(R.drawable.home_set_rate_watch_remider_image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ArrayList<Bitmap> arrayListE = rek.e("autoSwitch");
        if (arrayListE == null || arrayListE.size() == 0) {
            LogUtil.a("DeviceAutoSwitchActivity", "initAutoSwitchAnimation bitmapList is empty.");
            runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.DeviceAutoSwitchActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    DeviceAutoSwitchActivity deviceAutoSwitchActivity = DeviceAutoSwitchActivity.this;
                    deviceAutoSwitchActivity.c(deviceAutoSwitchActivity.e, false);
                    DeviceAutoSwitchActivity.this.e.setScaleType(ImageView.ScaleType.MATRIX);
                    DeviceAutoSwitchActivity.this.e.setBackgroundResource(R.drawable.home_set_rate_watch_remider_image);
                }
            });
            return;
        }
        this.d = new AnimationDrawable();
        for (int i = 0; i < arrayListE.size(); i++) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(arrayListE.get(i));
            if (i == arrayListE.size() - 1) {
                this.d.addFrame(bitmapDrawable, 1000);
            } else {
                this.d.addFrame(bitmapDrawable, 100);
            }
        }
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.DeviceAutoSwitchActivity.2
            @Override // java.lang.Runnable
            public void run() {
                DeviceAutoSwitchActivity deviceAutoSwitchActivity = DeviceAutoSwitchActivity.this;
                deviceAutoSwitchActivity.c(deviceAutoSwitchActivity.e, true);
                DeviceAutoSwitchActivity.this.e.setImageDrawable(DeviceAutoSwitchActivity.this.d);
                DeviceAutoSwitchActivity.this.d.setOneShot(false);
                DeviceAutoSwitchActivity.this.d.start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view, boolean z) {
        LinearLayout.LayoutParams layoutParams;
        if (z) {
            layoutParams = new LinearLayout.LayoutParams(qrs.d(this.f24133c, 360.0f), qrs.d(this.f24133c, 288.0f));
        } else {
            layoutParams = new LinearLayout.LayoutParams(qrs.d(this.f24133c, 220.0f), qrs.d(this.f24133c, 220.0f));
        }
        view.setLayoutParams(layoutParams);
    }

    private String a() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceAutoSwitchActivity");
        if (deviceList == null) {
            LogUtil.a("DeviceAutoSwitchActivity", "getDeviceList is null.");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (DeviceInfo deviceInfo : deviceList) {
            if (a(deviceInfo)) {
                sb.append(deviceInfo.getDeviceName());
                sb.append('\n');
            }
        }
        LogUtil.a("DeviceAutoSwitchActivity", "getDeviceList: ", Integer.valueOf(deviceList.size()), ",supportDeviceName: ", sb);
        return sb.toString();
    }

    private boolean a(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        LogUtil.a("DeviceAutoSwitchActivity", "isSupportDeviceAutoSwitch is:", Boolean.valueOf(zD));
        return zD;
    }

    private void j() {
        mhs.a().getSwitchSetting("device_auto_switch", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.adddevice.DeviceAutoSwitchActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DeviceAutoSwitchActivity", "AutoSwitch errorCode = ", Integer.valueOf(i));
                final boolean zEquals = (i == 0 && (obj instanceof String)) ? "1".equals((String) obj) : true;
                LogUtil.a("DeviceAutoSwitchActivity", "getAutoSwitchStatus():", Boolean.valueOf(zEquals));
                DeviceAutoSwitchActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.adddevice.DeviceAutoSwitchActivity.5.3
                    @Override // java.lang.Runnable
                    public void run() {
                        DeviceAutoSwitchActivity.this.f24131a.setChecked(zEquals);
                        DeviceAutoSwitchActivity.this.f24131a.setOnCheckedChangeListener(DeviceAutoSwitchActivity.this.f24132b);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        String str = z ? "1" : "0";
        LogUtil.a("DeviceAutoSwitchActivity", "setAutoSwitchStatus():", str);
        mhs.a().setSwitchSetting("device_auto_switch", str, null);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
