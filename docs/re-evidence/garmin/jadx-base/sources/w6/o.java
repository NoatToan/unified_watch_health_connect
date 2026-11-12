package w6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class o extends androidx.constraintlayout.widget.b implements q.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f182914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f182915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f182916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View[] f182917l;

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f182914i = false;
        this.f182915j = false;
        i(attributeSet);
    }

    public float getProgress() {
        return this.f182916k;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f6322n);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 1) {
                    this.f182914i = typedArrayObtainStyledAttributes.getBoolean(index, this.f182914i);
                } else if (index == 0) {
                    this.f182915j = typedArrayObtainStyledAttributes.getBoolean(index, this.f182915j);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f14) {
        this.f182916k = f14;
        int i14 = 0;
        if (this.f6167b <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i14 < childCount) {
                viewGroup.getChildAt(i14);
                i14++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.f6172g;
        if (viewArr == null || viewArr.length != this.f6167b) {
            this.f6172g = new View[this.f6167b];
        }
        for (int i15 = 0; i15 < this.f6167b; i15++) {
            this.f6172g[i15] = constraintLayout.getViewById(this.f6166a[i15]);
        }
        this.f182917l = this.f6172g;
        while (i14 < this.f6167b) {
            View view2 = this.f182917l[i14];
            i14++;
        }
    }

    public o(Context context) {
        super(context);
        this.f182914i = false;
        this.f182915j = false;
    }

    public o(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f182914i = false;
        this.f182915j = false;
        i(attributeSet);
    }
}
