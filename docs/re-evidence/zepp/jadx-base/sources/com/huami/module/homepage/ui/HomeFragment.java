package com.huami.module.homepage.ui;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicestylepower.DeviceStyle;
import com.huami.devicestylepower.DeviceStyleKt;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.FragmentTrackHelper;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.cards.CardFragment;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.homepage.cards.helper.RouterHelperKt;
import com.huami.module.homepage.databinding.HomepageFragmentHomeBinding;
import com.huami.module.homepage.sync.HomeViewModel;
import com.huami.module.homepage.sync.manager.IDeviceSyncManagerKt;
import com.huami.module.homepage.sync.manager.IHomeLifecycleAndMedalManager;
import com.huami.module.homepage.sync.manager.RomEntry;
import com.huami.module.homepage.sync.status.AGPSUpgradedEvent;
import com.huami.module.homepage.sync.status.AGPSUpgradedFwEvent;
import com.huami.module.homepage.sync.status.AGPSUpgradingEvent;
import com.huami.module.homepage.sync.status.AccountStatusEvent;
import com.huami.module.homepage.sync.status.BatteryChangeEvent;
import com.huami.module.homepage.sync.status.BindSyncEvent;
import com.huami.module.homepage.sync.status.BluetoothEvent;
import com.huami.module.homepage.sync.status.ConnectFailSyncEvent;
import com.huami.module.homepage.sync.status.ConnectedSyncEvent;
import com.huami.module.homepage.sync.status.ConnectingSyncEvent;
import com.huami.module.homepage.sync.status.ErrorCode;
import com.huami.module.homepage.sync.status.ErrorCodeKt;
import com.huami.module.homepage.sync.status.MajorSyncErrorEvent;
import com.huami.module.homepage.sync.status.MajorSyncSuccessEvent;
import com.huami.module.homepage.sync.status.MajorSyncingEvent;
import com.huami.module.homepage.sync.status.PrimaryDeviceUpdateEvent;
import com.huami.module.homepage.sync.status.RomUpdateEvent;
import com.huami.module.homepage.sync.status.SyncEvent;
import com.huami.module.homepage.sync.view.refresh.HomeRefreshAnimator;
import com.huami.module.homepage.sync.view.refresh.HomeRefreshLayout;
import com.huami.module.homepage.sync.view.refresh.ToastAnimation;
import com.huami.module.homepage.sync.view.rom.RomUpdateFragment;
import com.huami.module.homepage.ui.HomeFragment;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HandlerExceptionScopeKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.ContextExtKt;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.HMSpannable;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.notification.TransportUri;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.homepage.status.utils.MainAnalytics;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 o2\u00020\u0001:\u0002oEB\u0007¢\u0006\u0004\bm\u0010nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0007\u001a\u00020\u0002*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\b\u0010 \u001a\u00020\u0002H\u0002J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\fH\u0002J\u0018\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020#2\u0006\u0010(\u001a\u00020\fH\u0002J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0002J\u0012\u0010.\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020#H\u0002J\u001a\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020*2\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0002J\u001c\u00102\u001a\u00020\u00022\b\b\u0001\u00101\u001a\u00020#2\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0002J$\u00109\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\b\u00106\u001a\u0004\u0018\u0001052\b\u00108\u001a\u0004\u0018\u000107H\u0016J\b\u0010:\u001a\u00020\u0002H\u0016J\u001a\u0010<\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u000107H\u0016J\b\u0010=\u001a\u00020\u0002H\u0016J\b\u0010>\u001a\u00020\u0002H\u0016J\u0010\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\fH\u0017J\u0010\u0010B\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\fH\u0016J\b\u0010C\u001a\u00020\u0002H\u0016R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001d\u0010Q\u001a\u00020L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010T\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010UR\u001d\u0010[\u001a\u00020W8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010N\u001a\u0004\bY\u0010ZR\u001d\u0010^\u001a\u00020\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010 R\u0016\u0010d\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010g\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010fR\u0016\u0010j\u001a\u00020h8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010iR\u0016\u0010l\u001a\u00020D8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010k¨\u0006p"}, d2 = {"Lcom/huami/module/homepage/ui/HomeFragment;", "Landroidx/fragment/app/Fragment;", "", "e", "Landroid/view/View;", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "g", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, DTransferConstants.SEARCH_KEY, "G", "", "t", GoogleApiAvailabilityLight.a, "x", SOAP.XMLNS, "F", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "syncEvent", "H", "Lcom/huami/module/homepage/sync/status/ErrorCode;", "errorCode", "showPowerAndStyle", "o", "Lcom/huami/module/homepage/sync/status/BluetoothEvent;", "event", GoogleApiAvailabilityLight.b, "r", "u", "w", "K", "J", "showBatteryPower", "N", "", "leftPower", "rightPower", "Landroid/text/SpannableStringBuilder;", LogUtil.I, "powerIsLow", "l", "", "status", "M", "statusId", "L", "toastText", "C", "toastTextId", "B", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onDestroyView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "onPause", "isVisibleToUser", "setUserVisibleHint", "hidden", "onHiddenChanged", "onDestroy", "Lcom/huami/module/homepage/databinding/HomepageFragmentHomeBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageFragmentHomeBinding;", "_binding", "Lcom/huami/module/homepage/sync/view/refresh/ToastAnimation;", "b", "Lcom/huami/module/homepage/sync/view/refresh/ToastAnimation;", "toastAnimation", "Lcom/huami/module/homepage/sync/HomeViewModel;", "c", "Lkotlin/Lazy;", "m", "()Lcom/huami/module/homepage/sync/HomeViewModel;", "vm", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "primaryDeviceType", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "currentSyncEvent", "Lcom/huami/module/homepage/sync/manager/IHomeLifecycleAndMedalManager;", "f", z.j, "()Lcom/huami/module/homepage/sync/manager/IHomeLifecycleAndMedalManager;", "lifecycleAndMedalManager", hl.k, "()Landroidx/fragment/app/Fragment;", "promotionFragment", "", "h", "startRefreshTime", "i", "Z", "needStopRefresh", "Lcom/huami/module/homepage/ui/HomeFragment$a;", "Lcom/huami/module/homepage/ui/HomeFragment$a;", "currentShowState", "Lcom/huami/module/homepage/analytics/FragmentTrackHelper;", "Lcom/huami/module/homepage/analytics/FragmentTrackHelper;", "trackHelper", "()Lcom/huami/module/homepage/databinding/HomepageFragmentHomeBinding;", "binding", "<init>", "()V", "Companion", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class HomeFragment extends Fragment {

    @NotNull
    private static final String l = "";
    private static final int m = 500;
    private static final int n = 400;
    private static final int o = 20;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HomepageFragmentHomeBinding _binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ToastAnimation toastAnimation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType primaryDeviceType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SyncEvent currentSyncEvent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy lifecycleAndMedalManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy promotionFragment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long startRefreshTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean needStopRefresh;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private a currentShowState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final FragmentTrackHelper trackHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorCode.values().length];
            iArr[ErrorCode.TYPE_NO_DEVICE.ordinal()] = 1;
            iArr[ErrorCode.TYPE_SENSORHUB_SYNC_FAILED.ordinal()] = 2;
            iArr[ErrorCode.TYPE_BLUETOOTH_OFF.ordinal()] = 3;
            iArr[ErrorCode.TYPE_SPORT_WATCH_SYNC_FAILED.ordinal()] = 4;
            iArr[ErrorCode.TYPE_MUSIC_ALIVE_FAILED.ordinal()] = 5;
            iArr[ErrorCode.ERROR_AGPS_SYNC.ordinal()] = 6;
            iArr[ErrorCode.ERROR_NETWORK.ordinal()] = 7;
            iArr[ErrorCode.TYPE_CONNECT_TIMEOUT.ordinal()] = 8;
            iArr[ErrorCode.ERROR_FORBIDDEN_SYNC_DATA.ordinal()] = 9;
            iArr[ErrorCode.TYPE_MILI_SYNC_FAILED.ordinal()] = 10;
            iArr[ErrorCode.TYPE_WATCH_SYNC_FAILED.ordinal()] = 11;
            iArr[ErrorCode.TYPE_SHOES_SYNC_FAILED.ordinal()] = 12;
            iArr[ErrorCode.TYPE_SYNC_DATA_FAIL.ordinal()] = 13;
            iArr[ErrorCode.ERROR_OTHER.ordinal()] = 14;
            iArr[ErrorCode.ERROR_NO_BLUETOOTH.ordinal()] = 15;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/huami/module/homepage/ui/HomeFragment$a", "", "Lcom/huami/module/homepage/ui/HomeFragment$a;", "<init>", "(Ljava/lang/String;I)V", NoticesEntity.LOOP_TYPE_NONE, "ON_FOREGROUND", "ON_RESUME", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public enum a {
        NONE,
        ON_FOREGROUND,
        ON_RESUME
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "errorCode", "showPowerAndStyle", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<Boolean, Integer, Boolean, Unit> {
        public b() {
            super(3);
        }

        public final void a(boolean z, int i, boolean z2) {
            if (z) {
                if (HomeFragment.this.currentSyncEvent instanceof BindSyncEvent) {
                    HomeFragment.this.M("");
                    return;
                } else {
                    HomeFragment.this.J();
                    return;
                }
            }
            if (ErrorCodeKt.errorCode(i) == ErrorCode.TYPE_SYNC_DATA_FAIL) {
                HomeFragment.this.J();
            } else {
                HomeFragment.this.o(ErrorCodeKt.errorCode(i), z2);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num, Boolean bool2) {
            a(bool.booleanValue(), num.intValue(), bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HomeFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HomeFragment homeFragment) {
                super(0);
                this.a = homeFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "HomeFragment--> animator timeout:" + this.a.currentSyncEvent;
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
                return "EARBUD 耳机设备无连接超时逻辑";
            }
        }

        public c() {
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
            HMLog.error$default("HomePage", null, null, new a(HomeFragment.this), 6, null);
            if (HomeFragment.this.primaryDeviceType == HMDeviceType.EARBUD && (HomeFragment.this.currentSyncEvent instanceof ConnectingSyncEvent)) {
                HMLog.warn$default("HomePage", null, b.a, 2, null);
                return;
            }
            SyncEvent syncEvent = HomeFragment.this.currentSyncEvent;
            if (syncEvent instanceof ConnectingSyncEvent ? true : syncEvent instanceof ConnectFailSyncEvent) {
                HomeFragment.v(HomeFragment.this, ErrorCode.TYPE_CONNECT_TIMEOUT, false, 2, null);
                return;
            }
            if (syncEvent instanceof ConnectedSyncEvent ? true : syncEvent instanceof MajorSyncingEvent ? true : syncEvent instanceof MajorSyncErrorEvent) {
                HomeFragment.v(HomeFragment.this, ErrorCode.TYPE_SYNC_DATA_FAIL, false, 2, null);
                return;
            }
            if (syncEvent instanceof MajorSyncSuccessEvent ? true : syncEvent instanceof AGPSUpgradingEvent) {
                HomeFragment.v(HomeFragment.this, ErrorCode.ERROR_AGPS_SYNC, false, 2, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
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
            if (HomeUtils.isMifitApp()) {
                StatusAnalyticsKt.recordEvent(HomeAnalytics.HOME_TOP_ADD_C, new Pair[0]);
                RouterHelperKt.executeRoute$default(HomeFragment.this.requireContext(), RouterHelper.DEVICE_SELECT_PATH, new Pair[0], null, 8, null);
            } else {
                StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_ALLDATA_C, new Pair[0]);
                RouterHelperKt.executeRoute$default(HomeFragment.this.requireContext(), RouterHelper.ALL_DATA_PATH, new Pair[0], null, 8, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
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
            HomeFragment.this.get_binding().homepageScroll.smoothScrollTo(0, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public f() {
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
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_DEVICE_C, TuplesKt.to("status", Integer.valueOf(HomeFragment.this.m().deviceIsConnected(HomeFragment.this.primaryDeviceType) ? 1 : 0)));
            HomeUtils.executorDeviceJump(HomeFragment.this.requireContext(), HomeFragment.this.primaryDeviceType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ BluetoothEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BluetoothEvent bluetoothEvent) {
            super(0);
            this.a = bluetoothEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "HomeFragment--> 蓝牙状态改变：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Unit> {

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
                return "未绑定任何设备";
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
                return "正在连接同步中，无需后续操作";
            }
        }

        public h() {
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
            HMDeviceType hMDeviceType = HomeFragment.this.primaryDeviceType;
            HMDeviceType hMDeviceType2 = HMDeviceType.VDevice;
            if (!(hMDeviceType == hMDeviceType2 || HomeFragment.this.primaryDeviceType == HMDeviceType.SENSORHUB || HomeFragment.this.r()) || HomeFragment.this.t()) {
                HomeFragment.this.G();
                return;
            }
            if (HomeFragment.this.primaryDeviceType == hMDeviceType2 && HomeFragment.this.r()) {
                HomeFragment.this.w();
            } else if (HomeFragment.this.primaryDeviceType == hMDeviceType2 || HomeFragment.this.primaryDeviceType == HMDeviceType.SENSORHUB) {
                HMLog.info("HomePage", a.a);
            } else {
                HMLog.info("HomePage", b.a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<ParametersHolder> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ParametersHolder getA() {
            return ParametersHolderKt.parametersOf(HomeFragment.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/module/homepage/sync/status/SyncEvent;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<SyncEvent, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SyncEvent a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SyncEvent syncEvent) {
                super(0);
                this.a = syncEvent;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "HomeFragment--> " + this.a;
            }
        }

        public j() {
            super(1);
        }

        public final void a(@NotNull SyncEvent syncEvent) {
            HMLog.info("HomePage", new a(syncEvent));
            boolean z = true;
            if (syncEvent instanceof BindSyncEvent) {
                BindSyncEvent bindSyncEvent = (BindSyncEvent) syncEvent;
                if (!bindSyncEvent.getBind() && bindSyncEvent.getType() == HomeFragment.this.primaryDeviceType) {
                    HomeFragment.this.needStopRefresh = true;
                    HomeFragment.this.get_binding().homepageSrl.autoRefresh();
                }
            } else if (syncEvent instanceof PrimaryDeviceUpdateEvent) {
                HomeFragment.this.primaryDeviceType = ((PrimaryDeviceUpdateEvent) syncEvent).getPrimaryHMDeviceType();
                if (HomeUtils.isMifitApp() || (HomeFragment.this.primaryDeviceType != HMDeviceType.VDevice && HomeFragment.this.primaryDeviceType != HMDeviceType.SENSORHUB)) {
                    z = false;
                }
                HomeFragment.this.get_binding().homepageConnectAnimator.showBindDeviceIcon(z);
            } else if (syncEvent instanceof ConnectingSyncEvent) {
                if (!HomeFragment.this.r()) {
                    HomeFragment.this.F();
                }
                HomeFragment.this.N(false);
                HomeFragment.this.L(R.string.homepage_connecting);
            } else if (syncEvent instanceof ConnectedSyncEvent) {
                if (((ConnectedSyncEvent) syncEvent).getSyncing()) {
                    HomeFragment.this.L(R.string.homepage_data_syncing);
                    HomeFragment.this.K();
                } else {
                    HomeFragment.this.w();
                }
            } else if (syncEvent instanceof ConnectFailSyncEvent) {
                HomeFragment.this.u(((ConnectFailSyncEvent) syncEvent).getCode(), false);
            } else if (syncEvent instanceof MajorSyncSuccessEvent) {
                HomeFragment.this.L(R.string.homepage_data_sync_success);
                if (!((MajorSyncSuccessEvent) syncEvent).getSupportGPS()) {
                    HomeFragment.this.w();
                }
                HomeFragment.this.K();
                HomeFragment.this.j().popMedalUi();
            } else if (syncEvent instanceof MajorSyncErrorEvent) {
                HomeFragment.this.u(((MajorSyncErrorEvent) syncEvent).getErrorCode(), true);
            } else if (syncEvent instanceof MajorSyncingEvent) {
                if (!HomeFragment.this.r()) {
                    HomeFragment.this.F();
                }
                HomeFragment.this.L(R.string.homepage_data_syncing);
            } else if (syncEvent instanceof AGPSUpgradingEvent) {
                if (!HomeFragment.this.r()) {
                    HomeFragment.this.F();
                }
                HomeFragment homeFragment = HomeFragment.this;
                homeFragment.M(homeFragment.getString(R.string.homepage_agps, Integer.valueOf(((AGPSUpgradingEvent) syncEvent).getPercent())));
            } else if (syncEvent instanceof AGPSUpgradedEvent) {
                if (((AGPSUpgradedEvent) syncEvent).getSuccess()) {
                    HomeFragment.this.w();
                } else {
                    HomeFragment.this.u(ErrorCode.ERROR_AGPS_SYNC, true);
                }
            } else if (syncEvent instanceof AGPSUpgradedFwEvent) {
                HomeFragment.this.J();
            } else if (syncEvent instanceof BatteryChangeEvent) {
                if (!HomeFragment.this.get_binding().homepageConnectAnimator.checkIsAnimating()) {
                    HomeFragment.this.J();
                }
            } else if (syncEvent instanceof BluetoothEvent) {
                HomeFragment.this.n((BluetoothEvent) syncEvent);
            } else if (!(syncEvent instanceof AccountStatusEvent) && (syncEvent instanceof RomUpdateEvent)) {
                HomeFragment.this.m().checkRomUpdate();
            }
            HomeFragment.this.H(syncEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SyncEvent syncEvent) {
            a(syncEvent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "HomeFragment---> onResume()";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "HomeFragment---> 自动执行下拉同步数据操作";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Unit> {

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
                return "HomeFragment InForegroundListener...";
            }
        }

        public m() {
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
            HMLog.info("HomePage", a.a);
            HomeFragment.this.currentShowState = a.ON_FOREGROUND;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<Unit> {
        public n() {
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
            HomeFragment.this.m().skipRomUpdate();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<Unit> {
        public o() {
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
            HomeFragment.this.m().startRomUpdate();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<Unit> {
        public p() {
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
            if (HomeFragment.this._binding != null) {
                HomeFragment.this.J();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "duration", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<Long, Unit> {
        public static final q a = new q();

        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            new CalculationEventBuilder(StatEvent.BASE_TAB_T, j).addExtra("tp", MainAnalytics.HOME_TP).addExtra("time", String.valueOf(j));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<Unit> {
        public static final r a = new r();

        public r() {
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
            StatusAnalyticsKt.recordEvent(HomeAnalytics.BASE_TAB_V, TuplesKt.to("tp", MainAnalytics.HOME_TP));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public static final s a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "HomeFragment---> 开始同步设备";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.module.homepage.ui.HomeFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.vm = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HomeViewModel>() { // from class: com.huami.module.homepage.ui.HomeFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.module.homepage.sync.HomeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final HomeViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(HomeViewModel.class), function0, objArr);
            }
        });
        this.primaryDeviceType = HMDeviceType.VDevice;
        final i iVar = new i();
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.lifecycleAndMedalManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<IHomeLifecycleAndMedalManager>() { // from class: com.huami.module.homepage.ui.HomeFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.module.homepage.sync.manager.IHomeLifecycleAndMedalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final IHomeLifecycleAndMedalManager getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(IHomeLifecycleAndMedalManager.class), objArr2, iVar);
            }
        });
        final StringQualifier stringQualifierNamed = QualifierKt.named("HomePagePromotion");
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.promotionFragment = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<Fragment>() { // from class: com.huami.module.homepage.ui.HomeFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(Fragment.class), stringQualifierNamed, objArr3);
            }
        });
        this.currentShowState = a.NONE;
        this.trackHelper = new FragmentTrackHelper(this, q.a, r.a);
    }

    private final void A() {
        ViewGroup.LayoutParams layoutParams = get_binding().homepageBarAvatar.getLayoutParams();
        layoutParams.height = BaseTitleActivity.getStatusBarHeight(requireContext());
        get_binding().homepageBarAvatar.setLayoutParams(layoutParams);
    }

    private final void B(@StringRes int toastTextId, boolean showPowerAndStyle) {
        C(getString(toastTextId), showPowerAndStyle);
    }

    private final void C(String toastText, boolean showPowerAndStyle) {
        M("");
        if (!getUserVisibleHint()) {
            if (showPowerAndStyle) {
                J();
            }
        } else {
            if (this._binding == null) {
                return;
            }
            if (this.toastAnimation == null) {
                this.toastAnimation = new ToastAnimation(requireContext(), getViewLifecycleOwner());
            }
            if (showPowerAndStyle) {
                this.toastAnimation.exitListener(new p());
            } else {
                this.toastAnimation.exitListener(null);
            }
            ToastAnimation toastAnimation = this.toastAnimation;
            if (toastAnimation == null) {
                return;
            }
            if (toastAnimation.isShowing()) {
                toastAnimation.dismiss();
            }
            toastAnimation.show(get_binding().homepageImageview, toastText);
        }
    }

    public static /* synthetic */ void D(HomeFragment homeFragment, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        homeFragment.B(i2, z);
    }

    public static /* synthetic */ void E(HomeFragment homeFragment, String str, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        homeFragment.C(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        if (System.currentTimeMillis() - this.startRefreshTime < 400) {
            return;
        }
        this.startRefreshTime = System.currentTimeMillis();
        get_binding().homepageConnectAnimator.startRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        get_binding().homepageConnectAnimator.startRefresh();
        HMLog.info("HomePage", s.a);
        N(false);
        M("");
        m().startSyncData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(SyncEvent syncEvent) {
        if (syncEvent instanceof BindSyncEvent ? true : syncEvent instanceof ConnectingSyncEvent ? true : syncEvent instanceof ConnectFailSyncEvent ? true : syncEvent instanceof ConnectedSyncEvent ? true : syncEvent instanceof MajorSyncingEvent ? true : syncEvent instanceof MajorSyncSuccessEvent ? true : syncEvent instanceof MajorSyncErrorEvent ? true : syncEvent instanceof AGPSUpgradingEvent ? true : syncEvent instanceof AGPSUpgradedEvent ? true : syncEvent instanceof AGPSUpgradedFwEvent) {
            this.currentSyncEvent = syncEvent;
        }
    }

    private final SpannableStringBuilder I(int leftPower, int rightPower) {
        int iL = l(leftPower >= 0 && leftPower <= 20);
        int iL2 = l(rightPower >= 0 && rightPower <= 20);
        HMSpannable hMSpannable = new HMSpannable();
        int i2 = R.string.homepage_power_earphone_left;
        Object[] objArr = new Object[1];
        objArr[0] = leftPower == -1 ? "--" : I18nKt.i18n(leftPower);
        HMSpannable hMSpannableAddSpaceBlank = HMSpannable.append$default(hMSpannable, getString(i2, objArr), Integer.valueOf(iL), null, false, null, null, null, 124, null).addSpaceBlank();
        int i3 = R.string.homepage_power_earphone_right;
        Object[] objArr2 = new Object[1];
        objArr2[0] = rightPower != -1 ? I18nKt.i18n(rightPower) : "--";
        return HMSpannable.append$default(hMSpannableAddSpaceBlank, getString(i3, objArr2), Integer.valueOf(iL2), null, false, null, null, null, 124, null).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        DeviceStyle powerAndStyle = m().getPowerAndStyle(this.primaryDeviceType);
        get_binding().homepageConnectAnimator.updatePower(powerAndStyle);
        TextView textView = get_binding().homepageDeviceStatus;
        CharSequence string = "";
        if (powerAndStyle == null) {
            textView.setText("");
            return;
        }
        N(true);
        if (powerAndStyle instanceof DeviceStyle.Chopin) {
            DeviceStyle.Chopin chopin = (DeviceStyle.Chopin) powerAndStyle;
            if (chopin.getLeftElectricityRatio() != -1 && chopin.getRightElectricityRatio() != -1) {
                string = I(chopin.getLeftElectricityRatio(), chopin.getRightElectricityRatio());
            }
        } else if (powerAndStyle instanceof DeviceStyle.Mozart) {
            DeviceStyle.Mozart mozart = (DeviceStyle.Mozart) powerAndStyle;
            string = I(mozart.getLeftElectricityRatio(), mozart.getRightElectricityRatio());
        } else if (powerAndStyle instanceof DeviceStyle.Haydn) {
            DeviceStyle.Haydn haydn = (DeviceStyle.Haydn) powerAndStyle;
            string = I(haydn.getLeftElectricityRatio(), haydn.getRightElectricityRatio());
        } else if (!(powerAndStyle instanceof DeviceStyle.Treadmill) && DeviceStyleKt.getSingleBatteryRatio(powerAndStyle) != -1) {
            textView.setTextColor(l(DeviceStyleKt.getSingleBatteryRatio(powerAndStyle) <= 20));
            string = getString(R.string.homepage_power, Integer.valueOf(DeviceStyleKt.getSingleBatteryRatio(powerAndStyle)));
        }
        textView.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        get_binding().homepageConnectAnimator.updateRefreshTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(@StringRes int statusId) {
        M(getString(statusId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String status) {
        TextView textView = get_binding().homepageDeviceStatus;
        textView.setTextColor(ContextExtKt.loadColor(textView.getContext(), HomeUtils.isMifitApp() ? R.color.s38 : R.color.s1));
        textView.setText(status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(boolean showBatteryPower) {
        get_binding().homepageDeviceStatus.setTypeface(showBatteryPower ? HomeUtils.getMaisonTypeface() : null);
    }

    private final void d() {
        HomeRefreshAnimator homeRefreshAnimator = get_binding().homepageConnectAnimator;
        homeRefreshAnimator.animatorEndListener(new b());
        homeRefreshAnimator.animatorTimeoutListener(new c());
    }

    private final void e() {
        ExteranelKt.setOnClickWithPolicyListener(get_binding().homepageAllDataIv, new d());
        get_binding().homepageSleepAid.setOnClickListener(new View.OnClickListener() { // from class: g84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeFragment.f(this.a, view);
            }
        });
        g(get_binding().homepageStatus, new e());
        get_binding().homepageConnectAnimator.setIconClickListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HomeFragment homeFragment, View view) {
        StatusAnalyticsKt.recordEvent(HomeAnalytics.HOME_TOP_ASST_C, new Pair[0]);
        RouterHelperKt.executeRoute$default(homeFragment.requireContext(), RouterHelper.SLEEP_ASSISTANT_PATH, new Pair[0], null, 8, null);
    }

    private final void g(View view, final Function0<Unit> function0) {
        final Ref.LongRef longRef = new Ref.LongRef();
        view.setOnClickListener(new View.OnClickListener() { // from class: h84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment.h(longRef, function0, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Ref.LongRef longRef, Function0 function0, View view) {
        if (System.currentTimeMillis() - longRef.element < 500) {
            function0.getA();
        }
        longRef.element = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: from getter */
    public final HomepageFragmentHomeBinding get_binding() {
        return this._binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IHomeLifecycleAndMedalManager j() {
        return (IHomeLifecycleAndMedalManager) this.lifecycleAndMedalManager.getValue();
    }

    private final Fragment k() {
        return (Fragment) this.promotionFragment.getValue();
    }

    private final int l(boolean powerIsLow) {
        int i2;
        Context contextRequireContext = requireContext();
        if (HomeUtils.isMifitApp()) {
            i2 = R.color.s38;
        } else {
            i2 = powerIsLow ? R.color.s51 : R.color.s1;
        }
        return ContextExtKt.loadColor(contextRequireContext, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeViewModel m() {
        return (HomeViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(BluetoothEvent event) {
        HMLog.info("HomePage", new g(event));
        if (event.isEnabled()) {
            get_binding().homepageSrl.autoRefresh();
            return;
        }
        if (r()) {
            u(ErrorCode.TYPE_BLUETOOTH_OFF, false);
            return;
        }
        HMDeviceType hMDeviceType = this.primaryDeviceType;
        if (hMDeviceType == HMDeviceType.VDevice || hMDeviceType == HMDeviceType.SENSORHUB) {
            return;
        }
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(ErrorCode errorCode, boolean showPowerAndStyle) {
        switch (WhenMappings.$EnumSwitchMapping$0[errorCode.ordinal()]) {
            case 1:
            case 2:
                M("");
                break;
            case 3:
                B(R.string.homepage_bluetooth_off, showPowerAndStyle);
                break;
            case 4:
                B(R.string.homepage_doing_sport, showPowerAndStyle);
                break;
            case 5:
                B(R.string.homepage_playing_music, showPowerAndStyle);
                break;
            case 6:
                B(R.string.homepage_agps_fail, showPowerAndStyle);
                break;
            case 7:
            case 8:
                B(R.string.homepage_connect_fail, showPowerAndStyle);
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                B(R.string.homepage_data_sync_fail, showPowerAndStyle);
                break;
            case 15:
                B(R.string.homepage_data_sync_no_bluetooth, showPowerAndStyle);
                break;
        }
    }

    public static /* synthetic */ void p(HomeFragment homeFragment, ErrorCode errorCode, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        homeFragment.o(errorCode, z);
    }

    private final void q() {
        get_binding().homepageRefreshHeader.startRefreshListener(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return get_binding().homepageConnectAnimator.checkIsAnimating();
    }

    private final void s() {
        IDeviceSyncManagerKt.deviceSyncListener(HandlerExceptionScopeKt.getLifecycleExceptionScope(this), new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t() {
        SyncEvent syncEvent = this.currentSyncEvent;
        return ((syncEvent instanceof ConnectingSyncEvent) || (syncEvent instanceof ConnectFailSyncEvent)) && m().deviceIsConnected(this.primaryDeviceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(ErrorCode errorCode, boolean showPowerAndStyle) {
        get_binding().homepageConnectAnimator.refreshFailure(errorCode.getCode(), showPowerAndStyle);
    }

    public static /* synthetic */ void v(HomeFragment homeFragment, ErrorCode errorCode, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        homeFragment.u(errorCode, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        if (r()) {
            get_binding().homepageConnectAnimator.refreshSuccess(m().getPowerAndStyle(this.primaryDeviceType));
        } else {
            J();
        }
    }

    private final void x() {
        m().getRomUpdate().observe(getViewLifecycleOwner(), new Observer() { // from class: i84
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HomeFragment.y(this.a, (RomEntry) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(HomeFragment homeFragment, RomEntry romEntry) {
        if (romEntry == null || !romEntry.getNeedUpdate()) {
            return;
        }
        if (romEntry.getSupportAutoUpdate()) {
            new RomUpdateFragment().skipButtonListener(homeFragment.new n()).updateButtonListener(homeFragment.new o()).show(romEntry.getUpdateMessage(), homeFragment.getParentFragmentManager());
        } else {
            homeFragment.m().loadOldRomUpdate(homeFragment.requireActivity());
        }
    }

    private final void z() {
        get_binding().homepageServerFault.setServerListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        m().initDeviceManager();
        HomepageFragmentHomeBinding homepageFragmentHomeBindingInflate = HomepageFragmentHomeBinding.inflate(inflater, container, false);
        if (HomeUtils.isMifitApp()) {
            homepageFragmentHomeBindingInflate.homepageImageview.setImageResource(R.drawable.homepage_home_background_mifit);
            TextView textView = homepageFragmentHomeBindingInflate.homepageDeviceStatus;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.endToStart = R.id.homepage_sleep_aid;
            Unit unit = Unit.INSTANCE;
            textView.setLayoutParams(layoutParams2);
            ViewExtKt.setVisible(homepageFragmentHomeBindingInflate.homepageLogo, false);
            ViewExtKt.setVisible(homepageFragmentHomeBindingInflate.homepageSleepAid, HomeUtils.isSimplifiedChineseUser());
            homepageFragmentHomeBindingInflate.homepageAllDataIv.setImageDrawable(ContextExtKt.loadDrawable$default(requireContext(), R.drawable.ic_add_20, R.color.s5, null, 4, null));
        } else {
            if (RainbowUtils.isDarkMode(requireContext())) {
                homepageFragmentHomeBindingInflate.homepageImageview.setImageResource(R.drawable.homepage_home_background_night);
            }
            homepageFragmentHomeBindingInflate.homepageAllDataIv.setImageDrawable(ContextExtKt.loadDrawable$default(requireContext(), R.drawable.ic_all_data_20, R.color.s1, null, 4, null));
        }
        Unit unit2 = Unit.INSTANCE;
        this._binding = homepageFragmentHomeBindingInflate;
        getChildFragmentManager().beginTransaction().replace(R.id.homepage_card_container, new CardFragment()).commit();
        getChildFragmentManager().beginTransaction().replace(R.id.homepage_promotion_container, k()).commit();
        return get_binding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.currentShowState = a.NONE;
        m().releaseDeviceManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ToastAnimation toastAnimation = this.toastAnimation;
        if (toastAnimation != null) {
            toastAnimation.destroy();
        }
        HomepageFragmentHomeBinding homepageFragmentHomeBinding = get_binding();
        homepageFragmentHomeBinding.homepageRefreshHeader.startRefreshListener(null);
        homepageFragmentHomeBinding.homepageConnectAnimator.animatorEndListener(null);
        homepageFragmentHomeBinding.homepageConnectAnimator.animatorTimeoutListener(null);
        ToastAnimation toastAnimation2 = this.toastAnimation;
        if (toastAnimation2 != null) {
            toastAnimation2.exitListener(null);
        }
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        this.trackHelper.trackOnHiddenChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.trackHelper.trackOnPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        HMDeviceType hMDeviceType;
        super.onResume();
        HMLog.info("HomePage", k.a);
        this.trackHelper.trackOnResume();
        a aVar = this.currentShowState;
        boolean z = aVar == a.NONE || aVar == a.ON_FOREGROUND;
        this.currentShowState = a.ON_RESUME;
        if (r() || this.needStopRefresh) {
            this.needStopRefresh = false;
            if (this.primaryDeviceType == HMDeviceType.VDevice || ((this.currentSyncEvent instanceof ConnectingSyncEvent) && m().deviceIsConnected(this.primaryDeviceType))) {
                w();
                return;
            }
            return;
        }
        if (!m().immediatelySyncDevice(this.primaryDeviceType)) {
            if (!m().deviceIsConnected(this.primaryDeviceType) || (hMDeviceType = this.primaryDeviceType) == HMDeviceType.VDevice || hMDeviceType == HMDeviceType.SENSORHUB) {
                return;
            }
            J();
            return;
        }
        if (z) {
            HomeRefreshLayout homeRefreshLayout = get_binding().homepageSrl;
            if (homeRefreshLayout.isRefreshing() || homeRefreshLayout.isLoading()) {
                return;
            }
            HMLog.info("HomePage", l.a);
            homeRefreshLayout.autoRefresh();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        A();
        getLifecycle().addObserver(j());
        m().updatePrimaryDeviceType();
        q();
        d();
        s();
        x();
        z();
        e();
        j().setInForegroundListener(new m());
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Java")
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.trackHelper.trackOnUserVisibleHint();
    }
}
