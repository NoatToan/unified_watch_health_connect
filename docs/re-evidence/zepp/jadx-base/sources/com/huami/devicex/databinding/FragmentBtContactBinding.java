package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.widget.TipComponent;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentBtContactBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout clEditController;

    @NonNull
    public final LinearLayout contentLayout;

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final ImageView ivAdd;

    @NonNull
    public final ImageView ivEdit;

    @NonNull
    public final LinearLayout layoutAdd;

    @NonNull
    public final LinearLayout layoutEdit;

    @NonNull
    public final TipComponent permissionTips;

    @NonNull
    public final RecyclerView rvContact;

    @NonNull
    public final RainbowTitleBar toolBar;

    @NonNull
    public final RainbowTitleBar toolBarEdit;

    @NonNull
    public final FrameLayout toolBarLayout;

    @NonNull
    public final TextView tvAdd;

    @NonNull
    public final TextView tvEdit;

    @NonNull
    public final TextView tvMaxContactCount;

    private FragmentBtContactBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TipComponent tipComponent, @NonNull RecyclerView recyclerView, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull RainbowTitleBar rainbowTitleBar2, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.clEditController = constraintLayout2;
        this.contentLayout = linearLayout;
        this.guideline = guideline;
        this.ivAdd = imageView;
        this.ivEdit = imageView2;
        this.layoutAdd = linearLayout2;
        this.layoutEdit = linearLayout3;
        this.permissionTips = tipComponent;
        this.rvContact = recyclerView;
        this.toolBar = rainbowTitleBar;
        this.toolBarEdit = rainbowTitleBar2;
        this.toolBarLayout = frameLayout;
        this.tvAdd = textView;
        this.tvEdit = textView2;
        this.tvMaxContactCount = textView3;
    }

    @NonNull
    public static FragmentBtContactBinding bind(@NonNull View view) {
        int i = R.id.cl_edit_controller;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.content_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.guideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = R.id.iv_add;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.iv_edit;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.layout_add;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = R.id.layout_edit;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout3 != null) {
                                    i = R.id.permission_tips;
                                    TipComponent tipComponent = (TipComponent) ViewBindings.findChildViewById(view, i);
                                    if (tipComponent != null) {
                                        i = R.id.rv_contact;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = R.id.tool_bar;
                                            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                            if (rainbowTitleBar != null) {
                                                i = R.id.tool_bar_edit;
                                                RainbowTitleBar rainbowTitleBar2 = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                                if (rainbowTitleBar2 != null) {
                                                    i = R.id.tool_bar_layout;
                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout != null) {
                                                        i = R.id.tv_add;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = R.id.tv_edit;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                i = R.id.tv_max_contact_count;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    return new FragmentBtContactBinding((ConstraintLayout) view, constraintLayout, linearLayout, guideline, imageView, imageView2, linearLayout2, linearLayout3, tipComponent, recyclerView, rainbowTitleBar, rainbowTitleBar2, frameLayout, textView, textView2, textView3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBtContactBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBtContactBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bt_contact, viewGroup, false);
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
