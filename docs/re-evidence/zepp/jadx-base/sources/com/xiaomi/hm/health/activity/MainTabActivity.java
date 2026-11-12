package com.xiaomi.hm.health.activity;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.StringRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLogoutManager;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.healthlabel.utils.UtilsKt;
import com.huami.message.viewmodel.MessageCountViewModel;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.module.homepage.ui.HomeFragment;
import com.huami.tools.log.HMLog;
import com.huami.training.ui.entrance.CourseHomeFragment;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watch.hmwatchmanager.R;
import com.unionpay.ui.activity.WatchUnlockActivity;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.databinding.ActivityMainTabBinding;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.service.LoadSportRecordsToolsKt;
import com.xiaomi.hm.health.device.webapi.ExperienceDevAPI;
import com.xiaomi.hm.health.fragment.MineFragment;
import com.xiaomi.hm.health.homepage.status.utils.HomeAnalytics;
import com.xiaomi.hm.health.homepage.status.utils.MainAnalytics;
import com.xiaomi.hm.health.mainpage.MainEventManager;
import com.xiaomi.hm.health.mainpage.MainLifecycleObserver;
import com.xiaomi.hm.health.mainpage.NavigationAdapter;
import com.xiaomi.hm.health.mainpage.NpsAndRedDotManager;
import com.xiaomi.hm.health.mainpage.PageEntry;
import com.xiaomi.hm.health.mainpage.RedDotManagerKt;
import com.xiaomi.hm.health.play.PlayViewModel;
import com.xiaomi.hm.health.play.health.HealthFragment;
import com.xiaomi.hm.health.relation.RelationServiceKt;
import com.xiaomi.hm.health.utils.HMHelper;
import com.xiaomi.hm.health.view.pager.HMViewPager;
import com.xiaomi.hm.health.view.pager.TabIndicatorView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes19.dex */
@Route({"main/MainTabActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\bE\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0014J\b\u0010\u001d\u001a\u00020\u0002H\u0014J\"\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\"\u001a\u00020\u0002H\u0016R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.0-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010<\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/xiaomi/hm/health/activity/MainTabActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "t", "v", "u", "initView", "", WatchUnlockActivity.ARGS_ACTION, "Landroidx/fragment/app/Fragment;", "o", "", "position", GoogleApiAvailabilityLight.b, "titleId", "r", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "isTabOnMine", "isTabOnStatus", "isTabOnCourse", "setMineReDotVisibleForSport", "Landroid/content/Intent;", "intent", "onNewIntent", "checkUnreadMessageCount", "onResume", "onDestroy", "requestCode", "resultCode", "data", "onActivityResult", "onBackPressed", "Lcom/xiaomi/hm/health/databinding/ActivityMainTabBinding;", "x", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/xiaomi/hm/health/databinding/ActivityMainTabBinding;", "binding", "Lcom/xiaomi/hm/health/mainpage/NavigationAdapter;", "y", "Lcom/xiaomi/hm/health/mainpage/NavigationAdapter;", "pageAdapter", "", "Lcom/xiaomi/hm/health/mainpage/PageEntry;", "z", "Ljava/util/Map;", "fragmentMap", "Lcom/xiaomi/hm/health/play/PlayViewModel;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/Lazy;", SOAP.XMLNS, "()Lcom/xiaomi/hm/health/play/PlayViewModel;", "playViewModel", "Lcom/huami/message/viewmodel/MessageCountViewModel;", "B", DTransferConstants.SEARCH_KEY, "()Lcom/huami/message/viewmodel/MessageCountViewModel;", "messageCountViewModel", "Lcom/xiaomi/hm/health/mainpage/NpsAndRedDotManager;", "C", "Lcom/xiaomi/hm/health/mainpage/NpsAndRedDotManager;", "redDotManager", "Lcom/xiaomi/hm/health/mainpage/MainLifecycleObserver;", LogUtil.D, "Lcom/xiaomi/hm/health/mainpage/MainLifecycleObserver;", "mainLifecycleObserver", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MainTabActivity extends BaseTitleActivity {
    public static final /* synthetic */ KProperty<Object>[] E;

    @NotNull
    public static final String EXTRA_JUMP = "extra_jump";

    @NotNull
    public static final String EXTRA_SOURCE = "source";

    @NotNull
    public static final String EXTRA_SPORTTYPE_INDEX = "sporttype_index";

    @NotNull
    public static final String EXTRA_TAB_INDEX = "tab_index";
    public static final int INDEX_HEALTH_ID = 2131961637;
    public static final int INDEX_MINE = 3;
    public static final int INDEX_MINE_ID = 2131956088;
    public static final int INDEX_STATUS = 0;
    public static final int INDEX_STATUS_ID = 2131956087;
    public static final int INDEX_TRAINING = 2;
    public static final int INDEX_TRAINING_ID = 2131956086;

    @NotNull
    public static final String MAIN_ROUTE = "main/MainTabActivity";

    @NotNull
    public static final String NEW_REGISTERED_USER = "NEW_REGISTERED_USER";
    public static final int PAGE_TREADMILL = 1;

    @NotNull
    public static final String TAG = "MainTabActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy playViewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageCountViewModel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private NpsAndRedDotManager redDotManager;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private MainLifecycleObserver mainLifecycleObserver;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private NavigationAdapter pageAdapter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new MainTabActivity$special$$inlined$viewBindingByBind$1(new BindViewBinder(ActivityMainTabBinding.class)));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Map<String, PageEntry> fragmentMap = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public a() {
            super(1);
        }

        public final void a(int i) {
            if (MainTabActivity.this.isDestroyed() || MainTabActivity.this.isFinishing() || MainTabActivity.this.n(i) == null) {
                return;
            }
            MainTabActivity.this.p().viewpager.setCurrentItem(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Intent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent) {
            super(0);
            this.a = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onNewIntent:" + this.a;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MainTabActivity.class), "binding", "getBinding()Lcom/xiaomi/hm/health/databinding/ActivityMainTabBinding;"));
        E = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainTabActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.activity.MainTabActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PlayViewModel>() { // from class: com.xiaomi.hm.health.activity.MainTabActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.PlayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PlayViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PlayViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.activity.MainTabActivity$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.messageCountViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageCountViewModel>() { // from class: com.xiaomi.hm.health.activity.MainTabActivity$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.message.viewmodel.MessageCountViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MessageCountViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(MessageCountViewModel.class), function1, objArr3);
            }
        });
    }

    private final void initView() {
        this.pageAdapter = new NavigationAdapter(this, getSupportFragmentManager(), CollectionsKt___CollectionsKt.toList(this.fragmentMap.values()));
        HMViewPager hMViewPager = p().viewpager;
        hMViewPager.setOffscreenPageLimit(this.fragmentMap.size() - 1);
        hMViewPager.setAdapter(this.pageAdapter);
        hMViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.xiaomi.hm.health.activity.MainTabActivity$initView$1$1
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                this.a.showRightRedDot(false);
                Fragment fragmentN = this.a.n(position);
                if (fragmentN instanceof HomeFragment) {
                    HomeAnalytics.analytics$default(StatEvent.EventId.MAIN_TAB_DASHBOARD, null, 2, null);
                    HomeAnalytics.analysisTabClick(MainAnalytics.HOME_TP);
                } else if (fragmentN instanceof HealthFragment) {
                    if (this.a.s().getNewVersionTool()) {
                        this.a.s().setPlayMainClicked();
                    }
                    HomeAnalytics.analysisTabClick("health");
                } else if (fragmentN instanceof CourseHomeFragment) {
                    HomeAnalytics.analytics("Dashboard_Out", "MainTab_Sport");
                    HomeAnalytics.analysisTabClick("course");
                } else if (fragmentN instanceof MineFragment) {
                    HomeAnalytics.analysisTabClick("mine");
                    HomeAnalytics.analytics("Dashboard_Out", "MainTab_Mine");
                    TabIndicatorView tabView = this.a.p().indicator.getTabView(position);
                    if (tabView != null) {
                        tabView.setReDotVisibleForSport(false);
                    }
                    NpsAndRedDotManager npsAndRedDotManager = this.a.redDotManager;
                    if (npsAndRedDotManager != null) {
                        HomeAnalytics.analytics("MainTab_Mine", npsAndRedDotManager.getIsMineRedDotShow() ? StatEvent.EventParams.REDHOT_TRUE : StatEvent.EventParams.REDHOT_FALSE);
                        npsAndRedDotManager.clearRedDot();
                    }
                    this.a.getLeft2().setVisibility(8);
                }
                if (fragmentN != null && !(fragmentN instanceof HomeFragment)) {
                    ExperienceDevAPI.updatePublicPreViewStatus();
                }
                this.a.q().loadUserNotice();
            }
        });
        p().indicator.setViewPager(p().viewpager, r(PolicyTipUtil.isNeedIntercept() ? R.string.homepage_item_course : R.string.homepage_item_home));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fragment n(int position) {
        PageEntry pageEntry;
        Collection<PageEntry> collectionValues = this.fragmentMap.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((PageEntry) next).getPagePosition() == position) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null || (pageEntry = (PageEntry) arrayList.get(0)) == null) {
            return null;
        }
        return pageEntry.getFragment();
    }

    private final Fragment o(String pageTitle) {
        PageEntry pageEntry;
        if (pageTitle == null || (pageEntry = this.fragmentMap.get(pageTitle)) == null) {
            return null;
        }
        return pageEntry.getFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityMainTabBinding p() {
        return (ActivityMainTabBinding) this.binding.getValue(this, E[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageCountViewModel q() {
        return (MessageCountViewModel) this.messageCountViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(@StringRes int titleId) {
        PageEntry pageEntry = this.fragmentMap.get(getString(titleId));
        if (pageEntry == null) {
            return -1;
        }
        return pageEntry.getPagePosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlayViewModel s() {
        return (PlayViewModel) this.playViewModel.getValue();
    }

    private final void t() {
        getWindow().setBackgroundDrawable(null);
        ((FrameLayout) findViewById(R.id.common_title_content_parent)).setBackgroundColor(0);
    }

    private final void u() {
        this.fragmentMap.clear();
        this.fragmentMap.put(getString(R.string.homepage_item_home), new PageEntry(new HomeFragment(), R.string.homepage_item_home, R.drawable.icon_status_selector, this.fragmentMap.size()));
        this.fragmentMap.put(getString(R.string.widget_health), new PageEntry(new HealthFragment(), R.string.widget_health, R.drawable.icon_play_selector, this.fragmentMap.size()));
        if (RedDotManagerKt.isMainlandUser()) {
            this.fragmentMap.put(getString(R.string.homepage_item_course), new PageEntry(CourseHomeFragment.INSTANCE.create(BaseTitleActivity.getStatusBarHeight(this)), R.string.homepage_item_course, R.drawable.icon_sport_selector, this.fragmentMap.size()));
        }
        this.fragmentMap.put(getString(R.string.homepage_item_mine), new PageEntry(new MineFragment(), R.string.homepage_item_mine, R.drawable.icon_mine_selector, this.fragmentMap.size()));
    }

    private final void v() {
        this.redDotManager = new NpsAndRedDotManager() { // from class: com.xiaomi.hm.health.activity.MainTabActivity$initRedDotManager$1
            {
                super(this.h);
            }

            @Override // com.xiaomi.hm.health.mainpage.NpsAndRedDotManager
            public boolean presentTabIsMine() {
                return this.h.isTabOnMine();
            }

            @Override // com.xiaomi.hm.health.mainpage.NpsAndRedDotManager
            public void setReDotWithCountVisible(int count) {
                TabIndicatorView tabView = this.h.p().indicator.getTabView(this.h.r(R.string.homepage_item_mine));
                if (tabView == null) {
                    return;
                }
                tabView.setReDotWithCountVisible(count);
            }

            @Override // com.xiaomi.hm.health.mainpage.NpsAndRedDotManager
            public void setRedDotVisible(boolean visible, int pageTitle) {
                TabIndicatorView tabView = this.h.p().indicator.getTabView(this.h.r(pageTitle));
                if (tabView == null) {
                    return;
                }
                if (pageTitle == R.string.homepage_item_mine) {
                    tabView.setReDotVisible(visible);
                } else {
                    if (pageTitle != R.string.widget_health) {
                        return;
                    }
                    tabView.setReDotVisibleOversea(visible);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(MainTabActivity mainTabActivity) {
        HMIntentHandler.processIntent(mainTabActivity, mainTabActivity.getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(MainTabActivity mainTabActivity, PageEntry pageEntry) {
        mainTabActivity.p().viewpager.setCurrentItem(pageEntry.getPagePosition());
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void checkUnreadMessageCount() {
        NpsAndRedDotManager npsAndRedDotManager = this.redDotManager;
        if (npsAndRedDotManager == null) {
            return;
        }
        npsAndRedDotManager.checkUnreadMessageCount();
    }

    public final boolean isTabOnCourse() {
        return o(p().viewpager.getCurrentItemTitle()) instanceof CourseHomeFragment;
    }

    public final boolean isTabOnMine() {
        return o(p().viewpager.getCurrentItemTitle()) instanceof MineFragment;
    }

    public final boolean isTabOnStatus() {
        return o(p().viewpager.getCurrentItemTitle()) instanceof HomeFragment;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String path;
        RelationServiceKt.getRelationService().onCaptureActivityResult(this, requestCode, resultCode, data);
        if (requestCode == 4098 && data != null && data.getData() != null && (path = HMHelper.getPath(this, data.getData())) != null) {
            LoadSportRecordsToolsKt.loadSportRecords(path);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (HMLogoutManager.isMutexLogin()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tab);
        setStyle(BaseTitleActivity.STYLE.NONE, 0, !UtilsKt.isDarkMode(this));
        t();
        this.mainLifecycleObserver = new MainLifecycleObserver(this, this);
        Lifecycle lifecycle = getLifecycle();
        MainLifecycleObserver mainLifecycleObserver = this.mainLifecycleObserver;
        Objects.requireNonNull(mainLifecycleObserver);
        lifecycle.addObserver(mainLifecycleObserver);
        u();
        initView();
        v();
        p().viewpager.post(new Runnable() { // from class: hv4
            @Override // java.lang.Runnable
            public final void run() {
                MainTabActivity.w(this.a);
            }
        });
        MainEventManager.INSTANCE.create(this).tabChangeListener(new a());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        NpsAndRedDotManager npsAndRedDotManager = this.redDotManager;
        if (npsAndRedDotManager != null) {
            npsAndRedDotManager.release();
        }
        this.redDotManager = null;
        this.fragmentMap.clear();
        this.pageAdapter = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        super.onNewIntent(intent);
        HMLog.info("MainTabActivity", new b(intent));
        int intExtra = intent.getIntExtra(EXTRA_SPORTTYPE_INDEX, -1);
        if (intExtra != -1) {
            p().viewpager.setCurrentItem(intExtra);
            return;
        }
        Fragment fragment = null;
        if (3 == intent.getIntExtra("tab_index", -1)) {
            try {
                final PageEntry pageEntry = this.fragmentMap.get(getString(R.string.homepage_item_mine));
                if (pageEntry != null) {
                    fragment = pageEntry.getFragment();
                }
                MineFragment mineFragment = (MineFragment) fragment;
                if (mineFragment == null) {
                    return;
                }
                if (mineFragment.isAdded()) {
                    p().viewpager.setCurrentItem(pageEntry.getPagePosition());
                    return;
                } else {
                    mineFragment.setPendingAction(new Runnable() { // from class: iv4
                        @Override // java.lang.Runnable
                        public final void run() {
                            MainTabActivity.x(this.a, pageEntry);
                        }
                    });
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (2 == intent.getIntExtra("tab_index", -1)) {
            final PageEntry pageEntry2 = this.fragmentMap.get(getString(R.string.homepage_item_course));
            CourseHomeFragment courseHomeFragment = (CourseHomeFragment) (pageEntry2 != null ? pageEntry2.getFragment() : null);
            if (courseHomeFragment == null) {
                return;
            }
            if (courseHomeFragment.isAdded()) {
                p().viewpager.setCurrentItem(pageEntry2.getPagePosition());
                return;
            } else {
                getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.xiaomi.hm.health.activity.MainTabActivity$onNewIntent$3$1
                    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                    public void onFragmentActivityCreated(@NotNull FragmentManager fm, @NotNull Fragment f, @Nullable Bundle savedInstanceState) {
                        this.a.p().viewpager.setCurrentItem(pageEntry2.getPagePosition());
                        this.a.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this);
                    }
                }, false);
                return;
            }
        }
        HMIntentHandler.processIntent(this, intent);
        MainLifecycleObserver mainLifecycleObserver = this.mainLifecycleObserver;
        Objects.requireNonNull(mainLifecycleObserver);
        mainLifecycleObserver.dealMutexLogin();
        if (GPSDataController.getInstance().isRunning()) {
            MainLifecycleObserver mainLifecycleObserver2 = this.mainLifecycleObserver;
            Objects.requireNonNull(mainLifecycleObserver2);
            mainLifecycleObserver2.setNeedStartRunning(true);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        NpsAndRedDotManager npsAndRedDotManager = this.redDotManager;
        if (npsAndRedDotManager == null) {
            return;
        }
        npsAndRedDotManager.listenerNps();
    }

    public final void setMineReDotVisibleForSport() {
        TabIndicatorView tabView = p().indicator.getTabView(r(R.string.homepage_item_mine));
        if (tabView == null) {
            return;
        }
        tabView.setReDotVisibleForSport(true);
    }
}
