package com.huami.worldclock.manager;

import android.os.Build;
import com.huami.tools.log.HMLog;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.zone.ZoneOffsetTransition;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f²\u0006\u000e\u0010\n\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/huami/worldclock/manager/TimeZoneHelper;", "", "", "identifier", "", "getOffsetTransitionDateTime", "", "getDaylightDuration", "<init>", "()V", "offsetTransitionDateTime", "daylightDuration", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class TimeZoneHelper {
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(TimeZoneHelper.class, "offsetTransitionDateTime", "<v#0>", 0)), Reflection.mutableProperty0(new MutablePropertyReference0Impl(TimeZoneHelper.class, "daylightDuration", "<v#1>", 0))};

    @NotNull
    public static final TimeZoneHelper INSTANCE = new TimeZoneHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    private TimeZoneHelper() {
    }

    private static final int a(ReadWriteProperty<Object, Integer> readWriteProperty) {
        return readWriteProperty.getValue(null, a[1]).intValue();
    }

    private static final void b(ReadWriteProperty<Object, Integer> readWriteProperty, int i) {
        readWriteProperty.setValue(null, a[1], Integer.valueOf(i));
    }

    private static final long c(ReadWriteProperty<Object, Long> readWriteProperty) {
        return readWriteProperty.getValue(null, a[0]).longValue();
    }

    private static final void d(ReadWriteProperty<Object, Long> readWriteProperty, long j) {
        readWriteProperty.setValue(null, a[0], Long.valueOf(j));
    }

    public final int getDaylightDuration(@NotNull String identifier) {
        ZoneOffsetTransition zoneOffsetTransitionNextTransition;
        java.time.zone.ZoneOffsetTransition zoneOffsetTransitionNextTransition2;
        ReadWriteProperty readWritePropertyNotNull = Delegates.INSTANCE.notNull();
        TimeZone timeZone = TimeZone.getTimeZone(identifier);
        boolean zInDaylightTime = timeZone.inDaylightTime(new Date());
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (zInDaylightTime) {
                    zoneOffsetTransitionNextTransition2 = timeZone.toZoneId().getRules().previousTransition(Instant.now());
                } else {
                    if (zInDaylightTime) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zoneOffsetTransitionNextTransition2 = timeZone.toZoneId().getRules().nextTransition(Instant.now());
                }
                b(readWritePropertyNotNull, zoneOffsetTransitionNextTransition2 != null ? (int) (zoneOffsetTransitionNextTransition2.getDuration().getSeconds() / ((long) 60)) : 0);
            } else {
                ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(org.threeten.bp.Instant.now(), ZoneId.of(identifier));
                if (zInDaylightTime) {
                    zoneOffsetTransitionNextTransition = zonedDateTimeOfInstant.getZone().getRules().previousTransition(zonedDateTimeOfInstant.toInstant());
                } else {
                    if (zInDaylightTime) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zoneOffsetTransitionNextTransition = zonedDateTimeOfInstant.getZone().getRules().nextTransition(zonedDateTimeOfInstant.toInstant());
                }
                b(readWritePropertyNotNull, zoneOffsetTransitionNextTransition != null ? (int) (zoneOffsetTransitionNextTransition.getDuration().getSeconds() / ((long) 60)) : 0);
            }
        } catch (Exception e) {
            HMLog.info("worldClock", new a(e));
            b(readWritePropertyNotNull, 0);
        }
        return a(readWritePropertyNotNull);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.time.ZonedDateTime] */
    public final long getOffsetTransitionDateTime(@NotNull String identifier) {
        LocalDateTime dateTimeBefore;
        ZonedDateTime zonedDateTimeAtZone;
        java.time.LocalDateTime dateTimeBefore2;
        ?? AtZone;
        ReadWriteProperty readWritePropertyNotNull = Delegates.INSTANCE.notNull();
        long epochSecond = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            TimeZone timeZone = TimeZone.getTimeZone(identifier);
            java.time.zone.ZoneOffsetTransition zoneOffsetTransitionNextTransition = timeZone.toZoneId().getRules().nextTransition(Instant.now());
            if (zoneOffsetTransitionNextTransition != null && (dateTimeBefore2 = zoneOffsetTransitionNextTransition.getDateTimeBefore()) != null && (AtZone = dateTimeBefore2.atZone(timeZone.toZoneId())) != 0) {
                epochSecond = AtZone.toEpochSecond();
            }
            d(readWritePropertyNotNull, epochSecond);
        } else {
            ZoneId zoneIdOf = ZoneId.of(identifier);
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(org.threeten.bp.Instant.now(), zoneIdOf);
            ZoneOffsetTransition zoneOffsetTransitionNextTransition2 = zonedDateTimeOfInstant.getZone().getRules().nextTransition(zonedDateTimeOfInstant.toInstant());
            if (zoneOffsetTransitionNextTransition2 != null && (dateTimeBefore = zoneOffsetTransitionNextTransition2.getDateTimeBefore()) != null && (zonedDateTimeAtZone = dateTimeBefore.atZone(zoneIdOf)) != null) {
                epochSecond = zonedDateTimeAtZone.toEpochSecond();
            }
            d(readWritePropertyNotNull, epochSecond);
        }
        return c(readWritePropertyNotNull);
    }
}
