package com.huawei.ui.homewear21.home;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.adapter.WearHomeDeviceInfoAdapter;
import defpackage.ecu;
import defpackage.lug;
import defpackage.lvb;
import defpackage.qsp;
import defpackage.tlh;
import defpackage.tqp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeDeviceInfoActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26225b = "";
    private List<tlh> d = new ArrayList(16);
    private WearHomeDeviceInfoAdapter e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("WearHomeDeviceInfoActivity", "onCreate");
        setContentView(R.layout.wear_home_device_info_layout);
        this.f26224a = this;
        c();
        d();
        a();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    private void c() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("device_id");
        this.f26225b = stringExtra;
        if (stringExtra == null) {
            this.f26225b = "";
        }
    }

    private void a() {
        b();
    }

    private void d() {
        if (lug.c() != null) {
            e();
        } else {
            lvb.e().b().observe(this, new Observer<Boolean>() { // from class: com.huawei.ui.homewear21.home.WearHomeDeviceInfoActivity.4
                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void b(Boolean bool) {
                    if (bool.booleanValue()) {
                        LogUtil.a("WearHomeDeviceInfoActivity", "checkPhoneServiceBind initDeviceList");
                        lvb.e().b().removeObserver(this);
                        WearHomeDeviceInfoActivity.this.e();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearHomeDeviceInfoActivity");
        if (deviceList == null || deviceList.size() == 0) {
            LogUtil.a("WearHomeDeviceInfoActivity", "getDeviceList is null or empty");
            return;
        }
        LogUtil.a("WearHomeDeviceInfoActivity", "getDeviceList:", Integer.valueOf(deviceList.size()));
        for (DeviceInfo deviceInfo : deviceList) {
            if (this.f26225b.equals(deviceInfo.getDeviceIdentify())) {
                e(deviceInfo);
                break;
            }
        }
        WearHomeDeviceInfoAdapter wearHomeDeviceInfoAdapter = this.e;
        if (wearHomeDeviceInfoAdapter != null) {
            wearHomeDeviceInfoAdapter.notifyDataSetChanged();
        }
    }

    private void e(DeviceInfo deviceInfo) {
        LogUtil.a("WearHomeDeviceInfoActivity", "find target device:", deviceInfo.toString());
        this.d.add(new tlh(BaseApplication.getContext().getString(R.string.IDS_wear_home_device_info_name), deviceInfo.getDeviceName()));
        if (deviceInfo.getProductType() >= 34) {
            String string = BaseApplication.getContext().getString(R.string.IDS_wear_home_device_info_type);
            LogUtil.a("WearHomeDeviceInfoActivity", "CertModel = ", deviceInfo.getCertModel(), " DeviceModel = ", deviceInfo.getDeviceModel());
            String deviceModel = TextUtils.isEmpty(deviceInfo.getCertModel()) ? deviceInfo.getDeviceModel() : deviceInfo.getCertModel();
            if (deviceInfo.getProductType() == 75) {
                deviceModel = deviceInfo.getDeviceModel();
            }
            this.d.add(new tlh(string, deviceModel));
            String strC = tqp.c(deviceInfo);
            if (strC != null && !TextUtils.isEmpty(strC.trim())) {
                this.d.add(new tlh(BaseApplication.getContext().getString(R.string.IDS_wear_home_device_info_sn), strC));
            }
        }
        if (deviceInfo.getProductType() != 10) {
            this.d.add(new tlh(BaseApplication.getContext().getString(R.string.IDS_wear_home_device_info_mac), deviceInfo.getDeviceIdentify()));
        }
    }

    private void b() {
        LogUtil.a("WearHomeDeviceInfoActivity", "setRecyclerView. ");
        ((CustomTitleBar) qsp.a(this, R.id.wear_home_device_info_bar)).setTitleText(BaseApplication.getContext().getString(R.string.IDS_wear_home_device_info));
        HealthRecycleView healthRecycleView = (HealthRecycleView) qsp.a(this, R.id.wear_home_device_info_recyclerView);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        WearHomeDeviceInfoAdapter wearHomeDeviceInfoAdapter = new WearHomeDeviceInfoAdapter(this.f26224a, this.d);
        this.e = wearHomeDeviceInfoAdapter;
        healthRecycleView.setAdapter(wearHomeDeviceInfoAdapter);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
