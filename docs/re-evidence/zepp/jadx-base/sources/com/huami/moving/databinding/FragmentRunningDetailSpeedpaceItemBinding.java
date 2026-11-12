package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentRunningDetailSpeedpaceItemBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TypefaceTextView heartRateText;

    @NonNull
    public final ImageView ivRightTriangle;

    @NonNull
    public final TypefaceTextView kmText;

    @NonNull
    public final LinearLayout llKm;

    @NonNull
    public final RelativeLayout rlKmSegment;

    @NonNull
    public final TypefaceTextView speedMinText;

    @NonNull
    public final ProgressBar speedProgress;

    @NonNull
    public final TypefaceTextView spendtimeText;

    private FragmentRunningDetailSpeedpaceItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull ImageView imageView, @NonNull TypefaceTextView typefaceTextView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TypefaceTextView typefaceTextView3, @NonNull ProgressBar progressBar, @NonNull TypefaceTextView typefaceTextView4) {
        this.a = relativeLayout;
        this.heartRateText = typefaceTextView;
        this.ivRightTriangle = imageView;
        this.kmText = typefaceTextView2;
        this.llKm = linearLayout;
        this.rlKmSegment = relativeLayout2;
        this.speedMinText = typefaceTextView3;
        this.speedProgress = progressBar;
        this.spendtimeText = typefaceTextView4;
    }

    @NonNull
    public static FragmentRunningDetailSpeedpaceItemBinding bind(@NonNull View view) {
        int i = R.id.heart_rate_text;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            i = R.id.iv_right_triangle;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.km_text;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView2 != null) {
                    i = R.id.ll_km;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = R.id.speed_min_text;
                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView3 != null) {
                            i = R.id.speed_progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                            if (progressBar != null) {
                                i = R.id.spendtime_text;
                                TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                if (typefaceTextView4 != null) {
                                    return new FragmentRunningDetailSpeedpaceItemBinding(relativeLayout, typefaceTextView, imageView, typefaceTextView2, linearLayout, relativeLayout, typefaceTextView3, progressBar, typefaceTextView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRunningDetailSpeedpaceItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRunningDetailSpeedpaceItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_running_detail_speedpace_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
