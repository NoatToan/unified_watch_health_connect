package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.section.listener.HealthPageResTrigger;
import com.huawei.health.knit.section.listener.IPageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.utils.SleepBootPagerHelper;
import com.huawei.ui.main.stories.fitness.views.coresleep.SleepAudioClearDialog;
import com.huawei.ui.main.stories.fitness.views.coresleep.SleepShareBriefView;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.service.SleepServiceImpl;
import com.huawei.ui.main.stories.settings.activity.ClearDataCacheActivity;
import com.huawei.ui.main.stories.template.PopMenuManager;
import com.huawei.ui.main.stories.template.data.IPopMenuItemClick;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import com.huawei.up.model.UserInfomation;
import defpackage.ddv;
import defpackage.etv;
import defpackage.ftu;
import defpackage.fua;
import defpackage.gwa;
import defpackage.gxt;
import defpackage.idy;
import defpackage.iov;
import defpackage.lmf;
import defpackage.lrp;
import defpackage.lsl;
import defpackage.mgg;
import defpackage.njy;
import defpackage.peh;
import defpackage.pjo;
import defpackage.qdm;
import defpackage.qpn;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import defpackage.txj;
import defpackage.uag;
import defpackage.uay;
import defpackage.ucf;
import defpackage.uck;
import defpackage.ucq;
import defpackage.ucr;
import defpackage.wpo;
import defpackage.wud;
import defpackage.wuo;
import defpackage.wup;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public class KnitSleepDetailActivity extends KnitHealthDetailActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f26672a = "";
    private long aa;
    private LastTimeHealthDataReader<KnitSleepDetailActivity> ad;
    private BroadcastReceiver af;
    private List<Integer> ag;
    private Timer ah;
    private TimerTask ai;
    private CustomTitleBar aj;
    private String[] ak;
    private String[] al;
    private long am;
    private String[] as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26673b;
    private SleepBootPagerHelper e;
    private Context f;
    private LinearLayout h;
    private ucr j;
    private HealthPageResTrigger l;
    private KnitFragment m;
    private MessageQueue.IdleHandler q;
    private String u;
    private boolean v;
    private Boolean w;
    private b x;
    private boolean an = false;
    private boolean n = false;
    private boolean s = false;
    private boolean r = false;
    private boolean ac = true;
    private int ab = -1;
    private int k = -1;
    private boolean p = true;
    private long g = 0;
    private String i = "0";
    private boolean y = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26674c = false;
    private boolean d = false;
    private boolean o = false;
    private Observer t = new AnonymousClass4();
    private Observer z = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.15
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            LogUtil.a("Track_KnitSleepDetailActivity", "start sleep");
            if ("START_SLEEP_TAG".equals(str)) {
                KnitSleepDetailActivity.this.f26674c = true;
            }
        }
    };
    private Observer ae = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.11
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            LogUtil.a("Track_KnitSleepDetailActivity", "stop sleep");
            if ("FINISH_SLEEP_TAG".equals(str)) {
                KnitSleepDetailActivity.this.f26674c = false;
                KnitSleepDetailActivity.this.g();
                if (KnitSleepDetailActivity.this.v) {
                    qdm.c(qdm.i(), System.currentTimeMillis());
                }
            }
        }
    };

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configNoNetPage() {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configToolBar(HealthToolBar healthToolBar) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int getPageType() {
        return 1;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.d("Track_KnitSleepDetailActivity", "openFaCardAgds requestCode: ", Integer.valueOf(i), "resultCode: ", Integer.valueOf(i2));
        FaCardAgdsApi faCardAgdsApiB = etv.b();
        if (faCardAgdsApiB != null && i == 500) {
            ucq.a(1, i, intent);
            faCardAgdsApiB.close();
        } else if (i == 100) {
            if (i2 == faCardAgdsApiB.getResultcodeAgreeProtocol()) {
                ucq.c(this.j);
                ucq.c(this.j, 500);
            } else if (i2 == faCardAgdsApiB.getResultcodeNotAgreeProtocol()) {
                ReleaseLogUtil.d("Track_KnitSleepDetailActivity", "openFaCardAgds NotAgreeProtocol");
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity$4, reason: invalid class name */
    public class AnonymousClass4 implements Observer {
        AnonymousClass4() {
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(final String str, Object... objArr) {
            HandlerExecutor.c(new Runnable() { // from class: txn
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(str);
                }
            }, 300L);
        }

        public /* synthetic */ void a(String str) {
            LogUtil.a("Track_KnitSleepDetailActivity", "mIntelSectionLoadedObserver");
            if ("INTEL_SECTION_LOADED".equals(str) && KnitSleepDetailActivity.this.ab == 1) {
                KnitSleepDetailActivity.this.a(R.id.layout_webview);
            }
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("Track_KnitSleepDetailActivity", "onCreate");
        if (bundle != null) {
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                LogUtil.e("Track_KnitSleepDetailActivity", "BadParcelableException for savedInstanceState");
                bundle = null;
            }
        } else {
            bundle = null;
        }
        super.onCreate(bundle);
        ab();
        gwa.b(true);
        this.f = this;
        a();
        b(getIntent());
        wud.d((WeakReference<Context>) new WeakReference(this.f));
        n();
        boolean zQ = qdm.q();
        this.v = zQ;
        if (zQ) {
            HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(uck.h(), new e(this));
            d(System.currentTimeMillis(), qdm.a());
        }
        this.q = new a(this, 1);
        Looper.getMainLooper().getQueue().addIdleHandler(this.q);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static final class a implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26697a = 5;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<KnitSleepDetailActivity> f26698b;
        private final int d;

        public a(KnitSleepDetailActivity knitSleepDetailActivity, int i) {
            this.f26698b = new WeakReference<>(knitSleepDetailActivity);
            this.d = i;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            KnitSleepDetailActivity knitSleepDetailActivity = this.f26698b.get();
            if (knitSleepDetailActivity == null || knitSleepDetailActivity.isFinishing() || knitSleepDetailActivity.isDestroyed() || this.f26697a < 0) {
                ReleaseLogUtil.e("R_Sleep_Track_KnitSleepDetailActivity", "KnitSleepDetailActivity is null");
                return false;
            }
            if (knitSleepDetailActivity.getViewPager() == null || knitSleepDetailActivity.getViewPager().getAdapter() == null || knitSleepDetailActivity.mSubTabWidget == null || knitSleepDetailActivity.mSubTabWidget.getVisibility() == 8) {
                return true;
            }
            int i = this.d;
            if (i <= 3 && i >= 1) {
                KnitFragment knitFragment = (KnitFragment) ((qpn) knitSleepDetailActivity.getViewPager().getAdapter()).getItem(this.d);
                if (knitFragment == null) {
                    this.f26697a--;
                    ReleaseLogUtil.e("R_Sleep_Track_KnitSleepDetailActivity", "knitfragment is null");
                    return true;
                }
                if (!knitFragment.getFirstTimeVisible()) {
                    return false;
                }
                knitFragment.initData();
                knitFragment.setFirstTimeVisible(false);
            }
            return false;
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void checkEmptyFragment(long j) {
        LogUtil.a("Track_KnitSleepDetailActivity", "checkEmptyFragment, latestDataTime: ", Long.valueOf(j));
        this.mEmptyFragmentView = findViewById(R.id.knit_health_detail_empty_layout);
        setEmptyFragmentBelowTitleBar(this.mEmptyFragmentView, this.aj);
        this.mEmptyFragment = onCreateEmptyFragment(this.mNoDataPageConfig);
    }

    private void j() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f26673b < ProfileExtendConstants.TIME_OUT) {
            return;
        }
        this.f26673b = jElapsedRealtime;
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Track_KnitSleepDetailActivity", "checkFaLink intent == null");
            return;
        }
        if (intent.getBooleanExtra("HAS_JUMP_TO_MANUAL", false)) {
            return;
        }
        Uri uriB = AppRouterUtils.b(intent);
        if (uriB == null) {
            LogUtil.a("Track_KnitSleepDetailActivity", "schemeData == null");
        } else {
            d(uriB);
        }
    }

    private void k() {
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            LogUtil.j("Track_KnitSleepDetailActivity", "not from intelSleep");
        } else if (intent.getExtras().getInt("from") == 7) {
            LogUtil.a("Track_KnitSleepDetailActivity", "checkIntelSleepLink");
            this.ab = 1;
        }
    }

    private void w() {
        if (this.ab == 1) {
            a(R.id.layout_webview);
        } else {
            LogUtil.a("Track_KnitSleepDetailActivity", "pageType is not from intel sleep");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        View viewFindViewById = findViewById(i);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.sleep_relativelayout);
        ScrollView scrollView = (ScrollView) findViewById(R.id.fitness_scroll_view);
        if (relativeLayout == null || scrollView == null || viewFindViewById == null) {
            LogUtil.j("Track_KnitSleepDetailActivity", "view is null");
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        relativeLayout.getLocationOnScreen(iArr);
        int i3 = iArr[1];
        LogUtil.a("Track_KnitSleepDetailActivity", "view:", Integer.valueOf(i2), " relativeLayout:", Integer.valueOf(i3), " ScrollView:", Integer.valueOf(i2 - i3));
        scrollView.smoothScrollTo(0, i2 - iArr[1]);
        this.ab = -1;
    }

    private void d(Uri uri) {
        String queryParameter = uri.getQueryParameter("from");
        if (TextUtils.isEmpty(queryParameter) || !"fa".equals(queryParameter)) {
            return;
        }
        String queryParameter2 = uri.getQueryParameter(ArkUIXConstants.FROM_TYPE);
        LogUtil.a("Track_KnitSleepDetailActivity", "onCreate fromType", queryParameter2);
        if (TextUtils.isEmpty(queryParameter2) || !"1".equals(queryParameter2)) {
            return;
        }
        e(uri.getQueryParameter("pullFrom"), uri.getQueryParameter("whichDate"));
        getIntent().putExtra("HAS_JUMP_TO_MANUAL", true);
    }

    private void e(String str, String str2) {
        H5ProClient.getServiceManager().registerService(SleepJsApi.class);
        if (this.f == null) {
            LogUtil.j("Track_KnitSleepDetailActivity", "jumpToManualEntry: context is null");
            return;
        }
        ddv.b().loadH5ProApp(this.f, "com.huawei.health.h5.sleepdetection", new H5ProLaunchOption.Builder().addPath("#/sleepDataInput?pullFrom=" + str + "&whichDate=" + str2).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("SleepDetection", pjo.b().getJsModule()).setForceDarkMode(1).setImmerse().showStatusBar().setStatusBarTextBlack(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", Integer.valueOf(i));
        if (getIsNoDataFragment() && !this.o) {
            this.o = true;
            map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, "noHistorical");
            LogUtil.a("Track_KnitSleepDetailActivity", "AnalyticsValue.HEALTH_HEALTH_TAB_2010011.value() bi map: ", map.toString());
            lmf.d().c(this, AnalyticsValue.HEALTH_HEALTH_TAB_2010011.value(), map, 0);
            return;
        }
        b(map);
    }

    private void b(final Map<String, Object> map) {
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.19
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                String str2;
                ObserverManagerUtil.a(this, "SLEEP_DAY_TYPE_BI_TYPE");
                if (!"SLEEP_DAY_TYPE_BI_TYPE".equals(str) || objArr.length <= 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof HashMap) {
                    HashMap map2 = (HashMap) obj;
                    int iE = CommonUtils.e(String.valueOf(map2.get("dataType")), -1);
                    if (iE == 0) {
                        str2 = "noCurrent";
                    } else if (iE == 1) {
                        str2 = "scientific";
                    } else if (iE == 3) {
                        str2 = "phone";
                    } else if (iE != 4) {
                        str2 = iE != 5 ? "" : "manual";
                    } else {
                        str2 = "normal";
                    }
                    map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, str2);
                    map.put("redDot", map2.get("key_bundle_health_red_dot"));
                    map.put("alertData", map2.get("MGMT_DAILY_SLEEP_PROCESS"));
                    map.put("hasSleepAidProgram", map2.get("OPEN_STATUS"));
                    LogUtil.a("Track_KnitSleepDetailActivity", "AnalyticsValue.HEALTH_HEALTH_TAB_2010011.value() bi map: ", map.toString());
                    lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HEALTH_TAB_2010011.value(), map, 0);
                }
            }
        }, "SLEEP_DAY_TYPE_BI_TYPE");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        LogUtil.a("Track_KnitSleepDetailActivity", "onSaveInstanceState");
        if (bundle != null) {
            LogUtil.a("Track_KnitSleepDetailActivity", "outState: " + bundle.toString());
        }
        super.onSaveInstanceState(bundle);
        bundle.remove("android:support:fragments");
    }

    private void b(Intent intent) {
        LogUtil.a("Track_KnitSleepDetailActivity", "handleSleepDetection");
        if (qrs.ah(BaseApplication.getContext())) {
            LogUtil.a("Track_KnitSleepDetailActivity", "isPad");
            return;
        }
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("isStartPhoneSleep", false);
            boolean booleanExtra2 = intent.getBooleanExtra("isStartNow", false);
            String stringExtra = intent.getStringExtra("pullTime");
            String stringExtra2 = intent.getStringExtra(ArkUIXConstants.FROM_TYPE);
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = "-1";
            }
            if (!e(stringExtra)) {
                LogUtil.a("Track_KnitSleepDetailActivity", "judge notify scene and pull from background scene");
            } else {
                if (booleanExtra) {
                    LogUtil.a("Track_KnitSleepDetailActivity", "gotoSleepDetection");
                    f26672a = "CACHE_SLEEP_KEY";
                    pjo.b().c(this, booleanExtra2, stringExtra2);
                    return;
                }
                f26672a = "CACHE_REST_KEY";
            }
        }
    }

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String strB = SharedPreferenceManager.b(String.valueOf(10000), "pullTime", "");
        LogUtil.a("Track_KnitSleepDetailActivity", "time is ", str, "lastTime is ", strB);
        if (!TextUtils.isEmpty(strB) && str.equals(strB)) {
            return false;
        }
        SharedPreferenceManager.c(String.valueOf(10000), "pullTime", str);
        return true;
    }

    public static String d() {
        return f26672a;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        String strD;
        LogUtil.a("Track_KnitSleepDetailActivity", "onNewIntent");
        if (intent == null) {
            LogUtil.j("Track_KnitSleepDetailActivity", "onNewIntent intent is null");
            return;
        }
        super.onNewIntent(intent);
        LogUtil.a("Track_KnitSleepDetailActivity", "intent: ", intent.toString());
        long longExtra = intent.getLongExtra("key_bundle_health_last_data_time", 0L);
        boolean booleanExtra = intent.getBooleanExtra(Constants.CORE_SLEEP_TODAY_HAS_DATA, false);
        boolean booleanExtra2 = intent.getBooleanExtra(Constants.SLEEP_TYPE_KEY, false);
        LogUtil.a("Track_KnitSleepDetailActivity", "key_bundle_health_last_data_time: ", Long.valueOf(longExtra));
        LogUtil.a("Track_KnitSleepDetailActivity", "core_sleep_today_has_data: ", Boolean.valueOf(booleanExtra));
        LogUtil.a("Track_KnitSleepDetailActivity", "sleep_type_key: ", Boolean.valueOf(booleanExtra2));
        setIntent(intent);
        b(intent);
        long longExtra2 = intent.getLongExtra("endTime", 0L);
        LogUtil.a("Track_KnitSleepDetailActivity", "SCHEME_END_TIME: ", Long.valueOf(longExtra2));
        if (longExtra2 > 0) {
            strD = DateFormatUtil.d(longExtra2, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT);
            d(strD);
        } else {
            strD = null;
        }
        k();
        LogUtil.a("Track_KnitSleepDetailActivity", "onNewIntent time = ", strD);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        LogUtil.a("Track_KnitSleepDetailActivity", "onRestoreInstanceState");
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        LogUtil.a("Track_KnitSleepDetailActivity", "onStart");
        HealthViewPager viewPager = getViewPager();
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(4);
        }
        if (!this.d) {
            LogUtil.a("Track_KnitSleepDetailActivity", "registerObserver");
            ObserverManagerUtil.d(this.z, "START_SLEEP_TAG");
            ObserverManagerUtil.d(this.ae, "FINISH_SLEEP_TAG");
            this.d = true;
        }
        g();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public DataInfos getSubPageDataInfos(int i) {
        if (i == 0) {
            return DataInfos.CoreSleepDayDetail;
        }
        if (i == 1) {
            return DataInfos.CoreSleepWeekDetail;
        }
        if (i == 2) {
            return DataInfos.CoreSleepMonthDetail;
        }
        if (i == 3) {
            return DataInfos.CoreSleepYearDetail;
        }
        return DataInfos.NoDataPlaceHolder;
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        LogUtil.a("Track_KnitSleepDetailActivity", "onRestart");
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("Track_KnitSleepDetailActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (CommonUtil.a(ComponentInfo.PluginSleepDetection_S_0, this)) {
            LogUtil.a("Track_KnitSleepDetailActivity", "AlarmService running ");
            pjo.b().c(this, false, "-1");
        }
        this.g = System.currentTimeMillis();
        if (this.ad == null) {
            this.ad = new LastTimeHealthDataReader<>(this, this.x);
        }
        aa(this);
        j();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        ReleaseLogUtil.d("Track_KnitSleepDetailActivity", "onConfigurationChanged newConfig ", configuration, " mContainer ", this.h, " mBootPageHelper ", this.e, " mHasBedScienceSleep ", Boolean.valueOf(this.n));
        SleepBootPagerHelper sleepBootPagerHelper = this.e;
        if (sleepBootPagerHelper == null || this.h == null || !this.n) {
            return;
        }
        sleepBootPagerHelper.d(true);
        this.h.removeAllViews();
        this.e.c(this.h);
    }

    private void aa(KnitSleepDetailActivity knitSleepDetailActivity) {
        Intent intent;
        if (this.w == null && (intent = knitSleepDetailActivity.getIntent()) != null && intent.hasExtra("key_is_open_sleep_management")) {
            a(Boolean.valueOf(intent.getBooleanExtra("key_is_open_sleep_management", false)));
        }
        a(uag.c((Boolean) null));
        uag.e(new IBaseResponseCallback() { // from class: txm
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("Track_KnitSleepDetailActivity", "get open status :", obj);
            }
        });
    }

    private void a(Boolean bool) {
        Boolean bool2 = this.w;
        if (bool2 == null || bool2 != bool || (Boolean.FALSE.equals(this.w) && this.aa == 0)) {
            this.w = bool;
            e(bool);
            e(this, bool);
        }
    }

    private void ab() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("Track_KnitSleepDetailActivity", "setBiEventFromDeepLink intent = null");
            return;
        }
        Uri uriB = AppRouterUtils.b(intent);
        this.k = intent.getIntExtra("from", this.k);
        if (uriB != null) {
            String queryParameter = uriB.getQueryParameter("from");
            if ("fa".equals(queryParameter)) {
                this.k = 5;
            } else if (this.k == -1) {
                this.k = CommonUtils.e(queryParameter, -1);
            }
        }
        LogUtil.a("Track_KnitSleepDetailActivity", "setBiEventFromDeepLink uri = ", uriB, "from=", Integer.valueOf(this.k));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements HiSubscribeListener {
        private final WeakReference<KnitSleepDetailActivity> e;

        e(KnitSleepDetailActivity knitSleepDetailActivity) {
            this.e = new WeakReference<>(knitSleepDetailActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            KnitSleepDetailActivity knitSleepDetailActivity = this.e.get();
            if (knitSleepDetailActivity == null || knitSleepDetailActivity.isFinishing() || knitSleepDetailActivity.isDestroyed()) {
                ReleaseLogUtil.e("Track_KnitSleepDetailActivity", "InnerHiSubscribeListener onResult activity ", knitSleepDetailActivity);
            } else {
                ReleaseLogUtil.d("Track_KnitSleepDetailActivity", "InnerHiSubscribeListener onResult successList ", list);
                knitSleepDetailActivity.ag = list;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (!ArkUIXConstants.DELETE.equals(str)) {
                ReleaseLogUtil.e("Track_KnitSleepDetailActivity", "InnerHiSubscribeListener onChange changeKey ", str, " type ", Integer.valueOf(i));
                return;
            }
            ReleaseLogUtil.d("Track_KnitSleepDetailActivity", "InnerHiSubscribeListener onChange type ", Integer.valueOf(i));
            List<Integer> listK = qdm.k();
            listK.add(Integer.valueOf(i));
            qdm.c(listK, System.currentTimeMillis());
        }
    }

    void e(final Boolean bool) {
        HandlerExecutor.b(new Runnable() { // from class: txi
            @Override // java.lang.Runnable
            public final void run() {
                this.f49756b.b(bool);
            }
        });
    }

    public /* synthetic */ void b(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            LogUtil.a("Track_KnitSleepDetailActivity", "already open");
            this.aa = lsl.r(System.currentTimeMillis());
            this.x.d(this, false);
            this.x.c(this);
            w();
            d(this.k);
        }
        this.ad.b(LastTimeHealthDataReader.CardData.SLEEP);
    }

    private void e(KnitSleepDetailActivity knitSleepDetailActivity, Boolean bool) {
        if (!knitSleepDetailActivity.p) {
            LogUtil.j("Track_KnitSleepDetailActivity", "not first onresume, return");
            return;
        }
        knitSleepDetailActivity.p = false;
        if (Boolean.TRUE.equals(bool)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            uag.d((SleepJobService.c) null, lsl.x(jCurrentTimeMillis), lsl.i(jCurrentTimeMillis));
        }
        uag.b(bool);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        byte b2;
        super.onPause();
        LogUtil.a("Track_KnitSleepDetailActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("startTime", Long.valueOf(this.g));
        map.put("time", Long.valueOf(System.currentTimeMillis() - this.g));
        map.put("type", this.i);
        String str = this.i;
        str.hashCode();
        switch (str) {
            case "1":
                b2 = 0;
                break;
            case "2":
                b2 = 1;
                break;
            case "3":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, this.ak);
        } else if (b2 == 1) {
            map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, this.al);
        } else if (b2 == 2) {
            map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, this.as);
        }
        idy.b(AnalyticsValue.HEALTH_SLEEP_WEEK_MONTH_YEAR_TIME_21300033.value(), map);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.a("Track_KnitSleepDetailActivity", "onStop, isRecordSleep: ", Boolean.valueOf(this.f26674c));
        if (this.f26674c) {
            ae();
        }
    }

    private void ae() {
        LogUtil.a("Track_KnitSleepDetailActivity", "startTimer");
        this.ah = new Timer("Track_KnitSleepDetailActivity");
        TimerTask timerTask = new TimerTask() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.16
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                LogUtil.a("Track_KnitSleepDetailActivity", "KnitSleepDetailActivity finish");
                KnitSleepDetailActivity.this.finish();
            }
        };
        this.ai = timerTask;
        this.ah.schedule(timerTask, 601000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("Track_KnitSleepDetailActivity", "cancelTimer");
        Timer timer = this.ah;
        if (timer != null) {
            timer.cancel();
            this.ah = null;
        }
        TimerTask timerTask = this.ai;
        if (timerTask != null) {
            timerTask.cancel();
            this.ai = null;
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Track_KnitSleepDetailActivity", "onDestroy");
        Looper.getMainLooper().getQueue().removeIdleHandler(this.q);
        if (njy.b(this.ag)) {
            HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.ag, new HiUnSubscribeListener() { // from class: txk
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("Track_KnitSleepDetailActivity", "onDestroy unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
        }
        if (this.af != null) {
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.af);
        }
        ucq.e(this.j);
        if (this.d) {
            LogUtil.a("Track_KnitSleepDetailActivity", "unregisterObserver");
            ObserverManagerUtil.a(this.z, "START_SLEEP_TAG");
            ObserverManagerUtil.a("FINISH_SLEEP_TAG");
            this.d = false;
        }
        ObserverManagerUtil.a("SLEEP_DAY_TYPE_BI_TYPE");
        ObserverManagerUtil.a("SLEEP_CHART_NOW_DATE");
        ObserverManagerUtil.a(this.t, "INTEL_SECTION_LOADED");
        g();
        ObserverManagerUtil.e("KNIT_SLEEP_ACTIVITY_DESTROY", new Object[0]);
        ftu.c().b();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public Fragment onCreateEmptyFragment(KnitSubPageConfig knitSubPageConfig) {
        if (knitSubPageConfig == null) {
            this.m = null;
        } else {
            Bundle bundle = new Bundle();
            int resPosId = knitSubPageConfig.getResPosId();
            String strC = peh.c(knitSubPageConfig);
            IPageResTrigger extra = getResTrigger(getPageType(), resPosId, false).setExtra(bundle);
            if (extra instanceof HealthPageResTrigger) {
                this.l = (HealthPageResTrigger) extra;
            }
            this.m = KnitFragment.newInstance(strC, this.l);
        }
        return this.m;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public String getLogTag() {
        return "Track_KnitSleepDetailActivity";
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configTitleBar(final CustomTitleBar customTitleBar) {
        this.aj = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_detail_title_txtsleep_value));
        customTitleBar.setRightButtonVisibility(0);
        customTitleBar.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        customTitleBar.setRightButtonClickable(true);
        final PopMenuManager popMenuManager = new PopMenuManager() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.18
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.ui.main.stories.template.PopMenuManager
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomTitleBar getTitleBar() {
                return customTitleBar;
            }

            @Override // com.huawei.ui.main.stories.template.IMenuItemManager
            public List<wpo> getMenuItemList() {
                return KnitSleepDetailActivity.this.m();
            }
        };
        final HashMap map = new HashMap(16);
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                KnitSleepDetailActivity.this.b(AnalyticsValue.SLEEP_DETAILS_CLICK_21300046.value(), "2");
                map.put("click", "1");
                idy.b(AnalyticsValue.HEALTH_SLEEP_SHARE_DAY_DETAIL_21300034.value(), map);
                if (KnitSleepDetailActivity.this.isFinishing() || KnitSleepDetailActivity.this.isDestroyed()) {
                    ReleaseLogUtil.a("R_Sleep_Track_KnitSleepDetailActivity", "sleep activity is destroyed");
                } else {
                    popMenuManager.showPopMenu();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<wpo> m() {
        wpo wpoVarQ = q();
        wpo wpoVarR = r();
        wpo wpoVarS = s();
        wpo wpoVarL = l();
        wpo wpoVarO = o();
        ArrayList<wpo> arrayList = new ArrayList<>();
        if (this.ac) {
            arrayList.add(wpoVarQ);
        }
        if (fua.c(BaseApplication.getContext())) {
            arrayList.add(wpoVarR);
            arrayList.add(wpoVarS);
        }
        if (!EnvironmentInfo.m()) {
            arrayList.add(wpoVarL);
        }
        if (VersionControlUtil.isShowSmartSleepImprovement()) {
            arrayList.add(t());
        }
        arrayList.add(wpoVarO);
        if (ucq.b()) {
            arrayList.add(p());
        }
        e(arrayList);
        if (ucq.b() && !ucq.d(this.j)) {
            arrayList.add(new wpo(File.separator, null));
            arrayList.add(new wpo(getResources().getString(R.string.IDS_fa_card_setting_title), null));
        }
        return arrayList;
    }

    private wpo t() {
        return new wpo(getResources().getString(R.string.IDS_Intel_sleep_improvement), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.20
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitSleepDetailActivity.this.x();
            }
        });
    }

    private wpo o() {
        return new wpo(getResources().getString(R.string.IDS_privacy_all_data), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.21
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitSleepDetailActivity.this.u();
            }
        });
    }

    private wpo p() {
        return new wpo(getResources().getString(R.string.IDS_fa_card_setting_title), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.2
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                ucq.c(KnitSleepDetailActivity.this.j);
                ucq.c(KnitSleepDetailActivity.this.j, 500);
            }
        });
    }

    private wpo l() {
        return new wpo(getResources().getString(R.string.IDS_core_sleep_switch), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.3
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitSleepDetailActivity.this.v();
            }
        });
    }

    private wpo s() {
        return new wpo(getResources().getString(R.string.IDS_daydream_snore_favorites), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.1
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitSleepDetailActivity.this.y();
            }
        });
    }

    private wpo r() {
        return new wpo(getResources().getString(R.string.IDS_sleep_setting), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.5
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitSleepDetailActivity.this.z();
            }
        });
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void showEmptyFragment() {
        super.showEmptyFragment();
        if (this.mSubTabWidget != null) {
            this.mSubTabWidget.setVisibility(8);
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void showNonEmptyFragment() {
        super.showNonEmptyFragment();
        if (this.mSubTabWidget != null) {
            this.mSubTabWidget.setVisibility(0);
        }
    }

    private wpo q() {
        return new wpo(getResources().getString(R.string.IDS_motiontrack_share_activity_btn_text), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.6
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitSleepDetailActivity.this.aa();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        LoginInit.getInstance(this.f).browsingToLogin(new IBaseResponseCallback() { // from class: txl
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49757c.b(i, obj);
            }
        }, null);
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            if (PermissionUtil.a()) {
                ah();
                return;
            } else {
                PermissionUtil.d(this.f, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this.f) { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.9
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        KnitSleepDetailActivity.this.ah();
                    }
                });
                return;
            }
        }
        ReleaseLogUtil.e("Track_KnitSleepDetailActivity", "jumpToShare browsingToLogin not login ", Integer.valueOf(i));
    }

    public void a(String[] strArr) {
        this.ak = strArr;
    }

    public void d(String[] strArr) {
        this.al = strArr;
    }

    public void c(String[] strArr) {
        this.as = strArr;
    }

    private void e(ArrayList<wpo> arrayList) {
        arrayList.add(new wpo(getResources().getString(R.string.IDS_fitness_core_sleep_explain_title), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.7
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitSleepDetailActivity.this.ad();
            }
        }));
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int configSubTabStyle() {
        return R.layout.knit_sub_tab_widget_sleep;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configExtraView(LinearLayout linearLayout) {
        if (fua.c()) {
            this.h = linearLayout;
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public boolean getExtra(Bundle bundle) {
        Intent intent = getIntent();
        this.x = new b(this, bundle, null);
        if (intent != null) {
            this.aa = intent.getLongExtra("key_bundle_health_last_data_time", 0L);
            this.s = intent.getBooleanExtra(Constants.CORE_SLEEP_TODAY_HAS_DATA, false);
            this.r = intent.getBooleanExtra(Constants.SLEEP_TYPE_KEY, false);
            this.am = intent.getLongExtra("endTime", 0L);
            this.u = intent.getStringExtra("jumpFromFileSyncNotify");
            Uri uriB = AppRouterUtils.b(intent);
            if (uriB != null) {
                this.ab = SleepServiceImpl.e(uriB);
            }
        }
        uay.d().c(this.r, this.s);
        if ("jumpFromFileSyncNotify".equals(this.u)) {
            long j = this.am;
            if (j > 0) {
                LogUtil.a("Track_KnitSleepDetailActivity", "onCreate sleep notification wakeUpTimeScheme = ", Long.valueOf(j));
                idy.c(AnalyticsValue.HEALTH_JUMP_SLEEP_DETAIL_FROM_NOTIFY_2119017.value());
                this.k = 1;
                bundle.putLong("endTime", this.am);
                bundle.putString("jumpFromFileSyncNotify", this.u);
            }
        }
        boolean z = !VersionControlUtil.isSupportSleepManagement() && this.aa > 0;
        boolean zAa = lsl.aa(this.aa);
        LogUtil.a("Track_KnitSleepDetailActivity", "getExtra jump, hasQueriedData:", Boolean.valueOf(z), " hasTodayData:", Boolean.valueOf(zAa));
        if (z || zAa || this.am > 0) {
            bundle.putLong("key_bundle_health_last_data_time", this.aa);
            bundle.putBoolean("key_is_open_sleep_management", Boolean.TRUE.equals(this.w));
            bundle.putLong("endTime", this.am);
            hideEmptyFragment();
            showNonEmptyFragment();
            this.an = true;
            return true;
        }
        if (Utils.o()) {
            hideEmptyFragment();
            showNonEmptyFragment();
            this.an = true;
            return true;
        }
        this.an = false;
        return false;
    }

    public void d(String str) {
        LogUtil.a("Track_KnitSleepDetailActivity", "enter jumpToDetailDay().");
        ObserverManagerUtil.e("SLEEP_MESSAGE_JUMP_TAG", str);
        getViewPager().setCurrentItem(0);
    }

    public static void c(Context context, boolean z, boolean z2, long j, boolean z3) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) KnitSleepDetailActivity.class);
        intent.putExtra(Constants.CORE_SLEEP_TODAY_HAS_DATA, z);
        intent.putExtra(Constants.SLEEP_TYPE_KEY, z2);
        intent.putExtra("key_bundle_health_last_data_time", j);
        intent.putExtra("isStartPhoneSleep", z3);
        intent.putExtra("from", 8);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("Track_KnitSleepDetailActivity", "ActivityNotFoundException", e2.getMessage());
        }
    }

    public static void e(Context context, Bundle bundle) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) KnitSleepDetailActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("Track_KnitSleepDetailActivity", "ActivityNotFoundException", e2.getMessage());
        }
    }

    public boolean b() {
        return this.r;
    }

    protected void a() {
        if (getViewPager() != null) {
            getViewPager().setScrollHeightArea(200);
        }
        cancelAdaptRingRegion();
        cancelMarginAdaptation();
        ObserverManagerUtil.d(this.t, "INTEL_SECTION_LOADED");
        this.j = ucq.c(this, findViewById(R.id.hwappbarpattern_ok_icon), 1);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (fua.c()) {
            k();
            SleepBootPagerHelper sleepBootPagerHelper = new SleepBootPagerHelper(BaseApplication.getContext());
            this.e = sleepBootPagerHelper;
            sleepBootPagerHelper.setHealthPageResTrigger(this.l);
            LogUtil.a("Track_KnitSleepDetailActivity", "boot page cost: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void refreshNoDataTitleBar(CustomTitleBar customTitleBar) {
        super.refreshNoDataTitleBar(customTitleBar);
        if (isDeviceConnected()) {
            customTitleBar.setTitleBarBackgroundColor(getColor(R.color.no_fragment_titlebgcolor));
            customTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, wuo.e()), getColor(com.huawei.health.servicesui.R.color.textColorPrimary), qre.f(R.string.accessibility_go_back));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        b(AnalyticsValue.SLEEP_DETAILS_CLICK_21300046.value(), "3");
        Intent intent = new Intent();
        intent.setFlags(536870912);
        intent.setClass(this, SleepDescActivity.class);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        PrivacyDataModelActivity.b(this, new PageModelArgs(103, "PrivacyDataConstructor", 3, 1));
        b(AnalyticsValue.SLEEP_DETAILS_CLICK_21300046.value(), "4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        pjo.b().a(this.f, "#/Favorites");
        b(AnalyticsValue.SLEEP_DETAILS_CLICK_21300046.value(), "7");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        LogUtil.a("Track_KnitSleepDetailActivity", "go to IntelSleepManagement H5");
        b(AnalyticsValue.SLEEP_DETAILS_CLICK_21300046.value(), "8");
        txj.d("#/about");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        pjo.b().a(this.f, "#/SleepSetting");
        b(AnalyticsValue.SLEEP_DETAILS_CLICK_21300046.value(), "6");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (uck.g()) {
            wup.b(this.f, R.string.IDS_device_wifi_go_connect, R.string.IDS_core_sleep_not_connect);
            return;
        }
        DeviceInfo deviceInfoD = mgg.d("Track_KnitSleepDetailActivity");
        if (!uck.j() || deviceInfoD == null) {
            wup.b(this.f, R.string.IDS_device_wifi_go_connect, R.string.IDS_core_sleep_not_support);
            return;
        }
        String multiLinkBleMac = deviceInfoD.getMultiLinkBleMac();
        Intent intent = new Intent();
        intent.setClassName(this.f, "com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity");
        intent.setFlags(268435456);
        if (!TextUtils.isEmpty(multiLinkBleMac)) {
            intent.putExtra("device_id", multiLinkBleMac);
        }
        intent.setFlags(67108864);
        iov.d(this.f, intent);
        b(AnalyticsValue.SLEEP_DETAILS_CLICK_21300046.value(), "5");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        idy.b(AnalyticsValue.HEALTH_SLEEP_SHARE_DAY_DETAIL_21300034.value(), map);
        createShareBitmap();
        i();
        this.shareContainer.post(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.10
            @Override // java.lang.Runnable
            public void run() {
                KnitSleepDetailActivity knitSleepDetailActivity = KnitSleepDetailActivity.this;
                knitSleepDetailActivity.b(knitSleepDetailActivity.shareContainer.getWidth());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int intrinsicWidth;
        int intrinsicHeight;
        ImageView imageView = new ImageView(this.f);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Drawable drawable = ContextCompat.getDrawable(this.f, R.drawable.ic_sleep_share_newbg);
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(i, (int) (i * (intrinsicHeight / intrinsicWidth))));
        imageView.setImageDrawable(drawable);
        RelativeLayout relativeLayout = (RelativeLayout) getLayoutInflater().inflate(R.layout.item_for_share_sleep_bitmap_top_layout, this.shareContainer, false);
        relativeLayout.addView(imageView, 0);
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        SocialShareCenterApi socialShareCenterApi = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        String shareNickName = socialShareCenterApi.getShareNickName();
        HealthTextView healthTextView = (HealthTextView) relativeLayout.findViewById(R.id.core_sleep_name);
        if (TextUtils.isEmpty(shareNickName)) {
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setText(socialShareCenterApi.getShareNickName());
        }
        socialShareCenterApi.updateShareUserView("Track_KnitSleepDetailActivity", healthTextView, relativeLayout.findViewById(R.id.core_sleep_share_user_icon));
        b(userInfo, relativeLayout, shareNickName);
    }

    private void b(UserInfomation userInfomation, RelativeLayout relativeLayout, String str) {
        String picPath = userInfomation != null ? userInfomation.getPicPath() : null;
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.core_sleep_share_user_icon);
        if (!TextUtils.isEmpty(picPath)) {
            Bitmap bitmapA = qqf.a(this.f, picPath);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
            } else {
                LogUtil.j("Track_KnitSleepDetailActivity", "handleWhenGetUserInfoSuccess()bmp != null ");
            }
        } else {
            LogUtil.j("Track_KnitSleepDetailActivity", "handleWhenGetUserInfoSuccess()! headImgPath is null! ");
        }
        if (Utils.m() && TextUtils.isEmpty(str)) {
            imageView.setVisibility(4);
        }
        if (!StringUtils.g(this.currentDayMsg)) {
            ((HealthTextView) relativeLayout.findViewById(R.id.core_sleep_date)).setText(this.currentDayMsg);
        }
        SleepShareBriefView sleepShareBriefView = (SleepShareBriefView) relativeLayout.findViewById(R.id.sleep_share_brief_view);
        if (this.sleepScoringData != null && this.sleepEfficientDesc != null) {
            String string = this.sleepScoringData.getString(KnitHealthDetailActivity.KEY_SLEEP_SCORING);
            String string2 = this.sleepScoringData.getString(KnitHealthDetailActivity.KEY_SLEEP_STATUS);
            String string3 = this.sleepScoringData.getString(KnitHealthDetailActivity.KEY_SLEEP_SCORING_DESC);
            String string4 = this.sleepScoringData.getString(KnitHealthDetailActivity.KEY_SLEEP_COMMON_SLEEP);
            String string5 = this.sleepEfficientDesc.getString(KnitHealthDetailActivity.KEY_SLEEP_EFFICIENT);
            if (!TextUtils.isEmpty(string)) {
                sleepShareBriefView.setScoring(string, string3);
            } else if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(string5)) {
                sleepShareBriefView.setStatus(string2);
            } else if (!TextUtils.isEmpty(string4) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string5)) {
                sleepShareBriefView.setSleepTime(string4);
            } else if (!TextUtils.isEmpty(string5) && !TextUtils.isEmpty(string2)) {
                sleepShareBriefView.setSleepEfficiency(string5, string2);
            } else {
                LogUtil.j("Track_KnitSleepDetailActivity", "no scoring data need to set!");
            }
        }
        this.shareContainer.addView(relativeLayout, 0);
        relativeLayout.post(new Runnable() { // from class: txr
            @Override // java.lang.Runnable
            public final void run() {
                this.f49761a.f();
            }
        });
    }

    public /* synthetic */ void f() {
        c(this.shareContainer.getHoleViewBitmap());
    }

    private void i() {
        this.shareContainer.addView(getLayoutInflater().inflate(R.layout.item_for_share_sleep_bitmap_bottom_layout, (ViewGroup) this.shareContainer, false));
    }

    private void c(Bitmap bitmap) {
        gxt gxtVar;
        String strA = bitmap != null ? a(bitmap) : null;
        if (strA != null && strA.length() == 0) {
            LogUtil.j("Track_KnitSleepDetailActivity", "The path is invalid, return");
            return;
        }
        try {
            if (Utils.m()) {
                gxtVar = new gxt(1);
                gxtVar.d(bitmap);
            } else {
                gxt gxtVar2 = new gxt(4);
                gxtVar2.c(strA);
                gxtVar = gxtVar2;
            }
            gxtVar.e((String) null);
            gxtVar.b((String) null);
            gxtVar.f((String) null);
            gxtVar.a(1);
            gxtVar.f(false);
            gxtVar.d(7);
            gxtVar.d("11");
            gxtVar.e(false);
            ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, BaseApplication.getContext());
        } catch (OutOfMemoryError e2) {
            LogUtil.j("Track_KnitSleepDetailActivity", "shareTrackData ", e2.getMessage());
        }
    }

    private String a(Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        String str = "";
        File file = new File(lrp.g);
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.j("Track_KnitSleepDetailActivity", "saveBmpToFile:mkdirs error ");
        }
        File file2 = new File(file, "sleep_share_img.jpg");
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                String canonicalPath = file2.getCanonicalPath();
                try {
                    if (!CommonUtil.e(file2, canonicalPath)) {
                        LogUtil.j("Track_KnitSleepDetailActivity", "invalidate file path");
                        return "";
                    }
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.flush();
                        try {
                            fileOutputStream.close();
                            return canonicalPath;
                        } catch (IOException e2) {
                            LogUtil.j("Track_KnitSleepDetailActivity", "close IOException ", e2.getMessage());
                            return canonicalPath;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        fileOutputStream2 = fileOutputStream;
                        str = canonicalPath;
                        LogUtil.j("Track_KnitSleepDetailActivity", "saveBmpToFile:IOException ", e.getMessage());
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e4) {
                                LogUtil.j("Track_KnitSleepDetailActivity", "close IOException ", e4.getMessage());
                            }
                        }
                        return str;
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        fileOutputStream2 = fileOutputStream;
                        str = canonicalPath;
                        LogUtil.j("Track_KnitSleepDetailActivity", "saveBmpToFile:IllegalArgumentException ", e.getMessage());
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e6) {
                                LogUtil.j("Track_KnitSleepDetailActivity", "close IOException ", e6.getMessage());
                            }
                        }
                        return str;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e7) {
                                LogUtil.j("Track_KnitSleepDetailActivity", "close IOException ", e7.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    e = e8;
                } catch (IllegalArgumentException e9) {
                    e = e9;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (IllegalArgumentException e11) {
            e = e11;
        }
    }

    public void b(boolean z) {
        if ("0".equals(this.i)) {
            if (z) {
                this.ac = false;
            } else {
                this.ac = true;
            }
        }
        this.y = z;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f26699c;
        private final WeakReference<KnitSleepDetailActivity> d;

        /* synthetic */ b(KnitSleepDetailActivity knitSleepDetailActivity, Bundle bundle, AnonymousClass4 anonymousClass4) {
            this(knitSleepDetailActivity, bundle);
        }

        private b(KnitSleepDetailActivity knitSleepDetailActivity, Bundle bundle) {
            this.d = new WeakReference<>(knitSleepDetailActivity);
            this.f26699c = bundle;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse, reason: merged with bridge method [inline-methods] */
        public void a(final int i, final Object obj) {
            KnitSleepDetailActivity knitSleepDetailActivity;
            if (!HandlerExecutor.c()) {
                HandlerExecutor.c(new Runnable() { // from class: txp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.a(i, obj);
                    }
                });
                return;
            }
            WeakReference<KnitSleepDetailActivity> weakReference = this.d;
            if (weakReference == null || (knitSleepDetailActivity = weakReference.get()) == null) {
                return;
            }
            boolean z = false;
            knitSleepDetailActivity.n = false;
            boolean z2 = obj instanceof HiHealthData;
            if (z2) {
                HiHealthData hiHealthData = (HiHealthData) obj;
                knitSleepDetailActivity.aa = hiHealthData.getEndTime();
                knitSleepDetailActivity.n = hiHealthData.getBoolean("HAS_BED_SCIENCE");
                z = hiHealthData.getBoolean("COULD_SHOW_BOOT_PAGE");
            }
            if (Utils.o()) {
                d(knitSleepDetailActivity, z);
            } else if (!z2) {
                if (Boolean.TRUE.equals(knitSleepDetailActivity.w)) {
                    return;
                }
                a(knitSleepDetailActivity);
                LogUtil.j("Track_KnitSleepDetailActivity", "read last data time from database,mLastTimestamp=0");
            } else {
                HiHealthData hiHealthData2 = (HiHealthData) obj;
                knitSleepDetailActivity.aa = hiHealthData2.getEndTime();
                LogUtil.a("Track_KnitSleepDetailActivity", "read last data time from database,mLastTimestamp=", Long.valueOf(knitSleepDetailActivity.aa), "hihealthdata is", hiHealthData2.toString());
                if (knitSleepDetailActivity.aa > 0 && z) {
                    knitSleepDetailActivity.e.d(knitSleepDetailActivity.n);
                    knitSleepDetailActivity.e.showBootPage(knitSleepDetailActivity.h);
                }
                if (Boolean.TRUE.equals(knitSleepDetailActivity.w)) {
                    return;
                }
                if (knitSleepDetailActivity.aa == 0) {
                    a(knitSleepDetailActivity);
                } else {
                    d(knitSleepDetailActivity, z);
                }
            }
            c(knitSleepDetailActivity);
            knitSleepDetailActivity.d(knitSleepDetailActivity.k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(KnitSleepDetailActivity knitSleepDetailActivity) {
            if (this.f26699c != null && !knitSleepDetailActivity.an) {
                LogUtil.a("Track_KnitSleepDetailActivity", "reset start time, mFrom: ", Integer.valueOf(knitSleepDetailActivity.k));
                knitSleepDetailActivity.an = true;
                this.f26699c.putLong("key_bundle_health_last_data_time", knitSleepDetailActivity.aa);
                this.f26699c.putBoolean("key_is_open_sleep_management", Boolean.TRUE.equals(knitSleepDetailActivity.w));
                this.f26699c.putInt("from", knitSleepDetailActivity.k);
                knitSleepDetailActivity.onBundleArrived(this.f26699c);
                return;
            }
            LogUtil.a("Track_KnitSleepDetailActivity", "configHealthDetailActivity");
            knitSleepDetailActivity.configHealthDetailActivity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(KnitSleepDetailActivity knitSleepDetailActivity, boolean z) {
            if (z) {
                knitSleepDetailActivity.e.d(knitSleepDetailActivity.n);
                knitSleepDetailActivity.e.showBootPage(knitSleepDetailActivity.h);
            }
            knitSleepDetailActivity.hideEmptyFragment();
            knitSleepDetailActivity.showNonEmptyFragment();
            knitSleepDetailActivity.refreshTitleBar(true);
        }

        private void a(KnitSleepDetailActivity knitSleepDetailActivity) {
            knitSleepDetailActivity.e.d(false);
            knitSleepDetailActivity.showEmptyFragment();
            knitSleepDetailActivity.hideNonEmptyFragment();
            knitSleepDetailActivity.refreshTitleBar(false);
        }
    }

    private void d(final long j, final List<Integer> list) {
        this.af = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.8
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    ReleaseLogUtil.e("Track_KnitSleepDetailActivity", "registerSyncStatusBroadcastReceiver onReceive intent is null");
                    return;
                }
                String action = intent.getAction();
                if (!"com.huawei.hihealth.action_sync_data_result".equals(action)) {
                    ReleaseLogUtil.e("Track_KnitSleepDetailActivity", "registerSyncStatusBroadcastReceiver onReceive action ", action);
                    return;
                }
                boolean booleanExtra = intent.getBooleanExtra("sync_data_result_success", true);
                long longExtra = intent.getLongExtra("sync_data_result_id", 0L);
                ReleaseLogUtil.d("Track_KnitSleepDetailActivity", "registerSyncStatusBroadcastReceiver onReceive isSyncSuccess ", Boolean.valueOf(booleanExtra), " syncDataResultSyncId ", Long.valueOf(longExtra), " syncId ", Long.valueOf(j));
                if (j == longExtra) {
                    ObserverManagerUtil.e("SLEEP_SUMMARY_SYNC_STATUS", Boolean.valueOf(booleanExtra));
                    return;
                }
                String stringExtra = intent.getStringExtra("sync_data_result_type");
                boolean zC = qdm.c((List<Integer>) list, stringExtra);
                ReleaseLogUtil.d("Track_KnitSleepDetailActivity", "registerSyncStatusBroadcastReceiver onReceive isSyncSleepSummaryType ", Boolean.valueOf(zC), " syncDataResultType ", stringExtra, " syncDataTypeList ", list);
                if (zC) {
                    ObserverManagerUtil.e("SLEEP_SUMMARY_SYNC_STATUS", Boolean.valueOf(booleanExtra));
                }
            }
        };
        BroadcastManagerUtil.d(BaseApplication.getContext(), this.af, new IntentFilter("com.huawei.hihealth.action_sync_data_result"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.f, str, map, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void onKnitPageSelected(int i) {
        byte b2;
        super.onKnitPageSelected(i);
        boolean z = false;
        if (!"0".equals(this.i)) {
            HashMap map = new HashMap(16);
            map.put("click", "1");
            map.put("startTime", Long.valueOf(this.g));
            map.put("time", Long.valueOf(System.currentTimeMillis() - this.g));
            map.put("type", this.i);
            String str = this.i;
            str.hashCode();
            switch (str) {
                case "1":
                    b2 = 0;
                    break;
                case "2":
                    b2 = 1;
                    break;
                case "3":
                    b2 = 2;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, this.ak);
            } else if (b2 == 1) {
                map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, this.al);
            } else if (b2 == 2) {
                map.put(FunctionSetBeanReader.BI_HAS_DATA_TYPE, this.as);
            }
            idy.b(AnalyticsValue.HEALTH_SLEEP_WEEK_MONTH_YEAR_TIME_21300033.value(), map);
        }
        this.g = System.currentTimeMillis();
        this.i = String.valueOf(i);
        if (i == 0 && !this.y && this.m != null) {
            z = true;
        }
        this.ac = z;
        if (i < 1) {
            return;
        }
        Looper.getMainLooper().getQueue().removeIdleHandler(this.q);
        this.q = new a(this, i + 1);
        HandlerExecutor.c(new Runnable() { // from class: txo
            @Override // java.lang.Runnable
            public final void run() {
                this.f49758b.h();
            }
        }, 700L);
    }

    public /* synthetic */ void h() {
        Looper.getMainLooper().getQueue().addIdleHandler(this.q);
    }

    private void n() {
        ucf.a();
        if (ucf.c()) {
            HandlerExecutor.c(new Runnable() { // from class: txq
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.ac();
                }
            });
            ucf.a(System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        SleepAudioClearDialog sleepAudioClearDialogE = new SleepAudioClearDialog.Builder(this.f).b(qre.a(R.string.IDS_sleep_audio_clear_tltle, ucf.e())).d(R.string.IDS_sleep_audio_clear_goto_claer, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.a("Track_KnitSleepDetailActivity", "onClick too fast");
                    return;
                }
                LogUtil.a("Track_KnitSleepDetailActivity", "jump to ClearDataCacheActivity");
                Intent intent = new Intent(KnitSleepDetailActivity.this, (Class<?>) ClearDataCacheActivity.class);
                intent.putExtra("showSleepAlertDialog", true);
                KnitSleepDetailActivity.this.startActivity(intent);
            }
        }).d(R.string.IDS_sleep_audio_clear_auto_claer, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.a("Track_KnitSleepDetailActivity", "onClick too fast");
                } else {
                    LogUtil.a("Track_KnitSleepDetailActivity", "jump to DreamTalkSetting");
                    pjo.b().a(KnitSleepDetailActivity.this.f, "#/DreamTalkSetting");
                }
            }
        }).d(R.string.IDS_sleep_audio_clear_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.a("Track_KnitSleepDetailActivity", "onClick too fast");
                } else {
                    LogUtil.a("Track_KnitSleepDetailActivity", "cancel");
                }
            }
        }).e();
        sleepAudioClearDialogE.setCancelable(true);
        if (isFinishing()) {
            return;
        }
        sleepAudioClearDialogE.show();
    }

    public String c() {
        return this.u;
    }

    public long e() {
        return this.am;
    }
}
