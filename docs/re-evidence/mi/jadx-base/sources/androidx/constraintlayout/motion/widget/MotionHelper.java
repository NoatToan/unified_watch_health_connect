package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.n8g;
import defpackage.u4j;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.k {
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1922k;
    public float l;
    public View[] m;

    public MotionHelper(Context context) {
        super(context);
        this.j = false;
        this.f1922k = false;
    }

    public void A(MotionLayout motionLayout) {
    }

    public void B(Canvas canvas) {
    }

    public void C(Canvas canvas) {
    }

    public void D(MotionLayout motionLayout, HashMap<View, n8g> map) {
    }

    public void E(View view, float f) {
    }

    public void a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    public void b(MotionLayout motionLayout, int i) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.k
    public void c(MotionLayout motionLayout, int i, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.k
    public void d(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    public float getProgress() {
        return this.l;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.B9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.D9) {
                    this.j = typedArrayObtainStyledAttributes.getBoolean(index, this.j);
                } else if (index == u4j.C9) {
                    this.f1922k = typedArrayObtainStyledAttributes.getBoolean(index, this.f1922k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.l = f;
        int i = 0;
        if (this.f2000b > 0) {
            this.m = n((ConstraintLayout) getParent());
            while (i < this.f2000b) {
                E(this.m[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                E(childAt, f);
            }
            i++;
        }
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return this.f1922k;
    }

    public boolean z() {
        return this.j;
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.f1922k = false;
        o(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = false;
        this.f1922k = false;
        o(attributeSet);
    }
}
