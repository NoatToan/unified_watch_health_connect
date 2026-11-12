package defpackage;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import miuix.animation.internal.FolmeCore;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.a;
import org.threeten.bp.chrono.b;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.temporal.ChronoField;

/* JADX INFO: loaded from: classes3.dex */
public final class eq5 extends sv5 implements t4p, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<z4p, Long> f16952a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f16953b;
    public ZoneId c;
    public a d;
    public LocalTime e;
    public boolean f;
    public Period g;

    public final void A(z4p z4pVar, LocalTime localTime) {
        long nanoOfDay = localTime.toNanoOfDay();
        Long lPut = this.f16952a.put(ChronoField.NANO_OF_DAY, Long.valueOf(nanoOfDay));
        if (lPut == null || lPut.longValue() == nanoOfDay) {
            return;
        }
        throw new DateTimeException("Conflict found: " + LocalTime.ofNanoOfDay(lPut.longValue()) + " differs from " + localTime + " while resolving  " + z4pVar);
    }

    public final void B(z4p z4pVar, a aVar) {
        if (!this.f16953b.equals(aVar.getChronology())) {
            throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f16953b);
        }
        long epochDay = aVar.toEpochDay();
        Long lPut = this.f16952a.put(ChronoField.EPOCH_DAY, Long.valueOf(epochDay));
        if (lPut == null || lPut.longValue() == epochDay) {
            return;
        }
        throw new DateTimeException("Conflict found: " + LocalDate.ofEpochDay(lPut.longValue()) + " differs from " + LocalDate.ofEpochDay(epochDay) + " while resolving  " + z4pVar);
    }

    public final void C(ResolverStyle resolverStyle) {
        Map<z4p, Long> map = this.f16952a;
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        Long l = map.get(chronoField);
        Map<z4p, Long> map2 = this.f16952a;
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        Long l2 = map2.get(chronoField2);
        Map<z4p, Long> map3 = this.f16952a;
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        Long l3 = map3.get(chronoField3);
        Map<z4p, Long> map4 = this.f16952a;
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
                        int iQ = crd.q(crd.e(jLongValue, 24L));
                        b(LocalTime.of(crd.g(jLongValue, 24), 0));
                        this.g = Period.ofDays(iQ);
                    } else if (l3 != null) {
                        if (l4 == null) {
                            l4 = 0L;
                        }
                        long jK = crd.k(crd.k(crd.k(crd.n(jLongValue, 3600000000000L), crd.n(l2.longValue(), 60000000000L)), crd.n(l3.longValue(), FolmeCore.NANOS_TO_S)), l4.longValue());
                        int iE = (int) crd.e(jK, 86400000000000L);
                        b(LocalTime.ofNanoOfDay(crd.h(jK, 86400000000000L)));
                        this.g = Period.ofDays(iE);
                    } else {
                        long jK2 = crd.k(crd.n(jLongValue, TimeDateUtil.TIME_HOUR), crd.n(l2.longValue(), 60L));
                        int iE2 = (int) crd.e(jK2, 86400L);
                        b(LocalTime.ofSecondOfDay(crd.h(jK2, 86400L)));
                        this.g = Period.ofDays(iE2);
                    }
                }
                this.f16952a.remove(chronoField);
                this.f16952a.remove(chronoField2);
                this.f16952a.remove(chronoField3);
                this.f16952a.remove(chronoField4);
            }
        }
    }

    public eq5 a(z4p z4pVar, long j) {
        crd.i(z4pVar, "field");
        Long lK = k(z4pVar);
        if (lK == null || lK.longValue() == j) {
            return u(z4pVar, j);
        }
        throw new DateTimeException("Conflict found: " + z4pVar + " " + lK + " differs from " + z4pVar + " " + j + ": " + this);
    }

    public void b(LocalTime localTime) {
        this.e = localTime;
    }

    public void c(a aVar) {
        this.d = aVar;
    }

    public <R> R d(b5p<R> b5pVar) {
        return b5pVar.a(this);
    }

    public final void e(LocalDate localDate) {
        if (localDate != null) {
            c(localDate);
            for (z4p z4pVar : this.f16952a.keySet()) {
                if ((z4pVar instanceof ChronoField) && z4pVar.isDateBased()) {
                    try {
                        long j = localDate.getLong(z4pVar);
                        Long l = this.f16952a.get(z4pVar);
                        if (j != l.longValue()) {
                            throw new DateTimeException("Conflict found: Field " + z4pVar + " " + j + " differs from " + z4pVar + " " + l + " derived from " + localDate);
                        }
                    } catch (DateTimeException unused) {
                        continue;
                    }
                }
            }
        }
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        crd.i(z4pVar, "field");
        Long lK = k(z4pVar);
        if (lK != null) {
            return lK.longValue();
        }
        a aVar = this.d;
        if (aVar != null && aVar.isSupported(z4pVar)) {
            return this.d.getLong(z4pVar);
        }
        LocalTime localTime = this.e;
        if (localTime != null && localTime.isSupported(z4pVar)) {
            return this.e.getLong(z4pVar);
        }
        throw new DateTimeException("Field not found: " + z4pVar);
    }

    public final void h() {
        LocalTime localTime;
        if (this.f16952a.size() > 0) {
            a aVar = this.d;
            if (aVar != null && (localTime = this.e) != null) {
                i(aVar.atTime(localTime));
                return;
            }
            if (aVar != null) {
                i(aVar);
                return;
            }
            t4p t4pVar = this.e;
            if (t4pVar != null) {
                i(t4pVar);
            }
        }
    }

    public final void i(t4p t4pVar) {
        Iterator<Map.Entry<z4p, Long>> it = this.f16952a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<z4p, Long> next = it.next();
            z4p key = next.getKey();
            long jLongValue = next.getValue().longValue();
            if (t4pVar.isSupported(key)) {
                try {
                    long j = t4pVar.getLong(key);
                    if (j != jLongValue) {
                        throw new DateTimeException("Cross check failed: " + key + " " + j + " vs " + key + " " + jLongValue);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        a aVar;
        LocalTime localTime;
        if (z4pVar == null) {
            return false;
        }
        return this.f16952a.containsKey(z4pVar) || ((aVar = this.d) != null && aVar.isSupported(z4pVar)) || ((localTime = this.e) != null && localTime.isSupported(z4pVar));
    }

    public final Long k(z4p z4pVar) {
        return this.f16952a.get(z4pVar);
    }

    public final void n(ResolverStyle resolverStyle) {
        if (this.f16953b instanceof IsoChronology) {
            e(IsoChronology.INSTANCE.resolveDate(this.f16952a, resolverStyle));
            return;
        }
        Map<z4p, Long> map = this.f16952a;
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            e(LocalDate.ofEpochDay(this.f16952a.remove(chronoField).longValue()));
        }
    }

    public final void p() {
        if (this.f16952a.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.c;
            if (zoneId != null) {
                r(zoneId);
                return;
            }
            Long l = this.f16952a.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                r(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    @Override // defpackage.sv5, defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.g()) {
            return (R) this.c;
        }
        if (b5pVar == a5p.a()) {
            return (R) this.f16953b;
        }
        if (b5pVar == a5p.b()) {
            a aVar = this.d;
            if (aVar != null) {
                return (R) LocalDate.from((t4p) aVar);
            }
            return null;
        }
        if (b5pVar == a5p.c()) {
            return (R) this.e;
        }
        if (b5pVar == a5p.f() || b5pVar == a5p.d()) {
            return b5pVar.a(this);
        }
        if (b5pVar == a5p.e()) {
            return null;
        }
        return b5pVar.a(this);
    }

    public final void r(ZoneId zoneId) {
        Map<z4p, Long> map = this.f16952a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        zv3<?> zv3VarZonedDateTime = this.f16953b.zonedDateTime(Instant.ofEpochSecond(map.remove(chronoField).longValue()), zoneId);
        if (this.d == null) {
            c(zv3VarZonedDateTime.toLocalDate());
        } else {
            B(chronoField, zv3VarZonedDateTime.toLocalDate());
        }
        a(ChronoField.SECOND_OF_DAY, zv3VarZonedDateTime.toLocalTime().toSecondOfDay());
    }

    public final void s(ResolverStyle resolverStyle) {
        Map<z4p, Long> map = this.f16952a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(chronoField)) {
            long jLongValue = this.f16952a.remove(chronoField).longValue();
            if (resolverStyle != ResolverStyle.LENIENT && (resolverStyle != ResolverStyle.SMART || jLongValue != 0)) {
                chronoField.checkValidValue(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            a(chronoField2, jLongValue);
        }
        Map<z4p, Long> map2 = this.f16952a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(chronoField3)) {
            long jLongValue2 = this.f16952a.remove(chronoField3).longValue();
            if (resolverStyle != ResolverStyle.LENIENT && (resolverStyle != ResolverStyle.SMART || jLongValue2 != 0)) {
                chronoField3.checkValidValue(jLongValue2);
            }
            a(ChronoField.HOUR_OF_AMPM, jLongValue2 != 12 ? jLongValue2 : 0L);
        }
        ResolverStyle resolverStyle2 = ResolverStyle.LENIENT;
        if (resolverStyle != resolverStyle2) {
            Map<z4p, Long> map3 = this.f16952a;
            ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
            if (map3.containsKey(chronoField4)) {
                chronoField4.checkValidValue(this.f16952a.get(chronoField4).longValue());
            }
            Map<z4p, Long> map4 = this.f16952a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (map4.containsKey(chronoField5)) {
                chronoField5.checkValidValue(this.f16952a.get(chronoField5).longValue());
            }
        }
        Map<z4p, Long> map5 = this.f16952a;
        ChronoField chronoField6 = ChronoField.AMPM_OF_DAY;
        if (map5.containsKey(chronoField6)) {
            Map<z4p, Long> map6 = this.f16952a;
            ChronoField chronoField7 = ChronoField.HOUR_OF_AMPM;
            if (map6.containsKey(chronoField7)) {
                a(ChronoField.HOUR_OF_DAY, (this.f16952a.remove(chronoField6).longValue() * 12) + this.f16952a.remove(chronoField7).longValue());
            }
        }
        Map<z4p, Long> map7 = this.f16952a;
        ChronoField chronoField8 = ChronoField.NANO_OF_DAY;
        if (map7.containsKey(chronoField8)) {
            long jLongValue3 = this.f16952a.remove(chronoField8).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField8.checkValidValue(jLongValue3);
            }
            a(ChronoField.SECOND_OF_DAY, jLongValue3 / FolmeCore.NANOS_TO_S);
            a(ChronoField.NANO_OF_SECOND, jLongValue3 % FolmeCore.NANOS_TO_S);
        }
        Map<z4p, Long> map8 = this.f16952a;
        ChronoField chronoField9 = ChronoField.MICRO_OF_DAY;
        if (map8.containsKey(chronoField9)) {
            long jLongValue4 = this.f16952a.remove(chronoField9).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField9.checkValidValue(jLongValue4);
            }
            a(ChronoField.SECOND_OF_DAY, jLongValue4 / FolmeCore.NANOS_TO_MS);
            a(ChronoField.MICRO_OF_SECOND, jLongValue4 % FolmeCore.NANOS_TO_MS);
        }
        Map<z4p, Long> map9 = this.f16952a;
        ChronoField chronoField10 = ChronoField.MILLI_OF_DAY;
        if (map9.containsKey(chronoField10)) {
            long jLongValue5 = this.f16952a.remove(chronoField10).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField10.checkValidValue(jLongValue5);
            }
            a(ChronoField.SECOND_OF_DAY, jLongValue5 / 1000);
            a(ChronoField.MILLI_OF_SECOND, jLongValue5 % 1000);
        }
        Map<z4p, Long> map10 = this.f16952a;
        ChronoField chronoField11 = ChronoField.SECOND_OF_DAY;
        if (map10.containsKey(chronoField11)) {
            long jLongValue6 = this.f16952a.remove(chronoField11).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField11.checkValidValue(jLongValue6);
            }
            a(ChronoField.HOUR_OF_DAY, jLongValue6 / TimeDateUtil.TIME_HOUR);
            a(ChronoField.MINUTE_OF_HOUR, (jLongValue6 / 60) % 60);
            a(ChronoField.SECOND_OF_MINUTE, jLongValue6 % 60);
        }
        Map<z4p, Long> map11 = this.f16952a;
        ChronoField chronoField12 = ChronoField.MINUTE_OF_DAY;
        if (map11.containsKey(chronoField12)) {
            long jLongValue7 = this.f16952a.remove(chronoField12).longValue();
            if (resolverStyle != resolverStyle2) {
                chronoField12.checkValidValue(jLongValue7);
            }
            a(ChronoField.HOUR_OF_DAY, jLongValue7 / 60);
            a(ChronoField.MINUTE_OF_HOUR, jLongValue7 % 60);
        }
        if (resolverStyle != resolverStyle2) {
            Map<z4p, Long> map12 = this.f16952a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (map12.containsKey(chronoField13)) {
                chronoField13.checkValidValue(this.f16952a.get(chronoField13).longValue());
            }
            Map<z4p, Long> map13 = this.f16952a;
            ChronoField chronoField14 = ChronoField.MICRO_OF_SECOND;
            if (map13.containsKey(chronoField14)) {
                chronoField14.checkValidValue(this.f16952a.get(chronoField14).longValue());
            }
        }
        Map<z4p, Long> map14 = this.f16952a;
        ChronoField chronoField15 = ChronoField.MILLI_OF_SECOND;
        if (map14.containsKey(chronoField15)) {
            Map<z4p, Long> map15 = this.f16952a;
            ChronoField chronoField16 = ChronoField.MICRO_OF_SECOND;
            if (map15.containsKey(chronoField16)) {
                a(chronoField16, (this.f16952a.remove(chronoField15).longValue() * 1000) + (this.f16952a.get(chronoField16).longValue() % 1000));
            }
        }
        Map<z4p, Long> map16 = this.f16952a;
        ChronoField chronoField17 = ChronoField.MICRO_OF_SECOND;
        if (map16.containsKey(chronoField17)) {
            Map<z4p, Long> map17 = this.f16952a;
            ChronoField chronoField18 = ChronoField.NANO_OF_SECOND;
            if (map17.containsKey(chronoField18)) {
                a(chronoField17, this.f16952a.get(chronoField18).longValue() / 1000);
                this.f16952a.remove(chronoField17);
            }
        }
        if (this.f16952a.containsKey(chronoField15)) {
            Map<z4p, Long> map18 = this.f16952a;
            ChronoField chronoField19 = ChronoField.NANO_OF_SECOND;
            if (map18.containsKey(chronoField19)) {
                a(chronoField15, this.f16952a.get(chronoField19).longValue() / FolmeCore.NANOS_TO_MS);
                this.f16952a.remove(chronoField15);
            }
        }
        if (this.f16952a.containsKey(chronoField17)) {
            a(ChronoField.NANO_OF_SECOND, this.f16952a.remove(chronoField17).longValue() * 1000);
        } else if (this.f16952a.containsKey(chronoField15)) {
            a(ChronoField.NANO_OF_SECOND, this.f16952a.remove(chronoField15).longValue() * FolmeCore.NANOS_TO_MS);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.f16952a.size() > 0) {
            sb.append("fields=");
            sb.append(this.f16952a);
        }
        sb.append(", ");
        sb.append(this.f16953b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final eq5 u(z4p z4pVar, long j) {
        this.f16952a.put(z4pVar, Long.valueOf(j));
        return this;
    }

    public eq5 w(ResolverStyle resolverStyle, Set<z4p> set) {
        a aVar;
        if (set != null) {
            this.f16952a.keySet().retainAll(set);
        }
        p();
        n(resolverStyle);
        s(resolverStyle);
        if (x(resolverStyle)) {
            p();
            n(resolverStyle);
            s(resolverStyle);
        }
        C(resolverStyle);
        h();
        Period period = this.g;
        if (period != null && !period.isZero() && (aVar = this.d) != null && this.e != null) {
            this.d = aVar.plus((y4p) this.g);
            this.g = Period.ZERO;
        }
        y();
        z();
        return this;
    }

    public final boolean x(ResolverStyle resolverStyle) {
        z4p key;
        int i = 0;
        loop0: while (i < 100) {
            Iterator<Map.Entry<z4p, Long>> it = this.f16952a.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                key = it.next().getKey();
                t4p t4pVarResolve = key.resolve(this.f16952a, this, resolverStyle);
                if (t4pVarResolve != null) {
                    if (t4pVarResolve instanceof zv3) {
                        zv3 zv3Var = (zv3) t4pVarResolve;
                        ZoneId zoneId = this.c;
                        if (zoneId == null) {
                            this.c = zv3Var.getZone();
                        } else if (!zoneId.equals(zv3Var.getZone())) {
                            throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.c);
                        }
                        t4pVarResolve = zv3Var.toLocalDateTime();
                    }
                    if (t4pVarResolve instanceof a) {
                        B(key, (a) t4pVarResolve);
                        break;
                    }
                    if (t4pVarResolve instanceof LocalTime) {
                        A(key, (LocalTime) t4pVarResolve);
                        break;
                    }
                    if (t4pVarResolve instanceof vv3) {
                        vv3 vv3Var = (vv3) t4pVarResolve;
                        B(key, vv3Var.toLocalDate());
                        A(key, vv3Var.toLocalTime());
                        break;
                    }
                    throw new DateTimeException("Unknown type: " + t4pVarResolve.getClass().getName());
                }
            } while (this.f16952a.containsKey(key));
            i++;
        }
        if (i != 100) {
            return i > 0;
        }
        throw new DateTimeException("Badly written field");
    }

    public final void y() {
        if (this.e == null) {
            if (this.f16952a.containsKey(ChronoField.INSTANT_SECONDS) || this.f16952a.containsKey(ChronoField.SECOND_OF_DAY) || this.f16952a.containsKey(ChronoField.SECOND_OF_MINUTE)) {
                Map<z4p, Long> map = this.f16952a;
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                if (map.containsKey(chronoField)) {
                    long jLongValue = this.f16952a.get(chronoField).longValue();
                    this.f16952a.put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue / 1000));
                    this.f16952a.put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue / FolmeCore.NANOS_TO_MS));
                } else {
                    this.f16952a.put(chronoField, 0L);
                    this.f16952a.put(ChronoField.MICRO_OF_SECOND, 0L);
                    this.f16952a.put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            }
        }
    }

    public final void z() {
        if (this.d == null || this.e == null) {
            return;
        }
        Long l = this.f16952a.get(ChronoField.OFFSET_SECONDS);
        if (l != null) {
            rv5 rv5VarAtZone = this.d.atTime(this.e).atZone(ZoneOffset.ofTotalSeconds(l.intValue()));
            z4p z4pVar = ChronoField.INSTANT_SECONDS;
            this.f16952a.put(z4pVar, Long.valueOf(rv5VarAtZone.getLong(z4pVar)));
            return;
        }
        if (this.c != null) {
            rv5 rv5VarAtZone2 = this.d.atTime(this.e).atZone(this.c);
            z4p z4pVar2 = ChronoField.INSTANT_SECONDS;
            this.f16952a.put(z4pVar2, Long.valueOf(rv5VarAtZone2.getLong(z4pVar2)));
        }
    }
}
