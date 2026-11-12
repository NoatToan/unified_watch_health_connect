package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e7c extends njr {
    public e7c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void q(iz5 iz5Var) {
        this.h.f22242k.add(iz5Var);
        iz5Var.l.add(this.h);
    }

    @Override // defpackage.njr, defpackage.fz5
    public void a(fz5 fz5Var) {
        a aVar = (a) this.f27993b;
        int iZ1 = aVar.z1();
        Iterator<iz5> it = this.h.l.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iZ1 == 0 || iZ1 == 2) {
            this.h.d(i2 + aVar.A1());
        } else {
            this.h.d(i + aVar.A1());
        }
    }

    @Override // defpackage.njr
    public void d() {
        ConstraintWidget constraintWidget = this.f27993b;
        if (constraintWidget instanceof a) {
            this.h.f22241b = true;
            a aVar = (a) constraintWidget;
            int iZ1 = aVar.z1();
            boolean zY1 = aVar.y1();
            int i = 0;
            if (iZ1 == 0) {
                this.h.e = iz5.a.LEFT;
                while (i < aVar.W0) {
                    ConstraintWidget constraintWidget2 = aVar.V0[i];
                    if (zY1 || constraintWidget2.X() != 8) {
                        iz5 iz5Var = constraintWidget2.e.h;
                        iz5Var.f22242k.add(this.h);
                        this.h.l.add(iz5Var);
                    }
                    i++;
                }
                q(this.f27993b.e.h);
                q(this.f27993b.e.i);
                return;
            }
            if (iZ1 == 1) {
                this.h.e = iz5.a.RIGHT;
                while (i < aVar.W0) {
                    ConstraintWidget constraintWidget3 = aVar.V0[i];
                    if (zY1 || constraintWidget3.X() != 8) {
                        iz5 iz5Var2 = constraintWidget3.e.i;
                        iz5Var2.f22242k.add(this.h);
                        this.h.l.add(iz5Var2);
                    }
                    i++;
                }
                q(this.f27993b.e.h);
                q(this.f27993b.e.i);
                return;
            }
            if (iZ1 == 2) {
                this.h.e = iz5.a.TOP;
                while (i < aVar.W0) {
                    ConstraintWidget constraintWidget4 = aVar.V0[i];
                    if (zY1 || constraintWidget4.X() != 8) {
                        iz5 iz5Var3 = constraintWidget4.f.h;
                        iz5Var3.f22242k.add(this.h);
                        this.h.l.add(iz5Var3);
                    }
                    i++;
                }
                q(this.f27993b.f.h);
                q(this.f27993b.f.i);
                return;
            }
            if (iZ1 != 3) {
                return;
            }
            this.h.e = iz5.a.BOTTOM;
            while (i < aVar.W0) {
                ConstraintWidget constraintWidget5 = aVar.V0[i];
                if (zY1 || constraintWidget5.X() != 8) {
                    iz5 iz5Var4 = constraintWidget5.f.i;
                    iz5Var4.f22242k.add(this.h);
                    this.h.l.add(iz5Var4);
                }
                i++;
            }
            q(this.f27993b.f.h);
            q(this.f27993b.f.i);
        }
    }

    @Override // defpackage.njr
    public void e() {
        ConstraintWidget constraintWidget = this.f27993b;
        if (constraintWidget instanceof a) {
            int iZ1 = ((a) constraintWidget).z1();
            if (iZ1 == 0 || iZ1 == 1) {
                this.f27993b.q1(this.h.g);
            } else {
                this.f27993b.r1(this.h.g);
            }
        }
    }

    @Override // defpackage.njr
    public void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.njr
    public boolean m() {
        return false;
    }
}
