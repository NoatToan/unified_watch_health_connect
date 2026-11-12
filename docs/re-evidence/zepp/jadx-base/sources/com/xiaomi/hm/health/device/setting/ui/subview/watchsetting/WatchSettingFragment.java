package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v1.DisplayAndBrightnessV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v1.SettingsLanguageV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v1.OfflineVoiceV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v2.OfflineVoiceV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v1.SoundAndVibrateV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2.SoundAndVibrateV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.WearingWay;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2.WearingWayV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.OffWistConfig;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment.c;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.DeviceLanguageRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationFragment;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.language.DeviceLanguage;
import com.xiaomi.hm.health.ui.language.DeviceLanguageConfig;
import com.xiaomi.hm.health.ui.language.DeviceLanguageSettingActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0002cdB\u0007¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\u0012\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u0012\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0002J&\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010&\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010'\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\"\u0010-\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010+H\u0016R\u001e\u00102\u001a\n /*\u0004\u0018\u00010.0.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001d\u0010P\u001a\u00020K8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001d\u0010U\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010TR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020Q0Z8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010MR\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "Landroid/view/View;", "rootView", "", "initView", DTransferConstants.SEARCH_KEY, "E", "o", "r", LogUtil.I, "J", "H", "M", ViewHierarchyConstants.VIEW_KEY, "", "type", "K", LogUtil.D, "O", "L", "F", "G", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPassword;", "screenLockAndPassword", "Q", "N", "screenLock", "R", "P", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "onActivityCreated", "onDetach", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingViewModel;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingViewModel;", "watchSettingViewModel", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mDeviceSource", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "e", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "f", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "miliDevice", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "g", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "fragment", "Lcom/huami/devicex/manager/DeviceManagerApi;", "h", "Lkotlin/Lazy;", "m", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "i", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingHelper;", z.j, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingHelper;", "loadingHelper", "Lkotlin/Lazy;", hl.k, "deviceXNavigatorLazy", "Lcom/huami/lib/rainbow/ListTile;", "l", "Lcom/huami/lib/rainbow/ListTile;", "nightModeLt", "<init>", "()V", "Companion", "LifecycleComponent", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSettingFragment extends Fragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int REQUEST_SCREEN_LOCK_PASSWORD = 16;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = WatchSettingFragment.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private WatchSettingViewModel watchSettingViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private HMDeviceType deviceType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private HMDeviceSource mDeviceSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private HMBaseDevice miliDevice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private BTStatusFragment fragment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private LoadingHelper loadingHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy<DeviceXNavigator> deviceXNavigatorLazy;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private ListTile nightModeLt;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingFragment$Companion;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingFragment;", "newInstance", "", "REQUEST_SCREEN_LOCK_PASSWORD", LogUtil.I, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final WatchSettingFragment newInstance() {
            WatchSettingFragment watchSettingFragment = new WatchSettingFragment();
            watchSettingFragment.setArguments(new Bundle());
            return watchSettingFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingFragment$LifecycleComponent;", "Landroidx/lifecycle/LifecycleObserver;", "", "onStart", "onResume", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/WatchSettingFragment;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            WatchSettingFragment.this.P();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            HMLog.info(WatchSettingFragment.this.TAG, a.a);
            WatchSettingFragment watchSettingFragment = WatchSettingFragment.this;
            WatchSettingViewModel watchSettingViewModel = watchSettingFragment.watchSettingViewModel;
            Objects.requireNonNull(watchSettingViewModel);
            HashMap<SettingsGroupType, Settings> watchSettings = watchSettingViewModel.getWatchSettings();
            Settings settings = watchSettings == null ? null : watchSettings.get(SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD);
            watchSettingFragment.R(settings instanceof ScreenLockAndPassword ? (ScreenLockAndPassword) settings : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_sportSettingFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "activity was finished!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((DeviceXNavigator) WatchSettingFragment.this.deviceXNavigatorLazy.getValue()).startNightModeActivity(WatchSettingFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<View, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_gesture_setting);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<View, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_gesture_setting);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onDetach";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<View, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            NavController navControllerFindNavController = FragmentKt.findNavController(WatchSettingFragment.this);
            int i = R.id.action_to_appSortFragment;
            Bundle bundle = new Bundle();
            bundle.putInt("type", 0);
            Unit unit = Unit.INSTANCE;
            navControllerFindNavController.navigate(i, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<View, Unit> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).popBackStack();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<View, Unit> {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_offlineVoiceWakeUpFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<View, Unit> {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            WatchSettingViewModel watchSettingViewModel = WatchSettingFragment.this.watchSettingViewModel;
            Objects.requireNonNull(watchSettingViewModel);
            if (watchSettingViewModel.get_wearingWay() instanceof WearingWayV2) {
                WatchSettingFragment.this.o();
                return;
            }
            NavController navControllerFindNavController = FragmentKt.findNavController(WatchSettingFragment.this);
            int i = R.id.action_to_wearModeFragment;
            Bundle bundle = new Bundle();
            HMDeviceType hMDeviceType = WatchSettingFragment.this.deviceType;
            Objects.requireNonNull(hMDeviceType);
            bundle.putSerializable("device_type", hMDeviceType);
            Unit unit = Unit.INSTANCE;
            navControllerFindNavController.navigate(i, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<View, Unit> {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_offWistFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<View, Unit> {
        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            NavController navControllerFindNavController = FragmentKt.findNavController(WatchSettingFragment.this);
            int i = R.id.action_to_appSortFragment;
            Bundle bundle = new Bundle();
            bundle.putInt("type", 2);
            Unit unit = Unit.INSTANCE;
            navControllerFindNavController.navigate(i, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<View, Unit> {
        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            WatchSettingViewModel watchSettingViewModel = WatchSettingFragment.this.watchSettingViewModel;
            Objects.requireNonNull(watchSettingViewModel);
            DisplayAndBrightness displayBrightness = watchSettingViewModel.getDisplayBrightness();
            if (displayBrightness instanceof DisplayAndBrightnessV1) {
                FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_displayBrightnessFragment);
            } else if (displayBrightness instanceof DisplayAndBrightnessV2) {
                FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_displayBrightnessV2Fragment);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<View, Unit> {
        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_DndModeFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<View, Unit> {
        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            ((DeviceXNavigator) WatchSettingFragment.this.deviceXNavigatorLazy.getValue()).startDeviceLanguageSettingActivity(WatchSettingFragment.this.requireContext(), HMDeviceType.MILI);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(1);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            NavController navControllerFindNavController = FragmentKt.findNavController(WatchSettingFragment.this);
            int i = R.id.action_to_commonLanguageSettingFragment;
            Bundle bundle = new Bundle();
            String str = this.b;
            bundle.putSerializable(CommonLanguageSettingFragment.KEY_REPO, DeviceLanguageRepo.class);
            bundle.putString("title", str);
            Unit unit = Unit.INSTANCE;
            navControllerFindNavController.navigate(i, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<View, Unit> {
        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_offlineVoiceWakeUpFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<View, Unit> {
        public r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_offlineVoiceMainFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(int i) {
            super(1);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            NavController navControllerFindNavController = FragmentKt.findNavController(WatchSettingFragment.this);
            int i = R.id.action_to_quickStartFragment;
            Bundle bundle = new Bundle();
            bundle.putInt("type", this.b);
            Unit unit = Unit.INSTANCE;
            navControllerFindNavController.navigate(i, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function1<View, Unit> {
        public t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            NavController navControllerFindNavController = FragmentKt.findNavController(WatchSettingFragment.this);
            int i = R.id.action_to_appSortFragment;
            Bundle bundle = new Bundle();
            bundle.putInt("type", 1);
            Unit unit = Unit.INSTANCE;
            navControllerFindNavController.navigate(i, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function1<View, Unit> {
        public u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_SleepModeFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function1<View, Unit> {
        public v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HMDeviceSource hMDeviceSource = WatchSettingFragment.this.mDeviceSource;
            Objects.requireNonNull(hMDeviceSource);
            if (!HMDeviceConfig.isWatch(hMDeviceSource)) {
                Context context = WatchSettingFragment.this.getContext();
                if (context == null) {
                    return;
                }
                WatchSettingFragment.this.n().startVibrateTypeActivity(context);
                return;
            }
            WatchSettingViewModel watchSettingViewModel = WatchSettingFragment.this.watchSettingViewModel;
            Objects.requireNonNull(watchSettingViewModel);
            SoundAndVibrate soundAndVibrate = watchSettingViewModel.get_soundAndVibrate();
            if (soundAndVibrate instanceof SoundAndVibrateV1) {
                FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_soundVibrationFragment);
            } else if (soundAndVibrate instanceof SoundAndVibrateV2) {
                FragmentKt.findNavController(WatchSettingFragment.this).navigate(R.id.action_to_soundVibrationFragmentV2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function1<View, Unit> {
        public w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            NavController navControllerFindNavController = FragmentKt.findNavController(WatchSettingFragment.this);
            int i = R.id.action_to_appSortFragment;
            Bundle bundle = new Bundle();
            bundle.putInt("type", 1);
            Unit unit = Unit.INSTANCE;
            navControllerFindNavController.navigate(i, bundle);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "language:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchSettingFragment() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$special$$inlined$inject$default$1
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
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceXNavigatorLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr4, objArr5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(WatchSettingFragment watchSettingFragment, Boolean bool) {
        View view = watchSettingFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.device_setting_offline_voice_wakeup_method))).setVisibility(bool.booleanValue() ? 0 : 8);
        if (bool.booleanValue()) {
            watchSettingFragment.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(WatchSettingFragment watchSettingFragment, Boolean bool) {
        View view = watchSettingFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.device_language))).setVisibility(bool.booleanValue() ? 0 : 8);
        if (bool.booleanValue()) {
            watchSettingFragment.P();
            watchSettingFragment.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(WatchSettingFragment watchSettingFragment, Boolean bool) {
        View view = watchSettingFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.device_gesture))).setVisibility(bool.booleanValue() ? 0 : 8);
        View view2 = watchSettingFragment.getView();
        ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.device_gesture) : null, 0L, watchSettingFragment.new d(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.ds_app_sort), 0L, new g(), 1, null);
    }

    private final void E() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new h(), 1, null);
        View view2 = getView();
        ExtKt.smartClick$default(view2 == null ? null : view2.findViewById(R.id.device_setting_offline_voice_wakeup_method), 0L, new i(), 1, null);
        View view3 = getView();
        ExtKt.smartClick$default(view3 == null ? null : view3.findViewById(R.id.ds_wearing_method), 0L, new j(), 1, null);
        View view4 = getView();
        ExtKt.smartClick$default(view4 != null ? view4.findViewById(R.id.ds_offWist_setting) : null, 0L, new k(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.ds_control_center_edit), 0L, new l(), 1, null);
    }

    private final void G() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.item_display_brightness), 0L, new m(), 1, null);
    }

    private final void H() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.device_setting_dnd), 0L, new n(), 1, null);
    }

    private final void I() {
        WatchSettingViewModel watchSettingViewModel = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel);
        SettingsLanguage settingsLanguage = watchSettingViewModel.get_settingsLanguage();
        if (settingsLanguage instanceof SettingsLanguageV1) {
            View view = getView();
            ExtKt.smartClick$default(view != null ? view.findViewById(R.id.device_language) : null, 0L, new o(), 1, null);
        } else if (settingsLanguage instanceof SettingsLanguageV2) {
            HMDeviceSource hMDeviceSource = this.mDeviceSource;
            Objects.requireNonNull(hMDeviceSource);
            String string = HMDeviceConfig.isWatch(hMDeviceSource) ? getString(R.string.watch_language_settting) : getString(R.string.watch_language_wristband);
            View view2 = getView();
            ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.device_language) : null, 0L, new p(string), 1, null);
        }
    }

    private final void J() {
        WatchSettingViewModel watchSettingViewModel = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel);
        OfflineVoice offlineVoice = watchSettingViewModel.get_offlineVoice();
        if (offlineVoice instanceof OfflineVoiceV1) {
            View view = getView();
            ((ListTile) (view == null ? null : view.findViewById(R.id.device_setting_offline_voice_wakeup_method))).setTitle(R.string.ds_offline_voice_wakeup_method);
            View view2 = getView();
            ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.device_setting_offline_voice_wakeup_method) : null, 0L, new q(), 1, null);
            return;
        }
        if (offlineVoice instanceof OfflineVoiceV2) {
            View view3 = getView();
            ((ListTile) (view3 == null ? null : view3.findViewById(R.id.device_setting_offline_voice_wakeup_method))).setTitle(R.string.ds_sound_offline_voice_control);
            View view4 = getView();
            ExtKt.smartClick$default(view4 != null ? view4.findViewById(R.id.device_setting_offline_voice_wakeup_method) : null, 0L, new r(), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(View view, int type) {
        ExtKt.smartClick$default(view, 0L, new s(type), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.ds_screen_edit), 0L, new t(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.device_setting_sleep_mode), 0L, new u(), 1, null);
    }

    private final void N() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.device_setting_sound_vibration), 0L, new v(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.ds_short_cut), 0L, new w(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        int languageStringResId;
        DeviceInfo deviceInfo;
        HMOtherVersion otherVersion;
        HMLanguage language;
        if (GlobalConfig.get().isBuildMidong()) {
            return;
        }
        try {
            View view = getView();
            Integer numValueOf = null;
            View viewFindViewById = view == null ? null : view.findViewById(R.id.device_language);
            if (!(((ListTile) viewFindViewById).getVisibility() == 0)) {
                viewFindViewById = null;
            }
            ListTile listTile = (ListTile) viewFindViewById;
            if (listTile == null) {
                return;
            }
            DeviceLanguageConfig deviceLanguageConfig = DeviceLanguageConfig.INSTANCE;
            HMDeviceSource hMDeviceSource = this.mDeviceSource;
            if (hMDeviceSource == null) {
                throw null;
            }
            DeviceLanguage deviceLanguage = deviceLanguageConfig.getDeviceLanguage(hMDeviceSource.getValue());
            Integer numValueOf2 = deviceLanguage == null ? null : Integer.valueOf(deviceLanguage.getDeviceLanguage());
            if (numValueOf2 == null) {
                HMBaseDevice hMBaseDevice = this.miliDevice;
                if (hMBaseDevice != null && (deviceInfo = hMBaseDevice.getDeviceInfo()) != null && (otherVersion = deviceInfo.getOtherVersion()) != null && (language = otherVersion.getLanguage()) != null) {
                    numValueOf = Integer.valueOf(language.getLanguage());
                }
                numValueOf2 = numValueOf;
            }
            HMLog.info(this.TAG, new x(numValueOf2));
            if (numValueOf2 == null) {
                languageStringResId = R.string.unknown;
            } else {
                languageStringResId = numValueOf2.intValue() == -1 ? R.string.devices_is_follow_mobile_phone_system : DeviceLanguageSettingActivity.INSTANCE.getLanguageStringResId(KoinExtKt.getAppContext(), HmLocale.getLocale(numValueOf2.intValue()));
            }
            listTile.setTips(getString(languageStringResId));
        } catch (Throwable th) {
            HMLog.error$default(this.TAG, null, null, new y(th), 6, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    private final void Q(ScreenLockAndPassword screenLockAndPassword) {
        boolean z;
        StringData password;
        String stringData;
        OffWistConfig.Companion companion = OffWistConfig.INSTANCE;
        OffWistConfig offWistConfig = companion.offWistConfig();
        HMBaseDevice miliDevice = m().getMiliDevice();
        HMMiLiProDevice hMMiLiProDevice = miliDevice instanceof HMMiLiProDevice ? (HMMiLiProDevice) miliDevice : null;
        boolean zIsHuamiOs = hMMiLiProDevice == null ? false : hMMiLiProDevice.isHuamiOs();
        if (screenLockAndPassword != null) {
            if (zIsHuamiOs) {
                z = false;
            } else {
                if (Intrinsics.areEqual(Boolean.valueOf(offWistConfig.getEnabled()), screenLockAndPassword.getSwitch()) || screenLockAndPassword.getSwitch() == null) {
                    String password2 = offWistConfig.getPassword();
                    StringData password3 = screenLockAndPassword.getPassword();
                    if (Intrinsics.areEqual(password2, password3 == null ? null : password3.getStringData())) {
                        z = false;
                    }
                }
                z = true;
            }
            ScreenLockAndPassword screenLockAndPassword2 = z ? screenLockAndPassword : null;
            if (screenLockAndPassword2 != null) {
                Boolean bool = screenLockAndPassword2.getSwitch();
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                String str = "";
                if (Intrinsics.areEqual(screenLockAndPassword2.getSwitch(), Boolean.TRUE) && (password = screenLockAndPassword2.getPassword()) != null && (stringData = password.getStringData()) != null) {
                    str = stringData;
                }
                companion.saveOffWistConfig(new OffWistConfig(zBooleanValue, str));
            }
        }
        Boolean bool2 = screenLockAndPassword == null ? null : screenLockAndPassword.getSwitch();
        if (bool2 == null ? offWistConfig.getEnabled() : bool2.booleanValue()) {
            View view = getView();
            ((ListTile) (view != null ? view.findViewById(R.id.ds_offWist_setting) : null)).setTips(R.string.alert_enable);
        } else {
            View view2 = getView();
            ((ListTile) (view2 != null ? view2.findViewById(R.id.ds_offWist_setting) : null)).setTips(R.string.alert_disable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(ScreenLockAndPassword screenLock) {
        View view = getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.ds_offWist_setting))).setVisibility(screenLock != null ? 0 : 8);
        Q(screenLock);
    }

    private final void initView(View rootView) {
        this.nightModeLt = (ListTile) rootView.findViewById(R.id.night_mode);
    }

    private final DeviceManagerApi m() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceXNavigator n() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    @JvmStatic
    @NotNull
    public static final WatchSettingFragment newInstance() {
        return INSTANCE.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        String string;
        WatchSettingViewModel watchSettingViewModel = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel);
        WearingWay wearingWay = watchSettingViewModel.get_wearingWay();
        WearingWayV2 wearingWayV2 = wearingWay instanceof WearingWayV2 ? (WearingWayV2) wearingWay : null;
        if (wearingWayV2 == null) {
            return;
        }
        EnumData wearingDirection = wearingWayV2.getWearingDirection();
        ArrayList<Integer> enums = wearingDirection == null ? null : wearingDirection.getEnums();
        if (enums == null) {
            return;
        }
        EnumData wearingDirection2 = wearingWayV2.getWearingDirection();
        Integer numValueOf = wearingDirection2 == null ? null : Integer.valueOf(wearingDirection2.index());
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enums, 10));
        Iterator<T> it2 = enums.iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((Number) it2.next()).intValue();
            if (iIntValue2 != 0) {
                string = iIntValue2 != 1 ? "unknown" : getString(R.string.ds_wear_direction_right);
            } else {
                string = getString(R.string.ds_wear_direction_left);
            }
            arrayList.add(string);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        new AlertDialogFragment.Builder(requireContext()).setTitle(R.string.ds_wear_direction).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems((String[]) array).setItemChoice(iIntValue), new DialogInterface.OnClickListener() { // from class: sg8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                WatchSettingFragment.p(this.a, dialogInterface, i2);
            }
        }).setCancelable(true).show(requireActivity().getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WatchSettingFragment watchSettingFragment, DialogInterface dialogInterface, int i2) {
        WatchSettingViewModel watchSettingViewModel = watchSettingFragment.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel);
        watchSettingViewModel.setWearingDirection(i2);
        dialogInterface.dismiss();
    }

    private final void q() {
        if (this.fragment == null) {
            BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getChildFragmentManager());
            this.fragment = bTStatusFragmentNewInstance;
            if (bTStatusFragmentNewInstance != null) {
                bTStatusFragmentNewInstance.setShowBottomArea(false);
            }
            BTStatusFragment bTStatusFragment = this.fragment;
            if (bTStatusFragment == null) {
                return;
            }
            bTStatusFragment.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$initBTStatusFragment$1
                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                public void onEnableChange(boolean enable) {
                    View view = this.a.getView();
                    if ((view == null ? null : view.findViewById(R.id.mask_view)) != null) {
                        View view2 = this.a.getView();
                        (view2 != null ? view2.findViewById(R.id.mask_view) : null).setVisibility(enable ? 8 : 0);
                    }
                }
            });
        }
    }

    private final void r() {
        WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        this.watchSettingViewModel = watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel);
        watchSettingViewModel.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$initLifecycleJob$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t2) {
                LoadingHelper loadingHelper = this.a.loadingHelper;
                Objects.requireNonNull(loadingHelper);
                LoadingHelper.responseToLoadingStatus$default(loadingHelper, this.a.getActivity(), (LoadingVo) t2, null, null, 12, null);
            }
        });
        WatchSettingViewModel watchSettingViewModel2 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel2);
        HMDeviceType deviceType = watchSettingViewModel2.getDeviceType();
        this.deviceType = deviceType;
        this.mDeviceSource = m().getBoundDeviceSource(deviceType);
        this.miliDevice = m().getDevice(deviceType);
        WatchSettingViewModel watchSettingViewModel3 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel3);
        watchSettingViewModel3.isShowLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: wg8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.y(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel4 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel4);
        watchSettingViewModel4.getNightModeVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$initLifecycleJob$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t2) {
                ListTile listTile = this.a.nightModeLt;
                Objects.requireNonNull(listTile);
                listTile.setVisibility(((Boolean) t2).booleanValue() ? 0 : 8);
                ListTile listTile2 = this.a.nightModeLt;
                Objects.requireNonNull(listTile2);
                listTile2.setOnClickListener(this.a.new c());
            }
        });
        WatchSettingViewModel watchSettingViewModel5 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel5);
        watchSettingViewModel5.getSoundVibrationVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: dh8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.z(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel6 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel6);
        watchSettingViewModel6.getOfflineVoiceWakeUpVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: tg8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.A(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel7 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel7);
        watchSettingViewModel7.getDeviceLanguageVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: xg8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.B(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel8 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel8);
        watchSettingViewModel8.getDeviceGestureVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: yg8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.C(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel9 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel9);
        watchSettingViewModel9.getDeviceMorningGreetingVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: ug8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.s(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel10 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel10);
        watchSettingViewModel10.getWearModeVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: zg8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.t(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel11 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel11);
        watchSettingViewModel11.getDisplayBrightnessVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: bh8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.u(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel12 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel12);
        watchSettingViewModel12.getScreenLockAndPassword().observe(getViewLifecycleOwner(), new Observer() { // from class: vg8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.v(this.a, (ScreenLockAndPassword) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel13 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel13);
        watchSettingViewModel13.getLongPressSideVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$initLifecycleJob$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t2) {
                boolean zBooleanValue = ((Boolean) t2).booleanValue();
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.ds_quick_start_long_press_side), zBooleanValue, false, 2, null);
                WatchSettingFragment watchSettingFragment = this.a;
                View view2 = watchSettingFragment.getView();
                watchSettingFragment.K(view2 != null ? view2.findViewById(R.id.ds_quick_start_long_press_side) : null, 1);
            }
        });
        WatchSettingViewModel watchSettingViewModel14 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel14);
        watchSettingViewModel14.getLongPressUpVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$initLifecycleJob$$inlined$observe$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t2) {
                boolean zBooleanValue = ((Boolean) t2).booleanValue();
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.ds_quick_start_long_press_up), zBooleanValue, false, 2, null);
                WatchSettingFragment watchSettingFragment = this.a;
                View view2 = watchSettingFragment.getView();
                watchSettingFragment.K(view2 != null ? view2.findViewById(R.id.ds_quick_start_long_press_up) : null, 2);
            }
        });
        WatchSettingViewModel watchSettingViewModel15 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel15);
        watchSettingViewModel15.getClickDownVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$initLifecycleJob$$inlined$observe$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t2) {
                boolean zBooleanValue = ((Boolean) t2).booleanValue();
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.ds_quick_start_click_down), zBooleanValue, false, 2, null);
                WatchSettingFragment watchSettingFragment = this.a;
                View view2 = watchSettingFragment.getView();
                watchSettingFragment.K(view2 != null ? view2.findViewById(R.id.ds_quick_start_click_down) : null, 3);
            }
        });
        WatchSettingViewModel watchSettingViewModel16 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel16);
        watchSettingViewModel16.getClickSelectVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$initLifecycleJob$$inlined$observe$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t2) {
                boolean zBooleanValue = ((Boolean) t2).booleanValue();
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.ds_quick_start), zBooleanValue, false, 2, null);
                WatchSettingFragment watchSettingFragment = this.a;
                View view2 = watchSettingFragment.getView();
                watchSettingFragment.K(view2 != null ? view2.findViewById(R.id.ds_quick_start) : null, 4);
            }
        });
        WatchSettingViewModel watchSettingViewModel17 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel17);
        watchSettingViewModel17.getDndModeVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: ah8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.w(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel18 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel18);
        watchSettingViewModel18.getSleepModeVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$initLifecycleJob$$inlined$observe$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t2) {
                boolean zBooleanValue = ((Boolean) t2).booleanValue();
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.device_setting_sleep_mode), zBooleanValue, false, 2, null);
                if (zBooleanValue) {
                    this.a.M();
                }
            }
        });
        WatchSettingViewModel watchSettingViewModel19 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel19);
        watchSettingViewModel19.getSportSettingVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: ch8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchSettingFragment.x(this.a, (Boolean) obj);
            }
        });
        WatchSettingViewModel watchSettingViewModel20 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel20);
        watchSettingViewModel20.getDisplayListVisible().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingFragment$initLifecycleJob$$inlined$observe$8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t2) {
                DisplayListSupport displayListSupport = (DisplayListSupport) t2;
                if (GlobalConfig.get().isBuildMidong()) {
                    View view = this.a.getView();
                    ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.ds_screen_edit), displayListSupport.getSupportSecScreen(), false, 2, null);
                    View view2 = this.a.getView();
                    ExtKt.setVisible$default(view2 == null ? null : view2.findViewById(R.id.ds_control_center_edit), displayListSupport.getSupportCtlCenter(), false, 2, null);
                    if (displayListSupport.getSupportSecScreen()) {
                        this.a.L();
                    }
                    if (displayListSupport.getSupportCtlCenter()) {
                        this.a.F();
                        return;
                    }
                    return;
                }
                View view3 = this.a.getView();
                ExtKt.setVisible$default(view3 == null ? null : view3.findViewById(R.id.ds_app_sort), displayListSupport.getSupportSort(), false, 2, null);
                View view4 = this.a.getView();
                ExtKt.setVisible$default(view4 == null ? null : view4.findViewById(R.id.ds_short_cut), displayListSupport.getSupportSecScreen(), false, 2, null);
                if (displayListSupport.getSupportSort()) {
                    this.a.D();
                }
                if (displayListSupport.getSupportSecScreen()) {
                    this.a.O();
                }
            }
        });
        WatchSettingViewModel watchSettingViewModel21 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel21);
        if (watchSettingViewModel21.needLoad()) {
            WatchSettingViewModel watchSettingViewModel22 = this.watchSettingViewModel;
            Objects.requireNonNull(watchSettingViewModel22);
            watchSettingViewModel22.querySettings(true, new SettingsGroupType[0]);
        }
        WatchSettingViewModel watchSettingViewModel23 = this.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel23);
        watchSettingViewModel23.loadSort();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(WatchSettingFragment watchSettingFragment, Boolean bool) {
        View view = watchSettingFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.device_morning_greeting))).setVisibility(bool.booleanValue() ? 0 : 8);
        View view2 = watchSettingFragment.getView();
        ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.device_morning_greeting) : null, 0L, watchSettingFragment.new e(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(WatchSettingFragment watchSettingFragment, Boolean bool) {
        View view = watchSettingFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.ds_wearing_method))).setVisibility(bool.booleanValue() ? 0 : 8);
        WatchSettingViewModel watchSettingViewModel = watchSettingFragment.watchSettingViewModel;
        Objects.requireNonNull(watchSettingViewModel);
        if (watchSettingViewModel.get_wearingWay() instanceof WearingWayV2) {
            View view2 = watchSettingFragment.getView();
            ((ListTile) (view2 != null ? view2.findViewById(R.id.ds_wearing_method) : null)).setTitle(R.string.ds_wear_direction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(WatchSettingFragment watchSettingFragment, Boolean bool) {
        View view = watchSettingFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.item_display_brightness))).setVisibility(bool.booleanValue() ? 0 : 8);
        if (bool.booleanValue()) {
            watchSettingFragment.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(WatchSettingFragment watchSettingFragment, ScreenLockAndPassword screenLockAndPassword) {
        watchSettingFragment.R(screenLockAndPassword);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(WatchSettingFragment watchSettingFragment, Boolean bool) {
        View view = watchSettingFragment.getView();
        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.device_setting_dnd), bool.booleanValue(), false, 2, null);
        if (bool.booleanValue()) {
            watchSettingFragment.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(WatchSettingFragment watchSettingFragment, Boolean bool) {
        View view = watchSettingFragment.getView();
        ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.device_setting_sport), bool.booleanValue(), false, 2, null);
        if (bool.booleanValue()) {
            View view2 = watchSettingFragment.getView();
            ExtKt.smartClick$default(view2 != null ? view2.findViewById(R.id.device_setting_sport) : null, 0L, watchSettingFragment.new a(), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(WatchSettingFragment watchSettingFragment, Boolean bool) {
        FragmentActivity activity = watchSettingFragment.getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            HMLog.error$default(watchSettingFragment.TAG, null, null, b.a, 6, null);
            return;
        }
        if (bool.booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = watchSettingFragment.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading();
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = watchSettingFragment.mLoadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(WatchSettingFragment watchSettingFragment, Boolean bool) {
        View view = watchSettingFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.device_setting_sound_vibration))).setVisibility(bool.booleanValue() ? 0 : 8);
        if (bool.booleanValue()) {
            watchSettingFragment.N();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.mLoadingDialogHelper = new LoadingDialogHelper(getActivity());
        r();
        initView();
        E();
        q();
        getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleComponent());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 16 && resultCode == -1) {
            WatchSettingViewModel watchSettingViewModel = this.watchSettingViewModel;
            Objects.requireNonNull(watchSettingViewModel);
            watchSettingViewModel.queryScreenUnlockAndPassword(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_watch_setting, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        HMLog.info(this.TAG, f.a);
        WatchSettingExtsKt.getWatchSettingManager().onExitWatchSetting();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        if (GlobalConfig.get().isBuildMidong()) {
            return;
        }
        View view2 = getView();
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.item_display_brightness))).setTitle(R.string.smart_card_setting);
        View view3 = getView();
        ((ListTile) (view3 != null ? view3.findViewById(R.id.device_language) : null)).setTitle(R.string.watch_language_wristband);
    }

    private final void initView() {
        int i2;
        HMDeviceSource hMDeviceSource = this.mDeviceSource;
        Objects.requireNonNull(hMDeviceSource);
        if (HMDeviceConfig.isWatch(hMDeviceSource)) {
            SoundVibrationFragment.Companion companion = SoundVibrationFragment.INSTANCE;
            HMDeviceSource hMDeviceSource2 = this.mDeviceSource;
            Objects.requireNonNull(hMDeviceSource2);
            i2 = companion.isOnlySupportVibration(hMDeviceSource2) ? R.string.ds_vibration : R.string.ds_sound_vibration;
        } else {
            i2 = R.string.custom_vibrate_mode;
        }
        View view = getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.device_setting_sound_vibration))).setTitle(i2);
        int i3 = HMDeviceConfig.hasBoundWatch() ? R.string.ds_watch_setting : R.string.device_ds_band_setting;
        View view2 = getView();
        ((TextView) (view2 != null ? view2.findViewById(R.id.watch_setting) : null)).setText(i3);
        this.loadingHelper = new LoadingHelper(requireContext());
    }
}
