package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.HMCircleImageView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutFamilyItemBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final HMCircleImageView userAvatar;

    @NonNull
    public final HMCircleImageView userFilter;

    private LayoutFamilyItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull HMCircleImageView hMCircleImageView, @NonNull HMCircleImageView hMCircleImageView2) {
        this.a = relativeLayout;
        this.userAvatar = hMCircleImageView;
        this.userFilter = hMCircleImageView2;
    }

    @NonNull
    public static LayoutFamilyItemBinding bind(@NonNull View view) {
        int i = R.id.user_avatar;
        HMCircleImageView hMCircleImageView = (HMCircleImageView) ViewBindings.findChildViewById(view, i);
        if (hMCircleImageView != null) {
            i = R.id.user_filter;
            HMCircleImageView hMCircleImageView2 = (HMCircleImageView) ViewBindings.findChildViewById(view, i);
            if (hMCircleImageView2 != null) {
                return new LayoutFamilyItemBinding((RelativeLayout) view, hMCircleImageView, hMCircleImageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutFamilyItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutFamilyItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_family_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
