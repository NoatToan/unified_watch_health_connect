package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.amap.api.services.district.DistrictSearchQuery;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.health.sport.utils.RunPopularRoutesUtil;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteConstants;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteLocationHelper;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.fragment.RunningRouteListFragment;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.Manger.RouteDataStorageManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.model.ICityLatLonCallBack;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.buh;
import defpackage.fxl;
import defpackage.gch;
import defpackage.gcy;
import defpackage.gdc;
import defpackage.gdj;
import defpackage.jct;
import defpackage.jdn;
import defpackage.jdo;
import defpackage.jpg;
import defpackage.jxb;
import defpackage.lmf;
import defpackage.npn;
import defpackage.qol;
import defpackage.qon;
import defpackage.qpn;
import defpackage.qqt;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RunningRouteListActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f10859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f10860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f10861c;
    private HotPathCityInfo d;
    private TextView e;
    private boolean f;
    private boolean g;
    private RunningRouteListFragment h;
    private boolean i;
    private boolean j = true;
    private boolean k;
    private ViewGroup l;
    private RunningRouteListFragment m;
    private boolean n;
    private RunningRouteLocationHelper o;
    private HealthSubTabWidget p;
    private int q;
    private qpn r;
    private LinearLayout s;
    private int t;
    private CustomTitleBar u;
    private HealthViewPager y;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_running_route_list);
        clearBackgroundDrawable();
        m();
        t();
        s();
        o();
        if (this.n) {
            this.q = 1;
        }
        q();
        r();
        k();
    }

    private void o() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("Sport_RunningPathListActivity", "intent is null");
            return;
        }
        Uri uriB = AppRouterUtils.b(intent);
        if (uriB == null || uriB.isOpaque()) {
            LogUtil.j("Sport_RunningPathListActivity", "uri is invalid");
        } else {
            this.q = CommonUtils.j(uriB.getQueryParameter("pathClass"));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    private void b() {
        if (this.l.getVisibility() == 0) {
            this.l.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        this.l.setVisibility(0);
    }

    private void m() {
        this.n = Utils.o();
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(com.huawei.health.servicesui.R.id.title_bar);
        this.u = customTitleBar;
        if (!this.n) {
            customTitleBar.setRightThirdKeyVisibility(8);
            this.u.setRightThirdKeyBackground(ContextCompat.getDrawable(this, R.drawable.search_bar_icon), qre.f(R.string.IDS_global_search_button));
            this.u.setRightThirdKeyOnClickListener(new View.OnClickListener() { // from class: jju
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38678a.d(view);
                }
            });
            this.u.setRightSoftkeyVisibility(0);
            this.u.setRightSoftkeyBackground(ContextCompat.getDrawable(this, R.drawable.ic_running_route_list_map_bg), qre.f(R.string.accessibility_choose_map));
            this.u.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: jkd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.b(view);
                }
            });
        }
        this.u.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.u.setRightButtonClickable(true);
        this.u.setRightButtonVisibility(0);
        this.u.setRightButtonOnClickListener(new View.OnClickListener() { // from class: jkb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        });
        this.u.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: jka
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38681b.c(view);
            }
        });
        this.u.getViewTitle().setBackgroundResource(R.drawable.hwspinner_selector_background_emui);
        this.u.getViewTitle().setOnClickListener(new View.OnClickListener() { // from class: jjz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        this.u.getViewTitle().setGravity(16);
        this.u.setTitleText(getString(R.string.IDS_track_runing_route_location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        if (p()) {
            LogUtil.a("Sport_RunningPathListActivity", "third key click too fast");
            return;
        }
        Intent intent = new Intent(this, (Class<?>) RunningRouteLocationSearchActivity.class);
        intent.putExtra(DistrictSearchQuery.KEYWORDS_CITY, jdn.a() == null ? "" : jdn.a().getCityName());
        startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        jdo.d();
        Intent intent = new Intent(this, (Class<?>) ClockingRankActivity.class);
        intent.putExtra("IS_SHOW_PATH_DETAIL", false);
        intent.putExtra("pathClass", this.q);
        intent.putExtra("ENTRANCE_ACTIVITY", 1);
        intent.putExtra("ROUTE_INFO", i());
        startActivityForResult(intent, 1000);
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        d(this.u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        if (p()) {
            LogUtil.a("Sport_RunningPathListActivity", "mTitleBar click too fast");
        } else {
            RunningCitysActivity.a(this, jdn.a(), 0);
        }
    }

    private void t() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.marketing_layout);
        this.s = linearLayout;
        linearLayout.setVisibility(8);
        fxl.e(this, this.s, 1016);
    }

    private void s() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.route_card_layout);
        linearLayout.setVisibility(0);
        HealthCardView healthCardView = (HealthCardView) findViewById(R.id.hw_running_route_import_routes);
        healthCardView.setOnClickListener(new View.OnClickListener() { // from class: jjw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.h(view);
            }
        });
        if (this.n) {
            findViewById(R.id.running_route_history_routes_layout).setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.bottomMargin = qrs.d((Context) this, 16.0f);
            linearLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) healthCardView.getLayoutParams();
            layoutParams2.setMarginEnd(qrs.d((Context) this, 12.0f));
            healthCardView.setLayoutParams(layoutParams2);
            return;
        }
        ((HealthCardView) findViewById(R.id.hw_running_route_history_routes)).setOnClickListener(new View.OnClickListener() { // from class: jjv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38679a.i(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        if (p()) {
            LogUtil.a("Sport_RunningPathListActivity", "importRoutesCardView click too fast");
        } else {
            ab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        if (p()) {
            LogUtil.a("Sport_RunningPathListActivity", "historyRoutesCardView click too fast");
        } else {
            ac();
        }
    }

    private void r() {
        this.l = (ViewGroup) findViewById(R.id.loading_layout);
        this.f10861c = (ViewGroup) findViewById(R.id.common_no_data_layout);
        ImageView imageView = (ImageView) findViewById(R.id.common_no_data_img);
        this.f10860b = imageView;
        imageView.setImageTintList(null);
        this.e = (TextView) findViewById(R.id.common_no_data_text);
        HealthButton healthButton = (HealthButton) findViewById(R.id.common_no_data_btn);
        this.f10859a = healthButton;
        healthButton.setText(R.string.IDS_track_runing_route_enable_location);
        this.f10859a.setOnClickListener(new View.OnClickListener() { // from class: jkc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38682a.g(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        qrs.al(BaseApplication.b());
        this.k = true;
    }

    private void q() {
        this.p = (HealthSubTabWidget) findViewById(R.id.hw_running_route_type);
        this.y = (HealthViewPager) findViewById(R.id.hw_route_list_viewpage);
        this.r = new qpn(this, this.y, this.p);
        if (!this.n) {
            this.p.setVisibility(0);
            RunningRouteListFragment runningRouteListFragment = new RunningRouteListFragment();
            this.m = runningRouteListFragment;
            runningRouteListFragment.e(0);
            this.m.d(e());
            this.r.b(this.p.b(qre.i(R.string.IDS_hw_show_sport_routes_string)), this.m, this.q == 0);
        }
        RunningRouteListFragment runningRouteListFragment2 = new RunningRouteListFragment();
        this.h = runningRouteListFragment2;
        runningRouteListFragment2.e(1);
        this.h.d(e());
        this.r.b(this.p.b(qre.i(R.string.IDS_track_route_draw_sport_graffiti)), this.h, this.q == 1);
        this.y.setOffscreenPageLimit(1);
        this.y.addOnPageChangeListener(new HwViewPager.OnPageChangeListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteListActivity.2
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (!RunningRouteListActivity.this.n) {
                    if (i == 1) {
                        RunningRouteListActivity.this.q = 1;
                    } else {
                        RunningRouteListActivity.this.q = 0;
                    }
                }
                ReleaseLogUtil.d("Sport_RunningPathListActivity", "onPageSelected mPathClass is ", Integer.valueOf(RunningRouteListActivity.this.q));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        RunningRouteListFragment runningRouteListFragment = this.m;
        if (runningRouteListFragment != null) {
            runningRouteListFragment.a();
        }
        RunningRouteListFragment runningRouteListFragment2 = this.h;
        if (runningRouteListFragment2 != null) {
            runningRouteListFragment2.a();
        }
        jdn.b(RunningRouteConstants.BiFromActivity.INVALID.getIndex());
    }

    private jct i() {
        Fragment item = this.r.getItem(this.y.getCurrentItem());
        if (item instanceof RunningRouteListFragment) {
            return ((RunningRouteListFragment) item).b();
        }
        ReleaseLogUtil.e("Sport_RunningPathListActivity", "currentFrag is null");
        return new jct(this.q);
    }

    private RunningRouteListFragment.HotPathListCallBack e() {
        return new RunningRouteListFragment.HotPathListCallBack() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteListActivity.3
            @Override // com.huawei.healthcloud.plugintrack.ui.fragment.RunningRouteListFragment.HotPathListCallBack
            public void onError(int i, String str) {
                RunningRouteListActivity.this.c(0);
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.fragment.RunningRouteListFragment.HotPathListCallBack
            public void onSuccess(gdj gdjVar) {
                RunningRouteListActivity.this.t = gdjVar.d();
                RunningRouteListActivity runningRouteListActivity = RunningRouteListActivity.this;
                runningRouteListActivity.c(runningRouteListActivity.t);
                RunningRouteListActivity.this.j();
            }
        };
    }

    private void k() {
        jdn.a(this.q);
        RunPopularRoutesUtil.e(this, -1, new RunPopularRoutesUtil.DialogCallBack() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteListActivity.5
            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void goNext() {
            }

            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void notGoNext() {
                RunningRouteListActivity.this.finish();
            }
        });
        this.f = h();
        this.o = new RunningRouteLocationHelper();
        if (getIntent() == null) {
            return;
        }
        HotPathCityInfo hotPathCityInfo = (HotPathCityInfo) getIntent().getParcelableExtra("RUNNING_PATH_CITY_INFO");
        if (hotPathCityInfo != null) {
            jdn.c(hotPathCityInfo);
        }
        this.i = getIntent().getBooleanExtra("IS_FROM_DEEPLINK", false);
        if (jdn.a() == null) {
            jdn.c(g());
        }
    }

    private HotPathCityInfo g() {
        String strE = buh.e("RUNNING_PATH_CITY_INFO");
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return (HotPathCityInfo) qqt.e(strE, HotPathCityInfo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        j();
        this.u.setTitleText(jdn.a().getCityName());
        if (jdn.a().getCityId() == null || jdn.a().getCityId().equals("INVALIDE_CITY_ID")) {
            RunningRouteListFragment runningRouteListFragment = this.m;
            if (runningRouteListFragment != null) {
                runningRouteListFragment.c();
            }
            f();
            return;
        }
        this.s.setVisibility(0);
        b();
    }

    private boolean d() {
        if (npn.c(BaseApplication.b())) {
            return false;
        }
        RunningRouteUtils.a(2, "PositioningFailed");
        if (jdn.a() == null) {
            return false;
        }
        af();
        n();
        return true;
    }

    private void c() {
        if (PermissionUtil.e(this, PermissionUtil.PermissionType.LOCATION) != PermissionUtil.PermissionResult.GRANTED) {
            if (jdn.a() != null) {
                af();
                n();
            }
            PermissionUtil.d(this, PermissionUtil.PermissionType.LOCATION, new e());
            return;
        }
        if (d()) {
            return;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (jdn.a() != null) {
            LogUtil.a("Sport_RunningPathListActivity", "onRequestPermissionsResult mCityInfo != null");
        } else {
            w();
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class c extends UiCallback<gdc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<RunningRouteListActivity> f10868a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f10869c;

        c(RunningRouteListActivity runningRouteListActivity, long j) {
            this.f10868a = new WeakReference<>(runningRouteListActivity);
            this.f10869c = j;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            RunningRouteListActivity runningRouteListActivity = this.f10868a.get();
            if (runningRouteListActivity == null) {
                LogUtil.a("Sport_RunningPathListActivity", "LocationUiCallback onFailure activity == null");
                return;
            }
            ReleaseLogUtil.d("Sport_RunningPathListActivity", "getCityInfoWithGps onFailure", Integer.valueOf(i), " info: ", str);
            if (i == -2) {
                runningRouteListActivity.e(runningRouteListActivity.getString(R.string.IDS_track_runing_route_failed_obtain_location));
            } else {
                runningRouteListActivity.e(R.drawable.pic_no_line_available, R.string.IDS_track_runing_route_failed_obtain_location);
            }
            if (runningRouteListActivity.o.isLocationFailed(i)) {
                RunningRouteUtils.a(2, "PositioningFailed");
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gdc gdcVar) {
            RunningRouteListActivity runningRouteListActivity = this.f10868a.get();
            if (runningRouteListActivity == null) {
                LogUtil.a("Sport_RunningPathListActivity", "LocationUiCallback onSuccess activity == null");
                return;
            }
            RunningRouteUtils.e(1001, SystemClock.elapsedRealtime() - this.f10869c);
            RunningRouteUtils.b(gdcVar.c());
            HotPathCityInfo hotPathCityInfoA = gdcVar.a();
            if (hotPathCityInfoA != null) {
                LogUtil.a("Sport_RunningPathListActivity", "getCityInfoWithGps onSuccess cityInfo ", hotPathCityInfoA);
                if (!runningRouteListActivity.i || jdn.a() == null) {
                    LogUtil.a("Sport_RunningPathListActivity", "cityInfo is changed");
                    jdn.c(hotPathCityInfoA);
                }
                runningRouteListActivity.af();
                buh.d("RUNNING_PATH_CITY_INFO", qqt.b(jdn.a()));
                runningRouteListActivity.n();
                return;
            }
            LogUtil.a("Sport_RunningPathListActivity", "getCityInfoWithGps onSuccess current city not support");
            HotPathCityInfo hotPathCityInfo = runningRouteListActivity.d;
            if (hotPathCityInfo != null) {
                if (jdn.a() == null || TextUtils.isEmpty(jdn.a().getCityName())) {
                    jdn.c(hotPathCityInfo);
                }
                String cityName = hotPathCityInfo.getCityName();
                if (!TextUtils.isEmpty(cityName)) {
                    runningRouteListActivity.u.setTitleText(cityName);
                }
                buh.d("RUNNING_PATH_CITY_INFO", qqt.b(jdn.a()));
            }
            runningRouteListActivity.c(0);
            if (!runningRouteListActivity.h()) {
                ReleaseLogUtil.e("Sport_RunningPathListActivity", "initCityInfoWithGpsRspUiCallback: no network");
                runningRouteListActivity.z();
            } else {
                ReleaseLogUtil.e("Sport_RunningPathListActivity", "current city not support");
                runningRouteListActivity.u();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (jdn.b() == RunningRouteConstants.BiFromActivity.INVALID.getIndex()) {
            LogUtil.a("Sport_RunningPathListActivity", "jumpToListType is invalid, no bi");
            return;
        }
        if (!this.j || i <= 0) {
            return;
        }
        this.j = false;
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", Integer.valueOf(jdn.b()));
        map.put("sportPage", 258);
        map.put("routeNum", Integer.valueOf(i));
        lmf.d().c(BaseApplication.b(), "1040077", map, 0);
    }

    private void f() {
        if (jdn.a() == null || jdn.a().getCityCenter() == null) {
            return;
        }
        LogUtil.a("Sport_RunningPathListActivity", "getLocationWithGps begin");
        gch.b().getCityInfoWithGps(new gcy.e().a(jdn.a().getCityCenter().getLatitude()).c(jdn.a().getCityCenter().getLongitude()).e(), new c(this, SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.o.getLocation(null, new a(this), new c(this, SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class a implements ICityLatLonCallBack {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<RunningRouteListActivity> f10866b;

        a(RunningRouteListActivity runningRouteListActivity) {
            this.f10866b = new WeakReference<>(runningRouteListActivity);
        }

        @Override // com.huawei.ui.commonui.model.ICityLatLonCallBack
        public void onPointBack(qon qonVar) {
            RunningRouteListActivity runningRouteListActivity = this.f10866b.get();
            if (runningRouteListActivity == null || qonVar == null || qonVar.a() == null) {
                return;
            }
            qol qolVarA = qonVar.a();
            RunningRouteUtils.a(2, (String) null);
            runningRouteListActivity.d = new HotPathCityInfo();
            runningRouteListActivity.d.setCityName(qonVar.c());
            runningRouteListActivity.d.setCityId("INVALIDE_CITY_ID");
            runningRouteListActivity.d.setCityCenter(new GpsPoint(qolVarA.e, qolVarA.f46564b));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        RunningRouteListFragment runningRouteListFragment = this.m;
        if (runningRouteListFragment != null) {
            runningRouteListFragment.onActivityResult(i, i2, intent);
        }
        RunningRouteListFragment runningRouteListFragment2 = this.h;
        if (runningRouteListFragment2 != null) {
            runningRouteListFragment2.onActivityResult(i, i2, intent);
        }
        if (i == 0 && i2 == -1) {
            v();
            return;
        }
        Intent intent2 = getIntent();
        if (intent2 == null) {
            LogUtil.j("Sport_RunningPathListActivity", "intent is null");
            return;
        }
        if (i != 1000) {
            if (i != 1 || i2 != -1) {
                LogUtil.a("Sport_RunningPathListActivity", "onActivityResult");
                return;
            } else {
                d(intent2);
                return;
            }
        }
        LogUtil.a("Sport_RunningPathListActivity", "jump from running route map");
        if (intent2.getBooleanExtra("IS_RETURN_TO_BEFORE_ACTIVITY", false)) {
            finish();
            overridePendingTransition(0, 0);
        } else if (!h()) {
            ReleaseLogUtil.e("Sport_RunningPathListActivity", "onActivityResult: no network");
            z();
        } else if (jdn.a() != null) {
            LogUtil.a("Sport_RunningPathListActivity", "onActivityResult doFilter");
            e(jdn.a());
        }
    }

    private void v() {
        HotPathCityInfo hotPathCityInfoA = jdn.a();
        if (hotPathCityInfoA == null) {
            return;
        }
        e(hotPathCityInfoA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HotPathCityInfo hotPathCityInfo) {
        jdn.c(hotPathCityInfo);
        af();
        buh.d("RUNNING_PATH_CITY_INFO", qqt.b(jdn.a()));
    }

    private void d(CustomTitleBar customTitleBar) {
        ArrayList arrayList = new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_track_runing_route_explain)));
        if (!this.n) {
            arrayList.add(getResources().getString(R.string.IDS_hw_routes_auto_punch_route));
            if (RunningRouteUtils.i()) {
                arrayList.add(File.separator);
                arrayList.add(getResources().getString(R.string.IDS_hw_routes_auto_punch_route));
            }
        }
        jdo.d(0);
        new PopViewList(this, customTitleBar, arrayList).b(new PopViewList.PopViewClickListener() { // from class: jjx
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.f38680b.d(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        if (i == 0) {
            jxb.e();
            jdo.d(1);
            ad();
            return;
        }
        aa();
    }

    private void aa() {
        Intent intent = new Intent();
        intent.setClassName(this, "com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity");
        intent.putExtra("currentSportType", 258);
        startActivity(intent);
    }

    private void ac() {
        Intent intent = new Intent(this, (Class<?>) HistoricalRoutesActivity.class);
        intent.putExtra("from", 1);
        startActivity(intent);
    }

    private void ad() {
        startActivity(new Intent(this, (Class<?>) RunningRouteIntroductionActivity.class));
    }

    private void ab() {
        Intent intent = new Intent();
        intent.setClassName(this, RouteDataStorageManager.ACTIVITY_MY_ROUTE);
        startActivity(intent);
    }

    private void d(Intent intent) {
        LogUtil.a("Sport_RunningPathListActivity", "jump to search page from running route list");
        String stringExtra = intent.getStringExtra("SEARCH_JUMP_CITY_INFO");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        HotPathCityInfo hotPathCityInfo = (HotPathCityInfo) qqt.e(stringExtra, HotPathCityInfo.class);
        LogUtil.a("Sport_RunningPathListActivity", "cityInfo = ", hotPathCityInfo);
        if (hotPathCityInfo == null) {
            LogUtil.a("Sport_RunningPathListActivity", "onActivityResult, error city info");
            return;
        }
        jdn.d(true);
        jpg jpgVar = new jpg(hotPathCityInfo.getCityCenter().getLatitude(), hotPathCityInfo.getCityCenter().getLongitude());
        jdn.c(jpgVar);
        gch.b().getCityInfoWithGps(new gcy.e().a(jpgVar.d).c(jpgVar.f38787a).e(), new b(this));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("Sport_RunningPathListActivity", "onResume: mIsInit = ", Boolean.valueOf(this.g), ", mHasNetWork = ", Boolean.valueOf(this.f), ", mIsStartAppSetting = ", Boolean.valueOf(this.k));
        if (jdn.b() == 3 || jdn.b() == 4) {
            this.j = true;
            c(this.t);
        }
        if (!this.g) {
            if (this.f) {
                l();
            } else {
                z();
            }
            this.g = true;
            return;
        }
        if (!this.f && h()) {
            l();
            this.f = true;
        } else if (this.k) {
            this.k = false;
            if (PermissionUtil.e(this, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED) {
                y();
                a();
            }
        }
    }

    private void l() {
        y();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return CommonUtil.ab(BaseApplication.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        b(i, getString(i2));
    }

    private void b(int i, String str) {
        b();
        this.f10861c.setVisibility(0);
        this.f10860b.setImageResource(i);
        this.e.setText(str);
        this.f10859a.setVisibility(8);
        this.f10861c.setOnClickListener(null);
    }

    private void w() {
        e(R.drawable.pic_no_location_available, R.string.IDS_track_runing_route_failed_obtain_location);
        this.f10859a.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        e(R.drawable.net_error, R.string.IDS_network_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        e(R.drawable.pic_no_line_available, R.string.IDS_track_runing_route_city_not_support);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        b(R.drawable.net_error, str);
        this.f10861c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.RunningRouteListActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunningRouteListActivity.this.j();
                RunningRouteListActivity.this.y();
                RunningRouteListActivity.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f10861c.setVisibility(8);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        GolfGetLocation.getInstance().unRegisterLocationListener();
        buh.d("RUNNING_PATH_CITY_INFO", qqt.b(this.d));
        super.onDestroy();
    }

    private boolean p() {
        return qrs.c(500);
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class b extends UiCallback<gdc> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<RunningRouteListActivity> f10867c;

        public b(RunningRouteListActivity runningRouteListActivity) {
            this.f10867c = new WeakReference<>(runningRouteListActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Sport_RunningPathListActivity", "getCityInfoWithGps failed: errorInfo = ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gdc gdcVar) {
            RunningRouteListActivity runningRouteListActivity = this.f10867c.get();
            if (runningRouteListActivity == null || runningRouteListActivity.isFinishing()) {
                LogUtil.j("Sport_RunningPathListActivity", "getCityInfoWithGps is finishing");
            } else if (gdcVar == null || gdcVar.e() == null) {
                LogUtil.a("Sport_RunningPathListActivity", "invalid city id");
            } else {
                runningRouteListActivity.e(gdcVar.e());
            }
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class e extends CustomPermissionAction {
        private final WeakReference<RunningRouteListActivity> e;

        private e(RunningRouteListActivity runningRouteListActivity) {
            super(runningRouteListActivity);
            this.e = new WeakReference<>(runningRouteListActivity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("Sport_RunningPathListActivity", "onRequestPermissionsResult getLocation");
            RunningRouteListActivity runningRouteListActivity = this.e.get();
            if (runningRouteListActivity == null) {
                ReleaseLogUtil.a("Sport_RunningPathListActivity", "activity is null in onGranted");
            } else if (jdn.a() != null) {
                LogUtil.a("Sport_RunningPathListActivity", "onRequestPermissionsResult mCityInfo != null");
            } else {
                runningRouteListActivity.a();
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            RunningRouteListActivity runningRouteListActivity = this.e.get();
            if (runningRouteListActivity == null) {
                ReleaseLogUtil.a("Sport_RunningPathListActivity", "activity is null in onDenied");
            } else {
                runningRouteListActivity.x();
                RunningRouteUtils.a(2, "Unauthorized");
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            LogUtil.a("Sport_RunningPathListActivity", "onRequestPermissionsResult onForeverDenied");
            RunningRouteListActivity runningRouteListActivity = this.e.get();
            if (runningRouteListActivity == null) {
                ReleaseLogUtil.a("Sport_RunningPathListActivity", "activity is null in onForeverDenied");
            } else {
                runningRouteListActivity.x();
                RunningRouteUtils.a(2, "Unauthorized");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
