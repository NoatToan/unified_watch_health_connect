package com.huawei.health.suggestion.ui.plan.util;

import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.viewpager.pagetransformer.OverlayLayerPageTransformer;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class RecommendFoodTransformer extends OverlayLayerPageTransformer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9720c;

    public RecommendFoodTransformer(OverlayLayerPageTransformer.d dVar, int i) {
        super(dVar);
        this.f9720c = i;
    }

    @Override // com.huawei.ui.commonui.viewpager.pagetransformer.OverlayLayerPageTransformer, androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        super.transformPage(view, f);
        View viewB = null;
        for (int i = 0; i < this.f9720c; i++) {
            if (viewB == null) {
                viewB = b(view);
            } else {
                viewB = b(viewB);
            }
        }
        if (viewB == null) {
            LogUtil.e("RecommendFoodTransformer", "transformPage childView is null");
            return;
        }
        if (viewB.getVisibility() == 8) {
            viewB.setVisibility(0);
        }
        viewB.setAlpha(f);
    }

    private View b(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            return viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        }
        LogUtil.e("RecommendFoodTransformer", "getChildView view ", view);
        return view;
    }
}
