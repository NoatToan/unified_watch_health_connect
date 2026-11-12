package org.threeten.bp.zone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Month;
import org.threeten.bp.Year;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.TemporalAdjusters;

/* JADX INFO: loaded from: classes23.dex */
class c {
    private List<b> a = new ArrayList();
    private Map<Object, Object> b;

    public class a implements Comparable<a> {
        private int a;
        private Month b;
        private int c;
        private DayOfWeek d;
        private LocalTime e;
        private int f;
        private ZoneOffsetTransitionRule.TimeDefinition g;
        private int h;

        public a(int i, Month month, int i2, DayOfWeek dayOfWeek, LocalTime localTime, int i3, ZoneOffsetTransitionRule.TimeDefinition timeDefinition, int i4) {
            this.a = i;
            this.b = month;
            this.c = i2;
            this.d = dayOfWeek;
            this.e = localTime;
            this.f = i3;
            this.g = timeDefinition;
            this.h = i4;
        }

        private LocalDate k() {
            int i = this.c;
            if (i < 0) {
                LocalDate localDateOf = LocalDate.of(this.a, this.b, this.b.length(IsoChronology.INSTANCE.isLeapYear(this.a)) + 1 + this.c);
                DayOfWeek dayOfWeek = this.d;
                return dayOfWeek != null ? localDateOf.with(TemporalAdjusters.previousOrSame(dayOfWeek)) : localDateOf;
            }
            LocalDate localDateOf2 = LocalDate.of(this.a, this.b, i);
            DayOfWeek dayOfWeek2 = this.d;
            return dayOfWeek2 != null ? localDateOf2.with(TemporalAdjusters.nextOrSame(dayOfWeek2)) : localDateOf2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int iCompareTo = this.a - aVar.a;
            if (iCompareTo == 0) {
                iCompareTo = this.b.compareTo(aVar.b);
            }
            if (iCompareTo == 0) {
                iCompareTo = k().compareTo((ChronoLocalDate) aVar.k());
            }
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            long secondOfDay = this.e.toSecondOfDay() + (this.f * 86400);
            long secondOfDay2 = aVar.e.toSecondOfDay() + (aVar.f * 86400);
            if (secondOfDay < secondOfDay2) {
                return -1;
            }
            return secondOfDay > secondOfDay2 ? 1 : 0;
        }

        public ZoneOffsetTransition l(ZoneOffset zoneOffset, int i) {
            LocalDateTime localDateTime = (LocalDateTime) c.this.g(LocalDateTime.of(((LocalDate) c.this.g(k())).plusDays(this.f), this.e));
            ZoneOffset zoneOffset2 = (ZoneOffset) c.this.g(ZoneOffset.ofTotalSeconds(zoneOffset.getTotalSeconds() + i));
            return new ZoneOffsetTransition((LocalDateTime) c.this.g(this.g.createDateTime(localDateTime, zoneOffset, zoneOffset2)), zoneOffset2, (ZoneOffset) c.this.g(ZoneOffset.ofTotalSeconds(zoneOffset.getTotalSeconds() + this.h)));
        }

        public ZoneOffsetTransitionRule m(ZoneOffset zoneOffset, int i) {
            Month month;
            if (this.c < 0 && (month = this.b) != Month.FEBRUARY) {
                this.c = month.maxLength() - 6;
            }
            ZoneOffsetTransition zoneOffsetTransitionL = l(zoneOffset, i);
            return new ZoneOffsetTransitionRule(this.b, this.c, this.d, this.e, this.f, this.g, zoneOffset, zoneOffsetTransitionL.getOffsetBefore(), zoneOffsetTransitionL.getOffsetAfter());
        }
    }

    public class b {
        private final ZoneOffset a;
        private final LocalDateTime b;
        private final ZoneOffsetTransitionRule.TimeDefinition c;
        private Integer d;
        private List<a> e = new ArrayList();
        private int f = Year.MIN_VALUE;
        private List<a> g = new ArrayList();

        public b(ZoneOffset zoneOffset, LocalDateTime localDateTime, ZoneOffsetTransitionRule.TimeDefinition timeDefinition) {
            this.b = localDateTime;
            this.c = timeDefinition;
            this.a = zoneOffset;
        }

        public void e(int i, int i2, Month month, int i3, DayOfWeek dayOfWeek, LocalTime localTime, int i4, ZoneOffsetTransitionRule.TimeDefinition timeDefinition, int i5) {
            if (this.d != null) {
                throw new IllegalStateException("Window has a fixed DST saving, so cannot have DST rules");
            }
            if (this.e.size() >= 2000) {
                throw new IllegalStateException("Window has reached the maximum number of allowed rules");
            }
            boolean z = false;
            int i6 = i2;
            if (i6 == 999999999) {
                z = true;
                i6 = i;
            }
            for (int i7 = i; i7 <= i6; i7++) {
                a aVar = c.this.new a(i7, month, i3, dayOfWeek, localTime, i4, timeDefinition, i5);
                if (z) {
                    this.g.add(aVar);
                    this.f = Math.max(i, this.f);
                } else {
                    this.e.add(aVar);
                }
            }
        }

        public long f(int i) {
            ZoneOffset zoneOffsetG = g(i);
            return this.c.createDateTime(this.b, this.a, zoneOffsetG).toEpochSecond(zoneOffsetG);
        }

        public ZoneOffset g(int i) {
            return ZoneOffset.ofTotalSeconds(this.a.getTotalSeconds() + i);
        }

        public boolean h() {
            return this.b.equals(LocalDateTime.MAX) && this.c == ZoneOffsetTransitionRule.TimeDefinition.WALL && this.d == null && this.g.isEmpty() && this.e.isEmpty();
        }

        public void i(int i) {
            if (this.e.size() > 0 || this.g.size() > 0) {
                throw new IllegalStateException("Window has DST rules, so cannot have fixed savings");
            }
            this.d = Integer.valueOf(i);
        }

        public void j(int i) {
            if (this.g.size() == 1) {
                throw new IllegalStateException("Cannot have only one rule defined as being forever");
            }
            if (this.b.equals(LocalDateTime.MAX)) {
                this.f = Math.max(this.f, i) + 1;
                for (a aVar : this.g) {
                    e(aVar.a, this.f, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h);
                    aVar.a = this.f + 1;
                }
                int i2 = this.f;
                if (i2 == 999999999) {
                    this.g.clear();
                } else {
                    this.f = i2 + 1;
                }
            } else {
                int year = this.b.getYear();
                for (a aVar2 : this.g) {
                    e(aVar2.a, year + 1, aVar2.b, aVar2.c, aVar2.d, aVar2.e, aVar2.f, aVar2.g, aVar2.h);
                }
                this.g.clear();
                this.f = Year.MAX_VALUE;
            }
            Collections.sort(this.e);
            Collections.sort(this.g);
            if (this.e.size() == 0 && this.d == null) {
                this.d = 0;
            }
        }

        public void k(b bVar) {
            if (this.b.isBefore(bVar.b)) {
                throw new IllegalStateException("Windows must be added in date-time order: " + this.b + " < " + bVar.b);
            }
        }
    }

    public c a(int i, int i2, Month month, int i3, DayOfWeek dayOfWeek, LocalTime localTime, int i4, ZoneOffsetTransitionRule.TimeDefinition timeDefinition, int i5) {
        Jdk8Methods.requireNonNull(month, "month");
        Jdk8Methods.requireNonNull(timeDefinition, "timeDefinition");
        ChronoField chronoField = ChronoField.YEAR;
        chronoField.checkValidValue(i);
        chronoField.checkValidValue(i2);
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Must add a window before adding a rule");
        }
        List<b> list = this.a;
        list.get(list.size() - 1).e(i, i2, month, i3, dayOfWeek, localTime, i4, timeDefinition, i5);
        return this;
    }

    public c b(int i, int i2, Month month, int i3, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, ZoneOffsetTransitionRule.TimeDefinition timeDefinition, int i4) {
        Jdk8Methods.requireNonNull(month, "month");
        Jdk8Methods.requireNonNull(localTime, "time");
        Jdk8Methods.requireNonNull(timeDefinition, "timeDefinition");
        ChronoField chronoField = ChronoField.YEAR;
        chronoField.checkValidValue(i);
        chronoField.checkValidValue(i2);
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !localTime.equals(LocalTime.MIDNIGHT)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Must add a window before adding a rule");
        }
        List<b> list = this.a;
        list.get(list.size() - 1).e(i, i2, month, i3, dayOfWeek, localTime, z ? 1 : 0, timeDefinition, i4);
        return this;
    }

    public c c(int i, Month month, int i2, LocalTime localTime, boolean z, ZoneOffsetTransitionRule.TimeDefinition timeDefinition, int i3) {
        return b(i, i, month, i2, null, localTime, z, timeDefinition, i3);
    }

    public c d(LocalDateTime localDateTime, ZoneOffsetTransitionRule.TimeDefinition timeDefinition, int i) {
        Jdk8Methods.requireNonNull(localDateTime, "transitionDateTime");
        return b(localDateTime.getYear(), localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth(), null, localDateTime.toLocalTime(), false, timeDefinition, i);
    }

    public c e(ZoneOffset zoneOffset, LocalDateTime localDateTime, ZoneOffsetTransitionRule.TimeDefinition timeDefinition) {
        Jdk8Methods.requireNonNull(zoneOffset, "standardOffset");
        Jdk8Methods.requireNonNull(localDateTime, "until");
        Jdk8Methods.requireNonNull(timeDefinition, "untilDefinition");
        b bVar = new b(zoneOffset, localDateTime, timeDefinition);
        if (this.a.size() > 0) {
            List<b> list = this.a;
            bVar.k(list.get(list.size() - 1));
        }
        this.a.add(bVar);
        return this;
    }

    public c f(ZoneOffset zoneOffset) {
        return e(zoneOffset, LocalDateTime.MAX, ZoneOffsetTransitionRule.TimeDefinition.WALL);
    }

    public <T> T g(T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, t);
        }
        return (T) this.b.get(t);
    }

    public c h(int i) {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Must add a window before setting the fixed savings");
        }
        List<b> list = this.a;
        list.get(list.size() - 1).i(i);
        return this;
    }

    public ZoneRules i(String str) {
        return j(str, new HashMap());
    }

    public ZoneRules j(String str, Map<Object, Object> map) {
        Jdk8Methods.requireNonNull(str, "zoneId");
        this.b = map;
        if (this.a.isEmpty()) {
            throw new IllegalStateException("No windows have been added to the builder");
        }
        ArrayList arrayList = new ArrayList(4);
        ArrayList arrayList2 = new ArrayList(256);
        ArrayList arrayList3 = new ArrayList(2);
        int i = 0;
        b bVar = this.a.get(0);
        ZoneOffset zoneOffset = bVar.a;
        int iIntValue = bVar.d != null ? bVar.d.intValue() : 0;
        ZoneOffset zoneOffset2 = (ZoneOffset) g(ZoneOffset.ofTotalSeconds(zoneOffset.getTotalSeconds() + iIntValue));
        LocalDateTime localDateTime = (LocalDateTime) g(LocalDateTime.of(Year.MIN_VALUE, 1, 1, 0, 0));
        ZoneOffset zoneOffset3 = zoneOffset2;
        for (Iterator<b> it2 = this.a.iterator(); it2.hasNext(); it2 = it2) {
            b next = it2.next();
            next.j(localDateTime.getYear());
            Integer numValueOf = next.d;
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(i);
                for (a aVar : next.e) {
                    if (aVar.l(zoneOffset, iIntValue).toEpochSecond() > localDateTime.toEpochSecond(zoneOffset3)) {
                        break;
                    }
                    numValueOf = Integer.valueOf(aVar.h);
                }
            }
            if (!zoneOffset.equals(next.a)) {
                arrayList.add(g(new ZoneOffsetTransition(LocalDateTime.ofEpochSecond(localDateTime.toEpochSecond(zoneOffset3), i, zoneOffset), zoneOffset, next.a)));
                zoneOffset = (ZoneOffset) g(next.a);
            }
            ZoneOffset zoneOffset4 = (ZoneOffset) g(ZoneOffset.ofTotalSeconds(zoneOffset.getTotalSeconds() + numValueOf.intValue()));
            if (!zoneOffset3.equals(zoneOffset4)) {
                arrayList2.add((ZoneOffsetTransition) g(new ZoneOffsetTransition(localDateTime, zoneOffset3, zoneOffset4)));
            }
            iIntValue = numValueOf.intValue();
            for (a aVar2 : next.e) {
                ZoneOffsetTransition zoneOffsetTransition = (ZoneOffsetTransition) g(aVar2.l(zoneOffset, iIntValue));
                if (!(zoneOffsetTransition.toEpochSecond() < localDateTime.toEpochSecond(zoneOffset3)) && zoneOffsetTransition.toEpochSecond() < next.f(iIntValue) && !zoneOffsetTransition.getOffsetBefore().equals(zoneOffsetTransition.getOffsetAfter())) {
                    arrayList2.add(zoneOffsetTransition);
                    iIntValue = aVar2.h;
                }
            }
            for (a aVar3 : next.g) {
                arrayList3.add((ZoneOffsetTransitionRule) g(aVar3.m(zoneOffset, iIntValue)));
                iIntValue = aVar3.h;
            }
            zoneOffset3 = (ZoneOffset) g(next.g(iIntValue));
            i = 0;
            localDateTime = (LocalDateTime) g(LocalDateTime.ofEpochSecond(next.f(iIntValue), 0, zoneOffset3));
        }
        return new org.threeten.bp.zone.b(bVar.a, zoneOffset2, arrayList, arrayList2, arrayList3);
    }
}
