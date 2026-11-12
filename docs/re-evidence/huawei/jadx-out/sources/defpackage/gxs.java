package defpackage;

import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class gxs extends gxi {
    protected int aa;
    protected double ab;
    protected int ad;
    protected int f;
    protected int m;
    protected int o;
    protected int q;
    protected int s;
    protected int u;
    protected int v;
    protected int w;
    protected int x;
    protected int z;
    protected int p = -1;
    protected int l = -1;
    protected double r = -1.0d;
    protected double k = -1.0d;
    protected double t = -1.0d;
    protected double n = -1.0d;
    protected int y = 0;
    private int ah = -2;
    private int ax = -2;
    private int aj = -2;
    private int al = -2;
    private int af = -2;
    private int av = -2;
    private int am = -2;
    private int ay = -2;
    private int ag = -2;
    private int ar = -2;
    private int ak = -2;
    private int ae = -2;
    private int ac = -2;
    private int ao = -2;
    private int an = -2;
    private int ai = -2;
    private int at = -2;
    private int ap = -2;
    private int au = -2;
    private int aq = -2;
    private int aw = -2;
    private int as = -2;

    private boolean af(int i) {
        return i > 0 && i <= 80;
    }

    private boolean ag(int i) {
        return i > 0 && i <= 200;
    }

    private boolean ak(int i) {
        return i > 0 && i <= 100;
    }

    protected boolean c(int i) {
        return i > 0 && i <= 255;
    }

    public boolean bh() {
        return (this.ah == -2 && this.af == -2 && this.ag == -2 && this.ac == -2 && this.ax == -2 && this.aj == -2 && this.ao == -2 && this.an == -2 && this.av == -2 && this.am == -2 && this.ar == -2 && this.ak == -2) ? false : true;
    }

    private boolean be() {
        int i;
        int i2 = this.ax;
        return i2 > 0 && i2 <= (i = this.aj) && i <= 255;
    }

    private boolean bg() {
        int i;
        int i2 = this.ao;
        return i2 > 0 && i2 <= (i = this.an) && i <= 80;
    }

    private boolean bd() {
        int i;
        int i2 = this.ar;
        return i2 > 0 && i2 <= (i = this.ak) && i <= 200;
    }

    private boolean bf() {
        int i;
        int i2 = this.av;
        return i2 > 0 && i2 <= (i = this.am) && i <= 100;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public boolean e(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "TRUSLEEP_FIVE_HRV":
                b2 = 0;
                break;
            case "TRUSLEEP_FIVE_HEART_RATE":
                b2 = 1;
                break;
            case "TRUSLEEP_FIVE_SpO2":
                b2 = 2;
                break;
            case "TRUSLEEP_FIVE_BREATH_RATE":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return ag(this.ag);
        }
        if (b2 == 1) {
            return c(this.ah);
        }
        if (b2 == 2) {
            return ak(this.af);
        }
        if (b2 == 3) {
            return af(this.ac);
        }
        ReleaseLogUtil.d("R_Sleep_ScienceSleepData", "unknow itemType: ", str);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public boolean b(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "TRUSLEEP_FIVE_HRV":
                b2 = 0;
                break;
            case "TRUSLEEP_FIVE_HEART_RATE":
                b2 = 1;
                break;
            case "TRUSLEEP_FIVE_SpO2":
                b2 = 2;
                break;
            case "TRUSLEEP_FIVE_BREATH_RATE":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return bd();
        }
        if (b2 == 1) {
            return be();
        }
        if (b2 == 2) {
            return bf();
        }
        if (b2 == 3) {
            return bg();
        }
        ReleaseLogUtil.d("R_Sleep_ScienceSleepData", "unknow itemType: ", str);
        return false;
    }

    public int q() {
        return this.ah;
    }

    public void h(int i) {
        this.ah = i;
    }

    public int am() {
        return this.ax;
    }

    public void u(int i) {
        this.ax = i;
    }

    public void ac(int i) {
        this.x = i;
    }

    public int au() {
        return this.x;
    }

    public int ah() {
        return this.aj;
    }

    public void p(int i) {
        this.aj = i;
    }

    public int ad() {
        return this.al;
    }

    public void l(int i) {
        this.al = i;
    }

    public int s() {
        return this.af;
    }

    public void i(int i) {
        this.af = i;
    }

    public int as() {
        return this.av;
    }

    public void w(int i) {
        this.av = i;
    }

    public int ai() {
        return this.am;
    }

    public void t(int i) {
        this.am = i;
    }

    public int bc() {
        return this.ay;
    }

    public void ai(int i) {
        this.ay = i;
    }

    public int r() {
        return this.ag;
    }

    public void g(int i) {
        this.ag = i;
    }

    public int al() {
        return this.ar;
    }

    public void s(int i) {
        this.ar = i;
    }

    public int z() {
        return this.ak;
    }

    public void m(int i) {
        this.ak = i;
    }

    public int aa() {
        return this.ae;
    }

    public void o(int i) {
        this.ae = i;
    }

    public int p() {
        return this.ac;
    }

    public void e(int i) {
        this.ac = i;
    }

    public int an() {
        return this.ao;
    }

    public void q(int i) {
        this.ao = i;
    }

    public int ac() {
        return this.an;
    }

    public void k(int i) {
        this.an = i;
    }

    public int y() {
        return this.ai;
    }

    public void j(int i) {
        this.ai = i;
    }

    public int ba() {
        return this.z;
    }

    public void ah(int i) {
        this.z = i;
    }

    public int u() {
        return this.m;
    }

    public void n(int i) {
        this.m = i;
    }

    public int aw() {
        return this.u;
    }

    public void ad(int i) {
        this.u = i;
    }

    public int aj() {
        int i = this.p;
        if (i <= 0 || 255 <= i) {
            return -1;
        }
        return i;
    }

    public void y(int i) {
        this.p = i;
    }

    public int ae() {
        int i = this.l;
        if (i <= 0 || 255 <= i) {
            return -1;
        }
        return i;
    }

    public void r(int i) {
        this.l = i;
    }

    public Double ak() {
        double d = this.r;
        if (0.0d >= d || 100.0d < d) {
            return Double.valueOf(-1.0d);
        }
        return Double.valueOf(d);
    }

    public void d(Double d) {
        this.r = d.doubleValue();
    }

    public Double af() {
        double d = this.k;
        if (0.0d >= d || 100.0d < d) {
            return Double.valueOf(-1.0d);
        }
        return Double.valueOf(d);
    }

    public void e(Double d) {
        this.k = d.doubleValue();
    }

    public Double ag() {
        double d = this.t;
        if (0.0d >= d || 255.0d <= d) {
            return Double.valueOf(-1.0d);
        }
        return Double.valueOf(d);
    }

    public void a(Double d) {
        this.t = d.doubleValue();
    }

    public double ab() {
        double d = this.n;
        if (0.0d >= d || 255.0d < d) {
            return -1.0d;
        }
        return d;
    }

    public void c(Double d) {
        this.n = d.doubleValue();
    }

    public boolean ay() {
        return this.h <= 0 && this.q > 0;
    }

    public int ao() {
        if (this.s < 0 || this.h <= 0) {
            return -1;
        }
        return Math.max((100 - w()) - av(), 0);
    }

    public int aq() {
        return this.v;
    }

    public void ab(int i) {
        this.v = i;
    }

    public int av() {
        if (this.u < 0 || this.h <= 0) {
            return -1;
        }
        return Math.round((this.u * 100.0f) / this.h);
    }

    public int w() {
        if (this.m < 0 || this.h <= 0) {
            return -1;
        }
        return Math.round((this.m * 100.0f) / this.h);
    }

    public int ar() {
        return this.q;
    }

    public void x(int i) {
        this.q = i;
    }

    public int ap() {
        return this.s;
    }

    public void v(int i) {
        this.s = i;
    }

    public int v() {
        return this.o;
    }

    public void f(int i) {
        this.o = i;
    }

    public int bb() {
        return this.ad;
    }

    public void ae(int i) {
        this.ad = i;
    }

    @Override // defpackage.gxi
    public int h() {
        if (o() <= 0 || e() == 0 || k() == 0 || c() == 0 || f() == 0) {
            return -1;
        }
        return this.f36196a;
    }

    public int x() {
        int i;
        int i2 = this.w;
        if (i2 < 0 || (i = this.s) < 0) {
            return -1;
        }
        return gwc.d(i2, i);
    }

    public double az() {
        return this.ab;
    }

    public void a(double d) {
        this.ab = d;
    }

    public int at() {
        return this.w;
    }

    public void z(int i) {
        this.w = i;
    }

    public void aa(int i) {
        this.y = i;
    }

    public int ax() {
        return this.y;
    }

    @Override // defpackage.gxi
    public boolean n() {
        return super.n() || this.q > 0;
    }

    @Override // defpackage.gxi
    public String toString() {
        return "ScienceSleepData{mRemSleepTime=" + this.s + ", mDeepSleepContinuity=" + this.o + ", mWakeupCount=" + this.ad + ", mValidData=" + this.ab + ", mSnoreFreq=" + this.w + ", mScore=" + this.v + ", mDeepSleepTime=" + this.m + ", mShallowSleepTime=" + this.u + ", mNoonSleepTime=" + this.q + ", mWakeupDuration=" + this.z + ", mBreathQualityScore=" + this.f + ", mMinHeartrate=" + this.p + ", mMaxHeartrate=" + this.l + ", mMinOxygenSaturation=" + this.r + ", mMaxOxygenSaturation=" + this.k + ", mMinBreathrate=" + this.t + ", mMaxBreathrate=" + this.n + ", mWakeupFeeling=" + this.aa + ", mAvgHeartrate=" + this.ah + ", mMinHeartrateBaseline=" + this.ax + ", mMaxHeartrateBaseline=" + this.aj + ", mHeartrateDayTobaseline=" + this.al + ", mAvgSpO2=" + this.af + ", mMinSpO2Baseline=" + this.av + ", mMaxSpO2Baseline=" + this.am + ", mSpO2DayToBaseline=" + this.ay + ", mAvgHRV=" + this.ag + ", mMinHRVBaseline=" + this.ar + ", mMaxHRVBaseline=" + this.ak + ", mHRVDayToBaseline=" + this.ae + ", mAvgBreathrate=" + this.ac + ", mMinBreathrateBaseline=" + this.ao + ", mMaxBreathrateBaseline=" + this.an + ", mBreathrateDayToBaseline=" + this.ai + ", mMinWeekMonthHeartrate=" + this.at + ", mMaxWeekMonthHeartrate=" + this.ap + ", mMinWeekMonthSpO2=" + this.au + ", mMaxWeekMonthSpO2=" + this.aq + ", mMinWeekMonthHRV=" + this.aw + ", mMaxWeekMonthHRV=" + this.as + ", mSleepVersion=" + this.y + '}';
    }
}
