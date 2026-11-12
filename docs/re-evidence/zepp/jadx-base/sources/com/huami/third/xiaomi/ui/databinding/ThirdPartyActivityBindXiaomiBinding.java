package com.huami.third.xiaomi.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.third.xiaomi.ui.R;

/* JADX INFO: loaded from: classes14.dex */
public final class ThirdPartyActivityBindXiaomiBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FragmentContainerView fragmentContainer;

    @NonNull
    public final RainbowTitleBar toolbar;

    private ThirdPartyActivityBindXiaomiBinding(@NonNull LinearLayout linearLayout, @NonNull FragmentContainerView fragmentContainerView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.fragmentContainer = fragmentContainerView;
        this.toolbar = rainbowTitleBar;
    }

    @NonNull
    public static ThirdPartyActivityBindXiaomiBinding bind(@NonNull View view) {
        int i = R.id.fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view.findViewById(i);
        if (fragmentContainerView != null) {
            i = R.id.toolbar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) view.findViewById(i);
            if (rainbowTitleBar != null) {
                return new ThirdPartyActivityBindXiaomiBinding((LinearLayout) view, fragmentContainerView, rainbowTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ThirdPartyActivityBindXiaomiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ThirdPartyActivityBindXiaomiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.third_party_activity_bind_xiaomi, viewGroup, false);
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
