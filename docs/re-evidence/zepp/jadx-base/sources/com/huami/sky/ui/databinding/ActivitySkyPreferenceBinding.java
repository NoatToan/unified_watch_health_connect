package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.ui.R;
import com.huami.sky.ui.intro.preference.ListSelectedView;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivitySkyPreferenceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Group groupNetwork;

    @NonNull
    public final ListSelectedView listSelectView;

    @NonNull
    public final LottieAnimationView loading;

    @NonNull
    public final MaterialButton save;

    @NonNull
    public final TextView skip;

    @NonNull
    public final TextView skyNetworkTip;

    @NonNull
    public final TextView skyPlayRetry;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivitySkyPreferenceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull ListSelectedView listSelectedView, @NonNull LottieAnimationView lottieAnimationView, @NonNull MaterialButton materialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.groupNetwork = group;
        this.listSelectView = listSelectedView;
        this.loading = lottieAnimationView;
        this.save = materialButton;
        this.skip = textView;
        this.skyNetworkTip = textView2;
        this.skyPlayRetry = textView3;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivitySkyPreferenceBinding bind(@NonNull View view) {
        int i = R.id.group_network;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = R.id.list_select_view;
            ListSelectedView listSelectedView = (ListSelectedView) ViewBindings.findChildViewById(view, i);
            if (listSelectedView != null) {
                i = R.id.loading;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    i = R.id.save;
                    MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, i);
                    if (materialButton != null) {
                        i = R.id.skip;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.sky_network_tip;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.sky_play_retry;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.title_bar;
                                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                    if (rainbowTitleBar != null) {
                                        return new ActivitySkyPreferenceBinding((ConstraintLayout) view, group, listSelectedView, lottieAnimationView, materialButton, textView, textView2, textView3, rainbowTitleBar);
                                    }
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
    public static ActivitySkyPreferenceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySkyPreferenceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sky_preference, viewGroup, false);
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
