package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes20.dex */
public final class ChangeSportGoalActivityBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView braceletTitleInfo;

    @NonNull
    public final Button changeSportGoalConfirm;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final WheelView personInfoGoalPicker;

    @NonNull
    public final LinearLayout personinfoChangeSportGoalMask;

    @NonNull
    public final LinearLayout personinfoChangeSportGoalTip;

    private ChangeSportGoalActivityBinding(@NonNull RelativeLayout rootView, @NonNull TextView braceletTitleInfo, @NonNull Button changeSportGoalConfirm, @NonNull FrameLayout container, @NonNull WheelView personInfoGoalPicker, @NonNull LinearLayout personinfoChangeSportGoalMask, @NonNull LinearLayout personinfoChangeSportGoalTip) {
        this.a = rootView;
        this.braceletTitleInfo = braceletTitleInfo;
        this.changeSportGoalConfirm = changeSportGoalConfirm;
        this.container = container;
        this.personInfoGoalPicker = personInfoGoalPicker;
        this.personinfoChangeSportGoalMask = personinfoChangeSportGoalMask;
        this.personinfoChangeSportGoalTip = personinfoChangeSportGoalTip;
    }

    @NonNull
    public static ChangeSportGoalActivityBinding bind(@NonNull View rootView) {
        int i = R.id.bracelet_title_info;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bracelet_title_info);
        if (textView != null) {
            i = R.id.change_sport_goal_confirm;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.change_sport_goal_confirm);
            if (button != null) {
                i = R.id.container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (frameLayout != null) {
                    i = R.id.person_info_goal_picker;
                    WheelView wheelView = (WheelView) ViewBindings.findChildViewById(rootView, R.id.person_info_goal_picker);
                    if (wheelView != null) {
                        i = R.id.personinfo_change_sport_goal_mask;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.personinfo_change_sport_goal_mask);
                        if (linearLayout != null) {
                            i = R.id.personinfo_change_sport_goal_tip;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.personinfo_change_sport_goal_tip);
                            if (linearLayout2 != null) {
                                return new ChangeSportGoalActivityBinding((RelativeLayout) rootView, textView, button, frameLayout, wheelView, linearLayout, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ChangeSportGoalActivityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ChangeSportGoalActivityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.change_sport_goal_activity, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
