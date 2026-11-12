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
public final class BoUiStatisticsViewBinding implements ViewBinding {

    @NonNull
    private final BloodOxygenCardView a;

    @NonNull
    public final TypefaceTextView avgTitle;

    @NonNull
    public final TypefaceTextView avgValue;

    @NonNull
    public final View divider;

    @NonNull
    public final TypefaceTextView maxTitle;

    @NonNull
    public final TypefaceTextView maxValue;

    @NonNull
    public final TypefaceTextView minTitle;

    @NonNull
    public final TypefaceTextView minValue;

    @NonNull
    public final TypefaceTextView statisticsTitle;

    private BoUiStatisticsViewBinding(@NonNull BloodOxygenCardView bloodOxygenCardView, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull View view, @NonNull TypefaceTextView typefaceTextView3, @NonNull TypefaceTextView typefaceTextView4, @NonNull TypefaceTextView typefaceTextView5, @NonNull TypefaceTextView typefaceTextView6, @NonNull TypefaceTextView typefaceTextView7) {
        this.a = bloodOxygenCardView;
        this.avgTitle = typefaceTextView;
        this.avgValue = typefaceTextView2;
        this.divider = view;
        this.maxTitle = typefaceTextView3;
        this.maxValue = typefaceTextView4;
        this.minTitle = typefaceTextView5;
        this.minValue = typefaceTextView6;
        this.statisticsTitle = typefaceTextView7;
    }

    @NonNull
    public static BoUiStatisticsViewBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.avg_title;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            i = R.id.avg_value;
            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
                i = R.id.max_title;
                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView3 != null) {
                    i = R.id.max_value;
                    TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                    if (typefaceTextView4 != null) {
                        i = R.id.min_title;
                        TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView5 != null) {
                            i = R.id.min_value;
                            TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView6 != null) {
                                i = R.id.statistics_title;
                                TypefaceTextView typefaceTextView7 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                if (typefaceTextView7 != null) {
                                    return new BoUiStatisticsViewBinding((BloodOxygenCardView) view, typefaceTextView, typefaceTextView2, viewFindChildViewById, typefaceTextView3, typefaceTextView4, typefaceTextView5, typefaceTextView6, typefaceTextView7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BoUiStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_statistics_view, viewGroup, false);
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
