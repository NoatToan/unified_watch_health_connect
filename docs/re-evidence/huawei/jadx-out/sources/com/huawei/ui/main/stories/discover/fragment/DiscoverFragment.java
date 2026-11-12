package com.huawei.ui.main.stories.discover.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.preload.H5PreloadIntervalStrategy;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.h5pro.preload.H5ProPkgPreloadSyncTask;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.scrollview.HealthBottomView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.discover.fragment.DiscoverFragment;
import com.huawei.ui.main.stories.member.MemberIntroFragment;
import com.huawei.ui.main.stories.soical.BaseSocialFragment;
import com.huawei.ui.main.stories.soical.MemberCenterFragment;
import com.huawei.ui.main.stories.soical.MemberCenterH5Fragment;
import com.huawei.ui.main.stories.soical.SocialFragmentFactoryApi;
import defpackage.btq;
import defpackage.btw;
import defpackage.fxl;
import defpackage.irz;
import defpackage.isa;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.njy;
import defpackage.peh;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DiscoverFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthBottomView f26427c;
    private View f;
    private LinearLayout h;
    private boolean i;
    private List<Fragment> j;
    private OnFitnessStatusChangeCallback l;
    private String[] r;
    private Fragment s;
    private BaseSocialFragment t;
    private UserMemberInfo w;
    private Fragment y;
    private Handler g = new Handler(Looper.getMainLooper());
    private boolean o = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26425a = true;
    private int e = -1;
    private boolean d = true;
    private boolean n = false;
    private final Observer m = new Observer() { // from class: com.huawei.ui.main.stories.discover.fragment.DiscoverFragment.4
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (!("com.huawei.plugin.account.logout".equals(str) && DiscoverFragment.this.o && DiscoverFragment.this.f != null) && (!"REFRESH_DISCOVER_FRAGMENT".equals(str) || DiscoverFragment.this.f == null)) {
                return;
            }
            LogUtil.a("UIDV_DiscoverFragment", "refresh page");
            DiscoverFragment.this.j();
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.main.stories.discover.fragment.DiscoverFragment.4.1
                @Override // java.lang.Runnable
                public void run() {
                    DiscoverFragment.this.d();
                }
            });
        }
    };
    private Observer p = new Observer() { // from class: com.huawei.ui.main.stories.discover.fragment.DiscoverFragment.1
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (!njy.c(objArr, 0)) {
                LogUtil.a("UIDV_DiscoverFragment", "null args!");
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                LogUtil.a("UIDV_DiscoverFragment", "isNewShowVipPage", bool);
                if (DiscoverFragment.this.o == zBooleanValue || DiscoverFragment.this.d) {
                    return;
                }
                DiscoverFragment.this.o = zBooleanValue;
                HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.main.stories.discover.fragment.DiscoverFragment.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        DiscoverFragment.this.d();
                    }
                });
            }
        }
    };
    private final BroadcastReceiver q = new d(this);
    private Observer k = new Observer() { // from class: trw
        @Override // com.huawei.haf.design.pattern.Observer
        public final void notify(String str, Object[] objArr) {
            this.f49595a.b(str, objArr);
        }
    };
    private final SocialFragmentFactoryApi u = (SocialFragmentFactoryApi) Services.d("OperationBundle", SocialFragmentFactoryApi.class);

    public /* synthetic */ void b(String str, Object[] objArr) {
        LogUtil.a("UIDV_DiscoverFragment", "DiscoverFragment mRefreshVipObserver into ");
        if ("OPERATION_FUNCTION_ENTRANCE".equals(str)) {
            c(objArr);
        } else {
            ReleaseLogUtil.d("UIDV_DiscoverFragment", "mRefreshVipObserver label is error :", str);
        }
    }

    private void c(Object[] objArr) {
        if (this.f == null) {
            ReleaseLogUtil.d("UIDV_DiscoverFragment", "handleFunctionChanged mDiscoverView is null ");
            return;
        }
        if (objArr == null || objArr.length < 2) {
            ReleaseLogUtil.d("UIDV_DiscoverFragment", "handleFunctionChanged received objects array with invalid length: ", Integer.valueOf(objArr.length));
            return;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() != 0) {
                ReleaseLogUtil.d("UIDV_DiscoverFragment", "handleFunctionChanged received objects array errorCode not success： ", num);
                return;
            } else {
                if (obj2 instanceof List) {
                    HandlerExecutor.b(new Runnable() { // from class: try
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49598c.a();
                        }
                    });
                    return;
                }
                return;
            }
        }
        ReleaseLogUtil.d("UIDV_DiscoverFragment", "handleFunctionChanged received invalid errorCode object: ", obj);
    }

    public DiscoverFragment() {
    }

    public DiscoverFragment(HealthBottomView healthBottomView) {
        this.f26427c = healthBottomView;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        ReleaseLogUtil.c("UIDV_DiscoverFragment", "onCreate finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void m() {
        FragmentActivity activity;
        if (this.f26427c != null || (activity = getActivity()) == null || activity.isDestroyed()) {
            return;
        }
        this.f26427c = (HealthBottomView) activity.findViewById(R.id.hw_main_tabs);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_discover, viewGroup, false);
        this.f = viewInflate;
        this.h = (LinearLayout) viewInflate.findViewById(R.id.discover_pager_root_view);
        this.f26426b = getContext();
        this.w = irz.a();
        n();
        a(this.f);
        ThreadPoolManager.c().execute(new Runnable() { // from class: tsa
            @Override // java.lang.Runnable
            public final void run() {
                DiscoverFragment.b();
            }
        });
        m();
        ReleaseLogUtil.c("UIDV_DiscoverFragment", "onCreateView finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        return this.f;
    }

    public static /* synthetic */ void b() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            return;
        }
        ColumnRequestUtils.getFavoriteData(null);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (this.d) {
            setUserVisibleHint(getUserVisibleHint());
        } else {
            ObserverManagerUtil.e("REFRESH_MEMBER_INFO_CARD_VIEW", true);
            ObserverManagerUtil.e("USER_MEMBER_INFO_UPDATE", true);
            i();
        }
        ReleaseLogUtil.c("UIDV_DiscoverFragment", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = this.f26426b;
        if (context == null) {
            return;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        if (CommonUtil.d(displayMetrics.widthPixels, "DiscoverFragment") || o()) {
            d();
        }
    }

    private boolean o() {
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            return ((BaseActivity) activity).isHonorFoldableDevice();
        }
        LogUtil.j("UIDV_DiscoverFragment", "activity is not BaseActivity");
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("UIDV_DiscoverFragment", "onDestroy ", this);
        q();
        s();
        this.g.removeCallbacksAndMessages(null);
        if (this.l != null) {
            btq.e().d(this.l, "PLAN_DELETE");
            this.l = null;
        }
        this.f26426b = null;
        this.f = null;
        this.j = null;
        this.t = null;
        this.r = null;
        this.y = null;
        ReleaseLogUtil.c("UIDV_DiscoverFragment", "onDestroy");
    }

    private void n() {
        ObserverManagerUtil.d(this.k, "OPERATION_FUNCTION_ENTRANCE");
        ObserverManagerUtil.d(this.k, ObserveLabels.VIP_INFO_CHANGED);
        ObserverManagerUtil.d(this.m, "com.huawei.plugin.account.logout");
        ObserverManagerUtil.d(this.m, "REFRESH_DISCOVER_FRAGMENT");
        if (this.f26425a) {
            this.g.postDelayed(new Runnable() { // from class: com.huawei.ui.main.stories.discover.fragment.DiscoverFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    ObserverManagerUtil.d(DiscoverFragment.this.p, "AB_TEST_STRATEGY_SET_SP_DONE");
                    DiscoverFragment.this.k();
                }
            }, 5000L);
            this.f26425a = false;
        }
    }

    private void q() {
        ObserverManagerUtil.c(this.k);
        ObserverManagerUtil.c(this.m);
        ObserverManagerUtil.a(this.p, "AB_TEST_STRATEGY_SET_SP_DONE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("UIDV_DiscoverFragment", "registerSwitchAccountReceiver enter");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        LocalBroadcastManager.getInstance().registerReceiver(this.q, intentFilter);
        LogUtil.a("UIDV_DiscoverFragment", "registerSwitchAccountReceiver end");
    }

    private void s() {
        try {
            LogUtil.a("UIDV_DiscoverFragment", "unregisterSwitchAccountReceiver mSwitchAccountReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.q);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("UIDV_DiscoverFragment", "unregisterSwitchAccountReceiver IllegalArgumentException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        UserMemberInfo userMemberInfo = new UserMemberInfo();
        userMemberInfo.setMemberFlag(-1);
        SharedPreferenceManager.e(this.f26426b, Integer.toString(10000), "USER_VIP_INFO_KEY", peh.c(userMemberInfo), new StorageParams());
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        LogUtil.a("UIDV_DiscoverFragment", "setUserVisibleHint:", Boolean.valueOf(z), ",isFirst:", Boolean.valueOf(this.d), ",mDiscoverView:", this.f);
        if (z && this.d && this.f != null) {
            d();
            l();
            this.d = false;
        }
        if (z && this.n && this.f != null) {
            this.n = false;
            HandlerExecutor.b(new Runnable() { // from class: tru
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49594a.d();
                }
            });
        }
        if (z) {
            t();
            qrs.c(this.f26426b, this.o ? 4 : 2);
        }
        BaseSocialFragment baseSocialFragment = this.t;
        if (baseSocialFragment != null) {
            baseSocialFragment.fragmentVisibleStatus(z);
        }
        if (this.y instanceof MemberIntroFragment) {
            if (z) {
                ObserverManagerUtil.e("USER_MEMBER_INFO_UPDATE", true);
            }
            ((MemberIntroFragment) this.y).onVisibilityChange(z);
        }
        if (this.y instanceof MemberCenterFragment) {
            if (z) {
                ObserverManagerUtil.e("USER_MEMBER_INFO_UPDATE", true);
            }
            ((MemberCenterFragment) this.y).onVisibilityChange(z);
        }
        if (this.f != null) {
            fxl.c(getActivity().getWindow().getDecorView(), z, 3002, "Discover");
        }
        ObserverManagerUtil.e("MEMBER_PAGE_IS_VISIBLE_TO_USER", Boolean.valueOf(z));
    }

    private void t() {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.triggerMarketingResourceEvent(new MarketingOption.Builder().setContext(getActivity()).setPageId(16).setTypeId(45).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void d() {
        LogUtil.a("UIDV_DiscoverFragment", "initView start");
        if (this.h == null) {
            return;
        }
        if (this.f26426b == null || getActivity() == null || getActivity().isFinishing()) {
            LogUtil.j("UIDV_DiscoverFragment", "initView Activity is destroyed");
            return;
        }
        f();
        if (njy.b(this.j)) {
            getChildFragmentManager().beginTransaction().replace(R.id.member_container, this.j.get(0)).commitAllowingStateLoss();
        }
        e();
        if (this.d) {
            i();
        }
        LogUtil.a("UIDV_DiscoverFragment", "initView end");
    }

    private void e() {
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(getContext(), AnalyticsValue.HEALTH_DISCOVER_TAB_2020001.value(), map, 0);
    }

    private void f() {
        this.o = isa.d();
        this.j = new ArrayList();
        BaseSocialFragment baseSocialFragment = this.t;
        if (baseSocialFragment != null) {
            c(baseSocialFragment);
        }
        Fragment fragment = this.y;
        if (fragment != null) {
            c(fragment);
        }
        if (CommonUtil.ca()) {
            Fragment storeDemoNewSocialFragment = this.u.getStoreDemoNewSocialFragment();
            this.s = storeDemoNewSocialFragment;
            this.j.add(storeDemoNewSocialFragment);
            LogUtil.a("UIDV_DiscoverFragment", " initFragment, is storeDemo version");
        } else if (!this.o) {
            BaseSocialFragment newSocialFragment = this.u.getNewSocialFragment();
            this.t = newSocialFragment;
            this.j.add(newSocialFragment);
        } else {
            e(this.w);
            g();
            MemberCenterH5Fragment memberCenterH5Fragment = new MemberCenterH5Fragment();
            this.y = memberCenterH5Fragment;
            LogUtil.a("UIDV_DiscoverFragment", " mVipFragment ", memberCenterH5Fragment.getClass());
            p();
            r();
            this.j.add(this.y);
            int i = this.e;
            if (i != -1) {
                this.f26427c.e(i, false);
            } else {
                this.f26427c.e(2, false);
            }
            Context context = this.f26426b;
            String string = Integer.toString(10000);
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferenceManager.e(context, string, "show_member_tab", String.valueOf(jCurrentTimeMillis), new StorageParams());
        }
        this.r = new String[]{BaseApplication.getContext().getString(R.string.IDS_settings_recommend)};
    }

    private void c(Fragment fragment) {
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.remove(fragment);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    private void g() {
        this.i = btw.e();
        if (this.l == null) {
            this.l = new OnFitnessStatusChangeCallback() { // from class: trz
                @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
                public final void onUpdate() {
                    this.e.c();
                }
            };
            btq.e().c(this.l, "PLAN_DELETE");
        }
    }

    public /* synthetic */ void c() {
        LogUtil.a("UIDV_DiscoverFragment", "finish plan.");
        this.i = false;
        if (this.h != null) {
            HandlerExecutor.b(new Runnable() { // from class: trt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49593a.d();
                }
            });
        }
    }

    private void p() {
        Fragment fragment;
        UserMemberInfo userMemberInfo = this.w;
        if (userMemberInfo == null || (fragment = this.y) == null || !(fragment instanceof MemberIntroFragment)) {
            return;
        }
        if (userMemberInfo.getMemberFlag() == -1) {
            ((MemberIntroFragment) this.y).b(0);
        } else {
            if (this.w.getNowTime() <= this.w.getExpireTime() || this.i) {
                return;
            }
            ((MemberIntroFragment) this.y).b(2);
        }
    }

    private void r() {
        Fragment fragment;
        UserMemberInfo userMemberInfo = this.w;
        if (userMemberInfo == null || (fragment = this.y) == null || !(fragment instanceof MemberCenterFragment)) {
            return;
        }
        if (userMemberInfo != null && userMemberInfo.getAutoRenew() == 1) {
            ((MemberCenterFragment) this.y).d(0);
        } else {
            ((MemberCenterFragment) this.y).d(1);
        }
    }

    public void b(boolean z) {
        Fragment fragment;
        if (z && (fragment = this.y) != null && (fragment instanceof MemberIntroFragment)) {
            ((MemberIntroFragment) fragment).d();
        }
    }

    private void a(View view) {
        View viewFindViewById = view.findViewById(R.id.statusbar_panel);
        if (!CommonUtil.ca()) {
            viewFindViewById.setVisibility(8);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.a("UIDV_DiscoverFragment", "setStatusBarHeight arguments == null");
            return;
        }
        int i = arguments.getInt("statusBarHeight");
        LogUtil.a("UIDV_DiscoverFragment", "setStatusBarHeight statusBarHeight", Integer.valueOf(i));
        if (i != 0) {
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        } else {
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(-1, qrs.d(this.f26426b, 24.0f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.o) {
            LogUtil.a("UIDV_DiscoverFragment", "checkVipUser");
            if (HandlerExecutor.c()) {
                lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.discover.fragment.DiscoverFragment.3
                    @Override // java.lang.Runnable
                    public void run() {
                        DiscoverFragment.this.i();
                    }
                });
            } else {
                ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new AnonymousClass5());
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.discover.fragment.DiscoverFragment$5, reason: invalid class name */
    public class AnonymousClass5 implements VipCallback {
        @Override // com.huawei.health.vip.api.VipCallback
        public void onFailure(int i, String str) {
        }

        AnonymousClass5() {
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onSuccess(Object obj) {
            LogUtil.a("UIDV_DiscoverFragment", "checkVipUser onSuccess: mUserMemberInfo ", DiscoverFragment.this.w);
            if (obj instanceof UserMemberInfo) {
                ObserverManagerUtil.e("USER_MEMBER_INFO_UPDATE", obj);
                if (DiscoverFragment.this.w == null || DiscoverFragment.this.b(obj)) {
                    DiscoverFragment.this.w = (UserMemberInfo) obj;
                    LogUtil.a("UIDV_DiscoverFragment", "checkVipUser refresh result ", obj);
                    HandlerExecutor.b(new Runnable() { // from class: tsb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49601b.e();
                        }
                    });
                }
            }
        }

        public /* synthetic */ void e() {
            DiscoverFragment.this.d();
        }
    }

    private boolean e(Object obj) {
        if (!(obj instanceof UserMemberInfo) || LoginInit.getInstance(this.f26426b).isBrowseMode()) {
            return false;
        }
        UserMemberInfo userMemberInfo = (UserMemberInfo) obj;
        return userMemberInfo.getMemberFlag() == 1 && !irz.d(userMemberInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Object obj) {
        if (!this.o) {
            return false;
        }
        if ((this.y instanceof MemberIntroFragment) && e(obj)) {
            return true;
        }
        return (!(this.y instanceof MemberCenterFragment) || e(obj) || this.i) ? false : true;
    }

    private void l() {
        H5ProPkgPreloadSyncTask.startTask(BaseApplication.getContext(), "com.huawei.health.h5.my-annual-flag", new H5PreloadIntervalStrategy(3600000L));
    }

    public void a(int i) {
        this.e = i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.y;
        if (fragment instanceof MemberCenterH5Fragment) {
            ((MemberCenterH5Fragment) fragment).onActivityResult(i, i2, intent);
        }
    }

    static class d extends BroadcastReceiver {
        private final WeakReference<DiscoverFragment> d;

        d(DiscoverFragment discoverFragment) {
            this.d = new WeakReference<>(discoverFragment);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("UIDV_DiscoverFragment", "mSwitchAccountReceiver  onReceive");
            if (intent == null) {
                LogUtil.j("UIDV_DiscoverFragment", "login receive.intent null.");
                return;
            }
            final DiscoverFragment discoverFragment = this.d.get();
            if (discoverFragment == null) {
                LogUtil.j("UIDV_DiscoverFragment", "login receive fragment null.");
            } else {
                if (!"com.huawei.plugin.account.login".equals(intent.getAction()) || discoverFragment.f == null || discoverFragment.d) {
                    return;
                }
                HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.main.stories.discover.fragment.DiscoverFragment.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ObserverManagerUtil.e("REFRESH_MEMBER_INFO_CARD_VIEW", true);
                        ObserverManagerUtil.e("USER_MEMBER_INFO_UPDATE", true);
                        discoverFragment.i();
                        discoverFragment.n = true;
                    }
                });
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public String getInnerFragmentSimpleName() {
        BaseSocialFragment baseSocialFragment = this.t;
        if (baseSocialFragment != null) {
            return baseSocialFragment.getClass().getSimpleName();
        }
        Fragment fragment = this.y;
        if (fragment != null) {
            return fragment.getClass().getSimpleName();
        }
        return "";
    }
}
