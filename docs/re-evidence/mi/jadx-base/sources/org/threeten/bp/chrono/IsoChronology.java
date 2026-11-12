package org.threeten.bp.chrono;

import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.ad8;
import defpackage.crd;
import defpackage.g14;
import defpackage.t4p;
import defpackage.x4p;
import defpackage.z4p;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.Month;
import org.threeten.bp.Year;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class IsoChronology extends b implements Serializable {
    public static final IsoChronology INSTANCE = new IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    private IsoChronology() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.threeten.bp.chrono.b
    public List<ad8> eras() {
        return Arrays.asList(IsoEra.values());
    }

    @Override // org.threeten.bp.chrono.b
    public String getCalendarType() {
        return "iso8601";
    }

    @Override // org.threeten.bp.chrono.b
    public String getId() {
        return "ISO";
    }

    @Override // org.threeten.bp.chrono.b
    public boolean isLeapYear(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    @Override // org.threeten.bp.chrono.b
    public int prolepticYear(ad8 ad8Var, int i) {
        if (ad8Var instanceof IsoEra) {
            return ad8Var == IsoEra.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // org.threeten.bp.chrono.b
    public ValueRange range(ChronoField chronoField) {
        return chronoField.range();
    }

    @Override // org.threeten.bp.chrono.b
    public /* bridge */ /* synthetic */ a resolveDate(Map map, ResolverStyle resolverStyle) {
        return resolveDate((Map<z4p, Long>) map, resolverStyle);
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate dateEpochDay(long j) {
        return LocalDate.ofEpochDay(j);
    }

    @Override // org.threeten.bp.chrono.b
    public IsoEra eraOf(int i) {
        return IsoEra.of(i);
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDateTime localDateTime(t4p t4pVar) {
        return LocalDateTime.from(t4pVar);
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate resolveDate(Map<z4p, Long> map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return LocalDate.ofEpochDay(map.remove(chronoField).longValue());
        }
        ChronoField chronoField2 = ChronoField.PROLEPTIC_MONTH;
        Long lRemove = map.remove(chronoField2);
        if (lRemove != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField2.checkValidValue(lRemove.longValue());
            }
            updateResolveMap(map, ChronoField.MONTH_OF_YEAR, crd.g(lRemove.longValue(), 12) + 1);
            updateResolveMap(map, ChronoField.YEAR, crd.e(lRemove.longValue(), 12L));
        }
        ChronoField chronoField3 = ChronoField.YEAR_OF_ERA;
        Long lRemove2 = map.remove(chronoField3);
        if (lRemove2 != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField3.checkValidValue(lRemove2.longValue());
            }
            Long lRemove3 = map.remove(ChronoField.ERA);
            if (lRemove3 == null) {
                ChronoField chronoField4 = ChronoField.YEAR;
                Long l = map.get(chronoField4);
                if (resolverStyle != ResolverStyle.STRICT) {
                    updateResolveMap(map, chronoField4, (l == null || l.longValue() > 0) ? lRemove2.longValue() : crd.p(1L, lRemove2.longValue()));
                } else if (l != null) {
                    updateResolveMap(map, chronoField4, l.longValue() > 0 ? lRemove2.longValue() : crd.p(1L, lRemove2.longValue()));
                } else {
                    map.put(chronoField3, lRemove2);
                }
            } else if (lRemove3.longValue() == 1) {
                updateResolveMap(map, ChronoField.YEAR, lRemove2.longValue());
            } else {
                if (lRemove3.longValue() != 0) {
                    throw new DateTimeException("Invalid value for era: " + lRemove3);
                }
                updateResolveMap(map, ChronoField.YEAR, crd.p(1L, lRemove2.longValue()));
            }
        } else {
            ChronoField chronoField5 = ChronoField.ERA;
            if (map.containsKey(chronoField5)) {
                chronoField5.checkValidValue(map.get(chronoField5).longValue());
            }
        }
        ChronoField chronoField6 = ChronoField.YEAR;
        if (!map.containsKey(chronoField6)) {
            return null;
        }
        ChronoField chronoField7 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            ChronoField chronoField8 = ChronoField.DAY_OF_MONTH;
            if (map.containsKey(chronoField8)) {
                int iCheckValidIntValue = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
                int iQ = crd.q(map.remove(chronoField7).longValue());
                int iQ2 = crd.q(map.remove(chronoField8).longValue());
                if (resolverStyle == ResolverStyle.LENIENT) {
                    return LocalDate.of(iCheckValidIntValue, 1, 1).plusMonths(crd.o(iQ, 1)).plusDays(crd.o(iQ2, 1));
                }
                if (resolverStyle != ResolverStyle.SMART) {
                    return LocalDate.of(iCheckValidIntValue, iQ, iQ2);
                }
                chronoField8.checkValidValue(iQ2);
                if (iQ == 4 || iQ == 6 || iQ == 9 || iQ == 11) {
                    iQ2 = Math.min(iQ2, 30);
                } else if (iQ == 2) {
                    iQ2 = Math.min(iQ2, Month.FEBRUARY.length(Year.isLeap(iCheckValidIntValue)));
                }
                return LocalDate.of(iCheckValidIntValue, iQ, iQ2);
            }
            ChronoField chronoField9 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField9)) {
                ChronoField chronoField10 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField10)) {
                    int iCheckValidIntValue2 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return LocalDate.of(iCheckValidIntValue2, 1, 1).plusMonths(crd.p(map.remove(chronoField7).longValue(), 1L)).plusWeeks(crd.p(map.remove(chronoField9).longValue(), 1L)).plusDays(crd.p(map.remove(chronoField10).longValue(), 1L));
                    }
                    int iCheckValidIntValue3 = chronoField7.checkValidIntValue(map.remove(chronoField7).longValue());
                    LocalDate localDatePlusDays = LocalDate.of(iCheckValidIntValue2, iCheckValidIntValue3, 1).plusDays(((chronoField9.checkValidIntValue(map.remove(chronoField9).longValue()) - 1) * 7) + (chronoField10.checkValidIntValue(map.remove(chronoField10).longValue()) - 1));
                    if (resolverStyle != ResolverStyle.STRICT || localDatePlusDays.get(chronoField7) == iCheckValidIntValue3) {
                        return localDatePlusDays;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
                ChronoField chronoField11 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField11)) {
                    int iCheckValidIntValue4 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return LocalDate.of(iCheckValidIntValue4, 1, 1).plusMonths(crd.p(map.remove(chronoField7).longValue(), 1L)).plusWeeks(crd.p(map.remove(chronoField9).longValue(), 1L)).plusDays(crd.p(map.remove(chronoField11).longValue(), 1L));
                    }
                    int iCheckValidIntValue5 = chronoField7.checkValidIntValue(map.remove(chronoField7).longValue());
                    LocalDate localDateWith = LocalDate.of(iCheckValidIntValue4, iCheckValidIntValue5, 1).plusWeeks(chronoField9.checkValidIntValue(map.remove(chronoField9).longValue()) - 1).with(x4p.a(DayOfWeek.of(chronoField11.checkValidIntValue(map.remove(chronoField11).longValue()))));
                    if (resolverStyle != ResolverStyle.STRICT || localDateWith.get(chronoField7) == iCheckValidIntValue5) {
                        return localDateWith;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        ChronoField chronoField12 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField12)) {
            int iCheckValidIntValue6 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
            if (resolverStyle == ResolverStyle.LENIENT) {
                return LocalDate.ofYearDay(iCheckValidIntValue6, 1).plusDays(crd.p(map.remove(chronoField12).longValue(), 1L));
            }
            return LocalDate.ofYearDay(iCheckValidIntValue6, chronoField12.checkValidIntValue(map.remove(chronoField12).longValue()));
        }
        ChronoField chronoField13 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField13)) {
            return null;
        }
        ChronoField chronoField14 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField14)) {
            int iCheckValidIntValue7 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
            if (resolverStyle == ResolverStyle.LENIENT) {
                return LocalDate.of(iCheckValidIntValue7, 1, 1).plusWeeks(crd.p(map.remove(chronoField13).longValue(), 1L)).plusDays(crd.p(map.remove(chronoField14).longValue(), 1L));
            }
            LocalDate localDatePlusDays2 = LocalDate.of(iCheckValidIntValue7, 1, 1).plusDays(((chronoField13.checkValidIntValue(map.remove(chronoField13).longValue()) - 1) * 7) + (chronoField14.checkValidIntValue(map.remove(chronoField14).longValue()) - 1));
            if (resolverStyle != ResolverStyle.STRICT || localDatePlusDays2.get(chronoField6) == iCheckValidIntValue7) {
                return localDatePlusDays2;
            }
            throw new DateTimeException("Strict mode rejected date parsed to a different year");
        }
        ChronoField chronoField15 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField15)) {
            return null;
        }
        int iCheckValidIntValue8 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
        if (resolverStyle == ResolverStyle.LENIENT) {
            return LocalDate.of(iCheckValidIntValue8, 1, 1).plusWeeks(crd.p(map.remove(chronoField13).longValue(), 1L)).plusDays(crd.p(map.remove(chronoField15).longValue(), 1L));
        }
        LocalDate localDateWith2 = LocalDate.of(iCheckValidIntValue8, 1, 1).plusWeeks(chronoField13.checkValidIntValue(map.remove(chronoField13).longValue()) - 1).with(x4p.a(DayOfWeek.of(chronoField15.checkValidIntValue(map.remove(chronoField15).longValue()))));
        if (resolverStyle != ResolverStyle.STRICT || localDateWith2.get(chronoField6) == iCheckValidIntValue8) {
            return localDateWith2;
        }
        throw new DateTimeException("Strict mode rejected date parsed to a different month");
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate dateYearDay(ad8 ad8Var, int i, int i2) {
        return dateYearDay(prolepticYear(ad8Var, i), i2);
    }

    @Override // org.threeten.bp.chrono.b
    public ZonedDateTime zonedDateTime(t4p t4pVar) {
        return ZonedDateTime.from(t4pVar);
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate date(ad8 ad8Var, int i, int i2, int i3) {
        return date(prolepticYear(ad8Var, i), i2, i3);
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate dateNow() {
        return dateNow(g14.d());
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate dateYearDay(int i, int i2) {
        return LocalDate.ofYearDay(i, i2);
    }

    @Override // org.threeten.bp.chrono.b
    public ZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate date(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate dateNow(ZoneId zoneId) {
        return dateNow(g14.c(zoneId));
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate date(t4p t4pVar) {
        return LocalDate.from(t4pVar);
    }

    @Override // org.threeten.bp.chrono.b
    public LocalDate dateNow(g14 g14Var) {
        crd.i(g14Var, Feature.CLOCK);
        return date((t4p) LocalDate.now(g14Var));
    }
}
