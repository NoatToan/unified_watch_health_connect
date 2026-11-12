package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes6.dex */
public class ixk extends oya<ixk> {
    public hxk B;
    public double C;
    public double D;
    public hxk.a E = new a();

    public class a implements hxk.a {
        public a() {
        }

        @Override // hxk.a
        public boolean a(hxk hxkVar) {
            double d = ixk.this.C;
            ixk.this.C += hxkVar.d();
            long jE = hxkVar.e();
            if (jE > 0) {
                ixk ixkVar = ixk.this;
                ixkVar.D = (ixkVar.C - d) / jE;
            }
            if (Math.abs(ixk.this.C) < 0.08726646259971647d || ixk.this.p() != 2) {
                return true;
            }
            ixk.this.a();
            return true;
        }

        @Override // hxk.a
        public void b(hxk hxkVar) {
            ixk.this.g();
        }

        @Override // hxk.a
        public boolean c(hxk hxkVar) {
            return true;
        }
    }

    public ixk() {
        L(false);
    }

    @Override // defpackage.oya
    public void C(MotionEvent motionEvent) {
        int iP = p();
        if (iP == 0) {
            this.D = 0.0d;
            this.C = 0.0d;
            this.B = new hxk(this.E);
            c();
        }
        hxk hxkVar = this.B;
        if (hxkVar != null) {
            hxkVar.f(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            if (iP == 4) {
                g();
            } else {
                h();
            }
        }
    }

    @Override // defpackage.oya
    public void D() {
        this.B = null;
        this.D = 0.0d;
        this.C = 0.0d;
    }

    public float X() {
        hxk hxkVar = this.B;
        if (hxkVar == null) {
            return Float.NaN;
        }
        return hxkVar.b();
    }

    public float Y() {
        hxk hxkVar = this.B;
        if (hxkVar == null) {
            return Float.NaN;
        }
        return hxkVar.c();
    }

    public double Z() {
        return this.C;
    }

    public double a0() {
        return this.D;
    }
}
