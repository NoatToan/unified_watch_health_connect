package org.threeten.bp.chrono;

import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.ad8;
import defpackage.c5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.t4p;
import defpackage.vv3;
import defpackage.x4p;
import defpackage.z4p;
import defpackage.zv3;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class ThaiBuddhistChronology extends b implements Serializable {
    private static final HashMap<String, String[]> ERA_FULL_NAMES;
    private static final HashMap<String, String[]> ERA_NARROW_NAMES;
    private static final HashMap<String, String[]> ERA_SHORT_NAMES;
    private static final String FALLBACK_LANGUAGE = "en";
    public static final ThaiBuddhistChronology INSTANCE = new ThaiBuddhistChronology();
    private static final String TARGET_LANGUAGE = "th";
    static final int YEARS_DIFFERENCE = 543;
    private static final long serialVersionUID = 2775954514031616474L;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29615a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            f29615a = iArr;
            try {
                iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29615a[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29615a[ChronoField.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap<String, String[]> map = new HashMap<>();
        ERA_NARROW_NAMES = map;
        HashMap<String, String[]> map2 = new HashMap<>();
        ERA_SHORT_NAMES = map2;
        HashMap<String, String[]> map3 = new HashMap<>();
        ERA_FULL_NAMES = map3;
        map.put("en", new String[]{"BB", "BE"});
        map.put(TARGET_LANGUAGE, new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put(TARGET_LANGUAGE, new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put(TARGET_LANGUAGE, new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private ThaiBuddhistChronology() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.threeten.bp.chrono.b
    public List<ad8> eras() {
        return Arrays.asList(ThaiBuddhistEra.values());
    }

    @Override // org.threeten.bp.chrono.b
    public String getCalendarType() {
        return "buddhist";
    }

    @Override // org.threeten.bp.chrono.b
    public String getId() {
        return "ThaiBuddhist";
    }

    @Override // org.threeten.bp.chrono.b
    public boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j - 543);
    }

    @Override // org.threeten.bp.chrono.b
    public vv3<ThaiBuddhistDate> localDateTime(t4p t4pVar) {
        return super.localDateTime(t4pVar);
    }

    @Override // org.threeten.bp.chrono.b
    public int prolepticYear(ad8 ad8Var, int i) {
        if (ad8Var instanceof ThaiBuddhistEra) {
            return ad8Var == ThaiBuddhistEra.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // org.threeten.bp.chrono.b
    public ValueRange range(ChronoField chronoField) {
        int i = a.f29615a[chronoField.ordinal()];
        if (i == 1) {
            ValueRange valueRangeRange = ChronoField.PROLEPTIC_MONTH.range();
            return ValueRange.of(valueRangeRange.getMinimum() + 6516, valueRangeRange.getMaximum() + 6516);
        }
        if (i == 2) {
            ValueRange valueRangeRange2 = ChronoField.YEAR.range();
            return ValueRange.of(1L, (-(valueRangeRange2.getMinimum() + 543)) + 1, valueRangeRange2.getMaximum() + 543);
        }
        if (i != 3) {
            return chronoField.range();
        }
        ValueRange valueRangeRange3 = ChronoField.YEAR.range();
        return ValueRange.of(valueRangeRange3.getMinimum() + 543, valueRangeRange3.getMaximum() + 543);
    }

    @Override // org.threeten.bp.chrono.b
    public /* bridge */ /* synthetic */ org.threeten.bp.chrono.a resolveDate(Map map, ResolverStyle resolverStyle) {
        return resolveDate((Map<z4p, Long>) map, resolverStyle);
    }

    @Override // org.threeten.bp.chrono.b
    public zv3<ThaiBuddhistDate> zonedDateTime(t4p t4pVar) {
        return super.zonedDateTime(t4pVar);
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate dateEpochDay(long j) {
        return new ThaiBuddhistDate(LocalDate.ofEpochDay(j));
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistEra eraOf(int i) {
        return ThaiBuddhistEra.of(i);
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate resolveDate(Map<z4p, Long> map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return dateEpochDay(map.remove(chronoField).longValue());
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
                if (resolverStyle == ResolverStyle.LENIENT) {
                    return date(iCheckValidIntValue, 1, 1).plusMonths(crd.p(map.remove(chronoField7).longValue(), 1L)).plusDays(crd.p(map.remove(chronoField8).longValue(), 1L));
                }
                int iCheckValidIntValue2 = range(chronoField7).checkValidIntValue(map.remove(chronoField7).longValue(), chronoField7);
                int iCheckValidIntValue3 = range(chronoField8).checkValidIntValue(map.remove(chronoField8).longValue(), chronoField8);
                if (resolverStyle == ResolverStyle.SMART && iCheckValidIntValue3 > 28) {
                    iCheckValidIntValue3 = Math.min(iCheckValidIntValue3, date(iCheckValidIntValue, iCheckValidIntValue2, 1).lengthOfMonth());
                }
                return date(iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3);
            }
            ChronoField chronoField9 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField9)) {
                ChronoField chronoField10 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField10)) {
                    int iCheckValidIntValue4 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return date(iCheckValidIntValue4, 1, 1).plus(crd.p(map.remove(chronoField7).longValue(), 1L), (c5p) ChronoUnit.MONTHS).plus(crd.p(map.remove(chronoField9).longValue(), 1L), (c5p) ChronoUnit.WEEKS).plus(crd.p(map.remove(chronoField10).longValue(), 1L), (c5p) ChronoUnit.DAYS);
                    }
                    int iCheckValidIntValue5 = chronoField7.checkValidIntValue(map.remove(chronoField7).longValue());
                    ThaiBuddhistDate thaiBuddhistDatePlus = date(iCheckValidIntValue4, iCheckValidIntValue5, 1).plus(((chronoField9.checkValidIntValue(map.remove(chronoField9).longValue()) - 1) * 7) + (chronoField10.checkValidIntValue(map.remove(chronoField10).longValue()) - 1), (c5p) ChronoUnit.DAYS);
                    if (resolverStyle != ResolverStyle.STRICT || thaiBuddhistDatePlus.get(chronoField7) == iCheckValidIntValue5) {
                        return thaiBuddhistDatePlus;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
                ChronoField chronoField11 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField11)) {
                    int iCheckValidIntValue6 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return date(iCheckValidIntValue6, 1, 1).plus(crd.p(map.remove(chronoField7).longValue(), 1L), (c5p) ChronoUnit.MONTHS).plus(crd.p(map.remove(chronoField9).longValue(), 1L), (c5p) ChronoUnit.WEEKS).plus(crd.p(map.remove(chronoField11).longValue(), 1L), (c5p) ChronoUnit.DAYS);
                    }
                    int iCheckValidIntValue7 = chronoField7.checkValidIntValue(map.remove(chronoField7).longValue());
                    ThaiBuddhistDate thaiBuddhistDateWith = date(iCheckValidIntValue6, iCheckValidIntValue7, 1).plus(chronoField9.checkValidIntValue(map.remove(chronoField9).longValue()) - 1, (c5p) ChronoUnit.WEEKS).with(x4p.a(DayOfWeek.of(chronoField11.checkValidIntValue(map.remove(chronoField11).longValue()))));
                    if (resolverStyle != ResolverStyle.STRICT || thaiBuddhistDateWith.get(chronoField7) == iCheckValidIntValue7) {
                        return thaiBuddhistDateWith;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        ChronoField chronoField12 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField12)) {
            int iCheckValidIntValue8 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
            if (resolverStyle == ResolverStyle.LENIENT) {
                return dateYearDay(iCheckValidIntValue8, 1).plusDays(crd.p(map.remove(chronoField12).longValue(), 1L));
            }
            return dateYearDay(iCheckValidIntValue8, chronoField12.checkValidIntValue(map.remove(chronoField12).longValue()));
        }
        ChronoField chronoField13 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField13)) {
            return null;
        }
        ChronoField chronoField14 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField14)) {
            int iCheckValidIntValue9 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
            if (resolverStyle == ResolverStyle.LENIENT) {
                return date(iCheckValidIntValue9, 1, 1).plus(crd.p(map.remove(chronoField13).longValue(), 1L), (c5p) ChronoUnit.WEEKS).plus(crd.p(map.remove(chronoField14).longValue(), 1L), (c5p) ChronoUnit.DAYS);
            }
            ThaiBuddhistDate thaiBuddhistDatePlusDays = date(iCheckValidIntValue9, 1, 1).plusDays(((chronoField13.checkValidIntValue(map.remove(chronoField13).longValue()) - 1) * 7) + (chronoField14.checkValidIntValue(map.remove(chronoField14).longValue()) - 1));
            if (resolverStyle != ResolverStyle.STRICT || thaiBuddhistDatePlusDays.get(chronoField6) == iCheckValidIntValue9) {
                return thaiBuddhistDatePlusDays;
            }
            throw new DateTimeException("Strict mode rejected date parsed to a different year");
        }
        ChronoField chronoField15 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField15)) {
            return null;
        }
        int iCheckValidIntValue10 = chronoField6.checkValidIntValue(map.remove(chronoField6).longValue());
        if (resolverStyle == ResolverStyle.LENIENT) {
            return date(iCheckValidIntValue10, 1, 1).plus(crd.p(map.remove(chronoField13).longValue(), 1L), (c5p) ChronoUnit.WEEKS).plus(crd.p(map.remove(chronoField15).longValue(), 1L), (c5p) ChronoUnit.DAYS);
        }
        ThaiBuddhistDate thaiBuddhistDateWith2 = date(iCheckValidIntValue10, 1, 1).plus(chronoField13.checkValidIntValue(map.remove(chronoField13).longValue()) - 1, (c5p) ChronoUnit.WEEKS).with(x4p.a(DayOfWeek.of(chronoField15.checkValidIntValue(map.remove(chronoField15).longValue()))));
        if (resolverStyle != ResolverStyle.STRICT || thaiBuddhistDateWith2.get(chronoField6) == iCheckValidIntValue10) {
            return thaiBuddhistDateWith2;
        }
        throw new DateTimeException("Strict mode rejected date parsed to a different month");
    }

    @Override // org.threeten.bp.chrono.b
    public zv3<ThaiBuddhistDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate dateYearDay(ad8 ad8Var, int i, int i2) {
        return (ThaiBuddhistDate) super.dateYearDay(ad8Var, i, i2);
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate date(ad8 ad8Var, int i, int i2, int i3) {
        return (ThaiBuddhistDate) super.date(ad8Var, i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate dateNow() {
        return (ThaiBuddhistDate) super.dateNow();
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate dateYearDay(int i, int i2) {
        return new ThaiBuddhistDate(LocalDate.ofYearDay(i - 543, i2));
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate date(int i, int i2, int i3) {
        return new ThaiBuddhistDate(LocalDate.of(i - 543, i2, i3));
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate dateNow(ZoneId zoneId) {
        return (ThaiBuddhistDate) super.dateNow(zoneId);
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate date(t4p t4pVar) {
        if (t4pVar instanceof ThaiBuddhistDate) {
            return (ThaiBuddhistDate) t4pVar;
        }
        return new ThaiBuddhistDate(LocalDate.from(t4pVar));
    }

    @Override // org.threeten.bp.chrono.b
    public ThaiBuddhistDate dateNow(g14 g14Var) {
        crd.i(g14Var, Feature.CLOCK);
        return (ThaiBuddhistDate) super.dateNow(g14Var);
    }
}
