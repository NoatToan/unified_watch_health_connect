package com.huami.worldclock.manager;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.WorldClockModule;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.bean.WorldClockCityBean;
import com.huami.worldclock.koin.DeviceScopesAndQualifierKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u0014\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\u0017\u001a\u00020\u0002R\u0016\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010)\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010-\u001a\u0004\u0018\u00010*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b\u001c\u0010,R\u001f\u00101\u001a\u0004\u0018\u00010.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b%\u00100¨\u00064"}, d2 = {"Lcom/huami/worldclock/manager/WorldClockConfig;", "", "", "isFirstUsing", "", "Lcom/huami/worldclock/bean/WorldClockBean;", "getLocalWorldClock", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "Lcom/xiaomi/hm/health/bt/profile/worldclock/WorldTime;", "getLocalWorldTime", "getLocaleWorldTimeAndBuiltInCity", "getDefaultWorldCity", "getDefaultWorldTime", "Lcom/huami/worldclock/bean/WorldClockCityBean;", "worldClockBean", "isContainTimeZone", "cityList", "", "updateWorldClockList", "isNeedPushToDevice", "", "ADD_LIMIT", LogUtil.I, "", "a", "Ljava/lang/String;", "TAG", "Lcom/huami/worldclock/manager/WorldClockDataFactory;", "b", "Lkotlin/Lazy;", "()Lcom/huami/worldclock/manager/WorldClockDataFactory;", "worldClockDataFactory", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "getWorldClockScope", "()Lkotlinx/coroutines/CoroutineScope;", "worldClockScope", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmBaseDevice", "Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", "e", "()Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", "worldClockModule", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class WorldClockConfig {
    public static final int ADD_LIMIT = 20;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WorldClockConfig";

    @NotNull
    public static final WorldClockConfig INSTANCE = new WorldClockConfig();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy worldClockDataFactory = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final CoroutineScope worldClockScope = CoroutineScopeKt.plus(new WorldClockContextScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO())), new CoroutineName("WorldClockContextScope"));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy hmBaseDevice = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy worldClockModule = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HMBaseDevice> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMBaseDevice invoke() {
            return DeviceScopesAndQualifierKt.getDeviceHolder(GlobalContext.INSTANCE.get()).getHmBaseDevice(HMDeviceType.MILI);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/worldclock/manager/WorldClockDataFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<WorldClockDataFactory> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorldClockDataFactory invoke() {
            return new WorldClockDataFactory();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WorldClockModule;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<WorldClockModule> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorldClockModule invoke() {
            HMBaseDevice hMBaseDeviceA;
            WorldClockConfig worldClockConfig = WorldClockConfig.INSTANCE;
            HMBaseDevice hMBaseDeviceA2 = worldClockConfig.a();
            if (!(hMBaseDeviceA2 == null ? true : hMBaseDeviceA2 instanceof HMMiLiProDevice) || (hMBaseDeviceA = worldClockConfig.a()) == null) {
                return null;
            }
            return (WorldClockModule) hMBaseDeviceA.getChannelModule(WorldClockModule.class);
        }
    }

    private WorldClockConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice a() {
        return (HMBaseDevice) hmBaseDevice.getValue();
    }

    private final WorldClockDataFactory b() {
        return (WorldClockDataFactory) worldClockDataFactory.getValue();
    }

    private final WorldClockModule c() {
        return (WorldClockModule) worldClockModule.getValue();
    }

    @Nullable
    public final List<WorldClockBean> getDefaultWorldCity(@NotNull Context context) {
        return b().getDefaultWorldCity(context);
    }

    @Nullable
    public final List<WorldTime> getDefaultWorldTime(@NotNull Context context) {
        return b().getDefaultWorldTime(context, a());
    }

    @NotNull
    public final List<WorldClockBean> getLocalWorldClock() {
        return b().getLocalWorldClock();
    }

    @Nullable
    public final List<WorldTime> getLocalWorldTime(@NotNull Context context, @NotNull DeviceInfo deviceInfo) {
        return b().getLocalWorldTime(context, deviceInfo);
    }

    @WorkerThread
    @Nullable
    public final List<WorldTime> getLocaleWorldTimeAndBuiltInCity(@NotNull Context context, @NotNull DeviceInfo deviceInfo) {
        return b().getLocaleWorldTimeAndBuiltInCity(context, deviceInfo, c());
    }

    @NotNull
    public final CoroutineScope getWorldClockScope() {
        return worldClockScope;
    }

    public final boolean isContainTimeZone(@NotNull WorldClockCityBean worldClockBean) {
        return b().isContainTimeZone(worldClockBean);
    }

    public final synchronized boolean isFirstUsing() {
        return b().isFirstUsing();
    }

    public final boolean isNeedPushToDevice() {
        for (WorldClockBean worldClockBean : getLocalWorldClock()) {
            if (worldClockBean.getDaylightState() != 0) {
                return worldClockBean.getOffsetTransitionDateTime() != TimeZoneHelper.INSTANCE.getOffsetTransitionDateTime(worldClockBean.getIdentifier());
            }
        }
        return false;
    }

    public final void updateWorldClockList(@NotNull List<WorldClockBean> cityList) {
        b().updateWorldClockList(cityList);
    }
}
