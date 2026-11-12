package com.huawei.ui.main.stories.userprofile.activity;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.media3.common.C;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.engine.StageDelegateProxy;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.h5pro.preload.H5PreloadCountStrategy;
import com.huawei.health.h5pro.preload.H5PreloadIntervalStrategy;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.MemberMessage;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.security.SecurityChecker;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.preload.H5ProPkgPreloadSyncTask;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.AssetMessage;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import com.huawei.ui.commonui.scrollview.HealthBottomView;
import com.huawei.ui.commonui.scrollview.HealthNestedScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment;
import com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi;
import com.huawei.ui.main.stories.userprofile.scroll.CustomHeadView;
import com.huawei.ui.main.stories.utils.UserInfoMockInteractor;
import com.huawei.up.api.UpApi;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.model.UserInfomation;
import defpackage.dnj;
import defpackage.fua;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.imz;
import defpackage.irz;
import defpackage.lli;
import defpackage.lmf;
import defpackage.lod;
import defpackage.lrd;
import defpackage.lua;
import defpackage.njy;
import defpackage.nvb;
import defpackage.osa;
import defpackage.otu;
import defpackage.oun;
import defpackage.paq;
import defpackage.pjd;
import defpackage.pjg;
import defpackage.qhu;
import defpackage.qji;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qqv;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.ucq;
import defpackage.wjs;
import defpackage.wqz;
import defpackage.wrb;
import defpackage.wrc;
import defpackage.wrd;
import defpackage.wre;
import defpackage.wrl;
import defpackage.wrq;
import defpackage.wsa;
import defpackage.wsf;
import defpackage.wsg;
import defpackage.wsl;
import defpackage.wsp;
import defpackage.wsr;
import defpackage.wss;
import defpackage.wst;
import defpackage.wtb;
import defpackage.wtv;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes19.dex */
public class PersonalCenterFragment extends BaseFragment implements View.OnClickListener, PersonalCenterUiApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f29026c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29027a;
    private boolean aa;
    private LocalBroadcastManager ab;
    private CopyOnWriteArrayList<MessageObject> ac;
    private wst ad;
    private MessageObserver ae;
    private ImageView af;
    private wsl ag;
    private RelativeLayout ah;
    private wsf ai;
    private OperationUtilsApi aj;
    private List<wre> ak;
    private final Observer al;
    private wsr am;
    private HealthTextView an;
    private wtb ao;
    private HealthRecycleView ap;
    private PersonalCenterRecyclerViewAdapter aq;
    private View ar;
    private HealthNestedScrollView as;
    private UserInfoMockInteractor at;
    private wss au;
    private final BroadcastReceiver av;
    private ExecutorService aw;
    private final UserProfileMgrApi ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    CommonCallback f29028b;
    private CopyOnWriteArrayList<MessageObject> d;
    private boolean e;
    private int f;
    private HealthRecycleView g;
    private Map<Integer, Integer> h;
    private HealthBottomView i;
    private final BroadcastReceiver j;
    private PersonalGridAdapter k;
    private String l;
    private Context m;
    private wrd n;
    private CustomHeadView o;
    private GridLayoutManager p;
    private Handler q;
    private boolean r;
    private int s;
    private List<wrc> t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private MessageCenterApi z;

    public static /* synthetic */ void b(int i, Object obj) {
    }

    static class c extends BaseHandler<PersonalCenterFragment> {
        c(PersonalCenterFragment personalCenterFragment) {
            super(personalCenterFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PersonalCenterFragment personalCenterFragment, Message message) {
            if (personalCenterFragment == null || message == null) {
                LogUtil.j("UIME_PersonalCenterFragment", "handleMessageWhenReferenceNotNull fragment or msg is null");
                return;
            }
            int i = message.what;
            if (i == 0) {
                if (message.obj instanceof UserInfomation) {
                    personalCenterFragment.d((UserInfomation) message.obj);
                }
            } else {
                if (i == 1) {
                    LogUtil.a("UIME_PersonalCenterFragment", "MSG_GET_USERINFO_FAIL");
                    return;
                }
                if (i == 4) {
                    if (message.obj instanceof HiUserInfo) {
                        personalCenterFragment.c((HiUserInfo) message.obj);
                    }
                } else if (i != 80) {
                    PersonalCenterFragment.d(personalCenterFragment, message);
                } else {
                    personalCenterFragment.e(message.obj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(PersonalCenterFragment personalCenterFragment, Message message) {
        int i = message.what;
        if (i == 14) {
            personalCenterFragment.c();
            return;
        }
        if (i == 15) {
            LogUtil.a("UIME_PersonalCenterFragment", "MSG_UPDATE_ABOUT_ITEM_RED_POINT");
            wst wstVar = personalCenterFragment.ad;
            wstVar.b(wstVar.b(), message.arg1 == 1);
            if (message.arg1 == 1) {
                personalCenterFragment.setBottomRedDotVisibility(288);
                return;
            } else {
                personalCenterFragment.cancelBottomRedDotVisible(288);
                return;
            }
        }
        if (i == 81) {
            personalCenterFragment.a(((Boolean) message.obj).booleanValue());
            return;
        }
        switch (i) {
            case 8:
                LogUtil.a("UIME_PersonalCenterFragment", "handleRedPoint show point");
                personalCenterFragment.y = true;
                wst wstVar2 = personalCenterFragment.ad;
                wstVar2.b(wstVar2.o(), personalCenterFragment.y);
                personalCenterFragment.setBottomRedDotVisibility(2);
                break;
            case 9:
                personalCenterFragment.setBottomRedDotVisibility(1);
                personalCenterFragment.a(message.arg1);
                break;
            case 10:
                personalCenterFragment.cancelBottomRedDotVisible(1);
                personalCenterFragment.a(message.arg1);
                break;
            case 11:
                LogUtil.a("UIME_PersonalCenterFragment", "handleRedPoint show medalRedPoint");
                personalCenterFragment.aj();
                personalCenterFragment.ab();
                break;
            default:
                b(personalCenterFragment, message);
                break;
        }
    }

    public /* synthetic */ void c(int i, MessageChangeEvent messageChangeEvent) {
        LogUtil.a("UIME_PersonalCenterFragment", "PersonalCenterFragment MessageObserver onChange start flag = ", Integer.valueOf(i));
        List<String> modifyMessageObjectIds = messageChangeEvent.getModifyMessageObjectIds();
        List<String> removeMessageObjectIds = messageChangeEvent.getRemoveMessageObjectIds();
        if ((i == 0 && njy.b(modifyMessageObjectIds)) || njy.b(removeMessageObjectIds)) {
            LogUtil.a("UIME_PersonalCenterFragment", "PersonalCenterFragment MessageObserver Change");
            ab();
        }
    }

    public PersonalCenterFragment() {
        this.f29028b = new CommonCallback() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment.1
            @Override // com.huawei.up.callback.CommonCallback
            public void onSuccess(Bundle bundle) {
                LogUtil.a("UIME_PersonalCenterFragment", "get new headImg and name from cloud success.");
                PersonalCenterFragment.this.ba();
            }

            @Override // com.huawei.up.callback.CommonCallback
            public void onFail(int i) {
                LogUtil.a("UIME_PersonalCenterFragment", "get new headImg and name from cloud failure.");
            }
        };
        this.e = true;
        this.h = new HashMap(10);
        this.s = 4;
        this.f29027a = false;
        this.v = true;
        this.w = false;
        this.q = new c(this);
        this.o = null;
        this.al = new e(this);
        this.ac = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
        this.aa = true;
        this.t = new ArrayList(10);
        this.av = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LogUtil.a("UIME_PersonalCenterFragment", "UserProfileActivity mUserProfileReceiver(): intent = ", intent.getAction());
                PersonalCenterFragment.this.ax.notifyCallback();
                if ("com.huawei.plugin.account.login".equals(intent.getAction())) {
                    PersonalCenterFragment.this.aq();
                    PersonalCenterFragment.this.r();
                    PersonalCenterFragment.this.t();
                } else {
                    if ("com.huawei.bone.action.FITNESS_USERINFO_UPDATED".equals(intent.getAction())) {
                        if (!CommonUtil.ca()) {
                            PersonalCenterFragment.this.ba();
                            return;
                        } else {
                            LogUtil.a("UIME_PersonalCenterFragment", "Store version data is updated.");
                            PersonalCenterFragment.this.ah();
                            return;
                        }
                    }
                    if ("com.huawei.bone.action.AIRULE_PARSE_SUCCESS".equals(intent.getAction())) {
                        PersonalCenterFragment.this.au();
                    } else if ("com.huawei.plugin.account.logout".equals(intent.getAction())) {
                        PersonalCenterFragment.this.o.setAccountNickName(PersonalCenterFragment.this.m.getString(R.string.IDS_hwh_login_hwid_account));
                        PersonalCenterFragment.this.o.setHeadImageByResourceId(R.mipmap.ic_personal_head);
                    }
                }
            }
        };
        this.ae = new MessageObserver() { // from class: wqt
            @Override // com.huawei.pluginmessagecenter.service.MessageObserver
            public final void onChange(int i, MessageChangeEvent messageChangeEvent) {
                this.d.c(i, messageChangeEvent);
            }
        };
        this.j = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LogUtil.a("UIME_PersonalCenterFragment", "mBetaAppUpDateTipsReceiver(): intent = ", intent.getAction());
                if ("com.huawei.health.action.BETA_APP_UPDATE_TIPS".equals(intent.getAction()) && PersonalCenterFragment.this.getUserVisibleHint()) {
                    if (PersonalCenterFragment.this.ad == null || PersonalCenterFragment.this.ad.d() == null || !PersonalCenterFragment.this.ad.d().n()) {
                        PersonalCenterFragment.this.b();
                    }
                }
            }
        };
        this.ax = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        this.z = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
    }

    public PersonalCenterFragment(HealthBottomView healthBottomView) {
        this();
        this.i = healthBottomView;
    }

    public void e(HealthBottomView healthBottomView) {
        this.i = healthBottomView;
        this.f = 0;
        ae();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        this.m = getActivity();
        this.x = Utils.o();
        this.r = Utils.h();
        boolean zIsBrowseMode = LoginInit.getInstance(this.m).isBrowseMode();
        this.u = zIsBrowseMode;
        LogUtil.a("UIME_PersonalCenterFragment", "mIsOversea: ", Boolean.valueOf(this.x), "  mIsAllowLogin: ", Boolean.valueOf(this.r), "  mIsBrowseMode: ", Boolean.valueOf(zIsBrowseMode));
        this.w = CommonUtil.ca();
        if (this.x && !OperationUtils.isOperation(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010))) {
            this.s = 3;
        }
        osa.b(this.m, "data_pop_flag", "");
        osa.b(this.m, "data_downing_flag", "");
        LogUtil.a("UIME_PersonalCenterFragment", "onCreate, ", this);
        this.ad = new wst(this, this.q);
        this.ai = new wsf(this, this.q);
        this.ag = new wsl(this, this.q);
        this.am = new wsr(this.q, this.ax);
        if (!this.x && !this.w) {
            this.ao = new wtb();
        }
        if (this.u) {
            lmf.d().b("0", "0");
        } else {
            l();
            j();
            f();
        }
        ReleaseLogUtil.c("UIME_PersonalCenterFragment", "onCreate finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        wss wssVarD = wss.d(this.m);
        this.au = wssVarD;
        wssVarD.a(this.q);
        this.ar = layoutInflater.inflate(R.layout.fragment_personal_center, viewGroup, false);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        this.ar.setPadding(((Integer) safeRegionWidth.first).intValue(), 0, ((Integer) safeRegionWidth.second).intValue(), 0);
        this.o = (CustomHeadView) this.ar.findViewById(R.id.account_center_customheadview);
        u();
        this.ap = (HealthRecycleView) this.ar.findViewById(R.id.account_center_rv);
        this.aq = new PersonalCenterRecyclerViewAdapter(this.m);
        this.ap.setLayoutManager(new HealthLinearLayoutManager(this.m));
        this.ap.setAdapter(this.aq);
        this.ad.d(this.aq);
        if (this.ap.getItemAnimator() instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) this.ap.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        this.ap.b(false);
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        s();
        d(this.ar);
        w();
        this.ad.r();
        this.aq.c(this.ak);
        this.aq.e(this.ag);
        this.o.setOnClickListener(this.m, this);
        if ("1".equals(SharedPreferenceManager.e(this.m, Integer.toString(10015), "if_need_set_account_login_entry"))) {
            this.o.setVisibility(0);
            if (this.x) {
                this.o.d(8);
            }
        }
        t();
        al();
        ReleaseLogUtil.c("UIME_PersonalCenterFragment", "onCreateView finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        return this.ar;
    }

    private void al() {
        if (StageDelegateProxy.getInstance().isAlreadyAvailable()) {
            return;
        }
        StageDelegateProxy.getInstance().loadPlugins((Application) BaseApplication.getContext(), true, new AppBundleLauncher.InstallCallback() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment.3
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public boolean call(Context context, Intent intent) {
                boolean zIsAlreadyAvailable = StageDelegateProxy.getInstance().isAlreadyAvailable();
                ReleaseLogUtil.c("UIME_PersonalCenterFragment", "tryLoadArkuiBrage postDelayed isAlreadyAvailable:", Boolean.valueOf(zIsAlreadyAvailable));
                return zIsAlreadyAvailable;
            }
        });
    }

    private void s() {
        LogUtil.a("UIME_PersonalCenterFragment", "enter initHeadView.");
        String strE = SharedPreferenceManager.e(this.m, String.valueOf(20000), "huawei_account_login_init");
        if (!this.r && this.x && TextUtils.isEmpty(strE)) {
            this.o.setVisibility(8);
            return;
        }
        this.o.setVisibility(0);
        if (this.x) {
            this.o.d(8);
        } else {
            this.o.d(0);
        }
    }

    private void u() {
        CustomTitleBar customTitleBar = (CustomTitleBar) this.ar.findViewById(R.id.personal_tab_titlebar);
        customTitleBar.setOnClickListener(new View.OnClickListener() { // from class: wqr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("UIME_PersonalCenterFragment", "TitleBar clicked == ");
            }
        });
        customTitleBar.setLeftButtonVisibility(8);
        customTitleBar.setTitleText(this.m.getString(R.string.IDS_hw_show_main_home_page_mine));
        if (qqv.a(this.m)) {
            customTitleBar.setTitleSize(this.m.getResources().getDimension(R.dimen.emui_master_title_2));
        } else {
            customTitleBar.setTitleSize(this.m.getResources().getDimension(R.dimen.textSizeHeadline8));
        }
        if (qrs.ac()) {
            customTitleBar.setTitleSize(this.m.getResources().getDimension(R.dimen.health_common_42dp));
        }
        customTitleBar.setTitleBarBackgroundColor(this.m.getResources().getColor(R.color.transparent));
        customTitleBar.setTitleTextColor(this.m.getResources().getColor(R.color.textColorPrimary));
        this.as = (HealthNestedScrollView) this.ar.findViewById(R.id.personal_scroll);
        final RelativeLayout relativeLayout = (RelativeLayout) this.ar.findViewById(R.id.top_title);
        final FrameLayout frameLayout = (FrameLayout) this.ar.findViewById(R.id.top_bg_layout);
        final float f = qqs.e(BaseApplication.getContext()) ? 0.8f : 1.0f;
        final int color = ContextCompat.getColor(this.m, R.color.colorSubBackground);
        this.as.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: wqs
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                PersonalCenterFragment.d(relativeLayout, color, f, frameLayout, view, i, i2, i3, i4);
            }
        });
    }

    public static /* synthetic */ void d(RelativeLayout relativeLayout, int i, float f, FrameLayout frameLayout, View view, int i2, int i3, int i4, int i5) {
        if (i3 <= 0) {
            relativeLayout.setBackgroundColor(Color.argb(0, (int) (Color.red(i) * f), (int) (Color.green(i) * f), (int) (Color.blue(i) * f)));
            frameLayout.setVisibility(0);
        } else {
            int i6 = (i3 <= 0 || i3 > 100) ? 255 : (int) ((i3 / 100.0f) * 255.0f);
            frameLayout.setVisibility(8);
            relativeLayout.setBackgroundColor(Color.argb(i6, (int) (Color.red(i) * f), (int) (Color.green(i) * f), (int) (Color.blue(i) * f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.ar.findViewById(R.id.personal_center_gridView);
        this.g = healthRecycleView;
        boolean z = this.r;
        if (!z) {
            LogUtil.j("UIME_PersonalCenterFragment", "initGridView mIsAllowLogin == ", Boolean.valueOf(z));
            this.g.setVisibility(8);
            return;
        }
        healthRecycleView.setEnabled(true);
        if (this.p == null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.m, 2);
            this.p = gridLayoutManager;
            gridLayoutManager.setOrientation(1);
            this.g.setLayoutManager(this.p);
        }
        if (this.g.getItemDecorationCount() == 0) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(0);
            int dimensionPixelSize = this.m.getResources().getDimensionPixelSize(R.dimen.cardMarginStart);
            this.g.addItemDecoration(new RecyclerItemDecoration(dimensionPixelSize, dimensionPixelSize, arrayList));
        }
        p();
        if (njy.e(this.t)) {
            LogUtil.j("UIME_PersonalCenterFragment", "mGridCardList is empty hide gridview");
            this.g.setVisibility(8);
        } else {
            PersonalGridAdapter personalGridAdapter = new PersonalGridAdapter(this.m, this.t);
            this.k = personalGridAdapter;
            this.g.setAdapter(personalGridAdapter);
        }
    }

    private void p() {
        boolean zIsKidAccount = LoginInit.getInstance(this.m).isKidAccount();
        this.t.clear();
        if (!Utils.k() && !LoginInit.getInstance(this.m).isMinorAccount() && !this.w) {
            this.t.add(new wrq(this.m, this));
        }
        if (fua.l()) {
            this.t.add(new wrl(this.m, this));
        }
        if (this.r) {
            if (!zIsKidAccount && this.ax.isActiveTargetSwitchOpen()) {
                this.t.add(new wrb(this.m, this));
            }
            this.t.add(new wsa(this.m, this));
        }
        at();
        av();
        Iterator<wrc> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().refreshCardData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        wst wstVar = this.ad;
        if (wstVar == null || wstVar.e() != null) {
            LogUtil.a("UIME_PersonalCenterFragment", "not need initFeedbackSdk");
            return;
        }
        LogUtil.a("UIME_PersonalCenterFragment", "enter initFeedbackSdk");
        if (this.q != null && !lli.e().b() && !lli.e().f()) {
            lli.e().b(false, this.q);
        } else {
            LogUtil.a("UIME_PersonalCenterFragment", "initData , phoneservicesdk is not initialized");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    private void at() {
        LogUtil.a("UIME_PersonalCenterFragment", "gridview mGridCardList.size() = ", Integer.valueOf(this.t.size()));
        int size = this.t.size();
        boolean z = (size == 3 && !qrs.af(this.m)) || qrs.v();
        Iterator<wrc> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().d(z);
        }
        if (!qrs.af(this.m) && size == 4) {
            size = 2;
        }
        LogUtil.a("UIME_PersonalCenterFragment", "gridview column = ", Integer.valueOf(size));
        GridLayoutManager gridLayoutManager = this.p;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanCount(size);
        }
        PersonalGridAdapter personalGridAdapter = this.k;
        if (personalGridAdapter != null) {
            personalGridAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi
    public void cancelBottomRedDotVisible(int i) {
        LogUtil.a("UIME_PersonalCenterFragment", "cancelBottomRedDotVisible position:", Integer.valueOf(i));
        this.h.remove(Integer.valueOf(i));
        ae();
    }

    @Override // com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi
    public void setBottomRedDotVisibility(int i) {
        LogUtil.a("UIME_PersonalCenterFragment", "setBottomRedDotVisibility position:", Integer.valueOf(i));
        this.h.put(Integer.valueOf(i), 1);
        ae();
    }

    private void ae() {
        LogUtil.a("UIME_PersonalCenterFragment", "redRot:", Integer.valueOf(this.h.size()), "last:", Integer.valueOf(this.f));
        if (this.i == null) {
            return;
        }
        if (this.h.size() == 0 && this.f != 0) {
            this.f = this.h.size();
            this.i.e(this.s, false);
        } else {
            if (this.h.size() == 0 || this.f != 0) {
                return;
            }
            this.f = this.h.size();
            this.i.e(this.s, true);
        }
    }

    @Override // com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi
    public void openMessageCenterPage() {
        if (this.m != null) {
            Bundle bundle = new Bundle();
            if (njy.b(this.ac)) {
                String strD = HiJsonUtil.d(this.ac);
                bundle.putString("messages", strD);
                LogUtil.a("UIME_PersonalCenterFragment", "openMessageCenterPage mMessageObjects:", strD);
            }
            if (njy.b(this.d)) {
                bundle.putString("asset", HiJsonUtil.d(this.d));
            }
            AppRouter.c("/PluginMessageCenter/MessageCenterActivity").d(bundle).b(this.m);
        }
        b(AnalyticsValue.HEALTH_MINE_NOTICE_MSG_2040003.value());
    }

    @Override // com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi
    public void openMyAssetPage() {
        if (this.m != null) {
            LogUtil.a("UIME_PersonalCenterFragment", "openMyAssetPage ");
            if (CommonUtil.ca()) {
                AppRouter.c("/HWUserProfileMgr/MyAwardActivity").d(268435456).b(this.m);
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("coupon", this.ai.b());
                bundle.putString("card_case", this.ai.d());
                bundle.putString("award", this.ai.a());
                bundle.putBoolean("point", this.ai.e());
                AppRouter.c("/HWUserProfileMgr/MyAssets").d(268435456).d(bundle).b(this.m);
            }
            b(AnalyticsValue.HEALTH_MY_AWARD_ENTER_2190004.value());
        }
    }

    @Override // com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi
    public void dealAssetMessage(List<AssetMessage> list) {
        List<MessageObject> listB = qhu.b(list, false);
        this.d.clear();
        if (njy.b(listB)) {
            this.d.addAll(listB);
            ab();
        } else {
            LogUtil.j("UIME_PersonalCenterFragment", "assetMsgListQuery is empty");
        }
    }

    @Override // com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi
    public void updateBannerAd(String str, com.huawei.pluginachievement.manager.model.MessageObject messageObject) {
        boolean z = false;
        LogUtil.a("UIME_PersonalCenterFragment", "updateBannerAd: imgUrl = ", Boolean.valueOf(str != null), ", msgObj = ", Boolean.valueOf(messageObject != null));
        wre wreVarC = this.ad.c();
        if (wreVarC == null) {
            return;
        }
        boolean z2 = (str == null || messageObject == null || (!VersionControlUtil.isSupportOperationAccount() || !this.r)) ? false : true;
        if (z2) {
            if (this.aj == null) {
                this.aj = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
            }
            if (LoginInit.getInstance(this.m).isBrowseMode() && fxk.b(messageObject.getDetailUri())) {
                z = true;
            }
            wreVarC.a(qji.b(new wsl.a(this.ag), (BaseActivity) this.m, z, AnalyticsValue.MARKETING_RESOURCE.value()));
            wreVarC.a(str);
        } else {
            wreVarC.a((Object) null);
            wreVarC.a((View.OnClickListener) null);
        }
        LogUtil.a("UIME_PersonalCenterFragment", "updateBannerAd: is show = ", Boolean.valueOf(z2));
        if (wreVarC.i() != z2) {
            wreVarC.a(z2);
            ad();
        } else if (z2) {
            this.aq.d(wreVarC);
        } else {
            LogUtil.a("UIME_PersonalCenterFragment", "need not updateBannerAd");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.setUserVisibleHint(z);
        LogUtil.a("UIME_PersonalCenterFragment", "setUserVisibleHint isVisibleToUser is ", Boolean.valueOf(z));
        if (this.m == null || getActivity() == null || getActivity().getWindow() == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "setUserVisibleHint context is null");
            return;
        }
        if (this.ar == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "setUserVisibleHint mRootView is null");
            return;
        }
        if (z) {
            LogUtil.a("UIME_PersonalCenterFragment", "mIsFirst = ", Boolean.valueOf(this.v), " isRefresh = ", Boolean.valueOf(this.f29027a));
            HealthNestedScrollView healthNestedScrollView = this.as;
            if (healthNestedScrollView != null) {
                ScrollUtil.a(healthNestedScrollView, getActivity().getWindow().getDecorView(), 3004);
            }
            r();
            if (this.v) {
                this.f29027a = true;
                m();
                q();
                ah();
                if (this.e) {
                    this.e = wsg.a(this.m);
                }
                ac();
                HandlerCenter.a().d(new Runnable() { // from class: wqv
                    @Override // java.lang.Runnable
                    public final void run() {
                        PersonalCenterFragment.a();
                    }
                }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            } else if (!this.u) {
                ar();
            } else {
                LogUtil.a("UIME_PersonalCenterFragment", "BrowseMode, need not to update red point");
                k();
                return;
            }
            this.v = false;
            i();
            if (!this.u) {
                e();
                b();
            }
        }
        if (getView() != null) {
            fxl.c(getActivity().getWindow().getDecorView(), z, 3004, "Me");
        }
        ReleaseLogUtil.c("UIME_PersonalCenterFragment", "setUserVisibleHint time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    public static /* synthetic */ void a() {
        if (SecurityChecker.e()) {
            ReleaseLogUtil.b("UIME_PersonalCenterFragment", "App is error");
            System.exit(0);
        }
    }

    private void ar() {
        this.o.e();
        wsg.a(this.q);
        l();
        j();
        f();
        g();
        av();
        Iterator<wrc> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().refreshCardData();
        }
    }

    private void q() {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            MarketingOption.Builder builder = new MarketingOption.Builder();
            builder.setContext(this.m);
            builder.setPageId(110);
            builder.setLayoutMap(new HashMap());
            marketingApi.requestMarketingResource(builder.build());
            HashMap map = new HashMap();
            map.put("open_specific_page", "Me");
            builder.setTriggerEventParams(map);
            builder.setTypeId(49);
            marketingApi.triggerMarketingResourceEvent(builder.build());
            c(marketingApi, builder);
        }
        h();
    }

    private void c(MarketingApi marketingApi, MarketingOption.Builder builder) {
        builder.setTypeId(51);
        marketingApi.triggerMarketingResourceEvent(builder.build());
        builder.setTypeId(52);
        marketingApi.triggerMarketingResourceEvent(builder.build());
    }

    private void e() {
        otu.b(this.m).c(this.q, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        boolean z;
        if (this.ad == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "checkUpateRedPointShow mListManager is null");
            return;
        }
        if (this.w || !nvb.a()) {
            LogUtil.a("UIME_PersonalCenterFragment", "is GP or Store version or update switch is close");
            z = false;
        } else {
            an();
            LogUtil.a("UIME_PersonalCenterFragment", "checkUpateRedPointShow fetchBannerAd");
            h();
            z = true;
        }
        wre wreVarD = this.ad.d();
        if (wreVarD == null || wreVarD.i() == z) {
            return;
        }
        wreVarD.a(z);
        ad();
    }

    private void d(boolean z) {
        LogUtil.a("UIME_PersonalCenterFragment", "enter updateSuggestItem");
        if (!z) {
            LogUtil.j("UIME_PersonalCenterFragment", "updateSuggestItem() sdk init failed");
            return;
        }
        wre wreVarM = this.ad.m();
        if (wreVarM == null) {
            return;
        }
        boolean z2 = !this.u && (!(this.x || lli.a() || CommonUtil.bq()) || (this.x && this.r && lli.c() && !CommonUtil.bq()));
        if (wreVarM.i() != z2) {
            wreVarM.a(z2);
            ad();
        }
    }

    private void m() {
        ag();
        aa();
        ObserverManagerUtil.d(this.al, "OPERATION_FUNCTION_ENTRANCE");
        if (CommonUtil.ap()) {
            z();
        }
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        if (this.u) {
            LogUtil.a("UIME_PersonalCenterFragment", "BrowseMode, need not to update red point");
            k();
            return;
        }
        if (this.m == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "resumePersonalCenterFragment, context is null, return");
            this.u = LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode();
            return;
        }
        ar();
        ba();
        String strE = SharedPreferenceManager.e(this.m, Integer.toString(10000), "rid_dot_dismiss");
        String strE2 = SharedPreferenceManager.e(this.m, Integer.toString(10000), "onboarding_skip_current_time");
        String strE3 = SharedPreferenceManager.e(this.m, Integer.toString(10000), "onboarding_skip");
        LogUtil.a("UIME_PersonalCenterFragment", "redDotVisible = ", strE, " skipTime = ", strE2, " isSetOnBoarding =, ", strE3);
        if (!"1".equals(strE) && !TextUtils.isEmpty(strE2) && !"1".equals(strE3)) {
            this.am.e();
        } else {
            this.y = false;
            wst wstVar = this.ad;
            wstVar.b(wstVar.o(), this.y);
            cancelBottomRedDotVisible(2);
        }
        x();
        an();
        ak();
        ae();
        am();
        af();
        wjs.d(this.m, this.q);
    }

    private void ak() {
        boolean z;
        if (this.x || LoginInit.getInstance(this.m).isKidAccount()) {
            return;
        }
        if (!"true".equals(SharedPreferenceManager.e(this.m, Integer.toString(10000), "wechat_red_dot_show"))) {
            setBottomRedDotVisibility(128);
            LogUtil.a("UIME_PersonalCenterFragment", "showPrivacyManagerRedPoint is datashare and authrize");
            z = true;
        } else {
            cancelBottomRedDotVisible(128);
            z = false;
        }
        wst wstVar = this.ad;
        wstVar.b(wstVar.h(), z);
        LogUtil.a("UIME_PersonalCenterFragment", "showPrivacyManagerRedPoint");
    }

    private void an() {
        boolean z;
        wst wstVar = this.ad;
        if (wstVar == null || wstVar.d() == null) {
            return;
        }
        boolean zHaveNewAppVersion = ((VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class)).haveNewAppVersion(this.m);
        LogUtil.a("UIME_PersonalCenterFragment", "showAppUpdateNew: haveNewAppVersion = ", Boolean.valueOf(zHaveNewAppVersion));
        if (zHaveNewAppVersion) {
            setBottomRedDotVisibility(512);
            z = true;
        } else {
            cancelBottomRedDotVisible(512);
            z = false;
        }
        wst wstVar2 = this.ad;
        wstVar2.b(wstVar2.d(), z);
    }

    private void af() {
        wst wstVar = this.ad;
        if (wstVar == null || wstVar.b() == null) {
            return;
        }
        boolean zA = lua.a(Integer.toString(10000), "agr_query_rpt", false);
        LogUtil.a("UIME_PersonalCenterFragment", "showAboutRedPoint:", Boolean.valueOf(zA));
        if (zA) {
            setBottomRedDotVisibility(288);
        } else {
            cancelBottomRedDotVisible(288);
        }
        wst wstVar2 = this.ad;
        wstVar2.b(wstVar2.b(), zA);
    }

    private void am() {
        wst wstVar = this.ad;
        if (wstVar == null || wstVar.n() == null || !ucq.b()) {
            return;
        }
        boolean zB = SharedPreferenceManager.b(Integer.toString(10000), "service_express_card_red_point", true);
        LogUtil.a("UIME_PersonalCenterFragment", "ShowFaCardsRedPoint:", Boolean.valueOf(zB));
        if (zB) {
            setBottomRedDotVisibility(256);
        } else {
            cancelBottomRedDotVisible(256);
        }
        wst wstVar2 = this.ad;
        wstVar2.b(wstVar2.n(), zB);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        this.u = LoginInit.getInstance(this.m).isBrowseMode();
        if (this.f29027a && getUserVisibleHint()) {
            ah();
            b();
        }
        ReleaseLogUtil.c("UIME_PersonalCenterFragment", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("UIME_PersonalCenterFragment", "onConfigurationChanged enter");
        u();
        PersonalCenterRecyclerViewAdapter personalCenterRecyclerViewAdapter = this.aq;
        if (personalCenterRecyclerViewAdapter != null) {
            personalCenterRecyclerViewAdapter.e(true);
            this.aq.d(this.ad.k());
            this.aq.d(this.ad.c());
        }
        at();
    }

    private void i() {
        if (this.o == null) {
            return;
        }
        String accountInfo = LoginInit.getInstance(this.m).getAccountInfo(1010);
        if (TextUtils.isEmpty(accountInfo) || CommonUtil.g(this.m, accountInfo) || "0".equals(LoginInit.getInstance(this.m).getAccountInfo(1011))) {
            return;
        }
        this.o.setVisibility(0);
        if (this.x) {
            this.o.d(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        LogUtil.a("UIME_PersonalCenterFragment", "judgeNoticeDot");
        synchronized (f29026c) {
            ExecutorService executorService = this.aw;
            if (executorService == null || executorService.isShutdown()) {
                this.aw = Executors.newSingleThreadExecutor();
            }
            this.aw.execute(new Runnable() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    PersonalCenterFragment.this.o();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Handler handler = this.q;
        if (handler == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "handleNoticeDot handler is null");
            return;
        }
        if (this.z == null) {
            this.z = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        }
        int messageCenterUnreadCount = this.z.getMessageCenterUnreadCount();
        if (otu.b(this.m).a()) {
            messageCenterUnreadCount++;
        }
        LogUtil.a("UIME_PersonalCenterFragment", "handleNoticeDot unReadCount:", Integer.valueOf(messageCenterUnreadCount));
        if (njy.b(this.ac)) {
            for (MessageObject messageObject : this.ac) {
                LogUtil.a("UIME_PersonalCenterFragment", "handleNoticeDot messageObject:", messageObject.toString());
                if (messageObject.getReadFlag() == 0) {
                    messageCenterUnreadCount++;
                }
            }
        }
        if (!njy.b(this.d)) {
            LogUtil.j("UIME_PersonalCenterFragment", "handleNoticeDot mAssetMessageObjects is empty");
        } else {
            for (MessageObject messageObject2 : this.d) {
                LogUtil.a("UIME_PersonalCenterFragment", "handleNoticeDot messageObject:", messageObject2.toString());
                if (messageObject2.getReadFlag() == 0) {
                    messageCenterUnreadCount++;
                }
            }
        }
        LogUtil.a("UIME_PersonalCenterFragment", "handleNoticeDot unReadCount:", Integer.valueOf(messageCenterUnreadCount));
        int i = messageCenterUnreadCount > 0 ? 9 : 10;
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        messageObtainMessage.arg1 = messageCenterUnreadCount;
        handler.sendMessage(messageObtainMessage);
    }

    private void c() {
        wst wstVar = this.ad;
        wstVar.b(wstVar.o(), this.y);
        cancelBottomRedDotVisible(2);
    }

    private void d(View view) {
        ae();
        wss wssVar = this.au;
        if (wssVar != null) {
            wssVar.d();
        }
        c(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        LogUtil.a("UIME_PersonalCenterFragment", "Enter initAchieveData");
        wsg.d dVar = obj instanceof wsg.d ? (wsg.d) obj : null;
        if (dVar == null) {
            LogUtil.a("UIME_PersonalCenterFragment", "data null");
            return;
        }
        PersonalData personalDataE = dVar.e();
        if (!this.x && personalDataE != null) {
            c(wsp.e(personalDataE), wsp.a(personalDataE));
            e(wsp.d(personalDataE));
        }
        if (dVar.b() != null) {
            ArrayList<String> arrayListB = dVar.b();
            LogUtil.a("UIME_PersonalCenterFragment", "mMedalLists length == ", Integer.valueOf(arrayListB.size()));
            wst wstVar = this.ad;
            wstVar.e(wstVar.k(), arrayListB);
        }
    }

    private void c(int i, String str) {
        LogUtil.a("UIME_PersonalCenterFragment", "enter setUserRankLevel(): level = ", Integer.valueOf(i), ", describe = ", str);
        boolean z = !this.u && paq.e();
        if (z) {
            setBottomRedDotVisibility(3);
            LogUtil.a("UIME_PersonalCenterFragment", "setUserRankLevel is datashare and authrize");
        } else {
            cancelBottomRedDotVisible(3);
        }
        this.o.a(i, z);
    }

    private void e(int i) {
        LogUtil.d("UIME_PersonalCenterFragment", "Enter setTotalCal cal:", Integer.valueOf(i));
        this.o.d(UnitUtil.e(i, 1, 0));
    }

    private void a(int i) {
        LogUtil.d("UIME_PersonalCenterFragment", "Enter setUnreadMessageNum unreadMessageNum:", Integer.valueOf(i));
        HealthTextView healthTextView = this.an;
        if (healthTextView == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "setUnreadMessageNum, mNoticeMessageRedDot is null");
            return;
        }
        if (i <= 0) {
            healthTextView.setVisibility(8);
            lrd.b(this.af, qre.f(R.string.IDS_user_profile_message));
            return;
        }
        if (i >= 100) {
            healthTextView.setBackgroundResource(R.drawable.messages_red_point_bg_rectangle);
            this.an.setVisibility(0);
            String str = UnitUtil.e(99.0d, 1, 0) + Marker.ANY_NON_NULL_MARKER;
            this.an.setText(str);
            lrd.b(this.af, qre.e(R.plurals.accessibility_message_num, 99, str));
            return;
        }
        healthTextView.setBackgroundResource(R.drawable.messages_red_point_bg_circle);
        this.an.setVisibility(0);
        String strE = UnitUtil.e(i, 1, 0);
        this.an.setText(strE);
        lrd.b(this.af, qre.e(R.plurals.accessibility_message_num, i, strE));
    }

    private void d(dnj dnjVar, String str) {
        if (dnjVar != null) {
            dnjVar.e(str);
        }
    }

    private void e(dnj dnjVar, String str) {
        if (dnjVar != null) {
            dnjVar.c(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HiUserInfo hiUserInfo) {
        if (hiUserInfo == null) {
            LogUtil.a("UIME_PersonalCenterFragment", "accountmigrate: setUserNameFromLocal hiUserInfo == null");
            return;
        }
        this.o.setAccountNickName(wsp.a(hiUserInfo));
        e(wsp.a(hiUserInfo));
        String strB = wsp.b(hiUserInfo);
        LogUtil.a("UIME_PersonalCenterFragment", "accountmigrate: headImgPath = ", strB);
        LogUtil.d("UIME_PersonalCenterFragment", "accountfilepath = ", this.m.getFilesDir(), "/photos/headimage");
        String strB2 = this.am.b(strB);
        if (!TextUtils.isEmpty(strB2)) {
            Bitmap bitmapA = qqf.a(this.m, strB2);
            this.ax.sync(null);
            imz.b("PersonalCenterFragment");
            LogUtil.a("UIME_PersonalCenterFragment", "accountmigrate: setUserNameFromLocal headImgPath = ", strB2);
            if (bitmapA != null) {
                this.o.setHeadImageByBitmap(bitmapA);
                return;
            }
            return;
        }
        this.o.setAccountNickName(this.m.getString(R.string.IDS_hwh_login_hwid_account));
        this.o.setHeadImageByResourceId(R.mipmap.ic_personal_head);
        LogUtil.a("UIME_PersonalCenterFragment", "accountmigrate: setUserNameFromLocal() headImgPath is null! ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ba() {
        if ("1".equals(SharedPreferenceManager.e(this.m, Integer.toString(10015), "if_need_set_account_login_entry")) && !this.r) {
            LogUtil.a("UIME_PersonalCenterFragment", "updateUserName ifNeedSetAccountString.equals(\"1\")");
            this.o.d(8);
            this.o.setAccountNickName(this.m.getString(R.string.IDS_hwh_login_hwid_account));
            this.o.setHeadImageByResourceId(R.mipmap.ic_personal_head);
            return;
        }
        this.am.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "handleWhenGetUserInfoSuccess()! userinfo is null! ");
            return;
        }
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        LogUtil.a("UIME_PersonalCenterFragment", "userinfo = ", userInfomation.toString());
        String strE = wsp.e(userInfomation);
        if (TextUtils.isEmpty(strE)) {
            String accountName = new UpApi(this.m).getAccountName();
            if (!TextUtils.isEmpty(accountName)) {
                this.o.setAccountNickName(accountName);
                d(mainUser, accountName);
                e(accountName);
            }
        } else {
            d(mainUser, strE);
            this.o.setAccountNickName(strE);
        }
        if (CommonUtil.ca()) {
            this.at = new UserInfoMockInteractor(this.m);
            LogUtil.d("UIME_PersonalCenterFragment", "isPicPath： ", userInfomation.getPicPath());
            userInfomation.setPicPath(lod.b(this.m, "1", this.at.e()));
            this.at = null;
            LogUtil.a("UIME_PersonalCenterFragment", "isPicPath： ", userInfomation.getPicPath());
        }
        e(mainUser, wsp.c(userInfomation));
        this.o.setHeadPictureView(userInfomation);
    }

    private void e(String str) {
        UserInfomation userInfo = this.ax.getUserInfo();
        if (userInfo != null) {
            if (TextUtils.isEmpty(userInfo.getName())) {
                userInfo.setName(str);
                this.ax.setUserInfo(userInfo, null);
                return;
            }
            return;
        }
        LogUtil.j("UIME_PersonalCenterFragment", "userInfomation is null or user name not null");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (qrs.c(500)) {
            LogUtil.a("UIME_PersonalCenterFragment", "click too fast");
            return;
        }
        LogUtil.a("UIME_PersonalCenterFragment", "onClick");
        if (id == R.id.account_head_picture || id == R.id.account_nickname) {
            if (this.w) {
                LogUtil.a("UIME_PersonalCenterFragment", "storedemo no user");
                return;
            }
            if (this.u) {
                LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: wqx
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        PersonalCenterFragment.b(i, obj);
                    }
                }, "");
                return;
            }
            if ("1".equals(SharedPreferenceManager.e(this.m, Integer.toString(10015), "if_need_set_account_login_entry")) && !this.r) {
                LogUtil.a("UIME_PersonalCenterFragment", "send broadcast to trriger checkLogin...");
                this.v = true;
                Intent intent = new Intent();
                intent.setAction("com.huawei.plugin.trigger.checklogin");
                if (LocalBroadcastManager.getInstance() != null) {
                    LocalBroadcastManager.getInstance().sendBroadcast(intent);
                    return;
                }
                return;
            }
            if (CommonUtil.z(this.m)) {
                ThirdPartyLoginManager.getInstance().openAccountManager(getActivity());
                return;
            }
            String strE = SharedPreferenceManager.e(this.m, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN);
            boolean zCheckIsInstallHuaweiAccount = HuaweiLoginManager.checkIsInstallHuaweiAccount(this.m);
            LogUtil.a("UIME_PersonalCenterFragment", "accountmigrate: hasHwid = ", Boolean.valueOf(zCheckIsInstallHuaweiAccount));
            if ("1".equals(strE) || !zCheckIsInstallHuaweiAccount) {
                LogUtil.a("UIME_PersonalCenterFragment", "accountmigrate: isthirdlogin == 1 and return!");
                return;
            } else {
                LogUtil.a("UIME_PersonalCenterFragment", "health, jumpToHwIdAccountCenter, errorCode = ", Integer.valueOf(new UpApi(this.m).jumpToHwIdAccountCenter(this, 1)));
                b(AnalyticsValue.HEALTH_MINE_HEAD_IMG_2040002.value());
                return;
            }
        }
        if (id == R.id.rl_message_new) {
            openMessageCenterPage();
        } else {
            LogUtil.a("UIME_PersonalCenterFragment", "id = ", Integer.valueOf(id));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("UIME_PersonalCenterFragment", "back from HuaweiAccountApk.requestCode = ", Integer.valueOf(i), ",resultCode = ", Integer.valueOf(i2));
        if (i != 1) {
            if (i != 2) {
                return;
            }
            setBottomRedDotVisibility(288);
        } else {
            LogUtil.a("UIME_PersonalCenterFragment", "refresh headImage and name.");
            this.ax.sync(this.f29028b);
            imz.b("PersonalCenterFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a("UIME_PersonalCenterFragment", "onDestroy, ", this);
        as();
        ap();
        ObserverManagerUtil.a(this.al, "OPERATION_FUNCTION_ENTRANCE");
        if (CommonUtil.ap()) {
            ao();
        }
        super.onDestroy();
        synchronized (f29026c) {
            ExecutorService executorService = this.aw;
            if (executorService != null) {
                if (!executorService.isShutdown()) {
                    this.aw.shutdownNow();
                }
                this.aw = null;
            }
        }
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        wss wssVar = this.au;
        if (wssVar != null) {
            wssVar.a((Handler) null);
            this.au = null;
        }
        RelativeLayout relativeLayout = this.ah;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(null);
            this.ah = null;
        }
        this.i = null;
        this.ad.q();
        this.z = null;
        this.ae = null;
        List<wre> list = this.ak;
        if (list != null) {
            list.clear();
            this.ak = null;
        }
        wrd wrdVar = this.n;
        if (wrdVar != null) {
            wrdVar.c(true);
        }
        lli.e().j();
    }

    private void aa() {
        LogUtil.a("UIME_PersonalCenterFragment", "Start register");
        if (this.z == null || this.ae == null) {
            return;
        }
        LogUtil.a("UIME_PersonalCenterFragment", "registerADObserver");
        this.z.registerMessageObserver(this.ae);
    }

    private void ap() {
        if (this.z == null || this.ae == null) {
            return;
        }
        LogUtil.a("UIME_PersonalCenterFragment", "unregisterADObserver");
        this.z.unregisterMessageObserver(this.ae);
    }

    private void ag() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        intentFilter.addAction("com.huawei.bone.action.FITNESS_USERINFO_UPDATED");
        if (this.x) {
            intentFilter.addAction("com.huawei.bone.action.AIRULE_PARSE_SUCCESS");
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        this.ab = localBroadcastManager;
        localBroadcastManager.registerReceiver(this.av, intentFilter);
    }

    private void as() {
        LocalBroadcastManager localBroadcastManager = this.ab;
        if (localBroadcastManager == null) {
            return;
        }
        try {
            localBroadcastManager.unregisterReceiver(this.av);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("UIME_PersonalCenterFragment", e2.getMessage());
        }
    }

    private void z() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.BETA_APP_UPDATE_TIPS");
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        this.ab = localBroadcastManager;
        localBroadcastManager.registerReceiver(this.j, intentFilter);
    }

    private void ao() {
        LocalBroadcastManager localBroadcastManager = this.ab;
        if (localBroadcastManager == null) {
            return;
        }
        try {
            localBroadcastManager.unregisterReceiver(this.j);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("UIME_PersonalCenterFragment", e2.getMessage());
        }
    }

    private void b(String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(this.m, str, map, 0);
    }

    private boolean y() {
        return (this.x || this.w) ? false : true;
    }

    private void aj() {
        if (y()) {
            if (otu.b(this.m).a()) {
                setBottomRedDotVisibility(4);
            } else {
                cancelBottomRedDotVisible(4);
            }
            aw();
        }
    }

    private void e(List<String> list) {
        LogUtil.a("UIME_PersonalCenterFragment", "updateMessageCenterForMedal");
        if (this.n == null) {
            this.n = new wrd(list, new IBaseResponseCallback() { // from class: wqw
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f52357a.d(i, obj);
                }
            });
            ThreadPoolManager.c().execute(this.n);
        } else {
            LogUtil.j("UIME_PersonalCenterFragment", "updateMessageCenterForMedal has processed thread");
        }
    }

    public /* synthetic */ void d(int i, Object obj) {
        this.n = null;
    }

    private void x() {
        e();
        if (!this.x && this.ad.k() != null) {
            String strE = osa.e(this.m, "my_medal_red_point");
            String strE2 = osa.e(this.m, "_medalPngStatusDownload");
            LogUtil.a("UIME_PersonalCenterFragment", "isShowMyMedalRedPoint =", strE);
            ArrayList arrayList = new ArrayList(10);
            if (!strE.trim().isEmpty() && !"no".equals(strE)) {
                boolean z = false;
                for (String str : strE.split(",")) {
                    if (oun.a("", str, this.m, strE2)) {
                        arrayList.add(str);
                        z = true;
                    }
                }
                if (z) {
                    setBottomRedDotVisibility(16);
                    wst wstVar = this.ad;
                    wstVar.b(wstVar.k(), true);
                    e((List<String>) arrayList);
                }
            }
        }
        ax();
    }

    private void ax() {
        if (this.x || this.ad.e() == null) {
            return;
        }
        String strE = osa.e(this.m, "my_help_red_point");
        LogUtil.a("UIME_PersonalCenterFragment", "isShowMyHelpRedPoint =", strE);
        if (!strE.trim().isEmpty() || "no".equals(strE)) {
            return;
        }
        wst wstVar = this.ad;
        wstVar.b(wstVar.e(), true);
        setBottomRedDotVisibility(32);
    }

    private void av() {
        wtb wtbVar;
        if (this.x || (wtbVar = this.ao) == null) {
            return;
        }
        wtbVar.b(this.q);
    }

    private boolean v() {
        return (((Activity) this.m).isFinishing() || ((Activity) this.m).isDestroyed()) ? false : true;
    }

    private void c(View view) {
        this.ah = (RelativeLayout) qsp.a(view, R.id.rl_message_new);
        this.an = (HealthTextView) view.findViewById(R.id.txt_message_count_new);
        this.af = (ImageView) qsp.a(view, R.id.iv_message);
        if (LanguageUtil.ba(this.m)) {
            this.af.setImageDrawable(qqz.e(this.m, R.mipmap.ic_me_msg_black));
        }
        this.ah.setOnClickListener(qji.b(this, (BaseActivity) this.m, true, AnalyticsValue.HEALTH_MINE_NOTICE_MSG_2040003.value()));
    }

    private void w() {
        LogUtil.a("UIME_PersonalCenterFragment", "initRecyclerData");
        if (this.ap == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "initRecyclerData mRecyclerView is null");
            return;
        }
        List<wre> list = this.ak;
        if (list == null) {
            this.ak = new ArrayList(16);
        } else {
            list.clear();
        }
        if (!this.r && this.x) {
            this.ak = this.ad.l();
        } else {
            this.ak = this.ad.t();
        }
        au();
    }

    private void k() {
        this.o.setAccountNickName(this.m.getString(R.string.IDS_hwh_login_hwid_account));
        this.o.setHeadImageByResourceId(R.mipmap.ic_personal_head);
        this.o.d((UserMemberInfo) null);
        this.o.c(false, irz.j());
        c(1, "");
        e(0);
        this.o.b(8);
        this.h.clear();
        ae();
        if (this.ad.f() != null) {
            this.ad.f().a(false);
        }
        if (this.ad.m() != null) {
            this.ad.m().a(false);
        }
        if (this.ad.a() != null) {
            this.ad.a().a(false);
        }
        if (!njy.e(this.ak)) {
            for (wre wreVar : this.ak) {
                wreVar.c(false);
                if (wreVar.j() != 5 && wreVar.j() != 6) {
                    wreVar.a((Object) null);
                }
            }
        }
        ad();
        this.an.setVisibility(8);
        if (!this.x && !this.w) {
            d((Map<Integer, List<wtv>>) null);
        }
        Iterator<wrc> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().refreshCardData();
        }
    }

    private void ay() {
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment.8
            @Override // java.lang.Runnable
            public void run() {
                PersonalCenterFragment.this.au();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        if (this.v) {
            this.v = false;
        }
        this.x = Utils.o();
        this.r = Utils.h();
        if (this.u) {
            LogUtil.a("UIME_PersonalCenterFragment", "updateAfterLoginSuccess");
            this.u = LoginInit.getInstance(this.m).isBrowseMode();
            ah();
        }
        w();
        ad();
        LogUtil.a("UIME_PersonalCenterFragment", "updateAfterLoginSuccess fetchBannerAd");
        h();
    }

    private void a(boolean z) {
        LogUtil.a("UIME_PersonalCenterFragment", "updateKakaCheckRed isTodayCheckedIn == ", Boolean.valueOf(z));
        this.aa = z;
        if (z) {
            cancelBottomRedDotVisible(1024);
            ae();
        } else {
            setBottomRedDotVisibility(1024);
            ae();
        }
        aw();
    }

    private void aw() {
        if (!this.aa || otu.b(this.m).a()) {
            this.o.b(0);
        } else {
            this.o.b(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void au() {
        CustomHeadView customHeadView = this.o;
        if (customHeadView == null) {
            return;
        }
        customHeadView.c(!VersionControlUtil.isSupportOperationAccount(), irz.j());
    }

    private void d(List<pjd> list) {
        if (this.o == null) {
            ReleaseLogUtil.d("UIME_PersonalCenterFragment", "refreshHeadView mCustomHeadView is null");
            return;
        }
        boolean zC = pjg.c(list, "1");
        ReleaseLogUtil.c("UIME_PersonalCenterFragment", "refreshHeadView isEnableVipFunction ", Boolean.valueOf(zC));
        this.o.c(!VersionControlUtil.isSupportOperationAccount(), zC);
    }

    private void ad() {
        if (this.aq != null) {
            this.ad.r();
            this.aq.notifyDataSetChanged();
        }
    }

    private void h() {
        LogUtil.a("UIME_PersonalCenterFragment", " fetchBannerAd into");
        if (VersionControlUtil.isSupportOperationAccount() && this.r) {
            LogUtil.a("UIME_PersonalCenterFragment", " fetchBannerAd into valid");
            wsl wslVar = this.ag;
            if (wslVar != null) {
                wslVar.c();
            }
        }
    }

    private void e(UserMemberInfo userMemberInfo) {
        if (this.o == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "mCustomHeadView is null");
            return;
        }
        ay();
        if (this.o.d(userMemberInfo)) {
            return;
        }
        ReleaseLogUtil.c("UIME_PersonalCenterFragment", "user is not VIP.");
    }

    private void f() {
        if (CommonUtil.ca()) {
            return;
        }
        LogUtil.a("UIME_PersonalCenterFragment", "getBenefitMessages start");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment.9
            @Override // java.lang.Runnable
            public void run() {
                ((VipApi) Services.b("vip", VipApi.class)).getVipMessageList(System.currentTimeMillis(), 50L, new b(PersonalCenterFragment.this, 6), true);
            }
        });
    }

    private void l() {
        LogUtil.a("UIME_PersonalCenterFragment", "getVipInfo start");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment.6
            @Override // java.lang.Runnable
            public void run() {
                ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new VipCallback() { // from class: com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment.6.3
                    @Override // com.huawei.health.vip.api.VipCallback
                    public void onSuccess(Object obj) {
                        UserMemberInfo userMemberInfo;
                        if (obj == null) {
                            LogUtil.j("UIME_PersonalCenterFragment", "getVipInfo onSuccess result is null");
                            return;
                        }
                        if (obj instanceof UserMemberInfo) {
                            userMemberInfo = (UserMemberInfo) obj;
                            LogUtil.d("UIME_PersonalCenterFragment", "getVipInfo mUserMemberInfo = ", userMemberInfo.toString());
                        } else {
                            userMemberInfo = null;
                        }
                        Message messageObtainMessage = PersonalCenterFragment.this.q.obtainMessage();
                        messageObtainMessage.what = a.C;
                        messageObtainMessage.obj = userMemberInfo;
                        PersonalCenterFragment.this.q.sendMessage(messageObtainMessage);
                    }

                    @Override // com.huawei.health.vip.api.VipCallback
                    public void onFailure(int i, String str) {
                        ReleaseLogUtil.d("UIME_PersonalCenterFragment", "getVipInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
                    }
                });
                PersonalCenterFragment.this.n();
            }
        });
    }

    private void j() {
        LogUtil.a("UIME_PersonalCenterFragment", "getAssetsInfo start");
        BaseApplication.getContext();
        if (this.u || this.w || Utils.k() || !VersionControlUtil.isSupportOperationAccount()) {
            LogUtil.a("UIME_PersonalCenterFragment", "not need getAssetsInfo");
            return;
        }
        if (njy.b(this.d)) {
            LogUtil.a("UIME_PersonalCenterFragment", "clear mMessageObjects");
            this.d.clear();
        }
        wsf wsfVar = this.ai;
        if (wsfVar != null) {
            wsfVar.c();
            this.ai.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        LogUtil.a("UIME_PersonalCenterFragment", "enter getVipMessages");
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "getVipMessages VipApi is null");
        } else {
            vipApi.getVipMessageList(System.currentTimeMillis(), 50L, new b(this, 3), false);
        }
    }

    private void ai() {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.a("UIME_PersonalCenterFragment", "getDeviceBenefits payApi is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        if (CommonUtil.bg() && !TextUtils.isEmpty(this.l)) {
            arrayList.add(new DeviceBenefitQueryParam.Builder().setDeviceType(PhoneInfoUtils.getDeviceModel()).setDeviceSn(this.l).setBenefitType(DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_PERF_PURCHASE).setDeviceCategory(DeviceBenefitQueryParam.DeviceCategory.DEVICE_CATEGORY_PHONE.getCategory()).setDeviceSnType(DeviceBenefitQueryParam.DeviceSnType.DEVICE_SN_TYPE_UDID.getSnType()).setNeedProductInfo(true).build());
        }
        arrayList.addAll(qhu.d("UIME_PersonalCenterFragment", DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL));
        payApi.getAllDeviceBenefits(arrayList, new b(this, 4));
    }

    private void g() {
        if (!TextUtils.isEmpty(this.l) || !CommonUtil.bg()) {
            LogUtil.a("UIME_PersonalCenterFragment", "mDeviceSn is not empty or not huawei system");
            ai();
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d();
                }
            });
        }
    }

    public /* synthetic */ void d() {
        String strC = qhu.c(this.m);
        this.l = strC;
        LogUtil.a("UIME_PersonalCenterFragment", "getDeviceSn end is deviceSn empty", Boolean.valueOf(TextUtils.isEmpty(strC)));
        ai();
    }

    private void b(boolean z) {
        LogUtil.a("UIME_PersonalCenterFragment", "showMyAssetRedPoint isHaveRed:", Boolean.valueOf(z));
        if (z) {
            setBottomRedDotVisibility(2048);
            LogUtil.a("UIME_PersonalCenterFragment", "showMyAssetRedPoint true");
        } else {
            cancelBottomRedDotVisible(2048);
        }
        wst wstVar = this.ad;
        wstVar.b(wstVar.i(), z);
        LogUtil.a("UIME_PersonalCenterFragment", "showMyAssetRedPoint");
    }

    private static void b(PersonalCenterFragment personalCenterFragment, Message message) {
        int i = message.what;
        if (i == 16) {
            if (message.obj instanceof Boolean) {
                personalCenterFragment.d(((Boolean) message.obj).booleanValue());
                return;
            }
            return;
        }
        if (i == 37) {
            Bundle data = message.getData();
            wqz.d(data.getInt("bugTypeId"), data.getString("dtsNumber"), data.getString("fileLogId"));
            return;
        }
        switch (i) {
            case a.A /* 209 */:
                personalCenterFragment.updateBannerAd(message.obj instanceof String ? (String) message.obj : null, personalCenterFragment.ag.b());
                break;
            case a.C /* 210 */:
                personalCenterFragment.e(message.obj instanceof UserMemberInfo ? (UserMemberInfo) message.obj : null);
                break;
            case a.D /* 211 */:
                Object obj = message.obj;
                if (njy.b(obj, pjd.class)) {
                    personalCenterFragment.d((List<pjd>) obj);
                }
                break;
            default:
                switch (i) {
                    case a.L /* 213 */:
                        if (message.obj instanceof Boolean) {
                            personalCenterFragment.b(((Boolean) message.obj).booleanValue());
                        }
                        break;
                    case a.M /* 214 */:
                        List<DeviceBenefits> arrayList = new ArrayList<>(10);
                        if (njy.b(message.obj, DeviceBenefits.class)) {
                            arrayList = (List) message.obj;
                        }
                        personalCenterFragment.o.b(arrayList);
                        break;
                    case a.N /* 215 */:
                        personalCenterFragment.d(message.obj instanceof Map ? (Map) message.obj : null);
                        break;
                    default:
                        c(personalCenterFragment, message);
                        break;
                }
                break;
        }
    }

    private static void c(PersonalCenterFragment personalCenterFragment, Message message) {
        int i = message.what;
        if (i == 202) {
            if (personalCenterFragment.v()) {
                personalCenterFragment.au.a();
            }
            Toast.makeText(personalCenterFragment.m, personalCenterFragment.m.getResources().getString(R.string.IDS_confirm_network_whether_connected), 0).show();
            return;
        }
        if (i != 203) {
            return;
        }
        if (personalCenterFragment.v()) {
            personalCenterFragment.au.a();
        }
        Toast.makeText(personalCenterFragment.m, personalCenterFragment.m.getResources().getString(R.string.IDS_update_server_bussy), 0).show();
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<PersonalCenterFragment> f29035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29036c;

        b(PersonalCenterFragment personalCenterFragment, int i) {
            this.f29035b = new WeakReference<>(personalCenterFragment);
            this.f29036c = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            PersonalCenterFragment personalCenterFragment = this.f29035b.get();
            if (personalCenterFragment != null) {
                Handler handler = personalCenterFragment.q;
                if (handler == null) {
                    LogUtil.j("UIME_PersonalCenterFragment", "handler is null");
                    return;
                }
                LogUtil.a("UIME_PersonalCenterFragment", "GetVipInfoResponseCallback errorCode = ", Integer.valueOf(i), " mResultType = ", Integer.valueOf(this.f29036c));
                a(i, obj, personalCenterFragment, handler);
                return;
            }
            LogUtil.j("UIME_PersonalCenterFragment", "personalCenterFragment is null");
        }

        private void a(int i, Object obj, PersonalCenterFragment personalCenterFragment, Handler handler) {
            Message messageObtainMessage = handler.obtainMessage();
            int i2 = this.f29036c;
            if (i2 == 3) {
                if (i == 0 && (obj instanceof List)) {
                    List<MessageObject> listE = irz.e((List<MemberMessage>) obj, false);
                    personalCenterFragment.ac.clear();
                    if (njy.b(listE)) {
                        personalCenterFragment.ac.addAll(listE);
                        ReleaseLogUtil.c("UIME_PersonalCenterFragment", "handleResultType mMessageObjects size", Integer.valueOf(personalCenterFragment.ac.size()));
                        personalCenterFragment.ab();
                        return;
                    }
                    LogUtil.j("UIME_PersonalCenterFragment", "handleResultType getVipMessages is empty");
                    return;
                }
                LogUtil.j("UIME_PersonalCenterFragment", "handleResultType getVipMessages errorCode:", Integer.valueOf(i));
                return;
            }
            if (i2 == 4) {
                if (i == 0 && njy.b(obj, DeviceBenefits.class)) {
                    messageObtainMessage.obj = (List) obj;
                }
                messageObtainMessage.what = a.M;
                handler.sendMessage(messageObtainMessage);
                return;
            }
            if (i2 == 6) {
                if (i == 0 && (obj instanceof List)) {
                    PersonalCenterFragment.b((List<MemberMessage>) obj);
                    return;
                } else {
                    LogUtil.j("UIME_PersonalCenterFragment", "handleResultType getBenefitMessages errorCode:", Integer.valueOf(i));
                    return;
                }
            }
            LogUtil.j("UIME_PersonalCenterFragment", "handleResultType GetVipInfoResponseCallback error type");
        }
    }

    static class e implements Observer {
        private final WeakReference<PersonalCenterFragment> d;

        e(PersonalCenterFragment personalCenterFragment) {
            this.d = new WeakReference<>(personalCenterFragment);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            PersonalCenterFragment personalCenterFragment = this.d.get();
            if (personalCenterFragment == null) {
                ReleaseLogUtil.d("UIME_PersonalCenterFragment", "InnerObserver notify fragment is null");
                return;
            }
            LogUtil.a("UIME_PersonalCenterFragment", "InnerObserver notify label ", str, " objects ", objArr);
            if (TextUtils.isEmpty(str) || !str.equals("OPERATION_FUNCTION_ENTRANCE") || njy.e(objArr, 1)) {
                return;
            }
            Message messageObtainMessage = personalCenterFragment.q.obtainMessage();
            messageObtainMessage.what = a.D;
            messageObtainMessage.obj = objArr[1];
            personalCenterFragment.q.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(List<MemberMessage> list) {
        List<MessageObject> listE = irz.e(list, false);
        if (njy.b(listE)) {
            ReleaseLogUtil.c("UIME_PersonalCenterFragment", "getBenefitMessages size= ", Integer.valueOf(listE.size()));
            ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).insertMessages(listE);
        }
    }

    private void ac() {
        H5ProPkgPreloadSyncTask.startTask(BaseApplication.getContext(), "com.huawei.health.h5.vip", new H5PreloadIntervalStrategy(3600000L));
        H5ProPkgPreloadSyncTask.startTask(BaseApplication.getContext(), "com.huawei.health.h5.groups", new H5PreloadCountStrategy(1));
        H5ProPkgPreloadSyncTask.startTask(BaseApplication.getContext(), "com.huawei.health.h5.my-annual-flag", new H5PreloadIntervalStrategy(3600000L));
        H5ProPkgPreloadSyncTask.startTask(BaseApplication.getContext(), KakaConstants.KAKA_H5_PACKAGE_NAME, new H5PreloadIntervalStrategy(86400000L));
    }

    private void d(Map<Integer, List<wtv>> map) {
        LogUtil.a("UIME_PersonalCenterFragment", "handlePlanData");
        wst wstVar = this.ad;
        if (wstVar == null || wstVar.j() == null || this.ad.g() == null) {
            LogUtil.j("UIME_PersonalCenterFragment", "PlanPager or MyCourse item is null ");
            return;
        }
        if (map == null || map.size() == 0) {
            LogUtil.a("UIME_PersonalCenterFragment", "handlePlanData dataMaps is empty");
            this.ad.j().a(false);
            this.ad.g().a(true);
            lua.d(Integer.toString(10006), "is_me_plan_tab_show", false);
        } else {
            LogUtil.a("UIME_PersonalCenterFragment", "handlePlanData dataMaps is not empty");
            List<wtv> list = map.containsKey(0) ? map.get(0) : null;
            List<wtv> list2 = map.containsKey(1) ? map.get(1) : null;
            List<wtv> list3 = map.containsKey(2) ? map.get(2) : null;
            if (njy.e(list) && njy.e(list2) && njy.e(list3)) {
                LogUtil.a("UIME_PersonalCenterFragment", "handlePlanData all tab has non data");
                this.ad.j().a(false);
                this.ad.g().a(true);
                lua.d(Integer.toString(10006), "is_me_plan_tab_show", false);
            } else {
                LogUtil.a("UIME_PersonalCenterFragment", "handlePlanData show plan tab");
                this.ad.j().a(true);
                this.ad.j().a(map);
                this.ad.g().a(false);
                lua.d(Integer.toString(10006), "is_me_plan_tab_show", true);
            }
        }
        ad();
    }
}
