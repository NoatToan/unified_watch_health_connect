package com.huawei.ui.homewear21.home;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.iov;
import defpackage.lmq;
import defpackage.lut;
import defpackage.lvl;
import defpackage.mig;
import defpackage.qst;
import defpackage.tfn;
import defpackage.tfu;
import defpackage.tqp;

/* JADX INFO: loaded from: classes3.dex */
public class WearHomeActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f26208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26209b;
    private DeviceInfo d;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
        if (!qst.c() || a()) {
            b();
        } else {
            boolean booleanExtra = getIntent().getBooleanExtra("is_jump_to_device_detail", false);
            DeviceInfo deviceInfo = this.d;
            if ((deviceInfo != null && !mig.d(this.f26208a, deviceInfo)) || booleanExtra) {
                tqp.e((Activity) this, this.f26209b);
            } else {
                tqp.h(this);
            }
            tfu.a(this.f26209b);
        }
        finish();
    }

    private boolean a() {
        if (this.d == null) {
            return false;
        }
        return !lut.a().b(this.d);
    }

    private void b() {
        Intent intent = getIntent();
        intent.setClassName(this, "com.huawei.ui.homewear21.home.WearHomeOldActivity");
        iov.d(this, intent);
    }

    private void d() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("device_id");
        if (stringExtra == null) {
            String stringExtra2 = intent.getStringExtra("DEVICE_ID");
            if (!TextUtils.isEmpty(stringExtra2)) {
                stringExtra = lmq.b(stringExtra2);
            } else {
                stringExtra = "";
            }
        }
        String str = stringExtra;
        DeviceInfo deviceInfoD = lut.a().d();
        this.f26208a = deviceInfoD;
        if (deviceInfoD == null) {
            this.f26208a = tfn.a().j();
        }
        DeviceInfo deviceInfoE = e(str);
        this.d = deviceInfoE;
        if (deviceInfoE == null) {
            this.f26209b = str;
            LogUtil.j("WearHomeActivity", "initData mCurrentDeviceInfo == null deviceMac:", str);
        } else {
            this.f26209b = deviceInfoE.getDeviceIdentify();
            LogUtil.a("WearHomeActivity", "initData mDeviceName:", this.d.getDeviceName(), " mDeviceMac:", this.f26209b, " deviceMac:", str);
        }
    }

    private DeviceInfo e(String str) {
        DeviceInfo deviceInfoB = lut.a().b(str);
        return deviceInfoB != null ? deviceInfoB : lvl.a(str);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
