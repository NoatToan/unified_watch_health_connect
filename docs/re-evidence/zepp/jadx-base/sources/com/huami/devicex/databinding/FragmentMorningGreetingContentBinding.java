package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.device.view.FixedXRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentMorningGreetingContentBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FixedXRecyclerView contentLayout;

    @NonNull
    public final RainbowTitleBar toolbar;

    private FragmentMorningGreetingContentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FixedXRecyclerView fixedXRecyclerView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.contentLayout = fixedXRecyclerView;
        this.toolbar = rainbowTitleBar;
    }

    @NonNull
    public static FragmentMorningGreetingContentBinding bind(@NonNull View view) {
        int i = R.id.content_layout;
        FixedXRecyclerView fixedXRecyclerView = (FixedXRecyclerView) ViewBindings.findChildViewById(view, i);
        if (fixedXRecyclerView != null) {
            i = R.id.toolbar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
            if (rainbowTitleBar != null) {
                return new FragmentMorningGreetingContentBinding((ConstraintLayout) view, fixedXRecyclerView, rainbowTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMorningGreetingContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMorningGreetingContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_morning_greeting_content, viewGroup, false);
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
