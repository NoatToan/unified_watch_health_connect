package com.xiaomi.hm.health.mainpage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.XiaomiTokenMananger;
import com.huami.account.event.EventAccountStatus;
import com.huami.account.event.NextAction;
import com.huami.account.service.AccountComponent;
import com.huami.account.service.AccountService;
import com.huami.account.service.UserInfoService;
import com.huami.account.service.lifecycle.AccountLifecycle;
import com.huami.account.service.lifecycle.AccountLifecycleObserver;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.ad.entity.HomePageNotify;
import com.huami.ad.repo.AdCardRepo;
import com.huami.ad.utils.EventAdDownloadFinished;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.moving.hkwebapi.StrengthTrainingAPI;
import com.huami.snore.core.manager.SnoreDataManager;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.utils.AccessDoorUI;
import com.huami.wallet.ui.utils.WalletUI;
import com.huami.watch.companion.sport.event.PBInfoChangedEvent;
import com.huami.watch.companion.sport.pb.PBManager;
import com.huami.watch.companion.update.UpdateManager;
import com.huami.watch.dataflow.event.HealthDataUpdatedEvent;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.util.RxBus;
import com.huami.web.container.event.EventWebViewExit;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.BindWiFISettingHelper;
import com.xiaomi.hm.health.device.DeviceGpsHelper;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMUnbindDeviceActivity;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchLogic;
import com.xiaomi.hm.health.device.event.EventWHTypeChanged;
import com.xiaomi.hm.health.device.event.HMDeviceAuthEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.HMDeviceVibrateEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.device.service.HMCoreService;
import com.xiaomi.hm.health.device.webapi.ExperienceDevAPI;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.eventbus.EventAppInBackground;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.eventbus.EventChangeTab;
import com.xiaomi.hm.health.eventbus.EventDetailBack;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.lightappstore.LightAppStore;
import com.xiaomi.hm.health.locweather.event.LocationEvent;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import com.xiaomi.hm.health.mainpage.MainEventManager;
import com.xiaomi.hm.health.manager.ExternalLogoutManager;
import com.xiaomi.hm.health.manager.HMAdManager;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.notification.AppNotification;
import com.xiaomi.hm.health.training.PromotionalCourseAdHelper;
import com.xiaomi.hm.health.ui.smartplay.AvoidSpiteBindingHelper;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import com.xiaomi.hm.health.utils.AppRateDialogHelper;
import com.xiaomi.hm.health.utils.AudioUtils;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\b\u0007*\u0001?\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0011\b\u0002\u0012\u0006\u0010'\u001a\u00020\"¢\u0006\u0004\bB\u0010CJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0007J\b\u0010\b\u001a\u00020\u0003H\u0007J)\u0010\u000f\u001a\u00020\u00032!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\tJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0014J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0016J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0017J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0018J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0019J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001aJ\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001bJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001cJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001fJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020 J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020!R\u0019\u0010'\u001a\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010-\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010*\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00102\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010*R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010@¨\u0006E"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/MainEventManager;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/huami/account/service/AccountComponent;", "", "l", "m", "i", PointCategory.INIT, "release", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", TransportUri.ACTION_BLOCK, "tabChangeListener", "Lcom/xiaomi/hm/health/eventbus/EventChangeTab;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/eventbus/EventAppInBackground;", "Lcom/xiaomi/hm/health/locweather/event/LocationEvent;", "onEvent", "Lcom/xiaomi/hm/health/device/event/HMDeviceVibrateEvent;", "Lcom/huami/ad/utils/EventAdDownloadFinished;", "Lcom/xiaomi/hm/health/device/event/HMDeviceAuthEvent;", "Lcom/xiaomi/hm/health/eventbus/EventDetailBack;", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "Lcom/xiaomi/hm/health/eventbus/EventBluetooth;", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "Lcom/huami/account/event/NextAction;", "action", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "Lcom/huami/web/container/event/EventWebViewExit;", "Lcom/huami/account/event/EventAccountStatus;", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "b", "Z", "isInit", "c", "isBroughtToBackground", "()Z", "setBroughtToBackground", "(Z)V", GoogleApiAvailabilityLight.a, "loadHomeMsgEnable", "e", "Lkotlin/jvm/functions/Function1;", "Lio/reactivex/disposables/Disposable;", "f", "Lio/reactivex/disposables/Disposable;", "subscription", "", "g", "J", "latestUpdateCheckTime", "h", "showAuthKeyNotFound", "com/xiaomi/hm/health/mainpage/MainEventManager$accountLifecycleObserver$1", "Lcom/xiaomi/hm/health/mainpage/MainEventManager$accountLifecycleObserver$1;", "accountLifecycleObserver", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MainEventManager implements LifecycleObserver, AccountComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int j = 300000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isInit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isBroughtToBackground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean loadHomeMsgEnable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Integer, Unit> tabChangeListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Disposable subscription;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long latestUpdateCheckTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean showAuthKeyNotFound;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MainEventManager$accountLifecycleObserver$1 accountLifecycleObserver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/MainEventManager$Companion;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/xiaomi/hm/health/mainpage/MainEventManager;", "create", "", "CHECK_UPDATE_LIMIT_TIME", LogUtil.I, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MainEventManager create(@NotNull AppCompatActivity activity) {
            return new MainEventManager(activity, null);
        }
    }

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
            return "MainEventManager---> loading";
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
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "=================onEnterInForeground=================";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "应用进前台";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "sporting, don't request network";
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
            return "browsing wallet page, don't request network";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "browsing accessDoor page, don't request network";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "request status card ad";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ MyLocation a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MyLocation myLocation) {
            super(0);
            this.a = myLocation;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Current location: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/ad/entity/HomePageNotify;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<List<? extends HomePageNotify>, Unit> {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends HomePageNotify> list) {
            invoke2((List<HomePageNotify>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<HomePageNotify> list) {
            MainEventManager.this.loadHomeMsgEnable = false;
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
            return "收到changeTab event";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceConnectionEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
            super(0);
            this.a = hMDeviceConnectionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Connect event:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Weight event:" + this.a.getMDeviceSource() + ":" + this.a.getDeviceInfo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "setMenstrualNotifiedDataListener";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onEvent, relogin success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.mainpage.MainEventManager$onEventMainThread$8", f = "MainEventManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StrengthTrainingAPI.getSportConfigAPI(BraceletApp.getContext());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.xiaomi.hm.health.mainpage.MainEventManager$accountLifecycleObserver$1] */
    private MainEventManager(AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
        this.loadHomeMsgEnable = true;
        appCompatActivity.getLifecycle().addObserver(this);
        this.showAuthKeyNotFound = true;
        this.accountLifecycleObserver = new AccountLifecycleObserver() { // from class: com.xiaomi.hm.health.mainpage.MainEventManager$accountLifecycleObserver$1
            @Override // com.huami.account.service.lifecycle.AccountLifecycleObserver
            public void onChanged(@NotNull AccountLifecycle.State state) {
                if (state instanceof AccountLifecycle.State.NewUser) {
                    this.a.getActivity().finish();
                }
            }
        };
    }

    public /* synthetic */ MainEventManager(AppCompatActivity appCompatActivity, DefaultConstructorMarker defaultConstructorMarker) {
        this(appCompatActivity);
    }

    @JvmStatic
    @NotNull
    public static final MainEventManager create(@NotNull AppCompatActivity appCompatActivity) {
        return INSTANCE.create(appCompatActivity);
    }

    private final void i() {
        this.subscription = RxBus.get().toObservable().subscribe(new Consumer() { // from class: ou4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MainEventManager.k(this.a, obj);
            }
        }, new Consumer() { // from class: pu4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MainEventManager.j((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Throwable th) {
        HMLog.warn("MainTabActivity", th, b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MainEventManager mainEventManager, Object obj) {
        if (obj instanceof HealthDataUpdatedEvent) {
            if (((HealthDataUpdatedEvent) obj).onlyUpdateHRIsAllDay) {
                EventBus.getDefault().post(new EventWHTypeChanged());
            }
        } else if ((obj instanceof PBInfoChangedEvent) && PBManager.get().hasUnconfirmed(mainEventManager.getActivity())) {
            ((MainTabActivity) mainEventManager.getActivity()).setMineReDotVisibleForSport();
        }
    }

    private final void l() {
        HMLog.flush();
        HMPropertyUtil.postPropertisToServer(false);
        HMKeeper.setActiveHistory(1);
        HMKeeper.setEnterAppState(1);
        HMDataCacheCenter.getInstance().checkNeedSyncData();
        if (!GPSDataController.getInstance().isRunning()) {
            HMDeviceManager.getInstance().enableRealtimeStep(false, HMDeviceType.MILI);
        }
        XiaomiTokenMananger.getAppXiaomiAccessToken(null, false);
        XiaomiTokenMananger.refreshAllDeviceToken();
    }

    private final void m() {
        HMLog.info("MainTabActivity", c.a);
        HMLog.debug("MainTabActivity", d.a);
        new Handler().postDelayed(new Runnable() { // from class: qu4
            @Override // java.lang.Runnable
            public final void run() {
                MainEventManager.n();
            }
        }, 1000L);
        HMDeviceManager.getInstance().enableRealtimeStep(true, HMDeviceType.MILI);
        if (GPSDataController.getInstance().isRunning()) {
            HMLog.info("MainTabActivity", e.a);
            return;
        }
        if (WalletUI.getInstance().isInWallet()) {
            HMLog.info("MainTabActivity", f.a);
            return;
        }
        if (AccessDoorUI.getInstance().isInAccessDoor()) {
            HMLog.info("MainTabActivity", g.a);
            return;
        }
        if (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE) {
            HMFwOnlineManager.getInstance().checkAll();
        } else {
            NetFwUpgradeManager.checkFwFromServerAsync(false);
        }
        HMDataCacheCenter.getInstance().initNetData();
        MiuiAPI.checkMiuiNotify(this.activity);
        if (!Utils.isServiceRunning(this.activity, HMCoreService.class.getName()) || !DeviceCenter.getInstance().hasInit()) {
            BraceletApp.initService();
        }
        WatchManager.INSTANCE.checkWatchManager(this.activity);
        if (!this.isInit) {
            this.isInit = true;
        } else if (!GPSDataController.getInstance().isRunning()) {
            HMLog.debug("MainTabActivity", h.a);
            AdCardRepo.getInstance().requestHomePageAds(HMLoginManager.getRegion(), SelectAreaHelper.getArea().getValue(), Utils.shouldHideDiscovery());
        }
        HMAccountWebExtAPI.updateUserBirthday(true).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: ru4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MainEventManager.o(((Boolean) obj).booleanValue());
            }
        });
        if (System.currentTimeMillis() - this.latestUpdateCheckTime > 300000) {
            this.latestUpdateCheckTime = System.currentTimeMillis();
            UpdateManager.getInstance().checkUpdate(false, this.activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n() {
        AvoidSpiteBindingHelper.INSTANCE.checkWhenEnterForeground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(boolean z) {
        HMLog.debug("MainTabActivity", new i(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(MainEventManager mainEventManager, DialogInterface dialogInterface, int i2) {
        Intent intent = new Intent();
        intent.setClass(mainEventManager.getActivity(), HMUnbindDeviceActivity.class);
        intent.putExtra(HMUnbindDeviceActivity.UNBIND_TYPE_KEY, 3);
        mainEventManager.getActivity().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(boolean z) {
        HMLog.debug("MainTabActivity", new p(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Throwable th) {
    }

    @Override // com.huami.account.service.AccountComponent
    @NotNull
    public AccountLifecycle getAccountLifecycle() {
        return AccountComponent.DefaultImpls.getAccountLifecycle(this);
    }

    @Override // com.huami.account.service.AccountComponent
    @NotNull
    public AccountService getAccountService() {
        return AccountComponent.DefaultImpls.getAccountService(this);
    }

    @NotNull
    public final AppCompatActivity getActivity() {
        return this.activity;
    }

    @Override // com.huami.account.service.AccountComponent
    @NotNull
    public UserInfoService getUserInfoService() {
        return AccountComponent.DefaultImpls.getUserInfoService(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void init() {
        HMLog.info("MainTabActivity", a.a);
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().registerSticky(this);
        }
        i();
        getAccountLifecycle().addObserver(this.accountLifecycleObserver);
    }

    /* JADX INFO: renamed from: isBroughtToBackground, reason: from getter */
    public final boolean getIsBroughtToBackground() {
        return this.isBroughtToBackground;
    }

    public final void onEvent(@NotNull LocationEvent event) {
        MyLocation myLocation = event.location;
        HMLog.debug("MainTabActivity", new j(myLocation));
        if (!HMKeeper.getLocReady() && myLocation != null && Utils.shouldShowAd()) {
            HMKeeper.setLocReady(true);
            HMAdManager.initAdLogic();
        }
        if (myLocation != null && this.loadHomeMsgEnable) {
            HMAdManager.requestHomeMsg(HMLoginManager.getRegion(), SelectAreaHelper.getArea().getValue(), new k());
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
        if (device instanceof HMBaseBleDevice) {
            DeviceGpsHelper.Companion.INSTANCE.sendLocToDevice(myLocation, (HMBaseBleDevice) device);
        }
    }

    public final void onEventMainThread(@NotNull EventChangeTab event) {
        HMLog.info("MainTabActivity", l.a);
        Function1<? super Integer, Unit> function1 = this.tabChangeListener;
        if (function1 == null) {
            return;
        }
        function1.invoke(Integer.valueOf(event.getTabType()));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        Disposable disposable = this.subscription;
        if (disposable != null) {
            disposable.dispose();
        }
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        getAccountLifecycle().removeObserver(this.accountLifecycleObserver);
    }

    public final void setBroughtToBackground(boolean z) {
        this.isBroughtToBackground = z;
    }

    public final void tabChangeListener(@NotNull Function1<? super Integer, Unit> block) {
        this.tabChangeListener = block;
    }

    public final void onEventMainThread(@NotNull EventAppInBackground event) {
        boolean z = event.isInBackground;
        this.isBroughtToBackground = z;
        if (z) {
            l();
        } else {
            m();
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceVibrateEvent event) {
        if (HMPersonInfo.getInstance().getMiliConfig().isVibrate()) {
            AppNotification.newInstance().notifyDeviceVibrated(event.getVibrateType());
        }
    }

    public final void onEventMainThread(@NotNull EventAdDownloadFinished event) {
        if (event.isDownloadSuccessed() && RedDotManagerKt.isMainlandUser()) {
            PromotionalCourseAdHelper.INSTANCE.loadPromotionalCourses();
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceAuthEvent event) {
        if (event.getDeviceSource() == HMDeviceSource.OTHER_BM && event.getState().getInternalState() == 7 && this.showAuthKeyNotFound) {
            this.showAuthKeyNotFound = false;
            AlertDialogFragment.Builder negativeButton = new AlertDialogFragment.Builder(this.activity).setPositiveButton(R.string.rebind_weibo_health, new DialogInterface.OnClickListener() { // from class: mu4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MainEventManager.p(this.a, dialogInterface, i2);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: nu4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MainEventManager.q(dialogInterface, i2);
                }
            });
            negativeButton.setMessage(R.string.bluemonkey_connect_failed_as_key_loss);
            negativeButton.setCancelable(false);
            negativeButton.create().show(this.activity.getSupportFragmentManager());
        }
    }

    public final void onEvent(@NotNull HMDeviceSyncDataEvent event) {
        if ((event.isStop() && LBEResultAnalytics.INSTANCE.valid(event.getDeviceType()) ? event : null) == null) {
            return;
        }
        LBEResultAnalytics.INSTANCE.onEvent(event.getResult() ? "sync_success" : "sync_fail", event.getDeviceType());
    }

    public final void onEvent(@NotNull EventBluetooth event) {
        if (event.isOn) {
            return;
        }
        LBEResultAnalytics.onEvent$default(LBEResultAnalytics.INSTANCE, LBEResultAnalytics.BLE_EVT_OFF, null, 2, null);
    }

    public final void onEventMainThread(@NotNull EventDetailBack event) {
        if (event.getStatus() == 1) {
            AppRateDialogHelper.showWhenStart(this.activity);
        } else if (event.getStatus() == EventDetailBack.SPORT || event.getStatus() == EventDetailBack.HEART_RATE || event.getStatus() == EventDetailBack.SPORT_DETAIL) {
            AppRateDialogHelper.showWhenActivityStart(this.activity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        HMBaseDevice device;
        LBEResultAnalytics.INSTANCE.onConnectionEvent(event);
        HMLog.info("MainTabActivity", new m(event));
        if (event.isConnected()) {
            HMDeviceType deviceType = event.getDeviceType();
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (deviceType == hMDeviceType) {
                if (!this.isBroughtToBackground || GPSDataController.getInstance().isRunning()) {
                    HMDeviceManager.getInstance().enableRealtimeStep(true, hMDeviceType);
                }
                AudioUtils.getInstance().setRingMode();
            } else if (event.isConnected() && event.getDeviceType() == HMDeviceType.WEIGHT) {
                device = HMDeviceManager.getInstance().getDevice(event.getDeviceType());
                HMLog.info("MainTabActivity", new n(device));
                if (device.getMDeviceSource() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE) {
                    BindWiFISettingHelper.INSTANCE.initIWiFiController(device);
                }
            }
        } else if (event.isConnected()) {
            device = HMDeviceManager.getInstance().getDevice(event.getDeviceType());
            HMLog.info("MainTabActivity", new n(device));
            if (device.getMDeviceSource() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE) {
                BindWiFISettingHelper.INSTANCE.initIWiFiController(device);
            }
        }
        if (event.isConnected() && HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE && HMFwOnlineUpgradeManager.getInstance().useOnline(event.getDeviceType())) {
            HMFwOnlineManager.getInstance().checkFw(event.getDeviceType(), false);
        }
        if (event.isConnected()) {
            HMLog.info("MainTabActivity", o.a);
            FemaleListener.INSTANCE.setListener();
            LightAppStore.openBackgroundDartEntryPoint(this.activity.getApplicationContext());
        }
    }

    public final void onEventMainThread(@NotNull NextAction action) {
        HMLoginManager.showAction(this.activity);
    }

    public final void onEventMainThread(@NotNull HMDeviceBindEvent event) {
        if (event.isBound()) {
            HMKeeper.clearFwUpgradeDate();
            LightAppStore.openBackgroundDartEntryPoint(this.activity.getApplicationContext());
        }
        HMDeviceType deviceType = event.getDeviceType();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (deviceType == hMDeviceType) {
            if (event.isBound()) {
                FemaleListener.INSTANCE.setListener();
                HMDeviceManager.getInstance().enableRealtimeStep(true, hMDeviceType);
                AudioUtils.getInstance().setRingMode();
            }
            ExperienceDevAPI.updatePublicPreViewStatus();
        }
        if (event.isBound() && event.getDeviceType() == HMDeviceType.WATCH) {
            HMWatchLogic.getInstance().getWatchSettingProperties();
        }
    }

    public final void onEventMainThread(@NotNull EventWebViewExit event) {
        HMAccountWebExtAPI.updateUserBirthday(false).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: su4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MainEventManager.r(((Boolean) obj).booleanValue());
            }
        }, new Action1() { // from class: tu4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MainEventManager.s((Throwable) obj);
            }
        });
        HMLoginManager.initCountryCode(true);
    }

    public final void onEventMainThread(@NotNull EventAccountStatus event) {
        if (event.getStatus() == 2) {
            HMLog.info("MainTabActivity", q.a);
            if (!this.isBroughtToBackground) {
                HMKeeper.setActiveHistory(4);
            }
            ExternalLogoutManager.clearAllWeightInfos();
            HMKeeper.keepScaleSyncedUserInfosFromServer(false);
            HMKeeper.keepScaleSyncedWeightInfosFromServer(false);
            HMWeightUtils.syncWithServer(this.activity.getApplicationContext());
            UnitManager.getInstance().clear();
            HMDataCacheCenter.getInstance().reloadOnLoadSuccess();
            SnoreDataManager.instance.clearSnoreData(BraceletApp.getContext());
            return;
        }
        if (event.getStatus() == 1) {
            kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new r(null), 3, null);
        }
    }
}
