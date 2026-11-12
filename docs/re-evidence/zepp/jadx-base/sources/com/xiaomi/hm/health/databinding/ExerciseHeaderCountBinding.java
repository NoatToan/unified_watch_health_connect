package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.CircleImageView;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ExerciseHeaderCountBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout chartArea;

    @NonNull
    public final View dividerBottom;

    @NonNull
    public final Space execChartSpace;

    @NonNull
    public final ImageView ivRunningStatBg;

    @NonNull
    public final LinearLayout statDataLayout;

    @NonNull
    public final TypefaceTextView statMainData;

    @NonNull
    public final TextView statMainDataUnit;

    @NonNull
    public final View statShareEnd;

    @NonNull
    public final LinearLayout statSportCountContainer;

    @NonNull
    public final RecyclerView statSportCountView;

    @NonNull
    public final TypefaceTextView statSubDataFirst;

    @NonNull
    public final TextView statSubDataFirstUnit;

    @NonNull
    public final TypefaceTextView statSubDataSecond;

    @NonNull
    public final TextView statSubDataSecondUnit;

    @NonNull
    public final TypefaceTextView statSubDataThird;

    @NonNull
    public final TextView statSubDataThirdUnit;

    @NonNull
    public final RelativeLayout statUserInfoContainer;

    @NonNull
    public final CircleImageView statViewAvatar;

    @NonNull
    public final TextView statViewNickname;

    @NonNull
    public final TextView statViewSportDes;

    @NonNull
    public final TextView tvDateRange;

    private ExerciseHeaderCountBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout chartArea, @NonNull View dividerBottom, @NonNull Space execChartSpace, @NonNull ImageView ivRunningStatBg, @NonNull LinearLayout statDataLayout, @NonNull TypefaceTextView statMainData, @NonNull TextView statMainDataUnit, @NonNull View statShareEnd, @NonNull LinearLayout statSportCountContainer, @NonNull RecyclerView statSportCountView, @NonNull TypefaceTextView statSubDataFirst, @NonNull TextView statSubDataFirstUnit, @NonNull TypefaceTextView statSubDataSecond, @NonNull TextView statSubDataSecondUnit, @NonNull TypefaceTextView statSubDataThird, @NonNull TextView statSubDataThirdUnit, @NonNull RelativeLayout statUserInfoContainer, @NonNull CircleImageView statViewAvatar, @NonNull TextView statViewNickname, @NonNull TextView statViewSportDes, @NonNull TextView tvDateRange) {
        this.a = rootView;
        this.chartArea = chartArea;
        this.dividerBottom = dividerBottom;
        this.execChartSpace = execChartSpace;
        this.ivRunningStatBg = ivRunningStatBg;
        this.statDataLayout = statDataLayout;
        this.statMainData = statMainData;
        this.statMainDataUnit = statMainDataUnit;
        this.statShareEnd = statShareEnd;
        this.statSportCountContainer = statSportCountContainer;
        this.statSportCountView = statSportCountView;
        this.statSubDataFirst = statSubDataFirst;
        this.statSubDataFirstUnit = statSubDataFirstUnit;
        this.statSubDataSecond = statSubDataSecond;
        this.statSubDataSecondUnit = statSubDataSecondUnit;
        this.statSubDataThird = statSubDataThird;
        this.statSubDataThirdUnit = statSubDataThirdUnit;
        this.statUserInfoContainer = statUserInfoContainer;
        this.statViewAvatar = statViewAvatar;
        this.statViewNickname = statViewNickname;
        this.statViewSportDes = statViewSportDes;
        this.tvDateRange = tvDateRange;
    }

    @NonNull
    public static ExerciseHeaderCountBinding bind(@NonNull View rootView) {
        int i = R.id.chart_area;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.chart_area);
        if (frameLayout != null) {
            i = R.id.divider_bottom;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_bottom);
            if (viewFindChildViewById != null) {
                i = R.id.exec_chart_space;
                Space space = (Space) ViewBindings.findChildViewById(rootView, R.id.exec_chart_space);
                if (space != null) {
                    i = R.id.iv_running_stat_bg;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_running_stat_bg);
                    if (imageView != null) {
                        i = R.id.stat_data_layout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.stat_data_layout);
                        if (linearLayout != null) {
                            i = R.id.stat_main_data;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.stat_main_data);
                            if (typefaceTextView != null) {
                                i = R.id.stat_main_data_unit;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.stat_main_data_unit);
                                if (textView != null) {
                                    i = R.id.stat_share_end;
                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.stat_share_end);
                                    if (viewFindChildViewById2 != null) {
                                        i = R.id.stat_sport_count_container;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.stat_sport_count_container);
                                        if (linearLayout2 != null) {
                                            i = R.id.stat_sport_count_view;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.stat_sport_count_view);
                                            if (recyclerView != null) {
                                                i = R.id.stat_sub_data_first;
                                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.stat_sub_data_first);
                                                if (typefaceTextView2 != null) {
                                                    i = R.id.stat_sub_data_first_unit;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.stat_sub_data_first_unit);
                                                    if (textView2 != null) {
                                                        i = R.id.stat_sub_data_second;
                                                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.stat_sub_data_second);
                                                        if (typefaceTextView3 != null) {
                                                            i = R.id.stat_sub_data_second_unit;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.stat_sub_data_second_unit);
                                                            if (textView3 != null) {
                                                                i = R.id.stat_sub_data_third;
                                                                TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.stat_sub_data_third);
                                                                if (typefaceTextView4 != null) {
                                                                    i = R.id.stat_sub_data_third_unit;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.stat_sub_data_third_unit);
                                                                    if (textView4 != null) {
                                                                        i = R.id.stat_user_info_container;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.stat_user_info_container);
                                                                        if (relativeLayout != null) {
                                                                            i = R.id.stat_view_avatar;
                                                                            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.stat_view_avatar);
                                                                            if (circleImageView != null) {
                                                                                i = R.id.stat_view_nickname;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.stat_view_nickname);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.stat_view_sport_des;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.stat_view_sport_des);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.tv_date_range;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_date_range);
                                                                                        if (textView7 != null) {
                                                                                            return new ExerciseHeaderCountBinding((FrameLayout) rootView, frameLayout, viewFindChildViewById, space, imageView, linearLayout, typefaceTextView, textView, viewFindChildViewById2, linearLayout2, recyclerView, typefaceTextView2, textView2, typefaceTextView3, textView3, typefaceTextView4, textView4, relativeLayout, circleImageView, textView5, textView6, textView7);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ExerciseHeaderCountBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ExerciseHeaderCountBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.exercise_header_count, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
