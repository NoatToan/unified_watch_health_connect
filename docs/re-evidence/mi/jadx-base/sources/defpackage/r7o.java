package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public final class r7o extends z67<r7o> {
    public u7o A;
    public float B;
    public boolean C;

    public <K> r7o(K k2, dy9<K> dy9Var) {
        super(k2, dy9Var);
        this.A = null;
        this.B = Float.MAX_VALUE;
        this.C = false;
    }

    @Override // defpackage.z67
    public void j() {
        p();
        this.A.g(d());
        super.j();
    }

    @Override // defpackage.z67
    public boolean l(long j) {
        if (this.C) {
            float f = this.B;
            if (f != Float.MAX_VALUE) {
                this.A.e(f);
                this.B = Float.MAX_VALUE;
            }
            this.f40941b = this.A.a();
            this.f40940a = 0.0f;
            this.C = false;
            return true;
        }
        if (this.B != Float.MAX_VALUE) {
            this.A.a();
            long j2 = j / 2;
            z67.o oVarH = this.A.h(this.f40941b, this.f40940a, j2);
            this.A.e(this.B);
            this.B = Float.MAX_VALUE;
            z67.o oVarH2 = this.A.h(oVarH.f40943a, oVarH.f40944b, j2);
            this.f40941b = oVarH2.f40943a;
            this.f40940a = oVarH2.f40944b;
        } else {
            z67.o oVarH3 = this.A.h(this.f40941b, this.f40940a, j);
            this.f40941b = oVarH3.f40943a;
            this.f40940a = oVarH3.f40944b;
        }
        float fMax = Math.max(this.f40941b, this.h);
        this.f40941b = fMax;
        float fMin = Math.min(fMax, this.g);
        this.f40941b = fMin;
        if (!o(fMin, this.f40940a)) {
            return false;
        }
        this.f40941b = this.A.a();
        this.f40940a = 0.0f;
        return true;
    }

    public void m(float f) {
        if (e()) {
            this.B = f;
            return;
        }
        if (this.A == null) {
            this.A = new u7o(f);
        }
        this.A.e(f);
        j();
    }

    public boolean n() {
        return this.A.f35501b > 0.0d;
    }

    public boolean o(float f, float f2) {
        return this.A.c(f, f2);
    }

    public final void p() {
        u7o u7oVar = this.A;
        if (u7oVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = u7oVar.a();
        if (dA > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public r7o q(u7o u7oVar) {
        this.A = u7oVar;
        return this;
    }

    public void r() {
        if (!n()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f) {
            this.C = true;
        }
    }
}
