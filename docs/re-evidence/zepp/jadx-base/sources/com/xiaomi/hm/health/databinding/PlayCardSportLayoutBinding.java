package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayCardSportLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Group groupTodayDetail;

    @NonNull
    public final TextView sportDesc;

    @NonNull
    public final AppCompatImageView sportIcon;

    @NonNull
    public final Button sportJump;

    @NonNull
    public final TextView sportTitle;

    @NonNull
    public final TextView tvDistance;

    @NonNull
    public final TextView tvDistanceValue;

    @NonNull
    public final TextView tvPace;

    @NonNull
    public final TextView tvPaceValue;

    @NonNull
    public final TextView tvTime;

    @NonNull
    public final TextView tvTimeValue;

    private PlayCardSportLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull Group groupTodayDetail, @NonNull TextView sportDesc, @NonNull AppCompatImageView sportIcon, @NonNull Button sportJump, @NonNull TextView sportTitle, @NonNull TextView tvDistance, @NonNull TextView tvDistanceValue, @NonNull TextView tvPace, @NonNull TextView tvPaceValue, @NonNull TextView tvTime, @NonNull TextView tvTimeValue) {
        this.a = rootView;
        this.groupTodayDetail = groupTodayDetail;
        this.sportDesc = sportDesc;
        this.sportIcon = sportIcon;
        this.sportJump = sportJump;
        this.sportTitle = sportTitle;
        this.tvDistance = tvDistance;
        this.tvDistanceValue = tvDistanceValue;
        this.tvPace = tvPace;
        this.tvPaceValue = tvPaceValue;
        this.tvTime = tvTime;
        this.tvTimeValue = tvTimeValue;
    }

    @NonNull
    public static PlayCardSportLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.group_today_detail;
        Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.group_today_detail);
        if (group != null) {
            i = R.id.sport_desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_desc);
            if (textView != null) {
                i = R.id.sport_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.sport_icon);
                if (appCompatImageView != null) {
                    i = R.id.sport_jump;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.sport_jump);
                    if (button != null) {
                        i = R.id.sport_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_title);
                        if (textView2 != null) {
                            i = R.id.tv_distance;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_distance);
                            if (textView3 != null) {
                                i = R.id.tv_distance_value;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
                                if (textView4 != null) {
                                    i = R.id.tv_pace;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_pace);
                                    if (textView5 != null) {
                                        i = R.id.tv_pace_value;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_pace_value);
                                        if (textView6 != null) {
                                            i = R.id.tv_time;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_time);
                                            if (textView7 != null) {
                                                i = R.id.tv_time_value;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_time_value);
                                                if (textView8 != null) {
                                                    return new PlayCardSportLayoutBinding((ConstraintLayout) rootView, group, textView, appCompatImageView, button, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static PlayCardSportLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardSportLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_sport_layout, parent, false);
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
