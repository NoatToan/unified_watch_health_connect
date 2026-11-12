package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Group extends b {
    public Group(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    public final void l() {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f6129q0.T(0);
        bVar.f6129q0.O(0);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f14) {
        super.setElevation(f14);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i14) {
        super.setVisibility(i14);
        d();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
