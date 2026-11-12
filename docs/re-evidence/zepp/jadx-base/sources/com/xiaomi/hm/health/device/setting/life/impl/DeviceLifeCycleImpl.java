package com.xiaomi.hm.health.device.setting.life.impl;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.exception.NotSupportException;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.LocalBindingAnalytics;
import com.xiaomi.hm.health.device.assistant.schedule.ScheduleLifeCycle;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.dial.DialLifeCycle;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import com.xiaomi.hm.health.device.setting.life.LifeCycleFilter;
import com.xiaomi.hm.health.device.setting.life.br.DeviceLifeEventBroadCast;
import com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.DeviceTokenSetter;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneDeviceLifeCycle;
import com.xiaomi.hm.health.ui.smartplay.meidacontrol.MusicDeviceLifeCycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001FB\u0011\b\u0002\u0012\u0006\u0010(\u001a\u00020&¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002JE\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e¢\u0006\u0002\b\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010%\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020#H\u0016R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0016\u0010+\u001a\u00020\u001d8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R#\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020,018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u0001018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00103R\u001d\u00108\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b-\u00107R\"\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020#098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u001d\u0010?\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b2\u0010>R\u0016\u0010C\u001a\u00020@8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/impl/DeviceLifeCycleImpl;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Lkotlinx/coroutines/CoroutineScope;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "i", hl.k, z.j, "l", "f", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", UserDataStore.FIRST_NAME, "g", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "m", "", "e", "a", "onDeviceBind", "onDeviceUnBind", "onBoundedDeviceConnected", "", "deviceId", "onBoundedDeviceDisconnect", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "Lcom/xiaomi/hm/health/databases/model/Device;", "", "status", "onDeviceStatusChange", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Ljava/lang/String;", "tag", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "c", "Lkotlin/Lazy;", "()Ljava/util/List;", "bleEventsSubscribers", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "healthEventsSubscribers", "lifecycleObservers", "Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "()Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "deviceSnServiceLazy", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "mapOfDeviceStatus", "Lkotlinx/coroutines/CompletableJob;", "h", "()Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class DeviceLifeCycleImpl implements DeviceLifeCycle, CoroutineScope, KoinComponent {

    @Nullable
    private static DeviceLifeCycle i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy bleEventsSubscribers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<BleEventSubscriber> healthEventsSubscribers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<DeviceLifeCycle> lifecycleObservers;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSnServiceLazy;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, Integer> mapOfDeviceStatus;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Object j = new Object();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/impl/DeviceLifeCycleImpl$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "getInstance", DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Ljava/lang/Object;", IconCompat.EXTRA_OBJ, "Ljava/lang/Object;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DeviceLifeCycle getInstance(@NotNull Context context) {
            if (DeviceLifeCycleImpl.i == null) {
                synchronized (DeviceLifeCycleImpl.j) {
                    if (DeviceLifeCycleImpl.i == null) {
                        Companion companion = DeviceLifeCycleImpl.INSTANCE;
                        DeviceLifeCycleImpl.i = new DeviceLifeCycleImpl(context, null);
                    }
                    DeviceTokenSetter.INSTANCE.subscribeBroadcast(context);
                    Unit unit = Unit.INSTANCE;
                }
            }
            return DeviceLifeCycleImpl.i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends BleEventSubscriber>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends BleEventSubscriber> getA() {
            return new BleEventSubscribeManager().createSubscribers();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HMBaseDevice b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "disable device: " + this.a.getMDeviceSource();
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0851b extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0851b(HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a.getDeviceType().name() + " -- > Not support in sync center.";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "error .. " + this.a.getMessage();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "disable failed and e: " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMBaseDevice hMBaseDevice) {
            super(0);
            this.b = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(DeviceLifeCycleImpl.this.tag, new a(this.b));
            DeviceLifeCycleImpl.this.l(this.b);
            try {
                SyncCenterFactory.INSTANCE.cancel(this.b);
            } catch (NotSupportException unused) {
                HMLog.warn$default(DeviceLifeCycleImpl.this.tag, null, new C0851b(this.b), 2, null);
            } catch (Throwable th) {
                HMLog.error(DeviceLifeCycleImpl.this.tag, "00", th, new c(th));
            }
            List listE = DeviceLifeCycleImpl.this.e();
            HMBaseDevice hMBaseDevice = this.b;
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                try {
                    ((DeviceLifeCycle) it2.next()).disable(hMBaseDevice);
                } catch (Exception e) {
                    HMLog.info(deviceLifeCycleImpl.tag, new d(e));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HMBaseDevice b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "enable device: " + this.a.getMDeviceSource();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "enable failed and e: " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMBaseDevice hMBaseDevice) {
            super(0);
            this.b = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(DeviceLifeCycleImpl.this.tag, new a(this.b));
            DeviceLifeCycleImpl.this.i(this.b);
            List listE = DeviceLifeCycleImpl.this.e();
            HMBaseDevice hMBaseDevice = this.b;
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                try {
                    ((DeviceLifeCycle) it2.next()).enable(hMBaseDevice);
                    AgpsTimeStore agpsTimeStoreApi = DeviceXFunctionsKt.getAgpsTimeStoreApi();
                    if (agpsTimeStoreApi != null) {
                        agpsTimeStoreApi.reset();
                    }
                } catch (Exception e) {
                    HMLog.info(deviceLifeCycleImpl.tag, new b(e));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<CompletableJob> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob getA() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$localBindingAnalytics$1", f = "DeviceLifeCycleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMBaseDevice hMBaseDevice, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
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
            String boundDeviceAddress = HMDeviceManager.getInstance().getBoundDeviceAddress(this.b.getDeviceType());
            DeviceInfo deviceInfo = this.b.getDeviceInfo();
            String serialNumber = deviceInfo == null ? null : deviceInfo.getSerialNumber();
            DeviceInfo deviceInfo2 = this.b.getDeviceInfo();
            String deviceID = deviceInfo2 != null ? deviceInfo2.getDeviceID() : null;
            if (boundDeviceAddress != null && serialNumber != null && deviceID != null) {
                LocalBindingAnalytics.INSTANCE.postRecord(boundDeviceAddress, serialNumber, deviceID);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HMBaseDevice b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onBoundedDeviceConnected " + this.a.getMDeviceSource();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onBoundedDeviceConnected failed and e: " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMBaseDevice hMBaseDevice) {
            super(0);
            this.b = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(DeviceLifeCycleImpl.this.tag, new a(this.b));
            DeviceLifeCycleImpl.this.i(this.b);
            DeviceLifeCycleImpl.this.k(this.b);
            List listE = DeviceLifeCycleImpl.this.e();
            HMBaseDevice hMBaseDevice = this.b;
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                try {
                    ((DeviceLifeCycle) it2.next()).onBoundedDeviceConnected(hMBaseDevice);
                } catch (Throwable th) {
                    HMLog.info(deviceLifeCycleImpl.tag, new b(th));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$onBoundedDeviceConnected$2", f = "DeviceLifeCycleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ HMBaseDevice c;
        public final /* synthetic */ DeviceLifeCycleImpl d;

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
                return "不更新SN，deviceinfo是null";
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
                return "不更新SN，sn是null";
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
                return "更新sn失败";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HMBaseDevice hMBaseDevice, DeviceLifeCycleImpl deviceLifeCycleImpl, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
            this.d = deviceLifeCycleImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = new g(this.c, this.d, continuation);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMBaseDevice hMBaseDevice = this.c;
            DeviceLifeCycleImpl deviceLifeCycleImpl = this.d;
            try {
                Result.Companion companion = Result.Companion;
                if (hMBaseDevice.getDeviceInfo() == null) {
                    HMLog.warn$default(deviceLifeCycleImpl.tag, null, a.a, 2, null);
                } else {
                    String serialNumber = hMBaseDevice.getDeviceInfo().getSerialNumber();
                    if (serialNumber == null || serialNumber.length() == 0) {
                        HMLog.warn$default(deviceLifeCycleImpl.tag, null, b.a, 2, null);
                    } else {
                        deviceLifeCycleImpl.c().updateSn(hMBaseDevice.getDeviceType(), hMBaseDevice.getDeviceInfo().getSerialNumber());
                    }
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            DeviceLifeCycleImpl deviceLifeCycleImpl2 = this.d;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error(deviceLifeCycleImpl2.tag, "", thM3848exceptionOrNullimpl, c.a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Unit> {
        public final /* synthetic */ String b;

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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onBoundedDeviceDisconnect with id: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onBoundedDeviceDisconnect failed and e: " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(DeviceLifeCycleImpl.this.tag, new a(this.b));
            List listE = DeviceLifeCycleImpl.this.e();
            String str = this.b;
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                try {
                    ((DeviceLifeCycle) it2.next()).onBoundedDeviceDisconnect(str);
                } catch (Exception e) {
                    HMLog.info(deviceLifeCycleImpl.tag, new b(e));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HMBaseDevice b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onDeviceBind " + this.a.getMDeviceSource();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onDeviceBind failed, and e: " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HMBaseDevice hMBaseDevice) {
            super(0);
            this.b = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(DeviceLifeCycleImpl.this.tag, new a(this.b));
            DeviceLifeCycleImpl.this.j(this.b);
            DeviceLifeCycleImpl.this.i(this.b);
            DeviceLifeCycleImpl.this.f(this.b);
            List listE = DeviceLifeCycleImpl.this.e();
            HMBaseDevice hMBaseDevice = this.b;
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                try {
                    ((DeviceLifeCycle) it2.next()).onDeviceBind(hMBaseDevice);
                } catch (Exception e) {
                    HMLog.info(deviceLifeCycleImpl.tag, new b(e));
                }
            }
            DeviceLifeCycleImpl.this.a(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Device b;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ Device b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, Device device) {
                super(0);
                this.a = i;
                this.b = device;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                int i = this.a;
                Device device = this.b;
                return "device status change + " + i + " ==> " + (device == null ? null : device.getDevice_id());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onDeviceStatusChange failed and e: " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Device device, int i) {
            super(0);
            this.b = device;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(DeviceLifeCycleImpl.this.tag, new a(this.c, this.b));
            Device device = this.b;
            if (device != null && device.getDevice_id() != null) {
                String device_id = this.b.getDevice_id();
                Integer num = (Integer) DeviceLifeCycleImpl.this.mapOfDeviceStatus.get(device_id);
                if (num != null && num.intValue() == 1 && this.c != 1) {
                    int value = HMDeviceType.TREADMILL.getValue();
                    Integer device_type = this.b.getDevice_type();
                    if (device_type == null || value != device_type.intValue()) {
                        SyncCenterFactory.INSTANCE.cancel(this.b.getDevice_id(), this.b.getSn());
                    }
                    DeviceLifeCycleImpl.this.onBoundedDeviceDisconnect(device_id);
                }
                DeviceLifeCycleImpl.this.mapOfDeviceStatus.put(device_id, Integer.valueOf(this.c));
            }
            List listE = DeviceLifeCycleImpl.this.e();
            Device device2 = this.b;
            int i = this.c;
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                try {
                    ((DeviceLifeCycle) it2.next()).onDeviceStatusChange(device2, i);
                } catch (Exception e) {
                    HMLog.info(deviceLifeCycleImpl.tag, new b(e));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Unit> {
        public final /* synthetic */ HMBaseDevice b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onDeviceUnBind " + this.a.getMDeviceSource();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onDeviceUnBind failed and e: " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(HMBaseDevice hMBaseDevice) {
            super(0);
            this.b = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info(DeviceLifeCycleImpl.this.tag, new a(this.b));
            DeviceLifeCycleImpl.this.l(this.b);
            List listE = DeviceLifeCycleImpl.this.e();
            HMBaseDevice hMBaseDevice = this.b;
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                try {
                    ((DeviceLifeCycle) it2.next()).onDeviceUnBind(hMBaseDevice);
                } catch (Exception e) {
                    HMLog.info(deviceLifeCycleImpl.tag, new b(e));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$postJob$1", f = "DeviceLifeCycleImpl.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;
        public final /* synthetic */ DeviceLifeCycleImpl d;

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
                return "run life job error!";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, DeviceLifeCycleImpl deviceLifeCycleImpl, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = function2;
            this.d = deviceLifeCycleImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = new l(this.c, this.d, continuation);
            lVar.b = obj;
            return lVar;
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
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.b;
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.c;
                    this.a = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                HMLog.error$default(this.d.tag, null, th, a.a, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$register$1", f = "DeviceLifeCycleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;
            public final /* synthetic */ BleEventSubscriber b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice, BleEventSubscriber bleEventSubscriber) {
                super(0);
                this.a = hMBaseDevice;
                this.b = bleEventSubscriber;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "register subscribe ble event on " + this.a.getMDeviceSource() + " - " + this.b.getTag();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(HMBaseDevice hMBaseDevice, Continuation<? super m> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceLifeCycleImpl.this.new m(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (BleEventSubscriber bleEventSubscriber : DeviceLifeCycleImpl.this.b()) {
                HMLog.info(DeviceLifeCycleImpl.this.tag, new a(this.c, bleEventSubscriber));
                bleEventSubscriber.register(this.c);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$registerOnBind$1", f = "DeviceLifeCycleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HMBaseDevice hMBaseDevice, Continuation<? super n> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceLifeCycleImpl.this.new n(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<BleEventSubscriber> listCreateHealthSubscribers = new BleEventSubscribeManager().createHealthSubscribers(true);
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            deviceLifeCycleImpl.healthEventsSubscribers.clear();
            deviceLifeCycleImpl.healthEventsSubscribers.addAll(listCreateHealthSubscribers);
            DeviceLifeCycleImpl deviceLifeCycleImpl2 = DeviceLifeCycleImpl.this;
            HMBaseDevice hMBaseDevice = this.c;
            for (BleEventSubscriber bleEventSubscriber : listCreateHealthSubscribers) {
                HMLog.i(deviceLifeCycleImpl2.tag, "register subscribe ble event on " + hMBaseDevice.getMDeviceSource() + " - " + bleEventSubscriber.getTag(), new Object[0]);
                bleEventSubscriber.register(hMBaseDevice);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$registerOnConnected$1", f = "DeviceLifeCycleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;
            public final /* synthetic */ BleEventSubscriber b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice, BleEventSubscriber bleEventSubscriber) {
                super(0);
                this.a = hMBaseDevice;
                this.b = bleEventSubscriber;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "register subscribe ble event on " + this.a.getMDeviceSource() + " - " + this.b.getTag();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(HMBaseDevice hMBaseDevice, Continuation<? super o> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceLifeCycleImpl.this.new o(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<BleEventSubscriber> listCreateConnectSubscribers = new BleEventSubscribeManager().createConnectSubscribers();
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            deviceLifeCycleImpl.healthEventsSubscribers.clear();
            deviceLifeCycleImpl.healthEventsSubscribers.addAll(listCreateConnectSubscribers);
            DeviceLifeCycleImpl deviceLifeCycleImpl2 = DeviceLifeCycleImpl.this;
            HMBaseDevice hMBaseDevice = this.c;
            for (BleEventSubscriber bleEventSubscriber : listCreateConnectSubscribers) {
                HMLog.info(deviceLifeCycleImpl2.tag, new a(hMBaseDevice, bleEventSubscriber));
                bleEventSubscriber.register(hMBaseDevice);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$unregister$1", f = "DeviceLifeCycleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;
            public final /* synthetic */ BleEventSubscriber b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice, BleEventSubscriber bleEventSubscriber) {
                super(0);
                this.a = hMBaseDevice;
                this.b = bleEventSubscriber;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "register remove subscribe ble event on " + this.a.getMDeviceSource() + " - " + this.b.getTag();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;
            public final /* synthetic */ BleEventSubscriber b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HMBaseDevice hMBaseDevice, BleEventSubscriber bleEventSubscriber) {
                super(0);
                this.a = hMBaseDevice;
                this.b = bleEventSubscriber;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "register remove subscribe ble event on " + this.a.getMDeviceSource() + " - " + this.b.getTag();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(HMBaseDevice hMBaseDevice, Continuation<? super p> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceLifeCycleImpl.this.new p(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (BleEventSubscriber bleEventSubscriber : DeviceLifeCycleImpl.this.b()) {
                HMLog.info(DeviceLifeCycleImpl.this.tag, new a(this.c, bleEventSubscriber));
                bleEventSubscriber.unregister(this.c);
            }
            List<BleEventSubscriber> list = DeviceLifeCycleImpl.this.healthEventsSubscribers;
            DeviceLifeCycleImpl deviceLifeCycleImpl = DeviceLifeCycleImpl.this;
            HMBaseDevice hMBaseDevice = this.c;
            for (BleEventSubscriber bleEventSubscriber2 : list) {
                HMLog.info(deviceLifeCycleImpl.tag, new b(hMBaseDevice, bleEventSubscriber2));
                bleEventSubscriber2.unregister(hMBaseDevice);
            }
            return Unit.INSTANCE;
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
            return "error on life cycle";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DeviceLifeCycleImpl(Context context) {
        this.context = context;
        this.tag = "DeviceLifeCycle";
        this.bleEventsSubscribers = LazyKt__LazyJVMKt.lazy(a.a);
        this.healthEventsSubscribers = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.lifecycleObservers = arrayList;
        arrayList.add(new MusicDeviceLifeCycle(context));
        arrayList.add(new BtPhoneDeviceLifeCycle());
        arrayList.add(new ScheduleLifeCycle());
        arrayList.add(new WorldClockImpl());
        arrayList.add(new EventReminderImpl());
        arrayList.add(new WeatherDeviceLifeCycle());
        arrayList.add(new FindPhoneLifeCycle());
        arrayList.add(new NotificationDeviceLifeCycle());
        arrayList.add(new LanguageLifeCycle());
        arrayList.add(new GpsInjectImpl());
        arrayList.add(new DeviceLifeEventBroadCast(LocalBroadcastManager.getInstance(context)));
        arrayList.add(new DialLifeCycle());
        arrayList.add(new HealthDeviceLifeCycle());
        arrayList.add(new OtaLifeCycle());
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceSnServiceLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceSnService>() { // from class: com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceSnService getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceSnService.class), qualifier, objArr);
            }
        });
        this.mapOfDeviceStatus = new ConcurrentHashMap<>();
        this.job = LazyKt__LazyJVMKt.lazy(d.a);
    }

    public /* synthetic */ DeviceLifeCycleImpl(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(HMBaseDevice device) {
        if (ConfigHelperKt.hasMiliFeature(Feature.L66_SERIES_S)) {
            ((HMMiLiProDevice) device).disableHid(true, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl$disableHid$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "disableHid: " + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.info(this.a.tag, new a(result));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BleEventSubscriber> b() {
        return (List) this.bleEventsSubscribers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceSnService c() {
        return (DeviceSnService) this.deviceSnServiceLazy.getValue();
    }

    private final CompletableJob d() {
        return (CompletableJob) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DeviceLifeCycle> e() {
        LifeCycleFilter lifeCycleFilter$devicex_zeppRelease = DeviceXBuilder.INSTANCE.getLifeCycleFilter$devicex_zeppRelease();
        List<DeviceLifeCycle> listFilterProxies = lifeCycleFilter$devicex_zeppRelease == null ? null : lifeCycleFilter$devicex_zeppRelease.filterProxies(this.lifecycleObservers);
        return listFilterProxies == null ? this.lifecycleObservers : listFilterProxies;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(HMBaseDevice device) {
        h(this, null, new e(device, null), 1, null);
    }

    private final void g(CoroutineDispatcher dispatcher, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> fn) {
        kotlinx.coroutines.e.f(this, dispatcher.plus(ExtKt.getExceptionHandler()), null, new l(fn, this, null), 2, null);
    }

    @JvmStatic
    @NotNull
    public static final DeviceLifeCycle getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    public static /* synthetic */ void h(DeviceLifeCycleImpl deviceLifeCycleImpl, CoroutineDispatcher coroutineDispatcher, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineDispatcher = Dispatchers.getIO();
        }
        deviceLifeCycleImpl.g(coroutineDispatcher, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(HMBaseDevice device) {
        h(this, null, new m(device, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(HMBaseDevice device) {
        h(this, null, new n(device, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(HMBaseDevice device) {
        h(this, null, new o(device, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(HMBaseDevice device) {
        h(this, null, new p(device, null), 1, null);
    }

    private final void m(Function0<Unit> fn) {
        try {
            fn.getA();
        } catch (Throwable th) {
            HMLog.error$default(this.tag, null, th, q.a, 2, null);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void disable(@NotNull HMBaseDevice device) {
        m(new b(device));
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void enable(@NotNull HMBaseDevice device) {
        m(new c(device));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return d().plus(Dispatchers.getIO());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceConnected(@NotNull HMBaseDevice device) {
        m(new f(device));
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new g(device, this, null), 2, null);
        a(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceDisconnect(@NotNull String deviceId) {
        m(new h(deviceId));
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceBind(@NotNull HMBaseDevice device) {
        m(new i(device));
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceStatusChange(@Nullable Device device, int status) {
        m(new j(device, status));
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceUnBind(@NotNull HMBaseDevice device) {
        m(new k(device));
    }
}
