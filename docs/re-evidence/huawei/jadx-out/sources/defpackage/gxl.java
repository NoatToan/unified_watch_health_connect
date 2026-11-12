package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class gxl extends gxk {
    private int n;
    private int o;
    private int t;

    public int u() {
        return this.t;
    }

    public int v() {
        return this.n;
    }

    public int y() {
        return this.o;
    }

    public boolean aa() {
        return this.o > 0 && this.n == 0;
    }

    public void c(gxk gxkVar) {
        if (gxkVar.i() > 0 && !gxkVar.t()) {
            this.h += gxkVar.i();
            this.t += gxkVar.i();
            this.n++;
            if (gxkVar.r() > 0) {
                this.f += gxkVar.r();
            }
            if (gxkVar.q() > 0) {
                this.l += gxkVar.q();
            }
            if (gxkVar.x() > 0) {
                this.k += gxkVar.x();
            }
            if (gxkVar.p() > 0) {
                this.m += gxkVar.p();
                return;
            }
            return;
        }
        if (gxkVar.t()) {
            this.o++;
        }
    }

    public void w() {
        if (this.n <= 0) {
            return;
        }
        this.f = Math.round(this.f / this.n);
        this.l = Math.round(this.l / this.n);
        this.h = Math.round(this.h / this.n);
        this.k = Math.round(this.k / this.n);
        this.m = Math.round(this.m / this.n);
    }

    @Override // defpackage.gxk, defpackage.gxi
    public String toString() {
        return "CommonSleepStatData{mSleepDayCount=" + this.n + ", mOnlyNoonCount=" + this.o + ", mSleepTotalTime=" + this.t + '}' + super.toString();
    }
}
