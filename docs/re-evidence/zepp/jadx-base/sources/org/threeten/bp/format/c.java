package org.threeten.bp.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.Chronology;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalQuery;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes23.dex */
final class c {
    private Locale a;
    private DecimalStyle b;
    private Chronology c;
    private ZoneId d;
    private boolean e;
    private boolean f;
    private final ArrayList<b> g;

    public final class b extends DefaultInterfaceTemporalAccessor {
        public Chronology a;
        public ZoneId b;
        public final Map<TemporalField, Long> c;
        public boolean d;
        public Period e;
        public List<Object[]> f;

        public b a() {
            b bVar = c.this.new b();
            bVar.a = this.a;
            bVar.b = this.b;
            bVar.c.putAll(this.c);
            bVar.d = this.d;
            return bVar;
        }

        public org.threeten.bp.format.a b() {
            org.threeten.bp.format.a aVar = new org.threeten.bp.format.a();
            aVar.a.putAll(this.c);
            aVar.b = c.this.h();
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                aVar.c = zoneId;
            } else {
                aVar.c = c.this.d;
            }
            aVar.f = this.d;
            aVar.g = this.e;
            return aVar;
        }

        @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
        public int get(TemporalField temporalField) {
            if (this.c.containsKey(temporalField)) {
                return Jdk8Methods.safeToInt(this.c.get(temporalField).longValue());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }

        @Override // org.threeten.bp.temporal.TemporalAccessor
        public long getLong(TemporalField temporalField) {
            if (this.c.containsKey(temporalField)) {
                return this.c.get(temporalField).longValue();
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }

        @Override // org.threeten.bp.temporal.TemporalAccessor
        public boolean isSupported(TemporalField temporalField) {
            return this.c.containsKey(temporalField);
        }

        @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
        public <R> R query(TemporalQuery<R> temporalQuery) {
            if (temporalQuery == TemporalQueries.chronology()) {
                return (R) this.a;
            }
            return (temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.zone()) ? (R) this.b : (R) super.query(temporalQuery);
        }

        public String toString() {
            return this.c.toString() + "," + this.a + "," + this.b;
        }

        private b() {
            this.a = null;
            this.b = null;
            this.c = new HashMap();
            this.e = Period.ZERO;
        }
    }

    public c(DateTimeFormatter dateTimeFormatter) {
        this.e = true;
        this.f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.a = dateTimeFormatter.getLocale();
        this.b = dateTimeFormatter.getDecimalStyle();
        this.c = dateTimeFormatter.getChronology();
        this.d = dateTimeFormatter.getZone();
        arrayList.add(new b());
    }

    public static boolean d(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    private b f() {
        ArrayList<b> arrayList = this.g;
        return arrayList.get(arrayList.size() - 1);
    }

    public void b(DateTimeFormatterBuilder.q qVar, long j, int i, int i2) {
        b bVarF = f();
        if (bVarF.f == null) {
            bVarF.f = new ArrayList(2);
        }
        bVarF.f.add(new Object[]{qVar, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
    }

    public boolean c(char c, char c2) {
        if (l()) {
            return c == c2;
        }
        return d(c, c2);
    }

    public c e() {
        return new c(this);
    }

    public void g(boolean z) {
        if (z) {
            ArrayList<b> arrayList = this.g;
            arrayList.remove(arrayList.size() - 2);
        } else {
            ArrayList<b> arrayList2 = this.g;
            arrayList2.remove(arrayList2.size() - 1);
        }
    }

    public Chronology h() {
        Chronology chronology = f().a;
        if (chronology != null) {
            return chronology;
        }
        Chronology chronology2 = this.c;
        return chronology2 == null ? IsoChronology.INSTANCE : chronology2;
    }

    public Locale i() {
        return this.a;
    }

    public Long j(TemporalField temporalField) {
        return f().c.get(temporalField);
    }

    public DecimalStyle k() {
        return this.b;
    }

    public boolean l() {
        return this.e;
    }

    public boolean m() {
        return this.f;
    }

    public void n(boolean z) {
        this.e = z;
    }

    public void o(Locale locale) {
        Jdk8Methods.requireNonNull(locale, "locale");
        this.a = locale;
    }

    public void p(ZoneId zoneId) {
        Jdk8Methods.requireNonNull(zoneId, "zone");
        f().b = zoneId;
    }

    public void q(Chronology chronology) {
        Jdk8Methods.requireNonNull(chronology, "chrono");
        b bVarF = f();
        bVarF.a = chronology;
        if (bVarF.f != null) {
            ArrayList<Object[]> arrayList = new ArrayList(bVarF.f);
            bVarF.f.clear();
            for (Object[] objArr : arrayList) {
                ((DateTimeFormatterBuilder.q) objArr[0]).e(this, ((Long) objArr[1]).longValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
            }
        }
    }

    public int r(TemporalField temporalField, long j, int i, int i2) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        Long lPut = f().c.put(temporalField, Long.valueOf(j));
        return (lPut == null || lPut.longValue() == j) ? i2 : ~i;
    }

    public void s() {
        f().d = true;
    }

    public void t(boolean z) {
        this.f = z;
    }

    public String toString() {
        return f().toString();
    }

    public void u() {
        this.g.add(f().a());
    }

    public boolean v(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (l()) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char cCharAt = charSequence.charAt(i + i5);
            char cCharAt2 = charSequence2.charAt(i2 + i5);
            if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    public b w() {
        return f();
    }

    public c(Locale locale, DecimalStyle decimalStyle, Chronology chronology) {
        this.e = true;
        this.f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.a = locale;
        this.b = decimalStyle;
        this.c = chronology;
        this.d = null;
        arrayList.add(new b());
    }

    public c(c cVar) {
        this.e = true;
        this.f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
        arrayList.add(new b());
    }
}
