package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBar;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutHealthDataIntroWithPicBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ColoredProgressBar coloredProgressBar;

    @NonNull
    public final TypefaceTextView dataLevel;

    @NonNull
    public final TypefaceTextView dataName;

    @NonNull
    public final TypefaceTextView errorTips;

    @NonNull
    public final ImageView introImage;

    @NonNull
    public final TypefaceTextView introText;

    private LayoutHealthDataIntroWithPicBinding(@NonNull ConstraintLayout rootView, @NonNull ColoredProgressBar coloredProgressBar, @NonNull TypefaceTextView dataLevel, @NonNull TypefaceTextView dataName, @NonNull TypefaceTextView errorTips, @NonNull ImageView introImage, @NonNull TypefaceTextView introText) {
        this.a = rootView;
        this.coloredProgressBar = coloredProgressBar;
        this.dataLevel = dataLevel;
        this.dataName = dataName;
        this.errorTips = errorTips;
        this.introImage = introImage;
        this.introText = introText;
    }

    @NonNull
    public static LayoutHealthDataIntroWithPicBinding bind(@NonNull View rootView) {
        int i = R.id.coloredProgressBar;
        ColoredProgressBar coloredProgressBar = (ColoredProgressBar) ViewBindings.findChildViewById(rootView, R.id.coloredProgressBar);
        if (coloredProgressBar != null) {
            i = R.id.data_level;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.data_level);
            if (typefaceTextView != null) {
                i = R.id.data_name;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.data_name);
                if (typefaceTextView2 != null) {
                    i = R.id.error_tips;
                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.error_tips);
                    if (typefaceTextView3 != null) {
                        i = R.id.intro_image;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.intro_image);
                        if (imageView != null) {
                            i = R.id.intro_text;
                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.intro_text);
                            if (typefaceTextView4 != null) {
                                return new LayoutHealthDataIntroWithPicBinding((ConstraintLayout) rootView, coloredProgressBar, typefaceTextView, typefaceTextView2, typefaceTextView3, imageView, typefaceTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutHealthDataIntroWithPicBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutHealthDataIntroWithPicBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_health_data_intro_with_pic, parent, false);
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
