package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class HealthLabelLoadMoreBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout loadMoreLoadEndView;

    @NonNull
    public final FrameLayout loadMoreLoadFailView;

    @NonNull
    public final LinearLayout loadMoreLoadingView;

    @NonNull
    public final ProgressBar loadingProgress;

    @NonNull
    public final TextView loadingText;

    @NonNull
    public final TextView tvPrompt;

    private HealthLabelLoadMoreBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout loadMoreLoadEndView, @NonNull FrameLayout loadMoreLoadFailView, @NonNull LinearLayout loadMoreLoadingView, @NonNull ProgressBar loadingProgress, @NonNull TextView loadingText, @NonNull TextView tvPrompt) {
        this.a = rootView;
        this.loadMoreLoadEndView = loadMoreLoadEndView;
        this.loadMoreLoadFailView = loadMoreLoadFailView;
        this.loadMoreLoadingView = loadMoreLoadingView;
        this.loadingProgress = loadingProgress;
        this.loadingText = loadingText;
        this.tvPrompt = tvPrompt;
    }

    @NonNull
    public static HealthLabelLoadMoreBinding bind(@NonNull View rootView) {
        int i = R.id.load_more_load_end_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
        if (frameLayout != null) {
            i = R.id.load_more_load_fail_view;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
            if (frameLayout2 != null) {
                i = R.id.load_more_loading_view;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = R.id.loading_progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
                    if (progressBar != null) {
                        i = R.id.loading_text;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = R.id.tv_prompt;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                return new HealthLabelLoadMoreBinding((FrameLayout) rootView, frameLayout, frameLayout2, linearLayout, progressBar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthLabelLoadMoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HealthLabelLoadMoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.health_label_load_more, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
