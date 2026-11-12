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
import com.huami.bigdata.statistics.heartrate.HeartRateStatistics;
import com.huami.heartrate.R;
import com.huami.heartrate.databinding.HeartRateFragmentDetailFooterBinding;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.ui.HeartRateFooterFragment;
import com.huami.heartrate.utils.HeartRateAnalyticsHelperKt;
import com.huami.heartrate.viewmodel.HeartRateDetailViewModel;
import com.huami.heartrate.viewmodel.UserInfoViewModel;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateFooterFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "timeType", "", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/huami/heartrate/databinding/HeartRateFragmentDetailFooterBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/heartrate/databinding/HeartRateFragmentDetailFooterBinding;", "viewBinding", "Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "userInfoViewModel", "Lcom/huami/heartrate/viewmodel/HeartRateDetailViewModel;", "f", "()Lcom/huami/heartrate/viewmodel/HeartRateDetailViewModel;", "viewModel", "getUserId", "()Ljava/lang/String;", "userId", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateFooterFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] e;

    @NotNull
    private static final String f = "EXTRA_TIME_TYPE";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = FragmentViewBindingKt.viewBinding(new HeartRateFooterFragment$special$$inlined$viewBinding$1(new InflateViewBinder(HeartRateFragmentDetailFooterBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateFooterFragment$special$$inlined$activityViewModels$default$1
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateFooterFragment$special$$inlined$activityViewModels$default$2
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
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateFooterFragment$Companion;", "", "", "timeType", "Lcom/huami/heartrate/ui/HeartRateFooterFragment;", "newInstance", "", HeartRateFooterFragment.f, "Ljava/lang/String;", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HeartRateFooterFragment newInstance(int timeType) {
            HeartRateFooterFragment heartRateFooterFragment = new HeartRateFooterFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(HeartRateFooterFragment.f, timeType);
            Unit unit = Unit.INSTANCE;
            heartRateFooterFragment.setArguments(bundle);
            return heartRateFooterFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            String userId;
            UserOfHeartRate value = HeartRateFooterFragment.this.d().getUserInfoLiveData().getValue();
            return (value == null || (userId = value.getUserId()) == null) ? "" : userId;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ViewModelStoreOwner> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner getA() {
            return HeartRateFooterFragment.this.requireParentFragment();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeartRateFooterFragment.class), "viewBinding", "getViewBinding()Lcom/huami/heartrate/databinding/HeartRateFragmentDetailFooterBinding;"));
        e = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public HeartRateFooterFragment() {
        final b bVar = new b();
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HeartRateDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateFooterFragment$special$$inlined$viewModels$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) bVar.getA()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateFooterFragment$viewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                final HeartRateFooterFragment heartRateFooterFragment = this.a;
                return new ViewModelProvider.Factory() { // from class: com.huami.heartrate.ui.HeartRateFooterFragment$viewModel$3.1
                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                        return new HeartRateDetailViewModel(heartRateFooterFragment.getUserId());
                    }
                };
            }
        });
        this.userId = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final int b() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return 17;
        }
        return arguments.getInt(f);
    }

    private final String c(int timeType) {
        switch (timeType) {
            case 17:
                return getString(R.string.heart_rate_week_statistical_data);
            case 18:
                return getString(R.string.heart_rate_month_statistical_data);
            case 19:
                return getString(R.string.heart_rate_year_statistical_data);
            default:
                return getString(R.string.heart_rate_day_statistical_data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInfoViewModel d() {
        return (UserInfoViewModel) this.userInfoViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateFragmentDetailFooterBinding e() {
        return (HeartRateFragmentDetailFooterBinding) this.viewBinding.getValue(this, e[0]);
    }

    private final HeartRateDetailViewModel f() {
        return (HeartRateDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(HeartRateFooterFragment heartRateFooterFragment, View view) {
        HeartRateMeasureListActivity.INSTANCE.launchForResult(heartRateFooterFragment);
        HeartRateAnalyticsHelperKt.recordEvent(HeartRateAnalyticsHelperKt.DETAIL_HR_MANUAL_C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return e().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        e().statisticsView.initText(c(b()));
        f().getRawData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.heartrate.ui.HeartRateFooterFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                HeartRateStatistics heartRateStatistics = (HeartRateStatistics) t;
                if (heartRateStatistics == null) {
                    return;
                }
                this.a.e().statisticsView.setDataText(c.roundToInt(heartRateStatistics.getAvgValue()), heartRateStatistics.getMaxValue(), heartRateStatistics.getMinValue());
            }
        });
        e().measureResultLayout.setOnClickListener(new View.OnClickListener() { // from class: ty3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HeartRateFooterFragment.g(this.a, view2);
            }
        });
    }
}
