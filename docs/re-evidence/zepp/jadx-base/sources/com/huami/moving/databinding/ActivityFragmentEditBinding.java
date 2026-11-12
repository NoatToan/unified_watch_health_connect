package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivityFragmentEditBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RainbowTitleBar activityEditTitleBar;

    @NonNull
    public final RecyclerView rvStrengthTraining;

    @NonNull
    public final TextView tvEditAdd;

    private ActivityFragmentEditBinding(@NonNull LinearLayout linearLayout, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.a = linearLayout;
        this.activityEditTitleBar = rainbowTitleBar;
        this.rvStrengthTraining = recyclerView;
        this.tvEditAdd = textView;
    }

    @NonNull
    public static ActivityFragmentEditBinding bind(@NonNull View view) {
        int i = R.id.activity_edit_title_bar;
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
        if (rainbowTitleBar != null) {
            i = R.id.rv_strength_training;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.tv_edit_add;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new ActivityFragmentEditBinding((LinearLayout) view, rainbowTitleBar, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityFragmentEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityFragmentEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_fragment_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
