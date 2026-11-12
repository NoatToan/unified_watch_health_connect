package defpackage;

import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gxp extends gxs {
    private int af;
    private int ak;
    private int an;
    private int au;
    private int av;
    private int ay;
    private int az;
    private int ba;
    private int bb;
    private int bc;
    private int be;
    private int bf;
    private int bg;
    private int bi;
    private int bj;
    private int bk;
    private int bl;
    private int bn;
    private int bo;
    private int bp;
    private int bm = 0;
    private int bq = 0;
    private int bv = 0;
    private int br = 0;
    private int al = 0;
    private List<Integer> aj = new ArrayList();
    private List<Integer> bu = new ArrayList();
    private List<Integer> am = new ArrayList();
    private List<Integer> bh = new ArrayList();
    private int ai = 0;
    private int ae = 0;
    private int ah = 0;
    private int ag = 0;
    private int bd = 0;
    private int ar = -2;
    private int aq = -2;
    private int at = -2;
    private int ao = -2;
    private int aw = -2;
    private int ap = -2;
    private int ax = -2;
    private int as = -2;
    private boolean ac = false;

    private int a(int i, int i2, int i3) {
        return (i != -2 && (i3 != 1 || i <= i2) && (i3 != 0 || i >= i2)) ? i : i2;
    }

    public int bs() {
        return this.bp;
    }

    public int bt() {
        return this.bi;
    }

    public int bu() {
        return this.af;
    }

    public int bw() {
        return this.az;
    }

    public boolean bx() {
        return this.af > 0 && this.az > 0;
    }

    public int br() {
        if (this.y == 5) {
            return this.ba;
        }
        return this.ay;
    }

    public int bn() {
        if (this.y == 5) {
            return this.bc;
        }
        return this.bf;
    }

    public int be() {
        return this.ai;
    }

    public int bf() {
        return this.ae;
    }

    public int bo() {
        return this.at;
    }

    public int bl() {
        return this.ar;
    }

    public int bp() {
        return this.aw;
    }

    public int bq() {
        return this.ax;
    }

    public int bi() {
        return this.ao;
    }

    public int bj() {
        return this.aq;
    }

    public int bk() {
        return this.ap;
    }

    public int bm() {
        return this.as;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    public void a(String str, int i) {
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
            this.ax = i;
            return;
        }
        if (b2 == 1) {
            this.at = i;
            return;
        }
        if (b2 == 2) {
            this.aw = i;
        } else if (b2 == 3) {
            this.ar = i;
        } else {
            ReleaseLogUtil.d("RScienceSleepStatData", "unknow itemType: ", str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public boolean d(String str) {
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
            return cb();
        }
        if (b2 == 1) {
            return ca();
        }
        if (b2 == 2) {
            return ce();
        }
        if (b2 == 3) {
            return by();
        }
        ReleaseLogUtil.d("RScienceSleepStatData", "unknow itemType: ", str);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    public void b(String str, int i) {
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
            this.as = i;
            return;
        }
        if (b2 == 1) {
            this.ao = i;
            return;
        }
        if (b2 == 2) {
            this.ap = i;
        } else if (b2 == 3) {
            this.aq = i;
        } else {
            ReleaseLogUtil.d("RScienceSleepStatData", "unknow itemType: ", str);
        }
    }

    private boolean ca() {
        return c(this.at) && c(this.ao) && this.at <= this.ao;
    }

    private boolean by() {
        return c(this.ar) && c(this.aq) && this.ar <= this.aq;
    }

    private boolean cb() {
        return c(this.ax) && c(this.as) && this.ax <= this.as;
    }

    private boolean ce() {
        return c(this.aw) && c(this.ap) && this.aw <= this.ap;
    }

    @Override // defpackage.gxs
    public boolean bh() {
        return (this.at == -2 && this.ao == -2 && this.ar == -2 && this.aq == -2 && this.aw == -2 && this.ap == -2 && this.ax == -2 && this.as == -2 && !this.ac) ? false : true;
    }

    public int bv() {
        int i = this.bd;
        if (i >= 0) {
            return gwc.b((int) Math.sqrt(i));
        }
        return -1;
    }

    public int bg() {
        int i = this.al;
        if (i >= 0) {
            return gwc.b((int) Math.sqrt(i));
        }
        return -1;
    }

    @Override // defpackage.gxs
    public int x() {
        return this.f;
    }

    public boolean bz() {
        return this.au > 0 && this.av == 0 && this.bi == 0;
    }

    public void b(gxs gxsVar) {
        if (gxsVar.ar() > 0) {
            this.av++;
            this.q += gxsVar.ar();
        }
        boolean z = gxsVar.ax() == 5;
        if (gxsVar.i() > 0 && !gxsVar.t()) {
            this.h += gxsVar.i();
            this.bp += gxsVar.i();
            this.bi++;
            if (z) {
                this.af++;
                this.bn += gxsVar.i();
                this.ak += gxsVar.m;
                this.bl += gxsVar.u;
                this.be += gxsVar.s;
            } else {
                this.az++;
                this.bo += gxsVar.i();
                this.an += gxsVar.m;
                this.bk += gxsVar.u;
                this.bg += gxsVar.s;
            }
            if (gxsVar.o() > 0) {
                this.bq++;
                this.bv += gxsVar.i();
                this.br += gxsVar.o();
                this.j += gxsVar.o();
            }
            if (gxsVar.h() >= 0) {
                this.bm++;
                this.f36196a += gxsVar.h();
            }
            if (gxsVar.ak().doubleValue() > 0.0d) {
                this.r = this.r == -1.0d ? gxsVar.ak().doubleValue() : Math.min(this.r, gxsVar.ak().doubleValue());
            }
            if (gxsVar.af().doubleValue() > 0.0d) {
                this.k = this.k == -1.0d ? gxsVar.af().doubleValue() : Math.max(this.k, gxsVar.af().doubleValue());
            }
            if (gxsVar.ag().doubleValue() > 0.0d) {
                this.t = this.t == -1.0d ? gxsVar.ag().doubleValue() : Math.min(this.t, gxsVar.ag().doubleValue());
            }
            if (gxsVar.ab() > 0.0d) {
                this.n = this.n == -1.0d ? gxsVar.ab() : Math.max(this.n, gxsVar.ab());
            }
            if (gxsVar.aj() > 0) {
                this.p = this.p == -1 ? gxsVar.aj() : Math.min(this.p, gxsVar.aj());
            }
            if (gxsVar.ae() > 0) {
                this.l = this.l == -1 ? gxsVar.ae() : Math.max(this.l, gxsVar.ae());
            }
            if (gxsVar.u() > 0) {
                this.m += gxsVar.u();
            }
            if (gxsVar.aw() > 0) {
                this.u += gxsVar.aw();
            }
            if (gxsVar.ap() > 0) {
                this.s += gxsVar.ap();
            }
            if (gxsVar.v() >= 20) {
                this.o += gxsVar.v();
            }
            if (gxsVar.ba() >= 0 && gxsVar.i() > 0) {
                this.z += gxsVar.ba();
            }
            if (gxsVar.bb() > 0 && gxsVar.i() > 0) {
                this.ad += gxsVar.bb();
            }
            if (gxsVar.e() >= 0) {
                this.aj.add(Integer.valueOf(gxsVar.e()));
            }
            if (gxsVar.k() >= 0) {
                this.bu.add(Integer.valueOf(gxsVar.k()));
            }
            if (gxsVar.c() >= 0) {
                this.am.add(Integer.valueOf(gxsVar.c()));
            }
            if (gxsVar.f() >= 0) {
                this.bh.add(Integer.valueOf(gxsVar.f()));
            }
            if (gxsVar.aq() > 0) {
                this.v += gxsVar.aq();
                this.bj++;
            }
            int iD = gwc.d(gxsVar.at(), gxsVar.ap());
            if (iD > 0) {
                this.f += iD;
            }
            if (gxsVar.bh()) {
                this.ac = true;
            }
            if (gxsVar.e("TRUSLEEP_FIVE_HEART_RATE")) {
                c("TRUSLEEP_FIVE_HEART_RATE", gxsVar);
            }
            if (gxsVar.e("TRUSLEEP_FIVE_BREATH_RATE")) {
                c("TRUSLEEP_FIVE_BREATH_RATE", gxsVar);
            }
            if (gxsVar.e("TRUSLEEP_FIVE_SpO2")) {
                c("TRUSLEEP_FIVE_SpO2", gxsVar);
            }
            if (gxsVar.e("TRUSLEEP_FIVE_HRV")) {
                c("TRUSLEEP_FIVE_HRV", gxsVar);
            }
            if (z) {
                this.x += gxsVar.au();
                return;
            }
            return;
        }
        if (gxsVar.t()) {
            if (z) {
                this.ba++;
            } else {
                this.ay++;
            }
            this.au++;
            return;
        }
        if (gxsVar.ar() > 0) {
            if (z) {
                this.bc++;
            } else {
                this.bf++;
            }
            this.bb++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    private void c(String str, gxs gxsVar) {
        byte b2;
        int iR;
        int iBq;
        int iBm;
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
            iR = gxsVar.r();
            iBq = bq();
            iBm = bm();
        } else if (b2 == 1) {
            iR = gxsVar.q();
            iBq = bo();
            iBm = bi();
        } else if (b2 == 2) {
            iR = gxsVar.s();
            iBq = bp();
            iBm = bk();
        } else if (b2 == 3) {
            iR = gxsVar.p();
            iBq = bl();
            iBm = bj();
        } else {
            ReleaseLogUtil.d("RScienceSleepStatData", "unknow itemType: ", str);
            return;
        }
        a(str, a(iBq, iR, 1));
        b(str, a(iBm, iR, 0));
    }

    public void bd() {
        if (this.av > 0) {
            this.q = Math.round(this.q / this.av);
        }
        if (this.bi <= 0) {
            return;
        }
        this.h = Math.round(this.h / this.bi);
        this.m = Math.round(this.m / this.bi);
        this.u = Math.round(this.u / this.bi);
        this.s = Math.round(this.s / this.bi);
        if (this.af > 0) {
            this.x = Math.round(this.x / this.af);
            this.bn = Math.round(this.bn / this.af);
            this.ak = Math.round(this.ak / this.af);
            this.bl = Math.round(this.bl / this.af);
            this.be = Math.round(this.be / this.af);
        }
        int i = this.az;
        if (i > 0) {
            this.bo = Math.round(this.bo / i);
            this.an = Math.round(this.an / this.az);
            this.bk = Math.round(this.bk / this.az);
            this.bg = Math.round(this.bg / this.az);
        }
        this.o = Math.round(this.o / this.bi);
        if (this.bj > 0) {
            this.v = Math.round(this.v / this.bj);
        }
        this.f = Math.round(this.f / this.bi);
        this.ad = Math.round(this.ad / this.bi);
        if (this.bm > 0) {
            this.f36196a = Math.round(this.f36196a / this.bm);
        }
        if (this.bq > 0) {
            this.j = Math.round(this.j / this.bq);
            this.br = Math.round(this.br / this.bq);
            this.bv = Math.round(this.bv / this.bq);
        }
        if (this.am.size() > 0) {
            List<Integer> listB = gwc.b(this.am);
            this.am = listB;
            int iRound = Math.round(gwc.c(listB) / this.am.size());
            this.ah = iRound;
            List<Integer> list = this.am;
            this.al = gwc.a(list, iRound, list.size());
        } else {
            this.ah = -1;
            this.al = -1;
        }
        if (this.bh.size() > 0) {
            List<Integer> listB2 = gwc.b(this.bh);
            this.bh = listB2;
            int iRound2 = Math.round(gwc.c(listB2) / this.bh.size());
            this.ag = iRound2;
            List<Integer> list2 = this.bh;
            this.bd = gwc.a(list2, iRound2, list2.size());
        } else {
            this.ag = -1;
            this.bd = -1;
        }
        if (this.aj.size() > 0) {
            List<Integer> listB3 = gwc.b(this.aj);
            this.aj = listB3;
            this.ai = Math.round(gwc.c(listB3) / this.aj.size());
        } else {
            this.ai = -1;
        }
        if (this.bu.size() > 0) {
            List<Integer> listB4 = gwc.b(this.bu);
            this.bu = listB4;
            this.ae = Math.round(gwc.c(listB4) / this.bu.size());
            return;
        }
        this.ae = -1;
    }

    @Override // defpackage.gxi
    public int g() {
        int i;
        int i2 = this.bv;
        if (i2 < 0 || (i = this.br) <= 0) {
            return -1;
        }
        return (int) UnitUtil.d((i2 / i) * 100.0f, 0);
    }

    @Override // defpackage.gxs, defpackage.gxi
    public int h() {
        if (this.bq == 0) {
            return -1;
        }
        return this.f36196a;
    }

    @Override // defpackage.gxi
    public int o() {
        if (this.bq == this.bi) {
            return this.j;
        }
        return -1;
    }

    @Override // defpackage.gxs
    public int u() {
        if (ax() == 5) {
            return this.ak;
        }
        return this.an;
    }

    @Override // defpackage.gxs
    public int aw() {
        if (ax() == 5) {
            return this.bl;
        }
        return this.bk;
    }

    @Override // defpackage.gxs
    public int ap() {
        if (ax() == 5) {
            return this.be;
        }
        return this.bg;
    }

    @Override // defpackage.gxs
    public int w() {
        if (this.m < 0 || this.h <= 0) {
            return -1;
        }
        return Math.round(((this.y == 5 ? this.ak : this.an) * 100.0f) / (this.y == 5 ? this.bn : this.bo));
    }

    @Override // defpackage.gxs
    public int av() {
        if (this.u < 0 || this.h <= 0) {
            return -1;
        }
        return Math.round(((this.y == 5 ? this.bl : this.bk) * 100.0f) / (this.y == 5 ? this.bn : this.bo));
    }

    @Override // defpackage.gxs
    public int ao() {
        if (this.s < 0 || this.h <= 0) {
            return -1;
        }
        return Math.max((100 - w()) - av(), 0);
    }

    @Override // defpackage.gxs, defpackage.gxi
    public String toString() {
        return "ScienceSleepStatData{mSleepLatencyCount=" + this.bm + ", mStayInBedCount=" + this.bq + ", mTmpSleepTime=" + this.bv + ", mTmpBedTime=" + this.br + ", mSleepDayCount=" + this.bi + ", mNoonDayCount=" + this.av + ", mOnlyNoonCount=" + this.bb + ", mScoreCount=" + this.bj + ", mNotSatisfiedSleepCount=" + this.au + ", mGoBedScore=" + this.al + ", mFallAsSleepTimeList=" + this.aj + ", mWakeupTimeList=" + this.bu + ", mGoBedTimeList=" + this.am + ", mRisingTimeList=" + this.bh + ", mAvgFallAsSleepTime=" + this.ai + ", mAvgWakeupTime=" + this.ae + ", mAvgGoBedTime=" + this.ah + ", mAvgRisingTime=" + this.ag + ", mRisingScore=" + this.bd + ", mSleepTotalTime=" + this.bp + ", mMinWeekMonthBreathrate=" + this.ar + ", mMaxWeekMonthBreathrate=" + this.aq + ", mMinWeekMonthHeartrate=" + this.at + ", mMaxWeekMonthHeartrate=" + this.ao + ", mMinWeekMonthSpO2=" + this.aw + ", mMaxWeekMonthSpO2=" + this.ap + ", mMinWeekMonthHRV=" + this.ax + ", mMaxWeekMonthHRV=" + this.as + ", isTrusleepFive=" + this.ac + ", mSleepTimeAASM=" + this.bn + ", mSleepTimeOld=" + this.bo + ", mDeepSleepTimeAASM=" + this.ak + ", mDeepSleepTimeOld=" + this.an + ", mShallowSleepTimeAASM=" + this.bl + ", mShallowSleepTimeOld=" + this.bk + ", mRemSleepTimeAASM=" + this.be + ", mRemSleepTimeOld=" + this.bg + ", mOldSleepTypeCount=" + this.az + ", mAASMSleepTypeCount=" + this.af + '}';
    }
}
