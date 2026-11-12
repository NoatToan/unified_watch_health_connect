package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.device.view.EqView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityBoltEqBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final Button btnReset;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final View enableView;

    @NonNull
    public final SwitchCompat eqSwitch;

    @NonNull
    public final EqView eqView;

    @NonNull
    public final FrameLayout frameSwitch;

    @NonNull
    public final View maskView;

    @NonNull
    public final RecyclerView rvEq;

    @NonNull
    public final TextView tvCurrentEqualizer;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private ActivityBoltEqBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull SwitchCompat switchCompat, @NonNull EqView eqView, @NonNull FrameLayout frameLayout2, @NonNull View view2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.btnReset = button;
        this.container = frameLayout;
        this.enableView = view;
        this.eqSwitch = switchCompat;
        this.eqView = eqView;
        this.frameSwitch = frameLayout2;
        this.maskView = view2;
        this.rvEq = recyclerView;
        this.tvCurrentEqualizer = textView;
        this.tvTitleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityBoltEqBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.btn_reset;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.enable_view))) != null) {
                i = R.id.eq_switch;
                SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                if (switchCompat != null) {
                    i = R.id.eq_view;
                    EqView eqView = (EqView) ViewBindings.findChildViewById(view, i);
                    if (eqView != null) {
                        i = R.id.frame_switch;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                            i = R.id.rv_eq;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.tv_current_equalizer;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_title_bar;
                                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                    if (rainbowTitleBar != null) {
                                        return new ActivityBoltEqBinding((LinearLayout) view, button, frameLayout, viewFindChildViewById, switchCompat, eqView, frameLayout2, viewFindChildViewById2, recyclerView, textView, rainbowTitleBar);
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
    public static ActivityBoltEqBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBoltEqBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bolt_eq, viewGroup, false);
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
