package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes14.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view2) {
        float containerHeight;
        int i14;
        int i15;
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i14 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i15 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i14 = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i15 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        float f14 = i14 + i15;
        float f15 = containerHeight;
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view2.getContext(), f14, f15, new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f15 + f14, f15), 1, f15));
    }
}
