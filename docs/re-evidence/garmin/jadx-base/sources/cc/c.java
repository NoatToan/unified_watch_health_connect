package cc;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import fa.k;
import fa.z;
import i3.e5;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f26662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f26663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f26668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26669j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f26673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f26674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f26675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f26676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f26677h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f26678i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f26679j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f26680k;

        private a(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28) {
            this.f26670a = i14;
            this.f26671b = i15;
            this.f26672c = i16;
            this.f26673d = i17;
            this.f26674e = i18;
            this.f26675f = i19;
            this.f26676g = i24;
            this.f26677h = i25;
            this.f26678i = i26;
            this.f26679j = i27;
            this.f26680k = i28;
        }

        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            for (int i28 = 0; i28 < strArrSplit.length; i28++) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[i28].trim());
                lowerCase.getClass();
                switch (lowerCase) {
                    case "italic":
                        i24 = i28;
                        break;
                    case "underline":
                        i25 = i28;
                        break;
                    case "strikeout":
                        i26 = i28;
                        break;
                    case "primarycolour":
                        i16 = i28;
                        break;
                    case "bold":
                        i19 = i28;
                        break;
                    case "name":
                        i14 = i28;
                        break;
                    case "fontsize":
                        i18 = i28;
                        break;
                    case "borderstyle":
                        i27 = i28;
                        break;
                    case "alignment":
                        i15 = i28;
                        break;
                    case "outlinecolour":
                        i17 = i28;
                        break;
                }
            }
            if (i14 != -1) {
                return new a(i14, i15, i16, i17, i18, i19, i24, i25, i26, i27, strArrSplit.length);
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f26681c = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f26682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Pattern f26683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Pattern f26684f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f26686b;

        static {
            int i14 = z.f70071a;
            Locale locale = Locale.US;
            f26682d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f26683e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f26684f = Pattern.compile("\\\\an(\\d+)");
        }

        private b(int i14, PointF pointF) {
            this.f26685a = i14;
            this.f26686b = pointF;
        }

        public static b a(String str) {
            int iB;
            Matcher matcher = f26681c.matcher(str);
            PointF pointF = null;
            int i14 = -1;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                try {
                    PointF pointFB = b(strGroup);
                    if (pointFB != null) {
                        pointF = pointFB;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    Matcher matcher2 = f26684f.matcher(strGroup);
                    if (matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        iB = c.b(strGroup2);
                    } else {
                        iB = -1;
                    }
                    if (iB != -1) {
                        i14 = iB;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i14, pointF);
        }

        public static PointF b(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f26682d.matcher(str);
            Matcher matcher2 = f26683e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    k.f("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            strGroup.getClass();
            float f14 = Float.parseFloat(strGroup.trim());
            strGroup2.getClass();
            return new PointF(f14, Float.parseFloat(strGroup2.trim()));
        }
    }

    private c(String str, int i14, Integer num, Integer num2, float f14, boolean z14, boolean z15, boolean z16, boolean z17, int i15) {
        this.f26660a = str;
        this.f26661b = i14;
        this.f26662c = num;
        this.f26663d = num2;
        this.f26664e = f14;
        this.f26665f = z14;
        this.f26666g = z15;
        this.f26667h = z16;
        this.f26668i = z17;
        this.f26669j = i15;
    }

    public static c a(String str, a aVar) {
        fa.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i14 = aVar.f26680k;
        if (length != i14) {
            int length2 = strArrSplit.length;
            int i15 = z.f70071a;
            Locale locale = Locale.US;
            StringBuilder sbJ = e5.j(i14, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
            sbJ.append(str);
            sbJ.append("'");
            k.g(sbJ.toString());
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f26670a].trim();
            int i16 = aVar.f26671b;
            int i17 = -1;
            int iB = i16 != -1 ? b(strArrSplit[i16].trim()) : -1;
            int i18 = aVar.f26672c;
            Integer numD = i18 != -1 ? d(strArrSplit[i18].trim()) : null;
            int i19 = aVar.f26673d;
            Integer numD2 = i19 != -1 ? d(strArrSplit[i19].trim()) : null;
            int i24 = aVar.f26674e;
            float f14 = -3.4028235E38f;
            if (i24 != -1) {
                String strTrim2 = strArrSplit[i24].trim();
                try {
                    f14 = Float.parseFloat(strTrim2);
                } catch (NumberFormatException e4) {
                    k.h("Failed to parse font size: '" + strTrim2 + "'", e4);
                }
            }
            int i25 = aVar.f26675f;
            boolean z14 = false;
            if (i25 != -1 && c(strArrSplit[i25].trim())) {
                z14 = true;
            }
            int i26 = aVar.f26676g;
            boolean z15 = i26 != -1 && c(strArrSplit[i26].trim());
            int i27 = aVar.f26677h;
            boolean z16 = i27 != -1 && c(strArrSplit[i27].trim());
            try {
                int i28 = aVar.f26678i;
                boolean z17 = i28 != -1 && c(strArrSplit[i28].trim());
                int i29 = aVar.f26679j;
                if (i29 != -1) {
                    String strTrim3 = strArrSplit[i29].trim();
                    try {
                        int i30 = Integer.parseInt(strTrim3.trim());
                        if (i30 == 1 || i30 == 3) {
                            i17 = i30;
                        } else {
                            k.g("Ignoring unknown BorderStyle: " + strTrim3);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                return new c(strTrim, iB, numD, numD2, f14, z14, z15, z16, z17, i17);
            } catch (RuntimeException e14) {
                e = e14;
                k.h("Skipping malformed 'Style:' line: '" + str + "'", e);
                return 0;
            }
        } catch (RuntimeException e15) {
            e = e15;
        }
    }

    public static int b(String str) {
        try {
            int i14 = Integer.parseInt(str.trim());
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
                    return i14;
                default:
                    k.g("Ignoring unknown alignment: " + str);
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    public static boolean c(String str) {
        try {
            int i14 = Integer.parseInt(str);
            return i14 == 1 || i14 == -1;
        } catch (NumberFormatException e4) {
            k.h("Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }

    public static Integer d(String str) {
        try {
            long j8 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            fa.a.a(j8 <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.checkedCast(((j8 >> 24) & 255) ^ 255), Ints.checkedCast(j8 & 255), Ints.checkedCast((j8 >> 8) & 255), Ints.checkedCast((j8 >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            k.h("Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }
}
