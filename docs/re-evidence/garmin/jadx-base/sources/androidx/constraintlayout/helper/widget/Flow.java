package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.l;
import t6.g;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f6091k;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.b
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f6091k = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f6310b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 0) {
                    this.f6091k.f162660b1 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f6091k;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f162693y0 = dimensionPixelSize;
                    gVar.f162694z0 = dimensionPixelSize;
                    gVar.A0 = dimensionPixelSize;
                    gVar.B0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.f6091k;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.A0 = dimensionPixelSize2;
                    gVar2.C0 = dimensionPixelSize2;
                    gVar2.D0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f6091k.B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f6091k.C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f6091k.f162693y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f6091k.D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f6091k.f162694z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f6091k.Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f6091k.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f6091k.K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f6091k.L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f6091k.N0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f6091k.M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f6091k.O0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f6091k.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f6091k.R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f6091k.T0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f6091k.S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f6091k.U0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f6091k.Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f6091k.X0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f6091k.Y0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f6091k.V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f6091k.W0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f6091k.f162659a1 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6169d = this.f6091k;
        m();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void j(d.a aVar, t6.i iVar, e.a aVar2, SparseArray sparseArray) {
        super.j(aVar, iVar, aVar2, sparseArray);
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            int i14 = aVar2.V;
            if (i14 != -1) {
                gVar.f162660b1 = i14;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public final void k(t6.e eVar, boolean z14) {
        g gVar = this.f6091k;
        int i14 = gVar.A0;
        if (i14 > 0 || gVar.B0 > 0) {
            if (z14) {
                gVar.C0 = gVar.B0;
                gVar.D0 = i14;
            } else {
                gVar.C0 = i14;
                gVar.D0 = gVar.B0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.l
    public final void n(t6.l lVar, int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i15);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.a0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.F0, lVar.G0);
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i14, int i15) {
        n(this.f6091k, i14, i15);
    }

    public void setFirstHorizontalBias(float f14) {
        this.f6091k.R0 = f14;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i14) {
        this.f6091k.L0 = i14;
        requestLayout();
    }

    public void setFirstVerticalBias(float f14) {
        this.f6091k.S0 = f14;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i14) {
        this.f6091k.M0 = i14;
        requestLayout();
    }

    public void setHorizontalAlign(int i14) {
        this.f6091k.X0 = i14;
        requestLayout();
    }

    public void setHorizontalBias(float f14) {
        this.f6091k.P0 = f14;
        requestLayout();
    }

    public void setHorizontalGap(int i14) {
        this.f6091k.V0 = i14;
        requestLayout();
    }

    public void setHorizontalStyle(int i14) {
        this.f6091k.J0 = i14;
        requestLayout();
    }

    public void setLastHorizontalBias(float f14) {
        this.f6091k.T0 = f14;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i14) {
        this.f6091k.N0 = i14;
        requestLayout();
    }

    public void setLastVerticalBias(float f14) {
        this.f6091k.U0 = f14;
        requestLayout();
    }

    public void setLastVerticalStyle(int i14) {
        this.f6091k.O0 = i14;
        requestLayout();
    }

    public void setMaxElementsWrap(int i14) {
        this.f6091k.f162659a1 = i14;
        requestLayout();
    }

    public void setOrientation(int i14) {
        this.f6091k.f162660b1 = i14;
        requestLayout();
    }

    public void setPadding(int i14) {
        g gVar = this.f6091k;
        gVar.f162693y0 = i14;
        gVar.f162694z0 = i14;
        gVar.A0 = i14;
        gVar.B0 = i14;
        requestLayout();
    }

    public void setPaddingBottom(int i14) {
        this.f6091k.f162694z0 = i14;
        requestLayout();
    }

    public void setPaddingLeft(int i14) {
        this.f6091k.C0 = i14;
        requestLayout();
    }

    public void setPaddingRight(int i14) {
        this.f6091k.D0 = i14;
        requestLayout();
    }

    public void setPaddingTop(int i14) {
        this.f6091k.f162693y0 = i14;
        requestLayout();
    }

    public void setVerticalAlign(int i14) {
        this.f6091k.Y0 = i14;
        requestLayout();
    }

    public void setVerticalBias(float f14) {
        this.f6091k.Q0 = f14;
        requestLayout();
    }

    public void setVerticalGap(int i14) {
        this.f6091k.W0 = i14;
        requestLayout();
    }

    public void setVerticalStyle(int i14) {
        this.f6091k.K0 = i14;
        requestLayout();
    }

    public void setWrapMode(int i14) {
        this.f6091k.Z0 = i14;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
