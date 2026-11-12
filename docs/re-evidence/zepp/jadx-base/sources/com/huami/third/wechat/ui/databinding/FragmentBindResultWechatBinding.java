package com.huami.third.wechat.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.button.RainbowButton;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.third.wechat.ui.R;

/* JADX INFO: loaded from: classes14.dex */
public final class FragmentBindResultWechatBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView bindSuccessTips;

    @NonNull
    public final TextView bindTips;

    @NonNull
    public final RainbowButton btnDeleteDevice;

    @NonNull
    public final ImageView img;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final TextView tvDescSteps;

    private FragmentBindResultWechatBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RainbowButton rainbowButton, @NonNull ImageView imageView, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.bindSuccessTips = textView;
        this.bindTips = textView2;
        this.btnDeleteDevice = rainbowButton;
        this.img = imageView;
        this.titleBar = rainbowTitleBar;
        this.tvDescSteps = textView3;
    }

    @NonNull
    public static FragmentBindResultWechatBinding bind(@NonNull View view) {
        int i = R.id.bind_success_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.bind_tips;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.btn_delete_device;
                RainbowButton rainbowButton = (RainbowButton) ViewBindings.findChildViewById(view, i);
                if (rainbowButton != null) {
                    i = R.id.img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.title_bar;
                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                        if (rainbowTitleBar != null) {
                            i = R.id.tv_desc_steps;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new FragmentBindResultWechatBinding((ConstraintLayout) view, textView, textView2, rainbowButton, imageView, rainbowTitleBar, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBindResultWechatBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBindResultWechatBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bind_result_wechat, viewGroup, false);
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
