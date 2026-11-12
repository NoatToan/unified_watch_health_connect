package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolFriendsItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView toolFriendsIcon;

    @NonNull
    public final AppCompatTextView toolFriendsName;

    @NonNull
    public final AppCompatImageView toolFriendsRight;

    private LayoutToolFriendsItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView toolFriendsIcon, @NonNull AppCompatTextView toolFriendsName, @NonNull AppCompatImageView toolFriendsRight) {
        this.a = rootView;
        this.toolFriendsIcon = toolFriendsIcon;
        this.toolFriendsName = toolFriendsName;
        this.toolFriendsRight = toolFriendsRight;
    }

    @NonNull
    public static LayoutToolFriendsItemBinding bind(@NonNull View rootView) {
        int i = R.id.tool_friends_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_icon);
        if (appCompatImageView != null) {
            i = R.id.tool_friends_name;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_name);
            if (appCompatTextView != null) {
                i = R.id.tool_friends_right;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_right);
                if (appCompatImageView2 != null) {
                    return new LayoutToolFriendsItemBinding((ConstraintLayout) rootView, appCompatImageView, appCompatTextView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolFriendsItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolFriendsItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_friends_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
