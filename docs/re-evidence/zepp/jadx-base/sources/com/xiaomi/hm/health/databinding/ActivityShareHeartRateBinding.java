package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.CircleImageView;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityShareHeartRateBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final Button backButton;

    @NonNull
    public final RelativeLayout contentLayout;

    @NonNull
    public final TextView date;

    @NonNull
    public final View shareBarBg;

    @NonNull
    public final RelativeLayout shareLogo;

    @NonNull
    public final FrameLayout sharePaneContainer;

    @NonNull
    public final TextView title;

    @NonNull
    public final FrameLayout titleBar;

    @NonNull
    public final ImageView tvLogo;

    @NonNull
    public final CircleImageView userAvatar;

    @NonNull
    public final TextView userNickname;

    @NonNull
    public final TypefaceTextView value;

    private ActivityShareHeartRateBinding(@NonNull RelativeLayout rootView, @NonNull Button backButton, @NonNull RelativeLayout contentLayout, @NonNull TextView date, @NonNull View shareBarBg, @NonNull RelativeLayout shareLogo, @NonNull FrameLayout sharePaneContainer, @NonNull TextView title, @NonNull FrameLayout titleBar, @NonNull ImageView tvLogo, @NonNull CircleImageView userAvatar, @NonNull TextView userNickname, @NonNull TypefaceTextView value) {
        this.a = rootView;
        this.backButton = backButton;
        this.contentLayout = contentLayout;
        this.date = date;
        this.shareBarBg = shareBarBg;
        this.shareLogo = shareLogo;
        this.sharePaneContainer = sharePaneContainer;
        this.title = title;
        this.titleBar = titleBar;
        this.tvLogo = tvLogo;
        this.userAvatar = userAvatar;
        this.userNickname = userNickname;
        this.value = value;
    }

    @NonNull
    public static ActivityShareHeartRateBinding bind(@NonNull View rootView) {
        int i = R.id.back_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.back_button);
        if (button != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = R.id.date;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.date);
            if (textView != null) {
                i = R.id.share_bar_bg;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.share_bar_bg);
                if (viewFindChildViewById != null) {
                    i = R.id.share_logo;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_logo);
                    if (relativeLayout2 != null) {
                        i = R.id.share_pane_container;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.share_pane_container);
                        if (frameLayout != null) {
                            i = R.id.title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                            if (textView2 != null) {
                                i = R.id.title_bar;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                                if (frameLayout2 != null) {
                                    i = R.id.tv_logo;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_logo);
                                    if (imageView != null) {
                                        i = R.id.user_avatar;
                                        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.user_avatar);
                                        if (circleImageView != null) {
                                            i = R.id.user_nickname;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.user_nickname);
                                            if (textView3 != null) {
                                                i = R.id.value;
                                                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.value);
                                                if (typefaceTextView != null) {
                                                    return new ActivityShareHeartRateBinding(relativeLayout, button, relativeLayout, textView, viewFindChildViewById, relativeLayout2, frameLayout, textView2, frameLayout2, imageView, circleImageView, textView3, typefaceTextView);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityShareHeartRateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityShareHeartRateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_share_heart_rate, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
