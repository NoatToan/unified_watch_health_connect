package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MultiGridsTemplate;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.servicesui.R;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.trade.TradeViewApi;
import com.huawei.trade.datatype.TradeViewInfo;
import com.huawei.ui.commonui.dialog.PurchaseSuccessDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.stories.template.BaseActivity;
import defpackage.btt;
import defpackage.coq;
import defpackage.fxl;
import defpackage.gxt;
import defpackage.haa;
import defpackage.iov;
import defpackage.irz;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qhu;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qqt;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class SeriesCourseListActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f26705a;
    private String ac;
    private ImageView ad;
    private String ae;
    private ImageView af;
    private LinearLayout ag;
    private ImageView ah;
    private TextView ai;
    private FrameLayout aj;
    private ImageView ak;
    private Toolbar al;
    private String am;
    private RelativeLayout an;
    private View ap;
    private String aq;
    private ViewPager as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f26706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppBarLayout f26707c;
    private CoordinatorLayout d;
    private Context e;
    private LinearLayout f;
    private SleepAudioPackage g;
    private HealthTextView h;
    private ImageView i;
    private HealthTextView j;
    private int k;
    private boolean n;
    private int p;
    private View q;
    private ViewGroup r;
    private RelativeLayout s;
    private RecommendFragment t;
    private long u;
    private FragmentPagerAdapter v;
    private TabLayout w;
    private SeriesCourseListFragment y;
    private SeriesCourseSummaryFragment z;
    private volatile boolean m = false;
    private volatile boolean l = false;
    private volatile boolean o = false;
    private volatile boolean aa = false;
    private volatile boolean x = false;
    private int ab = BaseApplication.getContext().getColor(R.color.transparent);

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            this.o = true;
            if (qqs.e(this.e)) {
                this.ad.setBackground(ContextCompat.getDrawable(this.e, R.drawable.course_array_left));
                this.ab = ContextCompat.getColor(this.e, R.color.health_chart_extend_background_color);
            } else {
                this.ad.setBackground(ContextCompat.getDrawable(this.e, R.drawable.course_array_left_dark));
                this.ab = ContextCompat.getColor(this.e, R.color.health_chart_extend_background_color);
            }
            this.ai.setText(this.ae);
            o();
        } else {
            this.o = false;
            this.ad.setBackground(ContextCompat.getDrawable(this.e, R.drawable.course_array_left));
            this.ab = ContextCompat.getColor(this.e, R.color.transparent);
            this.ai.setText("");
            o();
        }
        this.al.setBackgroundColor(this.ab);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("HiH_SeriesCourseListActivity", "onCreate");
        try {
            super.onCreate(bundle);
        } catch (BadParcelableException unused) {
            LogUtil.e("HiH_SeriesCourseListActivity", "BadParcelableException for savedInstanceState");
        }
        this.e = this;
        this.n = true;
        setContentView(R.layout.series_course_list_activity);
        clearBackgroundDrawable();
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("HiH_SeriesCourseListActivity", "intent error");
            return;
        }
        this.aq = intent.getStringExtra("id");
        this.k = intent.getIntExtra("from", 0);
        LogUtil.a("HiH_SeriesCourseListActivity", "id: ", this.aq);
        if (TextUtils.isEmpty(this.aq)) {
            LogUtil.a("HiH_SeriesCourseListActivity", "mTopicId error");
            finish();
            return;
        }
        this.aj = (FrameLayout) findViewById(R.id.toast_container);
        this.d = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        this.f26707c = (AppBarLayout) findViewById(R.id.appbarlayout);
        this.ag = (LinearLayout) findViewById(R.id.title_layout);
        this.ad = (ImageView) findViewById(R.id.back_img);
        this.ai = (TextView) findViewById(R.id.title_string);
        this.af = (ImageView) findViewById(R.id.favorite_img);
        this.ah = (ImageView) findViewById(R.id.share_img);
        this.al = (Toolbar) findViewById(R.id.toolbar);
        this.an = (RelativeLayout) findViewById(R.id.top_image_layout);
        Pair<Integer, Integer> safeRegionWidth = com.huawei.ui.commonui.base.BaseActivity.getSafeRegionWidth();
        int paddingStart = this.an.getPaddingStart();
        int iIntValue = ((Integer) safeRegionWidth.first).intValue();
        int paddingEnd = this.an.getPaddingEnd();
        int iIntValue2 = ((Integer) safeRegionWidth.second).intValue();
        RelativeLayout relativeLayout = this.an;
        relativeLayout.setPadding(paddingStart - iIntValue, relativeLayout.getPaddingTop(), paddingEnd - iIntValue2, this.an.getPaddingBottom());
        this.ak = (ImageView) findViewById(R.id.head_img);
        this.h = (HealthTextView) findViewById(R.id.course_title);
        this.f26705a = (HealthTextView) findViewById(R.id.course_tag);
        this.i = (ImageView) findViewById(R.id.description_img);
        this.f = (LinearLayout) findViewById(R.id.description_layout);
        this.j = (HealthTextView) findViewById(R.id.description_text);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sub_tab_widget_for_sleep);
        this.w = tabLayout;
        tabLayout.setTabIndicatorFullWidth(false);
        this.w.setVisibility(8);
        ViewPager viewPager = (ViewPager) findViewById(R.id.series_course_list_view_pager);
        this.as = viewPager;
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.3
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                LogUtil.a("HiH_SeriesCourseListActivity", "page is selected: ", Integer.valueOf(i2));
                SeriesCourseListActivity.this.w.getTabAt(i2).select();
                haa.a(SeriesCourseListActivity.this.g, SeriesCourseListActivity.this.aa, SeriesCourseListActivity.this.x, SeriesCourseListActivity.this.ac, i2);
            }
        });
        this.w.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.12
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                LogUtil.a("HiH_SeriesCourseListActivity", "onTabSelected: ", Integer.valueOf(tab.getPosition()));
                SeriesCourseListActivity.this.as.setCurrentItem(tab.getPosition(), true);
            }
        });
        this.f26707c.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new AppBarStateChangeListener(this));
        i();
        f();
        if (c()) {
            e(this.n);
        }
        getOnBackPressedDispatcher().addCallback(new AnonymousClass22(true));
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity$22, reason: invalid class name */
    public class AnonymousClass22 extends OnBackPressedCallback {
        AnonymousClass22(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            qhu.a(SeriesCourseListActivity.this.q, new IBaseResponseCallback() { // from class: txx
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.a(i, obj);
                }
            });
        }

        public /* synthetic */ void a(int i, Object obj) {
            if (i == 0) {
                SeriesCourseListActivity.this.finish();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean z = this.n;
        if (!z) {
            e(z);
        }
        this.n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(final SleepAudioPackage sleepAudioPackage) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.21
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.f(sleepAudioPackage);
                }
            });
            return;
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "updateRecycleView, data: ", sleepAudioPackage.toString());
        SeriesCourseListFragment seriesCourseListFragment = this.y;
        if (seriesCourseListFragment != null) {
            seriesCourseListFragment.a(sleepAudioPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final SleepAudioPackage sleepAudioPackage) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.23
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.a(sleepAudioPackage);
                }
            });
        } else {
            if (sleepAudioPackage == null) {
                LogUtil.e("HiH_SeriesCourseListActivity", "data is null");
                return;
            }
            LogUtil.a("HiH_SeriesCourseListActivity", "initFragment, data: ", sleepAudioPackage.toString());
            e(sleepAudioPackage);
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SleepAudioPackage sleepAudioPackage) {
        if (sleepAudioPackage == null) {
            LogUtil.e("HiH_SeriesCourseListActivity", "data is null");
            return;
        }
        SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
        if (sleepAudioSeries == null) {
            LogUtil.j("HiH_SeriesCourseListActivity", "series is null");
            return;
        }
        c(sleepAudioPackage, sleepAudioSeries);
        if (haa.b(sleepAudioSeries)) {
            a(sleepAudioSeries);
            return;
        }
        boolean z = haa.d(sleepAudioSeries) && !haa.e(sleepAudioSeries);
        LogUtil.a("HiH_SeriesCourseListActivity", "isPag: ", Boolean.valueOf(z));
        if (z) {
            if (this.q != null) {
                LogUtil.a("HiH_SeriesCourseListActivity", "mPurchaseView has showed");
                return;
            }
            TradeViewApi tradeViewApi = (TradeViewApi) Services.d("TradeService", TradeViewApi.class);
            if (tradeViewApi == null) {
                LogUtil.j("HiH_SeriesCourseListActivity", "getVipMessages VipApi is null");
                return;
            }
            l();
            String string = Integer.toString(sleepAudioSeries.getId());
            LogUtil.j("HiH_SeriesCourseListActivity", "pay course id: ", string);
            TradeViewInfo tradeViewInfo = new TradeViewInfo(string, 12, "");
            tradeViewInfo.setButtonName(this.e.getResources().getString(com.huawei.ui.commonui.R.string.series_purchase_button_name));
            tradeViewInfo.setTrigResName(sleepAudioSeries.getName());
            if (getIntent() != null) {
                HashMap map = new HashMap(16);
                map.put(WebViewHelp.BI_KEY_PULL_FROM, getIntent().getStringExtra(WebViewHelp.BI_KEY_PULL_FROM));
                map.put("resourceId", getIntent().getStringExtra("resourceId"));
                map.put("resourceName", getIntent().getStringExtra("resourceName"));
                map.put("pullOrder", getIntent().getStringExtra("pullOrder"));
                tradeViewInfo.setBiParams(map);
            }
            View tradeView = tradeViewApi.getTradeView(this, tradeViewInfo);
            this.q = tradeView;
            LogUtil.a("HiH_SeriesCourseListActivity", "mPurchaseView: ", tradeView);
            this.aj.removeAllViews();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12, -1);
            this.aj.addView(this.q, layoutParams);
            return;
        }
        e();
    }

    private void c(SleepAudioPackage sleepAudioPackage, SleepAudioSeries sleepAudioSeries) {
        boolean z = this.n;
        if (z) {
            LogUtil.a("HiH_SeriesCourseListActivity", "checkPurchaseSuccess mIsInit:", Boolean.valueOf(z));
            return;
        }
        int purchasedStatus = sleepAudioSeries.getPurchasedStatus();
        int isVip = sleepAudioSeries.getIsVip();
        LogUtil.a("HiH_SeriesCourseListActivity", "checkPurchaseSuccess curPurchaseStatus: ", Integer.valueOf(purchasedStatus), " mPurchaseStatus ", Integer.valueOf(this.p));
        if (isVip == 2 && purchasedStatus == 1 && this.p == 2) {
            d(sleepAudioPackage, sleepAudioSeries);
            this.p = purchasedStatus;
        }
    }

    private void d(SleepAudioPackage sleepAudioPackage, SleepAudioSeries sleepAudioSeries) {
        PurchaseSuccessDialog purchaseSuccessDialogC = new PurchaseSuccessDialog.Builder(this.e).d(com.huawei.ui.commonui.R.string.IDS_go_check_my_health_course).e(sleepAudioSeries.getName()).d(sleepAudioSeries.getImgIcon()).a(e(sleepAudioPackage, sleepAudioSeries)).b(new d(this)).b(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.25
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SeriesCourseListActivity.this.a(z);
            }
        }).c(new View.OnClickListener() { // from class: txs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49762b.c(view);
            }
        }).c();
        a(true);
        purchaseSuccessDialogC.show();
    }

    public /* synthetic */ void c(View view) {
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext(), "com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity");
        intent.putExtra("titleName", this.e.getString(com.huawei.ui.main.R.string.IDS_hw_sleep_relax));
        intent.putExtra("courseCategoryKey", 7);
        intent.putExtra("intent_behavior_key", 2);
        iov.d(this.e, intent);
        overridePendingTransition(com.huawei.ui.commonui.R.anim.activity_no_animation, android.R.anim.fade_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.l = z;
        d(z);
        o();
    }

    private String e(SleepAudioPackage sleepAudioPackage, SleepAudioSeries sleepAudioSeries) {
        if (sleepAudioSeries == null) {
            LogUtil.j("HiH_SeriesCourseListActivity", "sleepAudioSeries is null");
            return "";
        }
        int displayStyle = sleepAudioSeries.getDisplayStyle();
        if (displayStyle == 1) {
            if (coq.d(sleepAudioPackage.getSleepAudioInfoList())) {
                LogUtil.j("HiH_SeriesCourseListActivity", "sleepAudioInfoList is null");
                return "";
            }
            return haa.b(sleepAudioPackage.getSleepAudioInfoList());
        }
        if (displayStyle == 2) {
            if (njy.e(sleepAudioPackage.getSleepAudioGroupList())) {
                LogUtil.j("HiH_SeriesCourseListActivity", "sleepAudioGroupList is null");
                return "";
            }
            return haa.c(sleepAudioPackage.getSleepAudioGroupList());
        }
        LogUtil.j("HiH_SeriesCourseListActivity", "wrong style:", Integer.valueOf(displayStyle));
        return "";
    }

    private void a(SleepAudioSeries sleepAudioSeries) {
        if (!haa.b(sleepAudioSeries)) {
            LogUtil.a("HiH_SeriesCourseListActivity", "not vip series");
            return;
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "refreshVipInfo");
        l();
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("HiH_SeriesCourseListActivity", "refreshVipStateData VipApi is null");
        } else {
            vipApi.getVipInfo(new i());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class i implements VipCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<SeriesCourseListActivity> f26743b;

        private i(SeriesCourseListActivity seriesCourseListActivity) {
            this.f26743b = new WeakReference<>(seriesCourseListActivity);
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onSuccess(Object obj) {
            SeriesCourseListActivity seriesCourseListActivity = this.f26743b.get();
            if (seriesCourseListActivity == null || seriesCourseListActivity.isDestroyed() || seriesCourseListActivity.isFinishing()) {
                LogUtil.j("HiH_SeriesCourseListActivity", "onSuccess, but activity is destroyed");
                return;
            }
            if (obj == null) {
                LogUtil.a("HiH_SeriesCourseListActivity", "getVipInfo onSuccess result is null");
                seriesCourseListActivity.k();
                return;
            }
            UserMemberInfo userMemberInfo = obj instanceof UserMemberInfo ? (UserMemberInfo) obj : null;
            if (userMemberInfo == null || userMemberInfo.getMemberFlag() != 1) {
                LogUtil.j("HiH_SeriesCourseListActivity", "TradeViewApi memberInfo == null or != VipConstants.MEMBER_FLAG_VIP");
                seriesCourseListActivity.k();
                return;
            }
            LogUtil.a("HiH_SeriesCourseListActivity", "memberInfo: ", userMemberInfo.toString());
            if (!irz.d(userMemberInfo)) {
                seriesCourseListActivity.d();
            } else {
                LogUtil.j("HiH_SeriesCourseListActivity", "isVipExpired");
                seriesCourseListActivity.k();
            }
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onFailure(int i, String str) {
            LogUtil.j("HiH_SeriesCourseListActivity", "getVipInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
            SeriesCourseListActivity seriesCourseListActivity = this.f26743b.get();
            if (seriesCourseListActivity != null && !seriesCourseListActivity.isDestroyed() && !seriesCourseListActivity.isFinishing()) {
                seriesCourseListActivity.k();
            } else {
                LogUtil.j("HiH_SeriesCourseListActivity", "onFailure, but activity is destroyed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        SleepAudioSeries sleepAudioSeries;
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.30
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.k();
                }
            });
            return;
        }
        if (this.ap != null) {
            LogUtil.a("HiH_SeriesCourseListActivity", "showVipToast mVipView is showed");
            return;
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "showVipToast");
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("HiH_SeriesCourseListActivity", "getVipMessages VipApi is null");
            return;
        }
        SleepAudioPackage sleepAudioPackage = this.g;
        View vipPayView = vipApi.getVipPayView(this, "", "#/PayPopup?payResourceType=7&benefitName=" + ((sleepAudioPackage == null || (sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries()) == null) ? "" : sleepAudioSeries.getName()), b(getIntent()));
        this.ap = vipPayView;
        LogUtil.a("HiH_SeriesCourseListActivity", "mVipView: ", vipPayView);
        this.aj.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.aj.addView(this.ap, layoutParams);
    }

    private Map<String, Object> b(Intent intent) {
        HashMap map = new HashMap(16);
        if (intent == null) {
            LogUtil.j("HiH_SeriesCourseListActivity", "getVipMap: ", "intent is null");
            return map;
        }
        map.put(WebViewHelp.BI_KEY_PULL_FROM, intent.getStringExtra(WebViewHelp.BI_KEY_PULL_FROM));
        map.put("resourceId", intent.getStringExtra("resourceId"));
        map.put("resourceName", intent.getStringExtra("resourceName"));
        map.put("pullOrder", intent.getStringExtra("pullOrder"));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.26
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.e();
                }
            });
            return;
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "cancelPurchaseToast");
        TradeViewApi tradeViewApi = (TradeViewApi) Services.d("TradeService", TradeViewApi.class);
        if (tradeViewApi == null) {
            LogUtil.j("HiH_SeriesCourseListActivity", "tradeViewApi is null");
            return;
        }
        View view = this.q;
        if (view == null) {
            return;
        }
        tradeViewApi.cancelView(view);
        this.q = null;
        FrameLayout frameLayout = this.aj;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.28
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.d();
                }
            });
            return;
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "cancelVipToast");
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("HiH_SeriesCourseListActivity", "getVipMessages VipApi is null");
            return;
        }
        View view = this.ap;
        if (view == null) {
            return;
        }
        vipApi.destoryVipPayView(view);
        this.ap = null;
        FrameLayout frameLayout = this.aj;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SleepAudioSeries sleepAudioSeries, final WeakReference<SeriesCourseListActivity> weakReference) {
        String positionId = sleepAudioSeries.getPositionId();
        if (TextUtils.isEmpty(positionId)) {
            ReleaseLogUtil.e("R_SeriesCourseListActivity", "invalid position");
            return;
        }
        ReleaseLogUtil.d("R_SeriesCourseListActivity", "requestMarketResource");
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            ReleaseLogUtil.e("R_SeriesCourseListActivity", "get marketingApi failed");
            return;
        }
        try {
            final int i2 = Integer.parseInt(positionId);
            ReleaseLogUtil.d("R_SeriesCourseListActivity", "positionId: ", Integer.valueOf(i2));
            marketingApi.getResourceResultInfo(i2).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.5
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                    ReleaseLogUtil.d("R_SeriesCourseListActivity", "requestMarketResource onSuccess");
                    if (map == null || map.isEmpty()) {
                        ReleaseLogUtil.e("R_SeriesCourseListActivity", "marketingResponse is invalid");
                        return;
                    }
                    Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                    if (mapFilterMarketingRules == null || mapFilterMarketingRules.isEmpty()) {
                        ReleaseLogUtil.e("R_SeriesCourseListActivity", "filterResultInfoMap is invalid");
                        return;
                    }
                    ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(Integer.valueOf(i2));
                    if (resourceResultInfo == null) {
                        ReleaseLogUtil.e("R_SeriesCourseListActivity", "resourceResultInfo is invalid");
                        return;
                    }
                    SeriesCourseListActivity seriesCourseListActivity = (SeriesCourseListActivity) weakReference.get();
                    if (seriesCourseListActivity != null) {
                        seriesCourseListActivity.a(resourceResultInfo, sleepAudioSeries.getPositionName(), i2);
                    } else {
                        ReleaseLogUtil.e("R_SeriesCourseListActivity", "requestTabInfo context is null");
                    }
                }
            });
        } catch (NumberFormatException unused) {
            LogUtil.e("HiH_SeriesCourseListActivity", "Format exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final SleepAudioPackage sleepAudioPackage) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.b(sleepAudioPackage);
                }
            });
            return;
        }
        if (this.y == null) {
            this.y = SeriesCourseListFragment.c(this.aq, sleepAudioPackage);
            TabLayout tabLayout = this.w;
            tabLayout.addTab(tabLayout.newTab().setText(this.e.getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_chapter)), true);
        }
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.2
            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i2) {
                return SeriesCourseListActivity.this.d(i2);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                if (SeriesCourseListActivity.this.aa && SeriesCourseListActivity.this.x) {
                    return 3;
                }
                return (SeriesCourseListActivity.this.aa || SeriesCourseListActivity.this.x) ? 2 : 1;
            }
        };
        this.v = fragmentPagerAdapter;
        this.as.setAdapter(fragmentPagerAdapter);
        this.v.notifyDataSetChanged();
        b();
    }

    private void b() {
        final SleepAudioSeries sleepAudioSeries = this.g.getSleepAudioSeries();
        if (sleepAudioSeries == null) {
            LogUtil.a("HiH_SeriesCourseListActivity", "sleepAudioSeries is null");
            return;
        }
        d(this.g);
        c(sleepAudioSeries);
        e(sleepAudioSeries);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.1
            @Override // java.lang.Runnable
            public void run() {
                SeriesCourseListActivity.this.e(sleepAudioSeries, (WeakReference<SeriesCourseListActivity>) new WeakReference(SeriesCourseListActivity.this));
            }
        });
    }

    private void e(final SleepAudioSeries sleepAudioSeries) {
        if (this.o && qqs.e(this.e)) {
            this.ah.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.series_share_dark));
        } else {
            this.ah.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.series_share_light));
        }
        this.ah.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HiH_SeriesCourseListActivity", "share is clicked");
                SeriesCourseListActivity.this.d(sleepAudioSeries);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Fragment d(int i2) {
        if (this.aa && this.x) {
            if (i2 == 0) {
                return this.z;
            }
            if (i2 == 1) {
                return this.y;
            }
            if (i2 == 2) {
                return this.t;
            }
        }
        if (this.aa) {
            if (i2 == 0) {
                return this.z;
            }
            if (i2 == 1) {
                return this.y;
            }
        }
        if (this.x) {
            if (i2 == 0) {
                return this.y;
            }
            if (i2 == 1) {
                return this.t;
            }
        }
        return this.y;
    }

    private boolean c(SleepAudioPackage sleepAudioPackage) {
        SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
        if (sleepAudioSeries == null) {
            return false;
        }
        return !coq.d(sleepAudioSeries.getIntroductionImgs());
    }

    private void h() {
        if (!c(this.g)) {
            health.compact.a.LogUtil.b("HiH_SeriesCourseListActivity", "mData is null");
            b(this.g);
        } else {
            a();
        }
    }

    private void a() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.10
            @Override // java.lang.Runnable
            public void run() {
                if (SeriesCourseListActivity.this.g != null) {
                    SleepAudioSeries sleepAudioSeries = SeriesCourseListActivity.this.g.getSleepAudioSeries();
                    if (sleepAudioSeries == null) {
                        health.compact.a.LogUtil.b("HiH_SeriesCourseListActivity", "seriesInfo is null");
                        SeriesCourseListActivity seriesCourseListActivity = SeriesCourseListActivity.this;
                        seriesCourseListActivity.b(seriesCourseListActivity.g);
                        return;
                    }
                    List<String> introductionImgs = sleepAudioSeries.getIntroductionImgs();
                    if (njy.e(introductionImgs)) {
                        health.compact.a.LogUtil.b("HiH_SeriesCourseListActivity", "urlList is null");
                        SeriesCourseListActivity seriesCourseListActivity2 = SeriesCourseListActivity.this;
                        seriesCourseListActivity2.b(seriesCourseListActivity2.g);
                        return;
                    }
                    health.compact.a.LogUtil.b("HiH_SeriesCourseListActivity", "urlList: ", introductionImgs);
                    HashMap map = new HashMap();
                    CountDownLatch countDownLatch = new CountDownLatch(introductionImgs.size());
                    for (int i2 = 0; i2 < introductionImgs.size(); i2++) {
                        qqf.b(introductionImgs.get(i2), SeriesCourseListActivity.this.a(map, countDownLatch, introductionImgs.get(i2)));
                    }
                    SeriesCourseListActivity seriesCourseListActivity3 = SeriesCourseListActivity.this;
                    seriesCourseListActivity3.b(countDownLatch, seriesCourseListActivity3, map, introductionImgs);
                    return;
                }
                health.compact.a.LogUtil.b("HiH_SeriesCourseListActivity", "mData is null");
                SeriesCourseListActivity seriesCourseListActivity4 = SeriesCourseListActivity.this;
                seriesCourseListActivity4.b(seriesCourseListActivity4.g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CountDownLatch countDownLatch, SeriesCourseListActivity seriesCourseListActivity, Map<String, Drawable> map, List<String> list) {
        try {
            if (!countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                health.compact.a.LogUtil.e("HiH_SeriesCourseListActivity", "loadImage wait timeout");
                b(this.g);
                return;
            }
            health.compact.a.LogUtil.b("HiH_SeriesCourseListActivity", "loadImage complete");
            if (map.size() != list.size()) {
                health.compact.a.LogUtil.b("HiH_SeriesCourseListActivity", "load failed");
                b(this.g);
            } else {
                e(map, seriesCourseListActivity, list);
            }
        } catch (InterruptedException unused) {
            health.compact.a.LogUtil.d("HiH_SeriesCourseListActivity", "interrupted while waiting for loadImage");
            b(this.g);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b extends CustomTarget<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CountDownLatch f26741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f26742b;
        private Map<String, Drawable> e;

        b(CountDownLatch countDownLatch, String str, Map<String, Drawable> map) {
            this.f26742b = str;
            this.f26741a = countDownLatch;
            this.e = map;
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
            health.compact.a.LogUtil.b("HiH_SeriesCourseListActivity", "onResourceReady");
            this.e.put(this.f26742b, drawable);
            this.f26741a.countDown();
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
            this.f26741a.countDown();
        }

        @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
            health.compact.a.LogUtil.b("HiH_SeriesCourseListActivity", "onLoadFailed");
            this.f26741a.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CustomTarget<Drawable> a(Map<String, Drawable> map, CountDownLatch countDownLatch, String str) {
        return new b(countDownLatch, str, map);
    }

    public void e(final Map<String, Drawable> map, final SeriesCourseListActivity seriesCourseListActivity, final List<String> list) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.8
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.e(map, seriesCourseListActivity, list);
                }
            });
            return;
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "addSummaryTab");
        if (this.z == null) {
            this.z = SeriesCourseSummaryFragment.c(this.aq, this.g);
            TabLayout tabLayout = this.w;
            tabLayout.addTab(tabLayout.newTab().setText(this.e.getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_summary)), 0, false);
            this.w.setVisibility(0);
            this.aa = true;
        }
        if (this.y == null) {
            this.y = SeriesCourseListFragment.c(this.aq, this.g);
            TabLayout tabLayout2 = this.w;
            tabLayout2.addTab(tabLayout2.newTab().setText(this.e.getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_chapter)), true);
        }
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.7
            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i2) {
                return SeriesCourseListActivity.this.d(i2);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                if (SeriesCourseListActivity.this.aa && SeriesCourseListActivity.this.x) {
                    return 3;
                }
                return (SeriesCourseListActivity.this.aa || SeriesCourseListActivity.this.x) ? 2 : 1;
            }
        };
        this.v = fragmentPagerAdapter;
        this.as.setAdapter(fragmentPagerAdapter);
        if (this.aa) {
            this.as.setCurrentItem(1);
            this.w.getTabAt(1).select();
        }
        this.v.notifyDataSetChanged();
        this.z.d(map, seriesCourseListActivity, list);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ResourceResultInfo resourceResultInfo, String str, int i2) {
        ResourceBriefInfo resourceBriefInfoA = a(resourceResultInfo);
        if (resourceBriefInfoA == null) {
            LogUtil.a("HiH_SeriesCourseListActivity", "no valid res");
            return;
        }
        ResourceContentBase content = resourceBriefInfoA.getContent();
        if (content == null || TextUtils.isEmpty(content.getContent())) {
            LogUtil.a("HiH_SeriesCourseListActivity", "no recommend res");
            return;
        }
        int contentType = resourceBriefInfoA.getContentType();
        LogUtil.a("HiH_SeriesCourseListActivity", "contentType: ", Integer.valueOf(contentType));
        if (contentType != 21 && contentType != 20) {
            LogUtil.a("HiH_SeriesCourseListActivity", "contentType error");
            return;
        }
        MultiGridsTemplate multiGridsTemplate = (MultiGridsTemplate) qqt.e(content.getContent(), MultiGridsTemplate.class);
        if (multiGridsTemplate == null) {
            LogUtil.a("HiH_SeriesCourseListActivity", "recommend res is invalid");
            return;
        }
        List<SingleGridContent> gridContents = multiGridsTemplate.getGridContents();
        if (njy.b(gridContents)) {
            Iterator<SingleGridContent> it = gridContents.iterator();
            while (it.hasNext()) {
                fxl.d(it.next(), resourceBriefInfoA);
            }
        }
        c(resourceBriefInfoA, multiGridsTemplate, str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final ResourceBriefInfo resourceBriefInfo, final MultiGridsTemplate multiGridsTemplate, final String str, final int i2) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.9
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.c(resourceBriefInfo, multiGridsTemplate, str, i2);
                }
            });
            return;
        }
        if (this.t == null) {
            RecommendFragment recommendFragmentD = RecommendFragment.d(resourceBriefInfo, this.aq, i2);
            this.t = recommendFragmentD;
            recommendFragmentD.c(multiGridsTemplate, resourceBriefInfo.getRecommendList());
            this.ac = str;
            if (TextUtils.isEmpty(str)) {
                this.ac = this.e.getResources().getString(com.huawei.ui.commonui.R.string.IDS_sleep_decompression_tab_title_recommend);
            }
            try {
                TabLayout tabLayout = this.w;
                tabLayout.addTab(tabLayout.newTab().setText(this.ac), false);
                this.w.setVisibility(0);
                this.x = true;
                this.v.notifyDataSetChanged();
            } catch (IndexOutOfBoundsException unused) {
                LogUtil.e("HiH_SeriesCourseListActivity", "IndexOutOfBoundsException");
                this.t = null;
            }
        }
    }

    private ResourceBriefInfo a(ResourceResultInfo resourceResultInfo) {
        if (resourceResultInfo == null) {
            LogUtil.e("HiH_SeriesCourseListActivity", "request marketing data failed");
            return null;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        if (njy.e(resources)) {
            LogUtil.e("HiH_SeriesCourseListActivity", "allResourceList is empty");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ResourceBriefInfo resourceBriefInfo : resources) {
            if (e(resourceBriefInfo)) {
                arrayList.add(resourceBriefInfo);
            }
        }
        if (arrayList.isEmpty()) {
            LogUtil.e("HiH_SeriesCourseListActivity", "resources are invalid");
            return null;
        }
        ResourceBriefInfo resourceBriefInfoD = d(arrayList);
        if (resourceBriefInfoD != null && resourceBriefInfoD.getContent() != null) {
            return resourceBriefInfoD;
        }
        LogUtil.e("HiH_SeriesCourseListActivity", "prioritizedResource is invalid");
        return null;
    }

    private boolean e(ResourceBriefInfo resourceBriefInfo) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis > resourceBriefInfo.getEffectiveTime() && jCurrentTimeMillis < resourceBriefInfo.getExpirationTime();
    }

    private ResourceBriefInfo d(List<ResourceBriefInfo> list) {
        Collections.sort(list, new Comparator<ResourceBriefInfo>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.14
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(ResourceBriefInfo resourceBriefInfo, ResourceBriefInfo resourceBriefInfo2) {
                return resourceBriefInfo2.getPriority() - resourceBriefInfo.getPriority();
            }
        });
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(SleepAudioPackage sleepAudioPackage) {
        if (sleepAudioPackage == null) {
            LogUtil.e("HiH_SeriesCourseListActivity", "data is null");
            return;
        }
        SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
        if (sleepAudioSeries == null) {
            LogUtil.a("HiH_SeriesCourseListActivity", "sleepAudioSeries is null");
            return;
        }
        String backGroundImg = sleepAudioSeries.getBackGroundImg();
        this.am = backGroundImg;
        qqf.b(this.ak, backGroundImg, 0, 0, com.huawei.ui.commonui.R.color.no_fragment_title_bgcolor_alpha);
        String name = sleepAudioSeries.getName();
        this.ae = name;
        HealthTextView healthTextView = this.h;
        if (healthTextView != null) {
            healthTextView.setText(name);
        }
        if (this.f26705a != null) {
            String strA = haa.a(sleepAudioSeries);
            if (TextUtils.isEmpty(strA)) {
                this.f26705a.setVisibility(8);
            } else {
                haa.e(this.f26705a, strA);
            }
        }
        if (this.j != null) {
            String strB = haa.b(sleepAudioSeries, haa.b(sleepAudioPackage));
            if (TextUtils.isEmpty(strB)) {
                this.f.setVisibility(8);
                return;
            }
            this.f.setVisibility(0);
            this.j.setText(strB);
            this.i.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.course_play_number_img));
        }
    }

    private void e(final boolean z) {
        ReleaseLogUtil.d("R_SeriesCourseListActivity", "loadData");
        final CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            ReleaseLogUtil.e("R_SeriesCourseListActivity", "mCourseApi not found");
            m();
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.13
                @Override // java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.d("R_SeriesCourseListActivity", "start queryAudiosPackageBySeriesId");
                    courseApi.queryAudiosPackageBySeriesId(SeriesCourseListActivity.this.aq, new c(SeriesCourseListActivity.this, z));
                }
            });
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        LogUtil.a("HiH_SeriesCourseListActivity", "onNewIntent");
        super.onNewIntent(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        LogUtil.a("HiH_SeriesCourseListActivity", "onConfigurationChanged");
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        c(0);
    }

    private void c(final int i2) {
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.11
            @Override // java.lang.Runnable
            public void run() {
                lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.11.5
                    @Override // java.lang.Runnable
                    public void run() {
                        haa.c(SeriesCourseListActivity.this.g, SeriesCourseListActivity.this.u, SeriesCourseListActivity.this.k, i2);
                    }
                });
            }
        }, 2000L);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        c(1);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("HiH_SeriesCourseListActivity", "onDestroy");
        super.onDestroy();
        qsp.b(this.aj, this.f26706b);
        d();
    }

    private void f() {
        LogUtil.a("HiH_SeriesCourseListActivity", "initNetWorkLayout");
        this.r = (ViewGroup) findViewById(R.id.no_network_layout);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.loading_layout);
        this.s = relativeLayout;
        relativeLayout.setVisibility(0);
    }

    private boolean c() {
        if (!CommonUtil.ab(this)) {
            LogUtil.a("HiH_SeriesCourseListActivity", "not isNetworkConnected");
            a(1);
            return false;
        }
        n();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.15
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.n();
                }
            });
            return;
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "showLoadingLayout");
        this.r.setVisibility(8);
        this.s.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        LogUtil.a("HiH_SeriesCourseListActivity", "showScrollView");
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.19
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.m();
                }
            });
        } else {
            this.s.setVisibility(8);
            this.r.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i2) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.17
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.a(i2);
                }
            });
            return;
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "no network");
        this.r.setVisibility(0);
        this.s.setVisibility(8);
        HealthTextView healthTextView = (HealthTextView) this.r.findViewById(R.id.tips_no_net_work);
        if (i2 == 1) {
            qsp.e((TextView) healthTextView, R.string.IDS_hwh_home_group_network_disconnection);
        } else {
            if (i2 != 2) {
                return;
            }
            qsp.e((TextView) healthTextView, R.string.IDS_heart_rate_measuring_status_data_fail);
        }
    }

    private void i() {
        LogUtil.a("HiH_SeriesCourseListActivity", "initTitleBar");
        this.ad.setBackground(ContextCompat.getDrawable(this.e, R.drawable.course_array_left));
        int color = ContextCompat.getColor(this.e, R.color.transparent);
        this.ab = color;
        this.al.setBackgroundColor(color);
        this.ad.setClickable(true);
        this.ad.setOnClickListener(new AnonymousClass20());
        this.af.setVisibility(4);
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity$20, reason: invalid class name */
    public class AnonymousClass20 implements View.OnClickListener {
        AnonymousClass20() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qhu.a(SeriesCourseListActivity.this.q, new IBaseResponseCallback() { // from class: txw
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.a(i, obj);
                }
            });
        }

        public /* synthetic */ void a(int i, Object obj) {
            if (i == 0) {
                SeriesCourseListActivity.this.finish();
            }
        }
    }

    private void c(SleepAudioSeries sleepAudioSeries) {
        this.l = haa.d(sleepAudioSeries.getUserAttributes().getFavorites());
        if (this.l) {
            this.af.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.course_favorite_selected));
            this.af.setVisibility(0);
            this.af.setOnClickListener(new e(this));
        } else {
            this.af.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.course_favorite));
            this.af.setVisibility(0);
            this.af.setOnClickListener(new e(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!this.o) {
            if (this.l) {
                this.af.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.course_favorite_selected));
            } else {
                this.af.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.course_favorite));
            }
            this.ah.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.series_share_light));
            return;
        }
        if (qqs.e(this.e)) {
            return;
        }
        if (this.l) {
            this.af.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.course_favorite_selected_dark));
        } else {
            this.af.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.course_favorite_dark));
        }
        this.ah.setBackground(this.e.getResources().getDrawable(com.huawei.ui.commonui.R.drawable.series_share_dark));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final SleepAudioSeries sleepAudioSeries) {
        final gxt gxtVar = new gxt(2);
        gxtVar.d(0);
        gxtVar.c(new HashMap(10));
        gxtVar.d("series_course");
        String shareTitle = sleepAudioSeries.getShareTitle();
        String shareDescription = sleepAudioSeries.getShareDescription();
        if (TextUtils.isEmpty(shareTitle)) {
            shareTitle = sleepAudioSeries.getName();
        }
        if (TextUtils.isEmpty(shareDescription)) {
            shareDescription = "";
        }
        if (TextUtils.isEmpty(shareTitle) && TextUtils.isEmpty(shareDescription)) {
            LogUtil.j("HiH_SeriesCourseListActivity", "getSharedLink, title or des is empty");
            qpx.e(com.huawei.haf.application.BaseApplication.b(), com.huawei.ui.commonui.R.string.IDS_motiontrack_share_fail_tip);
            return;
        }
        gxtVar.e(shareTitle);
        gxtVar.b(shareDescription);
        final String shareIcon = sleepAudioSeries.getShareIcon();
        if (TextUtils.isEmpty(shareIcon)) {
            shareIcon = sleepAudioSeries.getImgIcon();
        }
        if (TextUtils.isEmpty(shareIcon)) {
            a(gxtVar, sleepAudioSeries, g());
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.16
                @Override // java.lang.Runnable
                public void run() {
                    Bitmap bitmapC = qqf.c(SeriesCourseListActivity.this.e, shareIcon);
                    if (bitmapC != null) {
                        SeriesCourseListActivity.this.a(gxtVar, sleepAudioSeries, bitmapC);
                    } else {
                        SeriesCourseListActivity seriesCourseListActivity = SeriesCourseListActivity.this;
                        seriesCourseListActivity.a(gxtVar, sleepAudioSeries, seriesCourseListActivity.g());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final gxt gxtVar, final SleepAudioSeries sleepAudioSeries, Bitmap bitmap) {
        gxtVar.d(bitmap);
        final GrsQueryCallback grsQueryCallback = new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.18
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                SeriesCourseListActivity.this.c(str, gxtVar, sleepAudioSeries);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.e("HiH_SeriesCourseListActivity", "get url failed, res: ", Integer.valueOf(i2));
                SeriesCourseListActivity.this.c("", gxtVar, sleepAudioSeries);
            }
        };
        btt.d().c(new Runnable() { // from class: txu
            @Override // java.lang.Runnable
            public final void run() {
                GRSManager.c(com.huawei.haf.application.BaseApplication.b()).d("domainContentcenterDbankcdnNew", grsQueryCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str, final gxt gxtVar, final SleepAudioSeries sleepAudioSeries) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity.24
                @Override // java.lang.Runnable
                public void run() {
                    SeriesCourseListActivity.this.c(str, gxtVar, sleepAudioSeries);
                }
            });
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HiH_SeriesCourseListActivity", "getSharedLink, url is empty");
            qpx.e(com.huawei.haf.application.BaseApplication.b(), com.huawei.ui.commonui.R.string.IDS_motiontrack_share_fail_tip);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (CommonUtil.bu()) {
            sb.append(str);
            sb.append("/cch5/health/com.huawei.health.h5.sleeping-music/static/dist/index.html#/shareSeries?seriesId=");
            sb.append(sleepAudioSeries.getId());
        } else if (CommonUtil.cl()) {
            sb.append(str);
            sb.append("/sandbox/cch5/testappCCH5/com.huawei.health.h5.sleeping-music/static/dist/index.html#/shareSeries?seriesId=");
            sb.append(sleepAudioSeries.getId());
        } else {
            sb.append(str);
            sb.append("/sandbox/cch5/health/com.huawei.health.h5.sleeping-music/static/dist/index.html#/shareSeries?seriesId=");
            sb.append(sleepAudioSeries.getId());
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "url: ", sb.toString());
        gxtVar.f(sb.toString());
        HashMap map = new HashMap();
        map.put(Constants.BI_MODULE_ID, "114000117");
        map.put("name", gxtVar.p());
        gxtVar.c(map);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, BaseApplication.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap g() {
        Drawable drawableLoadIcon = com.huawei.haf.application.BaseApplication.b().getApplicationInfo().loadIcon(com.huawei.haf.application.BaseApplication.b().getPackageManager());
        if (!(drawableLoadIcon instanceof BitmapDrawable)) {
            LogUtil.j("HiH_SeriesCourseListActivity", "getAppIcon, drawable is not BitmapDrawable");
            return null;
        }
        LogUtil.a("HiH_SeriesCourseListActivity", "getAppIcon, app icon");
        return ((BitmapDrawable) drawableLoadIcon).getBitmap();
    }

    private String j() {
        SleepAudioPackage sleepAudioPackage = this.g;
        if (sleepAudioPackage == null) {
            LogUtil.e("HiH_SeriesCourseListActivity", "data is null");
            return "";
        }
        SleepAudioSeries sleepAudioSeries = sleepAudioPackage.getSleepAudioSeries();
        if (sleepAudioSeries == null) {
            LogUtil.a("HiH_SeriesCourseListActivity", "sleepAudioSeries is null");
            return "";
        }
        return sleepAudioSeries.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        try {
            if (z) {
                courseApi.operateFavoriteAudio(Integer.parseInt(this.aq), 1, new a(this, 1));
            } else {
                courseApi.operateFavoriteAudio(Integer.parseInt(this.aq), 2, new a(this, 2));
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("HiH_SeriesCourseListActivity", "Format exception");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class d extends UiCallback<Boolean> {
        private WeakReference<SeriesCourseListActivity> e;

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
        }

        d(SeriesCourseListActivity seriesCourseListActivity) {
            this.e = new WeakReference<>(seriesCourseListActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Boolean bool) {
            final SeriesCourseListActivity seriesCourseListActivity = this.e.get();
            if (seriesCourseListActivity != null) {
                seriesCourseListActivity.l = bool.booleanValue();
                HandlerExecutor.b(new Runnable() { // from class: tya
                    @Override // java.lang.Runnable
                    public final void run() {
                        seriesCourseListActivity.d(bool.booleanValue());
                    }
                });
                HandlerExecutor.b(new Runnable() { // from class: txz
                    @Override // java.lang.Runnable
                    public final void run() {
                        seriesCourseListActivity.o();
                    }
                });
                return;
            }
            LogUtil.e("HiH_SeriesCourseListActivity", "FavoriteChangeCallback activity == null");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements View.OnClickListener {
        private WeakReference<SeriesCourseListActivity> e;

        e(SeriesCourseListActivity seriesCourseListActivity) {
            this.e = new WeakReference<>(seriesCourseListActivity);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("HiH_SeriesCourseListActivity", "favorite is clicked");
            SeriesCourseListActivity seriesCourseListActivity = this.e.get();
            if (seriesCourseListActivity == null || seriesCourseListActivity.m) {
                return;
            }
            seriesCourseListActivity.m = true;
            seriesCourseListActivity.d(!seriesCourseListActivity.l);
            seriesCourseListActivity.l = true ^ seriesCourseListActivity.l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2) {
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i2));
        map.put("name", j());
        lmf.d().c(this.e, "2030107", map, 0);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class AppBarStateChangeListener implements AppBarLayout.OnOffsetChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SeriesCourseListActivity f26739a;
        private State e = State.IDLE;

        enum State {
            EXPANDED,
            COLLAPSED,
            IDLE
        }

        public AppBarStateChangeListener(SeriesCourseListActivity seriesCourseListActivity) {
            this.f26739a = seriesCourseListActivity;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (i == 0) {
                if (this.e != State.EXPANDED) {
                    LogUtil.a("HiH_SeriesCourseListActivity", "EXPANDED");
                    this.f26739a.b(false);
                }
                this.e = State.EXPANDED;
                return;
            }
            if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
                if (this.e != State.COLLAPSED) {
                    LogUtil.a("HiH_SeriesCourseListActivity", "COLLAPSED");
                    this.f26739a.b(true);
                }
                this.e = State.COLLAPSED;
                return;
            }
            if (this.e != State.IDLE) {
                LogUtil.a("HiH_SeriesCourseListActivity", "IDLE");
            }
            this.e = State.IDLE;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a extends UiCallback<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26740c;
        private WeakReference<SeriesCourseListActivity> e;

        public a(SeriesCourseListActivity seriesCourseListActivity, int i) {
            this.e = new WeakReference<>(seriesCourseListActivity);
            this.f26740c = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            SeriesCourseListActivity seriesCourseListActivity = this.e.get();
            if (seriesCourseListActivity == null) {
                LogUtil.a("HiH_SeriesCourseListActivity", "onSuccess: activity is null");
                return;
            }
            int i = this.f26740c;
            if (i == 2) {
                seriesCourseListActivity.m = false;
                LogUtil.a("HiH_SeriesCourseListActivity", "cancel favorite success: ", "delete");
                if (seriesCourseListActivity.o && !qqs.e(seriesCourseListActivity.e)) {
                    seriesCourseListActivity.af.setBackground(ContextCompat.getDrawable(seriesCourseListActivity, com.huawei.ui.commonui.R.drawable.course_favorite_dark));
                } else {
                    seriesCourseListActivity.af.setBackground(ContextCompat.getDrawable(seriesCourseListActivity, com.huawei.ui.commonui.R.drawable.course_favorite));
                }
                seriesCourseListActivity.e(0);
                return;
            }
            if (i == 1) {
                seriesCourseListActivity.m = false;
                LogUtil.a("HiH_SeriesCourseListActivity", "favorite success: ", "add");
                if (seriesCourseListActivity.o && !qqs.e(seriesCourseListActivity.e)) {
                    seriesCourseListActivity.af.setBackground(ContextCompat.getDrawable(seriesCourseListActivity, com.huawei.ui.commonui.R.drawable.course_favorite_selected_dark));
                } else {
                    seriesCourseListActivity.af.setBackground(ContextCompat.getDrawable(seriesCourseListActivity, com.huawei.ui.commonui.R.drawable.course_favorite_selected));
                }
                seriesCourseListActivity.e(1);
                return;
            }
            LogUtil.e("HiH_SeriesCourseListActivity", "invalid type");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            SeriesCourseListActivity seriesCourseListActivity = this.e.get();
            if (seriesCourseListActivity == null) {
                LogUtil.a("HiH_SeriesCourseListActivity", "onFailure: activity is null");
                return;
            }
            int i2 = this.f26740c;
            if (i2 == 2) {
                seriesCourseListActivity.m = false;
                LogUtil.a("HiH_SeriesCourseListActivity", Integer.valueOf(i), " : ", str);
            } else if (i2 == 1) {
                seriesCourseListActivity.m = false;
                LogUtil.a("HiH_SeriesCourseListActivity", Integer.valueOf(i), " : ", str);
            } else {
                LogUtil.e("HiH_SeriesCourseListActivity", "invalid type");
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c extends UiCallback<List<SleepAudioPackage>> {
        private boolean d;
        private WeakReference<SeriesCourseListActivity> e;

        c(SeriesCourseListActivity seriesCourseListActivity, boolean z) {
            this.e = new WeakReference<>(seriesCourseListActivity);
            this.d = z;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("HiH_SeriesCourseListActivity", "queryAudiosPackageBySeriesId fail, errorCode： ", Integer.valueOf(i), ", errorInfo: ", str);
            SeriesCourseListActivity seriesCourseListActivity = this.e.get();
            if (seriesCourseListActivity == null) {
                return;
            }
            seriesCourseListActivity.m();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<SleepAudioPackage> list) {
            ReleaseLogUtil.d("R_SeriesCourseListActivity", " SeriesDetailUiCallback onSuccess");
            SeriesCourseListActivity seriesCourseListActivity = this.e.get();
            if (seriesCourseListActivity == null) {
                ReleaseLogUtil.e("R_SeriesCourseListActivity", " SeriesDetailUiCallback activity is null");
                return;
            }
            if (!coq.d(list)) {
                seriesCourseListActivity.u = SystemClock.elapsedRealtime();
                seriesCourseListActivity.g = list.get(0);
                SleepAudioSeries sleepAudioSeries = seriesCourseListActivity.g.getSleepAudioSeries();
                if (sleepAudioSeries != null) {
                    sleepAudioSeries.setFrom(seriesCourseListActivity.k);
                    Intent intent = seriesCourseListActivity.getIntent();
                    if (intent != null) {
                        sleepAudioSeries.setPullFrom(intent.getStringExtra(WebViewHelp.BI_KEY_PULL_FROM));
                        sleepAudioSeries.setResourceId(intent.getStringExtra("resourceId"));
                        sleepAudioSeries.setResourceName(intent.getStringExtra("resourceName"));
                    }
                }
                if (this.d) {
                    seriesCourseListActivity.p = sleepAudioSeries.getPurchasedStatus();
                    seriesCourseListActivity.a(seriesCourseListActivity.g);
                    seriesCourseListActivity.m();
                    return;
                } else {
                    seriesCourseListActivity.f(seriesCourseListActivity.g);
                    seriesCourseListActivity.e(seriesCourseListActivity.g);
                    seriesCourseListActivity.d(seriesCourseListActivity.g);
                    return;
                }
            }
            ReleaseLogUtil.d("R_SeriesCourseListActivity", "data is empty");
            seriesCourseListActivity.m();
        }
    }

    private void l() {
        if (this.f26706b == null) {
            j jVar = new j(this);
            this.f26706b = jVar;
            qsp.a(this.aj, jVar);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SeriesCourseListActivity> f26744c;

        public j(SeriesCourseListActivity seriesCourseListActivity) {
            this.f26744c = new WeakReference<>(seriesCourseListActivity);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SeriesCourseListActivity seriesCourseListActivity = this.f26744c.get();
            if (seriesCourseListActivity == null || seriesCourseListActivity.isDestroyed()) {
                return;
            }
            LogUtil.a("R_SeriesCourseListActivity", " ViewTreeObserverListener activity.mToastContainer.getHeight() = ", Integer.valueOf(seriesCourseListActivity.aj.getHeight()));
            if (seriesCourseListActivity.aj.getHeight() != seriesCourseListActivity.mMinibarBottomMargin) {
                seriesCourseListActivity.mMinibarBottomMargin = seriesCourseListActivity.aj.getHeight();
                seriesCourseListActivity.updateMinibar();
            }
        }
    }
}
