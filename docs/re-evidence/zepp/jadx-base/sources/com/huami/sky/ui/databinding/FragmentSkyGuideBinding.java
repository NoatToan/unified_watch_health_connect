package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.sky.ui.R;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSkyGuideBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView skyBtnWelcome;

    @NonNull
    public final LottieAnimationView skyGuideAnim;

    @NonNull
    public final TextView skyGuideDesc;

    @NonNull
    public final TextView skyGuideTitle;

    private FragmentSkyGuideBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull LottieAnimationView lottieAnimationView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.skyBtnWelcome = textView;
        this.skyGuideAnim = lottieAnimationView;
        this.skyGuideDesc = textView2;
        this.skyGuideTitle = textView3;
    }

    @NonNull
    public static FragmentSkyGuideBinding bind(@NonNull View view) {
        int i = R.id.sky_btn_welcome;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.sky_guide_anim;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = R.id.sky_guide_desc;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.sky_guide_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new FragmentSkyGuideBinding((ConstraintLayout) view, textView, lottieAnimationView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSkyGuideBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSkyGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sky_guide, viewGroup, false);
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
