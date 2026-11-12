package com.google.android.material.divider;

import a7.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    private int color;
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i14) {
        int i15 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i14, i15), attributeSet, i14);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialDivider, i14, i15, new int[0]);
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getDividerColor() {
        return this.color;
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i14;
        super.onDraw(canvas);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        boolean z14 = getLayoutDirection() == 1;
        int i15 = z14 ? this.insetEnd : this.insetStart;
        if (z14) {
            width = getWidth();
            i14 = this.insetStart;
        } else {
            width = getWidth();
            i14 = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i15, 0, width - i14, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        int mode = View.MeasureSpec.getMode(i15);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i16 = this.thickness;
            if (i16 > 0 && measuredHeight != i16) {
                measuredHeight = i16;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i14) {
        if (this.color != i14) {
            this.color = i14;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i14));
            invalidate();
        }
    }

    public void setDividerColorResource(int i14) {
        setDividerColor(b.getColor(getContext(), i14));
    }

    public void setDividerInsetEnd(int i14) {
        this.insetEnd = i14;
    }

    public void setDividerInsetEndResource(int i14) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i14));
    }

    public void setDividerInsetStart(int i14) {
        this.insetStart = i14;
    }

    public void setDividerInsetStartResource(int i14) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i14));
    }

    public void setDividerThickness(int i14) {
        if (this.thickness != i14) {
            this.thickness = i14;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i14) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i14));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}
