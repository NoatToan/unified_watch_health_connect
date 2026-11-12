package com.huami.assistant.ui.v2.repo;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.LongSparseArray;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.ui.v2.datasource.RemoteResult;
import com.huami.assistant.ui.v2.datasource.imp.ScheduleRemoteDataSourceImp;
import com.huami.assistant.ui.v2.db.ScheduleDataBase;
import com.huami.assistant.ui.v2.db.dao.ScheduleDao;
import com.huami.assistant.ui.v2.model.ScheduleDataItem;
import com.huami.assistant.ui.v2.model.ScheduleDateItem;
import com.huami.assistant.ui.v2.model.ScheduleEditType;
import com.huami.assistant.ui.v2.model.ScheduleEmptyItem;
import com.huami.assistant.ui.v2.model.ScheduleListItemModel;
import com.huami.assistant.ui.v2.model.ScheduleListModel;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.model.ScheduleSplitItem;
import com.huami.assistant.ui.v2.model.ScheduleYearItem;
import com.huami.assistant.ui.v2.repo.ScheduleRepo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.DateDay;
import com.huami.widget.share.ShareAnalytics;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 72\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J!\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0014\u001a\u00020\u0011J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0011J3\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010-\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b/\u00100R\u001d\u00104\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/ScheduleRepo;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "schedule", "", "c", "", "position", "", hl.k, "current", "g", "(Lcom/huami/assistant/ui/v2/model/ScheduleModel;J)Ljava/lang/Long;", "Ljava/util/Calendar;", "cal", "", "b", "", "step", "f", "getTotalScheduleCount", "startDayIndex", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleListItemModel;", "loadAll", "newSchedule", "Lcom/huami/assistant/ui/v2/model/ScheduleEditType;", "editType", ShareAnalytics.ParamValue.SAVE, "(Lcom/huami/assistant/ui/v2/model/ScheduleModel;Lcom/huami/assistant/ui/v2/model/ScheduleModel;JLcom/huami/assistant/ui/v2/model/ScheduleEditType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "(Lcom/huami/assistant/ui/v2/model/ScheduleModel;JLcom/huami/assistant/ui/v2/model/ScheduleEditType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "mRpcApi", "Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "e", "()Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "mScheduleDao", "Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "h", "()Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "remoteDataSource", "i", "()I", "source", "<init>", "(Landroid/content/Context;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleRepo {

    @NotNull
    private static final String f = "Schedule";
    private static int g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRpcApi = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mScheduleDao = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy remoteDataSource = LazyKt__LazyJVMKt.lazy(h.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy source = LazyKt__LazyJVMKt.lazy(new l());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RemoteResult<Boolean> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete schedule, result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RemoteResult<Boolean> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete future trigger insertOrUpdate，result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RemoteResult<Boolean> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete current schedule trigger insertOrUpdate，result:" + this.a;
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
        public final String invoke() {
            return "result mScheduleShowCount:" + ScheduleRepo.g;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ScheduleModel> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<ScheduleModel> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load all schedules:" + TextUtils.join("\n", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<ScheduleRpcApi> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleRpcApi invoke() {
            return AssistantModule.getScheduleApi();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/db/dao/ScheduleDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<ScheduleDao> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleDao invoke() {
            return ScheduleDataBase.INSTANCE.getInstance(ScheduleRepo.this.context).scheduleDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/datasource/imp/ScheduleRemoteDataSourceImp;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<ScheduleRemoteDataSourceImp> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleRemoteDataSourceImp invoke() {
            return new ScheduleRemoteDataSourceImp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(RemoteResult<Boolean> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save schedule，result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(RemoteResult<Boolean> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save future schedule，result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(RemoteResult<Boolean> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save current schedule，result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Integer> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(AssistantModule.getCurrentSource(ScheduleRepo.this.context));
        }
    }

    public ScheduleRepo(@NotNull Context context) {
        this.context = context;
    }

    private final boolean b(ScheduleModel schedule, Calendar cal) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(schedule.getStartTime() * ((long) 1000));
        if (!Intrinsics.areEqual(schedule.getRepeatMode(), ScheduleRepeatMode.Week.INSTANCE) && !Intrinsics.areEqual(schedule.getRepeatMode(), ScheduleRepeatMode.Fortnight.INSTANCE)) {
            if (Intrinsics.areEqual(schedule.getRepeatMode(), ScheduleRepeatMode.Month.INSTANCE)) {
                if (calendar.get(5) != cal.get(5)) {
                    return false;
                }
            } else if (Intrinsics.areEqual(schedule.getRepeatMode(), ScheduleRepeatMode.Year.INSTANCE)) {
                if (calendar.get(2) != cal.get(2) || calendar.get(5) != cal.get(5)) {
                    return false;
                }
            } else {
                if (Intrinsics.areEqual(schedule.getRepeatMode(), ScheduleRepeatMode.WorkDay.INSTANCE)) {
                    return WorkDayRepo.INSTANCE.getInstance(this.context).isWorkDay(cal);
                }
                Time time = new Time();
                time.set(cal.getTimeInMillis());
                boolean z = (schedule.getRepeatMode().getMode() & ScheduleRepeatMode.Sunday.INSTANCE.getMode()) != 0 && time.weekDay == 0;
                if ((schedule.getRepeatMode().getMode() & ScheduleRepeatMode.Monday.INSTANCE.getMode()) != 0) {
                    z = z || time.weekDay == 1;
                }
                if ((schedule.getRepeatMode().getMode() & ScheduleRepeatMode.Tuesday.INSTANCE.getMode()) != 0) {
                    z = z || time.weekDay == 2;
                }
                if ((schedule.getRepeatMode().getMode() & ScheduleRepeatMode.Wednesday.INSTANCE.getMode()) != 0) {
                    z = z || time.weekDay == 3;
                }
                if ((schedule.getRepeatMode().getMode() & ScheduleRepeatMode.Thursday.INSTANCE.getMode()) != 0) {
                    z = z || time.weekDay == 4;
                }
                if ((schedule.getRepeatMode().getMode() & ScheduleRepeatMode.Friday.INSTANCE.getMode()) != 0) {
                    z = z || time.weekDay == 5;
                }
                if ((schedule.getRepeatMode().getMode() & ScheduleRepeatMode.Saturday.INSTANCE.getMode()) == 0) {
                    return z;
                }
                if (!z && time.weekDay != 6) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void c(ScheduleModel schedule) {
        Long lG;
        if (Intrinsics.areEqual(schedule.getRepeatMode(), ScheduleRepeatMode.Once.INSTANCE)) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(schedule.getStartTime() * ((long) 1000));
        Unit unit = Unit.INSTANCE;
        if (b(schedule, calendar) || (lG = g(schedule, schedule.getStartTime())) == null) {
            return;
        }
        long jLongValue = lG.longValue();
        long startTime = jLongValue - schedule.getStartTime();
        schedule.setStartTime(jLongValue);
        schedule.setStopTime(schedule.getStopTime() + startTime);
    }

    private final ScheduleRpcApi d() {
        return (ScheduleRpcApi) this.mRpcApi.getValue();
    }

    private final ScheduleDao e() {
        return (ScheduleDao) this.mScheduleDao.getValue();
    }

    private final Calendar f(ScheduleModel schedule, Calendar current, int step) {
        ScheduleRepeatMode repeatMode = schedule.getRepeatMode();
        if (Intrinsics.areEqual(repeatMode, ScheduleRepeatMode.Week.INSTANCE)) {
            Calendar calendar = (Calendar) current.clone();
            calendar.add(3, step * 1);
            return calendar;
        }
        if (Intrinsics.areEqual(repeatMode, ScheduleRepeatMode.Fortnight.INSTANCE)) {
            Calendar calendar2 = (Calendar) current.clone();
            calendar2.add(3, step * 2);
            return calendar2;
        }
        if (Intrinsics.areEqual(repeatMode, ScheduleRepeatMode.Month.INSTANCE)) {
            Calendar calendar3 = (Calendar) current.clone();
            calendar3.add(2, step * 1);
            return calendar3;
        }
        if (Intrinsics.areEqual(repeatMode, ScheduleRepeatMode.Year.INSTANCE)) {
            Calendar calendar4 = (Calendar) current.clone();
            calendar4.add(1, step * 1);
            return calendar4;
        }
        Calendar calendar5 = (Calendar) current.clone();
        calendar5.add(6, step * 1);
        return calendar5;
    }

    private final Long g(ScheduleModel schedule, long current) {
        if (current < schedule.getRepeatStopTime() && !Intrinsics.areEqual(schedule.getRepeatMode(), ScheduleRepeatMode.Once.INSTANCE)) {
            Calendar calendar = Calendar.getInstance();
            long j2 = 1000;
            calendar.setTimeInMillis(current * j2);
            IntRange intRange = Intrinsics.areEqual(schedule.getRepeatMode(), ScheduleRepeatMode.WorkDay.INSTANCE) ? new IntRange(1, 30) : new IntRange(1, 10);
            int first = intRange.getFirst();
            int last = intRange.getLast();
            if (first <= last) {
                while (true) {
                    int i2 = first + 1;
                    Calendar calendarF = f(schedule, calendar, first);
                    if (b(schedule, calendarF)) {
                        return Long.valueOf(calendarF.getTimeInMillis() / j2);
                    }
                    if (first == last) {
                        break;
                    }
                    first = i2;
                }
            }
        }
        return null;
    }

    private final ScheduleRemoteDataSourceImp h() {
        return (ScheduleRemoteDataSourceImp) this.remoteDataSource.getValue();
    }

    private final int i() {
        return ((Number) this.source.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(int i2, ScheduleRepo scheduleRepo, List list) {
        LongSparseArray longSparseArray;
        HMLog.info("Schedule", new e(list));
        g = 0;
        long j2 = 1000;
        long jDayStartMills = DateDay.today().add(0).dayStartMills() / j2;
        long jDayEndMills = DateDay.today().add(30).dayEndMills() / j2;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ScheduleModel scheduleModel = (ScheduleModel) it2.next();
            Iterator it3 = it2;
            long j3 = j2;
            ArrayList arrayList2 = arrayList;
            long j4 = jDayEndMills;
            Iterator<T> it4 = scheduleModel.getRepeatMode().expand(scheduleModel.getStartTime(), scheduleModel.getStopTime() - scheduleModel.getStartTime(), jDayStartMills, Math.min(jDayEndMills, scheduleModel.getRepeatStopTime()), scheduleRepo.context).iterator();
            while (it4.hasNext()) {
                arrayList2.add(new ScheduleListModel(((Number) it4.next()).longValue(), scheduleModel));
                g++;
            }
            it2 = it3;
            arrayList = arrayList2;
            j2 = j3;
            jDayEndMills = j4;
        }
        long j5 = j2;
        ArrayList<ScheduleListModel> arrayList3 = arrayList;
        LongSparseArray longSparseArray2 = new LongSparseArray();
        int i3 = i2;
        if (i3 <= 30) {
            while (true) {
                int i4 = i3 + 1;
                ArrayList arrayList4 = new ArrayList();
                DateDay dateDayAdd = DateDay.today().add(i3);
                for (ScheduleListModel scheduleListModel : arrayList3) {
                    if (dateDayAdd.equals(scheduleListModel.getExpandTime() * j5)) {
                        arrayList4.add(scheduleListModel);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    longSparseArray2.put(dateDayAdd.dayStartMills() / j5, arrayList4);
                }
                if (i4 > 30) {
                    break;
                }
                i3 = i4;
            }
        }
        if (longSparseArray2.size() > 0 && longSparseArray2.indexOfKey(DateDay.today().dayStartMills() / j5) < 0) {
            longSparseArray2.put(DateDay.today().dayStartMills() / j5, new ArrayList());
        }
        ArrayList arrayList5 = new ArrayList();
        int i5 = -1;
        long jDayStartMills2 = DateDay.today().dayStartMills() / j5;
        int size = longSparseArray2.size();
        if (size > 0) {
            int i6 = 0;
            boolean z = false;
            while (true) {
                int i7 = i6 + 1;
                long jKeyAt = longSparseArray2.keyAt(i6);
                Calendar calendar = Calendar.getInstance();
                long j6 = jKeyAt * j5;
                calendar.setTimeInMillis(j6);
                int i8 = calendar.get(1);
                if (i8 != i5) {
                    arrayList5.add(new ScheduleYearItem(jKeyAt));
                    i5 = i8;
                }
                if (jKeyAt < jDayStartMills2) {
                    z = true;
                } else if (z && DateUtils.isToday(j6)) {
                    arrayList5.add(new ScheduleSplitItem(null, 1, null));
                }
                arrayList5.add(new ScheduleDateItem(jKeyAt));
                List list2 = (List) longSparseArray2.valueAt(i6);
                if (list2.isEmpty()) {
                    arrayList5.add(new ScheduleEmptyItem(null, 1, null));
                    longSparseArray = longSparseArray2;
                } else {
                    int size2 = list2.size();
                    List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.huami.assistant.ui.v2.repo.ScheduleRepo$loadAll$lambda-7$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((ScheduleListModel) t).getExpandTime()), Long.valueOf(((ScheduleListModel) t2).getExpandTime()));
                        }
                    });
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
                    int i9 = 0;
                    for (Object obj : listSortedWith) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        LongSparseArray longSparseArray3 = longSparseArray2;
                        arrayList6.add(new ScheduleDataItem((ScheduleListModel) obj, i9 == size2 + (-1)));
                        longSparseArray2 = longSparseArray3;
                        i9 = i10;
                    }
                    longSparseArray = longSparseArray2;
                    arrayList5.addAll(arrayList6);
                }
                if (i7 >= size) {
                    break;
                }
                longSparseArray2 = longSparseArray;
                i6 = i7;
            }
        }
        return arrayList5;
    }

    private final List<ScheduleModel> k(ScheduleModel schedule, long position) {
        long stopTime = schedule.getStopTime() - schedule.getStartTime();
        Calendar calendar = Calendar.getInstance();
        long j2 = 1000;
        calendar.setTimeInMillis(schedule.getStartTime() * j2);
        Long lValueOf = Long.valueOf(schedule.getRepeatStopTime());
        if (!(lValueOf.longValue() != 4294967295L)) {
            lValueOf = null;
        }
        long jLongValue = lValueOf == null ? position + ((long) 157680000) : lValueOf.longValue();
        Long lValueOf2 = null;
        Long lValueOf3 = null;
        while (true) {
            if (calendar.getTimeInMillis() / j2 >= jLongValue || lValueOf2 != null) {
                break;
            }
            long timeInMillis = calendar.getTimeInMillis() / j2;
            if (timeInMillis < position && (lValueOf3 == null || lValueOf3.longValue() < timeInMillis)) {
                lValueOf3 = Long.valueOf(timeInMillis);
            }
            if (timeInMillis > position) {
                lValueOf2 = Long.valueOf(timeInMillis);
            } else {
                Long lG = g(schedule, calendar.getTimeInMillis() / j2);
                if (lG == null) {
                    break;
                }
                calendar.setTimeInMillis(lG.longValue() * j2);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (lValueOf3 != null) {
            ScheduleModel scheduleModelCopyNew$default = ScheduleModel.copyNew$default(schedule, false, 1, null);
            scheduleModelCopyNew$default.setId(schedule.getId());
            scheduleModelCopyNew$default.setRepeatStopTime(lValueOf3.longValue() + stopTime + 1);
            Unit unit = Unit.INSTANCE;
            arrayList.add(scheduleModelCopyNew$default);
        }
        if (lValueOf2 != null) {
            ScheduleModel scheduleModelCopyNew = schedule.copyNew(lValueOf3 != null);
            scheduleModelCopyNew.setStartTime(lValueOf2.longValue());
            scheduleModelCopyNew.setStopTime(lValueOf2.longValue() + stopTime);
            Unit unit2 = Unit.INSTANCE;
            arrayList.add(scheduleModelCopyNew);
        }
        return arrayList;
    }

    public static /* synthetic */ LiveData loadAll$default(ScheduleRepo scheduleRepo, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return scheduleRepo.loadAll(i2);
    }

    @Nullable
    public final Object delete(@NotNull ScheduleModel scheduleModel, long j2, @NotNull ScheduleEditType scheduleEditType, @NotNull Continuation<? super Boolean> continuation) {
        if (Intrinsics.areEqual(scheduleEditType, ScheduleEditType.ALL.INSTANCE) || Intrinsics.areEqual(scheduleModel.getRepeatMode(), ScheduleRepeatMode.Once.INSTANCE)) {
            boolean zDeleteById = d().deleteById(scheduleModel.getId());
            if (zDeleteById) {
                e().deleteById(scheduleModel.getId());
                HMLog.info("Schedule", new a(h().delete(scheduleModel.getId())));
            }
            return Boxing.boxBoolean(zDeleteById);
        }
        if (Intrinsics.areEqual(scheduleEditType, ScheduleEditType.FUTURE.INSTANCE)) {
            long j3 = 1000;
            scheduleModel.setRepeatStopTime(DateDay.from(j2 * j3).dayEndMills() / j3);
            boolean zAdd = d().add(scheduleModel.toWatchSchedule());
            if (zAdd) {
                e().insertOrUpdate(scheduleModel);
                HMLog.info("Schedule", new b(h().push(scheduleModel, i())));
            }
            return Boxing.boxBoolean(zAdd);
        }
        List<ScheduleModel> listK = k(scheduleModel, j2);
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i2 = 0;
        for (Object obj : listK) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ScheduleModel scheduleModel2 = (ScheduleModel) obj;
            z = z && d().add(scheduleModel2.toWatchSchedule());
            if (z) {
                e().insertOrUpdate(scheduleModel2);
                arrayList.add(scheduleModel2);
            }
            i2 = i3;
        }
        HMLog.info("Schedule", new c(h().push(arrayList, i())));
        return Boxing.boxBoolean(z);
    }

    public final int getTotalScheduleCount() {
        int i2 = g;
        HMLog.info("Schedule", d.a);
        return i2;
    }

    @NotNull
    public final LiveData<List<ScheduleListItemModel>> loadAll(final int startDayIndex) {
        return Transformations.map(e().getAllData(), new Function() { // from class: kj6
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ScheduleRepo.j(startDayIndex, this, (List) obj);
            }
        });
    }

    @Nullable
    public final Object save(@NotNull ScheduleModel scheduleModel, @NotNull ScheduleModel scheduleModel2, long j2, @NotNull ScheduleEditType scheduleEditType, @NotNull Continuation<? super Boolean> continuation) {
        c(scheduleModel);
        c(scheduleModel2);
        if (Intrinsics.areEqual(scheduleEditType, ScheduleEditType.ALL.INSTANCE) || Intrinsics.areEqual(scheduleModel.getRepeatMode(), ScheduleRepeatMode.Once.INSTANCE)) {
            boolean zAdd = d().add(scheduleModel2.toWatchSchedule());
            if (zAdd) {
                e().insertOrUpdate(scheduleModel2);
                HMLog.info("Schedule", new i(h().push(scheduleModel2, i())));
            }
            return Boxing.boxBoolean(zAdd);
        }
        if (Intrinsics.areEqual(scheduleEditType, ScheduleEditType.FUTURE.INSTANCE)) {
            long j3 = 1000;
            scheduleModel.setRepeatStopTime(DateDay.from(j2 * j3).dayEndMills() / j3);
            boolean zAdd2 = d().add(scheduleModel.toWatchSchedule());
            ArrayList arrayList = new ArrayList();
            if (zAdd2) {
                e().insertOrUpdate(scheduleModel);
                zAdd2 = d().add(scheduleModel2.toWatchSchedule());
                arrayList.add(scheduleModel);
            }
            if (zAdd2) {
                e().insertOrUpdate(scheduleModel2);
                arrayList.add(scheduleModel2);
            }
            ScheduleRemoteDataSourceImp scheduleRemoteDataSourceImpH = h();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((ScheduleModel) obj).getTitle().length() > 0) {
                    arrayList2.add(obj);
                }
            }
            HMLog.info("Schedule", new j(scheduleRemoteDataSourceImpH.push(arrayList2, i())));
            return Boxing.boxBoolean(zAdd2);
        }
        ArrayList arrayList3 = new ArrayList();
        boolean zAdd3 = true;
        for (ScheduleModel scheduleModel3 : k(scheduleModel, j2)) {
            zAdd3 = zAdd3 && d().add(scheduleModel3.toWatchSchedule());
            if (zAdd3) {
                e().insertOrUpdate(scheduleModel3);
                arrayList3.add(scheduleModel3);
            }
        }
        ScheduleModel scheduleModelCopyNew$default = ScheduleModel.copyNew$default(scheduleModel2, false, 1, null);
        scheduleModelCopyNew$default.setRepeatMode(ScheduleRepeatMode.Once.INSTANCE);
        if (zAdd3) {
            zAdd3 = d().add(scheduleModelCopyNew$default.toWatchSchedule());
            arrayList3.add(scheduleModelCopyNew$default);
        }
        if (zAdd3) {
            e().insertOrUpdate(scheduleModelCopyNew$default);
        }
        ScheduleRemoteDataSourceImp scheduleRemoteDataSourceImpH2 = h();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((ScheduleModel) obj2).getTitle().length() > 0) {
                arrayList4.add(obj2);
            }
        }
        HMLog.info("Schedule", new k(scheduleRemoteDataSourceImpH2.push(arrayList4, i())));
        return Boxing.boxBoolean(zAdd3);
    }
}
