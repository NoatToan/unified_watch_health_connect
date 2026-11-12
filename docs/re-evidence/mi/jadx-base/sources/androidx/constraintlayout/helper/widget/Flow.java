package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.a;
import defpackage.f7c;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public e l;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.l = new e();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.x1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.y1) {
                    this.l.H2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u4j.z1) {
                    this.l.M1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u4j.J1) {
                    this.l.R1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u4j.K1) {
                    this.l.O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u4j.A1) {
                    this.l.P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u4j.B1) {
                    this.l.S1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u4j.C1) {
                    this.l.Q1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u4j.D1) {
                    this.l.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u4j.o2) {
                    this.l.M2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u4j.e2) {
                    this.l.B2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u4j.n2) {
                    this.l.L2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u4j.Y1) {
                    this.l.v2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u4j.g2) {
                    this.l.D2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u4j.a2) {
                    this.l.x2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u4j.i2) {
                    this.l.F2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == u4j.c2) {
                    this.l.z2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u4j.X1) {
                    this.l.u2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u4j.f2) {
                    this.l.C2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u4j.Z1) {
                    this.l.w2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u4j.h2) {
                    this.l.E2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u4j.l2) {
                    this.l.J2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == u4j.b2) {
                    this.l.y2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == u4j.k2) {
                    this.l.I2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == u4j.d2) {
                    this.l.A2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u4j.m2) {
                    this.l.K2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == u4j.j2) {
                    this.l.G2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.l;
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        x(this.l, i, i2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void p(a.C0020a c0020a, f7c f7cVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.p(c0020a, f7cVar, layoutParams, sparseArray);
        if (f7cVar instanceof e) {
            e eVar = (e) f7cVar;
            int i = layoutParams.Z;
            if (i != -1) {
                eVar.H2(i);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void q(ConstraintWidget constraintWidget, boolean z) {
        this.l.x1(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.l.u2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.v2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.w2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.x2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.y2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.z2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.A2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.B2(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.C2(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.D2(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.E2(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.F2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.G2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.H2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.l.M1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.N1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.P1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.Q1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.S1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.I2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.J2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.K2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.L2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.M2(i);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void x(i iVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (iVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            iVar.G1(mode, size, mode2, size2);
            setMeasuredDimension(iVar.B1(), iVar.A1());
        }
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
