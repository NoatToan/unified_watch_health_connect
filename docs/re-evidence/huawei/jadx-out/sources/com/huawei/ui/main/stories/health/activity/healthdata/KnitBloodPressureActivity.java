package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.basichealth.bloodpressure.BloodPressureSyncManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.servicesui.R;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwarkuix.oHBrigdePlugin.health.UICustomizeBridge;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.ui.commonui.bannerlayout.HealthBannerLayout;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.HealthDataInputDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BloodPressureBootPagerHelper;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity;
import com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureButtonProvider;
import com.huawei.ui.main.stories.health.util.BloodPressureUtil;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.template.PopMenuManager;
import com.huawei.ui.main.stories.template.data.IPopMenuItemClick;
import defpackage.buh;
import defpackage.fdm;
import defpackage.ino;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.lua;
import defpackage.njy;
import defpackage.peh;
import defpackage.qhu;
import defpackage.qpx;
import defpackage.qqj;
import defpackage.qre;
import defpackage.qrg;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.utk;
import defpackage.uub;
import defpackage.uwf;
import defpackage.vbw;
import defpackage.vct;
import defpackage.vdo;
import defpackage.wpo;
import defpackage.xkb;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class KnitBloodPressureActivity extends KnitHealthDetailActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f27548c;
    private static int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27549a;
    private LinearLayout d;
    private HealthCardView f;
    private KnitFragment g;
    private long j;
    private HealthBannerLayout k;
    private c n;
    private ViewGroup o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f27550b = BaseApplication.b();
    private String i = null;
    private volatile int h = Integer.MAX_VALUE;

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configNoNetPage() {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int getPageType() {
        return 7;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        qrs.c(this, bundle);
        super.onCreate(bundle);
        this.f27549a = this;
        h();
        this.f = (HealthCardView) findViewById(R.id.knit_measure_toast);
        String strE = buh.e("FIRST_IN_HDK_BLOOD_PRESSURE");
        if (TextUtils.isEmpty(strE) || !"true".equals(strE)) {
            s();
            buh.d("FIRST_IN_HDK_BLOOD_PRESSURE", "true");
        }
        if (!qrg.e(UICustomizeBridge.IS_FIRST_LOGIN_SHOW_DIALOG)) {
            f27548c = qrg.d(UICustomizeBridge.START_TIME);
            e = qrg.b(UICustomizeBridge.SHOW_DIALOG_COUNT);
        }
        o();
        if (njy.e(fdm.d().j())) {
            BloodPressureUtil.i();
        }
        xkb.a(System.currentTimeMillis());
        BloodPressureUtil.c(new BaseResponseCallback<String>() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity.5
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, String str) {
                if (i == -1) {
                    LogUtil.j("KnitBloodPressureActivity", "updOldBloodPressurePlan error ", str);
                }
            }
        });
    }

    private LinearLayout f() {
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(com.huawei.ui.main.R.layout.blood_pressure_bottom_layout, (ViewGroup) null);
        c(linearLayout);
        return linearLayout;
    }

    private void c(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(com.huawei.ui.main.R.id.manual_input_bottom_new_btn);
        LinearLayout linearLayout3 = (LinearLayout) linearLayout.findViewById(com.huawei.ui.main.R.id.timing_measurement_bottom_new_btn);
        ImageView imageView = (ImageView) linearLayout.findViewById(com.huawei.ui.main.R.id.manual_input_icon_img);
        if (LanguageUtil.ba(com.huawei.hwcommonmodel.application.BaseApplication.getContext())) {
            imageView.setScaleX(-1.0f);
        }
        linearLayout2.setClickable(true);
        linearLayout3.setClickable(true);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: uqe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KnitBloodPressureActivity.a(view);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: uqi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        });
    }

    public static /* synthetic */ void a(View view) {
        if (qrs.c(500)) {
            LogUtil.a("KnitBloodPressureActivity", "onClick isFastClick");
        } else {
            BloodPressureButtonProvider.c(1);
            vbw.a(1);
        }
    }

    public /* synthetic */ void e(View view) {
        if (qrs.c(500)) {
            LogUtil.a("KnitBloodPressureActivity", "onClick isFastClick");
        } else {
            g();
        }
    }

    private void g() {
        LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == -1) {
                    LogUtil.a("KnitBloodPressureActivity", "has not login");
                    return;
                }
                HashMap map = new HashMap(16);
                map.put("click", "1");
                map.put("type", 2);
                lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_MORE_2030088.value(), map, 0);
                AppRouter.e(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-data-subpage?h5pro=true&path=bloodPressureSettingNew")).i();
            }
        }, "");
    }

    private boolean i() {
        boolean z = uub.c(this.f27550b) > 0;
        boolean zB = BloodPressureSyncManager.b();
        LogUtil.a("KnitBloodPressureActivity", "hasConnectedBloodPressureDevice isBondedProducts: ", Boolean.valueOf(z), ", isBloodPressureWatch: ", Boolean.valueOf(zB));
        return z || zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (i()) {
            LogUtil.a("KnitBloodPressureActivity", "not to showBloodPressureInputDialog, cause has connected blood pressure device");
            return;
        }
        if (!d(Integer.toString(10053), "BLOOD_PRESSURE_INPUT_DIALOG", 604800000L)) {
            LogUtil.a("KnitBloodPressureActivity", "not to showBloodPressureInputDialog, cause not over one week");
            return;
        }
        HealthDataInputDialog.DataSetFormatter dataSetFormatter = new HealthDataInputDialog.DataSetFormatter() { // from class: uqb
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.DataSetFormatter
            public final String format(int i) {
                return UnitUtil.e(i, 1, 0);
            }
        };
        HealthDataInputDialog.SelectedValueProcessor selectedValueProcessor = new HealthDataInputDialog.SelectedValueProcessor() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity.4
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
            public int process(int i, int i2) {
                return i + i2;
            }

            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
            public String format(int i) {
                return UnitUtil.e(i, 1, 0);
            }
        };
        String string = this.f27549a.getResources().getString(com.huawei.ui.main.R.string.IDS_hw_health_show_healthdata_bloodpress_high);
        String string2 = this.f27549a.getResources().getString(com.huawei.ui.main.R.string.IDS_hw_health_show_healthdata_bloodpress_low);
        String string3 = this.f27549a.getResources().getString(com.huawei.ui.main.R.string.IDS_blood_pressure_input_dialog_sys);
        String string4 = this.f27549a.getResources().getString(com.huawei.ui.main.R.string.IDS_blood_pressure_input_dialog_dia);
        String string5 = this.f27549a.getResources().getString(com.huawei.ui.main.R.string.IDS_device_measure_pressure_value_unit);
        HealthDataInputDialog.e eVarE = new HealthDataInputDialog.e(40, 300, dataSetFormatter, selectedValueProcessor).d(88).c(string).e(string5).e(10);
        HealthDataInputDialog.e eVarE2 = new HealthDataInputDialog.e(30, 200, dataSetFormatter, selectedValueProcessor).d(58).c(string2).e(string5).e(10);
        if (Utils.o()) {
            eVarE.d(string3).b(true);
            eVarE2.d(string4).b(true);
        }
        String string6 = this.f27549a.getResources().getString(com.huawei.ui.main.R.string.IDS_hw_blood_pressure_no_data_input_dialog_title);
        final HealthDataInputDialog healthDataInputDialogA = new HealthDataInputDialog(this).e(ContextCompat.getColor(this.f27549a, com.huawei.ui.main.R.color.blood_pressure_subtab_item_text)).c(string6).b(this.f27549a.getResources().getString(com.huawei.ui.main.R.string.IDS_hw_blood_pressure_no_data_input_dialog_content)).a(eVarE).a(eVarE2);
        if (Utils.o()) {
            healthDataInputDialogA.e(true);
            healthDataInputDialogA.a(false);
        }
        healthDataInputDialogA.d(new HealthDataInputDialog.PositiveBtnClickListener() { // from class: uqf
            @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.PositiveBtnClickListener
            public final void onClick(List list) {
                this.f50463c.d(healthDataInputDialogA, list);
            }
        });
        healthDataInputDialogA.c(new View.OnClickListener() { // from class: uqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50465c.c(healthDataInputDialogA, view);
            }
        });
        healthDataInputDialogA.show();
        a(0);
    }

    public /* synthetic */ void d(final HealthDataInputDialog healthDataInputDialog, final List list) {
        LoginInit.getInstance(this.f27550b).browsingToLogin(new IBaseResponseCallback() { // from class: upz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.d(healthDataInputDialog, list, i, obj);
            }
        }, "");
    }

    public /* synthetic */ void d(HealthDataInputDialog healthDataInputDialog, List list, int i, Object obj) {
        a(2);
        if (i != 0) {
            LogUtil.e("KnitBloodPressureActivity", "input data failed, login failed! errorCode = ", Integer.valueOf(i));
        } else {
            e(healthDataInputDialog, list);
        }
    }

    public /* synthetic */ void c(HealthDataInputDialog healthDataInputDialog, View view) {
        healthDataInputDialog.dismiss();
        a(1);
        m();
    }

    private void a(int i) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("event", Integer.valueOf(i));
        lmf.d().c(this.f27549a, AnalyticsValue.HEATLH_HEALTH_BLOODPRESSURE_NO_DATA_INPUT_2210001.value(), map, 0);
    }

    private void e(HealthDataInputDialog healthDataInputDialog, List<Integer> list) {
        int iIntValue = list.get(0).intValue();
        int iIntValue2 = list.get(1).intValue();
        if (iIntValue < iIntValue2) {
            qpx.b(this.f27550b, com.huawei.ui.main.R.string.IDS_hw_health_show_healthdata_bloodpresserror);
        } else {
            uwf.d().a(System.currentTimeMillis(), new double[]{iIntValue, iIntValue2, 0.0d, 4096.0d}, new ArrayList(), "-1", new d(this));
            healthDataInputDialog.dismiss();
        }
    }

    private boolean d(String str, String str2, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - SharedPreferenceManager.d(str, str2, 0L) <= j) {
            return false;
        }
        SharedPreferenceManager.c(str, str2, jCurrentTimeMillis);
        return true;
    }

    private void m() {
        lsy.a(new Runnable() { // from class: uqj
            @Override // java.lang.Runnable
            public final void run() {
                this.f50466a.b();
            }
        });
    }

    public /* synthetic */ void b() {
        boolean z = a() > 0 || BloodPressureSyncManager.b();
        if (Utils.o() || z || getPageState() == 0) {
            return;
        }
        new BloodPressureBootPagerHelper(this.f27550b).showBootPage(this.d);
    }

    private void o() {
        List<DeviceBenefitQueryParam> listD = qhu.d("KnitBloodPressureActivity", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL);
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi != null) {
            payApi.getAllDeviceBenefits(listD, new a(this));
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<KnitBloodPressureActivity> f27560b;

        d(KnitBloodPressureActivity knitBloodPressureActivity) {
            this.f27560b = new WeakReference<>(knitBloodPressureActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("KnitBloodPressureActivity", "InsertBloodPressureDataCallback onResponse errorCode ", Integer.valueOf(i), " object ", obj);
            boolean z = i == 0;
            if (z) {
                HashMap map = new HashMap(16);
                map.put("click", String.valueOf(1));
                map.put("type", "2");
                map.put("from", 4);
                lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_INPUT_2030027.value(), map, 0);
            }
            KnitBloodPressureActivity knitBloodPressureActivity = this.f27560b.get();
            if (knitBloodPressureActivity != null && !knitBloodPressureActivity.isFinishing() && !knitBloodPressureActivity.isDestroyed()) {
                if (z) {
                    e(knitBloodPressureActivity);
                }
                utk.d(knitBloodPressureActivity.n);
                return;
            }
            ReleaseLogUtil.d("R_KnitBloodPressureActivity", "InsertBloodPressureDataCallback onResponse activity ", knitBloodPressureActivity);
        }

        private void e(final KnitBloodPressureActivity knitBloodPressureActivity) {
            HandlerExecutor.b(new Runnable() { // from class: uqk
                @Override // java.lang.Runnable
                public final void run() {
                    KnitBloodPressureActivity.d.d(knitBloodPressureActivity);
                }
            });
        }

        public static /* synthetic */ void d(KnitBloodPressureActivity knitBloodPressureActivity) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(knitBloodPressureActivity);
            builder.b(com.huawei.ui.main.R.string.IDS_blood_pressure_input_success).d(com.huawei.ui.main.R.string.IDS_common_notification_know_tips, com.huawei.ui.main.R.color.blood_pressure_subtab_item_text, new View.OnClickListener() { // from class: uqn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReleaseLogUtil.c("R_KnitBloodPressureActivity", "InsertBloodPressureDataCallback showInputSuccessDialog onClick know button");
                }
            });
            builder.c().show();
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements IBaseResponseCallback {
        private final WeakReference<KnitBloodPressureActivity> d;

        a(KnitBloodPressureActivity knitBloodPressureActivity) {
            this.d = new WeakReference<>(knitBloodPressureActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("KnitBloodPressureActivity", "EquityDialogCallBack onResponse errorCode ", Integer.valueOf(i), " object ", obj);
            KnitBloodPressureActivity knitBloodPressureActivity = this.d.get();
            if (knitBloodPressureActivity == null || knitBloodPressureActivity.isFinishing() || knitBloodPressureActivity.isDestroyed()) {
                ReleaseLogUtil.d("R_KnitBloodPressureActivity", "EquityDialogCallBack onResponse activity ", knitBloodPressureActivity);
            } else if (i == 0) {
                vct.b(obj, knitBloodPressureActivity, 2, KnitBloodPressureActivity.f27548c, KnitBloodPressureActivity.e);
            }
        }
    }

    private void s() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(7);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncDataArea(1);
        HiHealthNativeApi.a(this.f27550b).synCloud(hiSyncOption, null);
    }

    private void h() {
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getStringExtra("healthdata") != null) {
                this.i = intent.getStringExtra("healthdata");
            }
            boolean booleanExtra = intent.getBooleanExtra("refreshCard", false);
            LogUtil.a("KnitBloodPressureActivity", "mIsRefreshCard = ", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                qqj.a(this.f27549a, 8);
            }
            int intExtra = intent.getIntExtra("biMessageType", 0);
            if (intExtra != 0) {
                d(intExtra);
            }
        }
    }

    private void d(int i) {
        String strValue = AnalyticsValue.HEATLH_HEALTH_BLOODPRESSURE_MESSAGE_CLICK_2210004.value();
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(this.f27550b, strValue, map, 0);
        String strValue2 = AnalyticsValue.HEALTH_HOME_BLOOD_PRESSURE_DETAIL_2010025.value();
        HashMap map2 = new HashMap(2);
        map2.put("click", 1);
        map2.put("from", "5");
        lmf.d().c(this.f27550b, strValue2, map2, 0);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            d();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public DataInfos getSubPageDataInfos(int i) {
        if (i == 0) {
            return DataInfos.BloodPressureDayDetail;
        }
        if (i == 1) {
            return DataInfos.BloodPressureWeekDetail;
        }
        if (i == 2) {
            return DataInfos.BloodPressureMonthDetail;
        }
        return DataInfos.NoDataPlaceHolder;
    }

    private void d() {
        if ("MyHealthData".equals(this.i)) {
            LogUtil.a("KnitBloodPressureActivity", "onBackPressed jumpToDeviceActivity is Success");
            Intent intent = new Intent();
            intent.setPackage(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
            intent.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage(), "com.huawei.health.device.ui.DeviceMainActivity");
            intent.putExtra("kind", "HDK_UNKNOWN");
            intent.putExtra("view", "ListDevice");
            startActivity(intent);
        }
        finish();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public Fragment onCreateEmptyFragment(KnitSubPageConfig knitSubPageConfig) {
        if (knitSubPageConfig == null) {
            this.g = null;
        } else {
            this.g = KnitFragment.newInstance(peh.c(knitSubPageConfig), getResTrigger(getPageType(), knitSubPageConfig.getResPosId(), false).setExtra(new Bundle()));
        }
        return this.g;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public String getLogTag() {
        return "KnitBloodPressureActivity";
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.j = System.currentTimeMillis();
        utk.d(this.n);
        ino.e(this.f27549a);
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity.2
            @Override // java.lang.Runnable
            public void run() {
                ObserverManagerUtil.e("HOME_FRAGMENT_ACTIVITY_FOR_RESULT", "FunctionSetBloodPressureReader");
            }
        }, 1000L);
        super.onResume();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int configSubTabStyle() {
        return com.huawei.ui.main.R.layout.knit_sub_tab_widget_blood_pressure;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configTitleBar(final CustomTitleBar customTitleBar) {
        customTitleBar.setTitleText(getString(com.huawei.ui.main.R.string.IDS_hw_show_main_home_page_bloodpressure));
        customTitleBar.setRightButtonDrawable(ContextCompat.getDrawable(this, com.huawei.ui.main.R.drawable.ic_more_normal_black), qre.f(com.huawei.ui.main.R.string.accessibility_more_item));
        customTitleBar.setRightButtonClickable(true);
        customTitleBar.setRightButtonVisibility(0);
        final PopMenuManager popMenuManager = new PopMenuManager() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.ui.main.stories.template.PopMenuManager
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomTitleBar getTitleBar() {
                return customTitleBar;
            }

            @Override // com.huawei.ui.main.stories.template.IMenuItemManager
            public List<wpo> getMenuItemList() {
                return KnitBloodPressureActivity.this.j();
            }
        };
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: uqg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popMenuManager.showPopMenu();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<wpo> j() {
        wpo wpoVar = new wpo(getResources().getString(com.huawei.ui.main.R.string.IDS_privacy_all_data), new IPopMenuItemClick() { // from class: uqa
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public final void onItemClick() {
                this.f50460a.k();
            }
        });
        wpo wpoVar2 = new wpo(getResources().getString(com.huawei.ui.main.R.string.IDS_fitness_core_sleep_explain_title), new IPopMenuItemClick() { // from class: uqc
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public final void onItemClick() {
                this.f50461a.l();
            }
        });
        ArrayList<wpo> arrayList = new ArrayList<>();
        arrayList.add(wpoVar);
        arrayList.add(wpoVar2);
        return arrayList;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configToolBar(HealthToolBar healthToolBar) {
        LogUtil.a("KnitBloodPressureActivity", "configToolBar");
        int iB = vdo.b(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), 52.0f);
        LinearLayout linearLayoutF = f();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.knit_detail_layout);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) healthToolBar.getLayoutParams();
        layoutParams.height = iB;
        linearLayoutF.setId(healthToolBar.getId());
        linearLayoutF.setLayoutParams(layoutParams);
        relativeLayout.removeView(healthToolBar);
        relativeLayout.addView(linearLayoutF);
        setMinibarBottomMargin(iB);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configExtraView(LinearLayout linearLayout) {
        this.d = linearLayout;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public boolean getExtra(Bundle bundle) {
        LogUtil.a("KnitBloodPressureActivity", "getExtra");
        Intent intent = getIntent();
        this.n = new c(this, bundle);
        if (intent != null) {
            long longExtra = intent.getLongExtra("key_bundle_health_last_data_time", 0L);
            bundle.putLong("key_bundle_health_last_data_time", longExtra);
            LogUtil.a("KnitBloodPressureActivity", "read last data time from database,mLastTimestamp=", Long.valueOf(longExtra));
            if (longExtra == 0) {
                LogUtil.a("KnitBloodPressureActivity", "lastTimestamp is 0");
                return false;
            }
            if (longExtra > 0) {
                LogUtil.a("KnitBloodPressureActivity", "lastTimestamp: " + longExtra);
                bundle.putLong("key_bundle_health_last_data_time", longExtra);
                return true;
            }
            LogUtil.a("KnitBloodPressureActivity", "lastTimestamp is less than 0");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", 1);
        lmf.d().c(this.f27549a, AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_MORE_2030088.value(), map, 0);
        try {
            this.f27549a.startActivity(new Intent(this.f27549a, (Class<?>) BloodPressureDescriptionActivity.class));
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("KnitBloodPressureActivity", "ActivityNotFoundException", e2.getMessage());
        }
    }

    private int a() {
        int i = 0;
        try {
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = openOrCreateDatabase("device.db", 0, null);
            try {
                Cursor cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query("device", new String[]{"productId"}, "kind = 'HDK_BLOOD_PRESSURE'", null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        i++;
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                }
                return i;
            } catch (Throwable th3) {
                if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                    try {
                        sQLiteDatabaseOpenOrCreateDatabase.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (SQLException unused) {
            LogUtil.e("KnitBloodPressureActivity", "getBondedProducts SQLException");
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        c(AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_MORE_2030088.value());
        PrivacyDataModelActivity.b(this, new PageModelArgs(107, "PrivacyDataConstructor", 3, 3));
    }

    private void c(String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", 3);
        lmf.d().c(this.f27550b, str, map, 0);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<KnitBloodPressureActivity> f27555a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f27556c;

        public c(KnitBloodPressureActivity knitBloodPressureActivity, Bundle bundle) {
            this.f27555a = new WeakReference<>(knitBloodPressureActivity);
            this.f27556c = bundle;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001f  */
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            final KnitBloodPressureActivity knitBloodPressureActivity;
            final boolean z;
            if ((obj instanceof List) && (knitBloodPressureActivity = this.f27555a.get()) != null) {
                final List list = (List) obj;
                if (!njy.e(list)) {
                    z = list.get(0) == null;
                }
                LogUtil.a("KnitBloodPressureActivity", "isDataEmpty: ", Boolean.valueOf(z));
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.b(z, knitBloodPressureActivity, list);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(boolean z, KnitBloodPressureActivity knitBloodPressureActivity, List<HiHealthData> list) {
            if (!z) {
                LogUtil.a("KnitBloodPressureActivity", "show data");
                knitBloodPressureActivity.hideEmptyFragment();
                knitBloodPressureActivity.showNonEmptyFragment();
                knitBloodPressureActivity.refreshTitleBar(true);
                knitBloodPressureActivity.showToast();
                SharedPreferenceManager.c(Integer.toString(30002), "last_open_data_start_time", list.get(0).getStartTime());
                lua.d("BloodPressure", "has_new_data", false);
            } else {
                knitBloodPressureActivity.showEmptyFragment();
                knitBloodPressureActivity.hideNonEmptyFragment();
                knitBloodPressureActivity.refreshTitleBar(false);
                knitBloodPressureActivity.n();
            }
            if (this.f27556c == null || !njy.c(list, 0) || this.f27556c.getLong("key_bundle_health_last_data_time") != 0) {
                LogUtil.a("KnitBloodPressureActivity", "configHealthDetailActivity");
                knitBloodPressureActivity.configHealthDetailActivity();
            } else {
                LogUtil.a("KnitBloodPressureActivity", "reset start time");
                this.f27556c.putLong("key_bundle_health_last_data_time", list.get(0).getStartTime());
                knitBloodPressureActivity.onBundleArrived(this.f27556c);
            }
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        this.j = System.currentTimeMillis();
        super.onStart();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configureNoDataToast(ViewGroup viewGroup) {
        this.o = viewGroup;
        if (this.f == null || viewGroup == null || !this.mIsNoDataFragment) {
            LogUtil.a("KnitBloodPressureActivity", "mHealthCardView or container is null");
            return;
        }
        this.f.removeView(this.k);
        HealthBannerLayout healthBannerLayout = this.k;
        if (healthBannerLayout == null) {
            LogUtil.a("KnitBloodPressureActivity", "configureNoDataToast mToastView is null");
            return;
        }
        if (healthBannerLayout.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.k.getParent()).removeView(this.k);
        }
        qsp.c((View) this.f, 8);
        this.o.removeAllViews();
        this.o.addView(this.k);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void showToast() {
        if (this.f == null || this.k == null || this.mIsNoDataFragment) {
            LogUtil.a("KnitBloodPressureActivity", "mHealthCardView or mToastView is null");
            return;
        }
        if (this.k.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.k.getParent()).removeView(this.k);
        }
        qsp.c((View) this.f, 0);
        this.f.addView(this.k);
        this.o = null;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void onKnitPageSelected(int i) {
        super.onKnitPageSelected(i);
        c(i);
    }

    private void c(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(this.f27550b, AnalyticsValue.HEALTH_HEALTH_BLOODPRESS_SELECT_PAGE_2040120.value(), map, 0);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
