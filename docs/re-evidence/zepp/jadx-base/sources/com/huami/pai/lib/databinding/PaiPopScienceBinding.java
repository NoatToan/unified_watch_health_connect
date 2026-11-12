package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes12.dex */
public final class PaiPopScienceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView paiPopCircleImg;

    @NonNull
    public final ImageView paiPopClose;

    @NonNull
    public final TypefaceTextView paiPopTitle;

    @NonNull
    public final TypefaceTextView paiPopTitleSub;

    private PaiPopScienceBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView paiPopCircleImg, @NonNull ImageView paiPopClose, @NonNull TypefaceTextView paiPopTitle, @NonNull TypefaceTextView paiPopTitleSub) {
        this.a = rootView;
        this.paiPopCircleImg = paiPopCircleImg;
        this.paiPopClose = paiPopClose;
        this.paiPopTitle = paiPopTitle;
        this.paiPopTitleSub = paiPopTitleSub;
    }

    @NonNull
    public static PaiPopScienceBinding bind(@NonNull View rootView) {
        int i = R.id.pai_pop_circle_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.pai_pop_close;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = R.id.pai_pop_title;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                if (typefaceTextView != null) {
                    i = R.id.pai_pop_title_sub;
                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                    if (typefaceTextView2 != null) {
                        return new PaiPopScienceBinding((ConstraintLayout) rootView, imageView, imageView2, typefaceTextView, typefaceTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PaiPopScienceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PaiPopScienceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pai_pop_science, parent, false);
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
