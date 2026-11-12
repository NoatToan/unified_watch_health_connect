package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.button.RainbowButton;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentBtPhoneSettingGuideBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RainbowButton btGoSetting;

    @NonNull
    public final FragmentContainerView container;

    @NonNull
    public final RainbowTitleBar titleBar;

    private FragmentBtPhoneSettingGuideBinding(@NonNull LinearLayout rootView, @NonNull RainbowButton btGoSetting, @NonNull FragmentContainerView container, @NonNull RainbowTitleBar titleBar) {
        this.a = rootView;
        this.btGoSetting = btGoSetting;
        this.container = container;
        this.titleBar = titleBar;
    }

    @NonNull
    public static FragmentBtPhoneSettingGuideBinding bind(@NonNull View rootView) {
        int i = R.id.bt_go_setting;
        RainbowButton rainbowButton = (RainbowButton) ViewBindings.findChildViewById(rootView, R.id.bt_go_setting);
        if (rainbowButton != null) {
            i = R.id.container;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.container);
            if (fragmentContainerView != null) {
                i = R.id.title_bar;
                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                if (rainbowTitleBar != null) {
                    return new FragmentBtPhoneSettingGuideBinding((LinearLayout) rootView, rainbowButton, fragmentContainerView, rainbowTitleBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBtPhoneSettingGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentBtPhoneSettingGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_bt_phone_setting_guide, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
