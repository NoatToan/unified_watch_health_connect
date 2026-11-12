package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.servicesapi.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes15.dex */
public class ppz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("z1Value")
    private final int f45803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("z1Percent")
    private final int f45804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("z3Percent")
    private final int f45805c;

    @SerializedName("z2Value")
    private final int d;

    @SerializedName("z2Percent")
    private final int e;

    @SerializedName("z5Percent")
    private final int f;

    @SerializedName("z4Percent")
    private final int g;

    @SerializedName("z5Value")
    private final int h;

    @SerializedName("z3Value")
    private final int i;

    @SerializedName("z4Value")
    private final int j;

    @SerializedName("z7Percent")
    private final int k;

    @SerializedName("z6Value")
    private final int l;

    @SerializedName("zUpperPercent")
    private final int m;

    @SerializedName("z7Value")
    private final int n;

    @SerializedName("z6Percent")
    private final int o;

    @SerializedName("zUpperValue")
    private final int s;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Integer[] f45806a = {Integer.valueOf(R.string.IDS_power_zone_level_begin), Integer.valueOf(R.string.IDS_power_zone_level_aerobic), Integer.valueOf(R.string.IDS_power_zone_level_rhythm), Integer.valueOf(R.string.IDS_power_zone_level_lacticacid), Integer.valueOf(R.string.IDS_power_zone_level_maxOxygen), Integer.valueOf(R.string.IDS_power_zone_level_noOxygen), Integer.valueOf(R.string.IDS_power_zone_level_sprinting)};
    }

    private ppz(e eVar) {
        this.f45804b = eVar.f45808b;
        this.f45803a = eVar.e;
        this.e = eVar.d;
        this.d = eVar.f45807a;
        this.f45805c = eVar.f45809c;
        this.i = eVar.g;
        this.g = eVar.f;
        this.j = eVar.i;
        this.f = eVar.j;
        this.h = eVar.h;
        this.o = eVar.o;
        this.l = eVar.k;
        this.k = eVar.l;
        this.n = eVar.m;
        this.m = eVar.n;
        this.s = eVar.s;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f45807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f45808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f45809c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int s;

        public e c(int i, int i2) {
            this.f45808b = i;
            this.e = i2;
            return this;
        }

        public e b(int i, int i2) {
            this.d = i;
            this.f45807a = i2;
            return this;
        }

        public e d(int i, int i2) {
            this.f45809c = i;
            this.g = i2;
            return this;
        }

        public e a(int i, int i2) {
            this.f = i;
            this.i = i2;
            return this;
        }

        public e e(int i, int i2) {
            this.j = i;
            this.h = i2;
            return this;
        }

        public e j(int i, int i2) {
            this.o = i;
            this.k = i2;
            return this;
        }

        public e g(int i, int i2) {
            this.l = i;
            this.m = i2;
            return this;
        }

        public e f(int i, int i2) {
            this.n = i;
            this.s = i2;
            return this;
        }

        public ppz a() {
            if (this.e > this.f45807a) {
                LogUtil.j("Z1 value must be less than Z2 value", new Object[0]);
            }
            if (this.f45807a > this.g) {
                LogUtil.j("Z2 value must be less than Z3 value", new Object[0]);
            }
            if (this.g > this.i) {
                LogUtil.j("Z3 value must be less than Z4 value", new Object[0]);
            }
            if (this.i > this.h) {
                LogUtil.j("Z4 value must be less than Z5 value", new Object[0]);
            }
            if (this.h > this.k) {
                LogUtil.j("Z5 value must be less than Z6 value", new Object[0]);
            }
            if (this.k > this.m) {
                LogUtil.j("Z6 value must be less than Z7 value", new Object[0]);
            }
            if (this.m > this.s) {
                LogUtil.j("Z7 value must be less than zUpperPercent value", new Object[0]);
            }
            return new ppz(this);
        }
    }

    public int a() {
        return this.f45804b;
    }

    public int d() {
        return this.e;
    }

    public int b() {
        return this.f45805c;
    }

    public int c() {
        return this.g;
    }

    public int e() {
        return this.f;
    }

    public int g() {
        return this.o;
    }

    public int f() {
        return this.k;
    }

    public int h() {
        return this.m;
    }

    public int b(int i) {
        if (i >= this.n) {
            return 6;
        }
        if (i >= this.l) {
            return 5;
        }
        if (i >= this.h) {
            return 4;
        }
        if (i >= this.j) {
            return 3;
        }
        if (i >= this.i) {
            return 2;
        }
        if (i >= this.d) {
            return 1;
        }
        return i >= this.f45803a ? 0 : -1;
    }

    public String c(int i) {
        int iB = b(i);
        if (iB == -1 || b.f45806a.length <= iB) {
            return "";
        }
        return qre.f(b.f45806a[iB].intValue());
    }

    public float a(int i) {
        int i2;
        int i3;
        switch (b(i)) {
            case 0:
                i2 = this.f45803a;
                i3 = this.d;
                break;
            case 1:
                i2 = this.d;
                i3 = this.i;
                break;
            case 2:
                i2 = this.i;
                i3 = this.j;
                break;
            case 3:
                i2 = this.j;
                i3 = this.h;
                break;
            case 4:
                i2 = this.h;
                i3 = this.l;
                break;
            case 5:
                i2 = this.l;
                i3 = this.n;
                break;
            case 6:
                i2 = this.n;
                i3 = this.s;
                break;
            default:
                i2 = 0;
                i3 = 0;
                break;
        }
        return a(i2, i3, i);
    }

    public float a(double d, double d2, double d3) {
        double d4 = d2 - d;
        if (CommonUtil.b(d4)) {
            return 0.0f;
        }
        float fMax = (float) ((Math.max(d, Math.min(d2, d3)) - d) / d4);
        if (CommonUtil.b(1.0f - fMax)) {
            return 1.0f;
        }
        if (CommonUtil.b(fMax)) {
            return 0.0f;
        }
        return fMax;
    }

    public String toString() {
        return "CyclePowerZoneConfig{mZ1Percent=" + this.f45804b + ", mZ1Value=" + this.f45803a + ", mZ2Percent=" + this.e + ", mZ2Value=" + this.d + ", mZ3Percent=" + this.f45805c + ", mZ3Value=" + this.i + ", mZ4Percent=" + this.g + ", mZ4Value=" + this.j + ", mZ5Percent=" + this.f + ", mZ5Value=" + this.h + ", mZ6Percent=" + this.o + ", mZ6Value=" + this.l + ", mZ7Percent=" + this.k + ", mZ7Value=" + this.n + ", mZUpperPercent=" + this.m + ", mZUpperValue=" + this.s + '}';
    }
}
