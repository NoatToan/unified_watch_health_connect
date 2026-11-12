package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.text.TextViewDrawable;
import com.huami.lib.view.text.UnitTextView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentRecentBodyChangeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final RelativeLayout bodyChangeChartContainer;

    @NonNull
    public final TextViewDrawable bodyChangeLastDate;

    @NonNull
    public final UnitTextView bodyChangeLastUv;

    @NonNull
    public final TextViewDrawable bodyChangeMonNavDate;

    @NonNull
    public final UnitTextView bodyChangeMonUv;

    @NonNull
    public final TypefaceTextView bodyChartEndDate;

    @NonNull
    public final TypefaceTextView bodyChartStartDate;

    @NonNull
    public final LinearLayout layoutRootView;

    @NonNull
    public final TextView titleBodyChange;

    private FragmentRecentBodyChangeBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextViewDrawable textViewDrawable, @NonNull UnitTextView unitTextView, @NonNull TextViewDrawable textViewDrawable2, @NonNull UnitTextView unitTextView2, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.a = linearLayout;
        this.bodyChangeChartContainer = relativeLayout;
        this.bodyChangeLastDate = textViewDrawable;
        this.bodyChangeLastUv = unitTextView;
        this.bodyChangeMonNavDate = textViewDrawable2;
        this.bodyChangeMonUv = unitTextView2;
        this.bodyChartEndDate = typefaceTextView;
        this.bodyChartStartDate = typefaceTextView2;
        this.layoutRootView = linearLayout2;
        this.titleBodyChange = textView;
    }

    @NonNull
    public static FragmentRecentBodyChangeBinding bind(@NonNull View view) {
        int i = R.id.body_change_chart_container;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.body_change_last_date;
            TextViewDrawable textViewDrawable = (TextViewDrawable) ViewBindings.findChildViewById(view, i);
            if (textViewDrawable != null) {
                i = R.id.body_change_last_uv;
                UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(view, i);
                if (unitTextView != null) {
                    i = R.id.body_change_mon_nav_date;
                    TextViewDrawable textViewDrawable2 = (TextViewDrawable) ViewBindings.findChildViewById(view, i);
                    if (textViewDrawable2 != null) {
                        i = R.id.body_change_mon_uv;
                        UnitTextView unitTextView2 = (UnitTextView) ViewBindings.findChildViewById(view, i);
                        if (unitTextView2 != null) {
                            i = R.id.body_chart_end_date;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView != null) {
                                i = R.id.body_chart_start_date;
                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                if (typefaceTextView2 != null) {
                                    LinearLayout linearLayout = (LinearLayout) view;
                                    i = R.id.title_body_change;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new FragmentRecentBodyChangeBinding(linearLayout, relativeLayout, textViewDrawable, unitTextView, textViewDrawable2, unitTextView2, typefaceTextView, typefaceTextView2, linearLayout, textView);
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
    public static FragmentRecentBodyChangeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRecentBodyChangeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recent_body_change, viewGroup, false);
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
