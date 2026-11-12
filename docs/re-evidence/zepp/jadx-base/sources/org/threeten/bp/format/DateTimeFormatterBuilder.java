package org.threeten.bp.format;

import com.airbnb.lottie.utils.Utils;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.material.datepicker.UtcDates;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.xiaomi.mipush.sdk.Constants;
import io.netty.util.internal.StringUtil;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.chrono.Chronology;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalQuery;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.WeekFields;
import org.threeten.bp.zone.ZoneRulesProvider;

/* JADX INFO: loaded from: classes23.dex */
public final class DateTimeFormatterBuilder {
    private static final TemporalQuery<ZoneId> h = new a();
    private static final Map<Character, TemporalField> i;
    public static final Comparator<String> j;
    private DateTimeFormatterBuilder a;
    private final DateTimeFormatterBuilder b;
    private final List<h> c;
    private final boolean d;
    private int e;
    private char f;
    private int g;

    public class a implements TemporalQuery<ZoneId> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ZoneId queryFrom(TemporalAccessor temporalAccessor) {
            ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zoneId());
            if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                return null;
            }
            return zoneId;
        }
    }

    public class b extends DateTimeTextProvider {
        public final /* synthetic */ org.threeten.bp.format.f.b b;

        public b(org.threeten.bp.format.f.b bVar) {
            this.b = bVar;
        }

        @Override // org.threeten.bp.format.DateTimeTextProvider
        public String getText(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
            return this.b.a(j, textStyle);
        }

        @Override // org.threeten.bp.format.DateTimeTextProvider
        public Iterator<Map.Entry<String, Long>> getTextIterator(TemporalField temporalField, TextStyle textStyle, Locale locale) {
            return this.b.b(textStyle);
        }
    }

    public class c implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SignStyle.values().length];
            a = iArr;
            try {
                iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SignStyle.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SignStyle.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class e implements h {
        private final char a;

        public e(char c) {
            this.a = c;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return ~i;
            }
            return !cVar.c(this.a, charSequence.charAt(i)) ? ~i : i + 1;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            if (this.a == '\'') {
                return "''";
            }
            return "'" + this.a + "'";
        }
    }

    public static final class f implements h {
        private final TextStyle a;

        public f(TextStyle textStyle) {
            this.a = textStyle;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            if (i < 0 || i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            Chronology chronology = null;
            int i2 = -1;
            for (Chronology chronology2 : Chronology.getAvailableChronologies()) {
                String id = chronology2.getId();
                int length = id.length();
                if (length > i2 && cVar.v(charSequence, i, id, 0, length)) {
                    chronology = chronology2;
                    i2 = length;
                }
            }
            if (chronology == null) {
                return ~i;
            }
            cVar.q(chronology);
            return i + i2;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Chronology chronology = (Chronology) dVar.g(TemporalQueries.chronology());
            if (chronology == null) {
                return false;
            }
            if (this.a == null) {
                sb.append(chronology.getId());
                return true;
            }
            try {
                sb.append(ResourceBundle.getBundle("org.threeten.bp.format.ChronologyText", dVar.c(), DateTimeFormatterBuilder.class.getClassLoader()).getString(chronology.getId()));
                return true;
            } catch (MissingResourceException unused) {
                sb.append(chronology.getId());
                return true;
            }
        }
    }

    public static final class g implements h {
        private final h[] a;
        private final boolean b;

        public g(List<h> list, boolean z) {
            this((h[]) list.toArray(new h[list.size()]), z);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            if (!this.b) {
                for (h hVar : this.a) {
                    i = hVar.a(cVar, charSequence, i);
                    if (i < 0) {
                        break;
                    }
                }
                return i;
            }
            cVar.u();
            int iA = i;
            for (h hVar2 : this.a) {
                iA = hVar2.a(cVar, charSequence, iA);
                if (iA < 0) {
                    cVar.g(false);
                    return i;
                }
            }
            cVar.g(true);
            return iA;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            int length = sb.length();
            if (this.b) {
                dVar.j();
            }
            try {
                for (h hVar : this.a) {
                    if (!hVar.b(dVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                return true;
            } finally {
                if (this.b) {
                    dVar.b();
                }
            }
        }

        public g c(boolean z) {
            return z == this.b ? this : new g(this.a, z);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                sb.append(this.b ? "[" : "(");
                for (h hVar : this.a) {
                    sb.append(hVar);
                }
                sb.append(this.b ? "]" : ")");
            }
            return sb.toString();
        }

        public g(h[] hVarArr, boolean z) {
            this.a = hVarArr;
            this.b = z;
        }
    }

    public interface h {
        int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i);

        boolean b(org.threeten.bp.format.d dVar, StringBuilder sb);
    }

    public static class i implements h {
        private final TemporalField a;
        private final long b;

        public i(TemporalField temporalField, long j) {
            this.a = temporalField;
            this.b = j;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            if (cVar.j(this.a) == null) {
                cVar.r(this.a, this.b, i, i);
            }
            return i;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            return true;
        }
    }

    public static final class j implements h {
        private final TemporalField a;
        private final int b;
        private final int c;
        private final boolean d;

        public j(TemporalField temporalField, int i, int i2, boolean z) {
            Jdk8Methods.requireNonNull(temporalField, "field");
            if (!temporalField.range().isFixed()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + temporalField);
            }
            if (i < 0 || i > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
            }
            if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
            }
            if (i2 >= i) {
                this.a = temporalField;
                this.b = i;
                this.c = i2;
                this.d = z;
                return;
            }
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }

        private long c(BigDecimal bigDecimal) {
            ValueRange valueRangeRange = this.a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.getMinimum());
            return bigDecimal.multiply(BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact();
        }

        private BigDecimal d(long j) {
            ValueRange valueRangeRange = this.a.range();
            valueRangeRange.checkValidValue(j, this.a);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.getMinimum());
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(j).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return bigDecimalDivide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : bigDecimalDivide.stripTrailingZeros();
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            int i2;
            int i3 = 0;
            int i4 = cVar.m() ? this.b : 0;
            int i5 = cVar.m() ? this.c : 9;
            int length = charSequence.length();
            if (i == length) {
                return i4 > 0 ? ~i : i;
            }
            if (this.d) {
                if (charSequence.charAt(i) != cVar.k().getDecimalSeparator()) {
                    return i4 > 0 ? ~i : i;
                }
                i++;
            }
            int i6 = i;
            int i7 = i4 + i6;
            if (i7 > length) {
                return ~i6;
            }
            int iMin = Math.min(i5 + i6, length);
            int i8 = i6;
            while (i8 < iMin) {
                int i9 = i8 + 1;
                int iB = cVar.k().b(charSequence.charAt(i8));
                if (iB < 0) {
                    if (i9 < i7) {
                        return ~i6;
                    }
                    i2 = i9 - 1;
                    return cVar.r(this.a, c(new BigDecimal(i3).movePointLeft(i2 - i6)), i6, i2);
                }
                i3 = (i3 * 10) + iB;
                i8 = i9;
            }
            i2 = i8;
            return cVar.r(this.a, c(new BigDecimal(i3).movePointLeft(i2 - i6)), i6, i2);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long lF = dVar.f(this.a);
            if (lF == null) {
                return false;
            }
            DecimalStyle decimalStyleD = dVar.d();
            BigDecimal bigDecimalD = d(lF.longValue());
            if (bigDecimalD.scale() != 0) {
                String strA = decimalStyleD.a(bigDecimalD.setScale(Math.min(Math.max(bigDecimalD.scale(), this.b), this.c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.d) {
                    sb.append(decimalStyleD.getDecimalSeparator());
                }
                sb.append(strA);
                return true;
            }
            if (this.b <= 0) {
                return true;
            }
            if (this.d) {
                sb.append(decimalStyleD.getDecimalSeparator());
            }
            for (int i = 0; i < this.b; i++) {
                sb.append(decimalStyleD.getZeroDigit());
            }
            return true;
        }

        public String toString() {
            return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.d ? ",DecimalPoint" : "") + ")";
        }
    }

    public static final class k implements h {
        private static final long b = 315569520000L;
        private static final long c = 62167219200L;
        private final int a;

        public k(int i) {
            this.a = i;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            org.threeten.bp.format.c cVarE = cVar.e();
            int i5 = this.a;
            int i6 = i5 < 0 ? 0 : i5;
            if (i5 < 0) {
                i5 = 9;
            }
            DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE).appendLiteral('T');
            ChronoField chronoField = ChronoField.HOUR_OF_DAY;
            DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField, 2).appendLiteral(JsonLexerKt.COLON);
            ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
            DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField2, 2).appendLiteral(JsonLexerKt.COLON);
            ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
            DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField3, 2);
            ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
            int iA = dateTimeFormatterBuilderAppendValue.appendFraction(chronoField4, i6, i5, true).appendLiteral('Z').toFormatter().f(false).a(cVarE, charSequence, i);
            if (iA < 0) {
                return iA;
            }
            long jLongValue = cVarE.j(ChronoField.YEAR).longValue();
            int iIntValue = cVarE.j(ChronoField.MONTH_OF_YEAR).intValue();
            int iIntValue2 = cVarE.j(ChronoField.DAY_OF_MONTH).intValue();
            int iIntValue3 = cVarE.j(chronoField).intValue();
            int iIntValue4 = cVarE.j(chronoField2).intValue();
            Long lJ = cVarE.j(chronoField3);
            Long lJ2 = cVarE.j(chronoField4);
            int iIntValue5 = lJ != null ? lJ.intValue() : 0;
            int iIntValue6 = lJ2 != null ? lJ2.intValue() : 0;
            int i7 = ((int) jLongValue) % 10000;
            if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
                i3 = iIntValue5;
                i4 = 1;
                i2 = 0;
            } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                cVar.s();
                i2 = iIntValue3;
                i4 = 0;
                i3 = 59;
            } else {
                i2 = iIntValue3;
                i3 = iIntValue5;
                i4 = 0;
            }
            try {
                return cVar.r(chronoField4, iIntValue6, i, cVar.r(ChronoField.INSTANT_SECONDS, Jdk8Methods.safeMultiply(jLongValue / 10000, b) + LocalDateTime.of(i7, iIntValue, iIntValue2, i2, iIntValue4, i3, 0).plusDays(i4).toEpochSecond(ZoneOffset.UTC), i, iA));
            } catch (RuntimeException unused) {
                return ~i;
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long lF = dVar.f(ChronoField.INSTANT_SECONDS);
            TemporalAccessor temporalAccessorE = dVar.e();
            ChronoField chronoField = ChronoField.NANO_OF_SECOND;
            Long lValueOf = temporalAccessorE.isSupported(chronoField) ? Long.valueOf(dVar.e().getLong(chronoField)) : 0L;
            int i = 0;
            if (lF == null) {
                return false;
            }
            long jLongValue = lF.longValue();
            int iCheckValidIntValue = chronoField.checkValidIntValue(lValueOf.longValue());
            if (jLongValue >= -62167219200L) {
                long j = (jLongValue - b) + c;
                long jFloorDiv = Jdk8Methods.floorDiv(j, b) + 1;
                LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(Jdk8Methods.floorMod(j, b) - c, 0, ZoneOffset.UTC);
                if (jFloorDiv > 0) {
                    sb.append('+');
                    sb.append(jFloorDiv);
                }
                sb.append(localDateTimeOfEpochSecond);
                if (localDateTimeOfEpochSecond.getSecond() == 0) {
                    sb.append(":00");
                }
            } else {
                long j2 = jLongValue + c;
                long j3 = j2 / b;
                long j4 = j2 % b;
                LocalDateTime localDateTimeOfEpochSecond2 = LocalDateTime.ofEpochSecond(j4 - c, 0, ZoneOffset.UTC);
                int length = sb.length();
                sb.append(localDateTimeOfEpochSecond2);
                if (localDateTimeOfEpochSecond2.getSecond() == 0) {
                    sb.append(":00");
                }
                if (j3 < 0) {
                    if (localDateTimeOfEpochSecond2.getYear() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb.insert(length, j3);
                    } else {
                        sb.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i2 = this.a;
            if (i2 == -2) {
                if (iCheckValidIntValue != 0) {
                    sb.append('.');
                    if (iCheckValidIntValue % 1000000 == 0) {
                        sb.append(Integer.toString((iCheckValidIntValue / 1000000) + 1000).substring(1));
                    } else if (iCheckValidIntValue % 1000 == 0) {
                        sb.append(Integer.toString((iCheckValidIntValue / 1000) + 1000000).substring(1));
                    } else {
                        sb.append(Integer.toString(iCheckValidIntValue + Utils.SECOND_IN_NANOS).substring(1));
                    }
                }
            } else if (i2 > 0 || (i2 == -1 && iCheckValidIntValue > 0)) {
                sb.append('.');
                int i3 = 100000000;
                while (true) {
                    int i4 = this.a;
                    if ((i4 != -1 || iCheckValidIntValue <= 0) && i >= i4) {
                        break;
                    }
                    int i5 = iCheckValidIntValue / i3;
                    sb.append((char) (i5 + 48));
                    iCheckValidIntValue -= i5 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    public static final class l implements h {
        private final TextStyle a;

        public l(TextStyle textStyle) {
            this.a = textStyle;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            char cCharAt;
            if (!cVar.v(charSequence, i, "GMT", 0, 3)) {
                return ~i;
            }
            int i2 = i + 3;
            if (this.a == TextStyle.FULL) {
                return new o("", "+HH:MM:ss").a(cVar, charSequence, i2);
            }
            int length = charSequence.length();
            if (i2 == length) {
                return cVar.r(ChronoField.OFFSET_SECONDS, 0L, i2, i2);
            }
            char cCharAt2 = charSequence.charAt(i2);
            if (cCharAt2 != '+' && cCharAt2 != '-') {
                return cVar.r(ChronoField.OFFSET_SECONDS, 0L, i2, i2);
            }
            int i3 = cCharAt2 == '-' ? -1 : 1;
            if (i2 == length) {
                return ~i2;
            }
            int i4 = i2 + 1;
            char cCharAt3 = charSequence.charAt(i4);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i4;
            }
            int i5 = i4 + 1;
            int i6 = cCharAt3 - '0';
            if (i5 != length && (cCharAt = charSequence.charAt(i5)) >= '0' && cCharAt <= '9') {
                i6 = (i6 * 10) + (cCharAt - '0');
                if (i6 > 23) {
                    return ~i5;
                }
                i5++;
            }
            int i7 = i5;
            if (i7 == length || charSequence.charAt(i7) != ':') {
                return cVar.r(ChronoField.OFFSET_SECONDS, i3 * 3600 * i6, i7, i7);
            }
            int i8 = i7 + 1;
            int i9 = length - 2;
            if (i8 > i9) {
                return ~i8;
            }
            char cCharAt4 = charSequence.charAt(i8);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                return ~i8;
            }
            int i10 = i8 + 1;
            int i11 = cCharAt4 - '0';
            char cCharAt5 = charSequence.charAt(i10);
            if (cCharAt5 < '0' || cCharAt5 > '9') {
                return ~i10;
            }
            int i12 = i10 + 1;
            int i13 = (i11 * 10) + (cCharAt5 - '0');
            if (i13 > 59) {
                return ~i12;
            }
            if (i12 == length || charSequence.charAt(i12) != ':') {
                return cVar.r(ChronoField.OFFSET_SECONDS, i3 * ((i6 * 3600) + (i13 * 60)), i12, i12);
            }
            int i14 = i12 + 1;
            if (i14 > i9) {
                return ~i14;
            }
            char cCharAt6 = charSequence.charAt(i14);
            if (cCharAt6 < '0' || cCharAt6 > '9') {
                return ~i14;
            }
            int i15 = i14 + 1;
            int i16 = cCharAt6 - '0';
            char cCharAt7 = charSequence.charAt(i15);
            if (cCharAt7 < '0' || cCharAt7 > '9') {
                return ~i15;
            }
            int i17 = i15 + 1;
            int i18 = (i16 * 10) + (cCharAt7 - '0');
            return i18 > 59 ? ~i17 : cVar.r(ChronoField.OFFSET_SECONDS, i3 * ((i6 * 3600) + (i13 * 60) + i18), i17, i17);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long lF = dVar.f(ChronoField.OFFSET_SECONDS);
            if (lF == null) {
                return false;
            }
            sb.append("GMT");
            if (this.a == TextStyle.FULL) {
                return new o("", "+HH:MM:ss").b(dVar, sb);
            }
            int iSafeToInt = Jdk8Methods.safeToInt(lF.longValue());
            if (iSafeToInt == 0) {
                return true;
            }
            int iAbs = Math.abs((iSafeToInt / 3600) % 100);
            int iAbs2 = Math.abs((iSafeToInt / 60) % 60);
            int iAbs3 = Math.abs(iSafeToInt % 60);
            sb.append(iSafeToInt < 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+");
            sb.append(iAbs);
            if (iAbs2 <= 0 && iAbs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((iAbs2 / 10) + 48));
            sb.append((char) ((iAbs2 % 10) + 48));
            if (iAbs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((iAbs3 / 10) + 48));
            sb.append((char) ((iAbs3 % 10) + 48));
            return true;
        }
    }

    public static final class m implements h {
        private final FormatStyle a;
        private final FormatStyle b;

        public m(FormatStyle formatStyle, FormatStyle formatStyle2) {
            this.a = formatStyle;
            this.b = formatStyle2;
        }

        private DateTimeFormatter c(Locale locale, Chronology chronology) {
            return org.threeten.bp.format.b.c().b(this.a, this.b, chronology, locale);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            return c(cVar.i(), cVar.h()).f(false).a(cVar, charSequence, i);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            return c(dVar.c(), Chronology.from(dVar.e())).f(false).b(dVar, sb);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Localized(");
            Object obj = this.a;
            if (obj == null) {
                obj = "";
            }
            sb.append(obj);
            sb.append(",");
            FormatStyle formatStyle = this.b;
            sb.append(formatStyle != null ? formatStyle : "");
            sb.append(")");
            return sb.toString();
        }
    }

    public static class n implements h {
        public static final int[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Utils.SECOND_IN_NANOS};
        public final TemporalField a;
        public final int b;
        public final int c;
        public final SignStyle d;
        public final int e;

        public /* synthetic */ n(TemporalField temporalField, int i, int i2, SignStyle signStyle, int i3, a aVar) {
            this(temporalField, i, i2, signStyle, i3);
        }

        /* JADX WARN: Code duplicated, block: B:111:0x015d  */
        /* JADX WARN: Code duplicated, block: B:113:0x0165  */
        /* JADX WARN: Code duplicated, block: B:116:0x017b  */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            int i2;
            boolean z;
            boolean z2;
            BigInteger bigIntegerDivide;
            int i3;
            long j;
            long j2;
            int length = charSequence.length();
            if (i == length) {
                return ~i;
            }
            char cCharAt = charSequence.charAt(i);
            int i4 = 0;
            if (cCharAt == cVar.k().getPositiveSign()) {
                if (!this.d.a(true, cVar.m(), this.b == this.c)) {
                    return ~i;
                }
                i2 = i + 1;
                z = false;
                z2 = true;
            } else {
                if (cCharAt == cVar.k().getNegativeSign()) {
                    if (!this.d.a(false, cVar.m(), this.b == this.c)) {
                        return ~i;
                    }
                    i2 = i + 1;
                    z = true;
                } else {
                    if (this.d == SignStyle.ALWAYS && cVar.m()) {
                        return ~i;
                    }
                    i2 = i;
                    z = false;
                }
                z2 = false;
            }
            int i5 = (cVar.m() || d(cVar)) ? this.b : 1;
            int i6 = i2 + i5;
            if (i6 > length) {
                return ~i2;
            }
            int iMax = ((cVar.m() || d(cVar)) ? this.c : 9) + Math.max(this.e, 0);
            while (true) {
                bigIntegerDivide = null;
                if (i4 >= 2) {
                    i3 = i2;
                    j = 0;
                    break;
                }
                int iMin = Math.min(iMax + i2, length);
                int i7 = i2;
                j = 0;
                while (i7 < iMin) {
                    int i8 = i7 + 1;
                    int iB = cVar.k().b(charSequence.charAt(i7));
                    if (iB < 0) {
                        i7 = i8 - 1;
                        if (i7 >= i6) {
                            break;
                        }
                        return ~i2;
                    }
                    if (i8 - i2 > 18) {
                        if (bigIntegerDivide == null) {
                            bigIntegerDivide = BigInteger.valueOf(j);
                        }
                        bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.TEN).add(BigInteger.valueOf(iB));
                    } else {
                        j = (j * 10) + ((long) iB);
                    }
                    iMin = iMin;
                    i6 = i6;
                    i7 = i8;
                }
                int i9 = i6;
                int i10 = this.e;
                if (i10 <= 0 || i4 != 0) {
                    i3 = i7;
                    break;
                }
                iMax = Math.max(i5, (i7 - i2) - i10);
                i4++;
                i6 = i9;
            }
            if (z) {
                if (bigIntegerDivide != null) {
                    if (bigIntegerDivide.equals(BigInteger.ZERO) && cVar.m()) {
                        return ~(i2 - 1);
                    }
                    bigIntegerDivide = bigIntegerDivide.negate();
                } else {
                    if (j == 0 && cVar.m()) {
                        return ~(i2 - 1);
                    }
                    j2 = -j;
                }
                if (bigIntegerDivide != null) {
                    return e(cVar, j2, i2, i3);
                }
                if (bigIntegerDivide.bitLength() > 63) {
                    bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                    i3--;
                }
                return e(cVar, bigIntegerDivide.longValue(), i2, i3);
            }
            if (this.d == SignStyle.EXCEEDS_PAD && cVar.m()) {
                int i11 = i3 - i2;
                if (z2) {
                    if (i11 <= this.b) {
                        return ~(i2 - 1);
                    }
                } else if (i11 > this.b) {
                    return ~i2;
                }
            }
            j2 = j;
            if (bigIntegerDivide != null) {
                return e(cVar, j2, i2, i3);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i3--;
            }
            return e(cVar, bigIntegerDivide.longValue(), i2, i3);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long lF = dVar.f(this.a);
            if (lF == null) {
                return false;
            }
            long jC = c(dVar, lF.longValue());
            DecimalStyle decimalStyleD = dVar.d();
            String string = jC == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jC));
            if (string.length() > this.c) {
                throw new DateTimeException("Field " + this.a + " cannot be printed as the value " + jC + " exceeds the maximum print width of " + this.c);
            }
            String strA = decimalStyleD.a(string);
            if (jC >= 0) {
                int i = d.a[this.d.ordinal()];
                if (i == 1) {
                    int i2 = this.b;
                    if (i2 < 19 && jC >= f[i2]) {
                        sb.append(decimalStyleD.getPositiveSign());
                    }
                } else if (i == 2) {
                    sb.append(decimalStyleD.getPositiveSign());
                }
            } else {
                int i3 = d.a[this.d.ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    sb.append(decimalStyleD.getNegativeSign());
                } else if (i3 == 4) {
                    throw new DateTimeException("Field " + this.a + " cannot be printed as the value " + jC + " cannot be negative according to the SignStyle");
                }
            }
            for (int i4 = 0; i4 < this.b - strA.length(); i4++) {
                sb.append(decimalStyleD.getZeroDigit());
            }
            sb.append(strA);
            return true;
        }

        public long c(org.threeten.bp.format.d dVar, long j) {
            return j;
        }

        public boolean d(org.threeten.bp.format.c cVar) {
            int i = this.e;
            return i == -1 || (i > 0 && this.b == this.c && this.d == SignStyle.NOT_NEGATIVE);
        }

        public int e(org.threeten.bp.format.c cVar, long j, int i, int i2) {
            return cVar.r(this.a, j, i, i2);
        }

        public n f() {
            return this.e == -1 ? this : new n(this.a, this.b, this.c, this.d, -1);
        }

        public n g(int i) {
            return new n(this.a, this.b, this.c, this.d, this.e + i);
        }

        public String toString() {
            int i = this.b;
            if (i == 1 && this.c == 19 && this.d == SignStyle.NORMAL) {
                return "Value(" + this.a + ")";
            }
            if (i == this.c && this.d == SignStyle.NOT_NEGATIVE) {
                return "Value(" + this.a + "," + this.b + ")";
            }
            return "Value(" + this.a + "," + this.b + "," + this.c + "," + this.d + ")";
        }

        public n(TemporalField temporalField, int i, int i2, SignStyle signStyle) {
            this.a = temporalField;
            this.b = i;
            this.c = i2;
            this.d = signStyle;
            this.e = 0;
        }

        private n(TemporalField temporalField, int i, int i2, SignStyle signStyle, int i3) {
            this.a = temporalField;
            this.b = i;
            this.c = i2;
            this.d = signStyle;
            this.e = i3;
        }
    }

    public static final class o implements h {
        public static final String[] c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        public static final o d = new o("Z", "+HH:MM:ss");
        public static final o e = new o("0", "+HH:MM:ss");
        private final String a;
        private final int b;

        public o(String str, String str2) {
            Jdk8Methods.requireNonNull(str, "noOffsetText");
            Jdk8Methods.requireNonNull(str2, "pattern");
            this.a = str;
            this.b = c(str2);
        }

        private int c(String str) {
            int i = 0;
            while (true) {
                String[] strArr = c;
                if (i >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                }
                if (strArr[i].equals(str)) {
                    return i;
                }
                i++;
            }
        }

        private boolean d(int[] iArr, int i, CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.b;
            if ((i3 + 3) / 2 < i) {
                return false;
            }
            int i4 = iArr[0];
            if (i3 % 2 == 0 && i > 1) {
                int i5 = i4 + 1;
                if (i5 > charSequence.length() || charSequence.charAt(i4) != ':') {
                    return z;
                }
                i4 = i5;
            }
            if (i4 + 2 > charSequence.length()) {
                return z;
            }
            int i6 = i4 + 1;
            char cCharAt = charSequence.charAt(i4);
            int i7 = i6 + 1;
            char cCharAt2 = charSequence.charAt(i6);
            if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9' || (i2 = ((cCharAt - '0') * 10) + (cCharAt2 - '0')) < 0 || i2 > 59) {
                return z;
            }
            iArr[i] = i2;
            iArr[0] = i7;
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x007d  */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            boolean z;
            int length = charSequence.length();
            int length2 = this.a.length();
            if (length2 == 0) {
                if (i == length) {
                    return cVar.r(ChronoField.OFFSET_SECONDS, 0L, i, i);
                }
            } else {
                if (i == length) {
                    return ~i;
                }
                if (cVar.v(charSequence, i, this.a, 0, length2)) {
                    return cVar.r(ChronoField.OFFSET_SECONDS, 0L, i, i + length2);
                }
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                int i2 = cCharAt == '-' ? -1 : 1;
                int[] iArr = new int[4];
                iArr[0] = i + 1;
                if (d(iArr, 1, charSequence, true)) {
                    z = true;
                } else {
                    if (d(iArr, 2, charSequence, this.b >= 3) || d(iArr, 3, charSequence, false)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    return cVar.r(ChronoField.OFFSET_SECONDS, ((long) i2) * ((((long) iArr[1]) * TimeUtils.TIME_1_HOURS) + (((long) iArr[2]) * 60) + ((long) iArr[3])), i, iArr[0]);
                }
            }
            return length2 == 0 ? cVar.r(ChronoField.OFFSET_SECONDS, 0L, i, i + length2) : ~i;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long lF = dVar.f(ChronoField.OFFSET_SECONDS);
            if (lF == null) {
                return false;
            }
            int iSafeToInt = Jdk8Methods.safeToInt(lF.longValue());
            if (iSafeToInt == 0) {
                sb.append(this.a);
            } else {
                int iAbs = Math.abs((iSafeToInt / 3600) % 100);
                int iAbs2 = Math.abs((iSafeToInt / 60) % 60);
                int iAbs3 = Math.abs(iSafeToInt % 60);
                int length = sb.length();
                sb.append(iSafeToInt < 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+");
                sb.append((char) ((iAbs / 10) + 48));
                sb.append((char) ((iAbs % 10) + 48));
                int i = this.b;
                if (i >= 3 || (i >= 1 && iAbs2 > 0)) {
                    sb.append(i % 2 == 0 ? ":" : "");
                    sb.append((char) ((iAbs2 / 10) + 48));
                    sb.append((char) ((iAbs2 % 10) + 48));
                    iAbs += iAbs2;
                    int i2 = this.b;
                    if (i2 >= 7 || (i2 >= 5 && iAbs3 > 0)) {
                        sb.append(i2 % 2 != 0 ? "" : ":");
                        sb.append((char) ((iAbs3 / 10) + 48));
                        sb.append((char) ((iAbs3 % 10) + 48));
                        iAbs += iAbs3;
                    }
                }
                if (iAbs == 0) {
                    sb.setLength(length);
                    sb.append(this.a);
                }
            }
            return true;
        }

        public String toString() {
            return "Offset(" + c[this.b] + ",'" + this.a.replace("'", "''") + "')";
        }
    }

    public static final class p implements h {
        private final h a;
        private final int b;
        private final char c;

        public p(h hVar, int i, char c) {
            this.a = hVar;
            this.b = i;
            this.c = c;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            boolean zM = cVar.m();
            boolean zL = cVar.l();
            if (i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            if (i == charSequence.length()) {
                return ~i;
            }
            int length = this.b + i;
            if (length > charSequence.length()) {
                if (zM) {
                    return ~i;
                }
                length = charSequence.length();
            }
            int i2 = i;
            while (i2 < length) {
                if (!zL) {
                    if (!cVar.c(charSequence.charAt(i2), this.c)) {
                        break;
                    }
                    i2++;
                } else {
                    if (charSequence.charAt(i2) != this.c) {
                        break;
                    }
                    i2++;
                }
            }
            int iA = this.a.a(cVar, charSequence.subSequence(0, length), i2);
            return (iA == length || !zM) ? iA : ~(i + i2);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.a.b(dVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.b) {
                for (int i = 0; i < this.b - length2; i++) {
                    sb.insert(length, this.c);
                }
                return true;
            }
            throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.b);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b);
            if (this.c == ' ') {
                str = ")";
            } else {
                str = ",'" + this.c + "')";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public enum r implements h {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                cVar.n(true);
            } else if (iOrdinal == 1) {
                cVar.n(false);
            } else if (iOrdinal == 2) {
                cVar.t(true);
            } else if (iOrdinal == 3) {
                cVar.t(false);
            }
            return i;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (iOrdinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (iOrdinal == 2) {
                return "ParseStrict(true)";
            }
            if (iOrdinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    public static final class s implements h {
        private final String a;

        public s(String str) {
            this.a = str;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            if (i > charSequence.length() || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.a;
            return !cVar.v(charSequence, i, str, 0, str.length()) ? ~i : i + this.a.length();
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            return "'" + this.a.replace("'", "''") + "'";
        }
    }

    public static final class t implements h {
        private final TemporalField a;
        private final TextStyle b;
        private final DateTimeTextProvider c;
        private volatile n d;

        public t(TemporalField temporalField, TextStyle textStyle, DateTimeTextProvider dateTimeTextProvider) {
            this.a = temporalField;
            this.b = textStyle;
            this.c = dateTimeTextProvider;
        }

        private n c() {
            if (this.d == null) {
                this.d = new n(this.a, 1, 19, SignStyle.NORMAL);
            }
            return this.d;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> textIterator = this.c.getTextIterator(this.a, cVar.m() ? this.b : null, cVar.i());
            if (textIterator != null) {
                while (textIterator.hasNext()) {
                    Map.Entry<String, Long> next = textIterator.next();
                    String key = next.getKey();
                    if (cVar.v(key, 0, charSequence, i, key.length())) {
                        return cVar.r(this.a, next.getValue().longValue(), i, i + key.length());
                    }
                }
                if (cVar.m()) {
                    return ~i;
                }
            }
            return c().a(cVar, charSequence, i);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            Long lF = dVar.f(this.a);
            if (lF == null) {
                return false;
            }
            String text = this.c.getText(this.a, lF.longValue(), this.b, dVar.c());
            if (text == null) {
                return c().b(dVar, sb);
            }
            sb.append(text);
            return true;
        }

        public String toString() {
            if (this.b == TextStyle.FULL) {
                return "Text(" + this.a + ")";
            }
            return "Text(" + this.a + "," + this.b + ")";
        }
    }

    public static final class u implements h {
        private final char a;
        private final int b;

        public u(char c, int i) {
            this.a = c;
            this.b = i;
        }

        private h c(WeekFields weekFields) {
            char c = this.a;
            if (c == 'W') {
                return new n(weekFields.weekOfMonth(), 1, 2, SignStyle.NOT_NEGATIVE);
            }
            if (c == 'Y') {
                if (this.b == 2) {
                    return new q(weekFields.weekBasedYear(), 2, 2, 0, q.i);
                }
                TemporalField temporalFieldWeekBasedYear = weekFields.weekBasedYear();
                int i = this.b;
                return new n(temporalFieldWeekBasedYear, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, -1, null);
            }
            if (c == 'c') {
                return new n(weekFields.dayOfWeek(), this.b, 2, SignStyle.NOT_NEGATIVE);
            }
            if (c == 'e') {
                return new n(weekFields.dayOfWeek(), this.b, 2, SignStyle.NOT_NEGATIVE);
            }
            if (c != 'w') {
                return null;
            }
            return new n(weekFields.weekOfWeekBasedYear(), this.b, 2, SignStyle.NOT_NEGATIVE);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            return c(WeekFields.of(cVar.i())).a(cVar, charSequence, i);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            return c(WeekFields.of(dVar.c())).b(dVar, sb);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.a;
            if (c == 'Y') {
                int i = this.b;
                if (i == 1) {
                    sb.append("WeekBasedYear");
                } else if (i == 2) {
                    sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.b);
                    sb.append(",");
                    sb.append(19);
                    sb.append(",");
                    sb.append(this.b < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
                }
            } else {
                if (c == 'c' || c == 'e') {
                    sb.append("DayOfWeek");
                } else if (c == 'w') {
                    sb.append("WeekOfWeekBasedYear");
                } else if (c == 'W') {
                    sb.append("WeekOfMonth");
                }
                sb.append(",");
                sb.append(this.b);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class v implements h {
        private static volatile Map.Entry<Integer, a> c;
        private final TemporalQuery<ZoneId> a;
        private final String b;

        public static final class a {
            public final int a;
            private final Map<CharSequence, a> b;
            private final Map<String, a> c;

            public /* synthetic */ a(int i, a aVar) {
                this(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c(String str) {
                int length = str.length();
                int i = this.a;
                if (length == i) {
                    this.b.put(str, null);
                    this.c.put(str.toLowerCase(Locale.ENGLISH), null);
                } else if (length > i) {
                    String strSubstring = str.substring(0, i);
                    a aVar = this.b.get(strSubstring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.b.put(strSubstring, aVar);
                        this.c.put(strSubstring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.c(str);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public a d(CharSequence charSequence, boolean z) {
                return z ? this.b.get(charSequence) : this.c.get(charSequence.toString().toLowerCase(Locale.ENGLISH));
            }

            private a(int i) {
                this.b = new HashMap();
                this.c = new HashMap();
                this.a = i;
            }
        }

        public v(TemporalQuery<ZoneId> temporalQuery, String str) {
            this.a = temporalQuery;
            this.b = str;
        }

        private ZoneId c(Set<String> set, String str, boolean z) {
            if (str == null) {
                return null;
            }
            if (z) {
                if (set.contains(str)) {
                    return ZoneId.of(str);
                }
                return null;
            }
            for (String str2 : set) {
                if (str2.equalsIgnoreCase(str)) {
                    return ZoneId.of(str2);
                }
            }
            return null;
        }

        private int d(org.threeten.bp.format.c cVar, CharSequence charSequence, int i, int i2) {
            String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
            org.threeten.bp.format.c cVarE = cVar.e();
            if (i2 < charSequence.length() && cVar.c(charSequence.charAt(i2), 'Z')) {
                cVar.p(ZoneId.ofOffset(upperCase, ZoneOffset.UTC));
                return i2;
            }
            int iA = o.d.a(cVarE, charSequence, i2);
            if (iA < 0) {
                cVar.p(ZoneId.ofOffset(upperCase, ZoneOffset.UTC));
                return i2;
            }
            cVar.p(ZoneId.ofOffset(upperCase, ZoneOffset.ofTotalSeconds((int) cVarE.j(ChronoField.OFFSET_SECONDS).longValue())));
            return iA;
        }

        private static a e(Set<String> set) {
            ArrayList arrayList = new ArrayList(set);
            Collections.sort(arrayList, DateTimeFormatterBuilder.j);
            a aVar = new a(((String) arrayList.get(0)).length(), null);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                aVar.c((String) it2.next());
            }
            return aVar;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            int i2;
            int length = charSequence.length();
            if (i > length) {
                throw new IndexOutOfBoundsException();
            }
            if (i == length) {
                return ~i;
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                org.threeten.bp.format.c cVarE = cVar.e();
                int iA = o.d.a(cVarE, charSequence, i);
                if (iA < 0) {
                    return iA;
                }
                cVar.p(ZoneOffset.ofTotalSeconds((int) cVarE.j(ChronoField.OFFSET_SECONDS).longValue()));
                return iA;
            }
            int i3 = i + 2;
            if (length >= i3) {
                char cCharAt2 = charSequence.charAt(i + 1);
                if (cVar.c(cCharAt, 'U') && cVar.c(cCharAt2, 'T')) {
                    int i4 = i + 3;
                    return (length < i4 || !cVar.c(charSequence.charAt(i3), 'C')) ? d(cVar, charSequence, i, i3) : d(cVar, charSequence, i, i4);
                }
                if (cVar.c(cCharAt, 'G') && length >= (i2 = i + 3) && cVar.c(cCharAt2, 'M') && cVar.c(charSequence.charAt(i3), 'T')) {
                    return d(cVar, charSequence, i, i2);
                }
            }
            Set<String> availableZoneIds = ZoneRulesProvider.getAvailableZoneIds();
            int size = availableZoneIds.size();
            Map.Entry<Integer, a> simpleImmutableEntry = c;
            if (simpleImmutableEntry == null || simpleImmutableEntry.getKey().intValue() != size) {
                synchronized (this) {
                    simpleImmutableEntry = c;
                    if (simpleImmutableEntry == null || simpleImmutableEntry.getKey().intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), e(availableZoneIds));
                        c = simpleImmutableEntry;
                    }
                }
            }
            a value = simpleImmutableEntry.getValue();
            String str = null;
            String str2 = null;
            while (value != null) {
                int i5 = value.a + i;
                if (i5 > length) {
                    break;
                }
                String string = charSequence.subSequence(i, i5).toString();
                value = value.d(string, cVar.l());
                str2 = str;
                str = string;
            }
            ZoneId zoneIdC = c(availableZoneIds, str, cVar.l());
            if (zoneIdC == null) {
                zoneIdC = c(availableZoneIds, str2, cVar.l());
                if (zoneIdC == null) {
                    if (!cVar.c(cCharAt, 'Z')) {
                        return ~i;
                    }
                    cVar.p(ZoneOffset.UTC);
                    return i + 1;
                }
                str = str2;
            }
            cVar.p(zoneIdC);
            return i + str.length();
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            ZoneId zoneId = (ZoneId) dVar.g(this.a);
            if (zoneId == null) {
                return false;
            }
            sb.append(zoneId.getId());
            return true;
        }

        public String toString() {
            return this.b;
        }
    }

    public static final class w implements h {
        private static final Comparator<String> b = new a();
        private final TextStyle a;

        public class a implements Comparator<String> {
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                int length = str2.length() - str.length();
                return length == 0 ? str.compareTo(str2) : length;
            }
        }

        public w(TextStyle textStyle) {
            this.a = (TextStyle) Jdk8Methods.requireNonNull(textStyle, "textStyle");
        }

        private int c(org.threeten.bp.format.c cVar, CharSequence charSequence, int i, String str) {
            int length = str.length();
            int i2 = i + length;
            if (i2 >= charSequence.length()) {
                cVar.p(ZoneId.of(str));
                return i2;
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt != '+' && cCharAt != '-') {
                cVar.p(ZoneId.of(str));
                return i2;
            }
            org.threeten.bp.format.c cVarE = cVar.e();
            try {
                int iA = o.e.a(cVarE, charSequence, i2);
                if (iA < 0) {
                    cVar.p(ZoneId.of(str));
                    return i2;
                }
                ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds((int) cVarE.j(ChronoField.OFFSET_SECONDS).longValue());
                cVar.p(length == 0 ? zoneOffsetOfTotalSeconds : ZoneId.ofOffset(str, zoneOffsetOfTotalSeconds));
                return iA;
            } catch (DateTimeException unused) {
                return ~i;
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public int a(org.threeten.bp.format.c cVar, CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i > length) {
                throw new IndexOutOfBoundsException();
            }
            if (i == length) {
                return ~i;
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                return i + 6 > length ? ~i : c(cVar, charSequence, i, "");
            }
            if (cVar.v(charSequence, i, "GMT", 0, 3)) {
                return c(cVar, charSequence, i, "GMT");
            }
            if (cVar.v(charSequence, i, UtcDates.UTC, 0, 3)) {
                return c(cVar, charSequence, i, UtcDates.UTC);
            }
            if (cVar.v(charSequence, i, "UT", 0, 2)) {
                return c(cVar, charSequence, i, "UT");
            }
            TreeMap treeMap = new TreeMap(b);
            for (String str : ZoneId.getAvailableZoneIds()) {
                treeMap.put(str, str);
                TimeZone timeZone = TimeZone.getTimeZone(str);
                int i2 = this.a.asNormal() == TextStyle.FULL ? 1 : 0;
                String displayName = timeZone.getDisplayName(false, i2, cVar.i());
                if (str.startsWith("Etc/") || (!displayName.startsWith("GMT+") && !displayName.startsWith("GMT+"))) {
                    treeMap.put(displayName, str);
                }
                String displayName2 = timeZone.getDisplayName(true, i2, cVar.i());
                if (str.startsWith("Etc/") || (!displayName2.startsWith("GMT+") && !displayName2.startsWith("GMT+"))) {
                    treeMap.put(displayName2, str);
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                String str2 = (String) entry.getKey();
                if (cVar.v(charSequence, i, str2, 0, str2.length())) {
                    cVar.p(ZoneId.of((String) entry.getValue()));
                    return i + str2.length();
                }
            }
            if (cCharAt != 'Z') {
                return ~i;
            }
            cVar.p(ZoneOffset.UTC);
            return i + 1;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.h
        public boolean b(org.threeten.bp.format.d dVar, StringBuilder sb) {
            boolean zIsDaylightSavings;
            ZoneId zoneId = (ZoneId) dVar.g(TemporalQueries.zoneId());
            if (zoneId == null) {
                return false;
            }
            if (zoneId.normalized() instanceof ZoneOffset) {
                sb.append(zoneId.getId());
                return true;
            }
            TemporalAccessor temporalAccessorE = dVar.e();
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (temporalAccessorE.isSupported(chronoField)) {
                zIsDaylightSavings = zoneId.getRules().isDaylightSavings(Instant.ofEpochSecond(temporalAccessorE.getLong(chronoField)));
            } else {
                zIsDaylightSavings = false;
            }
            sb.append(TimeZone.getTimeZone(zoneId.getId()).getDisplayName(zIsDaylightSavings, this.a.asNormal() == TextStyle.FULL ? 1 : 0, dVar.c()));
            return true;
        }

        public String toString() {
            return "ZoneText(" + this.a + ")";
        }
    }

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put(Character.valueOf(JsonLexerKt.UNICODE_ESC), ChronoField.YEAR);
        TemporalField temporalField = IsoFields.QUARTER_OF_YEAR;
        map.put('Q', temporalField);
        map.put('q', temporalField);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        j = new c();
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    private int a(h hVar) {
        Jdk8Methods.requireNonNull(hVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            if (hVar != null) {
                hVar = new p(hVar, i2, dateTimeFormatterBuilder.f);
            }
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
            dateTimeFormatterBuilder2.e = 0;
            dateTimeFormatterBuilder2.f = (char) 0;
        }
        this.a.c.add(hVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = this.a;
        dateTimeFormatterBuilder3.g = -1;
        return dateTimeFormatterBuilder3.c.size() - 1;
    }

    private DateTimeFormatterBuilder b(n nVar) {
        n nVarF;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 < 0 || !(dateTimeFormatterBuilder.c.get(i2) instanceof n)) {
            this.a.g = a(nVar);
        } else {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
            int i3 = dateTimeFormatterBuilder2.g;
            n nVar2 = (n) dateTimeFormatterBuilder2.c.get(i3);
            int i4 = nVar.b;
            int i5 = nVar.c;
            if (i4 == i5 && nVar.d == SignStyle.NOT_NEGATIVE) {
                nVarF = nVar2.g(i5);
                a(nVar.f());
                this.a.g = i3;
            } else {
                nVarF = nVar2.f();
                this.a.g = a(nVar);
            }
            this.a.c.set(i3, nVarF);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b5  */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x01b5, please report this as an issue */
    private void c(char c2, int i2, TemporalField temporalField) {
        if (c2 != 'Q') {
            if (c2 == 'S') {
                appendFraction(ChronoField.NANO_OF_SECOND, i2, i2, false);
                return;
            }
            if (c2 == 'a') {
                if (i2 == 1) {
                    appendText(temporalField, TextStyle.SHORT);
                    return;
                }
                throw new IllegalArgumentException("Too many pattern letters: " + c2);
            }
            if (c2 != 'h' && c2 != 'k' && c2 != 'm') {
                if (c2 != 'q') {
                    if (c2 != 's') {
                        if (c2 == 'u' || c2 == 'y') {
                            if (i2 == 2) {
                                appendValueReduced(temporalField, 2, 2, q.i);
                                return;
                            } else if (i2 < 4) {
                                appendValue(temporalField, i2, 19, SignStyle.NORMAL);
                                return;
                            } else {
                                appendValue(temporalField, i2, 19, SignStyle.EXCEEDS_PAD);
                                return;
                            }
                        }
                        switch (c2) {
                            case 'D':
                                if (i2 == 1) {
                                    appendValue(temporalField);
                                    return;
                                } else {
                                    if (i2 <= 3) {
                                        appendValue(temporalField, i2);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                }
                            case 'E':
                            case 'G':
                                if (i2 == 1 || i2 == 2 || i2 == 3) {
                                    appendText(temporalField, TextStyle.SHORT);
                                    return;
                                }
                                if (i2 == 4) {
                                    appendText(temporalField, TextStyle.FULL);
                                    return;
                                } else {
                                    if (i2 == 5) {
                                        appendText(temporalField, TextStyle.NARROW);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                }
                            case 'F':
                                if (i2 == 1) {
                                    appendValue(temporalField);
                                    return;
                                }
                                throw new IllegalArgumentException("Too many pattern letters: " + c2);
                            default:
                                switch (c2) {
                                    case 'K':
                                        break;
                                    case 'L':
                                        break;
                                    case 'M':
                                        break;
                                    default:
                                        switch (c2) {
                                            case 'c':
                                                if (i2 == 1) {
                                                    a(new u('c', i2));
                                                    return;
                                                }
                                                if (i2 == 2) {
                                                    throw new IllegalArgumentException("Invalid number of pattern letters: " + c2);
                                                }
                                                if (i2 == 3) {
                                                    appendText(temporalField, TextStyle.SHORT_STANDALONE);
                                                    return;
                                                }
                                                if (i2 == 4) {
                                                    appendText(temporalField, TextStyle.FULL_STANDALONE);
                                                    return;
                                                } else {
                                                    if (i2 == 5) {
                                                        appendText(temporalField, TextStyle.NARROW_STANDALONE);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                                }
                                            case 'd':
                                                break;
                                            case 'e':
                                                if (i2 == 1 || i2 == 2) {
                                                    a(new u('e', i2));
                                                    return;
                                                }
                                                if (i2 == 3) {
                                                    appendText(temporalField, TextStyle.SHORT);
                                                    return;
                                                }
                                                if (i2 == 4) {
                                                    appendText(temporalField, TextStyle.FULL);
                                                    return;
                                                } else {
                                                    if (i2 == 5) {
                                                        appendText(temporalField, TextStyle.NARROW);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                                }
                                            default:
                                                if (i2 == 1) {
                                                    appendValue(temporalField);
                                                    return;
                                                } else {
                                                    appendValue(temporalField, i2);
                                                    return;
                                                }
                                        }
                                        break;
                                }
                            case 'H':
                                if (i2 == 1) {
                                    appendValue(temporalField);
                                    return;
                                } else {
                                    if (i2 == 2) {
                                        appendValue(temporalField, i2);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                }
                        }
                    }
                }
                if (i2 == 1) {
                    appendValue(temporalField);
                    return;
                }
                if (i2 == 2) {
                    appendValue(temporalField, 2);
                    return;
                }
                if (i2 == 3) {
                    appendText(temporalField, TextStyle.SHORT_STANDALONE);
                    return;
                }
                if (i2 == 4) {
                    appendText(temporalField, TextStyle.FULL_STANDALONE);
                    return;
                } else {
                    if (i2 == 5) {
                        appendText(temporalField, TextStyle.NARROW_STANDALONE);
                        return;
                    }
                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                }
            }
            if (i2 == 1) {
                appendValue(temporalField);
                return;
            } else {
                if (i2 == 2) {
                    appendValue(temporalField, i2);
                    return;
                }
                throw new IllegalArgumentException("Too many pattern letters: " + c2);
            }
        }
        if (i2 == 1) {
            appendValue(temporalField);
            return;
        }
        if (i2 == 2) {
            appendValue(temporalField, 2);
            return;
        }
        if (i2 == 3) {
            appendText(temporalField, TextStyle.SHORT);
            return;
        }
        if (i2 == 4) {
            appendText(temporalField, TextStyle.FULL);
        } else {
            if (i2 == 5) {
                appendText(temporalField, TextStyle.NARROW);
                return;
            }
            throw new IllegalArgumentException("Too many pattern letters: " + c2);
        }
    }

    private void d(String str) {
        int i2;
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i4 = i3 + 1;
                while (i4 < str.length() && str.charAt(i4) == cCharAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (cCharAt == 'p') {
                    if (i4 >= str.length() || (((cCharAt = str.charAt(i4)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i2 = i5;
                        i5 = 0;
                    } else {
                        int i6 = i4 + 1;
                        while (i6 < str.length() && str.charAt(i6) == cCharAt) {
                            i6++;
                        }
                        i2 = i6 - i4;
                        i4 = i6;
                    }
                    if (i5 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                    padNext(i5);
                    i5 = i2;
                }
                TemporalField temporalField = i.get(Character.valueOf(cCharAt));
                if (temporalField != null) {
                    c(cCharAt, i5, temporalField);
                } else if (cCharAt == 'z') {
                    if (i5 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    if (i5 == 4) {
                        appendZoneText(TextStyle.FULL);
                    } else {
                        appendZoneText(TextStyle.SHORT);
                    }
                } else if (cCharAt != 'V') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i5 < 4) {
                            appendOffset("+HHMM", "+0000");
                        } else if (i5 == 4) {
                            appendLocalizedOffset(TextStyle.FULL);
                        } else {
                            if (i5 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            appendOffset("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i5 == 1) {
                            appendLocalizedOffset(TextStyle.SHORT);
                        } else {
                            if (i5 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            appendLocalizedOffset(TextStyle.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i5 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        appendOffset(o.c[i5 + (i5 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i5 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i5 == 1) {
                            str2 = "+00";
                        } else if (i5 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        appendOffset(o.c[i5 + (i5 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i5 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        a(new u('W', i5));
                    } else if (cCharAt == 'w') {
                        if (i5 > 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        a(new u('w', i5));
                    } else {
                        if (cCharAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                        }
                        a(new u('Y', i5));
                    }
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    appendZoneId();
                }
                i3 = i4 - 1;
            } else if (cCharAt == '\'') {
                int i7 = i3 + 1;
                int i8 = i7;
                while (i8 < str.length()) {
                    if (str.charAt(i8) == '\'') {
                        int i9 = i8 + 1;
                        if (i9 >= str.length() || str.charAt(i9) != '\'') {
                            break;
                        } else {
                            i8 = i9;
                        }
                    }
                    i8++;
                }
                if (i8 >= str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
                String strSubstring = str.substring(i7, i8);
                if (strSubstring.length() == 0) {
                    appendLiteral('\'');
                } else {
                    appendLiteral(strSubstring.replace("''", "'"));
                }
                i3 = i8;
            } else if (cCharAt == '[') {
                optionalStart();
            } else if (cCharAt == ']') {
                if (this.a.b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                optionalEnd();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                appendLiteral(cCharAt);
            }
            i3++;
        }
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat timeInstance;
        Jdk8Methods.requireNonNull(locale, "locale");
        Jdk8Methods.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle != null) {
            timeInstance = formatStyle2 != null ? DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale) : DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else {
            timeInstance = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        }
        if (timeInstance instanceof SimpleDateFormat) {
            return ((SimpleDateFormat) timeInstance).toPattern();
        }
        throw new IllegalArgumentException("Unable to determine pattern");
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        a(dateTimeFormatter.f(false));
        return this;
    }

    public DateTimeFormatterBuilder appendChronologyId() {
        a(new f(null));
        return this;
    }

    public DateTimeFormatterBuilder appendChronologyText(TextStyle textStyle) {
        Jdk8Methods.requireNonNull(textStyle, "textStyle");
        a(new f(textStyle));
        return this;
    }

    public DateTimeFormatterBuilder appendFraction(TemporalField temporalField, int i2, int i3, boolean z) {
        a(new j(temporalField, i2, i3, z));
        return this;
    }

    public DateTimeFormatterBuilder appendInstant() {
        a(new k(-2));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(char c2) {
        a(new e(c2));
        return this;
    }

    public DateTimeFormatterBuilder appendLocalized(FormatStyle formatStyle, FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        a(new m(formatStyle, formatStyle2));
        return this;
    }

    public DateTimeFormatterBuilder appendLocalizedOffset(TextStyle textStyle) {
        Jdk8Methods.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        a(new l(textStyle));
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        a(new o(str2, str));
        return this;
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        a(o.d);
        return this;
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeFormatter dateTimeFormatter) {
        Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        a(dateTimeFormatter.f(true));
        return this;
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        Jdk8Methods.requireNonNull(str, "pattern");
        d(str);
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField) {
        return appendText(temporalField, TextStyle.FULL);
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        b(new n(temporalField, 1, 19, SignStyle.NORMAL));
        return this;
    }

    public DateTimeFormatterBuilder appendValueReduced(TemporalField temporalField, int i2, int i3, int i4) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        b(new q(temporalField, i2, i3, i4, null));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneId() {
        a(new v(TemporalQueries.zoneId(), "ZoneId()"));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneOrOffsetId() {
        a(new v(TemporalQueries.zone(), "ZoneOrOffsetId()"));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneRegionId() {
        a(new v(h, "ZoneRegionId()"));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle) {
        a(new w(textStyle));
        return this;
    }

    public DateTimeFormatter e(ResolverStyle resolverStyle) {
        return toFormatter().withResolverStyle(resolverStyle);
    }

    public DateTimeFormatterBuilder optionalEnd() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.c.size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
            g gVar = new g(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
            this.a = this.a.b;
            a(gVar);
        } else {
            this.a = this.a.b;
        }
        return this;
    }

    public DateTimeFormatterBuilder optionalStart() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder, true);
        return this;
    }

    public DateTimeFormatterBuilder padNext(int i2) {
        return padNext(i2, StringUtil.SPACE);
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        a(r.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseCaseSensitive() {
        a(r.SENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseDefaulting(TemporalField temporalField, long j2) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        a(new i(temporalField, j2));
        return this;
    }

    public DateTimeFormatterBuilder parseLenient() {
        a(r.LENIENT);
        return this;
    }

    public DateTimeFormatterBuilder parseStrict() {
        a(r.STRICT);
        return this;
    }

    public DateTimeFormatter toFormatter() {
        return toFormatter(Locale.getDefault());
    }

    public DateTimeFormatterBuilder appendInstant(int i2) {
        if (i2 >= -1 && i2 <= 9) {
            a(new k(i2));
            return this;
        }
        throw new IllegalArgumentException("Invalid fractional digits: " + i2);
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        Jdk8Methods.requireNonNull(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                a(new e(str.charAt(0)));
            } else {
                a(new s(str));
            }
        }
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, TextStyle textStyle) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        Jdk8Methods.requireNonNull(textStyle, "textStyle");
        a(new t(temporalField, textStyle, DateTimeTextProvider.b()));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle, Set<ZoneId> set) {
        Jdk8Methods.requireNonNull(set, "preferredZones");
        a(new w(textStyle));
        return this;
    }

    public DateTimeFormatterBuilder padNext(int i2, char c2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("The pad width must be at least one but was " + i2);
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.e = i2;
        dateTimeFormatterBuilder.f = c2;
        dateTimeFormatterBuilder.g = -1;
        return this;
    }

    public DateTimeFormatter toFormatter(Locale locale) {
        Jdk8Methods.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            optionalEnd();
        }
        return new DateTimeFormatter(new g(this.c, false), locale, DecimalStyle.STANDARD, ResolverStyle.SMART, null, null, null);
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        if (i2 >= 1 && i2 <= 19) {
            b(new n(temporalField, i2, i2, SignStyle.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
    }

    public DateTimeFormatterBuilder appendValueReduced(TemporalField temporalField, int i2, int i3, ChronoLocalDate chronoLocalDate) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        Jdk8Methods.requireNonNull(chronoLocalDate, "baseDate");
        b(new q(temporalField, i2, i3, 0, chronoLocalDate));
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, Map<Long, String> map) {
        Jdk8Methods.requireNonNull(temporalField, "field");
        Jdk8Methods.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        a(new t(temporalField, textStyle, new b(new org.threeten.bp.format.f.b(Collections.singletonMap(textStyle, linkedHashMap)))));
        return this;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = z;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2, int i3, SignStyle signStyle) {
        if (i2 == i3 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i3);
        }
        Jdk8Methods.requireNonNull(temporalField, "field");
        Jdk8Methods.requireNonNull(signStyle, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            b(new n(temporalField, i2, i3, signStyle));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public static final class q extends n {
        public static final LocalDate i = LocalDate.of(2000, 1, 1);
        private final int g;
        private final ChronoLocalDate h;

        public q(TemporalField temporalField, int i2, int i3, int i4, ChronoLocalDate chronoLocalDate) {
            super(temporalField, i2, i3, SignStyle.NOT_NEGATIVE);
            if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException("The width must be from 1 to 10 inclusive but was " + i2);
            }
            if (i3 < 1 || i3 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i3);
            }
            if (i3 < i2) {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
            if (chronoLocalDate == null) {
                long j = i4;
                if (!temporalField.range().isValidValue(j)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j + ((long) n.f[i2]) > ParserMinimalBase.MAX_INT_L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
            this.g = i4;
            this.h = chronoLocalDate;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.n
        public long c(org.threeten.bp.format.d dVar, long j) {
            long jAbs = Math.abs(j);
            int i2 = this.g;
            if (this.h != null) {
                i2 = Chronology.from(dVar.e()).date(this.h).get(this.a);
            }
            if (j >= i2) {
                int[] iArr = n.f;
                int i3 = this.b;
                if (j < i2 + iArr[i3]) {
                    return jAbs % ((long) iArr[i3]);
                }
            }
            return jAbs % ((long) n.f[this.c]);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.n
        public boolean d(org.threeten.bp.format.c cVar) {
            if (cVar.m()) {
                return super.d(cVar);
            }
            return false;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.n
        public int e(org.threeten.bp.format.c cVar, long j, int i2, int i3) {
            int i4 = this.g;
            if (this.h != null) {
                i4 = cVar.h().date(this.h).get(this.a);
                cVar.b(this, j, i2, i3);
            }
            int i5 = i3 - i2;
            int i6 = this.b;
            if (i5 == i6 && j >= 0) {
                long j2 = n.f[i6];
                long j3 = i4;
                long j4 = j3 - (j3 % j2);
                j = i4 > 0 ? j4 + j : j4 - j;
                if (j < j3) {
                    j += j2;
                }
            }
            return cVar.r(this.a, j, i2, i3);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.n
        public n f() {
            return this.e == -1 ? this : new q(this.a, this.b, this.c, this.g, this.h, -1);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.n
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public q g(int i2) {
            return new q(this.a, this.b, this.c, this.g, this.h, this.e + i2);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.n
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReducedValue(");
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b);
            sb.append(",");
            sb.append(this.c);
            sb.append(",");
            Object objValueOf = this.h;
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(this.g);
            }
            sb.append(objValueOf);
            sb.append(")");
            return sb.toString();
        }

        private q(TemporalField temporalField, int i2, int i3, int i4, ChronoLocalDate chronoLocalDate, int i5) {
            super(temporalField, i2, i3, SignStyle.NOT_NEGATIVE, i5, null);
            this.g = i4;
            this.h = chronoLocalDate;
        }
    }
}
