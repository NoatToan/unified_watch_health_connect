package com.google.android.material.divider;

import a7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialDividerItemDecoration extends RecyclerView.o {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int color;
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i14, int i15) {
        this.tempRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i14, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        typedArrayObtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i15);
    }

    private void drawForHorizontalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int i14;
        int i15;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i16 = paddingTop + this.insetStart;
        int i17 = height - this.insetEnd;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = recyclerView.getChildAt(i18);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationX());
                Rect rect = this.tempRect;
                if (zIsLayoutRtl) {
                    i15 = rect.left + iRound;
                    i14 = this.thickness + i15;
                } else {
                    i14 = iRound + rect.right;
                    i15 = i14 - this.thickness;
                }
                this.dividerDrawable.setBounds(i15, i16, i14, i17);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int i14 = paddingLeft + (zIsLayoutRtl ? this.insetEnd : this.insetStart);
        int i15 = width - (zIsLayoutRtl ? this.insetStart : this.insetEnd);
        int childCount = recyclerView.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = recyclerView.getChildAt(i16);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationY()) + this.tempRect.bottom;
                this.dividerDrawable.setBounds(i14, iRound - this.thickness, i15, iRound);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private boolean shouldDrawDivider(RecyclerView recyclerView, View view2) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
        RecyclerView.h adapter = recyclerView.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, (RecyclerView.h<?>) adapter);
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

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(recyclerView, view2)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
                return;
            }
            boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
            int i14 = this.thickness;
            if (zIsLayoutRtl) {
                rect.left = i14;
            } else {
                rect.right = i14;
            }
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColor(int i14) {
        this.color = i14;
        Drawable drawable = this.dividerDrawable;
        this.dividerDrawable = drawable;
        drawable.setTint(i14);
    }

    public void setDividerColorResource(Context context, int i14) {
        setDividerColor(b.getColor(context, i14));
    }

    public void setDividerInsetEnd(int i14) {
        this.insetEnd = i14;
    }

    public void setDividerInsetEndResource(Context context, int i14) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i14));
    }

    public void setDividerInsetStart(int i14) {
        this.insetStart = i14;
    }

    public void setDividerInsetStartResource(Context context, int i14) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i14));
    }

    public void setDividerThickness(int i14) {
        this.thickness = i14;
    }

    public void setDividerThicknessResource(Context context, int i14) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i14));
    }

    public void setLastItemDecorated(boolean z14) {
        this.lastItemDecorated = z14;
    }

    public void setOrientation(int i14) {
        if (i14 == 0 || i14 == 1) {
            this.orientation = i14;
        } else {
            h.s(e0.f(i14, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
        }
    }

    public boolean shouldDrawDivider(int i14, RecyclerView.h<?> hVar) {
        return true;
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, R.attr.materialDividerStyle, i14);
    }

    public MaterialDividerItemDecoration(Context context, int i14) {
        this(context, null, i14);
    }
}
