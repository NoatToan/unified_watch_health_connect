package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.HMCircleImageView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMyLoseWeightPlanBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final HMCircleImageView myLoseWeightPersonInfoAvatar;

    @NonNull
    public final TypefaceTextView myLoseWeightPersonName;

    @NonNull
    public final TextView myLoseWeightPlanGoal;

    @NonNull
    public final TextView myLoseWeightPlanGoalUnit;

    @NonNull
    public final TextView myLoseWeightPlanPeriod;

    @NonNull
    public final TextView myLoseWeightPlanSportTimeDay;

    @NonNull
    public final TextView myLoseWeightPlanSportTimeWeek;

    @NonNull
    public final TextView myLoseWeightPlanSportType;

    private ActivityMyLoseWeightPlanBinding(@NonNull ConstraintLayout constraintLayout, @NonNull HMCircleImageView hMCircleImageView, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.a = constraintLayout;
        this.myLoseWeightPersonInfoAvatar = hMCircleImageView;
        this.myLoseWeightPersonName = typefaceTextView;
        this.myLoseWeightPlanGoal = textView;
        this.myLoseWeightPlanGoalUnit = textView2;
        this.myLoseWeightPlanPeriod = textView3;
        this.myLoseWeightPlanSportTimeDay = textView4;
        this.myLoseWeightPlanSportTimeWeek = textView5;
        this.myLoseWeightPlanSportType = textView6;
    }

    @NonNull
    public static ActivityMyLoseWeightPlanBinding bind(@NonNull View view) {
        int i = R.id.my_lose_weight_person_info_avatar;
        HMCircleImageView hMCircleImageView = (HMCircleImageView) ViewBindings.findChildViewById(view, i);
        if (hMCircleImageView != null) {
            i = R.id.my_lose_weight_person_name;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
            if (typefaceTextView != null) {
                i = R.id.my_lose_weight_plan_goal;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.my_lose_weight_plan_goal_unit;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.my_lose_weight_plan_period;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.my_lose_weight_plan_sport_time_day;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.my_lose_weight_plan_sport_time_week;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.my_lose_weight_plan_sport_type;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        return new ActivityMyLoseWeightPlanBinding((ConstraintLayout) view, hMCircleImageView, typefaceTextView, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static ActivityMyLoseWeightPlanBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityMyLoseWeightPlanBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_my_lose_weight_plan, viewGroup, false);
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
