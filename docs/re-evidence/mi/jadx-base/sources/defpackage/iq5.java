package defpackage;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.format.DateTimeParseException;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.format.SignStyle;
import org.threeten.bp.temporal.ChronoField;

/* JADX INFO: loaded from: classes3.dex */
public final class iq5 {
    public static final iq5 h;
    public static final iq5 i;
    public static final iq5 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final iq5 f21984k;
    public static final iq5 l;
    public static final iq5 m;
    public static final iq5 n;
    public static final iq5 o;
    public static final iq5 p;
    public static final iq5 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final iq5 f21985r;
    public static final iq5 s;
    public static final iq5 t;
    public static final iq5 u;
    public static final iq5 v;
    public static final b5p<Period> w;
    public static final b5p<Boolean> x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq5.g f21986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f21987b;
    public final wr5 c;
    public final ResolverStyle d;
    public final Set<z4p> e;
    public final org.threeten.bp.chrono.b f;
    public final ZoneId g;

    public class a implements b5p<Period> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Period a(t4p t4pVar) {
            return t4pVar instanceof eq5 ? ((eq5) t4pVar).g : Period.ZERO;
        }
    }

    public class b implements b5p<Boolean> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(t4p t4pVar) {
            return t4pVar instanceof eq5 ? Boolean.valueOf(((eq5) t4pVar).f) : Boolean.FALSE;
        }
    }

    static {
        kq5 kq5Var = new kq5();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        kq5 kq5VarF = kq5Var.n(chronoField, 4, 10, signStyle).f('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        kq5 kq5VarF2 = kq5VarF.m(chronoField2, 2).f('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        kq5 kq5VarM = kq5VarF2.m(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        iq5 iq5VarX = kq5VarM.x(resolverStyle);
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        iq5 iq5VarL = iq5VarX.l(isoChronology);
        h = iq5VarL;
        i = new kq5().s().a(iq5VarL).i().x(resolverStyle).l(isoChronology);
        j = new kq5().s().a(iq5VarL).r().i().x(resolverStyle).l(isoChronology);
        kq5 kq5Var2 = new kq5();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        kq5 kq5VarF3 = kq5Var2.m(chronoField4, 2).f(AbstractJsonLexerKt.COLON);
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        kq5 kq5VarF4 = kq5VarF3.m(chronoField5, 2).r().f(AbstractJsonLexerKt.COLON);
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        iq5 iq5VarX2 = kq5VarF4.m(chronoField6, 2).r().c(ChronoField.NANO_OF_SECOND, 0, 9, true).x(resolverStyle);
        f21984k = iq5VarX2;
        l = new kq5().s().a(iq5VarX2).i().x(resolverStyle);
        m = new kq5().s().a(iq5VarX2).r().i().x(resolverStyle);
        iq5 iq5VarL2 = new kq5().s().a(iq5VarL).f('T').a(iq5VarX2).x(resolverStyle).l(isoChronology);
        n = iq5VarL2;
        iq5 iq5VarL3 = new kq5().s().a(iq5VarL2).i().x(resolverStyle).l(isoChronology);
        o = iq5VarL3;
        p = new kq5().a(iq5VarL3).r().f(AbstractJsonLexerKt.BEGIN_LIST).t().o().f(AbstractJsonLexerKt.END_LIST).x(resolverStyle).l(isoChronology);
        q = new kq5().a(iq5VarL2).r().i().r().f(AbstractJsonLexerKt.BEGIN_LIST).t().o().f(AbstractJsonLexerKt.END_LIST).x(resolverStyle).l(isoChronology);
        f21985r = new kq5().s().n(chronoField, 4, 10, signStyle).f('-').m(ChronoField.DAY_OF_YEAR, 3).r().i().x(resolverStyle).l(isoChronology);
        kq5 kq5VarF5 = new kq5().s().n(did.d, 4, 10, signStyle).g("-W").m(did.c, 2).f('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        s = kq5VarF5.m(chronoField7, 1).r().i().x(resolverStyle).l(isoChronology);
        t = new kq5().s().d().x(resolverStyle);
        u = new kq5().s().m(chronoField, 4).m(chronoField2, 2).m(chronoField3, 2).r().h("+HHMMss", "Z").x(resolverStyle).l(isoChronology);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        v = new kq5().s().u().r().j(chronoField7, map).g(", ").q().n(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).f(' ').j(chronoField2, map2).f(' ').m(chronoField, 4).f(' ').m(chronoField4, 2).f(AbstractJsonLexerKt.COLON).m(chronoField5, 2).r().f(AbstractJsonLexerKt.COLON).m(chronoField6, 2).q().f(' ').h("+HHMM", "GMT").x(ResolverStyle.SMART).l(isoChronology);
        w = new a();
        x = new b();
    }

    public iq5(kq5.g gVar, Locale locale, wr5 wr5Var, ResolverStyle resolverStyle, Set<z4p> set, org.threeten.bp.chrono.b bVar, ZoneId zoneId) {
        this.f21986a = (kq5.g) crd.i(gVar, "printerParser");
        this.f21987b = (Locale) crd.i(locale, "locale");
        this.c = (wr5) crd.i(wr5Var, "decimalStyle");
        this.d = (ResolverStyle) crd.i(resolverStyle, "resolverStyle");
        this.e = set;
        this.f = bVar;
        this.g = zoneId;
    }

    public final DateTimeParseException a(CharSequence charSequence, RuntimeException runtimeException) {
        String string;
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        return new DateTimeParseException("Text '" + string + "' could not be parsed: " + runtimeException.getMessage(), charSequence, 0, runtimeException);
    }

    public String b(t4p t4pVar) {
        StringBuilder sb = new StringBuilder(32);
        c(t4pVar, sb);
        return sb.toString();
    }

    public void c(t4p t4pVar, Appendable appendable) {
        crd.i(t4pVar, "temporal");
        crd.i(appendable, "appendable");
        try {
            rq5 rq5Var = new rq5(t4pVar, this);
            if (appendable instanceof StringBuilder) {
                this.f21986a.b(rq5Var, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.f21986a.b(rq5Var, sb);
            appendable.append(sb);
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public org.threeten.bp.chrono.b d() {
        return this.f;
    }

    public wr5 e() {
        return this.c;
    }

    public Locale f() {
        return this.f21987b;
    }

    public ZoneId g() {
        return this.g;
    }

    public <T> T h(CharSequence charSequence, b5p<T> b5pVar) {
        crd.i(charSequence, "text");
        crd.i(b5pVar, "type");
        try {
            return (T) i(charSequence, null).w(this.d, this.e).d(b5pVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw a(charSequence, e2);
        }
    }

    public final eq5 i(CharSequence charSequence, ParsePosition parsePosition) {
        String string;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        nq5.b bVarJ = j(charSequence, parsePosition2);
        if (bVarJ != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return bVarJ.b();
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            throw new DateTimeParseException("Text '" + string + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
        }
        throw new DateTimeParseException("Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
    }

    public final nq5.b j(CharSequence charSequence, ParsePosition parsePosition) {
        crd.i(charSequence, "text");
        crd.i(parsePosition, "position");
        nq5 nq5Var = new nq5(this);
        int iA = this.f21986a.a(nq5Var, charSequence, parsePosition.getIndex());
        if (iA < 0) {
            parsePosition.setErrorIndex(~iA);
            return null;
        }
        parsePosition.setIndex(iA);
        return nq5Var.v();
    }

    public kq5.g k(boolean z) {
        return this.f21986a.c(z);
    }

    public iq5 l(org.threeten.bp.chrono.b bVar) {
        return crd.c(this.f, bVar) ? this : new iq5(this.f21986a, this.f21987b, this.c, this.d, this.e, bVar, this.g);
    }

    public iq5 m(ResolverStyle resolverStyle) {
        crd.i(resolverStyle, "resolverStyle");
        return crd.c(this.d, resolverStyle) ? this : new iq5(this.f21986a, this.f21987b, this.c, resolverStyle, this.e, this.f, this.g);
    }

    public String toString() {
        String string = this.f21986a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
