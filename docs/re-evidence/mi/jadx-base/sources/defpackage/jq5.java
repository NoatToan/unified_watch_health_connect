package defpackage;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

/* JADX INFO: loaded from: classes3.dex */
public class jq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dfd f23015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bfd f23016b;
    public final Locale c;
    public final boolean d;
    public final bw3 e;
    public final DateTimeZone f;
    public final Integer g;
    public final int h;

    public jq5(dfd dfdVar, bfd bfdVar) {
        this.f23015a = dfdVar;
        this.f23016b = bfdVar;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 2000;
    }

    public Locale a() {
        return this.c;
    }

    public oq5 b() {
        return cfd.d(this.f23016b);
    }

    public bfd c() {
        return this.f23016b;
    }

    public dfd d() {
        return this.f23015a;
    }

    public DateTimeZone e() {
        return this.f;
    }

    public DateTime f(String str) {
        bfd bfdVarR = r();
        bw3 bw3VarT = t(null);
        pq5 pq5Var = new pq5(0L, bw3VarT, this.c, this.g, this.h);
        int iC = bfdVarR.c(pq5Var, str, 0);
        if (iC < 0) {
            iC = ~iC;
        } else if (iC >= str.length()) {
            long jL = pq5Var.l(true, str);
            if (this.d && pq5Var.p() != null) {
                bw3VarT = bw3VarT.withZone(DateTimeZone.forOffsetMillis(pq5Var.p().intValue()));
            } else if (pq5Var.r() != null) {
                bw3VarT = bw3VarT.withZone(pq5Var.r());
            }
            DateTime dateTime = new DateTime(jL, bw3VarT);
            DateTimeZone dateTimeZone = this.f;
            return dateTimeZone != null ? dateTime.withZone(dateTimeZone) : dateTime;
        }
        throw new IllegalArgumentException(d1a.h(str, iC));
    }

    public LocalDate g(String str) {
        return h(str).toLocalDate();
    }

    public LocalDateTime h(String str) {
        bfd bfdVarR = r();
        bw3 bw3VarWithUTC = t(null).withUTC();
        pq5 pq5Var = new pq5(0L, bw3VarWithUTC, this.c, this.g, this.h);
        int iC = bfdVarR.c(pq5Var, str, 0);
        if (iC < 0) {
            iC = ~iC;
        } else if (iC >= str.length()) {
            long jL = pq5Var.l(true, str);
            if (pq5Var.p() != null) {
                bw3VarWithUTC = bw3VarWithUTC.withZone(DateTimeZone.forOffsetMillis(pq5Var.p().intValue()));
            } else if (pq5Var.r() != null) {
                bw3VarWithUTC = bw3VarWithUTC.withZone(pq5Var.r());
            }
            return new LocalDateTime(jL, bw3VarWithUTC);
        }
        throw new IllegalArgumentException(d1a.h(str, iC));
    }

    public LocalTime i(String str) {
        return h(str).toLocalTime();
    }

    public long j(String str) {
        return new pq5(0L, t(this.e), this.c, this.g, this.h).m(r(), str);
    }

    public String k(kgj kgjVar) {
        StringBuilder sb = new StringBuilder(s().d());
        try {
            o(sb, kgjVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public String l(ogj ogjVar) {
        StringBuilder sb = new StringBuilder(s().d());
        try {
            p(sb, ogjVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void m(Appendable appendable, long j) throws IOException {
        n(appendable, j, null);
    }

    public final void n(Appendable appendable, long j, bw3 bw3Var) throws IOException {
        dfd dfdVarS = s();
        bw3 bw3VarT = t(bw3Var);
        DateTimeZone zone = bw3VarT.getZone();
        int offset = zone.getOffset(j);
        long j2 = offset;
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j2 ^ j) >= 0) {
            zone = DateTimeZone.UTC;
            offset = 0;
            j3 = j;
        }
        dfdVarS.b(appendable, j3, bw3VarT.withUTC(), offset, zone, this.c);
    }

    public void o(Appendable appendable, kgj kgjVar) throws IOException {
        n(appendable, wq5.h(kgjVar), wq5.g(kgjVar));
    }

    public void p(Appendable appendable, ogj ogjVar) throws IOException {
        dfd dfdVarS = s();
        if (ogjVar == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        dfdVarS.e(appendable, ogjVar, this.c);
    }

    public void q(StringBuffer stringBuffer, long j) {
        try {
            m(stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    public final bfd r() {
        bfd bfdVar = this.f23016b;
        if (bfdVar != null) {
            return bfdVar;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    public final dfd s() {
        dfd dfdVar = this.f23015a;
        if (dfdVar != null) {
            return dfdVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public final bw3 t(bw3 bw3Var) {
        bw3 bw3VarC = wq5.c(bw3Var);
        bw3 bw3Var2 = this.e;
        if (bw3Var2 != null) {
            bw3VarC = bw3Var2;
        }
        DateTimeZone dateTimeZone = this.f;
        return dateTimeZone != null ? bw3VarC.withZone(dateTimeZone) : bw3VarC;
    }

    public jq5 u(bw3 bw3Var) {
        return this.e == bw3Var ? this : new jq5(this.f23015a, this.f23016b, this.c, this.d, bw3Var, this.f, this.g, this.h);
    }

    public jq5 v(Locale locale) {
        return (locale == a() || (locale != null && locale.equals(a()))) ? this : new jq5(this.f23015a, this.f23016b, locale, this.d, this.e, this.f, this.g, this.h);
    }

    public jq5 w() {
        return this.d ? this : new jq5(this.f23015a, this.f23016b, this.c, true, this.e, null, this.g, this.h);
    }

    public jq5 x(DateTimeZone dateTimeZone) {
        return this.f == dateTimeZone ? this : new jq5(this.f23015a, this.f23016b, this.c, false, this.e, dateTimeZone, this.g, this.h);
    }

    public jq5 y() {
        return x(DateTimeZone.UTC);
    }

    public jq5(dfd dfdVar, bfd bfdVar, Locale locale, boolean z, bw3 bw3Var, DateTimeZone dateTimeZone, Integer num, int i) {
        this.f23015a = dfdVar;
        this.f23016b = bfdVar;
        this.c = locale;
        this.d = z;
        this.e = bw3Var;
        this.f = dateTimeZone;
        this.g = num;
        this.h = i;
    }
}
