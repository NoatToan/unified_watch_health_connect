package com.xiaomi.hm.health.device.health.synctime;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.ShareAnalytics;
import com.xiaomi.hm.health.databases.model.Device;
import java.util.Calendar;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086.¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086.¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\b\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime;", "Lorg/koin/core/component/KoinComponent;", "", "initAFSyncTime", "saveSyncTimeToLocal", "syncToServer", "Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime$SyncTime;", "<set-?>", "a", "Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime$SyncTime;", "getAfSyncTime", "()Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime$SyncTime;", HealthDataSyncTime.h, "b", "getAfAccSyncTime", HealthDataSyncTime.i, "c", "getAfPpgSyncTime", HealthDataSyncTime.j, GoogleApiAvailabilityLight.a, "getAfRrPeakSyncTime", "afRrPeakSyncTime", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "e", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/data/PropertyStoreApi;", "propertyStoreApi", "<init>", "()V", "Companion", "SyncTime", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataSyncTime implements KoinComponent {

    @NotNull
    private static final String f = "HealthDataSyncTime";

    @NotNull
    private static final String g = "huami.mifit.user.settings.health.data.synctime";

    @NotNull
    private static final String h = "afSyncTime";

    @NotNull
    private static final String i = "afAccSyncTime";

    @NotNull
    private static final String j = "afPpgSyncTime";

    @NotNull
    private static final String k = "afRrpeakSyncTime";
    private static final long l = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private SyncTime afSyncTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private SyncTime afAccSyncTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private SyncTime afPpgSyncTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SyncTime afRrPeakSyncTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy propertyStoreApi;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<HealthDataSyncTime> m = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\rJ\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0002R#\u0010\u000e\u001a\u00020\u00078F@\u0007X\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime$Companion;", "", "", "b", "c", "", "a", "Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime;", "getInstance$annotations", "()V", DefaultSettingsSpiCall.n, "", "AF_ACC_KEY", "Ljava/lang/String;", "AF_KEY", "AF_PPG_KEY", "AF_RR_PEAK_KEY", "KEY", "TAG", "TIME_IN_MILLISECOND_ONE", "J", "<init>", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a(long j) {
            return j > 0 && b(j) < System.currentTimeMillis();
        }

        private final long b(long j) {
            return j * 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long c(long j) {
            return j / 1000;
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final HealthDataSyncTime getInstance() {
            return (HealthDataSyncTime) HealthDataSyncTime.m.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime$SyncTime;", "", "", "newTime", "", ShareAnalytics.ParamValue.SAVE, "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Ljava/util/Calendar;", "get", "a", "J", "getTime", "()J", "setTime", "(J)V", "time", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "deviceSyncTime", "<init>", "(JLkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SyncTime {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long time;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final Function1<Device, Long> deviceSyncTime;

        public SyncTime() {
            this(0L, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SyncTime(long j, @Nullable Function1<? super Device, Long> function1) {
            this.time = j;
            this.deviceSyncTime = function1;
        }

        @NotNull
        public final Calendar get(@NotNull Device device) {
            long jLongValue;
            Calendar calendar = Calendar.getInstance();
            Long lValueOf = Long.valueOf(getTime() * 1000);
            long jLongValue2 = lValueOf.longValue();
            if (!(jLongValue2 > 0 && jLongValue2 < System.currentTimeMillis())) {
                lValueOf = null;
            }
            if (lValueOf == null) {
                Function1<Device, Long> function1 = this.deviceSyncTime;
                Long lInvoke = function1 != null ? function1.invoke(device) : null;
                jLongValue = lInvoke == null ? device.getDevice_bind_time().longValue() : lInvoke.longValue();
            } else {
                jLongValue = lValueOf.longValue();
            }
            calendar.setTimeInMillis(jLongValue);
            return calendar;
        }

        public final long getTime() {
            return this.time;
        }

        public final void save(long newTime) {
            Companion companion = HealthDataSyncTime.INSTANCE;
            if (companion.a(this.time)) {
                if (companion.a(newTime)) {
                    this.time = Math.max(newTime, this.time);
                }
            } else {
                if (!companion.a(newTime)) {
                    newTime = companion.c(System.currentTimeMillis());
                }
                this.time = newTime;
            }
        }

        public final void setTime(long j) {
            this.time = j;
        }

        public /* synthetic */ SyncTime(long j, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : function1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/health/synctime/HealthDataSyncTime;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HealthDataSyncTime> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthDataSyncTime invoke() {
            return new HealthDataSyncTime(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Device, Long> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(@NotNull Device device) {
            Long afResultSyncTime = device.getAfResultSyncTime();
            if (afResultSyncTime != null) {
                if (afResultSyncTime.longValue() > 0) {
                    return afResultSyncTime;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Device, Long> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(@NotNull Device device) {
            Long accSyncTime = device.getAccSyncTime();
            if (accSyncTime != null) {
                if (accSyncTime.longValue() > 0) {
                    return accSyncTime;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Device, Long> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(@NotNull Device device) {
            Long ppgSyncTime = device.getPpgSyncTime();
            if (ppgSyncTime != null) {
                if (ppgSyncTime.longValue() > 0) {
                    return ppgSyncTime;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Device, Long> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(@NotNull Device device) {
            Long rrIntervalSyncTime = device.getRrIntervalSyncTime();
            if (rrIntervalSyncTime != null) {
                if (rrIntervalSyncTime.longValue() > 0) {
                    return rrIntervalSyncTime;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse health data sync time error by jsonStr:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "saveSyncTimeToLocal failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save health data sync time to server e: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HealthDataSyncTime() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.propertyStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<PropertyStoreApi>() { // from class: com.xiaomi.hm.health.device.health.synctime.HealthDataSyncTime$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.data.PropertyStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PropertyStoreApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(PropertyStoreApi.class), qualifier, objArr);
            }
        });
        initAFSyncTime();
    }

    public /* synthetic */ HealthDataSyncTime(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final PropertyStoreApi a() {
        return (PropertyStoreApi) this.propertyStoreApi.getValue();
    }

    @NotNull
    public static final HealthDataSyncTime getInstance() {
        return INSTANCE.getInstance();
    }

    @NotNull
    public final SyncTime getAfAccSyncTime() {
        SyncTime syncTime = this.afAccSyncTime;
        Objects.requireNonNull(syncTime);
        return syncTime;
    }

    @NotNull
    public final SyncTime getAfPpgSyncTime() {
        SyncTime syncTime = this.afPpgSyncTime;
        Objects.requireNonNull(syncTime);
        return syncTime;
    }

    @NotNull
    public final SyncTime getAfRrPeakSyncTime() {
        SyncTime syncTime = this.afRrPeakSyncTime;
        Objects.requireNonNull(syncTime);
        return syncTime;
    }

    @NotNull
    public final SyncTime getAfSyncTime() {
        SyncTime syncTime = this.afSyncTime;
        Objects.requireNonNull(syncTime);
        return syncTime;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void initAFSyncTime() {
        Object objM3845constructorimpl;
        JSONObject jSONObject = null;
        String property = a().getProperty(g, null);
        if (property != null) {
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(new JSONObject(property));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(f, new f(thM3848exceptionOrNullimpl));
            }
            jSONObject = (JSONObject) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        }
        this.afSyncTime = new SyncTime(jSONObject == null ? 0L : jSONObject.optLong(h), b.a);
        this.afAccSyncTime = new SyncTime(jSONObject == null ? 0L : jSONObject.optLong(i), c.a);
        this.afPpgSyncTime = new SyncTime(jSONObject == null ? 0L : jSONObject.optLong(j), d.a);
        this.afRrPeakSyncTime = new SyncTime(jSONObject != null ? jSONObject.optLong(k) : 0L, e.a);
    }

    public final void saveSyncTimeToLocal() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(h, getAfSyncTime().getTime());
            jSONObject.put(i, getAfAccSyncTime().getTime());
            jSONObject.put(j, getAfPpgSyncTime().getTime());
            jSONObject.put(k, getAfRrPeakSyncTime().getTime());
            a().setProperty(g, jSONObject.toString());
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(f, new g(thM3848exceptionOrNullimpl));
        }
    }

    public final void syncToServer() {
        try {
            a().postPropertiesToServer(true);
        } catch (Exception e2) {
            HMLog.info(f, new h(e2));
        }
    }
}
