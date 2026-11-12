package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.VirtualLayout;
import defpackage.d7c;

/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {
    public h l;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.d = new h();
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        x(this.l, i, i2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void u(d dVar, d7c d7cVar, SparseArray<ConstraintWidget> sparseArray) {
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

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
