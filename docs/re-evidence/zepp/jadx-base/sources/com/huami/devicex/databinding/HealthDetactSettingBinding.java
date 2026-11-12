package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.view.GreyItemView;

/* JADX INFO: loaded from: classes7.dex */
public final class HealthDetactSettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final AppCompatTextView atrialFibTitleText;

    @NonNull
    public final AppCompatTextView atrialLearnMore;

    @NonNull
    public final AppCompatTextView hrLearnMore;

    @NonNull
    public final GreyItemView itemActivityDetect;

    @NonNull
    public final GreyItemView itemAllDayHeartRateSetting;

    @NonNull
    public final GreyItemView itemAtrialFibDetect;

    @NonNull
    public final GreyItemView itemHrWarning;

    @NonNull
    public final GreyItemView itemSleepAssitant;

    @NonNull
    public final GreyItemView itemSleepOsa;

    @NonNull
    public final GreyItemView itemSleepPressure;

    @NonNull
    public final AppCompatTextView pressureLearnMore;

    @NonNull
    public final AppCompatTextView sleepLearnMore;

    @NonNull
    public final FrameLayout statusContent;

    @NonNull
    public final LinearLayout titleAtrialFib;

    @NonNull
    public final LinearLayout titleHr;

    @NonNull
    public final LinearLayout titlePressure;

    @NonNull
    public final LinearLayout titleSleep;

    private HealthDetactSettingBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull GreyItemView greyItemView, @NonNull GreyItemView greyItemView2, @NonNull GreyItemView greyItemView3, @NonNull GreyItemView greyItemView4, @NonNull GreyItemView greyItemView5, @NonNull GreyItemView greyItemView6, @NonNull GreyItemView greyItemView7, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5) {
        this.a = linearLayout;
        this.atrialFibTitleText = appCompatTextView;
        this.atrialLearnMore = appCompatTextView2;
        this.hrLearnMore = appCompatTextView3;
        this.itemActivityDetect = greyItemView;
        this.itemAllDayHeartRateSetting = greyItemView2;
        this.itemAtrialFibDetect = greyItemView3;
        this.itemHrWarning = greyItemView4;
        this.itemSleepAssitant = greyItemView5;
        this.itemSleepOsa = greyItemView6;
        this.itemSleepPressure = greyItemView7;
        this.pressureLearnMore = appCompatTextView4;
        this.sleepLearnMore = appCompatTextView5;
        this.statusContent = frameLayout;
        this.titleAtrialFib = linearLayout2;
        this.titleHr = linearLayout3;
        this.titlePressure = linearLayout4;
        this.titleSleep = linearLayout5;
    }

    @NonNull
    public static HealthDetactSettingBinding bind(@NonNull View view) {
        int i = R.id.atrial_fib_title_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.atrial_learn_more;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R.id.hr_learn_more;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    i = R.id.item_activity_detect;
                    GreyItemView greyItemView = (GreyItemView) ViewBindings.findChildViewById(view, i);
                    if (greyItemView != null) {
                        i = R.id.item_all_day_heart_rate_setting;
                        GreyItemView greyItemView2 = (GreyItemView) ViewBindings.findChildViewById(view, i);
                        if (greyItemView2 != null) {
                            i = R.id.item_atrial_fib_detect;
                            GreyItemView greyItemView3 = (GreyItemView) ViewBindings.findChildViewById(view, i);
                            if (greyItemView3 != null) {
                                i = R.id.item_hr_warning;
                                GreyItemView greyItemView4 = (GreyItemView) ViewBindings.findChildViewById(view, i);
                                if (greyItemView4 != null) {
                                    i = R.id.item_sleep_assitant;
                                    GreyItemView greyItemView5 = (GreyItemView) ViewBindings.findChildViewById(view, i);
                                    if (greyItemView5 != null) {
                                        i = R.id.item_sleep_osa;
                                        GreyItemView greyItemView6 = (GreyItemView) ViewBindings.findChildViewById(view, i);
                                        if (greyItemView6 != null) {
                                            i = R.id.item_sleep_pressure;
                                            GreyItemView greyItemView7 = (GreyItemView) ViewBindings.findChildViewById(view, i);
                                            if (greyItemView7 != null) {
                                                i = R.id.pressure_learn_more;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView4 != null) {
                                                    i = R.id.sleep_learn_more;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = R.id.status_content;
                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                        if (frameLayout != null) {
                                                            i = R.id.title_atrial_fib;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout != null) {
                                                                i = R.id.title_hr;
                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout2 != null) {
                                                                    i = R.id.title_pressure;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout3 != null) {
                                                                        i = R.id.title_sleep;
                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayout4 != null) {
                                                                            return new HealthDetactSettingBinding((LinearLayout) view, appCompatTextView, appCompatTextView2, appCompatTextView3, greyItemView, greyItemView2, greyItemView3, greyItemView4, greyItemView5, greyItemView6, greyItemView7, appCompatTextView4, appCompatTextView5, frameLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthDetactSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static HealthDetactSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.health_detact_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
