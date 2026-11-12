package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;

/* JADX INFO: loaded from: classes.dex */
public class hab extends njr {
    public hab(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.e.f();
        constraintWidget.f.f();
        this.f = ((f) constraintWidget).w1();
    }

    @Override // defpackage.njr, defpackage.fz5
    public void a(fz5 fz5Var) {
        iz5 iz5Var = this.h;
        if (iz5Var.c && !iz5Var.j) {
            this.h.d((int) ((iz5Var.l.get(0).g * ((f) this.f27993b).z1()) + 0.5f));
        }
    }

    @Override // defpackage.njr
    public void d() {
        f fVar = (f) this.f27993b;
        int iX1 = fVar.x1();
        int iY1 = fVar.y1();
        fVar.z1();
        if (fVar.w1() == 1) {
            if (iX1 != -1) {
                this.h.l.add(this.f27993b.c0.e.h);
                this.f27993b.c0.e.h.f22242k.add(this.h);
                this.h.f = iX1;
            } else if (iY1 != -1) {
                this.h.l.add(this.f27993b.c0.e.i);
                this.f27993b.c0.e.i.f22242k.add(this.h);
                this.h.f = -iY1;
            } else {
                iz5 iz5Var = this.h;
                iz5Var.f22241b = true;
                iz5Var.l.add(this.f27993b.c0.e.i);
                this.f27993b.c0.e.i.f22242k.add(this.h);
            }
            q(this.f27993b.e.h);
            q(this.f27993b.e.i);
            return;
        }
        if (iX1 != -1) {
            this.h.l.add(this.f27993b.c0.f.h);
            this.f27993b.c0.f.h.f22242k.add(this.h);
            this.h.f = iX1;
        } else if (iY1 != -1) {
            this.h.l.add(this.f27993b.c0.f.i);
            this.f27993b.c0.f.i.f22242k.add(this.h);
            this.h.f = -iY1;
        } else {
            iz5 iz5Var2 = this.h;
            iz5Var2.f22241b = true;
            iz5Var2.l.add(this.f27993b.c0.f.i);
            this.f27993b.c0.f.i.f22242k.add(this.h);
        }
        q(this.f27993b.f.h);
        q(this.f27993b.f.i);
    }

    @Override // defpackage.njr
    public void e() {
        if (((f) this.f27993b).w1() == 1) {
            this.f27993b.q1(this.h.g);
        } else {
            this.f27993b.r1(this.h.g);
        }
    }

    @Override // defpackage.njr
    public void f() {
        this.h.c();
    }

    @Override // defpackage.njr
    public boolean m() {
        return false;
    }

    public final void q(iz5 iz5Var) {
        this.h.f22242k.add(iz5Var);
        iz5Var.l.add(this.h);
    }
}
