package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes14.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view2) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        float f14 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredWidth = view2.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f14 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredWidth = view2.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f14;
        float fMax = Math.max(getSmallItemSizeMax() + f14, smallItemSizeMin);
        float f15 = containerHeight;
        float fMin = Math.min(measuredWidth + f14, f15);
        float fA = g7.a.a((measuredWidth / 3.0f) + f14, smallItemSizeMin + f14, fMax + f14);
        float f16 = (fMin + fA) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        int i14 = 0;
        int[] iArr2 = f15 < 2.0f * smallItemSizeMin ? new int[]{0} : iArr;
        int iMax = (int) Math.max(1.0d, Math.floor(hb.a.c(fMax, CarouselStrategyHelper.maxValue(iArr), f15, fMin)));
        int iCeil = (((int) Math.ceil(f15 / fMin)) - iMax) + 1;
        int[] iArr3 = new int[iCeil];
        for (int i15 = 0; i15 < iCeil; i15++) {
            iArr3[i15] = iMax + i15;
        }
        int i16 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f15, fA, smallItemSizeMin, fMax, i16 != 0 ? CarouselStrategy.doubleCounts(iArr2) : iArr2, f16, i16 != 0 ? CarouselStrategy.doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (arrangementFindLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f15, fA, smallItemSizeMin, fMax, iArr2, f16, MEDIUM_COUNTS, fMin, iArr3);
        } else {
            i14 = i16;
        }
        return CarouselStrategyHelper.createKeylineState(view2.getContext(), f14, f15, arrangementFindLowestCostArrangement, i14);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i14) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i14 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i14 >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
        }
        return false;
    }
}
