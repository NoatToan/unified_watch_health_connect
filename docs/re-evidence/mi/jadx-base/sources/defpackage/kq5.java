package defpackage;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.format.SignStyle;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class kq5 {
    public static final b5p<ZoneId> h = new b();
    public static final Map<Character, z4p> i;
    public static final Comparator<String> j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kq5 f24158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq5 f24159b;
    public final List<h> c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    public class a extends uq5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qcm.b f24160b;

        public a(qcm.b bVar) {
            this.f24160b = bVar;
        }

        @Override // defpackage.uq5
        public String c(z4p z4pVar, long j, TextStyle textStyle, Locale locale) {
            return this.f24160b.a(j, textStyle);
        }

        @Override // defpackage.uq5
        public Iterator<Map.Entry<String, Long>> d(z4p z4pVar, TextStyle textStyle, Locale locale) {
            return this.f24160b.b(textStyle);
        }
    }

    public class b implements b5p<ZoneId> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ZoneId a(t4p t4pVar) {
            ZoneId zoneId = (ZoneId) t4pVar.query(a5p.g());
            if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                return null;
            }
            return zoneId;
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24161a;

        static {
            int[] iArr = new int[SignStyle.values().length];
            f24161a = iArr;
            try {
                iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24161a[SignStyle.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24161a[SignStyle.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24161a[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class e implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f24162a;

        public e(char c) {
            this.f24162a = c;
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return ~i;
            }
            return !nq5Var.c(this.f24162a, charSequence.charAt(i)) ? ~i : i + 1;
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            sb.append(this.f24162a);
            return true;
        }

        public String toString() {
            if (this.f24162a == '\'') {
                return "''";
            }
            return "'" + this.f24162a + "'";
        }
    }

    public static final class f implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextStyle f24163a;

        public f(TextStyle textStyle) {
            this.f24163a = textStyle;
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            if (i < 0 || i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            org.threeten.bp.chrono.b bVar = null;
            int i2 = -1;
            for (org.threeten.bp.chrono.b bVar2 : org.threeten.bp.chrono.b.getAvailableChronologies()) {
                String id = bVar2.getId();
                int length = id.length();
                if (length > i2 && nq5Var.u(charSequence, i, id, 0, length)) {
                    bVar = bVar2;
                    i2 = length;
                }
            }
            if (bVar == null) {
                return ~i;
            }
            nq5Var.p(bVar);
            return i + i2;
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            org.threeten.bp.chrono.b bVar = (org.threeten.bp.chrono.b) rq5Var.g(a5p.a());
            if (bVar == null) {
                return false;
            }
            if (this.f24163a == null) {
                sb.append(bVar.getId());
                return true;
            }
            try {
                sb.append(ResourceBundle.getBundle("org.threeten.bp.format.ChronologyText", rq5Var.c(), kq5.class.getClassLoader()).getString(bVar.getId()));
                return true;
            } catch (MissingResourceException unused) {
                sb.append(bVar.getId());
                return true;
            }
        }
    }

    public static final class g implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h[] f24164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24165b;

        public g(List<h> list, boolean z) {
            this((h[]) list.toArray(new h[list.size()]), z);
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            if (!this.f24165b) {
                for (h hVar : this.f24164a) {
                    i = hVar.a(nq5Var, charSequence, i);
                    if (i < 0) {
                        break;
                    }
                }
                return i;
            }
            nq5Var.t();
            int iA = i;
            for (h hVar2 : this.f24164a) {
                iA = hVar2.a(nq5Var, charSequence, iA);
                if (iA < 0) {
                    nq5Var.g(false);
                    return i;
                }
            }
            nq5Var.g(true);
            return iA;
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            int length = sb.length();
            if (this.f24165b) {
                rq5Var.h();
            }
            try {
                for (h hVar : this.f24164a) {
                    if (!hVar.b(rq5Var, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                return true;
            } finally {
                if (this.f24165b) {
                    rq5Var.b();
                }
            }
        }

        public g c(boolean z) {
            return z == this.f24165b ? this : new g(this.f24164a, z);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f24164a != null) {
                sb.append(this.f24165b ? "[" : "(");
                for (h hVar : this.f24164a) {
                    sb.append(hVar);
                }
                sb.append(this.f24165b ? "]" : ")");
            }
            return sb.toString();
        }

        public g(h[] hVarArr, boolean z) {
            this.f24164a = hVarArr;
            this.f24165b = z;
        }
    }

    public interface h {
        int a(nq5 nq5Var, CharSequence charSequence, int i);

        boolean b(rq5 rq5Var, StringBuilder sb);
    }

    public static final class i implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z4p f24166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24167b;
        public final int c;
        public final boolean d;

        public i(z4p z4pVar, int i, int i2, boolean z) {
            crd.i(z4pVar, "field");
            if (!z4pVar.range().isFixed()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + z4pVar);
            }
            if (i < 0 || i > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
            }
            if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
            }
            if (i2 >= i) {
                this.f24166a = z4pVar;
                this.f24167b = i;
                this.c = i2;
                this.d = z;
                return;
            }
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            int i2 = 0;
            int i3 = nq5Var.m() ? this.f24167b : 0;
            int i4 = nq5Var.m() ? this.c : 9;
            int length = charSequence.length();
            if (i == length) {
                return i3 > 0 ? ~i : i;
            }
            if (this.d) {
                if (charSequence.charAt(i) != nq5Var.k().c()) {
                    return i3 > 0 ? ~i : i;
                }
                i++;
            }
            int i5 = i;
            int i6 = i3 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int iMin = Math.min(i4 + i5, length);
            int i7 = i5;
            while (i7 < iMin) {
                int i8 = i7 + 1;
                int iB = nq5Var.k().b(charSequence.charAt(i7));
                if (iB < 0) {
                    if (i8 >= i6) {
                        break;
                    }
                    return ~i5;
                }
                i2 = (i2 * 10) + iB;
                i7 = i8;
            }
            return nq5Var.q(this.f24166a, c(new BigDecimal(i2).movePointLeft(i7 - i5)), i5, i7);
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            Long lF = rq5Var.f(this.f24166a);
            if (lF == null) {
                return false;
            }
            wr5 wr5VarD = rq5Var.d();
            BigDecimal bigDecimalD = d(lF.longValue());
            if (bigDecimalD.scale() != 0) {
                String strA = wr5VarD.a(bigDecimalD.setScale(Math.min(Math.max(bigDecimalD.scale(), this.f24167b), this.c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.d) {
                    sb.append(wr5VarD.c());
                }
                sb.append(strA);
                return true;
            }
            if (this.f24167b <= 0) {
                return true;
            }
            if (this.d) {
                sb.append(wr5VarD.c());
            }
            for (int i = 0; i < this.f24167b; i++) {
                sb.append(wr5VarD.f());
            }
            return true;
        }

        public final long c(BigDecimal bigDecimal) {
            ValueRange valueRangeRange = this.f24166a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.getMinimum());
            return bigDecimal.multiply(BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact();
        }

        public final BigDecimal d(long j) {
            ValueRange valueRangeRange = this.f24166a.range();
            valueRangeRange.checkValidValue(j, this.f24166a);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.getMinimum());
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(j).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            return bigDecimalDivide.compareTo(bigDecimal) == 0 ? bigDecimal : atd.a(bigDecimalDivide);
        }

        public String toString() {
            return "Fraction(" + this.f24166a + "," + this.f24167b + "," + this.c + (this.d ? ",DecimalPoint" : "") + ")";
        }
    }

    public static final class j implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24168a;

        public j(int i) {
            this.f24168a = i;
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            int i2;
            int i3;
            nq5 nq5VarE = nq5Var.e();
            int i4 = this.f24168a;
            int i5 = 0;
            int i6 = i4 < 0 ? 0 : i4;
            if (i4 < 0) {
                i4 = 9;
            }
            kq5 kq5VarF = new kq5().a(iq5.h).f('T');
            ChronoField chronoField = ChronoField.HOUR_OF_DAY;
            kq5 kq5VarF2 = kq5VarF.m(chronoField, 2).f(AbstractJsonLexerKt.COLON);
            ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
            kq5 kq5VarF3 = kq5VarF2.m(chronoField2, 2).f(AbstractJsonLexerKt.COLON);
            ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
            kq5 kq5VarM = kq5VarF3.m(chronoField3, 2);
            ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
            int iA = kq5VarM.c(chronoField4, i6, i4, true).f('Z').v().k(false).a(nq5VarE, charSequence, i);
            if (iA < 0) {
                return iA;
            }
            long jLongValue = nq5VarE.j(ChronoField.YEAR).longValue();
            int iIntValue = nq5VarE.j(ChronoField.MONTH_OF_YEAR).intValue();
            int iIntValue2 = nq5VarE.j(ChronoField.DAY_OF_MONTH).intValue();
            int iIntValue3 = nq5VarE.j(chronoField).intValue();
            int iIntValue4 = nq5VarE.j(chronoField2).intValue();
            Long lJ = nq5VarE.j(chronoField3);
            Long lJ2 = nq5VarE.j(chronoField4);
            int iIntValue5 = lJ != null ? lJ.intValue() : 0;
            int iIntValue6 = lJ2 != null ? lJ2.intValue() : 0;
            int i7 = ((int) jLongValue) % 10000;
            if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
                i2 = 0;
                i3 = iIntValue5;
                i5 = 1;
            } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                nq5Var.r();
                i3 = 59;
                i2 = iIntValue3;
            } else {
                i2 = iIntValue3;
                i3 = iIntValue5;
            }
            try {
                return nq5Var.q(chronoField4, iIntValue6, i, nq5Var.q(ChronoField.INSTANT_SECONDS, crd.n(jLongValue / 10000, 315569520000L) + LocalDateTime.of(i7, iIntValue, iIntValue2, i2, iIntValue4, i3, 0).plusDays(i5).toEpochSecond(ZoneOffset.UTC), i, iA));
            } catch (RuntimeException unused) {
                return ~i;
            }
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            Long lF = rq5Var.f(ChronoField.INSTANT_SECONDS);
            t4p t4pVarE = rq5Var.e();
            ChronoField chronoField = ChronoField.NANO_OF_SECOND;
            Long lValueOf = t4pVarE.isSupported(chronoField) ? Long.valueOf(rq5Var.e().getLong(chronoField)) : 0L;
            int i = 0;
            if (lF == null) {
                return false;
            }
            long jLongValue = lF.longValue();
            int iCheckValidIntValue = chronoField.checkValidIntValue(lValueOf.longValue());
            if (jLongValue >= -62167219200L) {
                long j = jLongValue - 253402300800L;
                long jE = 1 + crd.e(j, 315569520000L);
                LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(crd.h(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                if (jE > 0) {
                    sb.append('+');
                    sb.append(jE);
                }
                sb.append(localDateTimeOfEpochSecond);
                if (localDateTimeOfEpochSecond.getSecond() == 0) {
                    sb.append(":00");
                }
            } else {
                long j2 = jLongValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                LocalDateTime localDateTimeOfEpochSecond2 = LocalDateTime.ofEpochSecond(j4 - 62167219200L, 0, ZoneOffset.UTC);
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
            int i2 = this.f24168a;
            if (i2 == -2) {
                if (iCheckValidIntValue != 0) {
                    sb.append('.');
                    if (iCheckValidIntValue % 1000000 == 0) {
                        sb.append(Integer.toString((iCheckValidIntValue / 1000000) + 1000).substring(1));
                    } else if (iCheckValidIntValue % 1000 == 0) {
                        sb.append(Integer.toString((iCheckValidIntValue / 1000) + 1000000).substring(1));
                    } else {
                        sb.append(Integer.toString(iCheckValidIntValue + 1000000000).substring(1));
                    }
                }
            } else if (i2 > 0 || (i2 == -1 && iCheckValidIntValue > 0)) {
                sb.append('.');
                int i3 = 100000000;
                while (true) {
                    int i4 = this.f24168a;
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

    public static class k implements h {
        public static final int[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z4p f24169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24170b;
        public final int c;
        public final SignStyle d;
        public final int e;

        public /* synthetic */ k(z4p z4pVar, int i, int i2, SignStyle signStyle, int i3, b bVar) {
            this(z4pVar, i, i2, signStyle, i3);
        }

        /* JADX WARN: Code duplicated, block: B:110:0x0161  */
        /* JADX WARN: Code duplicated, block: B:112:0x0169  */
        /* JADX WARN: Code duplicated, block: B:115:0x017f  */
        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
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
            if (cCharAt == nq5Var.k().e()) {
                if (!this.d.parse(true, nq5Var.m(), this.f24170b == this.c)) {
                    return ~i;
                }
                i2 = i + 1;
                z = false;
                z2 = true;
            } else if (cCharAt == nq5Var.k().d()) {
                if (!this.d.parse(false, nq5Var.m(), this.f24170b == this.c)) {
                    return ~i;
                }
                i2 = i + 1;
                z2 = false;
                z = true;
            } else {
                if (this.d == SignStyle.ALWAYS && nq5Var.m()) {
                    return ~i;
                }
                i2 = i;
                z = false;
                z2 = false;
            }
            int i5 = (nq5Var.m() || d(nq5Var)) ? this.f24170b : 1;
            int i6 = i2 + i5;
            if (i6 > length) {
                return ~i2;
            }
            int iMax = ((nq5Var.m() || d(nq5Var)) ? this.c : 9) + Math.max(this.e, 0);
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
                    int iB = nq5Var.k().b(charSequence.charAt(i7));
                    if (iB < 0) {
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
                    i6 = i6;
                    iMin = iMin;
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
                    if (bigIntegerDivide.equals(BigInteger.ZERO) && nq5Var.m()) {
                        return ~(i2 - 1);
                    }
                    bigIntegerDivide = bigIntegerDivide.negate();
                } else {
                    if (j == 0 && nq5Var.m()) {
                        return ~(i2 - 1);
                    }
                    j2 = -j;
                }
                if (bigIntegerDivide != null) {
                    return e(nq5Var, j2, i2, i3);
                }
                if (bigIntegerDivide.bitLength() > 63) {
                    bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                    i3--;
                }
                return e(nq5Var, bigIntegerDivide.longValue(), i2, i3);
            }
            if (this.d == SignStyle.EXCEEDS_PAD && nq5Var.m()) {
                int i11 = i3 - i2;
                if (z2) {
                    if (i11 <= this.f24170b) {
                        return ~(i2 - 1);
                    }
                } else if (i11 > this.f24170b) {
                    return ~i2;
                }
            }
            j2 = j;
            if (bigIntegerDivide != null) {
                return e(nq5Var, j2, i2, i3);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i3--;
            }
            return e(nq5Var, bigIntegerDivide.longValue(), i2, i3);
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            Long lF = rq5Var.f(this.f24169a);
            if (lF == null) {
                return false;
            }
            long jC = c(rq5Var, lF.longValue());
            wr5 wr5VarD = rq5Var.d();
            String string = jC == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jC));
            if (string.length() > this.c) {
                throw new DateTimeException("Field " + this.f24169a + " cannot be printed as the value " + jC + " exceeds the maximum print width of " + this.c);
            }
            String strA = wr5VarD.a(string);
            if (jC >= 0) {
                int i = d.f24161a[this.d.ordinal()];
                if (i == 1) {
                    int i2 = this.f24170b;
                    if (i2 < 19 && jC >= f[i2]) {
                        sb.append(wr5VarD.e());
                    }
                } else if (i == 2) {
                    sb.append(wr5VarD.e());
                }
            } else {
                int i3 = d.f24161a[this.d.ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    sb.append(wr5VarD.d());
                } else if (i3 == 4) {
                    throw new DateTimeException("Field " + this.f24169a + " cannot be printed as the value " + jC + " cannot be negative according to the SignStyle");
                }
            }
            for (int i4 = 0; i4 < this.f24170b - strA.length(); i4++) {
                sb.append(wr5VarD.f());
            }
            sb.append(strA);
            return true;
        }

        public long c(rq5 rq5Var, long j) {
            return j;
        }

        public boolean d(nq5 nq5Var) {
            int i = this.e;
            return i == -1 || (i > 0 && this.f24170b == this.c && this.d == SignStyle.NOT_NEGATIVE);
        }

        public int e(nq5 nq5Var, long j, int i, int i2) {
            return nq5Var.q(this.f24169a, j, i, i2);
        }

        public k f() {
            return this.e == -1 ? this : new k(this.f24169a, this.f24170b, this.c, this.d, -1);
        }

        public k g(int i) {
            return new k(this.f24169a, this.f24170b, this.c, this.d, this.e + i);
        }

        public String toString() {
            int i = this.f24170b;
            if (i == 1 && this.c == 19 && this.d == SignStyle.NORMAL) {
                return "Value(" + this.f24169a + ")";
            }
            if (i == this.c && this.d == SignStyle.NOT_NEGATIVE) {
                return "Value(" + this.f24169a + "," + this.f24170b + ")";
            }
            return "Value(" + this.f24169a + "," + this.f24170b + "," + this.c + "," + this.d + ")";
        }

        public k(z4p z4pVar, int i, int i2, SignStyle signStyle) {
            this.f24169a = z4pVar;
            this.f24170b = i;
            this.c = i2;
            this.d = signStyle;
            this.e = 0;
        }

        public k(z4p z4pVar, int i, int i2, SignStyle signStyle, int i3) {
            this.f24169a = z4pVar;
            this.f24170b = i;
            this.c = i2;
            this.d = signStyle;
            this.e = i3;
        }
    }

    public static final class l implements h {
        public static final String[] c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        public static final l d = new l("Z", "+HH:MM:ss");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24172b;

        public l(String str, String str2) {
            crd.i(str, "noOffsetText");
            crd.i(str2, "pattern");
            this.f24171a = str;
            this.f24172b = c(str2);
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            int length = charSequence.length();
            int length2 = this.f24171a.length();
            if (length2 == 0) {
                if (i == length) {
                    return nq5Var.q(ChronoField.OFFSET_SECONDS, 0L, i, i);
                }
            } else {
                if (i == length) {
                    return ~i;
                }
                if (nq5Var.u(charSequence, i, this.f24171a, 0, length2)) {
                    return nq5Var.q(ChronoField.OFFSET_SECONDS, 0L, i, i + length2);
                }
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '+' || cCharAt == '-') {
                int i2 = cCharAt == '-' ? -1 : 1;
                int[] iArr = new int[4];
                iArr[0] = i + 1;
                if (!d(iArr, 1, charSequence, true)) {
                    if (!d(iArr, 2, charSequence, this.f24172b >= 3) && !d(iArr, 3, charSequence, false)) {
                        return nq5Var.q(ChronoField.OFFSET_SECONDS, ((long) i2) * ((((long) iArr[1]) * TimeDateUtil.TIME_HOUR) + (((long) iArr[2]) * 60) + ((long) iArr[3])), i, iArr[0]);
                    }
                }
            }
            return length2 == 0 ? nq5Var.q(ChronoField.OFFSET_SECONDS, 0L, i, i + length2) : ~i;
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            Long lF = rq5Var.f(ChronoField.OFFSET_SECONDS);
            if (lF == null) {
                return false;
            }
            int iQ = crd.q(lF.longValue());
            if (iQ == 0) {
                sb.append(this.f24171a);
            } else {
                int iAbs = Math.abs((iQ / 3600) % 100);
                int iAbs2 = Math.abs((iQ / 60) % 60);
                int iAbs3 = Math.abs(iQ % 60);
                int length = sb.length();
                sb.append(iQ < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
                sb.append((char) ((iAbs / 10) + 48));
                sb.append((char) ((iAbs % 10) + 48));
                int i = this.f24172b;
                if (i >= 3 || (i >= 1 && iAbs2 > 0)) {
                    sb.append(i % 2 == 0 ? ":" : "");
                    sb.append((char) ((iAbs2 / 10) + 48));
                    sb.append((char) ((iAbs2 % 10) + 48));
                    iAbs += iAbs2;
                    int i2 = this.f24172b;
                    if (i2 >= 7 || (i2 >= 5 && iAbs3 > 0)) {
                        sb.append(i2 % 2 == 0 ? ":" : "");
                        sb.append((char) ((iAbs3 / 10) + 48));
                        sb.append((char) ((iAbs3 % 10) + 48));
                        iAbs += iAbs3;
                    }
                }
                if (iAbs == 0) {
                    sb.setLength(length);
                    sb.append(this.f24171a);
                }
            }
            return true;
        }

        public final int c(String str) {
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

        public final boolean d(int[] iArr, int i, CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.f24172b;
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
            int i7 = i4 + 2;
            char cCharAt2 = charSequence.charAt(i6);
            if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9' || (i2 = ((cCharAt - '0') * 10) + (cCharAt2 - '0')) < 0 || i2 > 59) {
                return z;
            }
            iArr[i] = i2;
            iArr[0] = i7;
            return false;
        }

        public String toString() {
            return "Offset(" + c[this.f24172b] + ",'" + this.f24171a.replace("'", "''") + "')";
        }
    }

    public static final class m implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f24173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24174b;
        public final char c;

        public m(h hVar, int i, char c) {
            this.f24173a = hVar;
            this.f24174b = i;
            this.c = c;
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            boolean zM = nq5Var.m();
            boolean zL = nq5Var.l();
            if (i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            if (i == charSequence.length()) {
                return ~i;
            }
            int length = this.f24174b + i;
            if (length > charSequence.length()) {
                if (zM) {
                    return ~i;
                }
                length = charSequence.length();
            }
            int i2 = i;
            while (i2 < length) {
                if (!zL) {
                    if (!nq5Var.c(charSequence.charAt(i2), this.c)) {
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
            int iA = this.f24173a.a(nq5Var, charSequence.subSequence(0, length), i2);
            return (iA == length || !zM) ? iA : ~(i + i2);
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            int length = sb.length();
            if (!this.f24173a.b(rq5Var, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.f24174b) {
                for (int i = 0; i < this.f24174b - length2; i++) {
                    sb.insert(length, this.c);
                }
                return true;
            }
            throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f24174b);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.f24173a);
            sb.append(",");
            sb.append(this.f24174b);
            if (this.c == ' ') {
                str = ")";
            } else {
                str = ",'" + this.c + "')";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public static final class n extends k {
        public static final LocalDate i = LocalDate.of(2000, 1, 1);
        public final int g;
        public final org.threeten.bp.chrono.a h;

        public n(z4p z4pVar, int i2, int i3, int i4, org.threeten.bp.chrono.a aVar, int i5) {
            super(z4pVar, i2, i3, SignStyle.NOT_NEGATIVE, i5, null);
            this.g = i4;
            this.h = aVar;
        }

        @Override // kq5.k
        public long c(rq5 rq5Var, long j) {
            long jAbs = Math.abs(j);
            int i2 = this.g;
            if (this.h != null) {
                i2 = org.threeten.bp.chrono.b.from(rq5Var.e()).date(this.h).get(this.f24169a);
            }
            if (j >= i2) {
                int i3 = k.f[this.f24170b];
                if (j < i2 + i3) {
                    return jAbs % ((long) i3);
                }
            }
            return jAbs % ((long) k.f[this.c]);
        }

        @Override // kq5.k
        public boolean d(nq5 nq5Var) {
            if (nq5Var.m()) {
                return super.d(nq5Var);
            }
            return false;
        }

        @Override // kq5.k
        public int e(nq5 nq5Var, long j, int i2, int i3) {
            int i4 = this.g;
            if (this.h != null) {
                i4 = nq5Var.h().date(this.h).get(this.f24169a);
                nq5Var.b(this, j, i2, i3);
            }
            int i5 = i3 - i2;
            int i6 = this.f24170b;
            if (i5 == i6 && j >= 0) {
                long j2 = k.f[i6];
                long j3 = i4;
                long j4 = j3 - (j3 % j2);
                j = i4 > 0 ? j4 + j : j4 - j;
                if (j < j3) {
                    j += j2;
                }
            }
            return nq5Var.q(this.f24169a, j, i2, i3);
        }

        @Override // kq5.k
        public k f() {
            return this.e == -1 ? this : new n(this.f24169a, this.f24170b, this.c, this.g, this.h, -1);
        }

        @Override // kq5.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public n g(int i2) {
            return new n(this.f24169a, this.f24170b, this.c, this.g, this.h, this.e + i2);
        }

        @Override // kq5.k
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReducedValue(");
            sb.append(this.f24169a);
            sb.append(",");
            sb.append(this.f24170b);
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
    }

    public enum o implements h {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                nq5Var.n(true);
            } else if (iOrdinal == 1) {
                nq5Var.n(false);
            } else if (iOrdinal == 2) {
                nq5Var.s(true);
            } else if (iOrdinal == 3) {
                nq5Var.s(false);
            }
            return i;
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
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

    public static final class p implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24177a;

        public p(String str) {
            this.f24177a = str;
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            if (i > charSequence.length() || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.f24177a;
            return !nq5Var.u(charSequence, i, str, 0, str.length()) ? ~i : i + this.f24177a.length();
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            sb.append(this.f24177a);
            return true;
        }

        public String toString() {
            return "'" + this.f24177a.replace("'", "''") + "'";
        }
    }

    public static final class q implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z4p f24178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextStyle f24179b;
        public final uq5 c;
        public volatile k d;

        public q(z4p z4pVar, TextStyle textStyle, uq5 uq5Var) {
            this.f24178a = z4pVar;
            this.f24179b = textStyle;
            this.c = uq5Var;
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> itD = this.c.d(this.f24178a, nq5Var.m() ? this.f24179b : null, nq5Var.i());
            if (itD != null) {
                while (itD.hasNext()) {
                    Map.Entry<String, Long> next = itD.next();
                    String key = next.getKey();
                    if (nq5Var.u(key, 0, charSequence, i, key.length())) {
                        return nq5Var.q(this.f24178a, next.getValue().longValue(), i, i + key.length());
                    }
                }
                if (nq5Var.m()) {
                    return ~i;
                }
            }
            return c().a(nq5Var, charSequence, i);
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            Long lF = rq5Var.f(this.f24178a);
            if (lF == null) {
                return false;
            }
            String strC = this.c.c(this.f24178a, lF.longValue(), this.f24179b, rq5Var.c());
            if (strC == null) {
                return c().b(rq5Var, sb);
            }
            sb.append(strC);
            return true;
        }

        public final k c() {
            if (this.d == null) {
                this.d = new k(this.f24178a, 1, 19, SignStyle.NORMAL);
            }
            return this.d;
        }

        public String toString() {
            if (this.f24179b == TextStyle.FULL) {
                return "Text(" + this.f24178a + ")";
            }
            return "Text(" + this.f24178a + "," + this.f24179b + ")";
        }
    }

    public static final class r implements h {
        public static volatile Map.Entry<Integer, a> c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b5p<ZoneId> f24180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f24181b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Map<CharSequence, a> f24183b;
            public final Map<String, a> c;

            public /* synthetic */ a(int i, b bVar) {
                this(i);
            }

            public final void c(String str) {
                int length = str.length();
                int i = this.f24182a;
                if (length == i) {
                    this.f24183b.put(str, null);
                    this.c.put(str.toLowerCase(Locale.ENGLISH), null);
                } else if (length > i) {
                    String strSubstring = str.substring(0, i);
                    a aVar = this.f24183b.get(strSubstring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.f24183b.put(strSubstring, aVar);
                        this.c.put(strSubstring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.c(str);
                }
            }

            public final a d(CharSequence charSequence, boolean z) {
                return z ? this.f24183b.get(charSequence) : this.c.get(charSequence.toString().toLowerCase(Locale.ENGLISH));
            }

            public a(int i) {
                this.f24183b = new HashMap();
                this.c = new HashMap();
                this.f24182a = i;
            }
        }

        public r(b5p<ZoneId> b5pVar, String str) {
            this.f24180a = b5pVar;
            this.f24181b = str;
        }

        public static a e(Set<String> set) {
            ArrayList arrayList = new ArrayList(set);
            Collections.sort(arrayList, kq5.j);
            a aVar = new a(((String) arrayList.get(0)).length(), null);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar.c((String) it.next());
            }
            return aVar;
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
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
                nq5 nq5VarE = nq5Var.e();
                int iA = l.d.a(nq5VarE, charSequence, i);
                if (iA < 0) {
                    return iA;
                }
                nq5Var.o(ZoneOffset.ofTotalSeconds((int) nq5VarE.j(ChronoField.OFFSET_SECONDS).longValue()));
                return iA;
            }
            int i3 = i + 2;
            if (length >= i3) {
                char cCharAt2 = charSequence.charAt(i + 1);
                if (nq5Var.c(cCharAt, 'U') && nq5Var.c(cCharAt2, 'T')) {
                    int i4 = i + 3;
                    return (length < i4 || !nq5Var.c(charSequence.charAt(i3), 'C')) ? d(nq5Var, charSequence, i, i3) : d(nq5Var, charSequence, i, i4);
                }
                if (nq5Var.c(cCharAt, 'G') && length >= (i2 = i + 3) && nq5Var.c(cCharAt2, 'M') && nq5Var.c(charSequence.charAt(i3), 'T')) {
                    return d(nq5Var, charSequence, i, i2);
                }
            }
            Set<String> setA = k1s.a();
            int size = setA.size();
            Map.Entry<Integer, a> simpleImmutableEntry = c;
            if (simpleImmutableEntry == null || simpleImmutableEntry.getKey().intValue() != size) {
                synchronized (this) {
                    try {
                        simpleImmutableEntry = c;
                        if (simpleImmutableEntry == null || simpleImmutableEntry.getKey().intValue() != size) {
                            simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), e(setA));
                            c = simpleImmutableEntry;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            a value = simpleImmutableEntry.getValue();
            String str = null;
            String str2 = null;
            while (value != null) {
                int i5 = value.f24182a + i;
                if (i5 > length) {
                    break;
                }
                String string = charSequence.subSequence(i, i5).toString();
                value = value.d(string, nq5Var.l());
                str2 = str;
                str = string;
            }
            ZoneId zoneIdC = c(setA, str, nq5Var.l());
            if (zoneIdC == null) {
                zoneIdC = c(setA, str2, nq5Var.l());
                if (zoneIdC == null) {
                    if (!nq5Var.c(cCharAt, 'Z')) {
                        return ~i;
                    }
                    nq5Var.o(ZoneOffset.UTC);
                    return i + 1;
                }
                str = str2;
            }
            nq5Var.o(zoneIdC);
            return i + str.length();
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            ZoneId zoneId = (ZoneId) rq5Var.g(this.f24180a);
            if (zoneId == null) {
                return false;
            }
            sb.append(zoneId.getId());
            return true;
        }

        public final ZoneId c(Set<String> set, String str, boolean z) {
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

        public final int d(nq5 nq5Var, CharSequence charSequence, int i, int i2) {
            String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
            nq5 nq5VarE = nq5Var.e();
            if (i2 < charSequence.length() && nq5Var.c(charSequence.charAt(i2), 'Z')) {
                nq5Var.o(ZoneId.ofOffset(upperCase, ZoneOffset.UTC));
                return i2;
            }
            int iA = l.d.a(nq5VarE, charSequence, i2);
            if (iA < 0) {
                nq5Var.o(ZoneId.ofOffset(upperCase, ZoneOffset.UTC));
                return i2;
            }
            nq5Var.o(ZoneId.ofOffset(upperCase, ZoneOffset.ofTotalSeconds((int) nq5VarE.j(ChronoField.OFFSET_SECONDS).longValue())));
            return iA;
        }

        public String toString() {
            return this.f24181b;
        }
    }

    public static final class s implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Comparator<String> f24184b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextStyle f24185a;

        public class a implements Comparator<String> {
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                int length = str2.length() - str.length();
                return length == 0 ? str.compareTo(str2) : length;
            }
        }

        public s(TextStyle textStyle) {
            this.f24185a = (TextStyle) crd.i(textStyle, "textStyle");
        }

        @Override // kq5.h
        public int a(nq5 nq5Var, CharSequence charSequence, int i) {
            TreeMap treeMap = new TreeMap(f24184b);
            for (String str : ZoneId.getAvailableZoneIds()) {
                treeMap.put(str, str);
                TimeZone timeZone = TimeZone.getTimeZone(str);
                int i2 = this.f24185a.asNormal() == TextStyle.FULL ? 1 : 0;
                String displayName = timeZone.getDisplayName(false, i2, nq5Var.i());
                if (str.startsWith("Etc/") || (!displayName.startsWith("GMT+") && !displayName.startsWith("GMT+"))) {
                    treeMap.put(displayName, str);
                }
                String displayName2 = timeZone.getDisplayName(true, i2, nq5Var.i());
                if (str.startsWith("Etc/") || (!displayName2.startsWith("GMT+") && !displayName2.startsWith("GMT+"))) {
                    treeMap.put(displayName2, str);
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                String str2 = (String) entry.getKey();
                if (nq5Var.u(charSequence, i, str2, 0, str2.length())) {
                    nq5Var.o(ZoneId.of((String) entry.getValue()));
                    return i + str2.length();
                }
            }
            return ~i;
        }

        @Override // kq5.h
        public boolean b(rq5 rq5Var, StringBuilder sb) {
            boolean zD;
            ZoneId zoneId = (ZoneId) rq5Var.g(a5p.g());
            if (zoneId == null) {
                return false;
            }
            if (zoneId.normalized() instanceof ZoneOffset) {
                sb.append(zoneId.getId());
                return true;
            }
            t4p t4pVarE = rq5Var.e();
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (t4pVarE.isSupported(chronoField)) {
                zD = zoneId.getRules().d(Instant.ofEpochSecond(t4pVarE.getLong(chronoField)));
            } else {
                zD = false;
            }
            sb.append(TimeZone.getTimeZone(zoneId.getId()).getDisplayName(zD, this.f24185a.asNormal() == TextStyle.FULL ? 1 : 0, rq5Var.c()));
            return true;
        }

        public String toString() {
            return "ZoneText(" + this.f24185a + ")";
        }
    }

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), ChronoField.YEAR);
        z4p z4pVar = did.f15555b;
        map.put('Q', z4pVar);
        map.put('q', z4pVar);
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

    public kq5() {
        this.f24158a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.f24159b = null;
        this.d = false;
    }

    public kq5 a(iq5 iq5Var) {
        crd.i(iq5Var, "formatter");
        e(iq5Var.k(false));
        return this;
    }

    public kq5 b(TextStyle textStyle) {
        crd.i(textStyle, "textStyle");
        e(new f(textStyle));
        return this;
    }

    public kq5 c(z4p z4pVar, int i2, int i3, boolean z) {
        e(new i(z4pVar, i2, i3, z));
        return this;
    }

    public kq5 d() {
        e(new j(-2));
        return this;
    }

    public final int e(h hVar) {
        crd.i(hVar, "pp");
        kq5 kq5Var = this.f24158a;
        int i2 = kq5Var.e;
        if (i2 > 0) {
            if (hVar != null) {
                hVar = new m(hVar, i2, kq5Var.f);
            }
            kq5 kq5Var2 = this.f24158a;
            kq5Var2.e = 0;
            kq5Var2.f = (char) 0;
        }
        this.f24158a.c.add(hVar);
        kq5 kq5Var3 = this.f24158a;
        kq5Var3.g = -1;
        return kq5Var3.c.size() - 1;
    }

    public kq5 f(char c2) {
        e(new e(c2));
        return this;
    }

    public kq5 g(String str) {
        crd.i(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                e(new e(str.charAt(0)));
            } else {
                e(new p(str));
            }
        }
        return this;
    }

    public kq5 h(String str, String str2) {
        e(new l(str2, str));
        return this;
    }

    public kq5 i() {
        e(l.d);
        return this;
    }

    public kq5 j(z4p z4pVar, Map<Long, String> map) {
        crd.i(z4pVar, "field");
        crd.i(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        e(new q(z4pVar, textStyle, new a(new qcm.b(Collections.singletonMap(textStyle, linkedHashMap)))));
        return this;
    }

    public kq5 k(z4p z4pVar, TextStyle textStyle) {
        crd.i(z4pVar, "field");
        crd.i(textStyle, "textStyle");
        e(new q(z4pVar, textStyle, uq5.b()));
        return this;
    }

    public final kq5 l(k kVar) {
        k kVarF;
        kq5 kq5Var = this.f24158a;
        int i2 = kq5Var.g;
        if (i2 < 0 || !(kq5Var.c.get(i2) instanceof k)) {
            this.f24158a.g = e(kVar);
        } else {
            kq5 kq5Var2 = this.f24158a;
            int i3 = kq5Var2.g;
            k kVar2 = (k) kq5Var2.c.get(i3);
            int i4 = kVar.f24170b;
            int i5 = kVar.c;
            if (i4 == i5 && kVar.d == SignStyle.NOT_NEGATIVE) {
                kVarF = kVar2.g(i5);
                e(kVar.f());
                this.f24158a.g = i3;
            } else {
                kVarF = kVar2.f();
                this.f24158a.g = e(kVar);
            }
            this.f24158a.c.set(i3, kVarF);
        }
        return this;
    }

    public kq5 m(z4p z4pVar, int i2) {
        crd.i(z4pVar, "field");
        if (i2 >= 1 && i2 <= 19) {
            l(new k(z4pVar, i2, i2, SignStyle.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
    }

    public kq5 n(z4p z4pVar, int i2, int i3, SignStyle signStyle) {
        if (i2 == i3 && signStyle == SignStyle.NOT_NEGATIVE) {
            return m(z4pVar, i3);
        }
        crd.i(z4pVar, "field");
        crd.i(signStyle, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            l(new k(z4pVar, i2, i3, signStyle));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public kq5 o() {
        e(new r(h, "ZoneRegionId()"));
        return this;
    }

    public kq5 p(TextStyle textStyle) {
        e(new s(textStyle));
        return this;
    }

    public kq5 q() {
        kq5 kq5Var = this.f24158a;
        if (kq5Var.f24159b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (kq5Var.c.size() > 0) {
            kq5 kq5Var2 = this.f24158a;
            g gVar = new g(kq5Var2.c, kq5Var2.d);
            this.f24158a = this.f24158a.f24159b;
            e(gVar);
        } else {
            this.f24158a = this.f24158a.f24159b;
        }
        return this;
    }

    public kq5 r() {
        kq5 kq5Var = this.f24158a;
        kq5Var.g = -1;
        this.f24158a = new kq5(kq5Var, true);
        return this;
    }

    public kq5 s() {
        e(o.INSENSITIVE);
        return this;
    }

    public kq5 t() {
        e(o.SENSITIVE);
        return this;
    }

    public kq5 u() {
        e(o.LENIENT);
        return this;
    }

    public iq5 v() {
        return w(Locale.getDefault());
    }

    public iq5 w(Locale locale) {
        crd.i(locale, "locale");
        while (this.f24158a.f24159b != null) {
            q();
        }
        return new iq5(new g(this.c, false), locale, wr5.e, ResolverStyle.SMART, null, null, null);
    }

    public iq5 x(ResolverStyle resolverStyle) {
        return v().m(resolverStyle);
    }

    public kq5(kq5 kq5Var, boolean z) {
        this.f24158a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.f24159b = kq5Var;
        this.d = z;
    }
}
