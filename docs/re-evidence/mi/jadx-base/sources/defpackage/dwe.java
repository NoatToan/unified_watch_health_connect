package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.xiaomi.ai.nlp.factoid.utils.Lunar;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class dwe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f15988a = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "冬", "腊"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f15989b = {"大", "小", "大", "小", "大", "小", "大", "大", "小", "大", "小", "大"};
    public static final dq5 c = new dq5(1900, 1, 1, 0, 0, 0);
    public static final dq5 d = new dq5(2099, 12, 30, 23, 59, 59);
    public static final dq5 e = new dq5(1900, 1, 31, 0, 0, 0);
    public static final dq5 f = new dq5(2099, 12, 31, 23, 59, 59);
    public static final long[] g = {19416, 19168, 42352, 21717, 53856, 55632, 91476, 22176, 39632, 21970, 19168, 42422, 42192, 53840, 119381, 46400, 54944, 44450, 38320, 84343, 18800, 42160, 46261, 27216, 27968, 109396, 11104, 38256, 21234, 18800, 25958, 54432, 59984, 28309, 23248, 11104, 100067, 37600, 116951, 51536, 54432, 120998, 46416, 22176, 107956, 9680, 37584, 53938, 43344, 46423, 27808, 46416, 86869, 19872, 42416, 83315, 21168, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 103846, 38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 21952, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 86390, 21168, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19419, 19152, 42192, 118966, 53840, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 111189, 27936, 44448, 84835, 37744, 18936, 18800, 25776, 92326, 59984, 27424, 108228, 43744, 41696, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 84821, 19296, 42352, 21732, 53600, 59752, 54560, 55968, 92838, 22224, 19168, 43476, 41680, 53584, 62034, 54560};
    public static final Pattern h = Pattern.compile("(农历|阴历|腊月|冬月|正月|闰\\d+月|\\d+月初\\d+(日|号)?)");

    public static String a(int i) {
        return b(i - 1864);
    }

    public static String b(int i) {
        return new String[]{"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"}[i % 10] + new String[]{"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"}[i % 12];
    }

    public static String c(int i) {
        String[] strArr = {"初", "十", "廿", "三"};
        int i2 = i % 10;
        int i3 = i2 == 0 ? 9 : i2 - 1;
        if (i > 30) {
            return "";
        }
        if (i == 10) {
            return "初十";
        }
        if (i == 20) {
            return "二十";
        }
        return strArr[i / 10] + f15988a[i3];
    }

    public static String d(int i) {
        return c(i);
    }

    public static String e(int i) {
        return f15988a[i - 1];
    }

    public static int f(int i) {
        if (g(i) != 0) {
            return (g[i + (-1900)] & PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) != 0 ? 30 : 29;
        }
        return 0;
    }

    public static int g(int i) {
        return (int) (g[i - 1900] & 15);
    }

    public static j4n h(int i, int i2, int i3, boolean z) {
        int i4;
        if (!j(new Lunar(i, i2, i3, z))) {
            return null;
        }
        int iG = g(i);
        if (iG <= 0 || iG >= i2) {
            i4 = (iG == i2 && z) ? i(i, i2) : 0;
        } else {
            i4 = f(i);
        }
        while (true) {
            i2--;
            if (i2 <= 0) {
                break;
            }
            i4 += i(i, i2);
        }
        int iK = i4 + i3;
        while (true) {
            i--;
            if (i < 1900) {
                dq5 dq5VarV = new dq5(1900, 1, 30, 0, 0, 0).v(iK);
                return new j4n(dq5VarV.q(), dq5VarV.m(), dq5VarV.e());
            }
            iK += k(i);
        }
    }

    public static int i(int i, int i2) {
        return (((long) (65536 >> i2)) & g[i + (-1900)]) == 0 ? 29 : 30;
    }

    public static boolean j(Lunar lunar) {
        int year = lunar.getYear();
        int month = lunar.getMonth();
        int day = lunar.getDay();
        dq5 dq5Var = c;
        if (year < dq5Var.q()) {
            return false;
        }
        if (year == dq5Var.q()) {
            if (month < dq5Var.m()) {
                return false;
            }
            if (month == dq5Var.m() && day < dq5Var.e()) {
                return false;
            }
        }
        dq5 dq5Var2 = d;
        if (year > dq5Var2.q()) {
            return false;
        }
        if (year == dq5Var2.q()) {
            if (month > dq5Var2.m()) {
                return false;
            }
            if (month == dq5Var2.m() && day > dq5Var2.e()) {
                return false;
            }
        }
        if (day > i(year, month)) {
            return false;
        }
        return !lunar.isLeap() || lunar.getMonth() == g(year);
    }

    public static int k(int i) {
        int i2 = 348;
        for (int i3 = 32768; i3 > 8; i3 >>= 1) {
            if ((g[i - 1900] & ((long) i3)) != 0) {
                i2++;
            }
        }
        return i2 + f(i);
    }
}
