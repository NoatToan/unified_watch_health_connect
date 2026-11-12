package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.accessdoor.R;

/* JADX INFO: loaded from: classes15.dex */
public final class WlBaseTitleContentBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final View disabledMask;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    @NonNull
    public final FrameLayout wlContent;

    @NonNull
    public final FrameLayout wlHeader;

    private WlBaseTitleContentBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.a = linearLayout;
        this.disabledMask = view;
        this.tvTitleBar = rainbowTitleBar;
        this.wlContent = frameLayout;
        this.wlHeader = frameLayout2;
    }

    @NonNull
    public static WlBaseTitleContentBinding bind(@NonNull View view) {
        int i = R.id.disabled_mask;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = R.id.tv_title_bar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
            if (rainbowTitleBar != null) {
                i = R.id.wl_content;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.wl_header;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        return new WlBaseTitleContentBinding((LinearLayout) view, viewFindChildViewById, rainbowTitleBar, frameLayout, frameLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WlBaseTitleContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WlBaseTitleContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.wl_base_title_content, viewGroup, false);
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
