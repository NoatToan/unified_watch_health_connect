package com.huami.femalehealth.logiclib.calculation;

import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0006\u001a\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u00020\u0006\u001a\u0015\u0010\u000b\u001a\u00020\u0006*\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\f\u001a\n\u0010\u000e\u001a\u00020\f*\u00020\r\u001a\n\u0010\u000e\u001a\u00020\f*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\r*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\r*\u00020\f\u001a\n\u0010\u0010\u001a\u00020\r*\u00020\r\u001a\n\u0010\u0010\u001a\u00020\t*\u00020\t\u001a\u0014\u0010\u0012\u001a\u00020\r*\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u001a\u0014\u0010\u0012\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u001a\u001b\u0010\u0013\u001a\u00020\t*\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0016\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\u0004\u001a\u0015\u0010\u0017\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\u0004\u001a\u0015\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\u0004\u001a\u0015\u0010\u0017\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\u0004\"\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/Day;", "Lcom/huami/femalehealth/logiclib/calculation/Milli;", "toMilli", "", "ceil", "toDay", "Lcom/huami/femalehealth/logiclib/calculation/Duration;", "", "toList", "", "that", "to", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "Ljava/util/Date;", "toDateTriple", "toDate", "resetZeroHour", "begin", "resetZeroTimezone", "toUTC0", "(Ljava/lang/Long;Z)J", "duration", "inDur", "notInDur", "a", "J", "ONE_DAY_MILLI", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class AidKt {
    private static final long a = 86400000;

    public static final boolean inDur(long j, @NotNull Duration duration) {
        return j >= duration.getStart() && j <= duration.getEnd();
    }

    public static final boolean notInDur(long j, @NotNull Duration duration) {
        return !inDur(j, duration);
    }

    @NotNull
    public static final Date resetZeroHour(@NotNull Date date) {
        return toDate(DateHelper.INSTANCE.nowDate(date.getTime()));
    }

    @NotNull
    public static final Date resetZeroTimezone(@NotNull Date date, boolean z) {
        return DateHelper.INSTANCE.toUTC0(date, z);
    }

    public static /* synthetic */ Date resetZeroTimezone$default(Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return resetZeroTimezone(date, z);
    }

    @NotNull
    public static final Duration to(long j, long j2) {
        return new Duration(j, j2);
    }

    @NotNull
    public static final Date toDate(@NotNull Milli milli) {
        return new Date(milli.getValue());
    }

    @NotNull
    public static final DateTriple toDateTriple(@NotNull Date date) {
        return toDateTriple(new Milli(date.getTime()));
    }

    @NotNull
    public static final Day toDay(@NotNull Milli milli, boolean z) {
        return z ? new Day((int) Math.ceil((milli.getValue() * 1.0d) / 86400000)) : new Day((int) ((milli.getValue() * 1.0d) / 86400000));
    }

    public static /* synthetic */ Day toDay$default(Milli milli, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toDay(milli, z);
    }

    @NotNull
    public static final List<Milli> toList(@NotNull Duration duration) {
        int value = toDay(duration).getValue();
        ArrayList arrayList = new ArrayList(value);
        for (int i = 0; i < value; i++) {
            arrayList.add(new Milli(duration.getStart() + (((long) i) * 86400000)));
        }
        return arrayList;
    }

    @NotNull
    public static final Milli toMilli(@NotNull Day day) {
        return new Milli(((long) day.getValue()) * 86400000);
    }

    public static final long toUTC0(@Nullable Long l, boolean z) {
        if (l == null || l.longValue() == 0) {
            return 0L;
        }
        return DateHelper.INSTANCE.toUTC0(new Date(l.longValue()), z).getTime();
    }

    public static final boolean inDur(@NotNull Milli milli, @NotNull Duration duration) {
        return inDur(milli.getValue(), duration);
    }

    public static final boolean notInDur(@NotNull Milli milli, @NotNull Duration duration) {
        return !inDur(milli, duration);
    }

    public static final long resetZeroHour(long j) {
        return resetZeroHour(new Date(j)).getTime();
    }

    public static final long resetZeroTimezone(long j, boolean z) {
        return DateHelper.INSTANCE.toUTC0(new Date(j), z).getTime();
    }

    public static /* synthetic */ long resetZeroTimezone$default(long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return resetZeroTimezone(j, z);
    }

    @NotNull
    public static final Date toDate(@NotNull DateTriple dateTriple) {
        return toDate(toMilli(dateTriple));
    }

    @NotNull
    public static final DateTriple toDateTriple(@NotNull Milli milli) {
        return DateHelper.INSTANCE.nowDate(milli.getValue());
    }

    @NotNull
    public static final Milli toMilli(@NotNull Duration duration) {
        return new Milli(duration.getDurMilli());
    }

    @NotNull
    public static final Day toDay(@NotNull Duration duration) {
        return new Day((int) Math.ceil((duration.getDurMilli() * 1.0d) / 86400000));
    }

    @NotNull
    public static final Milli toMilli(@NotNull DateTriple dateTriple) {
        return new Milli(DateHelper.INSTANCE.date2Millis(dateTriple.getYear(), dateTriple.getMonth(), dateTriple.getDay()));
    }
}
