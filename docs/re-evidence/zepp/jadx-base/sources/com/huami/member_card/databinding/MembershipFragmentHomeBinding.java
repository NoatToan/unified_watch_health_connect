package com.huami.member_card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.member_card.R;

/* JADX INFO: loaded from: classes11.dex */
public final class MembershipFragmentHomeBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final Guideline guidelineLBottomArea;

    @NonNull
    public final View maskView;

    @NonNull
    public final Button memberAdd;

    @NonNull
    public final Button memberBtnAdd;

    @NonNull
    public final Button memberBtnComplete;

    @NonNull
    public final Button memberEdit;

    @NonNull
    public final TextView memberEmptyHintMsg;

    @NonNull
    public final View memberSpace;

    @NonNull
    public final RainbowTitleBar rainbowTitleBar;

    @NonNull
    public final RecyclerView recyclerView;

    private MembershipFragmentHomeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull Guideline guideline, @NonNull View view, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull TextView textView, @NonNull View view2, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.container = frameLayout;
        this.guidelineLBottomArea = guideline;
        this.maskView = view;
        this.memberAdd = button;
        this.memberBtnAdd = button2;
        this.memberBtnComplete = button3;
        this.memberEdit = button4;
        this.memberEmptyHintMsg = textView;
        this.memberSpace = view2;
        this.rainbowTitleBar = rainbowTitleBar;
        this.recyclerView = recyclerView;
    }

    @NonNull
    public static MembershipFragmentHomeBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.guideline_l_bottom_area;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                i = R.id.member_add;
                Button button = (Button) ViewBindings.findChildViewById(view, i);
                if (button != null) {
                    i = R.id.member_btn_add;
                    Button button2 = (Button) ViewBindings.findChildViewById(view, i);
                    if (button2 != null) {
                        i = R.id.member_btn_complete;
                        Button button3 = (Button) ViewBindings.findChildViewById(view, i);
                        if (button3 != null) {
                            i = R.id.member_edit;
                            Button button4 = (Button) ViewBindings.findChildViewById(view, i);
                            if (button4 != null) {
                                i = R.id.member_empty_hint_msg;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.member_space))) != null) {
                                    i = R.id.rainbow_title_bar;
                                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                    if (rainbowTitleBar != null) {
                                        i = R.id.recyclerView;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            return new MembershipFragmentHomeBinding((ConstraintLayout) view, frameLayout, guideline, viewFindChildViewById, button, button2, button3, button4, textView, viewFindChildViewById2, rainbowTitleBar, recyclerView);
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
    public static MembershipFragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MembershipFragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.membership_fragment_home, viewGroup, false);
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
