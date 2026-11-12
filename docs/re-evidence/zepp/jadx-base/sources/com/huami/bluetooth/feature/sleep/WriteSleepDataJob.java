package com.huami.bluetooth.feature.sleep;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.sleep.Config;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.huami.bluetooth.profile.channel.module.sleep.SleepDataApi;
import com.huami.bluetooth.profile.channel.module.sleep.SleepDataModule;
import com.huami.bluetooth.profile.channel.module.sleep.Version;
import com.huami.bluetooth.profile.channel.module.sleep.WriteDataHistory;
import com.huami.discovery.bridge.bracelet.BraceletHandler;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0002J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eR\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/feature/sleep/WriteSleepDataJob;", "", "Lcom/huami/bluetooth/feature/sleep/SleepDataSource;", "source", "", "a", "", "max", "Ljava/util/Calendar;", BraceletHandler.H5_PARAM_BACK_KEY_HISTORY, "end", "b", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/Deferred;", "startAsync", "Lkotlin/Function0;", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepDataApi;", "Lkotlin/jvm/functions/Function0;", "api", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class WriteSleepDataJob {

    @Deprecated
    public static final int DAY_MILLIS = 86400000;

    @Deprecated
    @NotNull
    public static final String TAG = "WriteSleepDataJob";

    @NotNull
    private static final b b = new b(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<SleepDataApi> api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/SleepDataApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SleepDataApi> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepDataApi invoke() {
            SleepDataModule sleepDataModule;
            HMBaseDevice hMBaseDevice = this.a;
            Debug.fi(WriteSleepDataJob.TAG, Intrinsics.stringPlus("Device connection: ", Boolean.valueOf(hMBaseDevice.isConnected())));
            if (!hMBaseDevice.isConnected()) {
                hMBaseDevice = null;
            }
            if (hMBaseDevice == null || (sleepDataModule = (SleepDataModule) hMBaseDevice.getChannelModule(SleepDataModule.class)) == null) {
                return null;
            }
            return sleepDataModule.loadApi();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/bluetooth/feature/sleep/WriteSleepDataJob$b", "", "", "DAY_MILLIS", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Ljava/util/Calendar;", "cal", "Ljava/util/TimeZone;", "tz", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Calendar, TimeZone, Calendar> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar invoke(@NotNull Calendar calendar, @NotNull TimeZone timeZone) {
            Calendar calendar2 = Calendar.getInstance(timeZone);
            calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            calendar2.set(14, 0);
            return calendar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.feature.sleep.WriteSleepDataJob$startAsync$1", f = "WriteSleepDataJob.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ SleepDataSource c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SleepDataSource sleepDataSource, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = sleepDataSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WriteSleepDataJob.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(WriteSleepDataJob.this.a(this.c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WriteSleepDataJob(@NotNull Function0<? extends SleepDataApi> function0) {
        this.api = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(SleepDataSource source) {
        Calendar calendar;
        SleepDataApi sleepDataApiInvoke = this.api.invoke();
        if (sleepDataApiInvoke == null) {
            Debug.w(TAG, "Can not get sleep data API!");
            return false;
        }
        Version version = sleepDataApiInvoke.getVersion();
        if (version == null) {
            Debug.w(TAG, "Version null!");
            return false;
        }
        if (version.getVer() != 1) {
            Debug.w(TAG, "Invalid version (" + version.getVer() + ")!");
            return false;
        }
        Config config = sleepDataApiInvoke.getConfig();
        if (config == null) {
            Debug.w(TAG, "Config null!");
            return false;
        }
        if (config.getMaxDay() <= 0) {
            Debug.w(TAG, "Invalid max day (" + config.getMaxDay() + ")!");
            return false;
        }
        WriteDataHistory lastWriteHistory = sleepDataApiInvoke.getLastWriteHistory();
        if (lastWriteHistory == null) {
            Debug.w(TAG, "History null!");
            return false;
        }
        WriteDataHistory writeDataHistory = lastWriteHistory.getTimestamp() > 0 ? lastWriteHistory : null;
        if (writeDataHistory == null) {
            calendar = null;
        } else {
            calendar = Calendar.getInstance(lastWriteHistory.getTimezone());
            calendar.setTimeInMillis(((long) writeDataHistory.getTimestamp()) * 1000);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Calendar calendar2 = Calendar.getInstance();
        String str = simpleDateFormat.format(b(config.getMaxDay(), calendar, calendar2).getTime());
        String str2 = simpleDateFormat.format(calendar2.getTime());
        Debug.fi(TAG, "Get data from " + ((Object) str) + " to " + ((Object) str2) + '.');
        List<SleepData> data = source.getData(str, str2, config.getDataFlag());
        Debug.fi(TAG, Intrinsics.stringPlus("Data size: ", Integer.valueOf(data.size())));
        if (!(!data.isEmpty())) {
            data = null;
        }
        List<SleepData> listSortedWith = data != null ? CollectionsKt___CollectionsKt.sortedWith(data, new Comparator<T>() { // from class: com.huami.bluetooth.feature.sleep.WriteSleepDataJob$doWrite$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Locale locale = Locale.US;
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(new SimpleDateFormat("yyyy-MM-dd", locale).parse(((SleepData) t).getDate()).getTime()), Long.valueOf(new SimpleDateFormat("yyyy-MM-dd", locale).parse(((SleepData) t2).getDate()).getTime()));
            }
        }) : null;
        if (listSortedWith == null) {
            Debug.fi(TAG, "No sleep data to write!");
            return true;
        }
        for (SleepData sleepData : listSortedWith) {
            Debug.fi(TAG, Intrinsics.stringPlus("Write: ", sleepData));
            if (!sleepDataApiInvoke.writeData(sleepData)) {
                Debug.w(TAG, "Write data failed!");
                return false;
            }
        }
        Debug.fi(TAG, "Write data Success!");
        return true;
    }

    private final Calendar b(int max, Calendar history, Calendar end) {
        Debug.fi(TAG, Intrinsics.stringPlus("History: ", history));
        c cVar = c.a;
        Calendar calendarInvoke = cVar.invoke(end, end.getTimeZone());
        Calendar calendarInvoke2 = history == null ? null : cVar.invoke(history, end.getTimeZone());
        if (calendarInvoke2 != null) {
            max = Math.min(max, (int) ((calendarInvoke.getTimeInMillis() - calendarInvoke2.getTimeInMillis()) / ((long) 86400000)));
        }
        if (max > 0) {
            calendarInvoke.add(6, (-max) + 1);
        }
        return calendarInvoke;
    }

    public static /* synthetic */ Deferred startAsync$default(WriteSleepDataJob writeSleepDataJob, SleepDataSource sleepDataSource, CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineScope = GlobalScope.INSTANCE;
        }
        if ((i & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return writeSleepDataJob.startAsync(sleepDataSource, coroutineScope, coroutineContext);
    }

    @NotNull
    public final Deferred<Boolean> startAsync(@NotNull SleepDataSource source, @NotNull CoroutineScope scope, @NotNull CoroutineContext context) {
        return e.b(scope, context, null, new d(source, null), 2, null);
    }

    public WriteSleepDataJob(@NotNull HMBaseDevice hMBaseDevice) {
        this(new a(hMBaseDevice));
    }
}
