package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class zhr extends ConstraintWidget {
    public ArrayList<ConstraintWidget> V0 = new ArrayList<>();

    public void a(ConstraintWidget constraintWidget) {
        this.V0.add(constraintWidget);
        if (constraintWidget.M() != null) {
            ((zhr) constraintWidget.M()).x1(constraintWidget);
        }
        constraintWidget.g1(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void v0() {
        this.V0.clear();
        super.v0();
    }

    public ArrayList<ConstraintWidget> v1() {
        return this.V0;
    }

    public void w1() {
        ArrayList<ConstraintWidget> arrayList = this.V0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.V0.get(i);
            if (constraintWidget instanceof zhr) {
                ((zhr) constraintWidget).w1();
            }
        }
    }

    public void x1(ConstraintWidget constraintWidget) {
        this.V0.remove(constraintWidget);
        constraintWidget.v0();
    }

    public void y1() {
        this.V0.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void z0(z83 z83Var) {
        super.z0(z83Var);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            this.V0.get(i).z0(z83Var);
        }
    }
}
