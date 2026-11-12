package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v1.DisplayAndBrightnessV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.ui.dialog.WheelViewDialog;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestEnableMode;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.InterestScreenDisplayFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.wrist.WristEnum;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntProgression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0002WXB\u0007¢\u0006\u0004\bU\u0010VJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0014\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0003J\u0012\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006R$\u0010#\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001e\u0010'\u001a\n \u001e*\u0004\u0018\u00010$0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010+\u001a\n \u001e*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001d\u0010M\u001a\u00020I8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b8\u0010LR\u001d\u0010P\u001a\u00020N8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bJ\u0010OR\u001d\u0010T\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\b?\u0010S¨\u0006Y"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", hl.k, "m", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "displayAndBrightness", "i", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "initEvent", "settings", "refreshView", "", "getScreenOffTime", "()Ljava/lang/Integer;", "showAutoScreenTimeSelect", "newFeatureGesScreenLight", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "b", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "mPersonInfo", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "c", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "mConfig", "Lcom/xiaomi/hm/health/device/setting/ui/dialog/WheelViewDialog;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/dialog/WheelViewDialog;", "getWheelViewDialog", "()Lcom/xiaomi/hm/health/device/setting/ui/dialog/WheelViewDialog;", "setWheelViewDialog", "(Lcom/xiaomi/hm/health/device/setting/ui/dialog/WheelViewDialog;)V", "wheelViewDialog", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "e", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "f", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "getDisplayAndBrightness", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "setDisplayAndBrightness", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;)V", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "g", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "fragment", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "getViewModel", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;", "setViewModel", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessViewModel;)V", "Lcom/huami/devicex/manager/DeviceManagerApi;", "h", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", z.j, "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "<init>", "()V", "Companion", "LifecycleComponent", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class DisplayBrightnessFragment extends Fragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String k = "DisplayBrightnessFragment";
    private static final int l = 1;
    private static final int m = 5;
    private static final int n = 15;
    private static final int o = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String logTag = DisplayBrightnessFragment.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HMPersonInfo mPersonInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final HMMiliConfig mConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private WheelViewDialog wheelViewDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private DisplayAndBrightness displayAndBrightness;

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
    @NotNull
    private final Lazy deviceUtilsApi;
    public DisplayBrightnessViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessFragment$Companion;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessFragment;", "newInstance", "", "COARSE_GRAININESS", LogUtil.I, "FINE_GRAININESS", "FINE_GRAININESS_MAX", "FINE_GRAININESS_MIN", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DisplayBrightnessFragment newInstance() {
            return new DisplayBrightnessFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessFragment$LifecycleComponent;", "Landroidx/lifecycle/LifecycleObserver;", "", "onResume", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/DisplayBrightnessFragment;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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
        public final void onResume() {
            HMLog.info(DisplayBrightnessFragment.k, a.a);
            DisplayBrightnessFragment displayBrightnessFragment = DisplayBrightnessFragment.this;
            displayBrightnessFragment.newFeatureGesScreenLight(displayBrightnessFragment.getViewModel().getDisplayBrightnessSetting().getValue());
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
            FragmentKt.findNavController(DisplayBrightnessFragment.this).popBackStack();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            DisplayBrightnessFragment.this.h().startGesScreenActivity(DisplayBrightnessFragment.this.requireContext(), DisplayBrightnessFragment.this.f().getBoundDeviceSource(HMDeviceType.MILI));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(DisplayBrightnessFragment.this).navigate(R.id.action_to_interestScreenFragment);
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
            DisplayBrightnessFragment.this.showAutoScreenTimeSelect();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DisplayBrightnessFragment() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.mPersonInfo = hMPersonInfo;
        this.mConfig = hMPersonInfo.getMiliConfig();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment$special$$inlined$inject$default$1
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
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment$special$$inlined$inject$default$2
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
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment$special$$inlined$inject$default$3
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr4, objArr5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi f() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi g() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceXNavigator h() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    private final void i(DisplayAndBrightness displayAndBrightness) {
        EnumData screenOnByTurningWristMode;
        if ((displayAndBrightness instanceof DisplayAndBrightnessV2) && (screenOnByTurningWristMode = ((DisplayAndBrightnessV2) displayAndBrightness).getScreenOnByTurningWristMode()) != null) {
            View view = getView();
            ((ListTile) (view != null ? view.findViewById(R.id.mili_setting_ges_screen_ll) : null)).setTips(GesScreenFragment.INSTANCE.getGesModeDesc(screenOnByTurningWristMode));
            return;
        }
        if (!(displayAndBrightness instanceof DisplayAndBrightnessV1)) {
            if (!this.mConfig.isLiftWristBrightView()) {
                View view2 = getView();
                ((ListTile) (view2 != null ? view2.findViewById(R.id.mili_setting_ges_screen_ll) : null)).setTips(R.string.has_close);
                return;
            } else if (g().fromLiftWristConfig(this.mConfig.isLiftWristBrightView(), this.mPersonInfo.getMiliConfig().getLiftWristTime()).isAllDay()) {
                View view3 = getView();
                ((ListTile) (view3 != null ? view3.findViewById(R.id.mili_setting_ges_screen_ll) : null)).setTips(R.string.ges_screen_type_all_day);
                return;
            } else {
                View view4 = getView();
                ((ListTile) (view4 != null ? view4.findViewById(R.id.mili_setting_ges_screen_ll) : null)).setTips(R.string.ges_screen_type_time);
                return;
            }
        }
        EnumData screenOnByTurningWristMode2 = ((DisplayAndBrightnessV1) displayAndBrightness).getScreenOnByTurningWristMode();
        WristEnum.Companion companion = WristEnum.INSTANCE;
        Integer numValueOf = screenOnByTurningWristMode2 == null ? null : Integer.valueOf(screenOnByTurningWristMode2.getValue());
        if (!companion.isWristEnable(companion.parseWristEnum(numValueOf == null ? WristEnum.OFF.ordinal() : numValueOf.intValue()))) {
            View view5 = getView();
            ((ListTile) (view5 != null ? view5.findViewById(R.id.mili_setting_ges_screen_ll) : null)).setTips(R.string.has_close);
            return;
        }
        Integer numValueOf2 = screenOnByTurningWristMode2 == null ? null : Integer.valueOf(screenOnByTurningWristMode2.getValue());
        if (companion.isWristAllDay(companion.parseWristEnum(numValueOf2 == null ? WristEnum.OFF.ordinal() : numValueOf2.intValue()))) {
            View view6 = getView();
            ((ListTile) (view6 != null ? view6.findViewById(R.id.mili_setting_ges_screen_ll) : null)).setTips(R.string.ges_screen_type_all_day);
        } else {
            View view7 = getView();
            ((ListTile) (view7 != null ? view7.findViewById(R.id.mili_setting_ges_screen_ll) : null)).setTips(R.string.ges_screen_type_time);
        }
    }

    public static /* synthetic */ void j(DisplayBrightnessFragment displayBrightnessFragment, DisplayAndBrightness displayAndBrightness, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGesTimeDescription");
        }
        if ((i & 1) != 0) {
            displayAndBrightness = null;
        }
        displayBrightnessFragment.i(displayAndBrightness);
    }

    private final void k() {
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
            bTStatusFragment.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment$initBTStatusFragment$1
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(DisplayBrightnessFragment displayBrightnessFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            displayBrightnessFragment.getViewModel().pushAutoBrightnessToDevice(z);
            DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(displayBrightnessFragment.getViewModel(), false, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null);
        }
    }

    private final void m() {
        setViewModel((DisplayBrightnessViewModel) new ViewModelProvider(requireActivity()).get(DisplayBrightnessViewModel.class));
        final WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        getViewModel().setSettings(watchSettingViewModel.getWatchSettings());
        getViewModel().initJob(HMDeviceType.MILI);
        getViewModel().getDisplayBrightnessSetting().observe(getViewLifecycleOwner(), new Observer() { // from class: va1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DisplayBrightnessFragment.n(this.a, watchSettingViewModel, (DisplayAndBrightness) obj);
            }
        });
        getViewModel().getWritingResult().observe(getViewLifecycleOwner(), new Observer() { // from class: ta1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DisplayBrightnessFragment.o(this.a, (Boolean) obj);
            }
        });
        getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleComponent());
        DisplayBrightnessViewModel.querySettings$default(getViewModel(), false, 1, null);
        getViewModel().isShowLoading().observe(getViewLifecycleOwner(), new Observer() { // from class: ua1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DisplayBrightnessFragment.p(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(DisplayBrightnessFragment displayBrightnessFragment, WatchSettingViewModel watchSettingViewModel, DisplayAndBrightness displayAndBrightness) {
        if (displayAndBrightness == null) {
            return;
        }
        displayBrightnessFragment.setDisplayAndBrightness(displayAndBrightness);
        watchSettingViewModel.setDisplayBrightness(displayAndBrightness);
        displayBrightnessFragment.refreshView(displayAndBrightness);
    }

    public static /* synthetic */ void newFeatureGesScreenLight$default(DisplayBrightnessFragment displayBrightnessFragment, DisplayAndBrightness displayAndBrightness, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newFeatureGesScreenLight");
        }
        if ((i & 1) != 0) {
            displayAndBrightness = null;
        }
        displayBrightnessFragment.newFeatureGesScreenLight(displayAndBrightness);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DisplayBrightnessFragment displayBrightnessFragment, Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            LoadingDialogHelper loadingDialogHelper = displayBrightnessFragment.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.setSuccess(R.string.save_success);
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = displayBrightnessFragment.mLoadingDialogHelper;
        if (loadingDialogHelper2 == null) {
            return;
        }
        loadingDialogHelper2.setFail(R.string.save_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(DisplayBrightnessFragment displayBrightnessFragment, Boolean bool) {
        LoadingDialogHelper loadingDialogHelper;
        if (!bool.booleanValue() || (loadingDialogHelper = displayBrightnessFragment.mLoadingDialogHelper) == null) {
            return;
        }
        loadingDialogHelper.showLoading(R.string.saving);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(DisplayBrightnessFragment displayBrightnessFragment, View view) {
        Pair<Integer, IntProgression> currentItemAndRang;
        WheelViewDialog wheelViewDialog = displayBrightnessFragment.getWheelViewDialog();
        if (wheelViewDialog == null || (currentItemAndRang = wheelViewDialog.getCurrentItemAndRang()) == null || currentItemAndRang.getFirst() == null || !view.isPressed()) {
            return;
        }
        EnumData enumData = new EnumData(currentItemAndRang.getFirst().intValue(), new ArrayList(CollectionsKt___CollectionsKt.toMutableList(currentItemAndRang.getSecond())), true);
        displayBrightnessFragment.getViewModel().pushAutoInterestTime(enumData);
        DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(displayBrightnessFragment.getViewModel(), true, null, null, enumData, null, null, null, null, null, null, null, null, null, null, null, null, 65526, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public DisplayAndBrightness getDisplayAndBrightness() {
        return this.displayAndBrightness;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public String getLogTag() {
        return this.logTag;
    }

    @Nullable
    public Integer getScreenOffTime() {
        EnumData screenOffTime;
        DisplayAndBrightness displayAndBrightness = getDisplayAndBrightness();
        DisplayAndBrightnessV1 displayAndBrightnessV1 = displayAndBrightness instanceof DisplayAndBrightnessV1 ? (DisplayAndBrightnessV1) displayAndBrightness : null;
        if (displayAndBrightnessV1 == null || (screenOffTime = displayAndBrightnessV1.getScreenOffTime()) == null) {
            return null;
        }
        return Integer.valueOf(screenOffTime.getValue());
    }

    @NotNull
    public final DisplayBrightnessViewModel getViewModel() {
        DisplayBrightnessViewModel displayBrightnessViewModel = this.viewModel;
        Objects.requireNonNull(displayBrightnessViewModel);
        return displayBrightnessViewModel;
    }

    @Nullable
    public final WheelViewDialog getWheelViewDialog() {
        return this.wheelViewDialog;
    }

    public void initEvent() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new a(), 1, null);
        View view2 = getView();
        ExtKt.smartClick$default(view2 == null ? null : view2.findViewById(R.id.mili_setting_ges_screen_ll), 0L, new b(), 1, null);
        View view3 = getView();
        ExtKt.smartClick$default(view3 == null ? null : view3.findViewById(R.id.ds_interest_screen_display), 0L, new c(), 1, null);
        View view4 = getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.device_setting_automatic_brightness))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sa1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                DisplayBrightnessFragment.l(this.a, compoundButton, z);
            }
        });
        View view5 = getView();
        ((SeekBar) (view5 == null ? null : view5.findViewById(R.id.device_setting_light_controller))).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment.initEvent.5

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment$initEvent$5$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ SeekBar a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SeekBar seekBar) {
                    super(0);
                    this.a = seekBar;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    SeekBar seekBar = this.a;
                    return "isPress:" + (seekBar == null ? null : Boolean.valueOf(seekBar.isPressed()));
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessFragment$initEvent$5$b */
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
                    return "Stop track touch";
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
                HMLog.info(DisplayBrightnessFragment.k, new a(seekBar));
                HMLog.info(DisplayBrightnessFragment.k, b.a);
                if (seekBar != null && seekBar.isPressed()) {
                    IntData intData = new IntData(seekBar.getProgress(), 0, 100, false, 8, null);
                    DisplayBrightnessFragment.this.getViewModel().pushBrightnessValueToDevice(intData);
                    DisplayBrightnessViewModel.updateDisplayBrightnessSetting$default(DisplayBrightnessFragment.this.getViewModel(), false, null, intData, null, null, null, null, null, null, null, null, null, null, null, null, null, 65530, null);
                }
            }
        });
        View view6 = getView();
        ExtKt.smartClick$default(view6 != null ? view6.findViewById(R.id.device_setting_auto_screen) : null, 0L, new d(), 1, null);
    }

    public final void newFeatureGesScreenLight(@Nullable DisplayAndBrightness displayAndBrightness) {
        if (HMDeviceConfig.hasFeatureG3Device()) {
            View view = getView();
            ((ListTile) (view == null ? null : view.findViewById(R.id.mili_setting_ges_screen_ll))).setTrailingIvVisible(true);
            i(displayAndBrightness);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.mLoadingDialogHelper = new LoadingDialogHelper(getActivity());
        m();
        initEvent();
        k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.display_brightness_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (GlobalConfig.get().isBuildMidong()) {
            return;
        }
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.display_brightness_title))).setText(R.string.smart_card_setting);
    }

    public void refreshView(@NotNull DisplayAndBrightness settings) {
        if (settings instanceof DisplayAndBrightnessV1) {
            View view = getView();
            ListTile listTile = (ListTile) (view == null ? null : view.findViewById(R.id.device_setting_automatic_brightness));
            DisplayAndBrightnessV1 displayAndBrightnessV1 = (DisplayAndBrightnessV1) settings;
            Boolean autoBrightness = displayAndBrightnessV1.getAutoBrightness();
            listTile.setChecked(autoBrightness == null ? false : autoBrightness.booleanValue());
            WheelViewDialog wheelViewDialog = this.wheelViewDialog;
            if (wheelViewDialog != null) {
                EnumData screenOffTime = displayAndBrightnessV1.getScreenOffTime();
                wheelViewDialog.setCurrentItem(screenOffTime == null ? null : Integer.valueOf(screenOffTime.getValue()));
            }
            View view2 = getView();
            SeekBar seekBar = (SeekBar) (view2 == null ? null : view2.findViewById(R.id.device_setting_light_controller));
            IntData brightness = displayAndBrightnessV1.getBrightness();
            seekBar.setProgress(brightness == null ? 0 : brightness.getValue());
            newFeatureGesScreenLight(settings);
            EnumData screenOffTime2 = displayAndBrightnessV1.getScreenOffTime();
            if (screenOffTime2 != null) {
                int value = screenOffTime2.getValue();
                View view3 = getView();
                ((ListTile) (view3 == null ? null : view3.findViewById(R.id.device_setting_auto_screen))).setTips(getResources().getQuantityString(R.plurals.ds_Auto_screen_time, value, Integer.valueOf(value)));
            }
            InterestEnableMode.Companion companion = InterestEnableMode.INSTANCE;
            EnumData screenOffDisplayMode = displayAndBrightnessV1.getScreenOffDisplayMode();
            InterestEnableMode interestEnableMode = companion.parseInterestEnableMode(screenOffDisplayMode == null ? 0 : screenOffDisplayMode.getValue());
            View view4 = getView();
            ((ListTile) (view4 == null ? null : view4.findViewById(R.id.ds_interest_screen_display))).setTips(InterestScreenDisplayFragment.INSTANCE.getEnableModeString(interestEnableMode, requireContext()));
            View view5 = getView();
            ((ListTile) (view5 == null ? null : view5.findViewById(R.id.device_setting_automatic_brightness))).setVisibility(displayAndBrightnessV1.getAutoBrightness() != null ? 0 : 8);
            View view6 = getView();
            ((ConstraintLayout) (view6 == null ? null : view6.findViewById(R.id.d_setting_brightness_ViewGroup))).setVisibility(displayAndBrightnessV1.getBrightness() != null ? 0 : 8);
            View view7 = getView();
            ((ListTile) (view7 == null ? null : view7.findViewById(R.id.device_setting_auto_screen))).setVisibility(displayAndBrightnessV1.getScreenOffTime() != null ? 0 : 8);
            View view8 = getView();
            ((ListTile) (view8 == null ? null : view8.findViewById(R.id.ds_interest_screen_display))).setVisibility(displayAndBrightnessV1.getScreenOffDisplayMode() != null ? 0 : 8);
            View view9 = getView();
            ((ListTile) (view9 != null ? view9.findViewById(R.id.mili_setting_ges_screen_ll) : null)).setVisibility(displayAndBrightnessV1.getScreenOnByTurningWristMode() == null ? 8 : 0);
        }
    }

    public void setDisplayAndBrightness(@Nullable DisplayAndBrightness displayAndBrightness) {
        this.displayAndBrightness = displayAndBrightness;
    }

    public final void setViewModel(@NotNull DisplayBrightnessViewModel displayBrightnessViewModel) {
        this.viewModel = displayBrightnessViewModel;
    }

    public final void setWheelViewDialog(@Nullable WheelViewDialog wheelViewDialog) {
        this.wheelViewDialog = wheelViewDialog;
    }

    public final void showAutoScreenTimeSelect() {
        EnumData screenOffTime;
        WheelViewDialog wheelViewDialog;
        WheelViewDialog wheelViewDialog2;
        if (this.wheelViewDialog == null) {
            WheelViewDialog wheelViewDialog3 = new WheelViewDialog();
            this.wheelViewDialog = wheelViewDialog3;
            wheelViewDialog3.setCancelable(true);
            WheelViewDialog wheelViewDialog4 = this.wheelViewDialog;
            if (wheelViewDialog4 != null) {
                wheelViewDialog4.setSureListener(new View.OnClickListener() { // from class: ra1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DisplayBrightnessFragment.q(this.a, view);
                    }
                });
            }
        }
        WheelViewDialog wheelViewDialog5 = this.wheelViewDialog;
        if (wheelViewDialog5 != null) {
            wheelViewDialog5.setCurrentItem(getScreenOffTime());
        }
        if (!this.wheelViewDialog.isAdded() && !this.wheelViewDialog.isVisible() && getChildFragmentManager().findFragmentByTag(getTag()) == null && (wheelViewDialog2 = this.wheelViewDialog) != null) {
            wheelViewDialog2.show(getChildFragmentManager(), k);
        }
        DisplayAndBrightness displayAndBrightness = getDisplayAndBrightness();
        DisplayAndBrightnessV1 displayAndBrightnessV1 = displayAndBrightness instanceof DisplayAndBrightnessV1 ? (DisplayAndBrightnessV1) displayAndBrightness : null;
        if (displayAndBrightnessV1 != null && (screenOffTime = displayAndBrightnessV1.getScreenOffTime()) != null && (wheelViewDialog = getWheelViewDialog()) != null) {
            wheelViewDialog.setCurrentItem(Integer.valueOf(screenOffTime.getValue()));
        }
        WheelViewDialog wheelViewDialog6 = this.wheelViewDialog;
        if (wheelViewDialog6 != null) {
            wheelViewDialog6.setTitle(getString(R.string.ds_time_select));
        }
        if (!ConfigHelperKt.hasFeature(f().getBoundDeviceSource(HMDeviceType.MILI), Feature.SUPPORT_FINE_GRAININESS)) {
            WheelViewDialog wheelViewDialog7 = this.wheelViewDialog;
            if (wheelViewDialog7 == null) {
                return;
            }
            wheelViewDialog7.setGraininess(5);
            return;
        }
        WheelViewDialog wheelViewDialog8 = this.wheelViewDialog;
        if (wheelViewDialog8 != null) {
            wheelViewDialog8.setGraininess(1);
        }
        WheelViewDialog wheelViewDialog9 = this.wheelViewDialog;
        if (wheelViewDialog9 != null) {
            wheelViewDialog9.setMinWheelValues(5);
        }
        WheelViewDialog wheelViewDialog10 = this.wheelViewDialog;
        if (wheelViewDialog10 == null) {
            return;
        }
        wheelViewDialog10.setMaxWheelValues(15);
    }
}
