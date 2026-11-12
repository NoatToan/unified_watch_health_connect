package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.ui.widget.sleepdial.TimeDialView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentSleepSettingBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Toolbar actionbar;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final Guideline gl3;

    @NonNull
    public final View glCenter;

    @NonNull
    public final LinearLayout linearLayout;

    @NonNull
    public final NestedScrollView scrollView2;

    @NonNull
    public final TimeDialView sleepDial;

    @NonNull
    public final View subBg;

    @NonNull
    public final AppCompatTextView tvEnterSleep;

    @NonNull
    public final AppCompatTextView tvEnterSleepTime;

    @NonNull
    public final AppCompatTextView tvFriday;

    @NonNull
    public final AppCompatTextView tvHours;

    @NonNull
    public final AppCompatTextView tvHoursDesc;

    @NonNull
    public final AppCompatTextView tvMinutes;

    @NonNull
    public final AppCompatTextView tvMonday;

    @NonNull
    public final AppCompatTextView tvSaturday;

    @NonNull
    public final AppCompatTextView tvSunday;

    @NonNull
    public final AppCompatTextView tvThursday;

    @NonNull
    public final AppCompatTextView tvTitle;

    @NonNull
    public final AppCompatTextView tvTuesday;

    @NonNull
    public final AppCompatTextView tvWakeUp;

    @NonNull
    public final AppCompatTextView tvWakeUpTime;

    @NonNull
    public final AppCompatTextView tvWednesday;

    private FragmentSleepSettingBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Toolbar toolbar, @NonNull AppCompatImageView appCompatImageView, @NonNull Guideline guideline, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull NestedScrollView nestedScrollView, @NonNull TimeDialView timeDialView, @NonNull View view2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6, @NonNull AppCompatTextView appCompatTextView7, @NonNull AppCompatTextView appCompatTextView8, @NonNull AppCompatTextView appCompatTextView9, @NonNull AppCompatTextView appCompatTextView10, @NonNull AppCompatTextView appCompatTextView11, @NonNull AppCompatTextView appCompatTextView12, @NonNull AppCompatTextView appCompatTextView13, @NonNull AppCompatTextView appCompatTextView14, @NonNull AppCompatTextView appCompatTextView15) {
        this.a = constraintLayout;
        this.actionbar = toolbar;
        this.btnBack = appCompatImageView;
        this.gl3 = guideline;
        this.glCenter = view;
        this.linearLayout = linearLayout;
        this.scrollView2 = nestedScrollView;
        this.sleepDial = timeDialView;
        this.subBg = view2;
        this.tvEnterSleep = appCompatTextView;
        this.tvEnterSleepTime = appCompatTextView2;
        this.tvFriday = appCompatTextView3;
        this.tvHours = appCompatTextView4;
        this.tvHoursDesc = appCompatTextView5;
        this.tvMinutes = appCompatTextView6;
        this.tvMonday = appCompatTextView7;
        this.tvSaturday = appCompatTextView8;
        this.tvSunday = appCompatTextView9;
        this.tvThursday = appCompatTextView10;
        this.tvTitle = appCompatTextView11;
        this.tvTuesday = appCompatTextView12;
        this.tvWakeUp = appCompatTextView13;
        this.tvWakeUpTime = appCompatTextView14;
        this.tvWednesday = appCompatTextView15;
    }

    @NonNull
    public static FragmentSleepSettingBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.actionbar;
        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
        if (toolbar != null) {
            i = R.id.btn_back;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.gl_3;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.gl_center))) != null) {
                    i = R.id.linearLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.scrollView2;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                        if (nestedScrollView != null) {
                            i = R.id.sleep_dial;
                            TimeDialView timeDialView = (TimeDialView) ViewBindings.findChildViewById(view, i);
                            if (timeDialView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.sub_bg))) != null) {
                                i = R.id.tv_enter_sleep;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = R.id.tv_enter_sleep_time;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.tv_friday;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = R.id.tv_hours;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                i = R.id.tv_hours_desc;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView5 != null) {
                                                    i = R.id.tv_minutes;
                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView6 != null) {
                                                        i = R.id.tv_monday;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView7 != null) {
                                                            i = R.id.tv_saturday;
                                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView8 != null) {
                                                                i = R.id.tv_sunday;
                                                                AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView9 != null) {
                                                                    i = R.id.tv_thursday;
                                                                    AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView10 != null) {
                                                                        i = R.id.tv_title;
                                                                        AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (appCompatTextView11 != null) {
                                                                            i = R.id.tv_tuesday;
                                                                            AppCompatTextView appCompatTextView12 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (appCompatTextView12 != null) {
                                                                                i = R.id.tv_wake_up;
                                                                                AppCompatTextView appCompatTextView13 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (appCompatTextView13 != null) {
                                                                                    i = R.id.tv_wake_up_time;
                                                                                    AppCompatTextView appCompatTextView14 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (appCompatTextView14 != null) {
                                                                                        i = R.id.tv_wednesday;
                                                                                        AppCompatTextView appCompatTextView15 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (appCompatTextView15 != null) {
                                                                                            return new FragmentSleepSettingBinding((ConstraintLayout) view, toolbar, appCompatImageView, guideline, viewFindChildViewById, linearLayout, nestedScrollView, timeDialView, viewFindChildViewById2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, appCompatTextView14, appCompatTextView15);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSleepSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSleepSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sleep_setting, viewGroup, false);
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
