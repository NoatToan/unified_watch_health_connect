package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class IncludeItemIncreateSleepBreathQualityBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TypefaceTextView desc;

    @NonNull
    public final TypefaceTextView title;

    private IncludeItemIncreateSleepBreathQualityBinding(@NonNull LinearLayout rootView, @NonNull TypefaceTextView desc, @NonNull TypefaceTextView title) {
        this.a = rootView;
        this.desc = desc;
        this.title = title;
    }

    @NonNull
    public static IncludeItemIncreateSleepBreathQualityBinding bind(@NonNull View rootView) {
        int i = R.id.desc;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
        if (typefaceTextView != null) {
            i = R.id.title;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
            if (typefaceTextView2 != null) {
                return new IncludeItemIncreateSleepBreathQualityBinding((LinearLayout) rootView, typefaceTextView, typefaceTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeItemIncreateSleepBreathQualityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static IncludeItemIncreateSleepBreathQualityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.include_item_increate_sleep_breath_quality, parent, false);
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
