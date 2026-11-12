package org.threeten.bp.format;

import com.huami.sleepassistant.lib.utils.TimeUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.chrono.ChronoLocalDateTime;
import org.threeten.bp.chrono.ChronoZonedDateTime;
import org.threeten.bp.chrono.Chronology;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes23.dex */
final class a extends DefaultInterfaceTemporalAccessor implements TemporalAccessor, Cloneable {
    public final Map<TemporalField, Long> a = new HashMap();
    public Chronology b;
    public ZoneId c;
    public ChronoLocalDate d;
    public LocalTime e;
    public boolean f;
    public Period g;

    public a() {
    }

    private void f(LocalDate localDate) {
        if (localDate != null) {
            c(localDate);
            for (TemporalField temporalField : this.a.keySet()) {
                if ((temporalField instanceof ChronoField) && temporalField.isDateBased()) {
                    try {
                        long j = localDate.getLong(temporalField);
                        Long l = this.a.get(temporalField);
                        if (j != l.longValue()) {
                            throw new DateTimeException("Conflict found: Field " + temporalField + " " + j + " differs from " + temporalField + " " + l + " derived from " + localDate);
                        }
                    } catch (DateTimeException unused) {
                    }
                }
            }
        }
    }

    private void g() {
        LocalTime localTime;
        if (this.a.size() > 0) {
            ChronoLocalDate chronoLocalDate = this.d;
            if (chronoLocalDate != null && (localTime = this.e) != null) {
                h(chronoLocalDate.atTime(localTime));
                return;
            }
            if (chronoLocalDate != null) {
                h(chronoLocalDate);
                return;
            }
            TemporalAccessor temporalAccessor = this.e;
            if (temporalAccessor != null) {
                h(temporalAccessor);
            }
        }
    }

    private void h(TemporalAccessor temporalAccessor) {
        Iterator<Map.Entry<TemporalField, Long>> it2 = this.a.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<TemporalField, Long> next = it2.next();
            TemporalField key = next.getKey();
            long jLongValue = next.getValue().longValue();
            if (temporalAccessor.isSupported(key)) {
                try {
                    long j = temporalAccessor.getLong(key);
                    if (j != jLongValue) {
                        throw new DateTimeException("Cross check failed: " + key + " " + j + " vs " + key + " " + jLongValue);
                    }
                    it2.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private Long i(TemporalField temporalField) {
        return this.a.get(temporalField);
    }

    private void j(ResolverStyle resolverStyle) {
        if (this.b instanceof IsoChronology) {
            f(IsoChronology.INSTANCE.resolveDate(this.a, resolverStyle));
            return;
        }
        Map<TemporalField, Long> map = this.a;
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            f(LocalDate.ofEpochDay(this.a.remove(chronoField).longValue()));
        }
    }

    private void k() {
        if (this.a.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.c;
            if (zoneId != null) {
                m(zoneId);
                return;
            }
            Long l = this.a.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                m(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    private void m(ZoneId zoneId) {
        Map<TemporalField, Long> map = this.a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        ChronoZonedDateTime<?> chronoZonedDateTimeZonedDateTime = this.b.zonedDateTime(Instant.ofEpochSecond(map.remove(chronoField).longValue()), zoneId);
        if (this.d == null) {
            c(chronoZonedDateTimeZonedDateTime.toLocalDate());
        } else {
            u(chronoField, chronoZonedDateTimeZonedDateTime.toLocalDate());
        }
        a(ChronoField.SECOND_OF_DAY, chronoZonedDateTimeZonedDateTime.toLocalTime().toSecondOfDay());
    }

    private void n(ResolverStyle resolverStyle) {
        Map<TemporalField, Long> map = this.a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(chronoField)) {
            long jLongValue = this.a.remove(chronoField).longValue();
            if (resolverStyle != ResolverStyle.LENIENT && (resolverStyle != ResolverStyle.SMART || jLongValue != 0)) {
                chronoField.checkValidValue(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            a(chronoField2, jLongValue);
        }
        Map<TemporalField, Long> map2 = this.a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(chronoField3)) {
            long jLongValue2 = this.a.remove(chronoField3).longValue();
            if (resolverStyle != ResolverStyle.LENIENT && (resolverStyle != ResolverStyle.SMART || jLongValue2 != 0)) {
                chronoField3.checkValidValue(jLongValue2);
            }
            a(ChronoField.HOUR_OF_AMPM, jLongValue2 != 12 ? jLongValue2 : 0L);
        }
        ResolverStyle resolverStyle2 = ResolverStyle.LENIENT;
        if (resolverStyle != resolverStyle2) {
            Map<TemporalField, Long> map3 = this.a;
            ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
            if (map3.containsKey(chronoField4)) {
                chronoField4.checkValidValue(this.a.get(chronoField4).longValue());
            }
            Map<TemporalField, Long> map4 = this.a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (map4.containsKey(chronoField5)) {
                chronoField5.checkValidValue(this.a.get(chronoField5).longValue());
            }
        }
        Map<TemporalField, Long> map5 = this.a;
        ChronoField chronoField6 = ChronoField.AMPM_OF_DAY;
        if (map5.containsKey(chronoField6)) {
            Map<TemporalField, Long> map6 = this.a;
            ChronoField chronoField7 = ChronoField.HOUR_OF_AMPM;
            if (map6.containsKey(chronoField7)) {
                a(ChronoField.HOUR_OF_DAY, (this.a.remove(chronoField6).longValue() * 12) + this.a.remove(chronoField7).longValue());
            }
        }
        Map<TemporalField, Long> map7 = this.a;
        ChronoField chronoField8 = ChronoField.NANO_OF_DAY;
        if (map7.containsKey(chronoField8)) {
            long jLongValue3 = this.a.remove(chronoField8).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField8.checkValidValue(jLongValue3);
            }
            a(ChronoField.SECOND_OF_DAY, jLongValue3 / 1000000000);
            a(ChronoField.NANO_OF_SECOND, jLongValue3 % 1000000000);
        }
        Map<TemporalField, Long> map8 = this.a;
        ChronoField chronoField9 = ChronoField.MICRO_OF_DAY;
        if (map8.containsKey(chronoField9)) {
            long jLongValue4 = this.a.remove(chronoField9).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField9.checkValidValue(jLongValue4);
            }
            a(ChronoField.SECOND_OF_DAY, jLongValue4 / 1000000);
            a(ChronoField.MICRO_OF_SECOND, jLongValue4 % 1000000);
        }
        Map<TemporalField, Long> map9 = this.a;
        ChronoField chronoField10 = ChronoField.MILLI_OF_DAY;
        if (map9.containsKey(chronoField10)) {
            long jLongValue5 = this.a.remove(chronoField10).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField10.checkValidValue(jLongValue5);
            }
            a(ChronoField.SECOND_OF_DAY, jLongValue5 / 1000);
            a(ChronoField.MILLI_OF_SECOND, jLongValue5 % 1000);
        }
        Map<TemporalField, Long> map10 = this.a;
        ChronoField chronoField11 = ChronoField.SECOND_OF_DAY;
        if (map10.containsKey(chronoField11)) {
            long jLongValue6 = this.a.remove(chronoField11).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField11.checkValidValue(jLongValue6);
            }
            a(ChronoField.HOUR_OF_DAY, jLongValue6 / TimeUtils.TIME_1_HOURS);
            a(ChronoField.MINUTE_OF_HOUR, (jLongValue6 / 60) % 60);
            a(ChronoField.SECOND_OF_MINUTE, jLongValue6 % 60);
        }
        Map<TemporalField, Long> map11 = this.a;
        ChronoField chronoField12 = ChronoField.MINUTE_OF_DAY;
        if (map11.containsKey(chronoField12)) {
            long jLongValue7 = this.a.remove(chronoField12).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField12.checkValidValue(jLongValue7);
            }
            a(ChronoField.HOUR_OF_DAY, jLongValue7 / 60);
            a(ChronoField.MINUTE_OF_HOUR, jLongValue7 % 60);
        }
        if (resolverStyle != resolverStyle2) {
            Map<TemporalField, Long> map12 = this.a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (map12.containsKey(chronoField13)) {
                chronoField13.checkValidValue(this.a.get(chronoField13).longValue());
            }
            Map<TemporalField, Long> map13 = this.a;
            ChronoField chronoField14 = ChronoField.MICRO_OF_SECOND;
            if (map13.containsKey(chronoField14)) {
                chronoField14.checkValidValue(this.a.get(chronoField14).longValue());
            }
        }
        Map<TemporalField, Long> map14 = this.a;
        ChronoField chronoField15 = ChronoField.MILLI_OF_SECOND;
        if (map14.containsKey(chronoField15)) {
            Map<TemporalField, Long> map15 = this.a;
            ChronoField chronoField16 = ChronoField.MICRO_OF_SECOND;
            if (map15.containsKey(chronoField16)) {
                a(chronoField16, (this.a.remove(chronoField15).longValue() * 1000) + (this.a.get(chronoField16).longValue() % 1000));
            }
        }
        Map<TemporalField, Long> map16 = this.a;
        ChronoField chronoField17 = ChronoField.MICRO_OF_SECOND;
        if (map16.containsKey(chronoField17)) {
            Map<TemporalField, Long> map17 = this.a;
            ChronoField chronoField18 = ChronoField.NANO_OF_SECOND;
            if (map17.containsKey(chronoField18)) {
                a(chronoField17, this.a.get(chronoField18).longValue() / 1000);
                this.a.remove(chronoField17);
            }
        }
        if (this.a.containsKey(chronoField15)) {
            Map<TemporalField, Long> map18 = this.a;
            ChronoField chronoField19 = ChronoField.NANO_OF_SECOND;
            if (map18.containsKey(chronoField19)) {
                a(chronoField15, this.a.get(chronoField19).longValue() / 1000000);
                this.a.remove(chronoField15);
            }
        }
        if (this.a.containsKey(chronoField17)) {
            a(ChronoField.NANO_OF_SECOND, this.a.remove(chronoField17).longValue() * 1000);
        } else if (this.a.containsKey(chronoField15)) {
            a(ChronoField.NANO_OF_SECOND, this.a.remove(chronoField15).longValue() * 1000000);
        }
    }

    private a o(TemporalField temporalField, long j) {
        this.a.put(temporalField, Long.valueOf(j));
        return this;
    }

    private boolean q(ResolverStyle resolverStyle) {
        TemporalField key;
        int i = 0;
        loop0: while (i < 100) {
            Iterator<Map.Entry<TemporalField, Long>> it2 = this.a.entrySet().iterator();
            do {
                if (!it2.hasNext()) {
                    break loop0;
                }
                key = it2.next().getKey();
                TemporalAccessor temporalAccessorResolve = key.resolve(this.a, this, resolverStyle);
                if (temporalAccessorResolve != null) {
                    if (temporalAccessorResolve instanceof ChronoZonedDateTime) {
                        ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorResolve;
                        ZoneId zoneId = this.c;
                        if (zoneId == null) {
                            this.c = chronoZonedDateTime.getZone();
                        } else if (!zoneId.equals(chronoZonedDateTime.getZone())) {
                            throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.c);
                        }
                        temporalAccessorResolve = chronoZonedDateTime.toLocalDateTime();
                    }
                    if (temporalAccessorResolve instanceof ChronoLocalDate) {
                        u(key, (ChronoLocalDate) temporalAccessorResolve);
                        break;
                    }
                    if (temporalAccessorResolve instanceof LocalTime) {
                        t(key, (LocalTime) temporalAccessorResolve);
                        break;
                    }
                    if (temporalAccessorResolve instanceof ChronoLocalDateTime) {
                        ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorResolve;
                        u(key, chronoLocalDateTime.toLocalDate());
                        t(key, chronoLocalDateTime.toLocalTime());
                        break;
                    }
                    throw new DateTimeException("Unknown type: " + temporalAccessorResolve.getClass().getName());
                }
            } while (this.a.containsKey(key));
            i++;
        }
        if (i != 100) {
            return i > 0;
        }
        throw new DateTimeException("Badly written field");
    }

    private void r() {
        if (this.e == null) {
            if (this.a.containsKey(ChronoField.INSTANT_SECONDS) || this.a.containsKey(ChronoField.SECOND_OF_DAY) || this.a.containsKey(ChronoField.SECOND_OF_MINUTE)) {
                Map<TemporalField, Long> map = this.a;
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                if (map.containsKey(chronoField)) {
                    long jLongValue = this.a.get(chronoField).longValue();
                    this.a.put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue / 1000));
                    this.a.put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue / 1000000));
                } else {
                    this.a.put(chronoField, 0L);
                    this.a.put(ChronoField.MICRO_OF_SECOND, 0L);
                    this.a.put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            }
        }
    }

    private void s() {
        if (this.d == null || this.e == null) {
            return;
        }
        Long l = this.a.get(ChronoField.OFFSET_SECONDS);
        if (l != null) {
            Temporal temporalAtZone = this.d.atTime(this.e).atZone(ZoneOffset.ofTotalSeconds(l.intValue()));
            TemporalField temporalField = ChronoField.INSTANT_SECONDS;
            this.a.put(temporalField, Long.valueOf(temporalAtZone.getLong(temporalField)));
            return;
        }
        if (this.c != null) {
            Temporal temporalAtZone2 = this.d.atTime(this.e).atZone(this.c);
            TemporalField temporalField2 = ChronoField.INSTANT_SECONDS;
            this.a.put(temporalField2, Long.valueOf(temporalAtZone2.getLong(temporalField2)));
        }
    }

    private void t(TemporalField temporalField, LocalTime localTime) {
        long nanoOfDay = localTime.toNanoOfDay();
        Long lPut = this.a.put(ChronoField.NANO_OF_DAY, Long.valueOf(nanoOfDay));
        if (lPut == null || lPut.longValue() == nanoOfDay) {
            return;
        }
        throw new DateTimeException("Conflict found: " + LocalTime.ofNanoOfDay(lPut.longValue()) + " differs from " + localTime + " while resolving  " + temporalField);
    }

    private void u(TemporalField temporalField, ChronoLocalDate chronoLocalDate) {
        if (!this.b.equals(chronoLocalDate.getChronology())) {
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.b);
        }
        long epochDay = chronoLocalDate.toEpochDay();
        Long lPut = this.a.put(ChronoField.EPOCH_DAY, Long.valueOf(epochDay));
        if (lPut == null || lPut.longValue() == epochDay) {
            return;
        }
        throw new DateTimeException("Conflict found: " + LocalDate.ofEpochDay(lPut.longValue()) + " differs from " + LocalDate.ofEpochDay(epochDay) + " while resolving  " + temporalField);
    }

    private void v(ResolverStyle resolverStyle) {
        Map<TemporalField, Long> map = this.a;
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        Long l = map.get(chronoField);
        Map<TemporalField, Long> map2 = this.a;
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        Long l2 = map2.get(chronoField2);
        Map<TemporalField, Long> map3 = this.a;
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        Long l3 = map3.get(chronoField3);
        Map<TemporalField, Long> map4 = this.a;
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        Long l4 = map4.get(chronoField4);
        if (l == null) {
            return;
        }
        if (l2 != null || (l3 == null && l4 == null)) {
            if (l2 == null || l3 != null || l4 == null) {
                if (resolverStyle != ResolverStyle.LENIENT) {
                    if (resolverStyle == ResolverStyle.SMART && l.longValue() == 24 && ((l2 == null || l2.longValue() == 0) && ((l3 == null || l3.longValue() == 0) && (l4 == null || l4.longValue() == 0)))) {
                        l = 0L;
                        this.g = Period.ofDays(1);
                    }
                    int iCheckValidIntValue = chronoField.checkValidIntValue(l.longValue());
                    if (l2 != null) {
                        int iCheckValidIntValue2 = chronoField2.checkValidIntValue(l2.longValue());
                        if (l3 != null) {
                            int iCheckValidIntValue3 = chronoField3.checkValidIntValue(l3.longValue());
                            if (l4 != null) {
                                b(LocalTime.of(iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3, chronoField4.checkValidIntValue(l4.longValue())));
                            } else {
                                b(LocalTime.of(iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3));
                            }
                        } else if (l4 == null) {
                            b(LocalTime.of(iCheckValidIntValue, iCheckValidIntValue2));
                        }
                    } else if (l3 == null && l4 == null) {
                        b(LocalTime.of(iCheckValidIntValue, 0));
                    }
                } else {
                    long jLongValue = l.longValue();
                    if (l2 == null) {
                        int iSafeToInt = Jdk8Methods.safeToInt(Jdk8Methods.floorDiv(jLongValue, 24L));
                        b(LocalTime.of(Jdk8Methods.floorMod(jLongValue, 24), 0));
                        this.g = Period.ofDays(iSafeToInt);
                    } else if (l3 != null) {
                        if (l4 == null) {
                            l4 = 0L;
                        }
                        long jSafeAdd = Jdk8Methods.safeAdd(Jdk8Methods.safeAdd(Jdk8Methods.safeAdd(Jdk8Methods.safeMultiply(jLongValue, LocalTime.p), Jdk8Methods.safeMultiply(l2.longValue(), LocalTime.o)), Jdk8Methods.safeMultiply(l3.longValue(), 1000000000L)), l4.longValue());
                        int iFloorDiv = (int) Jdk8Methods.floorDiv(jSafeAdd, LocalTime.q);
                        b(LocalTime.ofNanoOfDay(Jdk8Methods.floorMod(jSafeAdd, LocalTime.q)));
                        this.g = Period.ofDays(iFloorDiv);
                    } else {
                        long jSafeAdd2 = Jdk8Methods.safeAdd(Jdk8Methods.safeMultiply(jLongValue, TimeUtils.TIME_1_HOURS), Jdk8Methods.safeMultiply(l2.longValue(), 60L));
                        int iFloorDiv2 = (int) Jdk8Methods.floorDiv(jSafeAdd2, 86400L);
                        b(LocalTime.ofSecondOfDay(Jdk8Methods.floorMod(jSafeAdd2, 86400L)));
                        this.g = Period.ofDays(iFloorDiv2);
                    }
                }
                this.a.remove(chronoField);
                this.a.remove(chronoField2);
                this.a.remove(chronoField3);
                this.a.remove(chronoField4);
            }
        }
    }

    public a a(TemporalField temporalField, long j) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        Long lI = i(temporalField);
        if (lI == null || lI.longValue() == j) {
            return o(temporalField, j);
        }
        throw new DateTimeException("Conflict found: " + temporalField + " " + lI + " differs from " + temporalField + " " + j + ": " + this);
    }

    public void b(LocalTime localTime) {
        this.e = localTime;
    }

    public void c(ChronoLocalDate chronoLocalDate) {
        this.d = chronoLocalDate;
    }

    public <R> R e(TemporalQuery<R> temporalQuery) {
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        Long lI = i(temporalField);
        if (lI != null) {
            return lI.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.d;
        if (chronoLocalDate != null && chronoLocalDate.isSupported(temporalField)) {
            return this.d.getLong(temporalField);
        }
        LocalTime localTime = this.e;
        if (localTime != null && localTime.isSupported(temporalField)) {
            return this.e.getLong(temporalField);
        }
        throw new DateTimeException("Field not found: " + temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate;
        LocalTime localTime;
        if (temporalField == null) {
            return false;
        }
        return this.a.containsKey(temporalField) || ((chronoLocalDate = this.d) != null && chronoLocalDate.isSupported(temporalField)) || ((localTime = this.e) != null && localTime.isSupported(temporalField));
    }

    public a p(ResolverStyle resolverStyle, Set<TemporalField> set) {
        ChronoLocalDate chronoLocalDate;
        if (set != null) {
            this.a.keySet().retainAll(set);
        }
        k();
        j(resolverStyle);
        n(resolverStyle);
        if (q(resolverStyle)) {
            k();
            j(resolverStyle);
            n(resolverStyle);
        }
        v(resolverStyle);
        g();
        Period period = this.g;
        if (period != null && !period.isZero() && (chronoLocalDate = this.d) != null && this.e != null) {
            this.d = chronoLocalDate.plus((TemporalAmount) this.g);
            this.g = Period.ZERO;
        }
        r();
        s();
        return this;
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.zoneId()) {
            return (R) this.c;
        }
        if (temporalQuery == TemporalQueries.chronology()) {
            return (R) this.b;
        }
        if (temporalQuery == TemporalQueries.localDate()) {
            ChronoLocalDate chronoLocalDate = this.d;
            if (chronoLocalDate != null) {
                return (R) LocalDate.from((TemporalAccessor) chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return (R) this.e;
        }
        if (temporalQuery == TemporalQueries.zone() || temporalQuery == TemporalQueries.offset()) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.a.size() > 0) {
            sb.append("fields=");
            sb.append(this.a);
        }
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    public a(TemporalField temporalField, long j) {
        a(temporalField, j);
    }
}
