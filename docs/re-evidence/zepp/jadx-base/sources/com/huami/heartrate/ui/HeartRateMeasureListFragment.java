package com.huami.heartrate.ui;

import android.content.Context;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.databinding.HeartRateFragmentMeasureListBinding;
import com.huami.heartrate.model.UserOfHeartRate;
import com.huami.heartrate.viewmodel.MeasureHrViewModel;
import com.huami.heartrate.viewmodel.UserInfoViewModel;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J!\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateMeasureListFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Lkotlin/ExtensionFunctionType;", "operation", "a", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/heartrate/databinding/HeartRateFragmentMeasureListBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "b", "()Lcom/huami/heartrate/databinding/HeartRateFragmentMeasureListBinding;", "binding", "Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/heartrate/viewmodel/UserInfoViewModel;", "userInfoViewModel", "Lcom/huami/heartrate/viewmodel/MeasureHrViewModel;", "c", "()Lcom/huami/heartrate/viewmodel/MeasureHrViewModel;", "measureHRDataVM", "", "getUserId", "()Ljava/lang/String;", "userId", "Lcom/huami/heartrate/ui/MeasureHRListAdapter;", "e", "Lcom/huami/heartrate/ui/MeasureHRListAdapter;", "mAdapter", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateMeasureListFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = FragmentViewBindingKt.viewBinding(new HeartRateMeasureListFragment$special$$inlined$viewBinding$1(new InflateViewBinder(HeartRateFragmentMeasureListBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UserInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateMeasureListFragment$special$$inlined$activityViewModels$default$1
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateMeasureListFragment$special$$inlined$activityViewModels$default$2
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
    private final Lazy measureHRDataVM;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private MeasureHRListAdapter mAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateMeasureListFragment$Companion;", "", "Lcom/huami/heartrate/ui/HeartRateMeasureListFragment;", "newInstance", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HeartRateMeasureListFragment newInstance() {
            return new HeartRateMeasureListFragment();
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
            UserOfHeartRate value = HeartRateMeasureListFragment.this.d().getUserInfoLiveData().getValue();
            return (value == null || (userId = value.getUserId()) == null) ? "" : userId;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeartRateMeasureListFragment.class), "binding", "getBinding()Lcom/huami/heartrate/databinding/HeartRateFragmentMeasureListBinding;"));
        f = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public HeartRateMeasureListFragment() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.huami.heartrate.ui.HeartRateMeasureListFragment$measureHRDataVM$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                final HeartRateMeasureListFragment heartRateMeasureListFragment = this.a;
                return new ViewModelProvider.Factory() { // from class: com.huami.heartrate.ui.HeartRateMeasureListFragment$measureHRDataVM$2.1
                    @Override // androidx.lifecycle.ViewModelProvider.Factory
                    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                        return new MeasureHrViewModel(heartRateMeasureListFragment.getUserId());
                    }
                };
            }
        };
        final Function0<Fragment> function1 = new Function0<Fragment>() { // from class: com.huami.heartrate.ui.HeartRateMeasureListFragment$special$$inlined$viewModels$default$1
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
        this.measureHRDataVM = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MeasureHrViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.heartrate.ui.HeartRateMeasureListFragment$special$$inlined$viewModels$default$2
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
        this.userId = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Function1<? super Context, Unit> operation) {
        if (!isAdded() || getContext() == null) {
            return;
        }
        operation.invoke(requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateFragmentMeasureListBinding b() {
        return (HeartRateFragmentMeasureListBinding) this.binding.getValue(this, f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasureHrViewModel c() {
        return (MeasureHrViewModel) this.measureHRDataVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInfoViewModel d() {
        return (UserInfoViewModel) this.userInfoViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return b().getRoot();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SmartRefreshLayout smartRefreshLayout = b().smartRefreshLayout;
        smartRefreshLayout.setEnableRefresh(false);
        smartRefreshLayout.setEnableLoadmore(true);
        smartRefreshLayout.setEnableAutoLoadmore(true);
        smartRefreshLayout.setOnRefreshLoadmoreListener(new OnRefreshLoadmoreListener() { // from class: com.huami.heartrate.ui.HeartRateMeasureListFragment$onViewCreated$1$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/Context;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<Context, Unit> {
                public final /* synthetic */ HeartRateMeasureListFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(HeartRateMeasureListFragment heartRateMeasureListFragment) {
                    super(1);
                    this.a = heartRateMeasureListFragment;
                }

                public final void a(@NotNull Context context) {
                    this.a.c().fetchMeasureHrByPaging(context);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Context context) {
                    a(context);
                    return Unit.INSTANCE;
                }
            }

            @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
            public void onLoadmore(@Nullable RefreshLayout refreshlayout) {
                HeartRateMeasureListFragment heartRateMeasureListFragment = this.a;
                heartRateMeasureListFragment.a(new a(heartRateMeasureListFragment));
            }

            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public void onRefresh(@Nullable RefreshLayout refreshlayout) {
            }
        });
        this.mAdapter = new MeasureHRListAdapter(requireContext(), c().getHistoryViewTypeDataList());
        RecyclerView recyclerView = b().rvMeasureHr;
        MeasureHRListAdapter measureHRListAdapter = this.mAdapter;
        Objects.requireNonNull(measureHRListAdapter);
        recyclerView.setAdapter(measureHRListAdapter);
        b().rvMeasureHr.setLayoutManager(new LinearLayoutManager(getContext()));
        c().fetchMeasureHrByPaging(requireContext());
        c().isNoMoreDataLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.heartrate.ui.HeartRateMeasureListFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                boolean zBooleanValue = ((Boolean) t).booleanValue();
                boolean z = true;
                if ((this.a.b().noData.getVisibility() == 0) && (!this.a.c().getHistoryViewTypeDataList().isEmpty())) {
                    this.a.b().noData.setVisibility(8);
                }
                if (zBooleanValue) {
                    this.a.b().smartRefreshLayout.setEnableLoadmore(false);
                }
                List<HistoryViewTypeData> historyViewTypeDataList = this.a.c().getHistoryViewTypeDataList();
                if (historyViewTypeDataList != null && !historyViewTypeDataList.isEmpty()) {
                    z = false;
                }
                if (z && zBooleanValue) {
                    this.a.b().noData.setVisibility(0);
                }
                this.a.b().smartRefreshLayout.finishLoadmore();
                MeasureHRListAdapter measureHRListAdapter2 = this.a.mAdapter;
                Objects.requireNonNull(measureHRListAdapter2);
                measureHRListAdapter2.notifyDataSetChanged();
            }
        });
    }
}
