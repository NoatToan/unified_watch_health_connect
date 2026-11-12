package com.huami.phone_call.sms.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.phone_call.sms.R;
import com.huami.phone_call.sms.view.FixedSwipeMenuRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentPhoneCallReplyMsgBinding implements ViewBinding {

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
    public final FixedSwipeMenuRecyclerView contentLayout;

    @NonNull
    public final FrameLayout deviceStatusContent;

    @NonNull
    public final Space leftFlag;

    @NonNull
    public final View maskView;

    @NonNull
    public final Space rightFlag;

    @NonNull
    public final RainbowTitleBar titleBar;

    private FragmentPhoneCallReplyMsgBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView, @NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull View view, @NonNull Space space2, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.bottomLayout = constraintLayout2;
        this.btnAdd = textView;
        this.btnDone = textView2;
        this.btnEdit = textView3;
        this.contentLayout = fixedSwipeMenuRecyclerView;
        this.deviceStatusContent = frameLayout;
        this.leftFlag = space;
        this.maskView = view;
        this.rightFlag = space2;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static FragmentPhoneCallReplyMsgBinding bind(@NonNull View view) {
        View viewFindChildViewById;
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
                        FixedSwipeMenuRecyclerView fixedSwipeMenuRecyclerView = (FixedSwipeMenuRecyclerView) ViewBindings.findChildViewById(view, i);
                        if (fixedSwipeMenuRecyclerView != null) {
                            i = R.id.device_status_content;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = R.id.left_flag;
                                Space space = (Space) ViewBindings.findChildViewById(view, i);
                                if (space != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                                    i = R.id.right_flag;
                                    Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                                    if (space2 != null) {
                                        i = R.id.title_bar;
                                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                        if (rainbowTitleBar != null) {
                                            return new FragmentPhoneCallReplyMsgBinding((ConstraintLayout) view, constraintLayout, textView, textView2, textView3, fixedSwipeMenuRecyclerView, frameLayout, space, viewFindChildViewById, space2, rainbowTitleBar);
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
    public static FragmentPhoneCallReplyMsgBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPhoneCallReplyMsgBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_phone_call_reply_msg, viewGroup, false);
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
