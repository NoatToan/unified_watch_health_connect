package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6347j;

    public l(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f6310b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 6) {
                    this.f6346i = true;
                } else if (index == 22) {
                    this.f6347j = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void n(t6.l lVar, int i14, int i15) {
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6346i || this.f6347j) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i14 = 0; i14 < this.f6167b; i14++) {
                    View viewById = constraintLayout.getViewById(this.f6166a[i14]);
                    if (viewById != null) {
                        if (this.f6346i) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f6347j && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public l(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
