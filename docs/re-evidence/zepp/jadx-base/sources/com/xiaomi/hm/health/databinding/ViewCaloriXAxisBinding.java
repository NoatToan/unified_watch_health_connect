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
public final class ViewCaloriXAxisBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final LinearLayout dayXaxisLayout;

    @NonNull
    public final TypefaceTextView monthXaxis10;

    @NonNull
    public final TypefaceTextView monthXaxis20;

    @NonNull
    public final TypefaceTextView monthXaxisEnd;

    @NonNull
    public final LinearLayout monthXaxisLayout;

    @NonNull
    public final TypefaceTextView monthXaxisStart;

    @NonNull
    public final LinearLayout timeLayout;

    @NonNull
    public final RelativeLayout timeLl;

    @NonNull
    public final LinearLayout weekXaxisLayout;

    private ViewCaloriXAxisBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout dayXaxisLayout, @NonNull TypefaceTextView monthXaxis10, @NonNull TypefaceTextView monthXaxis20, @NonNull TypefaceTextView monthXaxisEnd, @NonNull LinearLayout monthXaxisLayout, @NonNull TypefaceTextView monthXaxisStart, @NonNull LinearLayout timeLayout, @NonNull RelativeLayout timeLl, @NonNull LinearLayout weekXaxisLayout) {
        this.a = rootView;
        this.dayXaxisLayout = dayXaxisLayout;
        this.monthXaxis10 = monthXaxis10;
        this.monthXaxis20 = monthXaxis20;
        this.monthXaxisEnd = monthXaxisEnd;
        this.monthXaxisLayout = monthXaxisLayout;
        this.monthXaxisStart = monthXaxisStart;
        this.timeLayout = timeLayout;
        this.timeLl = timeLl;
        this.weekXaxisLayout = weekXaxisLayout;
    }

    @NonNull
    public static ViewCaloriXAxisBinding bind(@NonNull View rootView) {
        int i = R.id.day_xaxis_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.day_xaxis_layout);
        if (linearLayout != null) {
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
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.month_xaxis_layout);
                        if (linearLayout2 != null) {
                            i = R.id.month_xaxis_start;
                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.month_xaxis_start);
                            if (typefaceTextView4 != null) {
                                i = R.id.time_layout;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.time_layout);
                                if (linearLayout3 != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                    i = R.id.week_xaxis_layout;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.week_xaxis_layout);
                                    if (linearLayout4 != null) {
                                        return new ViewCaloriXAxisBinding(relativeLayout, linearLayout, typefaceTextView, typefaceTextView2, typefaceTextView3, linearLayout2, typefaceTextView4, linearLayout3, relativeLayout, linearLayout4);
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
    public static ViewCaloriXAxisBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ViewCaloriXAxisBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.view_calori_x_axis, parent, false);
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
