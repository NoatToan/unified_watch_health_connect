package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ViewExerciseXAxisBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout dayXaxisLayout;

    @NonNull
    public final View divider;

    @NonNull
    public final TypefaceTextView monthXaxis10;

    @NonNull
    public final TypefaceTextView monthXaxis20;

    @NonNull
    public final TypefaceTextView monthXaxisEnd;

    @NonNull
    public final RelativeLayout monthXaxisLayout;

    @NonNull
    public final TypefaceTextView monthXaxisStart;

    @NonNull
    public final LinearLayout timeLayout;

    @NonNull
    public final RelativeLayout timeLl;

    @NonNull
    public final LinearLayout weekXaxisLayout;

    @NonNull
    public final LinearLayout yearXaxisLayout;

    private ViewExerciseXAxisBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout dayXaxisLayout, @NonNull View divider, @NonNull TypefaceTextView monthXaxis10, @NonNull TypefaceTextView monthXaxis20, @NonNull TypefaceTextView monthXaxisEnd, @NonNull RelativeLayout monthXaxisLayout, @NonNull TypefaceTextView monthXaxisStart, @NonNull LinearLayout timeLayout, @NonNull RelativeLayout timeLl, @NonNull LinearLayout weekXaxisLayout, @NonNull LinearLayout yearXaxisLayout) {
        this.a = rootView;
        this.dayXaxisLayout = dayXaxisLayout;
        this.divider = divider;
        this.monthXaxis10 = monthXaxis10;
        this.monthXaxis20 = monthXaxis20;
        this.monthXaxisEnd = monthXaxisEnd;
        this.monthXaxisLayout = monthXaxisLayout;
        this.monthXaxisStart = monthXaxisStart;
        this.timeLayout = timeLayout;
        this.timeLl = timeLl;
        this.weekXaxisLayout = weekXaxisLayout;
        this.yearXaxisLayout = yearXaxisLayout;
    }

    @NonNull
    public static ViewExerciseXAxisBinding bind(@NonNull View rootView) {
        int i = R.id.day_xaxis_layout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.day_xaxis_layout);
        if (relativeLayout != null) {
            i = R.id.divider;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
            if (viewFindChildViewById != null) {
                i = R.id.month_xaxis_10;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.month_xaxis_10);
                if (typefaceTextView != null) {
                    i = R.id.month_xaxis_20;
                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.month_xaxis_20);
                    if (typefaceTextView2 != null) {
                        i = R.id.month_xaxis_end;
                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.month_xaxis_end);
                        if (typefaceTextView3 != null) {
                            i = R.id.month_xaxis_layout;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.month_xaxis_layout);
                            if (relativeLayout2 != null) {
                                i = R.id.month_xaxis_start;
                                TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.month_xaxis_start);
                                if (typefaceTextView4 != null) {
                                    i = R.id.time_layout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.time_layout);
                                    if (linearLayout != null) {
                                        RelativeLayout relativeLayout3 = (RelativeLayout) rootView;
                                        i = R.id.week_xaxis_layout;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.week_xaxis_layout);
                                        if (linearLayout2 != null) {
                                            i = R.id.year_xaxis_layout;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.year_xaxis_layout);
                                            if (linearLayout3 != null) {
                                                return new ViewExerciseXAxisBinding(relativeLayout3, relativeLayout, viewFindChildViewById, typefaceTextView, typefaceTextView2, typefaceTextView3, relativeLayout2, typefaceTextView4, linearLayout, relativeLayout3, linearLayout2, linearLayout3);
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
    public static ViewExerciseXAxisBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ViewExerciseXAxisBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.view_exercise_x_axis, parent, false);
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
