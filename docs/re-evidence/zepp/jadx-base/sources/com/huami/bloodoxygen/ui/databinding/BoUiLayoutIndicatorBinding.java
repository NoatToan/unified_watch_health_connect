package com.huami.bloodoxygen.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.view.BloodOxygenCardView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class BoUiLayoutIndicatorBinding implements ViewBinding {

    @NonNull
    private final BloodOxygenCardView a;

    @NonNull
    public final TypefaceTextView abnormalEnd;

    @NonNull
    public final TypefaceTextView abnormalStart;

    @NonNull
    public final TypefaceTextView normalEnd;

    @NonNull
    public final TypefaceTextView normalStart;

    private BoUiLayoutIndicatorBinding(@NonNull BloodOxygenCardView bloodOxygenCardView, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3, @NonNull TypefaceTextView typefaceTextView4) {
        this.a = bloodOxygenCardView;
        this.abnormalEnd = typefaceTextView;
        this.abnormalStart = typefaceTextView2;
        this.normalEnd = typefaceTextView3;
        this.normalStart = typefaceTextView4;
    }

    @NonNull
    public static BoUiLayoutIndicatorBinding bind(@NonNull View view) {
        int i = R.id.abnormal_end;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            i = R.id.abnormal_start;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView2 != null) {
                i = R.id.normal_end;
                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView3 != null) {
                    i = R.id.normal_start;
                    TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                    if (typefaceTextView4 != null) {
                        return new BoUiLayoutIndicatorBinding((BloodOxygenCardView) view, typefaceTextView, typefaceTextView2, typefaceTextView3, typefaceTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BoUiLayoutIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiLayoutIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_layout_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public BloodOxygenCardView getRoot() {
        return this.a;
    }
}
