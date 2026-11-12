package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.hmchartui.ui.view.CommonCardView;
import com.huami.step.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes14.dex */
public final class StepInfoBinding implements ViewBinding {

    @NonNull
    private final CommonCardView a;

    @NonNull
    public final TypefaceTextView stepInfoTitle;

    private StepInfoBinding(@NonNull CommonCardView commonCardView, @NonNull TypefaceTextView typefaceTextView) {
        this.a = commonCardView;
        this.stepInfoTitle = typefaceTextView;
    }

    @NonNull
    public static StepInfoBinding bind(@NonNull View view) {
        int i = R.id.step_info_title;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            return new StepInfoBinding((CommonCardView) view, typefaceTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static StepInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static StepInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.step_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CommonCardView getRoot() {
        return this.a;
    }
}
