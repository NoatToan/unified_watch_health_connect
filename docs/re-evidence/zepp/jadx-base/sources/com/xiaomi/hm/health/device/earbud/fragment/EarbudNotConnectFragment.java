package com.xiaomi.hm.health.device.earbud.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudNotConnectFragment;
import com.xiaomi.hm.health.device.earbud.view.EarbudImageView;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel;
import com.xiaomi.hm.health.device.view.HMLoadingView;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import de.greenrobot.event.EventBus;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001d\u0010*\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudNotConnectFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "h", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "startLoading", "stopLoading", "setBleView", "Lcom/xiaomi/hm/health/eventbus/EventBluetooth;", "event", "onEvent", "onDestroy", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStart", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "b", "Lkotlin/Lazy;", "f", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "mViewModel", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", GoogleApiAvailabilityLight.a, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "e", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudNotConnectFragment extends Fragment implements KoinComponent {
    private static final int e = 8193;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isStart = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EarbudMusicViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudNotConnectFragment$special$$inlined$activityViewModels$default$1
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudNotConnectFragment$special$$inlined$activityViewModels$default$2
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
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudNotConnectFragment() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudNotConnectFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudNotConnectFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
    }

    private final DeviceManagerApi d() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi e() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final EarbudMusicViewModel f() {
        return (EarbudMusicViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EarbudNotConnectFragment earbudNotConnectFragment, View view) {
        if (earbudNotConnectFragment.d().isBluetoothSupportAndDisable()) {
            earbudNotConnectFragment.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), e);
        }
    }

    private final void h() {
        f().getDeviceData().observe(getViewLifecycleOwner(), new Observer() { // from class: gf1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudNotConnectFragment.i(this.a, (HmEarbudDevice) obj);
            }
        });
        f().getShowUpdateRedDot().observe(getViewLifecycleOwner(), new Observer() { // from class: hf1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudNotConnectFragment.j(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EarbudNotConnectFragment earbudNotConnectFragment, HmEarbudDevice hmEarbudDevice) {
        earbudNotConnectFragment.setBleView();
        if (hmEarbudDevice == null) {
            return;
        }
        if (hmEarbudDevice.isAllConnected()) {
            View view = earbudNotConnectFragment.getView();
            ((EarbudImageView) (view == null ? null : view.findViewById(R.id.earbud_device_img))).setLeftConnect(true);
            View view2 = earbudNotConnectFragment.getView();
            ((EarbudImageView) (view2 == null ? null : view2.findViewById(R.id.earbud_device_img))).setRightConnect(true);
        }
        if (!hmEarbudDevice.isConnected() && !hmEarbudDevice.getRightDevice().isConnected()) {
            View view3 = earbudNotConnectFragment.getView();
            ((TextView) (view3 == null ? null : view3.findViewById(R.id.dis_title))).setText(earbudNotConnectFragment.getString(R.string.connect_earbud, earbudNotConnectFragment.e().getEarbudDeviceDescription()));
            View view4 = earbudNotConnectFragment.getView();
            ((TextView) (view4 == null ? null : view4.findViewById(R.id.dis_msg))).setText(R.string.bind_earbud_tip);
            View view5 = earbudNotConnectFragment.getView();
            ((EarbudImageView) (view5 == null ? null : view5.findViewById(R.id.earbud_device_img))).setLeftConnect(false);
            View view6 = earbudNotConnectFragment.getView();
            ((EarbudImageView) (view6 != null ? view6.findViewById(R.id.earbud_device_img) : null)).setRightConnect(false);
            return;
        }
        if (hmEarbudDevice.isConnected()) {
            View view7 = earbudNotConnectFragment.getView();
            ((TextView) (view7 == null ? null : view7.findViewById(R.id.dis_title))).setText(R.string.bind_earbud_search_right);
            View view8 = earbudNotConnectFragment.getView();
            ((TextView) (view8 == null ? null : view8.findViewById(R.id.dis_msg))).setText(R.string.bind_earbud_no_device_tip);
            View view9 = earbudNotConnectFragment.getView();
            ((EarbudImageView) (view9 == null ? null : view9.findViewById(R.id.earbud_device_img))).setLeftConnect(true);
            View view10 = earbudNotConnectFragment.getView();
            ((EarbudImageView) (view10 != null ? view10.findViewById(R.id.earbud_device_img) : null)).setRightConnect(false);
            return;
        }
        View view11 = earbudNotConnectFragment.getView();
        ((TextView) (view11 == null ? null : view11.findViewById(R.id.dis_title))).setText(R.string.bind_earbud_search_left);
        View view12 = earbudNotConnectFragment.getView();
        ((TextView) (view12 == null ? null : view12.findViewById(R.id.dis_msg))).setText(R.string.bind_earbud_no_device_tip);
        View view13 = earbudNotConnectFragment.getView();
        ((EarbudImageView) (view13 == null ? null : view13.findViewById(R.id.earbud_device_img))).setLeftConnect(false);
        View view14 = earbudNotConnectFragment.getView();
        ((EarbudImageView) (view14 != null ? view14.findViewById(R.id.earbud_device_img) : null)).setRightConnect(true);
    }

    private final void initView() {
        View view = getView();
        ViewGroup.LayoutParams layoutParams = ((RelativeLayout) (view == null ? null : view.findViewById(R.id.title_content))).getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = BaseTitleActivity.getStatusBarHeight(requireContext());
        View view2 = getView();
        ((RelativeLayout) (view2 == null ? null : view2.findViewById(R.id.title_content))).setLayoutParams(layoutParams2);
        setBleView();
        if (GlobalConfig.get().isBuildMidong()) {
            int color = ContextCompat.getColor(requireContext(), R.color.midong_progress_color);
            View view3 = getView();
            ((HMLoadingView) (view3 == null ? null : view3.findViewById(R.id.loading_view))).setStartColor(color);
            View view4 = getView();
            ((HMLoadingView) (view4 == null ? null : view4.findViewById(R.id.loading_view))).setProgressColor(color);
            View view5 = getView();
            ((HMLoadingView) (view5 == null ? null : view5.findViewById(R.id.loading_view))).setEndColor(ContextCompat.getColor(requireContext(), R.color.trans));
        }
        View view6 = getView();
        ((HMLoadingView) (view6 == null ? null : view6.findViewById(R.id.loading_view))).startLoading();
        this.isStart.set(true);
        View view7 = getView();
        ((TextView) (view7 != null ? view7.findViewById(R.id.open_ble) : null)).setOnClickListener(new View.OnClickListener() { // from class: ff1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                EarbudNotConnectFragment.g(this.a, view8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(EarbudNotConnectFragment earbudNotConnectFragment, Boolean bool) {
        View view = earbudNotConnectFragment.getView();
        ((ImageView) (view == null ? null : view.findViewById(R.id.update_red_dot))).setVisibility(Intrinsics.areEqual(bool, Boolean.TRUE) ? 0 : 8);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_earbud_not_connect, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull EventBluetooth event) {
        setBleView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        h();
    }

    public final void setBleView() {
        View view = getView();
        ((LinearLayout) (view == null ? null : view.findViewById(R.id.no_ble))).setVisibility(d().isBluetoothEnable() ? 8 : 0);
    }

    public final void startLoading() {
        if (this.isStart.get()) {
            return;
        }
        View view = getView();
        ((HMLoadingView) (view == null ? null : view.findViewById(R.id.loading_view))).startLoading();
        this.isStart.set(true);
    }

    public final void stopLoading() {
        if (this.isStart.get()) {
            View view = getView();
            ((HMLoadingView) (view == null ? null : view.findViewById(R.id.loading_view))).stopLoading();
            this.isStart.set(false);
        }
    }
}
