package com.huami.bloodoxygen.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.view.BloodOxygenTitleBar;

/* JADX INFO: loaded from: classes5.dex */
public final class BoUiActivitySpo2IntroDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView stepOne;

    @NonNull
    public final ImageView stepThree;

    @NonNull
    public final ImageView stepTwo;

    @NonNull
    public final BloodOxygenTitleBar titleBar;

    private BoUiActivitySpo2IntroDetailBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull BloodOxygenTitleBar bloodOxygenTitleBar) {
        this.a = linearLayout;
        this.stepOne = imageView;
        this.stepThree = imageView2;
        this.stepTwo = imageView3;
        this.titleBar = bloodOxygenTitleBar;
    }

    @NonNull
    public static BoUiActivitySpo2IntroDetailBinding bind(@NonNull View view) {
        int i = R.id.step_one;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.step_three;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.step_two;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.title_bar;
                    BloodOxygenTitleBar bloodOxygenTitleBar = (BloodOxygenTitleBar) ViewBindings.findChildViewById(view, i);
                    if (bloodOxygenTitleBar != null) {
                        return new BoUiActivitySpo2IntroDetailBinding((LinearLayout) view, imageView, imageView2, imageView3, bloodOxygenTitleBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BoUiActivitySpo2IntroDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiActivitySpo2IntroDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_activity_spo2_intro_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
