package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentBuzzerScenesBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile otherSceneItem;

    @NonNull
    public final ListTile sportSceneItem;

    @NonNull
    public final RainbowTitleBar titleBar;

    private FragmentBuzzerScenesBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.otherSceneItem = listTile;
        this.sportSceneItem = listTile2;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static FragmentBuzzerScenesBinding bind(@NonNull View view) {
        int i = R.id.otherSceneItem;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.sportSceneItem;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile2 != null) {
                i = R.id.titleBar;
                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                if (rainbowTitleBar != null) {
                    return new FragmentBuzzerScenesBinding((LinearLayout) view, listTile, listTile2, rainbowTitleBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBuzzerScenesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuzzerScenesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_buzzer_scenes, viewGroup, false);
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
