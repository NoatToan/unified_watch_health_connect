package com.huawei.ui.main.stories.privacy.datasourcemanager;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.datasourcemanager.adapter.DataSourceAdapter;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataDownloadListener;
import com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataSourceItemClickListener;
import com.huawei.ui.main.stories.privacy.datasourcemanager.receiver.DataDownloadReceiver;
import defpackage.lcy;
import defpackage.njy;
import defpackage.osa;
import defpackage.qpx;
import defpackage.qqz;
import defpackage.wgk;
import defpackage.wgx;
import defpackage.whe;
import defpackage.whf;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ManagerDataSourceActivity extends BaseActivity implements DataSourceItemClickListener, DataDownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataDownloadReceiver f28634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f28635c;
    private DataSourceAdapter d;
    private boolean e = false;
    private RelativeLayout f;
    private RelativeLayout g;
    private HealthRecycleView h;
    private ImageView i;
    private List<SourceInfo> j;
    private wgk n;

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataSourceItemClickListener
    public void onItemClickListener(int i) {
        if (njy.e(this.j)) {
            LogUtil.e("ManagerDataSourceActivity", "mDeviceList is null or mDeviceList.size() is 0");
            return;
        }
        SourceInfo sourceInfo = this.j.get(i);
        String deviceName = sourceInfo.getDeviceName();
        String clientId = sourceInfo.getClientId();
        if (this.f28633a == 2) {
            LogUtil.a("ManagerDataSourceActivity", "from health_kit");
            Intent intent = new Intent();
            intent.setClass(this, DeviceDetailRecordActivity.class);
            intent.putExtra("device_name", deviceName);
            intent.putExtra("client_id", clientId);
            startActivity(intent);
            return;
        }
        int sourceType = sourceInfo.getSourceType();
        String deviceUniqueCode = sourceInfo.getDeviceUniqueCode();
        Intent intent2 = new Intent();
        intent2.putExtra(DeviceCategoryFragment.DEVICE_TYPE, sourceInfo.getDeviceType());
        intent2.putExtra("device_name", deviceName);
        intent2.putExtra("deviceUniqueCode", deviceUniqueCode);
        intent2.putExtra("SOURCE_TYPE", sourceType);
        intent2.putExtra("is_data_loaded", this.e);
        intent2.setClass(this, DeviceDetailRecordActivity.class);
        if (sourceType == 2) {
            LogUtil.a("ManagerDataSourceActivity", "device type");
            intent2.putExtra("read_type", 2);
            intent2.putExtra("other_manufacaturer", sourceInfo.isOtherManufacturer());
            startActivity(intent2);
            return;
        }
        if (sourceType == 3) {
            LogUtil.a("ManagerDataSourceActivity", "manual type");
            intent2.putExtra("package_name", sourceInfo.getPackageName());
            intent2.putExtra("read_type", 3);
            startActivity(intent2);
            return;
        }
        if (sourceType == 1) {
            LogUtil.a("ManagerDataSourceActivity", "APP type");
            intent2.putExtra("read_type", 1);
            intent2.putExtra("package_name", sourceInfo.getPackageName());
            startActivity(intent2);
            return;
        }
        LogUtil.a("ManagerDataSourceActivity", "error type");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
        if (!NetworkUtil.h()) {
            qpx.e(this, R.string.IDS_connect_network);
            this.g.setVisibility(8);
            this.f.setVisibility(0);
            i();
        }
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("ManagerDataSourceActivity", "intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("jump_key", 0);
        this.f28633a = intExtra;
        if (intExtra == 1) {
            LogUtil.a("ManagerDataSourceActivity", "from data source management");
            ReleaseLogUtil.d("R_ManagerDataSourceActivity", "from data source management release");
            this.f28635c.setTitleText(getResources().getString(R.string.IDS_hwh_data_source_manager));
            a();
            g();
            return;
        }
        if (intExtra == 2) {
            LogUtil.a("ManagerDataSourceActivity", "from health_kit");
            this.f28635c.setTitleText(getResources().getString(R.string.IDS_hwh_Health_Kit_data_show));
            c();
            return;
        }
        LogUtil.a("ManagerDataSourceActivity", "jump_key is error");
    }

    private void d() {
        LogUtil.a("ManagerDataSourceActivity", "registerBroadCast");
        this.f28634b = new DataDownloadReceiver(this);
        LocalBroadcastManager.getInstance().registerReceiver(this.f28634b, new IntentFilter("com.huawei.hihealth.action_sync"));
    }

    private void b() {
        setContentView(R.layout.activity_manager_data_source);
        this.g = (RelativeLayout) findViewById(R.id.data_source_loading);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.recyclerView);
        this.h = healthRecycleView;
        healthRecycleView.b(false);
        this.h.e(false);
        this.f = (RelativeLayout) findViewById(R.id.no_data_source);
        this.i = (ImageView) findViewById(R.id.no_data_image);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.manager_data_source_title_layout);
        this.f28635c = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.health_chart_extend_background_color));
        this.j = new ArrayList(10);
        this.h.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DataSourceAdapter dataSourceAdapter = new DataSourceAdapter(this, this);
        this.d = dataSourceAdapter;
        this.h.setAdapter(dataSourceAdapter);
    }

    private void g() {
        if (!TextUtils.isEmpty(osa.c(this, "data_downing_flag", ""))) {
            this.e = true;
            LogUtil.a("ManagerDataSourceActivity", "data has download");
            return;
        }
        if (!NetworkUtil.h()) {
            this.e = true;
            LogUtil.a("ManagerDataSourceActivity", "no network connected");
            return;
        }
        if (this.f28634b == null) {
            d();
        }
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(5);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncManual(1);
        hiSyncOption.setSyncDataArea(1);
        HiHealthNativeApi.a(this).synCloud(hiSyncOption, null);
        osa.b(this, "data_downing_flag", "dataStartDownLoad");
        LogUtil.a("ManagerDataSourceActivity", "startSyncData");
    }

    private void c() {
        LogUtil.a("ManagerDataSourceActivity", "getDataFromHealthKit isOversea=" + Utils.o() + ",ifAllowLogin=" + Utils.h());
        if (Utils.o() && !Utils.h()) {
            this.g.setVisibility(8);
            this.f.setVisibility(0);
            LogUtil.j("ManagerDataSourceActivity", "getDataFromHealthKit return for Oversea && Not AllowLogin");
            return;
        }
        e();
    }

    private void e() {
        lcy.d().b(this, new whe(false, "", LanguageUtil.b(this)).getRequestParamsBuilder().c(new OnRequestCallBack<wgx>() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.ManagerDataSourceActivity.2
            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(wgx wgxVar) {
                ManagerDataSourceActivity.this.g.setVisibility(8);
                if (wgxVar == null || njy.e(wgxVar.getWriteRecords())) {
                    ManagerDataSourceActivity.this.f.setVisibility(0);
                    ManagerDataSourceActivity.this.i();
                    return;
                }
                ManagerDataSourceActivity.this.f.setVisibility(8);
                HashMap map = new HashMap(16);
                for (whf whfVar : wgxVar.getWriteRecords()) {
                    SourceInfo sourceInfo = new SourceInfo();
                    sourceInfo.setSourceType(1);
                    sourceInfo.setDeviceName(whfVar.getAppName());
                    sourceInfo.setClientId(whfVar.getAppId());
                    sourceInfo.setDeviceIcon(whfVar.getAppIconPath());
                    sourceInfo.setItemType(3);
                    map.put(whfVar.getAppId(), sourceInfo);
                }
                SourceInfo sourceInfo2 = new SourceInfo();
                sourceInfo2.setHealthKit(true);
                sourceInfo2.setItemType(2);
                ManagerDataSourceActivity.this.j.add(sourceInfo2);
                ManagerDataSourceActivity.this.j.addAll(map.values());
                SourceInfo sourceInfo3 = new SourceInfo();
                sourceInfo3.setItemType(1);
                ManagerDataSourceActivity.this.j.add(sourceInfo3);
                ManagerDataSourceActivity.this.d.d(map.size());
                ManagerDataSourceActivity.this.d.b(ManagerDataSourceActivity.this.j);
            }

            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                ManagerDataSourceActivity.this.g.setVisibility(8);
                ManagerDataSourceActivity.this.f.setVisibility(0);
                ManagerDataSourceActivity.this.i();
                LogUtil.e("ManagerDataSourceActivity", Integer.valueOf(i), " accessRecordModel ", th == null ? Constants.NULL : th.getMessage());
            }
        }).e());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        lcy.d().d(this);
        h();
    }

    private void h() {
        if (this.f28634b != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.f28634b);
            this.f28634b = null;
        }
    }

    private void a() {
        LogUtil.a("ManagerDataSourceActivity", "getDeviceList");
        ReleaseLogUtil.d("R_ManagerDataSourceActivity", "start getdeviceList");
        wgk wgkVar = new wgk();
        this.n = wgkVar;
        wgkVar.e(new c(this));
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataDownloadListener
    public void dataDownloadListener(int i) {
        LogUtil.a("ManagerDataSourceActivity", "dataDownloadStatus is", Integer.valueOf(i));
        if (i == 2) {
            this.e = true;
            h();
        } else if (i == 3) {
            osa.b(this, "data_downing_flag", "");
        }
    }

    static class c implements DataSourceCallback<List<SourceInfo>> {
        WeakReference<ManagerDataSourceActivity> d;

        c(ManagerDataSourceActivity managerDataSourceActivity) {
            this.d = new WeakReference<>(managerDataSourceActivity);
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<SourceInfo> list) {
            LogUtil.a("ManagerDataSourceActivity", "DeviceListCallBack errorCode is ", Integer.valueOf(i));
            ReleaseLogUtil.d("R_ManagerDataSourceActivity", "release DeviceListCallBack errorCode is ", Integer.valueOf(i));
            WeakReference<ManagerDataSourceActivity> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.e("ManagerDataSourceActivity", "mWeakReference is null");
                return;
            }
            ManagerDataSourceActivity managerDataSourceActivity = weakReference.get();
            if (managerDataSourceActivity != null) {
                managerDataSourceActivity.g.setVisibility(8);
                if (!njy.e(list)) {
                    managerDataSourceActivity.f.setVisibility(8);
                    ReleaseLogUtil.d("R_ManagerDataSourceActivity", "release list size is", Integer.valueOf(list.size()));
                    LogUtil.a("ManagerDataSourceActivity", "list size is", Integer.valueOf(list.size()));
                    managerDataSourceActivity.j.addAll(list);
                    managerDataSourceActivity.d.e(managerDataSourceActivity.n.a());
                    managerDataSourceActivity.d.d(managerDataSourceActivity.n.d());
                    managerDataSourceActivity.d.b(managerDataSourceActivity.j);
                    return;
                }
                ReleaseLogUtil.d("R_ManagerDataSourceActivity", "release list is empty");
                managerDataSourceActivity.f.setVisibility(0);
                managerDataSourceActivity.i();
                LogUtil.e("ManagerDataSourceActivity", "list is empty");
                return;
            }
            LogUtil.e("ManagerDataSourceActivity", "DataTypeCallBack managerDataSourceActivity is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (LanguageUtil.ba(this)) {
            this.i.setBackground(qqz.e(this, R.mipmap.icon_no_data));
        } else {
            this.i.setBackgroundResource(R.mipmap.icon_no_data);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
