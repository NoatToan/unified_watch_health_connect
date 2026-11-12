package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.a;
import defpackage.g4h;
import defpackage.tt3;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class TemporalAccessorConverter extends AbstractConverter<TemporalAccessor> {
    private static final long serialVersionUID = 1;
    private String format;
    private final Class<?> targetType;

    public TemporalAccessorConverter(Class<?> cls) {
        this(cls, null);
    }

    private TemporalAccessor parseFromCharSequence(CharSequence charSequence) {
        ZoneId zoneId;
        Instant instant;
        if (tt3.F(charSequence)) {
            return null;
        }
        String str = this.format;
        if (str != null) {
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(str);
            instant = (Instant) dateTimeFormatterOfPattern.parse(charSequence, new TemporalQuery() { // from class: u4p
                @Override // java.time.temporal.TemporalQuery
                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                    return Instant.from(temporalAccessor);
                }
            });
            zoneId = dateTimeFormatterOfPattern.getZone();
        } else {
            DateTime dateTimeR = a.r(charSequence);
            Objects.requireNonNull(dateTimeR);
            Instant instant2 = dateTimeR.toInstant();
            zoneId = dateTimeR.getZoneId();
            instant = instant2;
        }
        return parseFromInstant(instant, zoneId);
    }

    private TemporalAccessor parseFromInstant(Instant instant, ZoneId zoneId) {
        if (Instant.class.equals(this.targetType)) {
            return instant;
        }
        ZoneId zoneId2 = (ZoneId) g4h.e(zoneId, ZoneId.systemDefault());
        if (LocalDateTime.class.equals(this.targetType)) {
            return LocalDateTime.ofInstant(instant, zoneId2);
        }
        if (LocalDate.class.equals(this.targetType)) {
            return instant.atZone(zoneId2).toLocalDate();
        }
        if (LocalTime.class.equals(this.targetType)) {
            return instant.atZone(zoneId2).toLocalTime();
        }
        if (ZonedDateTime.class.equals(this.targetType)) {
            return instant.atZone(zoneId2);
        }
        if (OffsetDateTime.class.equals(this.targetType)) {
            return OffsetDateTime.ofInstant(instant, zoneId2);
        }
        if (OffsetTime.class.equals(this.targetType)) {
            return OffsetTime.ofInstant(instant, zoneId2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.time.ZonedDateTime] */
    private TemporalAccessor parseFromLocalDateTime(LocalDateTime localDateTime) {
        if (Instant.class.equals(this.targetType)) {
            return a.x(localDateTime);
        }
        if (LocalDate.class.equals(this.targetType)) {
            return localDateTime.toLocalDate();
        }
        if (LocalTime.class.equals(this.targetType)) {
            return localDateTime.toLocalTime();
        }
        if (ZonedDateTime.class.equals(this.targetType)) {
            return localDateTime.atZone(ZoneId.systemDefault());
        }
        if (OffsetDateTime.class.equals(this.targetType)) {
            return localDateTime.atZone(ZoneId.systemDefault()).toOffsetDateTime();
        }
        if (OffsetTime.class.equals(this.targetType)) {
            return localDateTime.atZone(ZoneId.systemDefault()).toOffsetDateTime().toOffsetTime();
        }
        return null;
    }

    private TemporalAccessor parseFromLong(Long l) {
        return parseFromInstant(Instant.ofEpochMilli(l.longValue()), null);
    }

    private TemporalAccessor parseFromTemporalAccessor(TemporalAccessor temporalAccessor) {
        TemporalAccessor fromZonedDateTime;
        if (temporalAccessor instanceof LocalDateTime) {
            fromZonedDateTime = parseFromLocalDateTime((LocalDateTime) temporalAccessor);
        } else {
            fromZonedDateTime = temporalAccessor instanceof ZonedDateTime ? parseFromZonedDateTime((ZonedDateTime) temporalAccessor) : null;
        }
        return fromZonedDateTime == null ? parseFromInstant(a.x(temporalAccessor), null) : fromZonedDateTime;
    }

    private TemporalAccessor parseFromZonedDateTime(ZonedDateTime zonedDateTime) {
        if (Instant.class.equals(this.targetType)) {
            return a.x(zonedDateTime);
        }
        if (LocalDateTime.class.equals(this.targetType)) {
            return zonedDateTime.toLocalDateTime();
        }
        if (LocalDate.class.equals(this.targetType)) {
            return zonedDateTime.toLocalDate();
        }
        if (LocalTime.class.equals(this.targetType)) {
            return zonedDateTime.toLocalTime();
        }
        if (OffsetDateTime.class.equals(this.targetType)) {
            return zonedDateTime.toOffsetDateTime();
        }
        if (OffsetTime.class.equals(this.targetType)) {
            return zonedDateTime.toOffsetDateTime().toOffsetTime();
        }
        return null;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public TemporalAccessorConverter(Class<?> cls, String str) {
        this.targetType = cls;
        this.format = str;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public TemporalAccessor convertInternal(Object obj) {
        if (obj instanceof Long) {
            return parseFromLong((Long) obj);
        }
        if (obj instanceof TemporalAccessor) {
            return parseFromTemporalAccessor((TemporalAccessor) obj);
        }
        if (obj instanceof Date) {
            DateTime dateTimeI = a.i((Date) obj);
            return parseFromInstant(dateTimeI.toInstant(), dateTimeI.getZoneId());
        }
        if (!(obj instanceof Calendar)) {
            return parseFromCharSequence(convertToStr(obj));
        }
        Calendar calendar = (Calendar) obj;
        return parseFromInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId());
    }
}
