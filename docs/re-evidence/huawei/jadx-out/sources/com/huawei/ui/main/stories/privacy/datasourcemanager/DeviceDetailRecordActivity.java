package com.huawei.ui.main.stories.privacy.datasourcemanager;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.datasourcemanager.adapter.DeviceRecordAdapter;
import com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataDownloadListener;
import com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataSourceItemClickListener;
import com.huawei.ui.main.stories.privacy.datasourcemanager.receiver.DataDownloadReceiver;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.SourceInfoBean;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import defpackage.lcy;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqz;
import defpackage.vzp;
import defpackage.vzq;
import defpackage.wgk;
import defpackage.wgx;
import defpackage.whe;
import defpackage.whf;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceDetailRecordActivity extends BaseActivity implements DataSourceItemClickListener, DataDownloadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DataDownloadReceiver f28632c;
    private CustomTitleBar d;
    private int e;
    private String g;
    private DeviceRecordAdapter h;
    private String i;
    private int j;
    private boolean l;
    private RelativeLayout m;
    private boolean n;
    private ImageView o;
    private List<vzp> p;
    private RelativeLayout q;
    private String r;
    private HealthRecycleView s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<vzp> f28630a = new ArrayList(10);
    private List<vzp> k = new ArrayList(10);
    private List<vzp> f = new ArrayList(10);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_detail_record);
        b();
        d();
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.c("DeviceDetailRecordActivity", "intent is null");
            return;
        }
        this.i = intent.getStringExtra("device_name");
        this.f28631b = intent.getStringExtra("client_id");
        if (TextUtils.isEmpty(this.i)) {
            LogUtil.d("DeviceDetailRecordActivity", "mDeviceName is empty");
        } else {
            this.d.setTitleText(String.format(Locale.ROOT, getString(R.string.IDS_hwh_info_record), this.i));
        }
        this.p = new ArrayList(10);
        if (!TextUtils.isEmpty(this.f28631b)) {
            LogUtil.a("DeviceDetailRecordActivity", "from healthKit");
            c();
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("is_data_loaded", false);
        this.l = booleanExtra;
        if (!booleanExtra) {
            e();
        }
        ((TextView) findViewById(R.id.tv_loading_text)).setText(R.string.IDS_hw_health_loading);
        this.g = intent.getStringExtra("deviceUniqueCode");
        this.r = intent.getStringExtra("package_name");
        if (TextUtils.isEmpty(this.g) && TextUtils.isEmpty(this.r)) {
            this.m.setVisibility(8);
            this.q.setVisibility(0);
            LogUtil.c("DeviceDetailRecordActivity", "mDeviceUniqueCode or mPackageName is empty");
        } else {
            this.e = intent.getIntExtra("read_type", 0);
            int intExtra = intent.getIntExtra(DeviceCategoryFragment.DEVICE_TYPE, Integer.MIN_VALUE);
            this.j = intExtra;
            LogUtil.a("DeviceDetailRecordActivity", "mClassType is ", Integer.valueOf(this.e), "deviceType is", Integer.valueOf(intExtra));
            e(this.e, this.g, this.r, this.j);
        }
    }

    private void b() {
        this.m = (RelativeLayout) findViewById(R.id.device_detail_loading);
        this.q = (RelativeLayout) findViewById(R.id.no_data_source);
        this.d = (CustomTitleBar) findViewById(R.id.device_detail_record_title_layout);
        this.o = (ImageView) findViewById(R.id.no_data_image);
        this.d.setTitleBarBackgroundColor(getResources().getColor(R.color.health_chart_extend_background_color));
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.recyclerView);
        this.s = healthRecycleView;
        healthRecycleView.b(false);
        this.s.e(false);
        this.s.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DeviceRecordAdapter deviceRecordAdapter = new DeviceRecordAdapter(this, this);
        this.h = deviceRecordAdapter;
        this.s.setAdapter(deviceRecordAdapter);
    }

    private void e(int i, String str, String str2, int i2) {
        this.q.setVisibility(8);
        new wgk().d(i, str, str2, i2, new a(this));
    }

    private void c() {
        String strB = LanguageUtil.b(this);
        LogUtil.a("DeviceDetailRecordActivity", "getDataFromHealthKit");
        lcy.d().b(this, new whe(false, this.f28631b, strB).getRequestParamsBuilder().c(new OnRequestCallBack<wgx>() { // from class: com.huawei.ui.main.stories.privacy.datasourcemanager.DeviceDetailRecordActivity.1
            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(wgx wgxVar) {
                DeviceDetailRecordActivity.this.m.setVisibility(8);
                if (wgxVar == null || wgxVar.getWriteRecords() == null) {
                    return;
                }
                DeviceDetailRecordActivity.this.e(wgxVar);
            }

            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                DeviceDetailRecordActivity.this.m.setVisibility(8);
                LogUtil.c("DeviceDetailRecordActivity", Integer.valueOf(i), " accessRecordModel ", th == null ? Constants.NULL : th.getMessage());
            }
        }).e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    public void e(wgx wgxVar) {
        byte b2;
        vzp vzpVar = new vzp();
        vzpVar.a(2);
        vzpVar.e(true);
        this.p.add(vzpVar);
        Iterator<whf> it = wgxVar.getWriteRecords().iterator();
        while (it.hasNext()) {
            String dataType = it.next().getDataType();
            dataType.hashCode();
            switch (dataType) {
                case "com.huawei.activityrecord":
                    b2 = 0;
                    break;
                case "com.huawei.continuous.sleep.fragment":
                    b2 = 1;
                    break;
                case "com.huawei.instantaneous.body_weight":
                    b2 = 2;
                    break;
                case "com.huawei.continuous.steps.delta":
                    b2 = 3;
                    break;
                case "com.huawei.instantaneous.blood_glucose":
                    b2 = 4;
                    break;
                case "com.huawei.instantaneous.blood_pressure":
                    b2 = 5;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                k();
            } else if (b2 == 1) {
                c(true);
            } else if (b2 == 2) {
                b(true);
            } else if (b2 == 3) {
                a(true);
            } else if (b2 == 4) {
                d(true);
            } else if (b2 == 5) {
                e(true);
            }
        }
        this.h.c(this.f.size());
        this.p.addAll(this.f);
        this.h.c(this.p);
    }

    private void h() {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(101);
        vzpVar.b(getResources().getString(R.string.IDS_sport_distance));
        vzpVar.c(true);
        vzpVar.c(R.mipmap.ic_mydata_distance);
        this.f28630a.add(vzpVar);
    }

    private void g() {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(110);
        vzpVar.b(getResources().getString(R.string.IDS_motiontrack_climb_stairs_tip));
        vzpVar.c(true);
        vzpVar.c(R.mipmap.ic_mydata_climbing_stairs);
        this.f28630a.add(vzpVar);
    }

    private void f() {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(111);
        vzpVar.b(getResources().getString(R.string.IDS_active_caloric));
        vzpVar.c(true);
        vzpVar.c(R.mipmap.ic_mydata_kcal);
        this.f28630a.add(vzpVar);
    }

    private void i() {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.b(getResources().getString(R.string.IDS_hw_health_show_healthdata_heart_bmp));
        vzpVar.b(true);
        vzpVar.d(102);
        vzpVar.c(R.mipmap.ic_mydata_heart_rate);
        this.k.add(vzpVar);
    }

    private void b(boolean z) {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        vzpVar.b(getResources().getString(R.string.IDS_hw_show_set_weight));
        vzpVar.c(R.mipmap.ic_mydata_weight);
        if (z) {
            vzpVar.e(true);
            this.f.add(vzpVar);
        } else {
            vzpVar.b(true);
            this.k.add(vzpVar);
        }
    }

    private void c(boolean z) {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(103);
        vzpVar.b(getResources().getString(R.string.IDS_hw_show_main_home_page_sleep));
        vzpVar.c(R.mipmap.ic_mydata_sleep);
        if (z) {
            vzpVar.e(true);
            this.f.add(vzpVar);
        } else {
            vzpVar.b(true);
            this.k.add(vzpVar);
        }
    }

    private void a(boolean z) {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(100);
        vzpVar.b(getResources().getString(R.string.IDS_hw_show_main_permission_steps));
        vzpVar.c(R.mipmap.ic_mydata_step);
        if (z) {
            vzpVar.e(true);
            this.f.add(vzpVar);
        } else {
            vzpVar.c(true);
            this.f28630a.add(vzpVar);
        }
    }

    private void k() {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(112);
        vzpVar.b(getResources().getString(R.string.IDS_privacy_activity_records));
        vzpVar.c(R.mipmap.ic_motion_record);
        vzpVar.e(true);
        this.f.add(vzpVar);
    }

    private void l() {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(104);
        vzpVar.b(true);
        vzpVar.b(getResources().getString(R.string.IDS_settings_one_level_menu_settings_item_text_id14));
        vzpVar.c(R.mipmap.ic_mydata_pressure);
        this.k.add(vzpVar);
    }

    private void j() {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(105);
        vzpVar.b(true);
        vzpVar.b(getResources().getString(R.string.IDS_hw_health_blood_oxygen));
        vzpVar.c(R.mipmap.ic_mydata_blood_oxygen_saturation);
        this.k.add(vzpVar);
    }

    private void e(boolean z) {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(107);
        vzpVar.b(getResources().getString(R.string.IDS_hw_show_main_home_page_bloodpressure));
        vzpVar.c(R.mipmap.ic_mydata_blood_pressure);
        if (z) {
            vzpVar.e(true);
            this.f.add(vzpVar);
        } else {
            vzpVar.b(true);
            this.k.add(vzpVar);
        }
    }

    private void d(boolean z) {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.d(108);
        vzpVar.b(getResources().getString(R.string.IDS_hw_show_main_home_page_bloodsugar));
        vzpVar.c(R.mipmap.ic_mydata_blood_sugar);
        if (z) {
            vzpVar.e(true);
            this.f.add(vzpVar);
        } else {
            vzpVar.b(true);
            this.k.add(vzpVar);
        }
    }

    private void m() {
        vzp vzpVar = new vzp();
        vzpVar.a(3);
        vzpVar.b(true);
        if (Utils.o()) {
            vzpVar.d(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON);
            vzpVar.b(getResources().getString(R.string.IDS_health_skin_temperature));
        } else {
            vzpVar.d(106);
            vzpVar.b(getResources().getString(R.string.IDS_settings_health_temperature));
        }
        vzpVar.c(R.mipmap.ic_mydata_temperature);
        this.k.add(vzpVar);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataSourceItemClickListener
    public void onItemClickListener(int i) {
        if (njy.e(this.p)) {
            LogUtil.c("DeviceDetailRecordActivity", "mRecordList is null or mRecordList.size() is 0");
            return;
        }
        vzp vzpVar = this.p.get(i);
        if (vzpVar.b() == 3) {
            int iE = vzpVar.e();
            if (!TextUtils.isEmpty(this.f28631b)) {
                LogUtil.a("DeviceDetailRecordActivity", "HealthKit click");
                PrivacyDataModelActivity.e(this, new PageModelArgs(iE, "PrivacyDataConstructor", this.f28631b, 2, 1), new SourceInfoBean(false, this.i));
                return;
            }
            PageModelArgs pageModelArgs = new PageModelArgs(iE, "PrivacyDataConstructor", this.g, 1, 1);
            pageModelArgs.setClassType(this.e);
            pageModelArgs.setPackageName(this.r);
            if (getIntent() != null) {
                this.n = getIntent().getBooleanExtra("other_manufacaturer", false);
            }
            pageModelArgs.setOtherManufacturer(this.n);
            LogUtil.a("DeviceDetailRecordActivity", "DataSource click dataType is ", Integer.valueOf(iE));
            PrivacyDataModelActivity.b(this, pageModelArgs);
        }
    }

    private void a(vzq vzqVar) {
        LogUtil.a("DeviceDetailRecordActivity", "into updateList");
        this.p.clear();
        if (vzqVar.g() || vzqVar.h() || vzqVar.b() || vzqVar.c()) {
            e(vzqVar);
        }
        boolean z = true;
        boolean z2 = vzqVar.f() || vzqVar.k() || vzqVar.j() || vzqVar.i();
        if (!vzqVar.a() && !vzqVar.d() && !vzqVar.e() && !vzqVar.m()) {
            z = false;
        }
        if (z2 || z) {
            vzp vzpVar = new vzp();
            vzpVar.a(2);
            vzpVar.a(getResources().getString(R.string.IDS_settings_health_condition));
            this.p.add(vzpVar);
            d(vzqVar);
        } else {
            LogUtil.a("DeviceDetailRecordActivity", "ActiveStatistic and HealthPower no data");
        }
        this.h.c(this.p);
        if (this.p.size() > 0) {
            LogUtil.a("DeviceDetailRecordActivity", Integer.valueOf(this.p.size()));
        } else {
            LogUtil.c("DeviceDetailRecordActivity", "mRecordList size is 0");
        }
        if (this.l || !NetworkUtil.h()) {
            return;
        }
        qpx.e(this, R.string.IDS_hwh_data_loading);
    }

    private void e(vzq vzqVar) {
        LogUtil.a("DeviceDetailRecordActivity", "setActivityStatistic");
        this.f28630a.clear();
        vzp vzpVar = new vzp();
        vzpVar.a(2);
        vzpVar.a(getResources().getString(R.string.IDS_settings_active_statistic));
        this.p.add(vzpVar);
        if (vzqVar.g()) {
            a(false);
        }
        if (vzqVar.h()) {
            h();
        }
        if (vzqVar.b()) {
            g();
        }
        if (vzqVar.c()) {
            f();
        }
        this.p.addAll(this.f28630a);
        this.h.b(this.f28630a.size());
    }

    private void d(vzq vzqVar) {
        LogUtil.a("DeviceDetailRecordActivity", "setShowHealthCondition");
        this.k.clear();
        if (vzqVar.f()) {
            i();
        }
        if (vzqVar.k()) {
            b(false);
        }
        if (vzqVar.j()) {
            c(false);
        }
        if (vzqVar.i()) {
            l();
        }
        if (vzqVar.a()) {
            j();
        }
        if (vzqVar.d()) {
            e(false);
        }
        if (vzqVar.e()) {
            d(false);
        }
        if (vzqVar.m()) {
            m();
        }
        this.p.addAll(this.k);
        vzp vzpVar = new vzp();
        vzpVar.a(1);
        this.p.add(vzpVar);
        this.h.a(this.k.size());
    }

    private void e() {
        LogUtil.a("DeviceDetailRecordActivity", "registerBroadCast");
        this.f28632c = new DataDownloadReceiver(this);
        LocalBroadcastManager.getInstance().registerReceiver(this.f28632c, new IntentFilter("com.huawei.hihealth.action_sync"));
    }

    private void o() {
        if (this.f28632c != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.f28632c);
            this.f28632c = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        lcy.d().d(this);
        o();
        super.onDestroy();
    }

    private void a() {
        Toast.makeText(this, R.string.IDS_hwh_data_is_loaded, 0).show();
        e(this.e, this.g, this.r, this.j);
    }

    @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataDownloadListener
    public void dataDownloadListener(int i) {
        LogUtil.a("DeviceDetailRecordActivity", "actionSyncStatus is", Integer.valueOf(i));
        if (i == 2) {
            this.l = true;
            a();
            o();
        } else if (i == 3) {
            this.l = false;
        }
    }

    static class a implements DataSourceCallback<vzq> {
        WeakReference<DeviceDetailRecordActivity> e;

        a(DeviceDetailRecordActivity deviceDetailRecordActivity) {
            this.e = new WeakReference<>(deviceDetailRecordActivity);
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, vzq vzqVar) {
            LogUtil.a("DeviceDetailRecordActivity", "DataTypeCallBack resultCode = ", Integer.valueOf(i));
            WeakReference<DeviceDetailRecordActivity> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.c("DeviceDetailRecordActivity", "mWeakReference is null");
                return;
            }
            DeviceDetailRecordActivity deviceDetailRecordActivity = weakReference.get();
            if (deviceDetailRecordActivity != null) {
                deviceDetailRecordActivity.c(i, vzqVar);
            } else {
                LogUtil.c("DeviceDetailRecordActivity", "DataTypeCallBack deviceDetailRecordActivity is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, vzq vzqVar) {
        LogUtil.a("DeviceDetailRecordActivity", "resultCode = ", Integer.valueOf(i));
        if (i != 0 || vzqVar == null) {
            this.m.setVisibility(8);
            this.q.setVisibility(0);
            n();
        } else {
            this.m.setVisibility(8);
            a(vzqVar);
        }
    }

    private void n() {
        if (LanguageUtil.ba(this)) {
            this.o.setBackground(qqz.e(this, R.mipmap.icon_no_data));
        } else {
            this.o.setBackgroundResource(R.mipmap.icon_no_data);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
