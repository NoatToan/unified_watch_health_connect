package com.huawei.ui.thirdpartservice.activity.wechatdevice;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.wechatdevice.DeviceAdapter;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.wzz;
import defpackage.xaf;
import defpackage.xcp;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WeChatDeviceActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceAdapter f29135a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f29137c;
    private HealthButton e;
    private HealthTextView g;
    private HealthProgressBar i;
    private DeviceInfo j;
    private HealthRecycleView l;
    private final Handler f = new e();
    private List<String> k = new ArrayList();
    private List<xcp> d = new ArrayList();
    private List<DeviceInfo> h = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<DeviceInfo> f29136b = new ArrayList();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wechat_device);
        i();
    }

    private void i() {
        this.g = (HealthTextView) findViewById(R.id.device_bound_tips);
        this.f29137c = (HealthTextView) findViewById(R.id.device_authorized_title);
        this.l = (HealthRecycleView) findViewById(R.id.device_recycleview);
        this.i = (HealthProgressBar) findViewById(R.id.loading);
        this.e = (HealthButton) findViewById(R.id.btn_device_bound);
        a(false);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: wyd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.d.size() >= 5) {
            a(false);
            qpx.e(this, getString(R.string.IDS_wx_device_max_limit, new Object[]{5}));
        } else {
            c();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.i.setVisibility(0);
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        qrs.e();
    }

    private void d() {
        ReleaseLogUtil.d("R_WeChatDeviceActivity", "checkDevicesStatus");
        wzz.c(new ICloudOperationResult() { // from class: wxz
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f52587b.e((List) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(List list, String str, final boolean z) {
        ReleaseLogUtil.d("R_WeChatDeviceActivity", "checkDevicesStatus getAllLocalDevices:", Boolean.valueOf(z));
        this.h = list;
        if (list.isEmpty()) {
            Message messageObtainMessage = this.f.obtainMessage();
            messageObtainMessage.what = 0;
            this.f.sendMessage(messageObtainMessage);
        }
        wzz.b((ICloudOperationResult<List<String>>) new ICloudOperationResult() { // from class: wyg
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z2) {
                this.f52594c.a(z, (List) obj, str2, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, List list, String str, boolean z2) {
        ReleaseLogUtil.d("R_WeChatDeviceActivity", "checkDevicesStatus getSupportedProductIdsAsync status:", Boolean.valueOf(z2));
        if (!z2) {
            Message messageObtainMessage = this.f.obtainMessage();
            messageObtainMessage.what = -1;
            this.f.sendMessage(messageObtainMessage);
            return;
        }
        this.k = list;
        if (njy.e(list)) {
            b();
            LogUtil.e("WeChatDeviceActivity", "SupportedProductIds is empty");
        } else {
            if (!z) {
                Message messageObtainMessage2 = this.f.obtainMessage();
                messageObtainMessage2.what = -1;
                this.f.sendMessage(messageObtainMessage2);
                return;
            }
            a();
        }
    }

    private void a() {
        wzz.b(new SupportDeviceResultCallback() { // from class: com.huawei.ui.thirdpartservice.activity.wechatdevice.WeChatDeviceActivity.3
            @Override // com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback
            public void obtainSupportDeviceList(List<xcp> list) {
                ReleaseLogUtil.d("R_WeChatDeviceActivity", "handleSupportedDevices getBindDevicesAsync size:", Integer.valueOf(WeChatDeviceActivity.this.h.size()));
                for (DeviceInfo deviceInfo : WeChatDeviceActivity.this.h) {
                    if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId())) {
                        LogUtil.a("WeChatDeviceActivity", "HiLinkDevice :", deviceInfo.getDeviceName());
                        xcp xcpVarE = xaf.e(deviceInfo, WeChatDeviceActivity.this.d);
                        if (xcpVarE != null && !TextUtils.isEmpty(xcpVarE.getWiseDeviceProdId())) {
                            LogUtil.a("WeChatDeviceActivity", deviceInfo.getDeviceName(), " setHiLinkDeviceId:", xcpVarE.getWiseDeviceProdId());
                            deviceInfo.setHiLinkDeviceId(xcpVarE.getWiseDeviceProdId());
                        }
                    }
                }
                for (DeviceInfo deviceInfo2 : wzz.e()) {
                    if ("main_relationship".equals(deviceInfo2.getRelationship()) || "assistant_relationship".equals(deviceInfo2.getRelationship())) {
                        if (xaf.e(deviceInfo2, list) == null) {
                            qpx.e(WeChatDeviceActivity.this, R.string.IDS_wx_device_not_supported);
                            return;
                        }
                    }
                }
            }

            @Override // com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback
            public void obtainBindDeviceList(List<xcp> list) {
                WeChatDeviceActivity weChatDeviceActivity = WeChatDeviceActivity.this;
                weChatDeviceActivity.d = weChatDeviceActivity.e(list);
                WeChatDeviceActivity weChatDeviceActivity2 = WeChatDeviceActivity.this;
                weChatDeviceActivity2.f29136b = weChatDeviceActivity2.e();
                WeChatDeviceActivity weChatDeviceActivity3 = WeChatDeviceActivity.this;
                weChatDeviceActivity3.j = weChatDeviceActivity3.f29136b.size() == 1 ? (DeviceInfo) WeChatDeviceActivity.this.f29136b.get(0) : null;
                Message messageObtainMessage = WeChatDeviceActivity.this.f.obtainMessage();
                messageObtainMessage.what = 1;
                WeChatDeviceActivity.this.f.sendMessage(messageObtainMessage);
            }

            @Override // com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback
            public void onError(int i, String str) {
                Message messageObtainMessage = WeChatDeviceActivity.this.f.obtainMessage();
                messageObtainMessage.what = -1;
                messageObtainMessage.obj = str;
                WeChatDeviceActivity.this.f.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<xcp> e(List<xcp> list) {
        for (xcp xcpVar : list) {
            boolean zC = xaf.c(xcpVar);
            xcpVar.setLocalBound(zC);
            LogUtil.a("WeChatDeviceActivity", "Update authorized device = ", xcpVar.getDeviceName(), " , is local bound = ", Boolean.valueOf(zC));
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DeviceInfo> e() {
        ArrayList arrayList = new ArrayList(this.h);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfo = (DeviceInfo) it.next();
            if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId())) {
                LogUtil.a("WeChatDeviceActivity", "deviceInfo empty device :", deviceInfo.getDeviceName());
                xcp xcpVarE = xaf.e(deviceInfo, this.d);
                if (xcpVarE != null && !TextUtils.isEmpty(xcpVarE.getWiseDeviceProdId())) {
                    LogUtil.a("WeChatDeviceActivity", deviceInfo.getDeviceName(), " setHiLinkDeviceId:", xcpVarE.getWiseDeviceProdId());
                    deviceInfo.setHiLinkDeviceId(xcpVarE.getWiseDeviceProdId());
                }
            }
            if (!this.k.contains(deviceInfo.getHiLinkDeviceId()) || xaf.e(deviceInfo, this.d) != null) {
                it.remove();
                LogUtil.a("WeChatDeviceActivity", "Authorizeable devices remove not supported or authorized device :", deviceInfo.getDeviceName(), " deviceInfo.getHiLinkDeviceId():", deviceInfo.getHiLinkDeviceId());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        int i = message.what;
        if (i == -1) {
            b();
            if ("server error".equals(String.valueOf(message.obj))) {
                qpx.e(this, R.string.IDS_hwh_home_group_server_exception);
                return;
            } else {
                qpx.e(this, R.string.IDS_plugin_achievement_network_error_msg_content_2);
                return;
            }
        }
        if (i == 0) {
            b();
            qpx.e(this, R.string.IDS_wx_device_no_bound);
        } else {
            if (i != 1) {
                return;
            }
            g();
        }
    }

    private void b() {
        this.g.setText(R.string.IDS_wx_device_bound_tips_empty);
        this.f29137c.setVisibility(8);
        a(false);
        this.i.setVisibility(8);
    }

    private void g() {
        a(this.d);
        this.i.setVisibility(8);
        boolean zE = njy.e(this.d);
        this.g.setText(zE ? R.string.IDS_wx_device_bound_tips_empty : R.string.IDS_wx_device_bound_tips);
        if (zE && njy.e(this.f29136b) && njy.b(this.h)) {
            qpx.e(this, R.string.IDS_wx_device_none_supported);
        }
        a(njy.b(this.f29136b));
    }

    private void a(boolean z) {
        this.e.setEnabled(z);
        this.e.setTextColor(getColor(z ? R.color.common_colorAccent : R.color.common_colorAccent_disabled));
    }

    private void a(List<xcp> list) {
        this.f29137c.setVisibility(njy.e(list) ? 8 : 0);
        this.l.setVisibility(njy.e(list) ? 8 : 0);
        if (njy.e(list)) {
            return;
        }
        DeviceAdapter deviceAdapter = new DeviceAdapter(this, this.l);
        this.f29135a = deviceAdapter;
        deviceAdapter.d(0);
        this.f29135a.e(new DeviceAdapter.CallBack() { // from class: wyb
            @Override // com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.wechatdevice.DeviceAdapter.CallBack
            public final void onItemClicked(int i) {
                this.f52591c.e(i);
            }
        });
        this.f29135a.e(list);
        this.l.setAdapter(this.f29135a);
    }

    private void c() {
        if (qrs.r()) {
            return;
        }
        Intent intent = new Intent();
        if (this.j != null) {
            intent.setClass(this, WeChatDeviceAuthorizeActivity.class);
            intent.putExtra("name", this.j.getDeviceName());
            intent.putExtra("identify", this.j.getDeviceIdentify());
            intent.putExtra("isAuthorized", false);
        } else {
            intent.setClass(this, WeChatDeviceListActivity.class);
        }
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (qrs.r() || this.f29135a == null || njy.e(this.d) || i < 0 || i >= this.d.size()) {
            return;
        }
        xcp xcpVar = this.d.get(i);
        Intent intent = new Intent(this, (Class<?>) WeChatDeviceAuthorizeActivity.class);
        intent.putExtra("name", xcpVar.getDeviceName());
        intent.putExtra("deviceCode", xcpVar.getDeviceCode());
        intent.putExtra("identify", xcpVar.getIdentify());
        intent.putExtra("wxLinkSdkId", xcpVar.getWxLinkSdkId());
        intent.putExtra("isLocalBound", xcpVar.isLocalBound());
        intent.putExtra("deviceIconUrl", xcpVar.getDeviceIconUrl());
        intent.putExtra("isAuthorized", true);
        startActivity(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qpx.d();
    }

    /* JADX INFO: loaded from: classes20.dex */
    static class e extends BaseHandler<WeChatDeviceActivity> {
        private e(WeChatDeviceActivity weChatDeviceActivity) {
            super(weChatDeviceActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeChatDeviceActivity weChatDeviceActivity, Message message) {
            weChatDeviceActivity.b(message);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
