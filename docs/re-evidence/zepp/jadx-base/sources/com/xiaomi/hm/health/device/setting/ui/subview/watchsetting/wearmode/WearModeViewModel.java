package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.WearingWay;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v1.WearingWayV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2.WearingWayV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.repo.IWearModeRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.repo.WearModeRepoV1;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.repo.WearModeRepoV2;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import java.util.HashMap;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b*\u00011\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bV\u0010WJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002JT\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b*\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u001c\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J/\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"J\u0010\u0010&\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\u0019J\u000e\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0019J\u000e\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u001dJ\b\u0010+\u001a\u00020\u000eH\u0014J\u0006\u0010,\u001a\u00020\u000eJ\u0006\u0010-\u001a\u00020\u000eR\u001e\u00100\u001a\n .*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u00108\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b2\u00107R\u001e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0019098\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020\u0019098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010;R\u0018\u0010M\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001d098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010;R\u001b\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190P8F@\u0006¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u001b\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100P8F@\u0006¢\u0006\u0006\u001a\u0004\bS\u0010RR\u0019\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001d0P8F@\u0006¢\u0006\u0006\u001a\u0004\bT\u0010R¨\u0006X"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/WearModeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/repo/IWearModeRepo;", "c", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "", "msg", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "mDeviceType", "", "initJob", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "way", "setSettings", "Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;", "locationExt", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ljava/lang/Object;", "callBack", "setWearLocationNew", "", "needRefreshObserver", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "wearingWay", "", "directionValue", "updateWearWay", "(ZLcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Integer;)V", "hand", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mDeviceSource", "updateWearLocation", "needDesc", "queryWearMode", "isShow", "showLoading", "direction", "setWearDirection", "onCleared", "clearCache", "removeListener", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "com/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/WearModeViewModel$changeListener$1", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/WearModeViewModel$changeListener$1;", "changeListener", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "_wearingWay", "e", "getResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "resultLiveData", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "f", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "hmMiLiProDevice", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "g", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "h", "_isShowLoading", "i", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/repo/IWearModeRepo;", CommonLanguageSettingFragment.KEY_REPO, z.j, "_wearHandleLocation", "Landroidx/lifecycle/LiveData;", "isShowLoading", "()Landroidx/lifecycle/LiveData;", "getWearingWay", "getWearHandleLocation", "wearHandleLocation", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WearModeViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = WearModeViewModel.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WearModeViewModel$changeListener$1 changeListener = new ChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeViewModel$changeListener$1
        @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
        public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
            MutableLiveData mutableLiveData = this.a._wearingWay;
            Settings settings2 = settings.get(SettingsGroupType.WEARING);
            mutableLiveData.setValue(settings2 instanceof WearingWay ? (WearingWay) settings2 : null);
        }
    };

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WearingWay> _wearingWay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> resultLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice hmMiLiProDevice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isShowLoading;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private IWearModeRepo repo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> _wearHandleLocation;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_QINLING.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_AMAZFIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeViewModel$queryWearMode$1$1", f = "WearModeViewModel.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WearModeViewModel.this.new b(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0047  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData mutableLiveData;
            Settings settings;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData mutableLiveData2 = WearModeViewModel.this._wearingWay;
                SettingsModule settingsModule = WearModeViewModel.this.settingsModule;
                if (settingsModule == null) {
                    mutableLiveData = mutableLiveData2;
                    settings = null;
                } else {
                    SettingsGroupType settingsGroupType = SettingsGroupType.WEARING;
                    boolean z = this.d;
                    this.a = mutableLiveData2;
                    this.b = 1;
                    Object objQuery = WatchSettingExtsKt.query(settingsModule, settingsGroupType, z, this);
                    if (objQuery == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = mutableLiveData2;
                    obj = objQuery;
                }
                mutableLiveData.postValue(settings instanceof WearingWay ? (WearingWay) settings : null);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.a;
            ResultKt.throwOnFailure(obj);
            settings = (Settings) obj;
            mutableLiveData.postValue(settings instanceof WearingWay ? (WearingWay) settings : null);
            return Unit.INSTANCE;
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
        public final String invoke() {
            return "wear not match.";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeViewModel$changeListener$1] */
    public WearModeViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = null == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeViewModel$special$$inlined$inject$default$1
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
        MutableLiveData<WearingWay> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._wearingWay = mutableLiveData;
        this.resultLiveData = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.FALSE);
        this._isShowLoading = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(-1);
        this._wearHandleLocation = mutableLiveData3;
    }

    private final HashMap<SettingsGroupType, Settings> a(HashMap<SettingsGroupType, Settings> map, String str) {
        if (map == null) {
            HMLog.info(this.TAG, new a(str));
        }
        return map;
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final IWearModeRepo c() {
        IWearModeRepo wearModeRepoV2;
        IWearModeRepo iWearModeRepo = this.repo;
        if (iWearModeRepo != null) {
            return iWearModeRepo;
        }
        WearingWay value = this._wearingWay.getValue();
        if (value instanceof WearingWayV1) {
            wearModeRepoV2 = new WearModeRepoV1();
        } else {
            wearModeRepoV2 = value instanceof WearingWayV2 ? new WearModeRepoV2() : null;
        }
        this.repo = wearModeRepoV2;
        return wearModeRepoV2;
    }

    public static /* synthetic */ void queryWearMode$default(WearModeViewModel wearModeViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        wearModeViewModel.queryWearMode(z);
    }

    public static /* synthetic */ void updateWearWay$default(WearModeViewModel wearModeViewModel, boolean z, EnumData enumData, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            enumData = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        wearModeViewModel.updateWearWay(z, enumData, num);
    }

    public final void clearCache() {
        this._wearingWay.setValue(null);
        this.hmMiLiProDevice = null;
        this.settingsModule = null;
        this._isShowLoading.setValue(null);
        this._wearHandleLocation.setValue(null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Boolean> getResultLiveData() {
        return this.resultLiveData;
    }

    @NotNull
    public final LiveData<Integer> getWearHandleLocation() {
        return this._wearHandleLocation;
    }

    @NotNull
    public final LiveData<WearingWay> getWearingWay() {
        return this._wearingWay;
    }

    public final void initJob(@NotNull HMDeviceType mDeviceType) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(mDeviceType);
        this.hmMiLiProDevice = hMMiLiProDevice;
        SettingsModule settingsModule = hMMiLiProDevice == null ? null : (SettingsModule) hMMiLiProDevice.getChannelModule(SettingsModule.class);
        this.settingsModule = settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.addListener(this.changeListener);
    }

    @NotNull
    public final LiveData<Boolean> isShowLoading() {
        return this._isShowLoading;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    public final void queryWearMode(boolean needDesc) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new WearModeViewModel$queryWearMode$$inlined$safeLaunch$1(null, this, needDesc), 2, null);
    }

    public final void removeListener() {
        SettingsModule settingsModule = this.settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.removeListener(this.changeListener);
    }

    public final void setSettings(@Nullable WearingWay way) {
        this._wearingWay.setValue(way);
    }

    public final void setWearDirection(int direction) {
        showLoading(true);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new WearModeViewModel$setWearDirection$$inlined$safeLaunch$1(null, this, direction), 2, null);
    }

    public final void setWearLocationNew(@NotNull LocationExt locationExt, @NotNull HMCallback<Object> callBack) {
        SettingsModule settingsModule;
        if (locationExt.getWear() != LocationExt.Wear.WRIST && locationExt.getWear() != LocationExt.Wear.CHEST) {
            HMLog.error$default(null, null, null, c.a, 7, null);
            return;
        }
        IWearModeRepo iWearModeRepoC = c();
        HashMap<SettingsGroupType, Settings> mapA = a(iWearModeRepoC == null ? null : iWearModeRepoC.getDtoWithWearLocation(new EnumData(locationExt.getWay().getValue())), "setWearLocationNew");
        if (mapA == null || (settingsModule = this.settingsModule) == null) {
            return;
        }
        settingsModule.writeSetting(mapA, callBack);
    }

    public final void showLoading(boolean isShow) {
        this._isShowLoading.setValue(Boolean.valueOf(isShow));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r3.equals(com.xiaomi.hm.health.model.account.HMMiliConfig.ONBODY_IOS) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r3.equals(com.xiaomi.hm.health.model.account.HMMiliConfig.ONBODY) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r3 = com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeViewModel.WhenMappings.$EnumSwitchMapping$0[r4.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r3 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r3 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        r3 = com.huami.devicex.R.string.body;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        r3 = com.huami.devicex.R.string.wear_neck;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r3 = com.huami.devicex.R.string.chest;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateWearLocation(@NotNull String hand, @NotNull HMDeviceSource mDeviceSource) {
        int i;
        int i2 = R.string.left_hand;
        switch (hand.hashCode()) {
            case -1959185407:
                break;
            case -873364270:
                if (hand.equals("RIGHT_HAND")) {
                    i = mDeviceSource == HMDeviceSource.MILI_AMAZFIT ? R.string.wear_wrist : R.string.right_hand;
                    i2 = i;
                }
                break;
            case 35387260:
                break;
            case 262784423:
                if (hand.equals("LEFT_HAND") && mDeviceSource == HMDeviceSource.MILI_AMAZFIT) {
                    i = R.string.wear_wrist;
                    i2 = i;
                }
                break;
        }
        this._wearHandleLocation.setValue(Integer.valueOf(i2));
    }

    public final void updateWearWay(boolean needRefreshObserver, @Nullable EnumData wearingWay, @Nullable Integer directionValue) {
        WearingWay value = needRefreshObserver ? this._wearingWay.getValue() : this._wearingWay.getValue();
        IWearModeRepo iWearModeRepoC = c();
        WearingWay wearingWayUpdateWearWay = iWearModeRepoC == null ? null : iWearModeRepoC.updateWearWay(value, wearingWay, directionValue);
        if (needRefreshObserver) {
            this._wearingWay.setValue(wearingWayUpdateWearWay);
        }
    }
}
