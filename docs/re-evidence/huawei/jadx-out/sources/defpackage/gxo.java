package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gxo extends gxm {
    private int ab;
    private int ac;
    private int ae;
    private int ag;
    private int ah;
    private int aa = 0;
    private int ai = 0;
    private List<Integer> ad = new ArrayList();
    private List<Integer> aj = new ArrayList();
    private List<Integer> z = new ArrayList();
    private List<Integer> af = new ArrayList();
    private int v = 0;
    private int u = 0;
    private int w = 0;
    private int y = 0;

    public int ar() {
        return this.ah;
    }

    public int af() {
        return this.v;
    }

    public int ag() {
        return this.u;
    }

    public int ai() {
        return this.w;
    }

    public int ah() {
        return this.y;
    }

    public int al() {
        return this.ae;
    }

    public int aj() {
        int i = this.aa;
        if (i >= 0) {
            return gwc.b((int) Math.sqrt(i));
        }
        return -1;
    }

    public int am() {
        int i = this.ai;
        if (i >= 0) {
            return gwc.b((int) Math.sqrt(i));
        }
        return -1;
    }

    public int ak() {
        return this.ag;
    }

    public int an() {
        return this.ac;
    }

    public boolean ao() {
        return this.ac > 0 && this.ab == 0 && this.ae == 0;
    }

    public void d(gxm gxmVar) {
        if (gxmVar.u() > 0) {
            this.ab++;
            this.o += gxmVar.u();
        }
        if (gxmVar.i() > 0 && !gxmVar.t()) {
            this.h += gxmVar.i();
            this.ah += gxmVar.i();
            this.ae++;
            if (gxmVar.o() > 0) {
                this.j += gxmVar.o();
            }
            if (gxmVar.aa() > 0) {
                this.s += gxmVar.aa();
            }
            if (gxmVar.q() > 0) {
                this.f += gxmVar.q();
            }
            if (gxmVar.y() > 0) {
                this.q += gxmVar.y();
            }
            if (gxmVar.e() >= 0) {
                this.ad.add(Integer.valueOf(gxmVar.e()));
            }
            if (gxmVar.k() >= 0) {
                this.aj.add(Integer.valueOf(gxmVar.k()));
            }
            if (gxmVar.c() >= 0) {
                this.z.add(Integer.valueOf(gxmVar.c()));
            }
            if (gxmVar.f() >= 0) {
                this.af.add(Integer.valueOf(gxmVar.f()));
            }
            if (gxmVar.h() >= 0) {
                this.f36196a += gxmVar.h();
            }
            if (gxmVar.x() > 0) {
                this.p += gxmVar.x();
            }
            if (gxmVar.z() > 0) {
                this.t += gxmVar.z();
                return;
            }
            return;
        }
        if (gxmVar.t()) {
            this.ac++;
        } else if (gxmVar.u() > 0) {
            this.ag++;
        }
    }

    public void ae() {
        if (this.ab > 0) {
            this.o = Math.round(this.o / this.ab);
        }
        if (this.ae <= 0) {
            return;
        }
        this.f36196a = Math.round(this.f36196a / this.ae);
        this.f = Math.round(this.f / this.ae);
        this.q = Math.round(this.q / this.ae);
        this.h = Math.round(this.h / this.ae);
        this.j = Math.round(this.j / this.ae);
        this.p = Math.round(this.p / this.ae);
        this.t = Math.round(this.t / this.ae);
        if (this.z.size() > 0) {
            List<Integer> listB = gwc.b(this.z);
            this.z = listB;
            int iRound = Math.round(gwc.c(listB) / this.z.size());
            this.v = iRound;
            List<Integer> list = this.z;
            this.aa = gwc.a(list, iRound, list.size());
        } else {
            this.v = -1;
            this.aa = -1;
        }
        if (this.af.size() > 0) {
            List<Integer> listB2 = gwc.b(this.af);
            this.af = listB2;
            int iRound2 = Math.round(gwc.c(listB2) / this.af.size());
            this.u = iRound2;
            List<Integer> list2 = this.af;
            this.ai = gwc.a(list2, iRound2, list2.size());
        } else {
            this.u = -1;
            this.ai = -1;
        }
        if (this.ad.size() > 0) {
            List<Integer> listB3 = gwc.b(this.ad);
            this.ad = listB3;
            this.y = Math.round(gwc.c(listB3) / this.ad.size());
        } else {
            this.y = -1;
        }
        if (this.aj.size() > 0) {
            List<Integer> listB4 = gwc.b(this.aj);
            this.aj = listB4;
            this.w = Math.round(gwc.c(listB4) / this.aj.size());
            return;
        }
        this.w = -1;
    }

    @Override // defpackage.gxm, defpackage.gxi
    public int h() {
        return this.f36196a;
    }

    @Override // defpackage.gxm, defpackage.gxi
    public String toString() {
        return "PhoneSleepStatData{mSleepDayCount=" + this.ae + ", mOnlyNoonCount=" + this.ag + ", mNotSatisfiedSleepCount=" + this.ac + ", mGoBedScore=" + this.aa + ", mRisingScore=" + this.ai + ", mNoonDayCount=" + this.ab + ", mFallAsSleepTimeList=" + this.ad + ", mWakeupTimeList=" + this.aj + ", mGoBedTimeList=" + this.z + ", mRisingTimeList=" + this.af + ", mAvgGoBedTime=" + this.v + ", mAvgRisingTime=" + this.u + ", mAvgWakeupTime=" + this.w + ", mAvgFallAsSleepTime=" + this.y + ", mSleepTotalTime=" + this.ah + ", getRisingRegularity=" + am() + ", getBedTimeRegularity=" + aj() + '}' + super.toString();
    }
}
