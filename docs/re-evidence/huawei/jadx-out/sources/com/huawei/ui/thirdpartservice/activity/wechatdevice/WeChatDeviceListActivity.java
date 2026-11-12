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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class WeChatDeviceListActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f29143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceAdapter f29144c;
    private int e;
    private HealthProgressBar g;
    private HealthRecycleView h;
    private HealthButton j;
    private final Handler i = new b();
    private List<xcp> d = new ArrayList();
    private List<String> f = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DeviceInfo> f29142a = new ArrayList();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wechat_device_list);
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        wzz.b((ICloudOperationResult<List<String>>) new ICloudOperationResult() { // from class: wyq
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.e.a((List) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, String str, boolean z) {
        LogUtil.a("WeChatDeviceListActivity", "getSupportedProductIdsAsync ids = ", list);
        if (!z || list.isEmpty()) {
            LogUtil.j("WeChatDeviceListActivity", "Hide Wechat Device entrance because supported ids is empty.");
            this.i.sendMessage(this.i.obtainMessage(-1));
        } else {
            this.f = list;
            e();
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.thirdpartservice.activity.wechatdevice.WeChatDeviceListActivity$2, reason: invalid class name */
    public class AnonymousClass2 implements SupportDeviceResultCallback {
        AnonymousClass2() {
        }

        @Override // com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback
        public void obtainBindDeviceList(List<xcp> list) {
            WeChatDeviceListActivity.this.e = njy.e(list) ? 0 : list.size();
            WeChatDeviceListActivity.this.c(list, (ICloudOperationResult<List<DeviceInfo>>) new ICloudOperationResult() { // from class: wyt
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.e.b((List) obj, str, z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(List list, String str, boolean z) {
            WeChatDeviceListActivity.this.f29142a = list;
            LogUtil.d("WeChatDeviceListActivity", "getBindDevicesAsync authorized size = ", Integer.valueOf(WeChatDeviceListActivity.this.e), " , authorizeable size = ", Integer.valueOf(WeChatDeviceListActivity.this.f29142a.size()));
            Message messageObtainMessage = WeChatDeviceListActivity.this.i.obtainMessage();
            messageObtainMessage.what = z ? 0 : -1;
            WeChatDeviceListActivity.this.i.sendMessage(messageObtainMessage);
        }

        @Override // com.huawei.ui.thirdpartservice.interactors.callback.SupportDeviceResultCallback
        public void onError(int i, String str) {
            Message messageObtainMessage = WeChatDeviceListActivity.this.i.obtainMessage();
            messageObtainMessage.what = -1;
            WeChatDeviceListActivity.this.i.sendMessage(messageObtainMessage);
        }
    }

    private void e() {
        wzz.b(new AnonymousClass2());
    }

    private void d() {
        HealthProgressBar healthProgressBar = (HealthProgressBar) findViewById(R.id.loading);
        this.g = healthProgressBar;
        healthProgressBar.setVisibility(0);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.tv_empty);
        this.f29143b = healthTextView;
        healthTextView.setVisibility(8);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.device_recycleview);
        this.h = healthRecycleView;
        healthRecycleView.setVisibility(8);
        this.j = (HealthButton) findViewById(R.id.btn_next);
        DeviceAdapter deviceAdapter = new DeviceAdapter(this, this.h);
        this.f29144c = deviceAdapter;
        deviceAdapter.d(1);
        this.h.setAdapter(this.f29144c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final List<xcp> list, final ICloudOperationResult<List<DeviceInfo>> iCloudOperationResult) {
        wzz.c(new ICloudOperationResult() { // from class: wyo
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f52600c.a(list, iCloudOperationResult, (List) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, ICloudOperationResult iCloudOperationResult, List list2, String str, boolean z) {
        xcp xcpVarE;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            DeviceInfo deviceInfo = (DeviceInfo) it.next();
            if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId()) && (xcpVarE = xaf.e(deviceInfo, list)) != null) {
                LogUtil.a("WeChatDeviceListActivity", deviceInfo.getDeviceName(), " setHiLinkDeviceId:", xcpVarE.getWiseDeviceProdId());
                deviceInfo.setHiLinkDeviceId(xcpVarE.getWiseDeviceProdId());
            }
            if (!this.f.contains(deviceInfo.getHiLinkDeviceId()) || xaf.e(deviceInfo, list) != null) {
                it.remove();
                LogUtil.a("WeChatDeviceListActivity", "remove not supported or authorized device:", deviceInfo.getDeviceName());
            }
        }
        iCloudOperationResult.operationResult(list2, "", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        this.g.setVisibility(8);
        if (message.what == -1) {
            LogUtil.e("WeChatDeviceListActivity", "getBindDevicesAsync fail:", message.obj);
            return;
        }
        List<xcp> listD = wzz.d(this.f29142a);
        this.d = listD;
        boolean zE = njy.e(listD);
        this.h.setVisibility(zE ? 8 : 0);
        this.f29144c.e(this.d);
        this.f29144c.c(b());
        if (message.what == 0) {
            this.f29144c.notifyDataSetChanged();
        }
        this.f29143b.setVisibility(zE ? 0 : 8);
        this.j.setVisibility(zE ? 8 : 0);
        this.j.setEnabled(!zE);
        this.j.setTextColor(getColor(zE ? R.color.common_colorAccent_disabled : R.color.common_colorAccent));
        this.j.setOnClickListener(new View.OnClickListener() { // from class: wyr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52601a.b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.e >= 5) {
            this.j.setEnabled(false);
            this.j.setTextColor(getColor(R.color.common_colorAccent_disabled));
            qpx.e(this, getString(R.string.IDS_wx_device_max_limit, new Object[]{5}));
            return;
        }
        a();
    }

    private int b() {
        List<DeviceInfo> listE = wzz.e();
        if (njy.e(listE)) {
            LogUtil.d("WeChatDeviceListActivity", "getDefaultSelectIndex no connected device return DEFAULT_SELECTED");
            return 0;
        }
        int iE = e(listE.get(0));
        if (listE.size() == 1) {
            LogUtil.d("WeChatDeviceListActivity", "getDefaultSelectIndex only one index = ", Integer.valueOf(iE));
            return iE;
        }
        Iterator<DeviceInfo> it = listE.iterator();
        while (it.hasNext()) {
            iE = Math.min(iE, e(it.next()));
        }
        LogUtil.d("WeChatDeviceListActivity", "getDefaultSelectIndex return index = ", Integer.valueOf(iE));
        return iE;
    }

    private int e(DeviceInfo deviceInfo) {
        if (njy.e(this.d)) {
            return 0;
        }
        for (int i = 0; i < this.d.size(); i++) {
            xcp xcpVar = this.d.get(i);
            if (xcpVar.getIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                LogUtil.e("WeChatDeviceListActivity", "findIndex :", xcpVar.getIdentify(), ", return index = ", Integer.valueOf(i));
                return i;
            }
        }
        return 0;
    }

    private void a() {
        int iE;
        if (qrs.r() || this.f29144c == null || njy.e(this.d) || (iE = this.f29144c.e()) < 0 || iE >= this.d.size()) {
            return;
        }
        xcp xcpVar = this.d.get(iE);
        Intent intent = new Intent(this, (Class<?>) WeChatDeviceAuthorizeActivity.class);
        intent.putExtra("name", xcpVar.getDeviceName());
        intent.putExtra("identify", xcpVar.getIdentify());
        intent.putExtra("isAuthorized", false);
        startActivity(intent);
    }

    static class b extends BaseHandler<WeChatDeviceListActivity> {
        private b(WeChatDeviceListActivity weChatDeviceListActivity) {
            super(weChatDeviceListActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeChatDeviceListActivity weChatDeviceListActivity, Message message) {
            weChatDeviceListActivity.d(message);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
