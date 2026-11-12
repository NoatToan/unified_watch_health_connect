package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes14.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    private float calculateMediumChildSize(float f14, float f15, float f16) {
        float fMax = Math.max(1.5f * f16, f14);
        float f17 = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * f15;
        if (fMax > f17) {
            fMax = Math.max(f17, f16 * 1.2f);
        }
        return Math.min(f15, fMax);
    }

    private KeylineState createCenterAlignedKeylineState(float f14, float f15, float f16, int i14, float f17, float f18, float f19) {
        float fMin = Math.min(f18, f16);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, f16, f15);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f17, f16, f15);
        float f22 = f17 / 2.0f;
        float f24 = (f19 + 0.0f) - f22;
        float f25 = f24 + f22;
        float f26 = fMin / 2.0f;
        float f27 = (i14 * f16) + f25;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f16, f14).addAnchorKeyline((f24 - f22) - f26, childMaskPercentage, fMin).addKeyline(f24, childMaskPercentage2, f17, false).addKeylineRange((f16 / 2.0f) + f25, 0.0f, f16, i14, true);
        builderAddKeylineRange.addKeyline(f22 + f27, childMaskPercentage2, f17, false);
        builderAddKeylineRange.addAnchorKeyline(f27 + f17 + f26, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f14, float f15, float f16, int i14, float f17, int i15, float f18) {
        float fMin = Math.min(f18, f16);
        float fMax = Math.max(fMin, 0.5f * f17);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMax, f16, f14);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(fMin, f16, f14);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f17, f16, f14);
        float f19 = (i14 * f16) + 0.0f;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f16, f15).addAnchorKeyline(0.0f - (fMax / 2.0f), childMaskPercentage, fMax).addKeylineRange(f16 / 2.0f, 0.0f, f16, i14, true);
        if (i15 > 0) {
            float f22 = (f17 / 2.0f) + f19;
            f19 += f17;
            builderAddKeylineRange.addKeyline(f22, childMaskPercentage3, f17, false);
        }
        builderAddKeylineRange.addAnchorKeyline((CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f) + f19, childMaskPercentage2, fMin);
        return builderAddKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean isContained() {
        return false;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view2) {
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        float f14 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view2.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f14 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view2.getMeasuredWidth();
        }
        float f15 = measuredHeight;
        float f16 = f14;
        float f17 = f15 + f16;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view2.getContext()) + f16;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view2.getContext()) + f16;
        int iMax = Math.max(1, (int) Math.floor(containerWidth / f17));
        float f18 = containerWidth - (iMax * f17);
        if (carousel.getCarouselAlignment() == 1) {
            float f19 = f18 / 2.0f;
            return createCenterAlignedKeylineState(containerWidth, f16, f17, iMax, Math.max(Math.min(3.0f * f19, f17), getSmallItemSizeMin() + f16), extraSmallSize2, f19);
        }
        int i14 = 1;
        if (f18 <= 0.0f) {
            i14 = 0;
        }
        return createLeftAlignedKeylineState(view2.getContext(), f16, containerWidth, f17, iMax, calculateMediumChildSize(extraSmallSize, f17, f18), i14, extraSmallSize2);
    }
}
