package com.huami.bluetooth.feature.sleep;

import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.huami.bluetooth.profile.channel.module.sleep.SleepDataModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.onetrack.OneTrack;
import defpackage.Config;
import defpackage.Version;
import defpackage.WriteDataHistory;
import defpackage.kd;
import defpackage.ls;
import defpackage.t5t;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0017\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0002J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/feature/sleep/WriteSleepDataJob;", "", "Lcom/huami/bluetooth/feature/sleep/SleepDataSource;", "source", "", "doWrite", "", VibrateModeSetFragment.MAX, "Ljava/util/Calendar;", "history", StatConstants.PARAM_END, "getStartDate", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Deferred;", "startAsync", "startSync", "Lkotlin/Function0;", "Lls;", "api", "Lkotlin/jvm/functions/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lkd;", "device", "(Lkd;)V", "Companion", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class WriteSleepDataJob {

    @NotNull
    private static final b Companion = new b(null);

    @Deprecated
    public static final int DAY_MILLIS = 86400000;

    @Deprecated
    @NotNull
    public static final String TAG = "WriteSleepDataJob";

    @NotNull
    private final Function0<ls> api;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lls;", PluginDeviceInfo.FMODEL, "()Lls;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<ls> {
        public final /* synthetic */ kd t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kd kdVar) {
            super(0);
            this.t = kdVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ls invoke() {
            SleepDataModule sleepDataModule;
            kd kdVar = this.t;
            t5t.d(WriteSleepDataJob.TAG, "Device connection: " + kdVar.V());
            if (!kdVar.V()) {
                kdVar = null;
            }
            if (kdVar == null || (sleepDataModule = (SleepDataModule) kdVar.y(SleepDataModule.class)) == null) {
                return null;
            }
            return sleepDataModule.loadApi();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/feature/sleep/WriteSleepDataJob$b;", "", "", "DAY_MILLIS", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", PluginDeviceInfo.FMODEL, "kotlin.jvm.PlatformType", PluginDeviceInfo.FDESC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Locale locale = Locale.US;
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(new SimpleDateFormat("yyyy-MM-dd", locale).parse(((SleepData) t).getDate()).getTime()), Long.valueOf(new SimpleDateFormat("yyyy-MM-dd", locale).parse(((SleepData) t2).getDate()).getTime()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/util/Calendar;", StepsInfo.KEY_CALORIES, "Ljava/util/TimeZone;", OneTrack.Param.TZ, "kotlin.jvm.PlatformType", PluginDeviceInfo.FMODEL, "(Ljava/util/Calendar;Ljava/util/TimeZone;)Ljava/util/Calendar;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function2<Calendar, TimeZone, Calendar> {
        public static final d t = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Calendar invoke(@NotNull Calendar cal, @NotNull TimeZone tz) {
            Intrinsics.checkNotNullParameter(cal, "cal");
            Intrinsics.checkNotNullParameter(tz, "tz");
            Calendar calendar = Calendar.getInstance(tz);
            calendar.set(cal.get(1), cal.get(2), cal.get(5), 0, 0, 0);
            calendar.set(14, 0);
            return calendar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.feature.sleep.WriteSleepDataJob$startAsync$1", f = "WriteSleepDataJob.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ SleepDataSource v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SleepDataSource sleepDataSource, Continuation<? super e> continuation) {
            super(2, continuation);
            this.v = sleepDataSource;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WriteSleepDataJob.this.new e(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(WriteSleepDataJob.this.doWrite(this.v));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WriteSleepDataJob(@NotNull Function0<? extends ls> api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doWrite(SleepDataSource source) {
        Calendar calendar;
        List<SleepData> listSortedWith;
        ls lsVarInvoke = this.api.invoke();
        if (lsVarInvoke == null) {
            t5t.r(TAG, "Can not get sleep data API!");
            return false;
        }
        Version version = lsVarInvoke.getVersion();
        if (version == null) {
            t5t.r(TAG, "Version null!");
            return false;
        }
        if (version.getVer() != 1) {
            t5t.r(TAG, "Invalid version (" + version.getVer() + ")!");
        }
        Config configA = lsVarInvoke.a();
        if (configA == null) {
            t5t.r(TAG, "Config null!");
            return false;
        }
        if (configA.getMaxDay() <= 0) {
            t5t.r(TAG, "Invalid max day (" + configA.getMaxDay() + ")!");
            return false;
        }
        WriteDataHistory writeDataHistoryC = lsVarInvoke.c();
        if (writeDataHistoryC == null) {
            t5t.r(TAG, "History null!");
            return false;
        }
        WriteDataHistory writeDataHistory = writeDataHistoryC.getTimestamp() > 0 ? writeDataHistoryC : null;
        if (writeDataHistory != null) {
            calendar = Calendar.getInstance(writeDataHistoryC.getTimezone());
            calendar.setTimeInMillis(((long) writeDataHistory.getTimestamp()) * 1000);
        } else {
            calendar = null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Calendar end = Calendar.getInstance();
        int maxDay = configA.getMaxDay();
        Intrinsics.checkNotNullExpressionValue(end, "end");
        String startDate = simpleDateFormat.format(getStartDate(maxDay, calendar, end).getTime());
        String endDate = simpleDateFormat.format(end.getTime());
        t5t.d(TAG, "Get data from " + startDate + " to " + endDate + '.');
        Intrinsics.checkNotNullExpressionValue(startDate, "startDate");
        Intrinsics.checkNotNullExpressionValue(endDate, "endDate");
        List<SleepData> data = source.getData(startDate, endDate, configA.getDataFlag());
        t5t.d(TAG, "Data size: " + data.size());
        List<SleepData> list = data.isEmpty() ^ true ? data : null;
        if (list == null || (listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new c())) == null) {
            t5t.d(TAG, "No sleep data to write!");
            return true;
        }
        for (SleepData sleepData : listSortedWith) {
            t5t.d(TAG, "Write: " + sleepData);
            if (!lsVarInvoke.a(sleepData)) {
                t5t.r(TAG, "Write data failed!");
                return false;
            }
        }
        t5t.d(TAG, "Write data Success!");
        return true;
    }

    private final Calendar getStartDate(int max, Calendar history, Calendar end) {
        Calendar calendarInvoke;
        t5t.d(TAG, "History: " + history);
        d dVar = d.t;
        TimeZone timeZone = end.getTimeZone();
        Intrinsics.checkNotNullExpressionValue(timeZone, "end.timeZone");
        Calendar calendarInvoke2 = dVar.invoke(end, timeZone);
        if (history != null) {
            TimeZone timeZone2 = end.getTimeZone();
            Intrinsics.checkNotNullExpressionValue(timeZone2, "end.timeZone");
            calendarInvoke = dVar.invoke(history, timeZone2);
        } else {
            calendarInvoke = null;
        }
        if (calendarInvoke != null) {
            max = Math.min(max, (int) ((calendarInvoke2.getTimeInMillis() - calendarInvoke.getTimeInMillis()) / ((long) 86400000)));
        }
        if (max > 0) {
            calendarInvoke2.add(6, (-max) + 1);
            Intrinsics.checkNotNullExpressionValue(calendarInvoke2, "{\n            start.appl…)\n            }\n        }");
        } else {
            Intrinsics.checkNotNullExpressionValue(calendarInvoke2, "{\n            start\n        }");
        }
        return calendarInvoke2;
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

    @Deprecated(message = "用这个方法不传scope或者传了GlobalScope可能会出现不执行的问题", replaceWith = @ReplaceWith(expression = "startSync", imports = {}))
    @NotNull
    public final Deferred<Boolean> startAsync(@NotNull SleepDataSource source, @NotNull CoroutineScope scope, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        return BuildersKt__Builders_commonKt.async$default(scope, context, null, new e(source, null), 2, null);
    }

    public final boolean startSync(@NotNull SleepDataSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return doWrite(source);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WriteSleepDataJob(@NotNull kd device) {
        this(new a(device));
        Intrinsics.checkNotNullParameter(device, "device");
    }
}
