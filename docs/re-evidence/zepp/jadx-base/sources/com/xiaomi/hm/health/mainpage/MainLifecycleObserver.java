package com.xiaomi.hm.health.mainpage;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.UserInfoLegalCheckManager;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.ui.common.PersonInfoChecker;
import com.huami.account.ui.login.LoginActivity;
import com.huami.account.userinfo.manager.MinorAuthorizationManager;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.ad.AdRepository;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.healthlabel.ui.custom.LabelTextViewKt;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.utils.MapUtil;
import com.huami.module.homepage.cards.service.RealtimeStepService;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.pay.service.HuamiPayNotificationService;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.watch.companion.service.AppInitService;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import com.xiaomi.hm.health.RecordSignKt;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.baseui.UsePhoneCountStepTips;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity;
import com.xiaomi.hm.health.device.HMUnifySelectDeviceActivity;
import com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder;
import com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry;
import com.xiaomi.hm.health.device.wifi.WifiSetting;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.discovery.jsbridge.function.sky.SkySurveyHandler;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataViewModel;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.mainpage.MainLifecycleObserver;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.pushHelper.PushHelper;
import com.xiaomi.hm.health.thirdbind.googlefit.GoogleFitSyncHelper;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.ui.heartrate.HRDataManager;
import com.xiaomi.hm.health.ui.pai.PaiHelper;
import com.xiaomi.hm.health.ui.smartplay.RestoreUnlockScreenActivity;
import com.xiaomi.hm.health.ui.smartplay.SmartPlayUtils;
import com.xiaomi.hm.health.ui.sportfitness.utils.SportStartDelegate;
import com.xiaomi.hm.health.utils.LocalInformationKt;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\u0006\u0010\u000e\u001a\u00020\u0004R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u001d\u0010)\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b'\u0010(R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/MainLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "", "f", "", "m", z.j, "g", "l", GoogleApiAvailabilityLight.a, "c", "onCreate", "onResume", "onDestroy", "dealMutexLogin", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/xiaomi/hm/health/mainpage/MainPermissionManagerImpl;", "b", "Lkotlin/Lazy;", "i", "()Lcom/xiaomi/hm/health/mainpage/MainPermissionManagerImpl;", "permissionManager", "Lcom/huami/account/userinfo/manager/MinorAuthorizationManager;", "Lcom/huami/account/userinfo/manager/MinorAuthorizationManager;", "authorizationManager", "Lcom/xiaomi/hm/health/mainpage/MainReceiver;", "Lcom/xiaomi/hm/health/mainpage/MainReceiver;", "mainReceiver", "Lcom/xiaomi/hm/health/mainpage/FemaleHealthManager;", "e", "Lcom/xiaomi/hm/health/mainpage/FemaleHealthManager;", "femaleHealthHelper", "Lcom/xiaomi/hm/health/mainpage/MainPopUpManager;", "Lcom/xiaomi/hm/health/mainpage/MainPopUpManager;", "mainPopUpManager", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataViewModel;", "h", "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataViewModel;", "healthDataViewModel", "Z", "isNeedStartRunning", "()Z", "setNeedStartRunning", "(Z)V", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MainLifecycleObserver implements LifecycleObserver {

    @NotNull
    public static final String TAG = "MainTabActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy permissionManager = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MinorAuthorizationManager authorizationManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private MainReceiver mainReceiver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthManager femaleHealthHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MainPopUpManager mainPopUpManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthDataViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isNeedStartRunning;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onResume Tab on Sport before start Running: " + ((MainTabActivity) MainLifecycleObserver.this.activity).isTabOnCourse();
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
            return "MainLifecycleObserver---> onCreate()";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
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
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return LocalInformationKt.getLocalInformationStr();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.mainpage.MainLifecycleObserver$onCreate$5", f = "MainLifecycleObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip();
            return Unit.INSTANCE;
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
            return "MainLifecycleObserver---> onDestroy()";
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
            return "MainLifecycleObserver ---> onResume()";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/MainPermissionManagerImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<MainPermissionManagerImpl> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MainPermissionManagerImpl getA() {
            return new MainPermissionManagerImpl(MainLifecycleObserver.this.activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainLifecycleObserver(@NotNull AppCompatActivity appCompatActivity, @NotNull LifecycleOwner lifecycleOwner) {
        this.activity = appCompatActivity;
        this.authorizationManager = new MinorAuthorizationManager(appCompatActivity);
        this.femaleHealthHelper = new FemaleHealthManager(appCompatActivity, lifecycleOwner);
        this.mainPopUpManager = new MainPopUpManager(appCompatActivity);
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.mainpage.MainLifecycleObserver$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.healthDataViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HealthDataViewModel>() { // from class: com.xiaomi.hm.health.mainpage.MainLifecycleObserver$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final HealthDataViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(HealthDataViewModel.class), function0, objArr);
            }
        });
    }

    private final void c() {
        if (this.activity.getIntent().getBooleanExtra(MainTabActivity.NEW_REGISTERED_USER, false)) {
            HMUnifySelectDeviceActivity.startAfterRegister(this.activity);
            this.activity.getIntent().putExtra(MainTabActivity.NEW_REGISTERED_USER, false);
        }
    }

    private final void d() {
        if (this.isNeedStartRunning) {
            this.isNeedStartRunning = false;
            new Handler().postDelayed(new Runnable() { // from class: zu4
                @Override // java.lang.Runnable
                public final void run() {
                    MainLifecycleObserver.e(this.a);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MainLifecycleObserver mainLifecycleObserver) {
        HMLog.info("MainTabActivity", mainLifecycleObserver.new a());
        SportStartDelegate.INSTANCE.startSport(mainLifecycleObserver.activity, false, GPSDataController.getInstance().getSportType());
    }

    private final boolean f() {
        if (!HMLoginManager.isUnInit() || HomeUtils.isSimplifiedChinese()) {
            return false;
        }
        AppCompatActivity appCompatActivity = this.activity;
        Intent intent = new Intent(this.activity, (Class<?>) LoginActivity.class);
        intent.setFlags(32768);
        Unit unit = Unit.INSTANCE;
        appCompatActivity.startActivity(intent);
        this.activity.finish();
        return true;
    }

    private final void g() {
        if (Utils.isOverseaUser() && NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            ((HuamiPayNotificationService) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HuamiPayNotificationService.class), null, null)).checkAndReUploadPurchaseVoucher(HMPersonInfo.getInstance().getUserInfo().getUserid());
        }
    }

    private final HealthDataViewModel h() {
        return (HealthDataViewModel) this.healthDataViewModel.getValue();
    }

    private final MainPermissionManagerImpl i() {
        return (MainPermissionManagerImpl) this.permissionManager.getValue();
    }

    private final void j() {
        GoogleFitSyncHelper.init(this.activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(boolean z) {
        HMLog.debug("MainTabActivity", new c(z));
    }

    private final void l() {
        if (HMKeeper.isRestoreUnlockScreen()) {
            return;
        }
        if (HMDeviceManager.getInstance().hasBound(HMDeviceType.MILI) && SmartPlayUtils.isScreenUnlockOpened() && !(MiuiUnlockAPI.hasSetPassword(this.activity) && SmartPlayUtils.isEnableScreenUnlockOnDevice(this.activity))) {
            this.activity.startActivity(new Intent(this.activity, (Class<?>) RestoreUnlockScreenActivity.class));
            HMKeeper.setRestoreUnlockScreen(true);
        }
    }

    private final void m() {
        HMWeightUtils.syncWithServer(this.activity.getApplicationContext());
        try {
            h().syncUserData();
        } catch (Exception unused) {
        }
        try {
            Spo2Proxy.load();
        } catch (Exception unused2) {
        }
        HRDataManager.getInstance().syncLatestDataFromServer();
    }

    public final void dealMutexLogin() {
        HMAccountKeeper.INSTANCE.saveAppRestart(false);
        HMLogoutManager.dealMutexLoginIfAppRestart();
    }

    /* JADX INFO: renamed from: isNeedStartRunning, reason: from getter */
    public final boolean getIsNeedStartRunning() {
        return this.isNeedStartRunning;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        HMLog.info("MainTabActivity", b.a);
        if (f()) {
            return;
        }
        CCPAManager.INSTANCE.getInstance().init(this.activity);
        WeightManager.INSTANCE.create(this.activity);
        FwUnZipStatusHolder.INSTANCE.setStarting(false);
        dealMutexLogin();
        MainReceiver mainReceiver = new MainReceiver(this.activity);
        mainReceiver.registerReceiver();
        Unit unit = Unit.INSTANCE;
        this.mainReceiver = mainReceiver;
        PushHelper.INSTANCE.initPush(this.activity.getApplicationContext());
        j();
        l();
        this.authorizationManager.getLegalInfoVersion();
        m();
        if (GPSDataController.getInstance().isRunning()) {
            this.isNeedStartRunning = true;
        } else {
            i().requestLocation();
        }
        this.mainPopUpManager.checkHomePagePopup();
        HMAccountWebExtAPI.updateUserBirthday(true).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: av4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MainLifecycleObserver.k(((Boolean) obj).booleanValue());
            }
        });
        UserInfoLegalCheckManager.checkPersonInfoSecurity(this.activity);
        TrainingDataSource dataSource = TrainingInjection.get().getDataSource();
        if (dataSource != null) {
            dataSource.loadVideoPosts();
        }
        MapUtil.initMacaoAndHongkongPolygon(this.activity);
        RecordSignKt.record(this.activity);
        AppInitService.start(this.activity);
        HMLoginManager.initCountryCode(true);
        WifiSetting.INSTANCE.createWifiSettingHook(this.activity);
        this.femaleHealthHelper.initFemale();
        RunningManager.setOrUpdateRunnerData();
        if (StartUpActivity.isFromSystemUpgrade(this.activity.getIntent())) {
            HMGt2SystemUpgradeActivity.INSTANCE.launch(this.activity, false, false, false);
        }
        HMLog.info("MainTabActivity", d.a);
        if (!PolicyTipUtil.isNeedIntercept()) {
            i().checkAndRequestPermission(RedDotManagerKt.isMainlandUser());
            g();
        }
        TelephonyUtil.INSTANCE.preReadContacts(this.activity, "MainTabActivity");
        RealTimeTransmissionEntry.init(this.activity.getApplication());
        PersonInfoChecker.check(this.activity);
        LifecycleOwnerKt.getLifecycleScope(this.activity).launchWhenResumed(new e(null));
        SkySurveyHandler.INSTANCE.init(LifecycleOwnerKt.getLifecycleScope(this.activity));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        HMLog.info("MainTabActivity", f.a);
        SkySurveyHandler.INSTANCE.release();
        MainReceiver mainReceiver = this.mainReceiver;
        if (mainReceiver != null) {
            mainReceiver.unRegisterReceiver();
        }
        this.mainReceiver = null;
        this.authorizationManager.release();
        CCPAManager.INSTANCE.getInstance().release();
        HMKeeper.setUpgradeDialogShowing(false);
        LocWeatherManager.getInstance().cancelLocation();
        AdRepository.getInstance().resetSportAndTrainUpdatedFlag();
        ((RealtimeStepService) ScopesAndQualifersKt.homePageScope(com.huami.healthlabel.koin.ScopesAndQualifersKt.getKoin()).get(Reflection.getOrCreateKotlinClass(RealtimeStepService.class), null, null)).release();
        ScopesAndQualifersKt.homePageScope(com.huami.healthlabel.koin.ScopesAndQualifersKt.getKoin()).close();
        com.huami.healthlabel.koin.ScopesAndQualifersKt.labelScope(com.huami.healthlabel.koin.ScopesAndQualifersKt.getKoin()).close();
        LabelTextViewKt.setLabelTextViewListener(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        HMLog.info("MainTabActivity", g.a);
        this.mainPopUpManager.checkDialog();
        UsePhoneCountStepTips.show(this.activity);
        HMLoginManager.showAction(this.activity);
        PaiHelper.INSTANCE.refreshPaiWithTime(this.activity);
        NotificationManager.getInstance().checkNotificationService(this.activity);
        d();
        this.femaleHealthHelper.refreshFemale();
        c();
    }

    public final void setNeedStartRunning(boolean z) {
        this.isNeedStartRunning = z;
    }
}
