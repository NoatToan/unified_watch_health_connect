package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSleepHomeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView cardStatusIntroduce;

    @NonNull
    public final TextView cardStatusTitle;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final FrameLayout sleepAdContainer;

    @NonNull
    public final RadioButton tabDay;

    @NonNull
    public final RadioGroup tabGroup;

    @NonNull
    public final RadioButton tabMonth;

    @NonNull
    public final RadioButton tabWeek;

    @NonNull
    public final RadioButton tabYear;

    private FragmentSleepHomeBinding(@NonNull LinearLayout rootView, @NonNull TextView cardStatusIntroduce, @NonNull TextView cardStatusTitle, @NonNull FrameLayout container, @NonNull FrameLayout sleepAdContainer, @NonNull RadioButton tabDay, @NonNull RadioGroup tabGroup, @NonNull RadioButton tabMonth, @NonNull RadioButton tabWeek, @NonNull RadioButton tabYear) {
        this.a = rootView;
        this.cardStatusIntroduce = cardStatusIntroduce;
        this.cardStatusTitle = cardStatusTitle;
        this.container = container;
        this.sleepAdContainer = sleepAdContainer;
        this.tabDay = tabDay;
        this.tabGroup = tabGroup;
        this.tabMonth = tabMonth;
        this.tabWeek = tabWeek;
        this.tabYear = tabYear;
    }

    @NonNull
    public static FragmentSleepHomeBinding bind(@NonNull View rootView) {
        int i = R.id.card_status_introduce;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.card_status_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                if (frameLayout != null) {
                    i = R.id.sleep_ad_container;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                    if (frameLayout2 != null) {
                        i = R.id.tab_day;
                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(rootView, i);
                        if (radioButton != null) {
                            i = R.id.tab_group;
                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, i);
                            if (radioGroup != null) {
                                i = R.id.tab_month;
                                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(rootView, i);
                                if (radioButton2 != null) {
                                    i = R.id.tab_week;
                                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(rootView, i);
                                    if (radioButton3 != null) {
                                        i = R.id.tab_year;
                                        RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(rootView, i);
                                        if (radioButton4 != null) {
                                            return new FragmentSleepHomeBinding((LinearLayout) rootView, textView, textView2, frameLayout, frameLayout2, radioButton, radioGroup, radioButton2, radioButton3, radioButton4);
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
    public static FragmentSleepHomeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSleepHomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_home, parent, false);
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
