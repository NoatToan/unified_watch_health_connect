package com.huami.bigdata.statistics.core.utils;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0003H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0003H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0003H\u0000\u001a\f\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\t\u001a\u00020\u0000*\u00020\u0003H\u0000\u001a\f\u0010\n\u001a\u00020\u0000*\u00020\u0003H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0000*\u00020\u0003H\u0000\u001a@\u0010\u0014\u001a\u00020\u0012\"\b\b\u0000\u0010\r*\u00020\f*\u00028\u00002!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00120\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "Ljava/util/TimeZone;", "timeZone", "", "toYMDHMS", "yMDHMSToTimestamp", "yMDToTimestamp", "yMToTimestamp", "toLastTimestamp", "toWeekEnd", "toMonthEnd", "toYearEnd", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Ljava/lang/reflect/Field;", "Lkotlin/ParameterName;", "name", "", "action", "forEachField", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "core_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionsKt {
    public static final <T> void forEachField(@NotNull T t, @NotNull Function1<? super Field, Unit> function1) {
        for (Field field : t.getClass().getDeclaredFields()) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            function1.invoke(field);
        }
    }

    public static final long toLastTimestamp(long j) {
        return TimeUtils.INSTANCE.getLastTimeInMillis(j);
    }

    public static final long toMonthEnd(@NotNull String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(yMDToTimestamp(str));
        calendar.set(5, 1);
        calendar.roll(5, -1);
        return toLastTimestamp(calendar.getTimeInMillis());
    }

    public static final long toWeekEnd(@NotNull String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(yMDToTimestamp(str));
        calendar.add(5, (7 - calendar.get(7)) + 1);
        return toLastTimestamp(calendar.getTimeInMillis());
    }

    @NotNull
    public static final String toYMDHMS(long j, @NotNull TimeZone timeZone) {
        return TimeUtils.INSTANCE.timestampToYMDHMS(j, timeZone);
    }

    public static /* synthetic */ String toYMDHMS$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toYMDHMS(j, timeZone);
    }

    public static final long toYearEnd(@NotNull String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(yMDToTimestamp(str));
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.add(1, 1);
        calendar.add(5, -1);
        return toLastTimestamp(calendar.getTimeInMillis());
    }

    public static final long yMDHMSToTimestamp(@NotNull String str) {
        return TimeUtils.INSTANCE.yMDHMSToTimestamp(str);
    }

    public static final long yMDToTimestamp(@NotNull String str) {
        return TimeUtils.INSTANCE.yMDToTimestamp(str);
    }

    public static final long yMToTimestamp(@NotNull String str) {
        return TimeUtils.INSTANCE.yMToTimestamp(str);
    }
}
