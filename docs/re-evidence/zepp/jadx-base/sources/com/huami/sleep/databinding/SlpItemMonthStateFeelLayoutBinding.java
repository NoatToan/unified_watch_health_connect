package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.UnitTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class SlpItemMonthStateFeelLayoutBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final UnitTextView dayTv;

    @NonNull
    public final ProgressBar progress;

    @NonNull
    public final TextView ratioTv;

    private SlpItemMonthStateFeelLayoutBinding(@NonNull RelativeLayout rootView, @NonNull UnitTextView dayTv, @NonNull ProgressBar progress, @NonNull TextView ratioTv) {
        this.a = rootView;
        this.dayTv = dayTv;
        this.progress = progress;
        this.ratioTv = ratioTv;
    }

    @NonNull
    public static SlpItemMonthStateFeelLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.dayTv;
        UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
        if (unitTextView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
            if (progressBar != null) {
                i = R.id.ratioTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    return new SlpItemMonthStateFeelLayoutBinding((RelativeLayout) rootView, unitTextView, progressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static SlpItemMonthStateFeelLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SlpItemMonthStateFeelLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.slp_item_month_state_feel_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
