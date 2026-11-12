package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gxn extends gxj {
    private int q;
    private int v;
    private int y;
    private int r = 0;
    private int s = 0;
    private List<Integer> n = new ArrayList();
    private List<Integer> w = new ArrayList();
    private List<Integer> p = new ArrayList();
    private List<Integer> t = new ArrayList();
    private int o = 0;
    private int m = 0;
    private int k = 0;
    private int l = 0;

    public int x() {
        return this.o;
    }

    public int w() {
        return this.m;
    }

    public int y() {
        return this.k;
    }

    public int v() {
        return this.l;
    }

    public int ab() {
        return this.y;
    }

    public int ad() {
        return this.q;
    }

    public int ac() {
        return this.v;
    }

    public int aa() {
        int i = this.r;
        if (i >= 0) {
            return gwc.b((int) Math.sqrt(i));
        }
        return -1;
    }

    public int z() {
        int i = this.s;
        if (i >= 0) {
            return gwc.b((int) Math.sqrt(i));
        }
        return -1;
    }

    @Override // defpackage.gxj, defpackage.gxi
    public int h() {
        return this.f36196a;
    }

    public boolean ah() {
        return this.q > 0 && this.v == 0;
    }

    public void b(gxj gxjVar) {
        if (gxjVar.i() > 0 && !gxjVar.t()) {
            this.h += gxjVar.i();
            this.y += gxjVar.i();
            this.v++;
            if (gxjVar.e() >= 0) {
                this.n.add(Integer.valueOf(gxjVar.e()));
            }
            if (gxjVar.k() >= 0) {
                this.w.add(Integer.valueOf(gxjVar.k()));
            }
            if (gxjVar.c() >= 0) {
                this.p.add(Integer.valueOf(gxjVar.c()));
            }
            if (gxjVar.f() >= 0) {
                this.t.add(Integer.valueOf(gxjVar.f()));
            }
            if (gxjVar.o() > 0) {
                this.j += gxjVar.o();
            }
            if (gxjVar.h() >= 0) {
                this.f36196a += gxjVar.h();
                return;
            }
            return;
        }
        if (gxjVar.t()) {
            this.q++;
        }
    }

    public void u() {
        if (this.v <= 0) {
            return;
        }
        this.f36196a = Math.round(this.f36196a / this.v);
        this.j = Math.round(this.j / this.v);
        this.h = Math.round(this.h / this.v);
        if (this.p.size() > 0) {
            List<Integer> listB = gwc.b(this.p);
            this.p = listB;
            int iRound = Math.round(gwc.c(listB) / this.p.size());
            this.o = iRound;
            List<Integer> list = this.p;
            this.r = gwc.a(list, iRound, list.size());
        } else {
            this.o = -1;
            this.r = -1;
        }
        if (this.t.size() > 0) {
            List<Integer> listB2 = gwc.b(this.t);
            this.t = listB2;
            int iRound2 = Math.round(gwc.c(listB2) / this.t.size());
            this.m = iRound2;
            List<Integer> list2 = this.t;
            this.s = gwc.a(list2, iRound2, list2.size());
        } else {
            this.m = -1;
            this.s = -1;
        }
        if (this.n.size() > 0) {
            List<Integer> listB3 = gwc.b(this.n);
            this.n = listB3;
            this.l = Math.round(gwc.c(listB3) / this.n.size());
        } else {
            this.l = -1;
        }
        if (this.w.size() > 0) {
            List<Integer> listB4 = gwc.b(this.w);
            this.w = listB4;
            this.k = Math.round(gwc.c(listB4) / this.w.size());
            return;
        }
        this.k = -1;
    }

    @Override // defpackage.gxj, defpackage.gxi
    public String toString() {
        return "ManualSleepStatData{mSleepDayCount=" + this.v + ", mGoBedScore=" + this.r + ", mRisingScore=" + this.s + ", mFallAsSleepTimeList=" + this.n + ", mWakeupTimeList=" + this.w + ", mGoBedTimeList=" + this.p + ", mRisingTimeList=" + this.t + ", mAvgGoBedTime=" + this.o + ", mAvgRisingTime=" + this.m + ", mAvgWakeupTime=" + this.k + ", mAvgFallInSleepTime=" + this.l + ", mSleepTotalTime=" + this.y + ", mOnlyNoonCount=" + this.q + ", getRisingRegularity=" + z() + ", getBedTimeRegularity=" + aa() + '}' + super.toString();
    }
}
