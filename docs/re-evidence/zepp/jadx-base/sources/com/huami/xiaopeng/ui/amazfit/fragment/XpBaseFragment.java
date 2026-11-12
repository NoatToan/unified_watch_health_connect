package com.huami.xiaopeng.ui.amazfit.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.p010navigation.fragment.NavHostFragment;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.components.devicestatus.DeviceStatusFragment;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import com.huami.components.devicestatus.EnableChangeListener;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.toast.CustomToast;
import com.huami.xiaopeng.repo.di.XiaopengModuleKt;
import com.huami.xiaopeng.ui.amazfit.R;
import com.huami.xiaopeng.ui.amazfit.databinding.FragmentBaseXpBinding;
import com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment;
import com.huami.xiaopeng.ui.amazfit.utils.XpLifeCycleHelper;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H&J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\u0006\u0010!\u001a\u00020 J\u0010\u0010#\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0007R\u001d\u0010(\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001d\u00109\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/huami/xiaopeng/ui/amazfit/fragment/XpBaseFragment;", "Landroidx/fragment/app/Fragment;", "", "i", "c", "Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "deviceStatusString", "", "setViewId", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "findBindingView", "", "isActionBarOverLayer", "onDestroy", "showTitleBar", "showBleStatusBar", "showBleStatusMaskView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "initTitleBar", "initView", "initViewModel", "loadData", "onBackButtonClick", "Landroidx/navigation/NavController;", "getNavController", "stringRes", "toast", "a", "Lkotlin/Lazy;", "f", "()Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "deviceStatusStringProvider", "Landroidx/activity/OnBackPressedDispatcher;", "b", "g", "()Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "Landroidx/activity/OnBackPressedCallback;", "callback", "Landroidx/activity/OnBackPressedCallback;", "getCallback", "()Landroidx/activity/OnBackPressedCallback;", "setCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentBaseXpBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentBaseXpBinding;", "binding", "<init>", "()V", "xiaopeng-ui-amazfit_release"}, k = 1, mv = {1, 5, 1})
public abstract class XpBaseFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusStringProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy dispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;
    public OnBackPressedCallback callback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<OnBackPressedDispatcher> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OnBackPressedDispatcher invoke() {
            return XpBaseFragment.this.requireActivity().getOnBackPressedDispatcher();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            XpBaseFragment.this.onBackButtonClick();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(XpBaseFragment.class), "binding", "getBinding()Lcom/huami/xiaopeng/ui/amazfit/databinding/FragmentBaseXpBinding;"));
        d = kPropertyArr;
    }

    public XpBaseFragment() {
        final StringQualifier stringQualifierNamed = QualifierKt.named(XiaopengModuleKt.XP_DEVICE_PROVIDER);
        final Function0 function0 = null;
        this.deviceStatusStringProvider = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<DeviceStatusStringProvider>() { // from class: com.huami.xiaopeng.ui.amazfit.fragment.XpBaseFragment$special$$inlined$inject$default$1
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
        this.binding = FragmentViewBindingKt.viewBinding(new XpBaseFragment$special$$inlined$viewBinding$1(new InflateViewBinder(FragmentBaseXpBinding.class)));
    }

    private final void c() {
        DeviceStatusFragment deviceStatusFragment = new DeviceStatusFragment();
        deviceStatusFragment.setEnableChangeListener(new EnableChangeListener() { // from class: z09
            @Override // com.huami.components.devicestatus.EnableChangeListener
            public final void onEnableChange(boolean z) {
                XpBaseFragment.d(this.a, z);
            }
        });
        deviceStatusFragment.setStringProvider(deviceStatusString());
        View view = getView();
        if (view == null) {
            return;
        }
        int i = R.id.ble_status_container_xp;
        if (((FrameLayout) view.findViewById(i)) == null) {
            return;
        }
        requireActivity().getSupportFragmentManager().beginTransaction().replace(i, deviceStatusFragment, DeviceStatusFragment.class.getName()).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(XpBaseFragment xpBaseFragment, boolean z) {
        View viewFindViewById;
        View view = xpBaseFragment.getView();
        if (view == null || (viewFindViewById = view.findViewById(R.id.ble_status_mask_xp)) == null || !xpBaseFragment.showBleStatusMaskView()) {
            return;
        }
        viewFindViewById.setVisibility(z ? 8 : 0);
        viewFindViewById.setClickable(!z);
    }

    private final DeviceStatusStringProvider deviceStatusString() {
        return f();
    }

    private final FragmentBaseXpBinding e() {
        return (FragmentBaseXpBinding) this.binding.getValue(this, d[2]);
    }

    private final DeviceStatusStringProvider f() {
        return (DeviceStatusStringProvider) this.deviceStatusStringProvider.getValue();
    }

    private final OnBackPressedDispatcher g() {
        return (OnBackPressedDispatcher) this.dispatcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(XpBaseFragment xpBaseFragment, View view) {
        xpBaseFragment.onBackButtonClick();
    }

    private final void i() {
        List<Fragment> fragments;
        FragmentManager supportFragmentManager;
        List<Fragment> fragments2;
        FragmentManager supportFragmentManager2;
        FragmentActivity activity = getActivity();
        Fragment fragmentFindFragmentById = null;
        if (activity != null && (supportFragmentManager2 = activity.getSupportFragmentManager()) != null) {
            fragmentFindFragmentById = supportFragmentManager2.findFragmentById(R.id.nav_host_fragment_xp);
        }
        Objects.requireNonNull(fragmentFindFragmentById, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) fragmentFindFragmentById;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (supportFragmentManager = activity2.getSupportFragmentManager()) != null && (fragments2 = supportFragmentManager.getFragments()) != null) {
            int i = 0;
            for (Object obj : fragments2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                HMLog.i("printFragments", "---- fragment " + ((Fragment) obj) + " " + i + " -----", new Object[0]);
                i = i2;
            }
        }
        int i3 = 0;
        for (Object obj2 : navHostFragment.getChildFragmentManager().getFragments()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            HMLog.w("childFragmentManager ", "---- fragment " + ((Fragment) obj2) + " " + i3 + " -----", new Object[0]);
            i3 = i4;
        }
        FragmentManager fragmentManager = navHostFragment.getFragmentManager();
        if (fragmentManager == null || (fragments = fragmentManager.getFragments()) == null) {
            return;
        }
        int i5 = 0;
        for (Object obj3 : fragments) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            HMLog.e("fragmentManager ", "---- fragment " + ((Fragment) obj3) + " " + i5 + " -----", new Object[0]);
            i5 = i6;
        }
    }

    @NotNull
    public final View findBindingView() {
        return ViewGroupKt.get(e().baseContainerXp, 0);
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
        RainbowTitleBar rainbowTitleBar = e().titleBar;
        rainbowTitleBar.setVisibility(showTitleBar() ^ true ? 8 : 0);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: y09
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                XpBaseFragment.h(this.a, view);
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
        g().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HMLog.i(XpLifeCycleHelper.XP_LIFE_CYCLE_TAG, "进入 --> " + getClass().getSimpleName(), new Object[0]);
        setCallback(OnBackPressedDispatcherKt.addCallback$default(g(), this, false, new b(), 2, null));
        ConstraintLayout root = e().getRoot();
        e().baseContainerXp.addView(inflater.inflate(setViewId(), container, false));
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        HMLog.i(XpLifeCycleHelper.XP_LIFE_CYCLE_TAG, "完全销毁 --> " + getClass().getSimpleName(), new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (showBleStatusBar()) {
            c();
        } else {
            ((FrameLayout) view.findViewById(R.id.ble_status_container_xp)).setVisibility(8);
        }
        initView();
        initViewModel();
        loadData();
        i();
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
