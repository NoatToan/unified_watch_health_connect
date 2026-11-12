package com.xiaomi.hm.health.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.constraintlayout.widget.Placeholder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.viewpager.widget.ViewPager;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.ViewUtils;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.devicex.R;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.statusbar.StatusBarCompat;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.loc.z;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.earbud.model.CurrentMusicState;
import com.xiaomi.hm.health.bt.profile.earbud.model.RestModeInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.TomatoModeInfo;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.device.HmEarbudMusicActivity;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity;
import com.xiaomi.hm.health.device.earbud.event.EarbudMusicDownloadEvent;
import com.xiaomi.hm.health.device.earbud.fragment.BaseEarbudModeFragment;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudCloudMusicFragment;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudDeviceMusicFragment;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudModePlayFragment;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudModeSettingFragment;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudModeTipFragment;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudNotConnectFragment;
import com.xiaomi.hm.health.device.earbud.fragment.dialog.EarbudDeleteGuideDialog;
import com.xiaomi.hm.health.device.earbud.view.ViewEarbudMusicTab;
import com.xiaomi.hm.health.device.earbud.view.ViewExKt;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HmDeviceResetEvent;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.eventbus.EventAppInBackground;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\bV\u0010WJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0014J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001fJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020 J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020!J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020$J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0014R\u001d\u0010+\u001a\u00020\u00028T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001d\u00105\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001d\u0010<\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b:\u0010;R\u001d\u0010?\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010(\u001a\u0004\b>\u0010;R\u001d\u0010B\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\bA\u0010;R\u001d\u0010G\u001a\u00020C8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\bE\u0010FR\u001d\u0010L\u001a\u00020H8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010(\u001a\u0004\bJ\u0010KR\u001d\u0010Q\u001a\u00020M8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010(\u001a\u0004\bO\u0010PR\u001d\u0010U\u001a\u00020R8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010(\u001a\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lcom/xiaomi/hm/health/device/HmEarbudMusicActivity;", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "z", LogUtil.I, "Lcom/xiaomi/hm/health/device/earbud/fragment/BaseEarbudModeFragment;", "y", "", "mode", "x", "", "isRest", "w", "content", "J", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "observeData", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "toEarbudSetting", "onReturnClick", "disableDelete", "onResume", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onEvent", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "Lcom/xiaomi/hm/health/device/event/HmDeviceResetEvent;", "Lcom/xiaomi/hm/health/eventbus/EventAppInBackground;", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "Lcom/xiaomi/hm/health/device/earbud/event/EarbudMusicDownloadEvent;", "onBackPressed", "onDestroy", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "mViewModel", "Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudDeviceMusicFragment;", "e", "r", "()Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudDeviceMusicFragment;", "mDeviceMusicFragment", "Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudCloudMusicFragment;", "f", DTransferConstants.SEARCH_KEY, "()Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudCloudMusicFragment;", "mCloudMusicFragment", "g", "Lcom/xiaomi/hm/health/device/earbud/fragment/BaseEarbudModeFragment;", "mCurrentFragment", "h", "u", "()Lcom/xiaomi/hm/health/device/earbud/fragment/BaseEarbudModeFragment;", "mTipFragment", "i", "t", "mRestModeFragment", z.j, "v", "mTomatoModeFragment", "Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudNotConnectFragment;", hl.k, SOAP.XMLNS, "()Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudNotConnectFragment;", "mNotConnectFragment", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "l", "o", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "m", GoogleApiAvailabilityLight.b, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Landroidx/fragment/app/FragmentPagerAdapter;", com.google.android.exoplayer2.text.ttml.b.r, "()Landroidx/fragment/app/FragmentPagerAdapter;", "mAdapter", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudMusicActivity extends BaseEarbudDeviceActivity<EarbudMusicViewModel> implements KoinComponent {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private BaseEarbudModeFragment mCurrentFragment;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EarbudMusicViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.HmEarbudMusicActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.HmEarbudMusicActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceMusicFragment = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mCloudMusicFragment = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTipFragment = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRestModeFragment = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTomatoModeFragment = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNotConnectFragment = LazyKt__LazyJVMKt.lazy(e.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "mode", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public a() {
            super(1);
        }

        public final void a(int i) {
            HmEarbudMusicActivity hmEarbudMusicActivity = HmEarbudMusicActivity.this;
            hmEarbudMusicActivity.J(hmEarbudMusicActivity.x(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "show", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            HmEarbudMusicActivity.this.getMViewModel().setShowDeviceMusic(z);
            HmEarbudMusicActivity hmEarbudMusicActivity = HmEarbudMusicActivity.this;
            int i = R.id.sliding_content;
            SlidingUpPanelLayout.PanelState panelState = ((SlidingUpPanelLayout) hmEarbudMusicActivity.findViewById(i)).getPanelState();
            SlidingUpPanelLayout.PanelState panelState2 = SlidingUpPanelLayout.PanelState.EXPANDED;
            if (panelState != panelState2) {
                ((SlidingUpPanelLayout) HmEarbudMusicActivity.this.findViewById(i)).setPanelState(panelState2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudCloudMusicFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EarbudCloudMusicFragment> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudCloudMusicFragment getA() {
            return new EarbudCloudMusicFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudDeviceMusicFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EarbudDeviceMusicFragment> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudDeviceMusicFragment getA() {
            return new EarbudDeviceMusicFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudNotConnectFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<EarbudNotConnectFragment> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudNotConnectFragment getA() {
            return new EarbudNotConnectFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/BaseEarbudModeFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<BaseEarbudModeFragment> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseEarbudModeFragment getA() {
            return HmEarbudMusicActivity.this.w(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/BaseEarbudModeFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<BaseEarbudModeFragment> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseEarbudModeFragment getA() {
            return HmEarbudMusicActivity.this.y();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/BaseEarbudModeFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<BaseEarbudModeFragment> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseEarbudModeFragment getA() {
            return HmEarbudMusicActivity.this.w(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ HmEarbudDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HmEarbudDevice hmEarbudDevice) {
            super(0);
            this.a = hmEarbudDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            HmBaseEarbudDevice rightDevice;
            HmEarbudDevice hmEarbudDevice = this.a;
            Boolean boolValueOf = null;
            Boolean boolValueOf2 = hmEarbudDevice == null ? null : Boolean.valueOf(hmEarbudDevice.isConnected());
            HmEarbudDevice hmEarbudDevice2 = this.a;
            if (hmEarbudDevice2 != null && (rightDevice = hmEarbudDevice2.getRightDevice()) != null) {
                boolValueOf = Boolean.valueOf(rightDevice.isConnected());
            }
            return "device connect status left : " + boolValueOf2 + ",  right : " + boolValueOf;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ EventFwCheckResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(EventFwCheckResult eventFwCheckResult) {
            super(0);
            this.a = eventFwCheckResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "status:" + this.a.isSuccess;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HmEarbudMusicActivity.this.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Unit> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HmEarbudMusicActivity.this.getMViewModel().disableRedDot();
            HmEarbudMusicActivity.this.startActivity(new Intent(HmEarbudMusicActivity.this, (Class<?>) HmEarbudSettingActivity.class));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmEarbudMusicActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.HmEarbudMusicActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final KeeperProxyApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.HmEarbudMusicActivity$special$$inlined$inject$default$2
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr2, objArr3);
            }
        });
        this.mAdapter = LazyKt__LazyJVMKt.lazy(new Function0<HmEarbudMusicActivity$mAdapter$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.device.HmEarbudMusicActivity$mAdapter$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.xiaomi.hm.health.device.HmEarbudMusicActivity$mAdapter$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 getA() {
                FragmentManager supportFragmentManager = this.a.getSupportFragmentManager();
                final HmEarbudMusicActivity hmEarbudMusicActivity = this.a;
                return new FragmentPagerAdapter(supportFragmentManager) { // from class: com.xiaomi.hm.health.device.HmEarbudMusicActivity$mAdapter$2.1
                    @Override // androidx.viewpager.widget.PagerAdapter
                    /* JADX INFO: renamed from: getCount */
                    public int getA() {
                        return 2;
                    }

                    @Override // androidx.fragment.app.FragmentPagerAdapter
                    @NotNull
                    public Fragment getItem(int position) {
                        return position == 0 ? hmEarbudMusicActivity.r() : hmEarbudMusicActivity.q();
                    }
                };
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(HmEarbudMusicActivity hmEarbudMusicActivity, HmEarbudDevice hmEarbudDevice) {
        HMLog.info(hmEarbudMusicActivity.getTAG(), new i(hmEarbudDevice));
        boolean z = false;
        if (!(hmEarbudDevice != null && hmEarbudDevice.isAllConnected())) {
            hmEarbudMusicActivity.q().stopMusic();
            hmEarbudMusicActivity.s().startLoading();
            ((FrameLayout) hmEarbudMusicActivity.findViewById(R.id.device_not_connect_content)).setVisibility(0);
            hmEarbudMusicActivity.s().setBleView();
            hmEarbudMusicActivity.getMViewModel().setDarkMode(true);
            return;
        }
        hmEarbudMusicActivity.s().stopLoading();
        ((FrameLayout) hmEarbudMusicActivity.findViewById(R.id.device_not_connect_content)).setVisibility(8);
        EarbudMusicViewModel mViewModel = hmEarbudMusicActivity.getMViewModel();
        BaseEarbudModeFragment baseEarbudModeFragment = hmEarbudMusicActivity.mCurrentFragment;
        if (baseEarbudModeFragment != null && baseEarbudModeFragment.getIsWhiteMode()) {
            z = true;
        }
        mViewModel.setDarkMode(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(HmEarbudMusicActivity hmEarbudMusicActivity, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            Toast.makeText(hmEarbudMusicActivity, R.string.earbud_net_error_toast, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(HmEarbudMusicActivity hmEarbudMusicActivity, CurrentMusicState currentMusicState) {
        boolean z = false;
        if (currentMusicState != null && currentMusicState.isModeNormal()) {
            z = true;
        }
        if (z) {
            BaseEarbudModeFragment baseEarbudModeFragment = hmEarbudMusicActivity.mCurrentFragment;
            if ((baseEarbudModeFragment == null ? null : baseEarbudModeFragment.getContentFragment()) instanceof EarbudModeSettingFragment) {
                return;
            }
            hmEarbudMusicActivity.J(hmEarbudMusicActivity.u());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(HmEarbudMusicActivity hmEarbudMusicActivity, RestModeInfo restModeInfo) {
        if (restModeInfo == null) {
            return;
        }
        hmEarbudMusicActivity.o().saveEarbudRestTime(restModeInfo.getTimeInMinute());
        hmEarbudMusicActivity.J(hmEarbudMusicActivity.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(HmEarbudMusicActivity hmEarbudMusicActivity, TomatoModeInfo tomatoModeInfo) {
        if (tomatoModeInfo == null) {
            return;
        }
        hmEarbudMusicActivity.o().saveEarbudTomatoTime(tomatoModeInfo.getTimeInMinute());
        hmEarbudMusicActivity.o().saveEarbudTomatoRestTime(tomatoModeInfo.getRestTimeInMinute());
        hmEarbudMusicActivity.J(hmEarbudMusicActivity.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(HmEarbudMusicActivity hmEarbudMusicActivity, Boolean bool) {
        StatusBarUtil.setStatusColor(hmEarbudMusicActivity, true, bool.booleanValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(HmEarbudMusicActivity hmEarbudMusicActivity, Boolean bool) {
        ViewEarbudMusicTab viewEarbudMusicTab = (ViewEarbudMusicTab) hmEarbudMusicActivity.findViewById(R.id.music_tab);
        Boolean bool2 = Boolean.TRUE;
        viewEarbudMusicTab.setTabMine(Intrinsics.areEqual(bool, bool2));
        hmEarbudMusicActivity.I();
        if (Intrinsics.areEqual(bool, bool2)) {
            int i2 = R.id.music_pager;
            if (((ViewPager) hmEarbudMusicActivity.findViewById(i2)).getCurrentItem() != 0) {
                ((ViewPager) hmEarbudMusicActivity.findViewById(i2)).setCurrentItem(0);
                return;
            }
        }
        if (Intrinsics.areEqual(bool, bool2)) {
            return;
        }
        int i3 = R.id.music_pager;
        if (((ViewPager) hmEarbudMusicActivity.findViewById(i3)).getCurrentItem() != 1) {
            ((ViewPager) hmEarbudMusicActivity.findViewById(i3)).setCurrentItem(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HmEarbudMusicActivity hmEarbudMusicActivity, String str) {
        hmEarbudMusicActivity.getMViewModel().refreshMusicNames();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        if (getMViewModel().getDownloadingMusic() != null && Intrinsics.areEqual(getMViewModel().getShowDeviceMusic().getValue(), Boolean.TRUE) && ((SlidingUpPanelLayout) findViewById(R.id.sliding_content)).getPanelState() == SlidingUpPanelLayout.PanelState.EXPANDED && o().isShowEarbudDeleteGuide()) {
            o().setShowEarbudDeleteGuide(false);
            new EarbudDeleteGuideDialog().show(getSupportFragmentManager(), "Delete Guide");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(BaseEarbudModeFragment content) {
        if (Intrinsics.areEqual(this.mCurrentFragment, content)) {
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.mode_content, content).commit();
        this.mCurrentFragment = content;
    }

    private final void initView() {
        NotificationManager.getInstance().getAppsRepo().setCurrentDeviceType(HMDeviceType.EARBUD);
        getSupportFragmentManager().beginTransaction().add(R.id.device_not_connect_content, s()).commit();
        J(u());
        float statusBarHeight = StatusBarCompat.getStatusBarHeight(this) + ViewUtils.dp2px(this, 45.0f);
        int i2 = R.id.space_view;
        ViewGroup.LayoutParams layoutParams = ((Placeholder) findViewById(i2)).getLayoutParams();
        int i3 = (int) statusBarHeight;
        layoutParams.height = i3;
        ((Placeholder) findViewById(i2)).setLayoutParams(layoutParams);
        int i4 = R.id.sliding_content;
        ((SlidingUpPanelLayout) findViewById(i4)).setPanelHeight(i3 + ((int) ViewUtils.dp2px(this, 80.0f)));
        ((SlidingUpPanelLayout) findViewById(i4)).addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() { // from class: com.xiaomi.hm.health.device.HmEarbudMusicActivity.initView.1
            @Override // com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener
            public void onPanelSlide(@Nullable View panel, float slideOffset) {
            }

            @Override // com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener
            public void onPanelStateChanged(@Nullable View panel, @Nullable SlidingUpPanelLayout.PanelState previousState, @Nullable SlidingUpPanelLayout.PanelState newState) {
                HmEarbudMusicActivity.this.getMViewModel().setShowDelete(false);
                SlidingUpPanelLayout.PanelState panelState = SlidingUpPanelLayout.PanelState.COLLAPSED;
                if (newState == panelState) {
                    ((ViewEarbudMusicTab) HmEarbudMusicActivity.this.findViewById(R.id.music_tab)).setArrowUp(true);
                    HmEarbudMusicActivity.this.q().stopMusic();
                    return;
                }
                SlidingUpPanelLayout.PanelState panelState2 = SlidingUpPanelLayout.PanelState.EXPANDED;
                if (newState == panelState2) {
                    ((ViewEarbudMusicTab) HmEarbudMusicActivity.this.findViewById(R.id.music_tab)).setArrowUp(false);
                    HmEarbudMusicActivity.this.I();
                } else if (newState == SlidingUpPanelLayout.PanelState.ANCHORED) {
                    if (((ViewEarbudMusicTab) HmEarbudMusicActivity.this.findViewById(R.id.music_tab)).getIsArrowUp()) {
                        ((SlidingUpPanelLayout) HmEarbudMusicActivity.this.findViewById(R.id.sliding_content)).setPanelState(panelState);
                    } else {
                        ((SlidingUpPanelLayout) HmEarbudMusicActivity.this.findViewById(R.id.sliding_content)).setPanelState(panelState2);
                    }
                }
            }
        });
        ((ViewEarbudMusicTab) findViewById(R.id.music_tab)).setOnTabSelect(new b());
    }

    private final DeviceManagerApi n() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final KeeperProxyApi o() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    private final FragmentPagerAdapter p() {
        return (FragmentPagerAdapter) this.mAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarbudCloudMusicFragment q() {
        return (EarbudCloudMusicFragment) this.mCloudMusicFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarbudDeviceMusicFragment r() {
        return (EarbudDeviceMusicFragment) this.mDeviceMusicFragment.getValue();
    }

    private final EarbudNotConnectFragment s() {
        return (EarbudNotConnectFragment) this.mNotConnectFragment.getValue();
    }

    private final BaseEarbudModeFragment t() {
        return (BaseEarbudModeFragment) this.mRestModeFragment.getValue();
    }

    private final BaseEarbudModeFragment u() {
        return (BaseEarbudModeFragment) this.mTipFragment.getValue();
    }

    private final BaseEarbudModeFragment v() {
        return (BaseEarbudModeFragment) this.mTomatoModeFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseEarbudModeFragment w(boolean isRest) {
        return new BaseEarbudModeFragment(new EarbudModePlayFragment(), true, isRest ? R.drawable.bg_rest : R.drawable.bg_tomato);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseEarbudModeFragment x(int mode) {
        EarbudModeSettingFragment earbudModeSettingFragment = new EarbudModeSettingFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("mode", mode);
        Unit unit = Unit.INSTANCE;
        earbudModeSettingFragment.setArguments(bundle);
        return new BaseEarbudModeFragment(earbudModeSettingFragment, true, mode == 0 ? R.drawable.bg_rest : R.drawable.bg_tomato);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseEarbudModeFragment y() {
        return new BaseEarbudModeFragment(new EarbudModeTipFragment(new a()), false, 0, 4, null);
    }

    private final void z() {
        int i2 = R.id.music_pager;
        ((ViewPager) findViewById(i2)).setAdapter(p());
        ((ViewPager) findViewById(i2)).addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.xiaomi.hm.health.device.HmEarbudMusicActivity$initPager$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                this.a.getMViewModel().setShowDeviceMusic(position == 0);
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void _$_clearFindViewByIdCache() {
    }

    public final void disableDelete(@NotNull View view) {
        getMViewModel().setShowDelete(false);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void observeData() {
        super.observeData();
        getMViewModel().getDeviceData().observe(this, new Observer() { // from class: v54
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudMusicActivity.A(this.a, (HmEarbudDevice) obj);
            }
        });
        getMViewModel().getShowNetTip().observe(this, new Observer() { // from class: z54
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudMusicActivity.B(this.a, (Boolean) obj);
            }
        });
        getMViewModel().getMusicStateData().observe(this, new Observer() { // from class: w54
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudMusicActivity.C(this.a, (CurrentMusicState) obj);
            }
        });
        getMViewModel().getRestData().observe(this, new Observer() { // from class: x54
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudMusicActivity.D(this.a, (RestModeInfo) obj);
            }
        });
        getMViewModel().getTomatoData().observe(this, new Observer() { // from class: y54
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudMusicActivity.E(this.a, (TomatoModeInfo) obj);
            }
        });
        getMViewModel().getTitleBarDarkMode().observe(this, new Observer() { // from class: b64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudMusicActivity.F(this.a, (Boolean) obj);
            }
        });
        getMViewModel().getShowDeviceMusic().observe(this, new Observer() { // from class: a64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudMusicActivity.G(this.a, (Boolean) obj);
            }
        });
        getMViewModel().getLocaleData().observe(this, new Observer() { // from class: c64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudMusicActivity.H(this.a, (String) obj);
            }
        });
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((FrameLayout) findViewById(R.id.device_not_connect_content)).getVisibility() == 0) {
            super.onBackPressed();
            return;
        }
        int i2 = R.id.sliding_content;
        SlidingUpPanelLayout.PanelState panelState = ((SlidingUpPanelLayout) findViewById(i2)).getPanelState();
        SlidingUpPanelLayout.PanelState panelState2 = SlidingUpPanelLayout.PanelState.COLLAPSED;
        if (panelState != panelState2) {
            ((SlidingUpPanelLayout) findViewById(i2)).setPanelState(panelState2);
            return;
        }
        BaseEarbudModeFragment baseEarbudModeFragment = this.mCurrentFragment;
        boolean z = false;
        if (baseEarbudModeFragment != null && baseEarbudModeFragment.shouldFinishActivity()) {
            z = true;
        }
        if (z) {
            super.onBackPressed();
        } else {
            J(y());
        }
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earbud_music);
        initView();
        z();
        observeData();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DeviceManagerApi deviceManagerApiN = n();
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        if (deviceManagerApiN.isConnected(hMDeviceType)) {
            n().startSyncData(hMDeviceType);
        }
    }

    public final void onEvent(@NotNull HMLFEvent event) {
        if (LfType.EARBUD_STATUS.getValue() == event.getLfType().getValue()) {
            getMViewModel().loadMusicState();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.device_not_connect_content);
        DeviceManagerApi deviceManagerApiN = n();
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        frameLayout.setVisibility(deviceManagerApiN.isConnected(hMDeviceType) ? 8 : 0);
        s().setBleView();
        HMFwOnlineManager.getInstance().checkFw(hMDeviceType, true);
    }

    public final void onReturnClick(@NotNull View view) {
        ViewExKt.onClickSmart$default(view, 0L, new k(), 1, null);
    }

    public final void toEarbudSetting(@NotNull View view) {
        ViewExKt.onClickSmart$default(view, 0L, new l(), 1, null);
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    @NotNull
    public EarbudMusicViewModel getMViewModel() {
        return (EarbudMusicViewModel) this.mViewModel.getValue();
    }

    public final void onEvent(@NotNull HMDeviceBindEvent event) {
        if (event.isBound() || event.getDeviceType() != HMDeviceType.EARBUD) {
            return;
        }
        finish();
    }

    public final void onEvent(@NotNull HmDeviceResetEvent event) {
        if (event.getDeviceType() == HMDeviceType.EARBUD) {
            getMViewModel().loadCloudMusic(true);
        }
    }

    public final void onEvent(@NotNull EventAppInBackground event) {
        if (event.isInBackground) {
            return;
        }
        getMViewModel().loadMusicState();
    }

    public final void onEvent(@NotNull EventFwCheckResult result) {
        HMLog.debug(getTAG(), new j(result));
        if (result.isSuccess) {
            getMViewModel().loadRedDot();
        }
    }

    public final void onEvent(@NotNull EarbudMusicDownloadEvent event) {
        getMViewModel().refreshCloudMusic();
        getMViewModel().refreshDeviceMusic();
        if (event.isStart()) {
            return;
        }
        getMViewModel().loadDeviceMusic();
    }
}
