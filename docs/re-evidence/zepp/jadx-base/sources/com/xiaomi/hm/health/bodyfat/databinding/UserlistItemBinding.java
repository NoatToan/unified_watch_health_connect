package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.HMCircleImageView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class UserlistItemBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final HMCircleImageView userIcon;

    @NonNull
    public final TextView userListItemName;

    private UserlistItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull HMCircleImageView hMCircleImageView, @NonNull TextView textView) {
        this.a = relativeLayout;
        this.userIcon = hMCircleImageView;
        this.userListItemName = textView;
    }

    @NonNull
    public static UserlistItemBinding bind(@NonNull View view) {
        int i = R.id.user_icon;
        HMCircleImageView hMCircleImageView = (HMCircleImageView) ViewBindings.findChildViewById(view, i);
        if (hMCircleImageView != null) {
            i = R.id.user_list_item_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new UserlistItemBinding((RelativeLayout) view, hMCircleImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static UserlistItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static UserlistItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.userlist_item, viewGroup, false);
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
