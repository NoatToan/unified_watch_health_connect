package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.zhouyou.recyclerview.sticky.StickyNestedScrollView;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentTodoListBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout bottomLayout;

    @NonNull
    public final TextView btnAdd;

    @NonNull
    public final TextView btnDone;

    @NonNull
    public final TextView btnEdit;

    @NonNull
    public final SwipeMenuRecyclerView contentLayout;

    @NonNull
    public final Space leftFlag;

    @NonNull
    public final Space rightFlag;

    @NonNull
    public final StickyNestedScrollView scrollView;

    @NonNull
    public final TextView tips;

    @NonNull
    public final RainbowTitleBar titleBar;

    private FragmentTodoListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SwipeMenuRecyclerView swipeMenuRecyclerView, @NonNull Space space, @NonNull Space space2, @NonNull StickyNestedScrollView stickyNestedScrollView, @NonNull TextView textView4, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.bottomLayout = constraintLayout2;
        this.btnAdd = textView;
        this.btnDone = textView2;
        this.btnEdit = textView3;
        this.contentLayout = swipeMenuRecyclerView;
        this.leftFlag = space;
        this.rightFlag = space2;
        this.scrollView = stickyNestedScrollView;
        this.tips = textView4;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static FragmentTodoListBinding bind(@NonNull View view) {
        int i = R.id.bottom_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.btn_add;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.btn_done;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.btn_edit;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.content_layout;
                        SwipeMenuRecyclerView swipeMenuRecyclerView = (SwipeMenuRecyclerView) ViewBindings.findChildViewById(view, i);
                        if (swipeMenuRecyclerView != null) {
                            i = R.id.left_flag;
                            Space space = (Space) ViewBindings.findChildViewById(view, i);
                            if (space != null) {
                                i = R.id.right_flag;
                                Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                                if (space2 != null) {
                                    i = R.id.scroll_view;
                                    StickyNestedScrollView stickyNestedScrollView = (StickyNestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (stickyNestedScrollView != null) {
                                        i = R.id.tips;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = R.id.title_bar;
                                            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                            if (rainbowTitleBar != null) {
                                                return new FragmentTodoListBinding((ConstraintLayout) view, constraintLayout, textView, textView2, textView3, swipeMenuRecyclerView, space, space2, stickyNestedScrollView, textView4, rainbowTitleBar);
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
    public static FragmentTodoListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentTodoListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_todo_list, viewGroup, false);
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
