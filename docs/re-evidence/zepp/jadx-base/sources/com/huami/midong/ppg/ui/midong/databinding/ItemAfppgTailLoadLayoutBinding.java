package com.huami.midong.ppg.ui.midong.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huami.midong.ppg.ui.midong.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemAfppgTailLoadLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ProgressBar afppgLoadingImg;

    @NonNull
    public final LinearLayout afppgLoadingLinear;

    @NonNull
    public final TextView afppgTextDesc;

    private ItemAfppgTailLoadLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ProgressBar progressBar, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.a = constraintLayout;
        this.afppgLoadingImg = progressBar;
        this.afppgLoadingLinear = linearLayout;
        this.afppgTextDesc = textView;
    }

    @NonNull
    public static ItemAfppgTailLoadLayoutBinding bind(@NonNull View view) {
        int i = R.id.afppgLoadingImg;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            i = R.id.afppgLoadingLinear;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
            if (linearLayout != null) {
                i = R.id.afppgTextDesc;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    return new ItemAfppgTailLoadLayoutBinding((ConstraintLayout) view, progressBar, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAfppgTailLoadLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemAfppgTailLoadLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_afppg_tail_load_layout, viewGroup, false);
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
