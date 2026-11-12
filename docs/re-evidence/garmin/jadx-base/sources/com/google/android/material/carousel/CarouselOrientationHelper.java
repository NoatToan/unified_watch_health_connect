package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
abstract class CarouselOrientationHelper {
    final int orientation;

    private CarouselOrientationHelper(int i14) {
        this.orientation = i14;
    }

    private static CarouselOrientationHelper createHorizontalHelper(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(0) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                float f14 = rectF2.left;
                float f15 = rectF3.left;
                if (f14 < f15 && rectF2.right > f15) {
                    float f16 = f15 - f14;
                    rectF.left += f16;
                    rectF2.left += f16;
                }
                float f17 = rectF2.right;
                float f18 = rectF3.right;
                if (f17 <= f18 || rectF2.left >= f18) {
                    return;
                }
                float f19 = f17 - f18;
                rectF.right = Math.max(rectF.right - f19, rectF.left);
                rectF2.right = Math.max(rectF2.right - f19, rectF2.left);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getDecoratedCrossAxisMeasurement(View view2) {
                RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredHeight(view2) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.q qVar) {
                return ((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f14, float f15, float f16, float f17) {
                return new RectF(f17, 0.0f, f15 - f17, f14);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentBottom() {
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentEnd() {
                return carouselLayoutManager.isLayoutRtl() ? getParentLeft() : getParentRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentLeft() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentRight() {
                return carouselLayoutManager.getWidth();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentStart() {
                return carouselLayoutManager.isLayoutRtl() ? getParentRight() : getParentLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentTop() {
                return carouselLayoutManager.getPaddingTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view2, int i14, int i15) {
                int parentTop = getParentTop();
                carouselLayoutManager.layoutDecoratedWithMargins(view2, i14, parentTop, i15, parentTop + getDecoratedCrossAxisMeasurement(view2));
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.right <= rectF3.left) {
                    float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                    rectF.right = fFloor;
                    rectF.left = Math.min(rectF.left, fFloor);
                }
                if (rectF2.left >= rectF3.right) {
                    float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                    rectF.left = fCeil;
                    rectF.right = Math.max(fCeil, rectF.right);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view2, Rect rect, float f14, float f15) {
                view2.offsetLeftAndRight((int) (f15 - (rect.left + f14)));
            }
        };
    }

    public static CarouselOrientationHelper createOrientationHelper(CarouselLayoutManager carouselLayoutManager, int i14) {
        if (i14 == 0) {
            return createHorizontalHelper(carouselLayoutManager);
        }
        if (i14 == 1) {
            return createVerticalHelper(carouselLayoutManager);
        }
        h.s("invalid orientation");
        return null;
    }

    private static CarouselOrientationHelper createVerticalHelper(final CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(1) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                float f14 = rectF2.top;
                float f15 = rectF3.top;
                if (f14 < f15 && rectF2.bottom > f15) {
                    float f16 = f15 - f14;
                    rectF.top += f16;
                    rectF3.top += f16;
                }
                float f17 = rectF2.bottom;
                float f18 = rectF3.bottom;
                if (f17 <= f18 || rectF2.top >= f18) {
                    return;
                }
                float f19 = f17 - f18;
                rectF.bottom = Math.max(rectF.bottom - f19, rectF.top);
                rectF2.bottom = Math.max(rectF2.bottom - f19, rectF2.top);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getDecoratedCrossAxisMeasurement(View view2) {
                RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredWidth(view2) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.q qVar) {
                return ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f14, float f15, float f16, float f17) {
                return new RectF(0.0f, f16, f15, f14 - f16);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentBottom() {
                return carouselLayoutManager.getHeight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentEnd() {
                return getParentBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentLeft() {
                return carouselLayoutManager.getPaddingLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentRight() {
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentStart() {
                return getParentTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public int getParentTop() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view2, int i14, int i15) {
                int parentLeft = getParentLeft();
                carouselLayoutManager.layoutDecoratedWithMargins(view2, parentLeft, i14, parentLeft + getDecoratedCrossAxisMeasurement(view2), i15);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.bottom <= rectF3.top) {
                    float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                    rectF.bottom = fFloor;
                    rectF.top = Math.min(rectF.top, fFloor);
                }
                if (rectF2.top >= rectF3.bottom) {
                    float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                    rectF.top = fCeil;
                    rectF.bottom = Math.max(fCeil, rectF.bottom);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view2, Rect rect, float f14, float f15) {
                view2.offsetTopAndBottom((int) (f15 - (rect.top + f14)));
            }
        };
    }

    public abstract void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract int getDecoratedCrossAxisMeasurement(View view2);

    public abstract float getMaskMargins(RecyclerView.q qVar);

    public abstract RectF getMaskRect(float f14, float f15, float f16, float f17);

    public abstract int getParentBottom();

    public abstract int getParentEnd();

    public abstract int getParentLeft();

    public abstract int getParentRight();

    public abstract int getParentStart();

    public abstract int getParentTop();

    public abstract void layoutDecoratedWithMargins(View view2, int i14, int i15);

    public abstract void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void offsetChild(View view2, Rect rect, float f14, float f15);
}
