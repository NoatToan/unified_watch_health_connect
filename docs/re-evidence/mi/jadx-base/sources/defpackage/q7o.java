package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q7o extends a77<q7o> {
    public t7o B;
    public float C;
    public boolean D;

    public q7o(fy9 fy9Var) {
        super(fy9Var);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }

    @Override // defpackage.a77
    public void p(float f) {
    }

    @Override // defpackage.a77
    public boolean s(long j) {
        if (this.D) {
            float f = this.C;
            if (f != Float.MAX_VALUE) {
                this.B.e(f);
                this.C = Float.MAX_VALUE;
            }
            this.f706b = this.B.a();
            this.f705a = 0.0f;
            this.D = false;
            return true;
        }
        if (this.C != Float.MAX_VALUE) {
            this.B.a();
            long j2 = j / 2;
            a77.p pVarH = this.B.h(this.f706b, this.f705a, j2);
            this.B.e(this.C);
            this.C = Float.MAX_VALUE;
            a77.p pVarH2 = this.B.h(pVarH.f709a, pVarH.f710b, j2);
            this.f706b = pVarH2.f709a;
            this.f705a = pVarH2.f710b;
        } else {
            a77.p pVarH3 = this.B.h(this.f706b, this.f705a, j);
            this.f706b = pVarH3.f709a;
            this.f705a = pVarH3.f710b;
        }
        float fMax = Math.max(this.f706b, this.h);
        this.f706b = fMax;
        float fMin = Math.min(fMax, this.g);
        this.f706b = fMin;
        if (!u(fMin, this.f705a)) {
            return false;
        }
        this.f706b = this.B.a();
        this.f705a = 0.0f;
        return true;
    }

    public t7o t() {
        return this.B;
    }

    public boolean u(float f, float f2) {
        return this.B.c(f, f2);
    }

    public q7o v(t7o t7oVar) {
        this.B = t7oVar;
        return this;
    }
}
