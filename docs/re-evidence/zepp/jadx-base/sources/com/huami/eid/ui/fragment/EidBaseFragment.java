package com.huami.eid.ui.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.NavHostFragment;
import com.alipay.sdk.m.x.d;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.components.devicestatus.DeviceStatusFragment;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import com.huami.components.devicestatus.EnableChangeListener;
import com.huami.eid.ui.R;
import com.huami.eid.ui.activity.OnBackPressed;
import com.huami.eid.ui.fragment.EidBaseFragment;
import com.huami.widget.actionbarview.view.ActionBarView;
import com.huami.widget.actionbarview.view.ActionBarViewKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J \u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bJ \u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bJ\b\u0010\u0010\u001a\u00020\u000fH&J&\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\u001a\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u0004\u0018\u00010#R\u001d\u0010)\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010*¨\u0006."}, d2 = {"Lcom/huami/eid/ui/fragment/EidBaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/eid/ui/activity/OnBackPressed;", "", "e", "b", "", "message", d.o, "Landroid/view/View;", "endView", "Lkotlin/Function0;", "onViewClick", "setEndView", "setCenterView", "", "setViewId", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "deviceStatusString", "", "showActionBar", "showBleStatusBar", "showBleStatusMaskView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "initView", "onBackButtonClick", "onBackPressed", "Landroidx/navigation/NavController;", "getNavController", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "deviceStatusStringProvider", "Landroidx/navigation/NavController;", "navController", "<init>", "()V", "eid_release"}, k = 1, mv = {1, 5, 1})
public abstract class EidBaseFragment extends Fragment implements OnBackPressed {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusStringProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private NavController navController;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            EidBaseFragment.this.onBackButtonClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EidBaseFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceStatusStringProvider = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceStatusStringProvider>() { // from class: com.huami.eid.ui.fragment.EidBaseFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.components.devicestatus.DeviceStatusStringProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceStatusStringProvider invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceStatusStringProvider.class), qualifier, objArr);
            }
        });
    }

    private final void b() {
        DeviceStatusFragment deviceStatusFragment = new DeviceStatusFragment();
        deviceStatusFragment.setEnableChangeListener(new EnableChangeListener() { // from class: ck1
            @Override // com.huami.components.devicestatus.EnableChangeListener
            public final void onEnableChange(boolean z) {
                EidBaseFragment.c(this.a, z);
            }
        });
        deviceStatusFragment.setStringProvider(deviceStatusString());
        View viewRequireView = requireView();
        int i = R.id.ble_status_container;
        if (((FrameLayout) viewRequireView.findViewById(i)) == null) {
            return;
        }
        requireActivity().getSupportFragmentManager().beginTransaction().replace(i, deviceStatusFragment, DeviceStatusFragment.class.getName()).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(EidBaseFragment eidBaseFragment, boolean z) {
        View viewFindViewById = eidBaseFragment.requireView().findViewById(R.id.ble_status_mask);
        if (viewFindViewById != null && eidBaseFragment.showBleStatusMaskView()) {
            viewFindViewById.setVisibility(z ? 8 : 0);
            viewFindViewById.setClickable(!z);
        }
    }

    private final DeviceStatusStringProvider d() {
        return (DeviceStatusStringProvider) this.deviceStatusStringProvider.getValue();
    }

    private final void e() {
        NavHostFragment navHostFragment = (NavHostFragment) requireActivity().getSupportFragmentManager().findFragmentById(R.id.my_nav_host_fragment);
        if (navHostFragment == null) {
            return;
        }
        this.navController = navHostFragment.getNavController();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCenterView$default(EidBaseFragment eidBaseFragment, View view, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCenterView");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        eidBaseFragment.setCenterView(view, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setEndView$default(EidBaseFragment eidBaseFragment, View view, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEndView");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        eidBaseFragment.setEndView(view, function0);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public DeviceStatusStringProvider deviceStatusString() {
        return d();
    }

    @Nullable
    public final NavController getNavController() {
        return this.navController;
    }

    public void initView() {
        ActionBarView actionBarView = (ActionBarView) requireView().findViewById(R.id.abv_default);
        if (actionBarView != null) {
            ActionBarViewKt.setSystemStatus(actionBarView, requireActivity(), R.color.pale_grey, false);
            if (showActionBar()) {
                ActionBarViewKt.addBackImageButton(actionBarView, ActionBarViewKt.getActionBarBackImageButton$default(requireContext(), R.drawable.eid_action_bar_arrow, 0, 4, null), new a());
            } else {
                actionBarView.setVisibility(8);
            }
        }
        if (showBleStatusBar()) {
            b();
        }
    }

    public void onBackButtonClick() {
        NavController navController = this.navController;
        if (navController == null) {
            return;
        }
        if ((navController == null ? null : Boolean.valueOf(navController.popBackStack())).booleanValue()) {
            return;
        }
        requireActivity().finish();
    }

    @Override // com.huami.eid.ui.activity.OnBackPressed
    public void onBackPressed() {
        onBackButtonClick();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_eid_base, container, false);
        ((FrameLayout) viewInflate.findViewById(R.id.base_container)).addView(inflater.inflate(setViewId(), container, false));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        e();
        initView();
    }

    public final void setCenterView(@NotNull View endView, @Nullable Function0<Unit> onViewClick) {
        ActionBarView actionBarView = (ActionBarView) requireView().findViewById(R.id.abv_default);
        if (actionBarView == null) {
            return;
        }
        ActionBarViewKt.addCenterView$default(actionBarView, 0, 0, endView, onViewClick, 3, null);
    }

    public final void setEndView(@NotNull View endView, @Nullable Function0<Unit> onViewClick) {
        ActionBarView actionBarView = (ActionBarView) requireView().findViewById(R.id.abv_default);
        if (actionBarView == null) {
            return;
        }
        ActionBarViewKt.addEndView$default(actionBarView, 0, 0, endView, onViewClick, 3, null);
    }

    public final void setTitle(@NotNull String message) {
        ActionBarView actionBarView = (ActionBarView) requireView().findViewById(R.id.abv_default);
        if (actionBarView == null) {
            return;
        }
        ActionBarViewKt.addTitleView$default(actionBarView, 0, 0, message, null, null, 27, null);
    }

    public abstract int setViewId();

    public boolean showActionBar() {
        return true;
    }

    public boolean showBleStatusBar() {
        return true;
    }

    public boolean showBleStatusMaskView() {
        return true;
    }
}
