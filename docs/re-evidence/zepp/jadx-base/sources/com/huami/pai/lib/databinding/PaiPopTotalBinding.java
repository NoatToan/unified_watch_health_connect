package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes12.dex */
public final class PaiPopTotalBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TypefaceTextView paiCircleMsg;

    @NonNull
    public final TypefaceTextView paiCircleText;

    @NonNull
    public final TypefaceTextView paiCircleTextSub;

    @NonNull
    public final TypefaceTextView paiHighText;

    @NonNull
    public final TypefaceTextView paiLowText;

    @NonNull
    public final TypefaceTextView paiMedText;

    @NonNull
    public final AppCompatCheckBox paiPopCheck;

    @NonNull
    public final ImageView paiPopCircleImg;

    @NonNull
    public final ImageView paiPopClose;

    @NonNull
    public final ImageView paiPopDiv;

    @NonNull
    public final ProgressBar paiPopProgress;

    @NonNull
    public final TypefaceTextView paiPopTitle;

    private PaiPopTotalBinding(@NonNull ConstraintLayout rootView, @NonNull TypefaceTextView paiCircleMsg, @NonNull TypefaceTextView paiCircleText, @NonNull TypefaceTextView paiCircleTextSub, @NonNull TypefaceTextView paiHighText, @NonNull TypefaceTextView paiLowText, @NonNull TypefaceTextView paiMedText, @NonNull AppCompatCheckBox paiPopCheck, @NonNull ImageView paiPopCircleImg, @NonNull ImageView paiPopClose, @NonNull ImageView paiPopDiv, @NonNull ProgressBar paiPopProgress, @NonNull TypefaceTextView paiPopTitle) {
        this.a = rootView;
        this.paiCircleMsg = paiCircleMsg;
        this.paiCircleText = paiCircleText;
        this.paiCircleTextSub = paiCircleTextSub;
        this.paiHighText = paiHighText;
        this.paiLowText = paiLowText;
        this.paiMedText = paiMedText;
        this.paiPopCheck = paiPopCheck;
        this.paiPopCircleImg = paiPopCircleImg;
        this.paiPopClose = paiPopClose;
        this.paiPopDiv = paiPopDiv;
        this.paiPopProgress = paiPopProgress;
        this.paiPopTitle = paiPopTitle;
    }

    @NonNull
    public static PaiPopTotalBinding bind(@NonNull View rootView) {
        int i = R.id.pai_circle_msg;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
        if (typefaceTextView != null) {
            i = R.id.pai_circle_text;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
            if (typefaceTextView2 != null) {
                i = R.id.pai_circle_text_sub;
                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                if (typefaceTextView3 != null) {
                    i = R.id.pai_high_text;
                    TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                    if (typefaceTextView4 != null) {
                        i = R.id.pai_low_text;
                        TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                        if (typefaceTextView5 != null) {
                            i = R.id.pai_med_text;
                            TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                            if (typefaceTextView6 != null) {
                                i = R.id.pai_pop_check;
                                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, i);
                                if (appCompatCheckBox != null) {
                                    i = R.id.pai_pop_circle_img;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (imageView != null) {
                                        i = R.id.pai_pop_close;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                        if (imageView2 != null) {
                                            i = R.id.pai_pop_div;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                            if (imageView3 != null) {
                                                i = R.id.pai_pop_progress;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
                                                if (progressBar != null) {
                                                    i = R.id.pai_pop_title;
                                                    TypefaceTextView typefaceTextView7 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (typefaceTextView7 != null) {
                                                        return new PaiPopTotalBinding((ConstraintLayout) rootView, typefaceTextView, typefaceTextView2, typefaceTextView3, typefaceTextView4, typefaceTextView5, typefaceTextView6, appCompatCheckBox, imageView, imageView2, imageView3, progressBar, typefaceTextView7);
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static PaiPopTotalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PaiPopTotalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pai_pop_total, parent, false);
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
