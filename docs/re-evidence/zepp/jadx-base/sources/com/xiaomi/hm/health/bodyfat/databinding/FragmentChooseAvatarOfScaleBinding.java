package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.HMCircleImageView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentChooseAvatarOfScaleBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final Button btnNextStep;

    @NonNull
    public final RelativeLayout header;

    @NonNull
    public final ImageButton ibBack;

    @NonNull
    public final HMCircleImageView ivChange;

    @NonNull
    public final FrameLayout layoutAvatar;

    @NonNull
    public final FrameLayout viewRoot;

    private FragmentChooseAvatarOfScaleBinding(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull RelativeLayout relativeLayout, @NonNull ImageButton imageButton, @NonNull HMCircleImageView hMCircleImageView, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.a = frameLayout;
        this.btnNextStep = button;
        this.header = relativeLayout;
        this.ibBack = imageButton;
        this.ivChange = hMCircleImageView;
        this.layoutAvatar = frameLayout2;
        this.viewRoot = frameLayout3;
    }

    @NonNull
    public static FragmentChooseAvatarOfScaleBinding bind(@NonNull View view) {
        int i = R.id.btn_next_step;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.header;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.ib_back;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    i = R.id.iv_change;
                    HMCircleImageView hMCircleImageView = (HMCircleImageView) ViewBindings.findChildViewById(view, i);
                    if (hMCircleImageView != null) {
                        i = R.id.layout_avatar;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            FrameLayout frameLayout2 = (FrameLayout) view;
                            return new FragmentChooseAvatarOfScaleBinding(frameLayout2, button, relativeLayout, imageButton, hMCircleImageView, frameLayout, frameLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChooseAvatarOfScaleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChooseAvatarOfScaleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_avatar_of_scale, viewGroup, false);
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
