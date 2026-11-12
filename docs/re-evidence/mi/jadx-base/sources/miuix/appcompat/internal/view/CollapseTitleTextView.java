package miuix.appcompat.internal.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.dmi;
import defpackage.g5j;

/* JADX INFO: loaded from: classes3.dex */
public class CollapseTitleTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26484b;
    public final float c;

    public CollapseTitleTextView(Context context) {
        this(context, null);
    }

    public final boolean d() {
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

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f26483a) {
            float f = this.f26484b;
            if (f > this.c) {
                setTextSize(0, f);
                super.onMeasure(i, i2);
                if (d()) {
                    setTextSize(0, this.c);
                    super.onMeasure(i, i2);
                    return;
                }
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        this.f26484b = getTextSize();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.f26484b = getTextSize();
    }

    public CollapseTitleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public CollapseTitleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26484b = getTextSize();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g5j.D0, i, 0);
        this.f26483a = typedArrayObtainStyledAttributes.getBoolean(g5j.F0, true);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(g5j.E0, context.getResources().getDimensionPixelSize(dmi.z0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
