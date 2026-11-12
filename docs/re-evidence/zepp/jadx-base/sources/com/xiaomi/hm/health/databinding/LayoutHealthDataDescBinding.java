package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutHealthDataDescBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TypefaceTextView descName;

    @NonNull
    public final TypefaceTextView descText;

    private LayoutHealthDataDescBinding(@NonNull ConstraintLayout rootView, @NonNull TypefaceTextView descName, @NonNull TypefaceTextView descText) {
        this.a = rootView;
        this.descName = descName;
        this.descText = descText;
    }

    @NonNull
    public static LayoutHealthDataDescBinding bind(@NonNull View rootView) {
        int i = R.id.desc_name;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.desc_name);
        if (typefaceTextView != null) {
            i = R.id.desc_text;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.desc_text);
            if (typefaceTextView2 != null) {
                return new LayoutHealthDataDescBinding((ConstraintLayout) rootView, typefaceTextView, typefaceTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutHealthDataDescBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutHealthDataDescBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_health_data_desc, parent, false);
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
