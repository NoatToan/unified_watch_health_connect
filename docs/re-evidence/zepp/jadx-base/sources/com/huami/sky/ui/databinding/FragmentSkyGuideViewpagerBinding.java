package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.huami.sky.ui.R;
import com.huami.sky.ui.view.SkyCirclePageIndicator;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSkyGuideViewpagerBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageButton btnClose;

    @NonNull
    public final SkyCirclePageIndicator pageIndicator;

    @NonNull
    public final ViewPager2 skyGuideViewpager;

    private FragmentSkyGuideViewpagerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageButton imageButton, @NonNull SkyCirclePageIndicator skyCirclePageIndicator, @NonNull ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.btnClose = imageButton;
        this.pageIndicator = skyCirclePageIndicator;
        this.skyGuideViewpager = viewPager2;
    }

    @NonNull
    public static FragmentSkyGuideViewpagerBinding bind(@NonNull View view) {
        int i = R.id.btn_close;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.page_indicator;
            SkyCirclePageIndicator skyCirclePageIndicator = (SkyCirclePageIndicator) ViewBindings.findChildViewById(view, i);
            if (skyCirclePageIndicator != null) {
                i = R.id.sky_guide_viewpager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    return new FragmentSkyGuideViewpagerBinding((ConstraintLayout) view, imageButton, skyCirclePageIndicator, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSkyGuideViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSkyGuideViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sky_guide_viewpager, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
