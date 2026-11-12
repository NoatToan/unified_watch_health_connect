package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class SsaStyle {
    private static final String i = "SsaStyle";
    public static final int j = -1;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 4;
    public static final int o = 5;
    public static final int p = 6;
    public static final int q = 7;
    public static final int r = 8;
    public static final int s = 9;
    public final String a;
    public final int b;

    @Nullable
    @ColorInt
    public final Integer c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        private a(int nameIndex, int alignmentIndex, int primaryColorIndex, int fontSizeIndex, int boldIndex, int italicIndex, int underlineIndex, int strikeoutIndex, int length) {
            this.a = nameIndex;
            this.b = alignmentIndex;
            this.c = primaryColorIndex;
            this.d = fontSizeIndex;
            this.e = boldIndex;
            this.f = italicIndex;
            this.g = underlineIndex;
            this.h = strikeoutIndex;
            this.i = length;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:7:0x002d  */
        @Nullable
        public static a a(String styleFormatLine) {
            String[] strArrSplit = TextUtils.split(styleFormatLine.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[i9].trim());
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "italic":
                        i6 = i9;
                        break;
                    case "underline":
                        i7 = i9;
                        break;
                    case "strikeout":
                        i8 = i9;
                        break;
                    case "primarycolour":
                        i3 = i9;
                        break;
                    case "bold":
                        i5 = i9;
                        break;
                    case "name":
                        i = i9;
                        break;
                    case "fontsize":
                        i4 = i9;
                        break;
                    case "alignment":
                        i2 = i9;
                        break;
                }
            }
            if (i != -1) {
                return new a(i, i2, i3, i4, i5, i6, i7, i8, strArrSplit.length);
            }
            return null;
        }
    }

    public static final class b {
        private static final String c = "SsaStyle.Overrides";
        private static final Pattern d = Pattern.compile("\\{([^}]*)\\}");
        private static final String e = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern f = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", e));
        private static final Pattern g = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", e));
        private static final Pattern h = Pattern.compile("\\\\an(\\d+)");
        public final int a;

        @Nullable
        public final PointF b;

        private b(int alignment, @Nullable PointF position) {
            this.a = alignment;
            this.b = position;
        }

        private static int a(String braceContents) {
            Matcher matcher = h.matcher(braceContents);
            if (matcher.find()) {
                return SsaStyle.d((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String text) {
            Matcher matcher = d.matcher(text);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str = (String) Assertions.checkNotNull(matcher.group(1));
                try {
                    PointF pointFC = c(str);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str);
                    if (iA != -1) {
                        i = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i, pointF);
        }

        @Nullable
        private static PointF c(String styleOverride) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f.matcher(styleOverride);
            Matcher matcher2 = g.matcher(styleOverride);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(styleOverride).length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(styleOverride);
                    sb.append("'");
                    Log.i(c, sb.toString());
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.checkNotNull(strGroup)).trim()), Float.parseFloat(((String) Assertions.checkNotNull(strGroup2)).trim()));
        }

        public static String d(String dialogueLine) {
            return d.matcher(dialogueLine).replaceAll("");
        }
    }

    private SsaStyle(String name, int alignment, @Nullable @ColorInt Integer primaryColor, float fontSize, boolean bold, boolean italic, boolean underline, boolean strikeout) {
        this.a = name;
        this.b = alignment;
        this.c = primaryColor;
        this.d = fontSize;
        this.e = bold;
        this.f = italic;
        this.g = underline;
        this.h = strikeout;
    }

    @Nullable
    public static SsaStyle b(String styleLine, a format) {
        Assertions.checkArgument(styleLine.startsWith(SsaDecoder.w));
        String[] strArrSplit = TextUtils.split(styleLine.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = format.i;
        if (length != i2) {
            Log.w(i, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(strArrSplit.length), styleLine));
            return null;
        }
        try {
            String strTrim = strArrSplit[format.a].trim();
            int i3 = format.b;
            int iD = i3 != -1 ? d(strArrSplit[i3].trim()) : -1;
            int i4 = format.c;
            Integer numF = i4 != -1 ? f(strArrSplit[i4].trim()) : null;
            int i5 = format.d;
            float fG = i5 != -1 ? g(strArrSplit[i5].trim()) : -3.4028235E38f;
            int i6 = format.e;
            boolean z = i6 != -1 && e(strArrSplit[i6].trim());
            int i7 = format.f;
            boolean z2 = i7 != -1 && e(strArrSplit[i7].trim());
            int i8 = format.g;
            boolean z3 = i8 != -1 && e(strArrSplit[i8].trim());
            int i9 = format.h;
            return new SsaStyle(strTrim, iD, numF, fG, z, z2, z3, i9 != -1 && e(strArrSplit[i9].trim()));
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(styleLine.length() + 36);
            sb.append("Skipping malformed 'Style:' line: '");
            sb.append(styleLine);
            sb.append("'");
            Log.w(i, sb.toString(), e);
            return null;
        }
    }

    private static boolean c(int alignment) {
        switch (alignment) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String alignmentStr) {
        try {
            int i2 = Integer.parseInt(alignmentStr.trim());
            if (c(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        String strValueOf = String.valueOf(alignmentStr);
        Log.w(i, strValueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(strValueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    private static boolean e(String booleanValue) {
        try {
            int i2 = Integer.parseInt(booleanValue);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(booleanValue).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(booleanValue);
            sb.append("'");
            Log.w(i, sb.toString(), e);
            return false;
        }
    }

    @Nullable
    @ColorInt
    public static Integer f(String ssaColorExpression) {
        try {
            long j2 = ssaColorExpression.startsWith("&H") ? Long.parseLong(ssaColorExpression.substring(2), 16) : Long.parseLong(ssaColorExpression);
            Assertions.checkArgument(j2 <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j2 >> 24) & 255) ^ 255), Ints.checkedCast(j2 & 255), Ints.checkedCast((j2 >> 8) & 255), Ints.checkedCast((j2 >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(ssaColorExpression).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(ssaColorExpression);
            sb.append("'");
            Log.w(i, sb.toString(), e);
            return null;
        }
    }

    private static float g(String fontSize) {
        try {
            return Float.parseFloat(fontSize);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(fontSize).length() + 29);
            sb.append("Failed to parse font size: '");
            sb.append(fontSize);
            sb.append("'");
            Log.w(i, sb.toString(), e);
            return -3.4028235E38f;
        }
    }
}
