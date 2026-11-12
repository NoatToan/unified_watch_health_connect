package com.huawei.pluginachievement.ui;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalInfo;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import com.huawei.pluginachievement.ui.views.SameTypeMedalView;
import com.huawei.ucd.helper.gles.Obj3DBufferLoadAider;
import com.huawei.ucd.medal.MedalBackType;
import com.huawei.ucd.medal.MedalView;
import com.huawei.ucd.medal.MedalViewCallback;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.lmf;
import defpackage.oru;
import defpackage.osa;
import defpackage.osb;
import defpackage.osf;
import defpackage.osz;
import defpackage.ota;
import defpackage.otl;
import defpackage.otu;
import defpackage.otv;
import defpackage.ouk;
import defpackage.oun;
import defpackage.ouo;
import defpackage.oxm;
import defpackage.pal;
import defpackage.pao;
import defpackage.par;
import defpackage.pas;
import defpackage.paw;
import defpackage.pax;
import defpackage.qid;
import defpackage.qpb;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveMedalDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f22084a;
    private String ad;
    private RelativeLayout af;
    private HealthTextView ag;
    private SameTypeMedalView ah;
    private ImageView ai;
    private HealthTextView al;
    private HealthTextView an;
    private int ao;
    private UserProfileMgrApi ap;
    private int aq;
    private HealthTextView ar;
    private HealthTextView au;
    private HealthButton ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f22085b;
    private int bc;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f22086c;
    private ImageView d;
    private float e;
    private Context h;
    private HealthTextView j;
    private CustomTitleBar k;
    private HealthScrollView l;
    private Bitmap n;
    private HiUserInfo o;
    private FrameLayout p;
    private HealthTextView q;
    private String r;
    private ImageView s;
    private int t;
    private LinearLayout u;
    private MedalView w;
    private RelativeLayout z;
    private float at = 60.0f;
    private int m = 0;
    private int ae = 0;
    private int g = 250;
    private int am = 100;
    private String f = "";
    private String aj = "";
    private String as = "";
    private String y = "";
    private String x = "";
    private String aw = "";
    private String ac = "";
    private String v = "";
    private String ak = "";
    private String aa = "";
    private String ab = "";
    private int av = 0;
    private Handler i = new d(this);

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
    }

    static class d extends BaseHandler<AchieveMedalDetailActivity> {
        d(AchieveMedalDetailActivity achieveMedalDetailActivity) {
            super(achieveMedalDetailActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AchieveMedalDetailActivity achieveMedalDetailActivity, Message message) {
            int i = message.what;
            if (i == 0) {
                if (achieveMedalDetailActivity == null || achieveMedalDetailActivity.isFinishing()) {
                    return;
                }
                achieveMedalDetailActivity.p();
                achieveMedalDetailActivity.d();
                return;
            }
            if (i == 1) {
                LogUtil.e("PLGACHIEVE_AchieveMedalDetailActivity", "Obj3DBufferLoadAider.OnLoadListener load failed");
                return;
            }
            if (i == 2) {
                if (message.obj instanceof UserInfomation) {
                    achieveMedalDetailActivity.d((UserInfomation) message.obj);
                }
            } else if (i == 3) {
                LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "MSG_GET_USER_INFO_FAIL");
            } else {
                if (i != 4) {
                    return;
                }
                achieveMedalDetailActivity.r();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isLargerThanEmui910(CommonUtil.p()) || CommonUtil.bc() || SystemInfo.j()) {
            setStatusBarColor();
        }
        getWindow().setNavigationBarColor(getResources().getColor(R.color.hw_achieve_medal_black_background));
        setContentView(R.layout.achieve_medal_single_detail);
        this.ap = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        cancelAdaptRingRegion();
        this.h = this;
        o();
        qpb.d(this.h);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    private int a(String str, boolean z) {
        MedalInfo medalInfo = pas.d().d(true).get(str);
        if (medalInfo == null) {
            return 0;
        }
        if (z) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "medalInfo getEnableResId is ", Integer.valueOf(medalInfo.getEnableResId()));
            return medalInfo.getEnableResId();
        }
        return medalInfo.getDisableResId();
    }

    private void h() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.detail_view);
        this.z = relativeLayout;
        setViewSafeRegion(false, relativeLayout);
        this.au = (HealthTextView) findViewById(R.id.medal_get_time);
        this.bc = getWindowManager().getDefaultDisplay().getWidth();
        l();
    }

    private void l() {
        Object systemService = this.h.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", "WindowManager is null!");
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        this.ao = displayMetrics.widthPixels;
        int i = displayMetrics.heightPixels;
        this.aq = i;
        LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", "width=", Integer.valueOf(this.bc), "mWindowWidth=", Integer.valueOf(this.ao), "mWindowHeight=", Integer.valueOf(i));
    }

    private void m() {
        final otl otlVarB = otl.b(BaseApplication.getContext());
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveMedalDetailActivity.4
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap(2);
                map.put("medalID", AchieveMedalDetailActivity.this.aw);
                osf osfVarB = otlVarB.b(9, map);
                osf osfVarB2 = otlVarB.b(8, map);
                if ((osfVarB instanceof MedalConfigInfo) && (osfVarB2 instanceof MedalLocation)) {
                    MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVarB;
                    MedalLocation medalLocation = (MedalLocation) osfVarB2;
                    AchieveMedalDetailActivity.this.as = medalConfigInfo.acquireMedalName();
                    AchieveMedalDetailActivity.this.ac = medalLocation.acquireGainedCount() >= 1 ? "true" : "false";
                    AchieveMedalDetailActivity.this.v = medalLocation.acquireMedalGainedTime();
                    AchieveMedalDetailActivity.this.t = medalLocation.acquireGainedCount();
                    AchieveMedalDetailActivity.this.ak = medalConfigInfo.acquireMedalType() + "_" + medalConfigInfo.acquireMedalLevel();
                    AchieveMedalDetailActivity.this.x = medalConfigInfo.acquireMedalType();
                    if ("false".equals(AchieveMedalDetailActivity.this.ac)) {
                        AchieveMedalDetailActivity.this.aa = medalConfigInfo.acquireGrayPromotionName();
                        AchieveMedalDetailActivity.this.ab = medalConfigInfo.acquireGrayPromotionUrl();
                        AchieveMedalDetailActivity.this.y = medalConfigInfo.acquireGrayDescription();
                    } else {
                        AchieveMedalDetailActivity.this.aa = medalConfigInfo.acquireLightPromotionName();
                        AchieveMedalDetailActivity.this.ab = medalConfigInfo.acquireLightPromotionUrl();
                        AchieveMedalDetailActivity.this.y = medalConfigInfo.acquireLightDescription();
                    }
                    if (!TextUtils.isEmpty(AchieveMedalDetailActivity.this.ad)) {
                        AchieveMedalDetailActivity.this.c(medalConfigInfo.acquireMedalLabel(), medalLocation.acquireSecondTabDesc(), AchieveMedalDetailActivity.this.ad);
                    }
                    AchieveMedalDetailActivity.this.i.sendEmptyMessage(0);
                }
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str, String str2) {
        HashMap map = new HashMap(8);
        map.put("click", 1);
        map.put("name", this.as);
        map.put("className", str);
        map.put("type", this.x);
        map.put("label", Integer.valueOf(i));
        map.put("from", str2);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_REPORT_1100010.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!TextUtils.isEmpty(this.y) && !TextUtils.isEmpty(this.as)) {
            String strReplace = this.y.replace("/n", System.lineSeparator());
            this.y = strReplace;
            this.al.setText(strReplace);
            this.j.setText(this.as);
        }
        String strE = e(this.y, this.x, this.t, this.v);
        this.r = strE;
        if (!TextUtils.isEmpty(strE)) {
            this.au.setText(this.r);
        }
        e(this.aa, this.ab);
        d(this.ac, this.ak);
        n();
        a();
    }

    private void o() {
        h();
        Intent intent = getIntent();
        if (intent != null) {
            c(intent);
            UserInfomation userInfo = this.ap.getUserInfo();
            if (userInfo != null) {
                this.aj = pax.a(userInfo.getName());
            }
            this.at = pao.e(this.h, this.at);
            this.g = pao.e(this.h, this.g);
            this.am = pao.e(this.h, this.am);
            LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", "positionY=", Float.valueOf(this.at));
            this.af = (RelativeLayout) findViewById(R.id.detail_layout);
            this.ax = (HealthButton) findViewById(R.id.promotion_button);
            this.al = (HealthTextView) findViewById(R.id.medal_desc);
            this.j = (HealthTextView) findViewById(R.id.medal_content);
            this.r = e(this.y, this.x, this.t, this.v);
            CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.medal_titlebar);
            this.k = customTitleBar;
            customTitleBar.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.sug_ic_share), qre.f(R.string.accessibility_share));
            this.k.setRightButtonOnClickListener(new View.OnClickListener() { // from class: oxu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f44966b.b(view);
                }
            });
            this.k.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: oxw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(view);
                }
            });
            this.k.setLeftButtonVisibility(0);
            this.k.setRightButtonVisibility(0);
            if (LanguageUtil.ba(this.h)) {
                this.k.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_back_white_reverse), qre.f(R.string.accessibility_go_back));
                this.k.setRightButtonDrawable(qqz.e(this.h, R.drawable.sug_ic_share), qre.f(R.string.accessibility_share));
            } else {
                this.k.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_back_white), qre.f(R.string.accessibility_go_back));
                this.k.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.sug_ic_share), qre.f(R.string.accessibility_share));
            }
            this.k.setTitleTextColor(getResources().getColor(R.color.emui_color_text_primary_dark));
            this.k.setTitleText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_medal_detail));
            e(this.aa, this.ab);
            d(this.ac, this.ak);
            e();
            k();
            return;
        }
        finish();
    }

    public /* synthetic */ void b(View view) {
        if (qrs.r()) {
            return;
        }
        if (PermissionUtil.a()) {
            q();
        } else {
            PermissionUtil.d(this.h, PermissionUtil.PermissionType.STORAGE, new CustomPermissionAction(this.h) { // from class: com.huawei.pluginachievement.ui.AchieveMedalDetailActivity.5
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    AchieveMedalDetailActivity.this.q();
                }
            });
        }
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    private void k() {
        HealthScrollView healthScrollView = (HealthScrollView) findViewById(R.id.hsv_scrollView);
        this.l = healthScrollView;
        healthScrollView.setScrollViewIntercepts(false);
        this.l.setScrollOnlyVertical(true);
        this.l.setIsForceScrollListener(true);
        this.l.setScrollViewListener(new ScrollViewListener() { // from class: oxr
            @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
            public final void onScrollChanged(HealthScrollView healthScrollView2, int i, int i2, int i3, int i4) {
                this.e.d(healthScrollView2, i, i2, i3, i4);
            }
        });
    }

    public /* synthetic */ void d(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
        MedalView medalView = this.w;
        if (medalView == null) {
            return;
        }
        medalView.setTouchRect(new Rect(this.m, this.am - i2, this.ae, (this.aq - this.g) - i2));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "onNewIntent");
        if (TextUtils.isEmpty(this.aw) || otu.d(1000)) {
            return;
        }
        int intExtra = intent.getIntExtra("from", 0);
        String stringExtra = intent.getStringExtra("real_from");
        if (intExtra == 0 || !"4".equals(stringExtra)) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("medal_res_id");
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "onNewIntent medalId:", this.aw, " newMedalId:", stringExtra2);
        if (this.aw.equals(stringExtra2)) {
            return;
        }
        finish();
        oru.a(BaseApplication.getContext()).e(BaseApplication.getContext(), stringExtra2, stringExtra);
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra("medal_res_id");
        this.aw = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        otv.d(this.aw);
        this.y = intent.getStringExtra("medal_des_id");
        this.as = intent.getStringExtra("medal_content_id");
        this.ac = intent.getStringExtra("medal_obtain_id");
        this.v = intent.getStringExtra("medal_gain_time");
        this.t = intent.getIntExtra("medal_gain_count", 0);
        this.ak = intent.getStringExtra("medal_type_level");
        this.x = intent.getStringExtra("medal_type");
        this.aa = intent.getStringExtra("promotion_name");
        this.ab = intent.getStringExtra("promotion_url");
        this.ad = intent.getStringExtra("real_from");
        if (intent.getIntExtra("from", 0) != 0) {
            m();
        } else if (!intent.getBooleanExtra("KEY_IS_SAME_TYPE_MEDAL_VIEW", false)) {
            d();
        }
        this.f22085b = intent.getFloatExtra("click_x", (this.bc / 2.0f) - 150.0f) + pao.e(this.h, 16.0f);
        this.e = intent.getFloatExtra("click_y", 700.0f) + pao.e(this.h, 65.0f);
    }

    private void e(String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.ax.setVisibility(8);
            return;
        }
        if (!str2.contains("pullfrom=medal") && str2.contains("?")) {
            str2 = str2 + "&pullfrom=medal";
        }
        LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", "initPromotionButton url:", str2);
        this.ax.setVisibility(0);
        this.ax.setText(str);
        this.ax.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveMedalDetailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (str2.startsWith("huaweihealth") || str2.startsWith("huaweischeme") || str2.startsWith("geo:") || str2.startsWith("mailto:") || str2.startsWith(KakaConstants.SCHEME_TEL)) {
                    try {
                        Intent intent = new Intent();
                        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                        intent.setFlags(268435456);
                        intent.setData(Uri.parse(str2));
                        AchieveMedalDetailActivity.this.a(intent);
                        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "jump to scheme view");
                        return;
                    } catch (ActivityNotFoundException e2) {
                        LogUtil.e("PLGACHIEVE_AchieveMedalDetailActivity", e2.getMessage());
                        return;
                    }
                }
                Intent intent2 = new Intent();
                intent2.setClassName(BaseApplication.getAppPackage(), "com.huawei.operation.activity.WebViewActivity");
                intent2.putExtra("url", str2);
                intent2.putExtra("EXTRA_BI_ID", "");
                intent2.putExtra("EXTRA_BI_NAME", "");
                intent2.putExtra("EXTRA_BI_SOURCE", "Medal_Promotion");
                AchieveMedalDetailActivity.this.startActivity(intent2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
        startActivity(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "onConfigurationChanged()");
        l();
        d(this.ac, this.ak);
    }

    private void f() {
        RelativeLayout relativeLayout;
        MedalView medalView;
        if (!t() || (relativeLayout = this.af) == null || (medalView = this.w) == null) {
            return;
        }
        relativeLayout.removeView(medalView);
        this.w = null;
    }

    private void j() {
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setImageResource(R.color.common_transparent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "showWithAnimatorFail!");
        i();
        u();
    }

    private void i() {
        MedalView medalView;
        RelativeLayout relativeLayout = this.af;
        if (relativeLayout == null || (medalView = this.w) == null) {
            return;
        }
        relativeLayout.removeView(medalView);
        this.w = null;
    }

    private void u() {
        ImageView imageView = this.s;
        if (imageView == null) {
            return;
        }
        Bitmap bitmap = this.n;
        if (bitmap == null) {
            imageView.setImageResource(this.av);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    private void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.p = (FrameLayout) findViewById(R.id.medal_framelayout);
        this.s = (ImageView) findViewById(R.id.medal_pic_imageview);
        Bitmap bitmapA = pax.a(this.aw, false, false);
        this.n = pax.a(this.aw, true, false);
        if (TextUtils.equals(str, "false")) {
            c(bitmapA, str2);
            return;
        }
        this.av = a(str2, true);
        String strC = osz.e(osa.e(this.h, "_medalTextureDownload"), this.aw, this.x) ? osz.c(this.aw) : "";
        if (t() || "".equals(strC) || !ouk.a(this.h, this.aw)) {
            LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", "STATIC IMG");
            f();
            if (!osz.a(this.aw)) {
                otl.b(BaseApplication.getContext()).b(this.aw);
            }
            Bitmap bitmap = this.n;
            if (bitmap == null) {
                this.s.setImageResource(this.av);
                return;
            } else {
                this.s.setImageBitmap(bitmap);
                return;
            }
        }
        LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", "3D medal");
        j();
        if (!a(strC)) {
            Bitmap bitmap2 = this.n;
            if (bitmap2 == null) {
                this.s.setImageResource(this.av);
                return;
            } else {
                this.s.setImageBitmap(bitmap2);
                return;
            }
        }
        this.z.setAlpha(0.0f);
        this.z.setVisibility(0);
        new Handler().postDelayed(new Runnable() { // from class: oxs
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        }, 800L);
        s();
    }

    public /* synthetic */ void c() {
        this.z.animate().alpha(1.0f).setDuration(500L).setListener(null);
    }

    private void s() {
        int iD;
        HealthTextView healthTextView = this.j;
        if (healthTextView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = healthTextView.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (qrs.ah(this.h) && qrs.k() == 1) {
                iD = qrs.d(this.h, 280.0f);
            } else {
                iD = qrs.d(this.h, 130.0f);
            }
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "setMedalContentForPad: topMargin -> " + iD);
            layoutParams2.topMargin = Math.max(iD, 50);
            this.j.setLayoutParams(layoutParams2);
        }
    }

    private boolean t() {
        boolean zIsInMultiWindowMode = isInMultiWindowMode();
        g();
        b();
        return zIsInMultiWindowMode;
    }

    private void g() {
        if (isInMultiWindowMode()) {
            a(getResources().getDimensionPixelSize(R.dimen.hw_show_size_170_dp), getResources().getDimensionPixelSize(R.dimen.hw_show_size_170_dp));
        }
    }

    private void b() {
        if (EnvironmentInfo.m()) {
            a(getResources().getDimensionPixelSize(R.dimen.hw_show_size_170_dp), getResources().getDimensionPixelSize(R.dimen.hw_show_size_170_dp));
        }
    }

    private void a(int i, int i2) {
        if (this.s != null) {
            this.s.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        }
    }

    private void c(Bitmap bitmap, String str) {
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "obtain status is false");
        if (bitmap == null) {
            this.s.setImageResource(a(str, false));
        } else {
            this.s.setImageBitmap(bitmap);
        }
        this.k.setRightButtonVisibility(4);
        this.au.setVisibility(4);
        b();
    }

    private String e(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return "";
        }
        try {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "setGainTime medal_time = ", str3);
            String strA = UnitUtil.a(new Date(Long.parseLong(str3)), 20);
            this.f = strA;
            return a(str, str2, i, strA);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveMedalDetailActivity", "setGainTime NumberFormatException");
            return "";
        }
    }

    private String a(String str, String str2, int i, String str3) {
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "setGainTime name=", str, " type=", str2, " gainCount=", Integer.valueOf(i), " timeStr=", str3);
        if (i > 1 && pax.n(str2)) {
            return getResources().getQuantityString(R.plurals.IDS_plugin_achievement_tab_get_medals_date, i, str3, Integer.valueOf(i));
        }
        return String.format(getResources().getString(R.string.IDS_plugin_achievement_tab_people_get_medal_date), str3);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", " enter onDestroy");
        MedalView medalView = this.w;
        if (medalView != null) {
            medalView.e();
        }
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", " enter onResume");
        super.onResume();
        MedalView medalView = this.w;
        if (medalView != null) {
            medalView.onResume();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", " enter onPause");
        super.onPause();
        MedalView medalView = this.w;
        if (medalView != null) {
            medalView.onPause();
        }
    }

    private Bitmap b(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", "getBitmapFromPath: untrusted -> " + str);
            return null;
        }
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        if (!new File(strC).exists()) {
            LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", "getBitmapFromPath: file not exists");
            return null;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strC);
        if (bitmapDecodeFile == null) {
            LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", " bitmap is null");
        }
        return bitmapDecodeFile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.huawei.pluginachievement.ui.AchieveMedalDetailActivity] */
    private boolean a(String str) throws Throwable {
        Throwable th;
        ?? r10;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        ?? r11;
        FileInputStream fileInputStream4;
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", "initMedal: untrusted -> " + str);
            return false;
        }
        String str2 = CommonUtil.c(str) + File.separator;
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", "initMedal: path is empty");
            return false;
        }
        StringBuilder sb = new StringBuilder(str2);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder sb3 = new StringBuilder(str2);
        StringBuilder sb4 = new StringBuilder(str2);
        sb.append("medal.tST");
        ?? string = sb.toString();
        sb2.append("medal.nXYZ");
        String string2 = sb2.toString();
        sb3.append("medal.vXYZ");
        String string3 = sb3.toString();
        sb4.append("texture.jpg");
        Bitmap bitmapB = b(sb4.toString());
        FileInputStream fileInputStream5 = null;
        try {
            try {
                fileInputStream3 = new FileInputStream((String) string);
                try {
                    fileInputStream2 = new FileInputStream(string2);
                    try {
                        FileInputStream fileInputStream6 = new FileInputStream(string3);
                        try {
                            b(fileInputStream3, fileInputStream2, fileInputStream6, bitmapB);
                            b(fileInputStream3, fileInputStream2, fileInputStream6);
                            return true;
                        } catch (FileNotFoundException unused) {
                            fileInputStream5 = fileInputStream6;
                            LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", " close InputStream is exception");
                            string = fileInputStream2;
                            b(fileInputStream3, string, fileInputStream5);
                            return false;
                        } catch (Exception unused2) {
                            fileInputStream5 = fileInputStream6;
                            LogUtil.e("PLGACHIEVE_AchieveMedalDetailActivity", "3D view load exception!");
                            string = fileInputStream2;
                            b(fileInputStream3, string, fileInputStream5);
                            return false;
                        } catch (OutOfMemoryError unused3) {
                            fileInputStream5 = fileInputStream6;
                            LogUtil.e("PLGACHIEVE_AchieveMedalDetailActivity", "Obj3DBufferLoadAider.loadFromInputStream OutOfMemoryError");
                            string = fileInputStream2;
                            b(fileInputStream3, string, fileInputStream5);
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream5 = fileInputStream6;
                            fileInputStream4 = fileInputStream2;
                            fileInputStream = fileInputStream5;
                            r11 = fileInputStream4;
                            fileInputStream5 = fileInputStream3;
                            r10 = r11;
                            b(fileInputStream5, r10, fileInputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException unused4) {
                    } catch (Exception unused5) {
                    } catch (OutOfMemoryError unused6) {
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream4 = fileInputStream2;
                    }
                } catch (FileNotFoundException unused7) {
                    fileInputStream2 = null;
                } catch (Exception unused8) {
                    fileInputStream2 = null;
                } catch (OutOfMemoryError unused9) {
                    fileInputStream2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream4 = null;
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = fileInputStream5;
                r11 = string;
            }
        } catch (FileNotFoundException unused10) {
            fileInputStream2 = null;
            fileInputStream3 = null;
        } catch (Exception unused11) {
            fileInputStream2 = null;
            fileInputStream3 = null;
        } catch (OutOfMemoryError unused12) {
            fileInputStream2 = null;
            fileInputStream3 = null;
        } catch (Throwable th6) {
            th = th6;
            r10 = 0;
            fileInputStream = null;
            b(fileInputStream5, r10, fileInputStream);
            throw th;
        }
    }

    private void b(final InputStream inputStream, final InputStream inputStream2, final InputStream inputStream3, final Bitmap bitmap) {
        qid.b(new WeakReference(new ota()));
        new Obj3DBufferLoadAider().a(BaseApplication.getContext(), inputStream, inputStream2, inputStream3, new Obj3DBufferLoadAider.OnLoadListener() { // from class: com.huawei.pluginachievement.ui.AchieveMedalDetailActivity.3
            @Override // com.huawei.ucd.helper.gles.Obj3DBufferLoadAider.OnLoadListener
            public void onLoadOK(Obj3DBufferLoadAider.b bVar) {
                AchieveMedalDetailActivity.this.e(bitmap, bVar);
                AchieveMedalDetailActivity.this.b(inputStream, inputStream2, inputStream3);
            }

            @Override // com.huawei.ucd.helper.gles.Obj3DBufferLoadAider.OnLoadListener
            public void onLoadFailed(String str) {
                AchieveMedalDetailActivity.this.i.sendEmptyMessage(1);
                AchieveMedalDetailActivity.this.b(inputStream, inputStream2, inputStream3);
                LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", " onLoadFailed msg=", str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final Bitmap bitmap, final Obj3DBufferLoadAider.b bVar) {
        if (bVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", " onLoadOK result is null");
            runOnUiThread(new oxm(this));
        } else {
            LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", " onLoadOK result=", bVar.toString());
            runOnUiThread(new Runnable() { // from class: oxv
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(bitmap, bVar);
                }
            });
        }
    }

    public /* synthetic */ void d(Bitmap bitmap, Obj3DBufferLoadAider.b bVar) {
        MedalView medalView = this.w;
        if (medalView != null) {
            this.af.removeView(medalView);
        }
        MedalView medalView2 = new MedalView(BaseApplication.getContext());
        this.w = medalView2;
        medalView2.setLayerType(2, null);
        this.w.setBackContent(new String[]{StringUtils.c((Object) this.aj), this.f}, MedalBackType.ModelType.SOLID_CIRCLE, MedalBackType.ColorType.GOLD);
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "loadFromInputStream setTexture.");
        this.w.setTexture(bitmap, new MedalViewCallback() { // from class: oxt
            @Override // com.huawei.ucd.medal.MedalViewCallback
            public final void onResponse(int i, String str) {
                this.f44965b.d(i, str);
            }
        });
        if (qrs.ab(this.h)) {
            int[] iArr = new int[2];
            this.p.getLocationOnScreen(iArr);
            int i = iArr[0];
            this.m = i;
            this.ae = i + this.ao;
            this.w.setTouchRect(new Rect(this.m, this.am, this.ae, this.aq - this.g));
        } else {
            this.m = 0;
            this.ae = this.ao;
            this.w.setTouchRect(new Rect(this.m, this.am, this.ae, this.aq - this.g));
        }
        this.w.setObjData(bVar);
        this.w.setAnimatorScaleX(0.02f, 0.08f);
        this.w.setAnimatorScaleY(0.02f, 0.08f);
        this.w.setAnimatorRotationY(0.0f, 360.0f);
        this.w.setAnimatorPositionX(this.f22085b, this.ao / 2.0f);
        this.w.setAnimatorPositionY(this.e, (this.aq / 3.0f) + this.at);
        this.w.setAnimatorDuration(1000L);
        ViewGroup.LayoutParams layoutParams = this.af.getLayoutParams();
        layoutParams.height = this.aq;
        this.af.setLayoutParams(layoutParams);
        this.af.setVisibility(0);
        this.af.addView(this.w);
        this.w.b();
    }

    public /* synthetic */ void d(int i, String str) {
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "loadFromInputStream Id=", this.aw, " code=", Integer.valueOf(i), " res=", str);
        if (i == -1) {
            runOnUiThread(new oxm(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InputStream inputStream, InputStream inputStream2, InputStream inputStream3) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("PLGACHIEVE_AchieveMedalDetailActivity", " InpuStream tst close exception!");
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
                LogUtil.e("PLGACHIEVE_AchieveMedalDetailActivity", " InputStream nxy close exception!");
            }
        }
        if (inputStream3 != null) {
            try {
                inputStream3.close();
            } catch (IOException unused3) {
                LogUtil.e("PLGACHIEVE_AchieveMedalDetailActivity", " InputStream xyz close exception!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (!osb.c(this.h)) {
            paw.a(this.h);
            return;
        }
        if (oun.d(1) && osb.d()) {
            this.f22084a.setVisibility(0);
        } else {
            this.f22084a.setVisibility(4);
        }
        if (oru.a(BaseApplication.getContext()).getAdapter() == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "adapter is null");
            return;
        }
        HashMap map = new HashMap(2);
        map.put("name", this.as);
        map.put("className", this.x);
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "shareMedal: shotScreen");
        Bitmap bitmapC = ouo.c(this.f22086c);
        if (bitmapC == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "screenCut is null");
        } else {
            osb.c(this.h, bitmapC, AnalyticsValue.SUCCESSES_SHARE_1100011.value(), map);
        }
        if (oru.b()) {
            lmf lmfVarD = lmf.d();
            map.put("type", 12);
            lmfVarD.c(this.h, AnalyticsValue.SUCCESSES_SHARE_1100011.value(), map, 0);
        }
    }

    public void e() {
        this.u = (LinearLayout) findViewById(R.id.medal_theme_layout);
        this.f22086c = (LinearLayout) findViewById(R.id.before_layout);
        this.d = (ImageView) findViewById(R.id.head_imageview);
        this.an = (HealthTextView) findViewById(R.id.medal_share_desc);
        this.q = (HealthTextView) findViewById(R.id.medal_get_date);
        this.ag = (HealthTextView) findViewById(R.id.medal_share_content);
        this.ar = (HealthTextView) findViewById(R.id.name_textview);
        this.ai = (ImageView) findViewById(R.id.medal_imageview);
        ImageView imageView = (ImageView) findViewById(R.id.vip_image);
        this.f22084a = (LinearLayout) findViewById(R.id.account_layout);
        if (par.e()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        String str = this.y;
        if (str != null && this.as != null) {
            String strReplace = str.replace("/n", System.lineSeparator());
            this.y = strReplace;
            this.al.setText(strReplace);
            this.j.setText(this.as);
            String str2 = this.r;
            if (str2 != null) {
                this.au.setText(str2);
            }
        }
        n();
        a();
    }

    private void n() {
        Bitmap bitmapG = pax.g(this.aw);
        if (bitmapG == null) {
            this.u.setBackgroundResource(R.drawable.share_background);
        } else {
            this.u.setBackground(new BitmapDrawable((Resources) null, bitmapG));
        }
        String str = this.y;
        if (str != null && this.as != null) {
            this.an.setText(str);
            this.ag.setText(this.as);
            String str2 = this.r;
            if (str2 != null) {
                this.q.setText(str2);
            } else {
                this.q.setVisibility(4);
            }
        }
        if (pax.a(this.aw, true, false) != null) {
            this.ai.setImageBitmap(pax.a(this.aw, true, false));
        } else {
            this.ai.setImageResource(this.av);
        }
    }

    public void a() {
        y();
    }

    private void y() {
        if ("1".equals(SharedPreferenceManager.e(this.h, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN))) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "accountmigrate: isthirdlogin == 1 and return!");
            v();
        } else {
            this.ap.getUserInfo(new e(this));
        }
    }

    private void v() {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: com.huawei.pluginachievement.ui.AchieveMedalDetailActivity.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                AchieveMedalDetailActivity achieveMedalDetailActivity = AchieveMedalDetailActivity.this;
                achieveMedalDetailActivity.o = pal.d(obj, achieveMedalDetailActivity.o, AchieveMedalDetailActivity.this.i, 4);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "fetchUserData onFailure");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(UserInfomation userInfomation) {
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "handleWhenGetUserInfoSuccess");
        if (userInfomation != null) {
            String name = userInfomation.getName();
            if (TextUtils.isEmpty(name)) {
                LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", "handleWhenGetUserInfoSuccess: name is empty");
                this.ar.setText(osb.b());
                String accountName = new UpApi(this.h).getAccountName();
                if (accountName != null) {
                    e(accountName);
                }
            } else {
                this.ar.setText(name);
                e(name);
            }
            String picPath = userInfomation.getPicPath();
            if (!TextUtils.isEmpty(picPath)) {
                Bitmap bitmapA = qqf.a(this.h, picPath);
                if (bitmapA != null) {
                    this.d.setImageBitmap(bitmapA);
                    return;
                } else {
                    c(userInfomation);
                    LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "handleWhenGetUserInfoSuccess() btimap is null");
                    return;
                }
            }
            LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", "handle", "WhenGetUserInfoSuccess! headImgPath is null! ");
            this.d.setImageResource(R.mipmap.ic_personal_head);
            return;
        }
        LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", "handleWhenGetUserInfoSuccess! userinfo is null! ");
    }

    private void e(String str) {
        if (!TextUtils.isEmpty(this.aj)) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "userName not empty ");
        } else {
            this.aj = pax.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "setUserNameFromLocal");
        HiUserInfo hiUserInfo = this.o;
        if (hiUserInfo == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "accountmigrate: setUserNameFromLocal mHiUserInfo == null");
            return;
        }
        this.ar.setText(TextUtils.isEmpty(hiUserInfo.getName()) ? osb.b() : this.o.getName());
        String headImgUrl = this.o.getHeadImgUrl();
        LogUtil.d("PLGACHIEVE_AchieveMedalDetailActivity", "accountfilepath = ", BaseApplication.getContext().getFilesDir(), "/photos/headimage");
        String strC = c(headImgUrl);
        if (!TextUtils.isEmpty(strC)) {
            Bitmap bitmapA = qqf.a(BaseApplication.getContext(), strC);
            if (bitmapA != null) {
                this.d.setImageBitmap(bitmapA);
                return;
            } else {
                LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", "setUserNameFromLocal: bmp is null");
                return;
            }
        }
        this.d.setImageResource(R.mipmap.ic_personal_head);
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "accountmigrate: setUserNameFromLocal() headImgPath is null! ");
    }

    private void c(UserInfomation userInfomation) {
        if (userInfomation.getPortraitUrl() == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "it's so terrible, as missing the headImage url, we can do nothing!");
        }
    }

    private String c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split(File.separator);
        if (strArrSplit.length > 0) {
            str2 = this.h.getFilesDir() + "/photos/headimage/" + strArrSplit[strArrSplit.length - 1];
        } else {
            str2 = this.h.getFilesDir() + "/photos/headimage/" + str;
        }
        if (new File(str2).exists()) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "accountmigrate: getHeadImageFromLocal file.exists() yes");
            return str2;
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "accountmigrate: getHeadImageFromLocal file.exists() no");
        File[] fileArrListFiles = new File(this.h.getFilesDir() + "/photos/headimage").listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return str2;
        }
        try {
            return fileArrListFiles[fileArrListFiles.length - 1].getCanonicalPath();
        } catch (IOException unused) {
            return "";
        }
    }

    static class e implements BaseResponseCallback<UserInfomation> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<AchieveMedalDetailActivity> f22094b;

        e(AchieveMedalDetailActivity achieveMedalDetailActivity) {
            this.f22094b = new WeakReference<>(achieveMedalDetailActivity);
        }

        @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, UserInfomation userInfomation) {
            AchieveMedalDetailActivity achieveMedalDetailActivity = this.f22094b.get();
            if (achieveMedalDetailActivity == null || achieveMedalDetailActivity.isFinishing()) {
                return;
            }
            if (i != 0) {
                achieveMedalDetailActivity.i.sendEmptyMessage(3);
                return;
            }
            if (userInfomation == null) {
                LogUtil.j("PLGACHIEVE_AchieveMedalDetailActivity", "get userinfo success but obtain null objData");
                achieveMedalDetailActivity.i.sendEmptyMessage(3);
            } else {
                Message messageObtain = Message.obtain();
                messageObtain.obj = userInfomation;
                messageObtain.what = 2;
                achieveMedalDetailActivity.i.sendMessage(messageObtain);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void d() {
        if (!pax.o(this.x)) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "showSameTypeMedalView: Not the Perfect Moon Medal! medalType -> " + this.x);
        } else {
            if (this.ah == null) {
                this.ah = (SameTypeMedalView) findViewById(R.id.view_sameTypeMedalView);
            }
            LogUtil.a("PLGACHIEVE_AchieveMedalDetailActivity", "showSameTypeMedalView: medalId -> " + this.aw);
            this.ah.e(this.aw, this.x, false);
        }
    }
}
