package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class WearModeFragmentBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final RadioGroup dsWearingMethodHand;

    @NonNull
    public final View maskView;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final LinearLayoutCompat wearDirectionContainer;

    @NonNull
    public final RadioGroup wearDirectionRadioGroup;

    private WearModeFragmentBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull RadioGroup radioGroup, @NonNull View view, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RadioGroup radioGroup2) {
        this.a = frameLayout;
        this.container = frameLayout2;
        this.dsWearingMethodHand = radioGroup;
        this.maskView = view;
        this.titleBar = rainbowTitleBar;
        this.wearDirectionContainer = linearLayoutCompat;
        this.wearDirectionRadioGroup = radioGroup2;
    }

    @NonNull
    public static WearModeFragmentBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.ds_wearing_method_hand;
            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
            if (radioGroup != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                i = R.id.titleBar;
                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                if (rainbowTitleBar != null) {
                    i = R.id.wear_direction_container;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = R.id.wear_direction_radio_group;
                        RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, i);
                        if (radioGroup2 != null) {
                            return new WearModeFragmentBinding((FrameLayout) view, frameLayout, radioGroup, viewFindChildViewById, rainbowTitleBar, linearLayoutCompat, radioGroup2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WearModeFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WearModeFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.wear_mode_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
