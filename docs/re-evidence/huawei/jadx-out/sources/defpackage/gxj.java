package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class gxj extends gxi {
    protected int f;

    @Override // defpackage.gxi
    public boolean t() {
        return this.j < 180 && this.j > 0;
    }

    public float p() {
        if (this.h < 0 || this.j <= 0) {
            return -1.0f;
        }
        return this.h / this.j;
    }

    @Override // defpackage.gxi
    public int h() {
        if (this.f36198c < 0 || this.f36197b < 0) {
            return -1;
        }
        return e() - c();
    }

    public int s() {
        int i = this.f;
        if (i != -1) {
            return gwc.c(i);
        }
        return -1;
    }

    public boolean q() {
        return this.j > 0 && this.h <= 0;
    }

    public int r() {
        float fP = p();
        int iH = h();
        if (fP != -1.0f && iH != -1 && this.h != -1) {
            this.f = (int) ((gwc.e(this.h) * 0.5f) + (gwc.b(fP) * 0.3f) + (gwc.a(iH) * 0.2f));
        } else {
            this.f = -1;
        }
        return this.f;
    }

    @Override // defpackage.gxi
    public boolean n() {
        return super.n() || this.j > 0;
    }

    @Override // defpackage.gxi
    public String toString() {
        return "ManualSleepData{mStayInBedTime=" + this.j + ", mScore=" + this.f + ", isIsOnlyOnBed=" + q() + ", getSleepLevel=" + s() + ", getSleepLatencyTime=" + h() + ", getSleepEfficiency=" + g() + '}' + super.toString();
    }
}
