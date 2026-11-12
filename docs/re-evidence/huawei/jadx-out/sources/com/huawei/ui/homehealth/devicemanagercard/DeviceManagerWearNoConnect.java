package com.huawei.ui.homehealth.devicemanagercard;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.iov;
import defpackage.lut;
import defpackage.lvl;
import defpackage.mig;
import defpackage.qst;
import defpackage.tfn;
import defpackage.tqp;

/* JADX INFO: loaded from: classes43.dex */
public class DeviceManagerWearNoConnect extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25399c;
    private DeviceInfo d;
    private DeviceInfo e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e();
        if (!qst.c() || a()) {
            c();
        } else {
            DeviceInfo deviceInfo = this.d;
            if (deviceInfo == null || mig.d(this.e, deviceInfo)) {
                tqp.h(this);
            } else {
                tqp.e((Activity) this, this.f25399c);
            }
        }
        finish();
    }

    private boolean a() {
        if (this.d == null) {
            return false;
        }
        return !lut.a().b(this.d);
    }

    private void c() {
        Intent intent = getIntent();
        intent.setClassName(this, "com.huawei.ui.homehealth.devicemanagercard.OldDeviceManagerWearNoConnect");
        iov.d(this, intent);
    }

    private void e() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("device_name");
        String stringExtra2 = intent.getStringExtra("device_identify");
        DeviceInfo deviceInfoD = lut.a().d();
        this.e = deviceInfoD;
        if (deviceInfoD == null) {
            this.e = tfn.a().j();
        }
        DeviceInfo deviceInfoC = c(stringExtra2);
        this.d = deviceInfoC;
        if (deviceInfoC == null) {
            this.f25399c = stringExtra2;
            LogUtil.j("DeviceManagerWearNoConnect", "initData mCurrentDeviceInfo == null deviceName:", stringExtra, " deviceMac:", stringExtra2);
        } else {
            this.f25399c = deviceInfoC.getDeviceIdentify();
            LogUtil.a("DeviceManagerWearNoConnect", "initData mDeviceName:", this.d.getDeviceName(), " mDeviceMac:", this.f25399c, " deviceMac:", stringExtra2);
        }
    }

    private DeviceInfo c(String str) {
        DeviceInfo deviceInfoB = lut.a().b(str);
        return deviceInfoB != null ? deviceInfoB : lvl.a(str);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
