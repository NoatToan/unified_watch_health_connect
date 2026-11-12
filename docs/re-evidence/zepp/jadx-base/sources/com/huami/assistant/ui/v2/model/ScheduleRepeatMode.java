package com.huami.assistant.ui.v2.model;

import android.content.Context;
import android.text.format.Time;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.assistant.ui.v2.repo.WorkDayRepo;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.util.DateDay;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0010\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001c\u0010\u0014\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "", "", "scheduleTime", "duration", "startTime", "endTime", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "expand", "other", "", "equals", "", "toString", "a", "J", "getMode", "()J", "mode", "<init>", "(J)V", "Companion", "EveryDay", "Fortnight", "Friday", "Monday", "Month", "Once", "Saturday", "Sunday", "Thursday", "Tuesday", "Wednesday", "Week", "Weekend", "WorkDay", SportAnalytics.Params.VALUE_YEAR, "assistant_release"}, k = 1, mv = {1, 5, 1})
public class ScheduleRepeatMode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long mode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Companion;", "", "", "isSupportWorkDay", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupportWorkDay() {
            return SettingRepo.INSTANCE.loadScheduleVersion().getSupportPerpetualCalendarWorkday() && !AssistantModule.isOverSeaSchedule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$EveryDay;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class EveryDay extends ScheduleRepeatMode {

        @NotNull
        public static final EveryDay INSTANCE = new EveryDay();

        private EveryDay() {
            super(Monday.INSTANCE.getMode() | Tuesday.INSTANCE.getMode() | Wednesday.INSTANCE.getMode() | Thursday.INSTANCE.getMode() | Friday.INSTANCE.getMode() | Saturday.INSTANCE.getMode() | Sunday.INSTANCE.getMode());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Fortnight;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Fortnight extends ScheduleRepeatMode {

        @NotNull
        public static final Fortnight INSTANCE = new Fortnight();

        private Fortnight() {
            super(256L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Friday;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Friday extends ScheduleRepeatMode {

        @NotNull
        public static final Friday INSTANCE = new Friday();

        private Friday() {
            super(16L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Monday;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Monday extends ScheduleRepeatMode {

        @NotNull
        public static final Monday INSTANCE = new Monday();

        private Monday() {
            super(1L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Month;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Month extends ScheduleRepeatMode {

        @NotNull
        public static final Month INSTANCE = new Month();

        private Month() {
            super(512L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Once;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Once extends ScheduleRepeatMode {

        @NotNull
        public static final Once INSTANCE = new Once();

        private Once() {
            super(0L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Saturday;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Saturday extends ScheduleRepeatMode {

        @NotNull
        public static final Saturday INSTANCE = new Saturday();

        private Saturday() {
            super(32L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Sunday;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Sunday extends ScheduleRepeatMode {

        @NotNull
        public static final Sunday INSTANCE = new Sunday();

        private Sunday() {
            super(64L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Thursday;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Thursday extends ScheduleRepeatMode {

        @NotNull
        public static final Thursday INSTANCE = new Thursday();

        private Thursday() {
            super(8L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Tuesday;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Tuesday extends ScheduleRepeatMode {

        @NotNull
        public static final Tuesday INSTANCE = new Tuesday();

        private Tuesday() {
            super(2L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Wednesday;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Wednesday extends ScheduleRepeatMode {

        @NotNull
        public static final Wednesday INSTANCE = new Wednesday();

        private Wednesday() {
            super(4L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Week;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Week extends ScheduleRepeatMode {

        @NotNull
        public static final Week INSTANCE = new Week();

        private Week() {
            super(128L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Weekend;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Weekend extends ScheduleRepeatMode {

        @NotNull
        public static final Weekend INSTANCE = new Weekend();

        private Weekend() {
            super(Saturday.INSTANCE.getMode() | Sunday.INSTANCE.getMode());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$WorkDay;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class WorkDay extends ScheduleRepeatMode {

        @NotNull
        public static final WorkDay INSTANCE = new WorkDay();

        private WorkDay() {
            super(2048L);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode$Year;", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Year extends ScheduleRepeatMode {

        @NotNull
        public static final Year INSTANCE = new Year();

        private Year() {
            super(1024L);
        }
    }

    public ScheduleRepeatMode() {
        this(0L, 1, null);
    }

    public ScheduleRepeatMode(long j) {
        this.mode = j;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof ScheduleRepeatMode) && ((ScheduleRepeatMode) other).getMode() == getMode();
    }

    @NotNull
    public final List<Long> expand(long scheduleTime, long duration, long startTime, long endTime, @NotNull Context context) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        long j = 1000;
        calendar.setTimeInMillis(scheduleTime * j);
        Calendar calendar2 = (Calendar) calendar.clone();
        while (true) {
            i = 1;
            if (calendar2.getTimeInMillis() / j > endTime) {
                break;
            }
            long timeInMillis = calendar2.getTimeInMillis() / j;
            if (startTime <= timeInMillis && timeInMillis <= endTime) {
                arrayList.add(Long.valueOf(calendar2.getTimeInMillis()));
            }
            calendar2.add(6, 1);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTimeInMillis(jLongValue);
            boolean zIsWorkDay = getMode() == Once.INSTANCE.getMode() && DateDay.from(jLongValue).equals(calendar);
            Time time = new Time();
            time.set(calendar3.getTimeInMillis());
            int i2 = time.weekDay;
            if ((getMode() & Sunday.INSTANCE.getMode()) != 0 && i2 == 0) {
                zIsWorkDay = true;
            }
            if ((getMode() & Monday.INSTANCE.getMode()) != 0 && i2 == i) {
                zIsWorkDay = true;
            }
            if ((getMode() & Tuesday.INSTANCE.getMode()) != 0 && i2 == 2) {
                zIsWorkDay = true;
            }
            if ((getMode() & Wednesday.INSTANCE.getMode()) != 0 && i2 == 3) {
                zIsWorkDay = true;
            }
            if ((getMode() & Thursday.INSTANCE.getMode()) != 0 && i2 == 4) {
                zIsWorkDay = true;
            }
            if ((getMode() & Friday.INSTANCE.getMode()) != 0 && i2 == 5) {
                zIsWorkDay = true;
            }
            if ((getMode() & Saturday.INSTANCE.getMode()) != 0 && i2 == 6) {
                zIsWorkDay = true;
            }
            if ((getMode() & WorkDay.INSTANCE.getMode()) != 0) {
                if (INSTANCE.isSupportWorkDay()) {
                    zIsWorkDay = WorkDayRepo.INSTANCE.getInstance(context).isWorkDay(calendar3);
                } else {
                    if (i <= i2 && i2 <= 5) {
                        zIsWorkDay = true;
                    }
                }
            }
            if ((getMode() & Week.INSTANCE.getMode()) != 0 && calendar.get(7) == calendar3.get(7)) {
                zIsWorkDay = true;
            }
            if ((getMode() & Month.INSTANCE.getMode()) != 0 && calendar.get(5) == calendar3.get(5)) {
                zIsWorkDay = true;
            }
            if ((getMode() & Fortnight.INSTANCE.getMode()) != 0) {
                long j2 = 604800000;
                if ((((calendar3.getTimeInMillis() / j2) - (calendar.getTimeInMillis() / j2)) % ((long) 2) == 0) && calendar.get(7) == calendar3.get(7)) {
                    zIsWorkDay = true;
                }
            }
            if ((getMode() & Year.INSTANCE.getMode()) != 0 && calendar.get(6) == calendar3.get(6)) {
                zIsWorkDay = true;
            }
            if (zIsWorkDay) {
                linkedHashSet.add(Long.valueOf(jLongValue / j));
            }
            i = 1;
        }
        return CollectionsKt___CollectionsKt.toList(linkedHashSet);
    }

    public long getMode() {
        return this.mode;
    }

    @NotNull
    public String toString() {
        return "ScheduleRepeatMode( " + getMode() + " )";
    }

    public /* synthetic */ ScheduleRepeatMode(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
