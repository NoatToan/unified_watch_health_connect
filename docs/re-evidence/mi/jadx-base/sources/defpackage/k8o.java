package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class k8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23604b;
    public final Integer c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23606b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f23605a = i;
            this.f23606b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
        }

        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                String strE = fk1.e(strArrSplit[i9].trim());
                strE.hashCode();
                switch (strE) {
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
        public static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
        public static final Pattern d = Pattern.compile(wlq.D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern e = Pattern.compile(wlq.D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PointF f23608b;

        public b(int i, PointF pointF) {
            this.f23607a = i;
            this.f23608b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f.matcher(str);
            if (matcher.find()) {
                return k8o.d((String) rk1.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) rk1.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i, pointF);
        }

        public static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = d.matcher(str);
            Matcher matcher2 = e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    toe.f("SsaStyle.Overrides", sb.toString());
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
            return new PointF(Float.parseFloat(((String) rk1.e(strGroup)).trim()), Float.parseFloat(((String) rk1.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return c.matcher(str).replaceAll("");
        }
    }

    public k8o(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f23603a = str;
        this.f23604b = i;
        this.c = num;
        this.d = f;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static k8o b(String str, a aVar) {
        rk1.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i = aVar.i;
        if (length != i) {
            toe.h("SsaStyle", wlq.D("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f23605a].trim();
            int i2 = aVar.f23606b;
            int iD = i2 != -1 ? d(strArrSplit[i2].trim()) : -1;
            int i3 = aVar.c;
            Integer numF = i3 != -1 ? f(strArrSplit[i3].trim()) : null;
            int i4 = aVar.d;
            float fG = i4 != -1 ? g(strArrSplit[i4].trim()) : -3.4028235E38f;
            int i5 = aVar.e;
            boolean zE = i5 != -1 ? e(strArrSplit[i5].trim()) : false;
            int i6 = aVar.f;
            boolean zE2 = i6 != -1 ? e(strArrSplit[i6].trim()) : false;
            int i7 = aVar.g;
            boolean zE3 = i7 != -1 ? e(strArrSplit[i7].trim()) : false;
            int i8 = aVar.h;
            return new k8o(strTrim, iD, numF, fG, zE, zE2, zE3, i8 != -1 ? e(strArrSplit[i8].trim()) : false);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(str.length() + 36);
            sb.append("Skipping malformed 'Style:' line: '");
            sb.append(str);
            sb.append("'");
            toe.i("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    public static boolean c(int i) {
        switch (i) {
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

    public static int d(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (c(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        String strValueOf = String.valueOf(str);
        toe.h("SsaStyle", strValueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(strValueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    public static boolean e(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            toe.i("SsaStyle", sb.toString(), e);
            return false;
        }
    }

    public static Integer f(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            rk1.a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(ahd.c(((j >> 24) & 255) ^ 255), ahd.c(j & 255), ahd.c((j >> 8) & 255), ahd.c((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            toe.i("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    public static float g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
            sb.append("Failed to parse font size: '");
            sb.append(str);
            sb.append("'");
            toe.i("SsaStyle", sb.toString(), e);
            return -3.4028235E38f;
        }
    }
}
