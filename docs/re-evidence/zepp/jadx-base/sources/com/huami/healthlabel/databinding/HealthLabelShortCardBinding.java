package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthLabelShortCardBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImageView healthLabelLogo;

    @NonNull
    public final RecyclerView healthLabelRv;

    private HealthLabelShortCardBinding(@NonNull LinearLayout rootView, @NonNull ImageView healthLabelLogo, @NonNull RecyclerView healthLabelRv) {
        this.a = rootView;
        this.healthLabelLogo = healthLabelLogo;
        this.healthLabelRv = healthLabelRv;
    }

    @NonNull
    public static HealthLabelShortCardBinding bind(@NonNull View rootView) {
        int i = R.id.health_label_logo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.health_label_rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
            if (recyclerView != null) {
                return new HealthLabelShortCardBinding((LinearLayout) rootView, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthLabelShortCardBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HealthLabelShortCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.health_label_short_card, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
