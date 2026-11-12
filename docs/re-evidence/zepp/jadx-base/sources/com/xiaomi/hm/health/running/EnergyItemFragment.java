package com.xiaomi.hm.health.running;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databinding.FooterSportEnergyViewBinding;
import com.xiaomi.hm.health.databinding.FragmentEnergyItemBinding;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSteps;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.eventbus.EventDateDataAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.job.HMDataAnalisisJob;
import com.xiaomi.hm.health.running.EnergyItemFragment;
import com.xiaomi.hm.health.running.calori.CaloriViewModel;
import com.xiaomi.hm.health.running.calori.SportFilterType;
import com.xiaomi.hm.health.sleep.ext.ViewExKt;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import defpackage.sl1;
import defpackage.u6;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 O2\u00020\u0001:\u0002OPB\u0007¢\u0006\u0004\bM\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0001H\u0016J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!R\u001d\u0010(\u001a\u00020\r8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00106R\u0016\u0010;\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010?\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b=\u0010>R\u001d\u0010D\u001a\u00020@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b9\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010J¨\u0006Q"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyItemFragment;", "Landroidx/fragment/app/Fragment;", "", DTransferConstants.SEARCH_KEY, SOAP.XMLNS, "m", "h", z.j, "", "restCal", "f", "Lcom/xiaomi/hm/health/ui/sportfitness/manager/HistoryRecordManager;", "manager", "", "start", "end", "", "needReset", GoogleApiAvailabilityLight.b, "childFragment", "onAttachFragment", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "Lcom/xiaomi/hm/health/eventbus/EventDateDataAnalysisJobFinished;", "event", "onEvent", "a", "Lkotlin/Lazy;", "getCreateTime", "()J", ParamKey.createTime, "Lcom/xiaomi/hm/health/running/EnergyItemFragment$TimeCallback;", "b", "Lcom/xiaomi/hm/health/running/EnergyItemFragment$TimeCallback;", "callback", "Lcom/xiaomi/hm/health/running/EnergyDataProvider;", "c", "Lcom/xiaomi/hm/health/running/EnergyDataProvider;", "dayDataProvider", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", "filterType", "e", "J", "startTime", "endTime", "g", "Z", "lastPage", "Lcom/xiaomi/hm/health/running/calori/CaloriViewModel;", "l", "()Lcom/xiaomi/hm/health/running/calori/CaloriViewModel;", "viewModel", "Lcom/xiaomi/hm/health/databinding/FragmentEnergyItemBinding;", "i", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/xiaomi/hm/health/databinding/FragmentEnergyItemBinding;", "binding", "Lcom/xiaomi/hm/health/running/EnergyItemAdapter;", "Lcom/xiaomi/hm/health/running/EnergyItemAdapter;", "itemAdapter", "Lrx/Subscription;", hl.k, "Lrx/Subscription;", "localSubscription", "webSubscription", "<init>", "()V", "Companion", "TimeCallback", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EnergyItemFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] m;

    @NotNull
    private static final String n = "filterType";

    @NotNull
    private static final String o = "startTime";

    @NotNull
    private static final String p = "endTime";

    @NotNull
    private static final String q = "lastPage";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TimeCallback callback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private EnergyDataProvider dayDataProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SportFilterType filterType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long startTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long endTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private EnergyItemAdapter itemAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Subscription localSubscription;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Subscription webSubscription;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy createTime = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean lastPage = true;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CaloriViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.running.EnergyItemFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.running.EnergyItemFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = FragmentViewBindingKt.viewBinding(new EnergyItemFragment$special$$inlined$viewBinding$1(new InflateViewBinder(FragmentEnergyItemBinding.class)));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyItemFragment$Companion;", "", "Lcom/xiaomi/hm/health/running/calori/SportFilterType;", "type", "", "start", "end", "", "last", "Lcom/xiaomi/hm/health/running/EnergyItemFragment;", "newInstance", "", "ARG_END_TIME", "Ljava/lang/String;", "ARG_FILTER_TYPE", "ARG_LAST_PAGE", "ARG_START_TIME", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final EnergyItemFragment newInstance(@NotNull SportFilterType type, long start, long end, boolean last) {
            EnergyItemFragment energyItemFragment = new EnergyItemFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("filterType", type);
            bundle.putLong("startTime", start);
            bundle.putLong("endTime", end);
            bundle.putBoolean("lastPage", last);
            Unit unit = Unit.INSTANCE;
            energyItemFragment.setArguments(bundle);
            return energyItemFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/running/EnergyItemFragment$TimeCallback;", "", "", "start", "", "setStartTime", "getStartTime", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface TimeCallback {
        long getStartTime();

        void setStartTime(long start);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Long> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final long a() {
            return AccountModuleKt.getAccountService().getRegisterDate();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(a());
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EnergyItemFragment.class), "binding", "getBinding()Lcom/xiaomi/hm/health/databinding/FragmentEnergyItemBinding;"));
        m = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    private final void f(int restCal) {
        FooterSportEnergyViewBinding footerSportEnergyViewBindingInflate = FooterSportEnergyViewBinding.inflate(LayoutInflater.from(getContext()), g().energyItemContent, false);
        ViewExKt.setVisible(footerSportEnergyViewBindingInflate.rootRestCal, false);
        EnergyItemAdapter energyItemAdapter = this.itemAdapter;
        Objects.requireNonNull(energyItemAdapter);
        energyItemAdapter.setFooterView(footerSportEnergyViewBindingInflate.getRoot());
    }

    private final FragmentEnergyItemBinding g() {
        return (FragmentEnergyItemBinding) this.binding.getValue(this, m[2]);
    }

    private final void h() {
        Observable<ArrayList<Object>> observableObserveOn = this.dayDataProvider.fetchDayDataFromLocal(this.startTime, this.endTime).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        EnergyItemAdapter energyItemAdapter = this.itemAdapter;
        Objects.requireNonNull(energyItemAdapter);
        this.localSubscription = observableObserveOn.subscribe(new sl1(energyItemAdapter), u6.a, new Action0() { // from class: ql1
            @Override // rx.functions.Action0
            public final void call() {
                EnergyItemFragment.i(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EnergyItemFragment energyItemFragment) {
        System.out.println((Object) (energyItemFragment.startTime + " - local onCompleted"));
    }

    private final void j() {
        Observable<ArrayList<Object>> observableObserveOn = this.dayDataProvider.fetchPeriodDataFromLocal(Math.max(getCreateTime(), this.startTime), this.endTime).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        EnergyItemAdapter energyItemAdapter = this.itemAdapter;
        Objects.requireNonNull(energyItemAdapter);
        this.localSubscription = observableObserveOn.subscribe(new sl1(energyItemAdapter), new Action1() { // from class: tl1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                EnergyItemFragment.k(this.a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(EnergyItemFragment energyItemFragment, Throwable th) {
        System.out.println((Object) (energyItemFragment.startTime + " - local onCompleted"));
    }

    private final CaloriViewModel l() {
        return (CaloriViewModel) this.viewModel.getValue();
    }

    private final void m() {
        SportDay sportDay = this.dayDataProvider.getSportDay(this.startTime);
        HMDataCacheCenter.getInstance().getmBandUint().checkDateDataDownloadStatus(sportDay);
        new HMDataAnalisisJob(sportDay.getKey(), 0, HMDeviceType.MILI.getValue(), 0).start();
    }

    private final void n(HistoryRecordManager manager, final long start, long end, final boolean needReset) {
        this.webSubscription = manager.loadWebDataByTimeRangeInRx(Long.valueOf(Math.max(getCreateTime(), start)), Long.valueOf(Math.min(System.currentTimeMillis(), end)), new SimpleDateFormat("yyyy-MM", Locale.getDefault())).subscribe(new Action1() { // from class: ul1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                EnergyItemFragment.o(needReset, this, start, (Boolean) obj);
            }
        }, u6.a, new Action0() { // from class: rl1
            @Override // rx.functions.Action0
            public final void call() {
                EnergyItemFragment.p();
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final EnergyItemFragment newInstance(@NotNull SportFilterType sportFilterType, long j, long j2, boolean z) {
        return INSTANCE.newInstance(sportFilterType, j, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(boolean z, EnergyItemFragment energyItemFragment, long j, Boolean bool) {
        if (!(bool.booleanValue() && z)) {
            bool = null;
        }
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        TimeCallback timeCallback = energyItemFragment.callback;
        if (timeCallback != null) {
            timeCallback.setStartTime(j);
        }
        energyItemFragment.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p() {
        System.out.println((Object) "web onCompleted");
    }

    private final void q() {
        l().getRestCal().observe(getViewLifecycleOwner(), new Observer() { // from class: pl1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EnergyItemFragment.r(this.a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(EnergyItemFragment energyItemFragment, Integer num) {
        energyItemFragment.f(num.intValue());
    }

    private final void s() {
        SportFilterType sportFilterType = this.filterType;
        Objects.requireNonNull(sportFilterType);
        if (sportFilterType == SportFilterType.DAY) {
            m();
        } else {
            j();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final long getCreateTime() {
        return ((Number) this.createTime.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttachFragment(@NotNull Fragment childFragment) {
        super.onAttachFragment(childFragment);
        this.callback = (TimeCallback) childFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            SportFilterType sportFilterType = (SportFilterType) arguments.getSerializable("filterType");
            if (sportFilterType == null) {
                sportFilterType = SportFilterType.DAY;
            }
            this.filterType = sportFilterType;
            this.startTime = arguments.getLong("startTime");
            this.endTime = arguments.getLong("endTime");
            this.lastPage = arguments.getBoolean("lastPage");
        }
        EventBus.getDefault().register(this);
        EnergyDataProvider energyDataProvider = new EnergyDataProvider();
        this.dayDataProvider = energyDataProvider;
        energyDataProvider.onCreate();
        EnergyDataProvider energyDataProvider2 = this.dayDataProvider;
        SportFilterType sportFilterType2 = this.filterType;
        Objects.requireNonNull(sportFilterType2);
        energyDataProvider2.setFilterType(sportFilterType2);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return g().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Subscription subscription = this.localSubscription;
        if (subscription != null) {
            if (subscription.isUnsubscribed()) {
                subscription = null;
            }
            if (subscription != null) {
                subscription.unsubscribe();
            }
        }
        Subscription subscription2 = this.webSubscription;
        if (subscription2 != null) {
            Subscription subscription3 = subscription2.isUnsubscribed() ? null : subscription2;
            if (subscription3 != null) {
                subscription3.unsubscribe();
            }
        }
        EventBus.getDefault().unregister(this);
        EnergyDataProvider energyDataProvider = this.dayDataProvider;
        if (energyDataProvider != null) {
            energyDataProvider.onDestroy();
        }
        super.onDestroy();
    }

    public final void onEvent(@NotNull EventDateDataAnalysisJobFinished event) {
        StepsInfo stepsInfo;
        StepsInfo stepsInfo2;
        EnergyDataProvider energyDataProvider = this.dayDataProvider;
        if (energyDataProvider == null) {
            return;
        }
        String key = energyDataProvider.getSportDay(this.startTime).getKey();
        DaySportData data = event.getData();
        ArrayList<StageSteps> stageSteps = null;
        if (Intrinsics.areEqual(key, data == null ? null : data.getKey())) {
            DaySportData data2 = event.getData();
            String key2 = data2 == null ? null : data2.getKey();
            DaySportData data3 = event.getData();
            System.out.println((Object) ("EventDateDataAnalysisJobFinished : " + key2 + "; stage count = " + ((data3 == null || (stepsInfo = data3.getStepsInfo()) == null) ? null : stepsInfo.getStageSteps())));
            DaySportData data4 = event.getData();
            if (data4 != null && (stepsInfo2 = data4.getStepsInfo()) != null) {
                stageSteps = stepsInfo2.getStageSteps();
            }
            energyDataProvider.setStageStepInfo(stageSteps);
            h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        HistoryRecordManager historyRecordManager = HistoryRecordManager.getInstance();
        g().energyItemContent.setLayoutManager(new LinearLayoutManager(getContext()));
        SportFilterType sportFilterType = this.filterType;
        Objects.requireNonNull(sportFilterType);
        EnergyItemAdapter energyItemAdapter = new EnergyItemAdapter(sportFilterType, this.lastPage);
        this.itemAdapter = energyItemAdapter;
        energyItemAdapter.bindToRecyclerView(g().energyItemContent);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.header_sport_energy_view, (ViewGroup) g().energyItemContent, false);
        ((TextView) viewInflate.findViewById(R.id.main_activity_title)).setVisibility(8);
        energyItemAdapter.setEmptyView(viewInflate);
        s();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.startTime);
        if (this.lastPage) {
            calendar.add(2, -1);
            n(historyRecordManager, calendar.getTimeInMillis(), this.endTime, true);
        } else {
            Calendar calendar2 = Calendar.getInstance();
            TimeCallback timeCallback = this.callback;
            calendar2.setTimeInMillis(timeCallback == null ? this.startTime : timeCallback.getStartTime());
            int i = calendar.get(1) - calendar2.get(1);
            int i2 = calendar.get(2) - calendar2.get(2);
            if ((i == 1 && i2 + 12 == 0) || (i == 0 && i2 == 0)) {
                long timeInMillis = calendar.getTimeInMillis();
                calendar.add(2, -1);
                n(historyRecordManager, calendar.getTimeInMillis(), timeInMillis, false);
            } else {
                calendar.add(2, -1);
                n(historyRecordManager, calendar.getTimeInMillis(), this.endTime, true);
            }
        }
        q();
    }
}
