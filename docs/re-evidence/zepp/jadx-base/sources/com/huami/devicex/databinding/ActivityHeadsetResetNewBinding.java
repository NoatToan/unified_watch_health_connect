package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHeadsetResetNewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView titleTakeOutHeadset;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private ActivityHeadsetResetNewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.titleTakeOutHeadset = textView;
        this.tvTitleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityHeadsetResetNewBinding bind(@NonNull View view) {
        int i = R.id.title_take_out_headset;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv_title_bar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
            if (rainbowTitleBar != null) {
                return new ActivityHeadsetResetNewBinding((ConstraintLayout) view, textView, rainbowTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityHeadsetResetNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHeadsetResetNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_headset_reset_new, viewGroup, false);
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
