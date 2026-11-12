package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.huami.pai.lib.R;
import com.huami.pai.view.PAINumberRunningTextView;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentPaiHistoryBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final LottieAnimationView lvLottieBgAnimation;

    @NonNull
    public final LottieAnimationView lvLottieProgressAnimation;

    @NonNull
    public final AppCompatImageView paiDate;

    @NonNull
    public final PAINumberRunningTextView paiFrameValue;

    private FragmentPaiHistoryBinding(@NonNull RelativeLayout rootView, @NonNull LottieAnimationView lvLottieBgAnimation, @NonNull LottieAnimationView lvLottieProgressAnimation, @NonNull AppCompatImageView paiDate, @NonNull PAINumberRunningTextView paiFrameValue) {
        this.a = rootView;
        this.lvLottieBgAnimation = lvLottieBgAnimation;
        this.lvLottieProgressAnimation = lvLottieProgressAnimation;
        this.paiDate = paiDate;
        this.paiFrameValue = paiFrameValue;
    }

    @NonNull
    public static FragmentPaiHistoryBinding bind(@NonNull View rootView) {
        int i = R.id.lv_lottie_bg_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
        if (lottieAnimationView != null) {
            i = R.id.lv_lottie_progress_animation;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(rootView, i);
            if (lottieAnimationView2 != null) {
                i = R.id.pai_date;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatImageView != null) {
                    i = R.id.pai_frame_value;
                    PAINumberRunningTextView pAINumberRunningTextView = (PAINumberRunningTextView) ViewBindings.findChildViewById(rootView, i);
                    if (pAINumberRunningTextView != null) {
                        return new FragmentPaiHistoryBinding((RelativeLayout) rootView, lottieAnimationView, lottieAnimationView2, appCompatImageView, pAINumberRunningTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPaiHistoryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPaiHistoryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_pai_history, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
