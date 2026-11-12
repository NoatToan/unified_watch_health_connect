package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.pai.view.PaiSectionPartView;
import com.huami.pai.view.PaiViewPagerIndicator;
import com.huami.pai.view.PaiWrapContentHeightViewPager;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentPaiSporthintBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout paiHintGetContain;

    @NonNull
    public final TextView paiHintGetTitle;

    @NonNull
    public final TextView paiHintHint;

    @NonNull
    public final PaiSectionPartView paiHintProgress;

    @NonNull
    public final TypefaceTextView paiHintTitle;

    @NonNull
    public final PaiWrapContentHeightViewPager paiHintViewpager;

    @NonNull
    public final PaiViewPagerIndicator paiHintVpIndicator;

    @NonNull
    public final ConstraintLayout rlPaisport;

    private FragmentPaiSporthintBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout paiHintGetContain, @NonNull TextView paiHintGetTitle, @NonNull TextView paiHintHint, @NonNull PaiSectionPartView paiHintProgress, @NonNull TypefaceTextView paiHintTitle, @NonNull PaiWrapContentHeightViewPager paiHintViewpager, @NonNull PaiViewPagerIndicator paiHintVpIndicator, @NonNull ConstraintLayout rlPaisport) {
        this.a = rootView;
        this.paiHintGetContain = paiHintGetContain;
        this.paiHintGetTitle = paiHintGetTitle;
        this.paiHintHint = paiHintHint;
        this.paiHintProgress = paiHintProgress;
        this.paiHintTitle = paiHintTitle;
        this.paiHintViewpager = paiHintViewpager;
        this.paiHintVpIndicator = paiHintVpIndicator;
        this.rlPaisport = rlPaisport;
    }

    @NonNull
    public static FragmentPaiSporthintBinding bind(@NonNull View rootView) {
        int i = R.id.pai_hint_get_contain;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
        if (constraintLayout != null) {
            i = R.id.pai_hint_get_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.pai_hint_hint;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.pai_hint_progress;
                    PaiSectionPartView paiSectionPartView = (PaiSectionPartView) ViewBindings.findChildViewById(rootView, i);
                    if (paiSectionPartView != null) {
                        i = R.id.pai_hint_title;
                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                        if (typefaceTextView != null) {
                            i = R.id.pai_hint_viewpager;
                            PaiWrapContentHeightViewPager paiWrapContentHeightViewPager = (PaiWrapContentHeightViewPager) ViewBindings.findChildViewById(rootView, i);
                            if (paiWrapContentHeightViewPager != null) {
                                i = R.id.pai_hint_vp_indicator;
                                PaiViewPagerIndicator paiViewPagerIndicator = (PaiViewPagerIndicator) ViewBindings.findChildViewById(rootView, i);
                                if (paiViewPagerIndicator != null) {
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) rootView;
                                    return new FragmentPaiSporthintBinding(constraintLayout2, constraintLayout, textView, textView2, paiSectionPartView, typefaceTextView, paiWrapContentHeightViewPager, paiViewPagerIndicator, constraintLayout2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPaiSporthintBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPaiSporthintBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_pai_sporthint, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
