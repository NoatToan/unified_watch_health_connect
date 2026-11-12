package com.huami.account.auth.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.account.auth.R;
import com.huami.lib.rainbow.button.RainbowButton;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.image.CircleImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityLoginByLastAccountBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final RainbowButton buttonLogin;

    @NonNull
    public final TextView buttonLoginOther;

    @NonNull
    public final CircleImageView imageAvatar;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final TextView tvLastLoginType;

    @NonNull
    public final TextView tvNickname;

    private ActivityLoginByLastAccountBinding(@NonNull FrameLayout frameLayout, @NonNull RainbowButton rainbowButton, @NonNull TextView textView, @NonNull CircleImageView circleImageView, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = frameLayout;
        this.buttonLogin = rainbowButton;
        this.buttonLoginOther = textView;
        this.imageAvatar = circleImageView;
        this.titleBar = rainbowTitleBar;
        this.tvLastLoginType = textView2;
        this.tvNickname = textView3;
    }

    @NonNull
    public static ActivityLoginByLastAccountBinding bind(@NonNull View view) {
        int i = R.id.button_login;
        RainbowButton rainbowButton = (RainbowButton) ViewBindings.findChildViewById(view, i);
        if (rainbowButton != null) {
            i = R.id.button_login_other;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.image_avatar;
                CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, i);
                if (circleImageView != null) {
                    i = R.id.title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                    if (rainbowTitleBar != null) {
                        i = R.id.tv_last_login_type;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_nickname;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new ActivityLoginByLastAccountBinding((FrameLayout) view, rainbowButton, textView, circleImageView, rainbowTitleBar, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityLoginByLastAccountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityLoginByLastAccountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_login_by_last_account, viewGroup, false);
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
