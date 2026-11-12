package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardSportRecordBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView middleBg;

    @NonNull
    public final View middleLine;

    @NonNull
    public final Space spaceBelowMiddleBg;

    @NonNull
    public final TextView sportCountLast7Days;

    @NonNull
    public final TextView sportCountLast7DaysTip;

    @NonNull
    public final TextView sportDurationLast7Days;

    @NonNull
    public final TextView sportDurationLast7DaysTip;

    @NonNull
    public final HomepageItemCardSportRecordInnerBinding sportRecord1;

    @NonNull
    public final HomepageItemCardSportRecordInnerBinding sportRecord2;

    @NonNull
    public final TextView sportRecordTitle;

    @NonNull
    public final TextView viewMore;

    private HomepageItemCardSportRecordBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView middleBg, @NonNull View middleLine, @NonNull Space spaceBelowMiddleBg, @NonNull TextView sportCountLast7Days, @NonNull TextView sportCountLast7DaysTip, @NonNull TextView sportDurationLast7Days, @NonNull TextView sportDurationLast7DaysTip, @NonNull HomepageItemCardSportRecordInnerBinding sportRecord1, @NonNull HomepageItemCardSportRecordInnerBinding sportRecord2, @NonNull TextView sportRecordTitle, @NonNull TextView viewMore) {
        this.a = rootView;
        this.middleBg = middleBg;
        this.middleLine = middleLine;
        this.spaceBelowMiddleBg = spaceBelowMiddleBg;
        this.sportCountLast7Days = sportCountLast7Days;
        this.sportCountLast7DaysTip = sportCountLast7DaysTip;
        this.sportDurationLast7Days = sportDurationLast7Days;
        this.sportDurationLast7DaysTip = sportDurationLast7DaysTip;
        this.sportRecord1 = sportRecord1;
        this.sportRecord2 = sportRecord2;
        this.sportRecordTitle = sportRecordTitle;
        this.viewMore = viewMore;
    }

    @NonNull
    public static HomepageItemCardSportRecordBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.middle_bg;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.middle_line))) != null) {
            i = R.id.space_below_middle_bg;
            Space space = (Space) ViewBindings.findChildViewById(rootView, i);
            if (space != null) {
                i = R.id.sport_count_last_7_days;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.sport_count_last_7_days_tip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        i = R.id.sport_duration_last_7_days;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.sport_duration_last_7_days_tip;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.sport_record_1))) != null) {
                                HomepageItemCardSportRecordInnerBinding homepageItemCardSportRecordInnerBindingBind = HomepageItemCardSportRecordInnerBinding.bind(viewFindChildViewById2);
                                i = R.id.sport_record_2;
                                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, i);
                                if (viewFindChildViewById3 != null) {
                                    HomepageItemCardSportRecordInnerBinding homepageItemCardSportRecordInnerBindingBind2 = HomepageItemCardSportRecordInnerBinding.bind(viewFindChildViewById3);
                                    i = R.id.sport_record_title;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView5 != null) {
                                        i = R.id.view_more;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView6 != null) {
                                            return new HomepageItemCardSportRecordBinding((ConstraintLayout) rootView, appCompatTextView, viewFindChildViewById, space, textView, textView2, textView3, textView4, homepageItemCardSportRecordInnerBindingBind, homepageItemCardSportRecordInnerBindingBind2, textView5, textView6);
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
    public static HomepageItemCardSportRecordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardSportRecordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_sport_record, parent, false);
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
