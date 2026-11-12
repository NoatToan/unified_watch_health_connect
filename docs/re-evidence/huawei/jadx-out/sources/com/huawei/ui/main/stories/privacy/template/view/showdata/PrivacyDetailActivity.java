package com.huawei.ui.main.stories.privacy.template.view.showdata;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiBloodPressureMetaData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import com.huawei.ui.main.stories.privacy.template.model.adapter.BloodOxygenDetailAdapter;
import com.huawei.ui.main.stories.privacy.template.model.adapter.BloodPressureDetailAdapter;
import com.huawei.ui.main.stories.privacy.template.model.adapter.DataSourceViewAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.model.bean.SourceInfoBean;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDetailActivity;
import com.huawei.ui.main.stories.template.BaseActivity;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import defpackage.njy;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.uwu;
import defpackage.vzm;
import defpackage.wgr;
import defpackage.wgt;
import defpackage.wgv;
import defpackage.wig;
import defpackage.wjh;
import defpackage.wkb;
import defpackage.yls;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PrivacyDetailActivity extends BaseActivity {
    private static final Map<String, String> e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataSourceViewAdapter f28737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSourceViewAdapter f28738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f28739c;
    private boolean g;
    private LinearLayout h;
    private CustomTitleBar i;
    private HealthRecycleView j;
    private PageModelArgs k;
    private PrivacyDataModel m;
    private long n;
    private int o;
    private SourceInfoBean q;
    private String r;
    private int s;
    private LinearLayout t;
    private int x;
    private String d = "";
    private String p = "";
    private List<PrivacyDataModel> f = new CopyOnWriteArrayList();
    private Handler l = new Handler(Looper.getMainLooper());

    static {
        HashMap map = new HashMap(16);
        e = map;
        map.put("001", "HUAWEI");
        map.put("002", "Honor");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.privacy_data_detail_view);
        Intent intent = getIntent();
        if (intent != null) {
            this.k = (PageModelArgs) intent.getParcelableExtra("extra_page_model_args");
            this.m = (PrivacyDataModel) intent.getParcelableExtra("extra_privacy_data_model");
            this.q = (SourceInfoBean) intent.getParcelableExtra("extra_source_info");
            e(intent);
        }
        PageModelArgs pageModelArgs = this.k;
        if (pageModelArgs == null || this.m == null) {
            LogUtil.e("PrivacyDetailActivity", "PageModelArgs or mPrePageModel or sourceInfoBean is null");
            return;
        }
        this.x = pageModelArgs.getDataSource();
        this.o = this.k.getPageType();
        o();
        m();
    }

    private void e(Intent intent) {
        if (this.k == null) {
            String stringExtra = intent.getStringExtra("extra_page_model_args");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.k = (PageModelArgs) GsonUtil.parseJson(stringExtra, PageModelArgs.class);
            }
        }
        if (this.m == null) {
            String stringExtra2 = intent.getStringExtra("extra_privacy_data_model");
            if (TextUtils.isEmpty(stringExtra2)) {
                return;
            }
            this.m = (PrivacyDataModel) GsonUtil.parseJson(stringExtra2, PrivacyDataModel.class);
            try {
                this.m.setContentValues(e(new JSONObject(stringExtra2).getString("extendValues")));
            } catch (JSONException e2) {
                LogUtil.e("PrivacyDetailActivity", "parse mPrePageModel failed: " + e2.getMessage());
            }
        }
    }

    private ContentValues e(String str) {
        ContentValues contentValues = new ContentValues();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                Object obj = jSONObject.get(string);
                String string2 = obj.toString();
                if (obj instanceof String) {
                    contentValues.put(string, string2);
                } else if (obj instanceof Long) {
                    contentValues.put(string, Long.valueOf(string2));
                } else if (obj instanceof Integer) {
                    contentValues.put(string, Integer.valueOf(string2));
                } else if (obj instanceof Boolean) {
                    contentValues.put(string, Boolean.valueOf(string2));
                } else if (obj instanceof Double) {
                    contentValues.put(string, Double.valueOf(string2));
                } else if (obj instanceof Float) {
                    contentValues.put(string, Float.valueOf(string2));
                }
            }
        } catch (JSONException e2) {
            LogUtil.e("PrivacyDetailActivity", "jsonToContentValues failed: " + e2.getMessage());
        }
        return contentValues;
    }

    private void o() {
        this.t = (LinearLayout) findViewById(R.id.source_info_detail);
        this.h = (LinearLayout) findViewById(R.id.privacy_device_info);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.device_detail_title_bar);
        this.i = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.health_chart_extend_background_color));
        this.f28739c = (HealthRecycleView) findViewById(R.id.privacy_data_detail_recycle_view);
        this.j = (HealthRecycleView) findViewById(R.id.privacy_data_device_recycle_view);
        int i = this.o;
        if (i == 105 && this.x == 3) {
            this.f28737a = new BloodOxygenDetailAdapter();
        } else if (i == 107 && this.x != 2) {
            this.f28737a = new BloodPressureDetailAdapter();
        } else {
            this.f28737a = new DataSourceViewAdapter();
        }
        this.f28738b = new DataSourceViewAdapter();
        HealthSubHeader healthSubHeaderA = a(R.id.privacy_data_detail_title, R.id.item_title);
        healthSubHeaderA.setHeadTitleText(getResources().getString(R.string.IDS_privacy_device_info));
        healthSubHeaderA.setSplitterVisibility(4);
        healthSubHeaderA.setSubHeaderBackgroundColor(0);
        if (q() || t()) {
            a();
        }
    }

    private void m() {
        this.i.setTitleText(getResources().getString(R.string.IDS_privacy_data_detail));
        this.p = getResources().getString(this.x == 2 ? R.string.IDS_privacy_record_time : R.string.IDS_privacy_record_app_time);
        if (this.x == 2) {
            r();
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDetailActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    wkb.b();
                    PrivacyDetailActivity.this.s();
                    PrivacyDetailActivity privacyDetailActivity = PrivacyDetailActivity.this;
                    privacyDetailActivity.b(privacyDetailActivity.o, PrivacyDetailActivity.this.m.getStartTime(), PrivacyDetailActivity.this.m.getEndTime());
                }
            });
        }
    }

    private void a() {
        if (this.t == null || !qrs.ah(this)) {
            return;
        }
        HwColumnSystem hwColumnSystem = new HwColumnSystem(this);
        hwColumnSystem.d(0);
        if (hwColumnSystem.j() != 8) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = this.t.getLayoutParams() instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) this.t.getLayoutParams() : null;
        int iRound = Math.round(hwColumnSystem.f()) + hwColumnSystem.b();
        if (layoutParams != null) {
            layoutParams.setMarginStart(iRound);
            layoutParams.setMarginEnd(iRound);
        }
    }

    private boolean q() {
        int i = this.o;
        return i == 106 || i == 113;
    }

    private boolean t() {
        return this.o == 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.t.setVisibility(0);
        a(this.q);
        a(this.f);
        if (!this.q.isDevice()) {
            this.h.setVisibility(8);
            return;
        }
        List<PrivacyDataModel> listB = b(this.q);
        if (listB.size() <= 1) {
            this.h.setVisibility(8);
        } else if ("UNKNOWN".equals(listB.get(0).getDataDesc())) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            e(listB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        LogUtil.a("PrivacyDetailActivity", "showDeviceInfo clientId :", Integer.valueOf(this.m.getClientId()));
        HiHealthNativeApi.a(this).fetchDataSource(HiDataSourceFetchOption.builder().c(1).b(new int[]{this.m.getClientId()}).a(), new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthClient> list) {
        if (list == null || list.size() <= 0) {
            LogUtil.a("PrivacyDetailActivity", "handleClientSourceResult clientList is null or size is 0");
            p();
            return;
        }
        HiHealthClient hiHealthClient = list.get(0);
        HiDeviceInfo hiDeviceInfo = hiHealthClient.getHiDeviceInfo();
        HiAppInfo hiAppInfo = hiHealthClient.getHiAppInfo();
        if (hiDeviceInfo == null || hiAppInfo == null) {
            LogUtil.a("PrivacyDetailActivity", "deviceInfo or appInfo is null");
            p();
            return;
        }
        String packageName = hiAppInfo.getPackageName();
        LogUtil.a("PrivacyDetailActivity", "handleClientSourceResult packageName is ", packageName);
        String deviceName = wgt.c(hiDeviceInfo).getDeviceName();
        if (this.m.getType() == 2) {
            deviceName = TextUtils.isEmpty(hiDeviceInfo.getModel()) ? hiDeviceInfo.getDeviceName() : hiDeviceInfo.getModel();
        }
        LogUtil.a("PrivacyDetailActivity", "handleClientSourceResult deviceName is ", deviceName);
        e(packageName, deviceName, hiAppInfo, hiDeviceInfo);
        this.l.post(new wjh(this));
    }

    private void e(String str, String str2, HiAppInfo hiAppInfo, HiDeviceInfo hiDeviceInfo) {
        if (wgr.c(str)) {
            String appName = hiAppInfo.getAppName();
            this.r = appName;
            LogUtil.a("PrivacyDetailActivity", "handleClientSourceResult getAppName is ", appName);
            if ("未知APP".equals(this.r)) {
                this.r = str2;
            }
            if (TextUtils.isEmpty(this.r)) {
                this.r = getResources().getString(R.string.IDS_hwh_datasource_unknow_application);
            }
            this.q = new SourceInfoBean(false, this.r);
            return;
        }
        if (wgr.d(str, hiDeviceInfo.getDeviceUniqueCode())) {
            this.r = getResources().getString(R.string.IDS_hw_health_show_healthdata_input);
            this.q = new SourceInfoBean(false, this.r);
            return;
        }
        if (hiDeviceInfo.getDeviceType() == 32) {
            SourceInfoBean sourceInfoBean = new SourceInfoBean(true, str2);
            this.q = sourceInfoBean;
            sourceInfoBean.setDeviceName(str2);
            this.q.setSoftwareVersion(hiDeviceInfo.getSoftwareVersion());
            this.q.setManufacturer(hiDeviceInfo.getManufacturer());
            return;
        }
        if (hiDeviceInfo.getDeviceType() == 30) {
            SourceInfoBean sourceInfoBean2 = new SourceInfoBean(true, str2);
            this.q = sourceInfoBean2;
            sourceInfoBean2.setDeviceName(str2);
            this.q.setSoftwareVersion(hiDeviceInfo.getSoftwareVersion());
            this.q.setManufacturer(hiDeviceInfo.getManufacturer());
            return;
        }
        SourceInfoBean sourceInfoBean3 = new SourceInfoBean(true, str2);
        this.q = sourceInfoBean3;
        sourceInfoBean3.setDeviceName(str2);
        this.q.setHardwareVersion(hiDeviceInfo.getHardwareVersion());
        this.q.setSoftwareVersion(hiDeviceInfo.getSoftwareVersion());
        this.q.setManufacturer(hiDeviceInfo.getManufacturer());
        this.q.setProduceType(hiDeviceInfo.getModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, long j, long j2) {
        if (i == 107) {
            this.s = 2006;
        } else if (i != 109) {
            return;
        } else {
            this.s = 2004;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(new int[]{this.s});
        if (i == 107) {
            hiDataReadOption.setType(new int[]{2006, DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()});
        }
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(this).readHiHealthData(hiDataReadOption, new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SparseArray<List<HiHealthData>> sparseArray) {
        String string = "";
        if (sparseArray.size() <= 0) {
            LogUtil.j("PrivacyDetailActivity", "handleHiDataResult map.size() <= 0");
            return;
        }
        List<HiHealthData> list = sparseArray.get(this.s);
        if (!yls.c(list)) {
            long modifiedTime = list.get(0).getModifiedTime();
            this.n = modifiedTime;
            if (modifiedTime == 0) {
                this.n = list.get(0).getEndTime();
            }
            LogUtil.a("PrivacyDetailActivity", "handleHiDataResult mModifyTime is ", Long.valueOf(this.n));
        } else {
            LogUtil.j("PrivacyDetailActivity", "handleHiDataResult hiHealthDataList.size() <= 0");
        }
        if (this.o != 107) {
            this.l.post(new Runnable() { // from class: wjd
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.x();
                }
            });
            return;
        }
        List<HiHealthData> list2 = sparseArray.get(DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value());
        if (yls.c(list2)) {
            this.g = true;
            this.l.post(new Runnable() { // from class: wjd
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.x();
                }
            });
            return;
        }
        HiHealthData hiHealthData = list2.get(0);
        List<uwu> listA = BloodPressureUtil.a();
        int iA = BloodPressureUtil.a(hiHealthData.getIntValue());
        BloodPressureUtil.d(iA, listA);
        List list3 = (List) listA.stream().filter(new Predicate() { // from class: wjf
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((uwu) obj).g();
            }
        }).map(new Function() { // from class: wje
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((uwu) obj).b();
            }
        }).collect(Collectors.toList());
        try {
            HiBloodPressureMetaData hiBloodPressureMetaData = (HiBloodPressureMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiBloodPressureMetaData.class);
            if (hiBloodPressureMetaData != null && njy.b(hiBloodPressureMetaData.getActivityActions())) {
                list3.addAll(hiBloodPressureMetaData.getActivityActions());
            }
        } catch (Exception unused) {
            LogUtil.a("PrivacyDetailActivity", "turn json mHiHealthData.getMetaData() fail: ", "");
        }
        final StringBuilder sb = new StringBuilder();
        list3.forEach(new Consumer() { // from class: wjg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PrivacyDetailActivity.e(sb, (String) obj);
            }
        });
        if (iA != 4096) {
            string = sb.toString();
        }
        this.d = string;
        this.g = true;
        this.l.post(new Runnable() { // from class: wjd
            @Override // java.lang.Runnable
            public final void run() {
                this.e.x();
            }
        });
    }

    public static /* synthetic */ void e(StringBuilder sb, String str) {
        sb.append(sb.length() > 0 ? "、 " : "");
        sb.append(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        boolean z;
        if (njy.e(this.f)) {
            return;
        }
        for (PrivacyDataModel privacyDataModel : this.f) {
            if (this.p.equals(privacyDataModel.getDataTitle())) {
                privacyDataModel.setDataDesc(wig.c(this.n));
                break;
            }
        }
        if (this.o != 107 || this.x == 2) {
            a(this.f);
            return;
        }
        String string = getResources().getString(R.string.IDS_blood_measure_action);
        Iterator<PrivacyDataModel> it = this.f.iterator();
        PrivacyDataModel next = null;
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            if (string.equals(next.getDataTitle()) && !StringUtils.g(this.d)) {
                next.setDataDesc(this.d);
                break;
            } else if (string.equals(next.getDataTitle()) && StringUtils.g(this.d)) {
                z = true;
                break;
            }
        }
        if (z && next != null) {
            this.f.remove(next);
        }
        a(this.f);
    }

    private void p() {
        String deviceName = this.m.getDeviceName();
        this.r = deviceName;
        LogUtil.a("PrivacyDetailActivity", "setUnknownSourceData getDeviceName is ", deviceName);
        if (TextUtils.isEmpty(this.r)) {
            this.r = getResources().getString(R.string.IDS_hw_data_origin_unknow_device);
        }
        this.q = new SourceInfoBean(false, this.r);
        this.l.post(new wjh(this));
    }

    private void a(SourceInfoBean sourceInfoBean) {
        int i = this.o;
        if (i == 103) {
            k();
            return;
        }
        if (i == 105) {
            n();
        } else if (i == 107) {
            i();
        } else {
            l();
        }
    }

    private void k() {
        if (this.m.getType() == 22107 || this.m.getType() == 22106) {
            b();
            j();
            f();
            return;
        }
        l();
    }

    private void n() {
        if (this.x == 3) {
            g();
            h();
            e();
            j();
            f();
            return;
        }
        l();
    }

    private void i() {
        if (this.x != 2) {
            PrivacyDataModel privacyDataModel = new PrivacyDataModel(wig.a(this.o), wig.b(this.o, this.m));
            privacyDataModel.putInt(BleConstants.BLOODPRESSURE_SYSTOLIC, this.m.getInt(BleConstants.BLOODPRESSURE_SYSTOLIC));
            privacyDataModel.putInt(BleConstants.BLOODPRESSURE_DIASTOLIC, this.m.getInt(BleConstants.BLOODPRESSURE_DIASTOLIC));
            this.f.add(privacyDataModel);
            this.f.add(new PrivacyDataModel(getResources().getString(R.string.IDS_hw_health_show_pulse_heart_bmp), wgv.a(this.m.getInt(BleConstants.BLOODPRESSURE_SPHYGMUS))));
            c();
            h();
            e();
            j();
            f();
            int i = this.m.getInt("measureAbnormal");
            if (i == 2 || i == 3 || i == 4 || i == 5 || i == 9 || i == 10 || i == 11) {
                PrivacyDataModel privacyDataModel2 = new PrivacyDataModel(getResources().getString(R.string.IDS_privacy_measure_abnormal), vzm.a.d(i));
                privacyDataModel2.putInt("measureAbnormal", i);
                this.f.add(privacyDataModel2);
                return;
            }
            return;
        }
        l();
    }

    private void l() {
        d();
        h();
        e();
        j();
        f();
    }

    private void d() {
        this.f.add(new PrivacyDataModel(wig.a(this.o), this.x == 2 ? this.m.getDataTitle() : wig.b(this.o, this.m)));
    }

    private void h() {
        this.f.add(new PrivacyDataModel(getResources().getString(R.string.IDS_settings_seat_long_starttime), wig.c(this.m.getStartTime())));
    }

    private void e() {
        this.f.add(new PrivacyDataModel(getResources().getString(R.string.IDS_settings_seat_long_endtime), wig.c(this.m.getEndTime())));
    }

    private void j() {
        String str = this.p;
        long endTime = this.n;
        if (endTime == 0) {
            endTime = this.m.getModifyTime();
        }
        if (endTime == 0) {
            endTime = this.m.getEndTime();
        }
        this.f.add(new PrivacyDataModel(str, wig.c(endTime)));
    }

    private void f() {
        String string = getResources().getString(R.string.IDS_privacy_source);
        String source = this.q.getSource();
        if (TextUtils.isEmpty(source)) {
            source = getResources().getString(R.string.IDS_hw_data_origin_unknow_device);
        }
        this.f.add(new PrivacyDataModel(string, source));
    }

    private void c() {
        if (this.g && StringUtils.g(this.d)) {
            return;
        }
        this.f.add(new PrivacyDataModel(getResources().getString(R.string.IDS_blood_measure_action), this.d));
    }

    private void b() {
        this.f.add(new PrivacyDataModel(getResources().getString(R.string.IDS_manual_sleep_bed_time), this.m.getLong("bedStartTime") == Long.MIN_VALUE ? "--" : wgr.c(this.m.getLong("bedEndTime") - this.m.getLong("bedStartTime"), 0L)));
        this.f.add(new PrivacyDataModel(getResources().getString(R.string.IDS_manual_sleep_sleep_time), this.m.getLong("sleepStartTime") == Long.MIN_VALUE ? "--" : wgr.c(this.m.getLong("sleepEndTime") - this.m.getLong("sleepStartTime"), 0L)));
        String string = getResources().getString(R.string.IDS_get_in_bed_time_label);
        long j = this.m.getLong("bedStartTime");
        this.f.add(new PrivacyDataModel(string, j == Long.MIN_VALUE ? "--" : wig.c(j)));
        String string2 = getResources().getString(R.string.IDS_fitness_core_sleep_go_to_sleep_time);
        long j2 = this.m.getLong("sleepStartTime");
        this.f.add(new PrivacyDataModel(string2, j2 == Long.MIN_VALUE ? "--" : wig.c(j2)));
        String string3 = getResources().getString(R.string.IDS_manual_sleep_waking_time);
        long j3 = this.m.getLong("sleepEndTime");
        this.f.add(new PrivacyDataModel(string3, j3 == Long.MIN_VALUE ? "--" : wig.c(j3)));
        String string4 = getResources().getString(R.string.IDS_getup_time_label);
        long j4 = this.m.getLong("bedEndTime");
        this.f.add(new PrivacyDataModel(string4, j4 != Long.MIN_VALUE ? wig.c(j4) : "--"));
    }

    private void g() {
        int i = this.m.getInt("lakeLouiseScoreKey");
        if (i != Integer.MIN_VALUE) {
            this.f.add(new PrivacyDataModel(getString(R.string.IDS_privacy_highland_risk), String.valueOf(i)));
        }
        this.f.add(new PrivacyDataModel(getString(R.string.IDS_hw_show_main_permission_blood_oxygen), String.valueOf(this.m.getInt("bloodOxygenKey"))));
        if ("true".equals(SharedPreferenceManager.e(getApplicationContext(), String.valueOf(10000), "BLOOD_OXYGEN_SWITCH_IS_VISIBLE"))) {
            int i2 = this.m.getInt("altitudeKey");
            if (i2 == Integer.MIN_VALUE) {
                this.f.add(new PrivacyDataModel(getString(R.string.IDS_hw_health_blood_oxygen_elevation), "--"));
            } else {
                this.f.add(new PrivacyDataModel(getString(R.string.IDS_hw_health_blood_oxygen_elevation), wgv.e(i2)));
            }
        }
    }

    private List<PrivacyDataModel> b(SourceInfoBean sourceInfoBean) {
        ArrayList arrayList = new ArrayList();
        Resources resources = getResources();
        String string = resources.getString(R.string.IDS_privacy_device_name);
        String deviceName = sourceInfoBean.getDeviceName();
        if (TextUtils.isEmpty(deviceName)) {
            deviceName = getResources().getString(R.string.IDS_hw_data_origin_unknow_device);
        }
        arrayList.add(new PrivacyDataModel(string, deviceName));
        a(arrayList, sourceInfoBean);
        String string2 = resources.getString(R.string.IDS_privacy_device_type);
        String produceType = sourceInfoBean.getProduceType();
        if (!TextUtils.isEmpty(produceType)) {
            arrayList.add(new PrivacyDataModel(string2, produceType));
        }
        String string3 = resources.getString(R.string.IDS_device_rope_info_hardware_version);
        String hardwareVersion = sourceInfoBean.getHardwareVersion();
        if (!TextUtils.isEmpty(hardwareVersion)) {
            arrayList.add(new PrivacyDataModel(string3, hardwareVersion));
        }
        String string4 = resources.getString(R.string.IDS_device_rope_info_software_version);
        String softwareVersion = sourceInfoBean.getSoftwareVersion();
        if (!TextUtils.isEmpty(softwareVersion)) {
            arrayList.add(new PrivacyDataModel(string4, softwareVersion));
        }
        return arrayList;
    }

    private void a(List<PrivacyDataModel> list, SourceInfoBean sourceInfoBean) {
        String string = getResources().getString(R.string.IDS_privacy_device_manufacturer);
        String manufacturer = sourceInfoBean.getManufacturer();
        if (manufacturer != null && Pattern.matches("[0-9]{3}", manufacturer)) {
            manufacturer = e.get(manufacturer);
        }
        if (TextUtils.isEmpty(manufacturer)) {
            return;
        }
        list.add(new PrivacyDataModel(string, manufacturer));
    }

    private HealthSubHeader a(int i, int i2) {
        return (HealthSubHeader) qsp.a(this, i).findViewById(i2);
    }

    private void a(List<PrivacyDataModel> list) {
        a(this.f28739c, this.f28737a, list);
    }

    private void e(List<PrivacyDataModel> list) {
        a(this.j, this.f28738b, list);
    }

    private void a(HealthRecycleView healthRecycleView, DataSourceViewAdapter dataSourceViewAdapter, List<PrivacyDataModel> list) {
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this) { // from class: com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDetailActivity.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        healthRecycleView.setAdapter(dataSourceViewAdapter);
        dataSourceViewAdapter.a(list);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements HiDataClientListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<PrivacyDetailActivity> f28742c;

        b(PrivacyDetailActivity privacyDetailActivity) {
            this.f28742c = new WeakReference<>(privacyDetailActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataClientListener
        public void onResult(List<HiHealthClient> list) {
            WeakReference<PrivacyDetailActivity> weakReference = this.f28742c;
            if (weakReference == null) {
                return;
            }
            PrivacyDetailActivity privacyDetailActivity = weakReference.get();
            if (privacyDetailActivity != null) {
                privacyDetailActivity.b(list);
            } else {
                LogUtil.a("PrivacyDetailActivity", "ReadDataSourceCallBack detailActivity is null");
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d implements HiDataReadResultListener {
        WeakReference<PrivacyDetailActivity> e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        d(PrivacyDetailActivity privacyDetailActivity) {
            this.e = new WeakReference<>(privacyDetailActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            WeakReference<PrivacyDetailActivity> weakReference = this.e;
            if (weakReference == null) {
                return;
            }
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("PrivacyDetailActivity", "readHiHealthDataModifyTime data null");
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            PrivacyDetailActivity privacyDetailActivity = weakReference.get();
            if (privacyDetailActivity != null) {
                privacyDetailActivity.a((SparseArray<List<HiHealthData>>) sparseArray);
            } else {
                LogUtil.a("PrivacyDetailActivity", "ReadHiDataCallBack detailActivity is null");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
