package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import defpackage.f7c;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1995k;
    public androidx.constraintlayout.core.widgets.a l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.l.y1();
    }

    public int getMargin() {
        return this.l.A1();
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.l = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.x1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.N1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u4j.M1) {
                    this.l.D1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == u4j.O1) {
                    this.l.F1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.l;
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void p(a.C0020a c0020a, f7c f7cVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.p(c0020a, f7cVar, layoutParams, sparseArray);
        if (f7cVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) f7cVar;
            x(aVar, c0020a.e.h0, ((d) f7cVar.M()).U1());
            aVar.D1(c0020a.e.p0);
            aVar.F1(c0020a.e.i0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void q(ConstraintWidget constraintWidget, boolean z) {
        x(constraintWidget, this.j, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.D1(z);
    }

    public void setDpMargin(int i) {
        this.l.F1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.l.F1(i);
    }

    public void setType(int i) {
        this.j = i;
    }

    public final void x(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f1995k = i;
        if (z) {
            int i2 = this.j;
            if (i2 == 5) {
                this.f1995k = 1;
            } else if (i2 == 6) {
                this.f1995k = 0;
            }
        } else {
            int i3 = this.j;
            if (i3 == 5) {
                this.f1995k = 0;
            } else if (i3 == 6) {
                this.f1995k = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).E1(this.f1995k);
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
