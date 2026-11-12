package com.huami.third.wechat.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
public final class FragmentBindWechatBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView bindTips;

    @NonNull
    public final RainbowButton btnDoQr;

    @NonNull
    public final RainbowButton btnOtherWay;

    @NonNull
    public final ImageView imgQr;

    @NonNull
    public final ImageView imgWatchQr;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final LinearLayout viewSaveQr;

    @NonNull
    public final LinearLayout viewSendQr;

    private FragmentBindWechatBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull RainbowButton rainbowButton, @NonNull RainbowButton rainbowButton2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.a = constraintLayout;
        this.bindTips = textView;
        this.btnDoQr = rainbowButton;
        this.btnOtherWay = rainbowButton2;
        this.imgQr = imageView;
        this.imgWatchQr = imageView2;
        this.titleBar = rainbowTitleBar;
        this.viewSaveQr = linearLayout;
        this.viewSendQr = linearLayout2;
    }

    @NonNull
    public static FragmentBindWechatBinding bind(@NonNull View view) {
        int i = R.id.bind_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btn_do_qr;
            RainbowButton rainbowButton = (RainbowButton) ViewBindings.findChildViewById(view, i);
            if (rainbowButton != null) {
                i = R.id.btn_other_way;
                RainbowButton rainbowButton2 = (RainbowButton) ViewBindings.findChildViewById(view, i);
                if (rainbowButton2 != null) {
                    i = R.id.img_qr;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.img_watch_qr;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.title_bar;
                            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                            if (rainbowTitleBar != null) {
                                i = R.id.view_save_qr;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.view_send_qr;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        return new FragmentBindWechatBinding((ConstraintLayout) view, textView, rainbowButton, rainbowButton2, imageView, imageView2, rainbowTitleBar, linearLayout, linearLayout2);
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
    public static FragmentBindWechatBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBindWechatBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bind_wechat, viewGroup, false);
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
