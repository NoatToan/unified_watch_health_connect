package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.pai.view.PaiWrapContentHeightViewPager;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentPaiGuidePopupBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final AppCompatImageButton guideCloseButton;

    @NonNull
    public final ImageView guideCurrentIndicator;

    @NonNull
    public final LinearLayout guideIndicatorContainer;

    @NonNull
    public final PaiWrapContentHeightViewPager guideVp;

    @NonNull
    public final RelativeLayout indicatorContainer;

    @NonNull
    public final Button lastPageButton;

    private FragmentPaiGuidePopupBinding(@NonNull FrameLayout rootView, @NonNull AppCompatImageButton guideCloseButton, @NonNull ImageView guideCurrentIndicator, @NonNull LinearLayout guideIndicatorContainer, @NonNull PaiWrapContentHeightViewPager guideVp, @NonNull RelativeLayout indicatorContainer, @NonNull Button lastPageButton) {
        this.a = rootView;
        this.guideCloseButton = guideCloseButton;
        this.guideCurrentIndicator = guideCurrentIndicator;
        this.guideIndicatorContainer = guideIndicatorContainer;
        this.guideVp = guideVp;
        this.indicatorContainer = indicatorContainer;
        this.lastPageButton = lastPageButton;
    }

    @NonNull
    public static FragmentPaiGuidePopupBinding bind(@NonNull View rootView) {
        int i = R.id.guide_close_button;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(rootView, i);
        if (appCompatImageButton != null) {
            i = R.id.guide_current_indicator;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.guide_indicator_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = R.id.guide_vp;
                    PaiWrapContentHeightViewPager paiWrapContentHeightViewPager = (PaiWrapContentHeightViewPager) ViewBindings.findChildViewById(rootView, i);
                    if (paiWrapContentHeightViewPager != null) {
                        i = R.id.indicator_container;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                        if (relativeLayout != null) {
                            i = R.id.last_page_button;
                            Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                            if (button != null) {
                                return new FragmentPaiGuidePopupBinding((FrameLayout) rootView, appCompatImageButton, imageView, linearLayout, paiWrapContentHeightViewPager, relativeLayout, button);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPaiGuidePopupBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPaiGuidePopupBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_pai_guide_popup, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
