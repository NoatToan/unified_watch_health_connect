package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.UnitTextView;
import per.wsj.library.AndRatingBar;

/* JADX INFO: loaded from: classes13.dex */
public final class ItemSleepTonalityBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Space tonalityBottomSpace;

    @NonNull
    public final Space tonalityBottomStarSpace;

    @NonNull
    public final AndRatingBar tonalityCommentRatingBar;

    @NonNull
    public final TextView tonalityCommentTips;

    @NonNull
    public final TextView tonalityCommentTitle;

    @NonNull
    public final TextView tonalityContinueDays;

    @NonNull
    public final View tonalityDivide;

    @NonNull
    public final LinearLayout tonalityInfoLinear;

    @NonNull
    public final View tonalityInfoLinearDivide;

    @NonNull
    public final TextView tonalityIntoSleepTimeTitle;

    @NonNull
    public final UnitTextView tonalityListenCount;

    @NonNull
    public final LinearLayout tonalityListenLinear;

    @NonNull
    public final Space tonalityNoRatingSpace;

    @NonNull
    public final UnitTextView tonalityPlayCount;

    @NonNull
    public final LinearLayout tonalityPlayLinear;

    @NonNull
    public final ImageView tonalityQuestion;

    @NonNull
    public final Group tonalityRatingGroup;

    @NonNull
    public final FrameLayout tonalityRelaxChart;

    @NonNull
    public final TextView tonalityRelaxEndTime;

    @NonNull
    public final TextView tonalityRelaxStartTime;

    @NonNull
    public final TextView tonalitySleepCountTitle;

    @NonNull
    public final TextView tonalityTitle;

    @NonNull
    public final TextView tonalityVocation;

    @NonNull
    public final Group tonalityVocationGroup;

    private ItemSleepTonalityBinding(@NonNull ConstraintLayout rootView, @NonNull Space tonalityBottomSpace, @NonNull Space tonalityBottomStarSpace, @NonNull AndRatingBar tonalityCommentRatingBar, @NonNull TextView tonalityCommentTips, @NonNull TextView tonalityCommentTitle, @NonNull TextView tonalityContinueDays, @NonNull View tonalityDivide, @NonNull LinearLayout tonalityInfoLinear, @NonNull View tonalityInfoLinearDivide, @NonNull TextView tonalityIntoSleepTimeTitle, @NonNull UnitTextView tonalityListenCount, @NonNull LinearLayout tonalityListenLinear, @NonNull Space tonalityNoRatingSpace, @NonNull UnitTextView tonalityPlayCount, @NonNull LinearLayout tonalityPlayLinear, @NonNull ImageView tonalityQuestion, @NonNull Group tonalityRatingGroup, @NonNull FrameLayout tonalityRelaxChart, @NonNull TextView tonalityRelaxEndTime, @NonNull TextView tonalityRelaxStartTime, @NonNull TextView tonalitySleepCountTitle, @NonNull TextView tonalityTitle, @NonNull TextView tonalityVocation, @NonNull Group tonalityVocationGroup) {
        this.a = rootView;
        this.tonalityBottomSpace = tonalityBottomSpace;
        this.tonalityBottomStarSpace = tonalityBottomStarSpace;
        this.tonalityCommentRatingBar = tonalityCommentRatingBar;
        this.tonalityCommentTips = tonalityCommentTips;
        this.tonalityCommentTitle = tonalityCommentTitle;
        this.tonalityContinueDays = tonalityContinueDays;
        this.tonalityDivide = tonalityDivide;
        this.tonalityInfoLinear = tonalityInfoLinear;
        this.tonalityInfoLinearDivide = tonalityInfoLinearDivide;
        this.tonalityIntoSleepTimeTitle = tonalityIntoSleepTimeTitle;
        this.tonalityListenCount = tonalityListenCount;
        this.tonalityListenLinear = tonalityListenLinear;
        this.tonalityNoRatingSpace = tonalityNoRatingSpace;
        this.tonalityPlayCount = tonalityPlayCount;
        this.tonalityPlayLinear = tonalityPlayLinear;
        this.tonalityQuestion = tonalityQuestion;
        this.tonalityRatingGroup = tonalityRatingGroup;
        this.tonalityRelaxChart = tonalityRelaxChart;
        this.tonalityRelaxEndTime = tonalityRelaxEndTime;
        this.tonalityRelaxStartTime = tonalityRelaxStartTime;
        this.tonalitySleepCountTitle = tonalitySleepCountTitle;
        this.tonalityTitle = tonalityTitle;
        this.tonalityVocation = tonalityVocation;
        this.tonalityVocationGroup = tonalityVocationGroup;
    }

    @NonNull
    public static ItemSleepTonalityBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.tonalityBottomSpace;
        Space space = (Space) ViewBindings.findChildViewById(rootView, i);
        if (space != null) {
            i = R.id.tonalityBottomStarSpace;
            Space space2 = (Space) ViewBindings.findChildViewById(rootView, i);
            if (space2 != null) {
                i = R.id.tonalityCommentRatingBar;
                AndRatingBar andRatingBar = (AndRatingBar) ViewBindings.findChildViewById(rootView, i);
                if (andRatingBar != null) {
                    i = R.id.tonalityCommentTips;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = R.id.tonalityCommentTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = R.id.tonalityContinueDays;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.tonalityDivide))) != null) {
                                i = R.id.tonalityInfoLinear;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                if (linearLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.tonalityInfoLinearDivide))) != null) {
                                    i = R.id.tonalityIntoSleepTimeTitle;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView4 != null) {
                                        i = R.id.tonalityListenCount;
                                        UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                                        if (unitTextView != null) {
                                            i = R.id.tonalityListenLinear;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                            if (linearLayout2 != null) {
                                                i = R.id.tonalityNoRatingSpace;
                                                Space space3 = (Space) ViewBindings.findChildViewById(rootView, i);
                                                if (space3 != null) {
                                                    i = R.id.tonalityPlayCount;
                                                    UnitTextView unitTextView2 = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (unitTextView2 != null) {
                                                        i = R.id.tonalityPlayLinear;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.tonalityQuestion;
                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                            if (imageView != null) {
                                                                i = R.id.tonalityRatingGroup;
                                                                Group group = (Group) ViewBindings.findChildViewById(rootView, i);
                                                                if (group != null) {
                                                                    i = R.id.tonalityRelaxChart;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                                                                    if (frameLayout != null) {
                                                                        i = R.id.tonalityRelaxEndTime;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                        if (textView5 != null) {
                                                                            i = R.id.tonalityRelaxStartTime;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                            if (textView6 != null) {
                                                                                i = R.id.tonalitySleepCountTitle;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.tonalityTitle;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.tonalityVocation;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.tonalityVocationGroup;
                                                                                            Group group2 = (Group) ViewBindings.findChildViewById(rootView, i);
                                                                                            if (group2 != null) {
                                                                                                return new ItemSleepTonalityBinding((ConstraintLayout) rootView, space, space2, andRatingBar, textView, textView2, textView3, viewFindChildViewById, linearLayout, viewFindChildViewById2, textView4, unitTextView, linearLayout2, space3, unitTextView2, linearLayout3, imageView, group, frameLayout, textView5, textView6, textView7, textView8, textView9, group2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSleepTonalityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSleepTonalityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sleep_tonality, parent, false);
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
