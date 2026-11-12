package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.R;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.OffWistPasswordSettingActivity;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock.OffWistFragment;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$%B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001b\u001a\u00020\u00168\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010!\u001a\u00020\u001c8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/offwistlock/OffWistFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "initView", "initViewModel", "i", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "l", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/offwistlock/OffWistSettingViewModelNew;", "e", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/offwistlock/OffWistSettingViewModelNew;", "offWistSettingsViewModel", "", "f", LogUtil.I, "getContainerId", "()I", "containerId", "", "g", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "<init>", "()V", "Companion", "LifecycleComponent", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OffWistFragment extends BaseWatchSettingFragment implements KoinComponentAdapter {

    @NotNull
    private static final String h = "OffWistFragment";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private OffWistSettingViewModelNew offWistSettingsViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/offwistlock/OffWistFragment$LifecycleComponent;", "Landroidx/lifecycle/LifecycleObserver;", "", "onStart", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/offwistlock/OffWistFragment;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class LifecycleComponent implements LifecycleObserver {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onStart";
            }
        }

        public LifecycleComponent() {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            HMLog.info(OffWistFragment.h, a.a);
            OffWistSettingViewModelNew offWistSettingViewModelNew = OffWistFragment.this.offWistSettingsViewModel;
            Objects.requireNonNull(offWistSettingViewModelNew);
            offWistSettingViewModelNew.querySettings();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OffWistFragment() {
        super(R.layout.fragment_off_wist);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock.OffWistFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceCenter getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), qualifier, objArr);
            }
        });
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.mili_setting_off_wist_lock);
    }

    private final void i() {
        new AlertDialogFragment.Builder(requireActivity()).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: dj5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OffWistFragment.j(dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: cj5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OffWistFragment.k(this.a, dialogInterface, i);
            }
        }).setMessage(getString(R.string.mili_setting_off_wist_lock_close_tip)).setCancelable(false).show(getChildFragmentManager());
    }

    private final void initView() {
        int i;
        View view = getView();
        AppCompatImageView appCompatImageView = (AppCompatImageView) (view == null ? null : view.findViewById(R.id.watch_iv));
        if (HMDeviceConfig.isWatch()) {
            i = ConfigHelperKt.hasFeature(l().getDeviceSource(), Feature.ROUND_WATCH_S) ? R.drawable.watch_settings_round_watch : R.drawable.watch_settings_square_watch;
        } else {
            i = R.drawable.img_lock_from_wrist_mili_zeppos;
        }
        appCompatImageView.setImageResource(i);
        View view2 = getView();
        ((Toolbar) (view2 == null ? null : view2.findViewById(R.id.toolbar))).setBackgroundColor(0);
        View view3 = getView();
        ((ListTile) (view3 == null ? null : view3.findViewById(R.id.off_lock_item))).setOnClickListener(new View.OnClickListener() { // from class: ej5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                OffWistFragment.m(this.a, view4);
            }
        });
        View view4 = getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.off_lock_close_item))).setOnClickListener(new View.OnClickListener() { // from class: fj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                OffWistFragment.n(this.a, view5);
            }
        });
        View view5 = getView();
        ((ListTile) (view5 != null ? view5.findViewById(R.id.off_lock_modify_password_item) : null)).setOnClickListener(new View.OnClickListener() { // from class: gj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                OffWistFragment.o(this.a, view6);
            }
        });
    }

    private final void initViewModel() {
        OffWistSettingViewModelNew offWistSettingViewModelNew = (OffWistSettingViewModelNew) new ViewModelProvider(requireActivity()).get(OffWistSettingViewModelNew.class);
        this.offWistSettingsViewModel = offWistSettingViewModelNew;
        Objects.requireNonNull(offWistSettingViewModelNew);
        offWistSettingViewModelNew.getOffWistLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock.OffWistFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (Intrinsics.areEqual(((ScreenLockAndPassword) t).getSwitch(), Boolean.TRUE)) {
                    View view = this.a.getView();
                    ((ListTile) (view == null ? null : view.findViewById(R.id.off_lock_item))).setVisibility(8);
                    View view2 = this.a.getView();
                    ((ListTile) (view2 == null ? null : view2.findViewById(R.id.off_lock_close_item))).setVisibility(0);
                    View view3 = this.a.getView();
                    ((ListTile) (view3 != null ? view3.findViewById(R.id.off_lock_modify_password_item) : null)).setVisibility(0);
                    return;
                }
                View view4 = this.a.getView();
                ((ListTile) (view4 == null ? null : view4.findViewById(R.id.off_lock_item))).setVisibility(0);
                View view5 = this.a.getView();
                ((ListTile) (view5 == null ? null : view5.findViewById(R.id.off_lock_close_item))).setVisibility(8);
                View view6 = this.a.getView();
                ((ListTile) (view6 != null ? view6.findViewById(R.id.off_lock_modify_password_item) : null)).setVisibility(8);
            }
        });
        OffWistSettingViewModelNew offWistSettingViewModelNew2 = this.offWistSettingsViewModel;
        Objects.requireNonNull(offWistSettingViewModelNew2);
        offWistSettingViewModelNew2.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.offwistlock.OffWistFragment$initViewModel$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                LoadingHelper.responseToLoadingStatus$default(this.a.getLoadingHelper(), this.a.getActivity(), (LoadingVo) t, null, null, 12, null);
            }
        });
        OffWistSettingViewModelNew offWistSettingViewModelNew3 = this.offWistSettingsViewModel;
        Objects.requireNonNull(offWistSettingViewModelNew3);
        HashMap<SettingsGroupType, Settings> watchSettings = ((WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class)).getWatchSettings();
        Settings settings = watchSettings == null ? null : watchSettings.get(SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD);
        offWistSettingViewModelNew3.setSettings(settings instanceof ScreenLockAndPassword ? (ScreenLockAndPassword) settings : null);
        getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleComponent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(OffWistFragment offWistFragment, DialogInterface dialogInterface, int i) {
        OffWistSettingViewModelNew offWistSettingViewModelNew = offWistFragment.offWistSettingsViewModel;
        Objects.requireNonNull(offWistSettingViewModelNew);
        offWistSettingViewModelNew.closePassword();
    }

    private final DeviceCenter l() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(OffWistFragment offWistFragment, View view) {
        OffWistPasswordSettingActivity.INSTANCE.launch(offWistFragment.requireActivity(), true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(OffWistFragment offWistFragment, View view) {
        offWistFragment.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(OffWistFragment offWistFragment, View view) {
        OffWistPasswordSettingActivity.INSTANCE.launch(offWistFragment.requireActivity(), false, true);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public int getContainerId() {
        return this.containerId;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    @NotNull
    public String getTitleRes() {
        return this.titleRes;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initViewModel();
    }
}
