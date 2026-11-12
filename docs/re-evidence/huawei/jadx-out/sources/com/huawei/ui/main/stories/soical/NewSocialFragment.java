package com.huawei.ui.main.stories.soical;

import android.bluetooth.BluetoothManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.Gson;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.configuredpage.api.ConfiguredPageApi;
import com.huawei.health.configuredpage.api.ConfiguredPageDataCallback;
import com.huawei.health.knit.model.mainpage.MainPageConfig;
import com.huawei.health.knit.model.mainpage.MainPageGroupConfig;
import com.huawei.health.knit.section.listener.NewSocialPageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.InputBoxTemplate;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.TopBannerNewTemplate;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.operationbundle.R;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.operation.utils.OperationWebActivityIntentBuilderApi;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.commonui.view.KakaClaimAnimation;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.stories.soical.NewSocialFragment;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import com.huawei.ui.main.stories.soical.views.DailyTaskRecyclerViewAdapter;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.dlo;
import defpackage.ezi;
import defpackage.foc;
import defpackage.fua;
import defpackage.fxk;
import defpackage.gvi;
import defpackage.lmf;
import defpackage.njy;
import defpackage.osd;
import defpackage.osg;
import defpackage.qqt;
import defpackage.qqv;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.tsr;
import defpackage.woo;
import defpackage.woy;
import defpackage.wpa;
import defpackage.wpc;
import defpackage.wvg;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class NewSocialFragment extends BaseSocialFragment implements View.OnClickListener, ScrollViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f28855a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f28856c = false;
    private boolean aa;
    private HealthRecycleView ab;
    private wpa ac;
    private wpa ad;
    private boolean af;
    private boolean ah;
    private LinearLayout aj;
    private BaseFragment ak;
    private KakaClaimAnimation al;
    private boolean an;
    private View ar;
    private MessageObserver as;
    private ImageView au;
    private Observer av;
    private HealthTextView aw;
    private NewSocialPageResTrigger ay;
    private SocialFragmentHelper bd;
    private HealthScrollView be;
    private View bf;
    private int bg;
    private HealthSearchView bh;
    private LinearLayout bi;
    private HealthTextView bj;
    private CustomTitleBar bl;
    private RelativeLayout br;
    private HealthViewPager g;
    private HealthViewPager k;
    private HealthButton l;
    private woy o;
    private int p;
    private Context r;
    private LinearLayout s;
    private HealthDotsPageIndicator u;
    private InputBoxTemplate v;
    private CountDownLatch w;
    private e y;
    private DailyTaskRecyclerViewAdapter z;
    private long q = 0;
    private long bc = 0;
    private boolean am = false;
    private long aq = 1000;
    private final List<MessageObject> j = new ArrayList();
    private final List<MessageObject> e = new ArrayList();
    private final List<MessageObject> f = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ImageView> f28857b = new ArrayList();
    private final List<MessageObject> i = new ArrayList();
    private final ArrayList<ImageView> d = new ArrayList<>(3);
    private List<MessageObject> n = new ArrayList();
    private HandlerThread x = null;
    private Handler bm = null;
    private ViewGroup ap = null;
    private RelativeLayout bk = null;
    private boolean ai = false;
    private boolean ag = false;
    private boolean ae = false;
    private NoTitleCustomAlertDialog h = null;
    private wpc m = null;
    private PermissionsResultAction bb = null;
    private final Runnable ba = new Runnable() { // from class: wnr
        @Override // java.lang.Runnable
        public final void run() {
            this.f52245b.b();
        }
    };
    private final OperationWebActivityIntentBuilderApi az = (OperationWebActivityIntentBuilderApi) Services.d("PluginOperation", OperationWebActivityIntentBuilderApi.class);
    private final OperationInteractorsApi ax = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
    private final ConfiguredPageApi t = (ConfiguredPageApi) Services.d("Main", ConfiguredPageApi.class);
    private final OperationUtilsApi at = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
    private MessageCenterApi ao = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);

    public /* synthetic */ void b() {
        this.o.j();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("UIDV_SocialFragment", "Enter onCreateView");
        CommonUtil.u("TimeEat_NewSocialFragmentEnter onCreateView");
        this.af = true;
        FragmentActivity activity = getActivity();
        this.r = activity;
        this.bd = new SocialFragmentHelper(activity);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_social_new, viewGroup, false);
        this.bf = viewInflate;
        this.ar = viewInflate.findViewById(R.id.fragment_social_ad);
        this.s = (LinearLayout) this.bf.findViewById(R.id.discover_knowledge_service);
        HealthScrollView healthScrollView = (HealthScrollView) this.bf.findViewById(R.id.fragment_social_sroll);
        this.be = healthScrollView;
        healthScrollView.setScrollViewListener(this);
        HealthSearchView healthSearchView = (HealthSearchView) this.bf.findViewById(R.id.social_global_search_view);
        this.bh = healthSearchView;
        qrs.f(healthSearchView);
        this.w = new CountDownLatch(2);
        HealthScrollView healthScrollView2 = (HealthScrollView) this.bf.findViewById(R.id.fragment_social_sroll);
        healthScrollView2.setScrollViewVerticalDirectionEvent(true);
        ScrollUtil.a(healthScrollView2, getActivity().getWindow().getDecorView(), 3002);
        d(this.bf);
        j(this.bf);
        q();
        y();
        HandlerThread handlerThread = new HandlerThread("UIDV_SocialFragment");
        this.x = handlerThread;
        handlerThread.start();
        this.bm = new Handler(this.x.getLooper());
        this.as = new d(this);
        this.y = new e(this);
        if (CommonUtil.ab(this.r)) {
            this.aa = true;
            l();
            k();
            r();
        }
        if (ezi.d()) {
            t();
        } else {
            this.ah = false;
            qsp.c((View) this.bh, 8);
        }
        CommonUtil.u("TimeEat_NewSocialFragmentLeave onCreateView");
        return this.bf;
    }

    private void y() {
        Observer observer = new Observer() { // from class: com.huawei.ui.main.stories.soical.NewSocialFragment.1
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (str == null) {
                    LogUtil.e("UIDV_SocialFragment", "notify label is null");
                    return;
                }
                str.hashCode();
                if (!str.equals("NEW_SOCIAL_FRAGMENT_NO_DATA")) {
                    LogUtil.j("UIDV_SocialFragment", "unknown label: ", str);
                } else {
                    a();
                }
            }

            private void a() {
                LogUtil.a("UIDV_SocialFragment", "handleFragmentNoData");
                if (NewSocialFragment.this.ag || NewSocialFragment.this.ae) {
                    return;
                }
                NewSocialFragment.this.ab();
                NewSocialFragment.this.ad();
            }
        };
        this.av = observer;
        ObserverManagerUtil.d(observer, "NEW_SOCIAL_FRAGMENT_NO_DATA");
    }

    private void aa() {
        HealthSearchView healthSearchView = this.bh;
        if (healthSearchView == null || healthSearchView.getVisibility() != 0) {
            LogUtil.j("UIDV_SocialFragment", "mSearchView is null");
            return;
        }
        InputBoxTemplate inputBoxTemplateB = ezi.b(4001);
        this.v = inputBoxTemplateB;
        if (inputBoxTemplateB != null) {
            LogUtil.a("UIDV_SocialFragment", "searchViewInputBox theme:", inputBoxTemplateB.getTheme());
            if (!TextUtils.equals(this.bh.getQueryHint(), this.v.getTheme())) {
                this.bh.setQueryHint(this.v.getTheme());
                if (this.am) {
                    gvi.a(this.r, 4001, 1, this.v);
                }
            }
            ezi.a(this.v.getTheme());
        } else {
            this.bh.setQueryHint("");
            LogUtil.a("UIDV_SocialFragment", "searchViewInputBox empty");
        }
        this.bh.setSearchBarContentDescription();
    }

    private void q() {
        this.w.countDown();
    }

    private void k() {
        if (CommonUtil.ca()) {
            return;
        }
        if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            ag();
        } else {
            o();
        }
    }

    private void o() {
        LogUtil.a("UIDV_SocialFragment", "initKnitFragment");
        LinearLayout linearLayout = (LinearLayout) this.bf.findViewById(R.id.knit_fragment_container);
        this.aj = linearLayout;
        linearLayout.setVisibility(0);
        if (this.ak != null) {
            return;
        }
        this.ak = m();
        getChildFragmentManager().beginTransaction().add(R.id.knit_fragment_container, this.ak).commit();
    }

    private KnitFragment m() {
        MainPageGroupConfig mainPageGroupConfigD = foc.d(getContext(), "MainPageSectionsConfig.json");
        if (mainPageGroupConfigD == null) {
            LogUtil.e("UIDV_SocialFragment", "addSubTagFragments cause pageGroupConfig is null!");
            return null;
        }
        ArrayList<MainPageConfig> pagesConfig = mainPageGroupConfigD.getPagesConfig();
        if (njy.e(pagesConfig)) {
            LogUtil.e("UIDV_SocialFragment", "addSubTagFragments cause pageConfigs is empty!");
            return null;
        }
        for (int i = 0; i < pagesConfig.size(); i++) {
            MainPageConfig mainPageConfig = pagesConfig.get(i);
            if (mainPageConfig == null) {
                LogUtil.e("UIDV_SocialFragment", "addSubTagFragments cause pageConfig1 is null!");
            } else {
                int pageType = mainPageConfig.getPageType();
                int resPosId = mainPageConfig.getResPosId();
                String strB = qqt.b(mainPageConfig);
                if (pageType == 16) {
                    NewSocialPageResTrigger newSocialPageResTrigger = new NewSocialPageResTrigger(getContext(), resPosId, null);
                    this.ay = newSocialPageResTrigger;
                    return KnitFragment.newInstance(strB, newSocialPageResTrigger);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        SocialFragmentHelper.a aVar;
        if (message == null || (aVar = (SocialFragmentHelper.a) message.obj) == null) {
            return;
        }
        ImageView imageViewB = aVar.b();
        MessageObject messageObjectC = aVar.c();
        this.o.a(aVar.a());
        d(imageViewB, messageObjectC);
        this.o.b((ViewGroup) this.g);
        this.g.getAdapter().notifyDataSetChanged();
        this.o.b((ViewGroup) this.k);
        this.k.getAdapter().notifyDataSetChanged();
        if (this.o.c() == 37) {
            this.m.c(this.i.size());
            this.m.onPageScrollStateChanged(0);
        }
        this.o.j();
        this.o.b((ViewGroup) this.ab);
        this.z.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        if (message.obj != null) {
            c((List<MessageObject>) message.obj);
            if (this.m == null) {
                this.m = new wpc();
            }
            if (this.o.c() == 37) {
                this.m.a(this.g);
                this.o.c(this.m);
                this.g.setPageTransformer(false, this.m);
                this.g.addOnPageChangeListener(this.m);
            }
        }
    }

    private void r() {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            new Handler().postDelayed(new Runnable() { // from class: wns
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52246c.e(marketingApi);
                }
            }, 1000L);
        }
    }

    public /* synthetic */ void e(MarketingApi marketingApi) {
        MarketingOption.Builder builder = new MarketingOption.Builder();
        builder.setContext(getActivity());
        builder.setPageId(16);
        marketingApi.requestMarketingResource(builder.build());
        HashMap map = new HashMap();
        map.put("open_specific_page", "Discover");
        builder.setTriggerEventParams(map);
        builder.setTypeId(49);
        marketingApi.triggerMarketingResourceEvent(builder.build());
        c(marketingApi, builder);
    }

    private void c(MarketingApi marketingApi, MarketingOption.Builder builder) {
        builder.setTypeId(51);
        marketingApi.triggerMarketingResourceEvent(builder.build());
        builder.setTypeId(52);
        marketingApi.triggerMarketingResourceEvent(builder.build());
    }

    private void t() {
        HealthSearchView healthSearchView = this.bh;
        if (healthSearchView == null || this.bl == null) {
            return;
        }
        qsp.c((View) healthSearchView, 0);
        p();
        this.bh.setInputType(0);
        this.bh.setIconifiedByDefault(false);
        this.ah = true;
        ezi.c(this.bh);
        ezi.a(this.bh, new View.OnClickListener() { // from class: wnu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52248b.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        gvi.a(this.r, 4001, 2, this.v);
        ezi.d(this.r, this.v, 4001);
    }

    private void p() {
        CustomTitleBar customTitleBar = this.bl;
        if (customTitleBar == null) {
            return;
        }
        customTitleBar.setRightThirdKeyVisibility(8);
        qsp.c(this.bl.getRightThirdKey(), 0.0f);
        this.bl.setRightThirdKeyBackground(ContextCompat.getDrawable(this.r, R.drawable.search_bar_icon), qre.f(R.string.IDS_global_search_button));
        this.bl.setRightThirdKeyOnClickListener(new View.OnClickListener() { // from class: wnw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52249c.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        gvi.a(this.r, 4001, 2, this.v);
        ezi.d(this.r, this.v, 4001);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CommonUtil.u("TimeEat_NewSocialFragmentEnter onActivityCreated");
        s();
        CommonUtil.u("TimeEat_NewSocialFragmentLeave onActivityCreated");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("UIDV_SocialFragment", "onConfigurationChanged()");
        this.y.sendEmptyMessage(16384);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.o.b((ViewGroup) this.g);
        HealthViewPager healthViewPager = this.g;
        if (healthViewPager != null && healthViewPager.getAdapter() != null) {
            this.g.getAdapter().notifyDataSetChanged();
        }
        this.o.b((ViewGroup) this.k);
        HealthViewPager healthViewPager2 = this.k;
        if (healthViewPager2 != null && healthViewPager2.getAdapter() != null) {
            this.k.getAdapter().notifyDataSetChanged();
        }
        this.o.b((ViewGroup) this.ab);
        HealthRecycleView healthRecycleView = this.ab;
        if (healthRecycleView == null || healthRecycleView.getAdapter() == null) {
            return;
        }
        this.ab.getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.w = new CountDownLatch(2);
        q();
        l();
    }

    private void g() {
        Task<List<osg>> taskInfoListByScenario = ddq.d().getTaskInfoListByScenario(getContext(), 1, new int[0]);
        if (taskInfoListByScenario == null) {
            return;
        }
        taskInfoListByScenario.addOnSuccessListener(new a(this)).addOnFailureListener(new OnFailureListener() { // from class: wnv
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LogUtil.e("UIDV_SocialFragment", "Fetch Kaka List Failed");
            }
        });
    }

    static class a implements OnSuccessListener<List<osg>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<NewSocialFragment> f28861c;

        a(NewSocialFragment newSocialFragment) {
            this.f28861c = new WeakReference<>(newSocialFragment);
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<osg> list) {
            NewSocialFragment newSocialFragment = this.f28861c.get();
            if (newSocialFragment == null || !newSocialFragment.isVisible() || newSocialFragment.isRemoving() || newSocialFragment.isDetached()) {
                return;
            }
            newSocialFragment.d(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<osg> list) {
        int iE;
        if (njy.e(list)) {
            return;
        }
        LogUtil.a("UIDV_SocialFragment", "fetchKakaTasks ", Integer.valueOf(list.size()));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).ai();
        }
        synchronized (f28855a) {
            for (MessageObject messageObject : this.i) {
                if (messageObject instanceof tsr) {
                    tsr tsrVar = (tsr) messageObject;
                    if (tsrVar.a() && (iE = wvg.e(iArr, tsrVar.b().ai())) >= 0) {
                        osg osgVar = list.get(iE);
                        if (TextUtils.equals(wvg.b(tsrVar.b()), wvg.b(osgVar)) && wvg.e(osgVar.t()) && tsrVar.b().ag() <= osgVar.ag()) {
                            tsrVar.b(osgVar);
                        }
                    }
                }
            }
            this.ad.notifyDataSetChanged();
            if (this.m != null && this.o.c() == 37) {
                this.m.c(this.i.size());
                this.m.onPageScrollStateChanged(0);
            }
            this.ac.notifyDataSetChanged();
            this.z.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    @Override // com.huawei.ui.main.stories.soical.BaseSocialFragment
    public void fragmentVisibleStatus(boolean z) {
        int[] iArrE;
        this.am = z;
        LogUtil.a("UIDV_SocialFragment", "setUserVisibleHint:", Boolean.valueOf(z), " isFirst:", Boolean.valueOf(this.af));
        if (z && !this.af && SystemClock.elapsedRealtime() - this.bc > 4000) {
            if (this.bf == null) {
                return;
            }
            LogUtil.a("UIDV_SocialFragment", "setUserVisibleHint: start request");
            synchronized (f28855a) {
                iArrE = woo.e(this.i);
            }
            if (iArrE.length > 0) {
                Task<Boolean> taskCheckKakaTaskIsFinished = ddq.d().checkKakaTaskIsFinished(getContext(), iArrE);
                boolean z2 = taskCheckKakaTaskIsFinished != null;
                LogUtil.a("UIDV_SocialFragment", "groupingKakaRules", Boolean.valueOf(z2));
                if (z2) {
                    taskCheckKakaTaskIsFinished.addOnSuccessListener(new OnSuccessListener() { // from class: wnm
                        @Override // com.huawei.hmf.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            this.f52238c.b((Boolean) obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: wnn
                        @Override // com.huawei.hmf.tasks.OnFailureListener
                        public final void onFailure(Exception exc) {
                            this.f52239c.c(exc);
                        }
                    });
                }
                if (!z2) {
                    w();
                }
            } else {
                w();
            }
            if (!CommonUtil.ca()) {
                if (Utils.o()) {
                    this.t.refreshConfiguredPageUi(16, this.s);
                }
                o();
            }
        }
        if (z) {
            aa();
        }
        this.af = false;
    }

    public /* synthetic */ void b(Boolean bool) {
        g();
        this.y.sendEmptyMessage(4321);
    }

    public /* synthetic */ void c(Exception exc) {
        this.y.sendEmptyMessage(4321);
    }

    private void l() {
        List<MessageObject> list = this.n;
        if (list != null) {
            list.clear();
        }
        this.ae = true;
        this.bc = SystemClock.elapsedRealtime();
        this.bm.post(new Runnable() { // from class: woa
            @Override // java.lang.Runnable
            public final void run() {
                this.f52256a.d();
            }
        });
    }

    public /* synthetic */ void d() {
        x();
        if (!VersionControlUtil.isSupportOperationAccount()) {
            this.ae = false;
            return;
        }
        if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            List<MessageObject> messages = this.ao.getMessages(29);
            this.n = woo.c(messages);
            this.w.countDown();
            LogUtil.a("UIDV_SocialFragment", "tempMsgObjects:", Integer.valueOf(messages != null ? messages.size() : 0));
        } else {
            j();
        }
        try {
            LogUtil.a("UIDV_SocialFragment", "wait:", Boolean.valueOf(this.w.await(10000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e("UIDV_SocialFragment", "await InterruptedException");
        }
        LogUtil.a("UIDV_SocialFragment", "get data success");
        h();
    }

    private void h() {
        int size;
        List<MessageObject> list = this.n;
        synchronized (f28855a) {
            this.j.clear();
            this.j.addAll(list);
            List<MessageObject> listAn = an();
            if (listAn != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 21;
                messageObtain.obj = listAn;
                this.y.sendMessage(messageObtain);
            }
            this.ae = false;
            size = this.j.size();
        }
        if (size > 0) {
            this.ag = true;
            this.y.sendEmptyMessage(30);
            return;
        }
        f28856c = true;
        LogUtil.a("UIDV_SocialFragment", "AdMessageList size is 0, doRefresh！");
        this.ag = false;
        this.ao.refreshMessages();
        this.y.sendEmptyMessage(12289);
        this.y.sendEmptyMessage(31);
    }

    private void j() {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        LogUtil.a("UIDV_SocialFragment", "marketingApi is null ", Boolean.valueOf(marketingApi == null));
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (marketingApi != null) {
            marketingApi.getResourceResultInfo(1002).addOnSuccessListener(new OnSuccessListener() { // from class: wny
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f52251c.e(jElapsedRealtime, marketingApi, (Map) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: wob
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    this.f52257b.a(exc);
                }
            });
        }
    }

    public /* synthetic */ void e(long j, MarketingApi marketingApi, Map map) {
        LogUtil.a("UIDV_SocialFragment", "Waitingfor:", Long.valueOf(SystemClock.elapsedRealtime() - j));
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map);
        if (mapFilterMarketingRules.containsKey(1002)) {
            ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(1002);
            if (resourceResultInfo == null) {
                LogUtil.j("UIDV_SocialFragment", "resourceResultInfo = null");
                this.w.countDown();
                return;
            }
            List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
            if (njy.e(resources)) {
                LogUtil.a("UIDV_SocialFragment", "resourceBriefInfoList is empty");
                this.w.countDown();
                return;
            } else {
                LogUtil.a("UIDV_SocialFragment", "resourceBriefInfoList size:", Integer.valueOf(resources.size()));
                e(resources);
                return;
            }
        }
        this.w.countDown();
    }

    public /* synthetic */ void a(Exception exc) {
        this.w.countDown();
    }

    public void c(List<MessageObject> list) {
        synchronized (f28855a) {
            this.d.clear();
        }
        this.g.removeAllViews();
        this.k.removeAllViews();
        this.ab.removeAllViews();
        LogUtil.a("UIDV_SocialFragment", "no Ad message in database");
        this.ar.setVisibility(8);
        this.u.setVisibility(8);
        this.o.e(list);
        this.bd.c(list, this.y);
    }

    private MessageObject d(ResourceBriefInfo resourceBriefInfo, TopBannerNewTemplate topBannerNewTemplate, osg osgVar) {
        boolean z = resourceBriefInfo.getContentType() == 14;
        tsr tsrVar = new tsr();
        tsrVar.e(this.o.c(resourceBriefInfo.getContentType()));
        if (topBannerNewTemplate.getContentSource() == 1) {
            tsrVar.b(osgVar);
            tsrVar.setHarmonyImageSize(z ? "4:5" : "16:9");
            tsrVar.setHarmonyImgUrl(osgVar.z());
            tsrVar.setImgUri(osgVar.z());
            tsrVar.setDetailUri(osgVar.c());
            tsrVar.setMsgId(osgVar.h());
            tsrVar.setCreateTime(resourceBriefInfo.getEffectiveTime());
            tsrVar.setExpireTime(resourceBriefInfo.getExpirationTime());
            tsrVar.setWeight(resourceBriefInfo.getPriority());
            tsrVar.setMsgTitle(resourceBriefInfo.getResourceName());
            tsrVar.setCategory(resourceBriefInfo.getCategory());
            return tsrVar;
        }
        tsrVar.setHarmonyImageSize(z ? "4:5" : "16:9");
        tsrVar.setHarmonyImgUrl(topBannerNewTemplate.getPicture());
        tsrVar.setImgUri(topBannerNewTemplate.getPicture());
        tsrVar.setDetailUri(topBannerNewTemplate.getLinkValue());
        tsrVar.setMsgId(resourceBriefInfo.getResourceId());
        tsrVar.setCreateTime(resourceBriefInfo.getEffectiveTime());
        tsrVar.setExpireTime(resourceBriefInfo.getExpirationTime());
        tsrVar.setWeight(resourceBriefInfo.getPriority());
        tsrVar.setMsgTitle(resourceBriefInfo.getResourceName());
        tsrVar.setCategory(resourceBriefInfo.getCategory());
        return tsrVar;
    }

    private void e(List<ResourceBriefInfo> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Collections.sort(list, new Comparator() { // from class: wnx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return NewSocialFragment.c((ResourceBriefInfo) obj, (ResourceBriefInfo) obj2);
            }
        });
        int contentType = list.get(0).getContentType();
        Iterator<ResourceBriefInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getContentType() != contentType) {
                it.remove();
            }
        }
        ArrayList arrayList = new ArrayList();
        Gson gson = new Gson();
        TopBannerNewTemplate topBannerNewTemplate = null;
        ResourceBriefInfo resourceBriefInfo = null;
        for (ResourceBriefInfo resourceBriefInfo2 : list) {
            if (resourceBriefInfo2 == null || resourceBriefInfo2.getContent() == null || resourceBriefInfo2.getContent().getContent() == null) {
                LogUtil.a("UIDV_SocialFragment", "resourceBriefInfo = null");
            } else {
                String content = resourceBriefInfo2.getContent().getContent();
                LogUtil.a("UIDV_SocialFragment", content);
                TopBannerNewTemplate topBannerNewTemplate2 = (TopBannerNewTemplate) gson.fromJson(content, TopBannerNewTemplate.class);
                if (!fua.a(topBannerNewTemplate2)) {
                    if (topBannerNewTemplate2.getContentSource() == 0) {
                        arrayList.add(d(resourceBriefInfo2, topBannerNewTemplate2, null));
                    } else if (resourceBriefInfo == null || resourceBriefInfo.getPriority() < resourceBriefInfo2.getPriority()) {
                        resourceBriefInfo = resourceBriefInfo2;
                        topBannerNewTemplate = topBannerNewTemplate2;
                    }
                }
            }
        }
        e(topBannerNewTemplate, resourceBriefInfo, arrayList, jElapsedRealtime);
    }

    public static /* synthetic */ int c(ResourceBriefInfo resourceBriefInfo, ResourceBriefInfo resourceBriefInfo2) {
        return resourceBriefInfo2.getPriority() - resourceBriefInfo.getPriority();
    }

    private void e(final TopBannerNewTemplate topBannerNewTemplate, final ResourceBriefInfo resourceBriefInfo, final List<MessageObject> list, final long j) {
        if (topBannerNewTemplate == null || resourceBriefInfo == null) {
            LogUtil.a("UIDV_SocialFragment", "messageObjectList1:", Integer.valueOf(list.size()));
            LogUtil.a("UIDV_SocialFragment", "WaitingforKaka3:", Long.valueOf(SystemClock.elapsedRealtime() - j));
            this.n = list;
            this.w.countDown();
            return;
        }
        Task<List<osg>> taskInfoListByScenario = ddq.d().getTaskInfoListByScenario(getContext(), 1, new int[0]);
        if (taskInfoListByScenario == null) {
            this.n = list;
            LogUtil.a("UIDV_SocialFragment", "messageObjectList00:", Integer.valueOf(list.size()), " WaitingforKaka0:", Long.valueOf(SystemClock.elapsedRealtime() - j));
            this.w.countDown();
            return;
        }
        taskInfoListByScenario.addOnSuccessListener(new OnSuccessListener() { // from class: wnl
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.e.d(list, resourceBriefInfo, topBannerNewTemplate, j, (List) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: wnp
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f52242c.b(list, j, exc);
            }
        });
    }

    public /* synthetic */ void d(List list, ResourceBriefInfo resourceBriefInfo, TopBannerNewTemplate topBannerNewTemplate, long j, List list2) {
        LogUtil.a("UIDV_SocialFragment", "fetch kakaInfos success");
        if (njy.b(list2)) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                osg osgVar = (osg) it.next();
                if (osgVar != null && this.o.d(osgVar)) {
                    list.add(d(resourceBriefInfo, topBannerNewTemplate, osgVar));
                }
            }
        }
        this.n = list;
        LogUtil.a("UIDV_SocialFragment", "messageObjectList0:", Integer.valueOf(list.size()));
        LogUtil.a("UIDV_SocialFragment", "WaitingforKaka1:", Long.valueOf(SystemClock.elapsedRealtime() - j));
        this.w.countDown();
    }

    public /* synthetic */ void b(List list, long j, Exception exc) {
        this.n = list;
        LogUtil.e("UIDV_SocialFragment", "WaitingforKaka2:", Long.valueOf(SystemClock.elapsedRealtime() - j));
        this.w.countDown();
    }

    private void j(View view) {
        this.bb = new CustomPermissionAction(this.r) { // from class: com.huawei.ui.main.stories.soical.NewSocialFragment.5
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("UIDV_SocialFragment", "initSocalTitleBar() mQrCodeAction onGranted");
                NewSocialFragment.this.ah();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("UIDV_SocialFragment", "initSocalTitleBar() mQrCodeAction onDenied");
                NewSocialFragment.this.ah();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("UIDV_SocialFragment", "initSocalTitleBar() mQrCodeAction onForeverDenied");
                NewSocialFragment.this.ah();
            }
        };
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.socail_titlebar_kaka_tips);
        this.bj = healthTextView;
        this.o.b(healthTextView);
        CustomTitleBar customTitleBar = (CustomTitleBar) view.findViewById(R.id.social_tab_titlebar);
        this.bl = customTitleBar;
        customTitleBar.setLeftButtonVisibility(8);
        this.bl.setTitleText(this.r.getString(R.string.IDS_hw_show_main_home_page_discover));
        if (qqv.a(this.r)) {
            this.bl.setTitleSize(this.r.getResources().getDimension(R.dimen.emui_master_title_2));
            b(this.bl, R.dimen.health_common_42dp);
        } else {
            this.bl.setTitleSize(this.r.getResources().getDimension(R.dimen.textSizeHeadline8));
            b(this.bl, R.dimen.health_common_35dp);
        }
        this.bl.setTitleTextColor(this.r.getResources().getColor(R.color.textColorPrimary));
        if (!EnvironmentInfo.m()) {
            this.bl.setRightButtonVisibility(0);
        }
        this.bl.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_appbar_more), qre.f(R.string.accessibility_more_item));
        this.bl.setRightButtonOnClickListener(new View.OnClickListener() { // from class: wnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.b(view2);
            }
        });
        this.bl.setRightSoftkeyVisibility(wvg.b() ? 0 : 8);
        this.bl.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_appbar_user_gift), qre.f(R.string.IDS_hwh_home_healthshop_my_k_points));
        this.bl.setRightSoftkeyOnClickListener(new woy.c(this.o));
    }

    public /* synthetic */ void b(View view) {
        new PopViewList(this.r, this.bl, new ArrayList(Arrays.asList(getResources().getString(R.string.IDS_device_wifi_my_qrcode_sweep_code_add), getResources().getString(R.string.IDS_hw_device_manager_add_device)))).b(new PopViewList.PopViewClickListener() { // from class: wno
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.d.c(i);
            }
        });
    }

    public /* synthetic */ void c(int i, Object obj) {
        if (i == 0) {
            PermissionUtil.d(this.r, PermissionUtil.PermissionType.CAMERA, this.bb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(int i) {
        if (i == 0) {
            LoginInit.getInstance(this.r).browsingToLogin(new IBaseResponseCallback() { // from class: wnt
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f52247c.c(i2, obj);
                }
            }, "");
        } else {
            if (i != 1) {
                return;
            }
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        if (this.r == null || getActivity() == null) {
            LogUtil.j("UIDV_SocialFragment", "mContext is null");
            return;
        }
        try {
            ComponentName componentName = new ComponentName(this.r.getPackageName(), "com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity");
            Intent intent = new Intent();
            intent.setComponent(componentName);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.a("UIDV_SocialFragment", "activity not found exception.");
        }
    }

    private void f() {
        lmf.d().c(this.r, AnalyticsValue.HEALTH_HEALTH_MY_DEVICE_2030030.value(), new HashMap(16), 0);
        BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
        if (!SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            af();
        } else if (browsingBiEvent != null) {
            browsingBiEvent.showFullServiceDialog(getActivity());
        }
    }

    private void ai() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.r).b(R.string.IDS_pad_cannot_be_added).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: wod
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("UIDV_SocialFragment", "Bluetooth not supported");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void af() {
        try {
            if ((this.r.getSystemService("bluetooth") instanceof BluetoothManager ? (BluetoothManager) this.r.getSystemService("bluetooth") : null) == null) {
                ai();
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(this.r, "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
            try {
                this.r.startActivity(intent);
            } catch (ActivityNotFoundException e2) {
                LogUtil.e("UIDV_SocialFragment", "ActivityNotFoundException", e2.getMessage());
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.a("UIDV_SocialFragment", "activity not found exception.");
        }
    }

    private void s() {
        LogUtil.a("UIDV_SocialFragment", "Enter initView");
        this.bi = (LinearLayout) this.bf.findViewById(R.id.social_root_lyt);
        this.br = (RelativeLayout) this.bf.findViewById(R.id.social_net_work_layout);
        this.au = (ImageView) this.bf.findViewById(R.id.social_img_no_net_work);
        this.aw = (HealthTextView) this.bf.findViewById(R.id.social_tips_no_net_work);
        this.l = (HealthButton) this.bf.findViewById(R.id.social_btn_no_net_work);
        this.ap = (ViewGroup) this.bf.findViewById(R.id.layout_loading);
        this.bk = (RelativeLayout) this.bf.findViewById(R.id.titlebar_panel);
        ((RelativeLayout) this.bf.findViewById(R.id.social_reload_layout)).setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.ax.setNeedUpdateActivity(this.r, false);
        u();
    }

    private void ag() {
        if (this.s == null) {
            return;
        }
        LogUtil.a("UIDV_SocialFragment", "showConfiguredPageFragment");
        this.s.setVisibility(0);
        this.t.initOperationConfiguredPage(16, this.s, new ConfiguredPageDataCallback() { // from class: com.huawei.ui.main.stories.soical.NewSocialFragment.3
            @Override // com.huawei.health.configuredpage.api.ConfiguredPageDataCallback
            public void getConfiguredDataSize(int i) {
                Message messageObtainMessage = NewSocialFragment.this.y.obtainMessage();
                messageObtainMessage.what = 12288;
                messageObtainMessage.obj = Integer.valueOf(i);
                NewSocialFragment.this.y.sendMessage(messageObtainMessage);
            }

            @Override // com.huawei.health.configuredpage.api.ConfiguredPageDataCallback
            public void onDataResponse(List<dlo> list) {
                if (njy.e(list)) {
                    LogUtil.j("UIDV_SocialFragment", "showConfiguredPageFragment() pageModuleObjectList is empty.");
                } else {
                    LogUtil.a("UIDV_SocialFragment", "showConfiguredPageFragment() size = ", Integer.valueOf(list.size()));
                }
            }
        });
    }

    private void u() {
        LogUtil.d("UIDV_SocialFragment", "loadingImage");
        this.bi.setVisibility(8);
        if (CommonUtil.ab(this.r)) {
            this.br.setVisibility(8);
            this.ap.setVisibility(0);
        } else {
            this.br.setVisibility(0);
            this.au.setImageResource(R.drawable.ic_network);
            this.aw.setText(this.r.getString(R.string.IDS_hwh_home_healthshop_no_net_work_pls_click_again));
            this.l.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        LogUtil.d("UIDV_SocialFragment", "refresh view : stopLoadingImage()");
        if (!this.ai) {
            this.br.setVisibility(0);
        }
        this.ap.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        LogUtil.a("UIDV_SocialFragment", "refresh view : setTipsPage()");
        this.br.setVisibility(8);
        if (CommonUtil.ab(this.r)) {
            this.bi.setVisibility(0);
            this.ar.setVisibility(8);
            if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
                if (this.p <= 0) {
                    ac();
                }
            } else {
                NewSocialPageResTrigger newSocialPageResTrigger = this.ay;
                if (newSocialPageResTrigger != null && newSocialPageResTrigger.hasNoData()) {
                    ac();
                }
            }
            this.l.setVisibility(8);
            return;
        }
        this.bi.setVisibility(8);
        this.br.setVisibility(0);
        this.au.setImageResource(R.drawable.ic_network);
        this.aw.setText(this.r.getString(R.string.IDS_hwh_home_healthshop_no_net_work_pls_click_again));
        this.l.setVisibility(0);
    }

    private void ac() {
        this.br.setVisibility(0);
        this.au.setImageResource(R.drawable.ic_social_empty);
        this.aw.setText(this.r.getString(R.string.IDS_discover_no_content));
    }

    private void z() {
        this.ap.setVisibility(8);
        this.bi.setVisibility(8);
        this.br.setVisibility(0);
        this.au.setImageResource(R.drawable.ic_social_empty);
        this.aw.setText(this.r.getString(R.string.IDS_discover_no_content));
        this.l.setVisibility(8);
        this.bl.setRightSoftkeyVisibility(8);
        this.bj.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        LogUtil.d("UIDV_SocialFragment", "refresh view : setNormalPage()");
        this.ai = true;
        ae();
        this.br.setVisibility(8);
        this.bi.setVisibility(0);
    }

    public void a() {
        if (!VersionControlUtil.isSupportOperationAccount()) {
            z();
            return;
        }
        u();
        if (CommonUtil.ab(this.r)) {
            LogUtil.a("UIDV_SocialFragment", "refreshData() mIsAlreadyRequestMessageData = ", Boolean.valueOf(this.aa));
            this.w = new CountDownLatch(2);
            q();
            l();
            k();
            r();
            this.bm.post(new c(this.ao));
        }
    }

    private void d(View view) {
        synchronized (f28855a) {
            this.e.clear();
            this.f.clear();
            this.f28857b.clear();
            this.i.clear();
            this.d.clear();
            woy woyVar = new woy(this, this.ax, this.az, this.at);
            this.o = woyVar;
            woyVar.c(this.d, this.i);
            this.ad = new wpa(this, this.d, this.i, this.o);
            this.ac = new wpa(this, this.d, this.i, this.o);
            this.z = new DailyTaskRecyclerViewAdapter(this, this.d, this.i, this.o);
        }
        HealthViewPager healthViewPager = (HealthViewPager) view.findViewById(R.id.view_pager_common_top_banner);
        this.g = healthViewPager;
        healthViewPager.setLayerType(1, null);
        this.k = (HealthViewPager) view.findViewById(R.id.view_pager_common_top_banner_cant_loop);
        this.u = (HealthDotsPageIndicator) view.findViewById(R.id.indicator);
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.recycleView_dailyTask);
        this.ab = healthRecycleView;
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(getContext(), 0, false));
        this.o.a(this.g, this.k, this.ab, this.u);
        this.g.addOnPageChangeListener(new b(this));
        this.k.addOnPageChangeListener(new b(this));
        this.g.setAdapter(this.ad);
        this.k.setAdapter(this.ac);
        am();
        this.ab.setAdapter(this.z);
    }

    private void am() {
        this.g.setOnTouchListener(new View.OnTouchListener() { // from class: woc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f52258b.c(view, motionEvent);
            }
        });
        this.k.setOnTouchListener(new View.OnTouchListener() { // from class: wnz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f52252b.d(view, motionEvent);
            }
        });
    }

    public /* synthetic */ boolean c(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3 || action == 4) {
            this.o.j();
            return false;
        }
        if (action == 0) {
            this.o.a();
            return false;
        }
        LogUtil.j("UIDV_SocialFragment", "no branch!");
        return false;
    }

    public /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3 || action == 4) {
            this.o.j();
            return false;
        }
        if (action == 0) {
            this.o.a();
            return false;
        }
        LogUtil.j("UIDV_SocialFragment", "no branch!");
        return false;
    }

    static class b implements HealthViewPager.OnPageChangeListener {
        private final WeakReference<NewSocialFragment> e;

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public b(NewSocialFragment newSocialFragment) {
            this.e = new WeakReference<>(newSocialFragment);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            WeakReference<NewSocialFragment> weakReference = this.e;
            NewSocialFragment newSocialFragment = weakReference != null ? weakReference.get() : null;
            if (newSocialFragment == null) {
                LogUtil.a("UIDV_SocialFragment", "onPageSelected fragment is null");
            } else {
                newSocialFragment.d(i);
            }
        }
    }

    public void d(int i) {
        if (this.ar == null) {
            LogUtil.j("UIDV_SocialFragment", "ad viewpager is null");
            return;
        }
        LogUtil.a("UIDV_SocialFragment", "onPageSelected: ", Integer.valueOf(i));
        boolean zB = fxk.b(this.ar);
        boolean zE = fxk.e(this.ar, i);
        LogUtil.a("UIDV_SocialFragment", "rect visibility: ", Boolean.valueOf(zB), " window visibility: ", Boolean.valueOf(zE));
        synchronized (f28855a) {
            if (zB && zE) {
                if (this.o != null && njy.c(this.i, i)) {
                    this.o.a(this.i.get(i), 0L, 1);
                }
            }
        }
    }

    private void d(ImageView imageView, MessageObject messageObject) {
        LogUtil.a("UIDV_SocialFragment", "addImageToShow");
        if (b(imageView, messageObject)) {
            synchronized (f28855a) {
                this.bd.c(this.f, messageObject, this.f28857b, imageView);
                if (this.f.size() > 0) {
                    this.ar.setVisibility(0);
                    this.i.clear();
                    this.d.clear();
                    for (int i = 0; i < this.f28857b.size() && i < 8; i++) {
                        this.i.add(this.f.get(i));
                        this.d.add(this.f28857b.get(i));
                    }
                    d(0);
                }
                LogUtil.a("UIDV_SocialFragment", "addImageToShow mADImageShowListSize = ", Integer.valueOf(this.d.size()));
                Message messageObtain = Message.obtain();
                messageObtain.what = 28;
                messageObtain.obj = Integer.valueOf(this.i.size());
                this.y.sendMessage(messageObtain);
            }
        }
    }

    private boolean b(ImageView imageView, MessageObject messageObject) {
        boolean z;
        if (imageView == null || messageObject == null) {
            LogUtil.j("UIDV_SocialFragment", "imageView||messageObject is null");
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (f28855a) {
            arrayList.addAll(this.e);
        }
        boolean z2 = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null && messageObject != null && messageObject.getMsgId().equals(((MessageObject) arrayList.get(i)).getMsgId())) {
                z2 = true;
            }
        }
        if (z2) {
            return z;
        }
        LogUtil.a("UIDV_SocialFragment", "this ad is not in display list");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MessageObject> an() {
        LogUtil.a("UIDV_SocialFragment", "updateAdViewPagerDate");
        synchronized (f28855a) {
            woo.e(this.j, this.e);
            if (this.bd.a(this.e, this.f) && this.e.size() == this.f.size()) {
                LogUtil.a("UIDV_SocialFragment", "no Ad message change");
                return null;
            }
            LogUtil.a("UIDV_SocialFragment", "have Ad message change");
            this.f.clear();
            this.f28857b.clear();
            this.i.clear();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.e);
            return arrayList;
        }
    }

    @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
    public void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
        if (this.r == null || !getUserVisibleHint()) {
            return;
        }
        int scrollY = healthScrollView.getScrollY();
        int height = healthScrollView.getHeight();
        int paddingTop = healthScrollView.getPaddingTop();
        int paddingBottom = healthScrollView.getPaddingBottom();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.aq;
        if (healthScrollView.getChildAt(0).getHeight() == ((scrollY + height) - paddingTop) - paddingBottom && jCurrentTimeMillis - j > 1000) {
            HashMap map = new HashMap();
            map.put("scroll", "1");
            map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, 1);
            lmf.d().c(this.r, AnalyticsValue.HEALTH_DISCOVER_SCROLL_TO_BOTTOM_2020014.value(), map, 0);
            lmf.d().b(this.r);
            this.aq = System.currentTimeMillis();
        }
        if (this.ah) {
            if (this.bg <= 0) {
                this.bg = this.bh.getHeight();
            }
            int i5 = this.bg;
            if (i5 > 0 && i2 >= i5 && !this.an) {
                ezi.c(this.bf);
                ezi.a(this.bl, false);
                ezi.e(this.bh);
                this.an = true;
            }
            if (i2 <= 0 && this.an) {
                ezi.c(this.bf);
                ezi.d(this.bh);
                ezi.c(this.bl, false);
                this.an = false;
            }
        }
        i();
    }

    private void i() {
        View view;
        if (this.o == null || (view = this.ar) == null) {
            LogUtil.d("UIDV_SocialFragment", "mBannerInteractor or mLayAd is null,return");
        } else if (!fxk.b(view)) {
            this.o.a();
        } else {
            this.o.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        LogUtil.a("UIDV_SocialFragment", "Enter onPause begin");
        super.onPause();
        this.o.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CommonUtil.u("TimeEat_NewSocialFragmentEnter onResume");
        this.y.removeCallbacks(this.ba);
        this.y.postDelayed(this.ba, 700L);
        if (!VersionControlUtil.isSupportOperationAccount()) {
            z();
        }
        CommonUtil.u("TimeEat_NewSocialFragmentLeave onResume");
        this.y.sendEmptyMessage(16384);
        if (getUserVisibleHint()) {
            aa();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        boolean z = SystemClock.elapsedRealtime() - this.q > 2000;
        if (id == R.id.social_btn_no_net_work && z) {
            CommonUtil.t(this.r);
            this.q = SystemClock.elapsedRealtime();
        } else if (id == R.id.social_reload_layout && z) {
            a();
            this.q = SystemClock.elapsedRealtime();
        } else {
            LogUtil.j("UIDV_SocialFragment", "no branch!");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        e eVar = this.y;
        if (eVar != null) {
            eVar.removeCallbacks(this.ba);
        }
        al();
        HandlerThread handlerThread = this.x;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        HealthViewPager healthViewPager = this.g;
        if (healthViewPager != null) {
            healthViewPager.setOnTouchListener(null);
        }
        HealthViewPager healthViewPager2 = this.k;
        if (healthViewPager2 != null) {
            healthViewPager2.setOnTouchListener(null);
        }
        wpc wpcVar = this.m;
        if (wpcVar != null) {
            wpcVar.e();
        }
        Observer observer = this.av;
        if (observer != null) {
            ObserverManagerUtil.c(observer);
        }
        super.onDestroy();
        synchronized (f28855a) {
            this.j.clear();
            this.e.clear();
            this.f.clear();
            this.f28857b.clear();
            this.i.clear();
            this.d.clear();
            this.n.clear();
        }
        this.al = null;
    }

    static class e extends BaseHandler<NewSocialFragment> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<NewSocialFragment> f28863b;

        e(NewSocialFragment newSocialFragment) {
            super(Looper.getMainLooper(), newSocialFragment);
            this.f28863b = new WeakReference<>(newSocialFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(NewSocialFragment newSocialFragment, Message message) {
            if (message == null) {
                LogUtil.e("UIDV_SocialFragment", "msg is null");
                return;
            }
            int i = message.what;
            if (i == 21) {
                newSocialFragment.c(message);
                return;
            }
            if (i == 23) {
                newSocialFragment.d(message);
                return;
            }
            if (i == 28) {
                newSocialFragment.o.b(((Integer) message.obj).intValue());
                return;
            }
            if (i == 4321) {
                LogUtil.a("UIDV_SocialFragment", "REQUEST_REFRESH_BANNER");
                newSocialFragment.w();
                return;
            }
            if (i == 16384) {
                newSocialFragment.o.b(newSocialFragment.bj, newSocialFragment.bl, newSocialFragment.bk);
                newSocialFragment.v();
                return;
            }
            if (i == 30) {
                newSocialFragment.ab();
                return;
            }
            if (i == 31) {
                newSocialFragment.ad();
                return;
            }
            if (i != 12288) {
                if (i != 12289) {
                    return;
                }
                newSocialFragment.ae();
            } else if (message.obj instanceof Integer) {
                newSocialFragment.p = ((Integer) message.obj).intValue();
                LogUtil.a("UIDV_SocialFragment", "handler mConfiguredPageDataSize = ", Integer.valueOf(newSocialFragment.p), " mHasBannerData = ", Boolean.valueOf(newSocialFragment.ag), " isRequestBannerNow = ", Boolean.valueOf(newSocialFragment.ae));
                if (newSocialFragment.p > 0) {
                    newSocialFragment.ab();
                }
                if (newSocialFragment.ag || newSocialFragment.ae) {
                    return;
                }
                newSocialFragment.ab();
                newSocialFragment.ad();
            }
        }
    }

    public static class d implements MessageObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<NewSocialFragment> f28862a;

        d(NewSocialFragment newSocialFragment) {
            this.f28862a = new WeakReference<>(newSocialFragment);
        }

        @Override // com.huawei.pluginmessagecenter.service.MessageObserver
        public void onChange(int i, MessageChangeEvent messageChangeEvent) {
            LogUtil.a("UIDV_SocialFragment", "MessageObserver onChange start");
            final NewSocialFragment newSocialFragment = this.f28862a.get();
            if (newSocialFragment == null || !newSocialFragment.isVisible() || newSocialFragment.isDetached()) {
                return;
            }
            newSocialFragment.bm.post(new Runnable() { // from class: woi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52263c.a(newSocialFragment);
                }
            });
            LogUtil.a("UIDV_SocialFragment", "MessageObserver onChange end");
        }

        public /* synthetic */ void a(NewSocialFragment newSocialFragment) {
            if (!newSocialFragment.isVisible() || newSocialFragment.isDetached()) {
                return;
            }
            List<MessageObject> arrayList = new ArrayList<>();
            if (!Utils.o() || ddv.b().switchToMarketingTwo()) {
                if (njy.b(newSocialFragment.n)) {
                    arrayList.addAll(newSocialFragment.n);
                }
            } else {
                arrayList = woo.c(((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).getMessages(29));
            }
            d(newSocialFragment, arrayList);
        }

        private void d(NewSocialFragment newSocialFragment, List<MessageObject> list) {
            synchronized (NewSocialFragment.f28855a) {
                newSocialFragment.j.clear();
                newSocialFragment.j.addAll(list);
                List listAn = newSocialFragment.an();
                if (listAn != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 21;
                    messageObtain.obj = listAn;
                    newSocialFragment.y.sendMessage(messageObtain);
                }
                newSocialFragment.ag = false;
                if (newSocialFragment.j.size() > 0) {
                    newSocialFragment.ag = true;
                    newSocialFragment.y.sendEmptyMessage(30);
                } else if (NewSocialFragment.f28856c) {
                    newSocialFragment.y.sendEmptyMessage(12289);
                    newSocialFragment.y.sendEmptyMessage(31);
                } else {
                    LogUtil.d("UIDV_SocialFragment", "Should refresh.");
                }
            }
        }
    }

    private void x() {
        LogUtil.a("UIDV_SocialFragment", "Start register");
        if (this.ao == null || this.as == null) {
            return;
        }
        LogUtil.a("UIDV_SocialFragment", "registerADObserver");
        this.ao.registerMessageObserver(this.as);
    }

    private void al() {
        if (this.ao == null || this.as == null) {
            return;
        }
        LogUtil.a("UIDV_SocialFragment", "unregisterAdObserver");
        this.ao.unregisterMessageObserver(this.as);
    }

    @Override // com.huawei.ui.main.stories.soical.BaseSocialFragment
    public void scrollTop() {
        HealthScrollView healthScrollView = this.be;
        if (healthScrollView != null) {
            healthScrollView.smoothScrollTo(0, 0);
        }
    }

    public void e(final tsr tsrVar) {
        if (tsrVar == null || !tsrVar.a()) {
            return;
        }
        Task<osd> taskClaimKakaTasksByScenario = ddq.d().claimKakaTasksByScenario(getContext(), 1, tsrVar.b().h());
        if (taskClaimKakaTasksByScenario == null) {
            return;
        }
        taskClaimKakaTasksByScenario.addOnSuccessListener(new OnSuccessListener() { // from class: wnk
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f52233b.b(tsrVar, (osd) obj);
            }
        });
    }

    public /* synthetic */ void b(final tsr tsrVar, final osd osdVar) {
        if (TextUtils.equals(osdVar.e(), "0")) {
            this.y.post(new Runnable() { // from class: wnq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52244c.d(osdVar, tsrVar);
                }
            });
        }
    }

    public /* synthetic */ void d(osd osdVar, tsr tsrVar) {
        b(osdVar.d());
        synchronized (f28855a) {
            int iIndexOf = this.i.indexOf(tsrVar);
            ImageView imageViewRemove = (iIndexOf < 0 || iIndexOf >= this.d.size()) ? null : this.d.remove(iIndexOf);
            this.i.remove(tsrVar);
            this.o.b((ViewGroup) this.g);
            this.g.getAdapter().notifyDataSetChanged();
            if (this.m != null && this.o.c() == 37) {
                this.m.c(this.i.size());
                this.m.onPageScrollStateChanged(0);
            }
            this.o.b((ViewGroup) this.k);
            this.k.getAdapter().notifyDataSetChanged();
            this.o.j();
            this.o.b((ViewGroup) this.ab);
            this.z.notifyDataSetChanged();
            if (imageViewRemove != null) {
                this.f28857b.remove(imageViewRemove);
            }
            this.f.remove(tsrVar);
            this.n.remove(tsrVar);
            this.e.remove(tsrVar);
        }
        fragmentVisibleStatus(true);
    }

    private void b(int i) {
        if (this.al == null) {
            n();
        }
        KakaClaimAnimation kakaClaimAnimation = this.al;
        if (kakaClaimAnimation != null) {
            kakaClaimAnimation.e(i);
        }
    }

    private void n() {
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.kaka_convert_anim);
        if (viewStub == null) {
            LogUtil.a("UIDV_SocialFragment", "initConvertAnimLayout ViewStub is loaded fail.");
            return;
        }
        View viewInflate = viewStub.inflate();
        if (viewInflate instanceof KakaClaimAnimation) {
            this.al = (KakaClaimAnimation) viewInflate;
        }
    }

    static class c implements Runnable {
        private final WeakReference<MessageCenterApi> e;

        c(MessageCenterApi messageCenterApi) {
            this.e = new WeakReference<>(messageCenterApi);
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageCenterApi messageCenterApi = this.e.get();
            if (messageCenterApi == null) {
                return;
            }
            messageCenterApi.refreshMessages();
        }
    }

    private void b(CustomTitleBar customTitleBar, int i) {
        if (qrs.v()) {
            customTitleBar.setTitleSize(this.r.getResources().getDimension(i));
        }
    }
}
