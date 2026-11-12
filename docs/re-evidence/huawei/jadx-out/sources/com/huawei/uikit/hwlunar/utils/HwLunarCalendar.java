package com.huawei.uikit.hwlunar.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.huawei.uikit.hwlunar.R;
import com.huawei.wearengine.sensor.DataResult;
import com.tencent.connect.common.Constants;
import defpackage.xew;
import defpackage.xfa;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes20.dex */
public class HwLunarCalendar {
    private boolean i;
    private Context k;
    private int l;
    private boolean m;
    private GregorianCalendar n;
    private Calendar o;
    private boolean q;
    private int r;
    private final Object s;
    private int t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f29515c = {27296, 47779, 43856, 19416, 19168, 42352, 21717, 53856, 55632, 21844, 22191, 39632, 21970, 19168, 42422, 42192, 53840, 53909, 46415, 54944, 44450, 38320, 18807, 18815, 42160, 46261, 27216, 27968, 43860, 11119, 38256, 21234, 18800, 25958, 54432, 59984, 27285, 23263, Constants.REQUEST_OLD_QZSHARE, 34531, 37615, 51415, 51551, 54432, 55462, 46431, 22176, 42420, 9695, 37584, 53938, 43344, 46423, 27808, 46416, 21333, 19887, 42416, 17779, 21183, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 38310, 38335, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 23232, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 20854, 21183, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 53430, 53855, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 45653, 27951, 44448, 19299, 37759, 18936, 18800, 25776, 26790, 59999, 27424, 42692, 43759, 37600, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 19285, 19311, 42352, 21732, 53856, 59752, 54560, 55968, 27302, 22239, 19168, 43476, 42192, 53584, 62034, 54560, 56645, 46496, 22224};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f29513a = {R.string.gan_jia, R.string.gan_yi, R.string.gan_bing, R.string.gan_ding, R.string.gan_wu, R.string.gan_ji, R.string.gan_gen, R.string.gan_xin, R.string.gan_ren, R.string.gan_gui};
    private static final int[] e = {R.string.jian_zhi_zi, R.string.jian_zhi_chu, R.string.jian_zhi_yin, R.string.jian_zhi_mao, R.string.jian_zhi_chen, R.string.jian_zhi_si, R.string.jian_zhi_wu, R.string.jian_zhi_wei, R.string.jian_zhi_shen, R.string.jian_zhi_you, R.string.jian_zhi_xu, R.string.jian_zhi_hai};
    private static final int[] d = {R.string.jian_mouse, R.string.jian_cattle, R.string.jian_tiger, R.string.jian_rabbit, R.string.jian_dragon, R.string.jian_snake, R.string.jian_horse, R.string.jian_sheep, R.string.jian_monkey, R.string.jian_chicken, R.string.jian_dog, R.string.jian_pig};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f29514b = {R.string.mouse, R.string.cattle, R.string.tiger, R.string.rabbit, R.string.dragon, R.string.snake, R.string.horse, R.string.sheep, R.string.monkey, R.string.chicken, R.string.dog, R.string.pig};
    private static final int[] h = {R.string.zero, R.string.one, R.string.two, R.string.three, R.string.four, R.string.five, R.string.six, R.string.seven, R.string.eight, R.string.nine, R.string.ten};
    private static final int[] f = {R.string.jian_one, R.string.jian_two, R.string.jian_three, R.string.jian_four, R.string.jian_five, R.string.jian_six, R.string.jian_seven, R.string.jian_eight, R.string.jian_nine, R.string.jian_ten};
    private static final int[] j = {1, 3, 5, 7, 8, 10, 12};
    private static final int[] g = {4, 6, 9, 11};

    private HwLunarCalendar() {
        this.s = new Object();
    }

    private int a(int i) {
        int iB = b(i) + 348;
        if (i < 1897 || i > 2102) {
            Log.e("HwLunarCalendar", "getLunarYearDays: lunarYear index out of boundry, lunarYear = " + i);
            return 0;
        }
        for (int i2 = 32768; i2 > 8; i2 >>= 1) {
            iB += (f29515c[i + (-1897)] & i2) != 0 ? 1 : 0;
        }
        return iB;
    }

    private boolean a(int i, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    private boolean c(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    private void d(int i, int i2, int i3) {
        this.m = true;
        boolean z = this.i;
        int i4 = z ? 1897 : 1900;
        int i5 = z ? 2102 : 2100;
        if (i == i4 && i2 < 1 && i3 < 31) {
            this.m = false;
            return;
        }
        if (i == i5 + 1 && i2 < 1 && i3 <= 28) {
            this.m = true;
            return;
        }
        if (i < i4 || i > i5) {
            this.m = false;
            return;
        }
        if (i2 < 0 || i2 > 12) {
            this.m = false;
            return;
        }
        int i6 = i2 + 1;
        if (i6 == 2) {
            if (new GregorianCalendar().isLeapYear(i)) {
                this.m = c(i3, 1, 29);
                return;
            } else {
                this.m = c(i3, 1, 28);
                return;
            }
        }
        if (a(i6, j)) {
            this.m = c(i3, 1, 31);
        } else if (a(i6, g)) {
            this.m = c(i3, 1, 30);
        } else {
            Log.e("HwLunarCalendar", "wrong month index");
        }
    }

    public String a() {
        return a(false, true);
    }

    public String b() {
        String str = "";
        if (!this.m) {
            return "";
        }
        if (this.r <= 10) {
            str = "" + this.k.getString(R.string.chinese_chu);
        }
        return str + c(this.r, false);
    }

    public int c() {
        return this.r;
    }

    public String d() {
        if (!this.m) {
            return "";
        }
        return h() + d(true) + this.k.getString(R.string.chinese_year1) + this.l;
    }

    public int e() {
        return this.t;
    }

    public void e(int i, int i2, int i3) {
        synchronized (this.s) {
            Calendar calendar = Calendar.getInstance();
            int i4 = i2 - 1;
            calendar.set(i, i4, i3);
            a(i == 0 ? System.currentTimeMillis() : calendar.getTimeInMillis());
            d(i, i4, i3);
        }
    }

    public int f() {
        return this.l;
    }

    private void a(long j2) {
        this.o.setTimeInMillis(j2);
        this.l = 1897;
        xew xewVar = new xew(Calendar.getInstance().getTimeZone());
        xewVar.c(j2);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(xewVar.c(), xewVar.e(), xewVar.a());
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(1897, 1, 2);
        gregorianCalendar2.setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        c(gregorianCalendar, gregorianCalendar2);
    }

    public HwLunarCalendar(Context context) {
        this.s = new Object();
        this.k = context;
        this.m = true;
        this.n = new GregorianCalendar(TimeZone.getTimeZone(DataResult.UTC));
        this.o = Calendar.getInstance();
        this.i = true;
    }

    private void c(Calendar calendar, Calendar calendar2) {
        long jA = a((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000, a(this.l));
        int iC = c(this.l);
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        loop0: while (true) {
            boolean z3 = z2;
            while (true) {
                if (i >= 13 || jA <= 0) {
                    break loop0;
                }
                long jB = b(i, z3, z2);
                if (jA < jB) {
                    break loop0;
                }
                jA -= jB;
                if (z2) {
                    i++;
                    z3 = false;
                } else if (iC == i) {
                    break;
                } else {
                    i++;
                }
            }
            z2 = true;
        }
        this.t = i;
        if (i == iC && z2) {
            z = true;
        }
        this.q = z;
        this.r = ((int) jA) + 1;
    }

    private int c(int i) {
        if (i >= 1897 && i <= 2102) {
            int i2 = f29515c[i - 1897] & 15;
            if (i2 == 15) {
                return 0;
            }
            return i2;
        }
        Log.e("HwLunarCalendar", "getLunarLeapMonth: lunarYear index out of boundry, lunarYear = " + i);
        return 0;
    }

    private int b(int i, boolean z, boolean z2) {
        if (z2 && z) {
            return b(this.l);
        }
        return a(this.l, i);
    }

    private long a(long j2, int i) {
        while (true) {
            int i2 = this.l;
            if (i2 >= 2102) {
                break;
            }
            long j3 = i;
            if (j2 < j3) {
                break;
            }
            j2 -= j3;
            int i3 = i2 + 1;
            this.l = i3;
            i = a(i3);
        }
        return j2;
    }

    private int b(int i) {
        if (i >= 1896 && i < 2103) {
            int i2 = f29515c[i - 1896];
            if (c(i) > 0) {
                return (i2 & 15) == 15 ? 30 : 29;
            }
            return 0;
        }
        Log.e("HwLunarCalendar", "getLunarLeapDays: lunarYear index out of boundry, lunarYear = " + i);
        return 0;
    }

    private int a(int i, int i2) {
        if (i >= 1897 && i <= 2102) {
            return (f29515c[i - 1897] & (65536 >> i2)) != 0 ? 30 : 29;
        }
        Log.e("HwLunarCalendar", "getLunarMonthDays: lunarYear index out of boundry, lunarYear = " + i);
        return 0;
    }

    private String d(boolean z) {
        if (z) {
            return this.k.getString(d[(this.l - 4) % 12]);
        }
        return this.k.getString(f29514b[(this.l - 4) % 12]);
    }

    private String h() {
        if (!this.m) {
            return "";
        }
        int i = this.l - 1864;
        try {
            return this.k.getString(f29513a[i % 10]) + this.k.getString(e[i % 12]);
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    private String a(boolean z, boolean z2) {
        String str;
        String str2 = "";
        if (!this.m) {
            return "";
        }
        if (this.q) {
            if (z2) {
                str2 = "" + this.k.getString(R.string.run1);
            } else {
                str2 = "" + this.k.getString(R.string.run);
            }
        }
        if (z2) {
            str = c(this.t, z2) + this.k.getString(R.string.chinese_month1);
        } else {
            str = c(this.t, z2) + this.k.getString(R.string.chinese_month);
        }
        int i = this.t;
        if (i == 1) {
            return str2 + d(z, this.k.getString(R.string.zhengyue), str);
        }
        if (i == 11) {
            if (z2) {
                return str2 + d(z, this.k.getString(R.string.dongyue1), str);
            }
            return str2 + d(z, this.k.getString(R.string.dongyue), str);
        }
        if (i != 12) {
            return str2 + str;
        }
        if (z2) {
            return str2 + d(z, this.k.getString(R.string.layue1), str);
        }
        return str2 + d(z, this.k.getString(R.string.layue), str);
    }

    private String c(int i, boolean z) {
        String string = "";
        if (i < 0) {
            return "";
        }
        int i2 = i / 10;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (z) {
                        string = this.k.getString(R.string.chinese_thirty1);
                    } else {
                        string = this.k.getString(R.string.chinese_thirty);
                    }
                }
            } else if (z) {
                string = this.k.getString(R.string.chinese_twenty1);
            } else {
                string = this.k.getString(R.string.chinese_twenty);
            }
        } else if (z) {
            string = this.k.getString(f[9]);
        } else {
            string = this.k.getString(R.string.ten);
        }
        int i3 = i % 10;
        if (i3 != 0) {
            string = string + this.k.getString(h[i3]);
        }
        return i == 20 ? xfa.e[i - 1] : string;
    }

    private String d(boolean z, String str, String str2) {
        if (!z) {
            return str;
        }
        return str2 + String.format(Locale.ROOT, this.k.getString(R.string.lunar_month), str);
    }
}
