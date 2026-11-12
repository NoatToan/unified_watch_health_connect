package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.HMCircleImageView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAchieveWeightGoalBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Button backButton;

    @NonNull
    public final TextView btnSetGoal;

    @NonNull
    public final HMCircleImageView ivUserAvatar;

    @NonNull
    public final FrameLayout layoutCenter;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final FrameLayout shareContainer;

    @NonNull
    public final TextView textBmiValue;

    @NonNull
    public final TextView textBodyShape;

    @NonNull
    public final TextView textNum;

    @NonNull
    public final TextView textTips;

    @NonNull
    public final TextView textUnit;

    @NonNull
    public final TextView textUserName;

    @NonNull
    public final TextView textWeightValue;

    @NonNull
    public final FrameLayout titleBarBack;

    private ActivityAchieveWeightGoalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull TextView textView, @NonNull HMCircleImageView hMCircleImageView, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull FrameLayout frameLayout3) {
        this.a = constraintLayout;
        this.backButton = button;
        this.btnSetGoal = textView;
        this.ivUserAvatar = hMCircleImageView;
        this.layoutCenter = frameLayout;
        this.rootView = constraintLayout2;
        this.shareContainer = frameLayout2;
        this.textBmiValue = textView2;
        this.textBodyShape = textView3;
        this.textNum = textView4;
        this.textTips = textView5;
        this.textUnit = textView6;
        this.textUserName = textView7;
        this.textWeightValue = textView8;
        this.titleBarBack = frameLayout3;
    }

    @NonNull
    public static ActivityAchieveWeightGoalBinding bind(@NonNull View view) {
        int i = R.id.back_button;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.btn_set_goal;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.iv_user_avatar;
                HMCircleImageView hMCircleImageView = (HMCircleImageView) ViewBindings.findChildViewById(view, i);
                if (hMCircleImageView != null) {
                    i = R.id.layout_center;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.share_container;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            i = R.id.text_bmi_value;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.text_body_shape;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.text_num;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.text_tips;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            i = R.id.text_unit;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null) {
                                                i = R.id.text_user_name;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView7 != null) {
                                                    i = R.id.text_weight_value;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView8 != null) {
                                                        i = R.id.title_bar_back;
                                                        FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                        if (frameLayout3 != null) {
                                                            return new ActivityAchieveWeightGoalBinding(constraintLayout, button, textView, hMCircleImageView, frameLayout, constraintLayout, frameLayout2, textView2, textView3, textView4, textView5, textView6, textView7, textView8, frameLayout3);
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
    public static ActivityAchieveWeightGoalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAchieveWeightGoalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_achieve_weight_goal, viewGroup, false);
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
