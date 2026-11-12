package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateFragmentDetailFooterItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView heartRateLabel;

    @NonNull
    public final AppCompatTextView heartRateUnit;

    @NonNull
    public final AppCompatTextView heartRateValue;

    private HeartRateFragmentDetailFooterItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView heartRateLabel, @NonNull AppCompatTextView heartRateUnit, @NonNull AppCompatTextView heartRateValue) {
        this.a = rootView;
        this.heartRateLabel = heartRateLabel;
        this.heartRateUnit = heartRateUnit;
        this.heartRateValue = heartRateValue;
    }

    @NonNull
    public static HeartRateFragmentDetailFooterItemBinding bind(@NonNull View rootView) {
        int i = R.id.heart_rate_label;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatTextView != null) {
            i = R.id.heart_rate_unit;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
            if (appCompatTextView2 != null) {
                i = R.id.heart_rate_value;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatTextView3 != null) {
                    return new HeartRateFragmentDetailFooterItemBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2, appCompatTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateFragmentDetailFooterItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateFragmentDetailFooterItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_fragment_detail_footer_item, parent, false);
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
