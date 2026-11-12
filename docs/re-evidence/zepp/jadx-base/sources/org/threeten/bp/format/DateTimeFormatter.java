package org.threeten.bp.format;

import androidx.core.graphics.drawable.IconCompat;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.Chronology;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes23.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter BASIC_ISO_DATE;
    public static final DateTimeFormatter ISO_DATE;
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
    public static final DateTimeFormatter ISO_LOCAL_TIME;
    public static final DateTimeFormatter ISO_OFFSET_DATE;
    public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;
    public static final DateTimeFormatter ISO_OFFSET_TIME;
    public static final DateTimeFormatter ISO_ORDINAL_DATE;
    public static final DateTimeFormatter ISO_TIME;
    public static final DateTimeFormatter ISO_WEEK_DATE;
    public static final DateTimeFormatter ISO_ZONED_DATE_TIME;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;
    private static final TemporalQuery<Period> h;
    private static final TemporalQuery<Boolean> i;
    private final DateTimeFormatterBuilder.g a;
    private final Locale b;
    private final DecimalStyle c;
    private final ResolverStyle d;
    private final Set<TemporalField> e;
    private final Chronology f;
    private final ZoneId g;

    public class a implements TemporalQuery<Period> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Period queryFrom(TemporalAccessor temporalAccessor) {
            return temporalAccessor instanceof org.threeten.bp.format.a ? ((org.threeten.bp.format.a) temporalAccessor).g : Period.ZERO;
        }
    }

    public class b implements TemporalQuery<Boolean> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean queryFrom(TemporalAccessor temporalAccessor) {
            return temporalAccessor instanceof org.threeten.bp.format.a ? Boolean.valueOf(((org.threeten.bp.format.a) temporalAccessor).f) : Boolean.FALSE;
        }
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        DateTimeFormatter dateTimeFormatterE = dateTimeFormatterBuilderAppendValue.e(resolverStyle);
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        DateTimeFormatter dateTimeFormatterWithChronology = dateTimeFormatterE.withChronology(isoChronology);
        ISO_LOCAL_DATE = dateTimeFormatterWithChronology;
        ISO_OFFSET_DATE = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterWithChronology).appendOffsetId().e(resolverStyle).withChronology(isoChronology);
        ISO_DATE = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterWithChronology).optionalStart().appendOffsetId().e(resolverStyle).withChronology(isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(JsonLexerKt.COLON);
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral4 = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField5, 2).optionalStart().appendLiteral(JsonLexerKt.COLON);
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatter dateTimeFormatterE2 = dateTimeFormatterBuilderAppendLiteral4.appendValue(chronoField6, 2).optionalStart().appendFraction(ChronoField.NANO_OF_SECOND, 0, 9, true).e(resolverStyle);
        ISO_LOCAL_TIME = dateTimeFormatterE2;
        ISO_OFFSET_TIME = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterE2).appendOffsetId().e(resolverStyle);
        ISO_TIME = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterE2).optionalStart().appendOffsetId().e(resolverStyle);
        DateTimeFormatter dateTimeFormatterWithChronology2 = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterWithChronology).appendLiteral('T').append(dateTimeFormatterE2).e(resolverStyle).withChronology(isoChronology);
        ISO_LOCAL_DATE_TIME = dateTimeFormatterWithChronology2;
        DateTimeFormatter dateTimeFormatterWithChronology3 = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterWithChronology2).appendOffsetId().e(resolverStyle).withChronology(isoChronology);
        ISO_OFFSET_DATE_TIME = dateTimeFormatterWithChronology3;
        ISO_ZONED_DATE_TIME = new DateTimeFormatterBuilder().append(dateTimeFormatterWithChronology3).optionalStart().appendLiteral(JsonLexerKt.BEGIN_LIST).parseCaseSensitive().appendZoneRegionId().appendLiteral(JsonLexerKt.END_LIST).e(resolverStyle).withChronology(isoChronology);
        ISO_DATE_TIME = new DateTimeFormatterBuilder().append(dateTimeFormatterWithChronology2).optionalStart().appendOffsetId().optionalStart().appendLiteral(JsonLexerKt.BEGIN_LIST).parseCaseSensitive().appendZoneRegionId().appendLiteral(JsonLexerKt.END_LIST).e(resolverStyle).withChronology(isoChronology);
        ISO_ORDINAL_DATE = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3).optionalStart().appendOffsetId().e(resolverStyle).withChronology(isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral5 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(IsoFields.WEEK_BASED_YEAR, 4, 10, signStyle).appendLiteral("-W").appendValue(IsoFields.WEEK_OF_WEEK_BASED_YEAR, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        ISO_WEEK_DATE = dateTimeFormatterBuilderAppendLiteral5.appendValue(chronoField7, 1).optionalStart().appendOffsetId().e(resolverStyle).withChronology(isoChronology);
        ISO_INSTANT = new DateTimeFormatterBuilder().parseCaseInsensitive().appendInstant().e(resolverStyle);
        BASIC_ISO_DATE = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2).optionalStart().appendOffset("+HHMMss", "Z").e(resolverStyle).withChronology(isoChronology);
        HashMap map = new HashMap();
        map.put(1L, JsonParseUtils.WEEK_MON);
        map.put(2L, JsonParseUtils.WEEK_TUE);
        map.put(3L, JsonParseUtils.WEEK_WED);
        map.put(4L, JsonParseUtils.WEEK_THU);
        map.put(5L, JsonParseUtils.WEEK_FRI);
        map.put(6L, JsonParseUtils.WEEK_SAT);
        map.put(7L, JsonParseUtils.WEEK_SUN);
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
        RFC_1123_DATE_TIME = new DateTimeFormatterBuilder().parseCaseInsensitive().parseLenient().optionalStart().appendText(chronoField7, map).appendLiteral(", ").optionalEnd().appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(StringUtil.SPACE).appendText(chronoField2, map2).appendLiteral(StringUtil.SPACE).appendValue(chronoField, 4).appendLiteral(StringUtil.SPACE).appendValue(chronoField4, 2).appendLiteral(JsonLexerKt.COLON).appendValue(chronoField5, 2).optionalStart().appendLiteral(JsonLexerKt.COLON).appendValue(chronoField6, 2).optionalEnd().appendLiteral(StringUtil.SPACE).appendOffset("+HHMM", "GMT").e(ResolverStyle.SMART).withChronology(isoChronology);
        h = new a();
        i = new b();
    }

    public DateTimeFormatter(DateTimeFormatterBuilder.g gVar, Locale locale, DecimalStyle decimalStyle, ResolverStyle resolverStyle, Set<TemporalField> set, Chronology chronology, ZoneId zoneId) {
        this.a = (DateTimeFormatterBuilder.g) Jdk8Methods.requireNonNull(gVar, "printerParser");
        this.b = (Locale) Jdk8Methods.requireNonNull(locale, "locale");
        this.c = (DecimalStyle) Jdk8Methods.requireNonNull(decimalStyle, "decimalStyle");
        this.d = (ResolverStyle) Jdk8Methods.requireNonNull(resolverStyle, "resolverStyle");
        this.e = set;
        this.f = chronology;
        this.g = zoneId;
    }

    private DateTimeParseException c(CharSequence charSequence, RuntimeException runtimeException) {
        String string;
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        return new DateTimeParseException("Text '" + string + "' could not be parsed: " + runtimeException.getMessage(), charSequence, 0, runtimeException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.threeten.bp.format.a d(CharSequence charSequence, ParsePosition parsePosition) {
        String string;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        org.threeten.bp.format.c.b bVarE = e(charSequence, parsePosition2);
        if (bVarE != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return bVarE.b();
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

    /* JADX INFO: Access modifiers changed from: private */
    public org.threeten.bp.format.c.b e(CharSequence charSequence, ParsePosition parsePosition) {
        Jdk8Methods.requireNonNull(charSequence, "text");
        Jdk8Methods.requireNonNull(parsePosition, "position");
        org.threeten.bp.format.c cVar = new org.threeten.bp.format.c(this);
        int iA = this.a.a(cVar, charSequence, parsePosition.getIndex());
        if (iA < 0) {
            parsePosition.setErrorIndex(~iA);
            return null;
        }
        parsePosition.setIndex(iA);
        return cVar.w();
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Jdk8Methods.requireNonNull(formatStyle, "dateStyle");
        return new DateTimeFormatterBuilder().appendLocalized(formatStyle, null).toFormatter().withChronology(IsoChronology.INSTANCE);
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle) {
        Jdk8Methods.requireNonNull(formatStyle, "dateTimeStyle");
        return new DateTimeFormatterBuilder().appendLocalized(formatStyle, formatStyle).toFormatter().withChronology(IsoChronology.INSTANCE);
    }

    public static DateTimeFormatter ofLocalizedTime(FormatStyle formatStyle) {
        Jdk8Methods.requireNonNull(formatStyle, "timeStyle");
        return new DateTimeFormatterBuilder().appendLocalized(null, formatStyle).toFormatter().withChronology(IsoChronology.INSTANCE);
    }

    public static DateTimeFormatter ofPattern(String str) {
        return new DateTimeFormatterBuilder().appendPattern(str).toFormatter();
    }

    public static final TemporalQuery<Period> parsedExcessDays() {
        return h;
    }

    public static final TemporalQuery<Boolean> parsedLeapSecond() {
        return i;
    }

    public DateTimeFormatterBuilder.g f(boolean z) {
        return this.a.c(z);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        formatTo(temporalAccessor, sb);
        return sb.toString();
    }

    public void formatTo(TemporalAccessor temporalAccessor, Appendable appendable) {
        Jdk8Methods.requireNonNull(temporalAccessor, "temporal");
        Jdk8Methods.requireNonNull(appendable, "appendable");
        try {
            d dVar = new d(temporalAccessor, this);
            if (appendable instanceof StringBuilder) {
                this.a.b(dVar, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.a.b(dVar, sb);
            appendable.append(sb);
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public Chronology getChronology() {
        return this.f;
    }

    public DecimalStyle getDecimalStyle() {
        return this.c;
    }

    public Locale getLocale() {
        return this.b;
    }

    public Set<TemporalField> getResolverFields() {
        return this.e;
    }

    public ResolverStyle getResolverStyle() {
        return this.d;
    }

    public ZoneId getZone() {
        return this.g;
    }

    public TemporalAccessor parse(CharSequence charSequence) {
        Jdk8Methods.requireNonNull(charSequence, "text");
        try {
            return d(charSequence, null).p(this.d, this.e);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw c(charSequence, e2);
        }
    }

    public TemporalAccessor parseBest(CharSequence charSequence, TemporalQuery<?>... temporalQueryArr) {
        Jdk8Methods.requireNonNull(charSequence, "text");
        Jdk8Methods.requireNonNull(temporalQueryArr, "types");
        if (temporalQueryArr.length < 2) {
            throw new IllegalArgumentException("At least two types must be specified");
        }
        try {
            org.threeten.bp.format.a aVarP = d(charSequence, null).p(this.d, this.e);
            for (TemporalQuery<?> temporalQuery : temporalQueryArr) {
                try {
                    return (TemporalAccessor) aVarP.e(temporalQuery);
                } catch (RuntimeException unused) {
                }
            }
            throw new DateTimeException("Unable to convert parsed text to any specified type: " + Arrays.toString(temporalQueryArr));
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw c(charSequence, e2);
        }
    }

    public TemporalAccessor parseUnresolved(CharSequence charSequence, ParsePosition parsePosition) {
        return e(charSequence, parsePosition);
    }

    public Format toFormat() {
        return new c(this, null);
    }

    public String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        return Jdk8Methods.equals(this.f, chronology) ? this : new DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, chronology, this.g);
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        return this.c.equals(decimalStyle) ? this : new DateTimeFormatter(this.a, this.b, decimalStyle, this.d, this.e, this.f, this.g);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        return this.b.equals(locale) ? this : new DateTimeFormatter(this.a, locale, this.c, this.d, this.e, this.f, this.g);
    }

    public DateTimeFormatter withResolverFields(TemporalField... temporalFieldArr) {
        if (temporalFieldArr == null) {
            return new DateTimeFormatter(this.a, this.b, this.c, this.d, null, this.f, this.g);
        }
        HashSet hashSet = new HashSet(Arrays.asList(temporalFieldArr));
        if (Jdk8Methods.equals(this.e, hashSet)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, this.c, this.d, Collections.unmodifiableSet(hashSet), this.f, this.g);
    }

    public DateTimeFormatter withResolverStyle(ResolverStyle resolverStyle) {
        Jdk8Methods.requireNonNull(resolverStyle, "resolverStyle");
        return Jdk8Methods.equals(this.d, resolverStyle) ? this : new DateTimeFormatter(this.a, this.b, this.c, resolverStyle, this.e, this.f, this.g);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        return Jdk8Methods.equals(this.g, zoneId) ? this : new DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, this.f, zoneId);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        return new DateTimeFormatterBuilder().appendPattern(str).toFormatter(locale);
    }

    public Format toFormat(TemporalQuery<?> temporalQuery) {
        Jdk8Methods.requireNonNull(temporalQuery, "query");
        return new c(this, temporalQuery);
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle, FormatStyle formatStyle2) {
        Jdk8Methods.requireNonNull(formatStyle, "dateStyle");
        Jdk8Methods.requireNonNull(formatStyle2, "timeStyle");
        return new DateTimeFormatterBuilder().appendLocalized(formatStyle, formatStyle2).toFormatter().withChronology(IsoChronology.INSTANCE);
    }

    public TemporalAccessor parse(CharSequence charSequence, ParsePosition parsePosition) {
        Jdk8Methods.requireNonNull(charSequence, "text");
        Jdk8Methods.requireNonNull(parsePosition, "position");
        try {
            return d(charSequence, parsePosition).p(this.d, this.e);
        } catch (IndexOutOfBoundsException e) {
            throw e;
        } catch (DateTimeParseException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw c(charSequence, e3);
        }
    }

    public DateTimeFormatter withResolverFields(Set<TemporalField> set) {
        if (set == null) {
            return new DateTimeFormatter(this.a, this.b, this.c, this.d, null, this.f, this.g);
        }
        if (Jdk8Methods.equals(this.e, set)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, this.c, this.d, Collections.unmodifiableSet(new HashSet(set)), this.f, this.g);
    }

    public static class c extends Format {
        private final DateTimeFormatter a;
        private final TemporalQuery<?> b;

        public c(DateTimeFormatter dateTimeFormatter, TemporalQuery<?> temporalQuery) {
            this.a = dateTimeFormatter;
            this.b = temporalQuery;
        }

        @Override // java.text.Format
        public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            Jdk8Methods.requireNonNull(obj, IconCompat.EXTRA_OBJ);
            Jdk8Methods.requireNonNull(stringBuffer, "toAppendTo");
            Jdk8Methods.requireNonNull(fieldPosition, "pos");
            if (!(obj instanceof TemporalAccessor)) {
                throw new IllegalArgumentException("Format target must implement TemporalAccessor");
            }
            fieldPosition.setBeginIndex(0);
            fieldPosition.setEndIndex(0);
            try {
                this.a.formatTo((TemporalAccessor) obj, stringBuffer);
                return stringBuffer;
            } catch (RuntimeException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            }
        }

        @Override // java.text.Format
        public Object parseObject(String str) throws ParseException {
            Jdk8Methods.requireNonNull(str, "text");
            try {
                TemporalQuery<?> temporalQuery = this.b;
                return temporalQuery == null ? this.a.d(str, null).p(this.a.getResolverStyle(), this.a.getResolverFields()) : this.a.parse(str, temporalQuery);
            } catch (DateTimeParseException e) {
                throw new ParseException(e.getMessage(), e.getErrorIndex());
            } catch (RuntimeException e2) {
                throw ((ParseException) new ParseException(e2.getMessage(), 0).initCause(e2));
            }
        }

        @Override // java.text.Format
        public Object parseObject(String str, ParsePosition parsePosition) {
            Jdk8Methods.requireNonNull(str, "text");
            try {
                org.threeten.bp.format.c.b bVarE = this.a.e(str, parsePosition);
                if (bVarE == null) {
                    if (parsePosition.getErrorIndex() < 0) {
                        parsePosition.setErrorIndex(0);
                    }
                    return null;
                }
                try {
                    org.threeten.bp.format.a aVarP = bVarE.b().p(this.a.getResolverStyle(), this.a.getResolverFields());
                    TemporalQuery<?> temporalQuery = this.b;
                    return temporalQuery == null ? aVarP : aVarP.e(temporalQuery);
                } catch (RuntimeException unused) {
                    parsePosition.setErrorIndex(0);
                    return null;
                }
            } catch (IndexOutOfBoundsException unused2) {
                if (parsePosition.getErrorIndex() < 0) {
                    parsePosition.setErrorIndex(0);
                }
                return null;
            }
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        Jdk8Methods.requireNonNull(charSequence, "text");
        Jdk8Methods.requireNonNull(temporalQuery, "type");
        try {
            return (T) d(charSequence, null).p(this.d, this.e).e(temporalQuery);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw c(charSequence, e2);
        }
    }
}
