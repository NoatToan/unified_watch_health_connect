package com.huawei.healthcloud.plugintrack.ui.activity;

import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.district.DistrictSearchQuery;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.health.device.model.OperatorStatus;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.health.sport.utils.RunPopularRoutesUtil;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.data.RouterAltitude;
import com.huawei.healthcloud.plugintrack.runningroute.manager.RunningRouteCoordinatorLayout;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteConstants;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.runningroute.view.IRouteDetail;
import com.huawei.healthcloud.plugintrack.runningroute.view.RouterAltitudeChart;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.healthcloud.plugintrack.ui.adapter.LandScapeImagesAdapter;
import com.huawei.healthcloud.plugintrack.ui.view.RouteHintMvpView;
import com.huawei.healthcloud.plugintrack.ui.viewholder.IRouteViewHolder;
import com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener;
import com.huawei.pluginsport.multilingualaudio.AudioResProviderInterface;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.bottomsheet.HealthBottomSheet;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.HealthButtonBarLayout;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.model.ICityLatLonCallBack;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet;
import defpackage.cjw;
import defpackage.ecu;
import defpackage.fxl;
import defpackage.gch;
import defpackage.gcm;
import defpackage.gcw;
import defpackage.gcy;
import defpackage.gda;
import defpackage.gdc;
import defpackage.gde;
import defpackage.gdh;
import defpackage.gdj;
import defpackage.gdk;
import defpackage.gdm;
import defpackage.gdr;
import defpackage.iem;
import defpackage.ive;
import defpackage.jct;
import defpackage.jda;
import defpackage.jdf;
import defpackage.jdn;
import defpackage.jdo;
import defpackage.jem;
import defpackage.jpg;
import defpackage.jtk;
import defpackage.jxb;
import defpackage.lmf;
import defpackage.njy;
import defpackage.nvd;
import defpackage.pqj;
import defpackage.pqm;
import defpackage.pqq;
import defpackage.qon;
import defpackage.qpx;
import defpackage.qqt;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ClockingRankActivity extends BaseActivity implements IRouteViewHolder, IRouteDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f10789a = new HashMap<Integer, Integer>() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.3
        {
            put(258, 0);
            put(259, 1);
            put(257, 2);
        }
    };
    private static WeakReference<ClockingRankActivity> e;
    private HealthTextView aa;
    private HealthRecycleView ab;
    private ImageButton ac;
    private RelativeLayout ad;
    private HealthTextView ae;
    private int af;
    private HealthTextView ah;
    private GpsPoint ai;
    private RelativeLayout aj;
    private HealthTextView ak;
    private String al;
    private HealthTextView am;
    private int an;
    private jpg ao;
    private HealthButton ap;
    private jct aq;
    private LinearLayout ar;
    private LinearLayout as;
    private HealthButton at;
    private HealthButton av;
    private HealthButton ax;
    private HealthTextView ay;
    private CustomTitleBar az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppBarLayout f10790b;
    private LinearLayout ba;
    private ImageButton bb;
    private TabLayout bc;
    private ViewPager bg;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RouterAltitudeChart f10791c;
    private HealthBottomSheet d;
    private FrameLayout f;
    private RunningRouteCoordinatorLayout g;
    private HealthTextView h;
    private String i;
    private WeakReference<ClockingRankActivity> j;
    private boolean k;
    private LinearLayout l;
    private gdm n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean s;
    private boolean u;
    private boolean w;
    private boolean y;
    private LinearLayout z;
    private jtk ag = null;
    private List<gdr> m = new ArrayList();
    private boolean x = true;
    private boolean v = true;
    private boolean t = false;
    private Handler au = new f(this);
    private HwBottomSheet.SheetState aw = HwBottomSheet.SheetState.COLLAPSED;
    private boolean r = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("Track_ClockingRankActivity", "onCreate");
        super.onCreate(bundle);
        e = new WeakReference<>(this);
        clearBackgroundDrawable();
        setContentView(R.layout.activity_clocking_rank);
        this.w = Utils.o();
        y();
        v();
        ac();
        String strE = jdn.e();
        boolean z = this.y;
        LogUtil.a("Track_ClockingRankActivity", "pathId = ", strE, ", isShowPathDetail = ", Boolean.valueOf(z), ", cityInfo: ", jdn.a());
        ah();
        w();
    }

    private void ac() {
        if (this.w) {
            this.af = 1;
        }
        if (this.aq == null) {
            this.aq = new jct(this.af);
        }
    }

    private void w() {
        qsp.c((View) this.ad, 0);
        this.ad.postDelayed(new Runnable() { // from class: jih
            @Override // java.lang.Runnable
            public final void run() {
                this.e.an();
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void an() {
        qsp.c((View) this.ad, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (PermissionUtil.e(this, PermissionUtil.PermissionType.LOCATION) != PermissionUtil.PermissionResult.GRANTED) {
            e("Unauthorized");
        }
        RunningRouteUtils.d();
    }

    private void v() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("Track_ClockingRankActivity", "intent is null");
            return;
        }
        try {
            d(intent);
        } catch (BadParcelableException unused) {
            ReleaseLogUtil.a("Track_ClockingRankActivity", "initIntent catch BadParcelableException");
        }
    }

    private void d(Intent intent) {
        this.y = intent.getBooleanExtra("IS_SHOW_PATH_DETAIL", true);
        this.o = intent.getIntExtra("ENTRANCE_ACTIVITY", 0);
        this.af = intent.getIntExtra("pathClass", 0);
        this.s = intent.getBooleanExtra(BasePairManagerJsApi.FROM_H5_KEY, false);
        this.j = new WeakReference<>(this);
        HotPathCityInfo hotPathCityInfo = (HotPathCityInfo) intent.getParcelableExtra("RUNNING_PATH_CITY_INFO");
        if (hotPathCityInfo != null) {
            jdn.c(hotPathCityInfo);
        }
        Serializable serializableExtra = intent.getSerializableExtra("ROUTE_INFO");
        if (serializableExtra instanceof jct) {
            this.aq = (jct) serializableExtra;
        }
        if (this.s) {
            String stringExtra = intent.getStringExtra("cityInfo");
            if (!TextUtils.isEmpty(stringExtra)) {
                jdn.c((HotPathCityInfo) qqt.e(stringExtra, HotPathCityInfo.class));
            }
            String stringExtra2 = intent.getStringExtra("routeInfo");
            if (!TextUtils.isEmpty(stringExtra2)) {
                this.aq = (jct) qqt.e(stringExtra2, jct.class);
            }
        }
        Serializable serializableExtra2 = intent.getSerializableExtra("pathLocation");
        if (serializableExtra2 instanceof jpg) {
            this.ao = (jpg) serializableExtra2;
        }
        String stringExtra3 = intent.getStringExtra("PATH_ID");
        if (!TextUtils.isEmpty(stringExtra3)) {
            if (ak()) {
                jdn.a(stringExtra3);
            } else {
                jdn.c(stringExtra3);
            }
        }
        if (this.o == RunningRouteConstants.BiFromActivity.INVALID.getIndex()) {
            this.o = RunningRouteConstants.BiFromActivity.FROM_SPORT_RECORD.getIndex();
        }
        e(intent);
    }

    private void e(Intent intent) {
        Uri uriB = AppRouterUtils.b(intent);
        if (uriB == null || uriB.isOpaque()) {
            LogUtil.j("Track_ClockingRankActivity", "uri is invalid");
            return;
        }
        String queryParameter = uriB.getQueryParameter("pathId");
        jdn.c(queryParameter);
        LogUtil.a("Track_ClockingRankActivity", "pathId from deeplink = ", queryParameter);
        this.p = uriB.getBooleanQueryParameter("isBackMap", false);
        this.al = uriB.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        this.af = CommonUtils.j(uriB.getQueryParameter("pathClass"));
        this.s = uriB.getBooleanQueryParameter(BasePairManagerJsApi.FROM_H5_KEY, false);
        boolean z = this.p;
        this.u = z;
        this.t = true;
        LogUtil.a("Track_ClockingRankActivity", "isBackMap from deeplink = ", Boolean.valueOf(z));
        if (this.o == RunningRouteConstants.BiFromActivity.FROM_SPORT_RECORD.getIndex()) {
            this.o = RunningRouteConstants.BiFromActivity.FROM_DEEPLINK.getIndex();
        }
        if (this.p) {
            m();
        } else {
            o();
        }
    }

    private void ah() {
        this.as = (LinearLayout) findViewById(R.id.scroll_view_layout);
        this.ac = (ImageButton) findViewById(R.id.location_button);
        this.f = (FrameLayout) findViewById(R.id.content);
        this.f10790b = (AppBarLayout) findViewById(R.id.app_bar_layout);
        this.az = (CustomTitleBar) findViewById(R.id.clocking_rank_place_title_bar);
        this.f10791c = (RouterAltitudeChart) findViewById(R.id.clocking_rank_place_altitude_chart);
        this.d = (HealthBottomSheet) findViewById(R.id.sliding_layout);
        this.bb = (ImageButton) findViewById(R.id.sort_button);
        this.ad = (RelativeLayout) findViewById(R.id.running_route_loading_layout);
        ai();
        ag();
        z();
        af();
        ae();
        t();
        u();
        ad();
    }

    private void ai() {
        if (d()) {
            qsp.c((View) this.g, 8);
            this.aj = (RelativeLayout) findViewById(R.id.clocking_rank_draw_card_route_draw);
            this.l = (LinearLayout) findViewById(R.id.clocking_rank_draw_card_layout);
            this.h = (HealthTextView) this.aj.findViewById(R.id.route_draw_cp_num);
        } else {
            this.aj = (RelativeLayout) findViewById(R.id.clocking_rank_draw_card);
            this.ab = (HealthRecycleView) findViewById(R.id.landscape_images_recyclerview);
            RunningRouteCoordinatorLayout runningRouteCoordinatorLayout = (RunningRouteCoordinatorLayout) findViewById(R.id.coordinator_layout);
            this.g = runningRouteCoordinatorLayout;
            qsp.c((View) runningRouteCoordinatorLayout, 0);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.clocking_rank_place_start_run_layout);
            this.ar = linearLayout;
            qsp.c((View) linearLayout, 0);
            this.ap = (HealthButton) findViewById(R.id.clocking_rank_place_start_run);
            this.at = (HealthButton) findViewById(R.id.clocking_rank_place_to_device);
            this.bc = (TabLayout) findViewById(R.id.clocking_rank_sub_tab);
            this.bg = (ViewPager) findViewById(R.id.clocking_rank_place_view_pager);
        }
        this.ak = (HealthTextView) this.aj.findViewById(R.id.clocking_rank_place_location);
        this.am = (HealthTextView) this.aj.findViewById(R.id.clocking_rank_place_name);
        this.ay = (HealthTextView) this.aj.findViewById(R.id.clocking_rank_place_mile);
        this.ah = (HealthTextView) this.aj.findViewById(R.id.clocking_rank_place_introduction);
        this.aa = (HealthTextView) this.aj.findViewById(R.id.clocking_rank_place_location_mile);
        this.z = (LinearLayout) this.aj.findViewById(R.id.labelContainer);
        this.ae = (HealthTextView) this.aj.findViewById(R.id.clocking_rank_place_person_count);
        this.ba = (LinearLayout) this.aj.findViewById(R.id.clocking_rank_place_heads);
    }

    private void ag() {
        if (qsp.e(this.ah)) {
            TextView textView = (TextView) this.aj.findViewById(R.id.clocking_rank_place_introduction_show_more);
            qsp.c((View) textView, 0);
            textView.setOnClickListener(new View.OnClickListener() { // from class: jhw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("Track_ClockingRankActivity", "show more");
                }
            });
        }
    }

    private void z() {
        if (this.y) {
            return;
        }
        fxl.e(this, (LinearLayout) findViewById(R.id.marketing_layout), 1017);
    }

    private void af() {
        if (d() || this.ar == null) {
            qsp.c((View) this.ar, 8);
        } else {
            this.as.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: jie
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.e.ap();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ap() {
        if (this.y && (this.as.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.as.getLayoutParams();
            LogUtil.a("Track_ClockingRankActivity", "mRunBottomLayout.getHeight1: ", Integer.valueOf(this.ar.getHeight()));
            layoutParams.bottomMargin = this.ar.getHeight();
        }
    }

    private void ae() {
        LogUtil.a("Track_ClockingRankActivity", "initTitleBar, mIsShowPathDetail: ", Boolean.valueOf(this.y));
        if (this.az == null) {
            LogUtil.a("Track_ClockingRankActivity", "mTitleBar is null");
            return;
        }
        if (this.y) {
            p();
        } else {
            ab();
        }
        if (!this.w) {
            this.az.setRightSoftkeyVisibility(0);
            this.az.setRightSoftkeyBackground(qre.c(R.drawable.ic_view_list), qre.f(R.string.accessibility_choose_list));
            this.az.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: jis
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.i(view);
                }
            });
            this.az.setRightButtonVisibility(0);
            this.az.setRightButtonDrawable(qre.c(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        }
        this.az.setLeftButtonTextColor(qre.c(R.drawable.hwsearchview_ic_public_back), qre.e(R.color.textColorPrimary), qre.f(R.string.accessibility_go_back));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        if (qrs.r()) {
            LogUtil.a("Track_ClockingRankActivity", "right soft key click too fast");
            return;
        }
        jdo.e();
        d(1, BleConstants.BLE_THIRD_DEVICE_H5);
        if (this.s) {
            e(false);
            finish();
            return;
        }
        if (this.t || this.y) {
            LogUtil.a("Track_ClockingRankActivity", "begin to jump to routeList, mCityInfo = ", jdn.a());
            RunningRouteUtils.b(BaseApplication.b(), this.aq.i(), jdn.a());
            finish();
        } else {
            Intent intent = new Intent();
            intent.putExtra("ROUTE_INFO", this.aq);
            intent.putExtra("IS_CITY_CHANGE", this.q);
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    private void e(boolean z) {
        LogUtil.a("Track_ClockingRankActivity", "setResultToH5");
        try {
            JSONObject jSONObject = new JSONObject();
            HotPathCityInfo hotPathCityInfoA = jdn.a();
            if (hotPathCityInfoA != null) {
                jSONObject.put("cityInfo", hotPathCityInfoA);
            }
            jct jctVar = this.aq;
            if (jctVar != null) {
                jSONObject.put("routeInfo", jctVar);
            }
            jSONObject.put("isBackList", z);
            Intent intent = new Intent();
            intent.putExtra("result", HiJsonUtil.d(jSONObject));
            setResult(-1, intent);
            LogUtil.a("Track_ClockingRankActivity", "setResultToH5 success");
        } catch (JSONException e2) {
            LogUtil.e("Track_ClockingRankActivity", "setResultToH5 error: %s", e2.getMessage());
        }
    }

    private void p() {
        if (!this.w) {
            this.az.setRightButtonOnClickListener(new View.OnClickListener() { // from class: jii
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38656a.c(view);
                }
            });
            this.az.setRightThirdKeyVisibility(8);
            this.az.setRightFourKeyVisibility(ak() ? 8 : 0);
            this.az.setRightFourKeyBackground(qre.c(R.drawable.ic_running_route_history), qre.f(R.string.IDS_hw_show_sport_history_routes_string));
            this.az.setRightFourKeyOnClickListener(new View.OnClickListener() { // from class: jig
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38655a.e(view);
                }
            });
        }
        this.az.getViewTitle().setBackgroundResource(0);
        this.az.setTitleBarBackgroundColor(getColor(R.color.transparent));
        bh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        bd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        bk();
        d(1, "h4");
    }

    private void h() {
        if (!this.p) {
            LogUtil.a("Track_ClockingRankActivity", "is not from deeplink, no bi");
        } else {
            jdo.c();
        }
    }

    private void ab() {
        if (!this.w) {
            this.az.setRightThirdKeyVisibility(0);
            this.az.setRightThirdKeyBackground(qre.c(R.drawable.search_bar_icon), qre.f(R.string.IDS_global_search_button));
            this.az.setRightThirdKeyOnClickListener(new View.OnClickListener() { // from class: jhv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38643c.h(view);
                }
            });
            this.az.setRightFourKeyVisibility(8);
            this.az.setRightButtonOnClickListener(new View.OnClickListener() { // from class: jht
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.f(view);
                }
            });
        }
        bh();
        this.az.getViewTitle().setBackgroundResource(R.drawable.hwspinner_selector_background_emui);
        this.az.getViewTitle().setOnClickListener(new View.OnClickListener() { // from class: jhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38641b.g(view);
            }
        });
        this.az.getViewTitle().setGravity(16);
        this.az.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.no_fragment_titlebgcolor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        if (qrs.r()) {
            LogUtil.a("Track_ClockingRankActivity", "third key click too fast");
            return;
        }
        Intent intent = new Intent(this, (Class<?>) RunningRouteLocationSearchActivity.class);
        intent.putExtra(DistrictSearchQuery.KEYWORDS_CITY, jdn.a() == null ? "" : jdn.a().getCityName());
        startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        bg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        RunningCitysActivity.a(this, jdn.a(), 0);
    }

    private void bh() {
        this.az.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: jhq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38640a.m(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        aw();
    }

    private void aw() {
        gch.b().removeLocationUpdates();
        if (this.s) {
            e(false);
            finish();
            return;
        }
        if (this.u) {
            this.u = false;
            h();
            w();
            this.y = false;
            ae();
            this.f10791c.c();
            br();
            this.ag.b();
            qsp.c((View) this.d.getIndicateView().getParent(), 8);
            qsp.c((View) this.l, 8);
            a();
            qsp.c((View) this.ac, 0);
            aa();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("IS_RETURN_TO_BEFORE_ACTIVITY", true);
        intent.putExtra("ROUTE_INFO", this.aq);
        intent.putExtra("IS_CITY_CHANGE", this.q);
        setResult(-1, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    private void aa() {
        HandlerExecutor.c(new Runnable() { // from class: jiw
            @Override // java.lang.Runnable
            public final void run() {
                this.f38665b.am();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void am() {
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) this.f10790b.getLayoutParams()).getBehavior();
        if (behavior instanceof AppBarLayout.Behavior) {
            AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
            if (behavior2.getTopAndBottomOffset() != 0) {
                behavior2.setTopAndBottomOffset(0);
            }
        }
        this.d.setSheetState(HwBottomSheet.SheetState.HIDDEN);
        qsp.c((View) this.ar, 8);
        if (njy.b(this.m) && this.m.size() > 100) {
            k();
        } else {
            LogUtil.a("Track_ClockingRankActivity", "less than 100 routes, continue requesting data");
            ay();
        }
        jpg jpgVarA = RunningRouteUtils.a();
        jdn.d(jpgVarA);
        this.ag.c(jpgVarA);
        this.p = false;
        a();
    }

    private void k() {
        jpg jpgVar;
        if (this.p) {
            GpsPoint cityCenter = jdn.a().getCityCenter();
            boolean z = PermissionUtil.e(this, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED;
            if (this.v && z) {
                jpgVar = jdn.i();
            } else {
                jpgVar = new jpg(cityCenter.getLatitude(), cityCenter.getLongitude());
            }
            LogUtil.a("Track_ClockingRankActivity", "mIsRouteAndUserInSameCity = ", Boolean.valueOf(this.v), ", mUserLocation = ", jdn.i(), " ,cityCenter = ", cityCenter, ", mapFocusPoint = ", jpgVar);
            this.ag.b(jpgVar);
        } else {
            this.ag.c();
        }
        if (jdn.f()) {
            this.ag.e(jdn.j());
        }
        this.ag.e(this.d.getContext(), this.m);
        a(false);
    }

    private void br() {
        LinearLayout linearLayout = this.as;
        if (linearLayout == null || !(linearLayout.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.as.getLayoutParams();
        layoutParams.bottomMargin = 0;
        this.as.setLayoutParams(layoutParams);
    }

    private void bd() {
        d(1, "h1");
        ArrayList arrayList = new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_clock_wrong_route_feed_back_entrance), getResources().getString(R.string.IDS_clock_transfer_to_wearable_device)));
        if (!d()) {
            arrayList.add(getResources().getString(R.string.IDS_hw_routes_auto_punch_route));
        }
        if (RunningRouteUtils.i()) {
            arrayList.add(File.separator);
            arrayList.add(getResources().getString(R.string.IDS_hw_routes_auto_punch_route));
        }
        new PopViewList(this, this.az, arrayList).b(new PopViewList.PopViewClickListener() { // from class: jiv
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.f38664c.c(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i) {
        if (i == 0) {
            d(1, "m6");
            RunningRouteUtils.c(this, jdn.e(), this.i);
        } else {
            if (i == 1) {
                bb();
                return;
            }
            LogUtil.a("Track_ClockingRankActivity", "startSportAssistSettingsActivity");
            d(1, "m1");
            bn();
        }
    }

    private void bb() {
        jdo.a(jdn.e());
        d(1, "m7");
        ba();
        LogUtil.a("Track_ClockingRankActivity", "transfer to wearable device");
    }

    private void bn() {
        Intent intent = new Intent();
        intent.setClassName(this, "com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity");
        intent.putExtra("currentSportType", 258);
        startActivity(intent);
    }

    private void bg() {
        PopViewList popViewList = new PopViewList(this, this.az, new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_track_runing_route_history_routes), getResources().getString(R.string.IDS_track_runing_route_explain))));
        jdo.d(0);
        popViewList.b(new PopViewList.PopViewClickListener() { // from class: jiq
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.d.a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        if (i == 0) {
            bk();
        } else {
            if (i != 1) {
                return;
            }
            jxb.e();
            jdo.d(1);
            bm();
        }
    }

    private void bk() {
        RunningRouteUtils.e(BaseApplication.b(), "punch");
    }

    private void bm() {
        startActivity(new Intent(this, (Class<?>) RunningRouteIntroductionActivity.class));
    }

    private void t() {
        LogUtil.a("Track_ClockingRankActivity", "initBottomSheet");
        HealthBottomSheet healthBottomSheet = this.d;
        if (healthBottomSheet == null) {
            LogUtil.a("Track_ClockingRankActivity", "mBottomSheet is null");
            return;
        }
        healthBottomSheet.getIndicateView().setOnTouchListener(new View.OnTouchListener() { // from class: jij
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f38657a.d(view, motionEvent);
            }
        });
        this.d.setAnchorPoint(0.0f);
        this.d.setIndicateSafeInsetsEnabled(true);
        this.d.setForceShowIndicateEnabled(false);
        this.d.setIndicateViewClickable(false);
        this.d.setHeightGap(200);
        this.d.setSheetHeight(getResources().getDimensionPixelOffset(com.huawei.ui.commonui.R.dimen.health_common_220dp));
        this.d.b(new HwBottomSheet.SheetSlideListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.5
            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetSlide(View view, float f2) {
            }

            @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet.SheetSlideListener
            public void onSheetStateChanged(View view, HwBottomSheet.SheetState sheetState, HwBottomSheet.SheetState sheetState2) {
                ClockingRankActivity.this.aw = sheetState2;
                LogUtil.a("Track_ClockingRankActivity", "onSheetStateChanged, newState: ", sheetState2);
                ClockingRankActivity.this.e(sheetState2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        RunningRouteCoordinatorLayout runningRouteCoordinatorLayout;
        if (!this.d.isEnabled() || !this.d.c()) {
            return false;
        }
        if (this.aw == HwBottomSheet.SheetState.EXPANDED && (runningRouteCoordinatorLayout = this.g) != null && runningRouteCoordinatorLayout.getIsOnTop()) {
            this.d.setSheetState(HwBottomSheet.SheetState.COLLAPSED);
            return false;
        }
        if (this.aw != HwBottomSheet.SheetState.COLLAPSED) {
            return false;
        }
        this.d.setSheetState(HwBottomSheet.SheetState.EXPANDED);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HwBottomSheet.SheetState sheetState) {
        int dimensionPixelOffset;
        if (sheetState == HwBottomSheet.SheetState.COLLAPSED) {
            if (qsp.e(this.am)) {
                dimensionPixelOffset = getResources().getDimensionPixelOffset(com.huawei.ui.commonui.R.dimen.health_common_240dp);
            } else {
                dimensionPixelOffset = getResources().getDimensionPixelOffset(com.huawei.ui.commonui.R.dimen.health_common_220dp);
            }
            int sheetHeight = this.d.getSheetHeight();
            if (sheetHeight != dimensionPixelOffset) {
                this.d.setSheetHeight(dimensionPixelOffset);
            }
            LogUtil.a("Track_ClockingRankActivity", "oldHeight=", Integer.valueOf(sheetHeight), "sheetHeight = ", Integer.valueOf(dimensionPixelOffset));
        }
    }

    private void u() {
        LinearLayout linearLayout;
        LogUtil.a("Track_ClockingRankActivity", "initLocationView");
        if (this.w || (linearLayout = (LinearLayout) this.aj.findViewById(R.id.clocking_rank_place_location_layout)) == null) {
            return;
        }
        linearLayout.setVisibility(0);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: jix
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.j(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        RunningRouteUtils.d(this, this.ai);
        d(1, "i5");
    }

    private void ad() {
        LogUtil.a("Track_ClockingRankActivity", "initMapViewHolder");
        jtk jtkVar = new jtk(getWindow().getDecorView().getRootView(), this, this);
        this.ag = jtkVar;
        jpg jpgVarI = this.ao;
        if (jpgVarI == null) {
            jpgVarI = jdn.i();
        }
        jtkVar.a(this, jpgVarI);
        LogUtil.a("Track_ClockingRankActivity", "begin to draw, current location = ", Double.valueOf(jdn.i().d), ", ", Double.valueOf(jdn.i().f38787a));
        this.ag.c(jdn.i());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("Track_ClockingRankActivity", "onResume: mIsInit = ", Boolean.valueOf(this.r));
        super.onResume();
        if (!this.x) {
            this.x = true;
            return;
        }
        if (this.r && this.y) {
            LogUtil.a("Track_ClockingRankActivity", "skip refresh ranking data");
            return;
        }
        this.r = true;
        if (this.p || al()) {
            return;
        }
        w();
        ay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (d()) {
            this.ax = (HealthButton) findViewById(R.id.clocking_rank_to_device);
            HealthButton healthButton = (HealthButton) findViewById(R.id.clocking_rank_to_start);
            this.av = healthButton;
            qsp.b(healthButton, new View.OnClickListener() { // from class: jhs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.b(view);
                }
            });
            RouteTransferDataHolder.b(this.n.o(), (ResponseCallback<Boolean>) new ResponseCallback() { // from class: jid
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f38652c.c(i, (Boolean) obj);
                }
            });
            c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        bl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, Boolean bool) {
        c(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bi() {
        jtk jtkVar = this.ag;
        if (jtkVar != null) {
            jtkVar.f();
        }
    }

    public void c(boolean z) {
        int i;
        Handler handler = this.au;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(3);
            if (z) {
                i = R.string.IDS_track_route_draw_wearing_navigation;
            } else {
                i = R.string.IDS_clock_transfer_to_wearable_device;
            }
            messageObtainMessage.arg1 = i;
            this.au.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i) {
        HealthButton healthButton = this.ax;
        if (healthButton != null) {
            healthButton.setText(i);
            this.ax.setOnClickListener(new View.OnClickListener() { // from class: jif
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38653a.b(i, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i, View view) {
        if (qrs.r()) {
            LogUtil.a("Track_ClockingRankActivity", "fast click");
        } else if (i == R.string.IDS_clock_transfer_to_wearable_device) {
            ba();
            d(1, "p7");
        } else {
            bc();
            d(1, "p8");
        }
    }

    private void ba() {
        String strE;
        String strA;
        if (this.n == null) {
            ReleaseLogUtil.a("Track_ClockingRankActivity", "mHotPathDetailInfo is null in sendDrawToDevice");
            return;
        }
        LogUtil.a("Track_ClockingRankActivity", "click transfer to device");
        RouteTransferDataHolder routeTransferDataHolder = new RouteTransferDataHolder(this);
        if (this.n.n() == null) {
            strE = "";
            strA = "";
        } else {
            strE = this.n.n().e();
            strA = this.n.n().a();
        }
        routeTransferDataHolder.b(strA);
        routeTransferDataHolder.e(strE, RunningRouteUtils.d(this.n), this.n.y());
    }

    private void bc() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_ClockingRankActivity");
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            qpx.e(this, R.string.IDS_running_route_draw_pull_fail);
            return;
        }
        cjw.b().c(deviceInfo, "huaweischeme://wearable/sport/sportdoodle/routelist?trackid=" + this.n.o(), new IBaseResponseCallback() { // from class: jic
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f38651c.c(i, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, Object obj) {
        LogUtil.a("Track_ClockingRankActivity", "sendDevicePullPage response ", obj);
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = R.string.IDS_running_route_draw_pull_fail;
            if (iIntValue == 0) {
                i2 = R.string.IDS_running_route_draw_pull_success;
            } else if (iIntValue == 2) {
                i2 = R.string.IDS_running_route_draw_pull_no_exist;
                c(false);
            }
            qpx.e(this.j.get(), i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ay() {
        LogUtil.a("Track_ClockingRankActivity", "requestDataAndShowView");
        ae();
        this.f10791c.c();
        this.f.setPadding(0, 0, 0, 0);
        if (this.y) {
            be();
            return;
        }
        gch.b().removeLocationUpdates();
        qsp.c((View) this.d.getIndicateView().getParent(), 8);
        a();
        qsp.c((View) this.ac, 0);
        HandlerExecutor.c(new Runnable() { // from class: jir
            @Override // java.lang.Runnable
            public final void run() {
                this.d.aq();
            }
        }, 200L);
        qsp.c((View) this.ar, 8);
        az();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aq() {
        this.d.setSheetState(HwBottomSheet.SheetState.HIDDEN);
    }

    private void be() {
        qsp.c((View) this.d.getIndicateView().getParent(), 0);
        jpg jpgVarA = RunningRouteUtils.a();
        jdn.d(jpgVarA);
        this.ag.c(jpgVarA);
        qsp.c((View) this.bb, 8);
        qsp.c((View) this.ac, 8);
        HandlerExecutor.c(new Runnable() { // from class: jia
            @Override // java.lang.Runnable
            public final void run() {
                this.f38649c.ao();
            }
        }, 200L);
        String strE = jdn.e();
        if (ak()) {
            strE = getIntent().getStringExtra("PATH_ID");
        }
        if (!d()) {
            qsp.c((View) this.ar, 0);
            qsp.c((View) this.g, 0);
        }
        a(strE);
        c(strE);
        bf();
        this.ag.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ao() {
        if (this.d.getSheetState() != HwBottomSheet.SheetState.HIDDEN || d()) {
            return;
        }
        this.d.setSheetState(HwBottomSheet.SheetState.COLLAPSED);
    }

    private void a(String str) {
        LogUtil.a("Track_ClockingRankActivity", "bindHotPathDetailToView, pathId: ", str);
        gch.b().getHotPathDetail(new gdh.b().b(str).c(), new d(this));
    }

    public boolean d() {
        return this.af == 1 || this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(gdm gdmVar, GpsPoint gpsPoint) {
        LogUtil.a("Track_ClockingRankActivity", "miles: ", getResources().getString(R.string.IDS_clock_rank_path_mile, UnitUtil.e(gdmVar.y() / 1000.0d, 1, 2)), ", punch person: ", UnitUtil.e(gdmVar.h(), 1, 0));
        e(gdmVar);
        qsp.b(this.am, gdmVar.l());
        this.am.postDelayed(new Runnable() { // from class: jiz
            @Override // java.lang.Runnable
            public final void run() {
                this.f38667a.aj();
            }
        }, 700L);
        qsp.b(this.ae, UnitUtil.e(gdmVar.h(), 1, 0));
        jdo.c(gdmVar.h());
        qsp.b(this.ay, RunningRouteUtils.c(R.plurals.IDS_distance_km, R.plurals.IDS_distance_mi, gdmVar.y()));
        if (!TextUtils.isEmpty(gdmVar.d())) {
            qsp.b(this.ah, gdmVar.d());
            qsp.c((View) this.ah, 0);
        }
        qsp.b(this.aa, RunningRouteUtils.a(R.plurals.IDS_track_route_draw_from_you, R.plurals.IDS_track_route_draw_from_you_unit_mi, RunningRouteUtils.a(RunningRouteUtils.a(), RunningRouteUtils.c(gpsPoint)), 2));
        if (!this.t) {
            jdo.d(gdmVar.q(), this.o, this.al, this.an);
        }
        if (gpsPoint != null && !this.w) {
            jdf.a().d(new LatLonPoint(gpsPoint.getLatitude(), gpsPoint.getLongitude()), new e(this, 2));
        }
        b(gdmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aj() {
        e(this.aw);
        j();
    }

    private void e(gdm gdmVar) {
        if (gdmVar.a() == null || !njy.b(gdmVar.a().c())) {
            return;
        }
        int size = gdmVar.a().c().size();
        qsp.b(this.h, qre.e(R.plurals.IDS_track_route_draw_necessary_point, size, Integer.valueOf(size)));
        qsp.c((View) this.h, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(gcm gcmVar, gdm gdmVar) {
        this.z.removeAllViews();
        a(c(gcmVar, 1, gdmVar.s()), this.z);
        a(c(gcmVar, 0, gdmVar.v()), this.z);
    }

    private List<String> c(gcm gcmVar, int i, List<Integer> list) {
        if (gcmVar == null || njy.e(list)) {
            return new ArrayList();
        }
        if (i == 0) {
            return RunningRouteUtils.c(gcmVar.b(), list);
        }
        return RunningRouteUtils.c(gcmVar.e(), list);
    }

    private void a(List<String> list, LinearLayout linearLayout) {
        if (njy.b(list)) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    linearLayout.addView(d(str), r());
                }
            }
        }
    }

    private View d(String str) {
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.list_item_running_route_label, (ViewGroup) null).findViewById(R.id.text1);
        qsp.b(textView, str);
        return textView;
    }

    private LinearLayout.LayoutParams r() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.health_common_4dp));
        return layoutParams;
    }

    private void j() {
        ViewPager viewPager = this.bg;
        if (viewPager == null || this.bc == null) {
            return;
        }
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f2, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                LogUtil.a("Track_ClockingRankActivity", "onPageSelected Position: ", Integer.valueOf(i));
                ClockingRankActivity.this.d.setSheetState(HwBottomSheet.SheetState.EXPANDED);
                ClockingRankActivity.this.d(1, i == 0 ? "i7" : "i6");
            }
        });
        this.bc.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                LogUtil.a("Track_ClockingRankActivity", "onTabSelected Position: ", Integer.valueOf(position), "title: ", tab.getText().toString());
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                LogUtil.a("Track_ClockingRankActivity", "onTabUnselected Position: ", Integer.valueOf(position), "title: ", tab.getText().toString());
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                LogUtil.a("Track_ClockingRankActivity", "onTabReselected Position: ", Integer.valueOf(position), "title: ", tab.getText().toString());
                ClockingRankActivity.this.d.setSheetState(HwBottomSheet.SheetState.EXPANDED);
            }
        });
    }

    private void b(gdm gdmVar) {
        if (this.ab == null || gdmVar == null || gdmVar.n() == null || gdmVar.n().b() == null || d()) {
            LogUtil.a("Track_ClockingRankActivity", "no land scape images");
            return;
        }
        this.ab.setHasFixedSize(true);
        this.ab.setNestedScrollingEnabled(false);
        this.ab.b(false);
        this.ab.e(false);
        this.ab.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.ab.setAdapter(new LandScapeImagesAdapter(this, gdmVar.n().b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(gdm gdmVar) {
        RouterAltitude routerAltitude;
        LogUtil.a("Track_ClockingRankActivity", "bindAltitudeChart");
        if (gdmVar == null || gdmVar.p() == null) {
            LogUtil.a("Track_ClockingRankActivity", "get altitude fail");
            return;
        }
        List<GpsPoint> listP = gdmVar.p();
        float fY = ((float) gdmVar.y()) / listP.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listP.size(); i++) {
            if (i == listP.size() - 1) {
                routerAltitude = new RouterAltitude((float) gdmVar.y(), (float) listP.get(i).getAltitude());
            } else {
                routerAltitude = new RouterAltitude(0 + (i * fY), (float) listP.get(i).getAltitude());
            }
            arrayList.add(routerAltitude);
        }
        this.f10791c.setIsTouchEventConsumption(false);
        this.f10791c.b(arrayList);
    }

    private void c(String str) {
        LogUtil.a("Track_ClockingRankActivity", "bindHotPathDetailToView, pathId: ", str);
        HealthButton healthButton = this.ap;
        if (healthButton == null) {
            LogUtil.a("Track_ClockingRankActivity", "mRunBottom is null");
        } else {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: jik
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38658a.k(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        if (qrs.r()) {
            return;
        }
        bl();
    }

    private void bf() {
        HealthButton healthButton = this.at;
        if (healthButton == null) {
            LogUtil.a("Track_ClockingRankActivity", "mSendRunRouteBtn is null");
        } else {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: jil
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.o(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        if (qrs.r()) {
            return;
        }
        bb();
    }

    private void bl() {
        boolean zE = iem.e(this, BluetoothAdapter.getDefaultAdapter() != null ? BluetoothAdapter.getDefaultAdapter().isEnabled() : false);
        boolean zE2 = iem.e(this);
        boolean zH = nvd.h(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        ReleaseLogUtil.d("Track_ClockingRankActivity", "isConnect", Boolean.valueOf(zE), "isIndependentSportDevice", Boolean.valueOf(zE2), "update status", Boolean.valueOf(zH));
        if (zE && zE2 && !zH) {
            pqm.a().e(new a(this));
            Handler handler = this.au;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            return;
        }
        HandlerExecutor.b(new Runnable() { // from class: jhx
            @Override // java.lang.Runnable
            public final void run() {
                this.f38644a.au();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void au() {
        AudioResProviderInterface audioResProviderInterface = (AudioResProviderInterface) AppRouter.e(AudioResProviderInterface.ROUTER_PATH_AUDIO_RES_DOWNLOAD, AudioResProviderInterface.class);
        boolean zB = pqj.b().b(BaseApplication.b());
        ReleaseLogUtil.d("Track_ClockingRankActivity", "goToSport service = ", Boolean.valueOf(audioResProviderInterface != null), "goToSport isEnableCurLang = ", Boolean.valueOf(zB));
        if (audioResProviderInterface == null || !zB) {
            s();
        } else {
            audioResProviderInterface.queryOrDownAudioResource(this, pqq.b(BaseApplication.b(), "Sport"), qre.f(R.string.IDS_hwh_base_model_multilingualaudio), new AudioResDownloadListener() { // from class: jio
                @Override // com.huawei.pluginsport.multilingualaudio.AudioResDownloadListener
                public final void onResult(int i) {
                    this.f38661b.b(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i) {
        ReleaseLogUtil.d("Track_ClockingRankActivity", "goToSport result = ", Integer.valueOf(i));
        HandlerExecutor.b(new Runnable() { // from class: jit
            @Override // java.lang.Runnable
            public final void run() {
                this.f38662b.s();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        String strE;
        Bundle bundleB = ive.c().b(258, -1, -1.0f, -1);
        bundleB.putInt("pathClass", this.af);
        if (ak()) {
            strE = jdn.d();
        } else {
            strE = jdn.e();
        }
        String str = strE;
        LogUtil.a("Track_ClockingRankActivity", "curPath from historicalRoutes = ", Boolean.valueOf(ak()), ", pathId = ", str);
        ive.c().c(0, bundleB, (ISportDataCallback) null, this, str);
        i();
        ive.c().a(258, -1, -1.0f);
        this.r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bj() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(R.string.IDS_hwh_motiontrack_ingnore_link_attention).c(R.string.IDS_apphelp_pwindows_continue_button, new View.OnClickListener() { // from class: jhy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38645a.n(view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: jhz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("Track_ClockingRankActivity", "cancel sport");
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        LogUtil.a("Track_ClockingRankActivity", "ignore link and continue");
        jem.c(true);
        au();
    }

    private void i() {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", Integer.valueOf(this.o));
        map.put("routeID", jdn.e());
        map.put("routeIName", this.i);
        jct jctVar = this.aq;
        map.put("routeStyle", Integer.valueOf(jctVar != null ? jctVar.a() : 0));
        map.put(BleConstants.SPORT_TYPE, 258);
        lmf.d().c(BaseApplication.b(), "1040085", map, 0);
        d(1, "p4");
    }

    private void e(String str) {
        if (this.k) {
            return;
        }
        this.k = true;
        RunningRouteUtils.a(0, str);
    }

    private void az() {
        LogUtil.a("Track_ClockingRankActivity", "setRouterMarker");
        jpg jpgVarA = RunningRouteUtils.a();
        jdn.d(jpgVarA);
        this.ag.c(jpgVarA);
        if (jdn.f()) {
            this.ag.e(jdn.j());
            this.ag.a(jdn.j());
        }
        if (jdn.a() == null) {
            this.az.setTitleText(getString(R.string.IDS_track_runing_route_location));
            this.ag.a(jdn.i());
            HandlerExecutor.c(new Runnable() { // from class: jiu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38663b.as();
                }
            }, 200L);
        } else if (jdn.a().getCityId() != null) {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void as() {
        qsp.c((View) this.ad, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        jpg jpgVarJ = jdn.f() ? jdn.j() : jdn.i();
        if (jpgVarJ == null) {
            LogUtil.j("Track_ClockingRankActivity", "cannot get user location");
        } else {
            jdf.a().c(new LatLonPoint(jpgVarJ.d, jpgVarJ.f38787a), new e(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, jpg jpgVar) {
        LogUtil.a("Track_ClockingRankActivity", "userLocation: ", jpgVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(this.af));
        this.ag.a(jpgVar);
        jct jctVar = this.aq;
        c(new gdk.d().d(jpgVar.d).c(jpgVar.f38787a).b(str).f(1).b(0).c(arrayList).a(jctVar != null ? f10789a.getOrDefault(Integer.valueOf(jctVar.i()), 0).intValue() : 0).i(0).c(1).d(100).a(), jpgVar);
    }

    private void c(gdk gdkVar, jpg jpgVar) {
        if (gdkVar != null) {
            gch.b().getHotPaths(gdkVar, new h(this, gdkVar, jpgVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(gdk gdkVar, int i) {
        LogUtil.a("Track_ClockingRankActivity", "requestHotPaths");
        if (gdkVar != null) {
            gch.b().getHotPaths(gdkVar, new c(this, gdkVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.ag.b(z);
    }

    public jct c() {
        return this.aq;
    }

    public void c(jct jctVar) {
        if (jctVar != null) {
            this.aq = jctVar;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent == null) {
            LogUtil.a("Track_ClockingRankActivity", "onActivityResult, data is null");
            return;
        }
        if (i == 0 && i2 == -1) {
            w();
            b(intent);
            return;
        }
        if (i == 1 && i2 == -1) {
            String stringExtra = intent.getStringExtra("SEARCH_JUMP_CITY_INFO");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            HotPathCityInfo hotPathCityInfo = (HotPathCityInfo) qqt.e(stringExtra, HotPathCityInfo.class);
            if (hotPathCityInfo == null || hotPathCityInfo.getCityCenter() == null) {
                LogUtil.a("Track_ClockingRankActivity", "onActivityResult, error city info");
                return;
            }
            jdn.c(hotPathCityInfo);
            GpsPoint cityCenter = hotPathCityInfo.getCityCenter();
            jpg jpgVar = new jpg(cityCenter.getLatitude(), cityCenter.getLongitude());
            this.ag.b();
            this.ag.a(jpgVar);
            jdn.d(true);
            jdn.c(jpgVar);
            gch.b().getCityInfoWithGps(new gcy.e().a(jpgVar.d).c(jpgVar.f38787a).e(), new b(this, jpgVar));
            return;
        }
        if (i == 2 && i2 == -1 && intent.getBooleanExtra("isBackList", false)) {
            finish();
        }
    }

    private void b(Intent intent) {
        this.y = intent.getBooleanExtra("IS_SHOW_PATH_DETAIL", true);
        if (intent.getBooleanExtra("IS_CITY_CHANGE", false)) {
            ReleaseLogUtil.d("Track_ClockingRankActivity", "city is changed");
            this.aq = new jct(this.af);
            this.q = true;
            if (this.ag != null) {
                a();
            }
        }
        HotPathCityInfo hotPathCityInfo = (HotPathCityInfo) intent.getParcelableExtra("RUNNING_PATH_CITY_INFO");
        if (hotPathCityInfo == null) {
            return;
        }
        jdn.c(hotPathCityInfo);
        this.az.setTitleText(jdn.a().getCityName());
        jdn.d(false);
    }

    public void a() {
        jct jctVar = this.aq;
        if (jctVar == null || jctVar.b() == null) {
            qsp.c((View) this.bb, 8);
            ReleaseLogUtil.a("Track_ClockingRankActivity", "drawInfo is null in changeSortButtonImage");
            return;
        }
        if (this.aq.e() == 0 && this.aq.a() == 0) {
            qsp.a(this.bb, qqz.c(BaseApplication.b(), R.drawable.ic_path_type_dialog_default));
        } else {
            qsp.a(this.bb, qqz.c(BaseApplication.b(), R.drawable.ic_path_type_dialog_sort));
        }
        qsp.c((View) this.bb, 0);
    }

    private void m() {
        LogUtil.a("Track_ClockingRankActivity", "checkRunningRoutePermission");
        e(new RunPopularRoutesUtil.DialogCallBack() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.4
            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void goNext() {
                LogUtil.a("Track_ClockingRankActivity", "RunningRoutePermission is granted, begin to jump to route detail page");
                ClockingRankActivity.this.g();
            }

            @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
            public void notGoNext() {
                LogUtil.a("Track_ClockingRankActivity", "RunningRoutePermission is denied, cannot jump to route detail page");
                qrs.r();
                ClockingRankActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("Track_ClockingRankActivity", "checkLocationPermission");
        if (PermissionUtil.e(this, PermissionUtil.PermissionType.LOCATION) != PermissionUtil.PermissionResult.GRANTED) {
            PermissionUtil.d(this, PermissionUtil.PermissionType.LOCATION, new CustomPermissionAction(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.9
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("Track_ClockingRankActivity", "location permission is granted, begin to init location");
                    ClockingRankActivity.this.y();
                    ClockingRankActivity.this.o();
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.a("Track_ClockingRankActivity", "location permission is denied, use default location");
                    super.onDenied(str);
                    ClockingRankActivity.this.o();
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    LogUtil.a("Track_ClockingRankActivity", "location permission is forever denied, use default location");
                    ClockingRankActivity.this.o();
                }
            });
            return;
        }
        LogUtil.a("Track_ClockingRankActivity", "has location permission");
        y();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (al()) {
            at();
        } else {
            av();
        }
    }

    private void e(final RunPopularRoutesUtil.DialogCallBack dialogCallBack) {
        if (RunPopularRoutesUtil.c(this)) {
            dialogCallBack.goNext();
            return;
        }
        LogUtil.a("Track_ClockingRankActivity", "showFirstPopularRoutesDialog enter");
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this).a(View.inflate(this, R.layout.dialog_first_popular_routes_tip, null)).a(R.string.IDS_device_release_user_profile_log_collect_cancel, new DialogInterface.OnClickListener() { // from class: jip
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ClockingRankActivity.a(dialogCallBack, dialogInterface, i);
            }
        }).d(R.string.IDS_device_release_user_profile_log_collect_agree, new DialogInterface.OnClickListener() { // from class: jim
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f38659b.e(dialogCallBack, dialogInterface, i);
            }
        }).b();
        HealthTextView healthTextView = (HealthTextView) customAlertDialogB.findViewById(R.id.second);
        HealthTextView healthTextView2 = (HealthTextView) customAlertDialogB.findViewById(R.id.third);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_hw_routes_dialog_permission, qre.f(R.string.IDS_hw_routes_dialog_permission_run)));
        qri.e(spannableString, getString(R.string.IDS_hw_routes_dialog_permission_run), R.string.textFontFamilyMedium);
        qri.b(spannableString, getString(R.string.IDS_hw_routes_dialog_permission_run), R.color.textColorPrimary);
        healthTextView2.setText(spannableString);
        HealthButton healthButton = (HealthButton) customAlertDialogB.findViewById(R.id.dialog_btn_positive);
        if (!this.w) {
            healthButton.setTextColor(getResources().getColor(R.color.hwbutton_selector_text_emphasize_emui, null));
            healthButton.setBackgroundResource(R.drawable.button_background_emphasize);
        } else {
            healthTextView.setText(getString(R.string.IDS_hw_routes_dialog_permission_knowledge_string_overseas));
        }
        ((HealthButtonBarLayout) customAlertDialogB.findViewById(com.huawei.health.servicesui.R.id.button_bar)).setDividerDrawable(getResources().getDrawable(R.drawable.custom_dialog_divider_vertical_trusparent, null));
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public static /* synthetic */ void a(RunPopularRoutesUtil.DialogCallBack dialogCallBack, DialogInterface dialogInterface, int i) {
        LogUtil.a("Track_ClockingRankActivity", "showFirstPopularRoutesDialog click cancel");
        dialogCallBack.notGoNext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(RunPopularRoutesUtil.DialogCallBack dialogCallBack, DialogInterface dialogInterface, int i) {
        LogUtil.a("Track_ClockingRankActivity", "showFirstPopularRoutesDialog click agree");
        getSharedPreferences("popularRoutes_sharedpreference_msg", 0).edit().putBoolean("enter_popular_routes", true).commit();
        dialogCallBack.goNext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean al() {
        return "0".equals(jdn.e());
    }

    private void at() {
        gch.b().getCityInfoWithGps(new gcy.e().a(jdn.i().d).c(jdn.i().f38787a).e(), new UiCallback<gdc>() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.10
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Track_ClockingRankActivity", "cannot get cityInfo with gps, errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gdc gdcVar) {
                int i;
                if (gdcVar == null || gdcVar.a() == null) {
                    if (PermissionUtil.e(ClockingRankActivity.this, PermissionUtil.PermissionType.LOCATION) != PermissionUtil.PermissionResult.GRANTED) {
                        i = R.string.IDS_track_show_detail_run_route_unsupport;
                    } else {
                        i = R.string.IDS_track_show_detail_run_route_offline;
                    }
                    ClockingRankActivity clockingRankActivity = ClockingRankActivity.this;
                    qpx.e(clockingRankActivity, ((ClockingRankActivity) clockingRankActivity.j.get()).getString(i));
                    ClockingRankActivity.this.finish();
                    return;
                }
                HotPathCityInfo hotPathCityInfoE = gdcVar.e();
                String cityId = hotPathCityInfoE.getCityId();
                LogUtil.a("Track_ClockingRankActivity", "cityInfo = ", hotPathCityInfoE, " cityId = ", cityId);
                if (ClockingRankActivity.this.al()) {
                    jdn.c(hotPathCityInfoE);
                    jdn.e(cityId);
                }
                if (TextUtils.isEmpty(cityId)) {
                    return;
                }
                LogUtil.a("Track_ClockingRankActivity", "get cityId, begin to requestHotPaths");
                ClockingRankActivity.this.v = jdn.c().equals(gdcVar.e().getCityId());
                ClockingRankActivity.this.d(jdn.c(), jdn.i());
            }
        });
    }

    private void av() {
        gch.b().getHotPathDetail(new gdh.b().b(jdn.e()).c(), new UiCallback<gde>() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.6
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Track_ClockingRankActivity", "cannot get hotPathDetail, errorCode = ", Integer.valueOf(i), ", errorInfo = " + str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gde gdeVar) {
                if (gdeVar == null || gdeVar.b() == null) {
                    ClockingRankActivity clockingRankActivity = ClockingRankActivity.this;
                    qpx.e(clockingRankActivity, ((ClockingRankActivity) clockingRankActivity.j.get()).getString(R.string.IDS_track_show_detail_run_route_offline));
                    ClockingRankActivity.this.finish();
                } else {
                    String strB = gdeVar.b().b();
                    if (!TextUtils.isEmpty(strB)) {
                        LogUtil.a("Track_ClockingRankActivity", "get cityId = ", strB, " begin to requestHotPaths");
                        jdn.e(strB);
                    }
                    ClockingRankActivity.this.ax();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ax() {
        gch.b().getCityInfoList(new gcw.a().c(RunningRouteUtils.e()).b(), new UiCallback<gda>() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.8
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.a("Track_ClockingRankActivity", "getCityInfoList failed, errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(gda gdaVar) {
                for (HotPathCityInfo hotPathCityInfo : gdaVar.e()) {
                    if (hotPathCityInfo.getCityId().equals(jdn.c())) {
                        LogUtil.d("Track_ClockingRankActivity", "hotPathCityInfo = ", hotPathCityInfo);
                        jdn.c(hotPathCityInfo);
                    }
                }
                if (!ClockingRankActivity.this.y || ClockingRankActivity.this.p) {
                    ClockingRankActivity.this.n();
                }
            }
        });
    }

    private boolean ak() {
        return this.o == RunningRouteConstants.BiFromActivity.FROM_HISTORY.getIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        jdo.b(i, str, jdn.e(), this.i, d());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        aw();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gch.b().removeLocationUpdates();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.ag.a();
        super.onDestroy();
        e = null;
    }

    public void d(boolean z) {
        if (this.s) {
            e(z);
        }
        super.finish();
    }

    @Override // com.huawei.healthcloud.plugintrack.runningroute.view.IRouteDetail
    public void show(final String str) {
        LogUtil.a("Track_ClockingRankActivity", "show pathId: ", str, " detail");
        HandlerExecutor.b(new Runnable() { // from class: jiy
            @Override // java.lang.Runnable
            public final void run() {
                this.f38666a.b(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        jdn.c(str);
        this.o = 2;
        this.y = true;
        this.u = true;
        this.ag.j();
        ay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(qon qonVar) {
        e(qonVar.a() == null ? "PositioningFailed" : null);
        boolean zEquals = jdn.a().getCityName().equals(qonVar.c());
        this.v = zEquals;
        LogUtil.a("Track_ClockingRankActivity", "mIsRouteAndUserInSameCity = ", Boolean.valueOf(zEquals));
        jdn.e(jdn.a().getCityId());
        if (jdn.f()) {
            d(jdn.c(), jdn.j());
            return;
        }
        if (this.v) {
            LogUtil.a("Track_ClockingRankActivity", "same city, mCityId = ", jdn.c());
            d(jdn.c(), jdn.i());
        } else {
            LogUtil.a("Track_ClockingRankActivity", "different city, mCityId = ", jdn.c());
            GpsPoint cityCenter = jdn.a().getCityCenter();
            if (cityCenter != null) {
                d(jdn.c(), new jpg(cityCenter.getLatitude(), cityCenter.getLongitude()));
            }
        }
        HandlerExecutor.c(new Runnable() { // from class: jin
            @Override // java.lang.Runnable
            public final void run() {
                this.f38660b.ar();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ar() {
        qsp.c((View) this.ad, 8);
    }

    public boolean f() {
        return this.y;
    }

    public void b(boolean z) {
        this.u = z;
    }

    public boolean b() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.ag.a(this.n);
        d(0, "m0");
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static class d extends UiCallback<gde> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ClockingRankActivity> f10798c;

        public d(ClockingRankActivity clockingRankActivity) {
            this.f10798c = new WeakReference<>(clockingRankActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gde gdeVar) {
            WeakReference<ClockingRankActivity> weakReference = this.f10798c;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("Track_ClockingRankActivity", "HotPathsSizeCallBack weakRef is null");
                return;
            }
            final ClockingRankActivity clockingRankActivity = this.f10798c.get();
            if (clockingRankActivity == null || clockingRankActivity.isFinishing() || clockingRankActivity.isDestroyed()) {
                LogUtil.j("Track_ClockingRankActivity", "ClockingRankActivity is finish");
                return;
            }
            if (gdeVar == null || gdeVar.b() == null) {
                qpx.e(clockingRankActivity, clockingRankActivity.getString(R.string.IDS_track_show_detail_run_route_offline));
                clockingRankActivity.finish();
                return;
            }
            gdm gdmVarB = gdeVar.b();
            clockingRankActivity.i = gdmVarB.l();
            clockingRankActivity.af = gdmVarB.g();
            clockingRankActivity.n = gdmVarB;
            if (njy.b(gdmVarB.p())) {
                clockingRankActivity.ai = gdmVarB.p().get(0);
            }
            if (clockingRankActivity.y) {
                clockingRankActivity.l();
            }
            clockingRankActivity.an = (int) gdmVarB.f();
            clockingRankActivity.a(gdmVarB, clockingRankActivity.ai);
            clockingRankActivity.e(gdeVar.e(), gdmVarB);
            clockingRankActivity.d(gdmVarB);
            if (gdmVarB.h() == 0) {
                clockingRankActivity.ae.setVisibility(8);
                clockingRankActivity.ba.setVisibility(8);
            } else {
                clockingRankActivity.ae.setVisibility(0);
                clockingRankActivity.ba.setVisibility(0);
            }
            if (gdmVarB.g() != 1) {
                clockingRankActivity.c(gdmVarB);
            } else {
                clockingRankActivity.x();
                qsp.c((View) clockingRankActivity.l, 0);
                clockingRankActivity.bi();
            }
            clockingRankActivity.f10790b.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: jje
                @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                    ClockingRankActivity.d.c(clockingRankActivity, appBarLayout, i);
                }
            });
            qsp.c((View) clockingRankActivity.ad, 8);
        }

        public static /* synthetic */ void c(ClockingRankActivity clockingRankActivity, AppBarLayout appBarLayout, int i) {
            if (clockingRankActivity.g == null || clockingRankActivity.d == null) {
                return;
            }
            clockingRankActivity.g.setIsOnTop(clockingRankActivity.d, i == 0);
            clockingRankActivity.d.setIsOnTop(i == 0);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.a("Track_ClockingRankActivity", "getHotPathDetail fail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(gdm gdmVar) {
        if (this.bg == null || this.bc == null) {
            return;
        }
        jda jdaVar = new jda(this, this.bc, this.bg);
        jdaVar.d(this.d);
        jdaVar.e(new BaseResponseCallback() { // from class: jib
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f38650b.c(i, (String) obj);
            }
        });
        jdaVar.b(this.ba);
        jdaVar.a(gdmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, String str) {
        LogUtil.a("Track_ClockingRankActivity", "activity.mIsShowPathDetail = ", Boolean.valueOf(this.y));
        if (this.y) {
            final RouteHintMvpView routeHintMvpView = new RouteHintMvpView(this);
            if (i == 0) {
                routeHintMvpView.setContent(getResources().getString(R.string.IDS_clock_rank_wait_mvp));
            } else {
                routeHintMvpView.setContent(getResources().getString(R.string.IDS_clock_rank_route_mvp));
            }
            routeHintMvpView.setHeadView(str, new BaseResponseCallback() { // from class: jhu
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.f38642c.b(routeHintMvpView, i2, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(RouteHintMvpView routeHintMvpView, int i, Object obj) {
        if (isFinishing()) {
            return;
        }
        LogUtil.a("Track_ClockingRankActivity", "setMvpMark");
        this.ag.c(routeHintMvpView);
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class c extends UiCallback<gdj> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10796b;
        private gdk d;
        private WeakReference<ClockingRankActivity> e;

        public c(ClockingRankActivity clockingRankActivity, gdk gdkVar, int i) {
            this.e = new WeakReference<>(clockingRankActivity);
            this.d = gdkVar;
            this.f10796b = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gdj gdjVar) {
            LogUtil.a("Track_ClockingRankActivity", "hotPaths: ", gdjVar.toString());
            WeakReference<ClockingRankActivity> weakReference = this.e;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("Track_ClockingRankActivity", "HotPathsSizeCallBack weakRef is null");
                return;
            }
            final ClockingRankActivity clockingRankActivity = this.e.get();
            int iB = this.d.b() + 1;
            if (iB <= this.f10796b) {
                LogUtil.a("Track_ClockingRankActivity", "Go to the next page pageIndex: ", Integer.valueOf(iB));
                this.d.c(iB);
                this.d.b(100);
                clockingRankActivity.d(this.d, this.f10796b);
            }
            final List<gdr> listC = gdjVar.c();
            if (listC == null) {
                LogUtil.a("Track_ClockingRankActivity", "hotPathOperationInfo is null");
                return;
            }
            clockingRankActivity.m.addAll(listC);
            LogUtil.a("Track_ClockingRankActivity", "hotPathOperationInfo size: ", Integer.valueOf(listC.size()));
            if (!clockingRankActivity.p) {
                clockingRankActivity.runOnUiThread(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (clockingRankActivity.y) {
                            LogUtil.a("Track_ClockingRankActivity", "is show path detail");
                        } else {
                            clockingRankActivity.ag.e(clockingRankActivity, listC);
                            clockingRankActivity.a(c.this.d.b() == 1);
                        }
                    }
                });
                return;
            }
            if (clockingRankActivity.al()) {
                jdn.c(listC.get(0).j());
                LogUtil.a("Track_ClockingRankActivity", "mCurPathId = ", jdn.e());
            }
            clockingRankActivity.ay();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.a("Track_ClockingRankActivity", "getHotPaths fail, errorCode: ", Integer.valueOf(i), ", errorInfo: ", str);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class h extends UiCallback<gdj> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<ClockingRankActivity> f10800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private jpg f10801b;
        private gdk e;

        public h(ClockingRankActivity clockingRankActivity, gdk gdkVar, jpg jpgVar) {
            this.f10800a = new WeakReference<>(clockingRankActivity);
            this.e = gdkVar;
            this.f10801b = jpgVar;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gdj gdjVar) {
            WeakReference<ClockingRankActivity> weakReference = this.f10800a;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("Track_ClockingRankActivity", "HotPathsSizeCallBack weakRef is null");
                return;
            }
            ClockingRankActivity clockingRankActivity = this.f10800a.get();
            if (gdjVar == null) {
                LogUtil.a("Track_ClockingRankActivity", "getHotPathsRsp is null");
                return;
            }
            int iD = gdjVar.d();
            if (gdjVar.e() != null && clockingRankActivity.aq != null) {
                clockingRankActivity.aq.b(gdjVar.e());
                clockingRankActivity.a();
            }
            if (clockingRankActivity.ag.d(iD)) {
                clockingRankActivity.ag.b();
                clockingRankActivity.ag.c(jdn.i());
                int iCeil = (int) Math.ceil((iD * 1.0f) / 100.0f);
                clockingRankActivity.m.clear();
                this.e.c(1);
                this.e.b(100);
                if (clockingRankActivity.al()) {
                    LogUtil.a("Track_ClockingRankActivity", "get nearest route");
                    clockingRankActivity.d(this.e, 1);
                    return;
                } else {
                    clockingRankActivity.d(this.e, iCeil);
                    jct jctVar = clockingRankActivity.aq;
                    if (clockingRankActivity.t && jctVar != null) {
                        jdo.d(jctVar.a(), clockingRankActivity.o, clockingRankActivity.al, clockingRankActivity.an);
                    }
                }
            }
            if (jdn.f()) {
                clockingRankActivity.ag.e(jdn.j());
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.a("Track_ClockingRankActivity", "errorCode: ", Integer.valueOf(i), ", errorInfo: ", str);
            WeakReference<ClockingRankActivity> weakReference = this.f10800a;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("Track_ClockingRankActivity", "HotPathsSizeCallBack weakRef is null");
                return;
            }
            ClockingRankActivity clockingRankActivity = this.f10800a.get();
            if (!jdn.f()) {
                clockingRankActivity.ag.a(this.f10801b);
            } else {
                clockingRankActivity.ag.e(jdn.j());
            }
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class b extends UiCallback<gdc> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ClockingRankActivity> f10795c;
        private jpg e;

        public b(ClockingRankActivity clockingRankActivity, jpg jpgVar) {
            this.f10795c = new WeakReference<>(clockingRankActivity);
            this.e = jpgVar;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gdc gdcVar) {
            WeakReference<ClockingRankActivity> weakReference = this.f10795c;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("Track_ClockingRankActivity", "GetCityInfoWithGpsCallBack weakRef is null");
                return;
            }
            ClockingRankActivity clockingRankActivity = this.f10795c.get();
            if (gdcVar == null || gdcVar.e() == null || TextUtils.isEmpty(gdcVar.e().getCityId())) {
                LogUtil.a("Track_ClockingRankActivity", "invalid city id");
                return;
            }
            String cityId = jdn.a().getCityId();
            if (TextUtils.isEmpty(cityId) || !cityId.equals(gdcVar.e().getCityId())) {
                jdn.c(gdcVar.e());
                jdn.e(gdcVar.e().getCityId());
                clockingRankActivity.ay();
            }
            if (jdn.f()) {
                return;
            }
            clockingRankActivity.d(gdcVar.e().getCityId(), this.e);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.a("Track_ClockingRankActivity", "getCityInfoWithGps fail, errorCode: ", Integer.valueOf(i), "errorInfo: ", str);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class e implements ICityLatLonCallBack {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ClockingRankActivity> f10799c;
        private int d;

        public e(ClockingRankActivity clockingRankActivity, int i) {
            this.f10799c = new WeakReference<>(clockingRankActivity);
            this.d = i;
        }

        @Override // com.huawei.ui.commonui.model.ICityLatLonCallBack
        public void onPointBack(qon qonVar) {
            LogUtil.a("Track_ClockingRankActivity", "addressInfo: ", qonVar == null ? Constants.NULL : qonVar.toString());
            WeakReference<ClockingRankActivity> weakReference = this.f10799c;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("Track_ClockingRankActivity", "GetCityCenterPointCallBack weakRef is null");
                return;
            }
            ClockingRankActivity clockingRankActivity = this.f10799c.get();
            if (qonVar == null) {
                LogUtil.a("Track_ClockingRankActivity", "regeocodeAddressInfo is null");
                return;
            }
            int i = this.d;
            if (i == 1) {
                LogUtil.a("Track_ClockingRankActivity", "refresh map markers");
                clockingRankActivity.c(qonVar);
            } else {
                if (i != 2) {
                    return;
                }
                LogUtil.a("Track_ClockingRankActivity", "refresh route detail address");
                qsp.b(clockingRankActivity.ak, qonVar.b());
            }
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class f extends BaseHandler<ClockingRankActivity> {
        f(ClockingRankActivity clockingRankActivity) {
            super(clockingRankActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ClockingRankActivity clockingRankActivity, Message message) {
            if (clockingRankActivity == null || message == null) {
                ReleaseLogUtil.d("Track_ClockingRankActivity", "mStartSportHandler msg is null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                clockingRankActivity.au();
            } else if (i == 2) {
                clockingRankActivity.bj();
            } else {
                if (i != 3) {
                    return;
                }
                clockingRankActivity.d(message.arg1);
            }
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class a implements IBaseResponseCallback {
        WeakReference<ClockingRankActivity> e;

        a(ClockingRankActivity clockingRankActivity) {
            this.e = new WeakReference<>(clockingRankActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 100000 && obj != null && (obj instanceof String)) {
                OperatorStatus operatorStatus = (OperatorStatus) new Gson().fromJson(CommonUtil.ac((String) obj), OperatorStatus.class);
                ClockingRankActivity clockingRankActivity = this.e.get();
                if (clockingRankActivity == null || clockingRankActivity.au == null) {
                    return;
                }
                Handler handler = clockingRankActivity.au;
                handler.removeMessages(1);
                if (operatorStatus.getTrainMonitorState() == 0) {
                    ReleaseLogUtil.d("Track_ClockingRankActivity", "device is not running");
                    handler.sendMessage(handler.obtainMessage(1));
                } else {
                    ReleaseLogUtil.d("Track_ClockingRankActivity", "MSG_SHOW_DIALOG");
                    handler.sendMessage(handler.obtainMessage(2));
                }
            }
        }
    }

    public static ClockingRankActivity e() {
        WeakReference<ClockingRankActivity> weakReference = e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
