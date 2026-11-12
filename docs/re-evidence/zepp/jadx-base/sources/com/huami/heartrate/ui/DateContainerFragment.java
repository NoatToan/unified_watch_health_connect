package com.huami.heartrate.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.databinding.HeartRateFragmentDateContainerBinding;
import com.huami.heartrate.model.TimeIndex;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.ui.DateContainerFragment;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateAnalyticsHelperKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.heartrate.view.WrapContentHeightViewPager;
import com.huami.heartrate.viewmodel.MeasureHrViewModel;
import com.huami.heartrate.viewmodel.ShareHeartRateViewModel;
import com.huami.heartrate.viewmodel.UserInfoViewModel;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.loc.z;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0006\u0010\u0013\u001a\u00020\u0006J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001d\u0010)\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010-R\u001d\u00101\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b+\u00100R\u001d\u00104\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00106R+\u0010<\u001a\u00020/2\u0006\u00108\u001a\u00020/8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u00109\u001a\u0004\b\"\u00100\"\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/huami/heartrate/ui/DateContainerFragment;", "Landroidx/fragment/app/Fragment;", "", "loadData", "i", "l", "", "position", "m", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "getCurrentItem", "onResume", "Lcom/huami/heartrate/databinding/HeartRateFragmentDateContainerBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "h", "()Lcom/huami/heartrate/databinding/HeartRateFragmentDateContainerBinding;", "viewBinding", "Lcom/huami/heartrate/viewmodel/ShareHeartRateViewModel;", "b", "Lkotlin/Lazy;", "f", "()Lcom/huami/heartrate/viewmodel/ShareHeartRateViewModel;", "shareViewModel", "Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "c", "g", "()Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "userInfoViewModel", "Lcom/huami/heartrate/viewmodel/MeasureHrViewModel;", GoogleApiAvailabilityLight.a, "()Lcom/huami/heartrate/viewmodel/MeasureHrViewModel;", "measureHrLoadVM", "", "e", "getUserId", "()Ljava/lang/String;", "userId", "", "()J", "registerTime", "getTimeType", "()I", "timeType", "", "Z", "isPreloading", "<set-?>", "Lkotlin/properties/ReadWriteProperty;", GoogleApiAvailabilityLight.b, "(J)V", "mLatestSyncTime", z.j, LogUtil.I, "currentPosition", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class DateContainerFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String EXTRA_HEART_RATE_TYPE = "EXTRA_HEART_RATE_TYPE";
    public static final /* synthetic */ KProperty<Object>[] k;
    private static final int l = 100;
    private static final long m = 0;

    @NotNull
    private static final String n = "DateContainerFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = FragmentViewBindingKt.viewBinding(new DateContainerFragment$special$$inlined$viewBinding$1(new InflateViewBinder(HeartRateFragmentDateContainerBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ShareHeartRateViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.DateContainerFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.DateContainerFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.DateContainerFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.DateContainerFragment$special$$inlined$activityViewModels$default$4
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy measureHrLoadVM;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy registerTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isPreloading;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mLatestSyncTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int currentPosition;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/huami/heartrate/ui/DateContainerFragment$Companion;", "", "", "heartRateType", "Lcom/huami/heartrate/ui/DateContainerFragment;", "newInstance", "", "DONT_NEED_SYNC", "J", "", DateContainerFragment.EXTRA_HEART_RATE_TYPE, "Ljava/lang/String;", "SYNC_FROM_SERVER_COUNT", LogUtil.I, "TAG", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DateContainerFragment newInstance(int heartRateType) {
            DateContainerFragment dateContainerFragment = new DateContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(DateContainerFragment.EXTRA_HEART_RATE_TYPE, heartRateType);
            Unit unit = Unit.INSTANCE;
            dateContainerFragment.setArguments(bundle);
            return dateContainerFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "mLatestSyncTime : " + DateContainerFragment.this.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "queryStartTime : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "preloadMeasureHrData";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Long> {
        public d() {
            super(0);
        }

        public final long a() {
            UserOfHeartRate value = DateContainerFragment.this.g().getUserInfoLiveData().getValue();
            Long lValueOf = value == null ? null : Long.valueOf(value.getRegisterTime());
            return lValueOf == null ? ExtensionUtilsKt.millsToSecond(System.currentTimeMillis()) : lValueOf.longValue();
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Long getA() {
            return Long.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Integer> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            Bundle arguments = DateContainerFragment.this.getArguments();
            if (arguments == null) {
                return 16;
            }
            return arguments.getInt(DateContainerFragment.EXTRA_HEART_RATE_TYPE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            String userId;
            UserOfHeartRate value = DateContainerFragment.this.g().getUserInfoLiveData().getValue();
            return (value == null || (userId = value.getUserId()) == null) ? "" : userId;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[8];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DateContainerFragment.class), "viewBinding", "getViewBinding()Lcom/huami/heartrate/databinding/HeartRateFragmentDateContainerBinding;"));
        kPropertyArr[7] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DateContainerFragment.class), "mLatestSyncTime", "getMLatestSyncTime()J"));
        k = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public DateContainerFragment() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.DateContainerFragment$measureHrLoadVM$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                final DateContainerFragment dateContainerFragment = this.a;
                return new ViewModelProvider.Factory() { // from class: com.huami.heartrate.ui.DateContainerFragment$measureHrLoadVM$2.1
                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                        return new MeasureHrViewModel(dateContainerFragment.getUserId());
                    }
                };
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.huami.heartrate.ui.DateContainerFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.measureHrLoadVM = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MeasureHrViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.DateContainerFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function1.getA()).getViewModelStore();
            }
        }, function0);
        this.userId = LazyKt__LazyJVMKt.lazy(new f());
        this.registerTime = LazyKt__LazyJVMKt.lazy(new d());
        this.timeType = LazyKt__LazyJVMKt.lazy(new e());
        this.mLatestSyncTime = Delegates.INSTANCE.notNull();
        this.currentPosition = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c() {
        return ((Number) this.mLatestSyncTime.getValue(this, k[7])).longValue();
    }

    private final MeasureHrViewModel d() {
        return (MeasureHrViewModel) this.measureHrLoadVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long e() {
        return ((Number) this.registerTime.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShareHeartRateViewModel f() {
        return (ShareHeartRateViewModel) this.shareViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInfoViewModel g() {
        return (UserInfoViewModel) this.userInfoViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTimeType() {
        return ((Number) this.timeType.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    private final HeartRateFragmentDateContainerBinding h() {
        return (HeartRateFragmentDateContainerBinding) this.viewBinding.getValue(this, k[0]);
    }

    private final void i() {
        d().getLatestSyncedMeasureHrLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: c31
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DateContainerFragment.j(this.a, (HeartRateEntity) obj);
            }
        });
        d().getRemoteMeasureLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: d31
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DateContainerFragment.k(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DateContainerFragment dateContainerFragment, HeartRateEntity heartRateEntity) {
        dateContainerFragment.n(heartRateEntity.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(DateContainerFragment dateContainerFragment, List list) {
        dateContainerFragment.isPreloading = false;
        dateContainerFragment.n(list == null || list.isEmpty() ? 0L : ((HeartRateEntity) CollectionsKt___CollectionsKt.sorted(list).get(list.size() - 1)).getTime());
    }

    private final void l() {
        int timeType = getTimeType();
        final int differFromRegisterDay$default = HeartRateTimeUtils.getDifferFromRegisterDay$default(HeartRateTimeUtils.INSTANCE, 0L, e(), Integer.valueOf(timeType), 1, null) + 1;
        WrapContentHeightViewPager wrapContentHeightViewPager = h().vpDateHeartRate;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        wrapContentHeightViewPager.setAdapter(new FragmentPagerAdapter(childFragmentManager) { // from class: com.huami.heartrate.ui.DateContainerFragment$initViewPager$1
            @Override // androidx.viewpager.widget.PagerAdapter
            /* JADX INFO: renamed from: getCount, reason: from getter */
            public int getA() {
                return differFromRegisterDay$default;
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            @NotNull
            public Fragment getItem(int position) {
                return HeartRateBaseFragment.INSTANCE.newInstance(HeartRateTimeUtils.INSTANCE.getTimeFromRegisterDay(position, this.getTimeType(), this.e()), this.getTimeType(), position);
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
            public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
                View view;
                super.setPrimaryItem(container, position, object);
                WrapContentHeightViewPager wrapContentHeightViewPager2 = container instanceof WrapContentHeightViewPager ? (WrapContentHeightViewPager) container : null;
                if (position != this.currentPosition) {
                    HeartRateBaseFragment heartRateBaseFragment = object instanceof HeartRateBaseFragment ? (HeartRateBaseFragment) object : null;
                    if (heartRateBaseFragment == null || (view = heartRateBaseFragment.getView()) == null) {
                        return;
                    }
                    DateContainerFragment dateContainerFragment = this;
                    if (wrapContentHeightViewPager2 != null) {
                        wrapContentHeightViewPager2.setCurrentView(view);
                    }
                    dateContainerFragment.currentPosition = position;
                }
            }
        });
        h().vpDateHeartRate.setOffscreenPageLimit(1);
        h().vpDateHeartRate.setCurrentItem(differFromRegisterDay$default - 1, false);
        h().vpDateHeartRate.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huami.heartrate.ui.DateContainerFragment$initViewPager$2
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                this.a.f().getGetShareIconStatus().setValue(new TimeIndex(this.a.getTimeType(), position));
                this.a.m(position);
            }
        });
    }

    private final void loadData() {
        d().queryLatestSyncedMeasureHr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int position) {
        if (c() == 0 || this.isPreloading || getTimeType() != 16) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ExtensionUtilsKt.secondToMills(c()));
        HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
        long startTime = heartRateTimeUtils.getStartTime(heartRateTimeUtils.getTimeFromRegisterDay(position, getTimeType(), e()), getTimeType());
        HMLog.debug(n, new a());
        HMLog.debug(n, new b(startTime));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(startTime);
        calendar2.add(2, -1);
        if (calendar2.before(calendar)) {
            HMLog.debug(n, c.a);
            this.isPreloading = true;
            d().fetchMeasureHr(e(), c() - 1);
        }
    }

    private final void n(long j) {
        this.mLatestSyncTime.setValue(this, k[7], Long.valueOf(j));
    }

    public final int getCurrentItem() {
        return h().vpDateHeartRate.getCurrentItem();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return h().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        String str;
        super.onResume();
        switch (getTimeType()) {
            case 16:
                str = HeartRateAnalyticsHelperKt.DETAIL_HR_DAY_V;
                break;
            case 17:
                str = HeartRateAnalyticsHelperKt.DETAIL_HR_WEEK_V;
                break;
            case 18:
                str = HeartRateAnalyticsHelperKt.DETAIL_HR_MONTH_V;
                break;
            default:
                str = HeartRateAnalyticsHelperKt.DETAIL_HR_YEAR_V;
                break;
        }
        HeartRateAnalyticsHelperKt.recordEvent(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        n(ExtensionUtilsKt.millsToSecond(System.currentTimeMillis()));
        l();
        i();
        loadData();
    }
}
