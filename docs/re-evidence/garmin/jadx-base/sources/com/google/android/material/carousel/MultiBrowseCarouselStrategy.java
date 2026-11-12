package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes14.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i14) {
        int itemCount = arrangement.getItemCount() - i14;
        boolean z14 = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            int i15 = arrangement.smallCount;
            if (i15 > 0) {
                arrangement.smallCount = i15 - 1;
            } else {
                int i16 = arrangement.mediumCount;
                if (i16 > 1) {
                    arrangement.mediumCount = i16 - 1;
                }
            }
            itemCount--;
        }
        return z14;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view2) {
        float containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        float f14 = containerHeight;
        RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
        float f15 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view2.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f15 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view2.getMeasuredWidth();
        }
        float f16 = f15;
        float smallItemSizeMin = getSmallItemSizeMin() + f16;
        float fMax = Math.max(getSmallItemSizeMax() + f16, smallItemSizeMin);
        float fMin = Math.min(measuredHeight + f16, f14);
        float fA = g7.a.a((measuredHeight / 3.0f) + f16, smallItemSizeMin + f16, fMax + f16);
        float f17 = (fMin + fA) / 2.0f;
        int[] iArrDoubleCounts = SMALL_COUNTS;
        if (f14 < 2.0f * smallItemSizeMin) {
            iArrDoubleCounts = new int[]{0};
        }
        int[] iArrDoubleCounts2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArrDoubleCounts = CarouselStrategy.doubleCounts(iArrDoubleCounts);
            iArrDoubleCounts2 = CarouselStrategy.doubleCounts(iArrDoubleCounts2);
        }
        int[] iArr = iArrDoubleCounts2;
        int[] iArr2 = iArrDoubleCounts;
        int iMax = (int) Math.max(1.0d, Math.floor(hb.a.c(fMax, CarouselStrategyHelper.maxValue(iArr2), f14 - (CarouselStrategyHelper.maxValue(iArr) * f17), fMin)));
        int iCeil = (int) Math.ceil(f14 / fMin);
        int i14 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            iArr3[i15] = iCeil - i15;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f14, fA, smallItemSizeMin, fMax, iArr2, f17, iArr, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (ensureArrangementFitsItemCount(arrangementFindLowestCostArrangement, carousel.getItemCount())) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f14, fA, smallItemSizeMin, fMax, new int[]{arrangementFindLowestCostArrangement.smallCount}, f17, new int[]{arrangementFindLowestCostArrangement.mediumCount}, fMin, new int[]{arrangementFindLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view2.getContext(), f16, f14, arrangementFindLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i14) {
        if (i14 >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            return i14 >= this.keylineCount && carousel.getItemCount() < this.keylineCount;
        }
        return true;
    }
}
