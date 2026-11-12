package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.BodyFatCircleProgressView;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentMeasureBalanceScoreBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final BodyFatCircleProgressView progressView;

    @NonNull
    public final TextView textCount;

    @NonNull
    public final TextView tipsText;

    @NonNull
    public final TextView titleText;

    private FragmentMeasureBalanceScoreBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BodyFatCircleProgressView bodyFatCircleProgressView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.progressView = bodyFatCircleProgressView;
        this.textCount = textView;
        this.tipsText = textView2;
        this.titleText = textView3;
    }

    @NonNull
    public static FragmentMeasureBalanceScoreBinding bind(@NonNull View view) {
        int i = R.id.progress_view;
        BodyFatCircleProgressView bodyFatCircleProgressView = (BodyFatCircleProgressView) ViewBindings.findChildViewById(view, i);
        if (bodyFatCircleProgressView != null) {
            i = R.id.text_count;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tips_text;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.title_text;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new FragmentMeasureBalanceScoreBinding((ConstraintLayout) view, bodyFatCircleProgressView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMeasureBalanceScoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMeasureBalanceScoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_measure_balance_score, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
