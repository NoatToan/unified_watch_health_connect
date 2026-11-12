package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ItemBreathQualityYmwBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView arrowRight;

    @NonNull
    public final TextView breathYMWName;

    @NonNull
    public final ImageView imgBetaSign;

    private ItemBreathQualityYmwBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView arrowRight, @NonNull TextView breathYMWName, @NonNull ImageView imgBetaSign) {
        this.a = rootView;
        this.arrowRight = arrowRight;
        this.breathYMWName = breathYMWName;
        this.imgBetaSign = imgBetaSign;
    }

    @NonNull
    public static ItemBreathQualityYmwBinding bind(@NonNull View rootView) {
        int i = R.id.arrowRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.breathYMWName;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.imgBetaSign;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    return new ItemBreathQualityYmwBinding((ConstraintLayout) rootView, imageView, textView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBreathQualityYmwBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemBreathQualityYmwBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_breath_quality_ymw, parent, false);
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
