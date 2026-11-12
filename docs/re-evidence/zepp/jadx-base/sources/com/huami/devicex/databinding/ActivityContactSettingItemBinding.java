package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityContactSettingItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Button btnConfirm;

    @NonNull
    public final FragmentContainerView fragmentContainer;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivityContactSettingItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull FragmentContainerView fragmentContainerView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.btnConfirm = button;
        this.fragmentContainer = fragmentContainerView;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityContactSettingItemBinding bind(@NonNull View view) {
        int i = R.id.btn_confirm;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.fragment_container;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = R.id.title_bar;
                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                if (rainbowTitleBar != null) {
                    return new ActivityContactSettingItemBinding((ConstraintLayout) view, button, fragmentContainerView, rainbowTitleBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityContactSettingItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityContactSettingItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_contact_setting_item, viewGroup, false);
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
