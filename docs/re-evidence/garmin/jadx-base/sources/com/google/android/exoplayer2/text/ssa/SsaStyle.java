package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    public static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26) {
            this.nameIndex = i14;
            this.alignmentIndex = i15;
            this.primaryColorIndex = i16;
            this.fontSizeIndex = i17;
            this.boldIndex = i18;
            this.italicIndex = i19;
            this.underlineIndex = i24;
            this.strikeoutIndex = i25;
            this.length = i26;
        }

        public static Format fromFormatLine(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i24 = -1;
            int i25 = -1;
            for (int i26 = 0; i26 < strArrSplit.length; i26++) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[i26].trim());
                lowerCase.getClass();
                switch (lowerCase) {
                    case "italic":
                        i19 = i26;
                        break;
                    case "underline":
                        i24 = i26;
                        break;
                    case "strikeout":
                        i25 = i26;
                        break;
                    case "primarycolour":
                        i16 = i26;
                        break;
                    case "bold":
                        i18 = i26;
                        break;
                    case "name":
                        i14 = i26;
                        break;
                    case "fontsize":
                        i17 = i26;
                        break;
                    case "alignment":
                        i15 = i26;
                        break;
                }
            }
            if (i14 != -1) {
                return new Format(i14, i15, i16, i17, i18, i19, i24, i25, strArrSplit.length);
            }
            return null;
        }
    }

    public static final class Overrides {
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;
        public final PointF position;
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");

        private Overrides(int i14, PointF pointF) {
            this.alignment = i14;
            this.position = pointF;
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return SsaStyle.parseAlignment((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static Overrides parseFromDialogue(String str) {
            Matcher matcher = BRACES_PATTERN.matcher(str);
            PointF pointF = null;
            int i14 = -1;
            while (matcher.find()) {
                String str2 = (String) Assertions.checkNotNull(matcher.group(1));
                try {
                    PointF position = parsePosition(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int alignmentOverride = parseAlignmentOverride(str2);
                    if (alignmentOverride != -1) {
                        i14 = alignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new Overrides(i14, pointF);
        }

        private static PointF parsePosition(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    StringBuilder sb3 = new StringBuilder(v.a(82, str));
                    sb3.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb3.append(str);
                    sb3.append("'");
                    Log.i(TAG, sb3.toString());
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

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    private SsaStyle(String str, int i14, Integer num, float f14, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.name = str;
        this.alignment = i14;
        this.primaryColor = num;
        this.fontSize = f14;
        this.bold = z14;
        this.italic = z15;
        this.underline = z16;
        this.strikeout = z17;
    }

    public static SsaStyle fromStyleLine(String str, Format format) {
        Assertions.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i14 = format.length;
        if (length != i14) {
            Log.w(TAG, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i14), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[format.nameIndex].trim();
            int i15 = format.alignmentIndex;
            int alignment = i15 != -1 ? parseAlignment(strArrSplit[i15].trim()) : -1;
            int i16 = format.primaryColorIndex;
            Integer color = i16 != -1 ? parseColor(strArrSplit[i16].trim()) : null;
            int i17 = format.fontSizeIndex;
            float fontSize = i17 != -1 ? parseFontSize(strArrSplit[i17].trim()) : -3.4028235E38f;
            int i18 = format.boldIndex;
            boolean z14 = false;
            boolean z15 = true;
            if (i18 != -1 && parseBooleanValue(strArrSplit[i18].trim())) {
                z14 = true;
            }
            int i19 = format.italicIndex;
            if (i19 == -1 || !parseBooleanValue(strArrSplit[i19].trim())) {
                z15 = z14;
            }
            int i24 = format.underlineIndex;
            if (i24 == -1 || !parseBooleanValue(strArrSplit[i24].trim())) {
                z15 = z14;
            }
            int i25 = format.strikeoutIndex;
            if (i25 == -1 || !parseBooleanValue(strArrSplit[i25].trim())) {
                z15 = false;
            }
            return new SsaStyle(strTrim, alignment, color, fontSize, z14, z15, z15, z15);
        } catch (RuntimeException e4) {
            Log.w(TAG, v.c(str.length() + 36, "Skipping malformed 'Style:' line: '", str, "'"), e4);
            return null;
        }
    }

    private static boolean isValidAlignment(int i14) {
        switch (i14) {
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
    public static int parseAlignment(String str) {
        try {
            int i14 = Integer.parseInt(str.trim());
            if (isValidAlignment(i14)) {
                return i14;
            }
        } catch (NumberFormatException unused) {
        }
        String strValueOf = String.valueOf(str);
        Log.w(TAG, strValueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(strValueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    private static boolean parseBooleanValue(String str) {
        try {
            int i14 = Integer.parseInt(str);
            return i14 == 1 || i14 == -1;
        } catch (NumberFormatException e4) {
            Log.w(TAG, v.c(v.a(33, str), "Failed to parse boolean value: '", str, "'"), e4);
            return false;
        }
    }

    public static Integer parseColor(String str) {
        try {
            long j8 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            Assertions.checkArgument(j8 <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j8 >> 24) & 255) ^ 255), Ints.checkedCast(j8 & 255), Ints.checkedCast((j8 >> 8) & 255), Ints.checkedCast((j8 >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            Log.w(TAG, v.c(v.a(36, str), "Failed to parse color expression: '", str, "'"), e4);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e4) {
            Log.w(TAG, v.c(v.a(29, str), "Failed to parse font size: '", str, "'"), e4);
            return -3.4028235E38f;
        }
    }
}
