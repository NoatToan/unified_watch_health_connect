package com.huami.device.feature.health.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.ui.HealthDetectFragment;
import com.huami.device.feature.health.ui.adapter.HealthDetectApdater;
import com.huami.device.feature.health.ui.adapter.HrDetectAdapter;
import com.huami.device.feature.health.ui.bloodpressure.BloodPressureCorrectActivity;
import com.huami.device.feature.health.ui.model.SettingStatus;
import com.huami.device.feature.health.ui.model.SettingType;
import com.huami.device.feature.health.ui.viewmodel.BaseHealthViewModel;
import com.huami.device.feature.health.ui.viewmodel.HealthDetectViewModel;
import com.huami.device.feature.health.ui.viewmodel.HrDetectViewModel;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u001d\u0010 \u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006(²\u0006\u000e\u0010\u0007\u001a\u00020\t8\n@\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u00020'8\n@\nX\u008a\u0084\u0002"}, d2 = {"Lcom/huami/device/feature/health/ui/HealthDetectFragment;", "Landroidx/fragment/app/Fragment;", "", com.google.android.exoplayer2.text.ttml.b.r, z.j, "m", "Lcom/huami/device/feature/health/ui/viewmodel/BaseHealthViewModel;", "viewModel", DTransferConstants.SEARCH_KEY, "Lcom/huami/device/feature/health/ui/viewmodel/HealthDetectViewModel;", "h", "t", SOAP.XMLNS, "showLoading", "", "isSuccess", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/device/feature/health/device/HealthDevice;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/device/feature/health/device/HealthDevice;", "mDevice", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "<init>", "()V", "Lcom/huami/device/feature/health/ui/viewmodel/HrDetectViewModel;", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HealthDetectFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDevice = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Function0;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Function0<? extends Boolean>, Unit> {
        public final /* synthetic */ Lazy<HealthDetectViewModel> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lazy<HealthDetectViewModel> lazy) {
            super(1);
            this.a = lazy;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Boolean> function0) {
            invoke2((Function0<Boolean>) function0);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Function0<Boolean> function0) {
            HealthDetectFragment.k(this.a).setToDevice(function0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Function0;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Function0<? extends Boolean>, Unit> {
        public final /* synthetic */ Lazy<HealthDetectViewModel> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Lazy<HealthDetectViewModel> lazy) {
            super(1);
            this.a = lazy;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Boolean> function0) {
            invoke2((Function0<Boolean>) function0);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Function0<Boolean> function0) {
            HealthDetectFragment.k(this.a).checkBloodPressureStatus(function0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Function0;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Function0<? extends Boolean>, Unit> {
        public final /* synthetic */ Lazy<HrDetectViewModel> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Lazy<HrDetectViewModel> lazy) {
            super(1);
            this.a = lazy;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Boolean> function0) {
            invoke2((Function0<Boolean>) function0);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Function0<Boolean> function0) {
            HealthDetectFragment.n(this.a).setToDevice(function0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/device/feature/health/device/HealthDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<HealthDevice> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthDevice getA() {
            return (HealthDevice) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HealthDevice.class), null, null);
        }
    }

    private final void f(boolean isSuccess) {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        if (isSuccess) {
            loadingDialog.dismiss();
        } else {
            loadingDialog.setFailed(AppResKt.getHealthStr().getSetFail());
        }
    }

    private final HealthDevice g() {
        return (HealthDevice) this.mDevice.getValue();
    }

    private final void h(HealthDetectViewModel viewModel) {
        viewModel.getBloodPressureStatusLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: tv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDetectFragment.i(this.a, (SettingStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(HealthDetectFragment healthDetectFragment, SettingStatus settingStatus) {
        if (settingStatus == null) {
            return;
        }
        if (settingStatus instanceof SettingStatus.Loading) {
            healthDetectFragment.showLoading();
            return;
        }
        if (settingStatus instanceof SettingStatus.Success) {
            healthDetectFragment.f(true);
            healthDetectFragment.s();
        } else if (settingStatus instanceof SettingStatus.Fail) {
            healthDetectFragment.f(true);
            healthDetectFragment.t();
        }
    }

    private final void j() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.device.feature.health.ui.HealthDetectFragment$initHealth$$inlined$viewModels$default$1
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
        Lazy lazyCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HealthDetectViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.device.feature.health.ui.HealthDetectFragment$initHealth$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        }, null);
        q(k(lazyCreateViewModelLazy));
        h(k(lazyCreateViewModelLazy));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(SettingType.Other.INSTANCE, new a(lazyCreateViewModelLazy));
        linkedHashMap.put(SettingType.BloodPressure.INSTANCE, new b(lazyCreateViewModelLazy));
        Unit unit = Unit.INSTANCE;
        final HealthDetectApdater healthDetectApdater = new HealthDetectApdater(this, linkedHashMap);
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view))).setItemViewCacheSize(0);
        View view2 = getView();
        ((RecyclerView) (view2 != null ? view2.findViewById(R.id.recycler_view) : null)).setAdapter(healthDetectApdater);
        k(lazyCreateViewModelLazy).getItems().observe(getViewLifecycleOwner(), new Observer() { // from class: vv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDetectFragment.l(healthDetectApdater, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HealthDetectViewModel k(Lazy<HealthDetectViewModel> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HealthDetectApdater healthDetectApdater, List list) {
        healthDetectApdater.setNewData(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
    }

    private final void m() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.device.feature.health.ui.HealthDetectFragment$initHr$$inlined$viewModels$default$1
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
        Lazy lazyCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HrDetectViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.device.feature.health.ui.HealthDetectFragment$initHr$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        }, null);
        q(n(lazyCreateViewModelLazy));
        final HrDetectAdapter hrDetectAdapter = new HrDetectAdapter(this, new c(lazyCreateViewModelLazy));
        View view = getView();
        ((RecyclerView) (view != null ? view.findViewById(R.id.recycler_view) : null)).setAdapter(hrDetectAdapter);
        n(lazyCreateViewModelLazy).getItems().observe(getViewLifecycleOwner(), new Observer() { // from class: wv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDetectFragment.o(hrDetectAdapter, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HrDetectViewModel n(Lazy<HrDetectViewModel> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(HrDetectAdapter hrDetectAdapter, List list) {
        hrDetectAdapter.setNewData(list);
    }

    private final void p() {
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.recycler_view))).setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    private final void q(BaseHealthViewModel viewModel) {
        viewModel.getStatusLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: uv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDetectFragment.r(this.a, (SettingStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(HealthDetectFragment healthDetectFragment, SettingStatus settingStatus) {
        if (settingStatus == null) {
            return;
        }
        if (settingStatus instanceof SettingStatus.Loading) {
            healthDetectFragment.showLoading();
        } else if (settingStatus instanceof SettingStatus.Success) {
            healthDetectFragment.f(true);
        } else if (settingStatus instanceof SettingStatus.Fail) {
            healthDetectFragment.f(false);
        }
    }

    private final void s() {
        startActivity(new Intent(requireActivity(), (Class<?>) BloodPressureCorrectActivity.class));
    }

    private final void showLoading() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        LoadingDialog loadingDialog2 = null;
        if (loadingDialog != null) {
            if (!loadingDialog.isShowing()) {
                loadingDialog = null;
            }
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireContext());
        if (loadingDialogShowDialog != null) {
            loadingDialogShowDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            loadingDialog2 = loadingDialogShowDialog;
        }
        this.mLoadingDialog = loadingDialog2;
    }

    private final void t() {
        new AlertDialogFragment.Builder(requireContext()).setTitle(R.string.blood_pressure_device_status_error_title).setMessage(R.string.blood_pressure_device_status_error_summary).setNeutralButton(R.string.btn_ok, new DialogInterface.OnClickListener() { // from class: sv3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HealthDetectFragment.u(dialogInterface, i);
            }
        }).show(getChildFragmentManager(), "blood status error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(DialogInterface dialogInterface, int i) {
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_health_detect, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        p();
        if (g().isHealthDetect() || g().isHuamiOs()) {
            j();
        } else {
            m();
        }
    }
}
