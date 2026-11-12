package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.device.earbud.view.EarbudImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityEarbudResetBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final Button btnReset;

    @NonNull
    public final Button btnReturn;

    @NonNull
    public final EarbudImageView deviceImg;

    @NonNull
    public final RainbowTitleBar tvTitleBar;

    private ActivityEarbudResetBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull EarbudImageView earbudImageView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.btnReset = button;
        this.btnReturn = button2;
        this.deviceImg = earbudImageView;
        this.tvTitleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityEarbudResetBinding bind(@NonNull View view) {
        int i = R.id.btn_reset;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.btn_return;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i);
            if (button2 != null) {
                i = R.id.device_img;
                EarbudImageView earbudImageView = (EarbudImageView) ViewBindings.findChildViewById(view, i);
                if (earbudImageView != null) {
                    i = R.id.tv_title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                    if (rainbowTitleBar != null) {
                        return new ActivityEarbudResetBinding((LinearLayout) view, button, button2, earbudImageView, rainbowTitleBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityEarbudResetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityEarbudResetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_earbud_reset, viewGroup, false);
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
