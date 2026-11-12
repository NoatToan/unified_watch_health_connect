package com.huawei.ui.homewear21.home.legal;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.activity.agreement.DeclarationAdapter;
import com.huawei.ui.homewear21.R;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.mgg;
import defpackage.qsp;
import defpackage.rbg;
import defpackage.tpd;
import health.compact.a.Services;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeOpenBaseServiceActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<rbg> f26351c;
    private int e = -1;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.open_service_statement_activity);
        d();
        e();
    }

    private void e() {
        ((CustomTitleBar) qsp.a(this, R.id.wear_home_open_service_statement_title)).setTitleText(BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_basic_service_statement));
        ListView listView = (ListView) qsp.a(this, R.id.wear_home_open_service_statement_list_view);
        if (this.f26351c == null) {
            LogUtil.a("WearHomeOpenBaseServiceActivity", "mConvertedLists is null");
        } else {
            listView.setAdapter((ListAdapter) new DeclarationAdapter(this, this.f26351c, this.e));
        }
    }

    private void d() {
        int smartWatchVersionTypeValue;
        Intent intent = getIntent();
        if (intent != null) {
            this.e = intent.getIntExtra("device_version_type", -1);
        }
        DeviceInfo deviceInfoC = mgg.c("WearHomeOpenBaseServiceActivity");
        if (deviceInfoC == null) {
            LogUtil.j("WearHomeOpenBaseServiceActivity", "currentDeviceInfo is null");
            return;
        }
        String emuiVersion = deviceInfoC.getEmuiVersion();
        if (TextUtils.isEmpty(emuiVersion)) {
            LogUtil.j("WearHomeOpenBaseServiceActivity", "emuiVersion is null");
            return;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "WearHomeOpenBaseServiceActivity");
        if (mapD == null) {
            LogUtil.j("WearHomeOpenBaseServiceActivity", "filter deviceCapabilityMap is null");
            return;
        }
        DeviceCapability deviceCapability = mapD.get(deviceInfoC.getDeviceIdentify());
        if (deviceCapability != null) {
            smartWatchVersionTypeValue = deviceCapability.getSmartWatchVersionTypeValue();
            LogUtil.a("WearHomeOpenBaseServiceActivity", "smartWatchVersion:", Integer.valueOf(smartWatchVersionTypeValue));
        } else {
            smartWatchVersionTypeValue = 0;
        }
        this.f26351c = tpd.e(emuiVersion, smartWatchVersionTypeValue, ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginIndexOobe(lvi.d(deviceInfoC.getProductType())));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
