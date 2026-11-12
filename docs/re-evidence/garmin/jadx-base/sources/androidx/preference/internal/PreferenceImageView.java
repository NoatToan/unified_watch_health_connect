package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import bd.i;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10219b;

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f10218a = Integer.MAX_VALUE;
        this.f10219b = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f17516j, i14, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f10219b;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f10218a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i14);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i14);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i14 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i15);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i15);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i15 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i14, i15);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i14) {
        this.f10219b = i14;
        super.setMaxHeight(i14);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i14) {
        this.f10218a = i14;
        super.setMaxWidth(i14);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context) {
        this(context, null);
    }
}
