package com.xiaomi.hm.health.device;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.ConnectStatus;
import com.huami.bluetooth.profile.channel.module.DisplayType;
import com.huami.bluetooth.profile.channel.module.MeasureMode;
import com.huami.bluetooth.profile.channel.module.ScaleDataItem;
import com.huami.bluetooth.profile.channel.module.ScaleMode;
import com.huami.bluetooth.profile.channel.module.ScaleSettingModule;
import com.huami.bluetooth.profile.channel.module.ScaleUnit;
import com.huami.bluetooth.profile.channel.module.SettingResult;
import com.huami.bluetooth.profile.channel.module.WiFiControllerModule;
import com.huami.core.device.wifi_settings.bean.WiFiConnectStatus;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceBatteryEvent;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMWeightDevice;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.model.EventMutableLiveData;
import com.xiaomi.hm.health.device.model.HashBiMap;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001[B\u0007¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0014\u0010!\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u0014J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0003J\u0006\u0010$\u001a\u00020\u001dJ\u0013\u0010%\u001a\u00020\u001dH\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'J\u0006\u0010*\u001a\u00020\u001dJ\u001b\u0010+\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'J\u000e\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.J\u000e\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u000201J\u000e\u00100\u001a\u00020\u001d2\u0006\u00103\u001a\u000202J\b\u00104\u001a\u00020\u001dH\u0014R\u001d\u00109\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\b7\u00108R#\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b<\u0010=R)\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00140:8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\b?\u0010=R#\u0010D\u001a\b\u0012\u0004\u0012\u00020A0:8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u0010=R#\u0010F\u001a\b\u0012\u0004\u0012\u00020.0:8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bE\u0010=R#\u0010H\u001a\b\u0012\u0004\u0012\u00020'0:8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\bG\u0010=R#\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030:8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\bI\u0010=R#\u0010O\u001a\b\u0012\u0004\u0012\u00020L0K8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bM\u0010NR#\u0010Q\u001a\b\u0012\u0004\u0012\u0002020:8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bP\u0010=R\u001d\u0010U\u001a\u00020R8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\bS\u0010TR\"\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010W\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, d2 = {"Lcom/xiaomi/hm/health/device/WeightSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "unitFromDevice", GoogleApiAvailabilityLight.b, "(Ljava/lang/Integer;)I", "unitFromApp", "o", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "g", "moduleType", "f", "type", "Lcom/huami/bluetooth/profile/channel/module/MeasureMode;", "e", "Lcom/xiaomi/hm/health/bt/device/HMWeightDevice;", "i", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "h", "", "Lcom/huami/bluetooth/profile/channel/module/ScaleDataItem;", "items", "Lcom/xiaomi/hm/health/device/DisplaySettingVo;", "m", "c", "item", "b", "a", "", "queryWiFiState", "loadAppCards", "data", "updateCards", "unit", "setUnit", "getSetting", "getUnit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enable", "updateSwitchStatus", "enterBabyWeightModel", "getMode", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPartMeasureModel", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/bodyfat/event/BFDeviceBatteryEvent;", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "onCleared", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", z.j, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "getWifiStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "wifiStateLiveData", "getAppCardsLiveData", "appCardsLiveData", "Lcom/xiaomi/hm/health/device/UpdateState;", GoogleApiAvailabilityLight.a, "getStatueLiveData", "statueLiveData", "getDeviceStatusLiveData", "deviceStatusLiveData", "getDeviceBatteryLiveData", "deviceBatteryLiveData", "getDeviceUnitLiveData", "deviceUnitLiveData", "Lcom/xiaomi/hm/health/device/model/EventMutableLiveData;", "Lcom/xiaomi/hm/health/device/SettingMode;", "getDeviceSettingMode", "()Lcom/xiaomi/hm/health/device/model/EventMutableLiveData;", "deviceSettingMode", "getDeviceFwCheckResultLiveData", "deviceFwCheckResultLiveData", "Lcom/xiaomi/hm/health/device/CardsResourceMapper;", hl.k, "()Lcom/xiaomi/hm/health/device/CardsResourceMapper;", "resourceMapper", "Lcom/xiaomi/hm/health/device/model/HashBiMap;", "Lcom/xiaomi/hm/health/device/model/HashBiMap;", "unitBiMap", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightSettingViewModel extends ViewModel implements KoinComponent {
    public static final int SETTING_MODULE_TYPE = 1;
    public static final int SWITCH_BABY_WEIGHT = 4;
    public static final int SWITCH_TYPE_BODY_ANALYSE = 1;
    public static final int SWITCH_TYPE_PRESSURE = 2;
    public static final int SWITCH_TYPE_SMALL = 3;

    @NotNull
    public static final String TAG = "WeightSettingViewModel";
    public static final int WIFI_MODULE_TYPE = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy wifiStateLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy appCardsLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy statueLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatusLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceBatteryLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUnitLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSettingMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceFwCheckResultLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy resourceMapper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final HashBiMap<Integer, Integer> unitBiMap;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.WEIGHT_AMAZFIT_SCALE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/device/DisplaySettingVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<List<? extends DisplaySettingVo>>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<DisplaySettingVo>> getA() {
            return new MutableLiveData<>();
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
            return "createModule:baseDevice is Empty!!!";
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
            return "createModule:baseDevice is disconnected!!!";
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
            return "not support!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MutableLiveData<EventFwCheckResult>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<EventFwCheckResult> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/model/EventMutableLiveData;", "Lcom/xiaomi/hm/health/device/SettingMode;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<EventMutableLiveData<SettingMode>> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EventMutableLiveData<SettingMode> getA() {
            return new EventMutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<MutableLiveData<HMDeviceConnectionEvent>> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<HMDeviceConnectionEvent> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Integer> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.WeightSettingViewModel$getMode$2", f = "WeightSettingViewModel.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public int c;
        public final /* synthetic */ int e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ SettingResult<ScaleMode> b;
            public final /* synthetic */ WeightSettingViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, SettingResult<ScaleMode> settingResult, WeightSettingViewModel weightSettingViewModel) {
                super(0);
                this.a = i;
                this.b = settingResult;
                this.c = weightSettingViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a + ": get mode result:" + this.b + ":" + this.c.getDeviceSettingMode().hasActiveObservers();
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
                return "暂不支持...";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, Continuation<? super j> continuation) {
            super(2, continuation);
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightSettingViewModel.this.new j(this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WeightSettingViewModel weightSettingViewModel;
            int i;
            ScaleMode scaleMode;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.c;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MeasureMode measureModeE = WeightSettingViewModel.this.e(this.e);
                if (measureModeE != null) {
                    weightSettingViewModel = WeightSettingViewModel.this;
                    int i3 = this.e;
                    BaseModule baseModuleG = weightSettingViewModel.g();
                    if (baseModuleG instanceof ScaleSettingModule) {
                        this.a = weightSettingViewModel;
                        this.b = i3;
                        this.c = 1;
                        obj = ((ScaleSettingModule) baseModuleG).getModel(measureModeE, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = i3;
                    } else {
                        HMLog.debug(WeightSettingViewModel.TAG, b.a);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.b;
            weightSettingViewModel = (WeightSettingViewModel) this.a;
            ResultKt.throwOnFailure(obj);
            SettingResult settingResult = (SettingResult) obj;
            HMLog.info(WeightSettingViewModel.TAG, new a(i, settingResult, weightSettingViewModel));
            if (settingResult.getSuccess() && (scaleMode = (ScaleMode) settingResult.getT()) != null) {
                weightSettingViewModel.getDeviceSettingMode().postValue(new SettingMode(i, scaleMode));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.WeightSettingViewModel$getSetting$1", f = "WeightSettingViewModel.kt", i = {}, l = {167, 170}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightSettingViewModel.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WeightSettingViewModel weightSettingViewModel = WeightSettingViewModel.this;
            this.a = 1;
            if (weightSettingViewModel.getUnit(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WeightSettingViewModel weightSettingViewModel2 = WeightSettingViewModel.this;
            this.a = 2;
            if (weightSettingViewModel2.getMode(1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.WeightSettingViewModel$getUnit$2", f = "WeightSettingViewModel.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SettingResult<ScaleUnit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SettingResult<ScaleUnit> settingResult) {
                super(0);
                this.a = settingResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "getUnit result :" + this.a;
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
                return "get unit setting model is not support!!!";
            }
        }

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightSettingViewModel.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseModule baseModuleG = WeightSettingViewModel.this.g();
                if (baseModuleG instanceof ScaleSettingModule) {
                    this.a = 1;
                    obj = ((ScaleSettingModule) baseModuleG).getUnit(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    HMLog.debug(WeightSettingViewModel.TAG, b.a);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SettingResult settingResult = (SettingResult) obj;
            HMLog.info(WeightSettingViewModel.TAG, new a(settingResult));
            if (settingResult.getSuccess()) {
                ScaleUnit scaleUnit = (ScaleUnit) settingResult.getT();
                WeightSettingViewModel.this.getDeviceUnitLiveData().postValue(Boxing.boxInt(WeightSettingViewModel.this.n(scaleUnit == null ? null : Boxing.boxInt(scaleUnit.getValue()))));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.WeightSettingViewModel$loadAppCards$1", f = "WeightSettingViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<DisplaySettingVo> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<DisplaySettingVo> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Thread.currentThread() + "loadAppCards" + this.a;
            }
        }

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightSettingViewModel.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.LOADING);
                BaseModule baseModuleG = WeightSettingViewModel.this.g();
                if (!(baseModuleG instanceof ScaleSettingModule)) {
                    WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.FAIL);
                    return Unit.INSTANCE;
                }
                this.a = 1;
                obj = ((ScaleSettingModule) baseModuleG).getDataItem(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<DisplaySettingVo> listM = WeightSettingViewModel.this.m((List) obj);
            HMLog.debug(WeightSettingViewModel.TAG, new a(listM));
            WeightSettingViewModel.this.getAppCardsLiveData().postValue(listM);
            WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.SUCCESS);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceConnectionEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
            super(0);
            this.a = hMDeviceConnectionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "HMDeviceConnectionEvent" + this.a.getDeviceType() + ":" + this.a.isConnected();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            HMBaseDevice hMBaseDeviceH = WeightSettingViewModel.this.h();
            return (hMBaseDeviceH == null ? null : hMBaseDeviceH.getDeviceType()) + ":BFDeviceBatteryEvent";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ EventFwCheckResult b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EventFwCheckResult eventFwCheckResult) {
            super(0);
            this.b = eventFwCheckResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            HMBaseDevice hMBaseDeviceH = WeightSettingViewModel.this.h();
            return (hMBaseDeviceH == null ? null : hMBaseDeviceH.getDeviceType()) + ":EventFwCheckResult:" + this.b.isSuccess;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.WeightSettingViewModel$queryWiFiState$1", f = "WeightSettingViewModel.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

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
                return "wifi Module is Empty!!!";
            }
        }

        public q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightSettingViewModel.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseModule baseModuleF = WeightSettingViewModel.this.f(2);
                if (baseModuleF instanceof WiFiControllerModule) {
                    this.a = 1;
                    obj = ((WiFiControllerModule) baseModuleF).queryWiFiConnectStatus(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    HMLog.info(WeightSettingViewModel.TAG, a.a);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConnectStatus connectStatus = (ConnectStatus) obj;
            WeightSettingViewModel.this.getWifiStateLiveData().postValue(new WiFiConnectStatus(connectStatus.getSsid(), com.huami.core.device.wifi_settings.bean.ConnectStatus.INSTANCE.fromValue(connectStatus.getStatus().getValue()), null, 4, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/CardsResourceMapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<CardsResourceMapper> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardsResourceMapper getA() {
            return new CardsResourceMapper();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.WeightSettingViewModel$setUnit$1", f = "WeightSettingViewModel.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SettingResult<ScaleUnit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SettingResult<ScaleUnit> settingResult) {
                super(0);
                this.a = settingResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "set unit cmd result" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(int i, Continuation<? super s> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightSettingViewModel.this.new s(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.SAVING);
                BaseModule baseModuleG = WeightSettingViewModel.this.g();
                if (!(baseModuleG instanceof ScaleSettingModule)) {
                    WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.FAIL);
                    return Unit.INSTANCE;
                }
                int iO = WeightSettingViewModel.this.o(Boxing.boxInt(this.c));
                this.a = 1;
                obj = ((ScaleSettingModule) baseModuleG).setUnit(iO, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SettingResult settingResult = (SettingResult) obj;
            HMLog.info(WeightSettingViewModel.TAG, new a(settingResult));
            if (settingResult.getSuccess()) {
                WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.SAVE_SUCCESS);
                WeightSettingViewModel.this.getDeviceUnitLiveData().postValue(Boxing.boxInt(this.c));
            } else {
                WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.SAVE_FAIL);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.WeightSettingViewModel$setPartMeasureModel$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.WeightSettingViewModel$setPartMeasureModel$1", f = "WeightSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightSettingViewModel.this.new AnonymousClass1(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMWeightDevice hMWeightDeviceI = WeightSettingViewModel.this.i();
            if (hMWeightDeviceI != null) {
                boolean z = this.c;
                final WeightSettingViewModel weightSettingViewModel = WeightSettingViewModel.this;
                hMWeightDeviceI.enablePartMeasure(z, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.WeightSettingViewModel$setPartMeasureModel$1$1$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ Boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(Boolean bool) {
                            super(0);
                            this.a = bool;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "enablePartMeasure,finish:" + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(@Nullable Boolean t) {
                        UpdateState updateState;
                        super.onFinish(t);
                        HMLog.info(WeightSettingViewModel.TAG, new a(t));
                        if (t == null) {
                            updateState = null;
                        } else {
                            updateState = t.booleanValue() ? UpdateState.SAVE_SUCCESS : UpdateState.SAVE_FAIL;
                        }
                        if (updateState == null) {
                            updateState = UpdateState.SAVE_FAIL;
                        }
                        weightSettingViewModel.getStatueLiveData().postValue(updateState);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/UpdateState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<MutableLiveData<UpdateState>> {
        public static final t a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<UpdateState> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.WeightSettingViewModel$updateCards$1", f = "WeightSettingViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<DisplaySettingVo> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<ScaleDataItem> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<ScaleDataItem> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "save setting Cards:" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(List<DisplaySettingVo> list, Continuation<? super u> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightSettingViewModel.this.new u(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.SAVING);
                BaseModule baseModuleG = WeightSettingViewModel.this.g();
                if (!(baseModuleG instanceof ScaleSettingModule)) {
                    WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.FAIL);
                    return Unit.INSTANCE;
                }
                List<ScaleDataItem> listC = WeightSettingViewModel.this.c(this.c);
                HMLog.info(WeightSettingViewModel.TAG, new a(listC));
                this.a = 1;
                obj = ((ScaleSettingModule) baseModuleG).setDataItem(listC, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.SAVE_SUCCESS);
            } else {
                WeightSettingViewModel.this.getStatueLiveData().postValue(UpdateState.SAVE_FAIL);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.WeightSettingViewModel$updateSwitchStatus$1", f = "WeightSettingViewModel.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public boolean b;
        public int c;
        public int d;
        public final /* synthetic */ int f;
        public final /* synthetic */ boolean g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SettingResult<ScaleMode> a;
            public final /* synthetic */ int b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SettingResult<ScaleMode> settingResult, int i, boolean z) {
                super(0);
                this.a = settingResult;
                this.b = i;
                this.c = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "change switch status result " + this.a + ":" + this.b + ":" + this.c;
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
                return "setting is not Support!!！";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(int i, boolean z, Continuation<? super v> continuation) {
            super(2, continuation);
            this.f = i;
            this.g = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightSettingViewModel.this.new v(this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WeightSettingViewModel weightSettingViewModel;
            boolean z;
            int i;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.d;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MeasureMode measureModeE = WeightSettingViewModel.this.e(this.f);
                if (measureModeE != null) {
                    WeightSettingViewModel weightSettingViewModel2 = WeightSettingViewModel.this;
                    boolean z2 = this.g;
                    int i3 = this.f;
                    weightSettingViewModel2.getStatueLiveData().postValue(UpdateState.SAVING);
                    BaseModule baseModuleG = weightSettingViewModel2.g();
                    if (baseModuleG instanceof ScaleSettingModule) {
                        this.a = weightSettingViewModel2;
                        this.b = z2;
                        this.c = i3;
                        this.d = 1;
                        obj = ((ScaleSettingModule) baseModuleG).setModel(measureModeE, z2, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        weightSettingViewModel = weightSettingViewModel2;
                        z = z2;
                        i = i3;
                    } else {
                        HMLog.info(WeightSettingViewModel.TAG, b.a);
                        weightSettingViewModel2.getStatueLiveData().postValue(UpdateState.SAVE_FAIL);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.c;
            z = this.b;
            weightSettingViewModel = (WeightSettingViewModel) this.a;
            ResultKt.throwOnFailure(obj);
            SettingResult settingResult = (SettingResult) obj;
            HMLog.info(WeightSettingViewModel.TAG, new a(settingResult, i, z));
            if (settingResult.getSuccess()) {
                weightSettingViewModel.getStatueLiveData().postValue(UpdateState.SAVE_SUCCESS);
            } else {
                weightSettingViewModel.getStatueLiveData().postValue(UpdateState.SAVE_FAIL);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<MutableLiveData<WiFiConnectStatus>> {
        public static final w a = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<WiFiConnectStatus> getA() {
            return new MutableLiveData<>();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeightSettingViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = null == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.WeightSettingViewModel$special$$inlined$inject$default$1
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
        this.wifiStateLiveData = LazyKt__LazyJVMKt.lazy(w.a);
        this.appCardsLiveData = LazyKt__LazyJVMKt.lazy(a.a);
        this.statueLiveData = LazyKt__LazyJVMKt.lazy(t.a);
        this.deviceStatusLiveData = LazyKt__LazyJVMKt.lazy(h.a);
        this.deviceBatteryLiveData = LazyKt__LazyJVMKt.lazy(e.a);
        this.deviceUnitLiveData = LazyKt__LazyJVMKt.lazy(i.a);
        this.deviceSettingMode = LazyKt__LazyJVMKt.lazy(g.a);
        this.deviceFwCheckResultLiveData = LazyKt__LazyJVMKt.lazy(f.a);
        this.resourceMapper = LazyKt__LazyJVMKt.lazy(r.a);
        EventBus.getDefault().register(this);
        this.unitBiMap = HashBiMap.INSTANCE.create(kotlin.collections.r.mapOf(TuplesKt.to(Integer.valueOf(ScaleUnit.KG.getValue()), 0), TuplesKt.to(Integer.valueOf(ScaleUnit.SJ.getValue()), 16), TuplesKt.to(Integer.valueOf(ScaleUnit.YB.getValue()), 1), TuplesKt.to(Integer.valueOf(ScaleUnit.ST.getValue()), 17)));
    }

    private final ScaleDataItem a(DisplaySettingVo item) {
        return new ScaleDataItem(DisplayType.INSTANCE.fromValue(item.getSourceType()), item.getStatus().getValue());
    }

    private final DisplaySettingVo b(ScaleDataItem item) {
        return new DisplaySettingVo(k().loadIcon(item.getType()), k().loadTitle(item.getType()), ItemType.TYPE_NORMAL, AppCardStatus.INSTANCE.fromValue(item.getStatus()), 0, item.getType().getValue(), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ScaleDataItem> c(List<DisplaySettingVo> items) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it2 = items.iterator();
        while (it2.hasNext()) {
            arrayList.add(a((DisplaySettingVo) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ScaleDataItem) obj).getType() != DisplayType.NONE) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasureMode e(int type) {
        if (type == 1) {
            return MeasureMode.MODEL_PREGNANT;
        }
        if (type == 2) {
            return MeasureMode.MODEL_PRESSURE;
        }
        if (type == 3) {
            return MeasureMode.MODEL_SMALL_WEIGHT;
        }
        if (type != 4) {
            return null;
        }
        return MeasureMode.MODEL_BABY_WEIGHT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseModule f(int moduleType) {
        HMBaseDevice hMBaseDeviceH = h();
        if (hMBaseDeviceH == null) {
            HMLog.info(TAG, b.a);
            return null;
        }
        if (!hMBaseDeviceH.isConnected()) {
            HMLog.info(TAG, c.a);
            getDeviceStatusLiveData().postValue(new HMDeviceConnectionEvent(2, hMBaseDeviceH.getDeviceType()));
            return null;
        }
        if (hMBaseDeviceH.getDeviceType() == HMDeviceType.WEIGHT && (hMBaseDeviceH instanceof HMWeightDevice)) {
            HMWeightDevice hMWeightDevice = (HMWeightDevice) hMBaseDeviceH;
            HMDeviceSource mDeviceSource = hMWeightDevice.getMDeviceSource();
            if ((mDeviceSource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mDeviceSource.ordinal()]) != 1) {
                HMLog.info(TAG, d.a);
            } else {
                if (moduleType == 1) {
                    return hMWeightDevice.getChannelModule(ScaleSettingModule.class);
                }
                if (moduleType == 2) {
                    return hMWeightDevice.getChannelModule(WiFiControllerModule.class);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseModule g() {
        return f(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice h() {
        return j().getDevice(HMDeviceType.WEIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMWeightDevice i() {
        HMBaseDevice device = j().getDevice(HMDeviceType.WEIGHT);
        if (device == null) {
            return null;
        }
        return (HMWeightDevice) device;
    }

    private final DeviceManagerApi j() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final CardsResourceMapper k() {
        return (CardsResourceMapper) this.resourceMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DisplaySettingVo> m(List<ScaleDataItem> items) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it2 = items.iterator();
        while (it2.hasNext()) {
            arrayList.add(b((ScaleDataItem) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (!items.isEmpty()) {
            arrayList2.add(new DisplaySettingVo(0, R.string.smart_setting_top_tips, ItemType.TYPE_TITLE, null, 0, 0, 57, null));
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                DisplaySettingVo displaySettingVo = (DisplaySettingVo) next;
                if (!(displaySettingVo.getStatus() == AppCardStatus.HIDDEN || displaySettingVo.getTitleRes() == 0)) {
                    arrayList3.add(next);
                }
            }
            arrayList2.addAll(arrayList3);
            arrayList2.add(new DisplaySettingVo(0, R.string.smart_not_display, ItemType.TYPE_TITLE, null, 0, 0, 57, null));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList) {
                DisplaySettingVo displaySettingVo2 = (DisplaySettingVo) obj;
                if (displaySettingVo2.getStatus() == AppCardStatus.HIDDEN && displaySettingVo2.getTitleRes() != 0) {
                    arrayList4.add(obj);
                }
            }
            arrayList2.addAll(arrayList4);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(Integer unitFromDevice) {
        Integer num;
        if (unitFromDevice == null || (num = this.unitBiMap.get(unitFromDevice)) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o(Integer unitFromApp) {
        if (unitFromApp == null) {
            return ScaleUnit.KG.getValue();
        }
        Integer key = this.unitBiMap.getKey(unitFromApp);
        return key == null ? ScaleUnit.KG.getValue() : key.intValue();
    }

    public final void enterBabyWeightModel() {
        updateSwitchStatus(4, true);
    }

    @NotNull
    public final MutableLiveData<List<DisplaySettingVo>> getAppCardsLiveData() {
        return (MutableLiveData) this.appCardsLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeviceBatteryLiveData() {
        return (MutableLiveData) this.deviceBatteryLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<EventFwCheckResult> getDeviceFwCheckResultLiveData() {
        return (MutableLiveData) this.deviceFwCheckResultLiveData.getValue();
    }

    @NotNull
    public final EventMutableLiveData<SettingMode> getDeviceSettingMode() {
        return (EventMutableLiveData) this.deviceSettingMode.getValue();
    }

    @NotNull
    public final MutableLiveData<HMDeviceConnectionEvent> getDeviceStatusLiveData() {
        return (MutableLiveData) this.deviceStatusLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getDeviceUnitLiveData() {
        return (MutableLiveData) this.deviceUnitLiveData.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final Object getMode(int i2, @NotNull Continuation<? super Unit> continuation) {
        Job jobF = kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new j(i2, null), 2, null);
        return jobF == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? jobF : Unit.INSTANCE;
    }

    public final void getSetting() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new k(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<UpdateState> getStatueLiveData() {
        return (MutableLiveData) this.statueLiveData.getValue();
    }

    @Nullable
    public final Object getUnit(@NotNull Continuation<? super Unit> continuation) {
        Job jobF = kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new l(null), 2, null);
        return jobF == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? jobF : Unit.INSTANCE;
    }

    @NotNull
    public final MutableLiveData<WiFiConnectStatus> getWifiStateLiveData() {
        return (MutableLiveData) this.wifiStateLiveData.getValue();
    }

    public final void loadAppCards() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new m(null), 2, null);
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        HMLog.debug(TAG, new n(event));
        HMBaseDevice hMBaseDeviceH = h();
        if ((hMBaseDeviceH == null ? null : hMBaseDeviceH.getDeviceType()) == event.getDeviceType()) {
            getDeviceStatusLiveData().postValue(event);
        }
    }

    public final void queryWiFiState() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new q(null), 2, null);
    }

    public final void setPartMeasureModel(boolean enable) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(enable, null), 2, null);
    }

    public final void setUnit(int unit) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new s(unit, null), 2, null);
    }

    public final void updateCards(@NotNull List<DisplaySettingVo> data) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new u(data, null), 2, null);
    }

    public final void updateSwitchStatus(int type, boolean enable) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new v(type, enable, null), 2, null);
    }

    public final void onEventMainThread(@NotNull BFDeviceBatteryEvent event) {
        HMLog.debug(TAG, new o());
        HMBaseDevice hMBaseDeviceH = h();
        if ((hMBaseDeviceH == null ? null : hMBaseDeviceH.getDeviceType()) == event.getDeviceType()) {
            getDeviceBatteryLiveData().postValue(Boolean.TRUE);
        }
    }

    public final void onEventMainThread(@NotNull EventFwCheckResult result) {
        HMLog.debug(TAG, new p(result));
        getDeviceFwCheckResultLiveData().postValue(result);
    }
}
