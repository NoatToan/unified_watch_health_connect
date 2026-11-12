package com.huawei.ui.device.activity.adddevice;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.CompatibilityInteractor;
import defpackage.dxw;
import defpackage.edl;
import defpackage.edn;
import defpackage.eel;
import defpackage.fks;
import defpackage.lmf;
import defpackage.lvi;
import defpackage.lzi;
import defpackage.mfs;
import defpackage.mgg;
import defpackage.qji;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rcv;
import defpackage.rcw;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class AddDeviceIntroActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f24097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24098b;
    private CustomTitleBar d;
    private Context e;
    private a f;
    private HealthDotsPageIndicator g;
    private HealthButton r;
    private HealthViewPager u;
    private HealthTextView w;
    private ArrayList<String> v = new ArrayList<>(16);
    private ArrayList<String> q = new ArrayList<>(16);
    private ArrayList<Integer> h = new ArrayList<>(16);
    private ArrayList<Integer> t = new ArrayList<>(16);
    private int j = -1;
    private int x = 0;
    private String i = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24099c = "";
    private boolean k = false;
    private boolean n = false;
    private int l = 0;
    private boolean o = true;
    private edl p = null;
    private ArrayList<Bitmap> s = new ArrayList<>(16);
    private ArrayList<Bitmap> y = new ArrayList<>(16);
    private HealthViewPager.OnPageChangeListener m = new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity.3
        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            LogUtil.a("AddDeviceIntroActivity", "ProductIntroductionFragment onPageSelected() position ", Integer.valueOf(i));
            AddDeviceIntroActivity.this.d(i);
            AddDeviceIntroActivity.this.l = i;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            LogUtil.a("AddDeviceIntroActivity", "ProductIntroductionFragment onPageScrolled() position ", Integer.valueOf(i), " positionOffset ", Float.valueOf(f), " positionOffsetPixels ", Integer.valueOf(i2));
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            LogUtil.a("AddDeviceIntroActivity", "ProductIntroductionFragment onPageScrollStateChanged() state ", Integer.valueOf(i));
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = BaseApplication.getContext();
        this.f24098b = this;
        LogUtil.a("AddDeviceIntroActivity", "onCreate()");
        h();
        c();
        o();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        h();
        c();
        o();
    }

    private void o() {
        int i = this.x;
        if (i == 1 || i == 2) {
            mfs.c(this, -1);
        }
    }

    private void h() {
        setContentView(R.layout.activity_device_introduction_layout);
        this.d = (CustomTitleBar) qsp.a(this, R.id.device_introduction_detail_title_bar);
        this.u = (HealthViewPager) qsp.a(this, R.id.device_introduction_device_img);
        if (qrs.af(this.e)) {
            ViewGroup.LayoutParams layoutParams = this.u.getLayoutParams();
            layoutParams.width = qrs.d(this.e, 320.0f);
            this.u.setLayoutParams(layoutParams);
        }
        this.w = (HealthTextView) qsp.a(this, R.id.device_introduction_prompt);
        this.g = (HealthDotsPageIndicator) qsp.a(this, R.id.indicator);
        this.f24097a = (HealthButton) qsp.a(this, R.id.device_introduction_buy_device);
        HealthButton healthButton = (HealthButton) qsp.a(this, R.id.device_introduction_guide_next);
        this.r = healthButton;
        healthButton.setText(getString(com.huawei.ui.main.R.string.IDS_device_start_paring_title).toUpperCase(Locale.getDefault()));
        d(this.r);
        d(this.f24097a);
        Context context = this.f24098b;
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity != null) {
            this.f24097a.setOnClickListener(qji.b(this, baseActivity, true, ""));
            this.r.setOnClickListener(qji.b(this, baseActivity, true, ""));
        }
    }

    private void d(final HealthButton healthButton) {
        final int[] iArr = {15};
        for (int i = 0; i < 6; i++) {
            healthButton.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    HealthButton healthButton2 = healthButton;
                    if (healthButton2 == null) {
                        LogUtil.a("AddDeviceIntroActivity", "onGlobalLayout button is null");
                        return;
                    }
                    if (healthButton2.getLineCount() > 1) {
                        WindowManager windowManager = AddDeviceIntroActivity.this.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager ? (WindowManager) AddDeviceIntroActivity.this.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) : null;
                        if (windowManager != null) {
                            int width = windowManager.getDefaultDisplay().getWidth();
                            ViewGroup.LayoutParams layoutParams = healthButton.getLayoutParams();
                            if (width == layoutParams.width) {
                                int[] iArr2 = iArr;
                                int i2 = iArr2[0] - 1;
                                iArr2[0] = i2;
                                healthButton.setTextSize(1, i2);
                            } else {
                                layoutParams.width = width - qqp.a(AddDeviceIntroActivity.this, 64.0f);
                                healthButton.setLayoutParams(layoutParams);
                            }
                        }
                    } else {
                        healthButton.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    LogUtil.a("AddDeviceIntroActivity", "globalLayout");
                }
            });
        }
    }

    private void c() {
        edn ednVarA;
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.k = intent.getBooleanExtra("isFromWear", false);
                this.j = intent.getIntExtra(DeviceCategoryFragment.DEVICE_TYPE, -1);
                if (intent.getBooleanExtra("isPorc", false)) {
                    LogUtil.a("AddDeviceIntroActivity", "initData() device is porc!");
                    ednVarA = lvi.j();
                    this.n = true;
                } else if (intent.getBooleanExtra("isR1pro", false)) {
                    ednVarA = lvi.h();
                    this.i = ednVarA.i();
                } else {
                    ednVarA = lvi.a(this.j);
                    this.i = intent.getStringExtra("dname");
                }
                this.x = intent.getIntExtra("viewStyle", 1);
                LogUtil.a("AddDeviceIntroActivity", "initData() mDeviceType :", Integer.valueOf(this.j), "mDeviceName：", this.i);
                this.d.setTitleText(ednVarA.i());
                this.h = ednVarA.n();
                this.q = ednVarA.j();
                this.f24099c = ednVarA.e();
            } catch (Exception unused) {
                LogUtil.e("AddDeviceIntroActivity", "AddDeviceIntroActivity encounteredClassNotFoundException");
            }
        }
        LogUtil.a("AddDeviceIntroActivity", "initData() mBuyUrl :", this.f24099c);
        j();
        b();
    }

    private void j() {
        if (lvi.n(this.j)) {
            LogUtil.a("AddDeviceIntroActivity", "initData() device is plugin downloaded!");
            this.p = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(this.j));
            this.s.clear();
            this.y.clear();
            edl edlVar = this.p;
            if (edlVar != null && edlVar.i() != null && this.p.i().ad() != null) {
                for (int i = 0; i < this.p.i().ad().size(); i++) {
                    DownloadManagerApi downloadManagerApi = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
                    edl edlVar2 = this.p;
                    this.s.add(downloadManagerApi.loadImageByImageName(edlVar2, edlVar2.i().ad().get(i)));
                }
                LogUtil.a("AddDeviceIntroActivity", "initData() device is plugin downloaded! image size:", Integer.valueOf(this.s.size()));
                String strF = this.p.i().f();
                this.f24099c = strF;
                LogUtil.a("AddDeviceIntroActivity", "initData() device is plugin downloaded! mBuyUrl:", strF);
            }
            if (LanguageUtil.ba(this)) {
                for (int size = this.s.size() - 1; size >= 0; size--) {
                    this.y.add(this.s.get(size));
                }
            } else {
                this.y.addAll(this.s);
            }
            this.f = new a(this.y, true);
            return;
        }
        this.t.clear();
        if (LanguageUtil.ba(this)) {
            for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
                this.t.add(this.h.get(size2));
            }
        } else {
            this.t.addAll(this.h);
        }
        this.f = new a(this.t);
    }

    private void b() {
        this.u.setAdapter(this.f);
        this.g.setRtlEnable(true);
        this.g.setViewPager(this.u);
        this.u.setOnPageChangeListener(this.m);
        this.v.clear();
        if (LanguageUtil.ba(this)) {
            for (int size = this.q.size() - 1; size >= 0; size--) {
                this.v.add(this.q.get(size));
            }
        } else {
            this.v.addAll(this.q);
        }
        LogUtil.a("AddDeviceIntroActivity", "initData() mTextList :", Integer.valueOf(this.v.size()));
        if (this.v.size() > 0) {
            if (this.o) {
                if (LanguageUtil.ba(this)) {
                    this.l = this.v.size() - 1;
                } else {
                    this.l = 0;
                }
                this.o = false;
            }
            if (this.l < this.v.size()) {
                this.w.setText(this.v.get(this.l));
            }
        }
        f();
    }

    private void f() {
        if (Utils.o() || CommonUtil.bd()) {
            this.f24097a.setVisibility(8);
            return;
        }
        int i = this.j;
        if (i == 23 || i == 24) {
            LogUtil.j("AddDeviceIntroActivity", "setBuyButton HONOR_AW70, HUAWEI_AW70");
            this.f24097a.setVisibility(8);
        } else {
            a(this.f24099c);
        }
    }

    private void a(String str) {
        this.f24099c = str;
        if (TextUtils.isEmpty(str)) {
            this.f24097a.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i >= 0) {
            try {
                if (i < this.v.size()) {
                    this.w.setText(this.v.get(i));
                    return;
                }
            } catch (IndexOutOfBoundsException unused) {
                LogUtil.a("AddDeviceIntroActivity", "IndexOutOfBoundsException arg0 ", Integer.valueOf(i), ",mTextList.size() ", Integer.valueOf(this.v.size()));
                return;
            }
        }
        LogUtil.a("AddDeviceIntroActivity", "error index ", Integer.valueOf(i));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.a("AddDeviceIntroActivity", "onClick view is null");
            return;
        }
        if (R.id.device_introduction_guide_next == view.getId()) {
            if (qrs.r()) {
                LogUtil.a("AddDeviceIntroActivity", "click too fast");
                return;
            }
            DeviceInfo deviceInfoD = mgg.d("AddDeviceIntroActivity");
            if (deviceInfoD != null && HwVersionManager.b(BaseApplication.getContext()).m(deviceInfoD.getDeviceIdentify())) {
                LogUtil.a("AddDeviceIntroActivity", "wear device OTA is in progress");
                i();
                return;
            } else {
                d();
                return;
            }
        }
        if (R.id.device_introduction_buy_device != view.getId()) {
            LogUtil.a("AddDeviceIntroActivity", "unknown id");
            return;
        }
        if (TextUtils.isEmpty(this.f24099c)) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("device_name", lvi.e(this.j, this.i, this.n));
        map.put(DeviceCategoryFragment.DEVICE_TYPE, "HDK_WEAR");
        lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_BUY_PRODUCT_2060003.value(), map, 0);
        Intent intent = new Intent();
        intent.setPackage(this.e.getPackageName());
        intent.setClassName(this.e.getPackageName(), "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", this.f24099c);
        intent.putExtra("EXTRA_BI_ID", "");
        intent.putExtra("EXTRA_BI_NAME", "");
        intent.putExtra("EXTRA_BI_SOURCE", "Device");
        startActivity(intent);
    }

    private void d() {
        LogUtil.a("AddDeviceIntroActivity", "enter handleDialogByConnectedDevice");
        List<DeviceInfo> listB = rcv.a(BaseApplication.getContext()).b();
        if (listB == null || listB.isEmpty()) {
            LogUtil.a("AddDeviceIntroActivity", "onClick connectedDeviceInfo is null");
            e();
        } else if (listB.size() == 1) {
            e(listB);
        } else if (listB.size() >= 2) {
            b(listB);
        } else {
            LogUtil.a("AddDeviceIntroActivity", "more devices");
        }
    }

    private void b(List<DeviceInfo> list) {
        if (eel.d(this.j)) {
            for (DeviceInfo deviceInfo : list) {
                if (eel.d(deviceInfo.getProductType())) {
                    LogUtil.a("AddDeviceIntroActivity", "caseForTwoMoreConnectedDevices aw70 device");
                    d(this.j, this.i, deviceInfo);
                    return;
                }
            }
            return;
        }
        for (DeviceInfo deviceInfo2 : list) {
            if (!eel.d(deviceInfo2.getProductType(), deviceInfo2.getAutoDetectSwitchStatus())) {
                LogUtil.a("AddDeviceIntroActivity", "onClick user has connect other device, and also wants to connect other device");
                d(this.j, this.i, deviceInfo2);
                return;
            }
        }
    }

    private void e(List<DeviceInfo> list) {
        int i;
        LogUtil.a("AddDeviceIntroActivity", "onClick has one connected device");
        DeviceInfo deviceInfo = list.get(0);
        if (deviceInfo == null) {
            LogUtil.e("AddDeviceIntroActivity", "onClick connected is null");
            return;
        }
        if (eel.d(deviceInfo.getProductType())) {
            if (eel.d(this.j)) {
                LogUtil.a("AddDeviceIntroActivity", "onClick user has connect aw70, and also wants to connect aw70 device");
                d(this.j, this.i, deviceInfo);
                return;
            } else if (deviceInfo.getAutoDetectSwitchStatus() == 0) {
                LogUtil.a("AddDeviceIntroActivity", "onClick user has connect aw70 band mode, and also wants to connect other device");
                d(this.j, this.i, deviceInfo);
                return;
            } else if (deviceInfo.getAutoDetectSwitchStatus() == 1) {
                LogUtil.a("AddDeviceIntroActivity", "onClick user has connect aw70 run mode, and also wants to connect other device");
                e();
                return;
            } else {
                LogUtil.a("AddDeviceIntroActivity", "onClick user has connect aw70 unknown mode, and also wants to connect other device");
                return;
            }
        }
        if (eel.d(this.j)) {
            LogUtil.a("AddDeviceIntroActivity", "onClick user has connect other device, and also wants to connect aw70 device");
            e();
            return;
        }
        LogUtil.a("AddDeviceIntroActivity", "onClick user has connect other device, and also wants to connect other device");
        int i2 = this.j;
        if (((i2 == 3 || i2 == 10) && deviceInfo.getDeviceIdentify().equalsIgnoreCase("AndroidWear")) || (i = this.j) == 2 || i == 9 || i == -3) {
            e();
        } else {
            d(i, this.i, deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("AddDeviceIntroActivity", "makeResult mIsFromWear ", Boolean.valueOf(this.k));
        if (this.k) {
            try {
                Intent intent = new Intent();
                intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, this.j);
                intent.putExtra("isFromWear", this.k);
                LogUtil.a("AddDeviceIntroActivity", "onClick device_type:", Integer.valueOf(this.j));
                intent.setClass(this.f24098b, AddDeviceChildActivity.class);
                this.f24098b.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                LogUtil.e("AddDeviceIntroActivity", "ActivityNotFoundException e:", e.getMessage());
            }
            finish();
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra(DeviceCategoryFragment.DEVICE_TYPE, this.j);
        LogUtil.a("AddDeviceIntroActivity", "onClick device_type:", Integer.valueOf(this.j));
        setResult(101, intent2);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!NotificationContentProviderUtil.b()) {
            LogUtil.a("AddDeviceIntroActivity", "gotoConnect NOTIFICATION_INITIALIZE");
            if (lzi.a().d()) {
                NotificationContentProviderUtil.c(1);
            } else {
                NotificationContentProviderUtil.c(0);
            }
        }
        a();
    }

    private void a() {
        CompatibilityInteractor compatibilityInteractor = new CompatibilityInteractor();
        if (compatibilityInteractor.a(BaseApplication.getContext())) {
            g();
            return;
        }
        List<DeviceInfo> listG = fks.d().g();
        if (listG == null) {
            g();
            return;
        }
        if (listG.size() > 0 && CompatibilityInteractor.c(BaseApplication.getContext())) {
            if (compatibilityInteractor.b(listG)) {
                b(compatibilityInteractor, listG);
                return;
            } else {
                g();
                return;
            }
        }
        g();
    }

    private void b(final CompatibilityInteractor compatibilityInteractor, List<DeviceInfo> list) {
        if (compatibilityInteractor.d(list) == null) {
            g();
        } else {
            compatibilityInteractor.b(this.f24098b, null, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0) {
                        AddDeviceIntroActivity.this.g();
                    } else {
                        if (obj == null || !(obj instanceof String) || compatibilityInteractor == null || !"SURE".equals((String) obj)) {
                            return;
                        }
                        CommonUtil.aj(BaseApplication.getContext());
                    }
                }
            });
        }
    }

    private void c(final String str, String str2) {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_device_replace_dialog_title_notification).a(str2).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("AddDeviceIntroActivity", "showReplaceDeviceDialog():Click not to switch the device");
            }
        }).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("AddDeviceIntroActivity", "showReplaceDeviceDialog():Click to agree to switch the device");
                AddDeviceIntroActivity.this.e();
                rcw.b(AddDeviceIntroActivity.this.e).g(str);
                LogUtil.a("AddDeviceIntroActivity", "Clear the upgrade inter data");
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void d(int i, String str, DeviceInfo deviceInfo) {
        rcv rcvVarA = rcv.a(BaseApplication.getContext());
        int productType = deviceInfo.getProductType();
        String deviceName = deviceInfo.getDeviceName();
        String strD = rcvVarA.d(productType);
        if (i == 11 && "HUAWEI CM-R1P".equals(deviceName)) {
            strD = this.e.getString(R.string.IDS_huawei_r1_pro_content);
        }
        String strE = rcvVarA.e(i);
        LogUtil.a("AddDeviceIntroActivity", "new device ", strE, ", old device ", strD);
        if (i == 11 && ("HUAWEI CM-R1P".equals(str) || this.e.getString(R.string.IDS_huawei_r1_pro_content).equals(str) || this.e.getString(R.string.IDS_device_r1_pro_name_title).equals(str))) {
            strE = this.e.getString(R.string.IDS_huawei_r1_pro_content);
        }
        if (deviceName == null || !TextUtils.isEmpty(strD) || !CommonUtil.ca()) {
            deviceName = strD;
        }
        c(deviceInfo.getDeviceIdentify(), String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_replace_device_dialog_content_new), strE, deviceName));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("AddDeviceIntroActivity", "onDestroy");
    }

    static class a extends HealthPagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f24105a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Bitmap> f24106c;
        private List<Integer> d;

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        a(List<Integer> list) {
            this.f24105a = false;
            this.d = list;
        }

        a(List<Bitmap> list, boolean z) {
            this.f24106c = list;
            this.f24105a = z;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getCount() {
            if (this.f24105a) {
                List<Bitmap> list = this.f24106c;
                if (list != null) {
                    return list.size();
                }
                return 0;
            }
            List<Integer> list2 = this.d;
            if (list2 != null) {
                return list2.size();
            }
            return 0;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            ImageView imageView = new ImageView(BaseApplication.getContext());
            if (this.f24105a) {
                List<Bitmap> list = this.f24106c;
                if (list != null) {
                    imageView.setImageBitmap(list.get(i));
                }
            } else {
                List<Integer> list2 = this.d;
                if (list2 != null) {
                    imageView.setImageResource(list2.get(i).intValue());
                }
            }
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (viewGroup instanceof HealthViewPager) {
                ((HealthViewPager) viewGroup).addView(imageView, 0);
            }
            return imageView;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj != null && (obj instanceof ImageView)) {
                ImageView imageView = (ImageView) obj;
                if (viewGroup == null || imageView.getDrawable() == null) {
                    return;
                }
                viewGroup.removeView(imageView);
            }
        }
    }

    private void i() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(this.e.getResources().getString(R.string.IDS_main_device_ota_error_message)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("AddDeviceIntroActivity", "showTipDialog,click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
