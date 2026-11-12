package org.threeten.bp.chrono;

import com.huami.moving.ui.utils.SportDeviceUtils;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.threeten.bp.Clock;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjuster;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes23.dex */
public final class HijrahDate extends org.threeten.bp.chrono.a<HijrahDate> implements Serializable {
    private static final Long[] A;
    private static final Integer[] B;
    private static final Integer[] C;
    private static final Integer[] D;
    private static final Integer[] E;
    private static final Integer[] F;
    private static final Integer[] G;
    private static final Integer[] H;
    private static final Integer[] I;
    private static final int J = 334;
    private static final int K = -492148;
    public static final int MAX_VALUE_OF_ERA = 9999;
    public static final int MIN_VALUE_OF_ERA = 1;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;
    private static final int[] n;
    private static final int[] o;
    private static final int[] p;
    private static final int q = 5;
    private static final int r = 6;
    private static final int[] s;
    private static final long serialVersionUID = -5207853542612002020L;
    private static final char t;
    private static final String u;
    private static final String v = "hijrah_deviation.cfg";
    private static final String w;
    private static final HashMap<Integer, Integer[]> x;
    private static final HashMap<Integer, Integer[]> y;
    private static final HashMap<Integer, Integer[]> z;
    private final transient HijrahEra b;
    private final transient int c;
    private final transient int d;
    private final transient int e;
    private final transient int f;
    private final transient DayOfWeek g;
    private final long h;
    private final transient boolean i;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChronoField.values().length];
            a = iArr;
            try {
                iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ChronoField.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ChronoField.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ChronoField.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ChronoField.YEAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ChronoField.ERA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int[] iArr = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, SportDeviceUtils.SOURCE_ZURICH_W};
        j = iArr;
        k = new int[]{0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, SportDeviceUtils.SOURCE_ZURICH_W};
        l = new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
        m = new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
        n = new int[]{0, 1, 0, 1, 0, 1, 1};
        o = new int[]{1, 9999, 11, 51, 5, 29, 354};
        p = new int[]{1, 9999, 11, 52, 6, 30, 355};
        s = new int[]{0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
        char c = File.separatorChar;
        t = c;
        u = File.pathSeparator;
        w = "org" + c + "threeten" + c + "bp" + c + "chrono";
        x = new HashMap<>();
        y = new HashMap<>();
        z = new HashMap<>();
        E = new Integer[iArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = j;
            if (i2 >= iArr2.length) {
                break;
            }
            E[i2] = Integer.valueOf(iArr2[i2]);
            i2++;
        }
        F = new Integer[k.length];
        int i3 = 0;
        while (true) {
            int[] iArr3 = k;
            if (i3 >= iArr3.length) {
                break;
            }
            F[i3] = Integer.valueOf(iArr3[i3]);
            i3++;
        }
        G = new Integer[l.length];
        int i4 = 0;
        while (true) {
            int[] iArr4 = l;
            if (i4 >= iArr4.length) {
                break;
            }
            G[i4] = Integer.valueOf(iArr4[i4]);
            i4++;
        }
        H = new Integer[m.length];
        int i5 = 0;
        while (true) {
            int[] iArr5 = m;
            if (i5 >= iArr5.length) {
                break;
            }
            H[i5] = Integer.valueOf(iArr5[i5]);
            i5++;
        }
        I = new Integer[s.length];
        int i6 = 0;
        while (true) {
            int[] iArr6 = s;
            if (i6 >= iArr6.length) {
                break;
            }
            I[i6] = Integer.valueOf(iArr6[i6]);
            i6++;
        }
        A = new Long[J];
        int i7 = 0;
        while (true) {
            Long[] lArr = A;
            if (i7 >= lArr.length) {
                break;
            }
            lArr[i7] = Long.valueOf(i7 * 10631);
            i7++;
        }
        B = new Integer[n.length];
        int i8 = 0;
        while (true) {
            int[] iArr7 = n;
            if (i8 >= iArr7.length) {
                break;
            }
            B[i8] = Integer.valueOf(iArr7[i8]);
            i8++;
        }
        C = new Integer[o.length];
        int i9 = 0;
        while (true) {
            int[] iArr8 = o;
            if (i9 >= iArr8.length) {
                break;
            }
            C[i9] = Integer.valueOf(iArr8[i9]);
            i9++;
        }
        D = new Integer[p.length];
        while (true) {
            int[] iArr9 = p;
            if (i >= iArr9.length) {
                try {
                    Q();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            } else {
                D[i] = Integer.valueOf(iArr9[i]);
                i++;
            }
        }
    }

    private HijrahDate(long j2) {
        int[] iArrY = y(j2);
        o(iArrY[1]);
        n(iArrY[2]);
        k(iArrY[3]);
        m(iArrY[4]);
        this.b = HijrahEra.of(iArrY[0]);
        int i = iArrY[1];
        this.c = i;
        this.d = iArrY[2];
        this.e = iArrY[3];
        this.f = iArrY[4];
        this.g = DayOfWeek.of(iArrY[5]);
        this.h = j2;
        this.i = I(i);
    }

    public static int A() {
        return D[6].intValue();
    }

    private static int B(int i, int i2) {
        return q(i2)[i].intValue();
    }

    public static int C(int i, int i2) {
        return r(i2)[i].intValue();
    }

    private static int D(int i, int i2) {
        Integer[] numArrQ = q(i2);
        int i3 = 0;
        if (i >= 0) {
            while (i3 < numArrQ.length) {
                if (i < numArrQ[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 11;
        }
        int i4 = I((long) i2) ? i + 355 : i + 354;
        while (i3 < numArrQ.length) {
            if (i4 < numArrQ[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 11;
    }

    public static int E() {
        return C[5].intValue();
    }

    public static int F() {
        return C[6].intValue();
    }

    private static int G(int i, long j2) {
        Integer[] numArrP = p(i);
        int i2 = 0;
        if (j2 == 0) {
            return 0;
        }
        if (j2 > 0) {
            while (i2 < numArrP.length) {
                if (j2 < numArrP[i2].intValue()) {
                    return i2 - 1;
                }
                i2++;
            }
            return 29;
        }
        long j3 = -j2;
        while (i2 < numArrP.length) {
            if (j3 <= numArrP[i2].intValue()) {
                return i2 - 1;
            }
            i2++;
        }
        return 29;
    }

    public static int H(int i) {
        Integer[] numArr;
        int i2 = i - 1;
        int i3 = i2 / 30;
        try {
            numArr = z.get(Integer.valueOf(i3));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return I((long) i) ? 355 : 354;
        }
        int i4 = i2 % 30;
        if (i4 != 29) {
            return numArr[i4 + 1].intValue() - numArr[i4].intValue();
        }
        Long[] lArr = A;
        return (lArr[i3 + 1].intValue() - lArr[i3].intValue()) - numArr[i4].intValue();
    }

    public static boolean I(long j2) {
        if (j2 <= 0) {
            j2 = -j2;
        }
        return ((j2 * 11) + 14) % 30 < 11;
    }

    public static HijrahDate J(LocalDate localDate) {
        return new HijrahDate(localDate.toEpochDay());
    }

    public static HijrahDate K(HijrahEra hijrahEra, int i, int i2, int i3) {
        Jdk8Methods.requireNonNull(hijrahEra, "era");
        o(i);
        n(i2);
        k(i3);
        return new HijrahDate(x(hijrahEra.a(i), i2, i3));
    }

    public static HijrahDate L(long j2) {
        return new HijrahDate(j2);
    }

    private static void M(String str, int i) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(58);
            if (iIndexOf == -1) {
                throw new ParseException("Offset has incorrect format at line " + i + ".", i);
            }
            try {
                int i2 = Integer.parseInt(strNextToken.substring(iIndexOf + 1, strNextToken.length()));
                int iIndexOf2 = strNextToken.indexOf(45);
                if (iIndexOf2 == -1) {
                    throw new ParseException("Start and end year/month has incorrect format at line " + i + ".", i);
                }
                String strSubstring = strNextToken.substring(0, iIndexOf2);
                String strSubstring2 = strNextToken.substring(iIndexOf2 + 1, iIndexOf);
                int iIndexOf3 = strSubstring.indexOf(47);
                int iIndexOf4 = strSubstring2.indexOf(47);
                if (iIndexOf3 == -1) {
                    throw new ParseException("Start year/month has incorrect format at line " + i + ".", i);
                }
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                String strSubstring4 = strSubstring.substring(iIndexOf3 + 1, strSubstring.length());
                try {
                    int i3 = Integer.parseInt(strSubstring3);
                    try {
                        int i4 = Integer.parseInt(strSubstring4);
                        if (iIndexOf4 == -1) {
                            throw new ParseException("End year/month has incorrect format at line " + i + ".", i);
                        }
                        String strSubstring5 = strSubstring2.substring(0, iIndexOf4);
                        String strSubstring6 = strSubstring2.substring(iIndexOf4 + 1, strSubstring2.length());
                        try {
                            int i5 = Integer.parseInt(strSubstring5);
                            try {
                                int i6 = Integer.parseInt(strSubstring6);
                                if (i3 == -1 || i4 == -1 || i5 == -1 || i6 == -1) {
                                    throw new ParseException("Unknown error at line " + i + ".", i);
                                }
                                j(i3, i4, i5, i6, i2);
                            } catch (NumberFormatException unused) {
                                throw new ParseException("End month is not properly set at line " + i + ".", i);
                            }
                        } catch (NumberFormatException unused2) {
                            throw new ParseException("End year is not properly set at line " + i + ".", i);
                        }
                    } catch (NumberFormatException unused3) {
                        throw new ParseException("Start month is not properly set at line " + i + ".", i);
                    }
                } catch (NumberFormatException unused4) {
                    throw new ParseException("Start year is not properly set at line " + i + ".", i);
                }
            } catch (NumberFormatException unused5) {
                throw new ParseException("Offset is not properly set at line " + i + ".", i);
            }
        }
    }

    private static void Q() throws Throwable {
        InputStream inputStreamS = s();
        if (inputStreamS == null) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamS));
            int i = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        bufferedReader2.close();
                        return;
                    } else {
                        i++;
                        M(line.trim(), i);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ChronoLocalDate R(DataInput dataInput) throws IOException {
        return HijrahChronology.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }

    private static HijrahDate S(int i, int i2, int i3) {
        int iB = B(i2 - 1, i);
        if (i3 > iB) {
            i3 = iB;
        }
        return of(i, i2, i3);
    }

    private static long U(int i) {
        Long lValueOf;
        int i2 = i - 1;
        int i3 = i2 / 30;
        int i4 = i2 % 30;
        int iIntValue = p(i3)[Math.abs(i4)].intValue();
        if (i4 < 0) {
            iIntValue = -iIntValue;
        }
        try {
            lValueOf = A[i3];
        } catch (ArrayIndexOutOfBoundsException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(i3 * 10631);
        }
        return ((lValueOf.longValue() + ((long) iIntValue)) - 492148) - 1;
    }

    public static HijrahDate from(TemporalAccessor temporalAccessor) {
        return HijrahChronology.INSTANCE.date(temporalAccessor);
    }

    private static void j(int i, int i2, int i3, int i4, int i5) {
        if (i < 1) {
            throw new IllegalArgumentException("startYear < 1");
        }
        if (i3 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        }
        if (i2 < 0 || i2 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        }
        if (i4 < 0 || i4 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        }
        if (i3 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        }
        if (i3 < i) {
            throw new IllegalArgumentException("startYear > endYear");
        }
        if (i3 == i && i4 < i2) {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
        boolean zI = I(i);
        Integer[] numArr = x.get(Integer.valueOf(i));
        if (numArr == null) {
            if (!zI) {
                numArr = new Integer[j.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = j;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    numArr[i6] = Integer.valueOf(iArr[i6]);
                    i6++;
                }
            } else {
                numArr = new Integer[k.length];
                int i7 = 0;
                while (true) {
                    int[] iArr2 = k;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    numArr[i7] = Integer.valueOf(iArr2[i7]);
                    i7++;
                }
            }
        }
        Integer[] numArr2 = new Integer[numArr.length];
        for (int i8 = 0; i8 < 12; i8++) {
            if (i8 > i2) {
                numArr2[i8] = Integer.valueOf(numArr[i8].intValue() - i5);
            } else {
                numArr2[i8] = Integer.valueOf(numArr[i8].intValue());
            }
        }
        x.put(Integer.valueOf(i), numArr2);
        Integer[] numArr3 = y.get(Integer.valueOf(i));
        if (numArr3 == null) {
            if (!zI) {
                numArr3 = new Integer[l.length];
                int i9 = 0;
                while (true) {
                    int[] iArr3 = l;
                    if (i9 >= iArr3.length) {
                        break;
                    }
                    numArr3[i9] = Integer.valueOf(iArr3[i9]);
                    i9++;
                }
            } else {
                numArr3 = new Integer[m.length];
                int i10 = 0;
                while (true) {
                    int[] iArr4 = m;
                    if (i10 >= iArr4.length) {
                        break;
                    }
                    numArr3[i10] = Integer.valueOf(iArr4[i10]);
                    i10++;
                }
            }
        }
        Integer[] numArr4 = new Integer[numArr3.length];
        for (int i11 = 0; i11 < 12; i11++) {
            if (i11 == i2) {
                numArr4[i11] = Integer.valueOf(numArr3[i11].intValue() - i5);
            } else {
                numArr4[i11] = Integer.valueOf(numArr3[i11].intValue());
            }
        }
        y.put(Integer.valueOf(i), numArr4);
        if (i != i3) {
            int i12 = i - 1;
            int i13 = i12 / 30;
            int i14 = i12 % 30;
            Integer[] numArr5 = z.get(Integer.valueOf(i13));
            if (numArr5 == null) {
                int length = s.length;
                Integer[] numArr6 = new Integer[length];
                for (int i15 = 0; i15 < length; i15++) {
                    numArr6[i15] = Integer.valueOf(s[i15]);
                }
                numArr5 = numArr6;
            }
            for (int i16 = i14 + 1; i16 < s.length; i16++) {
                numArr5[i16] = Integer.valueOf(numArr5[i16].intValue() - i5);
            }
            z.put(Integer.valueOf(i13), numArr5);
            int i17 = i3 - 1;
            int i18 = i17 / 30;
            if (i13 != i18) {
                int i19 = i13 + 1;
                while (true) {
                    Long[] lArr = A;
                    if (i19 >= lArr.length) {
                        break;
                    }
                    lArr[i19] = Long.valueOf(lArr[i19].longValue() - ((long) i5));
                    i19++;
                }
                int i20 = i18 + 1;
                while (true) {
                    Long[] lArr2 = A;
                    if (i20 >= lArr2.length) {
                        break;
                    }
                    lArr2[i20] = Long.valueOf(lArr2[i20].longValue() + ((long) i5));
                    i20++;
                    i18 = i18;
                }
            }
            int i21 = i18;
            int i22 = i17 % 30;
            Integer[] numArr7 = z.get(Integer.valueOf(i21));
            if (numArr7 == null) {
                int length2 = s.length;
                Integer[] numArr8 = new Integer[length2];
                for (int i23 = 0; i23 < length2; i23++) {
                    numArr8[i23] = Integer.valueOf(s[i23]);
                }
                numArr7 = numArr8;
            }
            for (int i24 = i22 + 1; i24 < s.length; i24++) {
                numArr7[i24] = Integer.valueOf(numArr7[i24].intValue() + i5);
            }
            z.put(Integer.valueOf(i21), numArr7);
        }
        boolean zI2 = I(i3);
        Integer[] numArr9 = x.get(Integer.valueOf(i3));
        if (numArr9 == null) {
            if (!zI2) {
                numArr9 = new Integer[j.length];
                int i25 = 0;
                while (true) {
                    int[] iArr5 = j;
                    if (i25 >= iArr5.length) {
                        break;
                    }
                    numArr9[i25] = Integer.valueOf(iArr5[i25]);
                    i25++;
                }
            } else {
                numArr9 = new Integer[k.length];
                int i26 = 0;
                while (true) {
                    int[] iArr6 = k;
                    if (i26 >= iArr6.length) {
                        break;
                    }
                    numArr9[i26] = Integer.valueOf(iArr6[i26]);
                    i26++;
                }
            }
        }
        Integer[] numArr10 = new Integer[numArr9.length];
        for (int i27 = 0; i27 < 12; i27++) {
            if (i27 > i4) {
                numArr10[i27] = Integer.valueOf(numArr9[i27].intValue() + i5);
            } else {
                numArr10[i27] = Integer.valueOf(numArr9[i27].intValue());
            }
        }
        x.put(Integer.valueOf(i3), numArr10);
        Integer[] numArr11 = y.get(Integer.valueOf(i3));
        if (numArr11 == null) {
            if (!zI2) {
                numArr11 = new Integer[l.length];
                int i28 = 0;
                while (true) {
                    int[] iArr7 = l;
                    if (i28 >= iArr7.length) {
                        break;
                    }
                    numArr11[i28] = Integer.valueOf(iArr7[i28]);
                    i28++;
                }
            } else {
                numArr11 = new Integer[m.length];
                int i29 = 0;
                while (true) {
                    int[] iArr8 = m;
                    if (i29 >= iArr8.length) {
                        break;
                    }
                    numArr11[i29] = Integer.valueOf(iArr8[i29]);
                    i29++;
                }
            }
        }
        Integer[] numArr12 = new Integer[numArr11.length];
        for (int i30 = 0; i30 < 12; i30++) {
            if (i30 == i4) {
                numArr12[i30] = Integer.valueOf(numArr11[i30].intValue() + i5);
            } else {
                numArr12[i30] = Integer.valueOf(numArr11[i30].intValue());
            }
        }
        HashMap<Integer, Integer[]> map = y;
        map.put(Integer.valueOf(i3), numArr12);
        Integer[] numArr13 = map.get(Integer.valueOf(i));
        Integer[] numArr14 = map.get(Integer.valueOf(i3));
        HashMap<Integer, Integer[]> map2 = x;
        Integer[] numArr15 = map2.get(Integer.valueOf(i));
        Integer[] numArr16 = map2.get(Integer.valueOf(i3));
        int iIntValue = numArr13[i2].intValue();
        int iIntValue2 = numArr14[i4].intValue();
        int iIntValue3 = numArr15[11].intValue() + numArr13[11].intValue();
        int iIntValue4 = numArr16[11].intValue() + numArr14[11].intValue();
        Integer[] numArr17 = D;
        int iIntValue5 = numArr17[5].intValue();
        Integer[] numArr18 = C;
        int iIntValue6 = numArr18[5].intValue();
        if (iIntValue5 < iIntValue) {
            iIntValue5 = iIntValue;
        }
        if (iIntValue5 < iIntValue2) {
            iIntValue5 = iIntValue2;
        }
        numArr17[5] = Integer.valueOf(iIntValue5);
        if (iIntValue6 <= iIntValue) {
            iIntValue = iIntValue6;
        }
        if (iIntValue <= iIntValue2) {
            iIntValue2 = iIntValue;
        }
        numArr18[5] = Integer.valueOf(iIntValue2);
        int iIntValue7 = numArr17[6].intValue();
        int iIntValue8 = numArr18[6].intValue();
        if (iIntValue7 < iIntValue3) {
            iIntValue7 = iIntValue3;
        }
        if (iIntValue7 < iIntValue4) {
            iIntValue7 = iIntValue4;
        }
        numArr17[6] = Integer.valueOf(iIntValue7);
        if (iIntValue8 <= iIntValue3) {
            iIntValue3 = iIntValue8;
        }
        if (iIntValue3 <= iIntValue4) {
            iIntValue4 = iIntValue3;
        }
        numArr18[6] = Integer.valueOf(iIntValue4);
    }

    private static void k(int i) {
        if (i < 1 || i > z()) {
            throw new DateTimeException("Invalid day of month of Hijrah date, day " + i + " greater than " + z() + " or less than 1");
        }
    }

    private static void m(int i) {
        if (i < 1 || i > A()) {
            throw new DateTimeException("Invalid day of year of Hijrah date");
        }
    }

    private static void n(int i) {
        if (i < 1 || i > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
    }

    public static HijrahDate now() {
        return now(Clock.systemDefaultZone());
    }

    private static void o(int i) {
        if (i < 1 || i > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
    }

    public static HijrahDate of(int i, int i2, int i3) {
        return i >= 1 ? K(HijrahEra.AH, i, i2, i3) : K(HijrahEra.BEFORE_AH, 1 - i, i2, i3);
    }

    private static Integer[] p(int i) {
        Integer[] numArr;
        try {
            numArr = z.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? I : numArr;
    }

    private static Integer[] q(int i) {
        Integer[] numArr;
        try {
            numArr = x.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return I((long) i) ? F : E;
        }
        return numArr;
    }

    private static Integer[] r(int i) {
        Integer[] numArr;
        try {
            numArr = y.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return I((long) i) ? H : G;
        }
        return numArr;
    }

    private Object readResolve() {
        return new HijrahDate(this.h);
    }

    private static InputStream s() throws IOException {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = v;
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                property2 = property2 + System.getProperty("file.separator");
            }
            File file = new File(property2 + t + property);
            if (!file.exists()) {
                return null;
            }
            try {
                return new FileInputStream(file);
            } catch (IOException e) {
                throw e;
            }
        }
        StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), u);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            File file2 = new File(strNextToken);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strNextToken);
                    char c = t;
                    sb.append(c);
                    String str = w;
                    sb.append(str);
                    if (new File(sb.toString(), property).exists()) {
                        try {
                            return new FileInputStream(strNextToken + c + str + c + property);
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                } else {
                    try {
                        zipFile = new ZipFile(file2);
                    } catch (IOException unused) {
                        zipFile = null;
                    }
                    if (zipFile != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w);
                        char c2 = t;
                        sb2.append(c2);
                        sb2.append(property);
                        String string = sb2.toString();
                        ZipEntry entry = zipFile.getEntry(string);
                        if (entry == null) {
                            if (c2 == '/') {
                                string = string.replace('/', '\\');
                            } else if (c2 == '\\') {
                                string = string.replace('\\', '/');
                            }
                            entry = zipFile.getEntry(string);
                        }
                        if (entry != null) {
                            try {
                                return zipFile.getInputStream(entry);
                            } catch (IOException e3) {
                                throw e3;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private static int t(long j2) {
        Long[] lArr = A;
        for (int i = 0; i < lArr.length; i++) {
            try {
                if (j2 < lArr[i].longValue()) {
                    return i - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j2) / 10631;
            }
        }
        return ((int) j2) / 10631;
    }

    private static int u(long j2, int i) {
        Long lValueOf;
        try {
            lValueOf = A[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(i * 10631);
        }
        return (int) (j2 - lValueOf.longValue());
    }

    private static int v(int i, int i2, int i3) {
        int iIntValue;
        Integer[] numArrQ = q(i3);
        if (i < 0) {
            i = I((long) i3) ? i + 355 : i + 354;
            if (i2 <= 0) {
                return i;
            }
            iIntValue = numArrQ[i2].intValue();
        } else {
            if (i2 <= 0) {
                return i;
            }
            iIntValue = numArrQ[i2].intValue();
        }
        return i - iIntValue;
    }

    private static int w(int i, int i2, int i3) {
        Integer[] numArrP = p(i);
        return i2 > 0 ? i2 - numArrP[i3].intValue() : numArrP[i3].intValue() + i2;
    }

    private Object writeReplace() {
        return new e((byte) 3, this);
    }

    private static long x(int i, int i2, int i3) {
        return U(i) + ((long) B(i2 - 1, i)) + ((long) i3);
    }

    private static int[] y(long j2) {
        int iD;
        int iV;
        int value;
        int iW;
        int i;
        long j3 = j2 - (-492148);
        if (j3 >= 0) {
            int iT = t(j3);
            int iU = u(j3, iT);
            int iG = G(iT, iU);
            iW = w(iT, iU, iG);
            i = (iT * 30) + iG + 1;
            iD = D(iW, i);
            iV = v(iW, iD, i) + 1;
            value = HijrahEra.AH.getValue();
        } else {
            int i2 = (int) j3;
            int i3 = i2 / 10631;
            int i4 = i2 % 10631;
            if (i4 == 0) {
                i4 = -10631;
                i3++;
            }
            int iG2 = G(i3, i4);
            int iW2 = w(i3, i4, iG2);
            int i5 = 1 - ((i3 * 30) - iG2);
            int i6 = I((long) i5) ? iW2 + 355 : iW2 + 354;
            iD = D(i6, i5);
            iV = v(i6, iD, i5) + 1;
            value = HijrahEra.BEFORE_AH.getValue();
            iW = i6;
            i = i5;
        }
        int i7 = (int) ((j3 + 5) % 7);
        return new int[]{value, i, iD + 1, iV, iW + 1, i7 + (i7 <= 0 ? 7 : 0)};
    }

    public static int z() {
        return D[5].intValue();
    }

    @Override // org.threeten.bp.chrono.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public HijrahDate f(long j2) {
        return new HijrahDate(this.h + j2);
    }

    @Override // org.threeten.bp.chrono.a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public HijrahDate g(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i = (this.d - 1) + ((int) j2);
        int iSafeSubtract = i / 12;
        int i2 = i % 12;
        while (i2 < 0) {
            i2 += 12;
            iSafeSubtract = Jdk8Methods.safeSubtract(iSafeSubtract, 1);
        }
        return K(this.b, Jdk8Methods.safeAdd(this.c, iSafeSubtract), i2 + 1, this.e);
    }

    @Override // org.threeten.bp.chrono.a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public HijrahDate i(long j2) {
        if (j2 == 0) {
            return this;
        }
        return K(this.b, Jdk8Methods.safeAdd(this.c, (int) j2), this.d, this.e);
    }

    public void T(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(ChronoField.YEAR));
        dataOutput.writeByte(get(ChronoField.MONTH_OF_YEAR));
        dataOutput.writeByte(get(ChronoField.DAY_OF_MONTH));
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.ChronoLocalDate
    public final ChronoLocalDateTime<HijrahDate> atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int value;
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        switch (a.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                value = this.e;
                return value;
            case 2:
                value = this.f;
                return value;
            case 3:
                i = (this.e - 1) / 7;
                value = i + 1;
                return value;
            case 4:
                value = this.c;
                return value;
            case 5:
                value = this.g.getValue();
                return value;
            case 6:
                i = (this.e - 1) % 7;
                value = i + 1;
                return value;
            case 7:
                i = (this.f - 1) % 7;
                value = i + 1;
                return value;
            case 8:
                return toEpochDay();
            case 9:
                i = (this.f - 1) / 7;
                value = i + 1;
                return value;
            case 10:
                value = this.d;
                return value;
            case 11:
                value = this.c;
                return value;
            case 12:
                value = this.b.getValue();
                return value;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public boolean isLeapYear() {
        return this.i;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        return C(this.d - 1, this.c);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return H(this.c);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.rangeRefinedBy(this);
        }
        if (!isSupported(temporalField)) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = a.a[chronoField.ordinal()];
        if (i == 1) {
            return ValueRange.of(1L, lengthOfMonth());
        }
        if (i == 2) {
            return ValueRange.of(1L, lengthOfYear());
        }
        if (i != 3) {
            return i != 4 ? getChronology().range(chronoField) : ValueRange.of(1L, 1000L);
        }
        return ValueRange.of(1L, 5L);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public long toEpochDay() {
        return x(this.c, this.d, this.e);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.temporal.Temporal
    public /* bridge */ /* synthetic */ long until(Temporal temporal, TemporalUnit temporalUnit) {
        return super.until(temporal, temporalUnit);
    }

    public static HijrahDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public HijrahChronology getChronology() {
        return HijrahChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public HijrahEra getEra() {
        return this.b;
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.ChronoLocalDate
    public /* bridge */ /* synthetic */ ChronoPeriod until(ChronoLocalDate chronoLocalDate) {
        return super.until(chronoLocalDate);
    }

    public static HijrahDate now(Clock clock) {
        return HijrahChronology.INSTANCE.dateNow(clock);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public HijrahDate minus(TemporalAmount temporalAmount) {
        return (HijrahDate) super.minus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public HijrahDate with(TemporalAdjuster temporalAdjuster) {
        return (HijrahDate) super.with(temporalAdjuster);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public HijrahDate minus(long j2, TemporalUnit temporalUnit) {
        return (HijrahDate) super.minus(j2, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public HijrahDate plus(TemporalAmount temporalAmount) {
        return (HijrahDate) super.plus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public HijrahDate with(TemporalField temporalField, long j2) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j2);
            int i = (int) j2;
            switch (a.a[chronoField.ordinal()]) {
                case 1:
                    return S(this.c, this.d, i);
                case 2:
                    int i2 = i - 1;
                    return S(this.c, (i2 / 30) + 1, (i2 % 30) + 1);
                case 3:
                    return f((j2 - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    if (this.c < 1) {
                        i = 1 - i;
                    }
                    return S(i, this.d, this.e);
                case 5:
                    return f(j2 - ((long) this.g.getValue()));
                case 6:
                    return f(j2 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return f(j2 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return new HijrahDate(i);
                case 9:
                    return f((j2 - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 10:
                    return S(this.c, i, this.e);
                case 11:
                    return S(i, this.d, this.e);
                case 12:
                    return S(1 - this.c, this.d, this.e);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
        }
        return (HijrahDate) temporalField.adjustInto(this, j2);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public HijrahDate plus(long j2, TemporalUnit temporalUnit) {
        return (HijrahDate) super.plus(j2, temporalUnit);
    }
}
