package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.healthtag.ui.view.DragIntervalView;
import com.xiaomi.hm.health.healthtag.ui.view.HealthTagEditCard;
import com.xiaomi.hm.health.healthtag.ui.view.SleepTagChart;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentStressDailyDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout dayChart;

    @NonNull
    public final ConstraintLayout dragtimeContainer;

    @NonNull
    public final ConstraintLayout head;

    @NonNull
    public final TypefaceTextView jpHintText;

    @NonNull
    public final FlexboxLayout legendLL;

    @NonNull
    public final TextView makeTagTv;

    @NonNull
    public final DragIntervalView tagDragV;

    @NonNull
    public final HealthTagEditCard tagEditCard;

    @NonNull
    public final ConstraintLayout tagEditCardLayout;

    @NonNull
    public final SleepTagChart tagResultLayout;

    @NonNull
    public final TypefaceTextView tagTime;

    @NonNull
    public final TypefaceTextView tagTitle;

    @NonNull
    public final TypefaceTextView time;

    @NonNull
    public final TypefaceTextView value;

    @NonNull
    public final ConstraintLayout valueContainer;

    private FragmentStressDailyDetailBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout dayChart, @NonNull ConstraintLayout dragtimeContainer, @NonNull ConstraintLayout head, @NonNull TypefaceTextView jpHintText, @NonNull FlexboxLayout legendLL, @NonNull TextView makeTagTv, @NonNull DragIntervalView tagDragV, @NonNull HealthTagEditCard tagEditCard, @NonNull ConstraintLayout tagEditCardLayout, @NonNull SleepTagChart tagResultLayout, @NonNull TypefaceTextView tagTime, @NonNull TypefaceTextView tagTitle, @NonNull TypefaceTextView time, @NonNull TypefaceTextView value, @NonNull ConstraintLayout valueContainer) {
        this.a = rootView;
        this.dayChart = dayChart;
        this.dragtimeContainer = dragtimeContainer;
        this.head = head;
        this.jpHintText = jpHintText;
        this.legendLL = legendLL;
        this.makeTagTv = makeTagTv;
        this.tagDragV = tagDragV;
        this.tagEditCard = tagEditCard;
        this.tagEditCardLayout = tagEditCardLayout;
        this.tagResultLayout = tagResultLayout;
        this.tagTime = tagTime;
        this.tagTitle = tagTitle;
        this.time = time;
        this.value = value;
        this.valueContainer = valueContainer;
    }

    @NonNull
    public static FragmentStressDailyDetailBinding bind(@NonNull View rootView) {
        int i = R.id.day_chart;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.day_chart);
        if (frameLayout != null) {
            i = R.id.dragtime_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.dragtime_container);
            if (constraintLayout != null) {
                i = R.id.head;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.head);
                if (constraintLayout2 != null) {
                    i = R.id.jp_hint_text;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.jp_hint_text);
                    if (typefaceTextView != null) {
                        i = R.id.legendLL;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(rootView, R.id.legendLL);
                        if (flexboxLayout != null) {
                            i = R.id.makeTagTv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.makeTagTv);
                            if (textView != null) {
                                i = R.id.tagDragV;
                                DragIntervalView dragIntervalView = (DragIntervalView) ViewBindings.findChildViewById(rootView, R.id.tagDragV);
                                if (dragIntervalView != null) {
                                    i = R.id.tagEditCard;
                                    HealthTagEditCard healthTagEditCard = (HealthTagEditCard) ViewBindings.findChildViewById(rootView, R.id.tagEditCard);
                                    if (healthTagEditCard != null) {
                                        i = R.id.tagEditCardLayout;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tagEditCardLayout);
                                        if (constraintLayout3 != null) {
                                            i = R.id.tagResultLayout;
                                            SleepTagChart sleepTagChart = (SleepTagChart) ViewBindings.findChildViewById(rootView, R.id.tagResultLayout);
                                            if (sleepTagChart != null) {
                                                i = R.id.tag_time;
                                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tag_time);
                                                if (typefaceTextView2 != null) {
                                                    i = R.id.tag_title;
                                                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tag_title);
                                                    if (typefaceTextView3 != null) {
                                                        i = R.id.time;
                                                        TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.time);
                                                        if (typefaceTextView4 != null) {
                                                            i = R.id.value;
                                                            TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.value);
                                                            if (typefaceTextView5 != null) {
                                                                i = R.id.value_container;
                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.value_container);
                                                                if (constraintLayout4 != null) {
                                                                    return new FragmentStressDailyDetailBinding((LinearLayout) rootView, frameLayout, constraintLayout, constraintLayout2, typefaceTextView, flexboxLayout, textView, dragIntervalView, healthTagEditCard, constraintLayout3, sleepTagChart, typefaceTextView2, typefaceTextView3, typefaceTextView4, typefaceTextView5, constraintLayout4);
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
    public static FragmentStressDailyDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentStressDailyDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_stress_daily_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
