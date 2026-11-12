package miuix.appcompat.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import defpackage.dmi;
import defpackage.g5j;

/* JADX INFO: loaded from: classes3.dex */
public class CollapseTitleColorTransitionTextView extends ColorTransitionTextView {
    public final boolean g;
    public float h;
    public final float i;

    public CollapseTitleColorTransitionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = getTextSize();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g5j.D0, i, 0);
        this.g = typedArrayObtainStyledAttributes.getBoolean(g5j.F0, true);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(g5j.E0, context.getResources().getDimensionPixelSize(dmi.z0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean f() {
        Layout layout = getLayout();
        int lineCount = layout.getLineCount();
        if (getMaxLines() > 0 && lineCount > getMaxLines()) {
            return true;
        }
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.g) {
            float f = this.h;
            if (f > this.i) {
                setTextSize(0, f);
                super.onMeasure(i, i2);
                if (f()) {
                    setTextSize(0, this.i);
                    super.onMeasure(i, i2);
                    return;
                }
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        this.h = getTextSize();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.h = getTextSize();
    }
}
