package com.huami.jac.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.components.devicestatus.DeviceStatusFragment;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import com.huami.components.devicestatus.EnableChangeListener;
import com.huami.jac.repo.di.JacModuleKt;
import com.huami.jac.ui.amazfit.R;
import com.huami.jac.ui.amazfit.fragment.JacBaseFragment;
import com.huami.jac.ui.amazfit.utils.JacLifeCycleHelper;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H&J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0006\u0010\u001f\u001a\u00020\u001eJ\u0010\u0010!\u001a\u00020\u00022\b\b\u0001\u0010 \u001a\u00020\u0006R\u0016\u0010$\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010+\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/huami/jac/ui/amazfit/fragment/JacBaseFragment;", "Landroidx/fragment/app/Fragment;", "", "c", "Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "deviceStatusString", "", "setViewId", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "isActionBarOverLayer", "onDestroy", "showTitleBar", "showBleStatusBar", "showBleStatusMaskView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "initView", "initViewModel", "loadData", "onBackButtonClick", "Landroidx/navigation/NavController;", "getNavController", "stringRes", "toast", "a", "Z", "isFirstTimeCreateView", "b", "Landroid/view/View;", "cacheView", "Lkotlin/Lazy;", "e", "()Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "deviceStatusStringProvider", "Landroidx/activity/OnBackPressedDispatcher;", GoogleApiAvailabilityLight.a, "f", "()Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "Landroidx/activity/OnBackPressedCallback;", "callback", "Landroidx/activity/OnBackPressedCallback;", "getCallback", "()Landroidx/activity/OnBackPressedCallback;", "setCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "<init>", "()V", "jac-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public abstract class JacBaseFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isFirstTimeCreateView = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View cacheView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusStringProvider;
    public OnBackPressedCallback callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy dispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<OnBackPressedDispatcher> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OnBackPressedDispatcher invoke() {
            return JacBaseFragment.this.requireActivity().getOnBackPressedDispatcher();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            JacBaseFragment.this.onBackButtonClick();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    public JacBaseFragment() {
        final StringQualifier stringQualifierNamed = QualifierKt.named(JacModuleKt.JAC_DEVICE_PROVIDER);
        final Function0 function0 = null;
        this.deviceStatusStringProvider = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<DeviceStatusStringProvider>() { // from class: com.huami.jac.ui.amazfit.fragment.JacBaseFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.components.devicestatus.DeviceStatusStringProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceStatusStringProvider invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceStatusStringProvider.class), stringQualifierNamed, function0);
            }
        });
        this.dispatcher = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final void c() {
        DeviceStatusFragment deviceStatusFragment = new DeviceStatusFragment();
        deviceStatusFragment.setEnableChangeListener(new EnableChangeListener() { // from class: ph4
            @Override // com.huami.components.devicestatus.EnableChangeListener
            public final void onEnableChange(boolean z) {
                JacBaseFragment.d(this.a, z);
            }
        });
        deviceStatusFragment.setStringProvider(deviceStatusString());
        View view = getView();
        if (view == null) {
            return;
        }
        int i = R.id.ble_status_container_jac;
        if (((FrameLayout) view.findViewById(i)) == null) {
            return;
        }
        requireActivity().getSupportFragmentManager().beginTransaction().replace(i, deviceStatusFragment, DeviceStatusFragment.class.getName()).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JacBaseFragment jacBaseFragment, boolean z) {
        View viewFindViewById;
        View view = jacBaseFragment.getView();
        if (view == null || (viewFindViewById = view.findViewById(R.id.ble_status_mask_jac)) == null || !jacBaseFragment.showBleStatusMaskView()) {
            return;
        }
        viewFindViewById.setVisibility(z ? 8 : 0);
        viewFindViewById.setClickable(!z);
    }

    private final DeviceStatusStringProvider deviceStatusString() {
        return e();
    }

    private final DeviceStatusStringProvider e() {
        return (DeviceStatusStringProvider) this.deviceStatusStringProvider.getValue();
    }

    private final OnBackPressedDispatcher f() {
        return (OnBackPressedDispatcher) this.dispatcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(JacBaseFragment jacBaseFragment, View view) {
        jacBaseFragment.onBackButtonClick();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final OnBackPressedCallback getCallback() {
        OnBackPressedCallback onBackPressedCallback = this.callback;
        Objects.requireNonNull(onBackPressedCallback);
        return onBackPressedCallback;
    }

    @NotNull
    public final NavController getNavController() {
        return FragmentKt.findNavController(this);
    }

    @Nullable
    public RainbowTitleBar initTitleBar() {
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) requireView().findViewById(R.id.title_bar);
        if (rainbowTitleBar == null) {
            return null;
        }
        rainbowTitleBar.setVisibility(showTitleBar() ^ true ? 8 : 0);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: oh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JacBaseFragment.g(this.a, view);
            }
        });
        return rainbowTitleBar;
    }

    public void initView() {
    }

    public void initViewModel() {
    }

    public boolean isActionBarOverLayer() {
        return false;
    }

    public void loadData() {
    }

    public void onBackButtonClick() {
        getCallback().setEnabled(false);
        f().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HMLog.i(JacLifeCycleHelper.JAC_LIFE_CYCLE_TAG, "进入 --> " + getClass().getSimpleName(), new Object[0]);
        setCallback(OnBackPressedDispatcherKt.addCallback$default(f(), this, false, new b(), 2, null));
        View view = this.cacheView;
        if (view != null) {
            return view;
        }
        View viewInflate = inflater.inflate(R.layout.jac_fragment_base_jac, container, false);
        ((FrameLayout) viewInflate.findViewById(R.id.base_container_jac)).addView(inflater.inflate(setViewId(), container, false));
        this.cacheView = viewInflate;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.cacheView = null;
        HMLog.i(JacLifeCycleHelper.JAC_LIFE_CYCLE_TAG, "完全销毁 --> " + getClass().getSimpleName(), new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (this.isFirstTimeCreateView) {
            if (showBleStatusBar()) {
                c();
            } else {
                ((FrameLayout) view.findViewById(R.id.ble_status_container_jac)).setVisibility(8);
            }
            initView();
            this.isFirstTimeCreateView = false;
            initViewModel();
            loadData();
        }
        initTitleBar();
    }

    public final void setCallback(@NotNull OnBackPressedCallback onBackPressedCallback) {
        this.callback = onBackPressedCallback;
    }

    public abstract int setViewId();

    public boolean showBleStatusBar() {
        return true;
    }

    public boolean showBleStatusMaskView() {
        return true;
    }

    public boolean showTitleBar() {
        return true;
    }

    public final void toast(@StringRes int stringRes) {
        CustomToast.makeText(requireActivity(), getResources().getString(stringRes), 0).show();
    }
}
