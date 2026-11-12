package com.xiaomi.hm.health.modules;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.milible.callback.PressureCallback;
import com.huami.device.core.sync.impl.job.milible.type.PressureType;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.TimeUtil;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob;
import java.io.Closeable;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/modules/SmartWatchStressJob;", "Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMPressureJob;", "Ljava/io/Closeable;", "", "close", g.g, "Lcom/huami/device/core/sync/impl/job/milible/type/PressureType;", "type", "Ljava/util/Calendar;", "loadStartTime", "", "time", "", "allDay", "saveSyncTime", "start", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/Lazy;", "()Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "", "getDeviceSn", "()Ljava/lang/String;", ParamKey.deviceSn, "getDeviceMac", ParamKey.deviceMac, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class SmartWatchStressJob extends HMPressureJob implements Closeable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy context = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CoroutineContext> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineContext invoke() {
            return SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ PressureType a;
        public final /* synthetic */ Calendar b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PressureType pressureType, Calendar calendar, boolean z) {
            super(0);
            this.a = pressureType;
            this.b = calendar;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Load Sync Time[" + this.a + "]: " + TimeUtil.formatDateTime(this.b) + ", isAllDay: " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, boolean z) {
            super(0);
            this.a = j;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            long j = this.a;
            return "Save Sync Time: " + j + ", " + TimeUtil.formatDateTime(j) + ", isAllDay: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HMPressureData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<HMPressureData> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Load AllDay Data: " + ArraysUtil.toString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HMPressureData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<HMPressureData> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Load Single Data: " + ArraysUtil.toString(this.a);
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
        public final String invoke() {
            return "同步压力数据错误";
        }
    }

    public SmartWatchStressJob() {
        setScope(CoroutineScopeKt.CoroutineScope(a()));
        setStateChannel(ChannelKt.Channel$default(0, null, null, 7, null));
    }

    private final CoroutineContext a() {
        return (CoroutineContext) this.context.getValue();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.Cancelable
    public void cancel() {
        close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            CoroutineScopeKt.cancel$default(getScope(), null, 1, null);
        } catch (Throwable unused) {
        }
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob
    @NotNull
    public String getDeviceMac() {
        String boundDeviceAddress = getDeviceManagerApi().getBoundDeviceAddress(HMDeviceType.WATCH);
        return boundDeviceAddress == null ? "" : boundDeviceAddress;
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob
    @Nullable
    public String getDeviceSn() {
        return getDeviceSnService().getSn(HMDeviceType.WATCH);
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob, com.huami.device.core.sync.impl.job.milible.PressureJob
    @NotNull
    public Calendar loadStartTime(@NotNull PressureType type) {
        Long device_bind_time;
        boolean z = type == PressureType.ALL_DAY;
        long jLongValue = z ? Box.get().getLong("LastStressAllDayDataSyncTime") : Box.get().getLong("LastStressSingleDataSyncTime");
        if (jLongValue == 0) {
            Device deviceBound = getDeviceManagerApi().getDeviceBound(HMDeviceType.WATCH);
            jLongValue = (deviceBound == null || (device_bind_time = deviceBound.getDevice_bind_time()) == null) ? 0L : device_bind_time.longValue();
        }
        Calendar calendar = Calendar.getInstance();
        if (jLongValue == 0) {
            calendar.setTimeInMillis(0L);
            calendar.set(2000, 0, 1, 0, 0, 0);
        } else {
            calendar.setTimeInMillis(jLongValue);
        }
        HMLog.info("DataFlowSyncModule", new b(type, calendar, z));
        return calendar;
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob
    public void saveSyncTime(long time, boolean allDay) {
        HMLog.info("DataFlowSyncModule", new c(time, allDay));
        if (allDay) {
            Box.get().put("LastStressAllDayDataSyncTime", time);
        } else {
            Box.get().put("LastStressSingleDataSyncTime", time);
        }
    }

    @Override // com.huami.device.core.sync.impl.job.milible.PressureJob, com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException {
        try {
            PressureType pressureType = PressureType.ALL_DAY;
            PressureCallback pressureCallback = new PressureCallback(pressureType);
            loadProDevice().startSyncPressureDataAllDay(loadStartTime(pressureType), pressureCallback);
            List<HMPressureData> listLoadOutData = pressureCallback.loadOutData(maxTime());
            HMLog.info("DataFlowSyncModule", new d(listLoadOutData));
            Unit unit = Unit.INSTANCE;
            onDataOut(pressureType, listLoadOutData);
            PressureType pressureType2 = PressureType.SINGLE;
            PressureCallback pressureCallback2 = new PressureCallback(pressureType2);
            loadProDevice().startSyncPressureDataSingle(loadStartTime(pressureType2), pressureCallback2);
            List<HMPressureData> listLoadOutData2 = pressureCallback2.loadOutData(maxTime());
            HMLog.info("DataFlowSyncModule", new e(listLoadOutData2));
            onDataOut(pressureType2, listLoadOutData2);
        } catch (Exception e2) {
            HMLog.warn$default("DataFlowSyncModule", null, f.a, 2, null);
            onError(e2);
            throw new SyncException("sync " + findType() + " error", e2, 0, 4, null);
        }
    }
}
