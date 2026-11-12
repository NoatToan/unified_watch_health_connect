package com.xiaomi.hm.health.device.setting.find;

import android.content.Context;
import androidx.annotation.WorkerThread;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.utils.SingleLiveEvent;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceWrapper;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.vo.FindMiliVo;
import com.xiaomi.hm.health.device.setting.vo.ShowFindingVo;
import com.xiaomi.hm.health.device.setting.vo.ShowFrequentlyFindVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0003>?\u0006B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\u0005H\u0014R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0#8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b*\u0010'R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001f\u00103\u001a\u0004\u0018\u0001008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0015\u001a\u0004\b\u0014\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDeviceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/setting/find/IFindDeviceHandler;", "e", "", "a", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/device/setting/vo/FindMiliVo;", "loadFindMiliSetting", "Lcom/xiaomi/hm/health/device/setting/find/IDialogPageProvider;", "provider", "setDialogPageProvider", "sendFindMiliNotification", "stopFindDevice", "onCleared", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "featureTree", "", "b", "Lkotlin/Lazy;", "f", "()Z", TakePicSettingActivity.KEY_IS_WATCH, "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getFindMiliSettingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "findMiliSettingLiveData", "Lcom/huami/account/utils/SingleLiveEvent;", "Lcom/xiaomi/hm/health/device/setting/vo/ShowFindingVo;", "Lcom/huami/account/utils/SingleLiveEvent;", "getShowFindingTipLiveData", "()Lcom/huami/account/utils/SingleLiveEvent;", "showFindingTipLiveData", "Lcom/xiaomi/hm/health/device/setting/vo/ShowFrequentlyFindVo;", "getShowFrequentlyFindAlertLiveData", "showFrequentlyFindAlertLiveData", "", "g", LogUtil.I, "findDeviceCount", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "h", "()Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "device", "i", "Lcom/xiaomi/hm/health/device/setting/find/IFindDeviceHandler;", "findDeviceHandler", z.j, "Lcom/xiaomi/hm/health/device/setting/find/IDialogPageProvider;", "pageProvider", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;Landroid/content/Context;)V", "Companion", "FindDeviceV1Handler", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FindDeviceViewModel extends ViewModel implements KoinComponent {

    @NotNull
    private static final String k = "FindDeviceViewModel";
    private static final long l = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FeatureTree featureTree;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy isWatch = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<FindMiliVo> findMiliSettingLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SingleLiveEvent<ShowFindingVo> showFindingTipLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SingleLiveEvent<ShowFrequentlyFindVo> showFrequentlyFindAlertLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int findDeviceCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy device;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private IFindDeviceHandler findDeviceHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private IDialogPageProvider pageProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDeviceViewModel$FindDeviceV1Handler;", "Lcom/xiaomi/hm/health/device/setting/find/IFindDeviceHandler;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "deviceRef", "", "a", "b", "<init>", "(Lcom/xiaomi/hm/health/device/setting/find/FindDeviceViewModel;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class FindDeviceV1Handler implements IFindDeviceHandler {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sendFindMiliNotification";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sendFindMiliNotification result: " + this.a;
            }
        }

        public FindDeviceV1Handler() {
        }

        @Override // com.xiaomi.hm.health.device.setting.find.IFindDeviceHandler
        public void a(@NotNull HMMiLiDevice deviceRef) {
            e.f(ViewModelKt.getViewModelScope(FindDeviceViewModel.this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FindDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$1(null, deviceRef, FindDeviceViewModel.this), 2, null);
            e.f(ViewModelKt.getViewModelScope(FindDeviceViewModel.this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FindDeviceViewModel$FindDeviceV1Handler$findDevice$$inlined$safeLaunch$2(null, FindDeviceViewModel.this), 2, null);
        }

        @Override // com.xiaomi.hm.health.device.setting.find.IFindDeviceHandler
        public void b(@NotNull HMMiLiDevice deviceRef) {
        }

        @Override // com.xiaomi.hm.health.device.setting.find.IFindDeviceHandler
        public void deInit() {
            IFindDeviceHandler.DefaultImpls.deInit(this);
        }

        @Override // com.xiaomi.hm.health.device.setting.find.IFindDeviceHandler
        public void init() {
            IFindDeviceHandler.DefaultImpls.init(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"com/xiaomi/hm/health/device/setting/find/FindDeviceViewModel$a", "Lcom/xiaomi/hm/health/device/setting/find/IFindDeviceHandler;", "", PointCategory.INIT, "Lcom/xiaomi/hm/health/device/setting/find/IDialogPageProvider;", "provider", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "deviceRef", "a", "b", "deInit", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceModel;", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/device/setting/find/FindDeviceModel;", "findDeviceModel", "<init>", "(Lcom/xiaomi/hm/health/device/setting/find/FindDeviceViewModel;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class a implements IFindDeviceHandler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy findDeviceModel = LazyKt__LazyJVMKt.lazy(C0843a.a);

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.find.FindDeviceViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDeviceModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0843a extends Lambda implements Function0<FindDeviceModel> {
            public static final C0843a a = new C0843a();

            public C0843a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FindDeviceModel invoke() {
                return new FindDeviceModel();
            }
        }

        public a() {
        }

        private final FindDeviceModel c() {
            return (FindDeviceModel) this.findDeviceModel.getValue();
        }

        @Override // com.xiaomi.hm.health.device.setting.find.IFindDeviceHandler
        public void a(@NotNull HMMiLiDevice deviceRef) {
            c().startFindDevice();
        }

        @Override // com.xiaomi.hm.health.device.setting.find.IFindDeviceHandler
        public void b(@NotNull HMMiLiDevice deviceRef) {
            FindDeviceModel.stopFindDevice$default(c(), false, 1, null);
        }

        public final void d(@Nullable IDialogPageProvider provider) {
            c().setPage(provider == null ? null : provider.providePage());
        }

        @Override // com.xiaomi.hm.health.device.setting.find.IFindDeviceHandler
        public void deInit() {
            c().detachFromDevice();
            c().setPage(null);
        }

        @Override // com.xiaomi.hm.health.device.setting.find.IFindDeviceHandler
        public void init() {
            HMMiLiDevice hMMiLiDeviceB = FindDeviceViewModel.this.b();
            if (hMMiLiDeviceB == null) {
                return;
            }
            c().attachToDevice(hMMiLiDeviceB);
            d(FindDeviceViewModel.this.pageProvider);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMMiLiDevice> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMMiLiDevice invoke() {
            HMBaseDevice device = FindDeviceViewModel.this.c().getDevice(HMDeviceType.MILI);
            if (device instanceof HMMiLiDevice) {
                return (HMMiLiDevice) device;
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Boolean> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return HMDeviceConfig.hasBoundWatch();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FindDeviceViewModel(@NotNull FeatureTree featureTree, @NotNull Context context) {
        this.featureTree = featureTree;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.find.FindDeviceViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.findMiliSettingLiveData = new MutableLiveData<>();
        this.showFindingTipLiveData = new SingleLiveEvent<>();
        this.showFrequentlyFindAlertLiveData = new SingleLiveEvent<>();
        this.device = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final void a() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.DEVICE_FIND_MILI));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMMiLiDevice b() {
        return (HMMiLiDevice) this.device.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi c() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final IFindDeviceHandler e() {
        IFindDeviceHandler findDeviceV1Handler;
        synchronized (FindDeviceViewModel.class) {
            HMMiLiDevice hMMiLiDeviceB = b();
            if (hMMiLiDeviceB == null) {
                return null;
            }
            IFindDeviceHandler iFindDeviceHandler = this.findDeviceHandler;
            if (iFindDeviceHandler != null) {
                return iFindDeviceHandler;
            }
            if (FindDeviceWrapper.INSTANCE.protocolVersion(hMMiLiDeviceB) < 2) {
                findDeviceV1Handler = new FindDeviceV1Handler();
            } else {
                a aVar = new a();
                aVar.d(this.pageProvider);
                Unit unit = Unit.INSTANCE;
                findDeviceV1Handler = aVar;
            }
            this.findDeviceHandler = findDeviceV1Handler;
            findDeviceV1Handler.init();
            return this.findDeviceHandler;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f() {
        return ((Boolean) this.isWatch.getValue()).booleanValue();
    }

    @NotNull
    public final MutableLiveData<FindMiliVo> getFindMiliSettingLiveData() {
        return this.findMiliSettingLiveData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final SingleLiveEvent<ShowFindingVo> getShowFindingTipLiveData() {
        return this.showFindingTipLiveData;
    }

    @NotNull
    public final SingleLiveEvent<ShowFrequentlyFindVo> getShowFrequentlyFindAlertLiveData() {
        return this.showFrequentlyFindAlertLiveData;
    }

    @NotNull
    public final LiveData<FindMiliVo> loadFindMiliSetting() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FindDeviceViewModel$loadFindMiliSetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.findMiliSettingLiveData;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        IFindDeviceHandler iFindDeviceHandler = this.findDeviceHandler;
        if (iFindDeviceHandler == null) {
            return;
        }
        iFindDeviceHandler.deInit();
    }

    public final void sendFindMiliNotification() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new FindDeviceViewModel$sendFindMiliNotification$$inlined$safeLaunch$1(null, this), 2, null);
        a();
    }

    public final void setDialogPageProvider(@NotNull IDialogPageProvider provider) {
        this.pageProvider = provider;
        IFindDeviceHandler iFindDeviceHandler = this.findDeviceHandler;
        if (iFindDeviceHandler instanceof a) {
            ((a) iFindDeviceHandler).d(provider);
        }
    }

    public final void stopFindDevice() {
        HMMiLiDevice hMMiLiDeviceB = b();
        if (hMMiLiDeviceB == null) {
            return;
        }
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new FindDeviceViewModel$stopFindDevice$$inlined$safeLaunch$1(null, this, hMMiLiDeviceB), 2, null);
    }
}
