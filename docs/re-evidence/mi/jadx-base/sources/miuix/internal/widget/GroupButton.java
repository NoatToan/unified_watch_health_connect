package miuix.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.eyq;
import defpackage.g5j;
import defpackage.zhi;

/* JADX INFO: loaded from: classes3.dex */
public class GroupButton extends AppCompatButton {
    public static final int[] f = {zhi.V};
    public static final int[] g = {zhi.Z};
    public static final int[] h = {zhi.X};
    public static final int[] i = {zhi.U};
    public static final int[] j = {zhi.Y};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f26639k = {zhi.W};
    public static final int[] l = {zhi.a0};
    public AttributeSet d;
    public boolean e;

    public GroupButton(Context context) {
        super(context);
    }

    public final void a(Context context, AttributeSet attributeSet, int i2) {
        this.d = attributeSet;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.f1, i2, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(g5j.g1)) {
                this.e = typedArrayObtainStyledAttributes.getBoolean(g5j.g1, false);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public boolean b() {
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null && (viewGroup instanceof LinearLayout)) {
            int orientation = ((LinearLayout) viewGroup).getOrientation();
            int iIndexOfChild = viewGroup.indexOfChild(this);
            int i3 = 0;
            boolean z = true;
            boolean z2 = true;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                if (viewGroup.getChildAt(i4).getVisibility() == 0) {
                    i3++;
                    if (i4 < iIndexOfChild) {
                        z = false;
                    }
                    if (i4 > iIndexOfChild) {
                        z2 = false;
                    }
                }
            }
            boolean z3 = i3 == 1;
            if (orientation == 1) {
                int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
                View.mergeDrawableStates(iArrOnCreateDrawableState, l);
                if (!z3) {
                    if (z) {
                        View.mergeDrawableStates(iArrOnCreateDrawableState, f);
                    } else if (z2) {
                        View.mergeDrawableStates(iArrOnCreateDrawableState, h);
                    } else {
                        View.mergeDrawableStates(iArrOnCreateDrawableState, g);
                    }
                }
                return iArrOnCreateDrawableState;
            }
            boolean zB = eyq.b(this);
            int[] iArrOnCreateDrawableState2 = super.onCreateDrawableState(i2 + 1);
            if (z3) {
                View.mergeDrawableStates(iArrOnCreateDrawableState2, l);
            } else if (z) {
                View.mergeDrawableStates(iArrOnCreateDrawableState2, zB ? f26639k : i);
            } else if (z2) {
                View.mergeDrawableStates(iArrOnCreateDrawableState2, zB ? i : f26639k);
            } else {
                View.mergeDrawableStates(iArrOnCreateDrawableState2, j);
            }
            return iArrOnCreateDrawableState2;
        }
        return super.onCreateDrawableState(i2);
    }

    public GroupButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet, i2);
    }
}
