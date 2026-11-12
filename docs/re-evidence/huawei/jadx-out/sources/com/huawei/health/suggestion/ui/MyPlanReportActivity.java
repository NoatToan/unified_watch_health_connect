package com.huawei.health.suggestion.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.model.UserInfomation;
import defpackage.btt;
import defpackage.buh;
import defpackage.gxt;
import defpackage.gzx;
import defpackage.lmf;
import defpackage.lsv;
import defpackage.pdx;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class MyPlanReportActivity extends BaseStateActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MyPlanReportActivity f8991a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8993c;
    private Context e;
    private int f;
    private RelativeLayout g;
    private ImageView h;
    private RunPlanReportDisplayFragment i;
    private ImageView j;
    private HealthTextView k;
    private HealthTextView l;
    private RelativeLayout m;
    private RelativeLayout o;
    private CustomTitleBar p;
    private long q;
    private pdx r;
    private LinearLayout t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f8992b = new b(this);
    private Bitmap d = null;
    private Bitmap n = null;

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
    }

    class b extends BaseHandler<MyPlanReportActivity> {
        b(MyPlanReportActivity myPlanReportActivity) {
            super(myPlanReportActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MyPlanReportActivity myPlanReportActivity, Message message) {
            if (message == null) {
                LogUtil.e("Track_MyPlanReportActivity", "MyPlanReportHandler message null");
                return;
            }
            int i = message.what;
            if (i == 0) {
                MyPlanReportActivity.this.l();
            } else {
                if (i != 1) {
                    return;
                }
                MyPlanReportActivity.this.i.d(MyPlanReportActivity.this.r);
                MyPlanReportActivity.this.findViewById(R.id.sug_run_report_title_bar).setVisibility(0);
                MyPlanReportActivity.this.a(true);
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Track_MyPlanReportActivity", "onCreate");
        clearBackgroundDrawable();
        this.q = System.currentTimeMillis();
        buh.d("showReportTime", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("Track_MyPlanReportActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout == null) {
            LogUtil.j("Track_MyPlanReportActivity", "updateRootViewBackground mRootView null");
        } else if (z) {
            relativeLayout.setBackgroundColor(qre.e(R.color.transparent));
        } else {
            relativeLayout.setBackgroundColor(qre.e(R.color.colorSubBackground));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.l.setText(this.r.f());
        this.k.setText(gzx.c(this.e, R.string.IDS_hw_health_coresleep_standard_range_1, e(this.r.l(), this.r.n()), e(this.r.a(), this.r.d())));
        a(this.r.e(), this.r.c());
        this.o.setVisibility(8);
        this.i.d(this.r);
    }

    private String e(String str, long j) {
        if (j > 0) {
            return UnitUtil.d("yyyy/MM/dd", j * 1000);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        LogUtil.a("Track_MyPlanReportActivity", "timeFormat timeString before:", str);
        try {
            long time = ((Date) Objects.requireNonNull(simpleDateFormat.parse(str))).getTime();
            LogUtil.a("Track_MyPlanReportActivity", "timeFormat time:", Long.valueOf(time));
            if (time > 0) {
                str = UnitUtil.d("yyyy/MM/dd", time);
            }
        } catch (ParseException e2) {
            LogUtil.e("Track_MyPlanReportActivity", LogAnonymous.b(e2));
        }
        LogUtil.a("Track_MyPlanReportActivity", "timeString after:", str);
        return str;
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("Track_MyPlanReportActivity", "setRunReportBackground url null");
        } else if (qrs.af(this)) {
            qqf.b(str, this.j, 0);
        } else {
            qqf.b(str2, this.j, 0);
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        this.f8991a = this;
        this.e = this;
        if (!CommonUtil.ab(this)) {
            qrs.e(this.e, MyPlanReportActivity.class.getName(), a(), false);
            finish();
            return;
        }
        setContentView(R.layout.sug_run_report_activity);
        d();
        cancelAdaptRingRegion();
        i();
        b();
    }

    private void b() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.e);
        builder.b(R.string.IDS_sug_oversea_run_plan_tip);
        builder.a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.MyPlanReportActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_MyPlanReportActivity", "run plan language tips");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        boolean z = LanguageUtil.o(this.e) || LanguageUtil.q(this.e);
        if (noTitleCustomAlertDialogC.isShowing() || z) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    private String a() {
        return this.e.getResources().getString(R.string.IDS_sug_ai_run_plan_report);
    }

    private void i() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentById(R.id.frag_sug_report_list) == null) {
            this.i = new RunPlanReportDisplayFragment();
            fragmentTransactionBeginTransaction.add(R.id.frag_sug_report_list, this.i);
            fragmentTransactionBeginTransaction.commit();
        } else if (supportFragmentManager.findFragmentById(R.id.frag_sug_report_list) instanceof RunPlanReportDisplayFragment) {
            this.i = (RunPlanReportDisplayFragment) supportFragmentManager.findFragmentById(R.id.frag_sug_report_list);
        }
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.sug_run_report_title_bar);
        this.p = customTitleBar;
        customTitleBar.setRightButtonVisibility(0);
        if (LanguageUtil.ba(this)) {
            this.p.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_health_nav_share_black_rt), qre.f(R.string.accessibility_share));
        } else {
            this.p.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        this.p.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.MyPlanReportActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MyPlanReportActivity.this.c();
            }
        });
        this.p.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: heq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36692a.a(view);
            }
        });
        this.l = (HealthTextView) findViewById(R.id.report_name);
        this.k = (HealthTextView) findViewById(R.id.report_time);
        this.j = (ImageView) findViewById(R.id.report_background);
        this.o = (RelativeLayout) findViewById(R.id.sug_report_loading_layout);
        this.h = (ImageView) findViewById(R.id.report_bg);
        this.m = (RelativeLayout) findViewById(R.id.share_report_layout);
        this.t = (LinearLayout) findViewById(R.id.report_user_layout);
        f();
        h();
        g();
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    private void f() {
        if (this.f != IntPlan.PlanType.AI_RUN_PLAN.getType()) {
            return;
        }
        int i = R.drawable.repo_bg;
        if (Utils.o()) {
            i = R.drawable.repo_bg_oversea;
        }
        if (qrs.af(this)) {
            i = R.drawable.repo_bg_wide;
        }
        if (LanguageUtil.ba(this)) {
            this.j.setBackground(qqz.e(this, i));
        } else {
            this.j.setBackgroundResource(i);
        }
    }

    private void h() {
        ((HealthScrollView) findViewById(R.id.scroll_view)).c(new HealthScrollView.ScrollChangeToBoundaryListener() { // from class: com.huawei.health.suggestion.ui.MyPlanReportActivity.4
            @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
            public void onScrollStateChange(int i) {
            }

            @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
            public void onScrolledToBottom() {
            }

            @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
            public void onScrolledTop() {
            }

            @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
            public void onScrollToChangeAlpha(float f) {
                if (MyPlanReportActivity.this.e == null || MyPlanReportActivity.this.p == null) {
                    return;
                }
                if (f > 0.1d) {
                    MyPlanReportActivity.this.p.setBackgroundColor(MyPlanReportActivity.this.e.getResources().getColor(R.color.colorSubBackground));
                } else {
                    MyPlanReportActivity.this.p.setBackgroundColor(MyPlanReportActivity.this.e.getResources().getColor(R.color.common_transparent));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Bitmap bitmap;
        if (this.d != null && (bitmap = this.n) != null) {
            ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(d(bitmap.copy(Bitmap.Config.ARGB_8888, true)), this.e);
            return;
        }
        this.g = (RelativeLayout) findViewById(R.id.root_view);
        a(false);
        findViewById(R.id.sug_run_report_title_bar).setVisibility(8);
        this.i.a(new UiCallback() { // from class: com.huawei.health.suggestion.ui.MyPlanReportActivity.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Track_MyPlanReportActivity", "notifyShareDataChange ", Integer.valueOf(i), "and", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(Object obj) {
                LogUtil.a("Track_MyPlanReportActivity", "screenCut success");
                MyPlanReportActivity.this.p.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.suggestion.ui.MyPlanReportActivity.5.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        MyPlanReportActivity.this.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        LogUtil.a("Track_MyPlanReportActivity", "screenCut onGlobalLayout");
                        if (MyPlanReportActivity.this.p.getVisibility() == 8) {
                            MyPlanReportActivity.this.j();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        o();
        this.d = lsv.e(this.g);
        this.h.setBackground(new BitmapDrawable(getResources(), this.d));
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.suggestion.ui.MyPlanReportActivity.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (MyPlanReportActivity.this.h.getHeight() == 0 || MyPlanReportActivity.this.h.getWidth() == 0) {
                    return;
                }
                MyPlanReportActivity.this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (MyPlanReportActivity.this.n != null) {
                    return;
                }
                MyPlanReportActivity myPlanReportActivity = MyPlanReportActivity.this;
                myPlanReportActivity.n = lsv.e(myPlanReportActivity.m);
                MyPlanReportActivity.this.a(MyPlanReportActivity.this.n != null ? MyPlanReportActivity.this.n.copy(Bitmap.Config.ARGB_8888, true) : null);
            }
        });
    }

    private void o() {
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).updateShareUserView("Track_MyPlanReportActivity", this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Bitmap bitmap) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.MyPlanReportActivity.6
            @Override // java.lang.Runnable
            public void run() {
                if (bitmap != null) {
                    ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(MyPlanReportActivity.d(bitmap), MyPlanReportActivity.this.e);
                    MyPlanReportActivity.this.f8992b.sendEmptyMessageDelayed(1, 500L);
                } else {
                    LogUtil.j("Track_MyPlanReportActivity", "screenCut is null");
                    MyPlanReportActivity.this.findViewById(R.id.sug_run_report_title_bar).setVisibility(0);
                    MyPlanReportActivity.this.a(true);
                    qpx.b(MyPlanReportActivity.this.e, R.string.IDS_motiontrack_share_fail_tip);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static gxt d(Bitmap bitmap) {
        gxt gxtVar = new gxt(1);
        gxtVar.d(bitmap);
        gxtVar.e((String) null);
        gxtVar.b((String) null);
        gxtVar.f((String) null);
        gxtVar.d(AnalyticsValue.HEALTH_SHARE_FITNESS_REPORT_SHARE_2100009.value());
        gxtVar.f(false);
        gxtVar.d(2);
        return gxtVar;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        e();
    }

    private void e() {
        if (this.f8993c == null) {
            LogUtil.j("Track_MyPlanReportActivity", "planId is null.");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Track_MyPlanReportActivity", "getMyPlanInfo : planApi is null.");
        } else {
            planApi.getTrainingReport(this.f8993c, this.f, new e(this));
        }
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("Track_MyPlanReportActivity", "initReportData intent == null");
            return;
        }
        this.f = intent.getIntExtra("plantype", IntPlan.PlanType.AI_RUN_PLAN.getType());
        String stringExtra = intent.getStringExtra("planId");
        this.f8993c = stringExtra;
        LogUtil.a("Track_MyPlanReportActivity", "getIntentData planType: ", Integer.valueOf(this.f), "mPlanId:", stringExtra);
    }

    private void g() {
        Bitmap bitmapA;
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.report_share_detail_title_usrname);
        ImageView imageView = (ImageView) findViewById(R.id.img_report_share_user_img);
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.e("Track_MyPlanReportActivity", "getUserInfo : userProfileMgrApi is null.");
            return;
        }
        healthTextView.setText(((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).getShareNickName());
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        String picPath = userInfo != null ? userInfo.getPicPath() : null;
        if (TextUtils.isEmpty(picPath) || (bitmapA = qqf.a(this.e, picPath)) == null) {
            return;
        }
        imageView.setImageBitmap(bitmapA);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Track_MyPlanReportActivity", "onDestroy");
        this.d = null;
        this.n = null;
        btt.d().c(new c((System.currentTimeMillis() - this.q) / 1000, this.r));
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        pdx f9000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f9001c;

        c(long j, pdx pdxVar) {
            this.f9001c = j;
            this.f9000b = pdxVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap(3);
            map.put("click", 1);
            pdx pdxVar = this.f9000b;
            if (pdxVar == null) {
                LogUtil.j("Track_MyPlanReportActivity", "BiRunnable run mTrainReportBean is null.");
                return;
            }
            map.put("type", Integer.valueOf((pdxVar.g() ? IntPlan.PlanType.AI_RUN_PLAN : IntPlan.PlanType.FIT_PLAN).getType()));
            String strF = this.f9000b.f();
            if (!TextUtils.isEmpty(strF)) {
                map.put("plan_name", strF);
            }
            map.put("duration", Long.valueOf(this.f9001c));
            lmf.d().c(BaseApplication.getContext(), "1120023", map, 0);
        }
    }

    class e extends UiCallback<pdx> {
        WeakReference<MyPlanReportActivity> d;

        e(MyPlanReportActivity myPlanReportActivity) {
            this.d = new WeakReference<>(myPlanReportActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Track_MyPlanReportActivity", "CurrentPlanUiCallback errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
            MyPlanReportActivity myPlanReportActivity = this.d.get();
            if (myPlanReportActivity == null) {
                LogUtil.j("Track_MyPlanReportActivity", "CurrentPlanRecordUiCallback onFailure activity is null.");
            } else {
                myPlanReportActivity.showErrorLayout();
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(pdx pdxVar) {
            MyPlanReportActivity myPlanReportActivity = this.d.get();
            if (myPlanReportActivity == null) {
                LogUtil.j("Track_MyPlanReportActivity", "CurrentPlanRecordUiCallback onSuccess activity is null.");
                return;
            }
            if (pdxVar != null) {
                pdxVar.a(MyPlanReportActivity.this.f == IntPlan.PlanType.AI_RUN_PLAN.getType());
                LogUtil.a("Track_MyPlanReportActivity", "CurrentPlanUiCallback onSuccess: ");
                myPlanReportActivity.r = pdxVar;
                myPlanReportActivity.f8992b.sendEmptyMessage(0);
                return;
            }
            LogUtil.e("Track_MyPlanReportActivity", "data is null");
            myPlanReportActivity.showErrorLayout();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
