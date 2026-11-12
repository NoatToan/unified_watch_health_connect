package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolFriendsBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolFriends;

    @NonNull
    public final AppCompatTextView toolFriendsAdd;

    @NonNull
    public final AppCompatImageView toolFriendsAddIcon;

    @NonNull
    public final AppCompatImageView toolFriendsInvite;

    @NonNull
    public final ConstraintLayout toolFriendsLayout;

    @NonNull
    public final ConstraintLayout toolFriendsMore;

    @NonNull
    public final AppCompatTextView toolFriendsPrompt;

    @NonNull
    public final AppCompatImageView toolFriendsQrcode;

    @NonNull
    public final RecyclerView toolFriendsRecyclerview;

    @NonNull
    public final AppCompatImageView toolFriendsScan;

    @NonNull
    public final ConstraintLayout toolNoFriendsLayout;

    @NonNull
    public final View view1;

    private LayoutToolFriendsBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolFriends, @NonNull AppCompatTextView toolFriendsAdd, @NonNull AppCompatImageView toolFriendsAddIcon, @NonNull AppCompatImageView toolFriendsInvite, @NonNull ConstraintLayout toolFriendsLayout, @NonNull ConstraintLayout toolFriendsMore, @NonNull AppCompatTextView toolFriendsPrompt, @NonNull AppCompatImageView toolFriendsQrcode, @NonNull RecyclerView toolFriendsRecyclerview, @NonNull AppCompatImageView toolFriendsScan, @NonNull ConstraintLayout toolNoFriendsLayout, @NonNull View view1) {
        this.a = rootView;
        this.toolFriends = toolFriends;
        this.toolFriendsAdd = toolFriendsAdd;
        this.toolFriendsAddIcon = toolFriendsAddIcon;
        this.toolFriendsInvite = toolFriendsInvite;
        this.toolFriendsLayout = toolFriendsLayout;
        this.toolFriendsMore = toolFriendsMore;
        this.toolFriendsPrompt = toolFriendsPrompt;
        this.toolFriendsQrcode = toolFriendsQrcode;
        this.toolFriendsRecyclerview = toolFriendsRecyclerview;
        this.toolFriendsScan = toolFriendsScan;
        this.toolNoFriendsLayout = toolNoFriendsLayout;
        this.view1 = view1;
    }

    @NonNull
    public static LayoutToolFriendsBinding bind(@NonNull View rootView) {
        int i = R.id.tool_friends;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_friends);
        if (appCompatTextView != null) {
            i = R.id.tool_friends_add;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_add);
            if (appCompatTextView2 != null) {
                i = R.id.tool_friends_add_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_add_icon);
                if (appCompatImageView != null) {
                    i = R.id.tool_friends_invite;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_invite);
                    if (appCompatImageView2 != null) {
                        i = R.id.tool_friends_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tool_friends_layout);
                        if (constraintLayout != null) {
                            i = R.id.tool_friends_more;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tool_friends_more);
                            if (constraintLayout2 != null) {
                                i = R.id.tool_friends_prompt;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_prompt);
                                if (appCompatTextView3 != null) {
                                    i = R.id.tool_friends_qrcode;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_qrcode);
                                    if (appCompatImageView3 != null) {
                                        i = R.id.tool_friends_recyclerview;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_recyclerview);
                                        if (recyclerView != null) {
                                            i = R.id.tool_friends_scan;
                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_friends_scan);
                                            if (appCompatImageView4 != null) {
                                                i = R.id.tool_no_friends_layout;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tool_no_friends_layout);
                                                if (constraintLayout3 != null) {
                                                    i = R.id.view_1;
                                                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_1);
                                                    if (viewFindChildViewById != null) {
                                                        return new LayoutToolFriendsBinding((ConstraintLayout) rootView, appCompatTextView, appCompatTextView2, appCompatImageView, appCompatImageView2, constraintLayout, constraintLayout2, appCompatTextView3, appCompatImageView3, recyclerView, appCompatImageView4, constraintLayout3, viewFindChildViewById);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolFriendsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolFriendsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_friends, parent, false);
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
