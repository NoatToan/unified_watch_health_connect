package com.huami.heartrate.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.Index;
import com.huami.heartrate.R;
import com.huami.heartrate.chart.HRChartHelper;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.databinding.HeartRateFragmentDetailBinding;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.ui.HeartRateMonthDetailFragment.a;
import com.huami.heartrate.ui.HeartRateMonthDetailFragment.b;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.heartrate.viewmodel.HeartRateDetailViewModel;
import com.huami.heartrate.viewmodel.UserInfoViewModel;
import com.huami.heartrate.vo.BarChartBuilder;
import com.huami.heartrate.vo.BarChartVo;
import com.huami.heartrate.vo.BarPeriodInfo;
import com.huami.heartrate.vo.BarPeriodInfoKt;
import com.huami.heartrate.vo.StatisticsInfo;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateMonthDetailFragment;", "Lcom/huami/heartrate/ui/HeartRateBaseFragment;", "Lcom/huami/heartrate/vo/BarPeriodInfo;", "data", "", "f", "", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/heartrate/databinding/HeartRateFragmentDetailBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.a, "()Lcom/huami/heartrate/databinding/HeartRateFragmentDetailBinding;", "viewBinding", "Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "c", "Lkotlin/Lazy;", "()Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "userInfoViewModel", "Lcom/huami/heartrate/viewmodel/HeartRateDetailViewModel;", "e", "()Lcom/huami/heartrate/viewmodel/HeartRateDetailViewModel;", "viewModel", "getUserId", "()Ljava/lang/String;", "userId", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateMonthDetailFragment extends HeartRateBaseFragment {
    public static final /* synthetic */ KProperty<Object>[] f;

    @NotNull
    private static final String g = "HeartRateMonthDetailFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = FragmentViewBindingKt.viewBinding(new HeartRateMonthDetailFragment$special$$inlined$viewBinding$1(new InflateViewBinder(HeartRateFragmentDetailBinding.class)));

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateMonthDetailFragment$special$$inlined$activityViewModels$default$1
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateMonthDetailFragment$special$$inlined$activityViewModels$default$2
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
    private final Lazy viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "i", "Lcom/huami/heartrate/vo/BarChartVo;", "data", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Index, BarChartVo, Unit> {
        public a() {
            super(2);
        }

        public final void a(@NotNull Index index, @NotNull BarChartVo barChartVo) {
            HeartRateMonthDetailFragment.this.f(BarPeriodInfoKt.toBarPeriodInfo(barChartVo));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Index index, BarChartVo barChartVo) {
            a(index, barChartVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BarPeriodInfo value = HeartRateMonthDetailFragment.this.e().getBarPeriodInfoLiveData().getValue();
            if (value == null) {
                return;
            }
            HeartRateMonthDetailFragment.this.f(value);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ BarChartBuilder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BarChartBuilder barChartBuilder) {
            super(0);
            this.a = barChartBuilder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ StatisticsInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(StatisticsInfo statisticsInfo) {
            super(0);
            this.a = statisticsInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.toString();
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
            UserOfHeartRate value = HeartRateMonthDetailFragment.this.c().getUserInfoLiveData().getValue();
            return (value == null || (userId = value.getUserId()) == null) ? "" : userId;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeartRateMonthDetailFragment.class), "viewBinding", "getViewBinding()Lcom/huami/heartrate/databinding/HeartRateFragmentDetailBinding;"));
        f = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public HeartRateMonthDetailFragment() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateMonthDetailFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                final HeartRateMonthDetailFragment heartRateMonthDetailFragment = this.a;
                return new ViewModelProvider.Factory() { // from class: com.huami.heartrate.ui.HeartRateMonthDetailFragment$viewModel$2.1
                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                        return new HeartRateDetailViewModel(heartRateMonthDetailFragment.getUserId());
                    }
                };
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.huami.heartrate.ui.HeartRateMonthDetailFragment$special$$inlined$viewModels$default$1
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HeartRateDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateMonthDetailFragment$special$$inlined$viewModels$default$2
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
    }

    private final String b() {
        return HMDataFormatKt.getFormatTime$default(HeartRateTimeUtils.INSTANCE.getStartTime(getTime(), 18), HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInfoViewModel c() {
        return (UserInfoViewModel) this.userInfoViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateFragmentDetailBinding d() {
        return (HeartRateFragmentDetailBinding) this.viewBinding.getValue(this, f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateDetailViewModel e() {
        return (HeartRateDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(BarPeriodInfo data) {
        String str;
        boolean z = data != null && HandleDataKt.isValidHeartRate().invoke(Integer.valueOf(data.getMin())).booleanValue() && HandleDataKt.isValidHeartRate().invoke(Integer.valueOf(data.getMin())).booleanValue();
        d().textUnit.setVisibility(z ? 0 : 8);
        TypefaceTextView typefaceTextView = d().textHeartRate;
        if (z) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(Locale.getDefault(), "%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(data.getMin()), Integer.valueOf(data.getMax())}, 2));
        } else {
            str = "--";
        }
        typefaceTextView.setText(str);
        d().textTime.setText(data == null ? String.format("%s", Arrays.copyOf(new Object[]{b()}, 1)) : data.getPeriodFrom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return d().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        e().load(HeartRateTimeUtils.INSTANCE.getStartTime(getTime(), 18), 18);
        getChildFragmentManager().beginTransaction().add(R.id.subHrFragmentContainer, HeartRateFooterFragment.INSTANCE.newInstance(18)).commit();
        e().getChartBuilderLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.heartrate.ui.HeartRateMonthDetailFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                BarChartBuilder barChartBuilder = (BarChartBuilder) t;
                if (barChartBuilder.getLastValidIndex() == null) {
                    this.a.f(null);
                } else {
                    this.a.f(BarPeriodInfoKt.toBarPeriodInfo(barChartBuilder.getBars().get(barChartBuilder.getLastValidIndex().intValue())));
                }
                new HRChartHelper(this.a.requireContext()).refreshBarChart(this.a.d().chartContainer, barChartBuilder, this.a.new a(), this.a.new b(), HeartRateMonthDetailFragment.c.a);
                HMLog.debug("HeartRateMonthDetailFragment", new HeartRateMonthDetailFragment.d(barChartBuilder));
            }
        });
        e().getStatisticsLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.heartrate.ui.HeartRateMonthDetailFragment$onViewCreated$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                HMLog.debug("HeartRateMonthDetailFragment", new HeartRateMonthDetailFragment.e((StatisticsInfo) t));
            }
        });
    }
}
