package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.animation.keyframe.a;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class FlexboxItemDecoration extends RecyclerView.o {
    public static final int BOTH = 3;
    public static final int HORIZONTAL = 1;
    private static final int[] LIST_DIVIDER_ATTRS = {android.R.attr.listDivider};
    public static final int VERTICAL = 2;
    private Drawable mDrawable;
    private int mOrientation;

    public FlexboxItemDecoration(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(LIST_DIVIDER_ATTRS);
        this.mDrawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(3);
    }

    private void drawHorizontalDecorations(Canvas canvas, RecyclerView recyclerView) {
        int top;
        int intrinsicHeight;
        int left;
        int right;
        int i14;
        int iMin;
        int left2;
        if (needsHorizontalDecoration()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            int left3 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int paddingRight = recyclerView.getPaddingRight() + recyclerView.getRight();
            int childCount = recyclerView.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = recyclerView.getChildAt(i15);
                RecyclerView.q qVar = (RecyclerView.q) childAt.getLayoutParams();
                if (flexDirection == 3) {
                    intrinsicHeight = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
                    top = this.mDrawable.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) qVar).topMargin;
                    intrinsicHeight = top - this.mDrawable.getIntrinsicHeight();
                }
                if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                    if (flexboxLayoutManager.isLayoutRtl()) {
                        iMin = Math.min(this.mDrawable.getIntrinsicWidth() + childAt.getRight() + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, paddingRight);
                        left2 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
                    } else {
                        left = Math.max((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) qVar).leftMargin) - this.mDrawable.getIntrinsicWidth(), left3);
                        right = childAt.getRight();
                        i14 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
                    }
                    this.mDrawable.setBounds(left2, intrinsicHeight, iMin, top);
                    this.mDrawable.draw(canvas);
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
                    right = childAt.getRight();
                    i14 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
                }
                int i16 = left;
                iMin = right + i14;
                left2 = i16;
                this.mDrawable.setBounds(left2, intrinsicHeight, iMin, top);
                this.mDrawable.draw(canvas);
            }
        }
    }

    private void drawVerticalDecorations(Canvas canvas, RecyclerView recyclerView) {
        int left;
        int intrinsicWidth;
        int iMax;
        int bottom;
        int i14;
        int i15;
        if (needsVerticalDecoration()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top = recyclerView.getTop() - recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom() + recyclerView.getBottom();
            int childCount = recyclerView.getChildCount();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = recyclerView.getChildAt(i16);
                RecyclerView.q qVar = (RecyclerView.q) childAt.getLayoutParams();
                if (flexboxLayoutManager.isLayoutRtl()) {
                    intrinsicWidth = childAt.getRight() + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
                    left = this.mDrawable.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
                    intrinsicWidth = left - this.mDrawable.getIntrinsicWidth();
                }
                if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                    iMax = childAt.getTop() - ((ViewGroup.MarginLayoutParams) qVar).topMargin;
                    bottom = childAt.getBottom();
                    i14 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
                } else {
                    if (flexDirection == 3) {
                        int iMin = Math.min(this.mDrawable.getIntrinsicHeight() + childAt.getBottom() + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, paddingBottom);
                        iMax = childAt.getTop() - ((ViewGroup.MarginLayoutParams) qVar).topMargin;
                        i15 = iMin;
                    } else {
                        iMax = Math.max((childAt.getTop() - ((ViewGroup.MarginLayoutParams) qVar).topMargin) - this.mDrawable.getIntrinsicHeight(), top);
                        bottom = childAt.getBottom();
                        i14 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
                    }
                    this.mDrawable.setBounds(intrinsicWidth, iMax, left, i15);
                    this.mDrawable.draw(canvas);
                }
                i15 = bottom + i14;
                this.mDrawable.setBounds(intrinsicWidth, iMax, left, i15);
                this.mDrawable.draw(canvas);
            }
        }
    }

    private boolean isFirstItemInLine(int i14, List<FlexLine> list, FlexboxLayoutManager flexboxLayoutManager) {
        int positionToFlexLineIndex = flexboxLayoutManager.getPositionToFlexLineIndex(i14);
        if ((positionToFlexLineIndex == -1 || positionToFlexLineIndex >= flexboxLayoutManager.getFlexLinesInternal().size() || flexboxLayoutManager.getFlexLinesInternal().get(positionToFlexLineIndex).mFirstIndex != i14) && i14 != 0) {
            return list.size() != 0 && ((FlexLine) a.c(1, list)).mLastIndex == i14 - 1;
        }
        return true;
    }

    private boolean needsHorizontalDecoration() {
        return (this.mOrientation & 1) > 0;
    }

    private boolean needsVerticalDecoration() {
        return (this.mOrientation & 2) > 0;
    }

    private void setOffsetAlongCrossAxis(Rect rect, int i14, FlexboxLayoutManager flexboxLayoutManager, List<FlexLine> list) {
        if (list.size() == 0 || flexboxLayoutManager.getPositionToFlexLineIndex(i14) == 0) {
            return;
        }
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            if (needsHorizontalDecoration()) {
                rect.top = this.mDrawable.getIntrinsicHeight();
                rect.bottom = 0;
                return;
            } else {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
        }
        if (needsVerticalDecoration()) {
            boolean zIsLayoutRtl = flexboxLayoutManager.isLayoutRtl();
            Drawable drawable = this.mDrawable;
            if (zIsLayoutRtl) {
                rect.right = drawable.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = drawable.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    private void setOffsetAlongMainAxis(Rect rect, int i14, FlexboxLayoutManager flexboxLayoutManager, List<FlexLine> list, int i15) {
        if (isFirstItemInLine(i14, list, flexboxLayoutManager)) {
            return;
        }
        if (!flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            if (!needsHorizontalDecoration()) {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
            Drawable drawable = this.mDrawable;
            if (i15 == 3) {
                rect.bottom = drawable.getIntrinsicHeight();
                rect.top = 0;
                return;
            } else {
                rect.top = drawable.getIntrinsicHeight();
                rect.bottom = 0;
                return;
            }
        }
        if (!needsVerticalDecoration()) {
            rect.left = 0;
            rect.right = 0;
            return;
        }
        boolean zIsLayoutRtl = flexboxLayoutManager.isLayoutRtl();
        Drawable drawable2 = this.mDrawable;
        if (zIsLayoutRtl) {
            rect.right = drawable2.getIntrinsicWidth();
            rect.left = 0;
        } else {
            rect.left = drawable2.getIntrinsicWidth();
            rect.right = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
        if (childAdapterPosition == 0) {
            return;
        }
        if (!needsHorizontalDecoration() && !needsVerticalDecoration()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        List<FlexLine> flexLines = flexboxLayoutManager.getFlexLines();
        setOffsetAlongMainAxis(rect, childAdapterPosition, flexboxLayoutManager, flexLines, flexboxLayoutManager.getFlexDirection());
        setOffsetAlongCrossAxis(rect, childAdapterPosition, flexboxLayoutManager, flexLines);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        drawHorizontalDecorations(canvas, recyclerView);
        drawVerticalDecorations(canvas, recyclerView);
    }

    public void setDrawable(Drawable drawable) {
        if (drawable != null) {
            this.mDrawable = drawable;
        } else {
            h.s("Drawable cannot be null.");
        }
    }

    public void setOrientation(int i14) {
        this.mOrientation = i14;
    }
}
